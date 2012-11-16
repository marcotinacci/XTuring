package it.marcotinacci.xturing.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import it.marcotinacci.xturing.services.XTuringGrammarAccess;
import it.marcotinacci.xturing.xTuring.Machine;
import it.marcotinacci.xturing.xTuring.ReadWriteSymbol;
import it.marcotinacci.xturing.xTuring.State;
import it.marcotinacci.xturing.xTuring.Symbol;
import it.marcotinacci.xturing.xTuring.Transaction;
import it.marcotinacci.xturing.xTuring.XTuringPackage;
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
public class XTuringSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XTuringGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XTuringPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XTuringPackage.MACHINE:
				if(context == grammarAccess.getMachineRule()) {
					sequence_Machine(context, (Machine) semanticObject); 
					return; 
				}
				else break;
			case XTuringPackage.READ_WRITE_SYMBOL:
				if(context == grammarAccess.getReadWriteSymbolRule()) {
					sequence_ReadWriteSymbol(context, (ReadWriteSymbol) semanticObject); 
					return; 
				}
				else break;
			case XTuringPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case XTuringPackage.SYMBOL:
				if(context == grammarAccess.getSymbolRule()) {
					sequence_Symbol(context, (Symbol) semanticObject); 
					return; 
				}
				else break;
			case XTuringPackage.TRANSACTION:
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
			if(transientValues.isValueTransient(semanticObject, XTuringPackage.Literals.SYMBOL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XTuringPackage.Literals.SYMBOL__NAME));
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
