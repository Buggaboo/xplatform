package nl.sison.dsl.mobgen

import com.google.inject.Inject
import nl.sison.dsl.MobgenInjectorProvider
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(MobgenInjectorProvider))
class MobgenAndroidTests {
     
    @Inject IGenerator underTest
    @Inject ParseHelper<Mobgen> parseHelper 
    
    /**
     * These are just resource strings for iOS plists / localizations
     */
    @Test def testMapInstance()
    {
    	
    }
    
    /**
     * This generates enum classes for iOS / macs
     */
    @Test def testEnumInstance()
    {
    	
    }
    
}