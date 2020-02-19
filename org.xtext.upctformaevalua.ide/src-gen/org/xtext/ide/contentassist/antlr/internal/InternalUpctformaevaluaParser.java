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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'ES'", "'EN'", "'FR'", "'GR'", "'LI'", "'visible'", "'hole'", "'highest'", "'middle'", "'lowest'", "'Evaluation'", "'{'", "'}'", "'package'", "';'", "','", "'.'", "'EvaluationUnit'", "'numberquestions'", "'questions'", "'Question'", "'correctfeedback'", "'incorrectfeedback'", "'-'", "'Training'", "'Attempts'", "'grade'", "'Final'", "'SingleAnswer'", "'statement'", "'answers'", "'correct'", "'MultipleAnswer'", "'FillingAnswer'", "'holes'", "'TrueOrFalse'", "'assertions'", "'Hole'", "'text'", "'type'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int T__48=48;
    public static final int T__49=49;
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


    // $ANTLR start "ruleEvaluationLanguageType"
    // InternalUpctformaevalua.g:553:1: ruleEvaluationLanguageType : ( ( rule__EvaluationLanguageType__Alternatives ) ) ;
    public final void ruleEvaluationLanguageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:557:1: ( ( ( rule__EvaluationLanguageType__Alternatives ) ) )
            // InternalUpctformaevalua.g:558:2: ( ( rule__EvaluationLanguageType__Alternatives ) )
            {
            // InternalUpctformaevalua.g:558:2: ( ( rule__EvaluationLanguageType__Alternatives ) )
            // InternalUpctformaevalua.g:559:3: ( rule__EvaluationLanguageType__Alternatives )
            {
             before(grammarAccess.getEvaluationLanguageTypeAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:560:3: ( rule__EvaluationLanguageType__Alternatives )
            // InternalUpctformaevalua.g:560:4: rule__EvaluationLanguageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationLanguageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationLanguageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvaluationLanguageType"


    // $ANTLR start "ruleTypeHole"
    // InternalUpctformaevalua.g:569:1: ruleTypeHole : ( ( rule__TypeHole__Alternatives ) ) ;
    public final void ruleTypeHole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:573:1: ( ( ( rule__TypeHole__Alternatives ) ) )
            // InternalUpctformaevalua.g:574:2: ( ( rule__TypeHole__Alternatives ) )
            {
            // InternalUpctformaevalua.g:574:2: ( ( rule__TypeHole__Alternatives ) )
            // InternalUpctformaevalua.g:575:3: ( rule__TypeHole__Alternatives )
            {
             before(grammarAccess.getTypeHoleAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:576:3: ( rule__TypeHole__Alternatives )
            // InternalUpctformaevalua.g:576:4: rule__TypeHole__Alternatives
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
    // InternalUpctformaevalua.g:585:1: ruleTypeGrade : ( ( rule__TypeGrade__Alternatives ) ) ;
    public final void ruleTypeGrade() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:589:1: ( ( ( rule__TypeGrade__Alternatives ) ) )
            // InternalUpctformaevalua.g:590:2: ( ( rule__TypeGrade__Alternatives ) )
            {
            // InternalUpctformaevalua.g:590:2: ( ( rule__TypeGrade__Alternatives ) )
            // InternalUpctformaevalua.g:591:3: ( rule__TypeGrade__Alternatives )
            {
             before(grammarAccess.getTypeGradeAccess().getAlternatives()); 
            // InternalUpctformaevalua.g:592:3: ( rule__TypeGrade__Alternatives )
            // InternalUpctformaevalua.g:592:4: rule__TypeGrade__Alternatives
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
    // InternalUpctformaevalua.g:600:1: rule__EvaluationUnit__Alternatives : ( ( ruleEvaluationUnit_Impl ) | ( ruleTraining ) | ( ruleFinal ) );
    public final void rule__EvaluationUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:604:1: ( ( ruleEvaluationUnit_Impl ) | ( ruleTraining ) | ( ruleFinal ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt1=1;
                }
                break;
            case 37:
                {
                alt1=2;
                }
                break;
            case 40:
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
                    // InternalUpctformaevalua.g:605:2: ( ruleEvaluationUnit_Impl )
                    {
                    // InternalUpctformaevalua.g:605:2: ( ruleEvaluationUnit_Impl )
                    // InternalUpctformaevalua.g:606:3: ruleEvaluationUnit_Impl
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
                    // InternalUpctformaevalua.g:611:2: ( ruleTraining )
                    {
                    // InternalUpctformaevalua.g:611:2: ( ruleTraining )
                    // InternalUpctformaevalua.g:612:3: ruleTraining
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
                    // InternalUpctformaevalua.g:617:2: ( ruleFinal )
                    {
                    // InternalUpctformaevalua.g:617:2: ( ruleFinal )
                    // InternalUpctformaevalua.g:618:3: ruleFinal
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
    // InternalUpctformaevalua.g:627:1: rule__Question__Alternatives : ( ( ruleQuestion_Impl ) | ( ruleSingleAnswer ) | ( ruleMultipleAnswer ) | ( ruleFillingAnswer ) | ( ruleTrueOrFalse ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:631:1: ( ( ruleQuestion_Impl ) | ( ruleSingleAnswer ) | ( ruleMultipleAnswer ) | ( ruleFillingAnswer ) | ( ruleTrueOrFalse ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 45:
                {
                alt2=3;
                }
                break;
            case 46:
                {
                alt2=4;
                }
                break;
            case 48:
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
                    // InternalUpctformaevalua.g:632:2: ( ruleQuestion_Impl )
                    {
                    // InternalUpctformaevalua.g:632:2: ( ruleQuestion_Impl )
                    // InternalUpctformaevalua.g:633:3: ruleQuestion_Impl
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
                    // InternalUpctformaevalua.g:638:2: ( ruleSingleAnswer )
                    {
                    // InternalUpctformaevalua.g:638:2: ( ruleSingleAnswer )
                    // InternalUpctformaevalua.g:639:3: ruleSingleAnswer
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
                    // InternalUpctformaevalua.g:644:2: ( ruleMultipleAnswer )
                    {
                    // InternalUpctformaevalua.g:644:2: ( ruleMultipleAnswer )
                    // InternalUpctformaevalua.g:645:3: ruleMultipleAnswer
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
                    // InternalUpctformaevalua.g:650:2: ( ruleFillingAnswer )
                    {
                    // InternalUpctformaevalua.g:650:2: ( ruleFillingAnswer )
                    // InternalUpctformaevalua.g:651:3: ruleFillingAnswer
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
                    // InternalUpctformaevalua.g:656:2: ( ruleTrueOrFalse )
                    {
                    // InternalUpctformaevalua.g:656:2: ( ruleTrueOrFalse )
                    // InternalUpctformaevalua.g:657:3: ruleTrueOrFalse
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
    // InternalUpctformaevalua.g:666:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:670:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalUpctformaevalua.g:671:2: ( RULE_STRING )
                    {
                    // InternalUpctformaevalua.g:671:2: ( RULE_STRING )
                    // InternalUpctformaevalua.g:672:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:677:2: ( RULE_ID )
                    {
                    // InternalUpctformaevalua.g:677:2: ( RULE_ID )
                    // InternalUpctformaevalua.g:678:3: RULE_ID
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
    // InternalUpctformaevalua.g:687:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:691:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalUpctformaevalua.g:692:2: ( 'true' )
                    {
                    // InternalUpctformaevalua.g:692:2: ( 'true' )
                    // InternalUpctformaevalua.g:693:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:698:2: ( 'false' )
                    {
                    // InternalUpctformaevalua.g:698:2: ( 'false' )
                    // InternalUpctformaevalua.g:699:3: 'false'
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


    // $ANTLR start "rule__EvaluationLanguageType__Alternatives"
    // InternalUpctformaevalua.g:708:1: rule__EvaluationLanguageType__Alternatives : ( ( ( 'ES' ) ) | ( ( 'EN' ) ) | ( ( 'FR' ) ) | ( ( 'GR' ) ) | ( ( 'LI' ) ) );
    public final void rule__EvaluationLanguageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:712:1: ( ( ( 'ES' ) ) | ( ( 'EN' ) ) | ( ( 'FR' ) ) | ( ( 'GR' ) ) | ( ( 'LI' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUpctformaevalua.g:713:2: ( ( 'ES' ) )
                    {
                    // InternalUpctformaevalua.g:713:2: ( ( 'ES' ) )
                    // InternalUpctformaevalua.g:714:3: ( 'ES' )
                    {
                     before(grammarAccess.getEvaluationLanguageTypeAccess().getESEnumLiteralDeclaration_0()); 
                    // InternalUpctformaevalua.g:715:3: ( 'ES' )
                    // InternalUpctformaevalua.g:715:4: 'ES'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationLanguageTypeAccess().getESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:719:2: ( ( 'EN' ) )
                    {
                    // InternalUpctformaevalua.g:719:2: ( ( 'EN' ) )
                    // InternalUpctformaevalua.g:720:3: ( 'EN' )
                    {
                     before(grammarAccess.getEvaluationLanguageTypeAccess().getENEnumLiteralDeclaration_1()); 
                    // InternalUpctformaevalua.g:721:3: ( 'EN' )
                    // InternalUpctformaevalua.g:721:4: 'EN'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationLanguageTypeAccess().getENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:725:2: ( ( 'FR' ) )
                    {
                    // InternalUpctformaevalua.g:725:2: ( ( 'FR' ) )
                    // InternalUpctformaevalua.g:726:3: ( 'FR' )
                    {
                     before(grammarAccess.getEvaluationLanguageTypeAccess().getFREnumLiteralDeclaration_2()); 
                    // InternalUpctformaevalua.g:727:3: ( 'FR' )
                    // InternalUpctformaevalua.g:727:4: 'FR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationLanguageTypeAccess().getFREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctformaevalua.g:731:2: ( ( 'GR' ) )
                    {
                    // InternalUpctformaevalua.g:731:2: ( ( 'GR' ) )
                    // InternalUpctformaevalua.g:732:3: ( 'GR' )
                    {
                     before(grammarAccess.getEvaluationLanguageTypeAccess().getGREnumLiteralDeclaration_3()); 
                    // InternalUpctformaevalua.g:733:3: ( 'GR' )
                    // InternalUpctformaevalua.g:733:4: 'GR'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationLanguageTypeAccess().getGREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctformaevalua.g:737:2: ( ( 'LI' ) )
                    {
                    // InternalUpctformaevalua.g:737:2: ( ( 'LI' ) )
                    // InternalUpctformaevalua.g:738:3: ( 'LI' )
                    {
                     before(grammarAccess.getEvaluationLanguageTypeAccess().getLIEnumLiteralDeclaration_4()); 
                    // InternalUpctformaevalua.g:739:3: ( 'LI' )
                    // InternalUpctformaevalua.g:739:4: 'LI'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getEvaluationLanguageTypeAccess().getLIEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__EvaluationLanguageType__Alternatives"


    // $ANTLR start "rule__TypeHole__Alternatives"
    // InternalUpctformaevalua.g:747:1: rule__TypeHole__Alternatives : ( ( ( 'visible' ) ) | ( ( 'hole' ) ) );
    public final void rule__TypeHole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:751:1: ( ( ( 'visible' ) ) | ( ( 'hole' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUpctformaevalua.g:752:2: ( ( 'visible' ) )
                    {
                    // InternalUpctformaevalua.g:752:2: ( ( 'visible' ) )
                    // InternalUpctformaevalua.g:753:3: ( 'visible' )
                    {
                     before(grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalUpctformaevalua.g:754:3: ( 'visible' )
                    // InternalUpctformaevalua.g:754:4: 'visible'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeHoleAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:758:2: ( ( 'hole' ) )
                    {
                    // InternalUpctformaevalua.g:758:2: ( ( 'hole' ) )
                    // InternalUpctformaevalua.g:759:3: ( 'hole' )
                    {
                     before(grammarAccess.getTypeHoleAccess().getHoleEnumLiteralDeclaration_1()); 
                    // InternalUpctformaevalua.g:760:3: ( 'hole' )
                    // InternalUpctformaevalua.g:760:4: 'hole'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalUpctformaevalua.g:768:1: rule__TypeGrade__Alternatives : ( ( ( 'highest' ) ) | ( ( 'middle' ) ) | ( ( 'lowest' ) ) );
    public final void rule__TypeGrade__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:772:1: ( ( ( 'highest' ) ) | ( ( 'middle' ) ) | ( ( 'lowest' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUpctformaevalua.g:773:2: ( ( 'highest' ) )
                    {
                    // InternalUpctformaevalua.g:773:2: ( ( 'highest' ) )
                    // InternalUpctformaevalua.g:774:3: ( 'highest' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0()); 
                    // InternalUpctformaevalua.g:775:3: ( 'highest' )
                    // InternalUpctformaevalua.g:775:4: 'highest'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getHighestEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctformaevalua.g:779:2: ( ( 'middle' ) )
                    {
                    // InternalUpctformaevalua.g:779:2: ( ( 'middle' ) )
                    // InternalUpctformaevalua.g:780:3: ( 'middle' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1()); 
                    // InternalUpctformaevalua.g:781:3: ( 'middle' )
                    // InternalUpctformaevalua.g:781:4: 'middle'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeGradeAccess().getMiddleEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctformaevalua.g:785:2: ( ( 'lowest' ) )
                    {
                    // InternalUpctformaevalua.g:785:2: ( ( 'lowest' ) )
                    // InternalUpctformaevalua.g:786:3: ( 'lowest' )
                    {
                     before(grammarAccess.getTypeGradeAccess().getLowestEnumLiteralDeclaration_2()); 
                    // InternalUpctformaevalua.g:787:3: ( 'lowest' )
                    // InternalUpctformaevalua.g:787:4: 'lowest'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalUpctformaevalua.g:795:1: rule__Evaluation__Group__0 : rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 ;
    public final void rule__Evaluation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:799:1: ( rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1 )
            // InternalUpctformaevalua.g:800:2: rule__Evaluation__Group__0__Impl rule__Evaluation__Group__1
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
    // InternalUpctformaevalua.g:807:1: rule__Evaluation__Group__0__Impl : ( () ) ;
    public final void rule__Evaluation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:811:1: ( ( () ) )
            // InternalUpctformaevalua.g:812:1: ( () )
            {
            // InternalUpctformaevalua.g:812:1: ( () )
            // InternalUpctformaevalua.g:813:2: ()
            {
             before(grammarAccess.getEvaluationAccess().getEvaluationAction_0()); 
            // InternalUpctformaevalua.g:814:2: ()
            // InternalUpctformaevalua.g:814:3: 
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
    // InternalUpctformaevalua.g:822:1: rule__Evaluation__Group__1 : rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 ;
    public final void rule__Evaluation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:826:1: ( rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2 )
            // InternalUpctformaevalua.g:827:2: rule__Evaluation__Group__1__Impl rule__Evaluation__Group__2
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
    // InternalUpctformaevalua.g:834:1: rule__Evaluation__Group__1__Impl : ( 'Evaluation' ) ;
    public final void rule__Evaluation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:838:1: ( ( 'Evaluation' ) )
            // InternalUpctformaevalua.g:839:1: ( 'Evaluation' )
            {
            // InternalUpctformaevalua.g:839:1: ( 'Evaluation' )
            // InternalUpctformaevalua.g:840:2: 'Evaluation'
            {
             before(grammarAccess.getEvaluationAccess().getEvaluationKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:849:1: rule__Evaluation__Group__2 : rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 ;
    public final void rule__Evaluation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:853:1: ( rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3 )
            // InternalUpctformaevalua.g:854:2: rule__Evaluation__Group__2__Impl rule__Evaluation__Group__3
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
    // InternalUpctformaevalua.g:861:1: rule__Evaluation__Group__2__Impl : ( ( rule__Evaluation__NameAssignment_2 ) ) ;
    public final void rule__Evaluation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:865:1: ( ( ( rule__Evaluation__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:866:1: ( ( rule__Evaluation__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:866:1: ( ( rule__Evaluation__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:867:2: ( rule__Evaluation__NameAssignment_2 )
            {
             before(grammarAccess.getEvaluationAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:868:2: ( rule__Evaluation__NameAssignment_2 )
            // InternalUpctformaevalua.g:868:3: rule__Evaluation__NameAssignment_2
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
    // InternalUpctformaevalua.g:876:1: rule__Evaluation__Group__3 : rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4 ;
    public final void rule__Evaluation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:880:1: ( rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4 )
            // InternalUpctformaevalua.g:881:2: rule__Evaluation__Group__3__Impl rule__Evaluation__Group__4
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
    // InternalUpctformaevalua.g:888:1: rule__Evaluation__Group__3__Impl : ( '{' ) ;
    public final void rule__Evaluation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:892:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:893:1: ( '{' )
            {
            // InternalUpctformaevalua.g:893:1: ( '{' )
            // InternalUpctformaevalua.g:894:2: '{'
            {
             before(grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:903:1: rule__Evaluation__Group__4 : rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5 ;
    public final void rule__Evaluation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:907:1: ( rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5 )
            // InternalUpctformaevalua.g:908:2: rule__Evaluation__Group__4__Impl rule__Evaluation__Group__5
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
    // InternalUpctformaevalua.g:915:1: rule__Evaluation__Group__4__Impl : ( ( rule__Evaluation__Group_4__0 )? ) ;
    public final void rule__Evaluation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:919:1: ( ( ( rule__Evaluation__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:920:1: ( ( rule__Evaluation__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:920:1: ( ( rule__Evaluation__Group_4__0 )? )
            // InternalUpctformaevalua.g:921:2: ( rule__Evaluation__Group_4__0 )?
            {
             before(grammarAccess.getEvaluationAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:922:2: ( rule__Evaluation__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctformaevalua.g:922:3: rule__Evaluation__Group_4__0
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
    // InternalUpctformaevalua.g:930:1: rule__Evaluation__Group__5 : rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6 ;
    public final void rule__Evaluation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:934:1: ( rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6 )
            // InternalUpctformaevalua.g:935:2: rule__Evaluation__Group__5__Impl rule__Evaluation__Group__6
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
    // InternalUpctformaevalua.g:942:1: rule__Evaluation__Group__5__Impl : ( ( rule__Evaluation__Group_5__0 )? ) ;
    public final void rule__Evaluation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:946:1: ( ( ( rule__Evaluation__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:947:1: ( ( rule__Evaluation__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:947:1: ( ( rule__Evaluation__Group_5__0 )? )
            // InternalUpctformaevalua.g:948:2: ( rule__Evaluation__Group_5__0 )?
            {
             before(grammarAccess.getEvaluationAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:949:2: ( rule__Evaluation__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30||LA9_0==37||LA9_0==40) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUpctformaevalua.g:949:3: rule__Evaluation__Group_5__0
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
    // InternalUpctformaevalua.g:957:1: rule__Evaluation__Group__6 : rule__Evaluation__Group__6__Impl ;
    public final void rule__Evaluation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:961:1: ( rule__Evaluation__Group__6__Impl )
            // InternalUpctformaevalua.g:962:2: rule__Evaluation__Group__6__Impl
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
    // InternalUpctformaevalua.g:968:1: rule__Evaluation__Group__6__Impl : ( '}' ) ;
    public final void rule__Evaluation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:972:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:973:1: ( '}' )
            {
            // InternalUpctformaevalua.g:973:1: ( '}' )
            // InternalUpctformaevalua.g:974:2: '}'
            {
             before(grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:984:1: rule__Evaluation__Group_4__0 : rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1 ;
    public final void rule__Evaluation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:988:1: ( rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1 )
            // InternalUpctformaevalua.g:989:2: rule__Evaluation__Group_4__0__Impl rule__Evaluation__Group_4__1
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
    // InternalUpctformaevalua.g:996:1: rule__Evaluation__Group_4__0__Impl : ( 'package' ) ;
    public final void rule__Evaluation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1000:1: ( ( 'package' ) )
            // InternalUpctformaevalua.g:1001:1: ( 'package' )
            {
            // InternalUpctformaevalua.g:1001:1: ( 'package' )
            // InternalUpctformaevalua.g:1002:2: 'package'
            {
             before(grammarAccess.getEvaluationAccess().getPackageKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1011:1: rule__Evaluation__Group_4__1 : rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2 ;
    public final void rule__Evaluation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1015:1: ( rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2 )
            // InternalUpctformaevalua.g:1016:2: rule__Evaluation__Group_4__1__Impl rule__Evaluation__Group_4__2
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
    // InternalUpctformaevalua.g:1023:1: rule__Evaluation__Group_4__1__Impl : ( ( rule__Evaluation__NameAssignment_4_1 ) ) ;
    public final void rule__Evaluation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1027:1: ( ( ( rule__Evaluation__NameAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:1028:1: ( ( rule__Evaluation__NameAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:1028:1: ( ( rule__Evaluation__NameAssignment_4_1 ) )
            // InternalUpctformaevalua.g:1029:2: ( rule__Evaluation__NameAssignment_4_1 )
            {
             before(grammarAccess.getEvaluationAccess().getNameAssignment_4_1()); 
            // InternalUpctformaevalua.g:1030:2: ( rule__Evaluation__NameAssignment_4_1 )
            // InternalUpctformaevalua.g:1030:3: rule__Evaluation__NameAssignment_4_1
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
    // InternalUpctformaevalua.g:1038:1: rule__Evaluation__Group_4__2 : rule__Evaluation__Group_4__2__Impl ;
    public final void rule__Evaluation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1042:1: ( rule__Evaluation__Group_4__2__Impl )
            // InternalUpctformaevalua.g:1043:2: rule__Evaluation__Group_4__2__Impl
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
    // InternalUpctformaevalua.g:1049:1: rule__Evaluation__Group_4__2__Impl : ( ';' ) ;
    public final void rule__Evaluation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1053:1: ( ( ';' ) )
            // InternalUpctformaevalua.g:1054:1: ( ';' )
            {
            // InternalUpctformaevalua.g:1054:1: ( ';' )
            // InternalUpctformaevalua.g:1055:2: ';'
            {
             before(grammarAccess.getEvaluationAccess().getSemicolonKeyword_4_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1065:1: rule__Evaluation__Group_5__0 : rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1 ;
    public final void rule__Evaluation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1069:1: ( rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1 )
            // InternalUpctformaevalua.g:1070:2: rule__Evaluation__Group_5__0__Impl rule__Evaluation__Group_5__1
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
    // InternalUpctformaevalua.g:1077:1: rule__Evaluation__Group_5__0__Impl : ( ( rule__Evaluation__UnitsAssignment_5_0 ) ) ;
    public final void rule__Evaluation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1081:1: ( ( ( rule__Evaluation__UnitsAssignment_5_0 ) ) )
            // InternalUpctformaevalua.g:1082:1: ( ( rule__Evaluation__UnitsAssignment_5_0 ) )
            {
            // InternalUpctformaevalua.g:1082:1: ( ( rule__Evaluation__UnitsAssignment_5_0 ) )
            // InternalUpctformaevalua.g:1083:2: ( rule__Evaluation__UnitsAssignment_5_0 )
            {
             before(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_0()); 
            // InternalUpctformaevalua.g:1084:2: ( rule__Evaluation__UnitsAssignment_5_0 )
            // InternalUpctformaevalua.g:1084:3: rule__Evaluation__UnitsAssignment_5_0
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
    // InternalUpctformaevalua.g:1092:1: rule__Evaluation__Group_5__1 : rule__Evaluation__Group_5__1__Impl ;
    public final void rule__Evaluation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1096:1: ( rule__Evaluation__Group_5__1__Impl )
            // InternalUpctformaevalua.g:1097:2: rule__Evaluation__Group_5__1__Impl
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
    // InternalUpctformaevalua.g:1103:1: rule__Evaluation__Group_5__1__Impl : ( ( rule__Evaluation__Group_5_1__0 )* ) ;
    public final void rule__Evaluation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1107:1: ( ( ( rule__Evaluation__Group_5_1__0 )* ) )
            // InternalUpctformaevalua.g:1108:1: ( ( rule__Evaluation__Group_5_1__0 )* )
            {
            // InternalUpctformaevalua.g:1108:1: ( ( rule__Evaluation__Group_5_1__0 )* )
            // InternalUpctformaevalua.g:1109:2: ( rule__Evaluation__Group_5_1__0 )*
            {
             before(grammarAccess.getEvaluationAccess().getGroup_5_1()); 
            // InternalUpctformaevalua.g:1110:2: ( rule__Evaluation__Group_5_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1110:3: rule__Evaluation__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Evaluation__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalUpctformaevalua.g:1119:1: rule__Evaluation__Group_5_1__0 : rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1 ;
    public final void rule__Evaluation__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1123:1: ( rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1 )
            // InternalUpctformaevalua.g:1124:2: rule__Evaluation__Group_5_1__0__Impl rule__Evaluation__Group_5_1__1
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
    // InternalUpctformaevalua.g:1131:1: rule__Evaluation__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Evaluation__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1135:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:1136:1: ( ',' )
            {
            // InternalUpctformaevalua.g:1136:1: ( ',' )
            // InternalUpctformaevalua.g:1137:2: ','
            {
             before(grammarAccess.getEvaluationAccess().getCommaKeyword_5_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1146:1: rule__Evaluation__Group_5_1__1 : rule__Evaluation__Group_5_1__1__Impl ;
    public final void rule__Evaluation__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1150:1: ( rule__Evaluation__Group_5_1__1__Impl )
            // InternalUpctformaevalua.g:1151:2: rule__Evaluation__Group_5_1__1__Impl
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
    // InternalUpctformaevalua.g:1157:1: rule__Evaluation__Group_5_1__1__Impl : ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) ) ;
    public final void rule__Evaluation__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1161:1: ( ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) ) )
            // InternalUpctformaevalua.g:1162:1: ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) )
            {
            // InternalUpctformaevalua.g:1162:1: ( ( rule__Evaluation__UnitsAssignment_5_1_1 ) )
            // InternalUpctformaevalua.g:1163:2: ( rule__Evaluation__UnitsAssignment_5_1_1 )
            {
             before(grammarAccess.getEvaluationAccess().getUnitsAssignment_5_1_1()); 
            // InternalUpctformaevalua.g:1164:2: ( rule__Evaluation__UnitsAssignment_5_1_1 )
            // InternalUpctformaevalua.g:1164:3: rule__Evaluation__UnitsAssignment_5_1_1
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
    // InternalUpctformaevalua.g:1173:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1177:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUpctformaevalua.g:1178:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalUpctformaevalua.g:1185:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1189:1: ( ( RULE_ID ) )
            // InternalUpctformaevalua.g:1190:1: ( RULE_ID )
            {
            // InternalUpctformaevalua.g:1190:1: ( RULE_ID )
            // InternalUpctformaevalua.g:1191:2: RULE_ID
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
    // InternalUpctformaevalua.g:1200:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1204:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUpctformaevalua.g:1205:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUpctformaevalua.g:1211:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1215:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUpctformaevalua.g:1216:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUpctformaevalua.g:1216:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUpctformaevalua.g:1217:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUpctformaevalua.g:1218:2: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1218:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalUpctformaevalua.g:1227:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1231:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUpctformaevalua.g:1232:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUpctformaevalua.g:1239:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1243:1: ( ( '.' ) )
            // InternalUpctformaevalua.g:1244:1: ( '.' )
            {
            // InternalUpctformaevalua.g:1244:1: ( '.' )
            // InternalUpctformaevalua.g:1245:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1254:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1258:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUpctformaevalua.g:1259:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUpctformaevalua.g:1265:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1269:1: ( ( RULE_ID ) )
            // InternalUpctformaevalua.g:1270:1: ( RULE_ID )
            {
            // InternalUpctformaevalua.g:1270:1: ( RULE_ID )
            // InternalUpctformaevalua.g:1271:2: RULE_ID
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
    // InternalUpctformaevalua.g:1281:1: rule__EvaluationUnit_Impl__Group__0 : rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1 ;
    public final void rule__EvaluationUnit_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1285:1: ( rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1 )
            // InternalUpctformaevalua.g:1286:2: rule__EvaluationUnit_Impl__Group__0__Impl rule__EvaluationUnit_Impl__Group__1
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
    // InternalUpctformaevalua.g:1293:1: rule__EvaluationUnit_Impl__Group__0__Impl : ( () ) ;
    public final void rule__EvaluationUnit_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1297:1: ( ( () ) )
            // InternalUpctformaevalua.g:1298:1: ( () )
            {
            // InternalUpctformaevalua.g:1298:1: ( () )
            // InternalUpctformaevalua.g:1299:2: ()
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitAction_0()); 
            // InternalUpctformaevalua.g:1300:2: ()
            // InternalUpctformaevalua.g:1300:3: 
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
    // InternalUpctformaevalua.g:1308:1: rule__EvaluationUnit_Impl__Group__1 : rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2 ;
    public final void rule__EvaluationUnit_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1312:1: ( rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2 )
            // InternalUpctformaevalua.g:1313:2: rule__EvaluationUnit_Impl__Group__1__Impl rule__EvaluationUnit_Impl__Group__2
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
    // InternalUpctformaevalua.g:1320:1: rule__EvaluationUnit_Impl__Group__1__Impl : ( 'EvaluationUnit' ) ;
    public final void rule__EvaluationUnit_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1324:1: ( ( 'EvaluationUnit' ) )
            // InternalUpctformaevalua.g:1325:1: ( 'EvaluationUnit' )
            {
            // InternalUpctformaevalua.g:1325:1: ( 'EvaluationUnit' )
            // InternalUpctformaevalua.g:1326:2: 'EvaluationUnit'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getEvaluationUnitKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1335:1: rule__EvaluationUnit_Impl__Group__2 : rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3 ;
    public final void rule__EvaluationUnit_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1339:1: ( rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3 )
            // InternalUpctformaevalua.g:1340:2: rule__EvaluationUnit_Impl__Group__2__Impl rule__EvaluationUnit_Impl__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUpctformaevalua.g:1347:1: rule__EvaluationUnit_Impl__Group__2__Impl : ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1351:1: ( ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:1352:1: ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:1352:1: ( ( rule__EvaluationUnit_Impl__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:1353:2: ( rule__EvaluationUnit_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:1354:2: ( rule__EvaluationUnit_Impl__NameAssignment_2 )
            // InternalUpctformaevalua.g:1354:3: rule__EvaluationUnit_Impl__NameAssignment_2
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
    // InternalUpctformaevalua.g:1362:1: rule__EvaluationUnit_Impl__Group__3 : rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4 ;
    public final void rule__EvaluationUnit_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1366:1: ( rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4 )
            // InternalUpctformaevalua.g:1367:2: rule__EvaluationUnit_Impl__Group__3__Impl rule__EvaluationUnit_Impl__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUpctformaevalua.g:1374:1: rule__EvaluationUnit_Impl__Group__3__Impl : ( ( rule__EvaluationUnit_Impl__LanguageAssignment_3 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1378:1: ( ( ( rule__EvaluationUnit_Impl__LanguageAssignment_3 ) ) )
            // InternalUpctformaevalua.g:1379:1: ( ( rule__EvaluationUnit_Impl__LanguageAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:1379:1: ( ( rule__EvaluationUnit_Impl__LanguageAssignment_3 ) )
            // InternalUpctformaevalua.g:1380:2: ( rule__EvaluationUnit_Impl__LanguageAssignment_3 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLanguageAssignment_3()); 
            // InternalUpctformaevalua.g:1381:2: ( rule__EvaluationUnit_Impl__LanguageAssignment_3 )
            // InternalUpctformaevalua.g:1381:3: rule__EvaluationUnit_Impl__LanguageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__LanguageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getLanguageAssignment_3()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:1389:1: rule__EvaluationUnit_Impl__Group__4 : rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5 ;
    public final void rule__EvaluationUnit_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1393:1: ( rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5 )
            // InternalUpctformaevalua.g:1394:2: rule__EvaluationUnit_Impl__Group__4__Impl rule__EvaluationUnit_Impl__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalUpctformaevalua.g:1401:1: rule__EvaluationUnit_Impl__Group__4__Impl : ( '{' ) ;
    public final void rule__EvaluationUnit_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1405:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1406:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1406:1: ( '{' )
            // InternalUpctformaevalua.g:1407:2: '{'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:1416:1: rule__EvaluationUnit_Impl__Group__5 : rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6 ;
    public final void rule__EvaluationUnit_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1420:1: ( rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6 )
            // InternalUpctformaevalua.g:1421:2: rule__EvaluationUnit_Impl__Group__5__Impl rule__EvaluationUnit_Impl__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalUpctformaevalua.g:1428:1: rule__EvaluationUnit_Impl__Group__5__Impl : ( ( rule__EvaluationUnit_Impl__Group_5__0 )? ) ;
    public final void rule__EvaluationUnit_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1432:1: ( ( ( rule__EvaluationUnit_Impl__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:1433:1: ( ( rule__EvaluationUnit_Impl__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:1433:1: ( ( rule__EvaluationUnit_Impl__Group_5__0 )? )
            // InternalUpctformaevalua.g:1434:2: ( rule__EvaluationUnit_Impl__Group_5__0 )?
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:1435:2: ( rule__EvaluationUnit_Impl__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUpctformaevalua.g:1435:3: rule__EvaluationUnit_Impl__Group_5__0
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
    // InternalUpctformaevalua.g:1443:1: rule__EvaluationUnit_Impl__Group__6 : rule__EvaluationUnit_Impl__Group__6__Impl rule__EvaluationUnit_Impl__Group__7 ;
    public final void rule__EvaluationUnit_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1447:1: ( rule__EvaluationUnit_Impl__Group__6__Impl rule__EvaluationUnit_Impl__Group__7 )
            // InternalUpctformaevalua.g:1448:2: rule__EvaluationUnit_Impl__Group__6__Impl rule__EvaluationUnit_Impl__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__EvaluationUnit_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__7();

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
    // InternalUpctformaevalua.g:1455:1: rule__EvaluationUnit_Impl__Group__6__Impl : ( ( rule__EvaluationUnit_Impl__Group_6__0 )? ) ;
    public final void rule__EvaluationUnit_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1459:1: ( ( ( rule__EvaluationUnit_Impl__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:1460:1: ( ( rule__EvaluationUnit_Impl__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:1460:1: ( ( rule__EvaluationUnit_Impl__Group_6__0 )? )
            // InternalUpctformaevalua.g:1461:2: ( rule__EvaluationUnit_Impl__Group_6__0 )?
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:1462:2: ( rule__EvaluationUnit_Impl__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUpctformaevalua.g:1462:3: rule__EvaluationUnit_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EvaluationUnit_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__7"
    // InternalUpctformaevalua.g:1470:1: rule__EvaluationUnit_Impl__Group__7 : rule__EvaluationUnit_Impl__Group__7__Impl ;
    public final void rule__EvaluationUnit_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1474:1: ( rule__EvaluationUnit_Impl__Group__7__Impl )
            // InternalUpctformaevalua.g:1475:2: rule__EvaluationUnit_Impl__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group__7__Impl();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__7"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group__7__Impl"
    // InternalUpctformaevalua.g:1481:1: rule__EvaluationUnit_Impl__Group__7__Impl : ( '}' ) ;
    public final void rule__EvaluationUnit_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1485:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1486:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1486:1: ( '}' )
            // InternalUpctformaevalua.g:1487:2: '}'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group__7__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_5__0"
    // InternalUpctformaevalua.g:1497:1: rule__EvaluationUnit_Impl__Group_5__0 : rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1 ;
    public final void rule__EvaluationUnit_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1501:1: ( rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1 )
            // InternalUpctformaevalua.g:1502:2: rule__EvaluationUnit_Impl__Group_5__0__Impl rule__EvaluationUnit_Impl__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUpctformaevalua.g:1509:1: rule__EvaluationUnit_Impl__Group_5__0__Impl : ( 'numberquestions' ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1513:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:1514:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:1514:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:1515:2: 'numberquestions'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsKeyword_5_0()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:1524:1: rule__EvaluationUnit_Impl__Group_5__1 : rule__EvaluationUnit_Impl__Group_5__1__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1528:1: ( rule__EvaluationUnit_Impl__Group_5__1__Impl )
            // InternalUpctformaevalua.g:1529:2: rule__EvaluationUnit_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_5__1__Impl();

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
    // InternalUpctformaevalua.g:1535:1: rule__EvaluationUnit_Impl__Group_5__1__Impl : ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1539:1: ( ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:1540:1: ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:1540:1: ( ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1 ) )
            // InternalUpctformaevalua.g:1541:2: ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsAssignment_5_1()); 
            // InternalUpctformaevalua.g:1542:2: ( rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1 )
            // InternalUpctformaevalua.g:1542:3: rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__0"
    // InternalUpctformaevalua.g:1551:1: rule__EvaluationUnit_Impl__Group_6__0 : rule__EvaluationUnit_Impl__Group_6__0__Impl rule__EvaluationUnit_Impl__Group_6__1 ;
    public final void rule__EvaluationUnit_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1555:1: ( rule__EvaluationUnit_Impl__Group_6__0__Impl rule__EvaluationUnit_Impl__Group_6__1 )
            // InternalUpctformaevalua.g:1556:2: rule__EvaluationUnit_Impl__Group_6__0__Impl rule__EvaluationUnit_Impl__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__EvaluationUnit_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_6__1();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__0__Impl"
    // InternalUpctformaevalua.g:1563:1: rule__EvaluationUnit_Impl__Group_6__0__Impl : ( 'questions' ) ;
    public final void rule__EvaluationUnit_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1567:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:1568:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:1568:1: ( 'questions' )
            // InternalUpctformaevalua.g:1569:2: 'questions'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__1"
    // InternalUpctformaevalua.g:1578:1: rule__EvaluationUnit_Impl__Group_6__1 : rule__EvaluationUnit_Impl__Group_6__1__Impl rule__EvaluationUnit_Impl__Group_6__2 ;
    public final void rule__EvaluationUnit_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1582:1: ( rule__EvaluationUnit_Impl__Group_6__1__Impl rule__EvaluationUnit_Impl__Group_6__2 )
            // InternalUpctformaevalua.g:1583:2: rule__EvaluationUnit_Impl__Group_6__1__Impl rule__EvaluationUnit_Impl__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__EvaluationUnit_Impl__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_6__2();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__1__Impl"
    // InternalUpctformaevalua.g:1590:1: rule__EvaluationUnit_Impl__Group_6__1__Impl : ( '{' ) ;
    public final void rule__EvaluationUnit_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1594:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1595:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1595:1: ( '{' )
            // InternalUpctformaevalua.g:1596:2: '{'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__2"
    // InternalUpctformaevalua.g:1605:1: rule__EvaluationUnit_Impl__Group_6__2 : rule__EvaluationUnit_Impl__Group_6__2__Impl rule__EvaluationUnit_Impl__Group_6__3 ;
    public final void rule__EvaluationUnit_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1609:1: ( rule__EvaluationUnit_Impl__Group_6__2__Impl rule__EvaluationUnit_Impl__Group_6__3 )
            // InternalUpctformaevalua.g:1610:2: rule__EvaluationUnit_Impl__Group_6__2__Impl rule__EvaluationUnit_Impl__Group_6__3
            {
            pushFollow(FOLLOW_19);
            rule__EvaluationUnit_Impl__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_6__3();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__2"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__2__Impl"
    // InternalUpctformaevalua.g:1617:1: rule__EvaluationUnit_Impl__Group_6__2__Impl : ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_2 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1621:1: ( ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_2 ) ) )
            // InternalUpctformaevalua.g:1622:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_2 ) )
            {
            // InternalUpctformaevalua.g:1622:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_2 ) )
            // InternalUpctformaevalua.g:1623:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_2 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_6_2()); 
            // InternalUpctformaevalua.g:1624:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_2 )
            // InternalUpctformaevalua.g:1624:3: rule__EvaluationUnit_Impl__QuestionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__QuestionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__2__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__3"
    // InternalUpctformaevalua.g:1632:1: rule__EvaluationUnit_Impl__Group_6__3 : rule__EvaluationUnit_Impl__Group_6__3__Impl rule__EvaluationUnit_Impl__Group_6__4 ;
    public final void rule__EvaluationUnit_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1636:1: ( rule__EvaluationUnit_Impl__Group_6__3__Impl rule__EvaluationUnit_Impl__Group_6__4 )
            // InternalUpctformaevalua.g:1637:2: rule__EvaluationUnit_Impl__Group_6__3__Impl rule__EvaluationUnit_Impl__Group_6__4
            {
            pushFollow(FOLLOW_19);
            rule__EvaluationUnit_Impl__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_6__4();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__3"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__3__Impl"
    // InternalUpctformaevalua.g:1644:1: rule__EvaluationUnit_Impl__Group_6__3__Impl : ( ( rule__EvaluationUnit_Impl__Group_6_3__0 )* ) ;
    public final void rule__EvaluationUnit_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1648:1: ( ( ( rule__EvaluationUnit_Impl__Group_6_3__0 )* ) )
            // InternalUpctformaevalua.g:1649:1: ( ( rule__EvaluationUnit_Impl__Group_6_3__0 )* )
            {
            // InternalUpctformaevalua.g:1649:1: ( ( rule__EvaluationUnit_Impl__Group_6_3__0 )* )
            // InternalUpctformaevalua.g:1650:2: ( rule__EvaluationUnit_Impl__Group_6_3__0 )*
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_6_3()); 
            // InternalUpctformaevalua.g:1651:2: ( rule__EvaluationUnit_Impl__Group_6_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUpctformaevalua.g:1651:3: rule__EvaluationUnit_Impl__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__EvaluationUnit_Impl__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEvaluationUnit_ImplAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__3__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__4"
    // InternalUpctformaevalua.g:1659:1: rule__EvaluationUnit_Impl__Group_6__4 : rule__EvaluationUnit_Impl__Group_6__4__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1663:1: ( rule__EvaluationUnit_Impl__Group_6__4__Impl )
            // InternalUpctformaevalua.g:1664:2: rule__EvaluationUnit_Impl__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_6__4__Impl();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__4"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6__4__Impl"
    // InternalUpctformaevalua.g:1670:1: rule__EvaluationUnit_Impl__Group_6__4__Impl : ( '}' ) ;
    public final void rule__EvaluationUnit_Impl__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1674:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1675:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1675:1: ( '}' )
            // InternalUpctformaevalua.g:1676:2: '}'
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6__4__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6_3__0"
    // InternalUpctformaevalua.g:1686:1: rule__EvaluationUnit_Impl__Group_6_3__0 : rule__EvaluationUnit_Impl__Group_6_3__0__Impl rule__EvaluationUnit_Impl__Group_6_3__1 ;
    public final void rule__EvaluationUnit_Impl__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1690:1: ( rule__EvaluationUnit_Impl__Group_6_3__0__Impl rule__EvaluationUnit_Impl__Group_6_3__1 )
            // InternalUpctformaevalua.g:1691:2: rule__EvaluationUnit_Impl__Group_6_3__0__Impl rule__EvaluationUnit_Impl__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
            rule__EvaluationUnit_Impl__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_6_3__1();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6_3__0"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6_3__0__Impl"
    // InternalUpctformaevalua.g:1698:1: rule__EvaluationUnit_Impl__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__EvaluationUnit_Impl__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1702:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:1703:1: ( ',' )
            {
            // InternalUpctformaevalua.g:1703:1: ( ',' )
            // InternalUpctformaevalua.g:1704:2: ','
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_6_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEvaluationUnit_ImplAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6_3__0__Impl"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6_3__1"
    // InternalUpctformaevalua.g:1713:1: rule__EvaluationUnit_Impl__Group_6_3__1 : rule__EvaluationUnit_Impl__Group_6_3__1__Impl ;
    public final void rule__EvaluationUnit_Impl__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1717:1: ( rule__EvaluationUnit_Impl__Group_6_3__1__Impl )
            // InternalUpctformaevalua.g:1718:2: rule__EvaluationUnit_Impl__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6_3__1"


    // $ANTLR start "rule__EvaluationUnit_Impl__Group_6_3__1__Impl"
    // InternalUpctformaevalua.g:1724:1: rule__EvaluationUnit_Impl__Group_6_3__1__Impl : ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1 ) ) ;
    public final void rule__EvaluationUnit_Impl__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1728:1: ( ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1 ) ) )
            // InternalUpctformaevalua.g:1729:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1 ) )
            {
            // InternalUpctformaevalua.g:1729:1: ( ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1 ) )
            // InternalUpctformaevalua.g:1730:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1 )
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_6_3_1()); 
            // InternalUpctformaevalua.g:1731:2: ( rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1 )
            // InternalUpctformaevalua.g:1731:3: rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__Group_6_3__1__Impl"


    // $ANTLR start "rule__Question_Impl__Group__0"
    // InternalUpctformaevalua.g:1740:1: rule__Question_Impl__Group__0 : rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 ;
    public final void rule__Question_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1744:1: ( rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1 )
            // InternalUpctformaevalua.g:1745:2: rule__Question_Impl__Group__0__Impl rule__Question_Impl__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUpctformaevalua.g:1752:1: rule__Question_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Question_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1756:1: ( ( () ) )
            // InternalUpctformaevalua.g:1757:1: ( () )
            {
            // InternalUpctformaevalua.g:1757:1: ( () )
            // InternalUpctformaevalua.g:1758:2: ()
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionAction_0()); 
            // InternalUpctformaevalua.g:1759:2: ()
            // InternalUpctformaevalua.g:1759:3: 
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
    // InternalUpctformaevalua.g:1767:1: rule__Question_Impl__Group__1 : rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 ;
    public final void rule__Question_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1771:1: ( rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2 )
            // InternalUpctformaevalua.g:1772:2: rule__Question_Impl__Group__1__Impl rule__Question_Impl__Group__2
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
    // InternalUpctformaevalua.g:1779:1: rule__Question_Impl__Group__1__Impl : ( 'Question' ) ;
    public final void rule__Question_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1783:1: ( ( 'Question' ) )
            // InternalUpctformaevalua.g:1784:1: ( 'Question' )
            {
            // InternalUpctformaevalua.g:1784:1: ( 'Question' )
            // InternalUpctformaevalua.g:1785:2: 'Question'
            {
             before(grammarAccess.getQuestion_ImplAccess().getQuestionKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1794:1: rule__Question_Impl__Group__2 : rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 ;
    public final void rule__Question_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1798:1: ( rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3 )
            // InternalUpctformaevalua.g:1799:2: rule__Question_Impl__Group__2__Impl rule__Question_Impl__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalUpctformaevalua.g:1806:1: rule__Question_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Question_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1810:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:1811:1: ( '{' )
            {
            // InternalUpctformaevalua.g:1811:1: ( '{' )
            // InternalUpctformaevalua.g:1812:2: '{'
            {
             before(grammarAccess.getQuestion_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1821:1: rule__Question_Impl__Group__3 : rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 ;
    public final void rule__Question_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1825:1: ( rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4 )
            // InternalUpctformaevalua.g:1826:2: rule__Question_Impl__Group__3__Impl rule__Question_Impl__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalUpctformaevalua.g:1833:1: rule__Question_Impl__Group__3__Impl : ( ( rule__Question_Impl__Group_3__0 )? ) ;
    public final void rule__Question_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1837:1: ( ( ( rule__Question_Impl__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:1838:1: ( ( rule__Question_Impl__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:1838:1: ( ( rule__Question_Impl__Group_3__0 )? )
            // InternalUpctformaevalua.g:1839:2: ( rule__Question_Impl__Group_3__0 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:1840:2: ( rule__Question_Impl__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUpctformaevalua.g:1840:3: rule__Question_Impl__Group_3__0
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
    // InternalUpctformaevalua.g:1848:1: rule__Question_Impl__Group__4 : rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 ;
    public final void rule__Question_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1852:1: ( rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5 )
            // InternalUpctformaevalua.g:1853:2: rule__Question_Impl__Group__4__Impl rule__Question_Impl__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalUpctformaevalua.g:1860:1: rule__Question_Impl__Group__4__Impl : ( ( rule__Question_Impl__Group_4__0 )? ) ;
    public final void rule__Question_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1864:1: ( ( ( rule__Question_Impl__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:1865:1: ( ( rule__Question_Impl__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:1865:1: ( ( rule__Question_Impl__Group_4__0 )? )
            // InternalUpctformaevalua.g:1866:2: ( rule__Question_Impl__Group_4__0 )?
            {
             before(grammarAccess.getQuestion_ImplAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:1867:2: ( rule__Question_Impl__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctformaevalua.g:1867:3: rule__Question_Impl__Group_4__0
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
    // InternalUpctformaevalua.g:1875:1: rule__Question_Impl__Group__5 : rule__Question_Impl__Group__5__Impl ;
    public final void rule__Question_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1879:1: ( rule__Question_Impl__Group__5__Impl )
            // InternalUpctformaevalua.g:1880:2: rule__Question_Impl__Group__5__Impl
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
    // InternalUpctformaevalua.g:1886:1: rule__Question_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__Question_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1890:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:1891:1: ( '}' )
            {
            // InternalUpctformaevalua.g:1891:1: ( '}' )
            // InternalUpctformaevalua.g:1892:2: '}'
            {
             before(grammarAccess.getQuestion_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1902:1: rule__Question_Impl__Group_3__0 : rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1 ;
    public final void rule__Question_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1906:1: ( rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1 )
            // InternalUpctformaevalua.g:1907:2: rule__Question_Impl__Group_3__0__Impl rule__Question_Impl__Group_3__1
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
    // InternalUpctformaevalua.g:1914:1: rule__Question_Impl__Group_3__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__Question_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1918:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:1919:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:1919:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:1920:2: 'correctfeedback'
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1929:1: rule__Question_Impl__Group_3__1 : rule__Question_Impl__Group_3__1__Impl ;
    public final void rule__Question_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1933:1: ( rule__Question_Impl__Group_3__1__Impl )
            // InternalUpctformaevalua.g:1934:2: rule__Question_Impl__Group_3__1__Impl
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
    // InternalUpctformaevalua.g:1940:1: rule__Question_Impl__Group_3__1__Impl : ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) ) ;
    public final void rule__Question_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1944:1: ( ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:1945:1: ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:1945:1: ( ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 ) )
            // InternalUpctformaevalua.g:1946:2: ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getCorrectfeedbackAssignment_3_1()); 
            // InternalUpctformaevalua.g:1947:2: ( rule__Question_Impl__CorrectfeedbackAssignment_3_1 )
            // InternalUpctformaevalua.g:1947:3: rule__Question_Impl__CorrectfeedbackAssignment_3_1
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
    // InternalUpctformaevalua.g:1956:1: rule__Question_Impl__Group_4__0 : rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1 ;
    public final void rule__Question_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1960:1: ( rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1 )
            // InternalUpctformaevalua.g:1961:2: rule__Question_Impl__Group_4__0__Impl rule__Question_Impl__Group_4__1
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
    // InternalUpctformaevalua.g:1968:1: rule__Question_Impl__Group_4__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__Question_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1972:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:1973:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:1973:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:1974:2: 'incorrectfeedback'
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:1983:1: rule__Question_Impl__Group_4__1 : rule__Question_Impl__Group_4__1__Impl ;
    public final void rule__Question_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1987:1: ( rule__Question_Impl__Group_4__1__Impl )
            // InternalUpctformaevalua.g:1988:2: rule__Question_Impl__Group_4__1__Impl
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
    // InternalUpctformaevalua.g:1994:1: rule__Question_Impl__Group_4__1__Impl : ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__Question_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:1998:1: ( ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:1999:1: ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:1999:1: ( ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:2000:2: ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getQuestion_ImplAccess().getIncorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:2001:2: ( rule__Question_Impl__IncorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:2001:3: rule__Question_Impl__IncorrectfeedbackAssignment_4_1
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
    // InternalUpctformaevalua.g:2010:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2014:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUpctformaevalua.g:2015:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUpctformaevalua.g:2022:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2026:1: ( ( ( '-' )? ) )
            // InternalUpctformaevalua.g:2027:1: ( ( '-' )? )
            {
            // InternalUpctformaevalua.g:2027:1: ( ( '-' )? )
            // InternalUpctformaevalua.g:2028:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalUpctformaevalua.g:2029:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUpctformaevalua.g:2029:3: '-'
                    {
                    match(input,36,FOLLOW_2); 

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
    // InternalUpctformaevalua.g:2037:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2041:1: ( rule__EInt__Group__1__Impl )
            // InternalUpctformaevalua.g:2042:2: rule__EInt__Group__1__Impl
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
    // InternalUpctformaevalua.g:2048:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2052:1: ( ( RULE_INT ) )
            // InternalUpctformaevalua.g:2053:1: ( RULE_INT )
            {
            // InternalUpctformaevalua.g:2053:1: ( RULE_INT )
            // InternalUpctformaevalua.g:2054:2: RULE_INT
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
    // InternalUpctformaevalua.g:2064:1: rule__Training__Group__0 : rule__Training__Group__0__Impl rule__Training__Group__1 ;
    public final void rule__Training__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2068:1: ( rule__Training__Group__0__Impl rule__Training__Group__1 )
            // InternalUpctformaevalua.g:2069:2: rule__Training__Group__0__Impl rule__Training__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUpctformaevalua.g:2076:1: rule__Training__Group__0__Impl : ( () ) ;
    public final void rule__Training__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2080:1: ( ( () ) )
            // InternalUpctformaevalua.g:2081:1: ( () )
            {
            // InternalUpctformaevalua.g:2081:1: ( () )
            // InternalUpctformaevalua.g:2082:2: ()
            {
             before(grammarAccess.getTrainingAccess().getTrainingAction_0()); 
            // InternalUpctformaevalua.g:2083:2: ()
            // InternalUpctformaevalua.g:2083:3: 
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
    // InternalUpctformaevalua.g:2091:1: rule__Training__Group__1 : rule__Training__Group__1__Impl rule__Training__Group__2 ;
    public final void rule__Training__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2095:1: ( rule__Training__Group__1__Impl rule__Training__Group__2 )
            // InternalUpctformaevalua.g:2096:2: rule__Training__Group__1__Impl rule__Training__Group__2
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
    // InternalUpctformaevalua.g:2103:1: rule__Training__Group__1__Impl : ( 'Training' ) ;
    public final void rule__Training__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2107:1: ( ( 'Training' ) )
            // InternalUpctformaevalua.g:2108:1: ( 'Training' )
            {
            // InternalUpctformaevalua.g:2108:1: ( 'Training' )
            // InternalUpctformaevalua.g:2109:2: 'Training'
            {
             before(grammarAccess.getTrainingAccess().getTrainingKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:2118:1: rule__Training__Group__2 : rule__Training__Group__2__Impl rule__Training__Group__3 ;
    public final void rule__Training__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2122:1: ( rule__Training__Group__2__Impl rule__Training__Group__3 )
            // InternalUpctformaevalua.g:2123:2: rule__Training__Group__2__Impl rule__Training__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUpctformaevalua.g:2130:1: rule__Training__Group__2__Impl : ( ( rule__Training__NameAssignment_2 ) ) ;
    public final void rule__Training__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2134:1: ( ( ( rule__Training__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:2135:1: ( ( rule__Training__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:2135:1: ( ( rule__Training__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:2136:2: ( rule__Training__NameAssignment_2 )
            {
             before(grammarAccess.getTrainingAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:2137:2: ( rule__Training__NameAssignment_2 )
            // InternalUpctformaevalua.g:2137:3: rule__Training__NameAssignment_2
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
    // InternalUpctformaevalua.g:2145:1: rule__Training__Group__3 : rule__Training__Group__3__Impl rule__Training__Group__4 ;
    public final void rule__Training__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2149:1: ( rule__Training__Group__3__Impl rule__Training__Group__4 )
            // InternalUpctformaevalua.g:2150:2: rule__Training__Group__3__Impl rule__Training__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUpctformaevalua.g:2157:1: rule__Training__Group__3__Impl : ( ( rule__Training__LanguageAssignment_3 ) ) ;
    public final void rule__Training__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2161:1: ( ( ( rule__Training__LanguageAssignment_3 ) ) )
            // InternalUpctformaevalua.g:2162:1: ( ( rule__Training__LanguageAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:2162:1: ( ( rule__Training__LanguageAssignment_3 ) )
            // InternalUpctformaevalua.g:2163:2: ( rule__Training__LanguageAssignment_3 )
            {
             before(grammarAccess.getTrainingAccess().getLanguageAssignment_3()); 
            // InternalUpctformaevalua.g:2164:2: ( rule__Training__LanguageAssignment_3 )
            // InternalUpctformaevalua.g:2164:3: rule__Training__LanguageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Training__LanguageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getLanguageAssignment_3()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2172:1: rule__Training__Group__4 : rule__Training__Group__4__Impl rule__Training__Group__5 ;
    public final void rule__Training__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2176:1: ( rule__Training__Group__4__Impl rule__Training__Group__5 )
            // InternalUpctformaevalua.g:2177:2: rule__Training__Group__4__Impl rule__Training__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalUpctformaevalua.g:2184:1: rule__Training__Group__4__Impl : ( '{' ) ;
    public final void rule__Training__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2188:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2189:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2189:1: ( '{' )
            // InternalUpctformaevalua.g:2190:2: '{'
            {
             before(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2199:1: rule__Training__Group__5 : rule__Training__Group__5__Impl rule__Training__Group__6 ;
    public final void rule__Training__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2203:1: ( rule__Training__Group__5__Impl rule__Training__Group__6 )
            // InternalUpctformaevalua.g:2204:2: rule__Training__Group__5__Impl rule__Training__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalUpctformaevalua.g:2211:1: rule__Training__Group__5__Impl : ( ( rule__Training__Group_5__0 )? ) ;
    public final void rule__Training__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2215:1: ( ( ( rule__Training__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:2216:1: ( ( rule__Training__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:2216:1: ( ( rule__Training__Group_5__0 )? )
            // InternalUpctformaevalua.g:2217:2: ( rule__Training__Group_5__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:2218:2: ( rule__Training__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctformaevalua.g:2218:3: rule__Training__Group_5__0
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
    // InternalUpctformaevalua.g:2226:1: rule__Training__Group__6 : rule__Training__Group__6__Impl rule__Training__Group__7 ;
    public final void rule__Training__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2230:1: ( rule__Training__Group__6__Impl rule__Training__Group__7 )
            // InternalUpctformaevalua.g:2231:2: rule__Training__Group__6__Impl rule__Training__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalUpctformaevalua.g:2238:1: rule__Training__Group__6__Impl : ( ( rule__Training__Group_6__0 )? ) ;
    public final void rule__Training__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2242:1: ( ( ( rule__Training__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:2243:1: ( ( rule__Training__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:2243:1: ( ( rule__Training__Group_6__0 )? )
            // InternalUpctformaevalua.g:2244:2: ( rule__Training__Group_6__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:2245:2: ( rule__Training__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctformaevalua.g:2245:3: rule__Training__Group_6__0
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
    // InternalUpctformaevalua.g:2253:1: rule__Training__Group__7 : rule__Training__Group__7__Impl rule__Training__Group__8 ;
    public final void rule__Training__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2257:1: ( rule__Training__Group__7__Impl rule__Training__Group__8 )
            // InternalUpctformaevalua.g:2258:2: rule__Training__Group__7__Impl rule__Training__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalUpctformaevalua.g:2265:1: rule__Training__Group__7__Impl : ( ( rule__Training__Group_7__0 )? ) ;
    public final void rule__Training__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2269:1: ( ( ( rule__Training__Group_7__0 )? ) )
            // InternalUpctformaevalua.g:2270:1: ( ( rule__Training__Group_7__0 )? )
            {
            // InternalUpctformaevalua.g:2270:1: ( ( rule__Training__Group_7__0 )? )
            // InternalUpctformaevalua.g:2271:2: ( rule__Training__Group_7__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_7()); 
            // InternalUpctformaevalua.g:2272:2: ( rule__Training__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUpctformaevalua.g:2272:3: rule__Training__Group_7__0
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
    // InternalUpctformaevalua.g:2280:1: rule__Training__Group__8 : rule__Training__Group__8__Impl rule__Training__Group__9 ;
    public final void rule__Training__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2284:1: ( rule__Training__Group__8__Impl rule__Training__Group__9 )
            // InternalUpctformaevalua.g:2285:2: rule__Training__Group__8__Impl rule__Training__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Training__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group__9();

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
    // InternalUpctformaevalua.g:2292:1: rule__Training__Group__8__Impl : ( ( rule__Training__Group_8__0 )? ) ;
    public final void rule__Training__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2296:1: ( ( ( rule__Training__Group_8__0 )? ) )
            // InternalUpctformaevalua.g:2297:1: ( ( rule__Training__Group_8__0 )? )
            {
            // InternalUpctformaevalua.g:2297:1: ( ( rule__Training__Group_8__0 )? )
            // InternalUpctformaevalua.g:2298:2: ( rule__Training__Group_8__0 )?
            {
             before(grammarAccess.getTrainingAccess().getGroup_8()); 
            // InternalUpctformaevalua.g:2299:2: ( rule__Training__Group_8__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctformaevalua.g:2299:3: rule__Training__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Training__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrainingAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Training__Group__9"
    // InternalUpctformaevalua.g:2307:1: rule__Training__Group__9 : rule__Training__Group__9__Impl ;
    public final void rule__Training__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2311:1: ( rule__Training__Group__9__Impl )
            // InternalUpctformaevalua.g:2312:2: rule__Training__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group__9__Impl();

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
    // $ANTLR end "rule__Training__Group__9"


    // $ANTLR start "rule__Training__Group__9__Impl"
    // InternalUpctformaevalua.g:2318:1: rule__Training__Group__9__Impl : ( '}' ) ;
    public final void rule__Training__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2322:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2323:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2323:1: ( '}' )
            // InternalUpctformaevalua.g:2324:2: '}'
            {
             before(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group__9__Impl"


    // $ANTLR start "rule__Training__Group_5__0"
    // InternalUpctformaevalua.g:2334:1: rule__Training__Group_5__0 : rule__Training__Group_5__0__Impl rule__Training__Group_5__1 ;
    public final void rule__Training__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2338:1: ( rule__Training__Group_5__0__Impl rule__Training__Group_5__1 )
            // InternalUpctformaevalua.g:2339:2: rule__Training__Group_5__0__Impl rule__Training__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUpctformaevalua.g:2346:1: rule__Training__Group_5__0__Impl : ( 'numberquestions' ) ;
    public final void rule__Training__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2350:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:2351:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:2351:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:2352:2: 'numberquestions'
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getNumberquestionsKeyword_5_0()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2361:1: rule__Training__Group_5__1 : rule__Training__Group_5__1__Impl ;
    public final void rule__Training__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2365:1: ( rule__Training__Group_5__1__Impl )
            // InternalUpctformaevalua.g:2366:2: rule__Training__Group_5__1__Impl
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
    // InternalUpctformaevalua.g:2372:1: rule__Training__Group_5__1__Impl : ( ( rule__Training__NumberquestionsAssignment_5_1 ) ) ;
    public final void rule__Training__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2376:1: ( ( ( rule__Training__NumberquestionsAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:2377:1: ( ( rule__Training__NumberquestionsAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:2377:1: ( ( rule__Training__NumberquestionsAssignment_5_1 ) )
            // InternalUpctformaevalua.g:2378:2: ( rule__Training__NumberquestionsAssignment_5_1 )
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsAssignment_5_1()); 
            // InternalUpctformaevalua.g:2379:2: ( rule__Training__NumberquestionsAssignment_5_1 )
            // InternalUpctformaevalua.g:2379:3: rule__Training__NumberquestionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__NumberquestionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getNumberquestionsAssignment_5_1()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2388:1: rule__Training__Group_6__0 : rule__Training__Group_6__0__Impl rule__Training__Group_6__1 ;
    public final void rule__Training__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2392:1: ( rule__Training__Group_6__0__Impl rule__Training__Group_6__1 )
            // InternalUpctformaevalua.g:2393:2: rule__Training__Group_6__0__Impl rule__Training__Group_6__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUpctformaevalua.g:2400:1: rule__Training__Group_6__0__Impl : ( 'Attempts' ) ;
    public final void rule__Training__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2404:1: ( ( 'Attempts' ) )
            // InternalUpctformaevalua.g:2405:1: ( 'Attempts' )
            {
            // InternalUpctformaevalua.g:2405:1: ( 'Attempts' )
            // InternalUpctformaevalua.g:2406:2: 'Attempts'
            {
             before(grammarAccess.getTrainingAccess().getAttemptsKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getAttemptsKeyword_6_0()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2415:1: rule__Training__Group_6__1 : rule__Training__Group_6__1__Impl ;
    public final void rule__Training__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2419:1: ( rule__Training__Group_6__1__Impl )
            // InternalUpctformaevalua.g:2420:2: rule__Training__Group_6__1__Impl
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
    // InternalUpctformaevalua.g:2426:1: rule__Training__Group_6__1__Impl : ( ( rule__Training__AttemptsAssignment_6_1 ) ) ;
    public final void rule__Training__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2430:1: ( ( ( rule__Training__AttemptsAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:2431:1: ( ( rule__Training__AttemptsAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:2431:1: ( ( rule__Training__AttemptsAssignment_6_1 ) )
            // InternalUpctformaevalua.g:2432:2: ( rule__Training__AttemptsAssignment_6_1 )
            {
             before(grammarAccess.getTrainingAccess().getAttemptsAssignment_6_1()); 
            // InternalUpctformaevalua.g:2433:2: ( rule__Training__AttemptsAssignment_6_1 )
            // InternalUpctformaevalua.g:2433:3: rule__Training__AttemptsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__AttemptsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getAttemptsAssignment_6_1()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2442:1: rule__Training__Group_7__0 : rule__Training__Group_7__0__Impl rule__Training__Group_7__1 ;
    public final void rule__Training__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2446:1: ( rule__Training__Group_7__0__Impl rule__Training__Group_7__1 )
            // InternalUpctformaevalua.g:2447:2: rule__Training__Group_7__0__Impl rule__Training__Group_7__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalUpctformaevalua.g:2454:1: rule__Training__Group_7__0__Impl : ( 'grade' ) ;
    public final void rule__Training__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2458:1: ( ( 'grade' ) )
            // InternalUpctformaevalua.g:2459:1: ( 'grade' )
            {
            // InternalUpctformaevalua.g:2459:1: ( 'grade' )
            // InternalUpctformaevalua.g:2460:2: 'grade'
            {
             before(grammarAccess.getTrainingAccess().getGradeKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getGradeKeyword_7_0()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2469:1: rule__Training__Group_7__1 : rule__Training__Group_7__1__Impl ;
    public final void rule__Training__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2473:1: ( rule__Training__Group_7__1__Impl )
            // InternalUpctformaevalua.g:2474:2: rule__Training__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_7__1__Impl();

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
    // InternalUpctformaevalua.g:2480:1: rule__Training__Group_7__1__Impl : ( ( rule__Training__GradeAssignment_7_1 ) ) ;
    public final void rule__Training__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2484:1: ( ( ( rule__Training__GradeAssignment_7_1 ) ) )
            // InternalUpctformaevalua.g:2485:1: ( ( rule__Training__GradeAssignment_7_1 ) )
            {
            // InternalUpctformaevalua.g:2485:1: ( ( rule__Training__GradeAssignment_7_1 ) )
            // InternalUpctformaevalua.g:2486:2: ( rule__Training__GradeAssignment_7_1 )
            {
             before(grammarAccess.getTrainingAccess().getGradeAssignment_7_1()); 
            // InternalUpctformaevalua.g:2487:2: ( rule__Training__GradeAssignment_7_1 )
            // InternalUpctformaevalua.g:2487:3: rule__Training__GradeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__GradeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getGradeAssignment_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Training__Group_8__0"
    // InternalUpctformaevalua.g:2496:1: rule__Training__Group_8__0 : rule__Training__Group_8__0__Impl rule__Training__Group_8__1 ;
    public final void rule__Training__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2500:1: ( rule__Training__Group_8__0__Impl rule__Training__Group_8__1 )
            // InternalUpctformaevalua.g:2501:2: rule__Training__Group_8__0__Impl rule__Training__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Training__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_8__1();

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
    // $ANTLR end "rule__Training__Group_8__0"


    // $ANTLR start "rule__Training__Group_8__0__Impl"
    // InternalUpctformaevalua.g:2508:1: rule__Training__Group_8__0__Impl : ( 'questions' ) ;
    public final void rule__Training__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2512:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:2513:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:2513:1: ( 'questions' )
            // InternalUpctformaevalua.g:2514:2: 'questions'
            {
             before(grammarAccess.getTrainingAccess().getQuestionsKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getQuestionsKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_8__0__Impl"


    // $ANTLR start "rule__Training__Group_8__1"
    // InternalUpctformaevalua.g:2523:1: rule__Training__Group_8__1 : rule__Training__Group_8__1__Impl rule__Training__Group_8__2 ;
    public final void rule__Training__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2527:1: ( rule__Training__Group_8__1__Impl rule__Training__Group_8__2 )
            // InternalUpctformaevalua.g:2528:2: rule__Training__Group_8__1__Impl rule__Training__Group_8__2
            {
            pushFollow(FOLLOW_18);
            rule__Training__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_8__2();

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
    // $ANTLR end "rule__Training__Group_8__1"


    // $ANTLR start "rule__Training__Group_8__1__Impl"
    // InternalUpctformaevalua.g:2535:1: rule__Training__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Training__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2539:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2540:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2540:1: ( '{' )
            // InternalUpctformaevalua.g:2541:2: '{'
            {
             before(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_8__1__Impl"


    // $ANTLR start "rule__Training__Group_8__2"
    // InternalUpctformaevalua.g:2550:1: rule__Training__Group_8__2 : rule__Training__Group_8__2__Impl rule__Training__Group_8__3 ;
    public final void rule__Training__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2554:1: ( rule__Training__Group_8__2__Impl rule__Training__Group_8__3 )
            // InternalUpctformaevalua.g:2555:2: rule__Training__Group_8__2__Impl rule__Training__Group_8__3
            {
            pushFollow(FOLLOW_19);
            rule__Training__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_8__3();

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
    // $ANTLR end "rule__Training__Group_8__2"


    // $ANTLR start "rule__Training__Group_8__2__Impl"
    // InternalUpctformaevalua.g:2562:1: rule__Training__Group_8__2__Impl : ( ( rule__Training__QuestionsAssignment_8_2 ) ) ;
    public final void rule__Training__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2566:1: ( ( ( rule__Training__QuestionsAssignment_8_2 ) ) )
            // InternalUpctformaevalua.g:2567:1: ( ( rule__Training__QuestionsAssignment_8_2 ) )
            {
            // InternalUpctformaevalua.g:2567:1: ( ( rule__Training__QuestionsAssignment_8_2 ) )
            // InternalUpctformaevalua.g:2568:2: ( rule__Training__QuestionsAssignment_8_2 )
            {
             before(grammarAccess.getTrainingAccess().getQuestionsAssignment_8_2()); 
            // InternalUpctformaevalua.g:2569:2: ( rule__Training__QuestionsAssignment_8_2 )
            // InternalUpctformaevalua.g:2569:3: rule__Training__QuestionsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Training__QuestionsAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getQuestionsAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_8__2__Impl"


    // $ANTLR start "rule__Training__Group_8__3"
    // InternalUpctformaevalua.g:2577:1: rule__Training__Group_8__3 : rule__Training__Group_8__3__Impl rule__Training__Group_8__4 ;
    public final void rule__Training__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2581:1: ( rule__Training__Group_8__3__Impl rule__Training__Group_8__4 )
            // InternalUpctformaevalua.g:2582:2: rule__Training__Group_8__3__Impl rule__Training__Group_8__4
            {
            pushFollow(FOLLOW_19);
            rule__Training__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_8__4();

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
    // $ANTLR end "rule__Training__Group_8__3"


    // $ANTLR start "rule__Training__Group_8__3__Impl"
    // InternalUpctformaevalua.g:2589:1: rule__Training__Group_8__3__Impl : ( ( rule__Training__Group_8_3__0 )* ) ;
    public final void rule__Training__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2593:1: ( ( ( rule__Training__Group_8_3__0 )* ) )
            // InternalUpctformaevalua.g:2594:1: ( ( rule__Training__Group_8_3__0 )* )
            {
            // InternalUpctformaevalua.g:2594:1: ( ( rule__Training__Group_8_3__0 )* )
            // InternalUpctformaevalua.g:2595:2: ( rule__Training__Group_8_3__0 )*
            {
             before(grammarAccess.getTrainingAccess().getGroup_8_3()); 
            // InternalUpctformaevalua.g:2596:2: ( rule__Training__Group_8_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUpctformaevalua.g:2596:3: rule__Training__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Training__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTrainingAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_8__3__Impl"


    // $ANTLR start "rule__Training__Group_8__4"
    // InternalUpctformaevalua.g:2604:1: rule__Training__Group_8__4 : rule__Training__Group_8__4__Impl ;
    public final void rule__Training__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2608:1: ( rule__Training__Group_8__4__Impl )
            // InternalUpctformaevalua.g:2609:2: rule__Training__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_8__4__Impl();

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
    // $ANTLR end "rule__Training__Group_8__4"


    // $ANTLR start "rule__Training__Group_8__4__Impl"
    // InternalUpctformaevalua.g:2615:1: rule__Training__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Training__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2619:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2620:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2620:1: ( '}' )
            // InternalUpctformaevalua.g:2621:2: '}'
            {
             before(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_8__4__Impl"


    // $ANTLR start "rule__Training__Group_8_3__0"
    // InternalUpctformaevalua.g:2631:1: rule__Training__Group_8_3__0 : rule__Training__Group_8_3__0__Impl rule__Training__Group_8_3__1 ;
    public final void rule__Training__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2635:1: ( rule__Training__Group_8_3__0__Impl rule__Training__Group_8_3__1 )
            // InternalUpctformaevalua.g:2636:2: rule__Training__Group_8_3__0__Impl rule__Training__Group_8_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Training__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Training__Group_8_3__1();

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
    // $ANTLR end "rule__Training__Group_8_3__0"


    // $ANTLR start "rule__Training__Group_8_3__0__Impl"
    // InternalUpctformaevalua.g:2643:1: rule__Training__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Training__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2647:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:2648:1: ( ',' )
            {
            // InternalUpctformaevalua.g:2648:1: ( ',' )
            // InternalUpctformaevalua.g:2649:2: ','
            {
             before(grammarAccess.getTrainingAccess().getCommaKeyword_8_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTrainingAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_8_3__0__Impl"


    // $ANTLR start "rule__Training__Group_8_3__1"
    // InternalUpctformaevalua.g:2658:1: rule__Training__Group_8_3__1 : rule__Training__Group_8_3__1__Impl ;
    public final void rule__Training__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2662:1: ( rule__Training__Group_8_3__1__Impl )
            // InternalUpctformaevalua.g:2663:2: rule__Training__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Training__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__Training__Group_8_3__1"


    // $ANTLR start "rule__Training__Group_8_3__1__Impl"
    // InternalUpctformaevalua.g:2669:1: rule__Training__Group_8_3__1__Impl : ( ( rule__Training__QuestionsAssignment_8_3_1 ) ) ;
    public final void rule__Training__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2673:1: ( ( ( rule__Training__QuestionsAssignment_8_3_1 ) ) )
            // InternalUpctformaevalua.g:2674:1: ( ( rule__Training__QuestionsAssignment_8_3_1 ) )
            {
            // InternalUpctformaevalua.g:2674:1: ( ( rule__Training__QuestionsAssignment_8_3_1 ) )
            // InternalUpctformaevalua.g:2675:2: ( rule__Training__QuestionsAssignment_8_3_1 )
            {
             before(grammarAccess.getTrainingAccess().getQuestionsAssignment_8_3_1()); 
            // InternalUpctformaevalua.g:2676:2: ( rule__Training__QuestionsAssignment_8_3_1 )
            // InternalUpctformaevalua.g:2676:3: rule__Training__QuestionsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Training__QuestionsAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainingAccess().getQuestionsAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__Group_8_3__1__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // InternalUpctformaevalua.g:2685:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2689:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalUpctformaevalua.g:2690:2: rule__Final__Group__0__Impl rule__Final__Group__1
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
    // InternalUpctformaevalua.g:2697:1: rule__Final__Group__0__Impl : ( () ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2701:1: ( ( () ) )
            // InternalUpctformaevalua.g:2702:1: ( () )
            {
            // InternalUpctformaevalua.g:2702:1: ( () )
            // InternalUpctformaevalua.g:2703:2: ()
            {
             before(grammarAccess.getFinalAccess().getFinalAction_0()); 
            // InternalUpctformaevalua.g:2704:2: ()
            // InternalUpctformaevalua.g:2704:3: 
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
    // InternalUpctformaevalua.g:2712:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2716:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalUpctformaevalua.g:2717:2: rule__Final__Group__1__Impl rule__Final__Group__2
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
    // InternalUpctformaevalua.g:2724:1: rule__Final__Group__1__Impl : ( 'Final' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2728:1: ( ( 'Final' ) )
            // InternalUpctformaevalua.g:2729:1: ( 'Final' )
            {
            // InternalUpctformaevalua.g:2729:1: ( 'Final' )
            // InternalUpctformaevalua.g:2730:2: 'Final'
            {
             before(grammarAccess.getFinalAccess().getFinalKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:2739:1: rule__Final__Group__2 : rule__Final__Group__2__Impl rule__Final__Group__3 ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2743:1: ( rule__Final__Group__2__Impl rule__Final__Group__3 )
            // InternalUpctformaevalua.g:2744:2: rule__Final__Group__2__Impl rule__Final__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalUpctformaevalua.g:2751:1: rule__Final__Group__2__Impl : ( ( rule__Final__NameAssignment_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2755:1: ( ( ( rule__Final__NameAssignment_2 ) ) )
            // InternalUpctformaevalua.g:2756:1: ( ( rule__Final__NameAssignment_2 ) )
            {
            // InternalUpctformaevalua.g:2756:1: ( ( rule__Final__NameAssignment_2 ) )
            // InternalUpctformaevalua.g:2757:2: ( rule__Final__NameAssignment_2 )
            {
             before(grammarAccess.getFinalAccess().getNameAssignment_2()); 
            // InternalUpctformaevalua.g:2758:2: ( rule__Final__NameAssignment_2 )
            // InternalUpctformaevalua.g:2758:3: rule__Final__NameAssignment_2
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
    // InternalUpctformaevalua.g:2766:1: rule__Final__Group__3 : rule__Final__Group__3__Impl rule__Final__Group__4 ;
    public final void rule__Final__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2770:1: ( rule__Final__Group__3__Impl rule__Final__Group__4 )
            // InternalUpctformaevalua.g:2771:2: rule__Final__Group__3__Impl rule__Final__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUpctformaevalua.g:2778:1: rule__Final__Group__3__Impl : ( ( rule__Final__LanguageAssignment_3 ) ) ;
    public final void rule__Final__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2782:1: ( ( ( rule__Final__LanguageAssignment_3 ) ) )
            // InternalUpctformaevalua.g:2783:1: ( ( rule__Final__LanguageAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:2783:1: ( ( rule__Final__LanguageAssignment_3 ) )
            // InternalUpctformaevalua.g:2784:2: ( rule__Final__LanguageAssignment_3 )
            {
             before(grammarAccess.getFinalAccess().getLanguageAssignment_3()); 
            // InternalUpctformaevalua.g:2785:2: ( rule__Final__LanguageAssignment_3 )
            // InternalUpctformaevalua.g:2785:3: rule__Final__LanguageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Final__LanguageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getLanguageAssignment_3()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2793:1: rule__Final__Group__4 : rule__Final__Group__4__Impl rule__Final__Group__5 ;
    public final void rule__Final__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2797:1: ( rule__Final__Group__4__Impl rule__Final__Group__5 )
            // InternalUpctformaevalua.g:2798:2: rule__Final__Group__4__Impl rule__Final__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalUpctformaevalua.g:2805:1: rule__Final__Group__4__Impl : ( '{' ) ;
    public final void rule__Final__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2809:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2810:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2810:1: ( '{' )
            // InternalUpctformaevalua.g:2811:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2820:1: rule__Final__Group__5 : rule__Final__Group__5__Impl rule__Final__Group__6 ;
    public final void rule__Final__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2824:1: ( rule__Final__Group__5__Impl rule__Final__Group__6 )
            // InternalUpctformaevalua.g:2825:2: rule__Final__Group__5__Impl rule__Final__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalUpctformaevalua.g:2832:1: rule__Final__Group__5__Impl : ( ( rule__Final__Group_5__0 )? ) ;
    public final void rule__Final__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2836:1: ( ( ( rule__Final__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:2837:1: ( ( rule__Final__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:2837:1: ( ( rule__Final__Group_5__0 )? )
            // InternalUpctformaevalua.g:2838:2: ( rule__Final__Group_5__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:2839:2: ( rule__Final__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctformaevalua.g:2839:3: rule__Final__Group_5__0
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
    // InternalUpctformaevalua.g:2847:1: rule__Final__Group__6 : rule__Final__Group__6__Impl rule__Final__Group__7 ;
    public final void rule__Final__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2851:1: ( rule__Final__Group__6__Impl rule__Final__Group__7 )
            // InternalUpctformaevalua.g:2852:2: rule__Final__Group__6__Impl rule__Final__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Final__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__7();

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
    // InternalUpctformaevalua.g:2859:1: rule__Final__Group__6__Impl : ( ( rule__Final__Group_6__0 )? ) ;
    public final void rule__Final__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2863:1: ( ( ( rule__Final__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:2864:1: ( ( rule__Final__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:2864:1: ( ( rule__Final__Group_6__0 )? )
            // InternalUpctformaevalua.g:2865:2: ( rule__Final__Group_6__0 )?
            {
             before(grammarAccess.getFinalAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:2866:2: ( rule__Final__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctformaevalua.g:2866:3: rule__Final__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Final__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFinalAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Final__Group__7"
    // InternalUpctformaevalua.g:2874:1: rule__Final__Group__7 : rule__Final__Group__7__Impl ;
    public final void rule__Final__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2878:1: ( rule__Final__Group__7__Impl )
            // InternalUpctformaevalua.g:2879:2: rule__Final__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__7__Impl();

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
    // $ANTLR end "rule__Final__Group__7"


    // $ANTLR start "rule__Final__Group__7__Impl"
    // InternalUpctformaevalua.g:2885:1: rule__Final__Group__7__Impl : ( '}' ) ;
    public final void rule__Final__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2889:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:2890:1: ( '}' )
            {
            // InternalUpctformaevalua.g:2890:1: ( '}' )
            // InternalUpctformaevalua.g:2891:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__7__Impl"


    // $ANTLR start "rule__Final__Group_5__0"
    // InternalUpctformaevalua.g:2901:1: rule__Final__Group_5__0 : rule__Final__Group_5__0__Impl rule__Final__Group_5__1 ;
    public final void rule__Final__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2905:1: ( rule__Final__Group_5__0__Impl rule__Final__Group_5__1 )
            // InternalUpctformaevalua.g:2906:2: rule__Final__Group_5__0__Impl rule__Final__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUpctformaevalua.g:2913:1: rule__Final__Group_5__0__Impl : ( 'numberquestions' ) ;
    public final void rule__Final__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2917:1: ( ( 'numberquestions' ) )
            // InternalUpctformaevalua.g:2918:1: ( 'numberquestions' )
            {
            // InternalUpctformaevalua.g:2918:1: ( 'numberquestions' )
            // InternalUpctformaevalua.g:2919:2: 'numberquestions'
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getNumberquestionsKeyword_5_0()); 

            }


            }

        }
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
    // InternalUpctformaevalua.g:2928:1: rule__Final__Group_5__1 : rule__Final__Group_5__1__Impl ;
    public final void rule__Final__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2932:1: ( rule__Final__Group_5__1__Impl )
            // InternalUpctformaevalua.g:2933:2: rule__Final__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_5__1__Impl();

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
    // InternalUpctformaevalua.g:2939:1: rule__Final__Group_5__1__Impl : ( ( rule__Final__NumberquestionsAssignment_5_1 ) ) ;
    public final void rule__Final__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2943:1: ( ( ( rule__Final__NumberquestionsAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:2944:1: ( ( rule__Final__NumberquestionsAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:2944:1: ( ( rule__Final__NumberquestionsAssignment_5_1 ) )
            // InternalUpctformaevalua.g:2945:2: ( rule__Final__NumberquestionsAssignment_5_1 )
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsAssignment_5_1()); 
            // InternalUpctformaevalua.g:2946:2: ( rule__Final__NumberquestionsAssignment_5_1 )
            // InternalUpctformaevalua.g:2946:3: rule__Final__NumberquestionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Final__NumberquestionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getNumberquestionsAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Final__Group_6__0"
    // InternalUpctformaevalua.g:2955:1: rule__Final__Group_6__0 : rule__Final__Group_6__0__Impl rule__Final__Group_6__1 ;
    public final void rule__Final__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2959:1: ( rule__Final__Group_6__0__Impl rule__Final__Group_6__1 )
            // InternalUpctformaevalua.g:2960:2: rule__Final__Group_6__0__Impl rule__Final__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Final__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_6__1();

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
    // $ANTLR end "rule__Final__Group_6__0"


    // $ANTLR start "rule__Final__Group_6__0__Impl"
    // InternalUpctformaevalua.g:2967:1: rule__Final__Group_6__0__Impl : ( 'questions' ) ;
    public final void rule__Final__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2971:1: ( ( 'questions' ) )
            // InternalUpctformaevalua.g:2972:1: ( 'questions' )
            {
            // InternalUpctformaevalua.g:2972:1: ( 'questions' )
            // InternalUpctformaevalua.g:2973:2: 'questions'
            {
             before(grammarAccess.getFinalAccess().getQuestionsKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getQuestionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_6__0__Impl"


    // $ANTLR start "rule__Final__Group_6__1"
    // InternalUpctformaevalua.g:2982:1: rule__Final__Group_6__1 : rule__Final__Group_6__1__Impl rule__Final__Group_6__2 ;
    public final void rule__Final__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2986:1: ( rule__Final__Group_6__1__Impl rule__Final__Group_6__2 )
            // InternalUpctformaevalua.g:2987:2: rule__Final__Group_6__1__Impl rule__Final__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__Final__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_6__2();

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
    // $ANTLR end "rule__Final__Group_6__1"


    // $ANTLR start "rule__Final__Group_6__1__Impl"
    // InternalUpctformaevalua.g:2994:1: rule__Final__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Final__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:2998:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:2999:1: ( '{' )
            {
            // InternalUpctformaevalua.g:2999:1: ( '{' )
            // InternalUpctformaevalua.g:3000:2: '{'
            {
             before(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_6__1__Impl"


    // $ANTLR start "rule__Final__Group_6__2"
    // InternalUpctformaevalua.g:3009:1: rule__Final__Group_6__2 : rule__Final__Group_6__2__Impl rule__Final__Group_6__3 ;
    public final void rule__Final__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3013:1: ( rule__Final__Group_6__2__Impl rule__Final__Group_6__3 )
            // InternalUpctformaevalua.g:3014:2: rule__Final__Group_6__2__Impl rule__Final__Group_6__3
            {
            pushFollow(FOLLOW_19);
            rule__Final__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_6__3();

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
    // $ANTLR end "rule__Final__Group_6__2"


    // $ANTLR start "rule__Final__Group_6__2__Impl"
    // InternalUpctformaevalua.g:3021:1: rule__Final__Group_6__2__Impl : ( ( rule__Final__QuestionsAssignment_6_2 ) ) ;
    public final void rule__Final__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3025:1: ( ( ( rule__Final__QuestionsAssignment_6_2 ) ) )
            // InternalUpctformaevalua.g:3026:1: ( ( rule__Final__QuestionsAssignment_6_2 ) )
            {
            // InternalUpctformaevalua.g:3026:1: ( ( rule__Final__QuestionsAssignment_6_2 ) )
            // InternalUpctformaevalua.g:3027:2: ( rule__Final__QuestionsAssignment_6_2 )
            {
             before(grammarAccess.getFinalAccess().getQuestionsAssignment_6_2()); 
            // InternalUpctformaevalua.g:3028:2: ( rule__Final__QuestionsAssignment_6_2 )
            // InternalUpctformaevalua.g:3028:3: rule__Final__QuestionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Final__QuestionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getQuestionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_6__2__Impl"


    // $ANTLR start "rule__Final__Group_6__3"
    // InternalUpctformaevalua.g:3036:1: rule__Final__Group_6__3 : rule__Final__Group_6__3__Impl rule__Final__Group_6__4 ;
    public final void rule__Final__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3040:1: ( rule__Final__Group_6__3__Impl rule__Final__Group_6__4 )
            // InternalUpctformaevalua.g:3041:2: rule__Final__Group_6__3__Impl rule__Final__Group_6__4
            {
            pushFollow(FOLLOW_19);
            rule__Final__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_6__4();

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
    // $ANTLR end "rule__Final__Group_6__3"


    // $ANTLR start "rule__Final__Group_6__3__Impl"
    // InternalUpctformaevalua.g:3048:1: rule__Final__Group_6__3__Impl : ( ( rule__Final__Group_6_3__0 )* ) ;
    public final void rule__Final__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3052:1: ( ( ( rule__Final__Group_6_3__0 )* ) )
            // InternalUpctformaevalua.g:3053:1: ( ( rule__Final__Group_6_3__0 )* )
            {
            // InternalUpctformaevalua.g:3053:1: ( ( rule__Final__Group_6_3__0 )* )
            // InternalUpctformaevalua.g:3054:2: ( rule__Final__Group_6_3__0 )*
            {
             before(grammarAccess.getFinalAccess().getGroup_6_3()); 
            // InternalUpctformaevalua.g:3055:2: ( rule__Final__Group_6_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUpctformaevalua.g:3055:3: rule__Final__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Final__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFinalAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_6__3__Impl"


    // $ANTLR start "rule__Final__Group_6__4"
    // InternalUpctformaevalua.g:3063:1: rule__Final__Group_6__4 : rule__Final__Group_6__4__Impl ;
    public final void rule__Final__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3067:1: ( rule__Final__Group_6__4__Impl )
            // InternalUpctformaevalua.g:3068:2: rule__Final__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_6__4__Impl();

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
    // $ANTLR end "rule__Final__Group_6__4"


    // $ANTLR start "rule__Final__Group_6__4__Impl"
    // InternalUpctformaevalua.g:3074:1: rule__Final__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Final__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3078:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3079:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3079:1: ( '}' )
            // InternalUpctformaevalua.g:3080:2: '}'
            {
             before(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_6__4__Impl"


    // $ANTLR start "rule__Final__Group_6_3__0"
    // InternalUpctformaevalua.g:3090:1: rule__Final__Group_6_3__0 : rule__Final__Group_6_3__0__Impl rule__Final__Group_6_3__1 ;
    public final void rule__Final__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3094:1: ( rule__Final__Group_6_3__0__Impl rule__Final__Group_6_3__1 )
            // InternalUpctformaevalua.g:3095:2: rule__Final__Group_6_3__0__Impl rule__Final__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Final__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group_6_3__1();

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
    // $ANTLR end "rule__Final__Group_6_3__0"


    // $ANTLR start "rule__Final__Group_6_3__0__Impl"
    // InternalUpctformaevalua.g:3102:1: rule__Final__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Final__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3106:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:3107:1: ( ',' )
            {
            // InternalUpctformaevalua.g:3107:1: ( ',' )
            // InternalUpctformaevalua.g:3108:2: ','
            {
             before(grammarAccess.getFinalAccess().getCommaKeyword_6_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_6_3__0__Impl"


    // $ANTLR start "rule__Final__Group_6_3__1"
    // InternalUpctformaevalua.g:3117:1: rule__Final__Group_6_3__1 : rule__Final__Group_6_3__1__Impl ;
    public final void rule__Final__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3121:1: ( rule__Final__Group_6_3__1__Impl )
            // InternalUpctformaevalua.g:3122:2: rule__Final__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Final__Group_6_3__1"


    // $ANTLR start "rule__Final__Group_6_3__1__Impl"
    // InternalUpctformaevalua.g:3128:1: rule__Final__Group_6_3__1__Impl : ( ( rule__Final__QuestionsAssignment_6_3_1 ) ) ;
    public final void rule__Final__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3132:1: ( ( ( rule__Final__QuestionsAssignment_6_3_1 ) ) )
            // InternalUpctformaevalua.g:3133:1: ( ( rule__Final__QuestionsAssignment_6_3_1 ) )
            {
            // InternalUpctformaevalua.g:3133:1: ( ( rule__Final__QuestionsAssignment_6_3_1 ) )
            // InternalUpctformaevalua.g:3134:2: ( rule__Final__QuestionsAssignment_6_3_1 )
            {
             before(grammarAccess.getFinalAccess().getQuestionsAssignment_6_3_1()); 
            // InternalUpctformaevalua.g:3135:2: ( rule__Final__QuestionsAssignment_6_3_1 )
            // InternalUpctformaevalua.g:3135:3: rule__Final__QuestionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Final__QuestionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getQuestionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group_6_3__1__Impl"


    // $ANTLR start "rule__SingleAnswer__Group__0"
    // InternalUpctformaevalua.g:3144:1: rule__SingleAnswer__Group__0 : rule__SingleAnswer__Group__0__Impl rule__SingleAnswer__Group__1 ;
    public final void rule__SingleAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3148:1: ( rule__SingleAnswer__Group__0__Impl rule__SingleAnswer__Group__1 )
            // InternalUpctformaevalua.g:3149:2: rule__SingleAnswer__Group__0__Impl rule__SingleAnswer__Group__1
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
    // InternalUpctformaevalua.g:3156:1: rule__SingleAnswer__Group__0__Impl : ( 'SingleAnswer' ) ;
    public final void rule__SingleAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3160:1: ( ( 'SingleAnswer' ) )
            // InternalUpctformaevalua.g:3161:1: ( 'SingleAnswer' )
            {
            // InternalUpctformaevalua.g:3161:1: ( 'SingleAnswer' )
            // InternalUpctformaevalua.g:3162:2: 'SingleAnswer'
            {
             before(grammarAccess.getSingleAnswerAccess().getSingleAnswerKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3171:1: rule__SingleAnswer__Group__1 : rule__SingleAnswer__Group__1__Impl rule__SingleAnswer__Group__2 ;
    public final void rule__SingleAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3175:1: ( rule__SingleAnswer__Group__1__Impl rule__SingleAnswer__Group__2 )
            // InternalUpctformaevalua.g:3176:2: rule__SingleAnswer__Group__1__Impl rule__SingleAnswer__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalUpctformaevalua.g:3183:1: rule__SingleAnswer__Group__1__Impl : ( '{' ) ;
    public final void rule__SingleAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3187:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3188:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3188:1: ( '{' )
            // InternalUpctformaevalua.g:3189:2: '{'
            {
             before(grammarAccess.getSingleAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3198:1: rule__SingleAnswer__Group__2 : rule__SingleAnswer__Group__2__Impl rule__SingleAnswer__Group__3 ;
    public final void rule__SingleAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3202:1: ( rule__SingleAnswer__Group__2__Impl rule__SingleAnswer__Group__3 )
            // InternalUpctformaevalua.g:3203:2: rule__SingleAnswer__Group__2__Impl rule__SingleAnswer__Group__3
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
    // InternalUpctformaevalua.g:3210:1: rule__SingleAnswer__Group__2__Impl : ( 'statement' ) ;
    public final void rule__SingleAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3214:1: ( ( 'statement' ) )
            // InternalUpctformaevalua.g:3215:1: ( 'statement' )
            {
            // InternalUpctformaevalua.g:3215:1: ( 'statement' )
            // InternalUpctformaevalua.g:3216:2: 'statement'
            {
             before(grammarAccess.getSingleAnswerAccess().getStatementKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3225:1: rule__SingleAnswer__Group__3 : rule__SingleAnswer__Group__3__Impl rule__SingleAnswer__Group__4 ;
    public final void rule__SingleAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3229:1: ( rule__SingleAnswer__Group__3__Impl rule__SingleAnswer__Group__4 )
            // InternalUpctformaevalua.g:3230:2: rule__SingleAnswer__Group__3__Impl rule__SingleAnswer__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctformaevalua.g:3237:1: rule__SingleAnswer__Group__3__Impl : ( ( rule__SingleAnswer__StatementsAssignment_3 ) ) ;
    public final void rule__SingleAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3241:1: ( ( ( rule__SingleAnswer__StatementsAssignment_3 ) ) )
            // InternalUpctformaevalua.g:3242:1: ( ( rule__SingleAnswer__StatementsAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:3242:1: ( ( rule__SingleAnswer__StatementsAssignment_3 ) )
            // InternalUpctformaevalua.g:3243:2: ( rule__SingleAnswer__StatementsAssignment_3 )
            {
             before(grammarAccess.getSingleAnswerAccess().getStatementsAssignment_3()); 
            // InternalUpctformaevalua.g:3244:2: ( rule__SingleAnswer__StatementsAssignment_3 )
            // InternalUpctformaevalua.g:3244:3: rule__SingleAnswer__StatementsAssignment_3
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
    // InternalUpctformaevalua.g:3252:1: rule__SingleAnswer__Group__4 : rule__SingleAnswer__Group__4__Impl rule__SingleAnswer__Group__5 ;
    public final void rule__SingleAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3256:1: ( rule__SingleAnswer__Group__4__Impl rule__SingleAnswer__Group__5 )
            // InternalUpctformaevalua.g:3257:2: rule__SingleAnswer__Group__4__Impl rule__SingleAnswer__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctformaevalua.g:3264:1: rule__SingleAnswer__Group__4__Impl : ( ( rule__SingleAnswer__Group_4__0 )? ) ;
    public final void rule__SingleAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3268:1: ( ( ( rule__SingleAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:3269:1: ( ( rule__SingleAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:3269:1: ( ( rule__SingleAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:3270:2: ( rule__SingleAnswer__Group_4__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:3271:2: ( rule__SingleAnswer__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctformaevalua.g:3271:3: rule__SingleAnswer__Group_4__0
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
    // InternalUpctformaevalua.g:3279:1: rule__SingleAnswer__Group__5 : rule__SingleAnswer__Group__5__Impl rule__SingleAnswer__Group__6 ;
    public final void rule__SingleAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3283:1: ( rule__SingleAnswer__Group__5__Impl rule__SingleAnswer__Group__6 )
            // InternalUpctformaevalua.g:3284:2: rule__SingleAnswer__Group__5__Impl rule__SingleAnswer__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctformaevalua.g:3291:1: rule__SingleAnswer__Group__5__Impl : ( ( rule__SingleAnswer__Group_5__0 )? ) ;
    public final void rule__SingleAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3295:1: ( ( ( rule__SingleAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:3296:1: ( ( rule__SingleAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:3296:1: ( ( rule__SingleAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:3297:2: ( rule__SingleAnswer__Group_5__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:3298:2: ( rule__SingleAnswer__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctformaevalua.g:3298:3: rule__SingleAnswer__Group_5__0
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
    // InternalUpctformaevalua.g:3306:1: rule__SingleAnswer__Group__6 : rule__SingleAnswer__Group__6__Impl rule__SingleAnswer__Group__7 ;
    public final void rule__SingleAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3310:1: ( rule__SingleAnswer__Group__6__Impl rule__SingleAnswer__Group__7 )
            // InternalUpctformaevalua.g:3311:2: rule__SingleAnswer__Group__6__Impl rule__SingleAnswer__Group__7
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctformaevalua.g:3318:1: rule__SingleAnswer__Group__6__Impl : ( ( rule__SingleAnswer__Group_6__0 )? ) ;
    public final void rule__SingleAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3322:1: ( ( ( rule__SingleAnswer__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:3323:1: ( ( rule__SingleAnswer__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:3323:1: ( ( rule__SingleAnswer__Group_6__0 )? )
            // InternalUpctformaevalua.g:3324:2: ( rule__SingleAnswer__Group_6__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:3325:2: ( rule__SingleAnswer__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUpctformaevalua.g:3325:3: rule__SingleAnswer__Group_6__0
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
    // InternalUpctformaevalua.g:3333:1: rule__SingleAnswer__Group__7 : rule__SingleAnswer__Group__7__Impl rule__SingleAnswer__Group__8 ;
    public final void rule__SingleAnswer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3337:1: ( rule__SingleAnswer__Group__7__Impl rule__SingleAnswer__Group__8 )
            // InternalUpctformaevalua.g:3338:2: rule__SingleAnswer__Group__7__Impl rule__SingleAnswer__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctformaevalua.g:3345:1: rule__SingleAnswer__Group__7__Impl : ( ( rule__SingleAnswer__Group_7__0 )? ) ;
    public final void rule__SingleAnswer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3349:1: ( ( ( rule__SingleAnswer__Group_7__0 )? ) )
            // InternalUpctformaevalua.g:3350:1: ( ( rule__SingleAnswer__Group_7__0 )? )
            {
            // InternalUpctformaevalua.g:3350:1: ( ( rule__SingleAnswer__Group_7__0 )? )
            // InternalUpctformaevalua.g:3351:2: ( rule__SingleAnswer__Group_7__0 )?
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_7()); 
            // InternalUpctformaevalua.g:3352:2: ( rule__SingleAnswer__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctformaevalua.g:3352:3: rule__SingleAnswer__Group_7__0
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
    // InternalUpctformaevalua.g:3360:1: rule__SingleAnswer__Group__8 : rule__SingleAnswer__Group__8__Impl ;
    public final void rule__SingleAnswer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3364:1: ( rule__SingleAnswer__Group__8__Impl )
            // InternalUpctformaevalua.g:3365:2: rule__SingleAnswer__Group__8__Impl
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
    // InternalUpctformaevalua.g:3371:1: rule__SingleAnswer__Group__8__Impl : ( '}' ) ;
    public final void rule__SingleAnswer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3375:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3376:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3376:1: ( '}' )
            // InternalUpctformaevalua.g:3377:2: '}'
            {
             before(grammarAccess.getSingleAnswerAccess().getRightCurlyBracketKeyword_8()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3387:1: rule__SingleAnswer__Group_4__0 : rule__SingleAnswer__Group_4__0__Impl rule__SingleAnswer__Group_4__1 ;
    public final void rule__SingleAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3391:1: ( rule__SingleAnswer__Group_4__0__Impl rule__SingleAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:3392:2: rule__SingleAnswer__Group_4__0__Impl rule__SingleAnswer__Group_4__1
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
    // InternalUpctformaevalua.g:3399:1: rule__SingleAnswer__Group_4__0__Impl : ( 'answers' ) ;
    public final void rule__SingleAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3403:1: ( ( 'answers' ) )
            // InternalUpctformaevalua.g:3404:1: ( 'answers' )
            {
            // InternalUpctformaevalua.g:3404:1: ( 'answers' )
            // InternalUpctformaevalua.g:3405:2: 'answers'
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3414:1: rule__SingleAnswer__Group_4__1 : rule__SingleAnswer__Group_4__1__Impl rule__SingleAnswer__Group_4__2 ;
    public final void rule__SingleAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3418:1: ( rule__SingleAnswer__Group_4__1__Impl rule__SingleAnswer__Group_4__2 )
            // InternalUpctformaevalua.g:3419:2: rule__SingleAnswer__Group_4__1__Impl rule__SingleAnswer__Group_4__2
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
    // InternalUpctformaevalua.g:3426:1: rule__SingleAnswer__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SingleAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3430:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3431:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3431:1: ( '{' )
            // InternalUpctformaevalua.g:3432:2: '{'
            {
             before(grammarAccess.getSingleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3441:1: rule__SingleAnswer__Group_4__2 : rule__SingleAnswer__Group_4__2__Impl rule__SingleAnswer__Group_4__3 ;
    public final void rule__SingleAnswer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3445:1: ( rule__SingleAnswer__Group_4__2__Impl rule__SingleAnswer__Group_4__3 )
            // InternalUpctformaevalua.g:3446:2: rule__SingleAnswer__Group_4__2__Impl rule__SingleAnswer__Group_4__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:3453:1: rule__SingleAnswer__Group_4__2__Impl : ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) ) ;
    public final void rule__SingleAnswer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3457:1: ( ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) ) )
            // InternalUpctformaevalua.g:3458:1: ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) )
            {
            // InternalUpctformaevalua.g:3458:1: ( ( rule__SingleAnswer__AnswersAssignment_4_2 ) )
            // InternalUpctformaevalua.g:3459:2: ( rule__SingleAnswer__AnswersAssignment_4_2 )
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersAssignment_4_2()); 
            // InternalUpctformaevalua.g:3460:2: ( rule__SingleAnswer__AnswersAssignment_4_2 )
            // InternalUpctformaevalua.g:3460:3: rule__SingleAnswer__AnswersAssignment_4_2
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
    // InternalUpctformaevalua.g:3468:1: rule__SingleAnswer__Group_4__3 : rule__SingleAnswer__Group_4__3__Impl rule__SingleAnswer__Group_4__4 ;
    public final void rule__SingleAnswer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3472:1: ( rule__SingleAnswer__Group_4__3__Impl rule__SingleAnswer__Group_4__4 )
            // InternalUpctformaevalua.g:3473:2: rule__SingleAnswer__Group_4__3__Impl rule__SingleAnswer__Group_4__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:3480:1: rule__SingleAnswer__Group_4__3__Impl : ( ( rule__SingleAnswer__Group_4_3__0 )* ) ;
    public final void rule__SingleAnswer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3484:1: ( ( ( rule__SingleAnswer__Group_4_3__0 )* ) )
            // InternalUpctformaevalua.g:3485:1: ( ( rule__SingleAnswer__Group_4_3__0 )* )
            {
            // InternalUpctformaevalua.g:3485:1: ( ( rule__SingleAnswer__Group_4_3__0 )* )
            // InternalUpctformaevalua.g:3486:2: ( rule__SingleAnswer__Group_4_3__0 )*
            {
             before(grammarAccess.getSingleAnswerAccess().getGroup_4_3()); 
            // InternalUpctformaevalua.g:3487:2: ( rule__SingleAnswer__Group_4_3__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalUpctformaevalua.g:3487:3: rule__SingleAnswer__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SingleAnswer__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalUpctformaevalua.g:3495:1: rule__SingleAnswer__Group_4__4 : rule__SingleAnswer__Group_4__4__Impl ;
    public final void rule__SingleAnswer__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3499:1: ( rule__SingleAnswer__Group_4__4__Impl )
            // InternalUpctformaevalua.g:3500:2: rule__SingleAnswer__Group_4__4__Impl
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
    // InternalUpctformaevalua.g:3506:1: rule__SingleAnswer__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SingleAnswer__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3510:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3511:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3511:1: ( '}' )
            // InternalUpctformaevalua.g:3512:2: '}'
            {
             before(grammarAccess.getSingleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3522:1: rule__SingleAnswer__Group_4_3__0 : rule__SingleAnswer__Group_4_3__0__Impl rule__SingleAnswer__Group_4_3__1 ;
    public final void rule__SingleAnswer__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3526:1: ( rule__SingleAnswer__Group_4_3__0__Impl rule__SingleAnswer__Group_4_3__1 )
            // InternalUpctformaevalua.g:3527:2: rule__SingleAnswer__Group_4_3__0__Impl rule__SingleAnswer__Group_4_3__1
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
    // InternalUpctformaevalua.g:3534:1: rule__SingleAnswer__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__SingleAnswer__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3538:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:3539:1: ( ',' )
            {
            // InternalUpctformaevalua.g:3539:1: ( ',' )
            // InternalUpctformaevalua.g:3540:2: ','
            {
             before(grammarAccess.getSingleAnswerAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3549:1: rule__SingleAnswer__Group_4_3__1 : rule__SingleAnswer__Group_4_3__1__Impl ;
    public final void rule__SingleAnswer__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3553:1: ( rule__SingleAnswer__Group_4_3__1__Impl )
            // InternalUpctformaevalua.g:3554:2: rule__SingleAnswer__Group_4_3__1__Impl
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
    // InternalUpctformaevalua.g:3560:1: rule__SingleAnswer__Group_4_3__1__Impl : ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) ) ;
    public final void rule__SingleAnswer__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3564:1: ( ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) ) )
            // InternalUpctformaevalua.g:3565:1: ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) )
            {
            // InternalUpctformaevalua.g:3565:1: ( ( rule__SingleAnswer__AnswersAssignment_4_3_1 ) )
            // InternalUpctformaevalua.g:3566:2: ( rule__SingleAnswer__AnswersAssignment_4_3_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getAnswersAssignment_4_3_1()); 
            // InternalUpctformaevalua.g:3567:2: ( rule__SingleAnswer__AnswersAssignment_4_3_1 )
            // InternalUpctformaevalua.g:3567:3: rule__SingleAnswer__AnswersAssignment_4_3_1
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
    // InternalUpctformaevalua.g:3576:1: rule__SingleAnswer__Group_5__0 : rule__SingleAnswer__Group_5__0__Impl rule__SingleAnswer__Group_5__1 ;
    public final void rule__SingleAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3580:1: ( rule__SingleAnswer__Group_5__0__Impl rule__SingleAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:3581:2: rule__SingleAnswer__Group_5__0__Impl rule__SingleAnswer__Group_5__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalUpctformaevalua.g:3588:1: rule__SingleAnswer__Group_5__0__Impl : ( 'correct' ) ;
    public final void rule__SingleAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3592:1: ( ( 'correct' ) )
            // InternalUpctformaevalua.g:3593:1: ( 'correct' )
            {
            // InternalUpctformaevalua.g:3593:1: ( 'correct' )
            // InternalUpctformaevalua.g:3594:2: 'correct'
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3603:1: rule__SingleAnswer__Group_5__1 : rule__SingleAnswer__Group_5__1__Impl ;
    public final void rule__SingleAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3607:1: ( rule__SingleAnswer__Group_5__1__Impl )
            // InternalUpctformaevalua.g:3608:2: rule__SingleAnswer__Group_5__1__Impl
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
    // InternalUpctformaevalua.g:3614:1: rule__SingleAnswer__Group_5__1__Impl : ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) ) ;
    public final void rule__SingleAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3618:1: ( ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:3619:1: ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:3619:1: ( ( rule__SingleAnswer__CorrectanswerAssignment_5_1 ) )
            // InternalUpctformaevalua.g:3620:2: ( rule__SingleAnswer__CorrectanswerAssignment_5_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectanswerAssignment_5_1()); 
            // InternalUpctformaevalua.g:3621:2: ( rule__SingleAnswer__CorrectanswerAssignment_5_1 )
            // InternalUpctformaevalua.g:3621:3: rule__SingleAnswer__CorrectanswerAssignment_5_1
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
    // InternalUpctformaevalua.g:3630:1: rule__SingleAnswer__Group_6__0 : rule__SingleAnswer__Group_6__0__Impl rule__SingleAnswer__Group_6__1 ;
    public final void rule__SingleAnswer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3634:1: ( rule__SingleAnswer__Group_6__0__Impl rule__SingleAnswer__Group_6__1 )
            // InternalUpctformaevalua.g:3635:2: rule__SingleAnswer__Group_6__0__Impl rule__SingleAnswer__Group_6__1
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
    // InternalUpctformaevalua.g:3642:1: rule__SingleAnswer__Group_6__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__SingleAnswer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3646:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:3647:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:3647:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:3648:2: 'correctfeedback'
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3657:1: rule__SingleAnswer__Group_6__1 : rule__SingleAnswer__Group_6__1__Impl ;
    public final void rule__SingleAnswer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3661:1: ( rule__SingleAnswer__Group_6__1__Impl )
            // InternalUpctformaevalua.g:3662:2: rule__SingleAnswer__Group_6__1__Impl
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
    // InternalUpctformaevalua.g:3668:1: rule__SingleAnswer__Group_6__1__Impl : ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) ) ;
    public final void rule__SingleAnswer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3672:1: ( ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:3673:1: ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:3673:1: ( ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 ) )
            // InternalUpctformaevalua.g:3674:2: ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getCorrectfeedbackAssignment_6_1()); 
            // InternalUpctformaevalua.g:3675:2: ( rule__SingleAnswer__CorrectfeedbackAssignment_6_1 )
            // InternalUpctformaevalua.g:3675:3: rule__SingleAnswer__CorrectfeedbackAssignment_6_1
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
    // InternalUpctformaevalua.g:3684:1: rule__SingleAnswer__Group_7__0 : rule__SingleAnswer__Group_7__0__Impl rule__SingleAnswer__Group_7__1 ;
    public final void rule__SingleAnswer__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3688:1: ( rule__SingleAnswer__Group_7__0__Impl rule__SingleAnswer__Group_7__1 )
            // InternalUpctformaevalua.g:3689:2: rule__SingleAnswer__Group_7__0__Impl rule__SingleAnswer__Group_7__1
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
    // InternalUpctformaevalua.g:3696:1: rule__SingleAnswer__Group_7__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__SingleAnswer__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3700:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:3701:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:3701:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:3702:2: 'incorrectfeedback'
            {
             before(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackKeyword_7_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3711:1: rule__SingleAnswer__Group_7__1 : rule__SingleAnswer__Group_7__1__Impl ;
    public final void rule__SingleAnswer__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3715:1: ( rule__SingleAnswer__Group_7__1__Impl )
            // InternalUpctformaevalua.g:3716:2: rule__SingleAnswer__Group_7__1__Impl
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
    // InternalUpctformaevalua.g:3722:1: rule__SingleAnswer__Group_7__1__Impl : ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) ) ;
    public final void rule__SingleAnswer__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3726:1: ( ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) ) )
            // InternalUpctformaevalua.g:3727:1: ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) )
            {
            // InternalUpctformaevalua.g:3727:1: ( ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 ) )
            // InternalUpctformaevalua.g:3728:2: ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 )
            {
             before(grammarAccess.getSingleAnswerAccess().getIncorrectfeedbackAssignment_7_1()); 
            // InternalUpctformaevalua.g:3729:2: ( rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 )
            // InternalUpctformaevalua.g:3729:3: rule__SingleAnswer__IncorrectfeedbackAssignment_7_1
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
    // InternalUpctformaevalua.g:3738:1: rule__MultipleAnswer__Group__0 : rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1 ;
    public final void rule__MultipleAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3742:1: ( rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1 )
            // InternalUpctformaevalua.g:3743:2: rule__MultipleAnswer__Group__0__Impl rule__MultipleAnswer__Group__1
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
    // InternalUpctformaevalua.g:3750:1: rule__MultipleAnswer__Group__0__Impl : ( 'MultipleAnswer' ) ;
    public final void rule__MultipleAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3754:1: ( ( 'MultipleAnswer' ) )
            // InternalUpctformaevalua.g:3755:1: ( 'MultipleAnswer' )
            {
            // InternalUpctformaevalua.g:3755:1: ( 'MultipleAnswer' )
            // InternalUpctformaevalua.g:3756:2: 'MultipleAnswer'
            {
             before(grammarAccess.getMultipleAnswerAccess().getMultipleAnswerKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3765:1: rule__MultipleAnswer__Group__1 : rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2 ;
    public final void rule__MultipleAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3769:1: ( rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2 )
            // InternalUpctformaevalua.g:3770:2: rule__MultipleAnswer__Group__1__Impl rule__MultipleAnswer__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalUpctformaevalua.g:3777:1: rule__MultipleAnswer__Group__1__Impl : ( '{' ) ;
    public final void rule__MultipleAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3781:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3782:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3782:1: ( '{' )
            // InternalUpctformaevalua.g:3783:2: '{'
            {
             before(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3792:1: rule__MultipleAnswer__Group__2 : rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3 ;
    public final void rule__MultipleAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3796:1: ( rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3 )
            // InternalUpctformaevalua.g:3797:2: rule__MultipleAnswer__Group__2__Impl rule__MultipleAnswer__Group__3
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
    // InternalUpctformaevalua.g:3804:1: rule__MultipleAnswer__Group__2__Impl : ( 'statement' ) ;
    public final void rule__MultipleAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3808:1: ( ( 'statement' ) )
            // InternalUpctformaevalua.g:3809:1: ( 'statement' )
            {
            // InternalUpctformaevalua.g:3809:1: ( 'statement' )
            // InternalUpctformaevalua.g:3810:2: 'statement'
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3819:1: rule__MultipleAnswer__Group__3 : rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4 ;
    public final void rule__MultipleAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3823:1: ( rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4 )
            // InternalUpctformaevalua.g:3824:2: rule__MultipleAnswer__Group__3__Impl rule__MultipleAnswer__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctformaevalua.g:3831:1: rule__MultipleAnswer__Group__3__Impl : ( ( rule__MultipleAnswer__StatementsAssignment_3 ) ) ;
    public final void rule__MultipleAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3835:1: ( ( ( rule__MultipleAnswer__StatementsAssignment_3 ) ) )
            // InternalUpctformaevalua.g:3836:1: ( ( rule__MultipleAnswer__StatementsAssignment_3 ) )
            {
            // InternalUpctformaevalua.g:3836:1: ( ( rule__MultipleAnswer__StatementsAssignment_3 ) )
            // InternalUpctformaevalua.g:3837:2: ( rule__MultipleAnswer__StatementsAssignment_3 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getStatementsAssignment_3()); 
            // InternalUpctformaevalua.g:3838:2: ( rule__MultipleAnswer__StatementsAssignment_3 )
            // InternalUpctformaevalua.g:3838:3: rule__MultipleAnswer__StatementsAssignment_3
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
    // InternalUpctformaevalua.g:3846:1: rule__MultipleAnswer__Group__4 : rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5 ;
    public final void rule__MultipleAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3850:1: ( rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5 )
            // InternalUpctformaevalua.g:3851:2: rule__MultipleAnswer__Group__4__Impl rule__MultipleAnswer__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctformaevalua.g:3858:1: rule__MultipleAnswer__Group__4__Impl : ( ( rule__MultipleAnswer__Group_4__0 )? ) ;
    public final void rule__MultipleAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3862:1: ( ( ( rule__MultipleAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:3863:1: ( ( rule__MultipleAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:3863:1: ( ( rule__MultipleAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:3864:2: ( rule__MultipleAnswer__Group_4__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:3865:2: ( rule__MultipleAnswer__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctformaevalua.g:3865:3: rule__MultipleAnswer__Group_4__0
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
    // InternalUpctformaevalua.g:3873:1: rule__MultipleAnswer__Group__5 : rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6 ;
    public final void rule__MultipleAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3877:1: ( rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6 )
            // InternalUpctformaevalua.g:3878:2: rule__MultipleAnswer__Group__5__Impl rule__MultipleAnswer__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctformaevalua.g:3885:1: rule__MultipleAnswer__Group__5__Impl : ( ( rule__MultipleAnswer__Group_5__0 )? ) ;
    public final void rule__MultipleAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3889:1: ( ( ( rule__MultipleAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:3890:1: ( ( rule__MultipleAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:3890:1: ( ( rule__MultipleAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:3891:2: ( rule__MultipleAnswer__Group_5__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:3892:2: ( rule__MultipleAnswer__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctformaevalua.g:3892:3: rule__MultipleAnswer__Group_5__0
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
    // InternalUpctformaevalua.g:3900:1: rule__MultipleAnswer__Group__6 : rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7 ;
    public final void rule__MultipleAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3904:1: ( rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7 )
            // InternalUpctformaevalua.g:3905:2: rule__MultipleAnswer__Group__6__Impl rule__MultipleAnswer__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctformaevalua.g:3912:1: rule__MultipleAnswer__Group__6__Impl : ( ( rule__MultipleAnswer__Group_6__0 )? ) ;
    public final void rule__MultipleAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3916:1: ( ( ( rule__MultipleAnswer__Group_6__0 )? ) )
            // InternalUpctformaevalua.g:3917:1: ( ( rule__MultipleAnswer__Group_6__0 )? )
            {
            // InternalUpctformaevalua.g:3917:1: ( ( rule__MultipleAnswer__Group_6__0 )? )
            // InternalUpctformaevalua.g:3918:2: ( rule__MultipleAnswer__Group_6__0 )?
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_6()); 
            // InternalUpctformaevalua.g:3919:2: ( rule__MultipleAnswer__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctformaevalua.g:3919:3: rule__MultipleAnswer__Group_6__0
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
    // InternalUpctformaevalua.g:3927:1: rule__MultipleAnswer__Group__7 : rule__MultipleAnswer__Group__7__Impl ;
    public final void rule__MultipleAnswer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3931:1: ( rule__MultipleAnswer__Group__7__Impl )
            // InternalUpctformaevalua.g:3932:2: rule__MultipleAnswer__Group__7__Impl
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
    // InternalUpctformaevalua.g:3938:1: rule__MultipleAnswer__Group__7__Impl : ( '}' ) ;
    public final void rule__MultipleAnswer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3942:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:3943:1: ( '}' )
            {
            // InternalUpctformaevalua.g:3943:1: ( '}' )
            // InternalUpctformaevalua.g:3944:2: '}'
            {
             before(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3954:1: rule__MultipleAnswer__Group_4__0 : rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1 ;
    public final void rule__MultipleAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3958:1: ( rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:3959:2: rule__MultipleAnswer__Group_4__0__Impl rule__MultipleAnswer__Group_4__1
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
    // InternalUpctformaevalua.g:3966:1: rule__MultipleAnswer__Group_4__0__Impl : ( 'answers' ) ;
    public final void rule__MultipleAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3970:1: ( ( 'answers' ) )
            // InternalUpctformaevalua.g:3971:1: ( 'answers' )
            {
            // InternalUpctformaevalua.g:3971:1: ( 'answers' )
            // InternalUpctformaevalua.g:3972:2: 'answers'
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:3981:1: rule__MultipleAnswer__Group_4__1 : rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2 ;
    public final void rule__MultipleAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3985:1: ( rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2 )
            // InternalUpctformaevalua.g:3986:2: rule__MultipleAnswer__Group_4__1__Impl rule__MultipleAnswer__Group_4__2
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
    // InternalUpctformaevalua.g:3993:1: rule__MultipleAnswer__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MultipleAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:3997:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:3998:1: ( '{' )
            {
            // InternalUpctformaevalua.g:3998:1: ( '{' )
            // InternalUpctformaevalua.g:3999:2: '{'
            {
             before(grammarAccess.getMultipleAnswerAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4008:1: rule__MultipleAnswer__Group_4__2 : rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3 ;
    public final void rule__MultipleAnswer__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4012:1: ( rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3 )
            // InternalUpctformaevalua.g:4013:2: rule__MultipleAnswer__Group_4__2__Impl rule__MultipleAnswer__Group_4__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:4020:1: rule__MultipleAnswer__Group_4__2__Impl : ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) ) ;
    public final void rule__MultipleAnswer__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4024:1: ( ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) ) )
            // InternalUpctformaevalua.g:4025:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) )
            {
            // InternalUpctformaevalua.g:4025:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_2 ) )
            // InternalUpctformaevalua.g:4026:2: ( rule__MultipleAnswer__AnswersAssignment_4_2 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_2()); 
            // InternalUpctformaevalua.g:4027:2: ( rule__MultipleAnswer__AnswersAssignment_4_2 )
            // InternalUpctformaevalua.g:4027:3: rule__MultipleAnswer__AnswersAssignment_4_2
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
    // InternalUpctformaevalua.g:4035:1: rule__MultipleAnswer__Group_4__3 : rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4 ;
    public final void rule__MultipleAnswer__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4039:1: ( rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4 )
            // InternalUpctformaevalua.g:4040:2: rule__MultipleAnswer__Group_4__3__Impl rule__MultipleAnswer__Group_4__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:4047:1: rule__MultipleAnswer__Group_4__3__Impl : ( ( rule__MultipleAnswer__Group_4_3__0 )* ) ;
    public final void rule__MultipleAnswer__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4051:1: ( ( ( rule__MultipleAnswer__Group_4_3__0 )* ) )
            // InternalUpctformaevalua.g:4052:1: ( ( rule__MultipleAnswer__Group_4_3__0 )* )
            {
            // InternalUpctformaevalua.g:4052:1: ( ( rule__MultipleAnswer__Group_4_3__0 )* )
            // InternalUpctformaevalua.g:4053:2: ( rule__MultipleAnswer__Group_4_3__0 )*
            {
             before(grammarAccess.getMultipleAnswerAccess().getGroup_4_3()); 
            // InternalUpctformaevalua.g:4054:2: ( rule__MultipleAnswer__Group_4_3__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==28) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUpctformaevalua.g:4054:3: rule__MultipleAnswer__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MultipleAnswer__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalUpctformaevalua.g:4062:1: rule__MultipleAnswer__Group_4__4 : rule__MultipleAnswer__Group_4__4__Impl ;
    public final void rule__MultipleAnswer__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4066:1: ( rule__MultipleAnswer__Group_4__4__Impl )
            // InternalUpctformaevalua.g:4067:2: rule__MultipleAnswer__Group_4__4__Impl
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
    // InternalUpctformaevalua.g:4073:1: rule__MultipleAnswer__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MultipleAnswer__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4077:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4078:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4078:1: ( '}' )
            // InternalUpctformaevalua.g:4079:2: '}'
            {
             before(grammarAccess.getMultipleAnswerAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4089:1: rule__MultipleAnswer__Group_4_3__0 : rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1 ;
    public final void rule__MultipleAnswer__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4093:1: ( rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1 )
            // InternalUpctformaevalua.g:4094:2: rule__MultipleAnswer__Group_4_3__0__Impl rule__MultipleAnswer__Group_4_3__1
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
    // InternalUpctformaevalua.g:4101:1: rule__MultipleAnswer__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MultipleAnswer__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4105:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:4106:1: ( ',' )
            {
            // InternalUpctformaevalua.g:4106:1: ( ',' )
            // InternalUpctformaevalua.g:4107:2: ','
            {
             before(grammarAccess.getMultipleAnswerAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4116:1: rule__MultipleAnswer__Group_4_3__1 : rule__MultipleAnswer__Group_4_3__1__Impl ;
    public final void rule__MultipleAnswer__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4120:1: ( rule__MultipleAnswer__Group_4_3__1__Impl )
            // InternalUpctformaevalua.g:4121:2: rule__MultipleAnswer__Group_4_3__1__Impl
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
    // InternalUpctformaevalua.g:4127:1: rule__MultipleAnswer__Group_4_3__1__Impl : ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) ) ;
    public final void rule__MultipleAnswer__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4131:1: ( ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) ) )
            // InternalUpctformaevalua.g:4132:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) )
            {
            // InternalUpctformaevalua.g:4132:1: ( ( rule__MultipleAnswer__AnswersAssignment_4_3_1 ) )
            // InternalUpctformaevalua.g:4133:2: ( rule__MultipleAnswer__AnswersAssignment_4_3_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getAnswersAssignment_4_3_1()); 
            // InternalUpctformaevalua.g:4134:2: ( rule__MultipleAnswer__AnswersAssignment_4_3_1 )
            // InternalUpctformaevalua.g:4134:3: rule__MultipleAnswer__AnswersAssignment_4_3_1
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
    // InternalUpctformaevalua.g:4143:1: rule__MultipleAnswer__Group_5__0 : rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1 ;
    public final void rule__MultipleAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4147:1: ( rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:4148:2: rule__MultipleAnswer__Group_5__0__Impl rule__MultipleAnswer__Group_5__1
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
    // InternalUpctformaevalua.g:4155:1: rule__MultipleAnswer__Group_5__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__MultipleAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4159:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:4160:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:4160:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:4161:2: 'correctfeedback'
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4170:1: rule__MultipleAnswer__Group_5__1 : rule__MultipleAnswer__Group_5__1__Impl ;
    public final void rule__MultipleAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4174:1: ( rule__MultipleAnswer__Group_5__1__Impl )
            // InternalUpctformaevalua.g:4175:2: rule__MultipleAnswer__Group_5__1__Impl
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
    // InternalUpctformaevalua.g:4181:1: rule__MultipleAnswer__Group_5__1__Impl : ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) ) ;
    public final void rule__MultipleAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4185:1: ( ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:4186:1: ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:4186:1: ( ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 ) )
            // InternalUpctformaevalua.g:4187:2: ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getCorrectfeedbackAssignment_5_1()); 
            // InternalUpctformaevalua.g:4188:2: ( rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 )
            // InternalUpctformaevalua.g:4188:3: rule__MultipleAnswer__CorrectfeedbackAssignment_5_1
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
    // InternalUpctformaevalua.g:4197:1: rule__MultipleAnswer__Group_6__0 : rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1 ;
    public final void rule__MultipleAnswer__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4201:1: ( rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1 )
            // InternalUpctformaevalua.g:4202:2: rule__MultipleAnswer__Group_6__0__Impl rule__MultipleAnswer__Group_6__1
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
    // InternalUpctformaevalua.g:4209:1: rule__MultipleAnswer__Group_6__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__MultipleAnswer__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4213:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:4214:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:4214:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:4215:2: 'incorrectfeedback'
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4224:1: rule__MultipleAnswer__Group_6__1 : rule__MultipleAnswer__Group_6__1__Impl ;
    public final void rule__MultipleAnswer__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4228:1: ( rule__MultipleAnswer__Group_6__1__Impl )
            // InternalUpctformaevalua.g:4229:2: rule__MultipleAnswer__Group_6__1__Impl
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
    // InternalUpctformaevalua.g:4235:1: rule__MultipleAnswer__Group_6__1__Impl : ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) ) ;
    public final void rule__MultipleAnswer__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4239:1: ( ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) ) )
            // InternalUpctformaevalua.g:4240:1: ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) )
            {
            // InternalUpctformaevalua.g:4240:1: ( ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 ) )
            // InternalUpctformaevalua.g:4241:2: ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 )
            {
             before(grammarAccess.getMultipleAnswerAccess().getIncorrectfeedbackAssignment_6_1()); 
            // InternalUpctformaevalua.g:4242:2: ( rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 )
            // InternalUpctformaevalua.g:4242:3: rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1
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
    // InternalUpctformaevalua.g:4251:1: rule__FillingAnswer__Group__0 : rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1 ;
    public final void rule__FillingAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4255:1: ( rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1 )
            // InternalUpctformaevalua.g:4256:2: rule__FillingAnswer__Group__0__Impl rule__FillingAnswer__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUpctformaevalua.g:4263:1: rule__FillingAnswer__Group__0__Impl : ( () ) ;
    public final void rule__FillingAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4267:1: ( ( () ) )
            // InternalUpctformaevalua.g:4268:1: ( () )
            {
            // InternalUpctformaevalua.g:4268:1: ( () )
            // InternalUpctformaevalua.g:4269:2: ()
            {
             before(grammarAccess.getFillingAnswerAccess().getFillingAnswerAction_0()); 
            // InternalUpctformaevalua.g:4270:2: ()
            // InternalUpctformaevalua.g:4270:3: 
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
    // InternalUpctformaevalua.g:4278:1: rule__FillingAnswer__Group__1 : rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2 ;
    public final void rule__FillingAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4282:1: ( rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2 )
            // InternalUpctformaevalua.g:4283:2: rule__FillingAnswer__Group__1__Impl rule__FillingAnswer__Group__2
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
    // InternalUpctformaevalua.g:4290:1: rule__FillingAnswer__Group__1__Impl : ( 'FillingAnswer' ) ;
    public final void rule__FillingAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4294:1: ( ( 'FillingAnswer' ) )
            // InternalUpctformaevalua.g:4295:1: ( 'FillingAnswer' )
            {
            // InternalUpctformaevalua.g:4295:1: ( 'FillingAnswer' )
            // InternalUpctformaevalua.g:4296:2: 'FillingAnswer'
            {
             before(grammarAccess.getFillingAnswerAccess().getFillingAnswerKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4305:1: rule__FillingAnswer__Group__2 : rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3 ;
    public final void rule__FillingAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4309:1: ( rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3 )
            // InternalUpctformaevalua.g:4310:2: rule__FillingAnswer__Group__2__Impl rule__FillingAnswer__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalUpctformaevalua.g:4317:1: rule__FillingAnswer__Group__2__Impl : ( '{' ) ;
    public final void rule__FillingAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4321:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4322:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4322:1: ( '{' )
            // InternalUpctformaevalua.g:4323:2: '{'
            {
             before(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4332:1: rule__FillingAnswer__Group__3 : rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4 ;
    public final void rule__FillingAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4336:1: ( rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4 )
            // InternalUpctformaevalua.g:4337:2: rule__FillingAnswer__Group__3__Impl rule__FillingAnswer__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalUpctformaevalua.g:4344:1: rule__FillingAnswer__Group__3__Impl : ( ( rule__FillingAnswer__Group_3__0 )? ) ;
    public final void rule__FillingAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4348:1: ( ( ( rule__FillingAnswer__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:4349:1: ( ( rule__FillingAnswer__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:4349:1: ( ( rule__FillingAnswer__Group_3__0 )? )
            // InternalUpctformaevalua.g:4350:2: ( rule__FillingAnswer__Group_3__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:4351:2: ( rule__FillingAnswer__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctformaevalua.g:4351:3: rule__FillingAnswer__Group_3__0
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
    // InternalUpctformaevalua.g:4359:1: rule__FillingAnswer__Group__4 : rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5 ;
    public final void rule__FillingAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4363:1: ( rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5 )
            // InternalUpctformaevalua.g:4364:2: rule__FillingAnswer__Group__4__Impl rule__FillingAnswer__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalUpctformaevalua.g:4371:1: rule__FillingAnswer__Group__4__Impl : ( ( rule__FillingAnswer__Group_4__0 )? ) ;
    public final void rule__FillingAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4375:1: ( ( ( rule__FillingAnswer__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:4376:1: ( ( rule__FillingAnswer__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:4376:1: ( ( rule__FillingAnswer__Group_4__0 )? )
            // InternalUpctformaevalua.g:4377:2: ( rule__FillingAnswer__Group_4__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:4378:2: ( rule__FillingAnswer__Group_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctformaevalua.g:4378:3: rule__FillingAnswer__Group_4__0
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
    // InternalUpctformaevalua.g:4386:1: rule__FillingAnswer__Group__5 : rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6 ;
    public final void rule__FillingAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4390:1: ( rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6 )
            // InternalUpctformaevalua.g:4391:2: rule__FillingAnswer__Group__5__Impl rule__FillingAnswer__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalUpctformaevalua.g:4398:1: rule__FillingAnswer__Group__5__Impl : ( ( rule__FillingAnswer__Group_5__0 )? ) ;
    public final void rule__FillingAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4402:1: ( ( ( rule__FillingAnswer__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:4403:1: ( ( rule__FillingAnswer__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:4403:1: ( ( rule__FillingAnswer__Group_5__0 )? )
            // InternalUpctformaevalua.g:4404:2: ( rule__FillingAnswer__Group_5__0 )?
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:4405:2: ( rule__FillingAnswer__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctformaevalua.g:4405:3: rule__FillingAnswer__Group_5__0
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
    // InternalUpctformaevalua.g:4413:1: rule__FillingAnswer__Group__6 : rule__FillingAnswer__Group__6__Impl ;
    public final void rule__FillingAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4417:1: ( rule__FillingAnswer__Group__6__Impl )
            // InternalUpctformaevalua.g:4418:2: rule__FillingAnswer__Group__6__Impl
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
    // InternalUpctformaevalua.g:4424:1: rule__FillingAnswer__Group__6__Impl : ( '}' ) ;
    public final void rule__FillingAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4428:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4429:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4429:1: ( '}' )
            // InternalUpctformaevalua.g:4430:2: '}'
            {
             before(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4440:1: rule__FillingAnswer__Group_3__0 : rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1 ;
    public final void rule__FillingAnswer__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4444:1: ( rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1 )
            // InternalUpctformaevalua.g:4445:2: rule__FillingAnswer__Group_3__0__Impl rule__FillingAnswer__Group_3__1
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
    // InternalUpctformaevalua.g:4452:1: rule__FillingAnswer__Group_3__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__FillingAnswer__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4456:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:4457:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:4457:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:4458:2: 'correctfeedback'
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4467:1: rule__FillingAnswer__Group_3__1 : rule__FillingAnswer__Group_3__1__Impl ;
    public final void rule__FillingAnswer__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4471:1: ( rule__FillingAnswer__Group_3__1__Impl )
            // InternalUpctformaevalua.g:4472:2: rule__FillingAnswer__Group_3__1__Impl
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
    // InternalUpctformaevalua.g:4478:1: rule__FillingAnswer__Group_3__1__Impl : ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) ) ;
    public final void rule__FillingAnswer__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4482:1: ( ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:4483:1: ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:4483:1: ( ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 ) )
            // InternalUpctformaevalua.g:4484:2: ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getCorrectfeedbackAssignment_3_1()); 
            // InternalUpctformaevalua.g:4485:2: ( rule__FillingAnswer__CorrectfeedbackAssignment_3_1 )
            // InternalUpctformaevalua.g:4485:3: rule__FillingAnswer__CorrectfeedbackAssignment_3_1
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
    // InternalUpctformaevalua.g:4494:1: rule__FillingAnswer__Group_4__0 : rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1 ;
    public final void rule__FillingAnswer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4498:1: ( rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1 )
            // InternalUpctformaevalua.g:4499:2: rule__FillingAnswer__Group_4__0__Impl rule__FillingAnswer__Group_4__1
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
    // InternalUpctformaevalua.g:4506:1: rule__FillingAnswer__Group_4__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__FillingAnswer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4510:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:4511:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:4511:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:4512:2: 'incorrectfeedback'
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4521:1: rule__FillingAnswer__Group_4__1 : rule__FillingAnswer__Group_4__1__Impl ;
    public final void rule__FillingAnswer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4525:1: ( rule__FillingAnswer__Group_4__1__Impl )
            // InternalUpctformaevalua.g:4526:2: rule__FillingAnswer__Group_4__1__Impl
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
    // InternalUpctformaevalua.g:4532:1: rule__FillingAnswer__Group_4__1__Impl : ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__FillingAnswer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4536:1: ( ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:4537:1: ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:4537:1: ( ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:4538:2: ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getIncorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:4539:2: ( rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:4539:3: rule__FillingAnswer__IncorrectfeedbackAssignment_4_1
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
    // InternalUpctformaevalua.g:4548:1: rule__FillingAnswer__Group_5__0 : rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1 ;
    public final void rule__FillingAnswer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4552:1: ( rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1 )
            // InternalUpctformaevalua.g:4553:2: rule__FillingAnswer__Group_5__0__Impl rule__FillingAnswer__Group_5__1
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
    // InternalUpctformaevalua.g:4560:1: rule__FillingAnswer__Group_5__0__Impl : ( 'holes' ) ;
    public final void rule__FillingAnswer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4564:1: ( ( 'holes' ) )
            // InternalUpctformaevalua.g:4565:1: ( 'holes' )
            {
            // InternalUpctformaevalua.g:4565:1: ( 'holes' )
            // InternalUpctformaevalua.g:4566:2: 'holes'
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4575:1: rule__FillingAnswer__Group_5__1 : rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2 ;
    public final void rule__FillingAnswer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4579:1: ( rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2 )
            // InternalUpctformaevalua.g:4580:2: rule__FillingAnswer__Group_5__1__Impl rule__FillingAnswer__Group_5__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctformaevalua.g:4587:1: rule__FillingAnswer__Group_5__1__Impl : ( '{' ) ;
    public final void rule__FillingAnswer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4591:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4592:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4592:1: ( '{' )
            // InternalUpctformaevalua.g:4593:2: '{'
            {
             before(grammarAccess.getFillingAnswerAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4602:1: rule__FillingAnswer__Group_5__2 : rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3 ;
    public final void rule__FillingAnswer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4606:1: ( rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3 )
            // InternalUpctformaevalua.g:4607:2: rule__FillingAnswer__Group_5__2__Impl rule__FillingAnswer__Group_5__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:4614:1: rule__FillingAnswer__Group_5__2__Impl : ( ( rule__FillingAnswer__HolesAssignment_5_2 ) ) ;
    public final void rule__FillingAnswer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4618:1: ( ( ( rule__FillingAnswer__HolesAssignment_5_2 ) ) )
            // InternalUpctformaevalua.g:4619:1: ( ( rule__FillingAnswer__HolesAssignment_5_2 ) )
            {
            // InternalUpctformaevalua.g:4619:1: ( ( rule__FillingAnswer__HolesAssignment_5_2 ) )
            // InternalUpctformaevalua.g:4620:2: ( rule__FillingAnswer__HolesAssignment_5_2 )
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_2()); 
            // InternalUpctformaevalua.g:4621:2: ( rule__FillingAnswer__HolesAssignment_5_2 )
            // InternalUpctformaevalua.g:4621:3: rule__FillingAnswer__HolesAssignment_5_2
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
    // InternalUpctformaevalua.g:4629:1: rule__FillingAnswer__Group_5__3 : rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4 ;
    public final void rule__FillingAnswer__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4633:1: ( rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4 )
            // InternalUpctformaevalua.g:4634:2: rule__FillingAnswer__Group_5__3__Impl rule__FillingAnswer__Group_5__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:4641:1: rule__FillingAnswer__Group_5__3__Impl : ( ( rule__FillingAnswer__Group_5_3__0 )* ) ;
    public final void rule__FillingAnswer__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4645:1: ( ( ( rule__FillingAnswer__Group_5_3__0 )* ) )
            // InternalUpctformaevalua.g:4646:1: ( ( rule__FillingAnswer__Group_5_3__0 )* )
            {
            // InternalUpctformaevalua.g:4646:1: ( ( rule__FillingAnswer__Group_5_3__0 )* )
            // InternalUpctformaevalua.g:4647:2: ( rule__FillingAnswer__Group_5_3__0 )*
            {
             before(grammarAccess.getFillingAnswerAccess().getGroup_5_3()); 
            // InternalUpctformaevalua.g:4648:2: ( rule__FillingAnswer__Group_5_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==28) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUpctformaevalua.g:4648:3: rule__FillingAnswer__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FillingAnswer__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalUpctformaevalua.g:4656:1: rule__FillingAnswer__Group_5__4 : rule__FillingAnswer__Group_5__4__Impl ;
    public final void rule__FillingAnswer__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4660:1: ( rule__FillingAnswer__Group_5__4__Impl )
            // InternalUpctformaevalua.g:4661:2: rule__FillingAnswer__Group_5__4__Impl
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
    // InternalUpctformaevalua.g:4667:1: rule__FillingAnswer__Group_5__4__Impl : ( '}' ) ;
    public final void rule__FillingAnswer__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4671:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4672:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4672:1: ( '}' )
            // InternalUpctformaevalua.g:4673:2: '}'
            {
             before(grammarAccess.getFillingAnswerAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4683:1: rule__FillingAnswer__Group_5_3__0 : rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1 ;
    public final void rule__FillingAnswer__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4687:1: ( rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1 )
            // InternalUpctformaevalua.g:4688:2: rule__FillingAnswer__Group_5_3__0__Impl rule__FillingAnswer__Group_5_3__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctformaevalua.g:4695:1: rule__FillingAnswer__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__FillingAnswer__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4699:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:4700:1: ( ',' )
            {
            // InternalUpctformaevalua.g:4700:1: ( ',' )
            // InternalUpctformaevalua.g:4701:2: ','
            {
             before(grammarAccess.getFillingAnswerAccess().getCommaKeyword_5_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4710:1: rule__FillingAnswer__Group_5_3__1 : rule__FillingAnswer__Group_5_3__1__Impl ;
    public final void rule__FillingAnswer__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4714:1: ( rule__FillingAnswer__Group_5_3__1__Impl )
            // InternalUpctformaevalua.g:4715:2: rule__FillingAnswer__Group_5_3__1__Impl
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
    // InternalUpctformaevalua.g:4721:1: rule__FillingAnswer__Group_5_3__1__Impl : ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) ) ;
    public final void rule__FillingAnswer__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4725:1: ( ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) ) )
            // InternalUpctformaevalua.g:4726:1: ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) )
            {
            // InternalUpctformaevalua.g:4726:1: ( ( rule__FillingAnswer__HolesAssignment_5_3_1 ) )
            // InternalUpctformaevalua.g:4727:2: ( rule__FillingAnswer__HolesAssignment_5_3_1 )
            {
             before(grammarAccess.getFillingAnswerAccess().getHolesAssignment_5_3_1()); 
            // InternalUpctformaevalua.g:4728:2: ( rule__FillingAnswer__HolesAssignment_5_3_1 )
            // InternalUpctformaevalua.g:4728:3: rule__FillingAnswer__HolesAssignment_5_3_1
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
    // InternalUpctformaevalua.g:4737:1: rule__TrueOrFalse__Group__0 : rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1 ;
    public final void rule__TrueOrFalse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4741:1: ( rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1 )
            // InternalUpctformaevalua.g:4742:2: rule__TrueOrFalse__Group__0__Impl rule__TrueOrFalse__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalUpctformaevalua.g:4749:1: rule__TrueOrFalse__Group__0__Impl : ( () ) ;
    public final void rule__TrueOrFalse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4753:1: ( ( () ) )
            // InternalUpctformaevalua.g:4754:1: ( () )
            {
            // InternalUpctformaevalua.g:4754:1: ( () )
            // InternalUpctformaevalua.g:4755:2: ()
            {
             before(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseAction_0()); 
            // InternalUpctformaevalua.g:4756:2: ()
            // InternalUpctformaevalua.g:4756:3: 
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
    // InternalUpctformaevalua.g:4764:1: rule__TrueOrFalse__Group__1 : rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2 ;
    public final void rule__TrueOrFalse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4768:1: ( rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2 )
            // InternalUpctformaevalua.g:4769:2: rule__TrueOrFalse__Group__1__Impl rule__TrueOrFalse__Group__2
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
    // InternalUpctformaevalua.g:4776:1: rule__TrueOrFalse__Group__1__Impl : ( 'TrueOrFalse' ) ;
    public final void rule__TrueOrFalse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4780:1: ( ( 'TrueOrFalse' ) )
            // InternalUpctformaevalua.g:4781:1: ( 'TrueOrFalse' )
            {
            // InternalUpctformaevalua.g:4781:1: ( 'TrueOrFalse' )
            // InternalUpctformaevalua.g:4782:2: 'TrueOrFalse'
            {
             before(grammarAccess.getTrueOrFalseAccess().getTrueOrFalseKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4791:1: rule__TrueOrFalse__Group__2 : rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3 ;
    public final void rule__TrueOrFalse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4795:1: ( rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3 )
            // InternalUpctformaevalua.g:4796:2: rule__TrueOrFalse__Group__2__Impl rule__TrueOrFalse__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctformaevalua.g:4803:1: rule__TrueOrFalse__Group__2__Impl : ( '{' ) ;
    public final void rule__TrueOrFalse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4807:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4808:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4808:1: ( '{' )
            // InternalUpctformaevalua.g:4809:2: '{'
            {
             before(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4818:1: rule__TrueOrFalse__Group__3 : rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4 ;
    public final void rule__TrueOrFalse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4822:1: ( rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4 )
            // InternalUpctformaevalua.g:4823:2: rule__TrueOrFalse__Group__3__Impl rule__TrueOrFalse__Group__4
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctformaevalua.g:4830:1: rule__TrueOrFalse__Group__3__Impl : ( ( rule__TrueOrFalse__Group_3__0 )? ) ;
    public final void rule__TrueOrFalse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4834:1: ( ( ( rule__TrueOrFalse__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:4835:1: ( ( rule__TrueOrFalse__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:4835:1: ( ( rule__TrueOrFalse__Group_3__0 )? )
            // InternalUpctformaevalua.g:4836:2: ( rule__TrueOrFalse__Group_3__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:4837:2: ( rule__TrueOrFalse__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctformaevalua.g:4837:3: rule__TrueOrFalse__Group_3__0
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
    // InternalUpctformaevalua.g:4845:1: rule__TrueOrFalse__Group__4 : rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5 ;
    public final void rule__TrueOrFalse__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4849:1: ( rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5 )
            // InternalUpctformaevalua.g:4850:2: rule__TrueOrFalse__Group__4__Impl rule__TrueOrFalse__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctformaevalua.g:4857:1: rule__TrueOrFalse__Group__4__Impl : ( ( rule__TrueOrFalse__Group_4__0 )? ) ;
    public final void rule__TrueOrFalse__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4861:1: ( ( ( rule__TrueOrFalse__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:4862:1: ( ( rule__TrueOrFalse__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:4862:1: ( ( rule__TrueOrFalse__Group_4__0 )? )
            // InternalUpctformaevalua.g:4863:2: ( rule__TrueOrFalse__Group_4__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:4864:2: ( rule__TrueOrFalse__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUpctformaevalua.g:4864:3: rule__TrueOrFalse__Group_4__0
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
    // InternalUpctformaevalua.g:4872:1: rule__TrueOrFalse__Group__5 : rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6 ;
    public final void rule__TrueOrFalse__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4876:1: ( rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6 )
            // InternalUpctformaevalua.g:4877:2: rule__TrueOrFalse__Group__5__Impl rule__TrueOrFalse__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctformaevalua.g:4884:1: rule__TrueOrFalse__Group__5__Impl : ( ( rule__TrueOrFalse__Group_5__0 )? ) ;
    public final void rule__TrueOrFalse__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4888:1: ( ( ( rule__TrueOrFalse__Group_5__0 )? ) )
            // InternalUpctformaevalua.g:4889:1: ( ( rule__TrueOrFalse__Group_5__0 )? )
            {
            // InternalUpctformaevalua.g:4889:1: ( ( rule__TrueOrFalse__Group_5__0 )? )
            // InternalUpctformaevalua.g:4890:2: ( rule__TrueOrFalse__Group_5__0 )?
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_5()); 
            // InternalUpctformaevalua.g:4891:2: ( rule__TrueOrFalse__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctformaevalua.g:4891:3: rule__TrueOrFalse__Group_5__0
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
    // InternalUpctformaevalua.g:4899:1: rule__TrueOrFalse__Group__6 : rule__TrueOrFalse__Group__6__Impl ;
    public final void rule__TrueOrFalse__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4903:1: ( rule__TrueOrFalse__Group__6__Impl )
            // InternalUpctformaevalua.g:4904:2: rule__TrueOrFalse__Group__6__Impl
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
    // InternalUpctformaevalua.g:4910:1: rule__TrueOrFalse__Group__6__Impl : ( '}' ) ;
    public final void rule__TrueOrFalse__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4914:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:4915:1: ( '}' )
            {
            // InternalUpctformaevalua.g:4915:1: ( '}' )
            // InternalUpctformaevalua.g:4916:2: '}'
            {
             before(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4926:1: rule__TrueOrFalse__Group_3__0 : rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1 ;
    public final void rule__TrueOrFalse__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4930:1: ( rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1 )
            // InternalUpctformaevalua.g:4931:2: rule__TrueOrFalse__Group_3__0__Impl rule__TrueOrFalse__Group_3__1
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
    // InternalUpctformaevalua.g:4938:1: rule__TrueOrFalse__Group_3__0__Impl : ( 'assertions' ) ;
    public final void rule__TrueOrFalse__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4942:1: ( ( 'assertions' ) )
            // InternalUpctformaevalua.g:4943:1: ( 'assertions' )
            {
            // InternalUpctformaevalua.g:4943:1: ( 'assertions' )
            // InternalUpctformaevalua.g:4944:2: 'assertions'
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4953:1: rule__TrueOrFalse__Group_3__1 : rule__TrueOrFalse__Group_3__1__Impl rule__TrueOrFalse__Group_3__2 ;
    public final void rule__TrueOrFalse__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4957:1: ( rule__TrueOrFalse__Group_3__1__Impl rule__TrueOrFalse__Group_3__2 )
            // InternalUpctformaevalua.g:4958:2: rule__TrueOrFalse__Group_3__1__Impl rule__TrueOrFalse__Group_3__2
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
    // InternalUpctformaevalua.g:4965:1: rule__TrueOrFalse__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TrueOrFalse__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4969:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:4970:1: ( '{' )
            {
            // InternalUpctformaevalua.g:4970:1: ( '{' )
            // InternalUpctformaevalua.g:4971:2: '{'
            {
             before(grammarAccess.getTrueOrFalseAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:4980:1: rule__TrueOrFalse__Group_3__2 : rule__TrueOrFalse__Group_3__2__Impl rule__TrueOrFalse__Group_3__3 ;
    public final void rule__TrueOrFalse__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4984:1: ( rule__TrueOrFalse__Group_3__2__Impl rule__TrueOrFalse__Group_3__3 )
            // InternalUpctformaevalua.g:4985:2: rule__TrueOrFalse__Group_3__2__Impl rule__TrueOrFalse__Group_3__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:4992:1: rule__TrueOrFalse__Group_3__2__Impl : ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) ) ;
    public final void rule__TrueOrFalse__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:4996:1: ( ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) ) )
            // InternalUpctformaevalua.g:4997:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) )
            {
            // InternalUpctformaevalua.g:4997:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_2 ) )
            // InternalUpctformaevalua.g:4998:2: ( rule__TrueOrFalse__AssertionsAssignment_3_2 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_3_2()); 
            // InternalUpctformaevalua.g:4999:2: ( rule__TrueOrFalse__AssertionsAssignment_3_2 )
            // InternalUpctformaevalua.g:4999:3: rule__TrueOrFalse__AssertionsAssignment_3_2
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
    // InternalUpctformaevalua.g:5007:1: rule__TrueOrFalse__Group_3__3 : rule__TrueOrFalse__Group_3__3__Impl rule__TrueOrFalse__Group_3__4 ;
    public final void rule__TrueOrFalse__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5011:1: ( rule__TrueOrFalse__Group_3__3__Impl rule__TrueOrFalse__Group_3__4 )
            // InternalUpctformaevalua.g:5012:2: rule__TrueOrFalse__Group_3__3__Impl rule__TrueOrFalse__Group_3__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalUpctformaevalua.g:5019:1: rule__TrueOrFalse__Group_3__3__Impl : ( ( rule__TrueOrFalse__Group_3_3__0 )* ) ;
    public final void rule__TrueOrFalse__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5023:1: ( ( ( rule__TrueOrFalse__Group_3_3__0 )* ) )
            // InternalUpctformaevalua.g:5024:1: ( ( rule__TrueOrFalse__Group_3_3__0 )* )
            {
            // InternalUpctformaevalua.g:5024:1: ( ( rule__TrueOrFalse__Group_3_3__0 )* )
            // InternalUpctformaevalua.g:5025:2: ( rule__TrueOrFalse__Group_3_3__0 )*
            {
             before(grammarAccess.getTrueOrFalseAccess().getGroup_3_3()); 
            // InternalUpctformaevalua.g:5026:2: ( rule__TrueOrFalse__Group_3_3__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==28) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUpctformaevalua.g:5026:3: rule__TrueOrFalse__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TrueOrFalse__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalUpctformaevalua.g:5034:1: rule__TrueOrFalse__Group_3__4 : rule__TrueOrFalse__Group_3__4__Impl ;
    public final void rule__TrueOrFalse__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5038:1: ( rule__TrueOrFalse__Group_3__4__Impl )
            // InternalUpctformaevalua.g:5039:2: rule__TrueOrFalse__Group_3__4__Impl
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
    // InternalUpctformaevalua.g:5045:1: rule__TrueOrFalse__Group_3__4__Impl : ( '}' ) ;
    public final void rule__TrueOrFalse__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5049:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5050:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5050:1: ( '}' )
            // InternalUpctformaevalua.g:5051:2: '}'
            {
             before(grammarAccess.getTrueOrFalseAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5061:1: rule__TrueOrFalse__Group_3_3__0 : rule__TrueOrFalse__Group_3_3__0__Impl rule__TrueOrFalse__Group_3_3__1 ;
    public final void rule__TrueOrFalse__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5065:1: ( rule__TrueOrFalse__Group_3_3__0__Impl rule__TrueOrFalse__Group_3_3__1 )
            // InternalUpctformaevalua.g:5066:2: rule__TrueOrFalse__Group_3_3__0__Impl rule__TrueOrFalse__Group_3_3__1
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
    // InternalUpctformaevalua.g:5073:1: rule__TrueOrFalse__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__TrueOrFalse__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5077:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:5078:1: ( ',' )
            {
            // InternalUpctformaevalua.g:5078:1: ( ',' )
            // InternalUpctformaevalua.g:5079:2: ','
            {
             before(grammarAccess.getTrueOrFalseAccess().getCommaKeyword_3_3_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5088:1: rule__TrueOrFalse__Group_3_3__1 : rule__TrueOrFalse__Group_3_3__1__Impl ;
    public final void rule__TrueOrFalse__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5092:1: ( rule__TrueOrFalse__Group_3_3__1__Impl )
            // InternalUpctformaevalua.g:5093:2: rule__TrueOrFalse__Group_3_3__1__Impl
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
    // InternalUpctformaevalua.g:5099:1: rule__TrueOrFalse__Group_3_3__1__Impl : ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) ) ;
    public final void rule__TrueOrFalse__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5103:1: ( ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) ) )
            // InternalUpctformaevalua.g:5104:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) )
            {
            // InternalUpctformaevalua.g:5104:1: ( ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 ) )
            // InternalUpctformaevalua.g:5105:2: ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getAssertionsAssignment_3_3_1()); 
            // InternalUpctformaevalua.g:5106:2: ( rule__TrueOrFalse__AssertionsAssignment_3_3_1 )
            // InternalUpctformaevalua.g:5106:3: rule__TrueOrFalse__AssertionsAssignment_3_3_1
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
    // InternalUpctformaevalua.g:5115:1: rule__TrueOrFalse__Group_4__0 : rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1 ;
    public final void rule__TrueOrFalse__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5119:1: ( rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1 )
            // InternalUpctformaevalua.g:5120:2: rule__TrueOrFalse__Group_4__0__Impl rule__TrueOrFalse__Group_4__1
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
    // InternalUpctformaevalua.g:5127:1: rule__TrueOrFalse__Group_4__0__Impl : ( 'correctfeedback' ) ;
    public final void rule__TrueOrFalse__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5131:1: ( ( 'correctfeedback' ) )
            // InternalUpctformaevalua.g:5132:1: ( 'correctfeedback' )
            {
            // InternalUpctformaevalua.g:5132:1: ( 'correctfeedback' )
            // InternalUpctformaevalua.g:5133:2: 'correctfeedback'
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5142:1: rule__TrueOrFalse__Group_4__1 : rule__TrueOrFalse__Group_4__1__Impl ;
    public final void rule__TrueOrFalse__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5146:1: ( rule__TrueOrFalse__Group_4__1__Impl )
            // InternalUpctformaevalua.g:5147:2: rule__TrueOrFalse__Group_4__1__Impl
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
    // InternalUpctformaevalua.g:5153:1: rule__TrueOrFalse__Group_4__1__Impl : ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) ) ;
    public final void rule__TrueOrFalse__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5157:1: ( ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:5158:1: ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:5158:1: ( ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 ) )
            // InternalUpctformaevalua.g:5159:2: ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getCorrectfeedbackAssignment_4_1()); 
            // InternalUpctformaevalua.g:5160:2: ( rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 )
            // InternalUpctformaevalua.g:5160:3: rule__TrueOrFalse__CorrectfeedbackAssignment_4_1
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
    // InternalUpctformaevalua.g:5169:1: rule__TrueOrFalse__Group_5__0 : rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1 ;
    public final void rule__TrueOrFalse__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5173:1: ( rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1 )
            // InternalUpctformaevalua.g:5174:2: rule__TrueOrFalse__Group_5__0__Impl rule__TrueOrFalse__Group_5__1
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
    // InternalUpctformaevalua.g:5181:1: rule__TrueOrFalse__Group_5__0__Impl : ( 'incorrectfeedback' ) ;
    public final void rule__TrueOrFalse__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5185:1: ( ( 'incorrectfeedback' ) )
            // InternalUpctformaevalua.g:5186:1: ( 'incorrectfeedback' )
            {
            // InternalUpctformaevalua.g:5186:1: ( 'incorrectfeedback' )
            // InternalUpctformaevalua.g:5187:2: 'incorrectfeedback'
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5196:1: rule__TrueOrFalse__Group_5__1 : rule__TrueOrFalse__Group_5__1__Impl ;
    public final void rule__TrueOrFalse__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5200:1: ( rule__TrueOrFalse__Group_5__1__Impl )
            // InternalUpctformaevalua.g:5201:2: rule__TrueOrFalse__Group_5__1__Impl
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
    // InternalUpctformaevalua.g:5207:1: rule__TrueOrFalse__Group_5__1__Impl : ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) ) ;
    public final void rule__TrueOrFalse__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5211:1: ( ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) ) )
            // InternalUpctformaevalua.g:5212:1: ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) )
            {
            // InternalUpctformaevalua.g:5212:1: ( ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 ) )
            // InternalUpctformaevalua.g:5213:2: ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 )
            {
             before(grammarAccess.getTrueOrFalseAccess().getIncorrectfeedbackAssignment_5_1()); 
            // InternalUpctformaevalua.g:5214:2: ( rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 )
            // InternalUpctformaevalua.g:5214:3: rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1
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
    // InternalUpctformaevalua.g:5223:1: rule__Paragraph__Group__0 : rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 ;
    public final void rule__Paragraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5227:1: ( rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1 )
            // InternalUpctformaevalua.g:5228:2: rule__Paragraph__Group__0__Impl rule__Paragraph__Group__1
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
    // InternalUpctformaevalua.g:5235:1: rule__Paragraph__Group__0__Impl : ( () ) ;
    public final void rule__Paragraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5239:1: ( ( () ) )
            // InternalUpctformaevalua.g:5240:1: ( () )
            {
            // InternalUpctformaevalua.g:5240:1: ( () )
            // InternalUpctformaevalua.g:5241:2: ()
            {
             before(grammarAccess.getParagraphAccess().getParagraphAction_0()); 
            // InternalUpctformaevalua.g:5242:2: ()
            // InternalUpctformaevalua.g:5242:3: 
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
    // InternalUpctformaevalua.g:5250:1: rule__Paragraph__Group__1 : rule__Paragraph__Group__1__Impl ;
    public final void rule__Paragraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5254:1: ( rule__Paragraph__Group__1__Impl )
            // InternalUpctformaevalua.g:5255:2: rule__Paragraph__Group__1__Impl
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
    // InternalUpctformaevalua.g:5261:1: rule__Paragraph__Group__1__Impl : ( ( rule__Paragraph__TextAssignment_1 )? ) ;
    public final void rule__Paragraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5265:1: ( ( ( rule__Paragraph__TextAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5266:1: ( ( rule__Paragraph__TextAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5266:1: ( ( rule__Paragraph__TextAssignment_1 )? )
            // InternalUpctformaevalua.g:5267:2: ( rule__Paragraph__TextAssignment_1 )?
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment_1()); 
            // InternalUpctformaevalua.g:5268:2: ( rule__Paragraph__TextAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_ID)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctformaevalua.g:5268:3: rule__Paragraph__TextAssignment_1
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
    // InternalUpctformaevalua.g:5277:1: rule__Single__Group__0 : rule__Single__Group__0__Impl rule__Single__Group__1 ;
    public final void rule__Single__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5281:1: ( rule__Single__Group__0__Impl rule__Single__Group__1 )
            // InternalUpctformaevalua.g:5282:2: rule__Single__Group__0__Impl rule__Single__Group__1
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
    // InternalUpctformaevalua.g:5289:1: rule__Single__Group__0__Impl : ( () ) ;
    public final void rule__Single__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5293:1: ( ( () ) )
            // InternalUpctformaevalua.g:5294:1: ( () )
            {
            // InternalUpctformaevalua.g:5294:1: ( () )
            // InternalUpctformaevalua.g:5295:2: ()
            {
             before(grammarAccess.getSingleAccess().getSingleAction_0()); 
            // InternalUpctformaevalua.g:5296:2: ()
            // InternalUpctformaevalua.g:5296:3: 
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
    // InternalUpctformaevalua.g:5304:1: rule__Single__Group__1 : rule__Single__Group__1__Impl ;
    public final void rule__Single__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5308:1: ( rule__Single__Group__1__Impl )
            // InternalUpctformaevalua.g:5309:2: rule__Single__Group__1__Impl
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
    // InternalUpctformaevalua.g:5315:1: rule__Single__Group__1__Impl : ( ( rule__Single__TextAssignment_1 )? ) ;
    public final void rule__Single__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5319:1: ( ( ( rule__Single__TextAssignment_1 )? ) )
            // InternalUpctformaevalua.g:5320:1: ( ( rule__Single__TextAssignment_1 )? )
            {
            // InternalUpctformaevalua.g:5320:1: ( ( rule__Single__TextAssignment_1 )? )
            // InternalUpctformaevalua.g:5321:2: ( rule__Single__TextAssignment_1 )?
            {
             before(grammarAccess.getSingleAccess().getTextAssignment_1()); 
            // InternalUpctformaevalua.g:5322:2: ( rule__Single__TextAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_ID)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctformaevalua.g:5322:3: rule__Single__TextAssignment_1
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
    // InternalUpctformaevalua.g:5331:1: rule__Multiple__Group__0 : rule__Multiple__Group__0__Impl rule__Multiple__Group__1 ;
    public final void rule__Multiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5335:1: ( rule__Multiple__Group__0__Impl rule__Multiple__Group__1 )
            // InternalUpctformaevalua.g:5336:2: rule__Multiple__Group__0__Impl rule__Multiple__Group__1
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
    // InternalUpctformaevalua.g:5343:1: rule__Multiple__Group__0__Impl : ( () ) ;
    public final void rule__Multiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5347:1: ( ( () ) )
            // InternalUpctformaevalua.g:5348:1: ( () )
            {
            // InternalUpctformaevalua.g:5348:1: ( () )
            // InternalUpctformaevalua.g:5349:2: ()
            {
             before(grammarAccess.getMultipleAccess().getMultipleAction_0()); 
            // InternalUpctformaevalua.g:5350:2: ()
            // InternalUpctformaevalua.g:5350:3: 
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
    // InternalUpctformaevalua.g:5358:1: rule__Multiple__Group__1 : rule__Multiple__Group__1__Impl rule__Multiple__Group__2 ;
    public final void rule__Multiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5362:1: ( rule__Multiple__Group__1__Impl rule__Multiple__Group__2 )
            // InternalUpctformaevalua.g:5363:2: rule__Multiple__Group__1__Impl rule__Multiple__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctformaevalua.g:5370:1: rule__Multiple__Group__1__Impl : ( '{' ) ;
    public final void rule__Multiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5374:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5375:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5375:1: ( '{' )
            // InternalUpctformaevalua.g:5376:2: '{'
            {
             before(grammarAccess.getMultipleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5385:1: rule__Multiple__Group__2 : rule__Multiple__Group__2__Impl rule__Multiple__Group__3 ;
    public final void rule__Multiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5389:1: ( rule__Multiple__Group__2__Impl rule__Multiple__Group__3 )
            // InternalUpctformaevalua.g:5390:2: rule__Multiple__Group__2__Impl rule__Multiple__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctformaevalua.g:5397:1: rule__Multiple__Group__2__Impl : ( ( rule__Multiple__Group_2__0 )? ) ;
    public final void rule__Multiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5401:1: ( ( ( rule__Multiple__Group_2__0 )? ) )
            // InternalUpctformaevalua.g:5402:1: ( ( rule__Multiple__Group_2__0 )? )
            {
            // InternalUpctformaevalua.g:5402:1: ( ( rule__Multiple__Group_2__0 )? )
            // InternalUpctformaevalua.g:5403:2: ( rule__Multiple__Group_2__0 )?
            {
             before(grammarAccess.getMultipleAccess().getGroup_2()); 
            // InternalUpctformaevalua.g:5404:2: ( rule__Multiple__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_STRING && LA45_0<=RULE_ID)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctformaevalua.g:5404:3: rule__Multiple__Group_2__0
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
    // InternalUpctformaevalua.g:5412:1: rule__Multiple__Group__3 : rule__Multiple__Group__3__Impl rule__Multiple__Group__4 ;
    public final void rule__Multiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5416:1: ( rule__Multiple__Group__3__Impl rule__Multiple__Group__4 )
            // InternalUpctformaevalua.g:5417:2: rule__Multiple__Group__3__Impl rule__Multiple__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctformaevalua.g:5424:1: rule__Multiple__Group__3__Impl : ( ( rule__Multiple__ValueAssignment_3 )? ) ;
    public final void rule__Multiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5428:1: ( ( ( rule__Multiple__ValueAssignment_3 )? ) )
            // InternalUpctformaevalua.g:5429:1: ( ( rule__Multiple__ValueAssignment_3 )? )
            {
            // InternalUpctformaevalua.g:5429:1: ( ( rule__Multiple__ValueAssignment_3 )? )
            // InternalUpctformaevalua.g:5430:2: ( rule__Multiple__ValueAssignment_3 )?
            {
             before(grammarAccess.getMultipleAccess().getValueAssignment_3()); 
            // InternalUpctformaevalua.g:5431:2: ( rule__Multiple__ValueAssignment_3 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=11 && LA46_0<=12)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctformaevalua.g:5431:3: rule__Multiple__ValueAssignment_3
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
    // InternalUpctformaevalua.g:5439:1: rule__Multiple__Group__4 : rule__Multiple__Group__4__Impl ;
    public final void rule__Multiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5443:1: ( rule__Multiple__Group__4__Impl )
            // InternalUpctformaevalua.g:5444:2: rule__Multiple__Group__4__Impl
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
    // InternalUpctformaevalua.g:5450:1: rule__Multiple__Group__4__Impl : ( '}' ) ;
    public final void rule__Multiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5454:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5455:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5455:1: ( '}' )
            // InternalUpctformaevalua.g:5456:2: '}'
            {
             before(grammarAccess.getMultipleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5466:1: rule__Multiple__Group_2__0 : rule__Multiple__Group_2__0__Impl rule__Multiple__Group_2__1 ;
    public final void rule__Multiple__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5470:1: ( rule__Multiple__Group_2__0__Impl rule__Multiple__Group_2__1 )
            // InternalUpctformaevalua.g:5471:2: rule__Multiple__Group_2__0__Impl rule__Multiple__Group_2__1
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
    // InternalUpctformaevalua.g:5478:1: rule__Multiple__Group_2__0__Impl : ( ( rule__Multiple__TextAssignment_2_0 ) ) ;
    public final void rule__Multiple__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5482:1: ( ( ( rule__Multiple__TextAssignment_2_0 ) ) )
            // InternalUpctformaevalua.g:5483:1: ( ( rule__Multiple__TextAssignment_2_0 ) )
            {
            // InternalUpctformaevalua.g:5483:1: ( ( rule__Multiple__TextAssignment_2_0 ) )
            // InternalUpctformaevalua.g:5484:2: ( rule__Multiple__TextAssignment_2_0 )
            {
             before(grammarAccess.getMultipleAccess().getTextAssignment_2_0()); 
            // InternalUpctformaevalua.g:5485:2: ( rule__Multiple__TextAssignment_2_0 )
            // InternalUpctformaevalua.g:5485:3: rule__Multiple__TextAssignment_2_0
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
    // InternalUpctformaevalua.g:5493:1: rule__Multiple__Group_2__1 : rule__Multiple__Group_2__1__Impl ;
    public final void rule__Multiple__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5497:1: ( rule__Multiple__Group_2__1__Impl )
            // InternalUpctformaevalua.g:5498:2: rule__Multiple__Group_2__1__Impl
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
    // InternalUpctformaevalua.g:5504:1: rule__Multiple__Group_2__1__Impl : ( ',' ) ;
    public final void rule__Multiple__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5508:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:5509:1: ( ',' )
            {
            // InternalUpctformaevalua.g:5509:1: ( ',' )
            // InternalUpctformaevalua.g:5510:2: ','
            {
             before(grammarAccess.getMultipleAccess().getCommaKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5520:1: rule__Hole__Group__0 : rule__Hole__Group__0__Impl rule__Hole__Group__1 ;
    public final void rule__Hole__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5524:1: ( rule__Hole__Group__0__Impl rule__Hole__Group__1 )
            // InternalUpctformaevalua.g:5525:2: rule__Hole__Group__0__Impl rule__Hole__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctformaevalua.g:5532:1: rule__Hole__Group__0__Impl : ( () ) ;
    public final void rule__Hole__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5536:1: ( ( () ) )
            // InternalUpctformaevalua.g:5537:1: ( () )
            {
            // InternalUpctformaevalua.g:5537:1: ( () )
            // InternalUpctformaevalua.g:5538:2: ()
            {
             before(grammarAccess.getHoleAccess().getHoleAction_0()); 
            // InternalUpctformaevalua.g:5539:2: ()
            // InternalUpctformaevalua.g:5539:3: 
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
    // InternalUpctformaevalua.g:5547:1: rule__Hole__Group__1 : rule__Hole__Group__1__Impl rule__Hole__Group__2 ;
    public final void rule__Hole__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5551:1: ( rule__Hole__Group__1__Impl rule__Hole__Group__2 )
            // InternalUpctformaevalua.g:5552:2: rule__Hole__Group__1__Impl rule__Hole__Group__2
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
    // InternalUpctformaevalua.g:5559:1: rule__Hole__Group__1__Impl : ( 'Hole' ) ;
    public final void rule__Hole__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5563:1: ( ( 'Hole' ) )
            // InternalUpctformaevalua.g:5564:1: ( 'Hole' )
            {
            // InternalUpctformaevalua.g:5564:1: ( 'Hole' )
            // InternalUpctformaevalua.g:5565:2: 'Hole'
            {
             before(grammarAccess.getHoleAccess().getHoleKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5574:1: rule__Hole__Group__2 : rule__Hole__Group__2__Impl rule__Hole__Group__3 ;
    public final void rule__Hole__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5578:1: ( rule__Hole__Group__2__Impl rule__Hole__Group__3 )
            // InternalUpctformaevalua.g:5579:2: rule__Hole__Group__2__Impl rule__Hole__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctformaevalua.g:5586:1: rule__Hole__Group__2__Impl : ( '{' ) ;
    public final void rule__Hole__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5590:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5591:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5591:1: ( '{' )
            // InternalUpctformaevalua.g:5592:2: '{'
            {
             before(grammarAccess.getHoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5601:1: rule__Hole__Group__3 : rule__Hole__Group__3__Impl rule__Hole__Group__4 ;
    public final void rule__Hole__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5605:1: ( rule__Hole__Group__3__Impl rule__Hole__Group__4 )
            // InternalUpctformaevalua.g:5606:2: rule__Hole__Group__3__Impl rule__Hole__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctformaevalua.g:5613:1: rule__Hole__Group__3__Impl : ( ( rule__Hole__Group_3__0 )? ) ;
    public final void rule__Hole__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5617:1: ( ( ( rule__Hole__Group_3__0 )? ) )
            // InternalUpctformaevalua.g:5618:1: ( ( rule__Hole__Group_3__0 )? )
            {
            // InternalUpctformaevalua.g:5618:1: ( ( rule__Hole__Group_3__0 )? )
            // InternalUpctformaevalua.g:5619:2: ( rule__Hole__Group_3__0 )?
            {
             before(grammarAccess.getHoleAccess().getGroup_3()); 
            // InternalUpctformaevalua.g:5620:2: ( rule__Hole__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctformaevalua.g:5620:3: rule__Hole__Group_3__0
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
    // InternalUpctformaevalua.g:5628:1: rule__Hole__Group__4 : rule__Hole__Group__4__Impl rule__Hole__Group__5 ;
    public final void rule__Hole__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5632:1: ( rule__Hole__Group__4__Impl rule__Hole__Group__5 )
            // InternalUpctformaevalua.g:5633:2: rule__Hole__Group__4__Impl rule__Hole__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctformaevalua.g:5640:1: rule__Hole__Group__4__Impl : ( ( rule__Hole__Group_4__0 )? ) ;
    public final void rule__Hole__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5644:1: ( ( ( rule__Hole__Group_4__0 )? ) )
            // InternalUpctformaevalua.g:5645:1: ( ( rule__Hole__Group_4__0 )? )
            {
            // InternalUpctformaevalua.g:5645:1: ( ( rule__Hole__Group_4__0 )? )
            // InternalUpctformaevalua.g:5646:2: ( rule__Hole__Group_4__0 )?
            {
             before(grammarAccess.getHoleAccess().getGroup_4()); 
            // InternalUpctformaevalua.g:5647:2: ( rule__Hole__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==52) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctformaevalua.g:5647:3: rule__Hole__Group_4__0
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
    // InternalUpctformaevalua.g:5655:1: rule__Hole__Group__5 : rule__Hole__Group__5__Impl ;
    public final void rule__Hole__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5659:1: ( rule__Hole__Group__5__Impl )
            // InternalUpctformaevalua.g:5660:2: rule__Hole__Group__5__Impl
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
    // InternalUpctformaevalua.g:5666:1: rule__Hole__Group__5__Impl : ( '}' ) ;
    public final void rule__Hole__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5670:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5671:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5671:1: ( '}' )
            // InternalUpctformaevalua.g:5672:2: '}'
            {
             before(grammarAccess.getHoleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5682:1: rule__Hole__Group_3__0 : rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1 ;
    public final void rule__Hole__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5686:1: ( rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1 )
            // InternalUpctformaevalua.g:5687:2: rule__Hole__Group_3__0__Impl rule__Hole__Group_3__1
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
    // InternalUpctformaevalua.g:5694:1: rule__Hole__Group_3__0__Impl : ( 'text' ) ;
    public final void rule__Hole__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5698:1: ( ( 'text' ) )
            // InternalUpctformaevalua.g:5699:1: ( 'text' )
            {
            // InternalUpctformaevalua.g:5699:1: ( 'text' )
            // InternalUpctformaevalua.g:5700:2: 'text'
            {
             before(grammarAccess.getHoleAccess().getTextKeyword_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5709:1: rule__Hole__Group_3__1 : rule__Hole__Group_3__1__Impl ;
    public final void rule__Hole__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5713:1: ( rule__Hole__Group_3__1__Impl )
            // InternalUpctformaevalua.g:5714:2: rule__Hole__Group_3__1__Impl
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
    // InternalUpctformaevalua.g:5720:1: rule__Hole__Group_3__1__Impl : ( ( rule__Hole__TextAssignment_3_1 ) ) ;
    public final void rule__Hole__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5724:1: ( ( ( rule__Hole__TextAssignment_3_1 ) ) )
            // InternalUpctformaevalua.g:5725:1: ( ( rule__Hole__TextAssignment_3_1 ) )
            {
            // InternalUpctformaevalua.g:5725:1: ( ( rule__Hole__TextAssignment_3_1 ) )
            // InternalUpctformaevalua.g:5726:2: ( rule__Hole__TextAssignment_3_1 )
            {
             before(grammarAccess.getHoleAccess().getTextAssignment_3_1()); 
            // InternalUpctformaevalua.g:5727:2: ( rule__Hole__TextAssignment_3_1 )
            // InternalUpctformaevalua.g:5727:3: rule__Hole__TextAssignment_3_1
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
    // InternalUpctformaevalua.g:5736:1: rule__Hole__Group_4__0 : rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1 ;
    public final void rule__Hole__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5740:1: ( rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1 )
            // InternalUpctformaevalua.g:5741:2: rule__Hole__Group_4__0__Impl rule__Hole__Group_4__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalUpctformaevalua.g:5748:1: rule__Hole__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Hole__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5752:1: ( ( 'type' ) )
            // InternalUpctformaevalua.g:5753:1: ( 'type' )
            {
            // InternalUpctformaevalua.g:5753:1: ( 'type' )
            // InternalUpctformaevalua.g:5754:2: 'type'
            {
             before(grammarAccess.getHoleAccess().getTypeKeyword_4_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5763:1: rule__Hole__Group_4__1 : rule__Hole__Group_4__1__Impl ;
    public final void rule__Hole__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5767:1: ( rule__Hole__Group_4__1__Impl )
            // InternalUpctformaevalua.g:5768:2: rule__Hole__Group_4__1__Impl
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
    // InternalUpctformaevalua.g:5774:1: rule__Hole__Group_4__1__Impl : ( ( rule__Hole__TypeAssignment_4_1 ) ) ;
    public final void rule__Hole__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5778:1: ( ( ( rule__Hole__TypeAssignment_4_1 ) ) )
            // InternalUpctformaevalua.g:5779:1: ( ( rule__Hole__TypeAssignment_4_1 ) )
            {
            // InternalUpctformaevalua.g:5779:1: ( ( rule__Hole__TypeAssignment_4_1 ) )
            // InternalUpctformaevalua.g:5780:2: ( rule__Hole__TypeAssignment_4_1 )
            {
             before(grammarAccess.getHoleAccess().getTypeAssignment_4_1()); 
            // InternalUpctformaevalua.g:5781:2: ( rule__Hole__TypeAssignment_4_1 )
            // InternalUpctformaevalua.g:5781:3: rule__Hole__TypeAssignment_4_1
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
    // InternalUpctformaevalua.g:5790:1: rule__Assertion__Group__0 : rule__Assertion__Group__0__Impl rule__Assertion__Group__1 ;
    public final void rule__Assertion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5794:1: ( rule__Assertion__Group__0__Impl rule__Assertion__Group__1 )
            // InternalUpctformaevalua.g:5795:2: rule__Assertion__Group__0__Impl rule__Assertion__Group__1
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
    // InternalUpctformaevalua.g:5802:1: rule__Assertion__Group__0__Impl : ( () ) ;
    public final void rule__Assertion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5806:1: ( ( () ) )
            // InternalUpctformaevalua.g:5807:1: ( () )
            {
            // InternalUpctformaevalua.g:5807:1: ( () )
            // InternalUpctformaevalua.g:5808:2: ()
            {
             before(grammarAccess.getAssertionAccess().getAssertionAction_0()); 
            // InternalUpctformaevalua.g:5809:2: ()
            // InternalUpctformaevalua.g:5809:3: 
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
    // InternalUpctformaevalua.g:5817:1: rule__Assertion__Group__1 : rule__Assertion__Group__1__Impl rule__Assertion__Group__2 ;
    public final void rule__Assertion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5821:1: ( rule__Assertion__Group__1__Impl rule__Assertion__Group__2 )
            // InternalUpctformaevalua.g:5822:2: rule__Assertion__Group__1__Impl rule__Assertion__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctformaevalua.g:5829:1: rule__Assertion__Group__1__Impl : ( '{' ) ;
    public final void rule__Assertion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5833:1: ( ( '{' ) )
            // InternalUpctformaevalua.g:5834:1: ( '{' )
            {
            // InternalUpctformaevalua.g:5834:1: ( '{' )
            // InternalUpctformaevalua.g:5835:2: '{'
            {
             before(grammarAccess.getAssertionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5844:1: rule__Assertion__Group__2 : rule__Assertion__Group__2__Impl rule__Assertion__Group__3 ;
    public final void rule__Assertion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5848:1: ( rule__Assertion__Group__2__Impl rule__Assertion__Group__3 )
            // InternalUpctformaevalua.g:5849:2: rule__Assertion__Group__2__Impl rule__Assertion__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctformaevalua.g:5856:1: rule__Assertion__Group__2__Impl : ( ( rule__Assertion__Group_2__0 )? ) ;
    public final void rule__Assertion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5860:1: ( ( ( rule__Assertion__Group_2__0 )? ) )
            // InternalUpctformaevalua.g:5861:1: ( ( rule__Assertion__Group_2__0 )? )
            {
            // InternalUpctformaevalua.g:5861:1: ( ( rule__Assertion__Group_2__0 )? )
            // InternalUpctformaevalua.g:5862:2: ( rule__Assertion__Group_2__0 )?
            {
             before(grammarAccess.getAssertionAccess().getGroup_2()); 
            // InternalUpctformaevalua.g:5863:2: ( rule__Assertion__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_ID)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUpctformaevalua.g:5863:3: rule__Assertion__Group_2__0
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
    // InternalUpctformaevalua.g:5871:1: rule__Assertion__Group__3 : rule__Assertion__Group__3__Impl rule__Assertion__Group__4 ;
    public final void rule__Assertion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5875:1: ( rule__Assertion__Group__3__Impl rule__Assertion__Group__4 )
            // InternalUpctformaevalua.g:5876:2: rule__Assertion__Group__3__Impl rule__Assertion__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctformaevalua.g:5883:1: rule__Assertion__Group__3__Impl : ( ( rule__Assertion__ValueAssignment_3 )? ) ;
    public final void rule__Assertion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5887:1: ( ( ( rule__Assertion__ValueAssignment_3 )? ) )
            // InternalUpctformaevalua.g:5888:1: ( ( rule__Assertion__ValueAssignment_3 )? )
            {
            // InternalUpctformaevalua.g:5888:1: ( ( rule__Assertion__ValueAssignment_3 )? )
            // InternalUpctformaevalua.g:5889:2: ( rule__Assertion__ValueAssignment_3 )?
            {
             before(grammarAccess.getAssertionAccess().getValueAssignment_3()); 
            // InternalUpctformaevalua.g:5890:2: ( rule__Assertion__ValueAssignment_3 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=11 && LA50_0<=12)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUpctformaevalua.g:5890:3: rule__Assertion__ValueAssignment_3
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
    // InternalUpctformaevalua.g:5898:1: rule__Assertion__Group__4 : rule__Assertion__Group__4__Impl ;
    public final void rule__Assertion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5902:1: ( rule__Assertion__Group__4__Impl )
            // InternalUpctformaevalua.g:5903:2: rule__Assertion__Group__4__Impl
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
    // InternalUpctformaevalua.g:5909:1: rule__Assertion__Group__4__Impl : ( '}' ) ;
    public final void rule__Assertion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5913:1: ( ( '}' ) )
            // InternalUpctformaevalua.g:5914:1: ( '}' )
            {
            // InternalUpctformaevalua.g:5914:1: ( '}' )
            // InternalUpctformaevalua.g:5915:2: '}'
            {
             before(grammarAccess.getAssertionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5925:1: rule__Assertion__Group_2__0 : rule__Assertion__Group_2__0__Impl rule__Assertion__Group_2__1 ;
    public final void rule__Assertion__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5929:1: ( rule__Assertion__Group_2__0__Impl rule__Assertion__Group_2__1 )
            // InternalUpctformaevalua.g:5930:2: rule__Assertion__Group_2__0__Impl rule__Assertion__Group_2__1
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
    // InternalUpctformaevalua.g:5937:1: rule__Assertion__Group_2__0__Impl : ( ( rule__Assertion__TextAssignment_2_0 ) ) ;
    public final void rule__Assertion__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5941:1: ( ( ( rule__Assertion__TextAssignment_2_0 ) ) )
            // InternalUpctformaevalua.g:5942:1: ( ( rule__Assertion__TextAssignment_2_0 ) )
            {
            // InternalUpctformaevalua.g:5942:1: ( ( rule__Assertion__TextAssignment_2_0 ) )
            // InternalUpctformaevalua.g:5943:2: ( rule__Assertion__TextAssignment_2_0 )
            {
             before(grammarAccess.getAssertionAccess().getTextAssignment_2_0()); 
            // InternalUpctformaevalua.g:5944:2: ( rule__Assertion__TextAssignment_2_0 )
            // InternalUpctformaevalua.g:5944:3: rule__Assertion__TextAssignment_2_0
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
    // InternalUpctformaevalua.g:5952:1: rule__Assertion__Group_2__1 : rule__Assertion__Group_2__1__Impl ;
    public final void rule__Assertion__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5956:1: ( rule__Assertion__Group_2__1__Impl )
            // InternalUpctformaevalua.g:5957:2: rule__Assertion__Group_2__1__Impl
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
    // InternalUpctformaevalua.g:5963:1: rule__Assertion__Group_2__1__Impl : ( ',' ) ;
    public final void rule__Assertion__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5967:1: ( ( ',' ) )
            // InternalUpctformaevalua.g:5968:1: ( ',' )
            {
            // InternalUpctformaevalua.g:5968:1: ( ',' )
            // InternalUpctformaevalua.g:5969:2: ','
            {
             before(grammarAccess.getAssertionAccess().getCommaKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctformaevalua.g:5979:1: rule__Evaluation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Evaluation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5983:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:5984:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:5984:2: ( ruleEString )
            // InternalUpctformaevalua.g:5985:3: ruleEString
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
    // InternalUpctformaevalua.g:5994:1: rule__Evaluation__NameAssignment_4_1 : ( ruleQualifiedName ) ;
    public final void rule__Evaluation__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:5998:1: ( ( ruleQualifiedName ) )
            // InternalUpctformaevalua.g:5999:2: ( ruleQualifiedName )
            {
            // InternalUpctformaevalua.g:5999:2: ( ruleQualifiedName )
            // InternalUpctformaevalua.g:6000:3: ruleQualifiedName
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
    // InternalUpctformaevalua.g:6009:1: rule__Evaluation__UnitsAssignment_5_0 : ( ruleEvaluationUnit ) ;
    public final void rule__Evaluation__UnitsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6013:1: ( ( ruleEvaluationUnit ) )
            // InternalUpctformaevalua.g:6014:2: ( ruleEvaluationUnit )
            {
            // InternalUpctformaevalua.g:6014:2: ( ruleEvaluationUnit )
            // InternalUpctformaevalua.g:6015:3: ruleEvaluationUnit
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
    // InternalUpctformaevalua.g:6024:1: rule__Evaluation__UnitsAssignment_5_1_1 : ( ruleEvaluationUnit ) ;
    public final void rule__Evaluation__UnitsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6028:1: ( ( ruleEvaluationUnit ) )
            // InternalUpctformaevalua.g:6029:2: ( ruleEvaluationUnit )
            {
            // InternalUpctformaevalua.g:6029:2: ( ruleEvaluationUnit )
            // InternalUpctformaevalua.g:6030:3: ruleEvaluationUnit
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
    // InternalUpctformaevalua.g:6039:1: rule__EvaluationUnit_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__EvaluationUnit_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6043:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6044:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6044:2: ( ruleEString )
            // InternalUpctformaevalua.g:6045:3: ruleEString
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


    // $ANTLR start "rule__EvaluationUnit_Impl__LanguageAssignment_3"
    // InternalUpctformaevalua.g:6054:1: rule__EvaluationUnit_Impl__LanguageAssignment_3 : ( ruleEvaluationLanguageType ) ;
    public final void rule__EvaluationUnit_Impl__LanguageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6058:1: ( ( ruleEvaluationLanguageType ) )
            // InternalUpctformaevalua.g:6059:2: ( ruleEvaluationLanguageType )
            {
            // InternalUpctformaevalua.g:6059:2: ( ruleEvaluationLanguageType )
            // InternalUpctformaevalua.g:6060:3: ruleEvaluationLanguageType
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getLanguageEvaluationLanguageTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationLanguageType();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getLanguageEvaluationLanguageTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__LanguageAssignment_3"


    // $ANTLR start "rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1"
    // InternalUpctformaevalua.g:6069:1: rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6073:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6074:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6074:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6075:3: ruleEInt
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getNumberquestionsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__NumberquestionsAssignment_5_1"


    // $ANTLR start "rule__EvaluationUnit_Impl__QuestionsAssignment_6_2"
    // InternalUpctformaevalua.g:6084:1: rule__EvaluationUnit_Impl__QuestionsAssignment_6_2 : ( ruleQuestion ) ;
    public final void rule__EvaluationUnit_Impl__QuestionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6088:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6089:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6089:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6090:3: ruleQuestion
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__QuestionsAssignment_6_2"


    // $ANTLR start "rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1"
    // InternalUpctformaevalua.g:6099:1: rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1 : ( ruleQuestion ) ;
    public final void rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6103:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6104:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6104:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6105:3: ruleQuestion
            {
             before(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getEvaluationUnit_ImplAccess().getQuestionsQuestionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EvaluationUnit_Impl__QuestionsAssignment_6_3_1"


    // $ANTLR start "rule__Question_Impl__CorrectfeedbackAssignment_3_1"
    // InternalUpctformaevalua.g:6114:1: rule__Question_Impl__CorrectfeedbackAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__CorrectfeedbackAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6118:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6119:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6119:2: ( ruleEString )
            // InternalUpctformaevalua.g:6120:3: ruleEString
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
    // InternalUpctformaevalua.g:6129:1: rule__Question_Impl__IncorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Question_Impl__IncorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6133:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6134:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6134:2: ( ruleEString )
            // InternalUpctformaevalua.g:6135:3: ruleEString
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
    // InternalUpctformaevalua.g:6144:1: rule__Training__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Training__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6148:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6149:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6149:2: ( ruleEString )
            // InternalUpctformaevalua.g:6150:3: ruleEString
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


    // $ANTLR start "rule__Training__LanguageAssignment_3"
    // InternalUpctformaevalua.g:6159:1: rule__Training__LanguageAssignment_3 : ( ruleEvaluationLanguageType ) ;
    public final void rule__Training__LanguageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6163:1: ( ( ruleEvaluationLanguageType ) )
            // InternalUpctformaevalua.g:6164:2: ( ruleEvaluationLanguageType )
            {
            // InternalUpctformaevalua.g:6164:2: ( ruleEvaluationLanguageType )
            // InternalUpctformaevalua.g:6165:3: ruleEvaluationLanguageType
            {
             before(grammarAccess.getTrainingAccess().getLanguageEvaluationLanguageTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationLanguageType();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getLanguageEvaluationLanguageTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__LanguageAssignment_3"


    // $ANTLR start "rule__Training__NumberquestionsAssignment_5_1"
    // InternalUpctformaevalua.g:6174:1: rule__Training__NumberquestionsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Training__NumberquestionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6178:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6179:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6179:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6180:3: ruleEInt
            {
             before(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getNumberquestionsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__NumberquestionsAssignment_5_1"


    // $ANTLR start "rule__Training__AttemptsAssignment_6_1"
    // InternalUpctformaevalua.g:6189:1: rule__Training__AttemptsAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Training__AttemptsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6193:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6194:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6194:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6195:3: ruleEInt
            {
             before(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getAttemptsEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__AttemptsAssignment_6_1"


    // $ANTLR start "rule__Training__GradeAssignment_7_1"
    // InternalUpctformaevalua.g:6204:1: rule__Training__GradeAssignment_7_1 : ( ruleTypeGrade ) ;
    public final void rule__Training__GradeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6208:1: ( ( ruleTypeGrade ) )
            // InternalUpctformaevalua.g:6209:2: ( ruleTypeGrade )
            {
            // InternalUpctformaevalua.g:6209:2: ( ruleTypeGrade )
            // InternalUpctformaevalua.g:6210:3: ruleTypeGrade
            {
             before(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeGrade();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getGradeTypeGradeEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__GradeAssignment_7_1"


    // $ANTLR start "rule__Training__QuestionsAssignment_8_2"
    // InternalUpctformaevalua.g:6219:1: rule__Training__QuestionsAssignment_8_2 : ( ruleQuestion ) ;
    public final void rule__Training__QuestionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6223:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6224:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6224:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6225:3: ruleQuestion
            {
             before(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__QuestionsAssignment_8_2"


    // $ANTLR start "rule__Training__QuestionsAssignment_8_3_1"
    // InternalUpctformaevalua.g:6234:1: rule__Training__QuestionsAssignment_8_3_1 : ( ruleQuestion ) ;
    public final void rule__Training__QuestionsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6238:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6239:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6239:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6240:3: ruleQuestion
            {
             before(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getTrainingAccess().getQuestionsQuestionParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Training__QuestionsAssignment_8_3_1"


    // $ANTLR start "rule__Final__NameAssignment_2"
    // InternalUpctformaevalua.g:6249:1: rule__Final__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Final__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6253:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6254:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6254:2: ( ruleEString )
            // InternalUpctformaevalua.g:6255:3: ruleEString
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


    // $ANTLR start "rule__Final__LanguageAssignment_3"
    // InternalUpctformaevalua.g:6264:1: rule__Final__LanguageAssignment_3 : ( ruleEvaluationLanguageType ) ;
    public final void rule__Final__LanguageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6268:1: ( ( ruleEvaluationLanguageType ) )
            // InternalUpctformaevalua.g:6269:2: ( ruleEvaluationLanguageType )
            {
            // InternalUpctformaevalua.g:6269:2: ( ruleEvaluationLanguageType )
            // InternalUpctformaevalua.g:6270:3: ruleEvaluationLanguageType
            {
             before(grammarAccess.getFinalAccess().getLanguageEvaluationLanguageTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEvaluationLanguageType();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getLanguageEvaluationLanguageTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__LanguageAssignment_3"


    // $ANTLR start "rule__Final__NumberquestionsAssignment_5_1"
    // InternalUpctformaevalua.g:6279:1: rule__Final__NumberquestionsAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Final__NumberquestionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6283:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6284:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6284:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6285:3: ruleEInt
            {
             before(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getNumberquestionsEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__NumberquestionsAssignment_5_1"


    // $ANTLR start "rule__Final__QuestionsAssignment_6_2"
    // InternalUpctformaevalua.g:6294:1: rule__Final__QuestionsAssignment_6_2 : ( ruleQuestion ) ;
    public final void rule__Final__QuestionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6298:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6299:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6299:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6300:3: ruleQuestion
            {
             before(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__QuestionsAssignment_6_2"


    // $ANTLR start "rule__Final__QuestionsAssignment_6_3_1"
    // InternalUpctformaevalua.g:6309:1: rule__Final__QuestionsAssignment_6_3_1 : ( ruleQuestion ) ;
    public final void rule__Final__QuestionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6313:1: ( ( ruleQuestion ) )
            // InternalUpctformaevalua.g:6314:2: ( ruleQuestion )
            {
            // InternalUpctformaevalua.g:6314:2: ( ruleQuestion )
            // InternalUpctformaevalua.g:6315:3: ruleQuestion
            {
             before(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getQuestionsQuestionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__QuestionsAssignment_6_3_1"


    // $ANTLR start "rule__SingleAnswer__StatementsAssignment_3"
    // InternalUpctformaevalua.g:6324:1: rule__SingleAnswer__StatementsAssignment_3 : ( ruleParagraph ) ;
    public final void rule__SingleAnswer__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6328:1: ( ( ruleParagraph ) )
            // InternalUpctformaevalua.g:6329:2: ( ruleParagraph )
            {
            // InternalUpctformaevalua.g:6329:2: ( ruleParagraph )
            // InternalUpctformaevalua.g:6330:3: ruleParagraph
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
    // InternalUpctformaevalua.g:6339:1: rule__SingleAnswer__AnswersAssignment_4_2 : ( ruleSingle ) ;
    public final void rule__SingleAnswer__AnswersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6343:1: ( ( ruleSingle ) )
            // InternalUpctformaevalua.g:6344:2: ( ruleSingle )
            {
            // InternalUpctformaevalua.g:6344:2: ( ruleSingle )
            // InternalUpctformaevalua.g:6345:3: ruleSingle
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
    // InternalUpctformaevalua.g:6354:1: rule__SingleAnswer__AnswersAssignment_4_3_1 : ( ruleSingle ) ;
    public final void rule__SingleAnswer__AnswersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6358:1: ( ( ruleSingle ) )
            // InternalUpctformaevalua.g:6359:2: ( ruleSingle )
            {
            // InternalUpctformaevalua.g:6359:2: ( ruleSingle )
            // InternalUpctformaevalua.g:6360:3: ruleSingle
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
    // InternalUpctformaevalua.g:6369:1: rule__SingleAnswer__CorrectanswerAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__SingleAnswer__CorrectanswerAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6373:1: ( ( ruleEInt ) )
            // InternalUpctformaevalua.g:6374:2: ( ruleEInt )
            {
            // InternalUpctformaevalua.g:6374:2: ( ruleEInt )
            // InternalUpctformaevalua.g:6375:3: ruleEInt
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
    // InternalUpctformaevalua.g:6384:1: rule__SingleAnswer__CorrectfeedbackAssignment_6_1 : ( ruleEString ) ;
    public final void rule__SingleAnswer__CorrectfeedbackAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6388:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6389:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6389:2: ( ruleEString )
            // InternalUpctformaevalua.g:6390:3: ruleEString
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
    // InternalUpctformaevalua.g:6399:1: rule__SingleAnswer__IncorrectfeedbackAssignment_7_1 : ( ruleEString ) ;
    public final void rule__SingleAnswer__IncorrectfeedbackAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6403:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6404:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6404:2: ( ruleEString )
            // InternalUpctformaevalua.g:6405:3: ruleEString
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
    // InternalUpctformaevalua.g:6414:1: rule__MultipleAnswer__StatementsAssignment_3 : ( ruleParagraph ) ;
    public final void rule__MultipleAnswer__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6418:1: ( ( ruleParagraph ) )
            // InternalUpctformaevalua.g:6419:2: ( ruleParagraph )
            {
            // InternalUpctformaevalua.g:6419:2: ( ruleParagraph )
            // InternalUpctformaevalua.g:6420:3: ruleParagraph
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
    // InternalUpctformaevalua.g:6429:1: rule__MultipleAnswer__AnswersAssignment_4_2 : ( ruleMultiple ) ;
    public final void rule__MultipleAnswer__AnswersAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6433:1: ( ( ruleMultiple ) )
            // InternalUpctformaevalua.g:6434:2: ( ruleMultiple )
            {
            // InternalUpctformaevalua.g:6434:2: ( ruleMultiple )
            // InternalUpctformaevalua.g:6435:3: ruleMultiple
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
    // InternalUpctformaevalua.g:6444:1: rule__MultipleAnswer__AnswersAssignment_4_3_1 : ( ruleMultiple ) ;
    public final void rule__MultipleAnswer__AnswersAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6448:1: ( ( ruleMultiple ) )
            // InternalUpctformaevalua.g:6449:2: ( ruleMultiple )
            {
            // InternalUpctformaevalua.g:6449:2: ( ruleMultiple )
            // InternalUpctformaevalua.g:6450:3: ruleMultiple
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
    // InternalUpctformaevalua.g:6459:1: rule__MultipleAnswer__CorrectfeedbackAssignment_5_1 : ( ruleEString ) ;
    public final void rule__MultipleAnswer__CorrectfeedbackAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6463:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6464:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6464:2: ( ruleEString )
            // InternalUpctformaevalua.g:6465:3: ruleEString
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
    // InternalUpctformaevalua.g:6474:1: rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1 : ( ruleEString ) ;
    public final void rule__MultipleAnswer__IncorrectfeedbackAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6478:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6479:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6479:2: ( ruleEString )
            // InternalUpctformaevalua.g:6480:3: ruleEString
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
    // InternalUpctformaevalua.g:6489:1: rule__FillingAnswer__CorrectfeedbackAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FillingAnswer__CorrectfeedbackAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6493:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6494:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6494:2: ( ruleEString )
            // InternalUpctformaevalua.g:6495:3: ruleEString
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
    // InternalUpctformaevalua.g:6504:1: rule__FillingAnswer__IncorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FillingAnswer__IncorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6508:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6509:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6509:2: ( ruleEString )
            // InternalUpctformaevalua.g:6510:3: ruleEString
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
    // InternalUpctformaevalua.g:6519:1: rule__FillingAnswer__HolesAssignment_5_2 : ( ruleHole ) ;
    public final void rule__FillingAnswer__HolesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6523:1: ( ( ruleHole ) )
            // InternalUpctformaevalua.g:6524:2: ( ruleHole )
            {
            // InternalUpctformaevalua.g:6524:2: ( ruleHole )
            // InternalUpctformaevalua.g:6525:3: ruleHole
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
    // InternalUpctformaevalua.g:6534:1: rule__FillingAnswer__HolesAssignment_5_3_1 : ( ruleHole ) ;
    public final void rule__FillingAnswer__HolesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6538:1: ( ( ruleHole ) )
            // InternalUpctformaevalua.g:6539:2: ( ruleHole )
            {
            // InternalUpctformaevalua.g:6539:2: ( ruleHole )
            // InternalUpctformaevalua.g:6540:3: ruleHole
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
    // InternalUpctformaevalua.g:6549:1: rule__TrueOrFalse__AssertionsAssignment_3_2 : ( ruleAssertion ) ;
    public final void rule__TrueOrFalse__AssertionsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6553:1: ( ( ruleAssertion ) )
            // InternalUpctformaevalua.g:6554:2: ( ruleAssertion )
            {
            // InternalUpctformaevalua.g:6554:2: ( ruleAssertion )
            // InternalUpctformaevalua.g:6555:3: ruleAssertion
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
    // InternalUpctformaevalua.g:6564:1: rule__TrueOrFalse__AssertionsAssignment_3_3_1 : ( ruleAssertion ) ;
    public final void rule__TrueOrFalse__AssertionsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6568:1: ( ( ruleAssertion ) )
            // InternalUpctformaevalua.g:6569:2: ( ruleAssertion )
            {
            // InternalUpctformaevalua.g:6569:2: ( ruleAssertion )
            // InternalUpctformaevalua.g:6570:3: ruleAssertion
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
    // InternalUpctformaevalua.g:6579:1: rule__TrueOrFalse__CorrectfeedbackAssignment_4_1 : ( ruleEString ) ;
    public final void rule__TrueOrFalse__CorrectfeedbackAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6583:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6584:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6584:2: ( ruleEString )
            // InternalUpctformaevalua.g:6585:3: ruleEString
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
    // InternalUpctformaevalua.g:6594:1: rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1 : ( ruleEString ) ;
    public final void rule__TrueOrFalse__IncorrectfeedbackAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6598:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6599:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6599:2: ( ruleEString )
            // InternalUpctformaevalua.g:6600:3: ruleEString
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
    // InternalUpctformaevalua.g:6609:1: rule__Paragraph__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Paragraph__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6613:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6614:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6614:2: ( ruleEString )
            // InternalUpctformaevalua.g:6615:3: ruleEString
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
    // InternalUpctformaevalua.g:6624:1: rule__Single__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__Single__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6628:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6629:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6629:2: ( ruleEString )
            // InternalUpctformaevalua.g:6630:3: ruleEString
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
    // InternalUpctformaevalua.g:6639:1: rule__Multiple__TextAssignment_2_0 : ( ruleEString ) ;
    public final void rule__Multiple__TextAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6643:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6644:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6644:2: ( ruleEString )
            // InternalUpctformaevalua.g:6645:3: ruleEString
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
    // InternalUpctformaevalua.g:6654:1: rule__Multiple__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__Multiple__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6658:1: ( ( ruleEBoolean ) )
            // InternalUpctformaevalua.g:6659:2: ( ruleEBoolean )
            {
            // InternalUpctformaevalua.g:6659:2: ( ruleEBoolean )
            // InternalUpctformaevalua.g:6660:3: ruleEBoolean
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
    // InternalUpctformaevalua.g:6669:1: rule__Hole__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Hole__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6673:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6674:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6674:2: ( ruleEString )
            // InternalUpctformaevalua.g:6675:3: ruleEString
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
    // InternalUpctformaevalua.g:6684:1: rule__Hole__TypeAssignment_4_1 : ( ruleTypeHole ) ;
    public final void rule__Hole__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6688:1: ( ( ruleTypeHole ) )
            // InternalUpctformaevalua.g:6689:2: ( ruleTypeHole )
            {
            // InternalUpctformaevalua.g:6689:2: ( ruleTypeHole )
            // InternalUpctformaevalua.g:6690:3: ruleTypeHole
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
    // InternalUpctformaevalua.g:6699:1: rule__Assertion__TextAssignment_2_0 : ( ruleEString ) ;
    public final void rule__Assertion__TextAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6703:1: ( ( ruleEString ) )
            // InternalUpctformaevalua.g:6704:2: ( ruleEString )
            {
            // InternalUpctformaevalua.g:6704:2: ( ruleEString )
            // InternalUpctformaevalua.g:6705:3: ruleEString
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
    // InternalUpctformaevalua.g:6714:1: rule__Assertion__ValueAssignment_3 : ( ruleEBoolean ) ;
    public final void rule__Assertion__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctformaevalua.g:6718:1: ( ( ruleEBoolean ) )
            // InternalUpctformaevalua.g:6719:2: ( ruleEBoolean )
            {
            // InternalUpctformaevalua.g:6719:2: ( ruleEBoolean )
            // InternalUpctformaevalua.g:6720:3: ruleEBoolean
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000012046000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000012040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001620200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000C02000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000C182000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000180C02000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080C02000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800C02000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000C02000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002001830L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0018000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000000C0000L});

}