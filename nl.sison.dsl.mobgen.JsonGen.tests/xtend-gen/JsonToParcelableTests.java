import com.google.inject.Inject;
import java.util.Map;
import nl.sison.dsl.mobgen.JsonGenInjectorProvider;
import nl.sison.dsl.mobgen.jsonGen.JsonObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(JsonGenInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class JsonToParcelableTests {
  @Inject
  private IGenerator underTest;
  
  @Inject
  private ParseHelper<JsonObject> parseHelper;
  
  public InMemoryFileSystemAccess generateModelThenFiles(final CharSequence s) {
    try {
      final JsonObject model = this.parseHelper.parse(s);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      return fsa;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testListScalarEnum() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"f\" : [ enum(\"ab\", \"cd\", \"ef\")],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"g\" : [datetime(\"ddd-MMM-yyyy\")],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"h\" : [ enum{\"xy\", \"yz\", \"xz\"} ],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"i\" : enum{\"xy\", \"yz\", \"xz\"},");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"j\" : enum{\"a\", \"b\", \"c\"}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testListScalarDate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"f\" : [UTC],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"f1\" : UTC,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"g\" : [datetime(\"ddd-MMM-yyyy\")],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"h\" : { \"i\" : UTC, \"j\" : [datetime(\"ddd-MMM-yyyy\")] }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testListScalarString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"b\" : [1.1,1.2,1.3],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"d\" : [\"a\", \"b\", \"c\"],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"i\" : { \"a\" : [ \"x\", \"y\", \"z\"] }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testListScalarNumber() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"a\" : [1,2,3,4,5,6],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("?\"b\" : [1.1,1.2,1.3],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"c\" : [1.1e10,1.2E6,-1.3e-10],");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"i nformation\" : { \"a\" : [ \"x\", \"y\", \"z\"] }");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testListScalar() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"a\" : [1,2,3,4,5,6], // INT");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"b\" : [1.1,1.2,1.3], // JsonFloat");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("?\"c\" : [1.1e10,1.2E6,-1.3e-10], // JsonFloat");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"d\" : [\"a\", \"b\", \"c\"], // STRING");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"e\" : [true, false], // JSON_BOOLEAN");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"f\" : [UTC], // ExJsonDateTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"g\" : [datetime(\"ddd-MMM-yyyy\")], // ExJsonDateTime");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("?\"h\" : [enum{\"a\", \"b\", \"c\"}], // ExJsonEnum");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"i\" : UTC");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testUTCAndDateFormat() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"f\" : UTC,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"g\" : datetime(\"ddd-MMM-yyyy\"),");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"a hab\" : enum {\"blue\", \"green\", \"red\"},");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"b eel zebub\" : enum (\"cyan\", \"red\", \"muck\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testEnums() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"a hab\" : enum {\"blue\", \"green\", \"red\"},");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"b low\" : enum {\"a\", \"b\", \"c\"},");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"c rab\" : 4.0001,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"d elta\": \"1234\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("?\"efteLing\" : 2,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"f\" : -4.0e-10");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testIntegerAndFloats() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"a hab\" : \"string\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"b low\" : 1,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"c rab\" : 4.0001,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"d elta\": \"1234\",");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("?\"efteLing\" : 2,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"f\" : -4.0e-10,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"g\" : -5.0E-10,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"h\" : -6.0E10,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\"i\" : 7.0e10");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testBooleanAndParcelableAndString() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"a\" : true,");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"b\" : \"string\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"count-zero\" : { \"d\" : \"string\", \"f-zero\" : {\"q\" : \"string\", \"z\" : 1234}},");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("?\"d-zebra\" : { \"e\" : \"fine\" },");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"tango mellow\" : \"string\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\"monkey tits\" : boolean");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final JsonObject model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, Object> _allFiles = fsa.getAllFiles();
      InputOutput.<Map<String, Object>>println(_allFiles);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
