/*
* generated by Xtext
*/
package nl.sison.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MobgenUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return nl.sison.dsl.ui.internal.MobgenActivator.getInstance().getInjector("nl.sison.dsl.Mobgen");
	}
	
}