import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
 
import static org.junit.Assert.*
import org.eclipse.xtext.generator.IFileSystemAccess
import nl.sison.dsl.mobgen.JsonGenInjectorProvider
import nl.sison.dsl.mobgen.jsonGen.JsonObject

@InjectWith(typeof(JsonGenInjectorProvider))
@RunWith(typeof(XtextRunner))
class JsonToParcelableTests {
     
    @Inject IGenerator underTest
    @Inject ParseHelper<JsonObject> parseHelper 
    
    def generateModelThenFiles(CharSequence s)
    {
    	val model = parseHelper.parse(s)
    	val fsa = new InMemoryFileSystemAccess()
    	underTest.doGenerate(model.eResource, fsa)
    	return fsa
    }
    
    @Test
    def void testIntegerFloats()
    {
    	val str = '''
    	{
    		"a hab" : "string",
    		"b low" : 1,
    		"c rab" : 4.0001,
    		"d elta": "1234",
    		?"efteLing" : 2
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
     
    @Test
    def void testBooleanParcelableString() {
        val model = parseHelper.parse('''
        {
        	"a" : true,
        	"b" : "string",
        	"count-zero" : { "d" : "string", "f-zero" : {"q" : "string"}},
        	?"d-zebra" : { "e" : "fine" },
        	"tango mellow" : "string",
        	"monkey tits" : boolean
        }
        ''')
        val fsa = new InMemoryFileSystemAccess()
        underTest.doGenerate(model.eResource, fsa)
        println(fsa.allFiles)
        
        /*
        assertEquals(2,fsa.allFiles.size)
        assertTrue(fsa.allFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"Alice.java"))
        assertEquals(
            '''
            public class Alice {
                 
            }
            '''.toString, fsa.allFiles.get(IFileSystemAccess::DEFAULT_OUTPUT+"Alice.java").toString
        )
        assertTrue(fsa.allFiles.containsKey(IFileSystemAccess::DEFAULT_OUTPUT+"Bob.java"))
        assertEquals(
            '''
            public class Bob {
                 
            }
            '''.toString, fsa.allFiles.get(IFileSystemAccess::DEFAULT_OUTPUT+"Bob.java").toString)
         */
    }
     
}