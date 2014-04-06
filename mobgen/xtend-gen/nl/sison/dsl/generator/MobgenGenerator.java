package nl.sison.dsl.generator;

import nl.sison.dsl.generator.AndroidResourceGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class MobgenGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    AndroidResourceGenerator _androidResourceGenerator = new AndroidResourceGenerator();
    _androidResourceGenerator.doGenerate(resource, fsa);
  }
}
