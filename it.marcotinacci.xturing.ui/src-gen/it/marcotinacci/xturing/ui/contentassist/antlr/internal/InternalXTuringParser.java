package it.marcotinacci.xturing.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import it.marcotinacci.xturing.services.XTuringGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXTuringParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SYMBOL_ID", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'alphabet'", "'{'", "'}'", "','", "'state'", "';'", "'begin'", "'read'", "'write'", "'move'", "'right'", "'left'", "'next'", "'terminate'", "'~'"
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


        public InternalXTuringParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXTuringParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXTuringParser.tokenNames; }
    public String getGrammarFileName() { return "../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g"; }


     
     	private XTuringGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(XTuringGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMachine"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:60:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:61:1: ( ruleMachine EOF )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:62:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_ruleMachine_in_entryRuleMachine61);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMachine68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:69:1: ruleMachine : ( ( rule__Machine__Group__0 ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:73:2: ( ( ( rule__Machine__Group__0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:74:1: ( ( rule__Machine__Group__0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:74:1: ( ( rule__Machine__Group__0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:75:1: ( rule__Machine__Group__0 )
            {
             before(grammarAccess.getMachineAccess().getGroup()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:76:1: ( rule__Machine__Group__0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:76:2: rule__Machine__Group__0
            {
            pushFollow(FOLLOW_rule__Machine__Group__0_in_ruleMachine94);
            rule__Machine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleSymbol"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:88:1: entryRuleSymbol : ruleSymbol EOF ;
    public final void entryRuleSymbol() throws RecognitionException {
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:89:1: ( ruleSymbol EOF )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:90:1: ruleSymbol EOF
            {
             before(grammarAccess.getSymbolRule()); 
            pushFollow(FOLLOW_ruleSymbol_in_entryRuleSymbol121);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getSymbolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbol128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbol"


    // $ANTLR start "ruleSymbol"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:97:1: ruleSymbol : ( ( rule__Symbol__NameAssignment ) ) ;
    public final void ruleSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:101:2: ( ( ( rule__Symbol__NameAssignment ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:102:1: ( ( rule__Symbol__NameAssignment ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:102:1: ( ( rule__Symbol__NameAssignment ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:103:1: ( rule__Symbol__NameAssignment )
            {
             before(grammarAccess.getSymbolAccess().getNameAssignment()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:104:1: ( rule__Symbol__NameAssignment )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:104:2: rule__Symbol__NameAssignment
            {
            pushFollow(FOLLOW_rule__Symbol__NameAssignment_in_ruleSymbol154);
            rule__Symbol__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSymbolAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbol"


    // $ANTLR start "entryRuleState"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:116:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:117:1: ( ruleState EOF )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:118:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState181);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:125:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:129:2: ( ( ( rule__State__Group__0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:130:1: ( ( rule__State__Group__0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:130:1: ( ( rule__State__Group__0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:131:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:132:1: ( rule__State__Group__0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:132:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState214);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransaction"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:144:1: entryRuleTransaction : ruleTransaction EOF ;
    public final void entryRuleTransaction() throws RecognitionException {
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:145:1: ( ruleTransaction EOF )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:146:1: ruleTransaction EOF
            {
             before(grammarAccess.getTransactionRule()); 
            pushFollow(FOLLOW_ruleTransaction_in_entryRuleTransaction241);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getTransactionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransaction248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransaction"


    // $ANTLR start "ruleTransaction"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:153:1: ruleTransaction : ( ( rule__Transaction__Group__0 ) ) ;
    public final void ruleTransaction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:157:2: ( ( ( rule__Transaction__Group__0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:158:1: ( ( rule__Transaction__Group__0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:158:1: ( ( rule__Transaction__Group__0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:159:1: ( rule__Transaction__Group__0 )
            {
             before(grammarAccess.getTransactionAccess().getGroup()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:160:1: ( rule__Transaction__Group__0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:160:2: rule__Transaction__Group__0
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0_in_ruleTransaction274);
            rule__Transaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransaction"


    // $ANTLR start "entryRuleReadWriteSymbol"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:172:1: entryRuleReadWriteSymbol : ruleReadWriteSymbol EOF ;
    public final void entryRuleReadWriteSymbol() throws RecognitionException {
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:173:1: ( ruleReadWriteSymbol EOF )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:174:1: ruleReadWriteSymbol EOF
            {
             before(grammarAccess.getReadWriteSymbolRule()); 
            pushFollow(FOLLOW_ruleReadWriteSymbol_in_entryRuleReadWriteSymbol301);
            ruleReadWriteSymbol();

            state._fsp--;

             after(grammarAccess.getReadWriteSymbolRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadWriteSymbol308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReadWriteSymbol"


    // $ANTLR start "ruleReadWriteSymbol"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:181:1: ruleReadWriteSymbol : ( ( rule__ReadWriteSymbol__Alternatives ) ) ;
    public final void ruleReadWriteSymbol() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:185:2: ( ( ( rule__ReadWriteSymbol__Alternatives ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:186:1: ( ( rule__ReadWriteSymbol__Alternatives ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:186:1: ( ( rule__ReadWriteSymbol__Alternatives ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:187:1: ( rule__ReadWriteSymbol__Alternatives )
            {
             before(grammarAccess.getReadWriteSymbolAccess().getAlternatives()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:188:1: ( rule__ReadWriteSymbol__Alternatives )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:188:2: rule__ReadWriteSymbol__Alternatives
            {
            pushFollow(FOLLOW_rule__ReadWriteSymbol__Alternatives_in_ruleReadWriteSymbol334);
            rule__ReadWriteSymbol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReadWriteSymbolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReadWriteSymbol"


    // $ANTLR start "rule__Transaction__Alternatives_3_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:200:1: rule__Transaction__Alternatives_3_1 : ( ( ( rule__Transaction__MoveAssignment_3_1_0 ) ) | ( ( rule__Transaction__MoveAssignment_3_1_1 ) ) );
    public final void rule__Transaction__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:204:1: ( ( ( rule__Transaction__MoveAssignment_3_1_0 ) ) | ( ( rule__Transaction__MoveAssignment_3_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:205:1: ( ( rule__Transaction__MoveAssignment_3_1_0 ) )
                    {
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:205:1: ( ( rule__Transaction__MoveAssignment_3_1_0 ) )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:206:1: ( rule__Transaction__MoveAssignment_3_1_0 )
                    {
                     before(grammarAccess.getTransactionAccess().getMoveAssignment_3_1_0()); 
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:207:1: ( rule__Transaction__MoveAssignment_3_1_0 )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:207:2: rule__Transaction__MoveAssignment_3_1_0
                    {
                    pushFollow(FOLLOW_rule__Transaction__MoveAssignment_3_1_0_in_rule__Transaction__Alternatives_3_1370);
                    rule__Transaction__MoveAssignment_3_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getMoveAssignment_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:211:6: ( ( rule__Transaction__MoveAssignment_3_1_1 ) )
                    {
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:211:6: ( ( rule__Transaction__MoveAssignment_3_1_1 ) )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:212:1: ( rule__Transaction__MoveAssignment_3_1_1 )
                    {
                     before(grammarAccess.getTransactionAccess().getMoveAssignment_3_1_1()); 
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:213:1: ( rule__Transaction__MoveAssignment_3_1_1 )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:213:2: rule__Transaction__MoveAssignment_3_1_1
                    {
                    pushFollow(FOLLOW_rule__Transaction__MoveAssignment_3_1_1_in_rule__Transaction__Alternatives_3_1388);
                    rule__Transaction__MoveAssignment_3_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getMoveAssignment_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Alternatives_3_1"


    // $ANTLR start "rule__Transaction__Alternatives_4"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:222:1: rule__Transaction__Alternatives_4 : ( ( ( rule__Transaction__Group_4_0__0 ) ) | ( ( rule__Transaction__FinalAssignment_4_1 ) ) );
    public final void rule__Transaction__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:226:1: ( ( ( rule__Transaction__Group_4_0__0 ) ) | ( ( rule__Transaction__FinalAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:227:1: ( ( rule__Transaction__Group_4_0__0 ) )
                    {
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:227:1: ( ( rule__Transaction__Group_4_0__0 ) )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:228:1: ( rule__Transaction__Group_4_0__0 )
                    {
                     before(grammarAccess.getTransactionAccess().getGroup_4_0()); 
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:229:1: ( rule__Transaction__Group_4_0__0 )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:229:2: rule__Transaction__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_4_0__0_in_rule__Transaction__Alternatives_4421);
                    rule__Transaction__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:233:6: ( ( rule__Transaction__FinalAssignment_4_1 ) )
                    {
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:233:6: ( ( rule__Transaction__FinalAssignment_4_1 ) )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:234:1: ( rule__Transaction__FinalAssignment_4_1 )
                    {
                     before(grammarAccess.getTransactionAccess().getFinalAssignment_4_1()); 
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:235:1: ( rule__Transaction__FinalAssignment_4_1 )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:235:2: rule__Transaction__FinalAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Transaction__FinalAssignment_4_1_in_rule__Transaction__Alternatives_4439);
                    rule__Transaction__FinalAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransactionAccess().getFinalAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Alternatives_4"


    // $ANTLR start "rule__ReadWriteSymbol__Alternatives"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:244:1: rule__ReadWriteSymbol__Alternatives : ( ( ( rule__ReadWriteSymbol__SymbolAssignment_0 ) ) | ( ( rule__ReadWriteSymbol__EmptyAssignment_1 ) ) );
    public final void rule__ReadWriteSymbol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:248:1: ( ( ( rule__ReadWriteSymbol__SymbolAssignment_0 ) ) | ( ( rule__ReadWriteSymbol__EmptyAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SYMBOL_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:249:1: ( ( rule__ReadWriteSymbol__SymbolAssignment_0 ) )
                    {
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:249:1: ( ( rule__ReadWriteSymbol__SymbolAssignment_0 ) )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:250:1: ( rule__ReadWriteSymbol__SymbolAssignment_0 )
                    {
                     before(grammarAccess.getReadWriteSymbolAccess().getSymbolAssignment_0()); 
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:251:1: ( rule__ReadWriteSymbol__SymbolAssignment_0 )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:251:2: rule__ReadWriteSymbol__SymbolAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ReadWriteSymbol__SymbolAssignment_0_in_rule__ReadWriteSymbol__Alternatives472);
                    rule__ReadWriteSymbol__SymbolAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getReadWriteSymbolAccess().getSymbolAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:255:6: ( ( rule__ReadWriteSymbol__EmptyAssignment_1 ) )
                    {
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:255:6: ( ( rule__ReadWriteSymbol__EmptyAssignment_1 ) )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:256:1: ( rule__ReadWriteSymbol__EmptyAssignment_1 )
                    {
                     before(grammarAccess.getReadWriteSymbolAccess().getEmptyAssignment_1()); 
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:257:1: ( rule__ReadWriteSymbol__EmptyAssignment_1 )
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:257:2: rule__ReadWriteSymbol__EmptyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ReadWriteSymbol__EmptyAssignment_1_in_rule__ReadWriteSymbol__Alternatives490);
                    rule__ReadWriteSymbol__EmptyAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getReadWriteSymbolAccess().getEmptyAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadWriteSymbol__Alternatives"


    // $ANTLR start "rule__Machine__Group__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:268:1: rule__Machine__Group__0 : rule__Machine__Group__0__Impl rule__Machine__Group__1 ;
    public final void rule__Machine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:272:1: ( rule__Machine__Group__0__Impl rule__Machine__Group__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:273:2: rule__Machine__Group__0__Impl rule__Machine__Group__1
            {
            pushFollow(FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0521);
            rule__Machine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0524);
            rule__Machine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0"


    // $ANTLR start "rule__Machine__Group__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:280:1: rule__Machine__Group__0__Impl : ( 'alphabet' ) ;
    public final void rule__Machine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:284:1: ( ( 'alphabet' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:285:1: ( 'alphabet' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:285:1: ( 'alphabet' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:286:1: 'alphabet'
            {
             before(grammarAccess.getMachineAccess().getAlphabetKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Machine__Group__0__Impl552); 
             after(grammarAccess.getMachineAccess().getAlphabetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__0__Impl"


    // $ANTLR start "rule__Machine__Group__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:299:1: rule__Machine__Group__1 : rule__Machine__Group__1__Impl rule__Machine__Group__2 ;
    public final void rule__Machine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:303:1: ( rule__Machine__Group__1__Impl rule__Machine__Group__2 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:304:2: rule__Machine__Group__1__Impl rule__Machine__Group__2
            {
            pushFollow(FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1583);
            rule__Machine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1586);
            rule__Machine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1"


    // $ANTLR start "rule__Machine__Group__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:311:1: rule__Machine__Group__1__Impl : ( '{' ) ;
    public final void rule__Machine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:315:1: ( ( '{' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:316:1: ( '{' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:316:1: ( '{' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:317:1: '{'
            {
             before(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Machine__Group__1__Impl614); 
             after(grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__1__Impl"


    // $ANTLR start "rule__Machine__Group__2"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:330:1: rule__Machine__Group__2 : rule__Machine__Group__2__Impl rule__Machine__Group__3 ;
    public final void rule__Machine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:334:1: ( rule__Machine__Group__2__Impl rule__Machine__Group__3 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:335:2: rule__Machine__Group__2__Impl rule__Machine__Group__3
            {
            pushFollow(FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2645);
            rule__Machine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2648);
            rule__Machine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2"


    // $ANTLR start "rule__Machine__Group__2__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:342:1: rule__Machine__Group__2__Impl : ( ( rule__Machine__Group_2__0 )? ) ;
    public final void rule__Machine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:346:1: ( ( ( rule__Machine__Group_2__0 )? ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:347:1: ( ( rule__Machine__Group_2__0 )? )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:347:1: ( ( rule__Machine__Group_2__0 )? )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:348:1: ( rule__Machine__Group_2__0 )?
            {
             before(grammarAccess.getMachineAccess().getGroup_2()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:349:1: ( rule__Machine__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SYMBOL_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:349:2: rule__Machine__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Machine__Group_2__0_in_rule__Machine__Group__2__Impl675);
                    rule__Machine__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMachineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__2__Impl"


    // $ANTLR start "rule__Machine__Group__3"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:359:1: rule__Machine__Group__3 : rule__Machine__Group__3__Impl rule__Machine__Group__4 ;
    public final void rule__Machine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:363:1: ( rule__Machine__Group__3__Impl rule__Machine__Group__4 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:364:2: rule__Machine__Group__3__Impl rule__Machine__Group__4
            {
            pushFollow(FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__3706);
            rule__Machine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__3709);
            rule__Machine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3"


    // $ANTLR start "rule__Machine__Group__3__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:371:1: rule__Machine__Group__3__Impl : ( '}' ) ;
    public final void rule__Machine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:375:1: ( ( '}' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:376:1: ( '}' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:376:1: ( '}' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:377:1: '}'
            {
             before(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Machine__Group__3__Impl737); 
             after(grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__3__Impl"


    // $ANTLR start "rule__Machine__Group__4"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:390:1: rule__Machine__Group__4 : rule__Machine__Group__4__Impl ;
    public final void rule__Machine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:394:1: ( rule__Machine__Group__4__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:395:2: rule__Machine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__4768);
            rule__Machine__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4"


    // $ANTLR start "rule__Machine__Group__4__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:401:1: rule__Machine__Group__4__Impl : ( ( ( rule__Machine__StatesAssignment_4 ) ) ( ( rule__Machine__StatesAssignment_4 )* ) ) ;
    public final void rule__Machine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:405:1: ( ( ( ( rule__Machine__StatesAssignment_4 ) ) ( ( rule__Machine__StatesAssignment_4 )* ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:406:1: ( ( ( rule__Machine__StatesAssignment_4 ) ) ( ( rule__Machine__StatesAssignment_4 )* ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:406:1: ( ( ( rule__Machine__StatesAssignment_4 ) ) ( ( rule__Machine__StatesAssignment_4 )* ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:407:1: ( ( rule__Machine__StatesAssignment_4 ) ) ( ( rule__Machine__StatesAssignment_4 )* )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:407:1: ( ( rule__Machine__StatesAssignment_4 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:408:1: ( rule__Machine__StatesAssignment_4 )
            {
             before(grammarAccess.getMachineAccess().getStatesAssignment_4()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:409:1: ( rule__Machine__StatesAssignment_4 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:409:2: rule__Machine__StatesAssignment_4
            {
            pushFollow(FOLLOW_rule__Machine__StatesAssignment_4_in_rule__Machine__Group__4__Impl797);
            rule__Machine__StatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getStatesAssignment_4()); 

            }

            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:412:1: ( ( rule__Machine__StatesAssignment_4 )* )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:413:1: ( rule__Machine__StatesAssignment_4 )*
            {
             before(grammarAccess.getMachineAccess().getStatesAssignment_4()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:414:1: ( rule__Machine__StatesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:414:2: rule__Machine__StatesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Machine__StatesAssignment_4_in_rule__Machine__Group__4__Impl809);
            	    rule__Machine__StatesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getStatesAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group__4__Impl"


    // $ANTLR start "rule__Machine__Group_2__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:435:1: rule__Machine__Group_2__0 : rule__Machine__Group_2__0__Impl rule__Machine__Group_2__1 ;
    public final void rule__Machine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:439:1: ( rule__Machine__Group_2__0__Impl rule__Machine__Group_2__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:440:2: rule__Machine__Group_2__0__Impl rule__Machine__Group_2__1
            {
            pushFollow(FOLLOW_rule__Machine__Group_2__0__Impl_in_rule__Machine__Group_2__0852);
            rule__Machine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Machine__Group_2__1_in_rule__Machine__Group_2__0855);
            rule__Machine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__0"


    // $ANTLR start "rule__Machine__Group_2__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:447:1: rule__Machine__Group_2__0__Impl : ( ( rule__Machine__SymbolsAssignment_2_0 ) ) ;
    public final void rule__Machine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:451:1: ( ( ( rule__Machine__SymbolsAssignment_2_0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:452:1: ( ( rule__Machine__SymbolsAssignment_2_0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:452:1: ( ( rule__Machine__SymbolsAssignment_2_0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:453:1: ( rule__Machine__SymbolsAssignment_2_0 )
            {
             before(grammarAccess.getMachineAccess().getSymbolsAssignment_2_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:454:1: ( rule__Machine__SymbolsAssignment_2_0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:454:2: rule__Machine__SymbolsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Machine__SymbolsAssignment_2_0_in_rule__Machine__Group_2__0__Impl882);
            rule__Machine__SymbolsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSymbolsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__0__Impl"


    // $ANTLR start "rule__Machine__Group_2__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:464:1: rule__Machine__Group_2__1 : rule__Machine__Group_2__1__Impl ;
    public final void rule__Machine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:468:1: ( rule__Machine__Group_2__1__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:469:2: rule__Machine__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Machine__Group_2__1__Impl_in_rule__Machine__Group_2__1912);
            rule__Machine__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__1"


    // $ANTLR start "rule__Machine__Group_2__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:475:1: rule__Machine__Group_2__1__Impl : ( ( rule__Machine__Group_2_1__0 )* ) ;
    public final void rule__Machine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:479:1: ( ( ( rule__Machine__Group_2_1__0 )* ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:480:1: ( ( rule__Machine__Group_2_1__0 )* )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:480:1: ( ( rule__Machine__Group_2_1__0 )* )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:481:1: ( rule__Machine__Group_2_1__0 )*
            {
             before(grammarAccess.getMachineAccess().getGroup_2_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:482:1: ( rule__Machine__Group_2_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:482:2: rule__Machine__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Machine__Group_2_1__0_in_rule__Machine__Group_2__1__Impl939);
            	    rule__Machine__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2__1__Impl"


    // $ANTLR start "rule__Machine__Group_2_1__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:496:1: rule__Machine__Group_2_1__0 : rule__Machine__Group_2_1__0__Impl rule__Machine__Group_2_1__1 ;
    public final void rule__Machine__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:500:1: ( rule__Machine__Group_2_1__0__Impl rule__Machine__Group_2_1__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:501:2: rule__Machine__Group_2_1__0__Impl rule__Machine__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Machine__Group_2_1__0__Impl_in_rule__Machine__Group_2_1__0974);
            rule__Machine__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Machine__Group_2_1__1_in_rule__Machine__Group_2_1__0977);
            rule__Machine__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2_1__0"


    // $ANTLR start "rule__Machine__Group_2_1__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:508:1: rule__Machine__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Machine__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:512:1: ( ( ',' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:513:1: ( ',' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:513:1: ( ',' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:514:1: ','
            {
             before(grammarAccess.getMachineAccess().getCommaKeyword_2_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Machine__Group_2_1__0__Impl1005); 
             after(grammarAccess.getMachineAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2_1__0__Impl"


    // $ANTLR start "rule__Machine__Group_2_1__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:527:1: rule__Machine__Group_2_1__1 : rule__Machine__Group_2_1__1__Impl ;
    public final void rule__Machine__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:531:1: ( rule__Machine__Group_2_1__1__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:532:2: rule__Machine__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Machine__Group_2_1__1__Impl_in_rule__Machine__Group_2_1__11036);
            rule__Machine__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2_1__1"


    // $ANTLR start "rule__Machine__Group_2_1__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:538:1: rule__Machine__Group_2_1__1__Impl : ( ( rule__Machine__SymbolsAssignment_2_1_1 ) ) ;
    public final void rule__Machine__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:542:1: ( ( ( rule__Machine__SymbolsAssignment_2_1_1 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:543:1: ( ( rule__Machine__SymbolsAssignment_2_1_1 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:543:1: ( ( rule__Machine__SymbolsAssignment_2_1_1 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:544:1: ( rule__Machine__SymbolsAssignment_2_1_1 )
            {
             before(grammarAccess.getMachineAccess().getSymbolsAssignment_2_1_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:545:1: ( rule__Machine__SymbolsAssignment_2_1_1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:545:2: rule__Machine__SymbolsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Machine__SymbolsAssignment_2_1_1_in_rule__Machine__Group_2_1__1__Impl1063);
            rule__Machine__SymbolsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getSymbolsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__Group_2_1__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:559:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:563:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:564:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01097);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01100);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:571:1: rule__State__Group__0__Impl : ( ( rule__State__BeginStateAssignment_0 )? ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:575:1: ( ( ( rule__State__BeginStateAssignment_0 )? ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:576:1: ( ( rule__State__BeginStateAssignment_0 )? )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:576:1: ( ( rule__State__BeginStateAssignment_0 )? )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:577:1: ( rule__State__BeginStateAssignment_0 )?
            {
             before(grammarAccess.getStateAccess().getBeginStateAssignment_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:578:1: ( rule__State__BeginStateAssignment_0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:578:2: rule__State__BeginStateAssignment_0
                    {
                    pushFollow(FOLLOW_rule__State__BeginStateAssignment_0_in_rule__State__Group__0__Impl1127);
                    rule__State__BeginStateAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getBeginStateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:588:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:592:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:593:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11158);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11161);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:600:1: rule__State__Group__1__Impl : ( 'state' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:604:1: ( ( 'state' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:605:1: ( 'state' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:605:1: ( 'state' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:606:1: 'state'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__State__Group__1__Impl1189); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:619:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:623:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:624:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21220);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21223);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:631:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:635:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:636:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:636:1: ( ( rule__State__NameAssignment_2 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:637:1: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:638:1: ( rule__State__NameAssignment_2 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:638:2: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl1250);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:648:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:652:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:653:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31280);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31283);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:660:1: rule__State__Group__3__Impl : ( '{' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:664:1: ( ( '{' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:665:1: ( '{' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:665:1: ( '{' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:666:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__State__Group__3__Impl1311); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:679:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:683:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:684:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__41342);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__41345);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:691:1: rule__State__Group__4__Impl : ( ( rule__State__TransactionsAssignment_4 )* ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:695:1: ( ( ( rule__State__TransactionsAssignment_4 )* ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:696:1: ( ( rule__State__TransactionsAssignment_4 )* )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:696:1: ( ( rule__State__TransactionsAssignment_4 )* )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:697:1: ( rule__State__TransactionsAssignment_4 )*
            {
             before(grammarAccess.getStateAccess().getTransactionsAssignment_4()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:698:1: ( rule__State__TransactionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||(LA8_0>=19 && LA8_0<=21)||(LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:698:2: rule__State__TransactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__State__TransactionsAssignment_4_in_rule__State__Group__4__Impl1372);
            	    rule__State__TransactionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransactionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:708:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:712:1: ( rule__State__Group__5__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:713:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__51403);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:719:1: rule__State__Group__5__Impl : ( '}' ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:723:1: ( ( '}' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:724:1: ( '}' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:724:1: ( '}' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:725:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__State__Group__5__Impl1431); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__Transaction__Group__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:750:1: rule__Transaction__Group__0 : rule__Transaction__Group__0__Impl rule__Transaction__Group__1 ;
    public final void rule__Transaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:754:1: ( rule__Transaction__Group__0__Impl rule__Transaction__Group__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:755:2: rule__Transaction__Group__0__Impl rule__Transaction__Group__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__01474);
            rule__Transaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__01477);
            rule__Transaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0"


    // $ANTLR start "rule__Transaction__Group__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:762:1: rule__Transaction__Group__0__Impl : ( () ) ;
    public final void rule__Transaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:766:1: ( ( () ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:767:1: ( () )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:767:1: ( () )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:768:1: ()
            {
             before(grammarAccess.getTransactionAccess().getTransactionAction_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:769:1: ()
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:771:1: 
            {
            }

             after(grammarAccess.getTransactionAccess().getTransactionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__0__Impl"


    // $ANTLR start "rule__Transaction__Group__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:781:1: rule__Transaction__Group__1 : rule__Transaction__Group__1__Impl rule__Transaction__Group__2 ;
    public final void rule__Transaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:785:1: ( rule__Transaction__Group__1__Impl rule__Transaction__Group__2 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:786:2: rule__Transaction__Group__1__Impl rule__Transaction__Group__2
            {
            pushFollow(FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__11535);
            rule__Transaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__11538);
            rule__Transaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1"


    // $ANTLR start "rule__Transaction__Group__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:793:1: rule__Transaction__Group__1__Impl : ( ( rule__Transaction__Group_1__0 )? ) ;
    public final void rule__Transaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:797:1: ( ( ( rule__Transaction__Group_1__0 )? ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:798:1: ( ( rule__Transaction__Group_1__0 )? )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:798:1: ( ( rule__Transaction__Group_1__0 )? )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:799:1: ( rule__Transaction__Group_1__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:800:1: ( rule__Transaction__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:800:2: rule__Transaction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Group__1__Impl1565);
                    rule__Transaction__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__1__Impl"


    // $ANTLR start "rule__Transaction__Group__2"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:810:1: rule__Transaction__Group__2 : rule__Transaction__Group__2__Impl rule__Transaction__Group__3 ;
    public final void rule__Transaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:814:1: ( rule__Transaction__Group__2__Impl rule__Transaction__Group__3 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:815:2: rule__Transaction__Group__2__Impl rule__Transaction__Group__3
            {
            pushFollow(FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__21596);
            rule__Transaction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__21599);
            rule__Transaction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2"


    // $ANTLR start "rule__Transaction__Group__2__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:822:1: rule__Transaction__Group__2__Impl : ( ( rule__Transaction__Group_2__0 )? ) ;
    public final void rule__Transaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:826:1: ( ( ( rule__Transaction__Group_2__0 )? ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:827:1: ( ( rule__Transaction__Group_2__0 )? )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:827:1: ( ( rule__Transaction__Group_2__0 )? )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:828:1: ( rule__Transaction__Group_2__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_2()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:829:1: ( rule__Transaction__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:829:2: rule__Transaction__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_2__0_in_rule__Transaction__Group__2__Impl1626);
                    rule__Transaction__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__2__Impl"


    // $ANTLR start "rule__Transaction__Group__3"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:839:1: rule__Transaction__Group__3 : rule__Transaction__Group__3__Impl rule__Transaction__Group__4 ;
    public final void rule__Transaction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:843:1: ( rule__Transaction__Group__3__Impl rule__Transaction__Group__4 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:844:2: rule__Transaction__Group__3__Impl rule__Transaction__Group__4
            {
            pushFollow(FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__31657);
            rule__Transaction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__31660);
            rule__Transaction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3"


    // $ANTLR start "rule__Transaction__Group__3__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:851:1: rule__Transaction__Group__3__Impl : ( ( rule__Transaction__Group_3__0 )? ) ;
    public final void rule__Transaction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:855:1: ( ( ( rule__Transaction__Group_3__0 )? ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:856:1: ( ( rule__Transaction__Group_3__0 )? )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:856:1: ( ( rule__Transaction__Group_3__0 )? )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:857:1: ( rule__Transaction__Group_3__0 )?
            {
             before(grammarAccess.getTransactionAccess().getGroup_3()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:858:1: ( rule__Transaction__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:858:2: rule__Transaction__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Transaction__Group_3__0_in_rule__Transaction__Group__3__Impl1687);
                    rule__Transaction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__3__Impl"


    // $ANTLR start "rule__Transaction__Group__4"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:868:1: rule__Transaction__Group__4 : rule__Transaction__Group__4__Impl rule__Transaction__Group__5 ;
    public final void rule__Transaction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:872:1: ( rule__Transaction__Group__4__Impl rule__Transaction__Group__5 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:873:2: rule__Transaction__Group__4__Impl rule__Transaction__Group__5
            {
            pushFollow(FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__41718);
            rule__Transaction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__41721);
            rule__Transaction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4"


    // $ANTLR start "rule__Transaction__Group__4__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:880:1: rule__Transaction__Group__4__Impl : ( ( rule__Transaction__Alternatives_4 )? ) ;
    public final void rule__Transaction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:884:1: ( ( ( rule__Transaction__Alternatives_4 )? ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:885:1: ( ( rule__Transaction__Alternatives_4 )? )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:885:1: ( ( rule__Transaction__Alternatives_4 )? )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:886:1: ( rule__Transaction__Alternatives_4 )?
            {
             before(grammarAccess.getTransactionAccess().getAlternatives_4()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:887:1: ( rule__Transaction__Alternatives_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:887:2: rule__Transaction__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__Transaction__Alternatives_4_in_rule__Transaction__Group__4__Impl1748);
                    rule__Transaction__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransactionAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__4__Impl"


    // $ANTLR start "rule__Transaction__Group__5"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:897:1: rule__Transaction__Group__5 : rule__Transaction__Group__5__Impl ;
    public final void rule__Transaction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:901:1: ( rule__Transaction__Group__5__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:902:2: rule__Transaction__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__51779);
            rule__Transaction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5"


    // $ANTLR start "rule__Transaction__Group__5__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:908:1: rule__Transaction__Group__5__Impl : ( ';' ) ;
    public final void rule__Transaction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:912:1: ( ( ';' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:913:1: ( ';' )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:913:1: ( ';' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:914:1: ';'
            {
             before(grammarAccess.getTransactionAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__Transaction__Group__5__Impl1807); 
             after(grammarAccess.getTransactionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group__5__Impl"


    // $ANTLR start "rule__Transaction__Group_1__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:939:1: rule__Transaction__Group_1__0 : rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 ;
    public final void rule__Transaction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:943:1: ( rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:944:2: rule__Transaction__Group_1__0__Impl rule__Transaction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__01850);
            rule__Transaction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__01853);
            rule__Transaction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__0"


    // $ANTLR start "rule__Transaction__Group_1__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:951:1: rule__Transaction__Group_1__0__Impl : ( ( rule__Transaction__ReadingAssignment_1_0 ) ) ;
    public final void rule__Transaction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:955:1: ( ( ( rule__Transaction__ReadingAssignment_1_0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:956:1: ( ( rule__Transaction__ReadingAssignment_1_0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:956:1: ( ( rule__Transaction__ReadingAssignment_1_0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:957:1: ( rule__Transaction__ReadingAssignment_1_0 )
            {
             before(grammarAccess.getTransactionAccess().getReadingAssignment_1_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:958:1: ( rule__Transaction__ReadingAssignment_1_0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:958:2: rule__Transaction__ReadingAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Transaction__ReadingAssignment_1_0_in_rule__Transaction__Group_1__0__Impl1880);
            rule__Transaction__ReadingAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getReadingAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__0__Impl"


    // $ANTLR start "rule__Transaction__Group_1__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:968:1: rule__Transaction__Group_1__1 : rule__Transaction__Group_1__1__Impl ;
    public final void rule__Transaction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:972:1: ( rule__Transaction__Group_1__1__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:973:2: rule__Transaction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__11910);
            rule__Transaction__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__1"


    // $ANTLR start "rule__Transaction__Group_1__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:979:1: rule__Transaction__Group_1__1__Impl : ( ( ( rule__Transaction__ReadAssignment_1_1 ) ) ( ( rule__Transaction__ReadAssignment_1_1 )* ) ) ;
    public final void rule__Transaction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:983:1: ( ( ( ( rule__Transaction__ReadAssignment_1_1 ) ) ( ( rule__Transaction__ReadAssignment_1_1 )* ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:984:1: ( ( ( rule__Transaction__ReadAssignment_1_1 ) ) ( ( rule__Transaction__ReadAssignment_1_1 )* ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:984:1: ( ( ( rule__Transaction__ReadAssignment_1_1 ) ) ( ( rule__Transaction__ReadAssignment_1_1 )* ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:985:1: ( ( rule__Transaction__ReadAssignment_1_1 ) ) ( ( rule__Transaction__ReadAssignment_1_1 )* )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:985:1: ( ( rule__Transaction__ReadAssignment_1_1 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:986:1: ( rule__Transaction__ReadAssignment_1_1 )
            {
             before(grammarAccess.getTransactionAccess().getReadAssignment_1_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:987:1: ( rule__Transaction__ReadAssignment_1_1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:987:2: rule__Transaction__ReadAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Transaction__ReadAssignment_1_1_in_rule__Transaction__Group_1__1__Impl1939);
            rule__Transaction__ReadAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getReadAssignment_1_1()); 

            }

            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:990:1: ( ( rule__Transaction__ReadAssignment_1_1 )* )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:991:1: ( rule__Transaction__ReadAssignment_1_1 )*
            {
             before(grammarAccess.getTransactionAccess().getReadAssignment_1_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:992:1: ( rule__Transaction__ReadAssignment_1_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SYMBOL_ID||LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:992:2: rule__Transaction__ReadAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__ReadAssignment_1_1_in_rule__Transaction__Group_1__1__Impl1951);
            	    rule__Transaction__ReadAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getReadAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_1__1__Impl"


    // $ANTLR start "rule__Transaction__Group_2__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1007:1: rule__Transaction__Group_2__0 : rule__Transaction__Group_2__0__Impl rule__Transaction__Group_2__1 ;
    public final void rule__Transaction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1011:1: ( rule__Transaction__Group_2__0__Impl rule__Transaction__Group_2__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1012:2: rule__Transaction__Group_2__0__Impl rule__Transaction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_2__0__Impl_in_rule__Transaction__Group_2__01988);
            rule__Transaction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_2__1_in_rule__Transaction__Group_2__01991);
            rule__Transaction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__0"


    // $ANTLR start "rule__Transaction__Group_2__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1019:1: rule__Transaction__Group_2__0__Impl : ( ( rule__Transaction__WritingAssignment_2_0 ) ) ;
    public final void rule__Transaction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1023:1: ( ( ( rule__Transaction__WritingAssignment_2_0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1024:1: ( ( rule__Transaction__WritingAssignment_2_0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1024:1: ( ( rule__Transaction__WritingAssignment_2_0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1025:1: ( rule__Transaction__WritingAssignment_2_0 )
            {
             before(grammarAccess.getTransactionAccess().getWritingAssignment_2_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1026:1: ( rule__Transaction__WritingAssignment_2_0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1026:2: rule__Transaction__WritingAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Transaction__WritingAssignment_2_0_in_rule__Transaction__Group_2__0__Impl2018);
            rule__Transaction__WritingAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getWritingAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__0__Impl"


    // $ANTLR start "rule__Transaction__Group_2__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1036:1: rule__Transaction__Group_2__1 : rule__Transaction__Group_2__1__Impl ;
    public final void rule__Transaction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1040:1: ( rule__Transaction__Group_2__1__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1041:2: rule__Transaction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_2__1__Impl_in_rule__Transaction__Group_2__12048);
            rule__Transaction__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__1"


    // $ANTLR start "rule__Transaction__Group_2__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1047:1: rule__Transaction__Group_2__1__Impl : ( ( ( rule__Transaction__WriteAssignment_2_1 ) ) ( ( rule__Transaction__WriteAssignment_2_1 )* ) ) ;
    public final void rule__Transaction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1051:1: ( ( ( ( rule__Transaction__WriteAssignment_2_1 ) ) ( ( rule__Transaction__WriteAssignment_2_1 )* ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1052:1: ( ( ( rule__Transaction__WriteAssignment_2_1 ) ) ( ( rule__Transaction__WriteAssignment_2_1 )* ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1052:1: ( ( ( rule__Transaction__WriteAssignment_2_1 ) ) ( ( rule__Transaction__WriteAssignment_2_1 )* ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1053:1: ( ( rule__Transaction__WriteAssignment_2_1 ) ) ( ( rule__Transaction__WriteAssignment_2_1 )* )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1053:1: ( ( rule__Transaction__WriteAssignment_2_1 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1054:1: ( rule__Transaction__WriteAssignment_2_1 )
            {
             before(grammarAccess.getTransactionAccess().getWriteAssignment_2_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1055:1: ( rule__Transaction__WriteAssignment_2_1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1055:2: rule__Transaction__WriteAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Transaction__WriteAssignment_2_1_in_rule__Transaction__Group_2__1__Impl2077);
            rule__Transaction__WriteAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getWriteAssignment_2_1()); 

            }

            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1058:1: ( ( rule__Transaction__WriteAssignment_2_1 )* )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1059:1: ( rule__Transaction__WriteAssignment_2_1 )*
            {
             before(grammarAccess.getTransactionAccess().getWriteAssignment_2_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1060:1: ( rule__Transaction__WriteAssignment_2_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SYMBOL_ID||LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1060:2: rule__Transaction__WriteAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Transaction__WriteAssignment_2_1_in_rule__Transaction__Group_2__1__Impl2089);
            	    rule__Transaction__WriteAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTransactionAccess().getWriteAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_2__1__Impl"


    // $ANTLR start "rule__Transaction__Group_3__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1075:1: rule__Transaction__Group_3__0 : rule__Transaction__Group_3__0__Impl rule__Transaction__Group_3__1 ;
    public final void rule__Transaction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1079:1: ( rule__Transaction__Group_3__0__Impl rule__Transaction__Group_3__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1080:2: rule__Transaction__Group_3__0__Impl rule__Transaction__Group_3__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_3__0__Impl_in_rule__Transaction__Group_3__02126);
            rule__Transaction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_3__1_in_rule__Transaction__Group_3__02129);
            rule__Transaction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__0"


    // $ANTLR start "rule__Transaction__Group_3__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1087:1: rule__Transaction__Group_3__0__Impl : ( ( rule__Transaction__MovingAssignment_3_0 ) ) ;
    public final void rule__Transaction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1091:1: ( ( ( rule__Transaction__MovingAssignment_3_0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1092:1: ( ( rule__Transaction__MovingAssignment_3_0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1092:1: ( ( rule__Transaction__MovingAssignment_3_0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1093:1: ( rule__Transaction__MovingAssignment_3_0 )
            {
             before(grammarAccess.getTransactionAccess().getMovingAssignment_3_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1094:1: ( rule__Transaction__MovingAssignment_3_0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1094:2: rule__Transaction__MovingAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Transaction__MovingAssignment_3_0_in_rule__Transaction__Group_3__0__Impl2156);
            rule__Transaction__MovingAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getMovingAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__0__Impl"


    // $ANTLR start "rule__Transaction__Group_3__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1104:1: rule__Transaction__Group_3__1 : rule__Transaction__Group_3__1__Impl ;
    public final void rule__Transaction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1108:1: ( rule__Transaction__Group_3__1__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1109:2: rule__Transaction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_3__1__Impl_in_rule__Transaction__Group_3__12186);
            rule__Transaction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__1"


    // $ANTLR start "rule__Transaction__Group_3__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1115:1: rule__Transaction__Group_3__1__Impl : ( ( rule__Transaction__Alternatives_3_1 ) ) ;
    public final void rule__Transaction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1119:1: ( ( ( rule__Transaction__Alternatives_3_1 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1120:1: ( ( rule__Transaction__Alternatives_3_1 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1120:1: ( ( rule__Transaction__Alternatives_3_1 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1121:1: ( rule__Transaction__Alternatives_3_1 )
            {
             before(grammarAccess.getTransactionAccess().getAlternatives_3_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1122:1: ( rule__Transaction__Alternatives_3_1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1122:2: rule__Transaction__Alternatives_3_1
            {
            pushFollow(FOLLOW_rule__Transaction__Alternatives_3_1_in_rule__Transaction__Group_3__1__Impl2213);
            rule__Transaction__Alternatives_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_3__1__Impl"


    // $ANTLR start "rule__Transaction__Group_4_0__0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1136:1: rule__Transaction__Group_4_0__0 : rule__Transaction__Group_4_0__0__Impl rule__Transaction__Group_4_0__1 ;
    public final void rule__Transaction__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1140:1: ( rule__Transaction__Group_4_0__0__Impl rule__Transaction__Group_4_0__1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1141:2: rule__Transaction__Group_4_0__0__Impl rule__Transaction__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Transaction__Group_4_0__0__Impl_in_rule__Transaction__Group_4_0__02247);
            rule__Transaction__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transaction__Group_4_0__1_in_rule__Transaction__Group_4_0__02250);
            rule__Transaction__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_4_0__0"


    // $ANTLR start "rule__Transaction__Group_4_0__0__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1148:1: rule__Transaction__Group_4_0__0__Impl : ( ( rule__Transaction__NextAssignment_4_0_0 ) ) ;
    public final void rule__Transaction__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1152:1: ( ( ( rule__Transaction__NextAssignment_4_0_0 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1153:1: ( ( rule__Transaction__NextAssignment_4_0_0 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1153:1: ( ( rule__Transaction__NextAssignment_4_0_0 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1154:1: ( rule__Transaction__NextAssignment_4_0_0 )
            {
             before(grammarAccess.getTransactionAccess().getNextAssignment_4_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1155:1: ( rule__Transaction__NextAssignment_4_0_0 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1155:2: rule__Transaction__NextAssignment_4_0_0
            {
            pushFollow(FOLLOW_rule__Transaction__NextAssignment_4_0_0_in_rule__Transaction__Group_4_0__0__Impl2277);
            rule__Transaction__NextAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getNextAssignment_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_4_0__0__Impl"


    // $ANTLR start "rule__Transaction__Group_4_0__1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1165:1: rule__Transaction__Group_4_0__1 : rule__Transaction__Group_4_0__1__Impl ;
    public final void rule__Transaction__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1169:1: ( rule__Transaction__Group_4_0__1__Impl )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1170:2: rule__Transaction__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Transaction__Group_4_0__1__Impl_in_rule__Transaction__Group_4_0__12307);
            rule__Transaction__Group_4_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_4_0__1"


    // $ANTLR start "rule__Transaction__Group_4_0__1__Impl"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1176:1: rule__Transaction__Group_4_0__1__Impl : ( ( rule__Transaction__ToStateAssignment_4_0_1 ) ) ;
    public final void rule__Transaction__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1180:1: ( ( ( rule__Transaction__ToStateAssignment_4_0_1 ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1181:1: ( ( rule__Transaction__ToStateAssignment_4_0_1 ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1181:1: ( ( rule__Transaction__ToStateAssignment_4_0_1 ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1182:1: ( rule__Transaction__ToStateAssignment_4_0_1 )
            {
             before(grammarAccess.getTransactionAccess().getToStateAssignment_4_0_1()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1183:1: ( rule__Transaction__ToStateAssignment_4_0_1 )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1183:2: rule__Transaction__ToStateAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__Transaction__ToStateAssignment_4_0_1_in_rule__Transaction__Group_4_0__1__Impl2334);
            rule__Transaction__ToStateAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTransactionAccess().getToStateAssignment_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__Group_4_0__1__Impl"


    // $ANTLR start "rule__Machine__SymbolsAssignment_2_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1198:1: rule__Machine__SymbolsAssignment_2_0 : ( ruleSymbol ) ;
    public final void rule__Machine__SymbolsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1202:1: ( ( ruleSymbol ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1203:1: ( ruleSymbol )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1203:1: ( ruleSymbol )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1204:1: ruleSymbol
            {
             before(grammarAccess.getMachineAccess().getSymbolsSymbolParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleSymbol_in_rule__Machine__SymbolsAssignment_2_02373);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getSymbolsSymbolParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SymbolsAssignment_2_0"


    // $ANTLR start "rule__Machine__SymbolsAssignment_2_1_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1213:1: rule__Machine__SymbolsAssignment_2_1_1 : ( ruleSymbol ) ;
    public final void rule__Machine__SymbolsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1217:1: ( ( ruleSymbol ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1218:1: ( ruleSymbol )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1218:1: ( ruleSymbol )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1219:1: ruleSymbol
            {
             before(grammarAccess.getMachineAccess().getSymbolsSymbolParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSymbol_in_rule__Machine__SymbolsAssignment_2_1_12404);
            ruleSymbol();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getSymbolsSymbolParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__SymbolsAssignment_2_1_1"


    // $ANTLR start "rule__Machine__StatesAssignment_4"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1228:1: rule__Machine__StatesAssignment_4 : ( ruleState ) ;
    public final void rule__Machine__StatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1232:1: ( ( ruleState ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1233:1: ( ruleState )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1233:1: ( ruleState )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1234:1: ruleState
            {
             before(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Machine__StatesAssignment_42435);
            ruleState();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine__StatesAssignment_4"


    // $ANTLR start "rule__Symbol__NameAssignment"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1243:1: rule__Symbol__NameAssignment : ( RULE_SYMBOL_ID ) ;
    public final void rule__Symbol__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1247:1: ( ( RULE_SYMBOL_ID ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1248:1: ( RULE_SYMBOL_ID )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1248:1: ( RULE_SYMBOL_ID )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1249:1: RULE_SYMBOL_ID
            {
             before(grammarAccess.getSymbolAccess().getNameSYMBOL_IDTerminalRuleCall_0()); 
            match(input,RULE_SYMBOL_ID,FOLLOW_RULE_SYMBOL_ID_in_rule__Symbol__NameAssignment2466); 
             after(grammarAccess.getSymbolAccess().getNameSYMBOL_IDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symbol__NameAssignment"


    // $ANTLR start "rule__State__BeginStateAssignment_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1258:1: rule__State__BeginStateAssignment_0 : ( ( 'begin' ) ) ;
    public final void rule__State__BeginStateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1262:1: ( ( ( 'begin' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1263:1: ( ( 'begin' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1263:1: ( ( 'begin' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1264:1: ( 'begin' )
            {
             before(grammarAccess.getStateAccess().getBeginStateBeginKeyword_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1265:1: ( 'begin' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1266:1: 'begin'
            {
             before(grammarAccess.getStateAccess().getBeginStateBeginKeyword_0_0()); 
            match(input,18,FOLLOW_18_in_rule__State__BeginStateAssignment_02502); 
             after(grammarAccess.getStateAccess().getBeginStateBeginKeyword_0_0()); 

            }

             after(grammarAccess.getStateAccess().getBeginStateBeginKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__BeginStateAssignment_0"


    // $ANTLR start "rule__State__NameAssignment_2"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1281:1: rule__State__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1285:1: ( ( RULE_ID ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1286:1: ( RULE_ID )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1286:1: ( RULE_ID )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1287:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_22541); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"


    // $ANTLR start "rule__State__TransactionsAssignment_4"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1296:1: rule__State__TransactionsAssignment_4 : ( ruleTransaction ) ;
    public final void rule__State__TransactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1300:1: ( ( ruleTransaction ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1301:1: ( ruleTransaction )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1301:1: ( ruleTransaction )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1302:1: ruleTransaction
            {
             before(grammarAccess.getStateAccess().getTransactionsTransactionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTransaction_in_rule__State__TransactionsAssignment_42572);
            ruleTransaction();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransactionsTransactionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TransactionsAssignment_4"


    // $ANTLR start "rule__Transaction__ReadingAssignment_1_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1311:1: rule__Transaction__ReadingAssignment_1_0 : ( ( 'read' ) ) ;
    public final void rule__Transaction__ReadingAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1315:1: ( ( ( 'read' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1316:1: ( ( 'read' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1316:1: ( ( 'read' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1317:1: ( 'read' )
            {
             before(grammarAccess.getTransactionAccess().getReadingReadKeyword_1_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1318:1: ( 'read' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1319:1: 'read'
            {
             before(grammarAccess.getTransactionAccess().getReadingReadKeyword_1_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Transaction__ReadingAssignment_1_02608); 
             after(grammarAccess.getTransactionAccess().getReadingReadKeyword_1_0_0()); 

            }

             after(grammarAccess.getTransactionAccess().getReadingReadKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__ReadingAssignment_1_0"


    // $ANTLR start "rule__Transaction__ReadAssignment_1_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1334:1: rule__Transaction__ReadAssignment_1_1 : ( ruleReadWriteSymbol ) ;
    public final void rule__Transaction__ReadAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1338:1: ( ( ruleReadWriteSymbol ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1339:1: ( ruleReadWriteSymbol )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1339:1: ( ruleReadWriteSymbol )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1340:1: ruleReadWriteSymbol
            {
             before(grammarAccess.getTransactionAccess().getReadReadWriteSymbolParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleReadWriteSymbol_in_rule__Transaction__ReadAssignment_1_12647);
            ruleReadWriteSymbol();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getReadReadWriteSymbolParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__ReadAssignment_1_1"


    // $ANTLR start "rule__Transaction__WritingAssignment_2_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1349:1: rule__Transaction__WritingAssignment_2_0 : ( ( 'write' ) ) ;
    public final void rule__Transaction__WritingAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1353:1: ( ( ( 'write' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1354:1: ( ( 'write' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1354:1: ( ( 'write' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1355:1: ( 'write' )
            {
             before(grammarAccess.getTransactionAccess().getWritingWriteKeyword_2_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1356:1: ( 'write' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1357:1: 'write'
            {
             before(grammarAccess.getTransactionAccess().getWritingWriteKeyword_2_0_0()); 
            match(input,20,FOLLOW_20_in_rule__Transaction__WritingAssignment_2_02683); 
             after(grammarAccess.getTransactionAccess().getWritingWriteKeyword_2_0_0()); 

            }

             after(grammarAccess.getTransactionAccess().getWritingWriteKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__WritingAssignment_2_0"


    // $ANTLR start "rule__Transaction__WriteAssignment_2_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1372:1: rule__Transaction__WriteAssignment_2_1 : ( ruleReadWriteSymbol ) ;
    public final void rule__Transaction__WriteAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1376:1: ( ( ruleReadWriteSymbol ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1377:1: ( ruleReadWriteSymbol )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1377:1: ( ruleReadWriteSymbol )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1378:1: ruleReadWriteSymbol
            {
             before(grammarAccess.getTransactionAccess().getWriteReadWriteSymbolParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleReadWriteSymbol_in_rule__Transaction__WriteAssignment_2_12722);
            ruleReadWriteSymbol();

            state._fsp--;

             after(grammarAccess.getTransactionAccess().getWriteReadWriteSymbolParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__WriteAssignment_2_1"


    // $ANTLR start "rule__Transaction__MovingAssignment_3_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1387:1: rule__Transaction__MovingAssignment_3_0 : ( ( 'move' ) ) ;
    public final void rule__Transaction__MovingAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1391:1: ( ( ( 'move' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1392:1: ( ( 'move' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1392:1: ( ( 'move' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1393:1: ( 'move' )
            {
             before(grammarAccess.getTransactionAccess().getMovingMoveKeyword_3_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1394:1: ( 'move' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1395:1: 'move'
            {
             before(grammarAccess.getTransactionAccess().getMovingMoveKeyword_3_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Transaction__MovingAssignment_3_02758); 
             after(grammarAccess.getTransactionAccess().getMovingMoveKeyword_3_0_0()); 

            }

             after(grammarAccess.getTransactionAccess().getMovingMoveKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__MovingAssignment_3_0"


    // $ANTLR start "rule__Transaction__MoveAssignment_3_1_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1410:1: rule__Transaction__MoveAssignment_3_1_0 : ( ( 'right' ) ) ;
    public final void rule__Transaction__MoveAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1414:1: ( ( ( 'right' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1415:1: ( ( 'right' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1415:1: ( ( 'right' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1416:1: ( 'right' )
            {
             before(grammarAccess.getTransactionAccess().getMoveRightKeyword_3_1_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1417:1: ( 'right' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1418:1: 'right'
            {
             before(grammarAccess.getTransactionAccess().getMoveRightKeyword_3_1_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Transaction__MoveAssignment_3_1_02802); 
             after(grammarAccess.getTransactionAccess().getMoveRightKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getTransactionAccess().getMoveRightKeyword_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__MoveAssignment_3_1_0"


    // $ANTLR start "rule__Transaction__MoveAssignment_3_1_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1433:1: rule__Transaction__MoveAssignment_3_1_1 : ( ( 'left' ) ) ;
    public final void rule__Transaction__MoveAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1437:1: ( ( ( 'left' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1438:1: ( ( 'left' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1438:1: ( ( 'left' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1439:1: ( 'left' )
            {
             before(grammarAccess.getTransactionAccess().getMoveLeftKeyword_3_1_1_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1440:1: ( 'left' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1441:1: 'left'
            {
             before(grammarAccess.getTransactionAccess().getMoveLeftKeyword_3_1_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Transaction__MoveAssignment_3_1_12846); 
             after(grammarAccess.getTransactionAccess().getMoveLeftKeyword_3_1_1_0()); 

            }

             after(grammarAccess.getTransactionAccess().getMoveLeftKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__MoveAssignment_3_1_1"


    // $ANTLR start "rule__Transaction__NextAssignment_4_0_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1456:1: rule__Transaction__NextAssignment_4_0_0 : ( ( 'next' ) ) ;
    public final void rule__Transaction__NextAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1460:1: ( ( ( 'next' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1461:1: ( ( 'next' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1461:1: ( ( 'next' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1462:1: ( 'next' )
            {
             before(grammarAccess.getTransactionAccess().getNextNextKeyword_4_0_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1463:1: ( 'next' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1464:1: 'next'
            {
             before(grammarAccess.getTransactionAccess().getNextNextKeyword_4_0_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Transaction__NextAssignment_4_0_02890); 
             after(grammarAccess.getTransactionAccess().getNextNextKeyword_4_0_0_0()); 

            }

             after(grammarAccess.getTransactionAccess().getNextNextKeyword_4_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__NextAssignment_4_0_0"


    // $ANTLR start "rule__Transaction__ToStateAssignment_4_0_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1479:1: rule__Transaction__ToStateAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transaction__ToStateAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1483:1: ( ( ( RULE_ID ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1484:1: ( ( RULE_ID ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1484:1: ( ( RULE_ID ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1485:1: ( RULE_ID )
            {
             before(grammarAccess.getTransactionAccess().getToStateStateCrossReference_4_0_1_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1486:1: ( RULE_ID )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1487:1: RULE_ID
            {
             before(grammarAccess.getTransactionAccess().getToStateStateIDTerminalRuleCall_4_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transaction__ToStateAssignment_4_0_12933); 
             after(grammarAccess.getTransactionAccess().getToStateStateIDTerminalRuleCall_4_0_1_0_1()); 

            }

             after(grammarAccess.getTransactionAccess().getToStateStateCrossReference_4_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__ToStateAssignment_4_0_1"


    // $ANTLR start "rule__Transaction__FinalAssignment_4_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1498:1: rule__Transaction__FinalAssignment_4_1 : ( ( 'terminate' ) ) ;
    public final void rule__Transaction__FinalAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1502:1: ( ( ( 'terminate' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1503:1: ( ( 'terminate' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1503:1: ( ( 'terminate' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1504:1: ( 'terminate' )
            {
             before(grammarAccess.getTransactionAccess().getFinalTerminateKeyword_4_1_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1505:1: ( 'terminate' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1506:1: 'terminate'
            {
             before(grammarAccess.getTransactionAccess().getFinalTerminateKeyword_4_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Transaction__FinalAssignment_4_12973); 
             after(grammarAccess.getTransactionAccess().getFinalTerminateKeyword_4_1_0()); 

            }

             after(grammarAccess.getTransactionAccess().getFinalTerminateKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transaction__FinalAssignment_4_1"


    // $ANTLR start "rule__ReadWriteSymbol__SymbolAssignment_0"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1521:1: rule__ReadWriteSymbol__SymbolAssignment_0 : ( ( RULE_SYMBOL_ID ) ) ;
    public final void rule__ReadWriteSymbol__SymbolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1525:1: ( ( ( RULE_SYMBOL_ID ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1526:1: ( ( RULE_SYMBOL_ID ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1526:1: ( ( RULE_SYMBOL_ID ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1527:1: ( RULE_SYMBOL_ID )
            {
             before(grammarAccess.getReadWriteSymbolAccess().getSymbolSymbolCrossReference_0_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1528:1: ( RULE_SYMBOL_ID )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1529:1: RULE_SYMBOL_ID
            {
             before(grammarAccess.getReadWriteSymbolAccess().getSymbolSymbolSYMBOL_IDTerminalRuleCall_0_0_1()); 
            match(input,RULE_SYMBOL_ID,FOLLOW_RULE_SYMBOL_ID_in_rule__ReadWriteSymbol__SymbolAssignment_03016); 
             after(grammarAccess.getReadWriteSymbolAccess().getSymbolSymbolSYMBOL_IDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getReadWriteSymbolAccess().getSymbolSymbolCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadWriteSymbol__SymbolAssignment_0"


    // $ANTLR start "rule__ReadWriteSymbol__EmptyAssignment_1"
    // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1540:1: rule__ReadWriteSymbol__EmptyAssignment_1 : ( ( '~' ) ) ;
    public final void rule__ReadWriteSymbol__EmptyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1544:1: ( ( ( '~' ) ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1545:1: ( ( '~' ) )
            {
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1545:1: ( ( '~' ) )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1546:1: ( '~' )
            {
             before(grammarAccess.getReadWriteSymbolAccess().getEmptyTildeKeyword_1_0()); 
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1547:1: ( '~' )
            // ../it.marcotinacci.xturing.ui/src-gen/it/marcotinacci/xturing/ui/contentassist/antlr/internal/InternalXTuring.g:1548:1: '~'
            {
             before(grammarAccess.getReadWriteSymbolAccess().getEmptyTildeKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__ReadWriteSymbol__EmptyAssignment_13056); 
             after(grammarAccess.getReadWriteSymbolAccess().getEmptyTildeKeyword_1_0()); 

            }

             after(grammarAccess.getReadWriteSymbolAccess().getEmptyTildeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReadWriteSymbol__EmptyAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMachine68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group__0_in_ruleMachine94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_entryRuleSymbol121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbol128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Symbol__NameAssignment_in_ruleSymbol154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_entryRuleTransaction241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransaction248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0_in_ruleTransaction274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadWriteSymbol_in_entryRuleReadWriteSymbol301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadWriteSymbol308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadWriteSymbol__Alternatives_in_ruleReadWriteSymbol334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__MoveAssignment_3_1_0_in_rule__Transaction__Alternatives_3_1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__MoveAssignment_3_1_1_in_rule__Transaction__Alternatives_3_1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_4_0__0_in_rule__Transaction__Alternatives_4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__FinalAssignment_4_1_in_rule__Transaction__Alternatives_4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadWriteSymbol__SymbolAssignment_0_in_rule__ReadWriteSymbol__Alternatives472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReadWriteSymbol__EmptyAssignment_1_in_rule__ReadWriteSymbol__Alternatives490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group__0__Impl_in_rule__Machine__Group__0521 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Machine__Group__1_in_rule__Machine__Group__0524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Machine__Group__0__Impl552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group__1__Impl_in_rule__Machine__Group__1583 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Machine__Group__2_in_rule__Machine__Group__1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Machine__Group__1__Impl614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group__2__Impl_in_rule__Machine__Group__2645 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Machine__Group__3_in_rule__Machine__Group__2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group_2__0_in_rule__Machine__Group__2__Impl675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group__3__Impl_in_rule__Machine__Group__3706 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__Machine__Group__4_in_rule__Machine__Group__3709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Machine__Group__3__Impl737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group__4__Impl_in_rule__Machine__Group__4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__StatesAssignment_4_in_rule__Machine__Group__4__Impl797 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_rule__Machine__StatesAssignment_4_in_rule__Machine__Group__4__Impl809 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_rule__Machine__Group_2__0__Impl_in_rule__Machine__Group_2__0852 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Machine__Group_2__1_in_rule__Machine__Group_2__0855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__SymbolsAssignment_2_0_in_rule__Machine__Group_2__0__Impl882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group_2__1__Impl_in_rule__Machine__Group_2__1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group_2_1__0_in_rule__Machine__Group_2__1__Impl939 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Machine__Group_2_1__0__Impl_in_rule__Machine__Group_2_1__0974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Machine__Group_2_1__1_in_rule__Machine__Group_2_1__0977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Machine__Group_2_1__0__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__Group_2_1__1__Impl_in_rule__Machine__Group_2_1__11036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Machine__SymbolsAssignment_2_1_1_in_rule__Machine__Group_2_1__1__Impl1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01097 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__BeginStateAssignment_0_in_rule__State__Group__0__Impl1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group__1__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21220 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_2_in_rule__State__Group__2__Impl1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31280 = new BitSet(new long[]{0x00000000033A4000L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__State__Group__3__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__41342 = new BitSet(new long[]{0x00000000033A4000L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__41345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransactionsAssignment_4_in_rule__State__Group__4__Impl1372 = new BitSet(new long[]{0x00000000033A0002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__51403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__State__Group__5__Impl1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__0__Impl_in_rule__Transaction__Group__01474 = new BitSet(new long[]{0x00000000033A0000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1_in_rule__Transaction__Group__01477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__1__Impl_in_rule__Transaction__Group__11535 = new BitSet(new long[]{0x00000000033A0000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2_in_rule__Transaction__Group__11538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0_in_rule__Transaction__Group__1__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__2__Impl_in_rule__Transaction__Group__21596 = new BitSet(new long[]{0x00000000033A0000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3_in_rule__Transaction__Group__21599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_2__0_in_rule__Transaction__Group__2__Impl1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__3__Impl_in_rule__Transaction__Group__31657 = new BitSet(new long[]{0x00000000033A0000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4_in_rule__Transaction__Group__31660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_3__0_in_rule__Transaction__Group__3__Impl1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__4__Impl_in_rule__Transaction__Group__41718 = new BitSet(new long[]{0x00000000033A0000L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5_in_rule__Transaction__Group__41721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Alternatives_4_in_rule__Transaction__Group__4__Impl1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group__5__Impl_in_rule__Transaction__Group__51779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transaction__Group__5__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__0__Impl_in_rule__Transaction__Group_1__01850 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1_in_rule__Transaction__Group_1__01853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__ReadingAssignment_1_0_in_rule__Transaction__Group_1__0__Impl1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_1__1__Impl_in_rule__Transaction__Group_1__11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__ReadAssignment_1_1_in_rule__Transaction__Group_1__1__Impl1939 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__Transaction__ReadAssignment_1_1_in_rule__Transaction__Group_1__1__Impl1951 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__Transaction__Group_2__0__Impl_in_rule__Transaction__Group_2__01988 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Transaction__Group_2__1_in_rule__Transaction__Group_2__01991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__WritingAssignment_2_0_in_rule__Transaction__Group_2__0__Impl2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_2__1__Impl_in_rule__Transaction__Group_2__12048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__WriteAssignment_2_1_in_rule__Transaction__Group_2__1__Impl2077 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__Transaction__WriteAssignment_2_1_in_rule__Transaction__Group_2__1__Impl2089 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_rule__Transaction__Group_3__0__Impl_in_rule__Transaction__Group_3__02126 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Transaction__Group_3__1_in_rule__Transaction__Group_3__02129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__MovingAssignment_3_0_in_rule__Transaction__Group_3__0__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_3__1__Impl_in_rule__Transaction__Group_3__12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Alternatives_3_1_in_rule__Transaction__Group_3__1__Impl2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_4_0__0__Impl_in_rule__Transaction__Group_4_0__02247 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transaction__Group_4_0__1_in_rule__Transaction__Group_4_0__02250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__NextAssignment_4_0_0_in_rule__Transaction__Group_4_0__0__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__Group_4_0__1__Impl_in_rule__Transaction__Group_4_0__12307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transaction__ToStateAssignment_4_0_1_in_rule__Transaction__Group_4_0__1__Impl2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_rule__Machine__SymbolsAssignment_2_02373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbol_in_rule__Machine__SymbolsAssignment_2_1_12404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Machine__StatesAssignment_42435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_ID_in_rule__Symbol__NameAssignment2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__BeginStateAssignment_02502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_22541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransaction_in_rule__State__TransactionsAssignment_42572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Transaction__ReadingAssignment_1_02608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadWriteSymbol_in_rule__Transaction__ReadAssignment_1_12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Transaction__WritingAssignment_2_02683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadWriteSymbol_in_rule__Transaction__WriteAssignment_2_12722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Transaction__MovingAssignment_3_02758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transaction__MoveAssignment_3_1_02802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Transaction__MoveAssignment_3_1_12846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transaction__NextAssignment_4_0_02890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transaction__ToStateAssignment_4_0_12933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Transaction__FinalAssignment_4_12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOL_ID_in_rule__ReadWriteSymbol__SymbolAssignment_03016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ReadWriteSymbol__EmptyAssignment_13056 = new BitSet(new long[]{0x0000000000000002L});

}