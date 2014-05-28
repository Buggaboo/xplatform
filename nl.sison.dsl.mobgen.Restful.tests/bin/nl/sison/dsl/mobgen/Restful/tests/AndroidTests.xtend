package nl.sison.dsl.mobgen.Restful.tests

import com.google.inject.Inject
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith
import nl.sison.dsl.mobgen.RestfulInjectorProvider

import static org.junit.Assert.*
import nl.sison.dsl.mobgen.restful.Mobgen

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(RestfulInjectorProvider))
class AndroidTests {
     
    @Inject IGenerator underTest
    @Inject ParseHelper<Mobgen> parseHelper
    
    /**
     * These are just resource constants for android
     */     
//    @Test def void testEnumInstance()
//    {
//    	val model = parseHelper.parse('''
//    	enum Nomnom {
//    		a, b, c
//    	}
//    	''')
//    	
//        val fsa = new InMemoryFileSystemAccess()
//        underTest.doGenerate(model.eResource, fsa)
//        
//        val androidFileName = IFileSystemAccess::DEFAULT_OUTPUT+"NomnomEnum.java"
//        val whatWeGot = fsa.files.get(androidFileName)
//        assertTrue(fsa.files.containsKey(androidFileName))
// 
// 		val expected = '''
// 		public enum NomnomEnum {
// 			a, b, c;
// 		}
// 		'''.toString
// 
// 		println("expected: " + expected)
//		println("what we got: " + whatWeGot)
// 
// 		assertEquals(expected, whatWeGot)
//	}
    
    /**
     * This generates enum classes for android
     */
    @Test def void testMapInstanceOnlyKeyValuePairs()
    {
		val model = parseHelper.parse('''
        map Alice
        {
        	label1 : "label1",
        	label2 : "label2",
        	hint1 : "hint1",
        	hint2 : "hint2"
        }
        ''') as Mobgen

        val fsa = new InMemoryFileSystemAccess()
        underTest.doGenerate(model.eResource, fsa)            
            
        val androidFileName = IFileSystemAccess::DEFAULT_OUTPUT+"mobgen_strings.xml"

		println(fsa.textFiles)
		
		val expected ='''
		<?xml version="1.0" encoding="utf-8"?>
		<resources>
			<string name="alice_label1">label1</string>
			<string name="alice_label2">label2</string>
			<string name="alice_hint1">hint1</string>
			<string name="alice_hint2">hint2</string>
		</resources>'''.toString
		
		val whatWeGot = fsa.textFiles.get(androidFileName).toString
		
		println("expected: " + expected)
		println("what we got: " + whatWeGot)
		
        assertEquals(expected, whatWeGot)
    }
    
	@Test def void testMapInstanceOnlyLists()
    {
		val model = parseHelper.parse('''
        map Alice
        {
        	label1 : ["a", "b"]
        }
        ''') as Mobgen

        val fsa = new InMemoryFileSystemAccess()
        underTest.doGenerate(model.eResource, fsa)            
            
		println(fsa.allFiles)
        val androidFileName = IFileSystemAccess::DEFAULT_OUTPUT+"mobgen_strings.xml"

		assertTrue(fsa.textFiles.containsKey(androidFileName))
		
		val expected ='''
		<?xml version="1.0" encoding="utf-8"?>
		<resources>
			<string-array name="alice_label1">
				<item>a</item>
				<item>b</item>
			</string-array>
		</resources>'''
		
		val whatWeGot = fsa.allFiles.get(androidFileName).toString
		
		println("expected: " + expected)
		println("what we got: " + whatWeGot)
		
        assertEquals(expected, whatWeGot)
    }
    
}