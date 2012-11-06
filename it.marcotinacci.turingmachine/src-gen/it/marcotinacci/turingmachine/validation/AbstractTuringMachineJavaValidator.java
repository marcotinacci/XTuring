package it.marcotinacci.turingmachine.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractTuringMachineJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(it.marcotinacci.turingmachine.turingMachine.TuringMachinePackage.eINSTANCE);
		return result;
	}

}
