/*
* generated by Xtext
*/

package it.marcotinacci.xturing.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class XTuringGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Machine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAlphabetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cSymbolsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cSymbolsSymbolParserRuleCall_2_0_0 = (RuleCall)cSymbolsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cSymbolsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cSymbolsSymbolParserRuleCall_2_1_1_0 = (RuleCall)cSymbolsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStatesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStatesStateParserRuleCall_4_0 = (RuleCall)cStatesAssignment_4.eContents().get(0);
		
		//// TODO sottomacchine di turing
		//// TODO outline alfabeto
		//// TODO error un solo stato begin
		//// TODO warning tutti i simboli dell'alfabeto previsti
		//// TODO error message on terminate
		//Machine:
		//	"alphabet" "{" (symbols+=Symbol ("," symbols+=Symbol)*)? "}" states+=State+;
		public ParserRule getRule() { return rule; }

		//"alphabet" "{" (symbols+=Symbol ("," symbols+=Symbol)*)? "}" states+=State+
		public Group getGroup() { return cGroup; }

		//"alphabet"
		public Keyword getAlphabetKeyword_0() { return cAlphabetKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//(symbols+=Symbol ("," symbols+=Symbol)*)?
		public Group getGroup_2() { return cGroup_2; }

		//symbols+=Symbol
		public Assignment getSymbolsAssignment_2_0() { return cSymbolsAssignment_2_0; }

		//Symbol
		public RuleCall getSymbolsSymbolParserRuleCall_2_0_0() { return cSymbolsSymbolParserRuleCall_2_0_0; }

		//("," symbols+=Symbol)*
		public Group getGroup_2_1() { return cGroup_2_1; }

		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }

		//symbols+=Symbol
		public Assignment getSymbolsAssignment_2_1_1() { return cSymbolsAssignment_2_1_1; }

		//Symbol
		public RuleCall getSymbolsSymbolParserRuleCall_2_1_1_0() { return cSymbolsSymbolParserRuleCall_2_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }

		//states+=State+
		public Assignment getStatesAssignment_4() { return cStatesAssignment_4; }

		//State
		public RuleCall getStatesStateParserRuleCall_4_0() { return cStatesStateParserRuleCall_4_0; }
	}

	public class SymbolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Symbol");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameSYMBOL_IDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Symbol:
		//	name=SYMBOL_ID;
		public ParserRule getRule() { return rule; }

		//name=SYMBOL_ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//SYMBOL_ID
		public RuleCall getNameSYMBOL_IDTerminalRuleCall_0() { return cNameSYMBOL_IDTerminalRuleCall_0; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cBeginStateAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cBeginStateBeginKeyword_0_0 = (Keyword)cBeginStateAssignment_0.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTransactionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTransactionsTransactionParserRuleCall_4_0 = (RuleCall)cTransactionsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//State:
		//	beginState?="begin"? "state" name=ID "{" transactions+=Transaction* "}";
		public ParserRule getRule() { return rule; }

		//beginState?="begin"? "state" name=ID "{" transactions+=Transaction* "}"
		public Group getGroup() { return cGroup; }

		//beginState?="begin"?
		public Assignment getBeginStateAssignment_0() { return cBeginStateAssignment_0; }

		//"begin"
		public Keyword getBeginStateBeginKeyword_0_0() { return cBeginStateBeginKeyword_0_0; }

		//"state"
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//transactions+=Transaction*
		public Assignment getTransactionsAssignment_4() { return cTransactionsAssignment_4; }

		//Transaction
		public RuleCall getTransactionsTransactionParserRuleCall_4_0() { return cTransactionsTransactionParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class TransactionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transaction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransactionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cReadingAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cReadingReadKeyword_1_0_0 = (Keyword)cReadingAssignment_1_0.eContents().get(0);
		private final Assignment cReadAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cReadReadWriteSymbolParserRuleCall_1_1_0 = (RuleCall)cReadAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cWritingAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final Keyword cWritingWriteKeyword_2_0_0 = (Keyword)cWritingAssignment_2_0.eContents().get(0);
		private final Assignment cWriteAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cWriteReadWriteSymbolParserRuleCall_2_1_0 = (RuleCall)cWriteAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cMovingAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final Keyword cMovingMoveKeyword_3_0_0 = (Keyword)cMovingAssignment_3_0.eContents().get(0);
		private final Alternatives cAlternatives_3_1 = (Alternatives)cGroup_3.eContents().get(1);
		private final Assignment cMoveAssignment_3_1_0 = (Assignment)cAlternatives_3_1.eContents().get(0);
		private final Keyword cMoveRightKeyword_3_1_0_0 = (Keyword)cMoveAssignment_3_1_0.eContents().get(0);
		private final Assignment cMoveAssignment_3_1_1 = (Assignment)cAlternatives_3_1.eContents().get(1);
		private final Keyword cMoveLeftKeyword_3_1_1_0 = (Keyword)cMoveAssignment_3_1_1.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cNextAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final Keyword cNextNextKeyword_4_0_0_0 = (Keyword)cNextAssignment_4_0_0.eContents().get(0);
		private final Assignment cToStateAssignment_4_0_1 = (Assignment)cGroup_4_0.eContents().get(1);
		private final CrossReference cToStateStateCrossReference_4_0_1_0 = (CrossReference)cToStateAssignment_4_0_1.eContents().get(0);
		private final RuleCall cToStateStateIDTerminalRuleCall_4_0_1_0_1 = (RuleCall)cToStateStateCrossReference_4_0_1_0.eContents().get(1);
		private final Assignment cFinalAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final Keyword cFinalTerminateKeyword_4_1_0 = (Keyword)cFinalAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Transaction:
		//	{Transaction} (reading?="read" read+=ReadWriteSymbol+)? (writing?="write" write+=ReadWriteSymbol+)? (moving?="move"
		//	(move="right" | move="left"))? (next?="next" toState=[State] | final?="terminate")? ";";
		public ParserRule getRule() { return rule; }

		//{Transaction} (reading?="read" read+=ReadWriteSymbol+)? (writing?="write" write+=ReadWriteSymbol+)? (moving?="move"
		//(move="right" | move="left"))? (next?="next" toState=[State] | final?="terminate")? ";"
		public Group getGroup() { return cGroup; }

		//{Transaction}
		public Action getTransactionAction_0() { return cTransactionAction_0; }

		//(reading?="read" read+=ReadWriteSymbol+)?
		public Group getGroup_1() { return cGroup_1; }

		//reading?="read"
		public Assignment getReadingAssignment_1_0() { return cReadingAssignment_1_0; }

		//"read"
		public Keyword getReadingReadKeyword_1_0_0() { return cReadingReadKeyword_1_0_0; }

		//read+=ReadWriteSymbol+
		public Assignment getReadAssignment_1_1() { return cReadAssignment_1_1; }

		//ReadWriteSymbol
		public RuleCall getReadReadWriteSymbolParserRuleCall_1_1_0() { return cReadReadWriteSymbolParserRuleCall_1_1_0; }

		//(writing?="write" write+=ReadWriteSymbol+)?
		public Group getGroup_2() { return cGroup_2; }

		//writing?="write"
		public Assignment getWritingAssignment_2_0() { return cWritingAssignment_2_0; }

		//"write"
		public Keyword getWritingWriteKeyword_2_0_0() { return cWritingWriteKeyword_2_0_0; }

		//write+=ReadWriteSymbol+
		public Assignment getWriteAssignment_2_1() { return cWriteAssignment_2_1; }

		//ReadWriteSymbol
		public RuleCall getWriteReadWriteSymbolParserRuleCall_2_1_0() { return cWriteReadWriteSymbolParserRuleCall_2_1_0; }

		//(moving?="move" (move="right" | move="left"))?
		public Group getGroup_3() { return cGroup_3; }

		//moving?="move"
		public Assignment getMovingAssignment_3_0() { return cMovingAssignment_3_0; }

		//"move"
		public Keyword getMovingMoveKeyword_3_0_0() { return cMovingMoveKeyword_3_0_0; }

		//move="right" | move="left"
		public Alternatives getAlternatives_3_1() { return cAlternatives_3_1; }

		//move="right"
		public Assignment getMoveAssignment_3_1_0() { return cMoveAssignment_3_1_0; }

		//"right"
		public Keyword getMoveRightKeyword_3_1_0_0() { return cMoveRightKeyword_3_1_0_0; }

		//move="left"
		public Assignment getMoveAssignment_3_1_1() { return cMoveAssignment_3_1_1; }

		//"left"
		public Keyword getMoveLeftKeyword_3_1_1_0() { return cMoveLeftKeyword_3_1_1_0; }

		//(next?="next" toState=[State] | final?="terminate")?
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//next?="next" toState=[State]
		public Group getGroup_4_0() { return cGroup_4_0; }

		//next?="next"
		public Assignment getNextAssignment_4_0_0() { return cNextAssignment_4_0_0; }

		//"next"
		public Keyword getNextNextKeyword_4_0_0_0() { return cNextNextKeyword_4_0_0_0; }

		//toState=[State]
		public Assignment getToStateAssignment_4_0_1() { return cToStateAssignment_4_0_1; }

		//[State]
		public CrossReference getToStateStateCrossReference_4_0_1_0() { return cToStateStateCrossReference_4_0_1_0; }

		//ID
		public RuleCall getToStateStateIDTerminalRuleCall_4_0_1_0_1() { return cToStateStateIDTerminalRuleCall_4_0_1_0_1; }

		//final?="terminate"
		public Assignment getFinalAssignment_4_1() { return cFinalAssignment_4_1; }

		//"terminate"
		public Keyword getFinalTerminateKeyword_4_1_0() { return cFinalTerminateKeyword_4_1_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class ReadWriteSymbolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReadWriteSymbol");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cSymbolAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final CrossReference cSymbolSymbolCrossReference_0_0 = (CrossReference)cSymbolAssignment_0.eContents().get(0);
		private final RuleCall cSymbolSymbolSYMBOL_IDTerminalRuleCall_0_0_1 = (RuleCall)cSymbolSymbolCrossReference_0_0.eContents().get(1);
		private final Assignment cEmptyAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cEmptyTildeKeyword_1_0 = (Keyword)cEmptyAssignment_1.eContents().get(0);
		
		//ReadWriteSymbol:
		//	symbol=[Symbol|SYMBOL_ID] | empty?="~";
		public ParserRule getRule() { return rule; }

		//symbol=[Symbol|SYMBOL_ID] | empty?="~"
		public Alternatives getAlternatives() { return cAlternatives; }

		//symbol=[Symbol|SYMBOL_ID]
		public Assignment getSymbolAssignment_0() { return cSymbolAssignment_0; }

		//[Symbol|SYMBOL_ID]
		public CrossReference getSymbolSymbolCrossReference_0_0() { return cSymbolSymbolCrossReference_0_0; }

		//SYMBOL_ID
		public RuleCall getSymbolSymbolSYMBOL_IDTerminalRuleCall_0_0_1() { return cSymbolSymbolSYMBOL_IDTerminalRuleCall_0_0_1; }

		//empty?="~"
		public Assignment getEmptyAssignment_1() { return cEmptyAssignment_1; }

		//"~"
		public Keyword getEmptyTildeKeyword_1_0() { return cEmptyTildeKeyword_1_0; }
	}
	
	
	private MachineElements pMachine;
	private SymbolElements pSymbol;
	private StateElements pState;
	private TransactionElements pTransaction;
	private ReadWriteSymbolElements pReadWriteSymbol;
	private TerminalRule tSYMBOL_ID;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public XTuringGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("it.marcotinacci.xturing.XTuring".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// TODO sottomacchine di turing
	//// TODO outline alfabeto
	//// TODO error un solo stato begin
	//// TODO warning tutti i simboli dell'alfabeto previsti
	//// TODO error message on terminate
	//Machine:
	//	"alphabet" "{" (symbols+=Symbol ("," symbols+=Symbol)*)? "}" states+=State+;
	public MachineElements getMachineAccess() {
		return (pMachine != null) ? pMachine : (pMachine = new MachineElements());
	}
	
	public ParserRule getMachineRule() {
		return getMachineAccess().getRule();
	}

	//Symbol:
	//	name=SYMBOL_ID;
	public SymbolElements getSymbolAccess() {
		return (pSymbol != null) ? pSymbol : (pSymbol = new SymbolElements());
	}
	
	public ParserRule getSymbolRule() {
		return getSymbolAccess().getRule();
	}

	//State:
	//	beginState?="begin"? "state" name=ID "{" transactions+=Transaction* "}";
	public StateElements getStateAccess() {
		return (pState != null) ? pState : (pState = new StateElements());
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Transaction:
	//	{Transaction} (reading?="read" read+=ReadWriteSymbol+)? (writing?="write" write+=ReadWriteSymbol+)? (moving?="move"
	//	(move="right" | move="left"))? (next?="next" toState=[State] | final?="terminate")? ";";
	public TransactionElements getTransactionAccess() {
		return (pTransaction != null) ? pTransaction : (pTransaction = new TransactionElements());
	}
	
	public ParserRule getTransactionRule() {
		return getTransactionAccess().getRule();
	}

	//ReadWriteSymbol:
	//	symbol=[Symbol|SYMBOL_ID] | empty?="~";
	public ReadWriteSymbolElements getReadWriteSymbolAccess() {
		return (pReadWriteSymbol != null) ? pReadWriteSymbol : (pReadWriteSymbol = new ReadWriteSymbolElements());
	}
	
	public ParserRule getReadWriteSymbolRule() {
		return getReadWriteSymbolAccess().getRule();
	}

	//terminal SYMBOL_ID:
	//	"a".."z" | "A".."Z" | "0".."9" | "-" | "+" | "*" | "/" | "^" | "." | "|" | "&" | "=" | "<" | ">" | "(" | ")" | "[" |
	//	"]";
	public TerminalRule getSYMBOL_IDRule() {
		return (tSYMBOL_ID != null) ? tSYMBOL_ID : (tSYMBOL_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SYMBOL_ID"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
