package it.marcotinacci.turingmachine.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import it.marcotinacci.turingmachine.services.TuringMachineGrammarAccess;
import it.marcotinacci.turingmachine.turingMachine.Machine;
import it.marcotinacci.turingmachine.turingMachine.ReadWriteSymbol;
import it.marcotinacci.turingmachine.turingMachine.State;
import it.marcotinacci.turingmachine.turingMachine.Symbol;
import it.marcotinacci.turingmachine.turingMachine.Transaction;
import it.marcotinacci.turingmachine.turingMachine.TuringMachinePackage;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TuringMachineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TuringMachineGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TuringMachinePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TuringMachinePackage.MACHINE:
				if(context == grammarAccess.getMachineRule()) {
					sequence_Machine(context, (Machine) semanticObject); 
					return; 
				}
				else break;
			case TuringMachinePackage.READ_WRITE_SYMBOL:
				if(context == grammarAccess.getReadWriteSymbolRule()) {
					sequence_ReadWriteSymbol(context, (ReadWriteSymbol) semanticObject); 
					return; 
				}
				else break;
			case TuringMachinePackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case TuringMachinePackage.SYMBOL:
				if(context == grammarAccess.getSymbolRule()) {
					sequence_Symbol(context, (Symbol) semanticObject); 
					return; 
				}
				else break;
			case TuringMachinePackage.TRANSACTION:
				if(context == grammarAccess.getTransactionRule()) {
					sequence_Transaction(context, (Transaction) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((symbols+=Symbol symbols+=Symbol*)? states+=State+)
	 */
	protected void sequence_Machine(EObject context, Machine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (symbol=[Symbol|SYMBOL_ID] | empty?='~')
	 */
	protected void sequence_ReadWriteSymbol(EObject context, ReadWriteSymbol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (beginState?='begin'? name=ID transactions+=Transaction*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=SYMBOL_ID
	 */
	protected void sequence_Symbol(EObject context, Symbol semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TuringMachinePackage.Literals.SYMBOL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TuringMachinePackage.Literals.SYMBOL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSymbolAccess().getNameSYMBOL_IDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (reading?='read' read+=ReadWriteSymbol+)? 
	 *         (writing?='write' write+=ReadWriteSymbol+)? 
	 *         (moving?='move' (move='right' | move='left'))? 
	 *         ((next?='next' toState=[State|ID]) | final?='terminate')?
	 *     )
	 */
	protected void sequence_Transaction(EObject context, Transaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
