package nl.sison.dsl.mobgen;

import com.google.inject.Inject;
import nl.sison.dsl.MobgenInjectorProvider;
import nl.sison.dsl.mobgen.Mobgen;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
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
   * These are just resource strings for iOS plists / localizations
   */
  @Test
  public Object testMapInstance() {
    return null;
  }
  
  /**
   * This generates enum classes for iOS / macs
   */
  @Test
  public Object testEnumInstance() {
    return null;
  }
}
