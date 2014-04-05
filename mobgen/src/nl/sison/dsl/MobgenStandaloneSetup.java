
package nl.sison.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MobgenStandaloneSetup extends MobgenStandaloneSetupGenerated{

	public static void doSetup() {
		new MobgenStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

