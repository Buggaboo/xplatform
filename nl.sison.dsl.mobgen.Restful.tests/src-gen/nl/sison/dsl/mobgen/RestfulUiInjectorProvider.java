/*
* generated by Xtext
*/
package nl.sison.dsl.mobgen;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class RestfulUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return nl.sison.dsl.mobgen.ui.internal.RestfulActivator.getInstance().getInjector("nl.sison.dsl.mobgen.Restful");
	}
	
}