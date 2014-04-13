package nl.sison.dsl.generator

import java.util.Iterator
import java.util.Map
import nl.sison.dsl.mobgen.EnumInstance
import nl.sison.dsl.mobgen.MapInstance
import nl.sison.dsl.mobgen.MobgenCallDefinition
import nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class MobgenGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		new AndroidResourceGenerator().doGenerate(resource, fsa)
	}
	
}

class AndroidResourceGenerator implements IGenerator
{

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val mapInstances = input.allContents.filter(typeof(MapInstance))
		fsa.generateFile('mobgen_strings.xml', mapInstances.prepareAndroidMap.androidResourceXMLWrap)
		
		val enumInstances = input.allContents.filter(typeof(EnumInstance))
		enumInstances.writeAndroidEnumFiles(fsa)
	}
	
	/**
	 * Enum related stuff
	 */
	def writeAndroidEnumFiles(Iterator<EnumInstance> instances, IFileSystemAccess fsa) {
		instances.forEach(m | fsa.generateFile(m.name.capitalizeFirstLetter+'Enum.java',
			m.name.capitalizeFirstLetter.androidParcelableEnumTemplate(m.values.join(",\n"))
		))
		
		// TODO refactor so that m.name.capitalizeFirstLetter is added as an XText EFeature
		instances.forEach(m | fsa.generateFile(m.name.capitalizeFirstLetter+'Enum.java',
			m.name.capitalizeFirstLetter.javaEnumTemplate(m.values.join(",\n"))
		))
		
	}
	
	def capitalizeFirstLetter(String s)
	{
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
	
	def javaEnumTemplate(String name, String commaSeparatedValues) '''
	public enum «name»Enum {
		«commaSeparatedValues»;
	}	
	'''
	
	def androidParcelableEnumTemplate(String name, String commaSeparatedValues) '''
	import android.os.Parcel;
	import android.os.Parcelable;
	
	public enum «name»Enum implements Parcelable {
		«commaSeparatedValues»;
		
		// TODO extend with resource in the ctor (either android assets to spare switches or conditional statements)

		public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
			public Status createFromParcel(Parcel in) {
				return «name»Enum.values()[in.readInt()];
			}

			public Status[] newArray(int size) {
				return new «name»Enum[size];
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
	 * Map related code
	 */
	def String prepareAndroidMap(Iterator<MapInstance> instances)
	{
		return instances.map(m | m.joinAndroidMapNameWithKeyValuePairs ).join('')
	}
	
	def String joinAndroidMapNameWithKeyValuePairs(MapInstance instance)
	{
		val name = instance.name.toLowerCase
		val keys = instance.keys.listIterator
		val values = instance.values.listIterator
	
		var result = new StringBuffer; // TODO use StringBuffer

		while (keys.hasNext && values.hasNext)
		{
			val value = values.next
			val key = keys.next
			if (value.list != null) // test
			{
				val items = value
				result.append(name.androidKeyStringArray(key, items.list.values.map(s | s.androidResourceItemize).join('')))
			}else
			{
				result.append(name.androidKeyString(key, value.string))
			}
		}

		return result.toString
	}
	
	def androidKeyString(CharSequence mapName, CharSequence key, CharSequence value) '''
	<string name="«mapName»_«key»">«value»</string>
	'''

	def androidResourceItemize(CharSequence s) '''
    	<item>«s»</item>
    '''

	def androidKeyStringArray(CharSequence mapName, CharSequence key, CharSequence s) '''
    <string-array name="«mapName»_«key»">
    	«s»
    </string-array>
    '''

	def androidResourceXMLWrap(String s) '''
	<?xml version="1.0" encoding="utf-8"?>
	<resources>
		«s»
	</resources>'''
}

class AndroidHttpRequestGenerator implements IGenerator
{

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val callDefinitions = input.allContents.filter(typeof(MobgenCallDefinition))
		callDefinitions.forEach(d | d.androidCreateJavaFiles(fsa))
	}
	
	/**
	 * 1. Generate http request header Parcelable
	 * 2. Generate http request URL Parcelable
	 * 3. Generate http request Json entity Parcelable // TODO put parser here?
	 * 4. Generate Parcelable for previous three Parcelablesa
	 * 5. Generate http response header Parcelable
	 * 6. Generate http response Json entity Parcelable
	 * 7. Generate Parcelable for previous two Parcelables
	 * 8. Generate AsyncTask loader // multiple async calls unattached to Activity/Fragment
	 * 9. Generate http call method
	 * 10. Generate mock Activity to test the call // TODO
	 * 11. Generate Spark class to handle the call // TODO
	 * // TODO also kill boiler plate for the Activity / Fragment
	 */
	def androidCreateJavaFiles(MobgenCallDefinition callDefinition, IFileSystemAccess fsa)
	{
		if (callDefinition.requestHeaders != null)
		{
			createParcelableRequestHeaderFile(callDefinition, fsa) /* 1. */
			createParcelableRequestUrlFile(callDefinition, fsa) /* 2. */
			if (callDefinition.method.startsWith('P'))
			{
				createParcelableRequestJsonFile(callDefinition, fsa) // only for POST and PUT
			}
		}
		
		/* 2. */
	}
	
	def createLoader(MobgenCallDefinition callDefinition, IFileSystemAccess fsa)
	{
//		def createLoader(CharSequence className, CharSequence returnType, CharSequence method, CharSequence requestBody, CharSequence jsonParserToParcelable, CharSequence serverBoundPayload) '''
		val nameCapitalized = callDefinition.name.capitalizeFirstLetter
		val methodCapitalized = callDefinition.method.capitalizeFirstLetter
		val jsonResultTypeNameCapitalized = callDefinition.jsonToClient.name.capitalizeFirstLetter // probably of type Parcelable otherwise the validator should get in the way
//		nameCapitalized.createLoader(jsonResultTypeNameCapitalized, methodCapitalized, httpRequestBuilder())
		
	}
	
	def createParcelableRequestUrlFile(MobgenCallDefinition callDefinition, IFileSystemAccess fsa)
	{
		val name = callDefinition.requestHeaders.name
		val nameCapitalized = name.capitalizeFirstLetter
		val nameLowerCase = name.toLowerCase
		
		val stringBuffer = new StringBuffer
		
		// outgoing from the client's perspective
		// uri header variables
		val url = callDefinition.uri
		val urlPrefix = url.urlPrefix // probably contains the hostname and protocol https and initial path
		val urlPath = url.path
		val urlPathParameters = url.pathParameters
		val urlPathSuffixes = url.pathSuffix
		
		val urlQueryPrefix = url.query
		val urlQueryParameters = url.queryParameters
		var urlQuerySuffixes = url.querySuffix
		
		val hashMap = <String, String>newHashMap()
		
		for (pp : urlPathParameters)
		{
			hashMap.put(pp, "String") // for security sensitive stuff use a CharArray (char[])
		}
		
		for (qp : urlQueryParameters)
		{
			hashMap.put(qp, "String") // for security sensitive stuff use a CharArray (char[])
		}
		
		val iteratorUrlParams = urlPathParameters.iterator
		val iteratorUrlSuffix = urlPathSuffixes.iterator
		val strBuf = new StringBuffer
		strBuf.append(urlPrefix).append(urlPath) 
		while (iteratorUrlParams.hasNext || iteratorUrlSuffix.hasNext)
		{
			if (!iteratorUrlParams.next.empty)
			{
				strBuf.append("%s")
			}
			
			val suf = iteratorUrlSuffix.next
			if (!suf.empty)
			{
				strBuf.append(suf)
			}
		}
		
		val iteratorUrlQueryParams = urlQueryParameters.iterator
		val iteratorUrlQuerySuffix = urlQuerySuffixes.iterator
		strBuf.append(urlQueryPrefix)
		while (iteratorUrlQueryParams.hasNext || iteratorUrlQuerySuffix.hasNext)
		{
			if (!iteratorUrlQueryParams.next.empty)
			{
				strBuf.append("%s")
			}
			
			val suf = iteratorUrlQuerySuffix.next
			if (!suf.empty)
			{
				strBuf.append(suf)
			}
		}
		
		val addMethod = '''
		public URL getUrl()
		{ // URLEncoder.encode(...) only the actual parameters, not everything
		«IF !urlPathParameters.empty && !urlQueryParameters.empty»
			return new URL(String.format("«strBuf.toString»"«FOR p : urlPathParameters», «p.wrapUrlEncoder»«ENDFOR»«FOR q : urlQueryParameters», «q.wrapUrlEncoder»«ENDFOR»));
		«ELSE»
			return new URL("«strBuf.toString»");
		«ENDIF»
		}
		'''
		
		stringBuffer.append(name.capitalizeFirstLetter.createParcelable(hashMap, addMethod))
		val filePath = String::format("src/%s/%s%s", nameLowerCase.pathForStringFormat, nameCapitalized, 'RequestUrl.java');
		fsa.generateFile(filePath, stringBuffer.toString)
	}
	
	def wrapUrlEncoder(CharSequence parameter) '''
	URLEncoder.encode(«parameter»)
	'''
	
	
	def createParcelableRequestHeaderFile(MobgenCallDefinition callDefinition, IFileSystemAccess fsa)
	{
		val name = callDefinition.requestHeaders.name
		val nameCapitalized = name.capitalizeFirstLetter
		val nameLowerCase = name.toLowerCase
		
		val stringBuffer = new StringBuffer
		
		val requestHeaderKeyValuePairs = callDefinition.requestHeaders.headerKeyValues.filter(typeof(MobgenHeaderKeyValuePair))
		
		val hashMap = <String, String>newHashMap()
		for (kvp: requestHeaderKeyValuePairs)
		{
			if (kvp.parameter != null)
			{
				hashMap.put(kvp.parameter.id, "String") // for security sensitive stuff use a CharArray (char[])
			}
		}
		
		stringBuffer.append(name.capitalizeFirstLetter.createParcelable(hashMap, ""))
		val filePath = String::format("src/%s/%s%s", nameLowerCase.pathForStringFormat, nameCapitalized, 'RequestHeader.java');
		fsa.generateFile(filePath, stringBuffer.toString)
	}
	
	def createParcelableRequestJsonFile(MobgenCallDefinition callDefinition, IFileSystemAccess fsa)
	{
		// TODO ... figure out algorithm to do this
	}

	def capitalizeFirstLetter(String s)
	{
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase;
	}
	
	def getPathForStringFormat(CharSequence nameLowerCase)
	{
		return nameLowerCase.setPackage.toString.substring("package ".length).replace(".", "/") 
	}
	
	def setPackage(CharSequence name) '''
	package nl.sison.dsl.mobgen.« name »;
	
	'''

/*	// TODO assemble imports from generated file(s)
	def setImports(ArrayList<String> list) 
	{
		return list.fold("") [result, s | result + "\nimport " + s]
	}
*/
	/**
	 * The check for 'P' is to differentiate between calls where the server expects a payload, which are POST and PUT
     *
     * TODO also generate the AsyncTask for this, because a Loader has a 1..1 relation with the Fragment/Activity
     * and sometimes you prefer to have a 1..n (Fragment/Activity..Asynctask) relations ship
     *
     */
	def createLoader(CharSequence classNamePrefix, CharSequence returnType, CharSequence method, CharSequence requestBody, CharSequence jsonParserToParcelable, CharSequence serverBoundPayload) '''
	import android.content.AsyncTaskLoader;
	import android.content.Context;
	
	import java.util.Map; // see http call
	
	/** inspired by http://blog.gunawan.me/2011/10/android-asynctaskloader-exception.html */
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
			
			// TODO feed parameters to urlParams, headerParams, readStream and writeStream, through outer class, it's unnecessary to declare private members twice
			
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
			/**
			 * TODO consider removing this remnant of the past, remove if it pre-dates AsyncTaskLoader(?).
			 */
			private void disableConnectionReuseIfNecessary() {
			    // HTTP connection reuse which was buggy pre-froyo
			    if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {
			        System.setProperty("http.keepAlive", "false");
			    }
			}
		}
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

	def createParcelableWriteToParcel(CharSequence parameterName, CharSequence writeMethodNameSuffix) '''
	out.write«writeMethodNameSuffix»(«parameterName»);
	'''

	def createParcelableReadMember(CharSequence parameterName, CharSequence readMethodNameSuffix) '''
	«parameterName» = in.read«readMethodNameSuffix»();
	'''
	
	def createParcelableReadMemberWithCast(CharSequence parameterName, CharSequence readMethodSuffix, CharSequence castToType) '''
	«parameterName» = («castToType») in.read«readMethodSuffix»();
	'''
	
	def createParcelableAccessors(CharSequence parameterName, CharSequence parameterType) '''
	void set«parameterName.toString.capitalizeFirstLetter» (final «parameterType» «parameterName»)
	{
		return this.«parameterName»;
	}
	void get«parameterName.toString.capitalizeFirstLetter» () { return «parameterName»; }
	'''
	
	def camelCaseHttpHeaderKey(CharSequence headerKey)
	{
		val strArr = headerKey.toString.split("-")
		val strBuf = new StringBuffer
		strBuf.append(strArr.head.toString.toLowerCase)
		for (str : strArr)
		{
			if (!str.equals(strArr.head))
			{
				strBuf.append(str.capitalizeFirstLetter)
			}
		}
	}
	
	/**
	 * 
	 * We got, boolean (faked Integer), Integers, Serializables, Parcelables, String, Arrays... 
	 * 
	 */
	def createParcelable(CharSequence parcelableClassName, Map<String,String> members, CharSequence additionalMethodsEtc) '''
	/**
	 * Parcelables are actually just POJOs that are faster than Serializables,
	 * only Parcelables require manual work to pass on values from one object to the next
	 *
	 * This type of parcelable contains an Exception field in case of failure along the way
	 * e.g. no internet connection etc.
	 * This implementation is intended to be passed on from the background threads
	 * to the ui thread
	 *
	 */ 
	public class «parcelableClassName» extends Parcelable
	{
	    «FOR s : members.entrySet»
	    « s.key.createParcelableProtectedMembers(s.value) »
	    «ENDFOR»
	    
	    protected Exception exception = null;
	    
	    // for lack of properties
	    «FOR s : members.entrySet»
	    « s.key.createParcelableAccessors(s.value) »
	    «ENDFOR»

	    public «parcelableClassName»(«FOR s : members.entrySet»«s.key» «s.value»«ENDFOR»)
	    {
		«FOR s : members.entrySet»
			this.« s.key » = « s.key »; 
		«ENDFOR»
	    }

		public «parcelableClassName»(Exception exception) {
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
		«IF newLinkedList("String", "Integer", "Parcelable", "Serializable").contains(s.value)»
			«s.key.createParcelableWriteToParcel(s.value)»
		«ELSEIF s.value.equals("boolean")»
			out.writeInteger(s.key ? 1 : 0);
		«ENDIF»
		«ENDFOR»
			out.writeSerializable(exception);
	    }

	    private void readFromParcel(Parcel in) {
		«FOR s : members.entrySet»
			«IF newLinkedList("String", "Integer", "Parcelable", "Serializable").contains(s.value)»
			«s.key.createParcelableReadMember(s.value)»
			«ELSE»
				«IF s.value.equals("boolean")»
			«s.key» = in.readInteger() > 0;
				«ELSE»
			«s.key.createParcelableReadMemberWithCast("Serializable", s.value)»
				«ENDIF»
			«ENDIF»
		«ENDFOR»
			exception = (Exception) in.readSerializable();
	    }

	    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

	        public «parcelableClassName» createFromParcel(Parcel in) {
	            return new «parcelableClassName»(in);
	        }

	        public «parcelableClassName»[] newArray(int size) {
	            return new «parcelableClassName» [size];
	        }

	    };

	    @Override
	    public int describeContents() {
	        return 0;
	    }
	    
	    «additionalMethodsEtc»
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
	}catch(«exceptionType» e) // TODO do error handling on the UI thread? Toast#show or pass it on via the result object thru the Loader?
	{
		if (BuildConfig.DEBUG)
		{
			Log.d("MOBGEN", "...");
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
	urlConnection.setDoOutput(true); // consider: urlConnection.setDoOutput(urlConnection.getMethod().toUpperCase().startsWith("P")); // POST and PUT
	«ELSE»
	urlConnection.setDoOutput(false);
	«ENDIF»
	InputStream in = null;
	«IF method.toString.startsWith('P')» // if POST or PUT
	OutputStream out = null;
	«ENDIF»
	try
	{
		urlConnection.connect();
		if (!url.getHost().equals(urlConnection.getURL().getHost())) {
			throw new IllegalStateException("You were probably redirected to a sign-on."); // TODO Let the Activity/Fragment handle this...
			// TODO fire up a browser to sign-on. sharedIntent.
		}
		in = new BufferedInputStream(urlConnection.getInputStream());
		readStream(in);
		«IF method.toString.startsWith('P')» // if POST or PUT
		out = new BufferedOutputStream(urlConnection.getOutputStream());
		writeStream(out);
		«ENDIF»
		if (BuildConfig.DEBUG)
		{
			Map<String, List<String>> responseHeaders = urlConnection.getHeaderFields(); // do import statement
			for (Map.Entry<String, List> entry : map.entrySet())
			{
				StringBuffer stringList = new StringBuffer();
				for (String s : entry.getValue())
				{
					stringList.append(s);	
				}
			    Log.e("MOBGEN", String.format("key = %s / value = %s", entry.getKey(), stringList.toString()));
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
			«IF method.toString.startsWith('P')» // if POST or PUT
			if (out != null)
			{
				out.close(); // TODO handle this exception separately
			}
			«ENDIF»
		«"IOException".generateExceptionHandlerLoggingAndThrow»
	}
	'''
}

class ObjCResourceGenerator implements IGenerator
{

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}

class ObjCCallRequestGenerator implements IGenerator
{

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}

class JavaSparkResponseGenerator implements IGenerator
{

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
}

class NodeJsCallResponseGenerator implements IGenerator
{
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
} 

