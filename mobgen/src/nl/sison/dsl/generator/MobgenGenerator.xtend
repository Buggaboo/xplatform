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
		enumInstances.writeJavaEnumFiles(fsa)
	}
	
	/**
	 * Enum related stuff
	 */
	def writeJavaEnumFiles(Iterator<EnumInstance> instances, IFileSystemAccess fsa) {
		instances.forEach(m | fsa.generateFile(m.name.capitalizeFirstLetter+'Enum.java',
			m.name.capitalizeFirstLetter.javaEnumTemplate(m.values.join(", "))
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
		val method = callDefinition.method.capitalizeFirstLetter
		val uri = callDefinition.uri
		val urlParams = uri.parameters

		val stringBuffer = new StringBuffer
		stringBuffer.append(uri.stringPrefix.toString.setPackage)
		
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
	
	def wrapAsLoader(CharSequence className, CharSequence returnType, CharSequence method, CharSequence requestBody, CharSequence jsonParserToParcelable, CharSequence serverBoundPayload) '''
	import android.content.AsyncTaskLoader;
	import android.content.Context;
	
	// inspired by http://blog.gunawan.me/2011/10/android-asynctaskloader-exception.html
	public class «className»Loader extends AsyncTaskLoader<«returnType»>
	{
		«returnType» result;
	
		public «className»Loader(Context context) {
			super(context);
		}
		
		public «className»Loader(Context context, String param) { // TODO params
			this(context);
			// this.param = param;
		}
	
		// Load the data asynchronously
		@Override
		public «returnType» loadInBackground() {
			try
			{
				«className»HttpRequest.setParameters(TODO);
				«className»HttpRequest.do«method»Request();
				return «className»HttpRequest.getResult();
				/**
				 * if this invoked http request throws an exception
				 * TODO Let the exception object come through the 'result' object
				 */
			}catch (Exception e)
			{
				return «returnType»(e); // TODO define this
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
			
			private static «returnType» result = null; 
			public static «returnType» getResult() { return result; }
			
			// TODO feed parameters to urlParams, headerParams, readStream and writeStream, through outer class, it's unnecessary to declare private members twice
			
			public do«method»Request()
			{
				«requestBody»
			}
			
			/**
			 * readStream assigns a Parcelable to this.result
			 */
			private void readStream(BufferedInputStream in)
			{
				«jsonParserToParcelable»
			}
			
			private void writeStream(BufferedOutputStream out)
			{
				«serverBoundPayload»
			}
			
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

	def createParcelable(CharSequence returnType, CharSequence parcelableBody) '''
	public class «returnType» extends Parcelable
	{
		«parcelableBody»
	}
	'''	
	
	def setPackage(String url) '''
	package nl.sison.dsl.mobgen.http« IF url.startsWith("https://") »"s"« ENDIF »;
	
	'''
	
	def isTransportLayerSecured(String url) {
		return if (url.startsWith("https://")) "HttpsURLConnection" else "HttpURLConnection"
	}
	
	def setRequestProperty(CharSequence key, CharSequence parameterOrLiteral) '''
	urlConnection.setRequestProperty("«key»", «parameterOrLiteral»);
	'''
	
	/**
	 * TODO must escape nasty symbols in the header injection part
	 */
	def httpRequestBuilder(CharSequence url, CharSequence method, CharSequence requestPropertyKeyValuePairs) '''
	URL url = new URL("«url»"); // URLEncoder.encode(...) 
	«url.toString.transportLayerSecured» urlConnection = new «url.toString.transportLayerSecured»(url);
	«requestPropertyKeyValuePairs»
	urlConnection.setMethod("«method.toString.toUpperCase»")
	urlConnection.setConnectionTimeout(10000); // 10 seconds
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
			Map<String, List<String>> responseHeaders = urlConnection.getHeaderFields();
			// TODO start logging the header fields
		}
	}catch(IOException e) // TODO do error handling on the UI thread? Toast#show
	{
		if (BuildConfig.DEBUG)
		{
			Log.d("MOBGEN", "...");
			e.printStackTrace();
		}
		throw e;
	}catch(UnknownServiceException e)
	{
		if (BuildConfig.DEBUG)
		{
			Log.d("MOBGEN", "...");
			e.printStackTrace();
		}
		throw e;
	}catch(IllegalAccessError e)
	{
		if (BuildConfig.DEBUG)
		{
			Log.d("MOBGEN", "...");
			e.printStackTrace();
		}
		throw e;
	}finally {
		try
		{
			if (urlConnection != null)
			{
				urlConnection.disconnect();
			}
			if (in != null)
			{
				in.close();
			}
			«IF method.toString.startsWith('P')» // if POST or PUT
			if (out != null)
			{
				out.close();
			}
			«ENDIF»
			
		}catch(IOException e)
		{
			if(BuildConfig.DEBUG)
			{
				Log.d("MOBGEN", "...");
				e.printStackTrace();
				throw e;
			}
		}
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

