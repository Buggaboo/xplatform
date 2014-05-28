package nl.sison.dsl.mobgen.Resource.tests

import com.google.inject.Inject
import nl.sison.dsl.mobgen.ResourceInjectorProvider
import nl.sison.dsl.mobgen.resource.Greeting
import nl.sison.dsl.mobgen.resource.Model
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@InjectWith(typeof(ResourceInjectorProvider))
@RunWith(typeof(XtextRunner))
class AndroidTests {

	@Inject
	ParseHelper<Model> parser

	@Inject IGenerator underTest

	@Test
	def void meh() {
		val model = parser.parse('Hello Jasm!') as Model
		val greeting = model.eContents.head as Greeting
		assertEquals(greeting.name, 'Jasm')
	}

	@Test
	def void muf() {
		val model = parser.parse('Hello Jasm!') as Model
		val fsa = new InMemoryFileSystemAccess()
		underTest.doGenerate(model.eResource, fsa)
		println(fsa.textFiles)
		val map = fsa.textFiles
		val keyFile = IFileSystemAccess::DEFAULT_OUTPUT+'greetings.txt'
		assertTrue(map.containsKey(keyFile))
		assertEquals(map.get(keyFile), 'People to greet: Jasm')
	}
}
