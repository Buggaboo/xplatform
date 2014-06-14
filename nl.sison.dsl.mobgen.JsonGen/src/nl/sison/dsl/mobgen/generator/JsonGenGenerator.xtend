package nl.sison.dsl.mobgen.generator

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
		
		// TODO define method convertDateToString/2{dateDate, stringFormat:String} using the same principle as above
	}
	'''

	// TODO wrap with JSONParseException and place it in the exception member
	// TODO remove code duplication
	def createJsonParserCtor(CharSequence className, JsonObject jsonRootObject) '''
	public «className»(final JSONObject jsonRoot)
	{
		try {
		«FOR member : jsonRootObject.members»
		«IF member.optional»
		if (!jsonRoot.isNull("«member.key»"))
		{
			«IF member.value.array != null»
				«member.createJsonListParser»
			«ELSE»
				this.«member.key.camelCase» = «member.mapToSerializedType»
			«ENDIF»
		}
		«ELSE»
			«IF member.value.array != null»
				«member.createJsonListParser»
			«ELSE»
				this.«member.key.camelCase» = «member.mapToSerializedType»
			«ENDIF»
		«ENDIF»
		«ENDFOR»
		} catch (JSONException e) {
			this.exception = e;
			e.printStackTrace();
		}
	}
	'''
	
	def createJsonListParser (String assignment, String arrayKey, String realType) '''
	ArrayList<«realType.capitalizeFirstLetter»> «arrayKey.camelCase»List = new ArrayList<«realType.capitalizeFirstLetter»>();
	JSONArray inputArray = jsonRoot.getJSONArray("«arrayKey»");
	for (int i = 0; i < inputArray.length(); i++)
	{
		«assignment»
	}
	«arrayKey.camelCase»List.toArray(«arrayKey.camelCase»);
	'''
	
	def createJsonListParser(Member member) {
		val value = member.value.array.values.head
		val key = member.key
		val camelCaseKey = key.camelCase
		var generatedType = key.generatedType
		
		if (value.obj != null)
			return String.format(camelCaseKey + "List.add(new %s(inputArray.getJSONObject(i)));", generatedType).createJsonListParser(key, generatedType)
			
		if (value.str != null)
			return (camelCaseKey + "List.add(inputArray.getString(i));").createJsonListParser(key, 'String')
		
		if (value.bool) return (camelCaseKey + "List.add(inputArray.getBoolean(i));").createJsonListParser(key, 'boolean')
		
		if(value.float) return (camelCaseKey + "List.add(inputArray.getDouble(i));").createJsonListParser(key, 'double')
		if(value.int)	return (camelCaseKey + "List.add(inputArray.getLong(i));").createJsonListParser(key, 'long')
		
		if(value.strFromEnum != null)
		{
			generatedType = generatedType + 'Enum'
			return String.format(camelCaseKey + "List.add(%s.fromString(inputArray.getString(i)));", generatedType).createJsonListParser(key, generatedType)
		}
		
		if(value.datetime != null)
		{
			val df = value.datetime
			return String.format(camelCaseKey + "List.add(ConcurrentDateFormatHashMap.convertStringToDate(\"%s\", inputArray.getString(i)));", if (df.utc) "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" else df.format).createJsonListParser(key, 'Date')
		}
		
		return "UNDEFINED"
	}
	
	def mapToSerializedType(Member member)
	{
		val value = member.value
		val key = member.key
		
		if (value.obj != null)
			return String.format("new %s(jsonRoot.getJSONObject(\"%s\"));", key.generatedType, key)
			
		if (value.str != null)
		{
			return String.format("jsonRoot.getString(\"%s\");", key)
		}
		
		if (value.bool) return String.format("jsonRoot.getBoolean(\"%s\");", key)
		
		if(value.float) return String.format("jsonRoot.getDouble(\"%s\");", key)
		if(value.int)	return String.format("jsonRoot.getLong(\"%s\");", key)
		
		if(value.strFromEnum != null)
		{
			return String.format("%sEnum.fromString(jsonRoot.getString(\"%s\"));", key.generatedType, key)
		}
		
		if(value.datetime != null)
		{
			val df = value.datetime
			return String.format("ConcurrentDateFormatHashMap.convertStringToDate(\"%s\", jsonRoot.getString(\"%s\"));", if (df.utc) "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" else df.format, key)
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
				map.put(key, "double") // bigger? BigDecimal
			}
			
			if (value.int)
			{
				map.put(key, "long") // bigger? BigInteger
			}
			
			if (value.strFromEnum != null)
			{
				val generatedType = key.generatedType + 'Enum'
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
			if (value.array != null)
			{
				value.array.values.head.parseJsonArray(map, key, fsa)
			}
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
	import android.support.v4.os.ParcelableCompat;
	
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
			public «classNamePrefix»Enum createFromParcel(Parcel in) {
				return «classNamePrefix»Enum.values()[in.readInt()];
			}

			public «classNamePrefix»Enum[] newArray(int size) {
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
	def parseJsonArray(JsonValue value, Map<String,String> map, String key, IFileSystemAccess fsa)
	{
		val generatedType = key.generatedType
		
		if (value.obj != null)
		{
			parseJsonObject(key.toString.capitalizeFirstLetter, value.obj, fsa)
			map.put(key, generatedType +'[]')
		}
		
		if(value.str != null) map.put(key, 'String[]')
		
		if (value.float) map.put(key, 'double[]')

		if (value.int) map.put(key, 'long[]')
		
		if (value.bool) map.put(key, 'boolean[]')
		
		if (value.datetime != null) {
			map.put(key, 'Date[]')
			fsa.generateFile('ConcurrentDateFormatHashMap.java', createConcurrentDateFormatHashMap);
		}
		
		
		if (value.strFromEnum != null)
		{
			map.put(key, generatedType + 'Enum[]') // TODO generate enum type, copy paste existing code
			createParcelableEnumType(generatedType, value.strFromEnum.values, fsa)
		}
		
//		value.array? // TODO multi-dimensional array // TODO throw IllegalArgumentException
		
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
	// TODO include imports only when they are needed
	// TODO fix (un)marshalling of optional fields, because that will break	 
	val acceptedTypes = newLinkedList("String", "Int", "Long", "Float", "Double")
	val acceptedArrayTypes = #{"String[]" -> 'StringArray', "int[]" -> 'IntArray', "long[]" -> 'LongArray', "float[]" -> 'FloatArray', "double[]" -> 'DoubleArray',
		'boolean[]' -> 'BooleanArray' // TODO write SparseBooleanArray code
	}
	def createParcelable(CharSequence parcelableClassName, Map<String,String> members, CharSequence jsonParserCtor) '''
	import java.util.ArrayList;
	import java.util.Date;

	import org.json.JSONObject;
	import org.json.JSONArray;
	import org.json.JSONException;

	import android.os.Parcel;
	import android.os.Parcelable;
	import android.support.v4.os.ParcelableCompat;
	
	public class «parcelableClassName» implements Parcelable
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

		public «parcelableClassName»(final Exception exception)
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
			«ELSEIF acceptedArrayTypes.containsKey(s.value)»
				out.write«acceptedArrayTypes.get(s.value)»(«s.key»);
			«ELSEIF s.value.startsWith("Date")»
				if («s.key» != null)
				{
				«IF s.value.endsWith('[]')»
					long[] «s.key»Array = new long[«s.key».length];
					for (int i=0; i < «s.key».length; i++)
					{
						«s.key»Array[i] = «s.key»[i].getTime();
					}
					out.writeLongArray(«s.key»Array);
				«ELSE»
					out.writeLong(«s.key».getTime());
				«ENDIF»
				}
			«ELSEIF s.value.equals("boolean")»
				out.writeInt(«s.key» ? 1 : 0);
			«ELSEIF s.value.endsWith("Enum[]")»
				out.writeParcelableArray(«s.key», flags);
			«ELSE»
				out.writeParcelable(«s.key», flags);
			«ENDIF»
			«ENDFOR»
			out.writeSerializable(exception);
	    }

	    private void readFromParcel(Parcel in) {
			«FOR s : members.entrySet»
				«IF acceptedTypes.contains(s.value)»
					«s.key» = in.read«s.value»();
				«ELSEIF acceptedArrayTypes.containsKey(s.value)»
					in.read«acceptedArrayTypes.get(s.value)»(«s.key»);
				«ELSEIF s.value.equals("boolean")»
					«s.key» = in.readInt() > 0;
				«ELSEIF s.value.startsWith("Date")»
					«IF s.value.endsWith('[]')»
						long[] «s.key»longArray = null;
						in.readLongArray(«s.key»LongArray);
						«s.key» = new Date[«s.key»LongArray.length];
						for (int i=0; i<«s.key»LongArray.length; i++)
						{
							«s.key»[i] = new Date(«s.key»LongArray[i]);
						}
					«ELSE»
						«s.key» = new Date(in.readLong());
					«ENDIF»
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
	    
	    «jsonParserCtor»
	}
	'''

	def createParcelableProtectedMembers(CharSequence parameterName, CharSequence parameterType) '''
	protected «parameterType» «parameterName»;
	''' 

	def createParcelableReadMember(String parameterName, String type) '''
	«parameterName» = in.readParcelable«IF type.endsWith("[]")»Array«ENDIF»(«type».class.getClassLoader());
	'''

	/* TODO make getters return defensive copy */
	def createParcelableAccessors(CharSequence parameterName, CharSequence parameterType) '''
	public void set«parameterName.toString.capitalizeFirstLetter»(final «parameterType» «parameterName»)
	{
		this.«parameterName» = «parameterName»;
	}
	public «parameterType» get«parameterName.toString.capitalizeFirstLetter»() { return «parameterName»; }
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

