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
		callDefinitions.forEach(d | d.androidCreateJavaFiles)
	}
	
	def androidCreateJavaFiles(MobgenCallDefinition callDefinition)
	{
		val method = callDefinition.method
		val uri = callDefinition.uri
		// ... TODO start here
	}
	
	def setPackage(String callName, String url) '''
	package nl.sison.dsl.mobgen.http« IF url.startsWith("https://") »"s"« ENDIF ».«callName»;
	'''
	
	def isTransportLayerSecured(String url) '''
	« IF url.startsWith("https://") »"HttpsURLConnection"« ELSE »"HttpURLConnection"« ENDIF »
	'''
	
	def setRequestProperty(CharSequence key, CharSequence parameterOrLiteral) '''
	urlConnection.setRequestProperty("«key»", «parameterOrLiteral»);
	'''
	
	def httpRequestParameterBuild(CharSequence method, CharSequence... params) '''
	private void do«method.toString.substring(0,1).toUpperCase + method.toString.substring(1).toLowerCase»Request(«params.join(", ")»)
		throws
			IOException,
			IllegalStateException,
			UnKnownServiceException,
			IllegalAccessError
	'''
	
	def setRequestSignature(CharSequence signature, CharSequence request) '''
	«signature» {
		«request»
	}
	
	private void disableConnectionReuseIfNecessary() {
	    // HTTP connection reuse which was buggy pre-froyo
	    if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {
	        System.setProperty("http.keepAlive", "false");
	    }
	}
	'''
	
	/**
	 * TODO must escape nasty symbols in the header injection part
	 */
	def httpRequestBuilder(CharSequence url, CharSequence method, CharSequence requestPropertyKeyValuePairs, String connectionTypeClass) '''
	URL url = new URL("«url»");
	«connectionTypeClass» urlConnection = new «connectionTypeClass»(url);
	«requestPropertyKeyValuePairs»
	urlConnection.setMethod("«method»")
	urlConnection.setConnectionTimeout(10000); // 10 seconds
	urlConnection.setReadTimeout(10000); // 10 seconds
	urlConnection.setDoInput(true)
	«IF method.equals("POST") || method.equals("PUT")»
	urlConnection.setDoOutput(true);
	«ELSE»
	urlConnection.setDoOutput(false);
	«ENDIF»
	disableConnectionReuseIfNecessary();
	InputStream in = null;
	«IF method.equals("POST") || method.equals("PUT")»
	OutputStream out = null;
	«ENDIF»
	try {
		urlConnection.connect();
		if (!url.getHost().equals(urlConnection.getURL().getHost())) {
			throw new IllegalStateException("You were probably redirected to a sign-on.");
		}
		in = new BufferedInputStream(urlConnection.getInputStream());
		readStream(in);
		«IF method.equals("POST") || method.equals("PUT")»
		out = new BufferedOutputStream(urlConnection.getOutputStream());
		writeStream(out);
		«ENDIF»
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
			«IF method.equals("POST") || method.equals("PUT")»
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

