package it.marcotinacci.turingmachine.generator;

import it.marcotinacci.turingmachine.turingMachine.Machine;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class TuringMachineGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    Machine m = ((Machine) _get);
    CharSequence _compile = this.compile(m);
    fsa.generateFile("machine.java", _compile);
  }
  
  public CharSequence compile(final Machine machine) {
    return null;
  }
}
