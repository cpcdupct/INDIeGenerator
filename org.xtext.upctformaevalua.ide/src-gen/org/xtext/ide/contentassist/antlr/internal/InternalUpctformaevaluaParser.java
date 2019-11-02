package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.UpctformaevaluaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformaevaluaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'visible'", "'hole'", "'highest'", "'middle'", "'lowest'", "'Evaluation'", "'{'", "'}'", "'package'", "';'", "','", "'.'", "'EvaluationUnit'", "'numberquestions'", "'questions'", "'Question'", "'correctfeedback'", "'incorrectfeedback'", "'-'", "'Training'", "'Attempts'", "'grade'", "'Final'", "'SingleAnswer'", "'statement'", "'answers'", "'correct'", "'MultipleAnswer'", "'FillingAnswer'", "'holes'", "'TrueOrFalse'", "'assertions'", "'Hole'", "'text'", "'type'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUpctformaevaluaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUpctformaevaluaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUpctformaevaluaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUpctformaevalua.g"; }


    	private UpctformaevaluaGrammarAccess grammarAccess;

    	public void setGrammarAccess(UpctformaevaluaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEvaluation"
    // InternalUpctformaevalua.g:53:1: entryRuleEvaluation : ruleEvaluation EOF ;
    public final void entryRuleEvaluation() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:54:1: ( ruleEvaluation EOF )
            // InternalUpctformaevalua.g:55:1: ruleEvaluation EOF
            {
             before(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluation();

            state._fsp--;

             after(grammarAccess.getEvaluationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // InternalUpctformaevalua.g:62:1: ruleEvaluation : ( ( rule__Evaluation__Group__0 ) ) ;
    public final void ruleEvaluation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:66:2: ( ( ( rule__Evaluation__Group__0 ) ) )
            // InternalUpctformaevalua.g:67:2: ( ( rule__Evaluation__Group__0 ) )
            {
            // InternalUpctformaevalua.g:67:2: ( ( rule__Evaluation__Group__0 ) )
            // InternalUpctformaevalua.g:68:3: ( rule__Evaluation__Group__0 )
            {
             before(grammarAccess.getEvaluationAccess().getGroup()); 
            // InternalUpctformaevalua.g:69:3: ( rule__Evaluation__Group__0 )
            // InternalUpctformaevalua.g:69:4: rule__Evaluation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getGroup()); 

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
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctformaevalua.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:79:1: ( ruleQualifiedName EOF )
            // InternalUpctformaevalua.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUpctformaevalua.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUpctformaevalua.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUpctformaevalua.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUpctformaevalua.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUpctformaevalua.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalUpctformaevalua.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEvaluationUnit"
    // InternalUpctformaevalua.g:103:1: entryRuleEvaluationUnit : ruleEvaluationUnit EOF ;
    public final void entryRuleEvaluationUnit() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:104:1: ( ruleEvaluationUnit EOF )
            // InternalUpctformaevalua.g:105:1: ruleEvaluationUnit EOF
            {
             before(grammarAccess.getEvaluationUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluationUnit();

            state._fsp--;

             after(grammarAccess.getEvaluationUnitRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvaluationUnit"


    // $ANTLR start "ruleEvaluationUnit"
    // InternalUpctformaevalua.g:112:1: ruleEvaluationUnit : ( ( rule__EvaluationUnit__Alternatives ) ) ;
    public final void ruleEvaluationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:116:2: ( ( ( rule__EvaluationUnit__Alternatives ) ) )
            // InternalUpctformaevalua.g:117:2: ( ( rule__EvaluationUnit__Alternatives ) )
            {
            // InternalUpctformaevalua.g:117:2: ( ( rule__EvaluationUnit__Alternatives ) )
            // InternalUpctformaevalua.g:118:3: ( rule__EvaluationUnit__Alternatives )
            {
             before(grammarAccess.getEvaluationUnitAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:119:3: ( rule__EvaluationUnit__Alternatives )
            // InternalUpctformaevalua.g:119:4: rule__EvaluationUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEvaluationUnit"


    // $ANTLR start "entryRuleQuestion"
    // InternalUpctformaevalua.g:128:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:129:1: ( ruleQuestion EOF )
            // InternalUpctformaevalua.g:130:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalUpctformaevalua.g:137:1: ruleQuestion : ( ( rule__Question__Alternatives ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:141:2: ( ( ( rule__Question__Alternatives ) ) )
            // InternalUpctformaevalua.g:142:2: ( ( rule__Question__Alternatives ) )
            {
            // InternalUpctformaevalua.g:142:2: ( ( rule__Question__Alternatives ) )
            // InternalUpctformaevalua.g:143:3: ( rule__Question__Alternatives )
            {
             before(grammarAccess.getQuestionAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:144:3: ( rule__Question__Alternatives )
            // InternalUpctformaevalua.g:144:4: rule__Question__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Question__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEString"
    // InternalUpctformaevalua.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:154:1: ( ruleEString EOF )
            // InternalUpctformaevalua.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalUpctformaevalua.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUpctformaevalua.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUpctformaevalua.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalUpctformaevalua.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:169:3: ( rule__EString__Alternatives )
            // InternalUpctformaevalua.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEvaluationUnit_Impl"
    // InternalUpctformaevalua.g:178:1: entryRuleEvaluationUnit_Impl : ruleEvaluationUnit_Impl EOF ;
    public final void entryRuleEvaluationUnit_Impl() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:179:1: ( ruleEvaluationUnit_Impl EOF )
            // InternalUpctformaevalua.g:180:1: ruleEvaluationUnit_Impl EOF
            {
             before(grammarAccess.getEvaluationUnit_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleEvaluationUnit_Impl();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvaluationUnit_Impl"


    // $ANTLR start "ruleEvaluationUnit_Impl"
    // InternalUpctformaevalua.g:187:1: ruleEvaluationUnit_Impl : ( ( rule__EvaluationUnit_Impl__Group__0 ) ) ;
    public final void ruleEvaluationUnit_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:191:2: ( ( ( rule__EvaluationUnit_Impl__Group__0 ) ) )
            // InternalUpctformaevalua.g:192:2: ( ( rule__EvaluationUnit_Impl__Group__0 ) )
            {
            // InternalUpctformaevalua.g:192:2: ( ( rule__EvaluationUnit_Impl__Group__0 ) )
            // InternalUpctformaevalua.g:193:3: ( rule__EvaluationUnit_Impl__Group__0 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup()); 
            // InternalUpctformaevalua.g:194:3: ( rule__EvaluationUnit_Impl__Group__0 )
            // InternalUpctformaevalua.g:194:4: rule__EvaluationUnit_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleEvaluationUnit_Impl"


    // $ANTLR start "entryRuleQuestion_Impl"
    // InternalUpctformaevalua.g:203:1: entryRuleQuestion_Impl : ruleQuestion_Impl EOF ;
    public final void entryRuleQuestion_Impl() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:204:1: ( ruleQuestion_Impl EOF )
            // InternalUpctformaevalua.g:205:1: ruleQuestion_Impl EOF
            {
             before(grammarAccess.getQuestion_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion_Impl();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuestion_Impl"


    // $ANTLR start "ruleQuestion_Impl"
    // InternalUpctformaevalua.g:212:1: ruleQuestion_Impl : ( ( rule__Question_Impl__Group__0 ) ) ;
    public final void ruleQuestion_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:216:2: ( ( ( rule__Question_Impl__Group__0 ) ) )
            // InternalUpctformaevalua.g:217:2: ( ( rule__Question_Impl__Group__0 ) )
            {
            // InternalUpctformaevalua.g:217:2: ( ( rule__Question_Impl__Group__0 ) )
            // InternalUpctformaevalua.g:218:3: ( rule__Question_Impl__Group__0 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup()); 
            // InternalUpctformaevalua.g:219:3: ( rule__Question_Impl__Group__0 )
            // InternalUpctformaevalua.g:219:4: rule__Question_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion_Impl"


    // $ANTLR start "entryRuleEInt"
    // InternalUpctformaevalua.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:229:1: ( ruleEInt EOF )
            // InternalUpctformaevalua.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalUpctformaevalua.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUpctformaevalua.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUpctformaevalua.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalUpctformaevalua.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalUpctformaevalua.g:244:3: ( rule__EInt__Group__0 )
            // InternalUpctformaevalua.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleTraining"
    // InternalUpctformaevalua.g:253:1: entryRuleTraining : ruleTraining EOF ;
    public final void entryRuleTraining() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:254:1: ( ruleTraining EOF )
            // InternalUpctformaevalua.g:255:1: ruleTraining EOF
            {
             before(grammarAccess.getTrainingRule()); 
            pushFollow(FOLLOW_1);
            ruleTraining();

            state._fsp--;

             after(grammarAccess.getTrainingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTraining"


    // $ANTLR start "ruleTraining"
    // InternalUpctformaevalua.g:262:1: ruleTraining : ( ( rule__Training__Group__0 ) ) ;
    public final void ruleTraining() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:266:2: ( ( ( rule__Training__Group__0 ) ) )
            // InternalUpctformaevalua.g:267:2: ( ( rule__Training__Group__0 ) )
            {
            // InternalUpctformaevalua.g:267:2: ( ( rule__Training__Group__0 ) )
            // InternalUpctformaevalua.g:268:3: ( rule__Training__Group__0 )
            {
             before(grammarAccess.getTrainingAccess().getGroup()); 
            // InternalUpctformaevalua.g:269:3: ( rule__Training__Group__0 )
            // InternalUpctformaevalua.g:269:4: rule__Training__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGroup()); 

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
    // $ANTLR end "ruleTraining"


    // $ANTLR start "entryRuleFinal"
    // InternalUpctformaevalua.g:278:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:279:1: ( ruleFinal EOF )
            // InternalUpctformaevalua.g:280:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalUpctformaevalua.g:287:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:291:2: ( ( ( rule__Final__Group__0 ) ) )
            // InternalUpctformaevalua.g:292:2: ( ( rule__Final__Group__0 ) )
            {
            // InternalUpctformaevalua.g:292:2: ( ( rule__Final__Group__0 ) )
            // InternalUpctformaevalua.g:293:3: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // InternalUpctformaevalua.g:294:3: ( rule__Final__Group__0 )
            // InternalUpctformaevalua.g:294:4: rule__Final__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getGroup()); 

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
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleSingleAnswer"
    // InternalUpctformaevalua.g:303:1: entryRuleSingleAnswer : ruleSingleAnswer EOF ;
    public final void entryRuleSingleAnswer() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:304:1: ( ruleSingleAnswer EOF )
            // InternalUpctformaevalua.g:305:1: ruleSingleAnswer EOF
            {
             before(grammarAccess.getSingleAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleAnswer();

            state._fsp--;

             after(grammarAccess.getSingleAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingleAnswer"


    // $ANTLR start "ruleSingleAnswer"
    // InternalUpctformaevalua.g:312:1: ruleSingleAnswer : ( ( rule__SingleAnswer__Group__0 ) ) ;
    public final void ruleSingleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:316:2: ( ( ( rule__SingleAnswer__Group__0 ) ) )
            // InternalUpctformaevalua.g:317:2: ( ( rule__SingleAnswer__Group__0 ) )
            {
            // InternalUpctformaevalua.g:317:2: ( ( rule__SingleAnswer__Group__0 ) )
            // InternalUpctformaevalua.g:318:3: ( rule__SingleAnswer__Group__0 )
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup()); 
            // InternalUpctformaevalua.g:319:3: ( rule__SingleAnswer__Group__0 )
            // InternalUpctformaevalua.g:319:4: rule__SingleAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleSingleAnswer"


    // $ANTLR start "entryRuleMultipleAnswer"
    // InternalUpctformaevalua.g:328:1: entryRuleMultipleAnswer : ruleMultipleAnswer EOF ;
    public final void entryRuleMultipleAnswer() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:329:1: ( ruleMultipleAnswer EOF )
            // InternalUpctformaevalua.g:330:1: ruleMultipleAnswer EOF
            {
             before(grammarAccess.getMultipleAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleAnswer();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultipleAnswer"


    // $ANTLR start "ruleMultipleAnswer"
    // InternalUpctformaevalua.g:337:1: ruleMultipleAnswer : ( ( rule__MultipleAnswer__Group__0 ) ) ;
    public final void ruleMultipleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:341:2: ( ( ( rule__MultipleAnswer__Group__0 ) ) )
            // InternalUpctformaevalua.g:342:2: ( ( rule__MultipleAnswer__Group__0 ) )
            {
            // InternalUpctformaevalua.g:342:2: ( ( rule__MultipleAnswer__Group__0 ) )
            // InternalUpctformaevalua.g:343:3: ( rule__MultipleAnswer__Group__0 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup()); 
            // InternalUpctformaevalua.g:344:3: ( rule__MultipleAnswer__Group__0 )
            // InternalUpctformaevalua.g:344:4: rule__MultipleAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleMultipleAnswer"


    // $ANTLR start "entryRuleFillingAnswer"
    // InternalUpctformaevalua.g:353:1: entryRuleFillingAnswer : ruleFillingAnswer EOF ;
    public final void entryRuleFillingAnswer() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:354:1: ( ruleFillingAnswer EOF )
            // InternalUpctformaevalua.g:355:1: ruleFillingAnswer EOF
            {
             before(grammarAccess.getFillingAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleFillingAnswer();

            state._fsp--;

             after(grammarAccess.getFillingAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFillingAnswer"


    // $ANTLR start "ruleFillingAnswer"
    // InternalUpctformaevalua.g:362:1: ruleFillingAnswer : ( ( rule__FillingAnswer__Group__0 ) ) ;
    public final void ruleFillingAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:366:2: ( ( ( rule__FillingAnswer__Group__0 ) ) )
            // InternalUpctformaevalua.g:367:2: ( ( rule__FillingAnswer__Group__0 ) )
            {
            // InternalUpctformaevalua.g:367:2: ( ( rule__FillingAnswer__Group__0 ) )
            // InternalUpctformaevalua.g:368:3: ( rule__FillingAnswer__Group__0 )
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup()); 
            // InternalUpctformaevalua.g:369:3: ( rule__FillingAnswer__Group__0 )
            // InternalUpctformaevalua.g:369:4: rule__FillingAnswer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getGroup()); 

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
    // $ANTLR end "ruleFillingAnswer"


    // $ANTLR start "entryRuleTrueOrFalse"
    // InternalUpctformaevalua.g:378:1: entryRuleTrueOrFalse : ruleTrueOrFalse EOF ;
    public final void entryRuleTrueOrFalse() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:379:1: ( ruleTrueOrFalse EOF )
            // InternalUpctformaevalua.g:380:1: ruleTrueOrFalse EOF
            {
             before(grammarAccess.getTrueOrFalseRule()); 
            pushFollow(FOLLOW_1);
            ruleTrueOrFalse();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrueOrFalse"


    // $ANTLR start "ruleTrueOrFalse"
    // InternalUpctformaevalua.g:387:1: ruleTrueOrFalse : ( ( rule__TrueOrFalse__Group__0 ) ) ;
    public final void ruleTrueOrFalse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:391:2: ( ( ( rule__TrueOrFalse__Group__0 ) ) )
            // InternalUpctformaevalua.g:392:2: ( ( rule__TrueOrFalse__Group__0 ) )
            {
            // InternalUpctformaevalua.g:392:2: ( ( rule__TrueOrFalse__Group__0 ) )
            // InternalUpctformaevalua.g:393:3: ( rule__TrueOrFalse__Group__0 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup()); 
            // InternalUpctformaevalua.g:394:3: ( rule__TrueOrFalse__Group__0 )
            // InternalUpctformaevalua.g:394:4: rule__TrueOrFalse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup()); 

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
    // $ANTLR end "ruleTrueOrFalse"


    // $ANTLR start "entryRuleParagraph"
    // InternalUpctformaevalua.g:403:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:404:1: ( ruleParagraph EOF )
            // InternalUpctformaevalua.g:405:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalUpctformaevalua.g:412:1: ruleParagraph : ( ( rule__Paragraph__Group__0 ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:416:2: ( ( ( rule__Paragraph__Group__0 ) ) )
            // InternalUpctformaevalua.g:417:2: ( ( rule__Paragraph__Group__0 ) )
            {
            // InternalUpctformaevalua.g:417:2: ( ( rule__Paragraph__Group__0 ) )
            // InternalUpctformaevalua.g:418:3: ( rule__Paragraph__Group__0 )
            {
             before(grammarAccess.getParagraphAccess().getGroup()); 
            // InternalUpctformaevalua.g:419:3: ( rule__Paragraph__Group__0 )
            // InternalUpctformaevalua.g:419:4: rule__Paragraph__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getGroup()); 

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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleSingle"
    // InternalUpctformaevalua.g:428:1: entryRuleSingle : ruleSingle EOF ;
    public final void entryRuleSingle() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:429:1: ( ruleSingle EOF )
            // InternalUpctformaevalua.g:430:1: ruleSingle EOF
            {
             before(grammarAccess.getSingleRule()); 
            pushFollow(FOLLOW_1);
            ruleSingle();

            state._fsp--;

             after(grammarAccess.getSingleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSingle"


    // $ANTLR start "ruleSingle"
    // InternalUpctformaevalua.g:437:1: ruleSingle : ( ( rule__Single__Group__0 ) ) ;
    public final void ruleSingle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:441:2: ( ( ( rule__Single__Group__0 ) ) )
            // InternalUpctformaevalua.g:442:2: ( ( rule__Single__Group__0 ) )
            {
            // InternalUpctformaevalua.g:442:2: ( ( rule__Single__Group__0 ) )
            // InternalUpctformaevalua.g:443:3: ( rule__Single__Group__0 )
            {
             before(grammarAccess.getSingleAccess().getGroup()); 
            // InternalUpctformaevalua.g:444:3: ( rule__Single__Group__0 )
            // InternalUpctformaevalua.g:444:4: rule__Single__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Single__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleAccess().getGroup()); 

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
    // $ANTLR end "ruleSingle"


    // $ANTLR start "entryRuleMultiple"
    // InternalUpctformaevalua.g:453:1: entryRuleMultiple : ruleMultiple EOF ;
    public final void entryRuleMultiple() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:454:1: ( ruleMultiple EOF )
            // InternalUpctformaevalua.g:455:1: ruleMultiple EOF
            {
             before(grammarAccess.getMultipleRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiple"


    // $ANTLR start "ruleMultiple"
    // InternalUpctformaevalua.g:462:1: ruleMultiple : ( ( rule__Multiple__Group__0 ) ) ;
    public final void ruleMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:466:2: ( ( ( rule__Multiple__Group__0 ) ) )
            // InternalUpctformaevalua.g:467:2: ( ( rule__Multiple__Group__0 ) )
            {
            // InternalUpctformaevalua.g:467:2: ( ( rule__Multiple__Group__0 ) )
            // InternalUpctformaevalua.g:468:3: ( rule__Multiple__Group__0 )
            {
             before(grammarAccess.getMultipleAccess().getGroup()); 
            // InternalUpctformaevalua.g:469:3: ( rule__Multiple__Group__0 )
            // InternalUpctformaevalua.g:469:4: rule__Multiple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiple"


    // $ANTLR start "entryRuleEBoolean"
    // InternalUpctformaevalua.g:478:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:479:1: ( ruleEBoolean EOF )
            // InternalUpctformaevalua.g:480:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalUpctformaevalua.g:487:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:491:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalUpctformaevalua.g:492:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalUpctformaevalua.g:492:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalUpctformaevalua.g:493:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:494:3: ( rule__EBoolean__Alternatives )
            // InternalUpctformaevalua.g:494:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleHole"
    // InternalUpctformaevalua.g:503:1: entryRuleHole : ruleHole EOF ;
    public final void entryRuleHole() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:504:1: ( ruleHole EOF )
            // InternalUpctformaevalua.g:505:1: ruleHole EOF
            {
             before(grammarAccess.getHoleRule()); 
            pushFollow(FOLLOW_1);
            ruleHole();

            state._fsp--;

             after(grammarAccess.getHoleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHole"


    // $ANTLR start "ruleHole"
    // InternalUpctformaevalua.g:512:1: ruleHole : ( ( rule__Hole__Group__0 ) ) ;
    public final void ruleHole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:516:2: ( ( ( rule__Hole__Group__0 ) ) )
            // InternalUpctformaevalua.g:517:2: ( ( rule__Hole__Group__0 ) )
            {
            // InternalUpctformaevalua.g:517:2: ( ( rule__Hole__Group__0 ) )
            // InternalUpctformaevalua.g:518:3: ( rule__Hole__Group__0 )
            {
             before(grammarAccess.getHoleAccess().getGroup()); 
            // InternalUpctformaevalua.g:519:3: ( rule__Hole__Group__0 )
            // InternalUpctformaevalua.g:519:4: rule__Hole__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getGroup()); 

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
    // $ANTLR end "ruleHole"


    // $ANTLR start "entryRuleAssertion"
    // InternalUpctformaevalua.g:528:1: entryRuleAssertion : ruleAssertion EOF ;
    public final void entryRuleAssertion() throws RecognitionException {
        try {
            // InternalUpctformaevalua.g:529:1: ( ruleAssertion EOF )
            // InternalUpctformaevalua.g:530:1: ruleAssertion EOF
            {
             before(grammarAccess.getAssertionRule()); 
            pushFollow(FOLLOW_1);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getAssertionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssertion"


    // $ANTLR start "ruleAssertion"
    // InternalUpctformaevalua.g:537:1: ruleAssertion : ( ( rule__Assertion__Group__0 ) ) ;
    public final void ruleAssertion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:541:2: ( ( ( rule__Assertion__Group__0 ) ) )
            // InternalUpctformaevalua.g:542:2: ( ( rule__Assertion__Group__0 ) )
            {
            // InternalUpctformaevalua.g:542:2: ( ( rule__Assertion__Group__0 ) )
            // InternalUpctformaevalua.g:543:3: ( rule__Assertion__Group__0 )
            {
             before(grammarAccess.getAssertionAccess().getGroup()); 
            // InternalUpctformaevalua.g:544:3: ( rule__Assertion__Group__0 )
            // InternalUpctformaevalua.g:544:4: rule__Assertion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getGroup()); 

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
    // $ANTLR end "ruleAssertion"


    // $ANTLR start "ruleTypeHole"
    // InternalUpctformaevalua.g:553:1: ruleTypeHole : ( ( rule__TypeHole__Alternatives ) ) ;
    public final void ruleTypeHole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:557:1: ( ( ( rule__TypeHole__Alternatives ) ) )
            // InternalUpctformaevalua.g:558:2: ( ( rule__TypeHole__Alternatives ) )
            {
            // InternalUpctformaevalua.g:558:2: ( ( rule__TypeHole__Alternatives ) )
            // InternalUpctformaevalua.g:559:3: ( rule__TypeHole__Alternatives )
            {
             before(grammarAccess.getTypeHoleAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:560:3: ( rule__TypeHole__Alternatives )
            // InternalUpctformaevalua.g:560:4: rule__TypeHole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeHole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeHoleAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeHole"


    // $ANTLR start "ruleTypeGrade"
    // InternalUpctformaevalua.g:569:1: ruleTypeGrade : ( ( rule__TypeGrade__Alternatives ) ) ;
    public final void ruleTypeGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:573:1: ( ( ( rule__TypeGrade__Alternatives ) ) )
            // InternalUpctformaevalua.g:574:2: ( ( rule__TypeGrade__Alternatives ) )
            {
            // InternalUpctformaevalua.g:574:2: ( ( rule__TypeGrade__Alternatives ) )
            // InternalUpctformaevalua.g:575:3: ( rule__TypeGrade__Alternatives )
            {
             before(grammarAccess.getTypeGradeAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:576:3: ( rule__TypeGrade__Alternatives )
            // InternalUpctformaevalua.g:576:4: rule__TypeGrade__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeGrade__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeGradeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeGrade"


    // $ANTLR start "rule__EvaluationUnit__Alternatives"
    // InternalUpctformaevalua.g:584:1: rule__EvaluationUnit__Alternatives : ( ( ruleEvaluationUnit_Impl ) | ( ruleTraining ) | ( ruleFinal ) );
    public final void rule__EvaluationUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:588:1: ( ( ruleEvaluationUnit_Impl ) | ( ruleTraining ) | ( ruleFinal ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 35:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUpctformaevalua.g:589:2: ( ruleEvaluationUnit_Impl )
                    {
                    // InternalUpctformaevalua.g:589:2: ( ruleEvaluationUnit_Impl )
                    // InternalUpctformaevalua.g:590:3: ruleEvaluationUnit_Impl
                    {
                     before(grammarAccess.getEvaluationUnitAccess().getEvaluationUnit_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEvaluationUnit_Impl();

                    state._fsp--;

                     after(grammarAccess.getEvaluationUnitAccess().getEvaluationUnit_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:595:2: ( ruleTraining )
                    {
                    // InternalUpctformaevalua.g:595:2: ( ruleTraining )
                    // InternalUpctformaevalua.g:596:3: ruleTraining
                    {
                     before(grammarAccess.getEvaluationUnitAccess().getTrainingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTraining();

                    state._fsp--;

                     after(grammarAccess.getEvaluationUnitAccess().getTrainingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:601:2: ( ruleFinal )
                    {
                    // InternalUpctformaevalua.g:601:2: ( ruleFinal )
                    // InternalUpctformaevalua.g:602:3: ruleFinal
                    {
                     before(grammarAccess.getEvaluationUnitAccess().getFinalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFinal();

                    state._fsp--;

                     after(grammarAccess.getEvaluationUnitAccess().getFinalParserRuleCall_2()); 

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
    // $ANTLR end "rule__EvaluationUnit__Alternatives"


    // $ANTLR start "rule__Question__Alternatives"
    // InternalUpctformaevalua.g:611:1: rule__Question__Alternatives : ( ( ruleQuestion_Impl ) | ( ruleSingleAnswer ) | ( ruleMultipleAnswer ) | ( ruleFillingAnswer ) | ( ruleTrueOrFalse ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:615:1: ( ( ruleQuestion_Impl ) | ( ruleSingleAnswer ) | ( ruleMultipleAnswer ) | ( ruleFillingAnswer ) | ( ruleTrueOrFalse ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
            case 41:
                {
                alt2=4;
                }
                break;
            case 43:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUpctformaevalua.g:616:2: ( ruleQuestion_Impl )
                    {
                    // InternalUpctformaevalua.g:616:2: ( ruleQuestion_Impl )
                    // InternalUpctformaevalua.g:617:3: ruleQuestion_Impl
                    {
                     before(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuestion_Impl();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getQuestion_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:622:2: ( ruleSingleAnswer )
                    {
                    // InternalUpctformaevalua.g:622:2: ( ruleSingleAnswer )
                    // InternalUpctformaevalua.g:623:3: ruleSingleAnswer
                    {
                     before(grammarAccess.getQuestionAccess().getSingleAnswerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleAnswer();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSingleAnswerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:628:2: ( ruleMultipleAnswer )
                    {
                    // InternalUpctformaevalua.g:628:2: ( ruleMultipleAnswer )
                    // InternalUpctformaevalua.g:629:3: ruleMultipleAnswer
                    {
                     before(grammarAccess.getQuestionAccess().getMultipleAnswerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMultipleAnswer();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getMultipleAnswerParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctformaevalua.g:634:2: ( ruleFillingAnswer )
                    {
                    // InternalUpctformaevalua.g:634:2: ( ruleFillingAnswer )
                    // InternalUpctformaevalua.g:635:3: ruleFillingAnswer
                    {
                     before(grammarAccess.getQuestionAccess().getFillingAnswerParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFillingAnswer();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFillingAnswerParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctformaevalua.g:640:2: ( ruleTrueOrFalse )
                    {
                    // InternalUpctformaevalua.g:640:2: ( ruleTrueOrFalse )
                    // InternalUpctformaevalua.g:641:3: ruleTrueOrFalse
                    {
                     before(grammarAccess.getQuestionAccess().getTrueOrFalseParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleTrueOrFalse();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getTrueOrFalseParserRuleCall_4()); 

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
    // $ANTLR end "rule__Question__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalUpctformaevalua.g:650:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:654:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUpctformaevalua.g:655:2: ( RULE_STRING )
                    {
                    // InternalUpctformaevalua.g:655:2: ( RULE_STRING )
                    // InternalUpctformaevalua.g:656:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:661:2: ( RULE_ID )
                    {
                    // InternalUpctformaevalua.g:661:2: ( RULE_ID )
                    // InternalUpctformaevalua.g:662:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalUpctformaevalua.g:671:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:675:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUpctformaevalua.g:676:2: ( 'true' )
                    {
                    // InternalUpctformaevalua.g:676:2: ( 'true' )
                    // InternalUpctformaevalua.g:677:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:682:2: ( 'false' )
                    {
                    // InternalUpctformaevalua.g:682:2: ( 'false' )
                    // InternalUpctformaevalua.g:683:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__TypeHole__Alternatives"
    // InternalUpctformaevalua.g:692:1: rule__TypeHole__Alternatives : ( ( ( 'visible' ) ) | ( ( 'hole' ) ) );
    public final void rule__TypeHole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:696:1: ( ( ( 'visible' ) ) | ( ( 'hole' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUpctformaevalua.g:697:2: ( ( 'visible' ) )
                    {
                    // InternalUpctformaevalua.g:697:2: ( ( 'visible' ) )
                    // InternalUpctformaevalua.g:698:3: ( 'visible' )
                    {
                     before(grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalUpctformaevalua.g:699:3: ( 'visible' )
                    // InternalUpctformaevalua.g:699:4: 'visible'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:703:2: ( ( 'hole' ) )
                    {
                    // InternalUpctformaevalua.g:703:2: ( ( 'hole' ) )
                    // InternalUpctformaevalua.g:704:3: ( 'hole' )
                    {
                     before(grammarAccess.getTypeHoleAccess().getHoleEnumLiteralDeclaration_1()); 
                    // InternalUpctformaevalua.g:705:3: ( 'hole' )
                    // InternalUpctformaevalua.g:705:4: 'hole'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeHoleAccess().getHoleEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TypeHole__Alternatives"


    // $ANTLR start "rule__TypeGrade__Alternatives"
    // InternalUpctformaevalua.g:713:1: rule__TypeGrade__Alternatives : ( ( ( 'highest' ) ) | ( ( 'middle' ) ) | ( ( 'lowest' ) ) );
    public final void rule__TypeGrade__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:717:1: ( ( ( 'highest' ) ) | ( ( 'middle' ) ) | ( ( 'lowest' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUpctformaevalua.g:718:2: ( ( 'highest' ) )
                    {
                    // InternalUpctformaevalua.g:718:2: ( ( 'highest' ) )
                    // InternalUpctformaevalua.g:719:3: ( 'highest' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0()); 
                    // InternalUpctformaevalua.g:720:3: ( 'highest' )
                    // InternalUpctformaevalua.g:720:4: 'highest'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:724:2: ( ( 'middle' ) )
                    {
                    // InternalUpctformaevalua.g:724:2: ( ( 'middle' ) )
                    // InternalUpctformaevalua.g:725:3: ( 'middle' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1()); 
                    // InternalUpctformaevalua.g:726:3: ( 'middle' )
                    // InternalUpctformaevalua.g:726:4: 'middle'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:730:2: ( ( 'lowest' ) )
                    {
                    // InternalUpctformaevalua.g:730:2: ( ( 'lowest' ) )
                    // InternalUpctformaevalua.g:731:3: ( 'lowest' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getLowestEnumLiteralDeclaration_2()); 
                    // InternalUpctformaevalua.g:732:3: ( 'lowest' )
                    // InternalUpctformaevalua.g:732:4: 'lowest'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getLowestEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TypeGrade__Alternatives"


    // $ANTLR start "rule__Evaluation__Group__0"
    // InternalUpctformaevalua.g:740:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:744:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // InternalUpctformaevalua.g:745:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Evaluation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__1();

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
    // $ANTLR end "rule__Evaluation__Group__0"


    // $ANTLR start "rule__Evaluation__Group__0__Impl"
    // InternalUpctformaevalua.g:752:1: rule__Evaluation__Group__0__Impl : ( () ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:756:1: ( ( () ) )
            // InternalUpctformaevalua.g:757:1: ( () )
            {
            // InternalUpctformaevalua.g:757:1: ( () )
            // InternalUpctformaevalua.g:758:2: ()
            {
             before(grammarAccess.getEvaluationAccess().getEvaluationAction_0()); 
            // InternalUpctformaevalua.g:759:2: ()
            // InternalUpctformaevalua.g:759:3: 
            {
            }

             after(grammarAccess.getEvaluationAccess().getEvaluationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Evaluation__Group__0__Impl"


    // $ANTLR start "rule__Evaluation__Group__1"
    // InternalUpctformaevalua.g:767:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:771:1: ( rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 )
            // InternalUpctformaevalua.g:772:2: rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Evaluation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__2();

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
    // $ANTLR end "rule__Evaluation__Group__1"


    // $ANTLR start "rule__Evaluation__Group__1__Impl"
    // InternalUpctformaevalua.g:779:1: rule__Evaluation__Group__1__Impl : ( 'Evaluation' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:783:1: ( ( 'Evaluation' ) )
            // InternalUpctformaevalua.g:784:1: ( 'Evaluation' )
            {
            // InternalUpctformaevalua.g:784:1: ( 'Evaluation' )
            // InternalUpctformaevalua.g:785:2: 'Evaluation'
            {
             before(grammarAccess.getEvaluationAccess().getEvaluationKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getEvaluationKeyword_1()); 

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
    // $ANTLR end "rule__Evaluation__Group__1__Impl"


    // $ANTLR start "rule__Evaluation__Group__2"
    // InternalUpctformaevalua.g:794:1: rule__Evaluation__Group__2 : rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 ;
    public final void rule__Evaluation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:798:1: ( rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 )
            // InternalUpctformaevalua.g:799:2: rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Evaluation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__3();

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
    // $ANTLR end "rule__Evaluation__Group__2"


    // $ANTLR start "rule__Evaluation__Group__2__Impl"
    // InternalUpctformaevalua.g:806:1: rule__Evaluation__Group__2__Impl : ( ( rule__Evaluation__NameAssignment_2 ) ) ;
    public final void rule__Evaluation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:810:1: ( ( ( rule__Evaluation__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:811:1: ( ( rule__Evaluation__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:811:1: ( ( rule__Evaluation__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:812:2: ( rule__Evaluation__NameAssignment_2 )
            {
             before(grammarAccess.getEvaluationAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:813:2: ( rule__Evaluation__NameAssignment_2 )
            // InternalUpctformaevalua.g:813:3: rule__Evaluation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Evaluation__Group__2__Impl"


    // $ANTLR start "rule__Evaluation__Group__3"
    // InternalUpctformaevalua.g:821:1: rule__Evaluation__Group__3 : rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4 ;
    public final void rule__Evaluation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:825:1: ( rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4 )
            // InternalUpctformaevalua.g:826:2: rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Evaluation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__4();

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
    // $ANTLR end "rule__Evaluation__Group__3"


    // $ANTLR start "rule__Evaluation__Group__3__Impl"
    // InternalUpctformaevalua.g:833:1: rule__Evaluation__Group__3__Impl : ( '{' ) ;
    public final void rule__Evaluation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:837:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:838:1: ( '{' )
            {
            // InternalUpctformaevalua.g:838:1: ( '{' )
            // InternalUpctformaevalua.g:839:2: '{'
            {
             before(grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Evaluation__Group__3__Impl"


    // $ANTLR start "rule__Evaluation__Group__4"
    // InternalUpctformaevalua.g:848:1: rule__Evaluation__Group__4 : rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5 ;
    public final void rule__Evaluation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:852:1: ( rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5 )
            // InternalUpctformaevalua.g:853:2: rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Evaluation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__5();

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
    // $ANTLR end "rule__Evaluation__Group__4"


    // $ANTLR start "rule__Evaluation__Group__4__Impl"
    // InternalUpctformaevalua.g:860:1: rule__Evaluation__Group__4__Impl : ( ( rule__Evaluation__Group_4__0 )? ) ;
    public final void rule__Evaluation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:864:1: ( ( ( rule__Evaluation__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:865:1: ( ( rule__Evaluation__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:865:1: ( ( rule__Evaluation__Group_4__0 )? )
            // InternalUpctformaevalua.g:866:2: ( rule__Evaluation__Group_4__0 )?
            {
             before(grammarAccess.getEvaluationAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:867:2: ( rule__Evaluation__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUpctformaevalua.g:867:3: rule__Evaluation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Evaluation__Group__4__Impl"


    // $ANTLR start "rule__Evaluation__Group__5"
    // InternalUpctformaevalua.g:875:1: rule__Evaluation__Group__5 : rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6 ;
    public final void rule__Evaluation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:879:1: ( rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6 )
            // InternalUpctformaevalua.g:880:2: rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Evaluation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__6();

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
    // $ANTLR end "rule__Evaluation__Group__5"


    // $ANTLR start "rule__Evaluation__Group__5__Impl"
    // InternalUpctformaevalua.g:887:1: rule__Evaluation__Group__5__Impl : ( ( rule__Evaluation__Group_5__0 )? ) ;
    public final void rule__Evaluation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:891:1: ( ( ( rule__Evaluation__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:892:1: ( ( rule__Evaluation__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:892:1: ( ( rule__Evaluation__Group_5__0 )? )
            // InternalUpctformaevalua.g:893:2: ( rule__Evaluation__Group_5__0 )?
            {
             before(grammarAccess.getEvaluationAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:894:2: ( rule__Evaluation__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25||LA8_0==32||LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctformaevalua.g:894:3: rule__Evaluation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Evaluation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Evaluation__Group__5__Impl"


    // $ANTLR start "rule__Evaluation__Group__6"
    // InternalUpctformaevalua.g:902:1: rule__Evaluation__Group__6 : rule__Evaluation__Group__6__Impl ;
    public final void rule__Evaluation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:906:1: ( rule__Evaluation__Group__6__Impl )
            // InternalUpctformaevalua.g:907:2: rule__Evaluation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group__6__Impl();

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
    // $ANTLR end "rule__Evaluation__Group__6"


    // $ANTLR start "rule__Evaluation__Group__6__Impl"
    // InternalUpctformaevalua.g:913:1: rule__Evaluation__Group__6__Impl : ( '}' ) ;
    public final void rule__Evaluation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:917:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:918:1: ( '}' )
            {
            // InternalUpctformaevalua.g:918:1: ( '}' )
            // InternalUpctformaevalua.g:919:2: '}'
            {
             before(grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Evaluation__Group__6__Impl"


    // $ANTLR start "rule__Evaluation__Group_4__0"
    // InternalUpctformaevalua.g:929:1: rule__Evaluation__Group_4__0 : rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1 ;
    public final void rule__Evaluation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:933:1: ( rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1 )
            // InternalUpctformaevalua.g:934:2: rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Evaluation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_4__1();

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
    // $ANTLR end "rule__Evaluation__Group_4__0"


    // $ANTLR start "rule__Evaluation__Group_4__0__Impl"
    // InternalUpctformaevalua.g:941:1: rule__Evaluation__Group_4__0__Impl : ( 'package' ) ;
    public final void rule__Evaluation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:945:1: ( ( 'package' ) )
            // InternalUpctformaevalua.g:946:1: ( 'package' )
            {
            // InternalUpctformaevalua.g:946:1: ( 'package' )
            // InternalUpctformaevalua.g:947:2: 'package'
            {
             before(grammarAccess.getEvaluationAccess().getPackageKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getPackageKeyword_4_0()); 

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
    // $ANTLR end "rule__Evaluation__Group_4__0__Impl"


    // $ANTLR start "rule__Evaluation__Group_4__1"
    // InternalUpctformaevalua.g:956:1: rule__Evaluation__Group_4__1 : rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2 ;
    public final void rule__Evaluation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:960:1: ( rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2 )
            // InternalUpctformaevalua.g:961:2: rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__Evaluation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_4__2();

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
    // $ANTLR end "rule__Evaluation__Group_4__1"


    // $ANTLR start "rule__Evaluation__Group_4__1__Impl"
    // InternalUpctformaevalua.g:968:1: rule__Evaluation__Group_4__1__Impl : ( ( rule__Evaluation__NameAssignment_4_1 ) ) ;
    public final void rule__Evaluation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:972:1: ( ( ( rule__Evaluation__NameAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:973:1: ( ( rule__Evaluation__NameAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:973:1: ( ( rule__Evaluation__NameAssignment_4_1 ) )
            // InternalUpctformaevalua.g:974:2: ( rule__Evaluation__NameAssignment_4_1 )
            {
             before(grammarAccess.getEvaluationAccess().getNameAssignment_4_1()); 
            // InternalUpctformaevalua.g:975:2: ( rule__Evaluation__NameAssignment_4_1 )
            // InternalUpctformaevalua.g:975:3: rule__Evaluation__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getNameAssignment_4_1()); 

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
    // $ANTLR end "rule__Evaluation__Group_4__1__Impl"


    // $ANTLR start "rule__Evaluation__Group_4__2"
    // InternalUpctformaevalua.g:983:1: rule__Evaluation__Group_4__2 : rule__Evaluation__Group_4__2__Impl ;
    public final void rule__Evaluation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:987:1: ( rule__Evaluation__Group_4__2__Impl )
            // InternalUpctformaevalua.g:988:2: rule__Evaluation__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_4__2__Impl();

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
    // $ANTLR end "rule__Evaluation__Group_4__2"


    // $ANTLR start "rule__Evaluation__Group_4__2__Impl"
    // InternalUpctformaevalua.g:994:1: rule__Evaluation__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:998:1: ( ( ';' ) )
            // InternalUpctformaevalua.g:999:1: ( ';' )
            {
            // InternalUpctformaevalua.g:999:1: ( ';' )
            // InternalUpctformaevalua.g:1000:2: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_4_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getSemicolonKeyword_4_2()); 

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
    // $ANTLR end "rule__Evaluation__Group_4__2__Impl"


    // $ANTLR start "rule__Evaluation__Group_5__0"
    // InternalUpctformaevalua.g:1010:1: rule__Evaluation__Group_5__0 : rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1 ;
    public final void rule__Evaluation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1014:1: ( rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1 )
            // InternalUpctformaevalua.g:1015:2: rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Evaluation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5__1();

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
    // $ANTLR end "rule__Evaluation__Group_5__0"


    // $ANTLR start "rule__Evaluation__Group_5__0__Impl"
    // InternalUpctformaevalua.g:1022:1: rule__Evaluation__Group_5__0__Impl : ( ( rule__Evaluation__UnitsAssignment_5_0 ) ) ;
    public final void rule__Evaluation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1026:1: ( ( ( rule__Evaluation__UnitsAssignment_5_0 ) ) )
            // InternalUpctformaevalua.g:1027:1: ( ( rule__Evaluation__UnitsAssignment_5_0 ) )
            {
            // InternalUpctformaevalua.g:1027:1: ( ( rule__Evaluation__UnitsAssignment_5_0 ) )
            // InternalUpctformaevalua.g:1028:2: ( rule__Evaluation__UnitsAssignment_5_0 )
            {
             before(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_0()); 
            // InternalUpctformaevalua.g:1029:2: ( rule__Evaluation__UnitsAssignment_5_0 )
            // InternalUpctformaevalua.g:1029:3: rule__Evaluation__UnitsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__UnitsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_0()); 

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
    // $ANTLR end "rule__Evaluation__Group_5__0__Impl"


    // $ANTLR start "rule__Evaluation__Group_5__1"
    // InternalUpctformaevalua.g:1037:1: rule__Evaluation__Group_5__1 : rule__Evaluation__Group_5__1__Impl ;
    public final void rule__Evaluation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1041:1: ( rule__Evaluation__Group_5__1__Impl )
            // InternalUpctformaevalua.g:1042:2: rule__Evaluation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5__1__Impl();

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
    // $ANTLR end "rule__Evaluation__Group_5__1"


    // $ANTLR start "rule__Evaluation__Group_5__1__Impl"
    // InternalUpctformaevalua.g:1048:1: rule__Evaluation__Group_5__1__Impl : ( ( rule__Evaluation__Group_5_1__0 )* ) ;
    public final void rule__Evaluation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1052:1: ( ( ( rule__Evaluation__Group_5_1__0 )* ) )
            // InternalUpctformaevalua.g:1053:1: ( ( rule__Evaluation__Group_5_1__0 )* )
            {
            // InternalUpctformaevalua.g:1053:1: ( ( rule__Evaluation__Group_5_1__0 )* )
            // InternalUpctformaevalua.g:1054:2: ( rule__Evaluation__Group_5_1__0 )*
            {
             before(grammarAccess.getEvaluationAccess().getGroup_5_1()); 
            // InternalUpctformaevalua.g:1055:2: ( rule__Evaluation__Group_5_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1055:3: rule__Evaluation__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Evaluation__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEvaluationAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Evaluation__Group_5__1__Impl"


    // $ANTLR start "rule__Evaluation__Group_5_1__0"
    // InternalUpctformaevalua.g:1064:1: rule__Evaluation__Group_5_1__0 : rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1 ;
    public final void rule__Evaluation__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1068:1: ( rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1 )
            // InternalUpctformaevalua.g:1069:2: rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Evaluation__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5_1__1();

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
    // $ANTLR end "rule__Evaluation__Group_5_1__0"


    // $ANTLR start "rule__Evaluation__Group_5_1__0__Impl"
    // InternalUpctformaevalua.g:1076:1: rule__Evaluation__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Evaluation__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1080:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:1081:1: ( ',' )
            {
            // InternalUpctformaevalua.g:1081:1: ( ',' )
            // InternalUpctformaevalua.g:1082:2: ','
            {
             before(grammarAccess.getEvaluationAccess().getCommaKeyword_5_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvaluationAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end "rule__Evaluation__Group_5_1__0__Impl"


    // $ANTLR start "rule__Evaluation__Group_5_1__1"
    // InternalUpctformaevalua.g:1091:1: rule__Evaluation__Group_5_1__1 : rule__Evaluation__Group_5_1__1__Impl ;
    public final void rule__Evaluation__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1095:1: ( rule__Evaluation__Group_5_1__1__Impl )
            // InternalUpctformaevalua.g:1096:2: rule__Evaluation__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__Evaluation__Group_5_1__1"


    // $ANTLR start "rule__Evaluation__Group_5_1__1__Impl"
    // InternalUpctformaevalua.g:1102:1: rule__Evaluation__Group_5_1__1__Impl : ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) ) ;
    public final void rule__Evaluation__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1106:1: ( ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) ) )
            // InternalUpctformaevalua.g:1107:1: ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) )
            {
            // InternalUpctformaevalua.g:1107:1: ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) )
            // InternalUpctformaevalua.g:1108:2: ( rule__Evaluation__UnitsAssignment_5_1_1 )
            {
             before(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_1_1()); 
            // InternalUpctformaevalua.g:1109:2: ( rule__Evaluation__UnitsAssignment_5_1_1 )
            // InternalUpctformaevalua.g:1109:3: rule__Evaluation__UnitsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Evaluation__UnitsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_1_1()); 

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
    // $ANTLR end "rule__Evaluation__Group_5_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUpctformaevalua.g:1118:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1122:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUpctformaevalua.g:1123:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalUpctformaevalua.g:1130:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1134:1: ( ( RULE_ID ) )
            // InternalUpctformaevalua.g:1135:1: ( RULE_ID )
            {
            // InternalUpctformaevalua.g:1135:1: ( RULE_ID )
            // InternalUpctformaevalua.g:1136:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalUpctformaevalua.g:1145:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1149:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUpctformaevalua.g:1150:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalUpctformaevalua.g:1156:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1160:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUpctformaevalua.g:1161:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUpctformaevalua.g:1161:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUpctformaevalua.g:1162:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUpctformaevalua.g:1163:2: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1163:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalUpctformaevalua.g:1172:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1176:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUpctformaevalua.g:1177:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalUpctformaevalua.g:1184:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1188:1: ( ( '.' ) )
            // InternalUpctformaevalua.g:1189:1: ( '.' )
            {
            // InternalUpctformaevalua.g:1189:1: ( '.' )
            // InternalUpctformaevalua.g:1190:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalUpctformaevalua.g:1199:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1203:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUpctformaevalua.g:1204:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalUpctformaevalua.g:1210:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1214:1: ( ( RULE_ID ) )
            // InternalUpctformaevalua.g:1215:1: ( RULE_ID )
            {
            // InternalUpctformaevalua.g:1215:1: ( RULE_ID )
            // InternalUpctformaevalua.g:1216:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__0"
    // InternalUpctformaevalua.g:1226:1: rule__EvaluationUnit_Impl__Group__0 : rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1 ;
    public final void rule__EvaluationUnit_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1230:1: ( rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1 )
            // InternalUpctformaevalua.g:1231:2: rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EvaluationUnit_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__1();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__0__Impl"
    // InternalUpctformaevalua.g:1238:1: rule__EvaluationUnit_Impl__Group__0__Impl : ( () ) ;
    public final void rule__EvaluationUnit_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1242:1: ( ( () ) )
            // InternalUpctformaevalua.g:1243:1: ( () )
            {
            // InternalUpctformaevalua.g:1243:1: ( () )
            // InternalUpctformaevalua.g:1244:2: ()
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0()); 
            // InternalUpctformaevalua.g:1245:2: ()
            // InternalUpctformaevalua.g:1245:3: 
            {
            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__1"
    // InternalUpctformaevalua.g:1253:1: rule__EvaluationUnit_Impl__Group__1 : rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2 ;
    public final void rule__EvaluationUnit_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1257:1: ( rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2 )
            // InternalUpctformaevalua.g:1258:2: rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__EvaluationUnit_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__2();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__1__Impl"
    // InternalUpctformaevalua.g:1265:1: rule__EvaluationUnit_Impl__Group__1__Impl : ( 'EvaluationUnit' ) ;
    public final void rule__EvaluationUnit_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1269:1: ( ( 'EvaluationUnit' ) )
            // InternalUpctformaevalua.g:1270:1: ( 'EvaluationUnit' )
            {
            // InternalUpctformaevalua.g:1270:1: ( 'EvaluationUnit' )
            // InternalUpctformaevalua.g:1271:2: 'EvaluationUnit'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__2"
    // InternalUpctformaevalua.g:1280:1: rule__EvaluationUnit_Impl__Group__2 : rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3 ;
    public final void rule__EvaluationUnit_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1284:1: ( rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3 )
            // InternalUpctformaevalua.g:1285:2: rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__EvaluationUnit_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__3();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__2"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__2__Impl"
    // InternalUpctformaevalua.g:1292:1: rule__EvaluationUnit_Impl__Group__2__Impl : ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1296:1: ( ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:1297:1: ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:1297:1: ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:1298:2: ( rule__EvaluationUnit_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:1299:2: ( rule__EvaluationUnit_Impl__NameAssignment_2 )
            // InternalUpctformaevalua.g:1299:3: rule__EvaluationUnit_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__2__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__3"
    // InternalUpctformaevalua.g:1307:1: rule__EvaluationUnit_Impl__Group__3 : rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4 ;
    public final void rule__EvaluationUnit_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1311:1: ( rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4 )
            // InternalUpctformaevalua.g:1312:2: rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__EvaluationUnit_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__4();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__3"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__3__Impl"
    // InternalUpctformaevalua.g:1319:1: rule__EvaluationUnit_Impl__Group__3__Impl : ( '{' ) ;
    public final void rule__EvaluationUnit_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1323:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1324:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1324:1: ( '{' )
            // InternalUpctformaevalua.g:1325:2: '{'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__3__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__4"
    // InternalUpctformaevalua.g:1334:1: rule__EvaluationUnit_Impl__Group__4 : rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5 ;
    public final void rule__EvaluationUnit_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1338:1: ( rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5 )
            // InternalUpctformaevalua.g:1339:2: rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__EvaluationUnit_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__5();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__4"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__4__Impl"
    // InternalUpctformaevalua.g:1346:1: rule__EvaluationUnit_Impl__Group__4__Impl : ( ( rule__EvaluationUnit_Impl__Group_4__0 )? ) ;
    public final void rule__EvaluationUnit_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1350:1: ( ( ( rule__EvaluationUnit_Impl__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:1351:1: ( ( rule__EvaluationUnit_Impl__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:1351:1: ( ( rule__EvaluationUnit_Impl__Group_4__0 )? )
            // InternalUpctformaevalua.g:1352:2: ( rule__EvaluationUnit_Impl__Group_4__0 )?
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:1353:2: ( rule__EvaluationUnit_Impl__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUpctformaevalua.g:1353:3: rule__EvaluationUnit_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvaluationUnit_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__4__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__5"
    // InternalUpctformaevalua.g:1361:1: rule__EvaluationUnit_Impl__Group__5 : rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6 ;
    public final void rule__EvaluationUnit_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1365:1: ( rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6 )
            // InternalUpctformaevalua.g:1366:2: rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__EvaluationUnit_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__6();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__5"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__5__Impl"
    // InternalUpctformaevalua.g:1373:1: rule__EvaluationUnit_Impl__Group__5__Impl : ( ( rule__EvaluationUnit_Impl__Group_5__0 )? ) ;
    public final void rule__EvaluationUnit_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1377:1: ( ( ( rule__EvaluationUnit_Impl__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:1378:1: ( ( rule__EvaluationUnit_Impl__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:1378:1: ( ( rule__EvaluationUnit_Impl__Group_5__0 )? )
            // InternalUpctformaevalua.g:1379:2: ( rule__EvaluationUnit_Impl__Group_5__0 )?
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:1380:2: ( rule__EvaluationUnit_Impl__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUpctformaevalua.g:1380:3: rule__EvaluationUnit_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvaluationUnit_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__5__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__6"
    // InternalUpctformaevalua.g:1388:1: rule__EvaluationUnit_Impl__Group__6 : rule__EvaluationUnit_Impl__Group__6__Impl ;
    public final void rule__EvaluationUnit_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1392:1: ( rule__EvaluationUnit_Impl__Group__6__Impl )
            // InternalUpctformaevalua.g:1393:2: rule__EvaluationUnit_Impl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__6__Impl();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__6"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__6__Impl"
    // InternalUpctformaevalua.g:1399:1: rule__EvaluationUnit_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__EvaluationUnit_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1403:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1404:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1404:1: ( '}' )
            // InternalUpctformaevalua.g:1405:2: '}'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__6__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__0"
    // InternalUpctformaevalua.g:1415:1: rule__EvaluationUnit_Impl__Group_4__0 : rule__EvaluationUnit_Impl__Group_4__0__Impl rule__EvaluationUnit_Impl__Group_4__1 ;
    public final void rule__EvaluationUnit_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1419:1: ( rule__EvaluationUnit_Impl__Group_4__0__Impl rule__EvaluationUnit_Impl__Group_4__1 )
            // InternalUpctformaevalua.g:1420:2: rule__EvaluationUnit_Impl__Group_4__0__Impl rule__EvaluationUnit_Impl__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__EvaluationUnit_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_4__1();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__0__Impl"
    // InternalUpctformaevalua.g:1427:1: rule__EvaluationUnit_Impl__Group_4__0__Impl : ( 'numberquestions' ) ;
    public final void rule__EvaluationUnit_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1431:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:1432:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:1432:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:1433:2: 'numberquestions'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_4_0()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__1"
    // InternalUpctformaevalua.g:1442:1: rule__EvaluationUnit_Impl__Group_4__1 : rule__EvaluationUnit_Impl__Group_4__1__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1446:1: ( rule__EvaluationUnit_Impl__Group_4__1__Impl )
            // InternalUpctformaevalua.g:1447:2: rule__EvaluationUnit_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_4__1__Impl();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_4__1__Impl"
    // InternalUpctformaevalua.g:1453:1: rule__EvaluationUnit_Impl__Group_4__1__Impl : ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1457:1: ( ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:1458:1: ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:1458:1: ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 ) )
            // InternalUpctformaevalua.g:1459:2: ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsAssignment_4_1()); 
            // InternalUpctformaevalua.g:1460:2: ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 )
            // InternalUpctformaevalua.g:1460:3: rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsAssignment_4_1()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__0"
    // InternalUpctformaevalua.g:1469:1: rule__EvaluationUnit_Impl__Group_5__0 : rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1 ;
    public final void rule__EvaluationUnit_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1473:1: ( rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1 )
            // InternalUpctformaevalua.g:1474:2: rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__EvaluationUnit_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__1();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__0__Impl"
    // InternalUpctformaevalua.g:1481:1: rule__EvaluationUnit_Impl__Group_5__0__Impl : ( 'questions' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1485:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:1486:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:1486:1: ( 'questions' )
            // InternalUpctformaevalua.g:1487:2: 'questions'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_5_0()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__1"
    // InternalUpctformaevalua.g:1496:1: rule__EvaluationUnit_Impl__Group_5__1 : rule__EvaluationUnit_Impl__Group_5__1__Impl rule__EvaluationUnit_Impl__Group_5__2 ;
    public final void rule__EvaluationUnit_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1500:1: ( rule__EvaluationUnit_Impl__Group_5__1__Impl rule__EvaluationUnit_Impl__Group_5__2 )
            // InternalUpctformaevalua.g:1501:2: rule__EvaluationUnit_Impl__Group_5__1__Impl rule__EvaluationUnit_Impl__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__EvaluationUnit_Impl__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__2();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__1__Impl"
    // InternalUpctformaevalua.g:1508:1: rule__EvaluationUnit_Impl__Group_5__1__Impl : ( '{' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1512:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1513:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1513:1: ( '{' )
            // InternalUpctformaevalua.g:1514:2: '{'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__2"
    // InternalUpctformaevalua.g:1523:1: rule__EvaluationUnit_Impl__Group_5__2 : rule__EvaluationUnit_Impl__Group_5__2__Impl rule__EvaluationUnit_Impl__Group_5__3 ;
    public final void rule__EvaluationUnit_Impl__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1527:1: ( rule__EvaluationUnit_Impl__Group_5__2__Impl rule__EvaluationUnit_Impl__Group_5__3 )
            // InternalUpctformaevalua.g:1528:2: rule__EvaluationUnit_Impl__Group_5__2__Impl rule__EvaluationUnit_Impl__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__EvaluationUnit_Impl__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__3();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__2"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__2__Impl"
    // InternalUpctformaevalua.g:1535:1: rule__EvaluationUnit_Impl__Group_5__2__Impl : ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1539:1: ( ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:1540:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:1540:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 ) )
            // InternalUpctformaevalua.g:1541:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_2()); 
            // InternalUpctformaevalua.g:1542:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 )
            // InternalUpctformaevalua.g:1542:3: rule__EvaluationUnit_Impl__QuestionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__QuestionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_2()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__2__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__3"
    // InternalUpctformaevalua.g:1550:1: rule__EvaluationUnit_Impl__Group_5__3 : rule__EvaluationUnit_Impl__Group_5__3__Impl rule__EvaluationUnit_Impl__Group_5__4 ;
    public final void rule__EvaluationUnit_Impl__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1554:1: ( rule__EvaluationUnit_Impl__Group_5__3__Impl rule__EvaluationUnit_Impl__Group_5__4 )
            // InternalUpctformaevalua.g:1555:2: rule__EvaluationUnit_Impl__Group_5__3__Impl rule__EvaluationUnit_Impl__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__EvaluationUnit_Impl__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__4();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__3"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__3__Impl"
    // InternalUpctformaevalua.g:1562:1: rule__EvaluationUnit_Impl__Group_5__3__Impl : ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1566:1: ( ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:1567:1: ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:1567:1: ( ( rule__EvaluationUnit_Impl__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:1568:2: ( rule__EvaluationUnit_Impl__Group_5_3__0 )*
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:1569:2: ( rule__EvaluationUnit_Impl__Group_5_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1569:3: rule__EvaluationUnit_Impl__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EvaluationUnit_Impl__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__3__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__4"
    // InternalUpctformaevalua.g:1577:1: rule__EvaluationUnit_Impl__Group_5__4 : rule__EvaluationUnit_Impl__Group_5__4__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1581:1: ( rule__EvaluationUnit_Impl__Group_5__4__Impl )
            // InternalUpctformaevalua.g:1582:2: rule__EvaluationUnit_Impl__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__4__Impl();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__4"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__4__Impl"
    // InternalUpctformaevalua.g:1588:1: rule__EvaluationUnit_Impl__Group_5__4__Impl : ( '}' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1592:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1593:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1593:1: ( '}' )
            // InternalUpctformaevalua.g:1594:2: '}'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5__4__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__0"
    // InternalUpctformaevalua.g:1604:1: rule__EvaluationUnit_Impl__Group_5_3__0 : rule__EvaluationUnit_Impl__Group_5_3__0__Impl rule__EvaluationUnit_Impl__Group_5_3__1 ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1608:1: ( rule__EvaluationUnit_Impl__Group_5_3__0__Impl rule__EvaluationUnit_Impl__Group_5_3__1 )
            // InternalUpctformaevalua.g:1609:2: rule__EvaluationUnit_Impl__Group_5_3__0__Impl rule__EvaluationUnit_Impl__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__EvaluationUnit_Impl__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5_3__1();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__0__Impl"
    // InternalUpctformaevalua.g:1616:1: rule__EvaluationUnit_Impl__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1620:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:1621:1: ( ',' )
            {
            // InternalUpctformaevalua.g:1621:1: ( ',' )
            // InternalUpctformaevalua.g:1622:2: ','
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_5_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__1"
    // InternalUpctformaevalua.g:1631:1: rule__EvaluationUnit_Impl__Group_5_3__1 : rule__EvaluationUnit_Impl__Group_5_3__1__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1635:1: ( rule__EvaluationUnit_Impl__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:1636:2: rule__EvaluationUnit_Impl__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5_3__1__Impl"
    // InternalUpctformaevalua.g:1642:1: rule__EvaluationUnit_Impl__Group_5_3__1__Impl : ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1646:1: ( ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:1647:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:1647:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:1648:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:1649:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 )
            // InternalUpctformaevalua.g:1649:3: rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_5_3__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group__0"
    // InternalUpctformaevalua.g:1658:1: rule__Question_Impl__Group__0 : rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 ;
    public final void rule__Question_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1662:1: ( rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 )
            // InternalUpctformaevalua.g:1663:2: rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Question_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__1();

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
    // $ANTLR end "rule__Question_Impl__Group__0"


    // $ANTLR start "rule__Question_Impl__Group__0__Impl"
    // InternalUpctformaevalua.g:1670:1: rule__Question_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Question_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1674:1: ( ( () ) )
            // InternalUpctformaevalua.g:1675:1: ( () )
            {
            // InternalUpctformaevalua.g:1675:1: ( () )
            // InternalUpctformaevalua.g:1676:2: ()
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionAction_0()); 
            // InternalUpctformaevalua.g:1677:2: ()
            // InternalUpctformaevalua.g:1677:3: 
            {
            }

             after(grammarAccess.getQuestion_ImplAccess().getQuestionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question_Impl__Group__0__Impl"


    // $ANTLR start "rule__Question_Impl__Group__1"
    // InternalUpctformaevalua.g:1685:1: rule__Question_Impl__Group__1 : rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 ;
    public final void rule__Question_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1689:1: ( rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 )
            // InternalUpctformaevalua.g:1690:2: rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Question_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__2();

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
    // $ANTLR end "rule__Question_Impl__Group__1"


    // $ANTLR start "rule__Question_Impl__Group__1__Impl"
    // InternalUpctformaevalua.g:1697:1: rule__Question_Impl__Group__1__Impl : ( 'Question' ) ;
    public final void rule__Question_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1701:1: ( ( 'Question' ) )
            // InternalUpctformaevalua.g:1702:1: ( 'Question' )
            {
            // InternalUpctformaevalua.g:1702:1: ( 'Question' )
            // InternalUpctformaevalua.g:1703:2: 'Question'
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1()); 

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
    // $ANTLR end "rule__Question_Impl__Group__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group__2"
    // InternalUpctformaevalua.g:1712:1: rule__Question_Impl__Group__2 : rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 ;
    public final void rule__Question_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1716:1: ( rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 )
            // InternalUpctformaevalua.g:1717:2: rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Question_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__3();

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
    // $ANTLR end "rule__Question_Impl__Group__2"


    // $ANTLR start "rule__Question_Impl__Group__2__Impl"
    // InternalUpctformaevalua.g:1724:1: rule__Question_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Question_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1728:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1729:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1729:1: ( '{' )
            // InternalUpctformaevalua.g:1730:2: '{'
            {
             before(grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Question_Impl__Group__2__Impl"


    // $ANTLR start "rule__Question_Impl__Group__3"
    // InternalUpctformaevalua.g:1739:1: rule__Question_Impl__Group__3 : rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 ;
    public final void rule__Question_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1743:1: ( rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 )
            // InternalUpctformaevalua.g:1744:2: rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Question_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__4();

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
    // $ANTLR end "rule__Question_Impl__Group__3"


    // $ANTLR start "rule__Question_Impl__Group__3__Impl"
    // InternalUpctformaevalua.g:1751:1: rule__Question_Impl__Group__3__Impl : ( ( rule__Question_Impl__Group_3__0 )? ) ;
    public final void rule__Question_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1755:1: ( ( ( rule__Question_Impl__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:1756:1: ( ( rule__Question_Impl__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:1756:1: ( ( rule__Question_Impl__Group_3__0 )? )
            // InternalUpctformaevalua.g:1757:2: ( rule__Question_Impl__Group_3__0 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:1758:2: ( rule__Question_Impl__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUpctformaevalua.g:1758:3: rule__Question_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestion_ImplAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Question_Impl__Group__3__Impl"


    // $ANTLR start "rule__Question_Impl__Group__4"
    // InternalUpctformaevalua.g:1766:1: rule__Question_Impl__Group__4 : rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 ;
    public final void rule__Question_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1770:1: ( rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 )
            // InternalUpctformaevalua.g:1771:2: rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Question_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__5();

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
    // $ANTLR end "rule__Question_Impl__Group__4"


    // $ANTLR start "rule__Question_Impl__Group__4__Impl"
    // InternalUpctformaevalua.g:1778:1: rule__Question_Impl__Group__4__Impl : ( ( rule__Question_Impl__Group_4__0 )? ) ;
    public final void rule__Question_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1782:1: ( ( ( rule__Question_Impl__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:1783:1: ( ( rule__Question_Impl__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:1783:1: ( ( rule__Question_Impl__Group_4__0 )? )
            // InternalUpctformaevalua.g:1784:2: ( rule__Question_Impl__Group_4__0 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:1785:2: ( rule__Question_Impl__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUpctformaevalua.g:1785:3: rule__Question_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestion_ImplAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Question_Impl__Group__4__Impl"


    // $ANTLR start "rule__Question_Impl__Group__5"
    // InternalUpctformaevalua.g:1793:1: rule__Question_Impl__Group__5 : rule__Question_Impl__Group__5__Impl ;
    public final void rule__Question_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1797:1: ( rule__Question_Impl__Group__5__Impl )
            // InternalUpctformaevalua.g:1798:2: rule__Question_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group__5__Impl();

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
    // $ANTLR end "rule__Question_Impl__Group__5"


    // $ANTLR start "rule__Question_Impl__Group__5__Impl"
    // InternalUpctformaevalua.g:1804:1: rule__Question_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Question_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1808:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1809:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1809:1: ( '}' )
            // InternalUpctformaevalua.g:1810:2: '}'
            {
             before(grammarAccess.getQuestion_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Question_Impl__Group__5__Impl"


    // $ANTLR start "rule__Question_Impl__Group_3__0"
    // InternalUpctformaevalua.g:1820:1: rule__Question_Impl__Group_3__0 : rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1 ;
    public final void rule__Question_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1824:1: ( rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1 )
            // InternalUpctformaevalua.g:1825:2: rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Question_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_3__1();

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
    // $ANTLR end "rule__Question_Impl__Group_3__0"


    // $ANTLR start "rule__Question_Impl__Group_3__0__Impl"
    // InternalUpctformaevalua.g:1832:1: rule__Question_Impl__Group_3__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__Question_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1836:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:1837:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:1837:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:1838:2: 'correctfeedback'
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0()); 

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
    // $ANTLR end "rule__Question_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Question_Impl__Group_3__1"
    // InternalUpctformaevalua.g:1847:1: rule__Question_Impl__Group_3__1 : rule__Question_Impl__Group_3__1__Impl ;
    public final void rule__Question_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1851:1: ( rule__Question_Impl__Group_3__1__Impl )
            // InternalUpctformaevalua.g:1852:2: rule__Question_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_3__1__Impl();

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
    // $ANTLR end "rule__Question_Impl__Group_3__1"


    // $ANTLR start "rule__Question_Impl__Group_3__1__Impl"
    // InternalUpctformaevalua.g:1858:1: rule__Question_Impl__Group_3__1__Impl : ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) ) ;
    public final void rule__Question_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1862:1: ( ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:1863:1: ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:1863:1: ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) )
            // InternalUpctformaevalua.g:1864:2: ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackAssignment_3_1()); 
            // InternalUpctformaevalua.g:1865:2: ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 )
            // InternalUpctformaevalua.g:1865:3: rule__Question_Impl__CorrectfeedbackAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__CorrectfeedbackAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackAssignment_3_1()); 

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
    // $ANTLR end "rule__Question_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group_4__0"
    // InternalUpctformaevalua.g:1874:1: rule__Question_Impl__Group_4__0 : rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1 ;
    public final void rule__Question_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1878:1: ( rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1 )
            // InternalUpctformaevalua.g:1879:2: rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Question_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_4__1();

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
    // $ANTLR end "rule__Question_Impl__Group_4__0"


    // $ANTLR start "rule__Question_Impl__Group_4__0__Impl"
    // InternalUpctformaevalua.g:1886:1: rule__Question_Impl__Group_4__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__Question_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1890:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:1891:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:1891:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:1892:2: 'incorrectfeedback'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0()); 

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
    // $ANTLR end "rule__Question_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Question_Impl__Group_4__1"
    // InternalUpctformaevalua.g:1901:1: rule__Question_Impl__Group_4__1 : rule__Question_Impl__Group_4__1__Impl ;
    public final void rule__Question_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1905:1: ( rule__Question_Impl__Group_4__1__Impl )
            // InternalUpctformaevalua.g:1906:2: rule__Question_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__Group_4__1__Impl();

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
    // $ANTLR end "rule__Question_Impl__Group_4__1"


    // $ANTLR start "rule__Question_Impl__Group_4__1__Impl"
    // InternalUpctformaevalua.g:1912:1: rule__Question_Impl__Group_4__1__Impl : ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__Question_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1916:1: ( ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:1917:1: ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:1917:1: ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:1918:2: ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:1919:2: ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:1919:3: rule__Question_Impl__IncorrectfeedbackAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Question_Impl__IncorrectfeedbackAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackAssignment_4_1()); 

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
    // $ANTLR end "rule__Question_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalUpctformaevalua.g:1928:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1932:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUpctformaevalua.g:1933:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalUpctformaevalua.g:1940:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1944:1: ( ( ( '-' )? ) )
            // InternalUpctformaevalua.g:1945:1: ( ( '-' )? )
            {
            // InternalUpctformaevalua.g:1945:1: ( ( '-' )? )
            // InternalUpctformaevalua.g:1946:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalUpctformaevalua.g:1947:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctformaevalua.g:1947:3: '-'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalUpctformaevalua.g:1955:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1959:1: ( rule__EInt__Group__1__Impl )
            // InternalUpctformaevalua.g:1960:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalUpctformaevalua.g:1966:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1970:1: ( ( RULE_INT ) )
            // InternalUpctformaevalua.g:1971:1: ( RULE_INT )
            {
            // InternalUpctformaevalua.g:1971:1: ( RULE_INT )
            // InternalUpctformaevalua.g:1972:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__0"
    // InternalUpctformaevalua.g:1982:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1986:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalUpctformaevalua.g:1987:2: rule__Training__Group__0__Impl rule__Training__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Training__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__1();

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
    // $ANTLR end "rule__Training__Group__0"


    // $ANTLR start "rule__Training__Group__0__Impl"
    // InternalUpctformaevalua.g:1994:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1998:1: ( ( () ) )
            // InternalUpctformaevalua.g:1999:1: ( () )
            {
            // InternalUpctformaevalua.g:1999:1: ( () )
            // InternalUpctformaevalua.g:2000:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalUpctformaevalua.g:2001:2: ()
            // InternalUpctformaevalua.g:2001:3: 
            {
            }

             after(grammarAccess.getTrainingAccess().getTrainingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__0__Impl"


    // $ANTLR start "rule__Training__Group__1"
    // InternalUpctformaevalua.g:2009:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2013:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalUpctformaevalua.g:2014:2: rule__Training__Group__1__Impl rule__Training__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Training__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__2();

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
    // $ANTLR end "rule__Training__Group__1"


    // $ANTLR start "rule__Training__Group__1__Impl"
    // InternalUpctformaevalua.g:2021:1: rule__Training__Group__1__Impl : ( 'Training' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2025:1: ( ( 'Training' ) )
            // InternalUpctformaevalua.g:2026:1: ( 'Training' )
            {
            // InternalUpctformaevalua.g:2026:1: ( 'Training' )
            // InternalUpctformaevalua.g:2027:2: 'Training'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 

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
    // $ANTLR end "rule__Training__Group__1__Impl"


    // $ANTLR start "rule__Training__Group__2"
    // InternalUpctformaevalua.g:2036:1: rule__Training__Group__2 : rule__Training__Group__2__Impl rule__Training__Group__3 ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2040:1: ( rule__Training__Group__2__Impl rule__Training__Group__3 )
            // InternalUpctformaevalua.g:2041:2: rule__Training__Group__2__Impl rule__Training__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Training__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__3();

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
    // $ANTLR end "rule__Training__Group__2"


    // $ANTLR start "rule__Training__Group__2__Impl"
    // InternalUpctformaevalua.g:2048:1: rule__Training__Group__2__Impl : ( ( rule__Training__NameAssignment_2 ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2052:1: ( ( ( rule__Training__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:2053:1: ( ( rule__Training__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:2053:1: ( ( rule__Training__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:2054:2: ( rule__Training__NameAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:2055:2: ( rule__Training__NameAssignment_2 )
            // InternalUpctformaevalua.g:2055:3: rule__Training__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Training__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Training__Group__2__Impl"


    // $ANTLR start "rule__Training__Group__3"
    // InternalUpctformaevalua.g:2063:1: rule__Training__Group__3 : rule__Training__Group__3__Impl rule__Training__Group__4 ;
    public final void rule__Training__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2067:1: ( rule__Training__Group__3__Impl rule__Training__Group__4 )
            // InternalUpctformaevalua.g:2068:2: rule__Training__Group__3__Impl rule__Training__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__4();

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
    // $ANTLR end "rule__Training__Group__3"


    // $ANTLR start "rule__Training__Group__3__Impl"
    // InternalUpctformaevalua.g:2075:1: rule__Training__Group__3__Impl : ( '{' ) ;
    public final void rule__Training__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2079:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2080:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2080:1: ( '{' )
            // InternalUpctformaevalua.g:2081:2: '{'
            {
             before(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Training__Group__3__Impl"


    // $ANTLR start "rule__Training__Group__4"
    // InternalUpctformaevalua.g:2090:1: rule__Training__Group__4 : rule__Training__Group__4__Impl rule__Training__Group__5 ;
    public final void rule__Training__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2094:1: ( rule__Training__Group__4__Impl rule__Training__Group__5 )
            // InternalUpctformaevalua.g:2095:2: rule__Training__Group__4__Impl rule__Training__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__5();

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
    // $ANTLR end "rule__Training__Group__4"


    // $ANTLR start "rule__Training__Group__4__Impl"
    // InternalUpctformaevalua.g:2102:1: rule__Training__Group__4__Impl : ( ( rule__Training__Group_4__0 )? ) ;
    public final void rule__Training__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2106:1: ( ( ( rule__Training__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:2107:1: ( ( rule__Training__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:2107:1: ( ( rule__Training__Group_4__0 )? )
            // InternalUpctformaevalua.g:2108:2: ( rule__Training__Group_4__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:2109:2: ( rule__Training__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUpctformaevalua.g:2109:3: rule__Training__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Training__Group__4__Impl"


    // $ANTLR start "rule__Training__Group__5"
    // InternalUpctformaevalua.g:2117:1: rule__Training__Group__5 : rule__Training__Group__5__Impl rule__Training__Group__6 ;
    public final void rule__Training__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2121:1: ( rule__Training__Group__5__Impl rule__Training__Group__6 )
            // InternalUpctformaevalua.g:2122:2: rule__Training__Group__5__Impl rule__Training__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__6();

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
    // $ANTLR end "rule__Training__Group__5"


    // $ANTLR start "rule__Training__Group__5__Impl"
    // InternalUpctformaevalua.g:2129:1: rule__Training__Group__5__Impl : ( ( rule__Training__Group_5__0 )? ) ;
    public final void rule__Training__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2133:1: ( ( ( rule__Training__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:2134:1: ( ( rule__Training__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:2134:1: ( ( rule__Training__Group_5__0 )? )
            // InternalUpctformaevalua.g:2135:2: ( rule__Training__Group_5__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:2136:2: ( rule__Training__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctformaevalua.g:2136:3: rule__Training__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Training__Group__5__Impl"


    // $ANTLR start "rule__Training__Group__6"
    // InternalUpctformaevalua.g:2144:1: rule__Training__Group__6 : rule__Training__Group__6__Impl rule__Training__Group__7 ;
    public final void rule__Training__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2148:1: ( rule__Training__Group__6__Impl rule__Training__Group__7 )
            // InternalUpctformaevalua.g:2149:2: rule__Training__Group__6__Impl rule__Training__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__7();

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
    // $ANTLR end "rule__Training__Group__6"


    // $ANTLR start "rule__Training__Group__6__Impl"
    // InternalUpctformaevalua.g:2156:1: rule__Training__Group__6__Impl : ( ( rule__Training__Group_6__0 )? ) ;
    public final void rule__Training__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2160:1: ( ( ( rule__Training__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:2161:1: ( ( rule__Training__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:2161:1: ( ( rule__Training__Group_6__0 )? )
            // InternalUpctformaevalua.g:2162:2: ( rule__Training__Group_6__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:2163:2: ( rule__Training__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctformaevalua.g:2163:3: rule__Training__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Training__Group__6__Impl"


    // $ANTLR start "rule__Training__Group__7"
    // InternalUpctformaevalua.g:2171:1: rule__Training__Group__7 : rule__Training__Group__7__Impl rule__Training__Group__8 ;
    public final void rule__Training__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2175:1: ( rule__Training__Group__7__Impl rule__Training__Group__8 )
            // InternalUpctformaevalua.g:2176:2: rule__Training__Group__7__Impl rule__Training__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Training__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__8();

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
    // $ANTLR end "rule__Training__Group__7"


    // $ANTLR start "rule__Training__Group__7__Impl"
    // InternalUpctformaevalua.g:2183:1: rule__Training__Group__7__Impl : ( ( rule__Training__Group_7__0 )? ) ;
    public final void rule__Training__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2187:1: ( ( ( rule__Training__Group_7__0 )? ) )
            // InternalUpctformaevalua.g:2188:1: ( ( rule__Training__Group_7__0 )? )
            {
            // InternalUpctformaevalua.g:2188:1: ( ( rule__Training__Group_7__0 )? )
            // InternalUpctformaevalua.g:2189:2: ( rule__Training__Group_7__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_7()); 
            // InternalUpctformaevalua.g:2190:2: ( rule__Training__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUpctformaevalua.g:2190:3: rule__Training__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Training__Group__7__Impl"


    // $ANTLR start "rule__Training__Group__8"
    // InternalUpctformaevalua.g:2198:1: rule__Training__Group__8 : rule__Training__Group__8__Impl ;
    public final void rule__Training__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2202:1: ( rule__Training__Group__8__Impl )
            // InternalUpctformaevalua.g:2203:2: rule__Training__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__8__Impl();

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
    // $ANTLR end "rule__Training__Group__8"


    // $ANTLR start "rule__Training__Group__8__Impl"
    // InternalUpctformaevalua.g:2209:1: rule__Training__Group__8__Impl : ( '}' ) ;
    public final void rule__Training__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2213:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2214:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2214:1: ( '}' )
            // InternalUpctformaevalua.g:2215:2: '}'
            {
             before(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Training__Group__8__Impl"


    // $ANTLR start "rule__Training__Group_4__0"
    // InternalUpctformaevalua.g:2225:1: rule__Training__Group_4__0 : rule__Training__Group_4__0__Impl rule__Training__Group_4__1 ;
    public final void rule__Training__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2229:1: ( rule__Training__Group_4__0__Impl rule__Training__Group_4__1 )
            // InternalUpctformaevalua.g:2230:2: rule__Training__Group_4__0__Impl rule__Training__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Training__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_4__1();

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
    // $ANTLR end "rule__Training__Group_4__0"


    // $ANTLR start "rule__Training__Group_4__0__Impl"
    // InternalUpctformaevalua.g:2237:1: rule__Training__Group_4__0__Impl : ( 'numberquestions' ) ;
    public final void rule__Training__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2241:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:2242:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:2242:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:2243:2: 'numberquestions'
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getNumberquestionsKeyword_4_0()); 

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
    // $ANTLR end "rule__Training__Group_4__0__Impl"


    // $ANTLR start "rule__Training__Group_4__1"
    // InternalUpctformaevalua.g:2252:1: rule__Training__Group_4__1 : rule__Training__Group_4__1__Impl ;
    public final void rule__Training__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2256:1: ( rule__Training__Group_4__1__Impl )
            // InternalUpctformaevalua.g:2257:2: rule__Training__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_4__1__Impl();

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
    // $ANTLR end "rule__Training__Group_4__1"


    // $ANTLR start "rule__Training__Group_4__1__Impl"
    // InternalUpctformaevalua.g:2263:1: rule__Training__Group_4__1__Impl : ( ( rule__Training__NumberquestionsAssignment_4_1 ) ) ;
    public final void rule__Training__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2267:1: ( ( ( rule__Training__NumberquestionsAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:2268:1: ( ( rule__Training__NumberquestionsAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:2268:1: ( ( rule__Training__NumberquestionsAssignment_4_1 ) )
            // InternalUpctformaevalua.g:2269:2: ( rule__Training__NumberquestionsAssignment_4_1 )
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsAssignment_4_1()); 
            // InternalUpctformaevalua.g:2270:2: ( rule__Training__NumberquestionsAssignment_4_1 )
            // InternalUpctformaevalua.g:2270:3: rule__Training__NumberquestionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__NumberquestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getNumberquestionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Training__Group_4__1__Impl"


    // $ANTLR start "rule__Training__Group_5__0"
    // InternalUpctformaevalua.g:2279:1: rule__Training__Group_5__0 : rule__Training__Group_5__0__Impl rule__Training__Group_5__1 ;
    public final void rule__Training__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2283:1: ( rule__Training__Group_5__0__Impl rule__Training__Group_5__1 )
            // InternalUpctformaevalua.g:2284:2: rule__Training__Group_5__0__Impl rule__Training__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Training__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_5__1();

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
    // $ANTLR end "rule__Training__Group_5__0"


    // $ANTLR start "rule__Training__Group_5__0__Impl"
    // InternalUpctformaevalua.g:2291:1: rule__Training__Group_5__0__Impl : ( 'Attempts' ) ;
    public final void rule__Training__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2295:1: ( ( 'Attempts' ) )
            // InternalUpctformaevalua.g:2296:1: ( 'Attempts' )
            {
            // InternalUpctformaevalua.g:2296:1: ( 'Attempts' )
            // InternalUpctformaevalua.g:2297:2: 'Attempts'
            {
             before(grammarAccess.getTrainingAccess().getAttemptsKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getAttemptsKeyword_5_0()); 

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
    // $ANTLR end "rule__Training__Group_5__0__Impl"


    // $ANTLR start "rule__Training__Group_5__1"
    // InternalUpctformaevalua.g:2306:1: rule__Training__Group_5__1 : rule__Training__Group_5__1__Impl ;
    public final void rule__Training__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2310:1: ( rule__Training__Group_5__1__Impl )
            // InternalUpctformaevalua.g:2311:2: rule__Training__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_5__1__Impl();

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
    // $ANTLR end "rule__Training__Group_5__1"


    // $ANTLR start "rule__Training__Group_5__1__Impl"
    // InternalUpctformaevalua.g:2317:1: rule__Training__Group_5__1__Impl : ( ( rule__Training__AttemptsAssignment_5_1 ) ) ;
    public final void rule__Training__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2321:1: ( ( ( rule__Training__AttemptsAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:2322:1: ( ( rule__Training__AttemptsAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:2322:1: ( ( rule__Training__AttemptsAssignment_5_1 ) )
            // InternalUpctformaevalua.g:2323:2: ( rule__Training__AttemptsAssignment_5_1 )
            {
             before(grammarAccess.getTrainingAccess().getAttemptsAssignment_5_1()); 
            // InternalUpctformaevalua.g:2324:2: ( rule__Training__AttemptsAssignment_5_1 )
            // InternalUpctformaevalua.g:2324:3: rule__Training__AttemptsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__AttemptsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getAttemptsAssignment_5_1()); 

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
    // $ANTLR end "rule__Training__Group_5__1__Impl"


    // $ANTLR start "rule__Training__Group_6__0"
    // InternalUpctformaevalua.g:2333:1: rule__Training__Group_6__0 : rule__Training__Group_6__0__Impl rule__Training__Group_6__1 ;
    public final void rule__Training__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2337:1: ( rule__Training__Group_6__0__Impl rule__Training__Group_6__1 )
            // InternalUpctformaevalua.g:2338:2: rule__Training__Group_6__0__Impl rule__Training__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Training__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_6__1();

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
    // $ANTLR end "rule__Training__Group_6__0"


    // $ANTLR start "rule__Training__Group_6__0__Impl"
    // InternalUpctformaevalua.g:2345:1: rule__Training__Group_6__0__Impl : ( 'grade' ) ;
    public final void rule__Training__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2349:1: ( ( 'grade' ) )
            // InternalUpctformaevalua.g:2350:1: ( 'grade' )
            {
            // InternalUpctformaevalua.g:2350:1: ( 'grade' )
            // InternalUpctformaevalua.g:2351:2: 'grade'
            {
             before(grammarAccess.getTrainingAccess().getGradeKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getGradeKeyword_6_0()); 

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
    // $ANTLR end "rule__Training__Group_6__0__Impl"


    // $ANTLR start "rule__Training__Group_6__1"
    // InternalUpctformaevalua.g:2360:1: rule__Training__Group_6__1 : rule__Training__Group_6__1__Impl ;
    public final void rule__Training__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2364:1: ( rule__Training__Group_6__1__Impl )
            // InternalUpctformaevalua.g:2365:2: rule__Training__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_6__1__Impl();

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
    // $ANTLR end "rule__Training__Group_6__1"


    // $ANTLR start "rule__Training__Group_6__1__Impl"
    // InternalUpctformaevalua.g:2371:1: rule__Training__Group_6__1__Impl : ( ( rule__Training__GradeAssignment_6_1 ) ) ;
    public final void rule__Training__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2375:1: ( ( ( rule__Training__GradeAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:2376:1: ( ( rule__Training__GradeAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:2376:1: ( ( rule__Training__GradeAssignment_6_1 ) )
            // InternalUpctformaevalua.g:2377:2: ( rule__Training__GradeAssignment_6_1 )
            {
             before(grammarAccess.getTrainingAccess().getGradeAssignment_6_1()); 
            // InternalUpctformaevalua.g:2378:2: ( rule__Training__GradeAssignment_6_1 )
            // InternalUpctformaevalua.g:2378:3: rule__Training__GradeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__GradeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGradeAssignment_6_1()); 

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
    // $ANTLR end "rule__Training__Group_6__1__Impl"


    // $ANTLR start "rule__Training__Group_7__0"
    // InternalUpctformaevalua.g:2387:1: rule__Training__Group_7__0 : rule__Training__Group_7__0__Impl rule__Training__Group_7__1 ;
    public final void rule__Training__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2391:1: ( rule__Training__Group_7__0__Impl rule__Training__Group_7__1 )
            // InternalUpctformaevalua.g:2392:2: rule__Training__Group_7__0__Impl rule__Training__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Training__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__1();

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
    // $ANTLR end "rule__Training__Group_7__0"


    // $ANTLR start "rule__Training__Group_7__0__Impl"
    // InternalUpctformaevalua.g:2399:1: rule__Training__Group_7__0__Impl : ( 'questions' ) ;
    public final void rule__Training__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2403:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:2404:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:2404:1: ( 'questions' )
            // InternalUpctformaevalua.g:2405:2: 'questions'
            {
             before(grammarAccess.getTrainingAccess().getQuestionsKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getQuestionsKeyword_7_0()); 

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
    // $ANTLR end "rule__Training__Group_7__0__Impl"


    // $ANTLR start "rule__Training__Group_7__1"
    // InternalUpctformaevalua.g:2414:1: rule__Training__Group_7__1 : rule__Training__Group_7__1__Impl rule__Training__Group_7__2 ;
    public final void rule__Training__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2418:1: ( rule__Training__Group_7__1__Impl rule__Training__Group_7__2 )
            // InternalUpctformaevalua.g:2419:2: rule__Training__Group_7__1__Impl rule__Training__Group_7__2
            {
            pushFollow(FOLLOW_17);
            rule__Training__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__2();

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
    // $ANTLR end "rule__Training__Group_7__1"


    // $ANTLR start "rule__Training__Group_7__1__Impl"
    // InternalUpctformaevalua.g:2426:1: rule__Training__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Training__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2430:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2431:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2431:1: ( '{' )
            // InternalUpctformaevalua.g:2432:2: '{'
            {
             before(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Training__Group_7__1__Impl"


    // $ANTLR start "rule__Training__Group_7__2"
    // InternalUpctformaevalua.g:2441:1: rule__Training__Group_7__2 : rule__Training__Group_7__2__Impl rule__Training__Group_7__3 ;
    public final void rule__Training__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2445:1: ( rule__Training__Group_7__2__Impl rule__Training__Group_7__3 )
            // InternalUpctformaevalua.g:2446:2: rule__Training__Group_7__2__Impl rule__Training__Group_7__3
            {
            pushFollow(FOLLOW_18);
            rule__Training__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__3();

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
    // $ANTLR end "rule__Training__Group_7__2"


    // $ANTLR start "rule__Training__Group_7__2__Impl"
    // InternalUpctformaevalua.g:2453:1: rule__Training__Group_7__2__Impl : ( ( rule__Training__QuestionsAssignment_7_2 ) ) ;
    public final void rule__Training__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2457:1: ( ( ( rule__Training__QuestionsAssignment_7_2 ) ) )
            // InternalUpctformaevalua.g:2458:1: ( ( rule__Training__QuestionsAssignment_7_2 ) )
            {
            // InternalUpctformaevalua.g:2458:1: ( ( rule__Training__QuestionsAssignment_7_2 ) )
            // InternalUpctformaevalua.g:2459:2: ( rule__Training__QuestionsAssignment_7_2 )
            {
             before(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_2()); 
            // InternalUpctformaevalua.g:2460:2: ( rule__Training__QuestionsAssignment_7_2 )
            // InternalUpctformaevalua.g:2460:3: rule__Training__QuestionsAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Training__QuestionsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_2()); 

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
    // $ANTLR end "rule__Training__Group_7__2__Impl"


    // $ANTLR start "rule__Training__Group_7__3"
    // InternalUpctformaevalua.g:2468:1: rule__Training__Group_7__3 : rule__Training__Group_7__3__Impl rule__Training__Group_7__4 ;
    public final void rule__Training__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2472:1: ( rule__Training__Group_7__3__Impl rule__Training__Group_7__4 )
            // InternalUpctformaevalua.g:2473:2: rule__Training__Group_7__3__Impl rule__Training__Group_7__4
            {
            pushFollow(FOLLOW_18);
            rule__Training__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7__4();

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
    // $ANTLR end "rule__Training__Group_7__3"


    // $ANTLR start "rule__Training__Group_7__3__Impl"
    // InternalUpctformaevalua.g:2480:1: rule__Training__Group_7__3__Impl : ( ( rule__Training__Group_7_3__0 )* ) ;
    public final void rule__Training__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2484:1: ( ( ( rule__Training__Group_7_3__0 )* ) )
            // InternalUpctformaevalua.g:2485:1: ( ( rule__Training__Group_7_3__0 )* )
            {
            // InternalUpctformaevalua.g:2485:1: ( ( rule__Training__Group_7_3__0 )* )
            // InternalUpctformaevalua.g:2486:2: ( rule__Training__Group_7_3__0 )*
            {
             before(grammarAccess.getTrainingAccess().getGroup_7_3()); 
            // InternalUpctformaevalua.g:2487:2: ( rule__Training__Group_7_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUpctformaevalua.g:2487:3: rule__Training__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Training__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTrainingAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__Training__Group_7__3__Impl"


    // $ANTLR start "rule__Training__Group_7__4"
    // InternalUpctformaevalua.g:2495:1: rule__Training__Group_7__4 : rule__Training__Group_7__4__Impl ;
    public final void rule__Training__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2499:1: ( rule__Training__Group_7__4__Impl )
            // InternalUpctformaevalua.g:2500:2: rule__Training__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_7__4__Impl();

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
    // $ANTLR end "rule__Training__Group_7__4"


    // $ANTLR start "rule__Training__Group_7__4__Impl"
    // InternalUpctformaevalua.g:2506:1: rule__Training__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Training__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2510:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2511:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2511:1: ( '}' )
            // InternalUpctformaevalua.g:2512:2: '}'
            {
             before(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Training__Group_7__4__Impl"


    // $ANTLR start "rule__Training__Group_7_3__0"
    // InternalUpctformaevalua.g:2522:1: rule__Training__Group_7_3__0 : rule__Training__Group_7_3__0__Impl rule__Training__Group_7_3__1 ;
    public final void rule__Training__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2526:1: ( rule__Training__Group_7_3__0__Impl rule__Training__Group_7_3__1 )
            // InternalUpctformaevalua.g:2527:2: rule__Training__Group_7_3__0__Impl rule__Training__Group_7_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Training__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_7_3__1();

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
    // $ANTLR end "rule__Training__Group_7_3__0"


    // $ANTLR start "rule__Training__Group_7_3__0__Impl"
    // InternalUpctformaevalua.g:2534:1: rule__Training__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Training__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2538:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:2539:1: ( ',' )
            {
            // InternalUpctformaevalua.g:2539:1: ( ',' )
            // InternalUpctformaevalua.g:2540:2: ','
            {
             before(grammarAccess.getTrainingAccess().getCommaKeyword_7_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__Training__Group_7_3__0__Impl"


    // $ANTLR start "rule__Training__Group_7_3__1"
    // InternalUpctformaevalua.g:2549:1: rule__Training__Group_7_3__1 : rule__Training__Group_7_3__1__Impl ;
    public final void rule__Training__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2553:1: ( rule__Training__Group_7_3__1__Impl )
            // InternalUpctformaevalua.g:2554:2: rule__Training__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Training__Group_7_3__1"


    // $ANTLR start "rule__Training__Group_7_3__1__Impl"
    // InternalUpctformaevalua.g:2560:1: rule__Training__Group_7_3__1__Impl : ( ( rule__Training__QuestionsAssignment_7_3_1 ) ) ;
    public final void rule__Training__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2564:1: ( ( ( rule__Training__QuestionsAssignment_7_3_1 ) ) )
            // InternalUpctformaevalua.g:2565:1: ( ( rule__Training__QuestionsAssignment_7_3_1 ) )
            {
            // InternalUpctformaevalua.g:2565:1: ( ( rule__Training__QuestionsAssignment_7_3_1 ) )
            // InternalUpctformaevalua.g:2566:2: ( rule__Training__QuestionsAssignment_7_3_1 )
            {
             before(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_3_1()); 
            // InternalUpctformaevalua.g:2567:2: ( rule__Training__QuestionsAssignment_7_3_1 )
            // InternalUpctformaevalua.g:2567:3: rule__Training__QuestionsAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__QuestionsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getQuestionsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__Training__Group_7_3__1__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // InternalUpctformaevalua.g:2576:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2580:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalUpctformaevalua.g:2581:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__1();

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
    // $ANTLR end "rule__Final__Group__0"


    // $ANTLR start "rule__Final__Group__0__Impl"
    // InternalUpctformaevalua.g:2588:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2592:1: ( ( () ) )
            // InternalUpctformaevalua.g:2593:1: ( () )
            {
            // InternalUpctformaevalua.g:2593:1: ( () )
            // InternalUpctformaevalua.g:2594:2: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // InternalUpctformaevalua.g:2595:2: ()
            // InternalUpctformaevalua.g:2595:3: 
            {
            }

             after(grammarAccess.getFinalAccess().getFinalAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0__Impl"


    // $ANTLR start "rule__Final__Group__1"
    // InternalUpctformaevalua.g:2603:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2607:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalUpctformaevalua.g:2608:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__2();

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
    // $ANTLR end "rule__Final__Group__1"


    // $ANTLR start "rule__Final__Group__1__Impl"
    // InternalUpctformaevalua.g:2615:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2619:1: ( ( 'Final' ) )
            // InternalUpctformaevalua.g:2620:1: ( 'Final' )
            {
            // InternalUpctformaevalua.g:2620:1: ( 'Final' )
            // InternalUpctformaevalua.g:2621:2: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getFinalKeyword_1()); 

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
    // $ANTLR end "rule__Final__Group__1__Impl"


    // $ANTLR start "rule__Final__Group__2"
    // InternalUpctformaevalua.g:2630:1: rule__Final__Group__2 : rule__Final__Group__2__Impl rule__Final__Group__3 ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2634:1: ( rule__Final__Group__2__Impl rule__Final__Group__3 )
            // InternalUpctformaevalua.g:2635:2: rule__Final__Group__2__Impl rule__Final__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Final__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__3();

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
    // $ANTLR end "rule__Final__Group__2"


    // $ANTLR start "rule__Final__Group__2__Impl"
    // InternalUpctformaevalua.g:2642:1: rule__Final__Group__2__Impl : ( ( rule__Final__NameAssignment_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2646:1: ( ( ( rule__Final__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:2647:1: ( ( rule__Final__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:2647:1: ( ( rule__Final__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:2648:2: ( rule__Final__NameAssignment_2 )
            {
             before(grammarAccess.getFinalAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:2649:2: ( rule__Final__NameAssignment_2 )
            // InternalUpctformaevalua.g:2649:3: rule__Final__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Final__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Final__Group__2__Impl"


    // $ANTLR start "rule__Final__Group__3"
    // InternalUpctformaevalua.g:2657:1: rule__Final__Group__3 : rule__Final__Group__3__Impl rule__Final__Group__4 ;
    public final void rule__Final__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2661:1: ( rule__Final__Group__3__Impl rule__Final__Group__4 )
            // InternalUpctformaevalua.g:2662:2: rule__Final__Group__3__Impl rule__Final__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Final__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__4();

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
    // $ANTLR end "rule__Final__Group__3"


    // $ANTLR start "rule__Final__Group__3__Impl"
    // InternalUpctformaevalua.g:2669:1: rule__Final__Group__3__Impl : ( '{' ) ;
    public final void rule__Final__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2673:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2674:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2674:1: ( '{' )
            // InternalUpctformaevalua.g:2675:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Final__Group__3__Impl"


    // $ANTLR start "rule__Final__Group__4"
    // InternalUpctformaevalua.g:2684:1: rule__Final__Group__4 : rule__Final__Group__4__Impl rule__Final__Group__5 ;
    public final void rule__Final__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2688:1: ( rule__Final__Group__4__Impl rule__Final__Group__5 )
            // InternalUpctformaevalua.g:2689:2: rule__Final__Group__4__Impl rule__Final__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Final__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__5();

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
    // $ANTLR end "rule__Final__Group__4"


    // $ANTLR start "rule__Final__Group__4__Impl"
    // InternalUpctformaevalua.g:2696:1: rule__Final__Group__4__Impl : ( ( rule__Final__Group_4__0 )? ) ;
    public final void rule__Final__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2700:1: ( ( ( rule__Final__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:2701:1: ( ( rule__Final__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:2701:1: ( ( rule__Final__Group_4__0 )? )
            // InternalUpctformaevalua.g:2702:2: ( rule__Final__Group_4__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:2703:2: ( rule__Final__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctformaevalua.g:2703:3: rule__Final__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Final__Group__4__Impl"


    // $ANTLR start "rule__Final__Group__5"
    // InternalUpctformaevalua.g:2711:1: rule__Final__Group__5 : rule__Final__Group__5__Impl rule__Final__Group__6 ;
    public final void rule__Final__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2715:1: ( rule__Final__Group__5__Impl rule__Final__Group__6 )
            // InternalUpctformaevalua.g:2716:2: rule__Final__Group__5__Impl rule__Final__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Final__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__6();

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
    // $ANTLR end "rule__Final__Group__5"


    // $ANTLR start "rule__Final__Group__5__Impl"
    // InternalUpctformaevalua.g:2723:1: rule__Final__Group__5__Impl : ( ( rule__Final__Group_5__0 )? ) ;
    public final void rule__Final__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2727:1: ( ( ( rule__Final__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:2728:1: ( ( rule__Final__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:2728:1: ( ( rule__Final__Group_5__0 )? )
            // InternalUpctformaevalua.g:2729:2: ( rule__Final__Group_5__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:2730:2: ( rule__Final__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctformaevalua.g:2730:3: rule__Final__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Final__Group__5__Impl"


    // $ANTLR start "rule__Final__Group__6"
    // InternalUpctformaevalua.g:2738:1: rule__Final__Group__6 : rule__Final__Group__6__Impl ;
    public final void rule__Final__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2742:1: ( rule__Final__Group__6__Impl )
            // InternalUpctformaevalua.g:2743:2: rule__Final__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__6__Impl();

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
    // $ANTLR end "rule__Final__Group__6"


    // $ANTLR start "rule__Final__Group__6__Impl"
    // InternalUpctformaevalua.g:2749:1: rule__Final__Group__6__Impl : ( '}' ) ;
    public final void rule__Final__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2753:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2754:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2754:1: ( '}' )
            // InternalUpctformaevalua.g:2755:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Final__Group__6__Impl"


    // $ANTLR start "rule__Final__Group_4__0"
    // InternalUpctformaevalua.g:2765:1: rule__Final__Group_4__0 : rule__Final__Group_4__0__Impl rule__Final__Group_4__1 ;
    public final void rule__Final__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2769:1: ( rule__Final__Group_4__0__Impl rule__Final__Group_4__1 )
            // InternalUpctformaevalua.g:2770:2: rule__Final__Group_4__0__Impl rule__Final__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Final__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_4__1();

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
    // $ANTLR end "rule__Final__Group_4__0"


    // $ANTLR start "rule__Final__Group_4__0__Impl"
    // InternalUpctformaevalua.g:2777:1: rule__Final__Group_4__0__Impl : ( 'numberquestions' ) ;
    public final void rule__Final__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2781:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:2782:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:2782:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:2783:2: 'numberquestions'
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getNumberquestionsKeyword_4_0()); 

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
    // $ANTLR end "rule__Final__Group_4__0__Impl"


    // $ANTLR start "rule__Final__Group_4__1"
    // InternalUpctformaevalua.g:2792:1: rule__Final__Group_4__1 : rule__Final__Group_4__1__Impl ;
    public final void rule__Final__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2796:1: ( rule__Final__Group_4__1__Impl )
            // InternalUpctformaevalua.g:2797:2: rule__Final__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_4__1__Impl();

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
    // $ANTLR end "rule__Final__Group_4__1"


    // $ANTLR start "rule__Final__Group_4__1__Impl"
    // InternalUpctformaevalua.g:2803:1: rule__Final__Group_4__1__Impl : ( ( rule__Final__NumberquestionsAssignment_4_1 ) ) ;
    public final void rule__Final__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2807:1: ( ( ( rule__Final__NumberquestionsAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:2808:1: ( ( rule__Final__NumberquestionsAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:2808:1: ( ( rule__Final__NumberquestionsAssignment_4_1 ) )
            // InternalUpctformaevalua.g:2809:2: ( rule__Final__NumberquestionsAssignment_4_1 )
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsAssignment_4_1()); 
            // InternalUpctformaevalua.g:2810:2: ( rule__Final__NumberquestionsAssignment_4_1 )
            // InternalUpctformaevalua.g:2810:3: rule__Final__NumberquestionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Final__NumberquestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getNumberquestionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Final__Group_4__1__Impl"


    // $ANTLR start "rule__Final__Group_5__0"
    // InternalUpctformaevalua.g:2819:1: rule__Final__Group_5__0 : rule__Final__Group_5__0__Impl rule__Final__Group_5__1 ;
    public final void rule__Final__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2823:1: ( rule__Final__Group_5__0__Impl rule__Final__Group_5__1 )
            // InternalUpctformaevalua.g:2824:2: rule__Final__Group_5__0__Impl rule__Final__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Final__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__1();

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
    // $ANTLR end "rule__Final__Group_5__0"


    // $ANTLR start "rule__Final__Group_5__0__Impl"
    // InternalUpctformaevalua.g:2831:1: rule__Final__Group_5__0__Impl : ( 'questions' ) ;
    public final void rule__Final__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2835:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:2836:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:2836:1: ( 'questions' )
            // InternalUpctformaevalua.g:2837:2: 'questions'
            {
             before(grammarAccess.getFinalAccess().getQuestionsKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getQuestionsKeyword_5_0()); 

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
    // $ANTLR end "rule__Final__Group_5__0__Impl"


    // $ANTLR start "rule__Final__Group_5__1"
    // InternalUpctformaevalua.g:2846:1: rule__Final__Group_5__1 : rule__Final__Group_5__1__Impl rule__Final__Group_5__2 ;
    public final void rule__Final__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2850:1: ( rule__Final__Group_5__1__Impl rule__Final__Group_5__2 )
            // InternalUpctformaevalua.g:2851:2: rule__Final__Group_5__1__Impl rule__Final__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__Final__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__2();

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
    // $ANTLR end "rule__Final__Group_5__1"


    // $ANTLR start "rule__Final__Group_5__1__Impl"
    // InternalUpctformaevalua.g:2858:1: rule__Final__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Final__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2862:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2863:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2863:1: ( '{' )
            // InternalUpctformaevalua.g:2864:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Final__Group_5__1__Impl"


    // $ANTLR start "rule__Final__Group_5__2"
    // InternalUpctformaevalua.g:2873:1: rule__Final__Group_5__2 : rule__Final__Group_5__2__Impl rule__Final__Group_5__3 ;
    public final void rule__Final__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2877:1: ( rule__Final__Group_5__2__Impl rule__Final__Group_5__3 )
            // InternalUpctformaevalua.g:2878:2: rule__Final__Group_5__2__Impl rule__Final__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__Final__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__3();

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
    // $ANTLR end "rule__Final__Group_5__2"


    // $ANTLR start "rule__Final__Group_5__2__Impl"
    // InternalUpctformaevalua.g:2885:1: rule__Final__Group_5__2__Impl : ( ( rule__Final__QuestionsAssignment_5_2 ) ) ;
    public final void rule__Final__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2889:1: ( ( ( rule__Final__QuestionsAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:2890:1: ( ( rule__Final__QuestionsAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:2890:1: ( ( rule__Final__QuestionsAssignment_5_2 ) )
            // InternalUpctformaevalua.g:2891:2: ( rule__Final__QuestionsAssignment_5_2 )
            {
             before(grammarAccess.getFinalAccess().getQuestionsAssignment_5_2()); 
            // InternalUpctformaevalua.g:2892:2: ( rule__Final__QuestionsAssignment_5_2 )
            // InternalUpctformaevalua.g:2892:3: rule__Final__QuestionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Final__QuestionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getQuestionsAssignment_5_2()); 

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
    // $ANTLR end "rule__Final__Group_5__2__Impl"


    // $ANTLR start "rule__Final__Group_5__3"
    // InternalUpctformaevalua.g:2900:1: rule__Final__Group_5__3 : rule__Final__Group_5__3__Impl rule__Final__Group_5__4 ;
    public final void rule__Final__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2904:1: ( rule__Final__Group_5__3__Impl rule__Final__Group_5__4 )
            // InternalUpctformaevalua.g:2905:2: rule__Final__Group_5__3__Impl rule__Final__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__Final__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5__4();

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
    // $ANTLR end "rule__Final__Group_5__3"


    // $ANTLR start "rule__Final__Group_5__3__Impl"
    // InternalUpctformaevalua.g:2912:1: rule__Final__Group_5__3__Impl : ( ( rule__Final__Group_5_3__0 )* ) ;
    public final void rule__Final__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2916:1: ( ( ( rule__Final__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:2917:1: ( ( rule__Final__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:2917:1: ( ( rule__Final__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:2918:2: ( rule__Final__Group_5_3__0 )*
            {
             before(grammarAccess.getFinalAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:2919:2: ( rule__Final__Group_5_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUpctformaevalua.g:2919:3: rule__Final__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Final__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFinalAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Final__Group_5__3__Impl"


    // $ANTLR start "rule__Final__Group_5__4"
    // InternalUpctformaevalua.g:2927:1: rule__Final__Group_5__4 : rule__Final__Group_5__4__Impl ;
    public final void rule__Final__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2931:1: ( rule__Final__Group_5__4__Impl )
            // InternalUpctformaevalua.g:2932:2: rule__Final__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_5__4__Impl();

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
    // $ANTLR end "rule__Final__Group_5__4"


    // $ANTLR start "rule__Final__Group_5__4__Impl"
    // InternalUpctformaevalua.g:2938:1: rule__Final__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Final__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2942:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2943:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2943:1: ( '}' )
            // InternalUpctformaevalua.g:2944:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Final__Group_5__4__Impl"


    // $ANTLR start "rule__Final__Group_5_3__0"
    // InternalUpctformaevalua.g:2954:1: rule__Final__Group_5_3__0 : rule__Final__Group_5_3__0__Impl rule__Final__Group_5_3__1 ;
    public final void rule__Final__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2958:1: ( rule__Final__Group_5_3__0__Impl rule__Final__Group_5_3__1 )
            // InternalUpctformaevalua.g:2959:2: rule__Final__Group_5_3__0__Impl rule__Final__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Final__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_5_3__1();

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
    // $ANTLR end "rule__Final__Group_5_3__0"


    // $ANTLR start "rule__Final__Group_5_3__0__Impl"
    // InternalUpctformaevalua.g:2966:1: rule__Final__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Final__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2970:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:2971:1: ( ',' )
            {
            // InternalUpctformaevalua.g:2971:1: ( ',' )
            // InternalUpctformaevalua.g:2972:2: ','
            {
             before(grammarAccess.getFinalAccess().getCommaKeyword_5_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Final__Group_5_3__0__Impl"


    // $ANTLR start "rule__Final__Group_5_3__1"
    // InternalUpctformaevalua.g:2981:1: rule__Final__Group_5_3__1 : rule__Final__Group_5_3__1__Impl ;
    public final void rule__Final__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2985:1: ( rule__Final__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:2986:2: rule__Final__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Final__Group_5_3__1"


    // $ANTLR start "rule__Final__Group_5_3__1__Impl"
    // InternalUpctformaevalua.g:2992:1: rule__Final__Group_5_3__1__Impl : ( ( rule__Final__QuestionsAssignment_5_3_1 ) ) ;
    public final void rule__Final__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2996:1: ( ( ( rule__Final__QuestionsAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:2997:1: ( ( rule__Final__QuestionsAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:2997:1: ( ( rule__Final__QuestionsAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:2998:2: ( rule__Final__QuestionsAssignment_5_3_1 )
            {
             before(grammarAccess.getFinalAccess().getQuestionsAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:2999:2: ( rule__Final__QuestionsAssignment_5_3_1 )
            // InternalUpctformaevalua.g:2999:3: rule__Final__QuestionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Final__QuestionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getQuestionsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Final__Group_5_3__1__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__0"
    // InternalUpctformaevalua.g:3008:1: rule__SingleAnswer__Group__0 : rule__SingleAnswer__Group__0__Impl rule__SingleAnswer__Group__1 ;
    public final void rule__SingleAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3012:1: ( rule__SingleAnswer__Group__0__Impl rule__SingleAnswer__Group__1 )
            // InternalUpctformaevalua.g:3013:2: rule__SingleAnswer__Group__0__Impl rule__SingleAnswer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__1();

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
    // $ANTLR end "rule__SingleAnswer__Group__0"


    // $ANTLR start "rule__SingleAnswer__Group__0__Impl"
    // InternalUpctformaevalua.g:3020:1: rule__SingleAnswer__Group__0__Impl : ( 'SingleAnswer' ) ;
    public final void rule__SingleAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3024:1: ( ( 'SingleAnswer' ) )
            // InternalUpctformaevalua.g:3025:1: ( 'SingleAnswer' )
            {
            // InternalUpctformaevalua.g:3025:1: ( 'SingleAnswer' )
            // InternalUpctformaevalua.g:3026:2: 'SingleAnswer'
            {
             before(grammarAccess.getSingleAnswerAccess().getSingleAnswerKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getSingleAnswerKeyword_0()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__0__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__1"
    // InternalUpctformaevalua.g:3035:1: rule__SingleAnswer__Group__1 : rule__SingleAnswer__Group__1__Impl rule__SingleAnswer__Group__2 ;
    public final void rule__SingleAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3039:1: ( rule__SingleAnswer__Group__1__Impl rule__SingleAnswer__Group__2 )
            // InternalUpctformaevalua.g:3040:2: rule__SingleAnswer__Group__1__Impl rule__SingleAnswer__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__SingleAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__2();

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
    // $ANTLR end "rule__SingleAnswer__Group__1"


    // $ANTLR start "rule__SingleAnswer__Group__1__Impl"
    // InternalUpctformaevalua.g:3047:1: rule__SingleAnswer__Group__1__Impl : ( '{' ) ;
    public final void rule__SingleAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3051:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3052:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3052:1: ( '{' )
            // InternalUpctformaevalua.g:3053:2: '{'
            {
             before(grammarAccess.getSingleAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__1__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__2"
    // InternalUpctformaevalua.g:3062:1: rule__SingleAnswer__Group__2 : rule__SingleAnswer__Group__2__Impl rule__SingleAnswer__Group__3 ;
    public final void rule__SingleAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3066:1: ( rule__SingleAnswer__Group__2__Impl rule__SingleAnswer__Group__3 )
            // InternalUpctformaevalua.g:3067:2: rule__SingleAnswer__Group__2__Impl rule__SingleAnswer__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SingleAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__3();

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
    // $ANTLR end "rule__SingleAnswer__Group__2"


    // $ANTLR start "rule__SingleAnswer__Group__2__Impl"
    // InternalUpctformaevalua.g:3074:1: rule__SingleAnswer__Group__2__Impl : ( 'statement' ) ;
    public final void rule__SingleAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3078:1: ( ( 'statement' ) )
            // InternalUpctformaevalua.g:3079:1: ( 'statement' )
            {
            // InternalUpctformaevalua.g:3079:1: ( 'statement' )
            // InternalUpctformaevalua.g:3080:2: 'statement'
            {
             before(grammarAccess.getSingleAnswerAccess().getStatementKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getStatementKeyword_2()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__2__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__3"
    // InternalUpctformaevalua.g:3089:1: rule__SingleAnswer__Group__3 : rule__SingleAnswer__Group__3__Impl rule__SingleAnswer__Group__4 ;
    public final void rule__SingleAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3093:1: ( rule__SingleAnswer__Group__3__Impl rule__SingleAnswer__Group__4 )
            // InternalUpctformaevalua.g:3094:2: rule__SingleAnswer__Group__3__Impl rule__SingleAnswer__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__SingleAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__4();

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
    // $ANTLR end "rule__SingleAnswer__Group__3"


    // $ANTLR start "rule__SingleAnswer__Group__3__Impl"
    // InternalUpctformaevalua.g:3101:1: rule__SingleAnswer__Group__3__Impl : ( ( rule__SingleAnswer__StatementsAssignment_3 ) ) ;
    public final void rule__SingleAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3105:1: ( ( ( rule__SingleAnswer__StatementsAssignment_3 ) ) )
            // InternalUpctformaevalua.g:3106:1: ( ( rule__SingleAnswer__StatementsAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:3106:1: ( ( rule__SingleAnswer__StatementsAssignment_3 ) )
            // InternalUpctformaevalua.g:3107:2: ( rule__SingleAnswer__StatementsAssignment_3 )
            {
             before(grammarAccess.getSingleAnswerAccess().getStatementsAssignment_3()); 
            // InternalUpctformaevalua.g:3108:2: ( rule__SingleAnswer__StatementsAssignment_3 )
            // InternalUpctformaevalua.g:3108:3: rule__SingleAnswer__StatementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleAnswerAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__3__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__4"
    // InternalUpctformaevalua.g:3116:1: rule__SingleAnswer__Group__4 : rule__SingleAnswer__Group__4__Impl rule__SingleAnswer__Group__5 ;
    public final void rule__SingleAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3120:1: ( rule__SingleAnswer__Group__4__Impl rule__SingleAnswer__Group__5 )
            // InternalUpctformaevalua.g:3121:2: rule__SingleAnswer__Group__4__Impl rule__SingleAnswer__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SingleAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__5();

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
    // $ANTLR end "rule__SingleAnswer__Group__4"


    // $ANTLR start "rule__SingleAnswer__Group__4__Impl"
    // InternalUpctformaevalua.g:3128:1: rule__SingleAnswer__Group__4__Impl : ( ( rule__SingleAnswer__Group_4__0 )? ) ;
    public final void rule__SingleAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3132:1: ( ( ( rule__SingleAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:3133:1: ( ( rule__SingleAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:3133:1: ( ( rule__SingleAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:3134:2: ( rule__SingleAnswer__Group_4__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:3135:2: ( rule__SingleAnswer__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctformaevalua.g:3135:3: rule__SingleAnswer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAnswer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleAnswerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__4__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__5"
    // InternalUpctformaevalua.g:3143:1: rule__SingleAnswer__Group__5 : rule__SingleAnswer__Group__5__Impl rule__SingleAnswer__Group__6 ;
    public final void rule__SingleAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3147:1: ( rule__SingleAnswer__Group__5__Impl rule__SingleAnswer__Group__6 )
            // InternalUpctformaevalua.g:3148:2: rule__SingleAnswer__Group__5__Impl rule__SingleAnswer__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__SingleAnswer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__6();

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
    // $ANTLR end "rule__SingleAnswer__Group__5"


    // $ANTLR start "rule__SingleAnswer__Group__5__Impl"
    // InternalUpctformaevalua.g:3155:1: rule__SingleAnswer__Group__5__Impl : ( ( rule__SingleAnswer__Group_5__0 )? ) ;
    public final void rule__SingleAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3159:1: ( ( ( rule__SingleAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:3160:1: ( ( rule__SingleAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:3160:1: ( ( rule__SingleAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:3161:2: ( rule__SingleAnswer__Group_5__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:3162:2: ( rule__SingleAnswer__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctformaevalua.g:3162:3: rule__SingleAnswer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAnswer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleAnswerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__5__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__6"
    // InternalUpctformaevalua.g:3170:1: rule__SingleAnswer__Group__6 : rule__SingleAnswer__Group__6__Impl rule__SingleAnswer__Group__7 ;
    public final void rule__SingleAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3174:1: ( rule__SingleAnswer__Group__6__Impl rule__SingleAnswer__Group__7 )
            // InternalUpctformaevalua.g:3175:2: rule__SingleAnswer__Group__6__Impl rule__SingleAnswer__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__SingleAnswer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__7();

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
    // $ANTLR end "rule__SingleAnswer__Group__6"


    // $ANTLR start "rule__SingleAnswer__Group__6__Impl"
    // InternalUpctformaevalua.g:3182:1: rule__SingleAnswer__Group__6__Impl : ( ( rule__SingleAnswer__Group_6__0 )? ) ;
    public final void rule__SingleAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3186:1: ( ( ( rule__SingleAnswer__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:3187:1: ( ( rule__SingleAnswer__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:3187:1: ( ( rule__SingleAnswer__Group_6__0 )? )
            // InternalUpctformaevalua.g:3188:2: ( rule__SingleAnswer__Group_6__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:3189:2: ( rule__SingleAnswer__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctformaevalua.g:3189:3: rule__SingleAnswer__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAnswer__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleAnswerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__6__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__7"
    // InternalUpctformaevalua.g:3197:1: rule__SingleAnswer__Group__7 : rule__SingleAnswer__Group__7__Impl rule__SingleAnswer__Group__8 ;
    public final void rule__SingleAnswer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3201:1: ( rule__SingleAnswer__Group__7__Impl rule__SingleAnswer__Group__8 )
            // InternalUpctformaevalua.g:3202:2: rule__SingleAnswer__Group__7__Impl rule__SingleAnswer__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__SingleAnswer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__8();

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
    // $ANTLR end "rule__SingleAnswer__Group__7"


    // $ANTLR start "rule__SingleAnswer__Group__7__Impl"
    // InternalUpctformaevalua.g:3209:1: rule__SingleAnswer__Group__7__Impl : ( ( rule__SingleAnswer__Group_7__0 )? ) ;
    public final void rule__SingleAnswer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3213:1: ( ( ( rule__SingleAnswer__Group_7__0 )? ) )
            // InternalUpctformaevalua.g:3214:1: ( ( rule__SingleAnswer__Group_7__0 )? )
            {
            // InternalUpctformaevalua.g:3214:1: ( ( rule__SingleAnswer__Group_7__0 )? )
            // InternalUpctformaevalua.g:3215:2: ( rule__SingleAnswer__Group_7__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_7()); 
            // InternalUpctformaevalua.g:3216:2: ( rule__SingleAnswer__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUpctformaevalua.g:3216:3: rule__SingleAnswer__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAnswer__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleAnswerAccess().getGroup_7()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__7__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__8"
    // InternalUpctformaevalua.g:3224:1: rule__SingleAnswer__Group__8 : rule__SingleAnswer__Group__8__Impl ;
    public final void rule__SingleAnswer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3228:1: ( rule__SingleAnswer__Group__8__Impl )
            // InternalUpctformaevalua.g:3229:2: rule__SingleAnswer__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group__8__Impl();

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
    // $ANTLR end "rule__SingleAnswer__Group__8"


    // $ANTLR start "rule__SingleAnswer__Group__8__Impl"
    // InternalUpctformaevalua.g:3235:1: rule__SingleAnswer__Group__8__Impl : ( '}' ) ;
    public final void rule__SingleAnswer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3239:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3240:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3240:1: ( '}' )
            // InternalUpctformaevalua.g:3241:2: '}'
            {
             before(grammarAccess.getSingleAnswerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__SingleAnswer__Group__8__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_4__0"
    // InternalUpctformaevalua.g:3251:1: rule__SingleAnswer__Group_4__0 : rule__SingleAnswer__Group_4__0__Impl rule__SingleAnswer__Group_4__1 ;
    public final void rule__SingleAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3255:1: ( rule__SingleAnswer__Group_4__0__Impl rule__SingleAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:3256:2: rule__SingleAnswer__Group_4__0__Impl rule__SingleAnswer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__SingleAnswer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_4__1();

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
    // $ANTLR end "rule__SingleAnswer__Group_4__0"


    // $ANTLR start "rule__SingleAnswer__Group_4__0__Impl"
    // InternalUpctformaevalua.g:3263:1: rule__SingleAnswer__Group_4__0__Impl : ( 'answers' ) ;
    public final void rule__SingleAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3267:1: ( ( 'answers' ) )
            // InternalUpctformaevalua.g:3268:1: ( 'answers' )
            {
            // InternalUpctformaevalua.g:3268:1: ( 'answers' )
            // InternalUpctformaevalua.g:3269:2: 'answers'
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getAnswersKeyword_4_0()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_4__0__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_4__1"
    // InternalUpctformaevalua.g:3278:1: rule__SingleAnswer__Group_4__1 : rule__SingleAnswer__Group_4__1__Impl rule__SingleAnswer__Group_4__2 ;
    public final void rule__SingleAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3282:1: ( rule__SingleAnswer__Group_4__1__Impl rule__SingleAnswer__Group_4__2 )
            // InternalUpctformaevalua.g:3283:2: rule__SingleAnswer__Group_4__1__Impl rule__SingleAnswer__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__SingleAnswer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_4__2();

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
    // $ANTLR end "rule__SingleAnswer__Group_4__1"


    // $ANTLR start "rule__SingleAnswer__Group_4__1__Impl"
    // InternalUpctformaevalua.g:3290:1: rule__SingleAnswer__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SingleAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3294:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3295:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3295:1: ( '{' )
            // InternalUpctformaevalua.g:3296:2: '{'
            {
             before(grammarAccess.getSingleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_4__1__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_4__2"
    // InternalUpctformaevalua.g:3305:1: rule__SingleAnswer__Group_4__2 : rule__SingleAnswer__Group_4__2__Impl rule__SingleAnswer__Group_4__3 ;
    public final void rule__SingleAnswer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3309:1: ( rule__SingleAnswer__Group_4__2__Impl rule__SingleAnswer__Group_4__3 )
            // InternalUpctformaevalua.g:3310:2: rule__SingleAnswer__Group_4__2__Impl rule__SingleAnswer__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__SingleAnswer__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_4__3();

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
    // $ANTLR end "rule__SingleAnswer__Group_4__2"


    // $ANTLR start "rule__SingleAnswer__Group_4__2__Impl"
    // InternalUpctformaevalua.g:3317:1: rule__SingleAnswer__Group_4__2__Impl : ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) ) ;
    public final void rule__SingleAnswer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3321:1: ( ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) ) )
            // InternalUpctformaevalua.g:3322:1: ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) )
            {
            // InternalUpctformaevalua.g:3322:1: ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) )
            // InternalUpctformaevalua.g:3323:2: ( rule__SingleAnswer__AnswersAssignment_4_2 )
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersAssignment_4_2()); 
            // InternalUpctformaevalua.g:3324:2: ( rule__SingleAnswer__AnswersAssignment_4_2 )
            // InternalUpctformaevalua.g:3324:3: rule__SingleAnswer__AnswersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__AnswersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSingleAnswerAccess().getAnswersAssignment_4_2()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_4__2__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_4__3"
    // InternalUpctformaevalua.g:3332:1: rule__SingleAnswer__Group_4__3 : rule__SingleAnswer__Group_4__3__Impl rule__SingleAnswer__Group_4__4 ;
    public final void rule__SingleAnswer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3336:1: ( rule__SingleAnswer__Group_4__3__Impl rule__SingleAnswer__Group_4__4 )
            // InternalUpctformaevalua.g:3337:2: rule__SingleAnswer__Group_4__3__Impl rule__SingleAnswer__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__SingleAnswer__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_4__4();

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
    // $ANTLR end "rule__SingleAnswer__Group_4__3"


    // $ANTLR start "rule__SingleAnswer__Group_4__3__Impl"
    // InternalUpctformaevalua.g:3344:1: rule__SingleAnswer__Group_4__3__Impl : ( ( rule__SingleAnswer__Group_4_3__0 )* ) ;
    public final void rule__SingleAnswer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3348:1: ( ( ( rule__SingleAnswer__Group_4_3__0 )* ) )
            // InternalUpctformaevalua.g:3349:1: ( ( rule__SingleAnswer__Group_4_3__0 )* )
            {
            // InternalUpctformaevalua.g:3349:1: ( ( rule__SingleAnswer__Group_4_3__0 )* )
            // InternalUpctformaevalua.g:3350:2: ( rule__SingleAnswer__Group_4_3__0 )*
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_4_3()); 
            // InternalUpctformaevalua.g:3351:2: ( rule__SingleAnswer__Group_4_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUpctformaevalua.g:3351:3: rule__SingleAnswer__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SingleAnswer__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getSingleAnswerAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_4__3__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_4__4"
    // InternalUpctformaevalua.g:3359:1: rule__SingleAnswer__Group_4__4 : rule__SingleAnswer__Group_4__4__Impl ;
    public final void rule__SingleAnswer__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3363:1: ( rule__SingleAnswer__Group_4__4__Impl )
            // InternalUpctformaevalua.g:3364:2: rule__SingleAnswer__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_4__4__Impl();

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
    // $ANTLR end "rule__SingleAnswer__Group_4__4"


    // $ANTLR start "rule__SingleAnswer__Group_4__4__Impl"
    // InternalUpctformaevalua.g:3370:1: rule__SingleAnswer__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SingleAnswer__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3374:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3375:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3375:1: ( '}' )
            // InternalUpctformaevalua.g:3376:2: '}'
            {
             before(grammarAccess.getSingleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_4__4__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_4_3__0"
    // InternalUpctformaevalua.g:3386:1: rule__SingleAnswer__Group_4_3__0 : rule__SingleAnswer__Group_4_3__0__Impl rule__SingleAnswer__Group_4_3__1 ;
    public final void rule__SingleAnswer__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3390:1: ( rule__SingleAnswer__Group_4_3__0__Impl rule__SingleAnswer__Group_4_3__1 )
            // InternalUpctformaevalua.g:3391:2: rule__SingleAnswer__Group_4_3__0__Impl rule__SingleAnswer__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SingleAnswer__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_4_3__1();

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
    // $ANTLR end "rule__SingleAnswer__Group_4_3__0"


    // $ANTLR start "rule__SingleAnswer__Group_4_3__0__Impl"
    // InternalUpctformaevalua.g:3398:1: rule__SingleAnswer__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__SingleAnswer__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3402:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:3403:1: ( ',' )
            {
            // InternalUpctformaevalua.g:3403:1: ( ',' )
            // InternalUpctformaevalua.g:3404:2: ','
            {
             before(grammarAccess.getSingleAnswerAccess().getCommaKeyword_4_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_4_3__0__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_4_3__1"
    // InternalUpctformaevalua.g:3413:1: rule__SingleAnswer__Group_4_3__1 : rule__SingleAnswer__Group_4_3__1__Impl ;
    public final void rule__SingleAnswer__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3417:1: ( rule__SingleAnswer__Group_4_3__1__Impl )
            // InternalUpctformaevalua.g:3418:2: rule__SingleAnswer__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__SingleAnswer__Group_4_3__1"


    // $ANTLR start "rule__SingleAnswer__Group_4_3__1__Impl"
    // InternalUpctformaevalua.g:3424:1: rule__SingleAnswer__Group_4_3__1__Impl : ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) ) ;
    public final void rule__SingleAnswer__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3428:1: ( ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) ) )
            // InternalUpctformaevalua.g:3429:1: ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) )
            {
            // InternalUpctformaevalua.g:3429:1: ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) )
            // InternalUpctformaevalua.g:3430:2: ( rule__SingleAnswer__AnswersAssignment_4_3_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersAssignment_4_3_1()); 
            // InternalUpctformaevalua.g:3431:2: ( rule__SingleAnswer__AnswersAssignment_4_3_1 )
            // InternalUpctformaevalua.g:3431:3: rule__SingleAnswer__AnswersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__AnswersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAnswerAccess().getAnswersAssignment_4_3_1()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_4_3__1__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_5__0"
    // InternalUpctformaevalua.g:3440:1: rule__SingleAnswer__Group_5__0 : rule__SingleAnswer__Group_5__0__Impl rule__SingleAnswer__Group_5__1 ;
    public final void rule__SingleAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3444:1: ( rule__SingleAnswer__Group_5__0__Impl rule__SingleAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:3445:2: rule__SingleAnswer__Group_5__0__Impl rule__SingleAnswer__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__SingleAnswer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_5__1();

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
    // $ANTLR end "rule__SingleAnswer__Group_5__0"


    // $ANTLR start "rule__SingleAnswer__Group_5__0__Impl"
    // InternalUpctformaevalua.g:3452:1: rule__SingleAnswer__Group_5__0__Impl : ( 'correct' ) ;
    public final void rule__SingleAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3456:1: ( ( 'correct' ) )
            // InternalUpctformaevalua.g:3457:1: ( 'correct' )
            {
            // InternalUpctformaevalua.g:3457:1: ( 'correct' )
            // InternalUpctformaevalua.g:3458:2: 'correct'
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getCorrectKeyword_5_0()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_5__0__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_5__1"
    // InternalUpctformaevalua.g:3467:1: rule__SingleAnswer__Group_5__1 : rule__SingleAnswer__Group_5__1__Impl ;
    public final void rule__SingleAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3471:1: ( rule__SingleAnswer__Group_5__1__Impl )
            // InternalUpctformaevalua.g:3472:2: rule__SingleAnswer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_5__1__Impl();

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
    // $ANTLR end "rule__SingleAnswer__Group_5__1"


    // $ANTLR start "rule__SingleAnswer__Group_5__1__Impl"
    // InternalUpctformaevalua.g:3478:1: rule__SingleAnswer__Group_5__1__Impl : ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) ) ;
    public final void rule__SingleAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3482:1: ( ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:3483:1: ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:3483:1: ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) )
            // InternalUpctformaevalua.g:3484:2: ( rule__SingleAnswer__CorrectanswerAssignment_5_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectanswerAssignment_5_1()); 
            // InternalUpctformaevalua.g:3485:2: ( rule__SingleAnswer__CorrectanswerAssignment_5_1 )
            // InternalUpctformaevalua.g:3485:3: rule__SingleAnswer__CorrectanswerAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__CorrectanswerAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAnswerAccess().getCorrectanswerAssignment_5_1()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_5__1__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_6__0"
    // InternalUpctformaevalua.g:3494:1: rule__SingleAnswer__Group_6__0 : rule__SingleAnswer__Group_6__0__Impl rule__SingleAnswer__Group_6__1 ;
    public final void rule__SingleAnswer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3498:1: ( rule__SingleAnswer__Group_6__0__Impl rule__SingleAnswer__Group_6__1 )
            // InternalUpctformaevalua.g:3499:2: rule__SingleAnswer__Group_6__0__Impl rule__SingleAnswer__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__SingleAnswer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_6__1();

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
    // $ANTLR end "rule__SingleAnswer__Group_6__0"


    // $ANTLR start "rule__SingleAnswer__Group_6__0__Impl"
    // InternalUpctformaevalua.g:3506:1: rule__SingleAnswer__Group_6__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__SingleAnswer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3510:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:3511:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:3511:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:3512:2: 'correctfeedback'
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackKeyword_6_0()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_6__0__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_6__1"
    // InternalUpctformaevalua.g:3521:1: rule__SingleAnswer__Group_6__1 : rule__SingleAnswer__Group_6__1__Impl ;
    public final void rule__SingleAnswer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3525:1: ( rule__SingleAnswer__Group_6__1__Impl )
            // InternalUpctformaevalua.g:3526:2: rule__SingleAnswer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_6__1__Impl();

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
    // $ANTLR end "rule__SingleAnswer__Group_6__1"


    // $ANTLR start "rule__SingleAnswer__Group_6__1__Impl"
    // InternalUpctformaevalua.g:3532:1: rule__SingleAnswer__Group_6__1__Impl : ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) ) ;
    public final void rule__SingleAnswer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3536:1: ( ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:3537:1: ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:3537:1: ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) )
            // InternalUpctformaevalua.g:3538:2: ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackAssignment_6_1()); 
            // InternalUpctformaevalua.g:3539:2: ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 )
            // InternalUpctformaevalua.g:3539:3: rule__SingleAnswer__CorrectfeedbackAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__CorrectfeedbackAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackAssignment_6_1()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_6__1__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_7__0"
    // InternalUpctformaevalua.g:3548:1: rule__SingleAnswer__Group_7__0 : rule__SingleAnswer__Group_7__0__Impl rule__SingleAnswer__Group_7__1 ;
    public final void rule__SingleAnswer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3552:1: ( rule__SingleAnswer__Group_7__0__Impl rule__SingleAnswer__Group_7__1 )
            // InternalUpctformaevalua.g:3553:2: rule__SingleAnswer__Group_7__0__Impl rule__SingleAnswer__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__SingleAnswer__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_7__1();

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
    // $ANTLR end "rule__SingleAnswer__Group_7__0"


    // $ANTLR start "rule__SingleAnswer__Group_7__0__Impl"
    // InternalUpctformaevalua.g:3560:1: rule__SingleAnswer__Group_7__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__SingleAnswer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3564:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:3565:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:3565:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:3566:2: 'incorrectfeedback'
            {
             before(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackKeyword_7_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackKeyword_7_0()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_7__0__Impl"


    // $ANTLR start "rule__SingleAnswer__Group_7__1"
    // InternalUpctformaevalua.g:3575:1: rule__SingleAnswer__Group_7__1 : rule__SingleAnswer__Group_7__1__Impl ;
    public final void rule__SingleAnswer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3579:1: ( rule__SingleAnswer__Group_7__1__Impl )
            // InternalUpctformaevalua.g:3580:2: rule__SingleAnswer__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__Group_7__1__Impl();

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
    // $ANTLR end "rule__SingleAnswer__Group_7__1"


    // $ANTLR start "rule__SingleAnswer__Group_7__1__Impl"
    // InternalUpctformaevalua.g:3586:1: rule__SingleAnswer__Group_7__1__Impl : ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) ) ;
    public final void rule__SingleAnswer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3590:1: ( ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) ) )
            // InternalUpctformaevalua.g:3591:1: ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) )
            {
            // InternalUpctformaevalua.g:3591:1: ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) )
            // InternalUpctformaevalua.g:3592:2: ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackAssignment_7_1()); 
            // InternalUpctformaevalua.g:3593:2: ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 )
            // InternalUpctformaevalua.g:3593:3: rule__SingleAnswer__IncorrectfeedbackAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleAnswer__IncorrectfeedbackAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackAssignment_7_1()); 

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
    // $ANTLR end "rule__SingleAnswer__Group_7__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__0"
    // InternalUpctformaevalua.g:3602:1: rule__MultipleAnswer__Group__0 : rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1 ;
    public final void rule__MultipleAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3606:1: ( rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1 )
            // InternalUpctformaevalua.g:3607:2: rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MultipleAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__1();

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
    // $ANTLR end "rule__MultipleAnswer__Group__0"


    // $ANTLR start "rule__MultipleAnswer__Group__0__Impl"
    // InternalUpctformaevalua.g:3614:1: rule__MultipleAnswer__Group__0__Impl : ( 'MultipleAnswer' ) ;
    public final void rule__MultipleAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3618:1: ( ( 'MultipleAnswer' ) )
            // InternalUpctformaevalua.g:3619:1: ( 'MultipleAnswer' )
            {
            // InternalUpctformaevalua.g:3619:1: ( 'MultipleAnswer' )
            // InternalUpctformaevalua.g:3620:2: 'MultipleAnswer'
            {
             before(grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__1"
    // InternalUpctformaevalua.g:3629:1: rule__MultipleAnswer__Group__1 : rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2 ;
    public final void rule__MultipleAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3633:1: ( rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2 )
            // InternalUpctformaevalua.g:3634:2: rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__MultipleAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__2();

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
    // $ANTLR end "rule__MultipleAnswer__Group__1"


    // $ANTLR start "rule__MultipleAnswer__Group__1__Impl"
    // InternalUpctformaevalua.g:3641:1: rule__MultipleAnswer__Group__1__Impl : ( '{' ) ;
    public final void rule__MultipleAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3645:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3646:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3646:1: ( '{' )
            // InternalUpctformaevalua.g:3647:2: '{'
            {
             before(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__2"
    // InternalUpctformaevalua.g:3656:1: rule__MultipleAnswer__Group__2 : rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3 ;
    public final void rule__MultipleAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3660:1: ( rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3 )
            // InternalUpctformaevalua.g:3661:2: rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MultipleAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__3();

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
    // $ANTLR end "rule__MultipleAnswer__Group__2"


    // $ANTLR start "rule__MultipleAnswer__Group__2__Impl"
    // InternalUpctformaevalua.g:3668:1: rule__MultipleAnswer__Group__2__Impl : ( 'statement' ) ;
    public final void rule__MultipleAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3672:1: ( ( 'statement' ) )
            // InternalUpctformaevalua.g:3673:1: ( 'statement' )
            {
            // InternalUpctformaevalua.g:3673:1: ( 'statement' )
            // InternalUpctformaevalua.g:3674:2: 'statement'
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getStatementKeyword_2()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__2__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__3"
    // InternalUpctformaevalua.g:3683:1: rule__MultipleAnswer__Group__3 : rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4 ;
    public final void rule__MultipleAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3687:1: ( rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4 )
            // InternalUpctformaevalua.g:3688:2: rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__MultipleAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__4();

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
    // $ANTLR end "rule__MultipleAnswer__Group__3"


    // $ANTLR start "rule__MultipleAnswer__Group__3__Impl"
    // InternalUpctformaevalua.g:3695:1: rule__MultipleAnswer__Group__3__Impl : ( ( rule__MultipleAnswer__StatementsAssignment_3 ) ) ;
    public final void rule__MultipleAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3699:1: ( ( ( rule__MultipleAnswer__StatementsAssignment_3 ) ) )
            // InternalUpctformaevalua.g:3700:1: ( ( rule__MultipleAnswer__StatementsAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:3700:1: ( ( rule__MultipleAnswer__StatementsAssignment_3 ) )
            // InternalUpctformaevalua.g:3701:2: ( rule__MultipleAnswer__StatementsAssignment_3 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementsAssignment_3()); 
            // InternalUpctformaevalua.g:3702:2: ( rule__MultipleAnswer__StatementsAssignment_3 )
            // InternalUpctformaevalua.g:3702:3: rule__MultipleAnswer__StatementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__StatementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getStatementsAssignment_3()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__3__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__4"
    // InternalUpctformaevalua.g:3710:1: rule__MultipleAnswer__Group__4 : rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5 ;
    public final void rule__MultipleAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3714:1: ( rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5 )
            // InternalUpctformaevalua.g:3715:2: rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__MultipleAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__5();

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
    // $ANTLR end "rule__MultipleAnswer__Group__4"


    // $ANTLR start "rule__MultipleAnswer__Group__4__Impl"
    // InternalUpctformaevalua.g:3722:1: rule__MultipleAnswer__Group__4__Impl : ( ( rule__MultipleAnswer__Group_4__0 )? ) ;
    public final void rule__MultipleAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3726:1: ( ( ( rule__MultipleAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:3727:1: ( ( rule__MultipleAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:3727:1: ( ( rule__MultipleAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:3728:2: ( rule__MultipleAnswer__Group_4__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:3729:2: ( rule__MultipleAnswer__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctformaevalua.g:3729:3: rule__MultipleAnswer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAnswer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__4__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__5"
    // InternalUpctformaevalua.g:3737:1: rule__MultipleAnswer__Group__5 : rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6 ;
    public final void rule__MultipleAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3741:1: ( rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6 )
            // InternalUpctformaevalua.g:3742:2: rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__MultipleAnswer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__6();

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
    // $ANTLR end "rule__MultipleAnswer__Group__5"


    // $ANTLR start "rule__MultipleAnswer__Group__5__Impl"
    // InternalUpctformaevalua.g:3749:1: rule__MultipleAnswer__Group__5__Impl : ( ( rule__MultipleAnswer__Group_5__0 )? ) ;
    public final void rule__MultipleAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3753:1: ( ( ( rule__MultipleAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:3754:1: ( ( rule__MultipleAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:3754:1: ( ( rule__MultipleAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:3755:2: ( rule__MultipleAnswer__Group_5__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:3756:2: ( rule__MultipleAnswer__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctformaevalua.g:3756:3: rule__MultipleAnswer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAnswer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__5__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__6"
    // InternalUpctformaevalua.g:3764:1: rule__MultipleAnswer__Group__6 : rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7 ;
    public final void rule__MultipleAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3768:1: ( rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7 )
            // InternalUpctformaevalua.g:3769:2: rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__MultipleAnswer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__7();

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
    // $ANTLR end "rule__MultipleAnswer__Group__6"


    // $ANTLR start "rule__MultipleAnswer__Group__6__Impl"
    // InternalUpctformaevalua.g:3776:1: rule__MultipleAnswer__Group__6__Impl : ( ( rule__MultipleAnswer__Group_6__0 )? ) ;
    public final void rule__MultipleAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3780:1: ( ( ( rule__MultipleAnswer__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:3781:1: ( ( rule__MultipleAnswer__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:3781:1: ( ( rule__MultipleAnswer__Group_6__0 )? )
            // InternalUpctformaevalua.g:3782:2: ( rule__MultipleAnswer__Group_6__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:3783:2: ( rule__MultipleAnswer__Group_6__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctformaevalua.g:3783:3: rule__MultipleAnswer__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleAnswer__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAnswerAccess().getGroup_6()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__6__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group__7"
    // InternalUpctformaevalua.g:3791:1: rule__MultipleAnswer__Group__7 : rule__MultipleAnswer__Group__7__Impl ;
    public final void rule__MultipleAnswer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3795:1: ( rule__MultipleAnswer__Group__7__Impl )
            // InternalUpctformaevalua.g:3796:2: rule__MultipleAnswer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group__7__Impl();

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
    // $ANTLR end "rule__MultipleAnswer__Group__7"


    // $ANTLR start "rule__MultipleAnswer__Group__7__Impl"
    // InternalUpctformaevalua.g:3802:1: rule__MultipleAnswer__Group__7__Impl : ( '}' ) ;
    public final void rule__MultipleAnswer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3806:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3807:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3807:1: ( '}' )
            // InternalUpctformaevalua.g:3808:2: '}'
            {
             before(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group__7__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__0"
    // InternalUpctformaevalua.g:3818:1: rule__MultipleAnswer__Group_4__0 : rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1 ;
    public final void rule__MultipleAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3822:1: ( rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:3823:2: rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__MultipleAnswer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__1();

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__0"


    // $ANTLR start "rule__MultipleAnswer__Group_4__0__Impl"
    // InternalUpctformaevalua.g:3830:1: rule__MultipleAnswer__Group_4__0__Impl : ( 'answers' ) ;
    public final void rule__MultipleAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3834:1: ( ( 'answers' ) )
            // InternalUpctformaevalua.g:3835:1: ( 'answers' )
            {
            // InternalUpctformaevalua.g:3835:1: ( 'answers' )
            // InternalUpctformaevalua.g:3836:2: 'answers'
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_4_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__1"
    // InternalUpctformaevalua.g:3845:1: rule__MultipleAnswer__Group_4__1 : rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2 ;
    public final void rule__MultipleAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3849:1: ( rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2 )
            // InternalUpctformaevalua.g:3850:2: rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__MultipleAnswer__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__2();

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__1"


    // $ANTLR start "rule__MultipleAnswer__Group_4__1__Impl"
    // InternalUpctformaevalua.g:3857:1: rule__MultipleAnswer__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MultipleAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3861:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3862:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3862:1: ( '{' )
            // InternalUpctformaevalua.g:3863:2: '{'
            {
             before(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__2"
    // InternalUpctformaevalua.g:3872:1: rule__MultipleAnswer__Group_4__2 : rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3 ;
    public final void rule__MultipleAnswer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3876:1: ( rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3 )
            // InternalUpctformaevalua.g:3877:2: rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3
            {
            pushFollow(FOLLOW_18);
            rule__MultipleAnswer__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__3();

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__2"


    // $ANTLR start "rule__MultipleAnswer__Group_4__2__Impl"
    // InternalUpctformaevalua.g:3884:1: rule__MultipleAnswer__Group_4__2__Impl : ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) ) ;
    public final void rule__MultipleAnswer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3888:1: ( ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) ) )
            // InternalUpctformaevalua.g:3889:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) )
            {
            // InternalUpctformaevalua.g:3889:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) )
            // InternalUpctformaevalua.g:3890:2: ( rule__MultipleAnswer__AnswersAssignment_4_2 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_2()); 
            // InternalUpctformaevalua.g:3891:2: ( rule__MultipleAnswer__AnswersAssignment_4_2 )
            // InternalUpctformaevalua.g:3891:3: rule__MultipleAnswer__AnswersAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__AnswersAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_2()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__2__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__3"
    // InternalUpctformaevalua.g:3899:1: rule__MultipleAnswer__Group_4__3 : rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4 ;
    public final void rule__MultipleAnswer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3903:1: ( rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4 )
            // InternalUpctformaevalua.g:3904:2: rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4
            {
            pushFollow(FOLLOW_18);
            rule__MultipleAnswer__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__4();

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__3"


    // $ANTLR start "rule__MultipleAnswer__Group_4__3__Impl"
    // InternalUpctformaevalua.g:3911:1: rule__MultipleAnswer__Group_4__3__Impl : ( ( rule__MultipleAnswer__Group_4_3__0 )* ) ;
    public final void rule__MultipleAnswer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3915:1: ( ( ( rule__MultipleAnswer__Group_4_3__0 )* ) )
            // InternalUpctformaevalua.g:3916:1: ( ( rule__MultipleAnswer__Group_4_3__0 )* )
            {
            // InternalUpctformaevalua.g:3916:1: ( ( rule__MultipleAnswer__Group_4_3__0 )* )
            // InternalUpctformaevalua.g:3917:2: ( rule__MultipleAnswer__Group_4_3__0 )*
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_4_3()); 
            // InternalUpctformaevalua.g:3918:2: ( rule__MultipleAnswer__Group_4_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalUpctformaevalua.g:3918:3: rule__MultipleAnswer__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MultipleAnswer__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getMultipleAnswerAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__3__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4__4"
    // InternalUpctformaevalua.g:3926:1: rule__MultipleAnswer__Group_4__4 : rule__MultipleAnswer__Group_4__4__Impl ;
    public final void rule__MultipleAnswer__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3930:1: ( rule__MultipleAnswer__Group_4__4__Impl )
            // InternalUpctformaevalua.g:3931:2: rule__MultipleAnswer__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4__4__Impl();

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__4"


    // $ANTLR start "rule__MultipleAnswer__Group_4__4__Impl"
    // InternalUpctformaevalua.g:3937:1: rule__MultipleAnswer__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MultipleAnswer__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3941:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3942:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3942:1: ( '}' )
            // InternalUpctformaevalua.g:3943:2: '}'
            {
             before(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_4__4__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__0"
    // InternalUpctformaevalua.g:3953:1: rule__MultipleAnswer__Group_4_3__0 : rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1 ;
    public final void rule__MultipleAnswer__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3957:1: ( rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1 )
            // InternalUpctformaevalua.g:3958:2: rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1
            {
            pushFollow(FOLLOW_5);
            rule__MultipleAnswer__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4_3__1();

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
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__0"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__0__Impl"
    // InternalUpctformaevalua.g:3965:1: rule__MultipleAnswer__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MultipleAnswer__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3969:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:3970:1: ( ',' )
            {
            // InternalUpctformaevalua.g:3970:1: ( ',' )
            // InternalUpctformaevalua.g:3971:2: ','
            {
             before(grammarAccess.getMultipleAnswerAccess().getCommaKeyword_4_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__1"
    // InternalUpctformaevalua.g:3980:1: rule__MultipleAnswer__Group_4_3__1 : rule__MultipleAnswer__Group_4_3__1__Impl ;
    public final void rule__MultipleAnswer__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3984:1: ( rule__MultipleAnswer__Group_4_3__1__Impl )
            // InternalUpctformaevalua.g:3985:2: rule__MultipleAnswer__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__1"


    // $ANTLR start "rule__MultipleAnswer__Group_4_3__1__Impl"
    // InternalUpctformaevalua.g:3991:1: rule__MultipleAnswer__Group_4_3__1__Impl : ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) ) ;
    public final void rule__MultipleAnswer__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3995:1: ( ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) ) )
            // InternalUpctformaevalua.g:3996:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) )
            {
            // InternalUpctformaevalua.g:3996:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) )
            // InternalUpctformaevalua.g:3997:2: ( rule__MultipleAnswer__AnswersAssignment_4_3_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_3_1()); 
            // InternalUpctformaevalua.g:3998:2: ( rule__MultipleAnswer__AnswersAssignment_4_3_1 )
            // InternalUpctformaevalua.g:3998:3: rule__MultipleAnswer__AnswersAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__AnswersAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_3_1()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_4_3__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_5__0"
    // InternalUpctformaevalua.g:4007:1: rule__MultipleAnswer__Group_5__0 : rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1 ;
    public final void rule__MultipleAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4011:1: ( rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:4012:2: rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__MultipleAnswer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_5__1();

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
    // $ANTLR end "rule__MultipleAnswer__Group_5__0"


    // $ANTLR start "rule__MultipleAnswer__Group_5__0__Impl"
    // InternalUpctformaevalua.g:4019:1: rule__MultipleAnswer__Group_5__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__MultipleAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4023:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:4024:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:4024:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:4025:2: 'correctfeedback'
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_5_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_5__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_5__1"
    // InternalUpctformaevalua.g:4034:1: rule__MultipleAnswer__Group_5__1 : rule__MultipleAnswer__Group_5__1__Impl ;
    public final void rule__MultipleAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4038:1: ( rule__MultipleAnswer__Group_5__1__Impl )
            // InternalUpctformaevalua.g:4039:2: rule__MultipleAnswer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_5__1__Impl();

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
    // $ANTLR end "rule__MultipleAnswer__Group_5__1"


    // $ANTLR start "rule__MultipleAnswer__Group_5__1__Impl"
    // InternalUpctformaevalua.g:4045:1: rule__MultipleAnswer__Group_5__1__Impl : ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) ) ;
    public final void rule__MultipleAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4049:1: ( ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:4050:1: ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:4050:1: ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) )
            // InternalUpctformaevalua.g:4051:2: ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackAssignment_5_1()); 
            // InternalUpctformaevalua.g:4052:2: ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 )
            // InternalUpctformaevalua.g:4052:3: rule__MultipleAnswer__CorrectfeedbackAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__CorrectfeedbackAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackAssignment_5_1()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_5__1__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_6__0"
    // InternalUpctformaevalua.g:4061:1: rule__MultipleAnswer__Group_6__0 : rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1 ;
    public final void rule__MultipleAnswer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4065:1: ( rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1 )
            // InternalUpctformaevalua.g:4066:2: rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__MultipleAnswer__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_6__1();

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
    // $ANTLR end "rule__MultipleAnswer__Group_6__0"


    // $ANTLR start "rule__MultipleAnswer__Group_6__0__Impl"
    // InternalUpctformaevalua.g:4073:1: rule__MultipleAnswer__Group_6__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__MultipleAnswer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4077:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:4078:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:4078:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:4079:2: 'incorrectfeedback'
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_6_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_6__0__Impl"


    // $ANTLR start "rule__MultipleAnswer__Group_6__1"
    // InternalUpctformaevalua.g:4088:1: rule__MultipleAnswer__Group_6__1 : rule__MultipleAnswer__Group_6__1__Impl ;
    public final void rule__MultipleAnswer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4092:1: ( rule__MultipleAnswer__Group_6__1__Impl )
            // InternalUpctformaevalua.g:4093:2: rule__MultipleAnswer__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__Group_6__1__Impl();

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
    // $ANTLR end "rule__MultipleAnswer__Group_6__1"


    // $ANTLR start "rule__MultipleAnswer__Group_6__1__Impl"
    // InternalUpctformaevalua.g:4099:1: rule__MultipleAnswer__Group_6__1__Impl : ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) ) ;
    public final void rule__MultipleAnswer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4103:1: ( ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:4104:1: ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:4104:1: ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) )
            // InternalUpctformaevalua.g:4105:2: ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackAssignment_6_1()); 
            // InternalUpctformaevalua.g:4106:2: ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 )
            // InternalUpctformaevalua.g:4106:3: rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackAssignment_6_1()); 

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
    // $ANTLR end "rule__MultipleAnswer__Group_6__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__0"
    // InternalUpctformaevalua.g:4115:1: rule__FillingAnswer__Group__0 : rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1 ;
    public final void rule__FillingAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4119:1: ( rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1 )
            // InternalUpctformaevalua.g:4120:2: rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__FillingAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__1();

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
    // $ANTLR end "rule__FillingAnswer__Group__0"


    // $ANTLR start "rule__FillingAnswer__Group__0__Impl"
    // InternalUpctformaevalua.g:4127:1: rule__FillingAnswer__Group__0__Impl : ( () ) ;
    public final void rule__FillingAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4131:1: ( ( () ) )
            // InternalUpctformaevalua.g:4132:1: ( () )
            {
            // InternalUpctformaevalua.g:4132:1: ( () )
            // InternalUpctformaevalua.g:4133:2: ()
            {
             before(grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0()); 
            // InternalUpctformaevalua.g:4134:2: ()
            // InternalUpctformaevalua.g:4134:3: 
            {
            }

             after(grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillingAnswer__Group__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__1"
    // InternalUpctformaevalua.g:4142:1: rule__FillingAnswer__Group__1 : rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2 ;
    public final void rule__FillingAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4146:1: ( rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2 )
            // InternalUpctformaevalua.g:4147:2: rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FillingAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__2();

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
    // $ANTLR end "rule__FillingAnswer__Group__1"


    // $ANTLR start "rule__FillingAnswer__Group__1__Impl"
    // InternalUpctformaevalua.g:4154:1: rule__FillingAnswer__Group__1__Impl : ( 'FillingAnswer' ) ;
    public final void rule__FillingAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4158:1: ( ( 'FillingAnswer' ) )
            // InternalUpctformaevalua.g:4159:1: ( 'FillingAnswer' )
            {
            // InternalUpctformaevalua.g:4159:1: ( 'FillingAnswer' )
            // InternalUpctformaevalua.g:4160:2: 'FillingAnswer'
            {
             before(grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1()); 

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
    // $ANTLR end "rule__FillingAnswer__Group__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__2"
    // InternalUpctformaevalua.g:4169:1: rule__FillingAnswer__Group__2 : rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3 ;
    public final void rule__FillingAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4173:1: ( rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3 )
            // InternalUpctformaevalua.g:4174:2: rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__FillingAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__3();

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
    // $ANTLR end "rule__FillingAnswer__Group__2"


    // $ANTLR start "rule__FillingAnswer__Group__2__Impl"
    // InternalUpctformaevalua.g:4181:1: rule__FillingAnswer__Group__2__Impl : ( '{' ) ;
    public final void rule__FillingAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4185:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4186:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4186:1: ( '{' )
            // InternalUpctformaevalua.g:4187:2: '{'
            {
             before(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__FillingAnswer__Group__2__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__3"
    // InternalUpctformaevalua.g:4196:1: rule__FillingAnswer__Group__3 : rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4 ;
    public final void rule__FillingAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4200:1: ( rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4 )
            // InternalUpctformaevalua.g:4201:2: rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__FillingAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__4();

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
    // $ANTLR end "rule__FillingAnswer__Group__3"


    // $ANTLR start "rule__FillingAnswer__Group__3__Impl"
    // InternalUpctformaevalua.g:4208:1: rule__FillingAnswer__Group__3__Impl : ( ( rule__FillingAnswer__Group_3__0 )? ) ;
    public final void rule__FillingAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4212:1: ( ( ( rule__FillingAnswer__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:4213:1: ( ( rule__FillingAnswer__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:4213:1: ( ( rule__FillingAnswer__Group_3__0 )? )
            // InternalUpctformaevalua.g:4214:2: ( rule__FillingAnswer__Group_3__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:4215:2: ( rule__FillingAnswer__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctformaevalua.g:4215:3: rule__FillingAnswer__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillingAnswer__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFillingAnswerAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FillingAnswer__Group__3__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__4"
    // InternalUpctformaevalua.g:4223:1: rule__FillingAnswer__Group__4 : rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5 ;
    public final void rule__FillingAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4227:1: ( rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5 )
            // InternalUpctformaevalua.g:4228:2: rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__FillingAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__5();

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
    // $ANTLR end "rule__FillingAnswer__Group__4"


    // $ANTLR start "rule__FillingAnswer__Group__4__Impl"
    // InternalUpctformaevalua.g:4235:1: rule__FillingAnswer__Group__4__Impl : ( ( rule__FillingAnswer__Group_4__0 )? ) ;
    public final void rule__FillingAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4239:1: ( ( ( rule__FillingAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:4240:1: ( ( rule__FillingAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:4240:1: ( ( rule__FillingAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:4241:2: ( rule__FillingAnswer__Group_4__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:4242:2: ( rule__FillingAnswer__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctformaevalua.g:4242:3: rule__FillingAnswer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillingAnswer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFillingAnswerAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FillingAnswer__Group__4__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__5"
    // InternalUpctformaevalua.g:4250:1: rule__FillingAnswer__Group__5 : rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6 ;
    public final void rule__FillingAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4254:1: ( rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6 )
            // InternalUpctformaevalua.g:4255:2: rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__FillingAnswer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__6();

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
    // $ANTLR end "rule__FillingAnswer__Group__5"


    // $ANTLR start "rule__FillingAnswer__Group__5__Impl"
    // InternalUpctformaevalua.g:4262:1: rule__FillingAnswer__Group__5__Impl : ( ( rule__FillingAnswer__Group_5__0 )? ) ;
    public final void rule__FillingAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4266:1: ( ( ( rule__FillingAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:4267:1: ( ( rule__FillingAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:4267:1: ( ( rule__FillingAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:4268:2: ( rule__FillingAnswer__Group_5__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:4269:2: ( rule__FillingAnswer__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctformaevalua.g:4269:3: rule__FillingAnswer__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillingAnswer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFillingAnswerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__FillingAnswer__Group__5__Impl"


    // $ANTLR start "rule__FillingAnswer__Group__6"
    // InternalUpctformaevalua.g:4277:1: rule__FillingAnswer__Group__6 : rule__FillingAnswer__Group__6__Impl ;
    public final void rule__FillingAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4281:1: ( rule__FillingAnswer__Group__6__Impl )
            // InternalUpctformaevalua.g:4282:2: rule__FillingAnswer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group__6__Impl();

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
    // $ANTLR end "rule__FillingAnswer__Group__6"


    // $ANTLR start "rule__FillingAnswer__Group__6__Impl"
    // InternalUpctformaevalua.g:4288:1: rule__FillingAnswer__Group__6__Impl : ( '}' ) ;
    public final void rule__FillingAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4292:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4293:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4293:1: ( '}' )
            // InternalUpctformaevalua.g:4294:2: '}'
            {
             before(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__FillingAnswer__Group__6__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_3__0"
    // InternalUpctformaevalua.g:4304:1: rule__FillingAnswer__Group_3__0 : rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1 ;
    public final void rule__FillingAnswer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4308:1: ( rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1 )
            // InternalUpctformaevalua.g:4309:2: rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__FillingAnswer__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_3__1();

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
    // $ANTLR end "rule__FillingAnswer__Group_3__0"


    // $ANTLR start "rule__FillingAnswer__Group_3__0__Impl"
    // InternalUpctformaevalua.g:4316:1: rule__FillingAnswer__Group_3__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__FillingAnswer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4320:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:4321:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:4321:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:4322:2: 'correctfeedback'
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_3__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_3__1"
    // InternalUpctformaevalua.g:4331:1: rule__FillingAnswer__Group_3__1 : rule__FillingAnswer__Group_3__1__Impl ;
    public final void rule__FillingAnswer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4335:1: ( rule__FillingAnswer__Group_3__1__Impl )
            // InternalUpctformaevalua.g:4336:2: rule__FillingAnswer__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_3__1__Impl();

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
    // $ANTLR end "rule__FillingAnswer__Group_3__1"


    // $ANTLR start "rule__FillingAnswer__Group_3__1__Impl"
    // InternalUpctformaevalua.g:4342:1: rule__FillingAnswer__Group_3__1__Impl : ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) ) ;
    public final void rule__FillingAnswer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4346:1: ( ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:4347:1: ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:4347:1: ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) )
            // InternalUpctformaevalua.g:4348:2: ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackAssignment_3_1()); 
            // InternalUpctformaevalua.g:4349:2: ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 )
            // InternalUpctformaevalua.g:4349:3: rule__FillingAnswer__CorrectfeedbackAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__CorrectfeedbackAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackAssignment_3_1()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_3__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_4__0"
    // InternalUpctformaevalua.g:4358:1: rule__FillingAnswer__Group_4__0 : rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1 ;
    public final void rule__FillingAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4362:1: ( rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:4363:2: rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__FillingAnswer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_4__1();

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
    // $ANTLR end "rule__FillingAnswer__Group_4__0"


    // $ANTLR start "rule__FillingAnswer__Group_4__0__Impl"
    // InternalUpctformaevalua.g:4370:1: rule__FillingAnswer__Group_4__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__FillingAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4374:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:4375:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:4375:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:4376:2: 'incorrectfeedback'
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_4__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_4__1"
    // InternalUpctformaevalua.g:4385:1: rule__FillingAnswer__Group_4__1 : rule__FillingAnswer__Group_4__1__Impl ;
    public final void rule__FillingAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4389:1: ( rule__FillingAnswer__Group_4__1__Impl )
            // InternalUpctformaevalua.g:4390:2: rule__FillingAnswer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_4__1__Impl();

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
    // $ANTLR end "rule__FillingAnswer__Group_4__1"


    // $ANTLR start "rule__FillingAnswer__Group_4__1__Impl"
    // InternalUpctformaevalua.g:4396:1: rule__FillingAnswer__Group_4__1__Impl : ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__FillingAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4400:1: ( ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:4401:1: ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:4401:1: ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:4402:2: ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:4403:2: ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:4403:3: rule__FillingAnswer__IncorrectfeedbackAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__IncorrectfeedbackAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackAssignment_4_1()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_4__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__0"
    // InternalUpctformaevalua.g:4412:1: rule__FillingAnswer__Group_5__0 : rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1 ;
    public final void rule__FillingAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4416:1: ( rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:4417:2: rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__FillingAnswer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__1();

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
    // $ANTLR end "rule__FillingAnswer__Group_5__0"


    // $ANTLR start "rule__FillingAnswer__Group_5__0__Impl"
    // InternalUpctformaevalua.g:4424:1: rule__FillingAnswer__Group_5__0__Impl : ( 'holes' ) ;
    public final void rule__FillingAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4428:1: ( ( 'holes' ) )
            // InternalUpctformaevalua.g:4429:1: ( 'holes' )
            {
            // InternalUpctformaevalua.g:4429:1: ( 'holes' )
            // InternalUpctformaevalua.g:4430:2: 'holes'
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_5__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__1"
    // InternalUpctformaevalua.g:4439:1: rule__FillingAnswer__Group_5__1 : rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2 ;
    public final void rule__FillingAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4443:1: ( rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2 )
            // InternalUpctformaevalua.g:4444:2: rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__FillingAnswer__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__2();

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
    // $ANTLR end "rule__FillingAnswer__Group_5__1"


    // $ANTLR start "rule__FillingAnswer__Group_5__1__Impl"
    // InternalUpctformaevalua.g:4451:1: rule__FillingAnswer__Group_5__1__Impl : ( '{' ) ;
    public final void rule__FillingAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4455:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4456:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4456:1: ( '{' )
            // InternalUpctformaevalua.g:4457:2: '{'
            {
             before(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_5__1__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__2"
    // InternalUpctformaevalua.g:4466:1: rule__FillingAnswer__Group_5__2 : rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3 ;
    public final void rule__FillingAnswer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4470:1: ( rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3 )
            // InternalUpctformaevalua.g:4471:2: rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3
            {
            pushFollow(FOLLOW_18);
            rule__FillingAnswer__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__3();

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
    // $ANTLR end "rule__FillingAnswer__Group_5__2"


    // $ANTLR start "rule__FillingAnswer__Group_5__2__Impl"
    // InternalUpctformaevalua.g:4478:1: rule__FillingAnswer__Group_5__2__Impl : ( ( rule__FillingAnswer__HolesAssignment_5_2 ) ) ;
    public final void rule__FillingAnswer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4482:1: ( ( ( rule__FillingAnswer__HolesAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:4483:1: ( ( rule__FillingAnswer__HolesAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:4483:1: ( ( rule__FillingAnswer__HolesAssignment_5_2 ) )
            // InternalUpctformaevalua.g:4484:2: ( rule__FillingAnswer__HolesAssignment_5_2 )
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_2()); 
            // InternalUpctformaevalua.g:4485:2: ( rule__FillingAnswer__HolesAssignment_5_2 )
            // InternalUpctformaevalua.g:4485:3: rule__FillingAnswer__HolesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__HolesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_2()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_5__2__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__3"
    // InternalUpctformaevalua.g:4493:1: rule__FillingAnswer__Group_5__3 : rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4 ;
    public final void rule__FillingAnswer__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4497:1: ( rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4 )
            // InternalUpctformaevalua.g:4498:2: rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4
            {
            pushFollow(FOLLOW_18);
            rule__FillingAnswer__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__4();

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
    // $ANTLR end "rule__FillingAnswer__Group_5__3"


    // $ANTLR start "rule__FillingAnswer__Group_5__3__Impl"
    // InternalUpctformaevalua.g:4505:1: rule__FillingAnswer__Group_5__3__Impl : ( ( rule__FillingAnswer__Group_5_3__0 )* ) ;
    public final void rule__FillingAnswer__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4509:1: ( ( ( rule__FillingAnswer__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:4510:1: ( ( rule__FillingAnswer__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:4510:1: ( ( rule__FillingAnswer__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:4511:2: ( rule__FillingAnswer__Group_5_3__0 )*
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:4512:2: ( rule__FillingAnswer__Group_5_3__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUpctformaevalua.g:4512:3: rule__FillingAnswer__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FillingAnswer__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getFillingAnswerAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_5__3__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5__4"
    // InternalUpctformaevalua.g:4520:1: rule__FillingAnswer__Group_5__4 : rule__FillingAnswer__Group_5__4__Impl ;
    public final void rule__FillingAnswer__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4524:1: ( rule__FillingAnswer__Group_5__4__Impl )
            // InternalUpctformaevalua.g:4525:2: rule__FillingAnswer__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5__4__Impl();

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
    // $ANTLR end "rule__FillingAnswer__Group_5__4"


    // $ANTLR start "rule__FillingAnswer__Group_5__4__Impl"
    // InternalUpctformaevalua.g:4531:1: rule__FillingAnswer__Group_5__4__Impl : ( '}' ) ;
    public final void rule__FillingAnswer__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4535:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4536:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4536:1: ( '}' )
            // InternalUpctformaevalua.g:4537:2: '}'
            {
             before(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_5__4__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__0"
    // InternalUpctformaevalua.g:4547:1: rule__FillingAnswer__Group_5_3__0 : rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1 ;
    public final void rule__FillingAnswer__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4551:1: ( rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1 )
            // InternalUpctformaevalua.g:4552:2: rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1
            {
            pushFollow(FOLLOW_29);
            rule__FillingAnswer__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5_3__1();

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
    // $ANTLR end "rule__FillingAnswer__Group_5_3__0"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__0__Impl"
    // InternalUpctformaevalua.g:4559:1: rule__FillingAnswer__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__FillingAnswer__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4563:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:4564:1: ( ',' )
            {
            // InternalUpctformaevalua.g:4564:1: ( ',' )
            // InternalUpctformaevalua.g:4565:2: ','
            {
             before(grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_5_3__0__Impl"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__1"
    // InternalUpctformaevalua.g:4574:1: rule__FillingAnswer__Group_5_3__1 : rule__FillingAnswer__Group_5_3__1__Impl ;
    public final void rule__FillingAnswer__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4578:1: ( rule__FillingAnswer__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:4579:2: rule__FillingAnswer__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__FillingAnswer__Group_5_3__1"


    // $ANTLR start "rule__FillingAnswer__Group_5_3__1__Impl"
    // InternalUpctformaevalua.g:4585:1: rule__FillingAnswer__Group_5_3__1__Impl : ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) ) ;
    public final void rule__FillingAnswer__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4589:1: ( ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:4590:1: ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:4590:1: ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:4591:2: ( rule__FillingAnswer__HolesAssignment_5_3_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:4592:2: ( rule__FillingAnswer__HolesAssignment_5_3_1 )
            // InternalUpctformaevalua.g:4592:3: rule__FillingAnswer__HolesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FillingAnswer__HolesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__FillingAnswer__Group_5_3__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__0"
    // InternalUpctformaevalua.g:4601:1: rule__TrueOrFalse__Group__0 : rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1 ;
    public final void rule__TrueOrFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4605:1: ( rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1 )
            // InternalUpctformaevalua.g:4606:2: rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__TrueOrFalse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__1();

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
    // $ANTLR end "rule__TrueOrFalse__Group__0"


    // $ANTLR start "rule__TrueOrFalse__Group__0__Impl"
    // InternalUpctformaevalua.g:4613:1: rule__TrueOrFalse__Group__0__Impl : ( () ) ;
    public final void rule__TrueOrFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4617:1: ( ( () ) )
            // InternalUpctformaevalua.g:4618:1: ( () )
            {
            // InternalUpctformaevalua.g:4618:1: ( () )
            // InternalUpctformaevalua.g:4619:2: ()
            {
             before(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0()); 
            // InternalUpctformaevalua.g:4620:2: ()
            // InternalUpctformaevalua.g:4620:3: 
            {
            }

             after(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrueOrFalse__Group__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__1"
    // InternalUpctformaevalua.g:4628:1: rule__TrueOrFalse__Group__1 : rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2 ;
    public final void rule__TrueOrFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4632:1: ( rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2 )
            // InternalUpctformaevalua.g:4633:2: rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TrueOrFalse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__2();

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
    // $ANTLR end "rule__TrueOrFalse__Group__1"


    // $ANTLR start "rule__TrueOrFalse__Group__1__Impl"
    // InternalUpctformaevalua.g:4640:1: rule__TrueOrFalse__Group__1__Impl : ( 'TrueOrFalse' ) ;
    public final void rule__TrueOrFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4644:1: ( ( 'TrueOrFalse' ) )
            // InternalUpctformaevalua.g:4645:1: ( 'TrueOrFalse' )
            {
            // InternalUpctformaevalua.g:4645:1: ( 'TrueOrFalse' )
            // InternalUpctformaevalua.g:4646:2: 'TrueOrFalse'
            {
             before(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__2"
    // InternalUpctformaevalua.g:4655:1: rule__TrueOrFalse__Group__2 : rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3 ;
    public final void rule__TrueOrFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4659:1: ( rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3 )
            // InternalUpctformaevalua.g:4660:2: rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__TrueOrFalse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__3();

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
    // $ANTLR end "rule__TrueOrFalse__Group__2"


    // $ANTLR start "rule__TrueOrFalse__Group__2__Impl"
    // InternalUpctformaevalua.g:4667:1: rule__TrueOrFalse__Group__2__Impl : ( '{' ) ;
    public final void rule__TrueOrFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4671:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4672:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4672:1: ( '{' )
            // InternalUpctformaevalua.g:4673:2: '{'
            {
             before(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group__2__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__3"
    // InternalUpctformaevalua.g:4682:1: rule__TrueOrFalse__Group__3 : rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4 ;
    public final void rule__TrueOrFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4686:1: ( rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4 )
            // InternalUpctformaevalua.g:4687:2: rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__TrueOrFalse__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__4();

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
    // $ANTLR end "rule__TrueOrFalse__Group__3"


    // $ANTLR start "rule__TrueOrFalse__Group__3__Impl"
    // InternalUpctformaevalua.g:4694:1: rule__TrueOrFalse__Group__3__Impl : ( ( rule__TrueOrFalse__Group_3__0 )? ) ;
    public final void rule__TrueOrFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4698:1: ( ( ( rule__TrueOrFalse__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:4699:1: ( ( rule__TrueOrFalse__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:4699:1: ( ( rule__TrueOrFalse__Group_3__0 )? )
            // InternalUpctformaevalua.g:4700:2: ( rule__TrueOrFalse__Group_3__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:4701:2: ( rule__TrueOrFalse__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctformaevalua.g:4701:3: rule__TrueOrFalse__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueOrFalse__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group__3__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__4"
    // InternalUpctformaevalua.g:4709:1: rule__TrueOrFalse__Group__4 : rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5 ;
    public final void rule__TrueOrFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4713:1: ( rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5 )
            // InternalUpctformaevalua.g:4714:2: rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__TrueOrFalse__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__5();

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
    // $ANTLR end "rule__TrueOrFalse__Group__4"


    // $ANTLR start "rule__TrueOrFalse__Group__4__Impl"
    // InternalUpctformaevalua.g:4721:1: rule__TrueOrFalse__Group__4__Impl : ( ( rule__TrueOrFalse__Group_4__0 )? ) ;
    public final void rule__TrueOrFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4725:1: ( ( ( rule__TrueOrFalse__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:4726:1: ( ( rule__TrueOrFalse__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:4726:1: ( ( rule__TrueOrFalse__Group_4__0 )? )
            // InternalUpctformaevalua.g:4727:2: ( rule__TrueOrFalse__Group_4__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:4728:2: ( rule__TrueOrFalse__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctformaevalua.g:4728:3: rule__TrueOrFalse__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueOrFalse__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group__4__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__5"
    // InternalUpctformaevalua.g:4736:1: rule__TrueOrFalse__Group__5 : rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6 ;
    public final void rule__TrueOrFalse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4740:1: ( rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6 )
            // InternalUpctformaevalua.g:4741:2: rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__TrueOrFalse__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__6();

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
    // $ANTLR end "rule__TrueOrFalse__Group__5"


    // $ANTLR start "rule__TrueOrFalse__Group__5__Impl"
    // InternalUpctformaevalua.g:4748:1: rule__TrueOrFalse__Group__5__Impl : ( ( rule__TrueOrFalse__Group_5__0 )? ) ;
    public final void rule__TrueOrFalse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4752:1: ( ( ( rule__TrueOrFalse__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:4753:1: ( ( rule__TrueOrFalse__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:4753:1: ( ( rule__TrueOrFalse__Group_5__0 )? )
            // InternalUpctformaevalua.g:4754:2: ( rule__TrueOrFalse__Group_5__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:4755:2: ( rule__TrueOrFalse__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUpctformaevalua.g:4755:3: rule__TrueOrFalse__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TrueOrFalse__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrueOrFalseAccess().getGroup_5()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group__5__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group__6"
    // InternalUpctformaevalua.g:4763:1: rule__TrueOrFalse__Group__6 : rule__TrueOrFalse__Group__6__Impl ;
    public final void rule__TrueOrFalse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4767:1: ( rule__TrueOrFalse__Group__6__Impl )
            // InternalUpctformaevalua.g:4768:2: rule__TrueOrFalse__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group__6__Impl();

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
    // $ANTLR end "rule__TrueOrFalse__Group__6"


    // $ANTLR start "rule__TrueOrFalse__Group__6__Impl"
    // InternalUpctformaevalua.g:4774:1: rule__TrueOrFalse__Group__6__Impl : ( '}' ) ;
    public final void rule__TrueOrFalse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4778:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4779:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4779:1: ( '}' )
            // InternalUpctformaevalua.g:4780:2: '}'
            {
             before(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group__6__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3__0"
    // InternalUpctformaevalua.g:4790:1: rule__TrueOrFalse__Group_3__0 : rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1 ;
    public final void rule__TrueOrFalse__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4794:1: ( rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1 )
            // InternalUpctformaevalua.g:4795:2: rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__TrueOrFalse__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3__1();

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__0"


    // $ANTLR start "rule__TrueOrFalse__Group_3__0__Impl"
    // InternalUpctformaevalua.g:4802:1: rule__TrueOrFalse__Group_3__0__Impl : ( 'assertions' ) ;
    public final void rule__TrueOrFalse__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4806:1: ( ( 'assertions' ) )
            // InternalUpctformaevalua.g:4807:1: ( 'assertions' )
            {
            // InternalUpctformaevalua.g:4807:1: ( 'assertions' )
            // InternalUpctformaevalua.g:4808:2: 'assertions'
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_3_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3__1"
    // InternalUpctformaevalua.g:4817:1: rule__TrueOrFalse__Group_3__1 : rule__TrueOrFalse__Group_3__1__Impl rule__TrueOrFalse__Group_3__2 ;
    public final void rule__TrueOrFalse__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4821:1: ( rule__TrueOrFalse__Group_3__1__Impl rule__TrueOrFalse__Group_3__2 )
            // InternalUpctformaevalua.g:4822:2: rule__TrueOrFalse__Group_3__1__Impl rule__TrueOrFalse__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__TrueOrFalse__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3__2();

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__1"


    // $ANTLR start "rule__TrueOrFalse__Group_3__1__Impl"
    // InternalUpctformaevalua.g:4829:1: rule__TrueOrFalse__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TrueOrFalse__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4833:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4834:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4834:1: ( '{' )
            // InternalUpctformaevalua.g:4835:2: '{'
            {
             before(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3__2"
    // InternalUpctformaevalua.g:4844:1: rule__TrueOrFalse__Group_3__2 : rule__TrueOrFalse__Group_3__2__Impl rule__TrueOrFalse__Group_3__3 ;
    public final void rule__TrueOrFalse__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4848:1: ( rule__TrueOrFalse__Group_3__2__Impl rule__TrueOrFalse__Group_3__3 )
            // InternalUpctformaevalua.g:4849:2: rule__TrueOrFalse__Group_3__2__Impl rule__TrueOrFalse__Group_3__3
            {
            pushFollow(FOLLOW_18);
            rule__TrueOrFalse__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3__3();

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__2"


    // $ANTLR start "rule__TrueOrFalse__Group_3__2__Impl"
    // InternalUpctformaevalua.g:4856:1: rule__TrueOrFalse__Group_3__2__Impl : ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) ) ;
    public final void rule__TrueOrFalse__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4860:1: ( ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) ) )
            // InternalUpctformaevalua.g:4861:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) )
            {
            // InternalUpctformaevalua.g:4861:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) )
            // InternalUpctformaevalua.g:4862:2: ( rule__TrueOrFalse__AssertionsAssignment_3_2 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_3_2()); 
            // InternalUpctformaevalua.g:4863:2: ( rule__TrueOrFalse__AssertionsAssignment_3_2 )
            // InternalUpctformaevalua.g:4863:3: rule__TrueOrFalse__AssertionsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__AssertionsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_3_2()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__2__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3__3"
    // InternalUpctformaevalua.g:4871:1: rule__TrueOrFalse__Group_3__3 : rule__TrueOrFalse__Group_3__3__Impl rule__TrueOrFalse__Group_3__4 ;
    public final void rule__TrueOrFalse__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4875:1: ( rule__TrueOrFalse__Group_3__3__Impl rule__TrueOrFalse__Group_3__4 )
            // InternalUpctformaevalua.g:4876:2: rule__TrueOrFalse__Group_3__3__Impl rule__TrueOrFalse__Group_3__4
            {
            pushFollow(FOLLOW_18);
            rule__TrueOrFalse__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3__4();

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__3"


    // $ANTLR start "rule__TrueOrFalse__Group_3__3__Impl"
    // InternalUpctformaevalua.g:4883:1: rule__TrueOrFalse__Group_3__3__Impl : ( ( rule__TrueOrFalse__Group_3_3__0 )* ) ;
    public final void rule__TrueOrFalse__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4887:1: ( ( ( rule__TrueOrFalse__Group_3_3__0 )* ) )
            // InternalUpctformaevalua.g:4888:1: ( ( rule__TrueOrFalse__Group_3_3__0 )* )
            {
            // InternalUpctformaevalua.g:4888:1: ( ( rule__TrueOrFalse__Group_3_3__0 )* )
            // InternalUpctformaevalua.g:4889:2: ( rule__TrueOrFalse__Group_3_3__0 )*
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_3_3()); 
            // InternalUpctformaevalua.g:4890:2: ( rule__TrueOrFalse__Group_3_3__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==23) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUpctformaevalua.g:4890:3: rule__TrueOrFalse__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TrueOrFalse__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getTrueOrFalseAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__3__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3__4"
    // InternalUpctformaevalua.g:4898:1: rule__TrueOrFalse__Group_3__4 : rule__TrueOrFalse__Group_3__4__Impl ;
    public final void rule__TrueOrFalse__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4902:1: ( rule__TrueOrFalse__Group_3__4__Impl )
            // InternalUpctformaevalua.g:4903:2: rule__TrueOrFalse__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3__4__Impl();

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__4"


    // $ANTLR start "rule__TrueOrFalse__Group_3__4__Impl"
    // InternalUpctformaevalua.g:4909:1: rule__TrueOrFalse__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TrueOrFalse__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4913:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4914:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4914:1: ( '}' )
            // InternalUpctformaevalua.g:4915:2: '}'
            {
             before(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_3__4__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3_3__0"
    // InternalUpctformaevalua.g:4925:1: rule__TrueOrFalse__Group_3_3__0 : rule__TrueOrFalse__Group_3_3__0__Impl rule__TrueOrFalse__Group_3_3__1 ;
    public final void rule__TrueOrFalse__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4929:1: ( rule__TrueOrFalse__Group_3_3__0__Impl rule__TrueOrFalse__Group_3_3__1 )
            // InternalUpctformaevalua.g:4930:2: rule__TrueOrFalse__Group_3_3__0__Impl rule__TrueOrFalse__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
            rule__TrueOrFalse__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3_3__1();

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
    // $ANTLR end "rule__TrueOrFalse__Group_3_3__0"


    // $ANTLR start "rule__TrueOrFalse__Group_3_3__0__Impl"
    // InternalUpctformaevalua.g:4937:1: rule__TrueOrFalse__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TrueOrFalse__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4941:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:4942:1: ( ',' )
            {
            // InternalUpctformaevalua.g:4942:1: ( ',' )
            // InternalUpctformaevalua.g:4943:2: ','
            {
             before(grammarAccess.getTrueOrFalseAccess().getCommaKeyword_3_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_3_3__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_3_3__1"
    // InternalUpctformaevalua.g:4952:1: rule__TrueOrFalse__Group_3_3__1 : rule__TrueOrFalse__Group_3_3__1__Impl ;
    public final void rule__TrueOrFalse__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4956:1: ( rule__TrueOrFalse__Group_3_3__1__Impl )
            // InternalUpctformaevalua.g:4957:2: rule__TrueOrFalse__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__TrueOrFalse__Group_3_3__1"


    // $ANTLR start "rule__TrueOrFalse__Group_3_3__1__Impl"
    // InternalUpctformaevalua.g:4963:1: rule__TrueOrFalse__Group_3_3__1__Impl : ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) ) ;
    public final void rule__TrueOrFalse__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4967:1: ( ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) ) )
            // InternalUpctformaevalua.g:4968:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) )
            {
            // InternalUpctformaevalua.g:4968:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) )
            // InternalUpctformaevalua.g:4969:2: ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_3_3_1()); 
            // InternalUpctformaevalua.g:4970:2: ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 )
            // InternalUpctformaevalua.g:4970:3: rule__TrueOrFalse__AssertionsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__AssertionsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_3_3__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_4__0"
    // InternalUpctformaevalua.g:4979:1: rule__TrueOrFalse__Group_4__0 : rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1 ;
    public final void rule__TrueOrFalse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4983:1: ( rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1 )
            // InternalUpctformaevalua.g:4984:2: rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__TrueOrFalse__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_4__1();

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
    // $ANTLR end "rule__TrueOrFalse__Group_4__0"


    // $ANTLR start "rule__TrueOrFalse__Group_4__0__Impl"
    // InternalUpctformaevalua.g:4991:1: rule__TrueOrFalse__Group_4__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__TrueOrFalse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4995:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:4996:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:4996:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:4997:2: 'correctfeedback'
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_4_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_4__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_4__1"
    // InternalUpctformaevalua.g:5006:1: rule__TrueOrFalse__Group_4__1 : rule__TrueOrFalse__Group_4__1__Impl ;
    public final void rule__TrueOrFalse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5010:1: ( rule__TrueOrFalse__Group_4__1__Impl )
            // InternalUpctformaevalua.g:5011:2: rule__TrueOrFalse__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_4__1__Impl();

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
    // $ANTLR end "rule__TrueOrFalse__Group_4__1"


    // $ANTLR start "rule__TrueOrFalse__Group_4__1__Impl"
    // InternalUpctformaevalua.g:5017:1: rule__TrueOrFalse__Group_4__1__Impl : ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__TrueOrFalse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5021:1: ( ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:5022:1: ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:5022:1: ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:5023:2: ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:5024:2: ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:5024:3: rule__TrueOrFalse__CorrectfeedbackAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__CorrectfeedbackAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackAssignment_4_1()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_4__1__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5__0"
    // InternalUpctformaevalua.g:5033:1: rule__TrueOrFalse__Group_5__0 : rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1 ;
    public final void rule__TrueOrFalse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5037:1: ( rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1 )
            // InternalUpctformaevalua.g:5038:2: rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__TrueOrFalse__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5__1();

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
    // $ANTLR end "rule__TrueOrFalse__Group_5__0"


    // $ANTLR start "rule__TrueOrFalse__Group_5__0__Impl"
    // InternalUpctformaevalua.g:5045:1: rule__TrueOrFalse__Group_5__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__TrueOrFalse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5049:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:5050:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:5050:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:5051:2: 'incorrectfeedback'
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_5_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_5__0__Impl"


    // $ANTLR start "rule__TrueOrFalse__Group_5__1"
    // InternalUpctformaevalua.g:5060:1: rule__TrueOrFalse__Group_5__1 : rule__TrueOrFalse__Group_5__1__Impl ;
    public final void rule__TrueOrFalse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5064:1: ( rule__TrueOrFalse__Group_5__1__Impl )
            // InternalUpctformaevalua.g:5065:2: rule__TrueOrFalse__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__Group_5__1__Impl();

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
    // $ANTLR end "rule__TrueOrFalse__Group_5__1"


    // $ANTLR start "rule__TrueOrFalse__Group_5__1__Impl"
    // InternalUpctformaevalua.g:5071:1: rule__TrueOrFalse__Group_5__1__Impl : ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) ) ;
    public final void rule__TrueOrFalse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5075:1: ( ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:5076:1: ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:5076:1: ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) )
            // InternalUpctformaevalua.g:5077:2: ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackAssignment_5_1()); 
            // InternalUpctformaevalua.g:5078:2: ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 )
            // InternalUpctformaevalua.g:5078:3: rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackAssignment_5_1()); 

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
    // $ANTLR end "rule__TrueOrFalse__Group_5__1__Impl"


    // $ANTLR start "rule__Paragraph__Group__0"
    // InternalUpctformaevalua.g:5087:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5091:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalUpctformaevalua.g:5092:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Paragraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1();

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
    // $ANTLR end "rule__Paragraph__Group__0"


    // $ANTLR start "rule__Paragraph__Group__0__Impl"
    // InternalUpctformaevalua.g:5099:1: rule__Paragraph__Group__0__Impl : ( () ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5103:1: ( ( () ) )
            // InternalUpctformaevalua.g:5104:1: ( () )
            {
            // InternalUpctformaevalua.g:5104:1: ( () )
            // InternalUpctformaevalua.g:5105:2: ()
            {
             before(grammarAccess.getParagraphAccess().getParagraphAction_0()); 
            // InternalUpctformaevalua.g:5106:2: ()
            // InternalUpctformaevalua.g:5106:3: 
            {
            }

             after(grammarAccess.getParagraphAccess().getParagraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paragraph__Group__0__Impl"


    // $ANTLR start "rule__Paragraph__Group__1"
    // InternalUpctformaevalua.g:5114:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5118:1: ( rule__Paragraph__Group__1__Impl )
            // InternalUpctformaevalua.g:5119:2: rule__Paragraph__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__Group__1__Impl();

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
    // $ANTLR end "rule__Paragraph__Group__1"


    // $ANTLR start "rule__Paragraph__Group__1__Impl"
    // InternalUpctformaevalua.g:5125:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__TextAssignment_1 )? ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5129:1: ( ( ( rule__Paragraph__TextAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5130:1: ( ( rule__Paragraph__TextAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5130:1: ( ( rule__Paragraph__TextAssignment_1 )? )
            // InternalUpctformaevalua.g:5131:2: ( rule__Paragraph__TextAssignment_1 )?
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_1()); 
            // InternalUpctformaevalua.g:5132:2: ( rule__Paragraph__TextAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_ID)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctformaevalua.g:5132:3: rule__Paragraph__TextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paragraph__TextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParagraphAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Paragraph__Group__1__Impl"


    // $ANTLR start "rule__Single__Group__0"
    // InternalUpctformaevalua.g:5141:1: rule__Single__Group__0 : rule__Single__Group__0__Impl rule__Single__Group__1 ;
    public final void rule__Single__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5145:1: ( rule__Single__Group__0__Impl rule__Single__Group__1 )
            // InternalUpctformaevalua.g:5146:2: rule__Single__Group__0__Impl rule__Single__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Single__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Single__Group__1();

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
    // $ANTLR end "rule__Single__Group__0"


    // $ANTLR start "rule__Single__Group__0__Impl"
    // InternalUpctformaevalua.g:5153:1: rule__Single__Group__0__Impl : ( () ) ;
    public final void rule__Single__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5157:1: ( ( () ) )
            // InternalUpctformaevalua.g:5158:1: ( () )
            {
            // InternalUpctformaevalua.g:5158:1: ( () )
            // InternalUpctformaevalua.g:5159:2: ()
            {
             before(grammarAccess.getSingleAccess().getSingleAction_0()); 
            // InternalUpctformaevalua.g:5160:2: ()
            // InternalUpctformaevalua.g:5160:3: 
            {
            }

             after(grammarAccess.getSingleAccess().getSingleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Single__Group__0__Impl"


    // $ANTLR start "rule__Single__Group__1"
    // InternalUpctformaevalua.g:5168:1: rule__Single__Group__1 : rule__Single__Group__1__Impl ;
    public final void rule__Single__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5172:1: ( rule__Single__Group__1__Impl )
            // InternalUpctformaevalua.g:5173:2: rule__Single__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Single__Group__1__Impl();

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
    // $ANTLR end "rule__Single__Group__1"


    // $ANTLR start "rule__Single__Group__1__Impl"
    // InternalUpctformaevalua.g:5179:1: rule__Single__Group__1__Impl : ( ( rule__Single__TextAssignment_1 )? ) ;
    public final void rule__Single__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5183:1: ( ( ( rule__Single__TextAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5184:1: ( ( rule__Single__TextAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5184:1: ( ( rule__Single__TextAssignment_1 )? )
            // InternalUpctformaevalua.g:5185:2: ( rule__Single__TextAssignment_1 )?
            {
             before(grammarAccess.getSingleAccess().getTextAssignment_1()); 
            // InternalUpctformaevalua.g:5186:2: ( rule__Single__TextAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctformaevalua.g:5186:3: rule__Single__TextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Single__TextAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Single__Group__1__Impl"


    // $ANTLR start "rule__Multiple__Group__0"
    // InternalUpctformaevalua.g:5195:1: rule__Multiple__Group__0 : rule__Multiple__Group__0__Impl rule__Multiple__Group__1 ;
    public final void rule__Multiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5199:1: ( rule__Multiple__Group__0__Impl rule__Multiple__Group__1 )
            // InternalUpctformaevalua.g:5200:2: rule__Multiple__Group__0__Impl rule__Multiple__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Multiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__1();

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
    // $ANTLR end "rule__Multiple__Group__0"


    // $ANTLR start "rule__Multiple__Group__0__Impl"
    // InternalUpctformaevalua.g:5207:1: rule__Multiple__Group__0__Impl : ( () ) ;
    public final void rule__Multiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5211:1: ( ( () ) )
            // InternalUpctformaevalua.g:5212:1: ( () )
            {
            // InternalUpctformaevalua.g:5212:1: ( () )
            // InternalUpctformaevalua.g:5213:2: ()
            {
             before(grammarAccess.getMultipleAccess().getMultipleAction_0()); 
            // InternalUpctformaevalua.g:5214:2: ()
            // InternalUpctformaevalua.g:5214:3: 
            {
            }

             after(grammarAccess.getMultipleAccess().getMultipleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiple__Group__0__Impl"


    // $ANTLR start "rule__Multiple__Group__1"
    // InternalUpctformaevalua.g:5222:1: rule__Multiple__Group__1 : rule__Multiple__Group__1__Impl rule__Multiple__Group__2 ;
    public final void rule__Multiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5226:1: ( rule__Multiple__Group__1__Impl rule__Multiple__Group__2 )
            // InternalUpctformaevalua.g:5227:2: rule__Multiple__Group__1__Impl rule__Multiple__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Multiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__2();

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
    // $ANTLR end "rule__Multiple__Group__1"


    // $ANTLR start "rule__Multiple__Group__1__Impl"
    // InternalUpctformaevalua.g:5234:1: rule__Multiple__Group__1__Impl : ( '{' ) ;
    public final void rule__Multiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5238:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5239:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5239:1: ( '{' )
            // InternalUpctformaevalua.g:5240:2: '{'
            {
             before(grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Multiple__Group__1__Impl"


    // $ANTLR start "rule__Multiple__Group__2"
    // InternalUpctformaevalua.g:5249:1: rule__Multiple__Group__2 : rule__Multiple__Group__2__Impl rule__Multiple__Group__3 ;
    public final void rule__Multiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5253:1: ( rule__Multiple__Group__2__Impl rule__Multiple__Group__3 )
            // InternalUpctformaevalua.g:5254:2: rule__Multiple__Group__2__Impl rule__Multiple__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Multiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__3();

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
    // $ANTLR end "rule__Multiple__Group__2"


    // $ANTLR start "rule__Multiple__Group__2__Impl"
    // InternalUpctformaevalua.g:5261:1: rule__Multiple__Group__2__Impl : ( ( rule__Multiple__Group_2__0 )? ) ;
    public final void rule__Multiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5265:1: ( ( ( rule__Multiple__Group_2__0 )? ) )
            // InternalUpctformaevalua.g:5266:1: ( ( rule__Multiple__Group_2__0 )? )
            {
            // InternalUpctformaevalua.g:5266:1: ( ( rule__Multiple__Group_2__0 )? )
            // InternalUpctformaevalua.g:5267:2: ( rule__Multiple__Group_2__0 )?
            {
             before(grammarAccess.getMultipleAccess().getGroup_2()); 
            // InternalUpctformaevalua.g:5268:2: ( rule__Multiple__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctformaevalua.g:5268:3: rule__Multiple__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiple__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Multiple__Group__2__Impl"


    // $ANTLR start "rule__Multiple__Group__3"
    // InternalUpctformaevalua.g:5276:1: rule__Multiple__Group__3 : rule__Multiple__Group__3__Impl rule__Multiple__Group__4 ;
    public final void rule__Multiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5280:1: ( rule__Multiple__Group__3__Impl rule__Multiple__Group__4 )
            // InternalUpctformaevalua.g:5281:2: rule__Multiple__Group__3__Impl rule__Multiple__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Multiple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group__4();

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
    // $ANTLR end "rule__Multiple__Group__3"


    // $ANTLR start "rule__Multiple__Group__3__Impl"
    // InternalUpctformaevalua.g:5288:1: rule__Multiple__Group__3__Impl : ( ( rule__Multiple__ValueAssignment_3 )? ) ;
    public final void rule__Multiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5292:1: ( ( ( rule__Multiple__ValueAssignment_3 )? ) )
            // InternalUpctformaevalua.g:5293:1: ( ( rule__Multiple__ValueAssignment_3 )? )
            {
            // InternalUpctformaevalua.g:5293:1: ( ( rule__Multiple__ValueAssignment_3 )? )
            // InternalUpctformaevalua.g:5294:2: ( rule__Multiple__ValueAssignment_3 )?
            {
             before(grammarAccess.getMultipleAccess().getValueAssignment_3()); 
            // InternalUpctformaevalua.g:5295:2: ( rule__Multiple__ValueAssignment_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=11 && LA45_0<=12)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctformaevalua.g:5295:3: rule__Multiple__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiple__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Multiple__Group__3__Impl"


    // $ANTLR start "rule__Multiple__Group__4"
    // InternalUpctformaevalua.g:5303:1: rule__Multiple__Group__4 : rule__Multiple__Group__4__Impl ;
    public final void rule__Multiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5307:1: ( rule__Multiple__Group__4__Impl )
            // InternalUpctformaevalua.g:5308:2: rule__Multiple__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__Group__4__Impl();

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
    // $ANTLR end "rule__Multiple__Group__4"


    // $ANTLR start "rule__Multiple__Group__4__Impl"
    // InternalUpctformaevalua.g:5314:1: rule__Multiple__Group__4__Impl : ( '}' ) ;
    public final void rule__Multiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5318:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5319:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5319:1: ( '}' )
            // InternalUpctformaevalua.g:5320:2: '}'
            {
             before(grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Multiple__Group__4__Impl"


    // $ANTLR start "rule__Multiple__Group_2__0"
    // InternalUpctformaevalua.g:5330:1: rule__Multiple__Group_2__0 : rule__Multiple__Group_2__0__Impl rule__Multiple__Group_2__1 ;
    public final void rule__Multiple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5334:1: ( rule__Multiple__Group_2__0__Impl rule__Multiple__Group_2__1 )
            // InternalUpctformaevalua.g:5335:2: rule__Multiple__Group_2__0__Impl rule__Multiple__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Multiple__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiple__Group_2__1();

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
    // $ANTLR end "rule__Multiple__Group_2__0"


    // $ANTLR start "rule__Multiple__Group_2__0__Impl"
    // InternalUpctformaevalua.g:5342:1: rule__Multiple__Group_2__0__Impl : ( ( rule__Multiple__TextAssignment_2_0 ) ) ;
    public final void rule__Multiple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5346:1: ( ( ( rule__Multiple__TextAssignment_2_0 ) ) )
            // InternalUpctformaevalua.g:5347:1: ( ( rule__Multiple__TextAssignment_2_0 ) )
            {
            // InternalUpctformaevalua.g:5347:1: ( ( rule__Multiple__TextAssignment_2_0 ) )
            // InternalUpctformaevalua.g:5348:2: ( rule__Multiple__TextAssignment_2_0 )
            {
             before(grammarAccess.getMultipleAccess().getTextAssignment_2_0()); 
            // InternalUpctformaevalua.g:5349:2: ( rule__Multiple__TextAssignment_2_0 )
            // InternalUpctformaevalua.g:5349:3: rule__Multiple__TextAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__TextAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleAccess().getTextAssignment_2_0()); 

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
    // $ANTLR end "rule__Multiple__Group_2__0__Impl"


    // $ANTLR start "rule__Multiple__Group_2__1"
    // InternalUpctformaevalua.g:5357:1: rule__Multiple__Group_2__1 : rule__Multiple__Group_2__1__Impl ;
    public final void rule__Multiple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5361:1: ( rule__Multiple__Group_2__1__Impl )
            // InternalUpctformaevalua.g:5362:2: rule__Multiple__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiple__Group_2__1__Impl();

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
    // $ANTLR end "rule__Multiple__Group_2__1"


    // $ANTLR start "rule__Multiple__Group_2__1__Impl"
    // InternalUpctformaevalua.g:5368:1: rule__Multiple__Group_2__1__Impl : ( ',' ) ;
    public final void rule__Multiple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5372:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:5373:1: ( ',' )
            {
            // InternalUpctformaevalua.g:5373:1: ( ',' )
            // InternalUpctformaevalua.g:5374:2: ','
            {
             before(grammarAccess.getMultipleAccess().getCommaKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMultipleAccess().getCommaKeyword_2_1()); 

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
    // $ANTLR end "rule__Multiple__Group_2__1__Impl"


    // $ANTLR start "rule__Hole__Group__0"
    // InternalUpctformaevalua.g:5384:1: rule__Hole__Group__0 : rule__Hole__Group__0__Impl rule__Hole__Group__1 ;
    public final void rule__Hole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5388:1: ( rule__Hole__Group__0__Impl rule__Hole__Group__1 )
            // InternalUpctformaevalua.g:5389:2: rule__Hole__Group__0__Impl rule__Hole__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Hole__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__1();

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
    // $ANTLR end "rule__Hole__Group__0"


    // $ANTLR start "rule__Hole__Group__0__Impl"
    // InternalUpctformaevalua.g:5396:1: rule__Hole__Group__0__Impl : ( () ) ;
    public final void rule__Hole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5400:1: ( ( () ) )
            // InternalUpctformaevalua.g:5401:1: ( () )
            {
            // InternalUpctformaevalua.g:5401:1: ( () )
            // InternalUpctformaevalua.g:5402:2: ()
            {
             before(grammarAccess.getHoleAccess().getHoleAction_0()); 
            // InternalUpctformaevalua.g:5403:2: ()
            // InternalUpctformaevalua.g:5403:3: 
            {
            }

             after(grammarAccess.getHoleAccess().getHoleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hole__Group__0__Impl"


    // $ANTLR start "rule__Hole__Group__1"
    // InternalUpctformaevalua.g:5411:1: rule__Hole__Group__1 : rule__Hole__Group__1__Impl rule__Hole__Group__2 ;
    public final void rule__Hole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5415:1: ( rule__Hole__Group__1__Impl rule__Hole__Group__2 )
            // InternalUpctformaevalua.g:5416:2: rule__Hole__Group__1__Impl rule__Hole__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Hole__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__2();

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
    // $ANTLR end "rule__Hole__Group__1"


    // $ANTLR start "rule__Hole__Group__1__Impl"
    // InternalUpctformaevalua.g:5423:1: rule__Hole__Group__1__Impl : ( 'Hole' ) ;
    public final void rule__Hole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5427:1: ( ( 'Hole' ) )
            // InternalUpctformaevalua.g:5428:1: ( 'Hole' )
            {
            // InternalUpctformaevalua.g:5428:1: ( 'Hole' )
            // InternalUpctformaevalua.g:5429:2: 'Hole'
            {
             before(grammarAccess.getHoleAccess().getHoleKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getHoleKeyword_1()); 

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
    // $ANTLR end "rule__Hole__Group__1__Impl"


    // $ANTLR start "rule__Hole__Group__2"
    // InternalUpctformaevalua.g:5438:1: rule__Hole__Group__2 : rule__Hole__Group__2__Impl rule__Hole__Group__3 ;
    public final void rule__Hole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5442:1: ( rule__Hole__Group__2__Impl rule__Hole__Group__3 )
            // InternalUpctformaevalua.g:5443:2: rule__Hole__Group__2__Impl rule__Hole__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Hole__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__3();

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
    // $ANTLR end "rule__Hole__Group__2"


    // $ANTLR start "rule__Hole__Group__2__Impl"
    // InternalUpctformaevalua.g:5450:1: rule__Hole__Group__2__Impl : ( '{' ) ;
    public final void rule__Hole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5454:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5455:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5455:1: ( '{' )
            // InternalUpctformaevalua.g:5456:2: '{'
            {
             before(grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Hole__Group__2__Impl"


    // $ANTLR start "rule__Hole__Group__3"
    // InternalUpctformaevalua.g:5465:1: rule__Hole__Group__3 : rule__Hole__Group__3__Impl rule__Hole__Group__4 ;
    public final void rule__Hole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5469:1: ( rule__Hole__Group__3__Impl rule__Hole__Group__4 )
            // InternalUpctformaevalua.g:5470:2: rule__Hole__Group__3__Impl rule__Hole__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Hole__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__4();

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
    // $ANTLR end "rule__Hole__Group__3"


    // $ANTLR start "rule__Hole__Group__3__Impl"
    // InternalUpctformaevalua.g:5477:1: rule__Hole__Group__3__Impl : ( ( rule__Hole__Group_3__0 )? ) ;
    public final void rule__Hole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5481:1: ( ( ( rule__Hole__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:5482:1: ( ( rule__Hole__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:5482:1: ( ( rule__Hole__Group_3__0 )? )
            // InternalUpctformaevalua.g:5483:2: ( rule__Hole__Group_3__0 )?
            {
             before(grammarAccess.getHoleAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:5484:2: ( rule__Hole__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctformaevalua.g:5484:3: rule__Hole__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hole__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHoleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Hole__Group__3__Impl"


    // $ANTLR start "rule__Hole__Group__4"
    // InternalUpctformaevalua.g:5492:1: rule__Hole__Group__4 : rule__Hole__Group__4__Impl rule__Hole__Group__5 ;
    public final void rule__Hole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5496:1: ( rule__Hole__Group__4__Impl rule__Hole__Group__5 )
            // InternalUpctformaevalua.g:5497:2: rule__Hole__Group__4__Impl rule__Hole__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Hole__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group__5();

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
    // $ANTLR end "rule__Hole__Group__4"


    // $ANTLR start "rule__Hole__Group__4__Impl"
    // InternalUpctformaevalua.g:5504:1: rule__Hole__Group__4__Impl : ( ( rule__Hole__Group_4__0 )? ) ;
    public final void rule__Hole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5508:1: ( ( ( rule__Hole__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:5509:1: ( ( rule__Hole__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:5509:1: ( ( rule__Hole__Group_4__0 )? )
            // InternalUpctformaevalua.g:5510:2: ( rule__Hole__Group_4__0 )?
            {
             before(grammarAccess.getHoleAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:5511:2: ( rule__Hole__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctformaevalua.g:5511:3: rule__Hole__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Hole__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHoleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Hole__Group__4__Impl"


    // $ANTLR start "rule__Hole__Group__5"
    // InternalUpctformaevalua.g:5519:1: rule__Hole__Group__5 : rule__Hole__Group__5__Impl ;
    public final void rule__Hole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5523:1: ( rule__Hole__Group__5__Impl )
            // InternalUpctformaevalua.g:5524:2: rule__Hole__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group__5__Impl();

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
    // $ANTLR end "rule__Hole__Group__5"


    // $ANTLR start "rule__Hole__Group__5__Impl"
    // InternalUpctformaevalua.g:5530:1: rule__Hole__Group__5__Impl : ( '}' ) ;
    public final void rule__Hole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5534:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5535:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5535:1: ( '}' )
            // InternalUpctformaevalua.g:5536:2: '}'
            {
             before(grammarAccess.getHoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Hole__Group__5__Impl"


    // $ANTLR start "rule__Hole__Group_3__0"
    // InternalUpctformaevalua.g:5546:1: rule__Hole__Group_3__0 : rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1 ;
    public final void rule__Hole__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5550:1: ( rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1 )
            // InternalUpctformaevalua.g:5551:2: rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Hole__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group_3__1();

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
    // $ANTLR end "rule__Hole__Group_3__0"


    // $ANTLR start "rule__Hole__Group_3__0__Impl"
    // InternalUpctformaevalua.g:5558:1: rule__Hole__Group_3__0__Impl : ( 'text' ) ;
    public final void rule__Hole__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5562:1: ( ( 'text' ) )
            // InternalUpctformaevalua.g:5563:1: ( 'text' )
            {
            // InternalUpctformaevalua.g:5563:1: ( 'text' )
            // InternalUpctformaevalua.g:5564:2: 'text'
            {
             before(grammarAccess.getHoleAccess().getTextKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getTextKeyword_3_0()); 

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
    // $ANTLR end "rule__Hole__Group_3__0__Impl"


    // $ANTLR start "rule__Hole__Group_3__1"
    // InternalUpctformaevalua.g:5573:1: rule__Hole__Group_3__1 : rule__Hole__Group_3__1__Impl ;
    public final void rule__Hole__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5577:1: ( rule__Hole__Group_3__1__Impl )
            // InternalUpctformaevalua.g:5578:2: rule__Hole__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group_3__1__Impl();

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
    // $ANTLR end "rule__Hole__Group_3__1"


    // $ANTLR start "rule__Hole__Group_3__1__Impl"
    // InternalUpctformaevalua.g:5584:1: rule__Hole__Group_3__1__Impl : ( ( rule__Hole__TextAssignment_3_1 ) ) ;
    public final void rule__Hole__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5588:1: ( ( ( rule__Hole__TextAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:5589:1: ( ( rule__Hole__TextAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:5589:1: ( ( rule__Hole__TextAssignment_3_1 ) )
            // InternalUpctformaevalua.g:5590:2: ( rule__Hole__TextAssignment_3_1 )
            {
             before(grammarAccess.getHoleAccess().getTextAssignment_3_1()); 
            // InternalUpctformaevalua.g:5591:2: ( rule__Hole__TextAssignment_3_1 )
            // InternalUpctformaevalua.g:5591:3: rule__Hole__TextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Hole__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__Hole__Group_3__1__Impl"


    // $ANTLR start "rule__Hole__Group_4__0"
    // InternalUpctformaevalua.g:5600:1: rule__Hole__Group_4__0 : rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1 ;
    public final void rule__Hole__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5604:1: ( rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1 )
            // InternalUpctformaevalua.g:5605:2: rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1
            {
            pushFollow(FOLLOW_33);
            rule__Hole__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hole__Group_4__1();

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
    // $ANTLR end "rule__Hole__Group_4__0"


    // $ANTLR start "rule__Hole__Group_4__0__Impl"
    // InternalUpctformaevalua.g:5612:1: rule__Hole__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Hole__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5616:1: ( ( 'type' ) )
            // InternalUpctformaevalua.g:5617:1: ( 'type' )
            {
            // InternalUpctformaevalua.g:5617:1: ( 'type' )
            // InternalUpctformaevalua.g:5618:2: 'type'
            {
             before(grammarAccess.getHoleAccess().getTypeKeyword_4_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getHoleAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Hole__Group_4__0__Impl"


    // $ANTLR start "rule__Hole__Group_4__1"
    // InternalUpctformaevalua.g:5627:1: rule__Hole__Group_4__1 : rule__Hole__Group_4__1__Impl ;
    public final void rule__Hole__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5631:1: ( rule__Hole__Group_4__1__Impl )
            // InternalUpctformaevalua.g:5632:2: rule__Hole__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hole__Group_4__1__Impl();

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
    // $ANTLR end "rule__Hole__Group_4__1"


    // $ANTLR start "rule__Hole__Group_4__1__Impl"
    // InternalUpctformaevalua.g:5638:1: rule__Hole__Group_4__1__Impl : ( ( rule__Hole__TypeAssignment_4_1 ) ) ;
    public final void rule__Hole__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5642:1: ( ( ( rule__Hole__TypeAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:5643:1: ( ( rule__Hole__TypeAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:5643:1: ( ( rule__Hole__TypeAssignment_4_1 ) )
            // InternalUpctformaevalua.g:5644:2: ( rule__Hole__TypeAssignment_4_1 )
            {
             before(grammarAccess.getHoleAccess().getTypeAssignment_4_1()); 
            // InternalUpctformaevalua.g:5645:2: ( rule__Hole__TypeAssignment_4_1 )
            // InternalUpctformaevalua.g:5645:3: rule__Hole__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Hole__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHoleAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Hole__Group_4__1__Impl"


    // $ANTLR start "rule__Assertion__Group__0"
    // InternalUpctformaevalua.g:5654:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5658:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalUpctformaevalua.g:5659:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Assertion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__1();

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
    // $ANTLR end "rule__Assertion__Group__0"


    // $ANTLR start "rule__Assertion__Group__0__Impl"
    // InternalUpctformaevalua.g:5666:1: rule__Assertion__Group__0__Impl : ( () ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5670:1: ( ( () ) )
            // InternalUpctformaevalua.g:5671:1: ( () )
            {
            // InternalUpctformaevalua.g:5671:1: ( () )
            // InternalUpctformaevalua.g:5672:2: ()
            {
             before(grammarAccess.getAssertionAccess().getAssertionAction_0()); 
            // InternalUpctformaevalua.g:5673:2: ()
            // InternalUpctformaevalua.g:5673:3: 
            {
            }

             after(grammarAccess.getAssertionAccess().getAssertionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assertion__Group__0__Impl"


    // $ANTLR start "rule__Assertion__Group__1"
    // InternalUpctformaevalua.g:5681:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5685:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // InternalUpctformaevalua.g:5686:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Assertion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__2();

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
    // $ANTLR end "rule__Assertion__Group__1"


    // $ANTLR start "rule__Assertion__Group__1__Impl"
    // InternalUpctformaevalua.g:5693:1: rule__Assertion__Group__1__Impl : ( '{' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5697:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5698:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5698:1: ( '{' )
            // InternalUpctformaevalua.g:5699:2: '{'
            {
             before(grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Assertion__Group__1__Impl"


    // $ANTLR start "rule__Assertion__Group__2"
    // InternalUpctformaevalua.g:5708:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl rule__Assertion__Group__3 ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5712:1: ( rule__Assertion__Group__2__Impl rule__Assertion__Group__3 )
            // InternalUpctformaevalua.g:5713:2: rule__Assertion__Group__2__Impl rule__Assertion__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Assertion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__3();

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
    // $ANTLR end "rule__Assertion__Group__2"


    // $ANTLR start "rule__Assertion__Group__2__Impl"
    // InternalUpctformaevalua.g:5720:1: rule__Assertion__Group__2__Impl : ( ( rule__Assertion__Group_2__0 )? ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5724:1: ( ( ( rule__Assertion__Group_2__0 )? ) )
            // InternalUpctformaevalua.g:5725:1: ( ( rule__Assertion__Group_2__0 )? )
            {
            // InternalUpctformaevalua.g:5725:1: ( ( rule__Assertion__Group_2__0 )? )
            // InternalUpctformaevalua.g:5726:2: ( rule__Assertion__Group_2__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_2()); 
            // InternalUpctformaevalua.g:5727:2: ( rule__Assertion__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_ID)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctformaevalua.g:5727:3: rule__Assertion__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Assertion__Group__2__Impl"


    // $ANTLR start "rule__Assertion__Group__3"
    // InternalUpctformaevalua.g:5735:1: rule__Assertion__Group__3 : rule__Assertion__Group__3__Impl rule__Assertion__Group__4 ;
    public final void rule__Assertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5739:1: ( rule__Assertion__Group__3__Impl rule__Assertion__Group__4 )
            // InternalUpctformaevalua.g:5740:2: rule__Assertion__Group__3__Impl rule__Assertion__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Assertion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group__4();

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
    // $ANTLR end "rule__Assertion__Group__3"


    // $ANTLR start "rule__Assertion__Group__3__Impl"
    // InternalUpctformaevalua.g:5747:1: rule__Assertion__Group__3__Impl : ( ( rule__Assertion__ValueAssignment_3 )? ) ;
    public final void rule__Assertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5751:1: ( ( ( rule__Assertion__ValueAssignment_3 )? ) )
            // InternalUpctformaevalua.g:5752:1: ( ( rule__Assertion__ValueAssignment_3 )? )
            {
            // InternalUpctformaevalua.g:5752:1: ( ( rule__Assertion__ValueAssignment_3 )? )
            // InternalUpctformaevalua.g:5753:2: ( rule__Assertion__ValueAssignment_3 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_3()); 
            // InternalUpctformaevalua.g:5754:2: ( rule__Assertion__ValueAssignment_3 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=11 && LA49_0<=12)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUpctformaevalua.g:5754:3: rule__Assertion__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assertion__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssertionAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Assertion__Group__3__Impl"


    // $ANTLR start "rule__Assertion__Group__4"
    // InternalUpctformaevalua.g:5762:1: rule__Assertion__Group__4 : rule__Assertion__Group__4__Impl ;
    public final void rule__Assertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5766:1: ( rule__Assertion__Group__4__Impl )
            // InternalUpctformaevalua.g:5767:2: rule__Assertion__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group__4__Impl();

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
    // $ANTLR end "rule__Assertion__Group__4"


    // $ANTLR start "rule__Assertion__Group__4__Impl"
    // InternalUpctformaevalua.g:5773:1: rule__Assertion__Group__4__Impl : ( '}' ) ;
    public final void rule__Assertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5777:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5778:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5778:1: ( '}' )
            // InternalUpctformaevalua.g:5779:2: '}'
            {
             before(grammarAccess.getAssertionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Assertion__Group__4__Impl"


    // $ANTLR start "rule__Assertion__Group_2__0"
    // InternalUpctformaevalua.g:5789:1: rule__Assertion__Group_2__0 : rule__Assertion__Group_2__0__Impl rule__Assertion__Group_2__1 ;
    public final void rule__Assertion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5793:1: ( rule__Assertion__Group_2__0__Impl rule__Assertion__Group_2__1 )
            // InternalUpctformaevalua.g:5794:2: rule__Assertion__Group_2__0__Impl rule__Assertion__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Assertion__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assertion__Group_2__1();

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
    // $ANTLR end "rule__Assertion__Group_2__0"


    // $ANTLR start "rule__Assertion__Group_2__0__Impl"
    // InternalUpctformaevalua.g:5801:1: rule__Assertion__Group_2__0__Impl : ( ( rule__Assertion__TextAssignment_2_0 ) ) ;
    public final void rule__Assertion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5805:1: ( ( ( rule__Assertion__TextAssignment_2_0 ) ) )
            // InternalUpctformaevalua.g:5806:1: ( ( rule__Assertion__TextAssignment_2_0 ) )
            {
            // InternalUpctformaevalua.g:5806:1: ( ( rule__Assertion__TextAssignment_2_0 ) )
            // InternalUpctformaevalua.g:5807:2: ( rule__Assertion__TextAssignment_2_0 )
            {
             before(grammarAccess.getAssertionAccess().getTextAssignment_2_0()); 
            // InternalUpctformaevalua.g:5808:2: ( rule__Assertion__TextAssignment_2_0 )
            // InternalUpctformaevalua.g:5808:3: rule__Assertion__TextAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__TextAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssertionAccess().getTextAssignment_2_0()); 

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
    // $ANTLR end "rule__Assertion__Group_2__0__Impl"


    // $ANTLR start "rule__Assertion__Group_2__1"
    // InternalUpctformaevalua.g:5816:1: rule__Assertion__Group_2__1 : rule__Assertion__Group_2__1__Impl ;
    public final void rule__Assertion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5820:1: ( rule__Assertion__Group_2__1__Impl )
            // InternalUpctformaevalua.g:5821:2: rule__Assertion__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assertion__Group_2__1__Impl();

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
    // $ANTLR end "rule__Assertion__Group_2__1"


    // $ANTLR start "rule__Assertion__Group_2__1__Impl"
    // InternalUpctformaevalua.g:5827:1: rule__Assertion__Group_2__1__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5831:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:5832:1: ( ',' )
            {
            // InternalUpctformaevalua.g:5832:1: ( ',' )
            // InternalUpctformaevalua.g:5833:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssertionAccess().getCommaKeyword_2_1()); 

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
    // $ANTLR end "rule__Assertion__Group_2__1__Impl"


    // $ANTLR start "rule__Evaluation__NameAssignment_2"
    // InternalUpctformaevalua.g:5843:1: rule__Evaluation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Evaluation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5847:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5848:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5848:2: ( ruleEString )
            // InternalUpctformaevalua.g:5849:3: ruleEString
            {
             before(grammarAccess.getEvaluationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Evaluation__NameAssignment_2"


    // $ANTLR start "rule__Evaluation__NameAssignment_4_1"
    // InternalUpctformaevalua.g:5858:1: rule__Evaluation__NameAssignment_4_1 : ( ruleQualifiedName ) ;
    public final void rule__Evaluation__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5862:1: ( ( ruleQualifiedName ) )
            // InternalUpctformaevalua.g:5863:2: ( ruleQualifiedName )
            {
            // InternalUpctformaevalua.g:5863:2: ( ruleQualifiedName )
            // InternalUpctformaevalua.g:5864:3: ruleQualifiedName
            {
             before(grammarAccess.getEvaluationAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Evaluation__NameAssignment_4_1"


    // $ANTLR start "rule__Evaluation__UnitsAssignment_5_0"
    // InternalUpctformaevalua.g:5873:1: rule__Evaluation__UnitsAssignment_5_0 : ( ruleEvaluationUnit ) ;
    public final void rule__Evaluation__UnitsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5877:1: ( ( ruleEvaluationUnit ) )
            // InternalUpctformaevalua.g:5878:2: ( ruleEvaluationUnit )
            {
            // InternalUpctformaevalua.g:5878:2: ( ruleEvaluationUnit )
            // InternalUpctformaevalua.g:5879:3: ruleEvaluationUnit
            {
             before(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationUnit();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Evaluation__UnitsAssignment_5_0"


    // $ANTLR start "rule__Evaluation__UnitsAssignment_5_1_1"
    // InternalUpctformaevalua.g:5888:1: rule__Evaluation__UnitsAssignment_5_1_1 : ( ruleEvaluationUnit ) ;
    public final void rule__Evaluation__UnitsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5892:1: ( ( ruleEvaluationUnit ) )
            // InternalUpctformaevalua.g:5893:2: ( ruleEvaluationUnit )
            {
            // InternalUpctformaevalua.g:5893:2: ( ruleEvaluationUnit )
            // InternalUpctformaevalua.g:5894:3: ruleEvaluationUnit
            {
             before(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationUnit();

            state._fsp--;

             after(grammarAccess.getEvaluationAccess().getUnitsEvaluationUnitParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__Evaluation__UnitsAssignment_5_1_1"


    // $ANTLR start "rule__EvaluationUnit_Impl__NameAssignment_2"
    // InternalUpctformaevalua.g:5903:1: rule__EvaluationUnit_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EvaluationUnit_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5907:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5908:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5908:2: ( ruleEString )
            // InternalUpctformaevalua.g:5909:3: ruleEString
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__NameAssignment_2"


    // $ANTLR start "rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1"
    // InternalUpctformaevalua.g:5918:1: rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5922:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:5923:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:5923:2: ( ruleEInt )
            // InternalUpctformaevalua.g:5924:3: ruleEInt
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__NumberquestionsAssignment_4_1"


    // $ANTLR start "rule__EvaluationUnit_Impl__QuestionsAssignment_5_2"
    // InternalUpctformaevalua.g:5933:1: rule__EvaluationUnit_Impl__QuestionsAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__EvaluationUnit_Impl__QuestionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5937:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:5938:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:5938:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:5939:3: ruleQuestion
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__QuestionsAssignment_5_2"


    // $ANTLR start "rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1"
    // InternalUpctformaevalua.g:5948:1: rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5952:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:5953:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:5953:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:5954:3: ruleQuestion
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__EvaluationUnit_Impl__QuestionsAssignment_5_3_1"


    // $ANTLR start "rule__Question_Impl__CorrectfeedbackAssignment_3_1"
    // InternalUpctformaevalua.g:5963:1: rule__Question_Impl__CorrectfeedbackAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__CorrectfeedbackAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5967:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5968:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5968:2: ( ruleEString )
            // InternalUpctformaevalua.g:5969:3: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Question_Impl__CorrectfeedbackAssignment_3_1"


    // $ANTLR start "rule__Question_Impl__IncorrectfeedbackAssignment_4_1"
    // InternalUpctformaevalua.g:5978:1: rule__Question_Impl__IncorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__IncorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5982:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5983:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5983:2: ( ruleEString )
            // InternalUpctformaevalua.g:5984:3: ruleEString
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Question_Impl__IncorrectfeedbackAssignment_4_1"


    // $ANTLR start "rule__Training__NameAssignment_2"
    // InternalUpctformaevalua.g:5993:1: rule__Training__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Training__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5997:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5998:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5998:2: ( ruleEString )
            // InternalUpctformaevalua.g:5999:3: ruleEString
            {
             before(grammarAccess.getTrainingAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Training__NameAssignment_2"


    // $ANTLR start "rule__Training__NumberquestionsAssignment_4_1"
    // InternalUpctformaevalua.g:6008:1: rule__Training__NumberquestionsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Training__NumberquestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6012:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6013:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6013:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6014:3: ruleEInt
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Training__NumberquestionsAssignment_4_1"


    // $ANTLR start "rule__Training__AttemptsAssignment_5_1"
    // InternalUpctformaevalua.g:6023:1: rule__Training__AttemptsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Training__AttemptsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6027:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6028:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6028:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6029:3: ruleEInt
            {
             before(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Training__AttemptsAssignment_5_1"


    // $ANTLR start "rule__Training__GradeAssignment_6_1"
    // InternalUpctformaevalua.g:6038:1: rule__Training__GradeAssignment_6_1 : ( ruleTypeGrade ) ;
    public final void rule__Training__GradeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6042:1: ( ( ruleTypeGrade ) )
            // InternalUpctformaevalua.g:6043:2: ( ruleTypeGrade )
            {
            // InternalUpctformaevalua.g:6043:2: ( ruleTypeGrade )
            // InternalUpctformaevalua.g:6044:3: ruleTypeGrade
            {
             before(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeGrade();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Training__GradeAssignment_6_1"


    // $ANTLR start "rule__Training__QuestionsAssignment_7_2"
    // InternalUpctformaevalua.g:6053:1: rule__Training__QuestionsAssignment_7_2 : ( ruleQuestion ) ;
    public final void rule__Training__QuestionsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6057:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6058:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6058:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6059:3: ruleQuestion
            {
             before(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Training__QuestionsAssignment_7_2"


    // $ANTLR start "rule__Training__QuestionsAssignment_7_3_1"
    // InternalUpctformaevalua.g:6068:1: rule__Training__QuestionsAssignment_7_3_1 : ( ruleQuestion ) ;
    public final void rule__Training__QuestionsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6072:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6073:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6073:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6074:3: ruleQuestion
            {
             before(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__Training__QuestionsAssignment_7_3_1"


    // $ANTLR start "rule__Final__NameAssignment_2"
    // InternalUpctformaevalua.g:6083:1: rule__Final__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Final__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6087:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6088:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6088:2: ( ruleEString )
            // InternalUpctformaevalua.g:6089:3: ruleEString
            {
             before(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Final__NameAssignment_2"


    // $ANTLR start "rule__Final__NumberquestionsAssignment_4_1"
    // InternalUpctformaevalua.g:6098:1: rule__Final__NumberquestionsAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Final__NumberquestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6102:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6103:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6103:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6104:3: ruleEInt
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Final__NumberquestionsAssignment_4_1"


    // $ANTLR start "rule__Final__QuestionsAssignment_5_2"
    // InternalUpctformaevalua.g:6113:1: rule__Final__QuestionsAssignment_5_2 : ( ruleQuestion ) ;
    public final void rule__Final__QuestionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6117:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6118:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6118:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6119:3: ruleQuestion
            {
             before(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Final__QuestionsAssignment_5_2"


    // $ANTLR start "rule__Final__QuestionsAssignment_5_3_1"
    // InternalUpctformaevalua.g:6128:1: rule__Final__QuestionsAssignment_5_3_1 : ( ruleQuestion ) ;
    public final void rule__Final__QuestionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6132:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6133:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6133:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6134:3: ruleQuestion
            {
             before(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Final__QuestionsAssignment_5_3_1"


    // $ANTLR start "rule__SingleAnswer__StatementsAssignment_3"
    // InternalUpctformaevalua.g:6143:1: rule__SingleAnswer__StatementsAssignment_3 : ( ruleParagraph ) ;
    public final void rule__SingleAnswer__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6147:1: ( ( ruleParagraph ) )
            // InternalUpctformaevalua.g:6148:2: ( ruleParagraph )
            {
            // InternalUpctformaevalua.g:6148:2: ( ruleParagraph )
            // InternalUpctformaevalua.g:6149:3: ruleParagraph
            {
             before(grammarAccess.getSingleAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getSingleAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SingleAnswer__StatementsAssignment_3"


    // $ANTLR start "rule__SingleAnswer__AnswersAssignment_4_2"
    // InternalUpctformaevalua.g:6158:1: rule__SingleAnswer__AnswersAssignment_4_2 : ( ruleSingle ) ;
    public final void rule__SingleAnswer__AnswersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6162:1: ( ( ruleSingle ) )
            // InternalUpctformaevalua.g:6163:2: ( ruleSingle )
            {
            // InternalUpctformaevalua.g:6163:2: ( ruleSingle )
            // InternalUpctformaevalua.g:6164:3: ruleSingle
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersSingleParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSingle();

            state._fsp--;

             after(grammarAccess.getSingleAnswerAccess().getAnswersSingleParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__SingleAnswer__AnswersAssignment_4_2"


    // $ANTLR start "rule__SingleAnswer__AnswersAssignment_4_3_1"
    // InternalUpctformaevalua.g:6173:1: rule__SingleAnswer__AnswersAssignment_4_3_1 : ( ruleSingle ) ;
    public final void rule__SingleAnswer__AnswersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6177:1: ( ( ruleSingle ) )
            // InternalUpctformaevalua.g:6178:2: ( ruleSingle )
            {
            // InternalUpctformaevalua.g:6178:2: ( ruleSingle )
            // InternalUpctformaevalua.g:6179:3: ruleSingle
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersSingleParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingle();

            state._fsp--;

             after(grammarAccess.getSingleAnswerAccess().getAnswersSingleParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__SingleAnswer__AnswersAssignment_4_3_1"


    // $ANTLR start "rule__SingleAnswer__CorrectanswerAssignment_5_1"
    // InternalUpctformaevalua.g:6188:1: rule__SingleAnswer__CorrectanswerAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__SingleAnswer__CorrectanswerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6192:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6193:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6193:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6194:3: ruleEInt
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectanswerEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSingleAnswerAccess().getCorrectanswerEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SingleAnswer__CorrectanswerAssignment_5_1"


    // $ANTLR start "rule__SingleAnswer__CorrectfeedbackAssignment_6_1"
    // InternalUpctformaevalua.g:6203:1: rule__SingleAnswer__CorrectfeedbackAssignment_6_1 : ( ruleEString ) ;
    public final void rule__SingleAnswer__CorrectfeedbackAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6207:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6208:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6208:2: ( ruleEString )
            // InternalUpctformaevalua.g:6209:3: ruleEString
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__SingleAnswer__CorrectfeedbackAssignment_6_1"


    // $ANTLR start "rule__SingleAnswer__IncorrectfeedbackAssignment_7_1"
    // InternalUpctformaevalua.g:6218:1: rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 : ( ruleEString ) ;
    public final void rule__SingleAnswer__IncorrectfeedbackAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6222:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6223:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6223:2: ( ruleEString )
            // InternalUpctformaevalua.g:6224:3: ruleEString
            {
             before(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__SingleAnswer__IncorrectfeedbackAssignment_7_1"


    // $ANTLR start "rule__MultipleAnswer__StatementsAssignment_3"
    // InternalUpctformaevalua.g:6233:1: rule__MultipleAnswer__StatementsAssignment_3 : ( ruleParagraph ) ;
    public final void rule__MultipleAnswer__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6237:1: ( ( ruleParagraph ) )
            // InternalUpctformaevalua.g:6238:2: ( ruleParagraph )
            {
            // InternalUpctformaevalua.g:6238:2: ( ruleParagraph )
            // InternalUpctformaevalua.g:6239:3: ruleParagraph
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getStatementsParagraphParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__StatementsAssignment_3"


    // $ANTLR start "rule__MultipleAnswer__AnswersAssignment_4_2"
    // InternalUpctformaevalua.g:6248:1: rule__MultipleAnswer__AnswersAssignment_4_2 : ( ruleMultiple ) ;
    public final void rule__MultipleAnswer__AnswersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6252:1: ( ( ruleMultiple ) )
            // InternalUpctformaevalua.g:6253:2: ( ruleMultiple )
            {
            // InternalUpctformaevalua.g:6253:2: ( ruleMultiple )
            // InternalUpctformaevalua.g:6254:3: ruleMultiple
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__AnswersAssignment_4_2"


    // $ANTLR start "rule__MultipleAnswer__AnswersAssignment_4_3_1"
    // InternalUpctformaevalua.g:6263:1: rule__MultipleAnswer__AnswersAssignment_4_3_1 : ( ruleMultiple ) ;
    public final void rule__MultipleAnswer__AnswersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6267:1: ( ( ruleMultiple ) )
            // InternalUpctformaevalua.g:6268:2: ( ruleMultiple )
            {
            // InternalUpctformaevalua.g:6268:2: ( ruleMultiple )
            // InternalUpctformaevalua.g:6269:3: ruleMultiple
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiple();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getAnswersMultipleParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__AnswersAssignment_4_3_1"


    // $ANTLR start "rule__MultipleAnswer__CorrectfeedbackAssignment_5_1"
    // InternalUpctformaevalua.g:6278:1: rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 : ( ruleEString ) ;
    public final void rule__MultipleAnswer__CorrectfeedbackAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6282:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6283:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6283:2: ( ruleEString )
            // InternalUpctformaevalua.g:6284:3: ruleEString
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__CorrectfeedbackAssignment_5_1"


    // $ANTLR start "rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1"
    // InternalUpctformaevalua.g:6293:1: rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 : ( ruleEString ) ;
    public final void rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6297:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6298:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6298:2: ( ruleEString )
            // InternalUpctformaevalua.g:6299:3: ruleEString
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1"


    // $ANTLR start "rule__FillingAnswer__CorrectfeedbackAssignment_3_1"
    // InternalUpctformaevalua.g:6308:1: rule__FillingAnswer__CorrectfeedbackAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FillingAnswer__CorrectfeedbackAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6312:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6313:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6313:2: ( ruleEString )
            // InternalUpctformaevalua.g:6314:3: ruleEString
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FillingAnswer__CorrectfeedbackAssignment_3_1"


    // $ANTLR start "rule__FillingAnswer__IncorrectfeedbackAssignment_4_1"
    // InternalUpctformaevalua.g:6323:1: rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FillingAnswer__IncorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6327:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6328:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6328:2: ( ruleEString )
            // InternalUpctformaevalua.g:6329:3: ruleEString
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__FillingAnswer__IncorrectfeedbackAssignment_4_1"


    // $ANTLR start "rule__FillingAnswer__HolesAssignment_5_2"
    // InternalUpctformaevalua.g:6338:1: rule__FillingAnswer__HolesAssignment_5_2 : ( ruleHole ) ;
    public final void rule__FillingAnswer__HolesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6342:1: ( ( ruleHole ) )
            // InternalUpctformaevalua.g:6343:2: ( ruleHole )
            {
            // InternalUpctformaevalua.g:6343:2: ( ruleHole )
            // InternalUpctformaevalua.g:6344:3: ruleHole
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleHole();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__FillingAnswer__HolesAssignment_5_2"


    // $ANTLR start "rule__FillingAnswer__HolesAssignment_5_3_1"
    // InternalUpctformaevalua.g:6353:1: rule__FillingAnswer__HolesAssignment_5_3_1 : ( ruleHole ) ;
    public final void rule__FillingAnswer__HolesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6357:1: ( ( ruleHole ) )
            // InternalUpctformaevalua.g:6358:2: ( ruleHole )
            {
            // InternalUpctformaevalua.g:6358:2: ( ruleHole )
            // InternalUpctformaevalua.g:6359:3: ruleHole
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHole();

            state._fsp--;

             after(grammarAccess.getFillingAnswerAccess().getHolesHoleParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__FillingAnswer__HolesAssignment_5_3_1"


    // $ANTLR start "rule__TrueOrFalse__AssertionsAssignment_3_2"
    // InternalUpctformaevalua.g:6368:1: rule__TrueOrFalse__AssertionsAssignment_3_2 : ( ruleAssertion ) ;
    public final void rule__TrueOrFalse__AssertionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6372:1: ( ( ruleAssertion ) )
            // InternalUpctformaevalua.g:6373:2: ( ruleAssertion )
            {
            // InternalUpctformaevalua.g:6373:2: ( ruleAssertion )
            // InternalUpctformaevalua.g:6374:3: ruleAssertion
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__AssertionsAssignment_3_2"


    // $ANTLR start "rule__TrueOrFalse__AssertionsAssignment_3_3_1"
    // InternalUpctformaevalua.g:6383:1: rule__TrueOrFalse__AssertionsAssignment_3_3_1 : ( ruleAssertion ) ;
    public final void rule__TrueOrFalse__AssertionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6387:1: ( ( ruleAssertion ) )
            // InternalUpctformaevalua.g:6388:2: ( ruleAssertion )
            {
            // InternalUpctformaevalua.g:6388:2: ( ruleAssertion )
            // InternalUpctformaevalua.g:6389:3: ruleAssertion
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssertion();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getAssertionsAssertionParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__AssertionsAssignment_3_3_1"


    // $ANTLR start "rule__TrueOrFalse__CorrectfeedbackAssignment_4_1"
    // InternalUpctformaevalua.g:6398:1: rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TrueOrFalse__CorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6402:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6403:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6403:2: ( ruleEString )
            // InternalUpctformaevalua.g:6404:3: ruleEString
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__CorrectfeedbackAssignment_4_1"


    // $ANTLR start "rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1"
    // InternalUpctformaevalua.g:6413:1: rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 : ( ruleEString ) ;
    public final void rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6417:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6418:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6418:2: ( ruleEString )
            // InternalUpctformaevalua.g:6419:3: ruleEString
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1"


    // $ANTLR start "rule__Paragraph__TextAssignment_1"
    // InternalUpctformaevalua.g:6428:1: rule__Paragraph__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6432:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6433:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6433:2: ( ruleEString )
            // InternalUpctformaevalua.g:6434:3: ruleEString
            {
             before(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParagraphAccess().getTextEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Paragraph__TextAssignment_1"


    // $ANTLR start "rule__Single__TextAssignment_1"
    // InternalUpctformaevalua.g:6443:1: rule__Single__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Single__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6447:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6448:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6448:2: ( ruleEString )
            // InternalUpctformaevalua.g:6449:3: ruleEString
            {
             before(grammarAccess.getSingleAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleAccess().getTextEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Single__TextAssignment_1"


    // $ANTLR start "rule__Multiple__TextAssignment_2_0"
    // InternalUpctformaevalua.g:6458:1: rule__Multiple__TextAssignment_2_0 : ( ruleEString ) ;
    public final void rule__Multiple__TextAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6462:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6463:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6463:2: ( ruleEString )
            // InternalUpctformaevalua.g:6464:3: ruleEString
            {
             before(grammarAccess.getMultipleAccess().getTextEStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultipleAccess().getTextEStringParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Multiple__TextAssignment_2_0"


    // $ANTLR start "rule__Multiple__ValueAssignment_3"
    // InternalUpctformaevalua.g:6473:1: rule__Multiple__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__Multiple__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6477:1: ( ( ruleEBoolean ) )
            // InternalUpctformaevalua.g:6478:2: ( ruleEBoolean )
            {
            // InternalUpctformaevalua.g:6478:2: ( ruleEBoolean )
            // InternalUpctformaevalua.g:6479:3: ruleEBoolean
            {
             before(grammarAccess.getMultipleAccess().getValueEBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getMultipleAccess().getValueEBooleanParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Multiple__ValueAssignment_3"


    // $ANTLR start "rule__Hole__TextAssignment_3_1"
    // InternalUpctformaevalua.g:6488:1: rule__Hole__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Hole__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6492:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6493:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6493:2: ( ruleEString )
            // InternalUpctformaevalua.g:6494:3: ruleEString
            {
             before(grammarAccess.getHoleAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHoleAccess().getTextEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Hole__TextAssignment_3_1"


    // $ANTLR start "rule__Hole__TypeAssignment_4_1"
    // InternalUpctformaevalua.g:6503:1: rule__Hole__TypeAssignment_4_1 : ( ruleTypeHole ) ;
    public final void rule__Hole__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6507:1: ( ( ruleTypeHole ) )
            // InternalUpctformaevalua.g:6508:2: ( ruleTypeHole )
            {
            // InternalUpctformaevalua.g:6508:2: ( ruleTypeHole )
            // InternalUpctformaevalua.g:6509:3: ruleTypeHole
            {
             before(grammarAccess.getHoleAccess().getTypeTypeHoleEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeHole();

            state._fsp--;

             after(grammarAccess.getHoleAccess().getTypeTypeHoleEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Hole__TypeAssignment_4_1"


    // $ANTLR start "rule__Assertion__TextAssignment_2_0"
    // InternalUpctformaevalua.g:6518:1: rule__Assertion__TextAssignment_2_0 : ( ruleEString ) ;
    public final void rule__Assertion__TextAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6522:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6523:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6523:2: ( ruleEString )
            // InternalUpctformaevalua.g:6524:3: ruleEString
            {
             before(grammarAccess.getAssertionAccess().getTextEStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getTextEStringParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Assertion__TextAssignment_2_0"


    // $ANTLR start "rule__Assertion__ValueAssignment_3"
    // InternalUpctformaevalua.g:6533:1: rule__Assertion__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__Assertion__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6537:1: ( ( ruleEBoolean ) )
            // InternalUpctformaevalua.g:6538:2: ( ruleEBoolean )
            {
            // InternalUpctformaevalua.g:6538:2: ( ruleEBoolean )
            // InternalUpctformaevalua.g:6539:3: ruleEBoolean
            {
             before(grammarAccess.getAssertionAccess().getValueEBooleanParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getAssertionAccess().getValueEBooleanParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Assertion__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000902300000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000902000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000B1010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000060C100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C060100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004060100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040060100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100060100000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000101830L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000C00000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000006000L});

}