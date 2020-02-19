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
import org.xtext.services.UpctformaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_PRIMITIVETYPES", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Interoperability'", "'Open'", "'Preview'", "'Normal'", "'Interactive'", "'ES'", "'EN'", "'FR'", "'GR'", "'LI'", "'Original'", "'Fit'", "'BackgroundImage'", "'BackgroundColour'", "'ContentDefinition'", "'{'", "'}'", "'package'", "';'", "','", "'types'", "'templates'", "'.'", "'import'", "'.*'", "'TemplateDef'", "'Unit'", "'Type'", "'row'", "'usetemplate'", "'column'", "'width'", "'ContentElement'", "'Image'", "'url'", "'Widget'", "':'", "'Text'", "'html'", "'Int'", "'Literal'", "'-'", "'Composite'", "'Video'", "'id'", "'title'", "'type'", "'SimpleElement'", "'Placeholder'", "'Game'", "'['", "']'", "'widget'", "'CompositeType'", "'Section'", "'image'", "'list_of'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_PRIMITIVETYPES=6;
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


        public InternalUpctformaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUpctformaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUpctformaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUpctforma.g"; }


    	private UpctformaGrammarAccess grammarAccess;

    	public void setGrammarAccess(UpctformaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleContentDefinition"
    // InternalUpctforma.g:53:1: entryRuleContentDefinition : ruleContentDefinition EOF ;
    public final void entryRuleContentDefinition() throws RecognitionException {
        try {
            // InternalUpctforma.g:54:1: ( ruleContentDefinition EOF )
            // InternalUpctforma.g:55:1: ruleContentDefinition EOF
            {
             before(grammarAccess.getContentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleContentDefinition();

            state._fsp--;

             after(grammarAccess.getContentDefinitionRule()); 
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
    // $ANTLR end "entryRuleContentDefinition"


    // $ANTLR start "ruleContentDefinition"
    // InternalUpctforma.g:62:1: ruleContentDefinition : ( ( rule__ContentDefinition__Group__0 ) ) ;
    public final void ruleContentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:66:2: ( ( ( rule__ContentDefinition__Group__0 ) ) )
            // InternalUpctforma.g:67:2: ( ( rule__ContentDefinition__Group__0 ) )
            {
            // InternalUpctforma.g:67:2: ( ( rule__ContentDefinition__Group__0 ) )
            // InternalUpctforma.g:68:3: ( rule__ContentDefinition__Group__0 )
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup()); 
            // InternalUpctforma.g:69:3: ( rule__ContentDefinition__Group__0 )
            // InternalUpctforma.g:69:4: rule__ContentDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctforma.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalUpctforma.g:79:1: ( ruleQualifiedName EOF )
            // InternalUpctforma.g:80:1: ruleQualifiedName EOF
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
    // InternalUpctforma.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUpctforma.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUpctforma.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUpctforma.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUpctforma.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalUpctforma.g:94:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalUpctforma.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalUpctforma.g:104:1: ( ruleImport EOF )
            // InternalUpctforma.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalUpctforma.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalUpctforma.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalUpctforma.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalUpctforma.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalUpctforma.g:119:3: ( rule__Import__Group__0 )
            // InternalUpctforma.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalUpctforma.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalUpctforma.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalUpctforma.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalUpctforma.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalUpctforma.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalUpctforma.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalUpctforma.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalUpctforma.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalUpctforma.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalUpctforma.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalUpctforma.g:154:1: ( ruleType EOF )
            // InternalUpctforma.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUpctforma.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalUpctforma.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalUpctforma.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalUpctforma.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:169:3: ( rule__Type__Alternatives )
            // InternalUpctforma.g:169:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleContentElement"
    // InternalUpctforma.g:178:1: entryRuleContentElement : ruleContentElement EOF ;
    public final void entryRuleContentElement() throws RecognitionException {
        try {
            // InternalUpctforma.g:179:1: ( ruleContentElement EOF )
            // InternalUpctforma.g:180:1: ruleContentElement EOF
            {
             before(grammarAccess.getContentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getContentElementRule()); 
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
    // $ANTLR end "entryRuleContentElement"


    // $ANTLR start "ruleContentElement"
    // InternalUpctforma.g:187:1: ruleContentElement : ( ( rule__ContentElement__Alternatives ) ) ;
    public final void ruleContentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:191:2: ( ( ( rule__ContentElement__Alternatives ) ) )
            // InternalUpctforma.g:192:2: ( ( rule__ContentElement__Alternatives ) )
            {
            // InternalUpctforma.g:192:2: ( ( rule__ContentElement__Alternatives ) )
            // InternalUpctforma.g:193:3: ( rule__ContentElement__Alternatives )
            {
             before(grammarAccess.getContentElementAccess().getAlternatives()); 
            // InternalUpctforma.g:194:3: ( rule__ContentElement__Alternatives )
            // InternalUpctforma.g:194:4: rule__ContentElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContentElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentElement"


    // $ANTLR start "entryRuleEString"
    // InternalUpctforma.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalUpctforma.g:204:1: ( ruleEString EOF )
            // InternalUpctforma.g:205:1: ruleEString EOF
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
    // InternalUpctforma.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalUpctforma.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalUpctforma.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalUpctforma.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalUpctforma.g:219:3: ( rule__EString__Alternatives )
            // InternalUpctforma.g:219:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleTemplateDef"
    // InternalUpctforma.g:228:1: entryRuleTemplateDef : ruleTemplateDef EOF ;
    public final void entryRuleTemplateDef() throws RecognitionException {
        try {
            // InternalUpctforma.g:229:1: ( ruleTemplateDef EOF )
            // InternalUpctforma.g:230:1: ruleTemplateDef EOF
            {
             before(grammarAccess.getTemplateDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getTemplateDefRule()); 
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
    // $ANTLR end "entryRuleTemplateDef"


    // $ANTLR start "ruleTemplateDef"
    // InternalUpctforma.g:237:1: ruleTemplateDef : ( ( rule__TemplateDef__Group__0 ) ) ;
    public final void ruleTemplateDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:241:2: ( ( ( rule__TemplateDef__Group__0 ) ) )
            // InternalUpctforma.g:242:2: ( ( rule__TemplateDef__Group__0 ) )
            {
            // InternalUpctforma.g:242:2: ( ( rule__TemplateDef__Group__0 ) )
            // InternalUpctforma.g:243:3: ( rule__TemplateDef__Group__0 )
            {
             before(grammarAccess.getTemplateDefAccess().getGroup()); 
            // InternalUpctforma.g:244:3: ( rule__TemplateDef__Group__0 )
            // InternalUpctforma.g:244:4: rule__TemplateDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateDef"


    // $ANTLR start "entryRuleContentUnit"
    // InternalUpctforma.g:253:1: entryRuleContentUnit : ruleContentUnit EOF ;
    public final void entryRuleContentUnit() throws RecognitionException {
        try {
            // InternalUpctforma.g:254:1: ( ruleContentUnit EOF )
            // InternalUpctforma.g:255:1: ruleContentUnit EOF
            {
             before(grammarAccess.getContentUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleContentUnit();

            state._fsp--;

             after(grammarAccess.getContentUnitRule()); 
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
    // $ANTLR end "entryRuleContentUnit"


    // $ANTLR start "ruleContentUnit"
    // InternalUpctforma.g:262:1: ruleContentUnit : ( ( rule__ContentUnit__Group__0 ) ) ;
    public final void ruleContentUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:266:2: ( ( ( rule__ContentUnit__Group__0 ) ) )
            // InternalUpctforma.g:267:2: ( ( rule__ContentUnit__Group__0 ) )
            {
            // InternalUpctforma.g:267:2: ( ( rule__ContentUnit__Group__0 ) )
            // InternalUpctforma.g:268:3: ( rule__ContentUnit__Group__0 )
            {
             before(grammarAccess.getContentUnitAccess().getGroup()); 
            // InternalUpctforma.g:269:3: ( rule__ContentUnit__Group__0 )
            // InternalUpctforma.g:269:4: rule__ContentUnit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentUnit"


    // $ANTLR start "entryRuleType_Impl"
    // InternalUpctforma.g:278:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:279:1: ( ruleType_Impl EOF )
            // InternalUpctforma.g:280:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalUpctforma.g:287:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:291:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalUpctforma.g:292:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:292:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalUpctforma.g:293:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalUpctforma.g:294:3: ( rule__Type_Impl__Group__0 )
            // InternalUpctforma.g:294:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleRow"
    // InternalUpctforma.g:303:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalUpctforma.g:304:1: ( ruleRow EOF )
            // InternalUpctforma.g:305:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalUpctforma.g:312:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:316:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalUpctforma.g:317:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalUpctforma.g:317:2: ( ( rule__Row__Group__0 ) )
            // InternalUpctforma.g:318:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalUpctforma.g:319:3: ( rule__Row__Group__0 )
            // InternalUpctforma.g:319:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalUpctforma.g:328:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalUpctforma.g:329:1: ( ruleColumn EOF )
            // InternalUpctforma.g:330:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalUpctforma.g:337:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:341:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalUpctforma.g:342:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalUpctforma.g:342:2: ( ( rule__Column__Group__0 ) )
            // InternalUpctforma.g:343:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalUpctforma.g:344:3: ( rule__Column__Group__0 )
            // InternalUpctforma.g:344:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleUseTemplate"
    // InternalUpctforma.g:353:1: entryRuleUseTemplate : ruleUseTemplate EOF ;
    public final void entryRuleUseTemplate() throws RecognitionException {
        try {
            // InternalUpctforma.g:354:1: ( ruleUseTemplate EOF )
            // InternalUpctforma.g:355:1: ruleUseTemplate EOF
            {
             before(grammarAccess.getUseTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleUseTemplate();

            state._fsp--;

             after(grammarAccess.getUseTemplateRule()); 
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
    // $ANTLR end "entryRuleUseTemplate"


    // $ANTLR start "ruleUseTemplate"
    // InternalUpctforma.g:362:1: ruleUseTemplate : ( ( rule__UseTemplate__Group__0 ) ) ;
    public final void ruleUseTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:366:2: ( ( ( rule__UseTemplate__Group__0 ) ) )
            // InternalUpctforma.g:367:2: ( ( rule__UseTemplate__Group__0 ) )
            {
            // InternalUpctforma.g:367:2: ( ( rule__UseTemplate__Group__0 ) )
            // InternalUpctforma.g:368:3: ( rule__UseTemplate__Group__0 )
            {
             before(grammarAccess.getUseTemplateAccess().getGroup()); 
            // InternalUpctforma.g:369:3: ( rule__UseTemplate__Group__0 )
            // InternalUpctforma.g:369:4: rule__UseTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseTemplate"


    // $ANTLR start "entryRuleContentElement_Impl"
    // InternalUpctforma.g:378:1: entryRuleContentElement_Impl : ruleContentElement_Impl EOF ;
    public final void entryRuleContentElement_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:379:1: ( ruleContentElement_Impl EOF )
            // InternalUpctforma.g:380:1: ruleContentElement_Impl EOF
            {
             before(grammarAccess.getContentElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleContentElement_Impl();

            state._fsp--;

             after(grammarAccess.getContentElement_ImplRule()); 
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
    // $ANTLR end "entryRuleContentElement_Impl"


    // $ANTLR start "ruleContentElement_Impl"
    // InternalUpctforma.g:387:1: ruleContentElement_Impl : ( ( rule__ContentElement_Impl__Group__0 ) ) ;
    public final void ruleContentElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:391:2: ( ( ( rule__ContentElement_Impl__Group__0 ) ) )
            // InternalUpctforma.g:392:2: ( ( rule__ContentElement_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:392:2: ( ( rule__ContentElement_Impl__Group__0 ) )
            // InternalUpctforma.g:393:3: ( rule__ContentElement_Impl__Group__0 )
            {
             before(grammarAccess.getContentElement_ImplAccess().getGroup()); 
            // InternalUpctforma.g:394:3: ( rule__ContentElement_Impl__Group__0 )
            // InternalUpctforma.g:394:4: rule__ContentElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContentElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContentElement_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentElement_Impl"


    // $ANTLR start "entryRuleImage"
    // InternalUpctforma.g:403:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalUpctforma.g:404:1: ( ruleImage EOF )
            // InternalUpctforma.g:405:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalUpctforma.g:412:1: ruleImage : ( ( rule__Image__Group__0 ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:416:2: ( ( ( rule__Image__Group__0 ) ) )
            // InternalUpctforma.g:417:2: ( ( rule__Image__Group__0 ) )
            {
            // InternalUpctforma.g:417:2: ( ( rule__Image__Group__0 ) )
            // InternalUpctforma.g:418:3: ( rule__Image__Group__0 )
            {
             before(grammarAccess.getImageAccess().getGroup()); 
            // InternalUpctforma.g:419:3: ( rule__Image__Group__0 )
            // InternalUpctforma.g:419:4: rule__Image__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleWidget"
    // InternalUpctforma.g:428:1: entryRuleWidget : ruleWidget EOF ;
    public final void entryRuleWidget() throws RecognitionException {
        try {
            // InternalUpctforma.g:429:1: ( ruleWidget EOF )
            // InternalUpctforma.g:430:1: ruleWidget EOF
            {
             before(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            ruleWidget();

            state._fsp--;

             after(grammarAccess.getWidgetRule()); 
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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalUpctforma.g:437:1: ruleWidget : ( ( rule__Widget__Group__0 ) ) ;
    public final void ruleWidget() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:441:2: ( ( ( rule__Widget__Group__0 ) ) )
            // InternalUpctforma.g:442:2: ( ( rule__Widget__Group__0 ) )
            {
            // InternalUpctforma.g:442:2: ( ( rule__Widget__Group__0 ) )
            // InternalUpctforma.g:443:3: ( rule__Widget__Group__0 )
            {
             before(grammarAccess.getWidgetAccess().getGroup()); 
            // InternalUpctforma.g:444:3: ( rule__Widget__Group__0 )
            // InternalUpctforma.g:444:4: rule__Widget__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleText"
    // InternalUpctforma.g:453:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalUpctforma.g:454:1: ( ruleText EOF )
            // InternalUpctforma.g:455:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalUpctforma.g:462:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:466:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalUpctforma.g:467:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalUpctforma.g:467:2: ( ( rule__Text__Group__0 ) )
            // InternalUpctforma.g:468:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalUpctforma.g:469:3: ( rule__Text__Group__0 )
            // InternalUpctforma.g:469:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNumber"
    // InternalUpctforma.g:478:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalUpctforma.g:479:1: ( ruleNumber EOF )
            // InternalUpctforma.g:480:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalUpctforma.g:487:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:491:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalUpctforma.g:492:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalUpctforma.g:492:2: ( ( rule__Number__Group__0 ) )
            // InternalUpctforma.g:493:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalUpctforma.g:494:3: ( rule__Number__Group__0 )
            // InternalUpctforma.g:494:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleLiteral"
    // InternalUpctforma.g:503:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalUpctforma.g:504:1: ( ruleLiteral EOF )
            // InternalUpctforma.g:505:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalUpctforma.g:512:1: ruleLiteral : ( ( rule__Literal__Group__0 ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:516:2: ( ( ( rule__Literal__Group__0 ) ) )
            // InternalUpctforma.g:517:2: ( ( rule__Literal__Group__0 ) )
            {
            // InternalUpctforma.g:517:2: ( ( rule__Literal__Group__0 ) )
            // InternalUpctforma.g:518:3: ( rule__Literal__Group__0 )
            {
             before(grammarAccess.getLiteralAccess().getGroup()); 
            // InternalUpctforma.g:519:3: ( rule__Literal__Group__0 )
            // InternalUpctforma.g:519:4: rule__Literal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEInt"
    // InternalUpctforma.g:528:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalUpctforma.g:529:1: ( ruleEInt EOF )
            // InternalUpctforma.g:530:1: ruleEInt EOF
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
    // InternalUpctforma.g:537:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:541:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalUpctforma.g:542:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalUpctforma.g:542:2: ( ( rule__EInt__Group__0 ) )
            // InternalUpctforma.g:543:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalUpctforma.g:544:3: ( rule__EInt__Group__0 )
            // InternalUpctforma.g:544:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleComposite_Impl"
    // InternalUpctforma.g:553:1: entryRuleComposite_Impl : ruleComposite_Impl EOF ;
    public final void entryRuleComposite_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:554:1: ( ruleComposite_Impl EOF )
            // InternalUpctforma.g:555:1: ruleComposite_Impl EOF
            {
             before(grammarAccess.getComposite_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleComposite_Impl();

            state._fsp--;

             after(grammarAccess.getComposite_ImplRule()); 
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
    // $ANTLR end "entryRuleComposite_Impl"


    // $ANTLR start "ruleComposite_Impl"
    // InternalUpctforma.g:562:1: ruleComposite_Impl : ( ( rule__Composite_Impl__Group__0 ) ) ;
    public final void ruleComposite_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:566:2: ( ( ( rule__Composite_Impl__Group__0 ) ) )
            // InternalUpctforma.g:567:2: ( ( rule__Composite_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:567:2: ( ( rule__Composite_Impl__Group__0 ) )
            // InternalUpctforma.g:568:3: ( rule__Composite_Impl__Group__0 )
            {
             before(grammarAccess.getComposite_ImplAccess().getGroup()); 
            // InternalUpctforma.g:569:3: ( rule__Composite_Impl__Group__0 )
            // InternalUpctforma.g:569:4: rule__Composite_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composite_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComposite_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposite_Impl"


    // $ANTLR start "entryRuleVideo"
    // InternalUpctforma.g:578:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalUpctforma.g:579:1: ( ruleVideo EOF )
            // InternalUpctforma.g:580:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalUpctforma.g:587:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:591:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalUpctforma.g:592:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalUpctforma.g:592:2: ( ( rule__Video__Group__0 ) )
            // InternalUpctforma.g:593:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalUpctforma.g:594:3: ( rule__Video__Group__0 )
            // InternalUpctforma.g:594:4: rule__Video__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleSimpleElement_Impl"
    // InternalUpctforma.g:603:1: entryRuleSimpleElement_Impl : ruleSimpleElement_Impl EOF ;
    public final void entryRuleSimpleElement_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:604:1: ( ruleSimpleElement_Impl EOF )
            // InternalUpctforma.g:605:1: ruleSimpleElement_Impl EOF
            {
             before(grammarAccess.getSimpleElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleElement_Impl();

            state._fsp--;

             after(grammarAccess.getSimpleElement_ImplRule()); 
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
    // $ANTLR end "entryRuleSimpleElement_Impl"


    // $ANTLR start "ruleSimpleElement_Impl"
    // InternalUpctforma.g:612:1: ruleSimpleElement_Impl : ( ( rule__SimpleElement_Impl__Group__0 ) ) ;
    public final void ruleSimpleElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:616:2: ( ( ( rule__SimpleElement_Impl__Group__0 ) ) )
            // InternalUpctforma.g:617:2: ( ( rule__SimpleElement_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:617:2: ( ( rule__SimpleElement_Impl__Group__0 ) )
            // InternalUpctforma.g:618:3: ( rule__SimpleElement_Impl__Group__0 )
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getGroup()); 
            // InternalUpctforma.g:619:3: ( rule__SimpleElement_Impl__Group__0 )
            // InternalUpctforma.g:619:4: rule__SimpleElement_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleElement_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleElement_Impl"


    // $ANTLR start "entryRulePlaceHolder"
    // InternalUpctforma.g:628:1: entryRulePlaceHolder : rulePlaceHolder EOF ;
    public final void entryRulePlaceHolder() throws RecognitionException {
        try {
            // InternalUpctforma.g:629:1: ( rulePlaceHolder EOF )
            // InternalUpctforma.g:630:1: rulePlaceHolder EOF
            {
             before(grammarAccess.getPlaceHolderRule()); 
            pushFollow(FOLLOW_1);
            rulePlaceHolder();

            state._fsp--;

             after(grammarAccess.getPlaceHolderRule()); 
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
    // $ANTLR end "entryRulePlaceHolder"


    // $ANTLR start "rulePlaceHolder"
    // InternalUpctforma.g:637:1: rulePlaceHolder : ( ( rule__PlaceHolder__Group__0 ) ) ;
    public final void rulePlaceHolder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:641:2: ( ( ( rule__PlaceHolder__Group__0 ) ) )
            // InternalUpctforma.g:642:2: ( ( rule__PlaceHolder__Group__0 ) )
            {
            // InternalUpctforma.g:642:2: ( ( rule__PlaceHolder__Group__0 ) )
            // InternalUpctforma.g:643:3: ( rule__PlaceHolder__Group__0 )
            {
             before(grammarAccess.getPlaceHolderAccess().getGroup()); 
            // InternalUpctforma.g:644:3: ( rule__PlaceHolder__Group__0 )
            // InternalUpctforma.g:644:4: rule__PlaceHolder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlaceHolder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceHolderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlaceHolder"


    // $ANTLR start "entryRuleGame"
    // InternalUpctforma.g:653:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalUpctforma.g:654:1: ( ruleGame EOF )
            // InternalUpctforma.g:655:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalUpctforma.g:662:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:666:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalUpctforma.g:667:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalUpctforma.g:667:2: ( ( rule__Game__Group__0 ) )
            // InternalUpctforma.g:668:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalUpctforma.g:669:3: ( rule__Game__Group__0 )
            // InternalUpctforma.g:669:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleFieldValue"
    // InternalUpctforma.g:678:1: entryRuleFieldValue : ruleFieldValue EOF ;
    public final void entryRuleFieldValue() throws RecognitionException {
        try {
            // InternalUpctforma.g:679:1: ( ruleFieldValue EOF )
            // InternalUpctforma.g:680:1: ruleFieldValue EOF
            {
             before(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getFieldValueRule()); 
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
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // InternalUpctforma.g:687:1: ruleFieldValue : ( ( rule__FieldValue__Group__0 ) ) ;
    public final void ruleFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:691:2: ( ( ( rule__FieldValue__Group__0 ) ) )
            // InternalUpctforma.g:692:2: ( ( rule__FieldValue__Group__0 ) )
            {
            // InternalUpctforma.g:692:2: ( ( rule__FieldValue__Group__0 ) )
            // InternalUpctforma.g:693:3: ( rule__FieldValue__Group__0 )
            {
             before(grammarAccess.getFieldValueAccess().getGroup()); 
            // InternalUpctforma.g:694:3: ( rule__FieldValue__Group__0 )
            // InternalUpctforma.g:694:4: rule__FieldValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleRecordValue"
    // InternalUpctforma.g:703:1: entryRuleRecordValue : ruleRecordValue EOF ;
    public final void entryRuleRecordValue() throws RecognitionException {
        try {
            // InternalUpctforma.g:704:1: ( ruleRecordValue EOF )
            // InternalUpctforma.g:705:1: ruleRecordValue EOF
            {
             before(grammarAccess.getRecordValueRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordValue();

            state._fsp--;

             after(grammarAccess.getRecordValueRule()); 
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
    // $ANTLR end "entryRuleRecordValue"


    // $ANTLR start "ruleRecordValue"
    // InternalUpctforma.g:712:1: ruleRecordValue : ( ( rule__RecordValue__Group__0 ) ) ;
    public final void ruleRecordValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:716:2: ( ( ( rule__RecordValue__Group__0 ) ) )
            // InternalUpctforma.g:717:2: ( ( rule__RecordValue__Group__0 ) )
            {
            // InternalUpctforma.g:717:2: ( ( rule__RecordValue__Group__0 ) )
            // InternalUpctforma.g:718:3: ( rule__RecordValue__Group__0 )
            {
             before(grammarAccess.getRecordValueAccess().getGroup()); 
            // InternalUpctforma.g:719:3: ( rule__RecordValue__Group__0 )
            // InternalUpctforma.g:719:4: rule__RecordValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordValue"


    // $ANTLR start "entryRuleListValue"
    // InternalUpctforma.g:728:1: entryRuleListValue : ruleListValue EOF ;
    public final void entryRuleListValue() throws RecognitionException {
        try {
            // InternalUpctforma.g:729:1: ( ruleListValue EOF )
            // InternalUpctforma.g:730:1: ruleListValue EOF
            {
             before(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            ruleListValue();

            state._fsp--;

             after(grammarAccess.getListValueRule()); 
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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalUpctforma.g:737:1: ruleListValue : ( ( rule__ListValue__Group__0 ) ) ;
    public final void ruleListValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:741:2: ( ( ( rule__ListValue__Group__0 ) ) )
            // InternalUpctforma.g:742:2: ( ( rule__ListValue__Group__0 ) )
            {
            // InternalUpctforma.g:742:2: ( ( rule__ListValue__Group__0 ) )
            // InternalUpctforma.g:743:3: ( rule__ListValue__Group__0 )
            {
             before(grammarAccess.getListValueAccess().getGroup()); 
            // InternalUpctforma.g:744:3: ( rule__ListValue__Group__0 )
            // InternalUpctforma.g:744:4: rule__ListValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleWidgetType"
    // InternalUpctforma.g:753:1: entryRuleWidgetType : ruleWidgetType EOF ;
    public final void entryRuleWidgetType() throws RecognitionException {
        try {
            // InternalUpctforma.g:754:1: ( ruleWidgetType EOF )
            // InternalUpctforma.g:755:1: ruleWidgetType EOF
            {
             before(grammarAccess.getWidgetTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleWidgetType();

            state._fsp--;

             after(grammarAccess.getWidgetTypeRule()); 
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
    // $ANTLR end "entryRuleWidgetType"


    // $ANTLR start "ruleWidgetType"
    // InternalUpctforma.g:762:1: ruleWidgetType : ( ( rule__WidgetType__Group__0 ) ) ;
    public final void ruleWidgetType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:766:2: ( ( ( rule__WidgetType__Group__0 ) ) )
            // InternalUpctforma.g:767:2: ( ( rule__WidgetType__Group__0 ) )
            {
            // InternalUpctforma.g:767:2: ( ( rule__WidgetType__Group__0 ) )
            // InternalUpctforma.g:768:3: ( rule__WidgetType__Group__0 )
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup()); 
            // InternalUpctforma.g:769:3: ( rule__WidgetType__Group__0 )
            // InternalUpctforma.g:769:4: rule__WidgetType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWidgetType"


    // $ANTLR start "entryRuleCompositeType_Impl"
    // InternalUpctforma.g:778:1: entryRuleCompositeType_Impl : ruleCompositeType_Impl EOF ;
    public final void entryRuleCompositeType_Impl() throws RecognitionException {
        try {
            // InternalUpctforma.g:779:1: ( ruleCompositeType_Impl EOF )
            // InternalUpctforma.g:780:1: ruleCompositeType_Impl EOF
            {
             before(grammarAccess.getCompositeType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeType_Impl();

            state._fsp--;

             after(grammarAccess.getCompositeType_ImplRule()); 
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
    // $ANTLR end "entryRuleCompositeType_Impl"


    // $ANTLR start "ruleCompositeType_Impl"
    // InternalUpctforma.g:787:1: ruleCompositeType_Impl : ( ( rule__CompositeType_Impl__Group__0 ) ) ;
    public final void ruleCompositeType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:791:2: ( ( ( rule__CompositeType_Impl__Group__0 ) ) )
            // InternalUpctforma.g:792:2: ( ( rule__CompositeType_Impl__Group__0 ) )
            {
            // InternalUpctforma.g:792:2: ( ( rule__CompositeType_Impl__Group__0 ) )
            // InternalUpctforma.g:793:3: ( rule__CompositeType_Impl__Group__0 )
            {
             before(grammarAccess.getCompositeType_ImplAccess().getGroup()); 
            // InternalUpctforma.g:794:3: ( rule__CompositeType_Impl__Group__0 )
            // InternalUpctforma.g:794:4: rule__CompositeType_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeType_Impl"


    // $ANTLR start "entryRuleSection"
    // InternalUpctforma.g:803:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalUpctforma.g:804:1: ( ruleSection EOF )
            // InternalUpctforma.g:805:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalUpctforma.g:812:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:816:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalUpctforma.g:817:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalUpctforma.g:817:2: ( ( rule__Section__Group__0 ) )
            // InternalUpctforma.g:818:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalUpctforma.g:819:3: ( rule__Section__Group__0 )
            // InternalUpctforma.g:819:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEPrimitiveTypes"
    // InternalUpctforma.g:828:1: entryRuleEPrimitiveTypes : ruleEPrimitiveTypes EOF ;
    public final void entryRuleEPrimitiveTypes() throws RecognitionException {
        try {
            // InternalUpctforma.g:829:1: ( ruleEPrimitiveTypes EOF )
            // InternalUpctforma.g:830:1: ruleEPrimitiveTypes EOF
            {
             before(grammarAccess.getEPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getEPrimitiveTypesRule()); 
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
    // $ANTLR end "entryRuleEPrimitiveTypes"


    // $ANTLR start "ruleEPrimitiveTypes"
    // InternalUpctforma.g:837:1: ruleEPrimitiveTypes : ( ( rule__EPrimitiveTypes__Alternatives ) ) ;
    public final void ruleEPrimitiveTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:841:2: ( ( ( rule__EPrimitiveTypes__Alternatives ) ) )
            // InternalUpctforma.g:842:2: ( ( rule__EPrimitiveTypes__Alternatives ) )
            {
            // InternalUpctforma.g:842:2: ( ( rule__EPrimitiveTypes__Alternatives ) )
            // InternalUpctforma.g:843:3: ( rule__EPrimitiveTypes__Alternatives )
            {
             before(grammarAccess.getEPrimitiveTypesAccess().getAlternatives()); 
            // InternalUpctforma.g:844:3: ( rule__EPrimitiveTypes__Alternatives )
            // InternalUpctforma.g:844:4: rule__EPrimitiveTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EPrimitiveTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEPrimitiveTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEPrimitiveTypes"


    // $ANTLR start "entryRuleSimpleType"
    // InternalUpctforma.g:853:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // InternalUpctforma.g:854:1: ( ruleSimpleType EOF )
            // InternalUpctforma.g:855:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalUpctforma.g:862:1: ruleSimpleType : ( ( rule__SimpleType__Group__0 ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:866:2: ( ( ( rule__SimpleType__Group__0 ) ) )
            // InternalUpctforma.g:867:2: ( ( rule__SimpleType__Group__0 ) )
            {
            // InternalUpctforma.g:867:2: ( ( rule__SimpleType__Group__0 ) )
            // InternalUpctforma.g:868:3: ( rule__SimpleType__Group__0 )
            {
             before(grammarAccess.getSimpleTypeAccess().getGroup()); 
            // InternalUpctforma.g:869:3: ( rule__SimpleType__Group__0 )
            // InternalUpctforma.g:869:4: rule__SimpleType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleRecordType"
    // InternalUpctforma.g:878:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // InternalUpctforma.g:879:1: ( ruleRecordType EOF )
            // InternalUpctforma.g:880:1: ruleRecordType EOF
            {
             before(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRecordType();

            state._fsp--;

             after(grammarAccess.getRecordTypeRule()); 
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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalUpctforma.g:887:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:891:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // InternalUpctforma.g:892:2: ( ( rule__RecordType__Group__0 ) )
            {
            // InternalUpctforma.g:892:2: ( ( rule__RecordType__Group__0 ) )
            // InternalUpctforma.g:893:3: ( rule__RecordType__Group__0 )
            {
             before(grammarAccess.getRecordTypeAccess().getGroup()); 
            // InternalUpctforma.g:894:3: ( rule__RecordType__Group__0 )
            // InternalUpctforma.g:894:4: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // InternalUpctforma.g:903:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalUpctforma.g:904:1: ( ruleField EOF )
            // InternalUpctforma.g:905:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalUpctforma.g:912:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:916:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalUpctforma.g:917:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalUpctforma.g:917:2: ( ( rule__Field__Group__0 ) )
            // InternalUpctforma.g:918:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalUpctforma.g:919:3: ( rule__Field__Group__0 )
            // InternalUpctforma.g:919:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleListType"
    // InternalUpctforma.g:928:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // InternalUpctforma.g:929:1: ( ruleListType EOF )
            // InternalUpctforma.g:930:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalUpctforma.g:937:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:941:2: ( ( ( rule__ListType__Group__0 ) ) )
            // InternalUpctforma.g:942:2: ( ( rule__ListType__Group__0 ) )
            {
            // InternalUpctforma.g:942:2: ( ( rule__ListType__Group__0 ) )
            // InternalUpctforma.g:943:3: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // InternalUpctforma.g:944:3: ( rule__ListType__Group__0 )
            // InternalUpctforma.g:944:4: rule__ListType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "ruleContentUnitType"
    // InternalUpctforma.g:953:1: ruleContentUnitType : ( ( rule__ContentUnitType__Alternatives ) ) ;
    public final void ruleContentUnitType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:957:1: ( ( ( rule__ContentUnitType__Alternatives ) ) )
            // InternalUpctforma.g:958:2: ( ( rule__ContentUnitType__Alternatives ) )
            {
            // InternalUpctforma.g:958:2: ( ( rule__ContentUnitType__Alternatives ) )
            // InternalUpctforma.g:959:3: ( rule__ContentUnitType__Alternatives )
            {
             before(grammarAccess.getContentUnitTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:960:3: ( rule__ContentUnitType__Alternatives )
            // InternalUpctforma.g:960:4: rule__ContentUnitType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnitType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContentUnitType"


    // $ANTLR start "ruleVideoType"
    // InternalUpctforma.g:969:1: ruleVideoType : ( ( rule__VideoType__Alternatives ) ) ;
    public final void ruleVideoType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:973:1: ( ( ( rule__VideoType__Alternatives ) ) )
            // InternalUpctforma.g:974:2: ( ( rule__VideoType__Alternatives ) )
            {
            // InternalUpctforma.g:974:2: ( ( rule__VideoType__Alternatives ) )
            // InternalUpctforma.g:975:3: ( rule__VideoType__Alternatives )
            {
             before(grammarAccess.getVideoTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:976:3: ( rule__VideoType__Alternatives )
            // InternalUpctforma.g:976:4: rule__VideoType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VideoType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVideoTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoType"


    // $ANTLR start "ruleLanguageType"
    // InternalUpctforma.g:985:1: ruleLanguageType : ( ( rule__LanguageType__Alternatives ) ) ;
    public final void ruleLanguageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:989:1: ( ( ( rule__LanguageType__Alternatives ) ) )
            // InternalUpctforma.g:990:2: ( ( rule__LanguageType__Alternatives ) )
            {
            // InternalUpctforma.g:990:2: ( ( rule__LanguageType__Alternatives ) )
            // InternalUpctforma.g:991:3: ( rule__LanguageType__Alternatives )
            {
             before(grammarAccess.getLanguageTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:992:3: ( rule__LanguageType__Alternatives )
            // InternalUpctforma.g:992:4: rule__LanguageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LanguageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageType"


    // $ANTLR start "ruleImageType"
    // InternalUpctforma.g:1001:1: ruleImageType : ( ( rule__ImageType__Alternatives ) ) ;
    public final void ruleImageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1005:1: ( ( ( rule__ImageType__Alternatives ) ) )
            // InternalUpctforma.g:1006:2: ( ( rule__ImageType__Alternatives ) )
            {
            // InternalUpctforma.g:1006:2: ( ( rule__ImageType__Alternatives ) )
            // InternalUpctforma.g:1007:3: ( rule__ImageType__Alternatives )
            {
             before(grammarAccess.getImageTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:1008:3: ( rule__ImageType__Alternatives )
            // InternalUpctforma.g:1008:4: rule__ImageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ImageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImageTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageType"


    // $ANTLR start "ruleSectionType"
    // InternalUpctforma.g:1017:1: ruleSectionType : ( ( rule__SectionType__Alternatives ) ) ;
    public final void ruleSectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1021:1: ( ( ( rule__SectionType__Alternatives ) ) )
            // InternalUpctforma.g:1022:2: ( ( rule__SectionType__Alternatives ) )
            {
            // InternalUpctforma.g:1022:2: ( ( rule__SectionType__Alternatives ) )
            // InternalUpctforma.g:1023:3: ( rule__SectionType__Alternatives )
            {
             before(grammarAccess.getSectionTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:1024:3: ( rule__SectionType__Alternatives )
            // InternalUpctforma.g:1024:4: rule__SectionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SectionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSectionType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalUpctforma.g:1032:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1036:1: ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUpctforma.g:1037:2: ( ruleType_Impl )
                    {
                    // InternalUpctforma.g:1037:2: ( ruleType_Impl )
                    // InternalUpctforma.g:1038:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1043:2: ( ruleSimpleType )
                    {
                    // InternalUpctforma.g:1043:2: ( ruleSimpleType )
                    // InternalUpctforma.g:1044:3: ruleSimpleType
                    {
                     before(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1049:2: ( ruleRecordType )
                    {
                    // InternalUpctforma.g:1049:2: ( ruleRecordType )
                    // InternalUpctforma.g:1050:3: ruleRecordType
                    {
                     before(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:1055:2: ( ruleWidgetType )
                    {
                    // InternalUpctforma.g:1055:2: ( ruleWidgetType )
                    // InternalUpctforma.g:1056:3: ruleWidgetType
                    {
                     before(grammarAccess.getTypeAccess().getWidgetTypeParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWidgetType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getWidgetTypeParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:1061:2: ( ruleListType )
                    {
                    // InternalUpctforma.g:1061:2: ( ruleListType )
                    // InternalUpctforma.g:1062:3: ruleListType
                    {
                     before(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUpctforma.g:1067:2: ( ruleCompositeType_Impl )
                    {
                    // InternalUpctforma.g:1067:2: ( ruleCompositeType_Impl )
                    // InternalUpctforma.g:1068:3: ruleCompositeType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getCompositeType_ImplParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCompositeType_ImplParserRuleCall_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__ContentElement__Alternatives"
    // InternalUpctforma.g:1077:1: rule__ContentElement__Alternatives : ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleElement_Impl ) | ( rulePlaceHolder ) | ( ruleRow ) | ( ruleGame ) | ( ruleRecordValue ) | ( ruleListValue ) | ( ruleNumber ) | ( ruleLiteral ) );
    public final void rule__ContentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1081:1: ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleElement_Impl ) | ( rulePlaceHolder ) | ( ruleRow ) | ( ruleGame ) | ( ruleRecordValue ) | ( ruleListValue ) | ( ruleNumber ) | ( ruleLiteral ) )
            int alt2=15;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 42:
                {
                alt2=2;
                }
                break;
            case 45:
                {
                alt2=3;
                }
                break;
            case 47:
                {
                alt2=4;
                }
                break;
            case 49:
                {
                alt2=5;
                }
                break;
            case 54:
                {
                alt2=6;
                }
                break;
            case 55:
                {
                alt2=7;
                }
                break;
            case 59:
                {
                alt2=8;
                }
                break;
            case 60:
                {
                alt2=9;
                }
                break;
            case 40:
                {
                alt2=10;
                }
                break;
            case 61:
                {
                alt2=11;
                }
                break;
            case 27:
                {
                alt2=12;
                }
                break;
            case 62:
                {
                alt2=13;
                }
                break;
            case 51:
                {
                alt2=14;
                }
                break;
            case 52:
                {
                alt2=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUpctforma.g:1082:2: ( ruleContentElement_Impl )
                    {
                    // InternalUpctforma.g:1082:2: ( ruleContentElement_Impl )
                    // InternalUpctforma.g:1083:3: ruleContentElement_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getContentElement_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContentElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getContentElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1088:2: ( ruleColumn )
                    {
                    // InternalUpctforma.g:1088:2: ( ruleColumn )
                    // InternalUpctforma.g:1089:3: ruleColumn
                    {
                     before(grammarAccess.getContentElementAccess().getColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumn();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getColumnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1094:2: ( ruleImage )
                    {
                    // InternalUpctforma.g:1094:2: ( ruleImage )
                    // InternalUpctforma.g:1095:3: ruleImage
                    {
                     before(grammarAccess.getContentElementAccess().getImageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getImageParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:1100:2: ( ruleWidget )
                    {
                    // InternalUpctforma.g:1100:2: ( ruleWidget )
                    // InternalUpctforma.g:1101:3: ruleWidget
                    {
                     before(grammarAccess.getContentElementAccess().getWidgetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleWidget();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getWidgetParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:1106:2: ( ruleText )
                    {
                    // InternalUpctforma.g:1106:2: ( ruleText )
                    // InternalUpctforma.g:1107:3: ruleText
                    {
                     before(grammarAccess.getContentElementAccess().getTextParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleText();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getTextParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUpctforma.g:1112:2: ( ruleComposite_Impl )
                    {
                    // InternalUpctforma.g:1112:2: ( ruleComposite_Impl )
                    // InternalUpctforma.g:1113:3: ruleComposite_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getComposite_ImplParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleComposite_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getComposite_ImplParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUpctforma.g:1118:2: ( ruleVideo )
                    {
                    // InternalUpctforma.g:1118:2: ( ruleVideo )
                    // InternalUpctforma.g:1119:3: ruleVideo
                    {
                     before(grammarAccess.getContentElementAccess().getVideoParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getVideoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUpctforma.g:1124:2: ( ruleSimpleElement_Impl )
                    {
                    // InternalUpctforma.g:1124:2: ( ruleSimpleElement_Impl )
                    // InternalUpctforma.g:1125:3: ruleSimpleElement_Impl
                    {
                     before(grammarAccess.getContentElementAccess().getSimpleElement_ImplParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getSimpleElement_ImplParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUpctforma.g:1130:2: ( rulePlaceHolder )
                    {
                    // InternalUpctforma.g:1130:2: ( rulePlaceHolder )
                    // InternalUpctforma.g:1131:3: rulePlaceHolder
                    {
                     before(grammarAccess.getContentElementAccess().getPlaceHolderParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    rulePlaceHolder();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getPlaceHolderParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUpctforma.g:1136:2: ( ruleRow )
                    {
                    // InternalUpctforma.g:1136:2: ( ruleRow )
                    // InternalUpctforma.g:1137:3: ruleRow
                    {
                     before(grammarAccess.getContentElementAccess().getRowParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleRow();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getRowParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalUpctforma.g:1142:2: ( ruleGame )
                    {
                    // InternalUpctforma.g:1142:2: ( ruleGame )
                    // InternalUpctforma.g:1143:3: ruleGame
                    {
                     before(grammarAccess.getContentElementAccess().getGameParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    ruleGame();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getGameParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalUpctforma.g:1148:2: ( ruleRecordValue )
                    {
                    // InternalUpctforma.g:1148:2: ( ruleRecordValue )
                    // InternalUpctforma.g:1149:3: ruleRecordValue
                    {
                     before(grammarAccess.getContentElementAccess().getRecordValueParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleRecordValue();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getRecordValueParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalUpctforma.g:1154:2: ( ruleListValue )
                    {
                    // InternalUpctforma.g:1154:2: ( ruleListValue )
                    // InternalUpctforma.g:1155:3: ruleListValue
                    {
                     before(grammarAccess.getContentElementAccess().getListValueParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleListValue();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getListValueParserRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalUpctforma.g:1160:2: ( ruleNumber )
                    {
                    // InternalUpctforma.g:1160:2: ( ruleNumber )
                    // InternalUpctforma.g:1161:3: ruleNumber
                    {
                     before(grammarAccess.getContentElementAccess().getNumberParserRuleCall_13()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getNumberParserRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalUpctforma.g:1166:2: ( ruleLiteral )
                    {
                    // InternalUpctforma.g:1166:2: ( ruleLiteral )
                    // InternalUpctforma.g:1167:3: ruleLiteral
                    {
                     before(grammarAccess.getContentElementAccess().getLiteralParserRuleCall_14()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getContentElementAccess().getLiteralParserRuleCall_14()); 

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
    // $ANTLR end "rule__ContentElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalUpctforma.g:1176:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1180:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalUpctforma.g:1181:2: ( RULE_STRING )
                    {
                    // InternalUpctforma.g:1181:2: ( RULE_STRING )
                    // InternalUpctforma.g:1182:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1187:2: ( RULE_ID )
                    {
                    // InternalUpctforma.g:1187:2: ( RULE_ID )
                    // InternalUpctforma.g:1188:3: RULE_ID
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


    // $ANTLR start "rule__EPrimitiveTypes__Alternatives"
    // InternalUpctforma.g:1197:1: rule__EPrimitiveTypes__Alternatives : ( ( ruleEString ) | ( RULE_PRIMITIVETYPES ) );
    public final void rule__EPrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1201:1: ( ( ruleEString ) | ( RULE_PRIMITIVETYPES ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_PRIMITIVETYPES) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUpctforma.g:1202:2: ( ruleEString )
                    {
                    // InternalUpctforma.g:1202:2: ( ruleEString )
                    // InternalUpctforma.g:1203:3: ruleEString
                    {
                     before(grammarAccess.getEPrimitiveTypesAccess().getEStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getEPrimitiveTypesAccess().getEStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1208:2: ( RULE_PRIMITIVETYPES )
                    {
                    // InternalUpctforma.g:1208:2: ( RULE_PRIMITIVETYPES )
                    // InternalUpctforma.g:1209:3: RULE_PRIMITIVETYPES
                    {
                     before(grammarAccess.getEPrimitiveTypesAccess().getPrimitiveTypesTerminalRuleCall_1()); 
                    match(input,RULE_PRIMITIVETYPES,FOLLOW_2); 
                     after(grammarAccess.getEPrimitiveTypesAccess().getPrimitiveTypesTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EPrimitiveTypes__Alternatives"


    // $ANTLR start "rule__ContentUnitType__Alternatives"
    // InternalUpctforma.g:1218:1: rule__ContentUnitType__Alternatives : ( ( ( 'Interoperability' ) ) | ( ( 'Open' ) ) | ( ( 'Preview' ) ) );
    public final void rule__ContentUnitType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1222:1: ( ( ( 'Interoperability' ) ) | ( ( 'Open' ) ) | ( ( 'Preview' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUpctforma.g:1223:2: ( ( 'Interoperability' ) )
                    {
                    // InternalUpctforma.g:1223:2: ( ( 'Interoperability' ) )
                    // InternalUpctforma.g:1224:3: ( 'Interoperability' )
                    {
                     before(grammarAccess.getContentUnitTypeAccess().getInteroperabilityEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1225:3: ( 'Interoperability' )
                    // InternalUpctforma.g:1225:4: 'Interoperability'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getContentUnitTypeAccess().getInteroperabilityEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1229:2: ( ( 'Open' ) )
                    {
                    // InternalUpctforma.g:1229:2: ( ( 'Open' ) )
                    // InternalUpctforma.g:1230:3: ( 'Open' )
                    {
                     before(grammarAccess.getContentUnitTypeAccess().getOpenEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1231:3: ( 'Open' )
                    // InternalUpctforma.g:1231:4: 'Open'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getContentUnitTypeAccess().getOpenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1235:2: ( ( 'Preview' ) )
                    {
                    // InternalUpctforma.g:1235:2: ( ( 'Preview' ) )
                    // InternalUpctforma.g:1236:3: ( 'Preview' )
                    {
                     before(grammarAccess.getContentUnitTypeAccess().getPreviewEnumLiteralDeclaration_2()); 
                    // InternalUpctforma.g:1237:3: ( 'Preview' )
                    // InternalUpctforma.g:1237:4: 'Preview'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getContentUnitTypeAccess().getPreviewEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ContentUnitType__Alternatives"


    // $ANTLR start "rule__VideoType__Alternatives"
    // InternalUpctforma.g:1245:1: rule__VideoType__Alternatives : ( ( ( 'Normal' ) ) | ( ( 'Interactive' ) ) );
    public final void rule__VideoType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1249:1: ( ( ( 'Normal' ) ) | ( ( 'Interactive' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUpctforma.g:1250:2: ( ( 'Normal' ) )
                    {
                    // InternalUpctforma.g:1250:2: ( ( 'Normal' ) )
                    // InternalUpctforma.g:1251:3: ( 'Normal' )
                    {
                     before(grammarAccess.getVideoTypeAccess().getNormalEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1252:3: ( 'Normal' )
                    // InternalUpctforma.g:1252:4: 'Normal'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getVideoTypeAccess().getNormalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1256:2: ( ( 'Interactive' ) )
                    {
                    // InternalUpctforma.g:1256:2: ( ( 'Interactive' ) )
                    // InternalUpctforma.g:1257:3: ( 'Interactive' )
                    {
                     before(grammarAccess.getVideoTypeAccess().getInteractiveEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1258:3: ( 'Interactive' )
                    // InternalUpctforma.g:1258:4: 'Interactive'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getVideoTypeAccess().getInteractiveEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__VideoType__Alternatives"


    // $ANTLR start "rule__LanguageType__Alternatives"
    // InternalUpctforma.g:1266:1: rule__LanguageType__Alternatives : ( ( ( 'ES' ) ) | ( ( 'EN' ) ) | ( ( 'FR' ) ) | ( ( 'GR' ) ) | ( ( 'LI' ) ) );
    public final void rule__LanguageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1270:1: ( ( ( 'ES' ) ) | ( ( 'EN' ) ) | ( ( 'FR' ) ) | ( ( 'GR' ) ) | ( ( 'LI' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalUpctforma.g:1271:2: ( ( 'ES' ) )
                    {
                    // InternalUpctforma.g:1271:2: ( ( 'ES' ) )
                    // InternalUpctforma.g:1272:3: ( 'ES' )
                    {
                     before(grammarAccess.getLanguageTypeAccess().getESEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1273:3: ( 'ES' )
                    // InternalUpctforma.g:1273:4: 'ES'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageTypeAccess().getESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1277:2: ( ( 'EN' ) )
                    {
                    // InternalUpctforma.g:1277:2: ( ( 'EN' ) )
                    // InternalUpctforma.g:1278:3: ( 'EN' )
                    {
                     before(grammarAccess.getLanguageTypeAccess().getENEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1279:3: ( 'EN' )
                    // InternalUpctforma.g:1279:4: 'EN'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageTypeAccess().getENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1283:2: ( ( 'FR' ) )
                    {
                    // InternalUpctforma.g:1283:2: ( ( 'FR' ) )
                    // InternalUpctforma.g:1284:3: ( 'FR' )
                    {
                     before(grammarAccess.getLanguageTypeAccess().getFREnumLiteralDeclaration_2()); 
                    // InternalUpctforma.g:1285:3: ( 'FR' )
                    // InternalUpctforma.g:1285:4: 'FR'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageTypeAccess().getFREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:1289:2: ( ( 'GR' ) )
                    {
                    // InternalUpctforma.g:1289:2: ( ( 'GR' ) )
                    // InternalUpctforma.g:1290:3: ( 'GR' )
                    {
                     before(grammarAccess.getLanguageTypeAccess().getGREnumLiteralDeclaration_3()); 
                    // InternalUpctforma.g:1291:3: ( 'GR' )
                    // InternalUpctforma.g:1291:4: 'GR'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageTypeAccess().getGREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:1295:2: ( ( 'LI' ) )
                    {
                    // InternalUpctforma.g:1295:2: ( ( 'LI' ) )
                    // InternalUpctforma.g:1296:3: ( 'LI' )
                    {
                     before(grammarAccess.getLanguageTypeAccess().getLIEnumLiteralDeclaration_4()); 
                    // InternalUpctforma.g:1297:3: ( 'LI' )
                    // InternalUpctforma.g:1297:4: 'LI'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLanguageTypeAccess().getLIEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__LanguageType__Alternatives"


    // $ANTLR start "rule__ImageType__Alternatives"
    // InternalUpctforma.g:1305:1: rule__ImageType__Alternatives : ( ( ( 'Original' ) ) | ( ( 'Fit' ) ) );
    public final void rule__ImageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1309:1: ( ( ( 'Original' ) ) | ( ( 'Fit' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctforma.g:1310:2: ( ( 'Original' ) )
                    {
                    // InternalUpctforma.g:1310:2: ( ( 'Original' ) )
                    // InternalUpctforma.g:1311:3: ( 'Original' )
                    {
                     before(grammarAccess.getImageTypeAccess().getOriginalEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1312:3: ( 'Original' )
                    // InternalUpctforma.g:1312:4: 'Original'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getImageTypeAccess().getOriginalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1316:2: ( ( 'Fit' ) )
                    {
                    // InternalUpctforma.g:1316:2: ( ( 'Fit' ) )
                    // InternalUpctforma.g:1317:3: ( 'Fit' )
                    {
                     before(grammarAccess.getImageTypeAccess().getFitEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1318:3: ( 'Fit' )
                    // InternalUpctforma.g:1318:4: 'Fit'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getImageTypeAccess().getFitEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ImageType__Alternatives"


    // $ANTLR start "rule__SectionType__Alternatives"
    // InternalUpctforma.g:1326:1: rule__SectionType__Alternatives : ( ( ( 'BackgroundImage' ) ) | ( ( 'BackgroundColour' ) ) );
    public final void rule__SectionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1330:1: ( ( ( 'BackgroundImage' ) ) | ( ( 'BackgroundColour' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUpctforma.g:1331:2: ( ( 'BackgroundImage' ) )
                    {
                    // InternalUpctforma.g:1331:2: ( ( 'BackgroundImage' ) )
                    // InternalUpctforma.g:1332:3: ( 'BackgroundImage' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getBackgroundImageEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1333:3: ( 'BackgroundImage' )
                    // InternalUpctforma.g:1333:4: 'BackgroundImage'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getBackgroundImageEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1337:2: ( ( 'BackgroundColour' ) )
                    {
                    // InternalUpctforma.g:1337:2: ( ( 'BackgroundColour' ) )
                    // InternalUpctforma.g:1338:3: ( 'BackgroundColour' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getBackgroundColourEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1339:3: ( 'BackgroundColour' )
                    // InternalUpctforma.g:1339:4: 'BackgroundColour'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getBackgroundColourEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SectionType__Alternatives"


    // $ANTLR start "rule__ContentDefinition__Group__0"
    // InternalUpctforma.g:1347:1: rule__ContentDefinition__Group__0 : rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 ;
    public final void rule__ContentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1351:1: ( rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 )
            // InternalUpctforma.g:1352:2: rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ContentDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__0"


    // $ANTLR start "rule__ContentDefinition__Group__0__Impl"
    // InternalUpctforma.g:1359:1: rule__ContentDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ContentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1363:1: ( ( () ) )
            // InternalUpctforma.g:1364:1: ( () )
            {
            // InternalUpctforma.g:1364:1: ( () )
            // InternalUpctforma.g:1365:2: ()
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0()); 
            // InternalUpctforma.g:1366:2: ()
            // InternalUpctforma.g:1366:3: 
            {
            }

             after(grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__1"
    // InternalUpctforma.g:1374:1: rule__ContentDefinition__Group__1 : rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 ;
    public final void rule__ContentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1378:1: ( rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 )
            // InternalUpctforma.g:1379:2: rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ContentDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__1"


    // $ANTLR start "rule__ContentDefinition__Group__1__Impl"
    // InternalUpctforma.g:1386:1: rule__ContentDefinition__Group__1__Impl : ( 'ContentDefinition' ) ;
    public final void rule__ContentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1390:1: ( ( 'ContentDefinition' ) )
            // InternalUpctforma.g:1391:1: ( 'ContentDefinition' )
            {
            // InternalUpctforma.g:1391:1: ( 'ContentDefinition' )
            // InternalUpctforma.g:1392:2: 'ContentDefinition'
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__2"
    // InternalUpctforma.g:1401:1: rule__ContentDefinition__Group__2 : rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 ;
    public final void rule__ContentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1405:1: ( rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 )
            // InternalUpctforma.g:1406:2: rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ContentDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__2"


    // $ANTLR start "rule__ContentDefinition__Group__2__Impl"
    // InternalUpctforma.g:1413:1: rule__ContentDefinition__Group__2__Impl : ( ( rule__ContentDefinition__NameAssignment_2 ) ) ;
    public final void rule__ContentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1417:1: ( ( ( rule__ContentDefinition__NameAssignment_2 ) ) )
            // InternalUpctforma.g:1418:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:1418:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            // InternalUpctforma.g:1419:2: ( rule__ContentDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:1420:2: ( rule__ContentDefinition__NameAssignment_2 )
            // InternalUpctforma.g:1420:3: rule__ContentDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__3"
    // InternalUpctforma.g:1428:1: rule__ContentDefinition__Group__3 : rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 ;
    public final void rule__ContentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1432:1: ( rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 )
            // InternalUpctforma.g:1433:2: rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__3"


    // $ANTLR start "rule__ContentDefinition__Group__3__Impl"
    // InternalUpctforma.g:1440:1: rule__ContentDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1444:1: ( ( '{' ) )
            // InternalUpctforma.g:1445:1: ( '{' )
            {
            // InternalUpctforma.g:1445:1: ( '{' )
            // InternalUpctforma.g:1446:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__3__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__4"
    // InternalUpctforma.g:1455:1: rule__ContentDefinition__Group__4 : rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 ;
    public final void rule__ContentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1459:1: ( rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 )
            // InternalUpctforma.g:1460:2: rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__4"


    // $ANTLR start "rule__ContentDefinition__Group__4__Impl"
    // InternalUpctforma.g:1467:1: rule__ContentDefinition__Group__4__Impl : ( ( rule__ContentDefinition__Group_4__0 )? ) ;
    public final void rule__ContentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1471:1: ( ( ( rule__ContentDefinition__Group_4__0 )? ) )
            // InternalUpctforma.g:1472:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            {
            // InternalUpctforma.g:1472:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            // InternalUpctforma.g:1473:2: ( rule__ContentDefinition__Group_4__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_4()); 
            // InternalUpctforma.g:1474:2: ( rule__ContentDefinition__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctforma.g:1474:3: rule__ContentDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__4__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__5"
    // InternalUpctforma.g:1482:1: rule__ContentDefinition__Group__5 : rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 ;
    public final void rule__ContentDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1486:1: ( rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 )
            // InternalUpctforma.g:1487:2: rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__5"


    // $ANTLR start "rule__ContentDefinition__Group__5__Impl"
    // InternalUpctforma.g:1494:1: rule__ContentDefinition__Group__5__Impl : ( ( rule__ContentDefinition__Group_5__0 )? ) ;
    public final void rule__ContentDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1498:1: ( ( ( rule__ContentDefinition__Group_5__0 )? ) )
            // InternalUpctforma.g:1499:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            {
            // InternalUpctforma.g:1499:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            // InternalUpctforma.g:1500:2: ( rule__ContentDefinition__Group_5__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5()); 
            // InternalUpctforma.g:1501:2: ( rule__ContentDefinition__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUpctforma.g:1501:3: rule__ContentDefinition__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__5__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__6"
    // InternalUpctforma.g:1509:1: rule__ContentDefinition__Group__6 : rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 ;
    public final void rule__ContentDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1513:1: ( rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 )
            // InternalUpctforma.g:1514:2: rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__6"


    // $ANTLR start "rule__ContentDefinition__Group__6__Impl"
    // InternalUpctforma.g:1521:1: rule__ContentDefinition__Group__6__Impl : ( ( rule__ContentDefinition__Group_6__0 )? ) ;
    public final void rule__ContentDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1525:1: ( ( ( rule__ContentDefinition__Group_6__0 )? ) )
            // InternalUpctforma.g:1526:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            {
            // InternalUpctforma.g:1526:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            // InternalUpctforma.g:1527:2: ( rule__ContentDefinition__Group_6__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6()); 
            // InternalUpctforma.g:1528:2: ( rule__ContentDefinition__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUpctforma.g:1528:3: rule__ContentDefinition__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__6__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__7"
    // InternalUpctforma.g:1536:1: rule__ContentDefinition__Group__7 : rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 ;
    public final void rule__ContentDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1540:1: ( rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 )
            // InternalUpctforma.g:1541:2: rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__7"


    // $ANTLR start "rule__ContentDefinition__Group__7__Impl"
    // InternalUpctforma.g:1548:1: rule__ContentDefinition__Group__7__Impl : ( ( rule__ContentDefinition__Group_7__0 )? ) ;
    public final void rule__ContentDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1552:1: ( ( ( rule__ContentDefinition__Group_7__0 )? ) )
            // InternalUpctforma.g:1553:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            {
            // InternalUpctforma.g:1553:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            // InternalUpctforma.g:1554:2: ( rule__ContentDefinition__Group_7__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7()); 
            // InternalUpctforma.g:1555:2: ( rule__ContentDefinition__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUpctforma.g:1555:3: rule__ContentDefinition__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__7__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__8"
    // InternalUpctforma.g:1563:1: rule__ContentDefinition__Group__8 : rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 ;
    public final void rule__ContentDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1567:1: ( rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 )
            // InternalUpctforma.g:1568:2: rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ContentDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__8"


    // $ANTLR start "rule__ContentDefinition__Group__8__Impl"
    // InternalUpctforma.g:1575:1: rule__ContentDefinition__Group__8__Impl : ( ( rule__ContentDefinition__UnitAssignment_8 )? ) ;
    public final void rule__ContentDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1579:1: ( ( ( rule__ContentDefinition__UnitAssignment_8 )? ) )
            // InternalUpctforma.g:1580:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            {
            // InternalUpctforma.g:1580:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            // InternalUpctforma.g:1581:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getUnitAssignment_8()); 
            // InternalUpctforma.g:1582:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUpctforma.g:1582:3: rule__ContentDefinition__UnitAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContentDefinition__UnitAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContentDefinitionAccess().getUnitAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__8__Impl"


    // $ANTLR start "rule__ContentDefinition__Group__9"
    // InternalUpctforma.g:1590:1: rule__ContentDefinition__Group__9 : rule__ContentDefinition__Group__9__Impl ;
    public final void rule__ContentDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1594:1: ( rule__ContentDefinition__Group__9__Impl )
            // InternalUpctforma.g:1595:2: rule__ContentDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__9"


    // $ANTLR start "rule__ContentDefinition__Group__9__Impl"
    // InternalUpctforma.g:1601:1: rule__ContentDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1605:1: ( ( '}' ) )
            // InternalUpctforma.g:1606:1: ( '}' )
            {
            // InternalUpctforma.g:1606:1: ( '}' )
            // InternalUpctforma.g:1607:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group__9__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_4__0"
    // InternalUpctforma.g:1617:1: rule__ContentDefinition__Group_4__0 : rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 ;
    public final void rule__ContentDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1621:1: ( rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 )
            // InternalUpctforma.g:1622:2: rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__ContentDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_4__0"


    // $ANTLR start "rule__ContentDefinition__Group_4__0__Impl"
    // InternalUpctforma.g:1629:1: rule__ContentDefinition__Group_4__0__Impl : ( 'package' ) ;
    public final void rule__ContentDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1633:1: ( ( 'package' ) )
            // InternalUpctforma.g:1634:1: ( 'package' )
            {
            // InternalUpctforma.g:1634:1: ( 'package' )
            // InternalUpctforma.g:1635:2: 'package'
            {
             before(grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_4__1"
    // InternalUpctforma.g:1644:1: rule__ContentDefinition__Group_4__1 : rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 ;
    public final void rule__ContentDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1648:1: ( rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 )
            // InternalUpctforma.g:1649:2: rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__ContentDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_4__1"


    // $ANTLR start "rule__ContentDefinition__Group_4__1__Impl"
    // InternalUpctforma.g:1656:1: rule__ContentDefinition__Group_4__1__Impl : ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) ;
    public final void rule__ContentDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1660:1: ( ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) )
            // InternalUpctforma.g:1661:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            {
            // InternalUpctforma.g:1661:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            // InternalUpctforma.g:1662:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_4_1()); 
            // InternalUpctforma.g:1663:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            // InternalUpctforma.g:1663:3: rule__ContentDefinition__NameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_4__2"
    // InternalUpctforma.g:1671:1: rule__ContentDefinition__Group_4__2 : rule__ContentDefinition__Group_4__2__Impl ;
    public final void rule__ContentDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1675:1: ( rule__ContentDefinition__Group_4__2__Impl )
            // InternalUpctforma.g:1676:2: rule__ContentDefinition__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_4__2"


    // $ANTLR start "rule__ContentDefinition__Group_4__2__Impl"
    // InternalUpctforma.g:1682:1: rule__ContentDefinition__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ContentDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1686:1: ( ( ';' ) )
            // InternalUpctforma.g:1687:1: ( ';' )
            {
            // InternalUpctforma.g:1687:1: ( ';' )
            // InternalUpctforma.g:1688:2: ';'
            {
             before(grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5__0"
    // InternalUpctforma.g:1698:1: rule__ContentDefinition__Group_5__0 : rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 ;
    public final void rule__ContentDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1702:1: ( rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 )
            // InternalUpctforma.g:1703:2: rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__ContentDefinition__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5__0"


    // $ANTLR start "rule__ContentDefinition__Group_5__0__Impl"
    // InternalUpctforma.g:1710:1: rule__ContentDefinition__Group_5__0__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) ;
    public final void rule__ContentDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1714:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) )
            // InternalUpctforma.g:1715:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            {
            // InternalUpctforma.g:1715:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            // InternalUpctforma.g:1716:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_0()); 
            // InternalUpctforma.g:1717:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            // InternalUpctforma.g:1717:3: rule__ContentDefinition__ImportsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__ImportsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5__1"
    // InternalUpctforma.g:1725:1: rule__ContentDefinition__Group_5__1 : rule__ContentDefinition__Group_5__1__Impl ;
    public final void rule__ContentDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1729:1: ( rule__ContentDefinition__Group_5__1__Impl )
            // InternalUpctforma.g:1730:2: rule__ContentDefinition__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5__1"


    // $ANTLR start "rule__ContentDefinition__Group_5__1__Impl"
    // InternalUpctforma.g:1736:1: rule__ContentDefinition__Group_5__1__Impl : ( ( rule__ContentDefinition__Group_5_1__0 )* ) ;
    public final void rule__ContentDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1740:1: ( ( ( rule__ContentDefinition__Group_5_1__0 )* ) )
            // InternalUpctforma.g:1741:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            {
            // InternalUpctforma.g:1741:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            // InternalUpctforma.g:1742:2: ( rule__ContentDefinition__Group_5_1__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5_1()); 
            // InternalUpctforma.g:1743:2: ( rule__ContentDefinition__Group_5_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUpctforma.g:1743:3: rule__ContentDefinition__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getContentDefinitionAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__0"
    // InternalUpctforma.g:1752:1: rule__ContentDefinition__Group_5_1__0 : rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 ;
    public final void rule__ContentDefinition__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1756:1: ( rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 )
            // InternalUpctforma.g:1757:2: rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ContentDefinition__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5_1__0"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__0__Impl"
    // InternalUpctforma.g:1764:1: rule__ContentDefinition__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1768:1: ( ( ',' ) )
            // InternalUpctforma.g:1769:1: ( ',' )
            {
            // InternalUpctforma.g:1769:1: ( ',' )
            // InternalUpctforma.g:1770:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5_1__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__1"
    // InternalUpctforma.g:1779:1: rule__ContentDefinition__Group_5_1__1 : rule__ContentDefinition__Group_5_1__1__Impl ;
    public final void rule__ContentDefinition__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1783:1: ( rule__ContentDefinition__Group_5_1__1__Impl )
            // InternalUpctforma.g:1784:2: rule__ContentDefinition__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5_1__1"


    // $ANTLR start "rule__ContentDefinition__Group_5_1__1__Impl"
    // InternalUpctforma.g:1790:1: rule__ContentDefinition__Group_5_1__1__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) ;
    public final void rule__ContentDefinition__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1794:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) )
            // InternalUpctforma.g:1795:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            {
            // InternalUpctforma.g:1795:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            // InternalUpctforma.g:1796:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_1_1()); 
            // InternalUpctforma.g:1797:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            // InternalUpctforma.g:1797:3: rule__ContentDefinition__ImportsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__ImportsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_5_1__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__0"
    // InternalUpctforma.g:1806:1: rule__ContentDefinition__Group_6__0 : rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 ;
    public final void rule__ContentDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1810:1: ( rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 )
            // InternalUpctforma.g:1811:2: rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__ContentDefinition__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__0"


    // $ANTLR start "rule__ContentDefinition__Group_6__0__Impl"
    // InternalUpctforma.g:1818:1: rule__ContentDefinition__Group_6__0__Impl : ( 'types' ) ;
    public final void rule__ContentDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1822:1: ( ( 'types' ) )
            // InternalUpctforma.g:1823:1: ( 'types' )
            {
            // InternalUpctforma.g:1823:1: ( 'types' )
            // InternalUpctforma.g:1824:2: 'types'
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__1"
    // InternalUpctforma.g:1833:1: rule__ContentDefinition__Group_6__1 : rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 ;
    public final void rule__ContentDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1837:1: ( rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 )
            // InternalUpctforma.g:1838:2: rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__ContentDefinition__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__1"


    // $ANTLR start "rule__ContentDefinition__Group_6__1__Impl"
    // InternalUpctforma.g:1845:1: rule__ContentDefinition__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1849:1: ( ( '{' ) )
            // InternalUpctforma.g:1850:1: ( '{' )
            {
            // InternalUpctforma.g:1850:1: ( '{' )
            // InternalUpctforma.g:1851:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__2"
    // InternalUpctforma.g:1860:1: rule__ContentDefinition__Group_6__2 : rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 ;
    public final void rule__ContentDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1864:1: ( rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 )
            // InternalUpctforma.g:1865:2: rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__2"


    // $ANTLR start "rule__ContentDefinition__Group_6__2__Impl"
    // InternalUpctforma.g:1872:1: rule__ContentDefinition__Group_6__2__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) ;
    public final void rule__ContentDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1876:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) )
            // InternalUpctforma.g:1877:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            {
            // InternalUpctforma.g:1877:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            // InternalUpctforma.g:1878:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_2()); 
            // InternalUpctforma.g:1879:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            // InternalUpctforma.g:1879:3: rule__ContentDefinition__TypesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TypesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__3"
    // InternalUpctforma.g:1887:1: rule__ContentDefinition__Group_6__3 : rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 ;
    public final void rule__ContentDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1891:1: ( rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 )
            // InternalUpctforma.g:1892:2: rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__3"


    // $ANTLR start "rule__ContentDefinition__Group_6__3__Impl"
    // InternalUpctforma.g:1899:1: rule__ContentDefinition__Group_6__3__Impl : ( ( rule__ContentDefinition__Group_6_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1903:1: ( ( ( rule__ContentDefinition__Group_6_3__0 )* ) )
            // InternalUpctforma.g:1904:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            {
            // InternalUpctforma.g:1904:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            // InternalUpctforma.g:1905:2: ( rule__ContentDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6_3()); 
            // InternalUpctforma.g:1906:2: ( rule__ContentDefinition__Group_6_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUpctforma.g:1906:3: rule__ContentDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getContentDefinitionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__3__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6__4"
    // InternalUpctforma.g:1914:1: rule__ContentDefinition__Group_6__4 : rule__ContentDefinition__Group_6__4__Impl ;
    public final void rule__ContentDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1918:1: ( rule__ContentDefinition__Group_6__4__Impl )
            // InternalUpctforma.g:1919:2: rule__ContentDefinition__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__4"


    // $ANTLR start "rule__ContentDefinition__Group_6__4__Impl"
    // InternalUpctforma.g:1925:1: rule__ContentDefinition__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1929:1: ( ( '}' ) )
            // InternalUpctforma.g:1930:1: ( '}' )
            {
            // InternalUpctforma.g:1930:1: ( '}' )
            // InternalUpctforma.g:1931:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6__4__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__0"
    // InternalUpctforma.g:1941:1: rule__ContentDefinition__Group_6_3__0 : rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 ;
    public final void rule__ContentDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1945:1: ( rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 )
            // InternalUpctforma.g:1946:2: rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ContentDefinition__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6_3__0"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__0__Impl"
    // InternalUpctforma.g:1953:1: rule__ContentDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1957:1: ( ( ',' ) )
            // InternalUpctforma.g:1958:1: ( ',' )
            {
            // InternalUpctforma.g:1958:1: ( ',' )
            // InternalUpctforma.g:1959:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6_3__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__1"
    // InternalUpctforma.g:1968:1: rule__ContentDefinition__Group_6_3__1 : rule__ContentDefinition__Group_6_3__1__Impl ;
    public final void rule__ContentDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1972:1: ( rule__ContentDefinition__Group_6_3__1__Impl )
            // InternalUpctforma.g:1973:2: rule__ContentDefinition__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6_3__1"


    // $ANTLR start "rule__ContentDefinition__Group_6_3__1__Impl"
    // InternalUpctforma.g:1979:1: rule__ContentDefinition__Group_6_3__1__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1983:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) )
            // InternalUpctforma.g:1984:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            {
            // InternalUpctforma.g:1984:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            // InternalUpctforma.g:1985:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_3_1()); 
            // InternalUpctforma.g:1986:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            // InternalUpctforma.g:1986:3: rule__ContentDefinition__TypesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TypesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_6_3__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__0"
    // InternalUpctforma.g:1995:1: rule__ContentDefinition__Group_7__0 : rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 ;
    public final void rule__ContentDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1999:1: ( rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 )
            // InternalUpctforma.g:2000:2: rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__ContentDefinition__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__0"


    // $ANTLR start "rule__ContentDefinition__Group_7__0__Impl"
    // InternalUpctforma.g:2007:1: rule__ContentDefinition__Group_7__0__Impl : ( 'templates' ) ;
    public final void rule__ContentDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2011:1: ( ( 'templates' ) )
            // InternalUpctforma.g:2012:1: ( 'templates' )
            {
            // InternalUpctforma.g:2012:1: ( 'templates' )
            // InternalUpctforma.g:2013:2: 'templates'
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__1"
    // InternalUpctforma.g:2022:1: rule__ContentDefinition__Group_7__1 : rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 ;
    public final void rule__ContentDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2026:1: ( rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 )
            // InternalUpctforma.g:2027:2: rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2
            {
            pushFollow(FOLLOW_14);
            rule__ContentDefinition__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__1"


    // $ANTLR start "rule__ContentDefinition__Group_7__1__Impl"
    // InternalUpctforma.g:2034:1: rule__ContentDefinition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2038:1: ( ( '{' ) )
            // InternalUpctforma.g:2039:1: ( '{' )
            {
            // InternalUpctforma.g:2039:1: ( '{' )
            // InternalUpctforma.g:2040:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__1__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__2"
    // InternalUpctforma.g:2049:1: rule__ContentDefinition__Group_7__2 : rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 ;
    public final void rule__ContentDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2053:1: ( rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 )
            // InternalUpctforma.g:2054:2: rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__2"


    // $ANTLR start "rule__ContentDefinition__Group_7__2__Impl"
    // InternalUpctforma.g:2061:1: rule__ContentDefinition__Group_7__2__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) ;
    public final void rule__ContentDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2065:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) )
            // InternalUpctforma.g:2066:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            {
            // InternalUpctforma.g:2066:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            // InternalUpctforma.g:2067:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_2()); 
            // InternalUpctforma.g:2068:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            // InternalUpctforma.g:2068:3: rule__ContentDefinition__TemplatesAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TemplatesAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__2__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__3"
    // InternalUpctforma.g:2076:1: rule__ContentDefinition__Group_7__3 : rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 ;
    public final void rule__ContentDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2080:1: ( rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 )
            // InternalUpctforma.g:2081:2: rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4
            {
            pushFollow(FOLLOW_13);
            rule__ContentDefinition__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__3"


    // $ANTLR start "rule__ContentDefinition__Group_7__3__Impl"
    // InternalUpctforma.g:2088:1: rule__ContentDefinition__Group_7__3__Impl : ( ( rule__ContentDefinition__Group_7_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2092:1: ( ( ( rule__ContentDefinition__Group_7_3__0 )* ) )
            // InternalUpctforma.g:2093:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            {
            // InternalUpctforma.g:2093:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            // InternalUpctforma.g:2094:2: ( rule__ContentDefinition__Group_7_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7_3()); 
            // InternalUpctforma.g:2095:2: ( rule__ContentDefinition__Group_7_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUpctforma.g:2095:3: rule__ContentDefinition__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getContentDefinitionAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__3__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7__4"
    // InternalUpctforma.g:2103:1: rule__ContentDefinition__Group_7__4 : rule__ContentDefinition__Group_7__4__Impl ;
    public final void rule__ContentDefinition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2107:1: ( rule__ContentDefinition__Group_7__4__Impl )
            // InternalUpctforma.g:2108:2: rule__ContentDefinition__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__4"


    // $ANTLR start "rule__ContentDefinition__Group_7__4__Impl"
    // InternalUpctforma.g:2114:1: rule__ContentDefinition__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2118:1: ( ( '}' ) )
            // InternalUpctforma.g:2119:1: ( '}' )
            {
            // InternalUpctforma.g:2119:1: ( '}' )
            // InternalUpctforma.g:2120:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7__4__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__0"
    // InternalUpctforma.g:2130:1: rule__ContentDefinition__Group_7_3__0 : rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 ;
    public final void rule__ContentDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2134:1: ( rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 )
            // InternalUpctforma.g:2135:2: rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ContentDefinition__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7_3__0"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__0__Impl"
    // InternalUpctforma.g:2142:1: rule__ContentDefinition__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2146:1: ( ( ',' ) )
            // InternalUpctforma.g:2147:1: ( ',' )
            {
            // InternalUpctforma.g:2147:1: ( ',' )
            // InternalUpctforma.g:2148:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7_3__0__Impl"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__1"
    // InternalUpctforma.g:2157:1: rule__ContentDefinition__Group_7_3__1 : rule__ContentDefinition__Group_7_3__1__Impl ;
    public final void rule__ContentDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2161:1: ( rule__ContentDefinition__Group_7_3__1__Impl )
            // InternalUpctforma.g:2162:2: rule__ContentDefinition__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7_3__1"


    // $ANTLR start "rule__ContentDefinition__Group_7_3__1__Impl"
    // InternalUpctforma.g:2168:1: rule__ContentDefinition__Group_7_3__1__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2172:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) )
            // InternalUpctforma.g:2173:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            {
            // InternalUpctforma.g:2173:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            // InternalUpctforma.g:2174:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_3_1()); 
            // InternalUpctforma.g:2175:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            // InternalUpctforma.g:2175:3: rule__ContentDefinition__TemplatesAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentDefinition__TemplatesAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__Group_7_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUpctforma.g:2184:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2188:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUpctforma.g:2189:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalUpctforma.g:2196:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2200:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:2201:1: ( RULE_ID )
            {
            // InternalUpctforma.g:2201:1: ( RULE_ID )
            // InternalUpctforma.g:2202:2: RULE_ID
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
    // InternalUpctforma.g:2211:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2215:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUpctforma.g:2216:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUpctforma.g:2222:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2226:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUpctforma.g:2227:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUpctforma.g:2227:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUpctforma.g:2228:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUpctforma.g:2229:2: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUpctforma.g:2229:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalUpctforma.g:2238:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2242:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUpctforma.g:2243:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUpctforma.g:2250:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2254:1: ( ( '.' ) )
            // InternalUpctforma.g:2255:1: ( '.' )
            {
            // InternalUpctforma.g:2255:1: ( '.' )
            // InternalUpctforma.g:2256:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctforma.g:2265:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2269:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUpctforma.g:2270:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUpctforma.g:2276:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2280:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:2281:1: ( RULE_ID )
            {
            // InternalUpctforma.g:2281:1: ( RULE_ID )
            // InternalUpctforma.g:2282:2: RULE_ID
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalUpctforma.g:2292:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2296:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalUpctforma.g:2297:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalUpctforma.g:2304:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2308:1: ( ( 'import' ) )
            // InternalUpctforma.g:2309:1: ( 'import' )
            {
            // InternalUpctforma.g:2309:1: ( 'import' )
            // InternalUpctforma.g:2310:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalUpctforma.g:2319:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2323:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalUpctforma.g:2324:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalUpctforma.g:2331:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2335:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalUpctforma.g:2336:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalUpctforma.g:2336:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalUpctforma.g:2337:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalUpctforma.g:2338:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalUpctforma.g:2338:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalUpctforma.g:2346:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2350:1: ( rule__Import__Group__2__Impl )
            // InternalUpctforma.g:2351:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalUpctforma.g:2357:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2361:1: ( ( ';' ) )
            // InternalUpctforma.g:2362:1: ( ';' )
            {
            // InternalUpctforma.g:2362:1: ( ';' )
            // InternalUpctforma.g:2363:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalUpctforma.g:2373:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2377:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalUpctforma.g:2378:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalUpctforma.g:2385:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2389:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:2390:1: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:2390:1: ( ruleQualifiedName )
            // InternalUpctforma.g:2391:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalUpctforma.g:2400:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2404:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalUpctforma.g:2405:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalUpctforma.g:2411:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2415:1: ( ( ( '.*' )? ) )
            // InternalUpctforma.g:2416:1: ( ( '.*' )? )
            {
            // InternalUpctforma.g:2416:1: ( ( '.*' )? )
            // InternalUpctforma.g:2417:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalUpctforma.g:2418:2: ( '.*' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctforma.g:2418:3: '.*'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__TemplateDef__Group__0"
    // InternalUpctforma.g:2427:1: rule__TemplateDef__Group__0 : rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 ;
    public final void rule__TemplateDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2431:1: ( rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 )
            // InternalUpctforma.g:2432:2: rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TemplateDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__0"


    // $ANTLR start "rule__TemplateDef__Group__0__Impl"
    // InternalUpctforma.g:2439:1: rule__TemplateDef__Group__0__Impl : ( () ) ;
    public final void rule__TemplateDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2443:1: ( ( () ) )
            // InternalUpctforma.g:2444:1: ( () )
            {
            // InternalUpctforma.g:2444:1: ( () )
            // InternalUpctforma.g:2445:2: ()
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefAction_0()); 
            // InternalUpctforma.g:2446:2: ()
            // InternalUpctforma.g:2446:3: 
            {
            }

             after(grammarAccess.getTemplateDefAccess().getTemplateDefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__0__Impl"


    // $ANTLR start "rule__TemplateDef__Group__1"
    // InternalUpctforma.g:2454:1: rule__TemplateDef__Group__1 : rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 ;
    public final void rule__TemplateDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2458:1: ( rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 )
            // InternalUpctforma.g:2459:2: rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TemplateDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__1"


    // $ANTLR start "rule__TemplateDef__Group__1__Impl"
    // InternalUpctforma.g:2466:1: rule__TemplateDef__Group__1__Impl : ( 'TemplateDef' ) ;
    public final void rule__TemplateDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2470:1: ( ( 'TemplateDef' ) )
            // InternalUpctforma.g:2471:1: ( 'TemplateDef' )
            {
            // InternalUpctforma.g:2471:1: ( 'TemplateDef' )
            // InternalUpctforma.g:2472:2: 'TemplateDef'
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__1__Impl"


    // $ANTLR start "rule__TemplateDef__Group__2"
    // InternalUpctforma.g:2481:1: rule__TemplateDef__Group__2 : rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 ;
    public final void rule__TemplateDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2485:1: ( rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 )
            // InternalUpctforma.g:2486:2: rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TemplateDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__2"


    // $ANTLR start "rule__TemplateDef__Group__2__Impl"
    // InternalUpctforma.g:2493:1: rule__TemplateDef__Group__2__Impl : ( ( rule__TemplateDef__NameAssignment_2 ) ) ;
    public final void rule__TemplateDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2497:1: ( ( ( rule__TemplateDef__NameAssignment_2 ) ) )
            // InternalUpctforma.g:2498:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:2498:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            // InternalUpctforma.g:2499:2: ( rule__TemplateDef__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateDefAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:2500:2: ( rule__TemplateDef__NameAssignment_2 )
            // InternalUpctforma.g:2500:3: rule__TemplateDef__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__2__Impl"


    // $ANTLR start "rule__TemplateDef__Group__3"
    // InternalUpctforma.g:2508:1: rule__TemplateDef__Group__3 : rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 ;
    public final void rule__TemplateDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2512:1: ( rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 )
            // InternalUpctforma.g:2513:2: rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__TemplateDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__3"


    // $ANTLR start "rule__TemplateDef__Group__3__Impl"
    // InternalUpctforma.g:2520:1: rule__TemplateDef__Group__3__Impl : ( '{' ) ;
    public final void rule__TemplateDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2524:1: ( ( '{' ) )
            // InternalUpctforma.g:2525:1: ( '{' )
            {
            // InternalUpctforma.g:2525:1: ( '{' )
            // InternalUpctforma.g:2526:2: '{'
            {
             before(grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__3__Impl"


    // $ANTLR start "rule__TemplateDef__Group__4"
    // InternalUpctforma.g:2535:1: rule__TemplateDef__Group__4 : rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 ;
    public final void rule__TemplateDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2539:1: ( rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 )
            // InternalUpctforma.g:2540:2: rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__TemplateDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__4"


    // $ANTLR start "rule__TemplateDef__Group__4__Impl"
    // InternalUpctforma.g:2547:1: rule__TemplateDef__Group__4__Impl : ( ( rule__TemplateDef__Group_4__0 )? ) ;
    public final void rule__TemplateDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2551:1: ( ( ( rule__TemplateDef__Group_4__0 )? ) )
            // InternalUpctforma.g:2552:1: ( ( rule__TemplateDef__Group_4__0 )? )
            {
            // InternalUpctforma.g:2552:1: ( ( rule__TemplateDef__Group_4__0 )? )
            // InternalUpctforma.g:2553:2: ( rule__TemplateDef__Group_4__0 )?
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4()); 
            // InternalUpctforma.g:2554:2: ( rule__TemplateDef__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUpctforma.g:2554:3: rule__TemplateDef__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TemplateDef__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTemplateDefAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__4__Impl"


    // $ANTLR start "rule__TemplateDef__Group__5"
    // InternalUpctforma.g:2562:1: rule__TemplateDef__Group__5 : rule__TemplateDef__Group__5__Impl ;
    public final void rule__TemplateDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2566:1: ( rule__TemplateDef__Group__5__Impl )
            // InternalUpctforma.g:2567:2: rule__TemplateDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__5"


    // $ANTLR start "rule__TemplateDef__Group__5__Impl"
    // InternalUpctforma.g:2573:1: rule__TemplateDef__Group__5__Impl : ( '}' ) ;
    public final void rule__TemplateDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2577:1: ( ( '}' ) )
            // InternalUpctforma.g:2578:1: ( '}' )
            {
            // InternalUpctforma.g:2578:1: ( '}' )
            // InternalUpctforma.g:2579:2: '}'
            {
             before(grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group__5__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4__0"
    // InternalUpctforma.g:2589:1: rule__TemplateDef__Group_4__0 : rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 ;
    public final void rule__TemplateDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2593:1: ( rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 )
            // InternalUpctforma.g:2594:2: rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__TemplateDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4__0"


    // $ANTLR start "rule__TemplateDef__Group_4__0__Impl"
    // InternalUpctforma.g:2601:1: rule__TemplateDef__Group_4__0__Impl : ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) ;
    public final void rule__TemplateDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2605:1: ( ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) )
            // InternalUpctforma.g:2606:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:2606:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            // InternalUpctforma.g:2607:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_0()); 
            // InternalUpctforma.g:2608:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            // InternalUpctforma.g:2608:3: rule__TemplateDef__RowsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__RowsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4__0__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4__1"
    // InternalUpctforma.g:2616:1: rule__TemplateDef__Group_4__1 : rule__TemplateDef__Group_4__1__Impl ;
    public final void rule__TemplateDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2620:1: ( rule__TemplateDef__Group_4__1__Impl )
            // InternalUpctforma.g:2621:2: rule__TemplateDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4__1"


    // $ANTLR start "rule__TemplateDef__Group_4__1__Impl"
    // InternalUpctforma.g:2627:1: rule__TemplateDef__Group_4__1__Impl : ( ( rule__TemplateDef__Group_4_1__0 )* ) ;
    public final void rule__TemplateDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2631:1: ( ( ( rule__TemplateDef__Group_4_1__0 )* ) )
            // InternalUpctforma.g:2632:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:2632:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            // InternalUpctforma.g:2633:2: ( rule__TemplateDef__Group_4_1__0 )*
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4_1()); 
            // InternalUpctforma.g:2634:2: ( rule__TemplateDef__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUpctforma.g:2634:3: rule__TemplateDef__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TemplateDef__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getTemplateDefAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4__1__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4_1__0"
    // InternalUpctforma.g:2643:1: rule__TemplateDef__Group_4_1__0 : rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 ;
    public final void rule__TemplateDef__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2647:1: ( rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 )
            // InternalUpctforma.g:2648:2: rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1
            {
            pushFollow(FOLLOW_19);
            rule__TemplateDef__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4_1__0"


    // $ANTLR start "rule__TemplateDef__Group_4_1__0__Impl"
    // InternalUpctforma.g:2655:1: rule__TemplateDef__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateDef__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2659:1: ( ( ',' ) )
            // InternalUpctforma.g:2660:1: ( ',' )
            {
            // InternalUpctforma.g:2660:1: ( ',' )
            // InternalUpctforma.g:2661:2: ','
            {
             before(grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4_1__0__Impl"


    // $ANTLR start "rule__TemplateDef__Group_4_1__1"
    // InternalUpctforma.g:2670:1: rule__TemplateDef__Group_4_1__1 : rule__TemplateDef__Group_4_1__1__Impl ;
    public final void rule__TemplateDef__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2674:1: ( rule__TemplateDef__Group_4_1__1__Impl )
            // InternalUpctforma.g:2675:2: rule__TemplateDef__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4_1__1"


    // $ANTLR start "rule__TemplateDef__Group_4_1__1__Impl"
    // InternalUpctforma.g:2681:1: rule__TemplateDef__Group_4_1__1__Impl : ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) ;
    public final void rule__TemplateDef__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2685:1: ( ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:2686:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:2686:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            // InternalUpctforma.g:2687:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_1_1()); 
            // InternalUpctforma.g:2688:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            // InternalUpctforma.g:2688:3: rule__TemplateDef__RowsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TemplateDef__RowsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__Group_4_1__1__Impl"


    // $ANTLR start "rule__ContentUnit__Group__0"
    // InternalUpctforma.g:2697:1: rule__ContentUnit__Group__0 : rule__ContentUnit__Group__0__Impl rule__ContentUnit__Group__1 ;
    public final void rule__ContentUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2701:1: ( rule__ContentUnit__Group__0__Impl rule__ContentUnit__Group__1 )
            // InternalUpctforma.g:2702:2: rule__ContentUnit__Group__0__Impl rule__ContentUnit__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ContentUnit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__0"


    // $ANTLR start "rule__ContentUnit__Group__0__Impl"
    // InternalUpctforma.g:2709:1: rule__ContentUnit__Group__0__Impl : ( 'Unit' ) ;
    public final void rule__ContentUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2713:1: ( ( 'Unit' ) )
            // InternalUpctforma.g:2714:1: ( 'Unit' )
            {
            // InternalUpctforma.g:2714:1: ( 'Unit' )
            // InternalUpctforma.g:2715:2: 'Unit'
            {
             before(grammarAccess.getContentUnitAccess().getUnitKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContentUnitAccess().getUnitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__0__Impl"


    // $ANTLR start "rule__ContentUnit__Group__1"
    // InternalUpctforma.g:2724:1: rule__ContentUnit__Group__1 : rule__ContentUnit__Group__1__Impl rule__ContentUnit__Group__2 ;
    public final void rule__ContentUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2728:1: ( rule__ContentUnit__Group__1__Impl rule__ContentUnit__Group__2 )
            // InternalUpctforma.g:2729:2: rule__ContentUnit__Group__1__Impl rule__ContentUnit__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ContentUnit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__1"


    // $ANTLR start "rule__ContentUnit__Group__1__Impl"
    // InternalUpctforma.g:2736:1: rule__ContentUnit__Group__1__Impl : ( ( rule__ContentUnit__NameAssignment_1 ) ) ;
    public final void rule__ContentUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2740:1: ( ( ( rule__ContentUnit__NameAssignment_1 ) ) )
            // InternalUpctforma.g:2741:1: ( ( rule__ContentUnit__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:2741:1: ( ( rule__ContentUnit__NameAssignment_1 ) )
            // InternalUpctforma.g:2742:2: ( rule__ContentUnit__NameAssignment_1 )
            {
             before(grammarAccess.getContentUnitAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:2743:2: ( rule__ContentUnit__NameAssignment_1 )
            // InternalUpctforma.g:2743:3: rule__ContentUnit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__1__Impl"


    // $ANTLR start "rule__ContentUnit__Group__2"
    // InternalUpctforma.g:2751:1: rule__ContentUnit__Group__2 : rule__ContentUnit__Group__2__Impl rule__ContentUnit__Group__3 ;
    public final void rule__ContentUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2755:1: ( rule__ContentUnit__Group__2__Impl rule__ContentUnit__Group__3 )
            // InternalUpctforma.g:2756:2: rule__ContentUnit__Group__2__Impl rule__ContentUnit__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ContentUnit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__2"


    // $ANTLR start "rule__ContentUnit__Group__2__Impl"
    // InternalUpctforma.g:2763:1: rule__ContentUnit__Group__2__Impl : ( ( rule__ContentUnit__AuthorAssignment_2 ) ) ;
    public final void rule__ContentUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2767:1: ( ( ( rule__ContentUnit__AuthorAssignment_2 ) ) )
            // InternalUpctforma.g:2768:1: ( ( rule__ContentUnit__AuthorAssignment_2 ) )
            {
            // InternalUpctforma.g:2768:1: ( ( rule__ContentUnit__AuthorAssignment_2 ) )
            // InternalUpctforma.g:2769:2: ( rule__ContentUnit__AuthorAssignment_2 )
            {
             before(grammarAccess.getContentUnitAccess().getAuthorAssignment_2()); 
            // InternalUpctforma.g:2770:2: ( rule__ContentUnit__AuthorAssignment_2 )
            // InternalUpctforma.g:2770:3: rule__ContentUnit__AuthorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__AuthorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getAuthorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__2__Impl"


    // $ANTLR start "rule__ContentUnit__Group__3"
    // InternalUpctforma.g:2778:1: rule__ContentUnit__Group__3 : rule__ContentUnit__Group__3__Impl rule__ContentUnit__Group__4 ;
    public final void rule__ContentUnit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2782:1: ( rule__ContentUnit__Group__3__Impl rule__ContentUnit__Group__4 )
            // InternalUpctforma.g:2783:2: rule__ContentUnit__Group__3__Impl rule__ContentUnit__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ContentUnit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__3"


    // $ANTLR start "rule__ContentUnit__Group__3__Impl"
    // InternalUpctforma.g:2790:1: rule__ContentUnit__Group__3__Impl : ( ( rule__ContentUnit__TypeAssignment_3 ) ) ;
    public final void rule__ContentUnit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2794:1: ( ( ( rule__ContentUnit__TypeAssignment_3 ) ) )
            // InternalUpctforma.g:2795:1: ( ( rule__ContentUnit__TypeAssignment_3 ) )
            {
            // InternalUpctforma.g:2795:1: ( ( rule__ContentUnit__TypeAssignment_3 ) )
            // InternalUpctforma.g:2796:2: ( rule__ContentUnit__TypeAssignment_3 )
            {
             before(grammarAccess.getContentUnitAccess().getTypeAssignment_3()); 
            // InternalUpctforma.g:2797:2: ( rule__ContentUnit__TypeAssignment_3 )
            // InternalUpctforma.g:2797:3: rule__ContentUnit__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__3__Impl"


    // $ANTLR start "rule__ContentUnit__Group__4"
    // InternalUpctforma.g:2805:1: rule__ContentUnit__Group__4 : rule__ContentUnit__Group__4__Impl rule__ContentUnit__Group__5 ;
    public final void rule__ContentUnit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2809:1: ( rule__ContentUnit__Group__4__Impl rule__ContentUnit__Group__5 )
            // InternalUpctforma.g:2810:2: rule__ContentUnit__Group__4__Impl rule__ContentUnit__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__ContentUnit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__4"


    // $ANTLR start "rule__ContentUnit__Group__4__Impl"
    // InternalUpctforma.g:2817:1: rule__ContentUnit__Group__4__Impl : ( ( rule__ContentUnit__LanguageAssignment_4 ) ) ;
    public final void rule__ContentUnit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2821:1: ( ( ( rule__ContentUnit__LanguageAssignment_4 ) ) )
            // InternalUpctforma.g:2822:1: ( ( rule__ContentUnit__LanguageAssignment_4 ) )
            {
            // InternalUpctforma.g:2822:1: ( ( rule__ContentUnit__LanguageAssignment_4 ) )
            // InternalUpctforma.g:2823:2: ( rule__ContentUnit__LanguageAssignment_4 )
            {
             before(grammarAccess.getContentUnitAccess().getLanguageAssignment_4()); 
            // InternalUpctforma.g:2824:2: ( rule__ContentUnit__LanguageAssignment_4 )
            // InternalUpctforma.g:2824:3: rule__ContentUnit__LanguageAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__LanguageAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getLanguageAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__4__Impl"


    // $ANTLR start "rule__ContentUnit__Group__5"
    // InternalUpctforma.g:2832:1: rule__ContentUnit__Group__5 : rule__ContentUnit__Group__5__Impl rule__ContentUnit__Group__6 ;
    public final void rule__ContentUnit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2836:1: ( rule__ContentUnit__Group__5__Impl rule__ContentUnit__Group__6 )
            // InternalUpctforma.g:2837:2: rule__ContentUnit__Group__5__Impl rule__ContentUnit__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__ContentUnit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__5"


    // $ANTLR start "rule__ContentUnit__Group__5__Impl"
    // InternalUpctforma.g:2844:1: rule__ContentUnit__Group__5__Impl : ( '{' ) ;
    public final void rule__ContentUnit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2848:1: ( ( '{' ) )
            // InternalUpctforma.g:2849:1: ( '{' )
            {
            // InternalUpctforma.g:2849:1: ( '{' )
            // InternalUpctforma.g:2850:2: '{'
            {
             before(grammarAccess.getContentUnitAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getContentUnitAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__5__Impl"


    // $ANTLR start "rule__ContentUnit__Group__6"
    // InternalUpctforma.g:2859:1: rule__ContentUnit__Group__6 : rule__ContentUnit__Group__6__Impl rule__ContentUnit__Group__7 ;
    public final void rule__ContentUnit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2863:1: ( rule__ContentUnit__Group__6__Impl rule__ContentUnit__Group__7 )
            // InternalUpctforma.g:2864:2: rule__ContentUnit__Group__6__Impl rule__ContentUnit__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__ContentUnit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__6"


    // $ANTLR start "rule__ContentUnit__Group__6__Impl"
    // InternalUpctforma.g:2871:1: rule__ContentUnit__Group__6__Impl : ( ( rule__ContentUnit__SectionsAssignment_6 ) ) ;
    public final void rule__ContentUnit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2875:1: ( ( ( rule__ContentUnit__SectionsAssignment_6 ) ) )
            // InternalUpctforma.g:2876:1: ( ( rule__ContentUnit__SectionsAssignment_6 ) )
            {
            // InternalUpctforma.g:2876:1: ( ( rule__ContentUnit__SectionsAssignment_6 ) )
            // InternalUpctforma.g:2877:2: ( rule__ContentUnit__SectionsAssignment_6 )
            {
             before(grammarAccess.getContentUnitAccess().getSectionsAssignment_6()); 
            // InternalUpctforma.g:2878:2: ( rule__ContentUnit__SectionsAssignment_6 )
            // InternalUpctforma.g:2878:3: rule__ContentUnit__SectionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__SectionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getSectionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__6__Impl"


    // $ANTLR start "rule__ContentUnit__Group__7"
    // InternalUpctforma.g:2886:1: rule__ContentUnit__Group__7 : rule__ContentUnit__Group__7__Impl rule__ContentUnit__Group__8 ;
    public final void rule__ContentUnit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2890:1: ( rule__ContentUnit__Group__7__Impl rule__ContentUnit__Group__8 )
            // InternalUpctforma.g:2891:2: rule__ContentUnit__Group__7__Impl rule__ContentUnit__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__ContentUnit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__7"


    // $ANTLR start "rule__ContentUnit__Group__7__Impl"
    // InternalUpctforma.g:2898:1: rule__ContentUnit__Group__7__Impl : ( ( rule__ContentUnit__Group_7__0 )* ) ;
    public final void rule__ContentUnit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2902:1: ( ( ( rule__ContentUnit__Group_7__0 )* ) )
            // InternalUpctforma.g:2903:1: ( ( rule__ContentUnit__Group_7__0 )* )
            {
            // InternalUpctforma.g:2903:1: ( ( rule__ContentUnit__Group_7__0 )* )
            // InternalUpctforma.g:2904:2: ( rule__ContentUnit__Group_7__0 )*
            {
             before(grammarAccess.getContentUnitAccess().getGroup_7()); 
            // InternalUpctforma.g:2905:2: ( rule__ContentUnit__Group_7__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUpctforma.g:2905:3: rule__ContentUnit__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentUnit__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getContentUnitAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__7__Impl"


    // $ANTLR start "rule__ContentUnit__Group__8"
    // InternalUpctforma.g:2913:1: rule__ContentUnit__Group__8 : rule__ContentUnit__Group__8__Impl ;
    public final void rule__ContentUnit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2917:1: ( rule__ContentUnit__Group__8__Impl )
            // InternalUpctforma.g:2918:2: rule__ContentUnit__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__8"


    // $ANTLR start "rule__ContentUnit__Group__8__Impl"
    // InternalUpctforma.g:2924:1: rule__ContentUnit__Group__8__Impl : ( '}' ) ;
    public final void rule__ContentUnit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2928:1: ( ( '}' ) )
            // InternalUpctforma.g:2929:1: ( '}' )
            {
            // InternalUpctforma.g:2929:1: ( '}' )
            // InternalUpctforma.g:2930:2: '}'
            {
             before(grammarAccess.getContentUnitAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getContentUnitAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group__8__Impl"


    // $ANTLR start "rule__ContentUnit__Group_7__0"
    // InternalUpctforma.g:2940:1: rule__ContentUnit__Group_7__0 : rule__ContentUnit__Group_7__0__Impl rule__ContentUnit__Group_7__1 ;
    public final void rule__ContentUnit__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2944:1: ( rule__ContentUnit__Group_7__0__Impl rule__ContentUnit__Group_7__1 )
            // InternalUpctforma.g:2945:2: rule__ContentUnit__Group_7__0__Impl rule__ContentUnit__Group_7__1
            {
            pushFollow(FOLLOW_22);
            rule__ContentUnit__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_7__0"


    // $ANTLR start "rule__ContentUnit__Group_7__0__Impl"
    // InternalUpctforma.g:2952:1: rule__ContentUnit__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ContentUnit__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2956:1: ( ( ',' ) )
            // InternalUpctforma.g:2957:1: ( ',' )
            {
            // InternalUpctforma.g:2957:1: ( ',' )
            // InternalUpctforma.g:2958:2: ','
            {
             before(grammarAccess.getContentUnitAccess().getCommaKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContentUnitAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_7__0__Impl"


    // $ANTLR start "rule__ContentUnit__Group_7__1"
    // InternalUpctforma.g:2967:1: rule__ContentUnit__Group_7__1 : rule__ContentUnit__Group_7__1__Impl ;
    public final void rule__ContentUnit__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2971:1: ( rule__ContentUnit__Group_7__1__Impl )
            // InternalUpctforma.g:2972:2: rule__ContentUnit__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_7__1"


    // $ANTLR start "rule__ContentUnit__Group_7__1__Impl"
    // InternalUpctforma.g:2978:1: rule__ContentUnit__Group_7__1__Impl : ( ( rule__ContentUnit__SectionsAssignment_7_1 ) ) ;
    public final void rule__ContentUnit__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2982:1: ( ( ( rule__ContentUnit__SectionsAssignment_7_1 ) ) )
            // InternalUpctforma.g:2983:1: ( ( rule__ContentUnit__SectionsAssignment_7_1 ) )
            {
            // InternalUpctforma.g:2983:1: ( ( rule__ContentUnit__SectionsAssignment_7_1 ) )
            // InternalUpctforma.g:2984:2: ( rule__ContentUnit__SectionsAssignment_7_1 )
            {
             before(grammarAccess.getContentUnitAccess().getSectionsAssignment_7_1()); 
            // InternalUpctforma.g:2985:2: ( rule__ContentUnit__SectionsAssignment_7_1 )
            // InternalUpctforma.g:2985:3: rule__ContentUnit__SectionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__SectionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getSectionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_7__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalUpctforma.g:2994:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2998:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalUpctforma.g:2999:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalUpctforma.g:3006:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3010:1: ( ( () ) )
            // InternalUpctforma.g:3011:1: ( () )
            {
            // InternalUpctforma.g:3011:1: ( () )
            // InternalUpctforma.g:3012:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalUpctforma.g:3013:2: ()
            // InternalUpctforma.g:3013:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalUpctforma.g:3021:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3025:1: ( rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 )
            // InternalUpctforma.g:3026:2: rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalUpctforma.g:3033:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3037:1: ( ( 'Type' ) )
            // InternalUpctforma.g:3038:1: ( 'Type' )
            {
            // InternalUpctforma.g:3038:1: ( 'Type' )
            // InternalUpctforma.g:3039:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__2"
    // InternalUpctforma.g:3048:1: rule__Type_Impl__Group__2 : rule__Type_Impl__Group__2__Impl ;
    public final void rule__Type_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3052:1: ( rule__Type_Impl__Group__2__Impl )
            // InternalUpctforma.g:3053:2: rule__Type_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2"


    // $ANTLR start "rule__Type_Impl__Group__2__Impl"
    // InternalUpctforma.g:3059:1: rule__Type_Impl__Group__2__Impl : ( ( rule__Type_Impl__NameAssignment_2 ) ) ;
    public final void rule__Type_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3063:1: ( ( ( rule__Type_Impl__NameAssignment_2 ) ) )
            // InternalUpctforma.g:3064:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:3064:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            // InternalUpctforma.g:3065:2: ( rule__Type_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:3066:2: ( rule__Type_Impl__NameAssignment_2 )
            // InternalUpctforma.g:3066:3: rule__Type_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalUpctforma.g:3075:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3079:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalUpctforma.g:3080:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalUpctforma.g:3087:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3091:1: ( ( () ) )
            // InternalUpctforma.g:3092:1: ( () )
            {
            // InternalUpctforma.g:3092:1: ( () )
            // InternalUpctforma.g:3093:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_0()); 
            // InternalUpctforma.g:3094:2: ()
            // InternalUpctforma.g:3094:3: 
            {
            }

             after(grammarAccess.getRowAccess().getRowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalUpctforma.g:3102:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3106:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalUpctforma.g:3107:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalUpctforma.g:3114:1: rule__Row__Group__1__Impl : ( 'row' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3118:1: ( ( 'row' ) )
            // InternalUpctforma.g:3119:1: ( 'row' )
            {
            // InternalUpctforma.g:3119:1: ( 'row' )
            // InternalUpctforma.g:3120:2: 'row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalUpctforma.g:3129:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3133:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalUpctforma.g:3134:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalUpctforma.g:3141:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3145:1: ( ( '{' ) )
            // InternalUpctforma.g:3146:1: ( '{' )
            {
            // InternalUpctforma.g:3146:1: ( '{' )
            // InternalUpctforma.g:3147:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalUpctforma.g:3156:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3160:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalUpctforma.g:3161:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Row__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalUpctforma.g:3168:1: rule__Row__Group__3__Impl : ( ( rule__Row__Group_3__0 )? ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3172:1: ( ( ( rule__Row__Group_3__0 )? ) )
            // InternalUpctforma.g:3173:1: ( ( rule__Row__Group_3__0 )? )
            {
            // InternalUpctforma.g:3173:1: ( ( rule__Row__Group_3__0 )? )
            // InternalUpctforma.g:3174:2: ( rule__Row__Group_3__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_3()); 
            // InternalUpctforma.g:3175:2: ( rule__Row__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctforma.g:3175:3: rule__Row__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group__4"
    // InternalUpctforma.g:3183:1: rule__Row__Group__4 : rule__Row__Group__4__Impl rule__Row__Group__5 ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3187:1: ( rule__Row__Group__4__Impl rule__Row__Group__5 )
            // InternalUpctforma.g:3188:2: rule__Row__Group__4__Impl rule__Row__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Row__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4"


    // $ANTLR start "rule__Row__Group__4__Impl"
    // InternalUpctforma.g:3195:1: rule__Row__Group__4__Impl : ( ( rule__Row__Group_4__0 )? ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3199:1: ( ( ( rule__Row__Group_4__0 )? ) )
            // InternalUpctforma.g:3200:1: ( ( rule__Row__Group_4__0 )? )
            {
            // InternalUpctforma.g:3200:1: ( ( rule__Row__Group_4__0 )? )
            // InternalUpctforma.g:3201:2: ( rule__Row__Group_4__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_4()); 
            // InternalUpctforma.g:3202:2: ( rule__Row__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctforma.g:3202:3: rule__Row__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__4__Impl"


    // $ANTLR start "rule__Row__Group__5"
    // InternalUpctforma.g:3210:1: rule__Row__Group__5 : rule__Row__Group__5__Impl ;
    public final void rule__Row__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3214:1: ( rule__Row__Group__5__Impl )
            // InternalUpctforma.g:3215:2: rule__Row__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__5"


    // $ANTLR start "rule__Row__Group__5__Impl"
    // InternalUpctforma.g:3221:1: rule__Row__Group__5__Impl : ( '}' ) ;
    public final void rule__Row__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3225:1: ( ( '}' ) )
            // InternalUpctforma.g:3226:1: ( '}' )
            {
            // InternalUpctforma.g:3226:1: ( '}' )
            // InternalUpctforma.g:3227:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__5__Impl"


    // $ANTLR start "rule__Row__Group_3__0"
    // InternalUpctforma.g:3237:1: rule__Row__Group_3__0 : rule__Row__Group_3__0__Impl rule__Row__Group_3__1 ;
    public final void rule__Row__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3241:1: ( rule__Row__Group_3__0__Impl rule__Row__Group_3__1 )
            // InternalUpctforma.g:3242:2: rule__Row__Group_3__0__Impl rule__Row__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Row__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3__0"


    // $ANTLR start "rule__Row__Group_3__0__Impl"
    // InternalUpctforma.g:3249:1: rule__Row__Group_3__0__Impl : ( ( rule__Row__ColumnsAssignment_3_0 ) ) ;
    public final void rule__Row__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3253:1: ( ( ( rule__Row__ColumnsAssignment_3_0 ) ) )
            // InternalUpctforma.g:3254:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            {
            // InternalUpctforma.g:3254:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            // InternalUpctforma.g:3255:2: ( rule__Row__ColumnsAssignment_3_0 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_0()); 
            // InternalUpctforma.g:3256:2: ( rule__Row__ColumnsAssignment_3_0 )
            // InternalUpctforma.g:3256:3: rule__Row__ColumnsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3__0__Impl"


    // $ANTLR start "rule__Row__Group_3__1"
    // InternalUpctforma.g:3264:1: rule__Row__Group_3__1 : rule__Row__Group_3__1__Impl ;
    public final void rule__Row__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3268:1: ( rule__Row__Group_3__1__Impl )
            // InternalUpctforma.g:3269:2: rule__Row__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3__1"


    // $ANTLR start "rule__Row__Group_3__1__Impl"
    // InternalUpctforma.g:3275:1: rule__Row__Group_3__1__Impl : ( ( rule__Row__Group_3_1__0 )* ) ;
    public final void rule__Row__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3279:1: ( ( ( rule__Row__Group_3_1__0 )* ) )
            // InternalUpctforma.g:3280:1: ( ( rule__Row__Group_3_1__0 )* )
            {
            // InternalUpctforma.g:3280:1: ( ( rule__Row__Group_3_1__0 )* )
            // InternalUpctforma.g:3281:2: ( rule__Row__Group_3_1__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_3_1()); 
            // InternalUpctforma.g:3282:2: ( rule__Row__Group_3_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUpctforma.g:3282:3: rule__Row__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Row__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3__1__Impl"


    // $ANTLR start "rule__Row__Group_3_1__0"
    // InternalUpctforma.g:3291:1: rule__Row__Group_3_1__0 : rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 ;
    public final void rule__Row__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3295:1: ( rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 )
            // InternalUpctforma.g:3296:2: rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Row__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__0"


    // $ANTLR start "rule__Row__Group_3_1__0__Impl"
    // InternalUpctforma.g:3303:1: rule__Row__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3307:1: ( ( ',' ) )
            // InternalUpctforma.g:3308:1: ( ',' )
            {
            // InternalUpctforma.g:3308:1: ( ',' )
            // InternalUpctforma.g:3309:2: ','
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_3_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__0__Impl"


    // $ANTLR start "rule__Row__Group_3_1__1"
    // InternalUpctforma.g:3318:1: rule__Row__Group_3_1__1 : rule__Row__Group_3_1__1__Impl ;
    public final void rule__Row__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3322:1: ( rule__Row__Group_3_1__1__Impl )
            // InternalUpctforma.g:3323:2: rule__Row__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__1"


    // $ANTLR start "rule__Row__Group_3_1__1__Impl"
    // InternalUpctforma.g:3329:1: rule__Row__Group_3_1__1__Impl : ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) ;
    public final void rule__Row__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3333:1: ( ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) )
            // InternalUpctforma.g:3334:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            {
            // InternalUpctforma.g:3334:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            // InternalUpctforma.g:3335:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_1_1()); 
            // InternalUpctforma.g:3336:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            // InternalUpctforma.g:3336:3: rule__Row__ColumnsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_3_1__1__Impl"


    // $ANTLR start "rule__Row__Group_4__0"
    // InternalUpctforma.g:3345:1: rule__Row__Group_4__0 : rule__Row__Group_4__0__Impl rule__Row__Group_4__1 ;
    public final void rule__Row__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3349:1: ( rule__Row__Group_4__0__Impl rule__Row__Group_4__1 )
            // InternalUpctforma.g:3350:2: rule__Row__Group_4__0__Impl rule__Row__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__Row__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__0"


    // $ANTLR start "rule__Row__Group_4__0__Impl"
    // InternalUpctforma.g:3357:1: rule__Row__Group_4__0__Impl : ( 'usetemplate' ) ;
    public final void rule__Row__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3361:1: ( ( 'usetemplate' ) )
            // InternalUpctforma.g:3362:1: ( 'usetemplate' )
            {
            // InternalUpctforma.g:3362:1: ( 'usetemplate' )
            // InternalUpctforma.g:3363:2: 'usetemplate'
            {
             before(grammarAccess.getRowAccess().getUsetemplateKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getUsetemplateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__0__Impl"


    // $ANTLR start "rule__Row__Group_4__1"
    // InternalUpctforma.g:3372:1: rule__Row__Group_4__1 : rule__Row__Group_4__1__Impl ;
    public final void rule__Row__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3376:1: ( rule__Row__Group_4__1__Impl )
            // InternalUpctforma.g:3377:2: rule__Row__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__1"


    // $ANTLR start "rule__Row__Group_4__1__Impl"
    // InternalUpctforma.g:3383:1: rule__Row__Group_4__1__Impl : ( ( rule__Row__UsetemplateAssignment_4_1 ) ) ;
    public final void rule__Row__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3387:1: ( ( ( rule__Row__UsetemplateAssignment_4_1 ) ) )
            // InternalUpctforma.g:3388:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            {
            // InternalUpctforma.g:3388:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            // InternalUpctforma.g:3389:2: ( rule__Row__UsetemplateAssignment_4_1 )
            {
             before(grammarAccess.getRowAccess().getUsetemplateAssignment_4_1()); 
            // InternalUpctforma.g:3390:2: ( rule__Row__UsetemplateAssignment_4_1 )
            // InternalUpctforma.g:3390:3: rule__Row__UsetemplateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__UsetemplateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getUsetemplateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalUpctforma.g:3399:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3403:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalUpctforma.g:3404:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalUpctforma.g:3411:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3415:1: ( ( () ) )
            // InternalUpctforma.g:3416:1: ( () )
            {
            // InternalUpctforma.g:3416:1: ( () )
            // InternalUpctforma.g:3417:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalUpctforma.g:3418:2: ()
            // InternalUpctforma.g:3418:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalUpctforma.g:3426:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3430:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalUpctforma.g:3431:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalUpctforma.g:3438:1: rule__Column__Group__1__Impl : ( 'column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3442:1: ( ( 'column' ) )
            // InternalUpctforma.g:3443:1: ( 'column' )
            {
            // InternalUpctforma.g:3443:1: ( 'column' )
            // InternalUpctforma.g:3444:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalUpctforma.g:3453:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3457:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalUpctforma.g:3458:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalUpctforma.g:3465:1: rule__Column__Group__2__Impl : ( '{' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3469:1: ( ( '{' ) )
            // InternalUpctforma.g:3470:1: ( '{' )
            {
            // InternalUpctforma.g:3470:1: ( '{' )
            // InternalUpctforma.g:3471:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalUpctforma.g:3480:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3484:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalUpctforma.g:3485:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalUpctforma.g:3492:1: rule__Column__Group__3__Impl : ( ( rule__Column__Group_3__0 )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3496:1: ( ( ( rule__Column__Group_3__0 )? ) )
            // InternalUpctforma.g:3497:1: ( ( rule__Column__Group_3__0 )? )
            {
            // InternalUpctforma.g:3497:1: ( ( rule__Column__Group_3__0 )? )
            // InternalUpctforma.g:3498:2: ( rule__Column__Group_3__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_3()); 
            // InternalUpctforma.g:3499:2: ( rule__Column__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctforma.g:3499:3: rule__Column__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalUpctforma.g:3507:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3511:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalUpctforma.g:3512:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalUpctforma.g:3519:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3523:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalUpctforma.g:3524:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalUpctforma.g:3524:1: ( ( rule__Column__Group_4__0 )? )
            // InternalUpctforma.g:3525:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalUpctforma.g:3526:2: ( rule__Column__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27||LA27_0==40||LA27_0==42||(LA27_0>=44 && LA27_0<=45)||LA27_0==47||LA27_0==49||(LA27_0>=51 && LA27_0<=52)||(LA27_0>=54 && LA27_0<=55)||(LA27_0>=59 && LA27_0<=62)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctforma.g:3526:3: rule__Column__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalUpctforma.g:3534:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3538:1: ( rule__Column__Group__5__Impl )
            // InternalUpctforma.g:3539:2: rule__Column__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalUpctforma.g:3545:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3549:1: ( ( '}' ) )
            // InternalUpctforma.g:3550:1: ( '}' )
            {
            // InternalUpctforma.g:3550:1: ( '}' )
            // InternalUpctforma.g:3551:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group_3__0"
    // InternalUpctforma.g:3561:1: rule__Column__Group_3__0 : rule__Column__Group_3__0__Impl rule__Column__Group_3__1 ;
    public final void rule__Column__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3565:1: ( rule__Column__Group_3__0__Impl rule__Column__Group_3__1 )
            // InternalUpctforma.g:3566:2: rule__Column__Group_3__0__Impl rule__Column__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__0"


    // $ANTLR start "rule__Column__Group_3__0__Impl"
    // InternalUpctforma.g:3573:1: rule__Column__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Column__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3577:1: ( ( 'width' ) )
            // InternalUpctforma.g:3578:1: ( 'width' )
            {
            // InternalUpctforma.g:3578:1: ( 'width' )
            // InternalUpctforma.g:3579:2: 'width'
            {
             before(grammarAccess.getColumnAccess().getWidthKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getWidthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__0__Impl"


    // $ANTLR start "rule__Column__Group_3__1"
    // InternalUpctforma.g:3588:1: rule__Column__Group_3__1 : rule__Column__Group_3__1__Impl ;
    public final void rule__Column__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3592:1: ( rule__Column__Group_3__1__Impl )
            // InternalUpctforma.g:3593:2: rule__Column__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__1"


    // $ANTLR start "rule__Column__Group_3__1__Impl"
    // InternalUpctforma.g:3599:1: rule__Column__Group_3__1__Impl : ( ( rule__Column__WidthAssignment_3_1 ) ) ;
    public final void rule__Column__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3603:1: ( ( ( rule__Column__WidthAssignment_3_1 ) ) )
            // InternalUpctforma.g:3604:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            {
            // InternalUpctforma.g:3604:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            // InternalUpctforma.g:3605:2: ( rule__Column__WidthAssignment_3_1 )
            {
             before(grammarAccess.getColumnAccess().getWidthAssignment_3_1()); 
            // InternalUpctforma.g:3606:2: ( rule__Column__WidthAssignment_3_1 )
            // InternalUpctforma.g:3606:3: rule__Column__WidthAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__WidthAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getWidthAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_3__1__Impl"


    // $ANTLR start "rule__Column__Group_4__0"
    // InternalUpctforma.g:3615:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3619:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalUpctforma.g:3620:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Column__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0"


    // $ANTLR start "rule__Column__Group_4__0__Impl"
    // InternalUpctforma.g:3627:1: rule__Column__Group_4__0__Impl : ( ( rule__Column__ElementsAssignment_4_0 ) ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3631:1: ( ( ( rule__Column__ElementsAssignment_4_0 ) ) )
            // InternalUpctforma.g:3632:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:3632:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            // InternalUpctforma.g:3633:2: ( rule__Column__ElementsAssignment_4_0 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_0()); 
            // InternalUpctforma.g:3634:2: ( rule__Column__ElementsAssignment_4_0 )
            // InternalUpctforma.g:3634:3: rule__Column__ElementsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Column__ElementsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getElementsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__0__Impl"


    // $ANTLR start "rule__Column__Group_4__1"
    // InternalUpctforma.g:3642:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3646:1: ( rule__Column__Group_4__1__Impl )
            // InternalUpctforma.g:3647:2: rule__Column__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1"


    // $ANTLR start "rule__Column__Group_4__1__Impl"
    // InternalUpctforma.g:3653:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__Group_4_1__0 )* ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3657:1: ( ( ( rule__Column__Group_4_1__0 )* ) )
            // InternalUpctforma.g:3658:1: ( ( rule__Column__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:3658:1: ( ( rule__Column__Group_4_1__0 )* )
            // InternalUpctforma.g:3659:2: ( rule__Column__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_4_1()); 
            // InternalUpctforma.g:3660:2: ( rule__Column__Group_4_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUpctforma.g:3660:3: rule__Column__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Column__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group_4_1__0"
    // InternalUpctforma.g:3669:1: rule__Column__Group_4_1__0 : rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 ;
    public final void rule__Column__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3673:1: ( rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 )
            // InternalUpctforma.g:3674:2: rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Column__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4_1__0"


    // $ANTLR start "rule__Column__Group_4_1__0__Impl"
    // InternalUpctforma.g:3681:1: rule__Column__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3685:1: ( ( ',' ) )
            // InternalUpctforma.g:3686:1: ( ',' )
            {
            // InternalUpctforma.g:3686:1: ( ',' )
            // InternalUpctforma.g:3687:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_4_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4_1__0__Impl"


    // $ANTLR start "rule__Column__Group_4_1__1"
    // InternalUpctforma.g:3696:1: rule__Column__Group_4_1__1 : rule__Column__Group_4_1__1__Impl ;
    public final void rule__Column__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3700:1: ( rule__Column__Group_4_1__1__Impl )
            // InternalUpctforma.g:3701:2: rule__Column__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4_1__1"


    // $ANTLR start "rule__Column__Group_4_1__1__Impl"
    // InternalUpctforma.g:3707:1: rule__Column__Group_4_1__1__Impl : ( ( rule__Column__ElementsAssignment_4_1_1 ) ) ;
    public final void rule__Column__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3711:1: ( ( ( rule__Column__ElementsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:3712:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:3712:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            // InternalUpctforma.g:3713:2: ( rule__Column__ElementsAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_1_1()); 
            // InternalUpctforma.g:3714:2: ( rule__Column__ElementsAssignment_4_1_1 )
            // InternalUpctforma.g:3714:3: rule__Column__ElementsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__ElementsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getElementsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group_4_1__1__Impl"


    // $ANTLR start "rule__UseTemplate__Group__0"
    // InternalUpctforma.g:3723:1: rule__UseTemplate__Group__0 : rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 ;
    public final void rule__UseTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3727:1: ( rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 )
            // InternalUpctforma.g:3728:2: rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__UseTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__0"


    // $ANTLR start "rule__UseTemplate__Group__0__Impl"
    // InternalUpctforma.g:3735:1: rule__UseTemplate__Group__0__Impl : ( () ) ;
    public final void rule__UseTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3739:1: ( ( () ) )
            // InternalUpctforma.g:3740:1: ( () )
            {
            // InternalUpctforma.g:3740:1: ( () )
            // InternalUpctforma.g:3741:2: ()
            {
             before(grammarAccess.getUseTemplateAccess().getUseTemplateAction_0()); 
            // InternalUpctforma.g:3742:2: ()
            // InternalUpctforma.g:3742:3: 
            {
            }

             after(grammarAccess.getUseTemplateAccess().getUseTemplateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__0__Impl"


    // $ANTLR start "rule__UseTemplate__Group__1"
    // InternalUpctforma.g:3750:1: rule__UseTemplate__Group__1 : rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 ;
    public final void rule__UseTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3754:1: ( rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 )
            // InternalUpctforma.g:3755:2: rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__UseTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__1"


    // $ANTLR start "rule__UseTemplate__Group__1__Impl"
    // InternalUpctforma.g:3762:1: rule__UseTemplate__Group__1__Impl : ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) ;
    public final void rule__UseTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3766:1: ( ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) )
            // InternalUpctforma.g:3767:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            {
            // InternalUpctforma.g:3767:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            // InternalUpctforma.g:3768:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateAssignment_1()); 
            // InternalUpctforma.g:3769:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctforma.g:3769:3: rule__UseTemplate__TypetemplateAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseTemplate__TypetemplateAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseTemplateAccess().getTypetemplateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__1__Impl"


    // $ANTLR start "rule__UseTemplate__Group__2"
    // InternalUpctforma.g:3777:1: rule__UseTemplate__Group__2 : rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 ;
    public final void rule__UseTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3781:1: ( rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 )
            // InternalUpctforma.g:3782:2: rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__UseTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__2"


    // $ANTLR start "rule__UseTemplate__Group__2__Impl"
    // InternalUpctforma.g:3789:1: rule__UseTemplate__Group__2__Impl : ( ( rule__UseTemplate__Group_2__0 )? ) ;
    public final void rule__UseTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3793:1: ( ( ( rule__UseTemplate__Group_2__0 )? ) )
            // InternalUpctforma.g:3794:1: ( ( rule__UseTemplate__Group_2__0 )? )
            {
            // InternalUpctforma.g:3794:1: ( ( rule__UseTemplate__Group_2__0 )? )
            // InternalUpctforma.g:3795:2: ( rule__UseTemplate__Group_2__0 )?
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2()); 
            // InternalUpctforma.g:3796:2: ( rule__UseTemplate__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctforma.g:3796:3: rule__UseTemplate__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseTemplate__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseTemplateAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__2__Impl"


    // $ANTLR start "rule__UseTemplate__Group__3"
    // InternalUpctforma.g:3804:1: rule__UseTemplate__Group__3 : rule__UseTemplate__Group__3__Impl ;
    public final void rule__UseTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3808:1: ( rule__UseTemplate__Group__3__Impl )
            // InternalUpctforma.g:3809:2: rule__UseTemplate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__3"


    // $ANTLR start "rule__UseTemplate__Group__3__Impl"
    // InternalUpctforma.g:3815:1: rule__UseTemplate__Group__3__Impl : ( '}' ) ;
    public final void rule__UseTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3819:1: ( ( '}' ) )
            // InternalUpctforma.g:3820:1: ( '}' )
            {
            // InternalUpctforma.g:3820:1: ( '}' )
            // InternalUpctforma.g:3821:2: '}'
            {
             before(grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group__3__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2__0"
    // InternalUpctforma.g:3831:1: rule__UseTemplate__Group_2__0 : rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 ;
    public final void rule__UseTemplate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3835:1: ( rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 )
            // InternalUpctforma.g:3836:2: rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__UseTemplate__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2__0"


    // $ANTLR start "rule__UseTemplate__Group_2__0__Impl"
    // InternalUpctforma.g:3843:1: rule__UseTemplate__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UseTemplate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3847:1: ( ( '{' ) )
            // InternalUpctforma.g:3848:1: ( '{' )
            {
            // InternalUpctforma.g:3848:1: ( '{' )
            // InternalUpctforma.g:3849:2: '{'
            {
             before(grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2__0__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2__1"
    // InternalUpctforma.g:3858:1: rule__UseTemplate__Group_2__1 : rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 ;
    public final void rule__UseTemplate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3862:1: ( rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 )
            // InternalUpctforma.g:3863:2: rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__UseTemplate__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2__1"


    // $ANTLR start "rule__UseTemplate__Group_2__1__Impl"
    // InternalUpctforma.g:3870:1: rule__UseTemplate__Group_2__1__Impl : ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3874:1: ( ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) ) )
            // InternalUpctforma.g:3875:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) )
            {
            // InternalUpctforma.g:3875:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) )
            // InternalUpctforma.g:3876:2: ( rule__UseTemplate__TemplateelementsAssignment_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_1()); 
            // InternalUpctforma.g:3877:2: ( rule__UseTemplate__TemplateelementsAssignment_2_1 )
            // InternalUpctforma.g:3877:3: rule__UseTemplate__TemplateelementsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__TemplateelementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2__1__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2__2"
    // InternalUpctforma.g:3885:1: rule__UseTemplate__Group_2__2 : rule__UseTemplate__Group_2__2__Impl ;
    public final void rule__UseTemplate__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3889:1: ( rule__UseTemplate__Group_2__2__Impl )
            // InternalUpctforma.g:3890:2: rule__UseTemplate__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2__2"


    // $ANTLR start "rule__UseTemplate__Group_2__2__Impl"
    // InternalUpctforma.g:3896:1: rule__UseTemplate__Group_2__2__Impl : ( ( rule__UseTemplate__Group_2_2__0 )* ) ;
    public final void rule__UseTemplate__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3900:1: ( ( ( rule__UseTemplate__Group_2_2__0 )* ) )
            // InternalUpctforma.g:3901:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            {
            // InternalUpctforma.g:3901:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            // InternalUpctforma.g:3902:2: ( rule__UseTemplate__Group_2_2__0 )*
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2_2()); 
            // InternalUpctforma.g:3903:2: ( rule__UseTemplate__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalUpctforma.g:3903:3: rule__UseTemplate__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UseTemplate__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getUseTemplateAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2__2__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2_2__0"
    // InternalUpctforma.g:3912:1: rule__UseTemplate__Group_2_2__0 : rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 ;
    public final void rule__UseTemplate__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3916:1: ( rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 )
            // InternalUpctforma.g:3917:2: rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1
            {
            pushFollow(FOLLOW_28);
            rule__UseTemplate__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2_2__0"


    // $ANTLR start "rule__UseTemplate__Group_2_2__0__Impl"
    // InternalUpctforma.g:3924:1: rule__UseTemplate__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__UseTemplate__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3928:1: ( ( ',' ) )
            // InternalUpctforma.g:3929:1: ( ',' )
            {
            // InternalUpctforma.g:3929:1: ( ',' )
            // InternalUpctforma.g:3930:2: ','
            {
             before(grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2_2__0__Impl"


    // $ANTLR start "rule__UseTemplate__Group_2_2__1"
    // InternalUpctforma.g:3939:1: rule__UseTemplate__Group_2_2__1 : rule__UseTemplate__Group_2_2__1__Impl ;
    public final void rule__UseTemplate__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3943:1: ( rule__UseTemplate__Group_2_2__1__Impl )
            // InternalUpctforma.g:3944:2: rule__UseTemplate__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2_2__1"


    // $ANTLR start "rule__UseTemplate__Group_2_2__1__Impl"
    // InternalUpctforma.g:3950:1: rule__UseTemplate__Group_2_2__1__Impl : ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3954:1: ( ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) ) )
            // InternalUpctforma.g:3955:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) )
            {
            // InternalUpctforma.g:3955:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) )
            // InternalUpctforma.g:3956:2: ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_2_1()); 
            // InternalUpctforma.g:3957:2: ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 )
            // InternalUpctforma.g:3957:3: rule__UseTemplate__TemplateelementsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseTemplate__TemplateelementsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__Group_2_2__1__Impl"


    // $ANTLR start "rule__ContentElement_Impl__Group__0"
    // InternalUpctforma.g:3966:1: rule__ContentElement_Impl__Group__0 : rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 ;
    public final void rule__ContentElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3970:1: ( rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 )
            // InternalUpctforma.g:3971:2: rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__ContentElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentElement_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentElement_Impl__Group__0"


    // $ANTLR start "rule__ContentElement_Impl__Group__0__Impl"
    // InternalUpctforma.g:3978:1: rule__ContentElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ContentElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3982:1: ( ( () ) )
            // InternalUpctforma.g:3983:1: ( () )
            {
            // InternalUpctforma.g:3983:1: ( () )
            // InternalUpctforma.g:3984:2: ()
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementAction_0()); 
            // InternalUpctforma.g:3985:2: ()
            // InternalUpctforma.g:3985:3: 
            {
            }

             after(grammarAccess.getContentElement_ImplAccess().getContentElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__ContentElement_Impl__Group__1"
    // InternalUpctforma.g:3993:1: rule__ContentElement_Impl__Group__1 : rule__ContentElement_Impl__Group__1__Impl ;
    public final void rule__ContentElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3997:1: ( rule__ContentElement_Impl__Group__1__Impl )
            // InternalUpctforma.g:3998:2: rule__ContentElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentElement_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentElement_Impl__Group__1"


    // $ANTLR start "rule__ContentElement_Impl__Group__1__Impl"
    // InternalUpctforma.g:4004:1: rule__ContentElement_Impl__Group__1__Impl : ( 'ContentElement' ) ;
    public final void rule__ContentElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4008:1: ( ( 'ContentElement' ) )
            // InternalUpctforma.g:4009:1: ( 'ContentElement' )
            {
            // InternalUpctforma.g:4009:1: ( 'ContentElement' )
            // InternalUpctforma.g:4010:2: 'ContentElement'
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__0"
    // InternalUpctforma.g:4020:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4024:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalUpctforma.g:4025:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Image__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0"


    // $ANTLR start "rule__Image__Group__0__Impl"
    // InternalUpctforma.g:4032:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4036:1: ( ( () ) )
            // InternalUpctforma.g:4037:1: ( () )
            {
            // InternalUpctforma.g:4037:1: ( () )
            // InternalUpctforma.g:4038:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalUpctforma.g:4039:2: ()
            // InternalUpctforma.g:4039:3: 
            {
            }

             after(grammarAccess.getImageAccess().getImageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__0__Impl"


    // $ANTLR start "rule__Image__Group__1"
    // InternalUpctforma.g:4047:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4051:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalUpctforma.g:4052:2: rule__Image__Group__1__Impl rule__Image__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Image__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1"


    // $ANTLR start "rule__Image__Group__1__Impl"
    // InternalUpctforma.g:4059:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4063:1: ( ( 'Image' ) )
            // InternalUpctforma.g:4064:1: ( 'Image' )
            {
            // InternalUpctforma.g:4064:1: ( 'Image' )
            // InternalUpctforma.g:4065:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getImageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__1__Impl"


    // $ANTLR start "rule__Image__Group__2"
    // InternalUpctforma.g:4074:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4078:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalUpctforma.g:4079:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Image__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2"


    // $ANTLR start "rule__Image__Group__2__Impl"
    // InternalUpctforma.g:4086:1: rule__Image__Group__2__Impl : ( '{' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4090:1: ( ( '{' ) )
            // InternalUpctforma.g:4091:1: ( '{' )
            {
            // InternalUpctforma.g:4091:1: ( '{' )
            // InternalUpctforma.g:4092:2: '{'
            {
             before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__2__Impl"


    // $ANTLR start "rule__Image__Group__3"
    // InternalUpctforma.g:4101:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4105:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalUpctforma.g:4106:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Image__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3"


    // $ANTLR start "rule__Image__Group__3__Impl"
    // InternalUpctforma.g:4113:1: rule__Image__Group__3__Impl : ( ( rule__Image__Group_3__0 )? ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4117:1: ( ( ( rule__Image__Group_3__0 )? ) )
            // InternalUpctforma.g:4118:1: ( ( rule__Image__Group_3__0 )? )
            {
            // InternalUpctforma.g:4118:1: ( ( rule__Image__Group_3__0 )? )
            // InternalUpctforma.g:4119:2: ( rule__Image__Group_3__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_3()); 
            // InternalUpctforma.g:4120:2: ( rule__Image__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctforma.g:4120:3: rule__Image__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Image__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__3__Impl"


    // $ANTLR start "rule__Image__Group__4"
    // InternalUpctforma.g:4128:1: rule__Image__Group__4 : rule__Image__Group__4__Impl rule__Image__Group__5 ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4132:1: ( rule__Image__Group__4__Impl rule__Image__Group__5 )
            // InternalUpctforma.g:4133:2: rule__Image__Group__4__Impl rule__Image__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Image__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4"


    // $ANTLR start "rule__Image__Group__4__Impl"
    // InternalUpctforma.g:4140:1: rule__Image__Group__4__Impl : ( ',' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4144:1: ( ( ',' ) )
            // InternalUpctforma.g:4145:1: ( ',' )
            {
            // InternalUpctforma.g:4145:1: ( ',' )
            // InternalUpctforma.g:4146:2: ','
            {
             before(grammarAccess.getImageAccess().getCommaKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__4__Impl"


    // $ANTLR start "rule__Image__Group__5"
    // InternalUpctforma.g:4155:1: rule__Image__Group__5 : rule__Image__Group__5__Impl rule__Image__Group__6 ;
    public final void rule__Image__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4159:1: ( rule__Image__Group__5__Impl rule__Image__Group__6 )
            // InternalUpctforma.g:4160:2: rule__Image__Group__5__Impl rule__Image__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Image__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5"


    // $ANTLR start "rule__Image__Group__5__Impl"
    // InternalUpctforma.g:4167:1: rule__Image__Group__5__Impl : ( ( rule__Image__TypeAssignment_5 ) ) ;
    public final void rule__Image__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4171:1: ( ( ( rule__Image__TypeAssignment_5 ) ) )
            // InternalUpctforma.g:4172:1: ( ( rule__Image__TypeAssignment_5 ) )
            {
            // InternalUpctforma.g:4172:1: ( ( rule__Image__TypeAssignment_5 ) )
            // InternalUpctforma.g:4173:2: ( rule__Image__TypeAssignment_5 )
            {
             before(grammarAccess.getImageAccess().getTypeAssignment_5()); 
            // InternalUpctforma.g:4174:2: ( rule__Image__TypeAssignment_5 )
            // InternalUpctforma.g:4174:3: rule__Image__TypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Image__TypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__5__Impl"


    // $ANTLR start "rule__Image__Group__6"
    // InternalUpctforma.g:4182:1: rule__Image__Group__6 : rule__Image__Group__6__Impl ;
    public final void rule__Image__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4186:1: ( rule__Image__Group__6__Impl )
            // InternalUpctforma.g:4187:2: rule__Image__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6"


    // $ANTLR start "rule__Image__Group__6__Impl"
    // InternalUpctforma.g:4193:1: rule__Image__Group__6__Impl : ( '}' ) ;
    public final void rule__Image__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4197:1: ( ( '}' ) )
            // InternalUpctforma.g:4198:1: ( '}' )
            {
            // InternalUpctforma.g:4198:1: ( '}' )
            // InternalUpctforma.g:4199:2: '}'
            {
             before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group__6__Impl"


    // $ANTLR start "rule__Image__Group_3__0"
    // InternalUpctforma.g:4209:1: rule__Image__Group_3__0 : rule__Image__Group_3__0__Impl rule__Image__Group_3__1 ;
    public final void rule__Image__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4213:1: ( rule__Image__Group_3__0__Impl rule__Image__Group_3__1 )
            // InternalUpctforma.g:4214:2: rule__Image__Group_3__0__Impl rule__Image__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Image__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Image__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_3__0"


    // $ANTLR start "rule__Image__Group_3__0__Impl"
    // InternalUpctforma.g:4221:1: rule__Image__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Image__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4225:1: ( ( 'url' ) )
            // InternalUpctforma.g:4226:1: ( 'url' )
            {
            // InternalUpctforma.g:4226:1: ( 'url' )
            // InternalUpctforma.g:4227:2: 'url'
            {
             before(grammarAccess.getImageAccess().getUrlKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getUrlKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_3__0__Impl"


    // $ANTLR start "rule__Image__Group_3__1"
    // InternalUpctforma.g:4236:1: rule__Image__Group_3__1 : rule__Image__Group_3__1__Impl ;
    public final void rule__Image__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4240:1: ( rule__Image__Group_3__1__Impl )
            // InternalUpctforma.g:4241:2: rule__Image__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_3__1"


    // $ANTLR start "rule__Image__Group_3__1__Impl"
    // InternalUpctforma.g:4247:1: rule__Image__Group_3__1__Impl : ( ( rule__Image__UrlAssignment_3_1 ) ) ;
    public final void rule__Image__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4251:1: ( ( ( rule__Image__UrlAssignment_3_1 ) ) )
            // InternalUpctforma.g:4252:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4252:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            // InternalUpctforma.g:4253:2: ( rule__Image__UrlAssignment_3_1 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_3_1()); 
            // InternalUpctforma.g:4254:2: ( rule__Image__UrlAssignment_3_1 )
            // InternalUpctforma.g:4254:3: rule__Image__UrlAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Image__UrlAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getUrlAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Group_3__1__Impl"


    // $ANTLR start "rule__Widget__Group__0"
    // InternalUpctforma.g:4263:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4267:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalUpctforma.g:4268:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Widget__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__0"


    // $ANTLR start "rule__Widget__Group__0__Impl"
    // InternalUpctforma.g:4275:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4279:1: ( ( 'Widget' ) )
            // InternalUpctforma.g:4280:1: ( 'Widget' )
            {
            // InternalUpctforma.g:4280:1: ( 'Widget' )
            // InternalUpctforma.g:4281:2: 'Widget'
            {
             before(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__0__Impl"


    // $ANTLR start "rule__Widget__Group__1"
    // InternalUpctforma.g:4290:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4294:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalUpctforma.g:4295:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Widget__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__1"


    // $ANTLR start "rule__Widget__Group__1__Impl"
    // InternalUpctforma.g:4302:1: rule__Widget__Group__1__Impl : ( ( rule__Widget__NameAssignment_1 ) ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4306:1: ( ( ( rule__Widget__NameAssignment_1 ) ) )
            // InternalUpctforma.g:4307:1: ( ( rule__Widget__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:4307:1: ( ( rule__Widget__NameAssignment_1 ) )
            // InternalUpctforma.g:4308:2: ( rule__Widget__NameAssignment_1 )
            {
             before(grammarAccess.getWidgetAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:4309:2: ( rule__Widget__NameAssignment_1 )
            // InternalUpctforma.g:4309:3: rule__Widget__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__1__Impl"


    // $ANTLR start "rule__Widget__Group__2"
    // InternalUpctforma.g:4317:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4321:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalUpctforma.g:4322:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Widget__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__2"


    // $ANTLR start "rule__Widget__Group__2__Impl"
    // InternalUpctforma.g:4329:1: rule__Widget__Group__2__Impl : ( ':' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4333:1: ( ( ':' ) )
            // InternalUpctforma.g:4334:1: ( ':' )
            {
            // InternalUpctforma.g:4334:1: ( ':' )
            // InternalUpctforma.g:4335:2: ':'
            {
             before(grammarAccess.getWidgetAccess().getColonKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__2__Impl"


    // $ANTLR start "rule__Widget__Group__3"
    // InternalUpctforma.g:4344:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4348:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalUpctforma.g:4349:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Widget__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__3"


    // $ANTLR start "rule__Widget__Group__3__Impl"
    // InternalUpctforma.g:4356:1: rule__Widget__Group__3__Impl : ( ( rule__Widget__WidgettypeAssignment_3 ) ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4360:1: ( ( ( rule__Widget__WidgettypeAssignment_3 ) ) )
            // InternalUpctforma.g:4361:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            {
            // InternalUpctforma.g:4361:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            // InternalUpctforma.g:4362:2: ( rule__Widget__WidgettypeAssignment_3 )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeAssignment_3()); 
            // InternalUpctforma.g:4363:2: ( rule__Widget__WidgettypeAssignment_3 )
            // InternalUpctforma.g:4363:3: rule__Widget__WidgettypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgettypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgettypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__3__Impl"


    // $ANTLR start "rule__Widget__Group__4"
    // InternalUpctforma.g:4371:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4375:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalUpctforma.g:4376:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Widget__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__4"


    // $ANTLR start "rule__Widget__Group__4__Impl"
    // InternalUpctforma.g:4383:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__Group_4__0 )? ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4387:1: ( ( ( rule__Widget__Group_4__0 )? ) )
            // InternalUpctforma.g:4388:1: ( ( rule__Widget__Group_4__0 )? )
            {
            // InternalUpctforma.g:4388:1: ( ( rule__Widget__Group_4__0 )? )
            // InternalUpctforma.g:4389:2: ( rule__Widget__Group_4__0 )?
            {
             before(grammarAccess.getWidgetAccess().getGroup_4()); 
            // InternalUpctforma.g:4390:2: ( rule__Widget__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctforma.g:4390:3: rule__Widget__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Widget__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWidgetAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__4__Impl"


    // $ANTLR start "rule__Widget__Group__5"
    // InternalUpctforma.g:4398:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4402:1: ( rule__Widget__Group__5__Impl )
            // InternalUpctforma.g:4403:2: rule__Widget__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__5"


    // $ANTLR start "rule__Widget__Group__5__Impl"
    // InternalUpctforma.g:4409:1: rule__Widget__Group__5__Impl : ( '}' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4413:1: ( ( '}' ) )
            // InternalUpctforma.g:4414:1: ( '}' )
            {
            // InternalUpctforma.g:4414:1: ( '}' )
            // InternalUpctforma.g:4415:2: '}'
            {
             before(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group__5__Impl"


    // $ANTLR start "rule__Widget__Group_4__0"
    // InternalUpctforma.g:4425:1: rule__Widget__Group_4__0 : rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 ;
    public final void rule__Widget__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4429:1: ( rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 )
            // InternalUpctforma.g:4430:2: rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__Widget__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4__0"


    // $ANTLR start "rule__Widget__Group_4__0__Impl"
    // InternalUpctforma.g:4437:1: rule__Widget__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Widget__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4441:1: ( ( '{' ) )
            // InternalUpctforma.g:4442:1: ( '{' )
            {
            // InternalUpctforma.g:4442:1: ( '{' )
            // InternalUpctforma.g:4443:2: '{'
            {
             before(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4__0__Impl"


    // $ANTLR start "rule__Widget__Group_4__1"
    // InternalUpctforma.g:4452:1: rule__Widget__Group_4__1 : rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 ;
    public final void rule__Widget__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4456:1: ( rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 )
            // InternalUpctforma.g:4457:2: rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Widget__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4__1"


    // $ANTLR start "rule__Widget__Group_4__1__Impl"
    // InternalUpctforma.g:4464:1: rule__Widget__Group_4__1__Impl : ( ( rule__Widget__WidgetelementsAssignment_4_1 ) ) ;
    public final void rule__Widget__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4468:1: ( ( ( rule__Widget__WidgetelementsAssignment_4_1 ) ) )
            // InternalUpctforma.g:4469:1: ( ( rule__Widget__WidgetelementsAssignment_4_1 ) )
            {
            // InternalUpctforma.g:4469:1: ( ( rule__Widget__WidgetelementsAssignment_4_1 ) )
            // InternalUpctforma.g:4470:2: ( rule__Widget__WidgetelementsAssignment_4_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_1()); 
            // InternalUpctforma.g:4471:2: ( rule__Widget__WidgetelementsAssignment_4_1 )
            // InternalUpctforma.g:4471:3: rule__Widget__WidgetelementsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetelementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4__1__Impl"


    // $ANTLR start "rule__Widget__Group_4__2"
    // InternalUpctforma.g:4479:1: rule__Widget__Group_4__2 : rule__Widget__Group_4__2__Impl ;
    public final void rule__Widget__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4483:1: ( rule__Widget__Group_4__2__Impl )
            // InternalUpctforma.g:4484:2: rule__Widget__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4__2"


    // $ANTLR start "rule__Widget__Group_4__2__Impl"
    // InternalUpctforma.g:4490:1: rule__Widget__Group_4__2__Impl : ( ( rule__Widget__Group_4_2__0 )* ) ;
    public final void rule__Widget__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4494:1: ( ( ( rule__Widget__Group_4_2__0 )* ) )
            // InternalUpctforma.g:4495:1: ( ( rule__Widget__Group_4_2__0 )* )
            {
            // InternalUpctforma.g:4495:1: ( ( rule__Widget__Group_4_2__0 )* )
            // InternalUpctforma.g:4496:2: ( rule__Widget__Group_4_2__0 )*
            {
             before(grammarAccess.getWidgetAccess().getGroup_4_2()); 
            // InternalUpctforma.g:4497:2: ( rule__Widget__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==31) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalUpctforma.g:4497:3: rule__Widget__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Widget__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getWidgetAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4__2__Impl"


    // $ANTLR start "rule__Widget__Group_4_2__0"
    // InternalUpctforma.g:4506:1: rule__Widget__Group_4_2__0 : rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 ;
    public final void rule__Widget__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4510:1: ( rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 )
            // InternalUpctforma.g:4511:2: rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1
            {
            pushFollow(FOLLOW_28);
            rule__Widget__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Widget__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4_2__0"


    // $ANTLR start "rule__Widget__Group_4_2__0__Impl"
    // InternalUpctforma.g:4518:1: rule__Widget__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Widget__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4522:1: ( ( ',' ) )
            // InternalUpctforma.g:4523:1: ( ',' )
            {
            // InternalUpctforma.g:4523:1: ( ',' )
            // InternalUpctforma.g:4524:2: ','
            {
             before(grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4_2__0__Impl"


    // $ANTLR start "rule__Widget__Group_4_2__1"
    // InternalUpctforma.g:4533:1: rule__Widget__Group_4_2__1 : rule__Widget__Group_4_2__1__Impl ;
    public final void rule__Widget__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4537:1: ( rule__Widget__Group_4_2__1__Impl )
            // InternalUpctforma.g:4538:2: rule__Widget__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Widget__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4_2__1"


    // $ANTLR start "rule__Widget__Group_4_2__1__Impl"
    // InternalUpctforma.g:4544:1: rule__Widget__Group_4_2__1__Impl : ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) ) ;
    public final void rule__Widget__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4548:1: ( ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) ) )
            // InternalUpctforma.g:4549:1: ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) )
            {
            // InternalUpctforma.g:4549:1: ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) )
            // InternalUpctforma.g:4550:2: ( rule__Widget__WidgetelementsAssignment_4_2_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_2_1()); 
            // InternalUpctforma.g:4551:2: ( rule__Widget__WidgetelementsAssignment_4_2_1 )
            // InternalUpctforma.g:4551:3: rule__Widget__WidgetelementsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Widget__WidgetelementsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__Group_4_2__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalUpctforma.g:4560:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4564:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalUpctforma.g:4565:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalUpctforma.g:4572:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4576:1: ( ( 'Text' ) )
            // InternalUpctforma.g:4577:1: ( 'Text' )
            {
            // InternalUpctforma.g:4577:1: ( 'Text' )
            // InternalUpctforma.g:4578:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalUpctforma.g:4587:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4591:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalUpctforma.g:4592:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalUpctforma.g:4599:1: rule__Text__Group__1__Impl : ( '{' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4603:1: ( ( '{' ) )
            // InternalUpctforma.g:4604:1: ( '{' )
            {
            // InternalUpctforma.g:4604:1: ( '{' )
            // InternalUpctforma.g:4605:2: '{'
            {
             before(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalUpctforma.g:4614:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4618:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalUpctforma.g:4619:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalUpctforma.g:4626:1: rule__Text__Group__2__Impl : ( ( rule__Text__Group_2__0 )? ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4630:1: ( ( ( rule__Text__Group_2__0 )? ) )
            // InternalUpctforma.g:4631:1: ( ( rule__Text__Group_2__0 )? )
            {
            // InternalUpctforma.g:4631:1: ( ( rule__Text__Group_2__0 )? )
            // InternalUpctforma.g:4632:2: ( rule__Text__Group_2__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_2()); 
            // InternalUpctforma.g:4633:2: ( rule__Text__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctforma.g:4633:3: rule__Text__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalUpctforma.g:4641:1: rule__Text__Group__3 : rule__Text__Group__3__Impl ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4645:1: ( rule__Text__Group__3__Impl )
            // InternalUpctforma.g:4646:2: rule__Text__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalUpctforma.g:4652:1: rule__Text__Group__3__Impl : ( '}' ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4656:1: ( ( '}' ) )
            // InternalUpctforma.g:4657:1: ( '}' )
            {
            // InternalUpctforma.g:4657:1: ( '}' )
            // InternalUpctforma.g:4658:2: '}'
            {
             before(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Text__Group_2__0"
    // InternalUpctforma.g:4668:1: rule__Text__Group_2__0 : rule__Text__Group_2__0__Impl rule__Text__Group_2__1 ;
    public final void rule__Text__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4672:1: ( rule__Text__Group_2__0__Impl rule__Text__Group_2__1 )
            // InternalUpctforma.g:4673:2: rule__Text__Group_2__0__Impl rule__Text__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Text__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_2__0"


    // $ANTLR start "rule__Text__Group_2__0__Impl"
    // InternalUpctforma.g:4680:1: rule__Text__Group_2__0__Impl : ( 'html' ) ;
    public final void rule__Text__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4684:1: ( ( 'html' ) )
            // InternalUpctforma.g:4685:1: ( 'html' )
            {
            // InternalUpctforma.g:4685:1: ( 'html' )
            // InternalUpctforma.g:4686:2: 'html'
            {
             before(grammarAccess.getTextAccess().getHtmlKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getHtmlKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_2__0__Impl"


    // $ANTLR start "rule__Text__Group_2__1"
    // InternalUpctforma.g:4695:1: rule__Text__Group_2__1 : rule__Text__Group_2__1__Impl ;
    public final void rule__Text__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4699:1: ( rule__Text__Group_2__1__Impl )
            // InternalUpctforma.g:4700:2: rule__Text__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_2__1"


    // $ANTLR start "rule__Text__Group_2__1__Impl"
    // InternalUpctforma.g:4706:1: rule__Text__Group_2__1__Impl : ( ( rule__Text__HtmlAssignment_2_1 ) ) ;
    public final void rule__Text__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4710:1: ( ( ( rule__Text__HtmlAssignment_2_1 ) ) )
            // InternalUpctforma.g:4711:1: ( ( rule__Text__HtmlAssignment_2_1 ) )
            {
            // InternalUpctforma.g:4711:1: ( ( rule__Text__HtmlAssignment_2_1 ) )
            // InternalUpctforma.g:4712:2: ( rule__Text__HtmlAssignment_2_1 )
            {
             before(grammarAccess.getTextAccess().getHtmlAssignment_2_1()); 
            // InternalUpctforma.g:4713:2: ( rule__Text__HtmlAssignment_2_1 )
            // InternalUpctforma.g:4713:3: rule__Text__HtmlAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__HtmlAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getHtmlAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_2__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalUpctforma.g:4722:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4726:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalUpctforma.g:4727:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalUpctforma.g:4734:1: rule__Number__Group__0__Impl : ( 'Int' ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4738:1: ( ( 'Int' ) )
            // InternalUpctforma.g:4739:1: ( 'Int' )
            {
            // InternalUpctforma.g:4739:1: ( 'Int' )
            // InternalUpctforma.g:4740:2: 'Int'
            {
             before(grammarAccess.getNumberAccess().getIntKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getIntKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalUpctforma.g:4749:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4753:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // InternalUpctforma.g:4754:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalUpctforma.g:4761:1: rule__Number__Group__1__Impl : ( '{' ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4765:1: ( ( '{' ) )
            // InternalUpctforma.g:4766:1: ( '{' )
            {
            // InternalUpctforma.g:4766:1: ( '{' )
            // InternalUpctforma.g:4767:2: '{'
            {
             before(grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // InternalUpctforma.g:4776:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4780:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // InternalUpctforma.g:4781:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // InternalUpctforma.g:4788:1: rule__Number__Group__2__Impl : ( ( rule__Number__NumAssignment_2 )? ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4792:1: ( ( ( rule__Number__NumAssignment_2 )? ) )
            // InternalUpctforma.g:4793:1: ( ( rule__Number__NumAssignment_2 )? )
            {
            // InternalUpctforma.g:4793:1: ( ( rule__Number__NumAssignment_2 )? )
            // InternalUpctforma.g:4794:2: ( rule__Number__NumAssignment_2 )?
            {
             before(grammarAccess.getNumberAccess().getNumAssignment_2()); 
            // InternalUpctforma.g:4795:2: ( rule__Number__NumAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT||LA36_0==53) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctforma.g:4795:3: rule__Number__NumAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__NumAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getNumAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__3"
    // InternalUpctforma.g:4803:1: rule__Number__Group__3 : rule__Number__Group__3__Impl ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4807:1: ( rule__Number__Group__3__Impl )
            // InternalUpctforma.g:4808:2: rule__Number__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__3"


    // $ANTLR start "rule__Number__Group__3__Impl"
    // InternalUpctforma.g:4814:1: rule__Number__Group__3__Impl : ( '}' ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4818:1: ( ( '}' ) )
            // InternalUpctforma.g:4819:1: ( '}' )
            {
            // InternalUpctforma.g:4819:1: ( '}' )
            // InternalUpctforma.g:4820:2: '}'
            {
             before(grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group__0"
    // InternalUpctforma.g:4830:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4834:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // InternalUpctforma.g:4835:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Literal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0"


    // $ANTLR start "rule__Literal__Group__0__Impl"
    // InternalUpctforma.g:4842:1: rule__Literal__Group__0__Impl : ( 'Literal' ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4846:1: ( ( 'Literal' ) )
            // InternalUpctforma.g:4847:1: ( 'Literal' )
            {
            // InternalUpctforma.g:4847:1: ( 'Literal' )
            // InternalUpctforma.g:4848:2: 'Literal'
            {
             before(grammarAccess.getLiteralAccess().getLiteralKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getLiteralKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0__Impl"


    // $ANTLR start "rule__Literal__Group__1"
    // InternalUpctforma.g:4857:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl rule__Literal__Group__2 ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4861:1: ( rule__Literal__Group__1__Impl rule__Literal__Group__2 )
            // InternalUpctforma.g:4862:2: rule__Literal__Group__1__Impl rule__Literal__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Literal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1"


    // $ANTLR start "rule__Literal__Group__1__Impl"
    // InternalUpctforma.g:4869:1: rule__Literal__Group__1__Impl : ( '{' ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4873:1: ( ( '{' ) )
            // InternalUpctforma.g:4874:1: ( '{' )
            {
            // InternalUpctforma.g:4874:1: ( '{' )
            // InternalUpctforma.g:4875:2: '{'
            {
             before(grammarAccess.getLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1__Impl"


    // $ANTLR start "rule__Literal__Group__2"
    // InternalUpctforma.g:4884:1: rule__Literal__Group__2 : rule__Literal__Group__2__Impl rule__Literal__Group__3 ;
    public final void rule__Literal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4888:1: ( rule__Literal__Group__2__Impl rule__Literal__Group__3 )
            // InternalUpctforma.g:4889:2: rule__Literal__Group__2__Impl rule__Literal__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Literal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__2"


    // $ANTLR start "rule__Literal__Group__2__Impl"
    // InternalUpctforma.g:4896:1: rule__Literal__Group__2__Impl : ( ( rule__Literal__LiteralAssignment_2 )? ) ;
    public final void rule__Literal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4900:1: ( ( ( rule__Literal__LiteralAssignment_2 )? ) )
            // InternalUpctforma.g:4901:1: ( ( rule__Literal__LiteralAssignment_2 )? )
            {
            // InternalUpctforma.g:4901:1: ( ( rule__Literal__LiteralAssignment_2 )? )
            // InternalUpctforma.g:4902:2: ( rule__Literal__LiteralAssignment_2 )?
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_2()); 
            // InternalUpctforma.g:4903:2: ( rule__Literal__LiteralAssignment_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_ID)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctforma.g:4903:3: rule__Literal__LiteralAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__LiteralAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralAccess().getLiteralAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__2__Impl"


    // $ANTLR start "rule__Literal__Group__3"
    // InternalUpctforma.g:4911:1: rule__Literal__Group__3 : rule__Literal__Group__3__Impl ;
    public final void rule__Literal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4915:1: ( rule__Literal__Group__3__Impl )
            // InternalUpctforma.g:4916:2: rule__Literal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__3"


    // $ANTLR start "rule__Literal__Group__3__Impl"
    // InternalUpctforma.g:4922:1: rule__Literal__Group__3__Impl : ( '}' ) ;
    public final void rule__Literal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4926:1: ( ( '}' ) )
            // InternalUpctforma.g:4927:1: ( '}' )
            {
            // InternalUpctforma.g:4927:1: ( '}' )
            // InternalUpctforma.g:4928:2: '}'
            {
             before(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalUpctforma.g:4938:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4942:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUpctforma.g:4943:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalUpctforma.g:4950:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4954:1: ( ( ( '-' )? ) )
            // InternalUpctforma.g:4955:1: ( ( '-' )? )
            {
            // InternalUpctforma.g:4955:1: ( ( '-' )? )
            // InternalUpctforma.g:4956:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalUpctforma.g:4957:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==53) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctforma.g:4957:3: '-'
                    {
                    match(input,53,FOLLOW_2); 

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
    // InternalUpctforma.g:4965:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4969:1: ( rule__EInt__Group__1__Impl )
            // InternalUpctforma.g:4970:2: rule__EInt__Group__1__Impl
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
    // InternalUpctforma.g:4976:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4980:1: ( ( RULE_INT ) )
            // InternalUpctforma.g:4981:1: ( RULE_INT )
            {
            // InternalUpctforma.g:4981:1: ( RULE_INT )
            // InternalUpctforma.g:4982:2: RULE_INT
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


    // $ANTLR start "rule__Composite_Impl__Group__0"
    // InternalUpctforma.g:4992:1: rule__Composite_Impl__Group__0 : rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 ;
    public final void rule__Composite_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4996:1: ( rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 )
            // InternalUpctforma.g:4997:2: rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__Composite_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composite_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composite_Impl__Group__0"


    // $ANTLR start "rule__Composite_Impl__Group__0__Impl"
    // InternalUpctforma.g:5004:1: rule__Composite_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Composite_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5008:1: ( ( () ) )
            // InternalUpctforma.g:5009:1: ( () )
            {
            // InternalUpctforma.g:5009:1: ( () )
            // InternalUpctforma.g:5010:2: ()
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeAction_0()); 
            // InternalUpctforma.g:5011:2: ()
            // InternalUpctforma.g:5011:3: 
            {
            }

             after(grammarAccess.getComposite_ImplAccess().getCompositeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composite_Impl__Group__0__Impl"


    // $ANTLR start "rule__Composite_Impl__Group__1"
    // InternalUpctforma.g:5019:1: rule__Composite_Impl__Group__1 : rule__Composite_Impl__Group__1__Impl ;
    public final void rule__Composite_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5023:1: ( rule__Composite_Impl__Group__1__Impl )
            // InternalUpctforma.g:5024:2: rule__Composite_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composite_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composite_Impl__Group__1"


    // $ANTLR start "rule__Composite_Impl__Group__1__Impl"
    // InternalUpctforma.g:5030:1: rule__Composite_Impl__Group__1__Impl : ( 'Composite' ) ;
    public final void rule__Composite_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5034:1: ( ( 'Composite' ) )
            // InternalUpctforma.g:5035:1: ( 'Composite' )
            {
            // InternalUpctforma.g:5035:1: ( 'Composite' )
            // InternalUpctforma.g:5036:2: 'Composite'
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composite_Impl__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalUpctforma.g:5046:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5050:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalUpctforma.g:5051:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0"


    // $ANTLR start "rule__Video__Group__0__Impl"
    // InternalUpctforma.g:5058:1: rule__Video__Group__0__Impl : ( () ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5062:1: ( ( () ) )
            // InternalUpctforma.g:5063:1: ( () )
            {
            // InternalUpctforma.g:5063:1: ( () )
            // InternalUpctforma.g:5064:2: ()
            {
             before(grammarAccess.getVideoAccess().getVideoAction_0()); 
            // InternalUpctforma.g:5065:2: ()
            // InternalUpctforma.g:5065:3: 
            {
            }

             after(grammarAccess.getVideoAccess().getVideoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0__Impl"


    // $ANTLR start "rule__Video__Group__1"
    // InternalUpctforma.g:5073:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5077:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalUpctforma.g:5078:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Video__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1"


    // $ANTLR start "rule__Video__Group__1__Impl"
    // InternalUpctforma.g:5085:1: rule__Video__Group__1__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5089:1: ( ( 'Video' ) )
            // InternalUpctforma.g:5090:1: ( 'Video' )
            {
            // InternalUpctforma.g:5090:1: ( 'Video' )
            // InternalUpctforma.g:5091:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getVideoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__2"
    // InternalUpctforma.g:5100:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5104:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalUpctforma.g:5105:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__Video__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__2"


    // $ANTLR start "rule__Video__Group__2__Impl"
    // InternalUpctforma.g:5112:1: rule__Video__Group__2__Impl : ( '{' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5116:1: ( ( '{' ) )
            // InternalUpctforma.g:5117:1: ( '{' )
            {
            // InternalUpctforma.g:5117:1: ( '{' )
            // InternalUpctforma.g:5118:2: '{'
            {
             before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__2__Impl"


    // $ANTLR start "rule__Video__Group__3"
    // InternalUpctforma.g:5127:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5131:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalUpctforma.g:5132:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Video__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__3"


    // $ANTLR start "rule__Video__Group__3__Impl"
    // InternalUpctforma.g:5139:1: rule__Video__Group__3__Impl : ( ( rule__Video__Group_3__0 )? ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5143:1: ( ( ( rule__Video__Group_3__0 )? ) )
            // InternalUpctforma.g:5144:1: ( ( rule__Video__Group_3__0 )? )
            {
            // InternalUpctforma.g:5144:1: ( ( rule__Video__Group_3__0 )? )
            // InternalUpctforma.g:5145:2: ( rule__Video__Group_3__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_3()); 
            // InternalUpctforma.g:5146:2: ( rule__Video__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==56) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUpctforma.g:5146:3: rule__Video__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__3__Impl"


    // $ANTLR start "rule__Video__Group__4"
    // InternalUpctforma.g:5154:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5158:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalUpctforma.g:5159:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__Video__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4"


    // $ANTLR start "rule__Video__Group__4__Impl"
    // InternalUpctforma.g:5166:1: rule__Video__Group__4__Impl : ( ',' ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5170:1: ( ( ',' ) )
            // InternalUpctforma.g:5171:1: ( ',' )
            {
            // InternalUpctforma.g:5171:1: ( ',' )
            // InternalUpctforma.g:5172:2: ','
            {
             before(grammarAccess.getVideoAccess().getCommaKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4__Impl"


    // $ANTLR start "rule__Video__Group__5"
    // InternalUpctforma.g:5181:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5185:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalUpctforma.g:5186:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__Video__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5"


    // $ANTLR start "rule__Video__Group__5__Impl"
    // InternalUpctforma.g:5193:1: rule__Video__Group__5__Impl : ( ( rule__Video__Group_5__0 )? ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5197:1: ( ( ( rule__Video__Group_5__0 )? ) )
            // InternalUpctforma.g:5198:1: ( ( rule__Video__Group_5__0 )? )
            {
            // InternalUpctforma.g:5198:1: ( ( rule__Video__Group_5__0 )? )
            // InternalUpctforma.g:5199:2: ( rule__Video__Group_5__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_5()); 
            // InternalUpctforma.g:5200:2: ( rule__Video__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUpctforma.g:5200:3: rule__Video__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5__Impl"


    // $ANTLR start "rule__Video__Group__6"
    // InternalUpctforma.g:5208:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5212:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalUpctforma.g:5213:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__Video__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__6"


    // $ANTLR start "rule__Video__Group__6__Impl"
    // InternalUpctforma.g:5220:1: rule__Video__Group__6__Impl : ( ',' ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5224:1: ( ( ',' ) )
            // InternalUpctforma.g:5225:1: ( ',' )
            {
            // InternalUpctforma.g:5225:1: ( ',' )
            // InternalUpctforma.g:5226:2: ','
            {
             before(grammarAccess.getVideoAccess().getCommaKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__6__Impl"


    // $ANTLR start "rule__Video__Group__7"
    // InternalUpctforma.g:5235:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5239:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalUpctforma.g:5240:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_44);
            rule__Video__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__7"


    // $ANTLR start "rule__Video__Group__7__Impl"
    // InternalUpctforma.g:5247:1: rule__Video__Group__7__Impl : ( ( rule__Video__Group_7__0 )? ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5251:1: ( ( ( rule__Video__Group_7__0 )? ) )
            // InternalUpctforma.g:5252:1: ( ( rule__Video__Group_7__0 )? )
            {
            // InternalUpctforma.g:5252:1: ( ( rule__Video__Group_7__0 )? )
            // InternalUpctforma.g:5253:2: ( rule__Video__Group_7__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_7()); 
            // InternalUpctforma.g:5254:2: ( rule__Video__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctforma.g:5254:3: rule__Video__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__7__Impl"


    // $ANTLR start "rule__Video__Group__8"
    // InternalUpctforma.g:5262:1: rule__Video__Group__8 : rule__Video__Group__8__Impl ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5266:1: ( rule__Video__Group__8__Impl )
            // InternalUpctforma.g:5267:2: rule__Video__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__8"


    // $ANTLR start "rule__Video__Group__8__Impl"
    // InternalUpctforma.g:5273:1: rule__Video__Group__8__Impl : ( '}' ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5277:1: ( ( '}' ) )
            // InternalUpctforma.g:5278:1: ( '}' )
            {
            // InternalUpctforma.g:5278:1: ( '}' )
            // InternalUpctforma.g:5279:2: '}'
            {
             before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__8__Impl"


    // $ANTLR start "rule__Video__Group_3__0"
    // InternalUpctforma.g:5289:1: rule__Video__Group_3__0 : rule__Video__Group_3__0__Impl rule__Video__Group_3__1 ;
    public final void rule__Video__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5293:1: ( rule__Video__Group_3__0__Impl rule__Video__Group_3__1 )
            // InternalUpctforma.g:5294:2: rule__Video__Group_3__0__Impl rule__Video__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__0"


    // $ANTLR start "rule__Video__Group_3__0__Impl"
    // InternalUpctforma.g:5301:1: rule__Video__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Video__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5305:1: ( ( 'id' ) )
            // InternalUpctforma.g:5306:1: ( 'id' )
            {
            // InternalUpctforma.g:5306:1: ( 'id' )
            // InternalUpctforma.g:5307:2: 'id'
            {
             before(grammarAccess.getVideoAccess().getIdKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getIdKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__0__Impl"


    // $ANTLR start "rule__Video__Group_3__1"
    // InternalUpctforma.g:5316:1: rule__Video__Group_3__1 : rule__Video__Group_3__1__Impl ;
    public final void rule__Video__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5320:1: ( rule__Video__Group_3__1__Impl )
            // InternalUpctforma.g:5321:2: rule__Video__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__1"


    // $ANTLR start "rule__Video__Group_3__1__Impl"
    // InternalUpctforma.g:5327:1: rule__Video__Group_3__1__Impl : ( ( rule__Video__IdAssignment_3_1 ) ) ;
    public final void rule__Video__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5331:1: ( ( ( rule__Video__IdAssignment_3_1 ) ) )
            // InternalUpctforma.g:5332:1: ( ( rule__Video__IdAssignment_3_1 ) )
            {
            // InternalUpctforma.g:5332:1: ( ( rule__Video__IdAssignment_3_1 ) )
            // InternalUpctforma.g:5333:2: ( rule__Video__IdAssignment_3_1 )
            {
             before(grammarAccess.getVideoAccess().getIdAssignment_3_1()); 
            // InternalUpctforma.g:5334:2: ( rule__Video__IdAssignment_3_1 )
            // InternalUpctforma.g:5334:3: rule__Video__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getIdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__1__Impl"


    // $ANTLR start "rule__Video__Group_5__0"
    // InternalUpctforma.g:5343:1: rule__Video__Group_5__0 : rule__Video__Group_5__0__Impl rule__Video__Group_5__1 ;
    public final void rule__Video__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5347:1: ( rule__Video__Group_5__0__Impl rule__Video__Group_5__1 )
            // InternalUpctforma.g:5348:2: rule__Video__Group_5__0__Impl rule__Video__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Video__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_5__0"


    // $ANTLR start "rule__Video__Group_5__0__Impl"
    // InternalUpctforma.g:5355:1: rule__Video__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Video__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5359:1: ( ( 'title' ) )
            // InternalUpctforma.g:5360:1: ( 'title' )
            {
            // InternalUpctforma.g:5360:1: ( 'title' )
            // InternalUpctforma.g:5361:2: 'title'
            {
             before(grammarAccess.getVideoAccess().getTitleKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getTitleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_5__0__Impl"


    // $ANTLR start "rule__Video__Group_5__1"
    // InternalUpctforma.g:5370:1: rule__Video__Group_5__1 : rule__Video__Group_5__1__Impl ;
    public final void rule__Video__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5374:1: ( rule__Video__Group_5__1__Impl )
            // InternalUpctforma.g:5375:2: rule__Video__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_5__1"


    // $ANTLR start "rule__Video__Group_5__1__Impl"
    // InternalUpctforma.g:5381:1: rule__Video__Group_5__1__Impl : ( ( rule__Video__TitleAssignment_5_1 ) ) ;
    public final void rule__Video__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5385:1: ( ( ( rule__Video__TitleAssignment_5_1 ) ) )
            // InternalUpctforma.g:5386:1: ( ( rule__Video__TitleAssignment_5_1 ) )
            {
            // InternalUpctforma.g:5386:1: ( ( rule__Video__TitleAssignment_5_1 ) )
            // InternalUpctforma.g:5387:2: ( rule__Video__TitleAssignment_5_1 )
            {
             before(grammarAccess.getVideoAccess().getTitleAssignment_5_1()); 
            // InternalUpctforma.g:5388:2: ( rule__Video__TitleAssignment_5_1 )
            // InternalUpctforma.g:5388:3: rule__Video__TitleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__TitleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getTitleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_5__1__Impl"


    // $ANTLR start "rule__Video__Group_7__0"
    // InternalUpctforma.g:5397:1: rule__Video__Group_7__0 : rule__Video__Group_7__0__Impl rule__Video__Group_7__1 ;
    public final void rule__Video__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5401:1: ( rule__Video__Group_7__0__Impl rule__Video__Group_7__1 )
            // InternalUpctforma.g:5402:2: rule__Video__Group_7__0__Impl rule__Video__Group_7__1
            {
            pushFollow(FOLLOW_45);
            rule__Video__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_7__0"


    // $ANTLR start "rule__Video__Group_7__0__Impl"
    // InternalUpctforma.g:5409:1: rule__Video__Group_7__0__Impl : ( 'type' ) ;
    public final void rule__Video__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5413:1: ( ( 'type' ) )
            // InternalUpctforma.g:5414:1: ( 'type' )
            {
            // InternalUpctforma.g:5414:1: ( 'type' )
            // InternalUpctforma.g:5415:2: 'type'
            {
             before(grammarAccess.getVideoAccess().getTypeKeyword_7_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getTypeKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_7__0__Impl"


    // $ANTLR start "rule__Video__Group_7__1"
    // InternalUpctforma.g:5424:1: rule__Video__Group_7__1 : rule__Video__Group_7__1__Impl ;
    public final void rule__Video__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5428:1: ( rule__Video__Group_7__1__Impl )
            // InternalUpctforma.g:5429:2: rule__Video__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_7__1"


    // $ANTLR start "rule__Video__Group_7__1__Impl"
    // InternalUpctforma.g:5435:1: rule__Video__Group_7__1__Impl : ( ( rule__Video__TypeAssignment_7_1 ) ) ;
    public final void rule__Video__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5439:1: ( ( ( rule__Video__TypeAssignment_7_1 ) ) )
            // InternalUpctforma.g:5440:1: ( ( rule__Video__TypeAssignment_7_1 ) )
            {
            // InternalUpctforma.g:5440:1: ( ( rule__Video__TypeAssignment_7_1 ) )
            // InternalUpctforma.g:5441:2: ( rule__Video__TypeAssignment_7_1 )
            {
             before(grammarAccess.getVideoAccess().getTypeAssignment_7_1()); 
            // InternalUpctforma.g:5442:2: ( rule__Video__TypeAssignment_7_1 )
            // InternalUpctforma.g:5442:3: rule__Video__TypeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getTypeAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_7__1__Impl"


    // $ANTLR start "rule__SimpleElement_Impl__Group__0"
    // InternalUpctforma.g:5451:1: rule__SimpleElement_Impl__Group__0 : rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1 ;
    public final void rule__SimpleElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5455:1: ( rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1 )
            // InternalUpctforma.g:5456:2: rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__SimpleElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleElement_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement_Impl__Group__0"


    // $ANTLR start "rule__SimpleElement_Impl__Group__0__Impl"
    // InternalUpctforma.g:5463:1: rule__SimpleElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__SimpleElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5467:1: ( ( () ) )
            // InternalUpctforma.g:5468:1: ( () )
            {
            // InternalUpctforma.g:5468:1: ( () )
            // InternalUpctforma.g:5469:2: ()
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0()); 
            // InternalUpctforma.g:5470:2: ()
            // InternalUpctforma.g:5470:3: 
            {
            }

             after(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__SimpleElement_Impl__Group__1"
    // InternalUpctforma.g:5478:1: rule__SimpleElement_Impl__Group__1 : rule__SimpleElement_Impl__Group__1__Impl ;
    public final void rule__SimpleElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5482:1: ( rule__SimpleElement_Impl__Group__1__Impl )
            // InternalUpctforma.g:5483:2: rule__SimpleElement_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleElement_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement_Impl__Group__1"


    // $ANTLR start "rule__SimpleElement_Impl__Group__1__Impl"
    // InternalUpctforma.g:5489:1: rule__SimpleElement_Impl__Group__1__Impl : ( 'SimpleElement' ) ;
    public final void rule__SimpleElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5493:1: ( ( 'SimpleElement' ) )
            // InternalUpctforma.g:5494:1: ( 'SimpleElement' )
            {
            // InternalUpctforma.g:5494:1: ( 'SimpleElement' )
            // InternalUpctforma.g:5495:2: 'SimpleElement'
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__PlaceHolder__Group__0"
    // InternalUpctforma.g:5505:1: rule__PlaceHolder__Group__0 : rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1 ;
    public final void rule__PlaceHolder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5509:1: ( rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1 )
            // InternalUpctforma.g:5510:2: rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__PlaceHolder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlaceHolder__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceHolder__Group__0"


    // $ANTLR start "rule__PlaceHolder__Group__0__Impl"
    // InternalUpctforma.g:5517:1: rule__PlaceHolder__Group__0__Impl : ( 'Placeholder' ) ;
    public final void rule__PlaceHolder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5521:1: ( ( 'Placeholder' ) )
            // InternalUpctforma.g:5522:1: ( 'Placeholder' )
            {
            // InternalUpctforma.g:5522:1: ( 'Placeholder' )
            // InternalUpctforma.g:5523:2: 'Placeholder'
            {
             before(grammarAccess.getPlaceHolderAccess().getPlaceholderKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPlaceHolderAccess().getPlaceholderKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceHolder__Group__0__Impl"


    // $ANTLR start "rule__PlaceHolder__Group__1"
    // InternalUpctforma.g:5532:1: rule__PlaceHolder__Group__1 : rule__PlaceHolder__Group__1__Impl ;
    public final void rule__PlaceHolder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5536:1: ( rule__PlaceHolder__Group__1__Impl )
            // InternalUpctforma.g:5537:2: rule__PlaceHolder__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlaceHolder__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceHolder__Group__1"


    // $ANTLR start "rule__PlaceHolder__Group__1__Impl"
    // InternalUpctforma.g:5543:1: rule__PlaceHolder__Group__1__Impl : ( ( rule__PlaceHolder__TypeAssignment_1 ) ) ;
    public final void rule__PlaceHolder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5547:1: ( ( ( rule__PlaceHolder__TypeAssignment_1 ) ) )
            // InternalUpctforma.g:5548:1: ( ( rule__PlaceHolder__TypeAssignment_1 ) )
            {
            // InternalUpctforma.g:5548:1: ( ( rule__PlaceHolder__TypeAssignment_1 ) )
            // InternalUpctforma.g:5549:2: ( rule__PlaceHolder__TypeAssignment_1 )
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeAssignment_1()); 
            // InternalUpctforma.g:5550:2: ( rule__PlaceHolder__TypeAssignment_1 )
            // InternalUpctforma.g:5550:3: rule__PlaceHolder__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PlaceHolder__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceHolderAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceHolder__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__0"
    // InternalUpctforma.g:5559:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5563:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalUpctforma.g:5564:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalUpctforma.g:5571:1: rule__Game__Group__0__Impl : ( () ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5575:1: ( ( () ) )
            // InternalUpctforma.g:5576:1: ( () )
            {
            // InternalUpctforma.g:5576:1: ( () )
            // InternalUpctforma.g:5577:2: ()
            {
             before(grammarAccess.getGameAccess().getGameAction_0()); 
            // InternalUpctforma.g:5578:2: ()
            // InternalUpctforma.g:5578:3: 
            {
            }

             after(grammarAccess.getGameAccess().getGameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalUpctforma.g:5586:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5590:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalUpctforma.g:5591:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalUpctforma.g:5598:1: rule__Game__Group__1__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5602:1: ( ( 'Game' ) )
            // InternalUpctforma.g:5603:1: ( 'Game' )
            {
            // InternalUpctforma.g:5603:1: ( 'Game' )
            // InternalUpctforma.g:5604:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalUpctforma.g:5613:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5617:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalUpctforma.g:5618:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalUpctforma.g:5625:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5629:1: ( ( '{' ) )
            // InternalUpctforma.g:5630:1: ( '{' )
            {
            // InternalUpctforma.g:5630:1: ( '{' )
            // InternalUpctforma.g:5631:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalUpctforma.g:5640:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5644:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalUpctforma.g:5645:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalUpctforma.g:5652:1: rule__Game__Group__3__Impl : ( ( rule__Game__Group_3__0 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5656:1: ( ( ( rule__Game__Group_3__0 )? ) )
            // InternalUpctforma.g:5657:1: ( ( rule__Game__Group_3__0 )? )
            {
            // InternalUpctforma.g:5657:1: ( ( rule__Game__Group_3__0 )? )
            // InternalUpctforma.g:5658:2: ( rule__Game__Group_3__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_3()); 
            // InternalUpctforma.g:5659:2: ( rule__Game__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctforma.g:5659:3: rule__Game__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Game__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGameAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalUpctforma.g:5667:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5671:1: ( rule__Game__Group__4__Impl )
            // InternalUpctforma.g:5672:2: rule__Game__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalUpctforma.g:5678:1: rule__Game__Group__4__Impl : ( '}' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5682:1: ( ( '}' ) )
            // InternalUpctforma.g:5683:1: ( '}' )
            {
            // InternalUpctforma.g:5683:1: ( '}' )
            // InternalUpctforma.g:5684:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Game__Group_3__0"
    // InternalUpctforma.g:5694:1: rule__Game__Group_3__0 : rule__Game__Group_3__0__Impl rule__Game__Group_3__1 ;
    public final void rule__Game__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5698:1: ( rule__Game__Group_3__0__Impl rule__Game__Group_3__1 )
            // InternalUpctforma.g:5699:2: rule__Game__Group_3__0__Impl rule__Game__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Game__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__0"


    // $ANTLR start "rule__Game__Group_3__0__Impl"
    // InternalUpctforma.g:5706:1: rule__Game__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Game__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5710:1: ( ( 'id' ) )
            // InternalUpctforma.g:5711:1: ( 'id' )
            {
            // InternalUpctforma.g:5711:1: ( 'id' )
            // InternalUpctforma.g:5712:2: 'id'
            {
             before(grammarAccess.getGameAccess().getIdKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getIdKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__0__Impl"


    // $ANTLR start "rule__Game__Group_3__1"
    // InternalUpctforma.g:5721:1: rule__Game__Group_3__1 : rule__Game__Group_3__1__Impl ;
    public final void rule__Game__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5725:1: ( rule__Game__Group_3__1__Impl )
            // InternalUpctforma.g:5726:2: rule__Game__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__1"


    // $ANTLR start "rule__Game__Group_3__1__Impl"
    // InternalUpctforma.g:5732:1: rule__Game__Group_3__1__Impl : ( ( rule__Game__IdAssignment_3_1 ) ) ;
    public final void rule__Game__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5736:1: ( ( ( rule__Game__IdAssignment_3_1 ) ) )
            // InternalUpctforma.g:5737:1: ( ( rule__Game__IdAssignment_3_1 ) )
            {
            // InternalUpctforma.g:5737:1: ( ( rule__Game__IdAssignment_3_1 ) )
            // InternalUpctforma.g:5738:2: ( rule__Game__IdAssignment_3_1 )
            {
             before(grammarAccess.getGameAccess().getIdAssignment_3_1()); 
            // InternalUpctforma.g:5739:2: ( rule__Game__IdAssignment_3_1 )
            // InternalUpctforma.g:5739:3: rule__Game__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getIdAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_3__1__Impl"


    // $ANTLR start "rule__FieldValue__Group__0"
    // InternalUpctforma.g:5748:1: rule__FieldValue__Group__0 : rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 ;
    public final void rule__FieldValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5752:1: ( rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 )
            // InternalUpctforma.g:5753:2: rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__FieldValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group__0"


    // $ANTLR start "rule__FieldValue__Group__0__Impl"
    // InternalUpctforma.g:5760:1: rule__FieldValue__Group__0__Impl : ( ( rule__FieldValue__NameAssignment_0 ) ) ;
    public final void rule__FieldValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5764:1: ( ( ( rule__FieldValue__NameAssignment_0 ) ) )
            // InternalUpctforma.g:5765:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:5765:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            // InternalUpctforma.g:5766:2: ( rule__FieldValue__NameAssignment_0 )
            {
             before(grammarAccess.getFieldValueAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:5767:2: ( rule__FieldValue__NameAssignment_0 )
            // InternalUpctforma.g:5767:3: rule__FieldValue__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group__0__Impl"


    // $ANTLR start "rule__FieldValue__Group__1"
    // InternalUpctforma.g:5775:1: rule__FieldValue__Group__1 : rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 ;
    public final void rule__FieldValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5779:1: ( rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 )
            // InternalUpctforma.g:5780:2: rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__FieldValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group__1"


    // $ANTLR start "rule__FieldValue__Group__1__Impl"
    // InternalUpctforma.g:5787:1: rule__FieldValue__Group__1__Impl : ( ':' ) ;
    public final void rule__FieldValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5791:1: ( ( ':' ) )
            // InternalUpctforma.g:5792:1: ( ':' )
            {
            // InternalUpctforma.g:5792:1: ( ':' )
            // InternalUpctforma.g:5793:2: ':'
            {
             before(grammarAccess.getFieldValueAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFieldValueAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group__1__Impl"


    // $ANTLR start "rule__FieldValue__Group__2"
    // InternalUpctforma.g:5802:1: rule__FieldValue__Group__2 : rule__FieldValue__Group__2__Impl ;
    public final void rule__FieldValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5806:1: ( rule__FieldValue__Group__2__Impl )
            // InternalUpctforma.g:5807:2: rule__FieldValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group__2"


    // $ANTLR start "rule__FieldValue__Group__2__Impl"
    // InternalUpctforma.g:5813:1: rule__FieldValue__Group__2__Impl : ( ( rule__FieldValue__FieldvalueAssignment_2 ) ) ;
    public final void rule__FieldValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5817:1: ( ( ( rule__FieldValue__FieldvalueAssignment_2 ) ) )
            // InternalUpctforma.g:5818:1: ( ( rule__FieldValue__FieldvalueAssignment_2 ) )
            {
            // InternalUpctforma.g:5818:1: ( ( rule__FieldValue__FieldvalueAssignment_2 ) )
            // InternalUpctforma.g:5819:2: ( rule__FieldValue__FieldvalueAssignment_2 )
            {
             before(grammarAccess.getFieldValueAccess().getFieldvalueAssignment_2()); 
            // InternalUpctforma.g:5820:2: ( rule__FieldValue__FieldvalueAssignment_2 )
            // InternalUpctforma.g:5820:3: rule__FieldValue__FieldvalueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__FieldvalueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getFieldvalueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__Group__2__Impl"


    // $ANTLR start "rule__RecordValue__Group__0"
    // InternalUpctforma.g:5829:1: rule__RecordValue__Group__0 : rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1 ;
    public final void rule__RecordValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5833:1: ( rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1 )
            // InternalUpctforma.g:5834:2: rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__0"


    // $ANTLR start "rule__RecordValue__Group__0__Impl"
    // InternalUpctforma.g:5841:1: rule__RecordValue__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5845:1: ( ( '{' ) )
            // InternalUpctforma.g:5846:1: ( '{' )
            {
            // InternalUpctforma.g:5846:1: ( '{' )
            // InternalUpctforma.g:5847:2: '{'
            {
             before(grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__0__Impl"


    // $ANTLR start "rule__RecordValue__Group__1"
    // InternalUpctforma.g:5856:1: rule__RecordValue__Group__1 : rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2 ;
    public final void rule__RecordValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5860:1: ( rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2 )
            // InternalUpctforma.g:5861:2: rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RecordValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__1"


    // $ANTLR start "rule__RecordValue__Group__1__Impl"
    // InternalUpctforma.g:5868:1: rule__RecordValue__Group__1__Impl : ( ( rule__RecordValue__RecordvaluesAssignment_1 ) ) ;
    public final void rule__RecordValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5872:1: ( ( ( rule__RecordValue__RecordvaluesAssignment_1 ) ) )
            // InternalUpctforma.g:5873:1: ( ( rule__RecordValue__RecordvaluesAssignment_1 ) )
            {
            // InternalUpctforma.g:5873:1: ( ( rule__RecordValue__RecordvaluesAssignment_1 ) )
            // InternalUpctforma.g:5874:2: ( rule__RecordValue__RecordvaluesAssignment_1 )
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_1()); 
            // InternalUpctforma.g:5875:2: ( rule__RecordValue__RecordvaluesAssignment_1 )
            // InternalUpctforma.g:5875:3: rule__RecordValue__RecordvaluesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__RecordvaluesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__1__Impl"


    // $ANTLR start "rule__RecordValue__Group__2"
    // InternalUpctforma.g:5883:1: rule__RecordValue__Group__2 : rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3 ;
    public final void rule__RecordValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5887:1: ( rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3 )
            // InternalUpctforma.g:5888:2: rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RecordValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__2"


    // $ANTLR start "rule__RecordValue__Group__2__Impl"
    // InternalUpctforma.g:5895:1: rule__RecordValue__Group__2__Impl : ( ( rule__RecordValue__Group_2__0 )* ) ;
    public final void rule__RecordValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5899:1: ( ( ( rule__RecordValue__Group_2__0 )* ) )
            // InternalUpctforma.g:5900:1: ( ( rule__RecordValue__Group_2__0 )* )
            {
            // InternalUpctforma.g:5900:1: ( ( rule__RecordValue__Group_2__0 )* )
            // InternalUpctforma.g:5901:2: ( rule__RecordValue__Group_2__0 )*
            {
             before(grammarAccess.getRecordValueAccess().getGroup_2()); 
            // InternalUpctforma.g:5902:2: ( rule__RecordValue__Group_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==31) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUpctforma.g:5902:3: rule__RecordValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RecordValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getRecordValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__2__Impl"


    // $ANTLR start "rule__RecordValue__Group__3"
    // InternalUpctforma.g:5910:1: rule__RecordValue__Group__3 : rule__RecordValue__Group__3__Impl ;
    public final void rule__RecordValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5914:1: ( rule__RecordValue__Group__3__Impl )
            // InternalUpctforma.g:5915:2: rule__RecordValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__3"


    // $ANTLR start "rule__RecordValue__Group__3__Impl"
    // InternalUpctforma.g:5921:1: rule__RecordValue__Group__3__Impl : ( '}' ) ;
    public final void rule__RecordValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5925:1: ( ( '}' ) )
            // InternalUpctforma.g:5926:1: ( '}' )
            {
            // InternalUpctforma.g:5926:1: ( '}' )
            // InternalUpctforma.g:5927:2: '}'
            {
             before(grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group__3__Impl"


    // $ANTLR start "rule__RecordValue__Group_2__0"
    // InternalUpctforma.g:5937:1: rule__RecordValue__Group_2__0 : rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1 ;
    public final void rule__RecordValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5941:1: ( rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1 )
            // InternalUpctforma.g:5942:2: rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group_2__0"


    // $ANTLR start "rule__RecordValue__Group_2__0__Impl"
    // InternalUpctforma.g:5949:1: rule__RecordValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RecordValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5953:1: ( ( ',' ) )
            // InternalUpctforma.g:5954:1: ( ',' )
            {
            // InternalUpctforma.g:5954:1: ( ',' )
            // InternalUpctforma.g:5955:2: ','
            {
             before(grammarAccess.getRecordValueAccess().getCommaKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecordValueAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group_2__0__Impl"


    // $ANTLR start "rule__RecordValue__Group_2__1"
    // InternalUpctforma.g:5964:1: rule__RecordValue__Group_2__1 : rule__RecordValue__Group_2__1__Impl ;
    public final void rule__RecordValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5968:1: ( rule__RecordValue__Group_2__1__Impl )
            // InternalUpctforma.g:5969:2: rule__RecordValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group_2__1"


    // $ANTLR start "rule__RecordValue__Group_2__1__Impl"
    // InternalUpctforma.g:5975:1: rule__RecordValue__Group_2__1__Impl : ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) ) ;
    public final void rule__RecordValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5979:1: ( ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) ) )
            // InternalUpctforma.g:5980:1: ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) )
            {
            // InternalUpctforma.g:5980:1: ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) )
            // InternalUpctforma.g:5981:2: ( rule__RecordValue__RecordvaluesAssignment_2_1 )
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_2_1()); 
            // InternalUpctforma.g:5982:2: ( rule__RecordValue__RecordvaluesAssignment_2_1 )
            // InternalUpctforma.g:5982:3: rule__RecordValue__RecordvaluesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordValue__RecordvaluesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__Group_2__1__Impl"


    // $ANTLR start "rule__ListValue__Group__0"
    // InternalUpctforma.g:5991:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5995:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalUpctforma.g:5996:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ListValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0"


    // $ANTLR start "rule__ListValue__Group__0__Impl"
    // InternalUpctforma.g:6003:1: rule__ListValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6007:1: ( ( '[' ) )
            // InternalUpctforma.g:6008:1: ( '[' )
            {
            // InternalUpctforma.g:6008:1: ( '[' )
            // InternalUpctforma.g:6009:2: '['
            {
             before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__0__Impl"


    // $ANTLR start "rule__ListValue__Group__1"
    // InternalUpctforma.g:6018:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6022:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalUpctforma.g:6023:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__ListValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1"


    // $ANTLR start "rule__ListValue__Group__1__Impl"
    // InternalUpctforma.g:6030:1: rule__ListValue__Group__1__Impl : ( ( rule__ListValue__ListvaluesAssignment_1 ) ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6034:1: ( ( ( rule__ListValue__ListvaluesAssignment_1 ) ) )
            // InternalUpctforma.g:6035:1: ( ( rule__ListValue__ListvaluesAssignment_1 ) )
            {
            // InternalUpctforma.g:6035:1: ( ( rule__ListValue__ListvaluesAssignment_1 ) )
            // InternalUpctforma.g:6036:2: ( rule__ListValue__ListvaluesAssignment_1 )
            {
             before(grammarAccess.getListValueAccess().getListvaluesAssignment_1()); 
            // InternalUpctforma.g:6037:2: ( rule__ListValue__ListvaluesAssignment_1 )
            // InternalUpctforma.g:6037:3: rule__ListValue__ListvaluesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__ListvaluesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getListvaluesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__1__Impl"


    // $ANTLR start "rule__ListValue__Group__2"
    // InternalUpctforma.g:6045:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6049:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalUpctforma.g:6050:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_50);
            rule__ListValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2"


    // $ANTLR start "rule__ListValue__Group__2__Impl"
    // InternalUpctforma.g:6057:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__Group_2__0 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6061:1: ( ( ( rule__ListValue__Group_2__0 )* ) )
            // InternalUpctforma.g:6062:1: ( ( rule__ListValue__Group_2__0 )* )
            {
            // InternalUpctforma.g:6062:1: ( ( rule__ListValue__Group_2__0 )* )
            // InternalUpctforma.g:6063:2: ( rule__ListValue__Group_2__0 )*
            {
             before(grammarAccess.getListValueAccess().getGroup_2()); 
            // InternalUpctforma.g:6064:2: ( rule__ListValue__Group_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==31) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalUpctforma.g:6064:3: rule__ListValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ListValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getListValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__2__Impl"


    // $ANTLR start "rule__ListValue__Group__3"
    // InternalUpctforma.g:6072:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6076:1: ( rule__ListValue__Group__3__Impl )
            // InternalUpctforma.g:6077:2: rule__ListValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3"


    // $ANTLR start "rule__ListValue__Group__3__Impl"
    // InternalUpctforma.g:6083:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6087:1: ( ( ']' ) )
            // InternalUpctforma.g:6088:1: ( ']' )
            {
            // InternalUpctforma.g:6088:1: ( ']' )
            // InternalUpctforma.g:6089:2: ']'
            {
             before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group__3__Impl"


    // $ANTLR start "rule__ListValue__Group_2__0"
    // InternalUpctforma.g:6099:1: rule__ListValue__Group_2__0 : rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 ;
    public final void rule__ListValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6103:1: ( rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 )
            // InternalUpctforma.g:6104:2: rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ListValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__0"


    // $ANTLR start "rule__ListValue__Group_2__0__Impl"
    // InternalUpctforma.g:6111:1: rule__ListValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6115:1: ( ( ',' ) )
            // InternalUpctforma.g:6116:1: ( ',' )
            {
            // InternalUpctforma.g:6116:1: ( ',' )
            // InternalUpctforma.g:6117:2: ','
            {
             before(grammarAccess.getListValueAccess().getCommaKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getListValueAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__0__Impl"


    // $ANTLR start "rule__ListValue__Group_2__1"
    // InternalUpctforma.g:6126:1: rule__ListValue__Group_2__1 : rule__ListValue__Group_2__1__Impl ;
    public final void rule__ListValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6130:1: ( rule__ListValue__Group_2__1__Impl )
            // InternalUpctforma.g:6131:2: rule__ListValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__1"


    // $ANTLR start "rule__ListValue__Group_2__1__Impl"
    // InternalUpctforma.g:6137:1: rule__ListValue__Group_2__1__Impl : ( ( rule__ListValue__ListvaluesAssignment_2_1 ) ) ;
    public final void rule__ListValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6141:1: ( ( ( rule__ListValue__ListvaluesAssignment_2_1 ) ) )
            // InternalUpctforma.g:6142:1: ( ( rule__ListValue__ListvaluesAssignment_2_1 ) )
            {
            // InternalUpctforma.g:6142:1: ( ( rule__ListValue__ListvaluesAssignment_2_1 ) )
            // InternalUpctforma.g:6143:2: ( rule__ListValue__ListvaluesAssignment_2_1 )
            {
             before(grammarAccess.getListValueAccess().getListvaluesAssignment_2_1()); 
            // InternalUpctforma.g:6144:2: ( rule__ListValue__ListvaluesAssignment_2_1 )
            // InternalUpctforma.g:6144:3: rule__ListValue__ListvaluesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ListValue__ListvaluesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListValueAccess().getListvaluesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__Group_2__1__Impl"


    // $ANTLR start "rule__WidgetType__Group__0"
    // InternalUpctforma.g:6153:1: rule__WidgetType__Group__0 : rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 ;
    public final void rule__WidgetType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6157:1: ( rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 )
            // InternalUpctforma.g:6158:2: rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__WidgetType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__0"


    // $ANTLR start "rule__WidgetType__Group__0__Impl"
    // InternalUpctforma.g:6165:1: rule__WidgetType__Group__0__Impl : ( () ) ;
    public final void rule__WidgetType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6169:1: ( ( () ) )
            // InternalUpctforma.g:6170:1: ( () )
            {
            // InternalUpctforma.g:6170:1: ( () )
            // InternalUpctforma.g:6171:2: ()
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0()); 
            // InternalUpctforma.g:6172:2: ()
            // InternalUpctforma.g:6172:3: 
            {
            }

             after(grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__0__Impl"


    // $ANTLR start "rule__WidgetType__Group__1"
    // InternalUpctforma.g:6180:1: rule__WidgetType__Group__1 : rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 ;
    public final void rule__WidgetType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6184:1: ( rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 )
            // InternalUpctforma.g:6185:2: rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WidgetType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__1"


    // $ANTLR start "rule__WidgetType__Group__1__Impl"
    // InternalUpctforma.g:6192:1: rule__WidgetType__Group__1__Impl : ( 'widget' ) ;
    public final void rule__WidgetType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6196:1: ( ( 'widget' ) )
            // InternalUpctforma.g:6197:1: ( 'widget' )
            {
            // InternalUpctforma.g:6197:1: ( 'widget' )
            // InternalUpctforma.g:6198:2: 'widget'
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__1__Impl"


    // $ANTLR start "rule__WidgetType__Group__2"
    // InternalUpctforma.g:6207:1: rule__WidgetType__Group__2 : rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 ;
    public final void rule__WidgetType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6211:1: ( rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 )
            // InternalUpctforma.g:6212:2: rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WidgetType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__2"


    // $ANTLR start "rule__WidgetType__Group__2__Impl"
    // InternalUpctforma.g:6219:1: rule__WidgetType__Group__2__Impl : ( ( rule__WidgetType__NameAssignment_2 ) ) ;
    public final void rule__WidgetType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6223:1: ( ( ( rule__WidgetType__NameAssignment_2 ) ) )
            // InternalUpctforma.g:6224:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:6224:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            // InternalUpctforma.g:6225:2: ( rule__WidgetType__NameAssignment_2 )
            {
             before(grammarAccess.getWidgetTypeAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:6226:2: ( rule__WidgetType__NameAssignment_2 )
            // InternalUpctforma.g:6226:3: rule__WidgetType__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__2__Impl"


    // $ANTLR start "rule__WidgetType__Group__3"
    // InternalUpctforma.g:6234:1: rule__WidgetType__Group__3 : rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 ;
    public final void rule__WidgetType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6238:1: ( rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 )
            // InternalUpctforma.g:6239:2: rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__WidgetType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__3"


    // $ANTLR start "rule__WidgetType__Group__3__Impl"
    // InternalUpctforma.g:6246:1: rule__WidgetType__Group__3__Impl : ( '{' ) ;
    public final void rule__WidgetType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6250:1: ( ( '{' ) )
            // InternalUpctforma.g:6251:1: ( '{' )
            {
            // InternalUpctforma.g:6251:1: ( '{' )
            // InternalUpctforma.g:6252:2: '{'
            {
             before(grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__3__Impl"


    // $ANTLR start "rule__WidgetType__Group__4"
    // InternalUpctforma.g:6261:1: rule__WidgetType__Group__4 : rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 ;
    public final void rule__WidgetType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6265:1: ( rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 )
            // InternalUpctforma.g:6266:2: rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__WidgetType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__4"


    // $ANTLR start "rule__WidgetType__Group__4__Impl"
    // InternalUpctforma.g:6273:1: rule__WidgetType__Group__4__Impl : ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) ) ;
    public final void rule__WidgetType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6277:1: ( ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) ) )
            // InternalUpctforma.g:6278:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) )
            {
            // InternalUpctforma.g:6278:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) )
            // InternalUpctforma.g:6279:2: ( rule__WidgetType__WidgettypeelementsAssignment_4 )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_4()); 
            // InternalUpctforma.g:6280:2: ( rule__WidgetType__WidgettypeelementsAssignment_4 )
            // InternalUpctforma.g:6280:3: rule__WidgetType__WidgettypeelementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__WidgettypeelementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__4__Impl"


    // $ANTLR start "rule__WidgetType__Group__5"
    // InternalUpctforma.g:6288:1: rule__WidgetType__Group__5 : rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6 ;
    public final void rule__WidgetType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6292:1: ( rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6 )
            // InternalUpctforma.g:6293:2: rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__WidgetType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__5"


    // $ANTLR start "rule__WidgetType__Group__5__Impl"
    // InternalUpctforma.g:6300:1: rule__WidgetType__Group__5__Impl : ( ( rule__WidgetType__Group_5__0 )* ) ;
    public final void rule__WidgetType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6304:1: ( ( ( rule__WidgetType__Group_5__0 )* ) )
            // InternalUpctforma.g:6305:1: ( ( rule__WidgetType__Group_5__0 )* )
            {
            // InternalUpctforma.g:6305:1: ( ( rule__WidgetType__Group_5__0 )* )
            // InternalUpctforma.g:6306:2: ( rule__WidgetType__Group_5__0 )*
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup_5()); 
            // InternalUpctforma.g:6307:2: ( rule__WidgetType__Group_5__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalUpctforma.g:6307:3: rule__WidgetType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__WidgetType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getWidgetTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__5__Impl"


    // $ANTLR start "rule__WidgetType__Group__6"
    // InternalUpctforma.g:6315:1: rule__WidgetType__Group__6 : rule__WidgetType__Group__6__Impl ;
    public final void rule__WidgetType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6319:1: ( rule__WidgetType__Group__6__Impl )
            // InternalUpctforma.g:6320:2: rule__WidgetType__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__6"


    // $ANTLR start "rule__WidgetType__Group__6__Impl"
    // InternalUpctforma.g:6326:1: rule__WidgetType__Group__6__Impl : ( '}' ) ;
    public final void rule__WidgetType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6330:1: ( ( '}' ) )
            // InternalUpctforma.g:6331:1: ( '}' )
            {
            // InternalUpctforma.g:6331:1: ( '}' )
            // InternalUpctforma.g:6332:2: '}'
            {
             before(grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group__6__Impl"


    // $ANTLR start "rule__WidgetType__Group_5__0"
    // InternalUpctforma.g:6342:1: rule__WidgetType__Group_5__0 : rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1 ;
    public final void rule__WidgetType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6346:1: ( rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1 )
            // InternalUpctforma.g:6347:2: rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1
            {
            pushFollow(FOLLOW_47);
            rule__WidgetType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_5__0"


    // $ANTLR start "rule__WidgetType__Group_5__0__Impl"
    // InternalUpctforma.g:6354:1: rule__WidgetType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__WidgetType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6358:1: ( ( ',' ) )
            // InternalUpctforma.g:6359:1: ( ',' )
            {
            // InternalUpctforma.g:6359:1: ( ',' )
            // InternalUpctforma.g:6360:2: ','
            {
             before(grammarAccess.getWidgetTypeAccess().getCommaKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWidgetTypeAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_5__0__Impl"


    // $ANTLR start "rule__WidgetType__Group_5__1"
    // InternalUpctforma.g:6369:1: rule__WidgetType__Group_5__1 : rule__WidgetType__Group_5__1__Impl ;
    public final void rule__WidgetType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6373:1: ( rule__WidgetType__Group_5__1__Impl )
            // InternalUpctforma.g:6374:2: rule__WidgetType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_5__1"


    // $ANTLR start "rule__WidgetType__Group_5__1__Impl"
    // InternalUpctforma.g:6380:1: rule__WidgetType__Group_5__1__Impl : ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) ) ;
    public final void rule__WidgetType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6384:1: ( ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) ) )
            // InternalUpctforma.g:6385:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) )
            {
            // InternalUpctforma.g:6385:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) )
            // InternalUpctforma.g:6386:2: ( rule__WidgetType__WidgettypeelementsAssignment_5_1 )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_5_1()); 
            // InternalUpctforma.g:6387:2: ( rule__WidgetType__WidgettypeelementsAssignment_5_1 )
            // InternalUpctforma.g:6387:3: rule__WidgetType__WidgettypeelementsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__WidgetType__WidgettypeelementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeType_Impl__Group__0"
    // InternalUpctforma.g:6396:1: rule__CompositeType_Impl__Group__0 : rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1 ;
    public final void rule__CompositeType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6400:1: ( rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1 )
            // InternalUpctforma.g:6401:2: rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeType_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__Group__0"


    // $ANTLR start "rule__CompositeType_Impl__Group__0__Impl"
    // InternalUpctforma.g:6408:1: rule__CompositeType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__CompositeType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6412:1: ( ( () ) )
            // InternalUpctforma.g:6413:1: ( () )
            {
            // InternalUpctforma.g:6413:1: ( () )
            // InternalUpctforma.g:6414:2: ()
            {
             before(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeAction_0()); 
            // InternalUpctforma.g:6415:2: ()
            // InternalUpctforma.g:6415:3: 
            {
            }

             after(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__Group__0__Impl"


    // $ANTLR start "rule__CompositeType_Impl__Group__1"
    // InternalUpctforma.g:6423:1: rule__CompositeType_Impl__Group__1 : rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2 ;
    public final void rule__CompositeType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6427:1: ( rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2 )
            // InternalUpctforma.g:6428:2: rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CompositeType_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__Group__1"


    // $ANTLR start "rule__CompositeType_Impl__Group__1__Impl"
    // InternalUpctforma.g:6435:1: rule__CompositeType_Impl__Group__1__Impl : ( 'CompositeType' ) ;
    public final void rule__CompositeType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6439:1: ( ( 'CompositeType' ) )
            // InternalUpctforma.g:6440:1: ( 'CompositeType' )
            {
            // InternalUpctforma.g:6440:1: ( 'CompositeType' )
            // InternalUpctforma.g:6441:2: 'CompositeType'
            {
             before(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeKeyword_1()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__Group__1__Impl"


    // $ANTLR start "rule__CompositeType_Impl__Group__2"
    // InternalUpctforma.g:6450:1: rule__CompositeType_Impl__Group__2 : rule__CompositeType_Impl__Group__2__Impl ;
    public final void rule__CompositeType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6454:1: ( rule__CompositeType_Impl__Group__2__Impl )
            // InternalUpctforma.g:6455:2: rule__CompositeType_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__Group__2"


    // $ANTLR start "rule__CompositeType_Impl__Group__2__Impl"
    // InternalUpctforma.g:6461:1: rule__CompositeType_Impl__Group__2__Impl : ( ( rule__CompositeType_Impl__NameAssignment_2 ) ) ;
    public final void rule__CompositeType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6465:1: ( ( ( rule__CompositeType_Impl__NameAssignment_2 ) ) )
            // InternalUpctforma.g:6466:1: ( ( rule__CompositeType_Impl__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:6466:1: ( ( rule__CompositeType_Impl__NameAssignment_2 ) )
            // InternalUpctforma.g:6467:2: ( rule__CompositeType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeType_ImplAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:6468:2: ( rule__CompositeType_Impl__NameAssignment_2 )
            // InternalUpctforma.g:6468:3: rule__CompositeType_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeType_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeType_ImplAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalUpctforma.g:6477:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6481:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalUpctforma.g:6482:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalUpctforma.g:6489:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6493:1: ( ( () ) )
            // InternalUpctforma.g:6494:1: ( () )
            {
            // InternalUpctforma.g:6494:1: ( () )
            // InternalUpctforma.g:6495:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalUpctforma.g:6496:2: ()
            // InternalUpctforma.g:6496:3: 
            {
            }

             after(grammarAccess.getSectionAccess().getSectionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalUpctforma.g:6504:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6508:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalUpctforma.g:6509:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalUpctforma.g:6516:1: rule__Section__Group__1__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6520:1: ( ( 'Section' ) )
            // InternalUpctforma.g:6521:1: ( 'Section' )
            {
            // InternalUpctforma.g:6521:1: ( 'Section' )
            // InternalUpctforma.g:6522:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getSectionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalUpctforma.g:6531:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6535:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalUpctforma.g:6536:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalUpctforma.g:6543:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6547:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // InternalUpctforma.g:6548:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:6548:1: ( ( rule__Section__NameAssignment_2 ) )
            // InternalUpctforma.g:6549:2: ( rule__Section__NameAssignment_2 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:6550:2: ( rule__Section__NameAssignment_2 )
            // InternalUpctforma.g:6550:3: rule__Section__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalUpctforma.g:6558:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6562:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalUpctforma.g:6563:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_52);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalUpctforma.g:6570:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6574:1: ( ( '{' ) )
            // InternalUpctforma.g:6575:1: ( '{' )
            {
            // InternalUpctforma.g:6575:1: ( '{' )
            // InternalUpctforma.g:6576:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalUpctforma.g:6585:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6589:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalUpctforma.g:6590:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_52);
            rule__Section__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalUpctforma.g:6597:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6601:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // InternalUpctforma.g:6602:1: ( ( rule__Section__Group_4__0 )? )
            {
            // InternalUpctforma.g:6602:1: ( ( rule__Section__Group_4__0 )? )
            // InternalUpctforma.g:6603:2: ( rule__Section__Group_4__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalUpctforma.g:6604:2: ( rule__Section__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==67) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUpctforma.g:6604:3: rule__Section__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group__5"
    // InternalUpctforma.g:6612:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6616:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalUpctforma.g:6617:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_52);
            rule__Section__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5"


    // $ANTLR start "rule__Section__Group__5__Impl"
    // InternalUpctforma.g:6624:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6628:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // InternalUpctforma.g:6629:1: ( ( rule__Section__Group_5__0 )? )
            {
            // InternalUpctforma.g:6629:1: ( ( rule__Section__Group_5__0 )? )
            // InternalUpctforma.g:6630:2: ( rule__Section__Group_5__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_5()); 
            // InternalUpctforma.g:6631:2: ( rule__Section__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==57) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUpctforma.g:6631:3: rule__Section__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__5__Impl"


    // $ANTLR start "rule__Section__Group__6"
    // InternalUpctforma.g:6639:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6643:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalUpctforma.g:6644:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_52);
            rule__Section__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6"


    // $ANTLR start "rule__Section__Group__6__Impl"
    // InternalUpctforma.g:6651:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6655:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // InternalUpctforma.g:6656:1: ( ( rule__Section__Group_6__0 )? )
            {
            // InternalUpctforma.g:6656:1: ( ( rule__Section__Group_6__0 )? )
            // InternalUpctforma.g:6657:2: ( rule__Section__Group_6__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_6()); 
            // InternalUpctforma.g:6658:2: ( rule__Section__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctforma.g:6658:3: rule__Section__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__6__Impl"


    // $ANTLR start "rule__Section__Group__7"
    // InternalUpctforma.g:6666:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6670:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalUpctforma.g:6671:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_52);
            rule__Section__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7"


    // $ANTLR start "rule__Section__Group__7__Impl"
    // InternalUpctforma.g:6678:1: rule__Section__Group__7__Impl : ( ( rule__Section__Group_7__0 )? ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6682:1: ( ( ( rule__Section__Group_7__0 )? ) )
            // InternalUpctforma.g:6683:1: ( ( rule__Section__Group_7__0 )? )
            {
            // InternalUpctforma.g:6683:1: ( ( rule__Section__Group_7__0 )? )
            // InternalUpctforma.g:6684:2: ( rule__Section__Group_7__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_7()); 
            // InternalUpctforma.g:6685:2: ( rule__Section__Group_7__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==40) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUpctforma.g:6685:3: rule__Section__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Section__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSectionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__7__Impl"


    // $ANTLR start "rule__Section__Group__8"
    // InternalUpctforma.g:6693:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6697:1: ( rule__Section__Group__8__Impl )
            // InternalUpctforma.g:6698:2: rule__Section__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8"


    // $ANTLR start "rule__Section__Group__8__Impl"
    // InternalUpctforma.g:6704:1: rule__Section__Group__8__Impl : ( '}' ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6708:1: ( ( '}' ) )
            // InternalUpctforma.g:6709:1: ( '}' )
            {
            // InternalUpctforma.g:6709:1: ( '}' )
            // InternalUpctforma.g:6710:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__8__Impl"


    // $ANTLR start "rule__Section__Group_4__0"
    // InternalUpctforma.g:6720:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6724:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalUpctforma.g:6725:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0"


    // $ANTLR start "rule__Section__Group_4__0__Impl"
    // InternalUpctforma.g:6732:1: rule__Section__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6736:1: ( ( 'image' ) )
            // InternalUpctforma.g:6737:1: ( 'image' )
            {
            // InternalUpctforma.g:6737:1: ( 'image' )
            // InternalUpctforma.g:6738:2: 'image'
            {
             before(grammarAccess.getSectionAccess().getImageKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getImageKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__0__Impl"


    // $ANTLR start "rule__Section__Group_4__1"
    // InternalUpctforma.g:6747:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6751:1: ( rule__Section__Group_4__1__Impl )
            // InternalUpctforma.g:6752:2: rule__Section__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1"


    // $ANTLR start "rule__Section__Group_4__1__Impl"
    // InternalUpctforma.g:6758:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__ImageAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6762:1: ( ( ( rule__Section__ImageAssignment_4_1 ) ) )
            // InternalUpctforma.g:6763:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            {
            // InternalUpctforma.g:6763:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            // InternalUpctforma.g:6764:2: ( rule__Section__ImageAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getImageAssignment_4_1()); 
            // InternalUpctforma.g:6765:2: ( rule__Section__ImageAssignment_4_1 )
            // InternalUpctforma.g:6765:3: rule__Section__ImageAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__ImageAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getImageAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_4__1__Impl"


    // $ANTLR start "rule__Section__Group_5__0"
    // InternalUpctforma.g:6774:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6778:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // InternalUpctforma.g:6779:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Section__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__0"


    // $ANTLR start "rule__Section__Group_5__0__Impl"
    // InternalUpctforma.g:6786:1: rule__Section__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6790:1: ( ( 'title' ) )
            // InternalUpctforma.g:6791:1: ( 'title' )
            {
            // InternalUpctforma.g:6791:1: ( 'title' )
            // InternalUpctforma.g:6792:2: 'title'
            {
             before(grammarAccess.getSectionAccess().getTitleKeyword_5_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTitleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__0__Impl"


    // $ANTLR start "rule__Section__Group_5__1"
    // InternalUpctforma.g:6801:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6805:1: ( rule__Section__Group_5__1__Impl )
            // InternalUpctforma.g:6806:2: rule__Section__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__1"


    // $ANTLR start "rule__Section__Group_5__1__Impl"
    // InternalUpctforma.g:6812:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__TitleAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6816:1: ( ( ( rule__Section__TitleAssignment_5_1 ) ) )
            // InternalUpctforma.g:6817:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            {
            // InternalUpctforma.g:6817:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            // InternalUpctforma.g:6818:2: ( rule__Section__TitleAssignment_5_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_5_1()); 
            // InternalUpctforma.g:6819:2: ( rule__Section__TitleAssignment_5_1 )
            // InternalUpctforma.g:6819:3: rule__Section__TitleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__TitleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTitleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_5__1__Impl"


    // $ANTLR start "rule__Section__Group_6__0"
    // InternalUpctforma.g:6828:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6832:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // InternalUpctforma.g:6833:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_53);
            rule__Section__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__0"


    // $ANTLR start "rule__Section__Group_6__0__Impl"
    // InternalUpctforma.g:6840:1: rule__Section__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6844:1: ( ( 'type' ) )
            // InternalUpctforma.g:6845:1: ( 'type' )
            {
            // InternalUpctforma.g:6845:1: ( 'type' )
            // InternalUpctforma.g:6846:2: 'type'
            {
             before(grammarAccess.getSectionAccess().getTypeKeyword_6_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__0__Impl"


    // $ANTLR start "rule__Section__Group_6__1"
    // InternalUpctforma.g:6855:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6859:1: ( rule__Section__Group_6__1__Impl )
            // InternalUpctforma.g:6860:2: rule__Section__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__1"


    // $ANTLR start "rule__Section__Group_6__1__Impl"
    // InternalUpctforma.g:6866:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__TypeAssignment_6_1 ) ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6870:1: ( ( ( rule__Section__TypeAssignment_6_1 ) ) )
            // InternalUpctforma.g:6871:1: ( ( rule__Section__TypeAssignment_6_1 ) )
            {
            // InternalUpctforma.g:6871:1: ( ( rule__Section__TypeAssignment_6_1 ) )
            // InternalUpctforma.g:6872:2: ( rule__Section__TypeAssignment_6_1 )
            {
             before(grammarAccess.getSectionAccess().getTypeAssignment_6_1()); 
            // InternalUpctforma.g:6873:2: ( rule__Section__TypeAssignment_6_1 )
            // InternalUpctforma.g:6873:3: rule__Section__TypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__TypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_6__1__Impl"


    // $ANTLR start "rule__Section__Group_7__0"
    // InternalUpctforma.g:6882:1: rule__Section__Group_7__0 : rule__Section__Group_7__0__Impl rule__Section__Group_7__1 ;
    public final void rule__Section__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6886:1: ( rule__Section__Group_7__0__Impl rule__Section__Group_7__1 )
            // InternalUpctforma.g:6887:2: rule__Section__Group_7__0__Impl rule__Section__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Section__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7__0"


    // $ANTLR start "rule__Section__Group_7__0__Impl"
    // InternalUpctforma.g:6894:1: rule__Section__Group_7__0__Impl : ( ( rule__Section__RowsAssignment_7_0 ) ) ;
    public final void rule__Section__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6898:1: ( ( ( rule__Section__RowsAssignment_7_0 ) ) )
            // InternalUpctforma.g:6899:1: ( ( rule__Section__RowsAssignment_7_0 ) )
            {
            // InternalUpctforma.g:6899:1: ( ( rule__Section__RowsAssignment_7_0 ) )
            // InternalUpctforma.g:6900:2: ( rule__Section__RowsAssignment_7_0 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_7_0()); 
            // InternalUpctforma.g:6901:2: ( rule__Section__RowsAssignment_7_0 )
            // InternalUpctforma.g:6901:3: rule__Section__RowsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Section__RowsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getRowsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7__0__Impl"


    // $ANTLR start "rule__Section__Group_7__1"
    // InternalUpctforma.g:6909:1: rule__Section__Group_7__1 : rule__Section__Group_7__1__Impl ;
    public final void rule__Section__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6913:1: ( rule__Section__Group_7__1__Impl )
            // InternalUpctforma.g:6914:2: rule__Section__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7__1"


    // $ANTLR start "rule__Section__Group_7__1__Impl"
    // InternalUpctforma.g:6920:1: rule__Section__Group_7__1__Impl : ( ( rule__Section__Group_7_1__0 )* ) ;
    public final void rule__Section__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6924:1: ( ( ( rule__Section__Group_7_1__0 )* ) )
            // InternalUpctforma.g:6925:1: ( ( rule__Section__Group_7_1__0 )* )
            {
            // InternalUpctforma.g:6925:1: ( ( rule__Section__Group_7_1__0 )* )
            // InternalUpctforma.g:6926:2: ( rule__Section__Group_7_1__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_7_1()); 
            // InternalUpctforma.g:6927:2: ( rule__Section__Group_7_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==31) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUpctforma.g:6927:3: rule__Section__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Section__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7__1__Impl"


    // $ANTLR start "rule__Section__Group_7_1__0"
    // InternalUpctforma.g:6936:1: rule__Section__Group_7_1__0 : rule__Section__Group_7_1__0__Impl rule__Section__Group_7_1__1 ;
    public final void rule__Section__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6940:1: ( rule__Section__Group_7_1__0__Impl rule__Section__Group_7_1__1 )
            // InternalUpctforma.g:6941:2: rule__Section__Group_7_1__0__Impl rule__Section__Group_7_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Section__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7_1__0"


    // $ANTLR start "rule__Section__Group_7_1__0__Impl"
    // InternalUpctforma.g:6948:1: rule__Section__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__Section__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6952:1: ( ( ',' ) )
            // InternalUpctforma.g:6953:1: ( ',' )
            {
            // InternalUpctforma.g:6953:1: ( ',' )
            // InternalUpctforma.g:6954:2: ','
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_7_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getCommaKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7_1__0__Impl"


    // $ANTLR start "rule__Section__Group_7_1__1"
    // InternalUpctforma.g:6963:1: rule__Section__Group_7_1__1 : rule__Section__Group_7_1__1__Impl ;
    public final void rule__Section__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6967:1: ( rule__Section__Group_7_1__1__Impl )
            // InternalUpctforma.g:6968:2: rule__Section__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7_1__1"


    // $ANTLR start "rule__Section__Group_7_1__1__Impl"
    // InternalUpctforma.g:6974:1: rule__Section__Group_7_1__1__Impl : ( ( rule__Section__RowsAssignment_7_1_1 ) ) ;
    public final void rule__Section__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6978:1: ( ( ( rule__Section__RowsAssignment_7_1_1 ) ) )
            // InternalUpctforma.g:6979:1: ( ( rule__Section__RowsAssignment_7_1_1 ) )
            {
            // InternalUpctforma.g:6979:1: ( ( rule__Section__RowsAssignment_7_1_1 ) )
            // InternalUpctforma.g:6980:2: ( rule__Section__RowsAssignment_7_1_1 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_7_1_1()); 
            // InternalUpctforma.g:6981:2: ( rule__Section__RowsAssignment_7_1_1 )
            // InternalUpctforma.g:6981:3: rule__Section__RowsAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__RowsAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getRowsAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_7_1__1__Impl"


    // $ANTLR start "rule__SimpleType__Group__0"
    // InternalUpctforma.g:6990:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6994:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // InternalUpctforma.g:6995:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__SimpleType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0"


    // $ANTLR start "rule__SimpleType__Group__0__Impl"
    // InternalUpctforma.g:7002:1: rule__SimpleType__Group__0__Impl : ( () ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7006:1: ( ( () ) )
            // InternalUpctforma.g:7007:1: ( () )
            {
            // InternalUpctforma.g:7007:1: ( () )
            // InternalUpctforma.g:7008:2: ()
            {
             before(grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0()); 
            // InternalUpctforma.g:7009:2: ()
            // InternalUpctforma.g:7009:3: 
            {
            }

             after(grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__0__Impl"


    // $ANTLR start "rule__SimpleType__Group__1"
    // InternalUpctforma.g:7017:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7021:1: ( rule__SimpleType__Group__1__Impl )
            // InternalUpctforma.g:7022:2: rule__SimpleType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1"


    // $ANTLR start "rule__SimpleType__Group__1__Impl"
    // InternalUpctforma.g:7028:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7032:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // InternalUpctforma.g:7033:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:7033:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // InternalUpctforma.g:7034:2: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:7035:2: ( rule__SimpleType__NameAssignment_1 )
            // InternalUpctforma.g:7035:3: rule__SimpleType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__0"
    // InternalUpctforma.g:7044:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7048:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalUpctforma.g:7049:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RecordType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0"


    // $ANTLR start "rule__RecordType__Group__0__Impl"
    // InternalUpctforma.g:7056:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__NameAssignment_0 ) ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7060:1: ( ( ( rule__RecordType__NameAssignment_0 ) ) )
            // InternalUpctforma.g:7061:1: ( ( rule__RecordType__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:7061:1: ( ( rule__RecordType__NameAssignment_0 ) )
            // InternalUpctforma.g:7062:2: ( rule__RecordType__NameAssignment_0 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:7063:2: ( rule__RecordType__NameAssignment_0 )
            // InternalUpctforma.g:7063:3: rule__RecordType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__0__Impl"


    // $ANTLR start "rule__RecordType__Group__1"
    // InternalUpctforma.g:7071:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7075:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalUpctforma.g:7076:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RecordType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1"


    // $ANTLR start "rule__RecordType__Group__1__Impl"
    // InternalUpctforma.g:7083:1: rule__RecordType__Group__1__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7087:1: ( ( '{' ) )
            // InternalUpctforma.g:7088:1: ( '{' )
            {
            // InternalUpctforma.g:7088:1: ( '{' )
            // InternalUpctforma.g:7089:2: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__1__Impl"


    // $ANTLR start "rule__RecordType__Group__2"
    // InternalUpctforma.g:7098:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7102:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalUpctforma.g:7103:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RecordType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2"


    // $ANTLR start "rule__RecordType__Group__2__Impl"
    // InternalUpctforma.g:7110:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__RecordtypeAssignment_2 ) ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7114:1: ( ( ( rule__RecordType__RecordtypeAssignment_2 ) ) )
            // InternalUpctforma.g:7115:1: ( ( rule__RecordType__RecordtypeAssignment_2 ) )
            {
            // InternalUpctforma.g:7115:1: ( ( rule__RecordType__RecordtypeAssignment_2 ) )
            // InternalUpctforma.g:7116:2: ( rule__RecordType__RecordtypeAssignment_2 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_2()); 
            // InternalUpctforma.g:7117:2: ( rule__RecordType__RecordtypeAssignment_2 )
            // InternalUpctforma.g:7117:3: rule__RecordType__RecordtypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordtypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__2__Impl"


    // $ANTLR start "rule__RecordType__Group__3"
    // InternalUpctforma.g:7125:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7129:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalUpctforma.g:7130:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RecordType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3"


    // $ANTLR start "rule__RecordType__Group__3__Impl"
    // InternalUpctforma.g:7137:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__Group_3__0 )* ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7141:1: ( ( ( rule__RecordType__Group_3__0 )* ) )
            // InternalUpctforma.g:7142:1: ( ( rule__RecordType__Group_3__0 )* )
            {
            // InternalUpctforma.g:7142:1: ( ( rule__RecordType__Group_3__0 )* )
            // InternalUpctforma.g:7143:2: ( rule__RecordType__Group_3__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_3()); 
            // InternalUpctforma.g:7144:2: ( rule__RecordType__Group_3__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==31) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUpctforma.g:7144:3: rule__RecordType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RecordType__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getRecordTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__3__Impl"


    // $ANTLR start "rule__RecordType__Group__4"
    // InternalUpctforma.g:7152:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7156:1: ( rule__RecordType__Group__4__Impl )
            // InternalUpctforma.g:7157:2: rule__RecordType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4"


    // $ANTLR start "rule__RecordType__Group__4__Impl"
    // InternalUpctforma.g:7163:1: rule__RecordType__Group__4__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7167:1: ( ( '}' ) )
            // InternalUpctforma.g:7168:1: ( '}' )
            {
            // InternalUpctforma.g:7168:1: ( '}' )
            // InternalUpctforma.g:7169:2: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group__4__Impl"


    // $ANTLR start "rule__RecordType__Group_3__0"
    // InternalUpctforma.g:7179:1: rule__RecordType__Group_3__0 : rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 ;
    public final void rule__RecordType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7183:1: ( rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 )
            // InternalUpctforma.g:7184:2: rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__RecordType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RecordType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__0"


    // $ANTLR start "rule__RecordType__Group_3__0__Impl"
    // InternalUpctforma.g:7191:1: rule__RecordType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7195:1: ( ( ',' ) )
            // InternalUpctforma.g:7196:1: ( ',' )
            {
            // InternalUpctforma.g:7196:1: ( ',' )
            // InternalUpctforma.g:7197:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRecordTypeAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__0__Impl"


    // $ANTLR start "rule__RecordType__Group_3__1"
    // InternalUpctforma.g:7206:1: rule__RecordType__Group_3__1 : rule__RecordType__Group_3__1__Impl ;
    public final void rule__RecordType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7210:1: ( rule__RecordType__Group_3__1__Impl )
            // InternalUpctforma.g:7211:2: rule__RecordType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__1"


    // $ANTLR start "rule__RecordType__Group_3__1__Impl"
    // InternalUpctforma.g:7217:1: rule__RecordType__Group_3__1__Impl : ( ( rule__RecordType__RecordtypeAssignment_3_1 ) ) ;
    public final void rule__RecordType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7221:1: ( ( ( rule__RecordType__RecordtypeAssignment_3_1 ) ) )
            // InternalUpctforma.g:7222:1: ( ( rule__RecordType__RecordtypeAssignment_3_1 ) )
            {
            // InternalUpctforma.g:7222:1: ( ( rule__RecordType__RecordtypeAssignment_3_1 ) )
            // InternalUpctforma.g:7223:2: ( rule__RecordType__RecordtypeAssignment_3_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_3_1()); 
            // InternalUpctforma.g:7224:2: ( rule__RecordType__RecordtypeAssignment_3_1 )
            // InternalUpctforma.g:7224:3: rule__RecordType__RecordtypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RecordType__RecordtypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__Group_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalUpctforma.g:7233:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7237:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalUpctforma.g:7238:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalUpctforma.g:7245:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7249:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalUpctforma.g:7250:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:7250:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalUpctforma.g:7251:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:7252:2: ( rule__Field__NameAssignment_0 )
            // InternalUpctforma.g:7252:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalUpctforma.g:7260:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7264:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalUpctforma.g:7265:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalUpctforma.g:7272:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7276:1: ( ( ':' ) )
            // InternalUpctforma.g:7277:1: ( ':' )
            {
            // InternalUpctforma.g:7277:1: ( ':' )
            // InternalUpctforma.g:7278:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalUpctforma.g:7287:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7291:1: ( rule__Field__Group__2__Impl )
            // InternalUpctforma.g:7292:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalUpctforma.g:7298:1: rule__Field__Group__2__Impl : ( ( rule__Field__FieldtypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7302:1: ( ( ( rule__Field__FieldtypeAssignment_2 ) ) )
            // InternalUpctforma.g:7303:1: ( ( rule__Field__FieldtypeAssignment_2 ) )
            {
            // InternalUpctforma.g:7303:1: ( ( rule__Field__FieldtypeAssignment_2 ) )
            // InternalUpctforma.g:7304:2: ( rule__Field__FieldtypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getFieldtypeAssignment_2()); 
            // InternalUpctforma.g:7305:2: ( rule__Field__FieldtypeAssignment_2 )
            // InternalUpctforma.g:7305:3: rule__Field__FieldtypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__FieldtypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getFieldtypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__ListType__Group__0"
    // InternalUpctforma.g:7314:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7318:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalUpctforma.g:7319:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0"


    // $ANTLR start "rule__ListType__Group__0__Impl"
    // InternalUpctforma.g:7326:1: rule__ListType__Group__0__Impl : ( ( rule__ListType__NameAssignment_0 ) ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7330:1: ( ( ( rule__ListType__NameAssignment_0 ) ) )
            // InternalUpctforma.g:7331:1: ( ( rule__ListType__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:7331:1: ( ( rule__ListType__NameAssignment_0 ) )
            // InternalUpctforma.g:7332:2: ( rule__ListType__NameAssignment_0 )
            {
             before(grammarAccess.getListTypeAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:7333:2: ( rule__ListType__NameAssignment_0 )
            // InternalUpctforma.g:7333:3: rule__ListType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0__Impl"


    // $ANTLR start "rule__ListType__Group__1"
    // InternalUpctforma.g:7341:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7345:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalUpctforma.g:7346:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_55);
            rule__ListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1"


    // $ANTLR start "rule__ListType__Group__1__Impl"
    // InternalUpctforma.g:7353:1: rule__ListType__Group__1__Impl : ( '{' ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7357:1: ( ( '{' ) )
            // InternalUpctforma.g:7358:1: ( '{' )
            {
            // InternalUpctforma.g:7358:1: ( '{' )
            // InternalUpctforma.g:7359:2: '{'
            {
             before(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1__Impl"


    // $ANTLR start "rule__ListType__Group__2"
    // InternalUpctforma.g:7368:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7372:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // InternalUpctforma.g:7373:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__ListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2"


    // $ANTLR start "rule__ListType__Group__2__Impl"
    // InternalUpctforma.g:7380:1: rule__ListType__Group__2__Impl : ( 'list_of' ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7384:1: ( ( 'list_of' ) )
            // InternalUpctforma.g:7385:1: ( 'list_of' )
            {
            // InternalUpctforma.g:7385:1: ( 'list_of' )
            // InternalUpctforma.g:7386:2: 'list_of'
            {
             before(grammarAccess.getListTypeAccess().getList_ofKeyword_2()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getList_ofKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2__Impl"


    // $ANTLR start "rule__ListType__Group__3"
    // InternalUpctforma.g:7395:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl rule__ListType__Group__4 ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7399:1: ( rule__ListType__Group__3__Impl rule__ListType__Group__4 )
            // InternalUpctforma.g:7400:2: rule__ListType__Group__3__Impl rule__ListType__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__ListType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3"


    // $ANTLR start "rule__ListType__Group__3__Impl"
    // InternalUpctforma.g:7407:1: rule__ListType__Group__3__Impl : ( ( rule__ListType__ListtypeAssignment_3 ) ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7411:1: ( ( ( rule__ListType__ListtypeAssignment_3 ) ) )
            // InternalUpctforma.g:7412:1: ( ( rule__ListType__ListtypeAssignment_3 ) )
            {
            // InternalUpctforma.g:7412:1: ( ( rule__ListType__ListtypeAssignment_3 ) )
            // InternalUpctforma.g:7413:2: ( rule__ListType__ListtypeAssignment_3 )
            {
             before(grammarAccess.getListTypeAccess().getListtypeAssignment_3()); 
            // InternalUpctforma.g:7414:2: ( rule__ListType__ListtypeAssignment_3 )
            // InternalUpctforma.g:7414:3: rule__ListType__ListtypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ListType__ListtypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getListtypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3__Impl"


    // $ANTLR start "rule__ListType__Group__4"
    // InternalUpctforma.g:7422:1: rule__ListType__Group__4 : rule__ListType__Group__4__Impl ;
    public final void rule__ListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7426:1: ( rule__ListType__Group__4__Impl )
            // InternalUpctforma.g:7427:2: rule__ListType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__4"


    // $ANTLR start "rule__ListType__Group__4__Impl"
    // InternalUpctforma.g:7433:1: rule__ListType__Group__4__Impl : ( '}' ) ;
    public final void rule__ListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7437:1: ( ( '}' ) )
            // InternalUpctforma.g:7438:1: ( '}' )
            {
            // InternalUpctforma.g:7438:1: ( '}' )
            // InternalUpctforma.g:7439:2: '}'
            {
             before(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__4__Impl"


    // $ANTLR start "rule__ContentDefinition__NameAssignment_2"
    // InternalUpctforma.g:7449:1: rule__ContentDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7453:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7454:2: ( ruleEString )
            {
            // InternalUpctforma.g:7454:2: ( ruleEString )
            // InternalUpctforma.g:7455:3: ruleEString
            {
             before(grammarAccess.getContentDefinitionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__NameAssignment_2"


    // $ANTLR start "rule__ContentDefinition__NameAssignment_4_1"
    // InternalUpctforma.g:7464:1: rule__ContentDefinition__NameAssignment_4_1 : ( ruleQualifiedName ) ;
    public final void rule__ContentDefinition__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7468:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:7469:2: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:7469:2: ( ruleQualifiedName )
            // InternalUpctforma.g:7470:3: ruleQualifiedName
            {
             before(grammarAccess.getContentDefinitionAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getNameQualifiedNameParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__NameAssignment_4_1"


    // $ANTLR start "rule__ContentDefinition__ImportsAssignment_5_0"
    // InternalUpctforma.g:7479:1: rule__ContentDefinition__ImportsAssignment_5_0 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7483:1: ( ( ruleImport ) )
            // InternalUpctforma.g:7484:2: ( ruleImport )
            {
            // InternalUpctforma.g:7484:2: ( ruleImport )
            // InternalUpctforma.g:7485:3: ruleImport
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__ImportsAssignment_5_0"


    // $ANTLR start "rule__ContentDefinition__ImportsAssignment_5_1_1"
    // InternalUpctforma.g:7494:1: rule__ContentDefinition__ImportsAssignment_5_1_1 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7498:1: ( ( ruleImport ) )
            // InternalUpctforma.g:7499:2: ( ruleImport )
            {
            // InternalUpctforma.g:7499:2: ( ruleImport )
            // InternalUpctforma.g:7500:3: ruleImport
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__ImportsAssignment_5_1_1"


    // $ANTLR start "rule__ContentDefinition__TypesAssignment_6_2"
    // InternalUpctforma.g:7509:1: rule__ContentDefinition__TypesAssignment_6_2 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7513:1: ( ( ruleType ) )
            // InternalUpctforma.g:7514:2: ( ruleType )
            {
            // InternalUpctforma.g:7514:2: ( ruleType )
            // InternalUpctforma.g:7515:3: ruleType
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__TypesAssignment_6_2"


    // $ANTLR start "rule__ContentDefinition__TypesAssignment_6_3_1"
    // InternalUpctforma.g:7524:1: rule__ContentDefinition__TypesAssignment_6_3_1 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7528:1: ( ( ruleType ) )
            // InternalUpctforma.g:7529:2: ( ruleType )
            {
            // InternalUpctforma.g:7529:2: ( ruleType )
            // InternalUpctforma.g:7530:3: ruleType
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__TypesAssignment_6_3_1"


    // $ANTLR start "rule__ContentDefinition__TemplatesAssignment_7_2"
    // InternalUpctforma.g:7539:1: rule__ContentDefinition__TemplatesAssignment_7_2 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7543:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:7544:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:7544:2: ( ruleTemplateDef )
            // InternalUpctforma.g:7545:3: ruleTemplateDef
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__TemplatesAssignment_7_2"


    // $ANTLR start "rule__ContentDefinition__TemplatesAssignment_7_3_1"
    // InternalUpctforma.g:7554:1: rule__ContentDefinition__TemplatesAssignment_7_3_1 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7558:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:7559:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:7559:2: ( ruleTemplateDef )
            // InternalUpctforma.g:7560:3: ruleTemplateDef
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemplateDef();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__TemplatesAssignment_7_3_1"


    // $ANTLR start "rule__ContentDefinition__UnitAssignment_8"
    // InternalUpctforma.g:7569:1: rule__ContentDefinition__UnitAssignment_8 : ( ruleContentUnit ) ;
    public final void rule__ContentDefinition__UnitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7573:1: ( ( ruleContentUnit ) )
            // InternalUpctforma.g:7574:2: ( ruleContentUnit )
            {
            // InternalUpctforma.g:7574:2: ( ruleContentUnit )
            // InternalUpctforma.g:7575:3: ruleContentUnit
            {
             before(grammarAccess.getContentDefinitionAccess().getUnitContentUnitParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleContentUnit();

            state._fsp--;

             after(grammarAccess.getContentDefinitionAccess().getUnitContentUnitParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentDefinition__UnitAssignment_8"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalUpctforma.g:7584:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7588:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalUpctforma.g:7589:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalUpctforma.g:7589:2: ( ruleQualifiedNameWithWildcard )
            // InternalUpctforma.g:7590:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__TemplateDef__NameAssignment_2"
    // InternalUpctforma.g:7599:1: rule__TemplateDef__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TemplateDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7603:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7604:2: ( ruleEString )
            {
            // InternalUpctforma.g:7604:2: ( ruleEString )
            // InternalUpctforma.g:7605:3: ruleEString
            {
             before(grammarAccess.getTemplateDefAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTemplateDefAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__NameAssignment_2"


    // $ANTLR start "rule__TemplateDef__RowsAssignment_4_0"
    // InternalUpctforma.g:7614:1: rule__TemplateDef__RowsAssignment_4_0 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7618:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7619:2: ( ruleRow )
            {
            // InternalUpctforma.g:7619:2: ( ruleRow )
            // InternalUpctforma.g:7620:3: ruleRow
            {
             before(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__RowsAssignment_4_0"


    // $ANTLR start "rule__TemplateDef__RowsAssignment_4_1_1"
    // InternalUpctforma.g:7629:1: rule__TemplateDef__RowsAssignment_4_1_1 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7633:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7634:2: ( ruleRow )
            {
            // InternalUpctforma.g:7634:2: ( ruleRow )
            // InternalUpctforma.g:7635:3: ruleRow
            {
             before(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateDef__RowsAssignment_4_1_1"


    // $ANTLR start "rule__ContentUnit__NameAssignment_1"
    // InternalUpctforma.g:7644:1: rule__ContentUnit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ContentUnit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7648:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7649:2: ( ruleEString )
            {
            // InternalUpctforma.g:7649:2: ( ruleEString )
            // InternalUpctforma.g:7650:3: ruleEString
            {
             before(grammarAccess.getContentUnitAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__NameAssignment_1"


    // $ANTLR start "rule__ContentUnit__AuthorAssignment_2"
    // InternalUpctforma.g:7659:1: rule__ContentUnit__AuthorAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentUnit__AuthorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7663:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7664:2: ( ruleEString )
            {
            // InternalUpctforma.g:7664:2: ( ruleEString )
            // InternalUpctforma.g:7665:3: ruleEString
            {
             before(grammarAccess.getContentUnitAccess().getAuthorEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getAuthorEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__AuthorAssignment_2"


    // $ANTLR start "rule__ContentUnit__TypeAssignment_3"
    // InternalUpctforma.g:7674:1: rule__ContentUnit__TypeAssignment_3 : ( ruleContentUnitType ) ;
    public final void rule__ContentUnit__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7678:1: ( ( ruleContentUnitType ) )
            // InternalUpctforma.g:7679:2: ( ruleContentUnitType )
            {
            // InternalUpctforma.g:7679:2: ( ruleContentUnitType )
            // InternalUpctforma.g:7680:3: ruleContentUnitType
            {
             before(grammarAccess.getContentUnitAccess().getTypeContentUnitTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleContentUnitType();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getTypeContentUnitTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__TypeAssignment_3"


    // $ANTLR start "rule__ContentUnit__LanguageAssignment_4"
    // InternalUpctforma.g:7689:1: rule__ContentUnit__LanguageAssignment_4 : ( ruleLanguageType ) ;
    public final void rule__ContentUnit__LanguageAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7693:1: ( ( ruleLanguageType ) )
            // InternalUpctforma.g:7694:2: ( ruleLanguageType )
            {
            // InternalUpctforma.g:7694:2: ( ruleLanguageType )
            // InternalUpctforma.g:7695:3: ruleLanguageType
            {
             before(grammarAccess.getContentUnitAccess().getLanguageLanguageTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageType();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getLanguageLanguageTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__LanguageAssignment_4"


    // $ANTLR start "rule__ContentUnit__SectionsAssignment_6"
    // InternalUpctforma.g:7704:1: rule__ContentUnit__SectionsAssignment_6 : ( ruleSection ) ;
    public final void rule__ContentUnit__SectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7708:1: ( ( ruleSection ) )
            // InternalUpctforma.g:7709:2: ( ruleSection )
            {
            // InternalUpctforma.g:7709:2: ( ruleSection )
            // InternalUpctforma.g:7710:3: ruleSection
            {
             before(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__SectionsAssignment_6"


    // $ANTLR start "rule__ContentUnit__SectionsAssignment_7_1"
    // InternalUpctforma.g:7719:1: rule__ContentUnit__SectionsAssignment_7_1 : ( ruleSection ) ;
    public final void rule__ContentUnit__SectionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7723:1: ( ( ruleSection ) )
            // InternalUpctforma.g:7724:2: ( ruleSection )
            {
            // InternalUpctforma.g:7724:2: ( ruleSection )
            // InternalUpctforma.g:7725:3: ruleSection
            {
             before(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__SectionsAssignment_7_1"


    // $ANTLR start "rule__Type_Impl__NameAssignment_2"
    // InternalUpctforma.g:7734:1: rule__Type_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7738:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7739:2: ( ruleEString )
            {
            // InternalUpctforma.g:7739:2: ( ruleEString )
            // InternalUpctforma.g:7740:3: ruleEString
            {
             before(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__NameAssignment_2"


    // $ANTLR start "rule__Row__ColumnsAssignment_3_0"
    // InternalUpctforma.g:7749:1: rule__Row__ColumnsAssignment_3_0 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7753:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:7754:2: ( ruleColumn )
            {
            // InternalUpctforma.g:7754:2: ( ruleColumn )
            // InternalUpctforma.g:7755:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ColumnsAssignment_3_0"


    // $ANTLR start "rule__Row__ColumnsAssignment_3_1_1"
    // InternalUpctforma.g:7764:1: rule__Row__ColumnsAssignment_3_1_1 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7768:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:7769:2: ( ruleColumn )
            {
            // InternalUpctforma.g:7769:2: ( ruleColumn )
            // InternalUpctforma.g:7770:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ColumnsAssignment_3_1_1"


    // $ANTLR start "rule__Row__UsetemplateAssignment_4_1"
    // InternalUpctforma.g:7779:1: rule__Row__UsetemplateAssignment_4_1 : ( ruleUseTemplate ) ;
    public final void rule__Row__UsetemplateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7783:1: ( ( ruleUseTemplate ) )
            // InternalUpctforma.g:7784:2: ( ruleUseTemplate )
            {
            // InternalUpctforma.g:7784:2: ( ruleUseTemplate )
            // InternalUpctforma.g:7785:3: ruleUseTemplate
            {
             before(grammarAccess.getRowAccess().getUsetemplateUseTemplateParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUseTemplate();

            state._fsp--;

             after(grammarAccess.getRowAccess().getUsetemplateUseTemplateParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__UsetemplateAssignment_4_1"


    // $ANTLR start "rule__Column__WidthAssignment_3_1"
    // InternalUpctforma.g:7794:1: rule__Column__WidthAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Column__WidthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7798:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7799:2: ( ruleEString )
            {
            // InternalUpctforma.g:7799:2: ( ruleEString )
            // InternalUpctforma.g:7800:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__WidthAssignment_3_1"


    // $ANTLR start "rule__Column__ElementsAssignment_4_0"
    // InternalUpctforma.g:7809:1: rule__Column__ElementsAssignment_4_0 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7813:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7814:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7814:2: ( ruleContentElement )
            // InternalUpctforma.g:7815:3: ruleContentElement
            {
             before(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ElementsAssignment_4_0"


    // $ANTLR start "rule__Column__ElementsAssignment_4_1_1"
    // InternalUpctforma.g:7824:1: rule__Column__ElementsAssignment_4_1_1 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7828:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7829:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7829:2: ( ruleContentElement )
            // InternalUpctforma.g:7830:3: ruleContentElement
            {
             before(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ElementsAssignment_4_1_1"


    // $ANTLR start "rule__UseTemplate__TypetemplateAssignment_1"
    // InternalUpctforma.g:7839:1: rule__UseTemplate__TypetemplateAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__UseTemplate__TypetemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7843:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:7844:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:7844:2: ( ( ruleEString ) )
            // InternalUpctforma.g:7845:3: ( ruleEString )
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0()); 
            // InternalUpctforma.g:7846:3: ( ruleEString )
            // InternalUpctforma.g:7847:4: ruleEString
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__TypetemplateAssignment_1"


    // $ANTLR start "rule__UseTemplate__TemplateelementsAssignment_2_1"
    // InternalUpctforma.g:7858:1: rule__UseTemplate__TemplateelementsAssignment_2_1 : ( ruleContentElement ) ;
    public final void rule__UseTemplate__TemplateelementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7862:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7863:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7863:2: ( ruleContentElement )
            // InternalUpctforma.g:7864:3: ruleContentElement
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__TemplateelementsAssignment_2_1"


    // $ANTLR start "rule__UseTemplate__TemplateelementsAssignment_2_2_1"
    // InternalUpctforma.g:7873:1: rule__UseTemplate__TemplateelementsAssignment_2_2_1 : ( ruleContentElement ) ;
    public final void rule__UseTemplate__TemplateelementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7877:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7878:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7878:2: ( ruleContentElement )
            // InternalUpctforma.g:7879:3: ruleContentElement
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseTemplate__TemplateelementsAssignment_2_2_1"


    // $ANTLR start "rule__Image__UrlAssignment_3_1"
    // InternalUpctforma.g:7888:1: rule__Image__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Image__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7892:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7893:2: ( ruleEString )
            {
            // InternalUpctforma.g:7893:2: ( ruleEString )
            // InternalUpctforma.g:7894:3: ruleEString
            {
             before(grammarAccess.getImageAccess().getUrlEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getImageAccess().getUrlEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__UrlAssignment_3_1"


    // $ANTLR start "rule__Image__TypeAssignment_5"
    // InternalUpctforma.g:7903:1: rule__Image__TypeAssignment_5 : ( ruleImageType ) ;
    public final void rule__Image__TypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7907:1: ( ( ruleImageType ) )
            // InternalUpctforma.g:7908:2: ( ruleImageType )
            {
            // InternalUpctforma.g:7908:2: ( ruleImageType )
            // InternalUpctforma.g:7909:3: ruleImageType
            {
             before(grammarAccess.getImageAccess().getTypeImageTypeEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleImageType();

            state._fsp--;

             after(grammarAccess.getImageAccess().getTypeImageTypeEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__TypeAssignment_5"


    // $ANTLR start "rule__Widget__NameAssignment_1"
    // InternalUpctforma.g:7918:1: rule__Widget__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Widget__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7922:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7923:2: ( ruleEString )
            {
            // InternalUpctforma.g:7923:2: ( ruleEString )
            // InternalUpctforma.g:7924:3: ruleEString
            {
             before(grammarAccess.getWidgetAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__NameAssignment_1"


    // $ANTLR start "rule__Widget__WidgettypeAssignment_3"
    // InternalUpctforma.g:7933:1: rule__Widget__WidgettypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Widget__WidgettypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7937:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:7938:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:7938:2: ( ( ruleEString ) )
            // InternalUpctforma.g:7939:3: ( ruleEString )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0()); 
            // InternalUpctforma.g:7940:3: ( ruleEString )
            // InternalUpctforma.g:7941:4: ruleEString
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__WidgettypeAssignment_3"


    // $ANTLR start "rule__Widget__WidgetelementsAssignment_4_1"
    // InternalUpctforma.g:7952:1: rule__Widget__WidgetelementsAssignment_4_1 : ( ruleContentElement ) ;
    public final void rule__Widget__WidgetelementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7956:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7957:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7957:2: ( ruleContentElement )
            // InternalUpctforma.g:7958:3: ruleContentElement
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__WidgetelementsAssignment_4_1"


    // $ANTLR start "rule__Widget__WidgetelementsAssignment_4_2_1"
    // InternalUpctforma.g:7967:1: rule__Widget__WidgetelementsAssignment_4_2_1 : ( ruleContentElement ) ;
    public final void rule__Widget__WidgetelementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7971:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7972:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7972:2: ( ruleContentElement )
            // InternalUpctforma.g:7973:3: ruleContentElement
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Widget__WidgetelementsAssignment_4_2_1"


    // $ANTLR start "rule__Text__HtmlAssignment_2_1"
    // InternalUpctforma.g:7982:1: rule__Text__HtmlAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Text__HtmlAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7986:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7987:2: ( ruleEString )
            {
            // InternalUpctforma.g:7987:2: ( ruleEString )
            // InternalUpctforma.g:7988:3: ruleEString
            {
             before(grammarAccess.getTextAccess().getHtmlEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAccess().getHtmlEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__HtmlAssignment_2_1"


    // $ANTLR start "rule__Number__NumAssignment_2"
    // InternalUpctforma.g:7997:1: rule__Number__NumAssignment_2 : ( ruleEInt ) ;
    public final void rule__Number__NumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8001:1: ( ( ruleEInt ) )
            // InternalUpctforma.g:8002:2: ( ruleEInt )
            {
            // InternalUpctforma.g:8002:2: ( ruleEInt )
            // InternalUpctforma.g:8003:3: ruleEInt
            {
             before(grammarAccess.getNumberAccess().getNumEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getNumEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__NumAssignment_2"


    // $ANTLR start "rule__Literal__LiteralAssignment_2"
    // InternalUpctforma.g:8012:1: rule__Literal__LiteralAssignment_2 : ( ruleEString ) ;
    public final void rule__Literal__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8016:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8017:2: ( ruleEString )
            {
            // InternalUpctforma.g:8017:2: ( ruleEString )
            // InternalUpctforma.g:8018:3: ruleEString
            {
             before(grammarAccess.getLiteralAccess().getLiteralEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getLiteralEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__LiteralAssignment_2"


    // $ANTLR start "rule__Video__IdAssignment_3_1"
    // InternalUpctforma.g:8027:1: rule__Video__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Video__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8031:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8032:2: ( ruleEString )
            {
            // InternalUpctforma.g:8032:2: ( ruleEString )
            // InternalUpctforma.g:8033:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__IdAssignment_3_1"


    // $ANTLR start "rule__Video__TitleAssignment_5_1"
    // InternalUpctforma.g:8042:1: rule__Video__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Video__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8046:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8047:2: ( ruleEString )
            {
            // InternalUpctforma.g:8047:2: ( ruleEString )
            // InternalUpctforma.g:8048:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getTitleEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getTitleEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__TitleAssignment_5_1"


    // $ANTLR start "rule__Video__TypeAssignment_7_1"
    // InternalUpctforma.g:8057:1: rule__Video__TypeAssignment_7_1 : ( ruleVideoType ) ;
    public final void rule__Video__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8061:1: ( ( ruleVideoType ) )
            // InternalUpctforma.g:8062:2: ( ruleVideoType )
            {
            // InternalUpctforma.g:8062:2: ( ruleVideoType )
            // InternalUpctforma.g:8063:3: ruleVideoType
            {
             before(grammarAccess.getVideoAccess().getTypeVideoTypeEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoType();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getTypeVideoTypeEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__TypeAssignment_7_1"


    // $ANTLR start "rule__PlaceHolder__TypeAssignment_1"
    // InternalUpctforma.g:8072:1: rule__PlaceHolder__TypeAssignment_1 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__PlaceHolder__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8076:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:8077:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:8077:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:8078:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeTypeCrossReference_1_0()); 
            // InternalUpctforma.g:8079:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:8080:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeTypeEPrimitiveTypesParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getPlaceHolderAccess().getTypeTypeEPrimitiveTypesParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPlaceHolderAccess().getTypeTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlaceHolder__TypeAssignment_1"


    // $ANTLR start "rule__Game__IdAssignment_3_1"
    // InternalUpctforma.g:8091:1: rule__Game__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Game__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8095:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8096:2: ( ruleEString )
            {
            // InternalUpctforma.g:8096:2: ( ruleEString )
            // InternalUpctforma.g:8097:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getIdEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__IdAssignment_3_1"


    // $ANTLR start "rule__FieldValue__NameAssignment_0"
    // InternalUpctforma.g:8106:1: rule__FieldValue__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__FieldValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8110:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8111:2: ( ruleEString )
            {
            // InternalUpctforma.g:8111:2: ( ruleEString )
            // InternalUpctforma.g:8112:3: ruleEString
            {
             before(grammarAccess.getFieldValueAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldValueAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__NameAssignment_0"


    // $ANTLR start "rule__FieldValue__FieldvalueAssignment_2"
    // InternalUpctforma.g:8121:1: rule__FieldValue__FieldvalueAssignment_2 : ( ruleContentElement ) ;
    public final void rule__FieldValue__FieldvalueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8125:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:8126:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:8126:2: ( ruleContentElement )
            // InternalUpctforma.g:8127:3: ruleContentElement
            {
             before(grammarAccess.getFieldValueAccess().getFieldvalueContentElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getFieldValueAccess().getFieldvalueContentElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldValue__FieldvalueAssignment_2"


    // $ANTLR start "rule__RecordValue__RecordvaluesAssignment_1"
    // InternalUpctforma.g:8136:1: rule__RecordValue__RecordvaluesAssignment_1 : ( ruleFieldValue ) ;
    public final void rule__RecordValue__RecordvaluesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8140:1: ( ( ruleFieldValue ) )
            // InternalUpctforma.g:8141:2: ( ruleFieldValue )
            {
            // InternalUpctforma.g:8141:2: ( ruleFieldValue )
            // InternalUpctforma.g:8142:3: ruleFieldValue
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__RecordvaluesAssignment_1"


    // $ANTLR start "rule__RecordValue__RecordvaluesAssignment_2_1"
    // InternalUpctforma.g:8151:1: rule__RecordValue__RecordvaluesAssignment_2_1 : ( ruleFieldValue ) ;
    public final void rule__RecordValue__RecordvaluesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8155:1: ( ( ruleFieldValue ) )
            // InternalUpctforma.g:8156:2: ( ruleFieldValue )
            {
            // InternalUpctforma.g:8156:2: ( ruleFieldValue )
            // InternalUpctforma.g:8157:3: ruleFieldValue
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordValue__RecordvaluesAssignment_2_1"


    // $ANTLR start "rule__ListValue__ListvaluesAssignment_1"
    // InternalUpctforma.g:8166:1: rule__ListValue__ListvaluesAssignment_1 : ( ruleContentElement ) ;
    public final void rule__ListValue__ListvaluesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8170:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:8171:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:8171:2: ( ruleContentElement )
            // InternalUpctforma.g:8172:3: ruleContentElement
            {
             before(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__ListvaluesAssignment_1"


    // $ANTLR start "rule__ListValue__ListvaluesAssignment_2_1"
    // InternalUpctforma.g:8181:1: rule__ListValue__ListvaluesAssignment_2_1 : ( ruleContentElement ) ;
    public final void rule__ListValue__ListvaluesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8185:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:8186:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:8186:2: ( ruleContentElement )
            // InternalUpctforma.g:8187:3: ruleContentElement
            {
             before(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContentElement();

            state._fsp--;

             after(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListValue__ListvaluesAssignment_2_1"


    // $ANTLR start "rule__WidgetType__NameAssignment_2"
    // InternalUpctforma.g:8196:1: rule__WidgetType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WidgetType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8200:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8201:2: ( ruleEString )
            {
            // InternalUpctforma.g:8201:2: ( ruleEString )
            // InternalUpctforma.g:8202:3: ruleEString
            {
             before(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__NameAssignment_2"


    // $ANTLR start "rule__WidgetType__WidgettypeelementsAssignment_4"
    // InternalUpctforma.g:8211:1: rule__WidgetType__WidgettypeelementsAssignment_4 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__WidgetType__WidgettypeelementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8215:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:8216:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:8216:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:8217:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_4_0()); 
            // InternalUpctforma.g:8218:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:8219:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__WidgettypeelementsAssignment_4"


    // $ANTLR start "rule__WidgetType__WidgettypeelementsAssignment_5_1"
    // InternalUpctforma.g:8230:1: rule__WidgetType__WidgettypeelementsAssignment_5_1 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__WidgetType__WidgettypeelementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8234:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:8235:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:8235:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:8236:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_5_1_0()); 
            // InternalUpctforma.g:8237:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:8238:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeEPrimitiveTypesParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WidgetType__WidgettypeelementsAssignment_5_1"


    // $ANTLR start "rule__CompositeType_Impl__NameAssignment_2"
    // InternalUpctforma.g:8249:1: rule__CompositeType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CompositeType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8253:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8254:2: ( ruleEString )
            {
            // InternalUpctforma.g:8254:2: ( ruleEString )
            // InternalUpctforma.g:8255:3: ruleEString
            {
             before(grammarAccess.getCompositeType_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeType_ImplAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeType_Impl__NameAssignment_2"


    // $ANTLR start "rule__Section__NameAssignment_2"
    // InternalUpctforma.g:8264:1: rule__Section__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8268:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8269:2: ( ruleEString )
            {
            // InternalUpctforma.g:8269:2: ( ruleEString )
            // InternalUpctforma.g:8270:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_2"


    // $ANTLR start "rule__Section__ImageAssignment_4_1"
    // InternalUpctforma.g:8279:1: rule__Section__ImageAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Section__ImageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8283:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8284:2: ( ruleEString )
            {
            // InternalUpctforma.g:8284:2: ( ruleEString )
            // InternalUpctforma.g:8285:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__ImageAssignment_4_1"


    // $ANTLR start "rule__Section__TitleAssignment_5_1"
    // InternalUpctforma.g:8294:1: rule__Section__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Section__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8298:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8299:2: ( ruleEString )
            {
            // InternalUpctforma.g:8299:2: ( ruleEString )
            // InternalUpctforma.g:8300:3: ruleEString
            {
             before(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TitleAssignment_5_1"


    // $ANTLR start "rule__Section__TypeAssignment_6_1"
    // InternalUpctforma.g:8309:1: rule__Section__TypeAssignment_6_1 : ( ruleSectionType ) ;
    public final void rule__Section__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8313:1: ( ( ruleSectionType ) )
            // InternalUpctforma.g:8314:2: ( ruleSectionType )
            {
            // InternalUpctforma.g:8314:2: ( ruleSectionType )
            // InternalUpctforma.g:8315:3: ruleSectionType
            {
             before(grammarAccess.getSectionAccess().getTypeSectionTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSectionType();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getTypeSectionTypeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__TypeAssignment_6_1"


    // $ANTLR start "rule__Section__RowsAssignment_7_0"
    // InternalUpctforma.g:8324:1: rule__Section__RowsAssignment_7_0 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8328:1: ( ( ruleRow ) )
            // InternalUpctforma.g:8329:2: ( ruleRow )
            {
            // InternalUpctforma.g:8329:2: ( ruleRow )
            // InternalUpctforma.g:8330:3: ruleRow
            {
             before(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__RowsAssignment_7_0"


    // $ANTLR start "rule__Section__RowsAssignment_7_1_1"
    // InternalUpctforma.g:8339:1: rule__Section__RowsAssignment_7_1_1 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8343:1: ( ( ruleRow ) )
            // InternalUpctforma.g:8344:2: ( ruleRow )
            {
            // InternalUpctforma.g:8344:2: ( ruleRow )
            // InternalUpctforma.g:8345:3: ruleRow
            {
             before(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__RowsAssignment_7_1_1"


    // $ANTLR start "rule__SimpleType__NameAssignment_1"
    // InternalUpctforma.g:8354:1: rule__SimpleType__NameAssignment_1 : ( RULE_PRIMITIVETYPES ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8358:1: ( ( RULE_PRIMITIVETYPES ) )
            // InternalUpctforma.g:8359:2: ( RULE_PRIMITIVETYPES )
            {
            // InternalUpctforma.g:8359:2: ( RULE_PRIMITIVETYPES )
            // InternalUpctforma.g:8360:3: RULE_PRIMITIVETYPES
            {
             before(grammarAccess.getSimpleTypeAccess().getNamePrimitiveTypesTerminalRuleCall_1_0()); 
            match(input,RULE_PRIMITIVETYPES,FOLLOW_2); 
             after(grammarAccess.getSimpleTypeAccess().getNamePrimitiveTypesTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleType__NameAssignment_1"


    // $ANTLR start "rule__RecordType__NameAssignment_0"
    // InternalUpctforma.g:8369:1: rule__RecordType__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RecordType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8373:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8374:2: ( ruleEString )
            {
            // InternalUpctforma.g:8374:2: ( ruleEString )
            // InternalUpctforma.g:8375:3: ruleEString
            {
             before(grammarAccess.getRecordTypeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__NameAssignment_0"


    // $ANTLR start "rule__RecordType__RecordtypeAssignment_2"
    // InternalUpctforma.g:8384:1: rule__RecordType__RecordtypeAssignment_2 : ( ruleField ) ;
    public final void rule__RecordType__RecordtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8388:1: ( ( ruleField ) )
            // InternalUpctforma.g:8389:2: ( ruleField )
            {
            // InternalUpctforma.g:8389:2: ( ruleField )
            // InternalUpctforma.g:8390:3: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__RecordtypeAssignment_2"


    // $ANTLR start "rule__RecordType__RecordtypeAssignment_3_1"
    // InternalUpctforma.g:8399:1: rule__RecordType__RecordtypeAssignment_3_1 : ( ruleField ) ;
    public final void rule__RecordType__RecordtypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8403:1: ( ( ruleField ) )
            // InternalUpctforma.g:8404:2: ( ruleField )
            {
            // InternalUpctforma.g:8404:2: ( ruleField )
            // InternalUpctforma.g:8405:3: ruleField
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordType__RecordtypeAssignment_3_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalUpctforma.g:8414:1: rule__Field__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8418:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8419:2: ( ruleEString )
            {
            // InternalUpctforma.g:8419:2: ( ruleEString )
            // InternalUpctforma.g:8420:3: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__FieldtypeAssignment_2"
    // InternalUpctforma.g:8429:1: rule__Field__FieldtypeAssignment_2 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__Field__FieldtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8433:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:8434:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:8434:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:8435:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getFieldAccess().getFieldtypeTypeCrossReference_2_0()); 
            // InternalUpctforma.g:8436:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:8437:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getFieldAccess().getFieldtypeTypeEPrimitiveTypesParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getFieldtypeTypeEPrimitiveTypesParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFieldAccess().getFieldtypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__FieldtypeAssignment_2"


    // $ANTLR start "rule__ListType__NameAssignment_0"
    // InternalUpctforma.g:8448:1: rule__ListType__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ListType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8452:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8453:2: ( ruleEString )
            {
            // InternalUpctforma.g:8453:2: ( ruleEString )
            // InternalUpctforma.g:8454:3: ruleEString
            {
             before(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__NameAssignment_0"


    // $ANTLR start "rule__ListType__ListtypeAssignment_3"
    // InternalUpctforma.g:8463:1: rule__ListType__ListtypeAssignment_3 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__ListType__ListtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8467:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:8468:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:8468:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:8469:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getListTypeAccess().getListtypeTypeCrossReference_3_0()); 
            // InternalUpctforma.g:8470:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:8471:4: ruleEPrimitiveTypes
            {
             before(grammarAccess.getListTypeAccess().getListtypeTypeEPrimitiveTypesParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getListtypeTypeEPrimitiveTypesParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getListTypeAccess().getListtypeTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__ListtypeAssignment_3"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\uffff\2\33\2\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\101\2\uffff\2\33\2\uffff\1\104\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\6\1\uffff\1\3\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\2\40\uffff\1\1\30\uffff\1\5\1\6",
            "",
            "",
            "\1\7",
            "\1\7",
            "",
            "",
            "\2\10\76\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1032:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004B30000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008000000070L,0x0000000000000003L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000060010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000018000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x78DABD0018000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x78DAB50008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000010000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000080000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000080000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000010000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000080000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0600010010000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});

}