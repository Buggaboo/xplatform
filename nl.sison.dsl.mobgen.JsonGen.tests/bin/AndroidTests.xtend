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
    def void testListScalarEnum()
    {
    	val str = '''
    	{
    		"f" : [ enum("ab", "cd", "ef")],
    		"g" : [datetime("ddd-MMM-yyyy")],
    		"h" : [ enum{"xy", "yz", "xz"} ],
    		"i" : enum{"xy", "yz", "xz"},
    		"j" : enum{"a", "b", "c"}
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
    
    @Test
    def void testListScalarDate()
    {
    	val str = '''
    	{
    		"f" : [UTC],
    		"f1" : UTC,
    		"g" : [datetime("ddd-MMM-yyyy")],
    		"h" : { "i" : UTC, "j" : [datetime("ddd-MMM-yyyy")] }
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
    
    @Test
    def void testListScalarString()
    {
    	val str = '''
    	{
    		"b" : [1.1,1.2,1.3],
    		"d" : ["a", "b", "c"],
    		"i" : { "a" : [ "x", "y", "z"] }
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
    
    @Test
    def void testListScalarNumber()
    {
    	val str = '''
    	{
    		"a" : [1,2,3,4,5,6],
    		?"b" : [1.1,1.2,1.3],
    		"c" : [1.1e10,1.2E6,-1.3e-10],
    		"i nformation" : { "a" : [ "x", "y", "z"] }
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
    
    @Test
    def void testListScalar()
    {
    	val str = '''
    	{
    		"a" : [1,2,3,4,5,6], // INT
    		"b" : [1.1,1.2,1.3], // JsonFloat
    		?"c" : [1.1e10,1.2E6,-1.3e-10], // JsonFloat
    		"d" : ["a", "b", "c"], // STRING
    		"e" : [true, false], // JSON_BOOLEAN
    		"f" : [UTC], // ExJsonDateTime
    		"g" : [datetime("ddd-MMM-yyyy")], // ExJsonDateTime
    		?"h" : [enum{"a", "b", "c"}], // ExJsonEnum
    		"i" : UTC
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
    
    @Test
    def void testUTCAndDateFormat ()
    {
    	val str = '''
    	{
    		"f" : UTC,
    		"g" : datetime("ddd-MMM-yyyy"),
    		"a hab" : enum {"blue", "green", "red"},
    		"b eel zebub" : enum ("cyan", "red", "muck")
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
    
    @Test
    def void testEnums()
    {
    	val str = '''
    	{
    		"a hab" : enum {"blue", "green", "red"},
    		"b low" : enum {"a", "b", "c"},
    		"c rab" : 4.0001,
    		"d elta": "1234",
    		?"efteLing" : 2,
    		"f" : -4.0e-10
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
    
    @Test
    def void testIntegerAndFloats()
    {
    	val str = '''
    	{
    		"a hab" : "string",
    		"b low" : 1,
    		"c rab" : 4.0001,
    		"d elta": "1234",
    		?"efteLing" : 2,
    		"f" : -4.0e-10,
    		"g" : -5.0E-10,
    		"h" : -6.0E10,
    		"i" : 7.0e10
    	}
    	'''
    	println(str.generateModelThenFiles.allFiles)
    }
     
    @Test
    def void testBooleanAndParcelableAndString() {
        val model = parseHelper.parse('''
        {
        	"a" : true,
        	"b" : "string",
        	"count-zero" : { "d" : "string", "f-zero" : {"q" : "string", "z" : 1234}},
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
    
    @Test
    def void testXtendSyntaxWrtLambda()
    {
    	val lambda = [ int route, String something | route + something ]
    }
     
}