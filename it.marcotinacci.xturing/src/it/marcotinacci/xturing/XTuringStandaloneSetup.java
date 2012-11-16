
package it.marcotinacci.xturing;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class XTuringStandaloneSetup extends XTuringStandaloneSetupGenerated{

	public static void doSetup() {
		new XTuringStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

