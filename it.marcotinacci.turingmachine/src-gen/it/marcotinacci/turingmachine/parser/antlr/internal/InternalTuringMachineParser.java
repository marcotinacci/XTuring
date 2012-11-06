package it.marcotinacci.turingmachine.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.marcotinacci.turingmachine.services.TuringMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTuringMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL_ID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'alphabet'", "'{'", "','", "'}'", "'begin'", "'state'", "'read'", "'write'", "'move'", "'right'", "'left'", "'next'", "'terminate'", "';'", "'~'"
    };
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int RULE_SYMBOL_ID=4;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalTuringMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTuringMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTuringMachineParser.tokenNames; }
    public String getGrammarFileName() { return "../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g"; }



     	private TuringMachineGrammarAccess grammarAccess;
     	
        public InternalTuringMachineParser(TokenStream input, TuringMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Machine";	
       	}
       	
       	@Override
       	protected TuringMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMachine"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:67:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:68:2: (iv_ruleMachine= ruleMachine EOF )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:69:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_ruleMachine_in_entryRuleMachine75);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:76:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'alphabet' otherlv_1= '{' ( ( (lv_symbols_2_0= ruleSymbol ) ) (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )* )? otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_symbols_2_0 = null;

        EObject lv_symbols_4_0 = null;

        EObject lv_states_6_0 = null;


         enterRule(); 
            
        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:79:28: ( (otherlv_0= 'alphabet' otherlv_1= '{' ( ( (lv_symbols_2_0= ruleSymbol ) ) (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )* )? otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ ) )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:80:1: (otherlv_0= 'alphabet' otherlv_1= '{' ( ( (lv_symbols_2_0= ruleSymbol ) ) (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )* )? otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ )
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:80:1: (otherlv_0= 'alphabet' otherlv_1= '{' ( ( (lv_symbols_2_0= ruleSymbol ) ) (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )* )? otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+ )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:80:3: otherlv_0= 'alphabet' otherlv_1= '{' ( ( (lv_symbols_2_0= ruleSymbol ) ) (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )* )? otherlv_5= '}' ( (lv_states_6_0= ruleState ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleMachine122); 

                	newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getAlphabetKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleMachine134); 

                	newLeafNode(otherlv_1, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_1());
                
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:88:1: ( ( (lv_symbols_2_0= ruleSymbol ) ) (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SYMBOL_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:88:2: ( (lv_symbols_2_0= ruleSymbol ) ) (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )*
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:88:2: ( (lv_symbols_2_0= ruleSymbol ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:89:1: (lv_symbols_2_0= ruleSymbol )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:89:1: (lv_symbols_2_0= ruleSymbol )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:90:3: lv_symbols_2_0= ruleSymbol
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getSymbolsSymbolParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSymbol_in_ruleMachine156);
                    lv_symbols_2_0=ruleSymbol();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"symbols",
                            		lv_symbols_2_0, 
                            		"Symbol");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:106:2: (otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:106:4: otherlv_3= ',' ( (lv_symbols_4_0= ruleSymbol ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleMachine169); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:110:1: ( (lv_symbols_4_0= ruleSymbol ) )
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:111:1: (lv_symbols_4_0= ruleSymbol )
                    	    {
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:111:1: (lv_symbols_4_0= ruleSymbol )
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:112:3: lv_symbols_4_0= ruleSymbol
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getSymbolsSymbolParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSymbol_in_ruleMachine190);
                    	    lv_symbols_4_0=ruleSymbol();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"symbols",
                    	            		lv_symbols_4_0, 
                    	            		"Symbol");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleMachine206); 

                	newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_3());
                
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:132:1: ( (lv_states_6_0= ruleState ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:133:1: (lv_states_6_0= ruleState )
            	    {
            	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:133:1: (lv_states_6_0= ruleState )
            	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:134:3: lv_states_6_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleMachine227);
            	    lv_states_6_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_6_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleSymbol"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:158:1: entryRuleSymbol returns [EObject current=null] : iv_ruleSymbol= ruleSymbol EOF ;
    public final EObject entryRuleSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbol = null;


        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:159:2: (iv_ruleSymbol= ruleSymbol EOF )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:160:2: iv_ruleSymbol= ruleSymbol EOF
            {
             newCompositeNode(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol264);
            iv_ruleSymbol=ruleSymbol();

            state._fsp--;

             current =iv_ruleSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol274); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:167:1: ruleSymbol returns [EObject current=null] : ( (lv_name_0_0= RULE_SYMBOL_ID ) ) ;
    public final EObject ruleSymbol() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:170:28: ( ( (lv_name_0_0= RULE_SYMBOL_ID ) ) )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:171:1: ( (lv_name_0_0= RULE_SYMBOL_ID ) )
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:171:1: ( (lv_name_0_0= RULE_SYMBOL_ID ) )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:172:1: (lv_name_0_0= RULE_SYMBOL_ID )
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:172:1: (lv_name_0_0= RULE_SYMBOL_ID )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:173:3: lv_name_0_0= RULE_SYMBOL_ID
            {
            lv_name_0_0=(Token)match(input,RULE_SYMBOL_ID,FOLLOW_RULE_SYMBOL_ID_in_ruleSymbol315); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSymbolAccess().getNameSYMBOL_IDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSymbolRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"SYMBOL_ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleState"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:197:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:198:2: (iv_ruleState= ruleState EOF )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:199:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState355);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState365); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:206:1: ruleState returns [EObject current=null] : ( ( (lv_beginState_0_0= 'begin' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transactions_4_0= ruleTransaction ) )* otherlv_5= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_beginState_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_transactions_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:209:28: ( ( ( (lv_beginState_0_0= 'begin' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transactions_4_0= ruleTransaction ) )* otherlv_5= '}' ) )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:210:1: ( ( (lv_beginState_0_0= 'begin' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transactions_4_0= ruleTransaction ) )* otherlv_5= '}' )
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:210:1: ( ( (lv_beginState_0_0= 'begin' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transactions_4_0= ruleTransaction ) )* otherlv_5= '}' )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:210:2: ( (lv_beginState_0_0= 'begin' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transactions_4_0= ruleTransaction ) )* otherlv_5= '}'
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:210:2: ( (lv_beginState_0_0= 'begin' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:211:1: (lv_beginState_0_0= 'begin' )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:211:1: (lv_beginState_0_0= 'begin' )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:212:3: lv_beginState_0_0= 'begin'
                    {
                    lv_beginState_0_0=(Token)match(input,16,FOLLOW_16_in_ruleState408); 

                            newLeafNode(lv_beginState_0_0, grammarAccess.getStateAccess().getBeginStateBeginKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(current, "beginState", true, "begin");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleState434); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:229:1: ( (lv_name_2_0= RULE_ID ) )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:230:1: (lv_name_2_0= RULE_ID )
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:230:1: (lv_name_2_0= RULE_ID )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:231:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState451); 

            			newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleState468); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:251:1: ( (lv_transactions_4_0= ruleTransaction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=20)||(LA5_0>=23 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:252:1: (lv_transactions_4_0= ruleTransaction )
            	    {
            	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:252:1: (lv_transactions_4_0= ruleTransaction )
            	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:253:3: lv_transactions_4_0= ruleTransaction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransactionsTransactionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransaction_in_ruleState489);
            	    lv_transactions_4_0=ruleTransaction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transactions",
            	            		lv_transactions_4_0, 
            	            		"Transaction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleState502); 

                	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransaction"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:281:1: entryRuleTransaction returns [EObject current=null] : iv_ruleTransaction= ruleTransaction EOF ;
    public final EObject entryRuleTransaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransaction = null;


        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:282:2: (iv_ruleTransaction= ruleTransaction EOF )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:283:2: iv_ruleTransaction= ruleTransaction EOF
            {
             newCompositeNode(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction538);
            iv_ruleTransaction=ruleTransaction();

            state._fsp--;

             current =iv_ruleTransaction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:290:1: ruleTransaction returns [EObject current=null] : ( () ( ( (lv_reading_1_0= 'read' ) ) ( (lv_read_2_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_writing_3_0= 'write' ) ) ( (lv_write_4_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_moving_5_0= 'move' ) ) ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) ) )? ( ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) ) | ( (lv_final_10_0= 'terminate' ) ) )? otherlv_11= ';' ) ;
    public final EObject ruleTransaction() throws RecognitionException {
        EObject current = null;

        Token lv_reading_1_0=null;
        Token lv_writing_3_0=null;
        Token lv_moving_5_0=null;
        Token lv_move_6_0=null;
        Token lv_move_7_0=null;
        Token lv_next_8_0=null;
        Token otherlv_9=null;
        Token lv_final_10_0=null;
        Token otherlv_11=null;
        EObject lv_read_2_0 = null;

        EObject lv_write_4_0 = null;


         enterRule(); 
            
        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:293:28: ( ( () ( ( (lv_reading_1_0= 'read' ) ) ( (lv_read_2_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_writing_3_0= 'write' ) ) ( (lv_write_4_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_moving_5_0= 'move' ) ) ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) ) )? ( ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) ) | ( (lv_final_10_0= 'terminate' ) ) )? otherlv_11= ';' ) )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:294:1: ( () ( ( (lv_reading_1_0= 'read' ) ) ( (lv_read_2_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_writing_3_0= 'write' ) ) ( (lv_write_4_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_moving_5_0= 'move' ) ) ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) ) )? ( ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) ) | ( (lv_final_10_0= 'terminate' ) ) )? otherlv_11= ';' )
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:294:1: ( () ( ( (lv_reading_1_0= 'read' ) ) ( (lv_read_2_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_writing_3_0= 'write' ) ) ( (lv_write_4_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_moving_5_0= 'move' ) ) ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) ) )? ( ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) ) | ( (lv_final_10_0= 'terminate' ) ) )? otherlv_11= ';' )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:294:2: () ( ( (lv_reading_1_0= 'read' ) ) ( (lv_read_2_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_writing_3_0= 'write' ) ) ( (lv_write_4_0= ruleReadWriteSymbol ) )+ )? ( ( (lv_moving_5_0= 'move' ) ) ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) ) )? ( ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) ) | ( (lv_final_10_0= 'terminate' ) ) )? otherlv_11= ';'
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:294:2: ()
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:295:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTransactionAccess().getTransactionAction_0(),
                        current);
                

            }

            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:300:2: ( ( (lv_reading_1_0= 'read' ) ) ( (lv_read_2_0= ruleReadWriteSymbol ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:300:3: ( (lv_reading_1_0= 'read' ) ) ( (lv_read_2_0= ruleReadWriteSymbol ) )+
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:300:3: ( (lv_reading_1_0= 'read' ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:301:1: (lv_reading_1_0= 'read' )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:301:1: (lv_reading_1_0= 'read' )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:302:3: lv_reading_1_0= 'read'
                    {
                    lv_reading_1_0=(Token)match(input,18,FOLLOW_18_in_ruleTransaction601); 

                            newLeafNode(lv_reading_1_0, grammarAccess.getTransactionAccess().getReadingReadKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(current, "reading", true, "read");
                    	    

                    }


                    }

                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:315:2: ( (lv_read_2_0= ruleReadWriteSymbol ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_SYMBOL_ID||LA6_0==26) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:316:1: (lv_read_2_0= ruleReadWriteSymbol )
                    	    {
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:316:1: (lv_read_2_0= ruleReadWriteSymbol )
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:317:3: lv_read_2_0= ruleReadWriteSymbol
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransactionAccess().getReadReadWriteSymbolParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReadWriteSymbol_in_ruleTransaction635);
                    	    lv_read_2_0=ruleReadWriteSymbol();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"read",
                    	            		lv_read_2_0, 
                    	            		"ReadWriteSymbol");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:333:5: ( ( (lv_writing_3_0= 'write' ) ) ( (lv_write_4_0= ruleReadWriteSymbol ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:333:6: ( (lv_writing_3_0= 'write' ) ) ( (lv_write_4_0= ruleReadWriteSymbol ) )+
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:333:6: ( (lv_writing_3_0= 'write' ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:334:1: (lv_writing_3_0= 'write' )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:334:1: (lv_writing_3_0= 'write' )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:335:3: lv_writing_3_0= 'write'
                    {
                    lv_writing_3_0=(Token)match(input,19,FOLLOW_19_in_ruleTransaction657); 

                            newLeafNode(lv_writing_3_0, grammarAccess.getTransactionAccess().getWritingWriteKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(current, "writing", true, "write");
                    	    

                    }


                    }

                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:348:2: ( (lv_write_4_0= ruleReadWriteSymbol ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_SYMBOL_ID||LA8_0==26) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:349:1: (lv_write_4_0= ruleReadWriteSymbol )
                    	    {
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:349:1: (lv_write_4_0= ruleReadWriteSymbol )
                    	    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:350:3: lv_write_4_0= ruleReadWriteSymbol
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTransactionAccess().getWriteReadWriteSymbolParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleReadWriteSymbol_in_ruleTransaction691);
                    	    lv_write_4_0=ruleReadWriteSymbol();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTransactionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"write",
                    	            		lv_write_4_0, 
                    	            		"ReadWriteSymbol");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:366:5: ( ( (lv_moving_5_0= 'move' ) ) ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:366:6: ( (lv_moving_5_0= 'move' ) ) ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:366:6: ( (lv_moving_5_0= 'move' ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:367:1: (lv_moving_5_0= 'move' )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:367:1: (lv_moving_5_0= 'move' )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:368:3: lv_moving_5_0= 'move'
                    {
                    lv_moving_5_0=(Token)match(input,20,FOLLOW_20_in_ruleTransaction713); 

                            newLeafNode(lv_moving_5_0, grammarAccess.getTransactionAccess().getMovingMoveKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(current, "moving", true, "move");
                    	    

                    }


                    }

                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:381:2: ( ( (lv_move_6_0= 'right' ) ) | ( (lv_move_7_0= 'left' ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==22) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:381:3: ( (lv_move_6_0= 'right' ) )
                            {
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:381:3: ( (lv_move_6_0= 'right' ) )
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:382:1: (lv_move_6_0= 'right' )
                            {
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:382:1: (lv_move_6_0= 'right' )
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:383:3: lv_move_6_0= 'right'
                            {
                            lv_move_6_0=(Token)match(input,21,FOLLOW_21_in_ruleTransaction745); 

                                    newLeafNode(lv_move_6_0, grammarAccess.getTransactionAccess().getMoveRightKeyword_3_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTransactionRule());
                            	        }
                                   		setWithLastConsumed(current, "move", lv_move_6_0, "right");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:397:6: ( (lv_move_7_0= 'left' ) )
                            {
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:397:6: ( (lv_move_7_0= 'left' ) )
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:398:1: (lv_move_7_0= 'left' )
                            {
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:398:1: (lv_move_7_0= 'left' )
                            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:399:3: lv_move_7_0= 'left'
                            {
                            lv_move_7_0=(Token)match(input,22,FOLLOW_22_in_ruleTransaction782); 

                                    newLeafNode(lv_move_7_0, grammarAccess.getTransactionAccess().getMoveLeftKeyword_3_1_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTransactionRule());
                            	        }
                                   		setWithLastConsumed(current, "move", lv_move_7_0, "left");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:412:5: ( ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) ) | ( (lv_final_10_0= 'terminate' ) ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:412:6: ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:412:6: ( ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:412:7: ( (lv_next_8_0= 'next' ) ) ( (otherlv_9= RULE_ID ) )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:412:7: ( (lv_next_8_0= 'next' ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:413:1: (lv_next_8_0= 'next' )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:413:1: (lv_next_8_0= 'next' )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:414:3: lv_next_8_0= 'next'
                    {
                    lv_next_8_0=(Token)match(input,23,FOLLOW_23_in_ruleTransaction818); 

                            newLeafNode(lv_next_8_0, grammarAccess.getTransactionAccess().getNextNextKeyword_4_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(current, "next", true, "next");
                    	    

                    }


                    }

                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:427:2: ( (otherlv_9= RULE_ID ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:428:1: (otherlv_9= RULE_ID )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:428:1: (otherlv_9= RULE_ID )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:429:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransaction851); 

                    		newLeafNode(otherlv_9, grammarAccess.getTransactionAccess().getToStateStateCrossReference_4_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:441:6: ( (lv_final_10_0= 'terminate' ) )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:441:6: ( (lv_final_10_0= 'terminate' ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:442:1: (lv_final_10_0= 'terminate' )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:442:1: (lv_final_10_0= 'terminate' )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:443:3: lv_final_10_0= 'terminate'
                    {
                    lv_final_10_0=(Token)match(input,24,FOLLOW_24_in_ruleTransaction876); 

                            newLeafNode(lv_final_10_0, grammarAccess.getTransactionAccess().getFinalTerminateKeyword_4_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransactionRule());
                    	        }
                           		setWithLastConsumed(current, "final", true, "terminate");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleTransaction903); 

                	newLeafNode(otherlv_11, grammarAccess.getTransactionAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleReadWriteSymbol"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:468:1: entryRuleReadWriteSymbol returns [EObject current=null] : iv_ruleReadWriteSymbol= ruleReadWriteSymbol EOF ;
    public final EObject entryRuleReadWriteSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadWriteSymbol = null;


        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:469:2: (iv_ruleReadWriteSymbol= ruleReadWriteSymbol EOF )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:470:2: iv_ruleReadWriteSymbol= ruleReadWriteSymbol EOF
            {
             newCompositeNode(grammarAccess.getReadWriteSymbolRule()); 
            pushFollow(FOLLOW_ruleReadWriteSymbol_in_entryRuleReadWriteSymbol939);
            iv_ruleReadWriteSymbol=ruleReadWriteSymbol();

            state._fsp--;

             current =iv_ruleReadWriteSymbol; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadWriteSymbol949); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadWriteSymbol"


    // $ANTLR start "ruleReadWriteSymbol"
    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:477:1: ruleReadWriteSymbol returns [EObject current=null] : ( ( (otherlv_0= RULE_SYMBOL_ID ) ) | ( (lv_empty_1_0= '~' ) ) ) ;
    public final EObject ruleReadWriteSymbol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_empty_1_0=null;

         enterRule(); 
            
        try {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:480:28: ( ( ( (otherlv_0= RULE_SYMBOL_ID ) ) | ( (lv_empty_1_0= '~' ) ) ) )
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:481:1: ( ( (otherlv_0= RULE_SYMBOL_ID ) ) | ( (lv_empty_1_0= '~' ) ) )
            {
            // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:481:1: ( ( (otherlv_0= RULE_SYMBOL_ID ) ) | ( (lv_empty_1_0= '~' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_SYMBOL_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:481:2: ( (otherlv_0= RULE_SYMBOL_ID ) )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:481:2: ( (otherlv_0= RULE_SYMBOL_ID ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:482:1: (otherlv_0= RULE_SYMBOL_ID )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:482:1: (otherlv_0= RULE_SYMBOL_ID )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:483:3: otherlv_0= RULE_SYMBOL_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getReadWriteSymbolRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_SYMBOL_ID,FOLLOW_RULE_SYMBOL_ID_in_ruleReadWriteSymbol994); 

                    		newLeafNode(otherlv_0, grammarAccess.getReadWriteSymbolAccess().getSymbolSymbolCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:495:6: ( (lv_empty_1_0= '~' ) )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:495:6: ( (lv_empty_1_0= '~' ) )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:496:1: (lv_empty_1_0= '~' )
                    {
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:496:1: (lv_empty_1_0= '~' )
                    // ../it.marcotinacci.turingmachine/src-gen/it/marcotinacci/turingmachine/parser/antlr/internal/InternalTuringMachine.g:497:3: lv_empty_1_0= '~'
                    {
                    lv_empty_1_0=(Token)match(input,26,FOLLOW_26_in_ruleReadWriteSymbol1018); 

                            newLeafNode(lv_empty_1_0, grammarAccess.getReadWriteSymbolAccess().getEmptyTildeKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReadWriteSymbolRule());
                    	        }
                           		setWithLastConsumed(current, "empty", true, "~");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadWriteSymbol"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMachine85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleMachine122 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMachine134 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleSymbol_in_ruleMachine156 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleMachine169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSymbol_in_ruleMachine190 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleMachine206 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleState_in_ruleMachine227 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_ID_in_ruleSymbol315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleState408 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleState434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState451 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState468 = new BitSet(new long[]{0x00000000039C8000L});
    public static final BitSet FOLLOW_ruleTransaction_in_ruleState489 = new BitSet(new long[]{0x00000000039C8000L});
    public static final BitSet FOLLOW_15_in_ruleState502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTransaction601 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleReadWriteSymbol_in_ruleTransaction635 = new BitSet(new long[]{0x0000000007980010L});
    public static final BitSet FOLLOW_19_in_ruleTransaction657 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_ruleReadWriteSymbol_in_ruleTransaction691 = new BitSet(new long[]{0x0000000007900010L});
    public static final BitSet FOLLOW_20_in_ruleTransaction713 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleTransaction745 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_22_in_ruleTransaction782 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_ruleTransaction818 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransaction851 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24_in_ruleTransaction876 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransaction903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadWriteSymbol_in_entryRuleReadWriteSymbol939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadWriteSymbol949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_ID_in_ruleReadWriteSymbol994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleReadWriteSymbol1018 = new BitSet(new long[]{0x0000000000000002L});

}