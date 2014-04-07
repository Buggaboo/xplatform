package nl.sison.dsl.generator

import java.util.ArrayList
import java.util.Iterator
import nl.sison.dsl.mobgen.MapInstance
import nl.sison.dsl.mobgen.StringList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import nl.sison.dsl.mobgen.EnumInstance

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
		instances.forEach(m | fsa.generateFile(m.name.capitalizeFirstLetter+'Enum',
			m.name.capitalizeFirstLetter.javaEnumTemplate(m.values.join(",\n"))
		))
	}
	
	def capitalizeFirstLetter(String s)
	{
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
	
	def javaEnumTemplate(String name, String commaSeparatedValues) '''
    public enum «name»Enum {
    	«commaSeparatedValues»
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
			if (value instanceof StringList) // test
			{
//				val item = value. 
				//.map(s | s.toString.androidResourceItemize).join("\n")
//				result.append(name.androidKeyStringArray(keys.next, items).toString)
			}else
			{
				result.append(name.androidKeyString(keys.next, value.toString).toString)
			}
		}

		println("result: " + result.toString)	
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
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
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

