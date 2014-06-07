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
  public void testIntegerFloats() {
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
    _builder.append("?\"efteLing\" : 2");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String str = _builder.toString();
    InMemoryFileSystemAccess _generateModelThenFiles = this.generateModelThenFiles(str);
    Map<String, Object> _allFiles = _generateModelThenFiles.getAllFiles();
    InputOutput.<Map<String, Object>>println(_allFiles);
  }
  
  @Test
  public void testBooleanParcelableString() {
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
      _builder.append("\"count-zero\" : { \"d\" : \"string\", \"f-zero\" : {\"q\" : \"string\"}},");
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
