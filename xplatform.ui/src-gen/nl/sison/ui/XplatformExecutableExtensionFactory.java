/*
 * generated by Xtext
 */
package nl.sison.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import nl.sison.ui.internal.XplatformActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XplatformExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XplatformActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XplatformActivator.getInstance().getInjector(XplatformActivator.NL_SISON_XPLATFORM);
	}
	
}