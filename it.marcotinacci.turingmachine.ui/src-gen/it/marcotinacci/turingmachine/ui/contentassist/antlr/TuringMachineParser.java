/*
* generated by Xtext
*/
package it.marcotinacci.turingmachine.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import it.marcotinacci.turingmachine.services.TuringMachineGrammarAccess;

public class TuringMachineParser extends AbstractContentAssistParser {
	
	@Inject
	private TuringMachineGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected it.marcotinacci.turingmachine.ui.contentassist.antlr.internal.InternalTuringMachineParser createParser() {
		it.marcotinacci.turingmachine.ui.contentassist.antlr.internal.InternalTuringMachineParser result = new it.marcotinacci.turingmachine.ui.contentassist.antlr.internal.InternalTuringMachineParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTransactionAccess().getAlternatives_3_1(), "rule__Transaction__Alternatives_3_1");
					put(grammarAccess.getTransactionAccess().getAlternatives_4(), "rule__Transaction__Alternatives_4");
					put(grammarAccess.getReadWriteSymbolAccess().getAlternatives(), "rule__ReadWriteSymbol__Alternatives");
					put(grammarAccess.getMachineAccess().getGroup(), "rule__Machine__Group__0");
					put(grammarAccess.getMachineAccess().getGroup_2(), "rule__Machine__Group_2__0");
					put(grammarAccess.getMachineAccess().getGroup_2_1(), "rule__Machine__Group_2_1__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getTransactionAccess().getGroup(), "rule__Transaction__Group__0");
					put(grammarAccess.getTransactionAccess().getGroup_1(), "rule__Transaction__Group_1__0");
					put(grammarAccess.getTransactionAccess().getGroup_2(), "rule__Transaction__Group_2__0");
					put(grammarAccess.getTransactionAccess().getGroup_3(), "rule__Transaction__Group_3__0");
					put(grammarAccess.getTransactionAccess().getGroup_4_0(), "rule__Transaction__Group_4_0__0");
					put(grammarAccess.getMachineAccess().getSymbolsAssignment_2_0(), "rule__Machine__SymbolsAssignment_2_0");
					put(grammarAccess.getMachineAccess().getSymbolsAssignment_2_1_1(), "rule__Machine__SymbolsAssignment_2_1_1");
					put(grammarAccess.getMachineAccess().getStatesAssignment_4(), "rule__Machine__StatesAssignment_4");
					put(grammarAccess.getSymbolAccess().getNameAssignment(), "rule__Symbol__NameAssignment");
					put(grammarAccess.getStateAccess().getBeginStateAssignment_0(), "rule__State__BeginStateAssignment_0");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getStateAccess().getTransactionsAssignment_4(), "rule__State__TransactionsAssignment_4");
					put(grammarAccess.getTransactionAccess().getReadingAssignment_1_0(), "rule__Transaction__ReadingAssignment_1_0");
					put(grammarAccess.getTransactionAccess().getReadAssignment_1_1(), "rule__Transaction__ReadAssignment_1_1");
					put(grammarAccess.getTransactionAccess().getWritingAssignment_2_0(), "rule__Transaction__WritingAssignment_2_0");
					put(grammarAccess.getTransactionAccess().getWriteAssignment_2_1(), "rule__Transaction__WriteAssignment_2_1");
					put(grammarAccess.getTransactionAccess().getMovingAssignment_3_0(), "rule__Transaction__MovingAssignment_3_0");
					put(grammarAccess.getTransactionAccess().getMoveAssignment_3_1_0(), "rule__Transaction__MoveAssignment_3_1_0");
					put(grammarAccess.getTransactionAccess().getMoveAssignment_3_1_1(), "rule__Transaction__MoveAssignment_3_1_1");
					put(grammarAccess.getTransactionAccess().getNextAssignment_4_0_0(), "rule__Transaction__NextAssignment_4_0_0");
					put(grammarAccess.getTransactionAccess().getToStateAssignment_4_0_1(), "rule__Transaction__ToStateAssignment_4_0_1");
					put(grammarAccess.getTransactionAccess().getFinalAssignment_4_1(), "rule__Transaction__FinalAssignment_4_1");
					put(grammarAccess.getReadWriteSymbolAccess().getSymbolAssignment_0(), "rule__ReadWriteSymbol__SymbolAssignment_0");
					put(grammarAccess.getReadWriteSymbolAccess().getEmptyAssignment_1(), "rule__ReadWriteSymbol__EmptyAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			it.marcotinacci.turingmachine.ui.contentassist.antlr.internal.InternalTuringMachineParser typedParser = (it.marcotinacci.turingmachine.ui.contentassist.antlr.internal.InternalTuringMachineParser) parser;
			typedParser.entryRuleMachine();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public TuringMachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TuringMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
