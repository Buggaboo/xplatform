package nl.sison.dsl.mobgen;

import com.google.inject.Inject;
import java.util.Map;
import nl.sison.dsl.MobgenInjectorProvider;
import nl.sison.dsl.mobgen.Mobgen;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(MobgenInjectorProvider.class)
@SuppressWarnings("all")
public class MobgenAndroidTests {
  @Inject
  private IGenerator underTest;
  
  @Inject
  private ParseHelper<Mobgen> parseHelper;
  
  /**
   * These are just resource constants for android
   */
  @Test
  public void testEnumInstance() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("enum Nomnom {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("a, b, c");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Mobgen model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      final String androidFileName = (IFileSystemAccess.DEFAULT_OUTPUT + "NomnomEnum.java");
      Map<String,CharSequence> _files = fsa.getFiles();
      final CharSequence whatWeGot = _files.get(androidFileName);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("public enum NomnomEnum {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("a, b, c;");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      final String expected = _builder_1.toString();
      InputOutput.<String>println(("expected: " + expected));
      InputOutput.<String>println(("what we got: " + whatWeGot));
      Assert.assertEquals(expected, whatWeGot);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * This generates enum classes for android
   */
  @Test
  public void testMapInstanceOnlyKeyValuePairs() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("map Alice");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("label1 : \"label1\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("label2 : \"label2\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("hint1 : \"hint1\",");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("hint2 : \"hint2\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Mobgen model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      final String androidFileName = (IFileSystemAccess.DEFAULT_OUTPUT + "mobgen_strings.xml");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
      _builder_1.newLine();
      _builder_1.append("<resources>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<string name=\"alice_label1\">label1</string>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<string name=\"alice_label2\">label2</string>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<string name=\"alice_hint1\">hint1</string>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<string name=\"alice_hint2\">hint2</string>");
      _builder_1.newLine();
      _builder_1.append("</resources>");
      final String expected = _builder_1.toString();
      Map<String,CharSequence> _files = fsa.getFiles();
      CharSequence _get = _files.get(androidFileName);
      final String whatWeGot = _get.toString();
      InputOutput.<String>println(("expected: " + expected));
      InputOutput.<String>println(("what we got: " + whatWeGot));
      Assert.assertEquals(expected, whatWeGot);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMapInstanceOnlyLists() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("map Alice");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("label1 : [\"a\", \"b\"]");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Mobgen model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      final String androidFileName = (IFileSystemAccess.DEFAULT_OUTPUT + "mobgen_strings.xml");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
      _builder_1.newLine();
      _builder_1.append("<resources>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<string-array name=\"alice_label1\">");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("<item>a</item>");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("<item>b</item>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</string-array>");
      _builder_1.newLine();
      _builder_1.append("</resources>");
      final String expected = _builder_1.toString();
      Map<String,CharSequence> _files = fsa.getFiles();
      CharSequence _get = _files.get(androidFileName);
      final String whatWeGot = _get.toString();
      InputOutput.<String>println(("expected: " + expected));
      InputOutput.<String>println(("what we got: " + whatWeGot));
      Assert.assertEquals(expected, whatWeGot);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
