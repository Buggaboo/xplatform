package nl.sison.dsl.mobgen.generator

import java.util.Iterator
import java.util.List
import java.util.Map
import nl.sison.dsl.mobgen.jsonGen.JsonObject
import nl.sison.dsl.mobgen.jsonGen.JsonValue
import nl.sison.dsl.mobgen.jsonGen.Member
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class JsonGenGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		// generate Android Parcelable
		val JsonObjects = resource.contents.filter(typeof(JsonObject))
		
		if (!resource.contents.empty)
		{
			for (obj : JsonObjects)
			{
				parseJsonObject("Root", obj, fsa) 
			}
		}
		
		// TODO generate MOBBL Document definition
		
		// TODO generate iOS 
	}
	
	def createConcurrentDateFormatHashMap() '''
	import java.text.DateFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.concurrent.ConcurrentHashMap;
	
	public class ConcurrentDateFormatHashMap {
		final private static ConcurrentHashMap<String, ThreadLocal<DateFormat>> concurrentHashMap = new ConcurrentHashMap<String, ThreadLocal<DateFormat>>();
	
		private ConcurrentDateFormatHashMap() {}
		
		public static Date convertStringToDate(final String dateFormatString, final String dateString)
				throws ParseException {
			
			if (!concurrentHashMap.containsKey(dateFormatString))
			{
				concurrentHashMap.put(dateFormatString, new ThreadLocal<DateFormat>() {
	
					@Override
					public DateFormat get() {
						return super.get();
					}
	
					@Override
					protected DateFormat initialValue() {
						return new SimpleDateFormat(dateFormatString);
					}
	
					@Override
					public void remove() {
						super.remove();
					}
	
					@Override
					public void set(DateFormat value) {
						super.set(value);
					}
	
				});
	
			}
			
			return concurrentHashMap.get(dateFormatString).get().parse(dateString);
			
		}
		
		// TODO define method convertDateToString/2{date:Date, stringFormat:String} using the same principle as above
	}
	'''

	/**
	 * TODO add mapping of JSONArray
	 */	
	def createJsonParserCtor(CharSequence className, JsonObject jsonRootObject) '''
	public «className»(final JSONObject jsonRoot)
	{
		«FOR member : jsonRootObject.members»
		«IF member.optional»
		if (!jsonRoot.isNull("«member.key»"))
		{
			this.«member.key.camelCase» = «member.mapToSerializedType»
		}
		«ELSE»
		this.«member.key.camelCase» = «member.mapToSerializedType»
		«ENDIF»
		«ENDFOR»
	}
	'''
	
	def mapToSerializedType(Member member)
	{
		val value = member.value
		val key = member.key
		
		if (value.obj != null)
			return String.format("new %s(jsonRoot.getJsonObject());", key.generatedType)
			
		if (value.str != null)
		{
			return String.format("jsonRoot.getString(\"%s\")", key)
		}
		
		// TODO array, number

		if (value.bool) return String.format("jsonRoot.getBoolean(\"%s\")", key)
		
		if(value.float) return String.format("jsonRoot.getDouble(\"%s\")", key)
		if(value.int)	return String.format("jsonRoot.getLong(\"%s\")", key)
		
		if(value.strFromEnum != null)
		{
			return String.format("%sEnum.fromString(jsonRoot.getString(\"%s\"))", key.generatedType, key)
		}
		
		if(value.datetime != null)
		{
			val df = value.datetime
			return String.format("ConcurrentDateFormatHashMap.convertStringToDate(\"%s\", jsonRoot.getString(\"%s\"))", if (df.utc) "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" else df.format, key)
		}
		
		return "UNDEFINED"
	}
	
	
	def void parseJsonObject(CharSequence className, JsonObject jsonRootObject, IFileSystemAccess fsa)
	{
		if (jsonRootObject == null) return;
		
		val map = <String, String>newHashMap()
		
		for (member : jsonRootObject.members)
		{
			val value = member.value
			val key = member.key.camelCase
			
			if (value.obj != null)
			{
				val generatedType = key.generatedType
				parseJsonObject(generatedType, value.obj, fsa)
				map.put(key, generatedType)		
			}
			
			if (value.bool)
			{
				map.put(key, 'boolean') // Parcelable types do not support booleans, TODO test
			}
			
			if (value.str != null && !value.str.empty)
			{
				map.put(key, 'String')
			}
			
			if (value.float)
			{
				map.put(key, "Double") // bigger? BigDecimal
			}
			
			if (value.int)
			{
				map.put(key, "Long") // bigger? BigInteger
			}
			
			if (value.strFromEnum != null)
			{
				val generatedType = key.generatedType
				createParcelableEnumType(generatedType, value.strFromEnum.values, fsa)
				map.put(key, generatedType)
			}
			
			if (value.datetime != null)
			{
				// create thread safe date formatter
				fsa.generateFile('ConcurrentDateFormatHashMap.java', createConcurrentDateFormatHashMap);
				map.put(key, 'Date')
			}
				
			/**
			 * Inspect first object then generalize for the whole list
			 */
//			value.array ?: value.array.values ?: value.array.values.get(0).parseJsonListItem(map, key, fsa)
		}
		
		fsa.generateFile(className + '.java', className.createParcelable(map, className.createJsonParserCtor(jsonRootObject)))
	}
	
	def createParcelableEnumType(CharSequence classNamePrefix, List<String> enumValues, IFileSystemAccess fsa)
	{
		fsa.generateFile(classNamePrefix + 'Enum.java', classNamePrefix.createParcelableEnumTypeString(enumValues))
	}
	
	def createParcelableEnumTypeString(CharSequence classNamePrefix, List<String> enumValues) '''
	import android.os.Parcel;
	import android.os.Parcelable;
	
	public enum «classNamePrefix»Enum implements Parcelable {
		«enumValues.map[v|v.camelCase + '("' + v + '")'].join(', ')», DEFAULT("default");
		
		// TODO extend with resource in the ctor (either android assets to spare switches or conditional statements)
		private String text;

		«classNamePrefix»Enum(String text) {
	    	this.text = text;
	  	}

		public String getText() {
	    	return this.text;
		}

		public static «classNamePrefix»Enum fromString(String text) {
	    	if (text != null) {
	      		for («classNamePrefix»Enum b : «classNamePrefix»Enum.values()) {
	        		if (text.equalsIgnoreCase(b.text)) {
	          			return b;
	        		}
	      		}
	    	}
	    	// prevents hard crashes
	    	return DEFAULT;
	  	}

		public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
			public Status createFromParcel(Parcel in) {
				return «classNamePrefix»Enum.values()[in.readInt()];
			}

			public Status[] newArray(int size) {
				return new «classNamePrefix»Enum[size];
			}
		};

		@Override
		public int describeContents() {
			return 0;
		}
	
		@Override
		public void writeToParcel(Parcel out, int flags) {
			out.writeInt(ordinal());
		}
	}
    '''
	
	
	/**
	 * TODO read http://stackoverflow.com/questions/10071502/read-writing-arrays-of-parcelable-objects
	 */
	def parseJsonListItem(JsonValue value, Map<String,String> map, String key, IFileSystemAccess fsa)
	{
		value.obj?:
		{
			parseJsonObject(key.toString.capitalizeFirstLetter, value.obj, fsa)
			map.put('Parcelable[]', key + 's')
		}
		
//		if (value.bool) map.put('boolean[]', key + 's')
//		value.str ?: map.put('String[]', key + 's')
//		value.number ?: map.put('BigInteger[] or int, prevent over and underflow in any case', member.key) // TODO
//		value.strFromEnum ?: map.put('Parcelable[]', member.key) // TODO generate enum type, copy paste existing code
//		value.datetime ?: map.put('int[]', member.key) // TODO add conversion to int in the serialization process 
//		value.array? // TODO multi-dimensional array
		
	}
	
	/**
	 * 
	 * We got, boolean (faked Integer), Integers, Serializables, Parcelables, String, Arrays...
	 * source: http://idlesun.blogspot.nl/2012/12/android-parcelable-example-2-subobject.html
	 *  
	 * Parcelables are actually just POJOs that are faster than Serializables,
	 * only Parcelables require manual work to pass on values from one object to the next
	 *
	 * This type of parcelable contains an Exception field in case of failure along the way
	 * e.g. no internet connection etc.
	 * This implementation is intended to be passed on from the background threads
	 * to the ui thread
	 *
	 */ 
	val acceptedTypes = newLinkedList("String", "Integer", "Long", "Float", "Double")
	def createParcelable(CharSequence parcelableClassName, Map<String,String> members, CharSequence additionalMethodsEtc) '''
	public class «parcelableClassName» extends Parcelable
	{
	    «FOR s : members.entrySet»
	    « s.key.createParcelableProtectedMembers(s.value) »
	    «ENDFOR»
	    
	    protected Exception exception = null;
	    
	    «FOR s : members.entrySet»
	    « s.key.createParcelableAccessors(s.value) »
	    «ENDFOR»

	    public «parcelableClassName»(«members.entrySet.map([t | String.format("final %s %s", t.value, t.key)]).join(', ')»)
	    {
			«FOR s : members.entrySet»
			this.« s.key » = « s.key »; 
			«ENDFOR»
	    }

		public «parcelableClassName»(Exception exception)
		{
			this.exception = exception;
		}
	
		public boolean hasException()
		{
			return exception != null;
		}

	    public «parcelableClassName»(Parcel in) {
	    	readFromParcel(in);
	    }

	    @Override
	    public void writeToParcel(Parcel out, int flags) {
		«FOR s : members.entrySet»
		«IF acceptedTypes.contains(s.value)»
			out.write«s.value»(«s.key»);
		«ELSEIF s.value.equals("Date")»
			if («s.key» != null)
			{
				out.writeLong(«s.key».getTime());
			}
		«ELSEIF s.value.equals("boolean")»
			out.writeInteger(«s.key» ? 1 : 0);
		«ELSE»
			out.writeParcelable(«s.key», flags);
		«ENDIF»
		«ENDFOR»
		out.writeSerializable(exception);
	    }

		@Override
	    private void readFromParcel(Parcel in) {
		«FOR s : members.entrySet»
			«IF acceptedTypes.contains(s.value)»
			«s.key» = in.read«s.value»();
			«ELSEIF s.value.equals("boolean")»
			«s.key» = in.readInteger() > 0;
			«ELSEIF s.value.equals("Date")»
			«s.key» = new Date(in.readLong());
			«ELSE»
			«s.key.createParcelableReadMember(s.value)»
			«ENDIF»
		«ENDFOR»
			exception = (Exception) in.readSerializable();
	    }

	    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

	        public «parcelableClassName» createFromParcel(Parcel in) {
	            return new «parcelableClassName»(in);
	        }

	        public «parcelableClassName»[] newArray(int size) {
	            return new «parcelableClassName»[size];
	        }

	    };

	    @Override
	    public int describeContents() {
	        return 0;
	    }
	    
	    «additionalMethodsEtc»
	}
	'''
	
	def joinPairAsMap(Iterator<CharSequence> keys, Iterator<CharSequence> values)
	{
		val hashMap = <CharSequence, CharSequence>newHashMap()
		while (keys.hasNext && values.hasNext)
		{
			val value = values.next
			val key = keys.next
			hashMap.put(key, value)
		}
		return hashMap
	}

	def createParcelableProtectedMembers(CharSequence parameterName, CharSequence parameterType) '''
	protected «parameterType» «parameterName»;
	''' 

	def createParcelableReadMember(String parameterName, CharSequence readMethodNameSuffix) '''
	«parameterName» = in.readParcelable(«parameterName.generatedType».class.getClassLoader());
	'''

	def createParcelableAccessors(CharSequence parameterName, CharSequence parameterType) '''
	void set«parameterName.toString.capitalizeFirstLetter»(final «parameterType» «parameterName»)
	{
		this.«parameterName» = «parameterName»;
	}
	«parameterType» get«parameterName.toString.capitalizeFirstLetter»() { return «parameterName»; }
	'''

	def camelCase(CharSequence input)
	{
		val strArr = input.toString.replaceAll("\\s", "-").split("-").map(s | s.capitalizeFirstLetter).join('')
		return strArr.substring(0, 1).toLowerCase + strArr.substring(1)
	}
	
	def capitalizeFirstLetter(String s)
	{
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
	
	def getGeneratedType (String s)
	{
		return s.camelCase.capitalizeFirstLetter
	}
	
}

