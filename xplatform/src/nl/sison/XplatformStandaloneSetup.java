
package nl.sison;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XplatformStandaloneSetup extends XplatformStandaloneSetupGenerated{

	public static void doSetup() {
		new XplatformStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

