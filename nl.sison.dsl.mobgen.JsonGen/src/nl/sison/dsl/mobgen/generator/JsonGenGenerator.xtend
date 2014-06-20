package nl.sison.dsl.mobgen.generator

import java.util.List
import java.util.Map
import nl.sison.dsl.mobgen.jsonGen.JsonObject
import nl.sison.dsl.mobgen.jsonGen.JsonValue
import nl.sison.dsl.mobgen.jsonGen.Member
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * 
 * Parcelable as basic data structure type, reasons are:
 * 
 * They are explicit, more explicit than the Bundle type.
 * They are easily passed on through Bundle type args, using #putParcelable
 * There is a direct mapping of a list of composite json objects to a list of Parcelables using #putParcelableArray(List)
 * 
 * 1.  Generate http request header Parcelable - DONE
 * 2.  Generate http request URL Parcelable - DONE
 * 3.  Generate http request Json entity Parcelable // TODO put parser here?
 * 4.  Generate Parcelable for previous three Parcelables
 * 5.  Generate http response header Parcelable
 * 6.  Generate http response Json entity Parcelable
 * 7.  Generate Parcelable for previous two Parcelables
 * 8.  Generate AsyncTask loader // multiple async calls unattached to Activity/Fragment
 * 9.  Generate http call method
 * 10. Generate mock Activity to test the call // TODO
 * 11. Generate Spark class to handle the call // TODO
 */
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
«««		// TODO define method convertDateToString/2{dateDate, stringFormat:String} using the same principle as above
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
							«member.createJsonArrayParser»
						«ELSE»
							this.«member.key.camelCase» = «member.mapToSerializedType»
						«ENDIF»
					}
				«ELSE»
					«IF member.value.array != null»
						«member.createJsonArrayParser»
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
	
	def createJsonArrayParser(Member member)
	{
		val key = member.key
		val camelCaseKey = key.camelCase
		val value = member.value.array.values.head
		val generatedType = key.generatedType
		
		if (value.obj != null)
			return key.createJsonArrayParser(camelCaseKey, generatedType, 'JSONObject', String.format("new %s(", generatedType))
			
		if (value.str != null)
			return key.createJsonArrayParser(camelCaseKey, 'String', 'String', '')
		
		if (value.bool)
			return key.createJsonArrayParser(camelCaseKey, 'boolean', 'Boolean', '')
		
		if(value.float)
			return key.createJsonArrayParser(camelCaseKey, 'double', 'Double', '')
		
		if(value.int)
			return key.createJsonArrayParser(camelCaseKey, 'long', 'Long', '')
		
		if(value.strFromEnum != null)
			return key.createJsonArrayParser(camelCaseKey, generatedType, 'String', String.format("%s.fromString(", generatedType))
		
		if(value.datetime != null)
			return key.createJsonArrayDateParser(camelCaseKey, 'Date', 'String', String.format("ConcurrentDateFormatHashMap.convertStringToDate(\"%s\", ", value.datetime.format))
		
		return "UNDEFINED"
		
	}
	
	def createJsonArrayParser(CharSequence jsonKey, CharSequence prefix, CharSequence type, CharSequence jsonType, CharSequence assignmentAction) '''
	JSONArray «prefix»JsonArray = jsonRoot.getJSONArray("«jsonKey»");
	«prefix» = new «type»[«prefix»JsonArray.length()];
	for (int i=0; i<«prefix»JsonArray.length(); i++)
	{
		«prefix»[i] = «IF assignmentAction.length > 0»«assignmentAction»«ENDIF»«prefix»JsonArray.get«jsonType»(i)«IF assignmentAction.length > 0»)«ENDIF»;
	}
	'''

	def createJsonArrayDateParser(CharSequence jsonKey, CharSequence prefix, CharSequence type, CharSequence jsonType, CharSequence assignmentAction) '''
	JSONArray «prefix»JsonArray = jsonRoot.getJSONArray("«jsonKey»");
	«prefix» = new «type»[«prefix»JsonArray.length()];
	for (int i=0; i<«prefix»JsonArray.length(); i++)
	{
		try
		{
			«prefix»[i] = «IF assignmentAction.length > 0»«assignmentAction»«ENDIF»«prefix»JsonArray.get«jsonType»(i)«IF assignmentAction.length > 0»)«ENDIF»;
		}catch (ParseException ex)
		{
			this.exception = ex;
		}
	}
	'''
	
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
			return String.format("%s.fromString(jsonRoot.getString(\"%s\"));", key.generatedType + 'Enum', key)
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
		fsa.generateFile(classNamePrefix + '.java', classNamePrefix.createParcelableEnumTypeString(enumValues))
	}
	
	def createParcelableEnumTypeString(CharSequence classNamePrefix, List<String> enumValues) '''
	import android.os.Parcel;
	import android.os.Parcelable;
	import android.support.v4.os.ParcelableCompat;
	
	public enum «classNamePrefix» implements Parcelable {
		«enumValues.map[v|v.camelCase + '("' + v + '")'].join(",\n")», DEFAULT("default");
		
		// TODO extend with resource in the ctor (either android assets to spare switches or conditional statements)
		private String text;

		«classNamePrefix»(String text) {
	    	this.text = text;
	  	}

		public String getText() {
	    	return this.text;
		}

		public static «classNamePrefix» fromString(String text) {
	    	if (text != null) {
	      		for («classNamePrefix» b : «classNamePrefix».values()) {
	        		if (text.equalsIgnoreCase(b.text)) {
	          			return b;
	        		}
	      		}
	    	}
	    	// prevents hard crashes
	    	return DEFAULT;
	  	}

		public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
			public «classNamePrefix» createFromParcel(Parcel in) {
				return «classNamePrefix».values()[in.readInt()];
			}

			public «classNamePrefix»[] newArray(int size) {
				return new «classNamePrefix»[size];
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
			map.put(key, generatedType + '[]') // TODO generate enum type, copy paste existing code
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
	val acceptedTypes = newLinkedList("String", "int", "long", "float", "double")
	val acceptedArrayTypes = #{"String[]" -> 'StringArray', "int[]" -> 'IntArray', "long[]" -> 'LongArray', "float[]" -> 'FloatArray', "double[]" -> 'DoubleArray',
		'boolean[]' -> 'BooleanArray' // TODO write SparseBooleanArray code
	}
	def createParcelable(CharSequence parcelableClassName, Map<String,String> members, CharSequence jsonParserCtor) '''
	import java.text.ParseException;
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
				out.write«s.value.capitalizeFirstLetter»(«s.key»);
			«ELSEIF acceptedArrayTypes.containsKey(s.value)»
				out.write«acceptedArrayTypes.get(s.value)»(«s.key»);
			«ELSEIF s.value.startsWith("Date")»
				if («s.key» != null)
				{
				«IF s.value.endsWith('[]')»
					long[] «s.key»Array = new long[«s.key».length];
					if («s.key» != null)
						for (int i=0;  i < «s.key».length; i++)
						{
							«s.key»Array[i] = «s.key»[i].getTime();
						}
					out.writeLongArray(«s.key»Array);
				«ELSE»
					if («s.key» != null)
						out.writeLong(«s.key».getTime());
				«ENDIF»
				}
			«ELSEIF s.value.equals("boolean")»
				out.writeInt(«s.key» ? 1 : 0);
			«ELSEIF s.value.endsWith("[]")»
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
					«s.key» = in.read«s.value.capitalizeFirstLetter»();
				«ELSEIF acceptedArrayTypes.containsKey(s.value)»
					in.read«acceptedArrayTypes.get(s.value)»(«s.key»);
				«ELSEIF s.value.equals("boolean")»
					«s.key» = in.readInt() > 0;
				«ELSEIF s.value.startsWith("Date")»
					«IF s.value.endsWith('[]')»
						long[] «s.key»LongArray = null;
						in.readLongArray(«s.key»LongArray);
						if («s.key»LongArray != null)
						{
							«s.key» = new Date[«s.key»LongArray.length];
							for (int i=0; i<«s.key»LongArray.length; i++)
							{
								«s.key»[i] = new Date(«s.key»LongArray[i]);
							}
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
	«parameterName» = («type») in.readParcelable«IF type.endsWith("[]")»Array«ENDIF»(«type».class.getClassLoader());
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

class AndroidRestfulHttpRequestGenerator implements IGenerator
{
	/**
	 * The check for 'P' is to differentiate between calls where the server expects a payload, which are POST and PUT
     *
     * TODO also generate the AsyncTask for this, because a Loader has a 1..1 relation with the Fragment/Activity
     * and sometimes you prefer to have a 1..n (Fragment/Activity..Asynctask) relations ship
     *
	 * inspired by http://blog.gunawan.me/2011/10/android-asynctaskloader-exception.html
	 */
	def createLoader(CharSequence classNamePrefix, CharSequence returnType, CharSequence method, CharSequence requestBody, CharSequence jsonParserToParcelable, CharSequence serverBoundPayload) '''
	import android.content.AsyncTaskLoader;
	import android.content.Context;
	
	import java.util.Map; // see http call
	
	public class «classNamePrefix»Loader extends AsyncTaskLoader<«returnType»>
	{
		private «returnType» result;
		private «classNamePrefix»RequestParameters parameters;

		public «classNamePrefix»Loader(Context context) {
			super(context);
		}
		
		public «classNamePrefix»Loader(Context context, Parcelable parameters) {
			this(context);
			this.parameters = parameters;
		}
	
		// Load the data asynchronously
		@Override
		public «returnType» loadInBackground() {
			try
			{
				«classNamePrefix»HttpRequest httpRequest = new «classNamePrefix»HttpRequest(parameters);
				httpRequest.do«method»Request();
				return httpRequest.getResult();
				/**
				 * if this invoked http request throws an exception
				 * TODO Let the exception object come through the 'result' object
				 */
			}catch (Exception e)
			{
				return «returnType»(e); // general exception catch: this must be passed on to the ui thread
			}
		}
		
		
		@Override
		public void deliverResult(«returnType» data) {
			if (isReset()) {
				// some data came in while the loader is stopped
				return;
			}
			this.result = data;
			super.deliverResult(data);
		}
	
		@Override
		protected void onStartLoading() {
		    if (result != null) { // This determines the difference between initLoader and restartLoader 
		      deliverResult(result);
		    }
		
		    if (takeContentChanged() || result == null) {
		      forceLoad();
		    }
		  }
		}
		
		@Override
		protected void onStopLoading() {
			cancelLoad();
		}
		
		@Override
		protected void onReset() {
			super.onReset();
			cancelLoad();
			result = null;
		}
		
		private class «classNamePrefix»HttpRequest
		{
			private «classNamePrefix»RequestParameters parameters;
			
			private «classNamePrefix»HttpRequest(Parcelable parameters) {
				this.parameters = parameters;
				disableConnectionReuseIfNecessary();
			}
			
			private «returnType» result = null; 
			public «returnType» getResult() { return result; }
			
«««			// TODO feed parameters to urlParams, headerParams, readStream and writeStream, through outer class, it's unnecessary to declare private members twice
			
			public do«method»Request()
			{
				«requestBody»
			}
			
			/**
			 * readStream parses a JSON then assigns a Parcelable to this.result
			 */
			private void readStream(BufferedInputStream in)
			{
				«jsonParserToParcelable»
			}
			«IF method.toString.startsWith("P")»
			/**
			 *
			 * Convert parameters to JSON conforming to the server's expection of the call
			 *
			 */
			private void writeStream(BufferedOutputStream out)
			{
				«serverBoundPayload»
			}
			«ENDIF»
«««			/**
«««			 * TODO consider removing this remnant of the past, remove if it pre-dates AsyncTaskLoader(?).
«««			 */
			private void disableConnectionReuseIfNecessary() {
			    // HTTP connection reuse which was buggy pre-froyo
			    if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {
			        System.setProperty("http.keepAlive", "false");
			    }
			}
		}
	}
	'''
	
		/**
	 * TODO Check if Https is being used correctly
	 */
	def isTransportLayerSecured(String url) {
		return if (url.startsWith("https://")) "HttpsURLConnection" else "HttpURLConnection"
	}
	
	def setRequestProperty(CharSequence key, CharSequence parameterOrLiteral) '''
	urlConnection.setRequestProperty("«key»", «parameterOrLiteral»);
	'''
	
	def generateExceptionHandlerLoggingAndThrow(CharSequence exceptionType) '''
	}catch(«exceptionType» e)
«««	// TODO do error handling on the UI thread? Toast#show or pass it on via the result object thru the Loader?
	{
		if (BuildConfig.DEBUG)
		{
			Log.d("JSONGEN", "...");
			e.printStackTrace();
		}
		throw e;
	'''
	
	/**
	 * TODO must escape nasty symbols in the header injection part using URLEncoder#encode/?
	 */
	def httpRequestBuilder(CharSequence url, CharSequence method, CharSequence requestPropertyKeyValuePairs) '''
	URL url = new URL("«url»"); // URLEncoder.encode(...) 
	«url.toString.transportLayerSecured» urlConnection = new «url.toString.transportLayerSecured»(url);
	«requestPropertyKeyValuePairs»
	urlConnection.setMethod("«method.toString.toUpperCase»")
	urlConnection.setConnectionTimeout(10000); // 10 seconds, default over configuration principle
	urlConnection.setReadTimeout(10000); // 10 seconds
	urlConnection.setDoInput(true)
	«IF method.toString.startsWith('P')» // if POST or PUT
	urlConnection.setDoOutput(true);
«««	// consider: urlConnection.setDoOutput(urlConnection.getMethod().toUpperCase().startsWith("P")); // POST and PUT
	«ELSE»
	urlConnection.setDoOutput(false);
	«ENDIF»
	InputStream in = null;
«««	// if POST or PUT
	«IF method.toString.startsWith('P')»
	OutputStream out = null;
	«ENDIF»
	try
	{
		urlConnection.connect();
		if (!url.getHost().equals(urlConnection.getURL().getHost())) {
			throw new IllegalStateException("You were probably redirected to a sign-on.");
«««			// TODO Let the Activity/Fragment handle this...
«««			// TODO fire up a browser to sign-on. sharedIntent.
		}
		in = new BufferedInputStream(urlConnection.getInputStream());
		readStream(in);
«««		 // if POST or PUT
		«IF method.toString.startsWith('P')»
			out = new BufferedOutputStream(urlConnection.getOutputStream());
			writeStream(out);
		«ENDIF»
		if (BuildConfig.DEBUG)
		{
			Map<String, List<String>> responseHeaders = urlConnection.getHeaderFields();
«««			// do import statement
			for (Map.Entry<String, List> entry : map.entrySet())
			{
				StringBuffer stringList = new StringBuffer();
				for (String s : entry.getValue())
				{
					stringList.append(s);	
				}
			    Log.e("JSONGEN", String.format("key = %s / value = %s", entry.getKey(), stringList.toString()));
			}
		}
	«"IOException".generateExceptionHandlerLoggingAndThrow»
	«"UnknownServiceException".generateExceptionHandlerLoggingAndThrow»
	«"IllegalAccessError".generateExceptionHandlerLoggingAndThrow»
	}finally {
		try
		{
			if (urlConnection != null)
			{
				urlConnection.disconnect(); // TODO handle this exception separately
			}
			if (in != null)
			{
				in.close(); // TODO handle this exception separately
			}
«««			 // if POST or PUT
			«IF method.toString.startsWith('P')»
			if (out != null)
			{
				out.close(); // TODO handle this exception separately
			}
			«ENDIF»
		«"IOException".generateExceptionHandlerLoggingAndThrow»
	}
	'''

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
	}
	
}
