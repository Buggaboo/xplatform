package nl.sison.dsl.generator

import java.util.Iterator
import nl.sison.dsl.mobgen.EnumInstance
import nl.sison.dsl.mobgen.MapInstance
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import nl.sison.dsl.mobgen.MobgenCallDefinition
import nl.sison.dsl.mobgen.MobgenHeader
import nl.sison.dsl.mobgen.MobgenJson
import java.util.ArrayList
import java.util.List
import java.util.HashMap

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

class AndroidCallRequestGenerator implements IGenerator
{

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val callDefinitions = input.allContents.filter(typeof(MobgenCallDefinition))
		callDefinitions.forEach(d | d.androidCreateJavaFiles(fsa))
	}
	
	def androidCreateJavaFiles(MobgenCallDefinition callDefinition, IFileSystemAccess fsa)
	{
		val name = callDefinition.name
		val uri = callDefinition.uri
		val urlParams = uri.parameters
		
		// TODO also kill boiler plate for the Activity / Fragment

		val stringBuffer = new StringBuffer
		stringBuffer.append(uri.stringPrefix.toString.setPackage(name))
		
		fsa.generateFile(name.capitalizeFirstLetter + 'Loader.java', stringBuffer.toString)
	}

	def capitalizeFirstLetter(String s)
	{
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase;
	}

/*	// TODO assemble imports from generated file(s)
	def setImports(ArrayList<String> list) 
	{
		return list.fold("") [result, s | result + "\nimport " + s]
	}
*/
	/**
	 * The check for 'P' is to differentiatie between calls where the server expects a payload, which are POST and PUT
	 */
	def wrapAsLoader(CharSequence className, CharSequence returnType, CharSequence method, CharSequence requestBody, CharSequence jsonParserToParcelable, CharSequence serverBoundPayload) '''
	import android.content.AsyncTaskLoader;
	import android.content.Context;
	
	import java.util.Map; // see http call
	
	/** inspired by http://blog.gunawan.me/2011/10/android-asynctaskloader-exception.html */
	public class «className»Loader extends AsyncTaskLoader<«returnType»>
	{
		private «returnType» result;
		private Parcelable parameters;

		public «className»Loader(Context context) {
			super(context);
		}
		
		public «className»Loader(Context context, Parcelable parameters) {
			this(context);
			this.parameters = parameters;
		}
	
		// Load the data asynchronously
		@Override
		public «returnType» loadInBackground() {
			try
			{
				«className»HttpRequest httpRequest = new «className»HttpRequest();
				httpRequest.setParameters(parameters);
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
		
		private class «className»HttpRequest
		{
			public final static «className»HttpRequest INSTANCE = new «className»HttpRequest(); 
			
			private «className»HttpRequest() {
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

	def createParcelableProtectedMembers(CharSequence parameterName, CharSequence parameterType) '''
	protected «parameterType» «parameterName»;
	''' 

	def createParcelableWriteToParcel(CharSequence parameterName, CharSequence parameterType) '''
	out.write«parameterType»(«parameterName»);
	'''

	def createParcelableReadMember(CharSequence parameterName, CharSequence readMethodName) '''
	«parameterName» = in.read«readMethodName»();
	'''
	
	def createParcelableReadMemberWithCast(CharSequence parameterName, CharSequence readMethodName, CharSequence castToType) '''
	«parameterName» = («castToType») in.read«readMethodName»();
	'''
	
	/**
	 * 
	 * We got, boolean (faked Integer), Integers, Serializables, Parcelables, String, Arrays... 
	 * 
	 */
	def createParcelable(CharSequence parcelName, CharSequence members, CharSequence memberAccessors, CharSequence constructorForParameters, CharSequence writeToParcelMethodBody, CharSequence readFromParcelMethodBody) '''
	/**
	 * Parcelables are actually just POJOs that are faster than Serializables,
	 * only Parcelables require manual work to pass on values from one object to the next
	 *
	 * This type of parcelable contains an Exception field in case of failure along the way
	 * e.g. no internet connection etc.
	 */ 
	public class «parcelName» extends Parcelable
	{
	    /*
	    protected String lastComment;
	    protected Integer messageCount;
	    protected Date createdAt;
	    protected boolean ...
	    protected Parcelable ...
	    protected Serialized ...
	    */
	    «members»
	    protected Exception exception;
	    
	    // for lack of properties
	    «memberAccessors»
	    
	    «constructorForParameters»
	    
	    public «parcelName»(Exception exception) {
	    	this.exception = exception;
	    } 

	public boolean hasException()
	{
		return exception != null;
	}

	    public «parcelName»(Parcel in) {
	    	readFromParcel(in);
	    }

	    @Override
	    public void writeToParcel(Parcel out, int flags) {
			«writeToParcelMethodBody»
			out.writeSerializable(exception);
	    }

	    private void readFromParcel(Parcel in) {
			«readFromParcelMethodBody»
			exception = (Exception) in.readSerializable();
	    }

	    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {

	        public «parcelName» createFromParcel(Parcel in) {
	            return new «parcelName»(in);
	        }

	        public «parcelName»[] newArray(int size) {
	            return new «parcelName» [size];
	        }

	    };

	    @Override
	    public int describeContents() {
	        return 0;
	    }
		
	}
	'''	
	
	def setPackage(String url, String name) '''
	package nl.sison.dsl.mobgen.http« IF url.startsWith("https://") »"s"« ENDIF ».« name »;
	
	'''
	
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
	urlConnection.setDoOutput(true);
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

