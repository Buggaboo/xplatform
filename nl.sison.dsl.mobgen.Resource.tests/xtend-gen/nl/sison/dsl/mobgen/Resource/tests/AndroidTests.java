package nl.sison.dsl.mobgen.Resource.tests;

import com.google.inject.Inject;
import java.util.Map;
import nl.sison.dsl.mobgen.ResourceInjectorProvider;
import nl.sison.dsl.mobgen.resource.Greeting;
import nl.sison.dsl.mobgen.resource.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(ResourceInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class AndroidTests {
  @Inject
  private ParseHelper<Model> parser;
  
  @Inject
  private IGenerator underTest;
  
  @Test
  public void meh() {
    try {
      Model _parse = this.parser.parse("Hello Jasm!");
      final Model model = ((Model) _parse);
      EList<EObject> _eContents = model.eContents();
      EObject _head = IterableExtensions.<EObject>head(_eContents);
      final Greeting greeting = ((Greeting) _head);
      String _name = greeting.getName();
      Assert.assertEquals(_name, "Jasm");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void muf() {
    try {
      Model _parse = this.parser.parse("Hello Jasm!");
      final Model model = ((Model) _parse);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _textFiles = fsa.getTextFiles();
      InputOutput.<Map<String, CharSequence>>println(_textFiles);
      final Map<String, CharSequence> map = fsa.getTextFiles();
      final String keyFile = (IFileSystemAccess.DEFAULT_OUTPUT + "greetings.txt");
      boolean _containsKey = map.containsKey(keyFile);
      Assert.assertTrue(_containsKey);
      CharSequence _get = map.get(keyFile);
      Assert.assertEquals(_get, "People to greet: Jasm");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
