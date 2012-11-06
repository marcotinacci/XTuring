
package it.marcotinacci.turingmachine;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TuringMachineStandaloneSetup extends TuringMachineStandaloneSetupGenerated{

	public static void doSetup() {
		new TuringMachineStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

