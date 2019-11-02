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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_PRIMITIVETYPES", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Interoperability'", "'Open'", "'Preview'", "'BackgroundImage'", "'BackgroundColour'", "'ContentDefinition'", "'{'", "'}'", "'package'", "';'", "','", "'types'", "'templates'", "'.'", "'import'", "'.*'", "'TemplateDef'", "'Unit'", "'Type'", "'row'", "'usetemplate'", "'column'", "'width'", "'ContentElement'", "'Image'", "'url'", "'Widget'", "':'", "'Text'", "'html'", "'Int'", "'Literal'", "'-'", "'Composite'", "'Video'", "'id'", "'title'", "'SimpleElement'", "'Placeholder'", "'Game'", "'['", "']'", "'widget'", "'CompositeType'", "'Section'", "'image'", "'type'", "'list_of'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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


    // $ANTLR start "ruleSectionType"
    // InternalUpctforma.g:969:1: ruleSectionType : ( ( rule__SectionType__Alternatives ) ) ;
    public final void ruleSectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:973:1: ( ( ( rule__SectionType__Alternatives ) ) )
            // InternalUpctforma.g:974:2: ( ( rule__SectionType__Alternatives ) )
            {
            // InternalUpctforma.g:974:2: ( ( rule__SectionType__Alternatives ) )
            // InternalUpctforma.g:975:3: ( rule__SectionType__Alternatives )
            {
             before(grammarAccess.getSectionTypeAccess().getAlternatives()); 
            // InternalUpctforma.g:976:3: ( rule__SectionType__Alternatives )
            // InternalUpctforma.g:976:4: rule__SectionType__Alternatives
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
    // InternalUpctforma.g:984:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:988:1: ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) )
            int alt1=6;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalUpctforma.g:989:2: ( ruleType_Impl )
                    {
                    // InternalUpctforma.g:989:2: ( ruleType_Impl )
                    // InternalUpctforma.g:990:3: ruleType_Impl
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
                    // InternalUpctforma.g:995:2: ( ruleSimpleType )
                    {
                    // InternalUpctforma.g:995:2: ( ruleSimpleType )
                    // InternalUpctforma.g:996:3: ruleSimpleType
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
                    // InternalUpctforma.g:1001:2: ( ruleRecordType )
                    {
                    // InternalUpctforma.g:1001:2: ( ruleRecordType )
                    // InternalUpctforma.g:1002:3: ruleRecordType
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
                    // InternalUpctforma.g:1007:2: ( ruleWidgetType )
                    {
                    // InternalUpctforma.g:1007:2: ( ruleWidgetType )
                    // InternalUpctforma.g:1008:3: ruleWidgetType
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
                    // InternalUpctforma.g:1013:2: ( ruleListType )
                    {
                    // InternalUpctforma.g:1013:2: ( ruleListType )
                    // InternalUpctforma.g:1014:3: ruleListType
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
                    // InternalUpctforma.g:1019:2: ( ruleCompositeType_Impl )
                    {
                    // InternalUpctforma.g:1019:2: ( ruleCompositeType_Impl )
                    // InternalUpctforma.g:1020:3: ruleCompositeType_Impl
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
    // InternalUpctforma.g:1029:1: rule__ContentElement__Alternatives : ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleElement_Impl ) | ( rulePlaceHolder ) | ( ruleRow ) | ( ruleGame ) | ( ruleRecordValue ) | ( ruleListValue ) | ( ruleNumber ) | ( ruleLiteral ) );
    public final void rule__ContentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1033:1: ( ( ruleContentElement_Impl ) | ( ruleColumn ) | ( ruleImage ) | ( ruleWidget ) | ( ruleText ) | ( ruleComposite_Impl ) | ( ruleVideo ) | ( ruleSimpleElement_Impl ) | ( rulePlaceHolder ) | ( ruleRow ) | ( ruleGame ) | ( ruleRecordValue ) | ( ruleListValue ) | ( ruleNumber ) | ( ruleLiteral ) )
            int alt2=15;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            case 38:
                {
                alt2=4;
                }
                break;
            case 40:
                {
                alt2=5;
                }
                break;
            case 45:
                {
                alt2=6;
                }
                break;
            case 46:
                {
                alt2=7;
                }
                break;
            case 49:
                {
                alt2=8;
                }
                break;
            case 50:
                {
                alt2=9;
                }
                break;
            case 31:
                {
                alt2=10;
                }
                break;
            case 51:
                {
                alt2=11;
                }
                break;
            case 18:
                {
                alt2=12;
                }
                break;
            case 52:
                {
                alt2=13;
                }
                break;
            case 42:
                {
                alt2=14;
                }
                break;
            case 43:
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
                    // InternalUpctforma.g:1034:2: ( ruleContentElement_Impl )
                    {
                    // InternalUpctforma.g:1034:2: ( ruleContentElement_Impl )
                    // InternalUpctforma.g:1035:3: ruleContentElement_Impl
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
                    // InternalUpctforma.g:1040:2: ( ruleColumn )
                    {
                    // InternalUpctforma.g:1040:2: ( ruleColumn )
                    // InternalUpctforma.g:1041:3: ruleColumn
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
                    // InternalUpctforma.g:1046:2: ( ruleImage )
                    {
                    // InternalUpctforma.g:1046:2: ( ruleImage )
                    // InternalUpctforma.g:1047:3: ruleImage
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
                    // InternalUpctforma.g:1052:2: ( ruleWidget )
                    {
                    // InternalUpctforma.g:1052:2: ( ruleWidget )
                    // InternalUpctforma.g:1053:3: ruleWidget
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
                    // InternalUpctforma.g:1058:2: ( ruleText )
                    {
                    // InternalUpctforma.g:1058:2: ( ruleText )
                    // InternalUpctforma.g:1059:3: ruleText
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
                    // InternalUpctforma.g:1064:2: ( ruleComposite_Impl )
                    {
                    // InternalUpctforma.g:1064:2: ( ruleComposite_Impl )
                    // InternalUpctforma.g:1065:3: ruleComposite_Impl
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
                    // InternalUpctforma.g:1070:2: ( ruleVideo )
                    {
                    // InternalUpctforma.g:1070:2: ( ruleVideo )
                    // InternalUpctforma.g:1071:3: ruleVideo
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
                    // InternalUpctforma.g:1076:2: ( ruleSimpleElement_Impl )
                    {
                    // InternalUpctforma.g:1076:2: ( ruleSimpleElement_Impl )
                    // InternalUpctforma.g:1077:3: ruleSimpleElement_Impl
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
                    // InternalUpctforma.g:1082:2: ( rulePlaceHolder )
                    {
                    // InternalUpctforma.g:1082:2: ( rulePlaceHolder )
                    // InternalUpctforma.g:1083:3: rulePlaceHolder
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
                    // InternalUpctforma.g:1088:2: ( ruleRow )
                    {
                    // InternalUpctforma.g:1088:2: ( ruleRow )
                    // InternalUpctforma.g:1089:3: ruleRow
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
                    // InternalUpctforma.g:1094:2: ( ruleGame )
                    {
                    // InternalUpctforma.g:1094:2: ( ruleGame )
                    // InternalUpctforma.g:1095:3: ruleGame
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
                    // InternalUpctforma.g:1100:2: ( ruleRecordValue )
                    {
                    // InternalUpctforma.g:1100:2: ( ruleRecordValue )
                    // InternalUpctforma.g:1101:3: ruleRecordValue
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
                    // InternalUpctforma.g:1106:2: ( ruleListValue )
                    {
                    // InternalUpctforma.g:1106:2: ( ruleListValue )
                    // InternalUpctforma.g:1107:3: ruleListValue
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
                    // InternalUpctforma.g:1112:2: ( ruleNumber )
                    {
                    // InternalUpctforma.g:1112:2: ( ruleNumber )
                    // InternalUpctforma.g:1113:3: ruleNumber
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
                    // InternalUpctforma.g:1118:2: ( ruleLiteral )
                    {
                    // InternalUpctforma.g:1118:2: ( ruleLiteral )
                    // InternalUpctforma.g:1119:3: ruleLiteral
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
    // InternalUpctforma.g:1128:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1132:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalUpctforma.g:1133:2: ( RULE_STRING )
                    {
                    // InternalUpctforma.g:1133:2: ( RULE_STRING )
                    // InternalUpctforma.g:1134:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1139:2: ( RULE_ID )
                    {
                    // InternalUpctforma.g:1139:2: ( RULE_ID )
                    // InternalUpctforma.g:1140:3: RULE_ID
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
    // InternalUpctforma.g:1149:1: rule__EPrimitiveTypes__Alternatives : ( ( ruleEString ) | ( RULE_PRIMITIVETYPES ) );
    public final void rule__EPrimitiveTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1153:1: ( ( ruleEString ) | ( RULE_PRIMITIVETYPES ) )
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
                    // InternalUpctforma.g:1154:2: ( ruleEString )
                    {
                    // InternalUpctforma.g:1154:2: ( ruleEString )
                    // InternalUpctforma.g:1155:3: ruleEString
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
                    // InternalUpctforma.g:1160:2: ( RULE_PRIMITIVETYPES )
                    {
                    // InternalUpctforma.g:1160:2: ( RULE_PRIMITIVETYPES )
                    // InternalUpctforma.g:1161:3: RULE_PRIMITIVETYPES
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
    // InternalUpctforma.g:1170:1: rule__ContentUnitType__Alternatives : ( ( ( 'Interoperability' ) ) | ( ( 'Open' ) ) | ( ( 'Preview' ) ) );
    public final void rule__ContentUnitType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1174:1: ( ( ( 'Interoperability' ) ) | ( ( 'Open' ) ) | ( ( 'Preview' ) ) )
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
                    // InternalUpctforma.g:1175:2: ( ( 'Interoperability' ) )
                    {
                    // InternalUpctforma.g:1175:2: ( ( 'Interoperability' ) )
                    // InternalUpctforma.g:1176:3: ( 'Interoperability' )
                    {
                     before(grammarAccess.getContentUnitTypeAccess().getInteroperabilityEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1177:3: ( 'Interoperability' )
                    // InternalUpctforma.g:1177:4: 'Interoperability'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getContentUnitTypeAccess().getInteroperabilityEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1181:2: ( ( 'Open' ) )
                    {
                    // InternalUpctforma.g:1181:2: ( ( 'Open' ) )
                    // InternalUpctforma.g:1182:3: ( 'Open' )
                    {
                     before(grammarAccess.getContentUnitTypeAccess().getOpenEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1183:3: ( 'Open' )
                    // InternalUpctforma.g:1183:4: 'Open'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getContentUnitTypeAccess().getOpenEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:1187:2: ( ( 'Preview' ) )
                    {
                    // InternalUpctforma.g:1187:2: ( ( 'Preview' ) )
                    // InternalUpctforma.g:1188:3: ( 'Preview' )
                    {
                     before(grammarAccess.getContentUnitTypeAccess().getPreviewEnumLiteralDeclaration_2()); 
                    // InternalUpctforma.g:1189:3: ( 'Preview' )
                    // InternalUpctforma.g:1189:4: 'Preview'
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


    // $ANTLR start "rule__SectionType__Alternatives"
    // InternalUpctforma.g:1197:1: rule__SectionType__Alternatives : ( ( ( 'BackgroundImage' ) ) | ( ( 'BackgroundColour' ) ) );
    public final void rule__SectionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1201:1: ( ( ( 'BackgroundImage' ) ) | ( ( 'BackgroundColour' ) ) )
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
                    // InternalUpctforma.g:1202:2: ( ( 'BackgroundImage' ) )
                    {
                    // InternalUpctforma.g:1202:2: ( ( 'BackgroundImage' ) )
                    // InternalUpctforma.g:1203:3: ( 'BackgroundImage' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getBackgroundImageEnumLiteralDeclaration_0()); 
                    // InternalUpctforma.g:1204:3: ( 'BackgroundImage' )
                    // InternalUpctforma.g:1204:4: 'BackgroundImage'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSectionTypeAccess().getBackgroundImageEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:1208:2: ( ( 'BackgroundColour' ) )
                    {
                    // InternalUpctforma.g:1208:2: ( ( 'BackgroundColour' ) )
                    // InternalUpctforma.g:1209:3: ( 'BackgroundColour' )
                    {
                     before(grammarAccess.getSectionTypeAccess().getBackgroundColourEnumLiteralDeclaration_1()); 
                    // InternalUpctforma.g:1210:3: ( 'BackgroundColour' )
                    // InternalUpctforma.g:1210:4: 'BackgroundColour'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalUpctforma.g:1218:1: rule__ContentDefinition__Group__0 : rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 ;
    public final void rule__ContentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1222:1: ( rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1 )
            // InternalUpctforma.g:1223:2: rule__ContentDefinition__Group__0__Impl rule__ContentDefinition__Group__1
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
    // InternalUpctforma.g:1230:1: rule__ContentDefinition__Group__0__Impl : ( () ) ;
    public final void rule__ContentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1234:1: ( ( () ) )
            // InternalUpctforma.g:1235:1: ( () )
            {
            // InternalUpctforma.g:1235:1: ( () )
            // InternalUpctforma.g:1236:2: ()
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0()); 
            // InternalUpctforma.g:1237:2: ()
            // InternalUpctforma.g:1237:3: 
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
    // InternalUpctforma.g:1245:1: rule__ContentDefinition__Group__1 : rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 ;
    public final void rule__ContentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1249:1: ( rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2 )
            // InternalUpctforma.g:1250:2: rule__ContentDefinition__Group__1__Impl rule__ContentDefinition__Group__2
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
    // InternalUpctforma.g:1257:1: rule__ContentDefinition__Group__1__Impl : ( 'ContentDefinition' ) ;
    public final void rule__ContentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1261:1: ( ( 'ContentDefinition' ) )
            // InternalUpctforma.g:1262:1: ( 'ContentDefinition' )
            {
            // InternalUpctforma.g:1262:1: ( 'ContentDefinition' )
            // InternalUpctforma.g:1263:2: 'ContentDefinition'
            {
             before(grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalUpctforma.g:1272:1: rule__ContentDefinition__Group__2 : rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 ;
    public final void rule__ContentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1276:1: ( rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3 )
            // InternalUpctforma.g:1277:2: rule__ContentDefinition__Group__2__Impl rule__ContentDefinition__Group__3
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
    // InternalUpctforma.g:1284:1: rule__ContentDefinition__Group__2__Impl : ( ( rule__ContentDefinition__NameAssignment_2 ) ) ;
    public final void rule__ContentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1288:1: ( ( ( rule__ContentDefinition__NameAssignment_2 ) ) )
            // InternalUpctforma.g:1289:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:1289:1: ( ( rule__ContentDefinition__NameAssignment_2 ) )
            // InternalUpctforma.g:1290:2: ( rule__ContentDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:1291:2: ( rule__ContentDefinition__NameAssignment_2 )
            // InternalUpctforma.g:1291:3: rule__ContentDefinition__NameAssignment_2
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
    // InternalUpctforma.g:1299:1: rule__ContentDefinition__Group__3 : rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 ;
    public final void rule__ContentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1303:1: ( rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4 )
            // InternalUpctforma.g:1304:2: rule__ContentDefinition__Group__3__Impl rule__ContentDefinition__Group__4
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
    // InternalUpctforma.g:1311:1: rule__ContentDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1315:1: ( ( '{' ) )
            // InternalUpctforma.g:1316:1: ( '{' )
            {
            // InternalUpctforma.g:1316:1: ( '{' )
            // InternalUpctforma.g:1317:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:1326:1: rule__ContentDefinition__Group__4 : rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 ;
    public final void rule__ContentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1330:1: ( rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5 )
            // InternalUpctforma.g:1331:2: rule__ContentDefinition__Group__4__Impl rule__ContentDefinition__Group__5
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
    // InternalUpctforma.g:1338:1: rule__ContentDefinition__Group__4__Impl : ( ( rule__ContentDefinition__Group_4__0 )? ) ;
    public final void rule__ContentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1342:1: ( ( ( rule__ContentDefinition__Group_4__0 )? ) )
            // InternalUpctforma.g:1343:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            {
            // InternalUpctforma.g:1343:1: ( ( rule__ContentDefinition__Group_4__0 )? )
            // InternalUpctforma.g:1344:2: ( rule__ContentDefinition__Group_4__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_4()); 
            // InternalUpctforma.g:1345:2: ( rule__ContentDefinition__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUpctforma.g:1345:3: rule__ContentDefinition__Group_4__0
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
    // InternalUpctforma.g:1353:1: rule__ContentDefinition__Group__5 : rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 ;
    public final void rule__ContentDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1357:1: ( rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6 )
            // InternalUpctforma.g:1358:2: rule__ContentDefinition__Group__5__Impl rule__ContentDefinition__Group__6
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
    // InternalUpctforma.g:1365:1: rule__ContentDefinition__Group__5__Impl : ( ( rule__ContentDefinition__Group_5__0 )? ) ;
    public final void rule__ContentDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1369:1: ( ( ( rule__ContentDefinition__Group_5__0 )? ) )
            // InternalUpctforma.g:1370:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            {
            // InternalUpctforma.g:1370:1: ( ( rule__ContentDefinition__Group_5__0 )? )
            // InternalUpctforma.g:1371:2: ( rule__ContentDefinition__Group_5__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5()); 
            // InternalUpctforma.g:1372:2: ( rule__ContentDefinition__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctforma.g:1372:3: rule__ContentDefinition__Group_5__0
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
    // InternalUpctforma.g:1380:1: rule__ContentDefinition__Group__6 : rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 ;
    public final void rule__ContentDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1384:1: ( rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7 )
            // InternalUpctforma.g:1385:2: rule__ContentDefinition__Group__6__Impl rule__ContentDefinition__Group__7
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
    // InternalUpctforma.g:1392:1: rule__ContentDefinition__Group__6__Impl : ( ( rule__ContentDefinition__Group_6__0 )? ) ;
    public final void rule__ContentDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1396:1: ( ( ( rule__ContentDefinition__Group_6__0 )? ) )
            // InternalUpctforma.g:1397:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            {
            // InternalUpctforma.g:1397:1: ( ( rule__ContentDefinition__Group_6__0 )? )
            // InternalUpctforma.g:1398:2: ( rule__ContentDefinition__Group_6__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6()); 
            // InternalUpctforma.g:1399:2: ( rule__ContentDefinition__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUpctforma.g:1399:3: rule__ContentDefinition__Group_6__0
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
    // InternalUpctforma.g:1407:1: rule__ContentDefinition__Group__7 : rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 ;
    public final void rule__ContentDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1411:1: ( rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8 )
            // InternalUpctforma.g:1412:2: rule__ContentDefinition__Group__7__Impl rule__ContentDefinition__Group__8
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
    // InternalUpctforma.g:1419:1: rule__ContentDefinition__Group__7__Impl : ( ( rule__ContentDefinition__Group_7__0 )? ) ;
    public final void rule__ContentDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1423:1: ( ( ( rule__ContentDefinition__Group_7__0 )? ) )
            // InternalUpctforma.g:1424:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            {
            // InternalUpctforma.g:1424:1: ( ( rule__ContentDefinition__Group_7__0 )? )
            // InternalUpctforma.g:1425:2: ( rule__ContentDefinition__Group_7__0 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7()); 
            // InternalUpctforma.g:1426:2: ( rule__ContentDefinition__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctforma.g:1426:3: rule__ContentDefinition__Group_7__0
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
    // InternalUpctforma.g:1434:1: rule__ContentDefinition__Group__8 : rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 ;
    public final void rule__ContentDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1438:1: ( rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9 )
            // InternalUpctforma.g:1439:2: rule__ContentDefinition__Group__8__Impl rule__ContentDefinition__Group__9
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
    // InternalUpctforma.g:1446:1: rule__ContentDefinition__Group__8__Impl : ( ( rule__ContentDefinition__UnitAssignment_8 )? ) ;
    public final void rule__ContentDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1450:1: ( ( ( rule__ContentDefinition__UnitAssignment_8 )? ) )
            // InternalUpctforma.g:1451:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            {
            // InternalUpctforma.g:1451:1: ( ( rule__ContentDefinition__UnitAssignment_8 )? )
            // InternalUpctforma.g:1452:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            {
             before(grammarAccess.getContentDefinitionAccess().getUnitAssignment_8()); 
            // InternalUpctforma.g:1453:2: ( rule__ContentDefinition__UnitAssignment_8 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUpctforma.g:1453:3: rule__ContentDefinition__UnitAssignment_8
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
    // InternalUpctforma.g:1461:1: rule__ContentDefinition__Group__9 : rule__ContentDefinition__Group__9__Impl ;
    public final void rule__ContentDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1465:1: ( rule__ContentDefinition__Group__9__Impl )
            // InternalUpctforma.g:1466:2: rule__ContentDefinition__Group__9__Impl
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
    // InternalUpctforma.g:1472:1: rule__ContentDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1476:1: ( ( '}' ) )
            // InternalUpctforma.g:1477:1: ( '}' )
            {
            // InternalUpctforma.g:1477:1: ( '}' )
            // InternalUpctforma.g:1478:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:1488:1: rule__ContentDefinition__Group_4__0 : rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 ;
    public final void rule__ContentDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1492:1: ( rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1 )
            // InternalUpctforma.g:1493:2: rule__ContentDefinition__Group_4__0__Impl rule__ContentDefinition__Group_4__1
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
    // InternalUpctforma.g:1500:1: rule__ContentDefinition__Group_4__0__Impl : ( 'package' ) ;
    public final void rule__ContentDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1504:1: ( ( 'package' ) )
            // InternalUpctforma.g:1505:1: ( 'package' )
            {
            // InternalUpctforma.g:1505:1: ( 'package' )
            // InternalUpctforma.g:1506:2: 'package'
            {
             before(grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalUpctforma.g:1515:1: rule__ContentDefinition__Group_4__1 : rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 ;
    public final void rule__ContentDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1519:1: ( rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2 )
            // InternalUpctforma.g:1520:2: rule__ContentDefinition__Group_4__1__Impl rule__ContentDefinition__Group_4__2
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
    // InternalUpctforma.g:1527:1: rule__ContentDefinition__Group_4__1__Impl : ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) ;
    public final void rule__ContentDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1531:1: ( ( ( rule__ContentDefinition__NameAssignment_4_1 ) ) )
            // InternalUpctforma.g:1532:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            {
            // InternalUpctforma.g:1532:1: ( ( rule__ContentDefinition__NameAssignment_4_1 ) )
            // InternalUpctforma.g:1533:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getNameAssignment_4_1()); 
            // InternalUpctforma.g:1534:2: ( rule__ContentDefinition__NameAssignment_4_1 )
            // InternalUpctforma.g:1534:3: rule__ContentDefinition__NameAssignment_4_1
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
    // InternalUpctforma.g:1542:1: rule__ContentDefinition__Group_4__2 : rule__ContentDefinition__Group_4__2__Impl ;
    public final void rule__ContentDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1546:1: ( rule__ContentDefinition__Group_4__2__Impl )
            // InternalUpctforma.g:1547:2: rule__ContentDefinition__Group_4__2__Impl
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
    // InternalUpctforma.g:1553:1: rule__ContentDefinition__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ContentDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1557:1: ( ( ';' ) )
            // InternalUpctforma.g:1558:1: ( ';' )
            {
            // InternalUpctforma.g:1558:1: ( ';' )
            // InternalUpctforma.g:1559:2: ';'
            {
             before(grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUpctforma.g:1569:1: rule__ContentDefinition__Group_5__0 : rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 ;
    public final void rule__ContentDefinition__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1573:1: ( rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1 )
            // InternalUpctforma.g:1574:2: rule__ContentDefinition__Group_5__0__Impl rule__ContentDefinition__Group_5__1
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
    // InternalUpctforma.g:1581:1: rule__ContentDefinition__Group_5__0__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) ;
    public final void rule__ContentDefinition__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1585:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) ) )
            // InternalUpctforma.g:1586:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            {
            // InternalUpctforma.g:1586:1: ( ( rule__ContentDefinition__ImportsAssignment_5_0 ) )
            // InternalUpctforma.g:1587:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_0()); 
            // InternalUpctforma.g:1588:2: ( rule__ContentDefinition__ImportsAssignment_5_0 )
            // InternalUpctforma.g:1588:3: rule__ContentDefinition__ImportsAssignment_5_0
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
    // InternalUpctforma.g:1596:1: rule__ContentDefinition__Group_5__1 : rule__ContentDefinition__Group_5__1__Impl ;
    public final void rule__ContentDefinition__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1600:1: ( rule__ContentDefinition__Group_5__1__Impl )
            // InternalUpctforma.g:1601:2: rule__ContentDefinition__Group_5__1__Impl
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
    // InternalUpctforma.g:1607:1: rule__ContentDefinition__Group_5__1__Impl : ( ( rule__ContentDefinition__Group_5_1__0 )* ) ;
    public final void rule__ContentDefinition__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1611:1: ( ( ( rule__ContentDefinition__Group_5_1__0 )* ) )
            // InternalUpctforma.g:1612:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            {
            // InternalUpctforma.g:1612:1: ( ( rule__ContentDefinition__Group_5_1__0 )* )
            // InternalUpctforma.g:1613:2: ( rule__ContentDefinition__Group_5_1__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_5_1()); 
            // InternalUpctforma.g:1614:2: ( rule__ContentDefinition__Group_5_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUpctforma.g:1614:3: rule__ContentDefinition__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalUpctforma.g:1623:1: rule__ContentDefinition__Group_5_1__0 : rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 ;
    public final void rule__ContentDefinition__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1627:1: ( rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1 )
            // InternalUpctforma.g:1628:2: rule__ContentDefinition__Group_5_1__0__Impl rule__ContentDefinition__Group_5_1__1
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
    // InternalUpctforma.g:1635:1: rule__ContentDefinition__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1639:1: ( ( ',' ) )
            // InternalUpctforma.g:1640:1: ( ',' )
            {
            // InternalUpctforma.g:1640:1: ( ',' )
            // InternalUpctforma.g:1641:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:1650:1: rule__ContentDefinition__Group_5_1__1 : rule__ContentDefinition__Group_5_1__1__Impl ;
    public final void rule__ContentDefinition__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1654:1: ( rule__ContentDefinition__Group_5_1__1__Impl )
            // InternalUpctforma.g:1655:2: rule__ContentDefinition__Group_5_1__1__Impl
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
    // InternalUpctforma.g:1661:1: rule__ContentDefinition__Group_5_1__1__Impl : ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) ;
    public final void rule__ContentDefinition__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1665:1: ( ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) ) )
            // InternalUpctforma.g:1666:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            {
            // InternalUpctforma.g:1666:1: ( ( rule__ContentDefinition__ImportsAssignment_5_1_1 ) )
            // InternalUpctforma.g:1667:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getImportsAssignment_5_1_1()); 
            // InternalUpctforma.g:1668:2: ( rule__ContentDefinition__ImportsAssignment_5_1_1 )
            // InternalUpctforma.g:1668:3: rule__ContentDefinition__ImportsAssignment_5_1_1
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
    // InternalUpctforma.g:1677:1: rule__ContentDefinition__Group_6__0 : rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 ;
    public final void rule__ContentDefinition__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1681:1: ( rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1 )
            // InternalUpctforma.g:1682:2: rule__ContentDefinition__Group_6__0__Impl rule__ContentDefinition__Group_6__1
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
    // InternalUpctforma.g:1689:1: rule__ContentDefinition__Group_6__0__Impl : ( 'types' ) ;
    public final void rule__ContentDefinition__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1693:1: ( ( 'types' ) )
            // InternalUpctforma.g:1694:1: ( 'types' )
            {
            // InternalUpctforma.g:1694:1: ( 'types' )
            // InternalUpctforma.g:1695:2: 'types'
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUpctforma.g:1704:1: rule__ContentDefinition__Group_6__1 : rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 ;
    public final void rule__ContentDefinition__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1708:1: ( rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2 )
            // InternalUpctforma.g:1709:2: rule__ContentDefinition__Group_6__1__Impl rule__ContentDefinition__Group_6__2
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
    // InternalUpctforma.g:1716:1: rule__ContentDefinition__Group_6__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1720:1: ( ( '{' ) )
            // InternalUpctforma.g:1721:1: ( '{' )
            {
            // InternalUpctforma.g:1721:1: ( '{' )
            // InternalUpctforma.g:1722:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:1731:1: rule__ContentDefinition__Group_6__2 : rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 ;
    public final void rule__ContentDefinition__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1735:1: ( rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3 )
            // InternalUpctforma.g:1736:2: rule__ContentDefinition__Group_6__2__Impl rule__ContentDefinition__Group_6__3
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
    // InternalUpctforma.g:1743:1: rule__ContentDefinition__Group_6__2__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) ;
    public final void rule__ContentDefinition__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1747:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_2 ) ) )
            // InternalUpctforma.g:1748:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            {
            // InternalUpctforma.g:1748:1: ( ( rule__ContentDefinition__TypesAssignment_6_2 ) )
            // InternalUpctforma.g:1749:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_2()); 
            // InternalUpctforma.g:1750:2: ( rule__ContentDefinition__TypesAssignment_6_2 )
            // InternalUpctforma.g:1750:3: rule__ContentDefinition__TypesAssignment_6_2
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
    // InternalUpctforma.g:1758:1: rule__ContentDefinition__Group_6__3 : rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 ;
    public final void rule__ContentDefinition__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1762:1: ( rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4 )
            // InternalUpctforma.g:1763:2: rule__ContentDefinition__Group_6__3__Impl rule__ContentDefinition__Group_6__4
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
    // InternalUpctforma.g:1770:1: rule__ContentDefinition__Group_6__3__Impl : ( ( rule__ContentDefinition__Group_6_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1774:1: ( ( ( rule__ContentDefinition__Group_6_3__0 )* ) )
            // InternalUpctforma.g:1775:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            {
            // InternalUpctforma.g:1775:1: ( ( rule__ContentDefinition__Group_6_3__0 )* )
            // InternalUpctforma.g:1776:2: ( rule__ContentDefinition__Group_6_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_6_3()); 
            // InternalUpctforma.g:1777:2: ( rule__ContentDefinition__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUpctforma.g:1777:3: rule__ContentDefinition__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalUpctforma.g:1785:1: rule__ContentDefinition__Group_6__4 : rule__ContentDefinition__Group_6__4__Impl ;
    public final void rule__ContentDefinition__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1789:1: ( rule__ContentDefinition__Group_6__4__Impl )
            // InternalUpctforma.g:1790:2: rule__ContentDefinition__Group_6__4__Impl
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
    // InternalUpctforma.g:1796:1: rule__ContentDefinition__Group_6__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1800:1: ( ( '}' ) )
            // InternalUpctforma.g:1801:1: ( '}' )
            {
            // InternalUpctforma.g:1801:1: ( '}' )
            // InternalUpctforma.g:1802:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:1812:1: rule__ContentDefinition__Group_6_3__0 : rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 ;
    public final void rule__ContentDefinition__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1816:1: ( rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1 )
            // InternalUpctforma.g:1817:2: rule__ContentDefinition__Group_6_3__0__Impl rule__ContentDefinition__Group_6_3__1
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
    // InternalUpctforma.g:1824:1: rule__ContentDefinition__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1828:1: ( ( ',' ) )
            // InternalUpctforma.g:1829:1: ( ',' )
            {
            // InternalUpctforma.g:1829:1: ( ',' )
            // InternalUpctforma.g:1830:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:1839:1: rule__ContentDefinition__Group_6_3__1 : rule__ContentDefinition__Group_6_3__1__Impl ;
    public final void rule__ContentDefinition__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1843:1: ( rule__ContentDefinition__Group_6_3__1__Impl )
            // InternalUpctforma.g:1844:2: rule__ContentDefinition__Group_6_3__1__Impl
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
    // InternalUpctforma.g:1850:1: rule__ContentDefinition__Group_6_3__1__Impl : ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1854:1: ( ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) ) )
            // InternalUpctforma.g:1855:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            {
            // InternalUpctforma.g:1855:1: ( ( rule__ContentDefinition__TypesAssignment_6_3_1 ) )
            // InternalUpctforma.g:1856:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTypesAssignment_6_3_1()); 
            // InternalUpctforma.g:1857:2: ( rule__ContentDefinition__TypesAssignment_6_3_1 )
            // InternalUpctforma.g:1857:3: rule__ContentDefinition__TypesAssignment_6_3_1
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
    // InternalUpctforma.g:1866:1: rule__ContentDefinition__Group_7__0 : rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 ;
    public final void rule__ContentDefinition__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1870:1: ( rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1 )
            // InternalUpctforma.g:1871:2: rule__ContentDefinition__Group_7__0__Impl rule__ContentDefinition__Group_7__1
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
    // InternalUpctforma.g:1878:1: rule__ContentDefinition__Group_7__0__Impl : ( 'templates' ) ;
    public final void rule__ContentDefinition__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1882:1: ( ( 'templates' ) )
            // InternalUpctforma.g:1883:1: ( 'templates' )
            {
            // InternalUpctforma.g:1883:1: ( 'templates' )
            // InternalUpctforma.g:1884:2: 'templates'
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUpctforma.g:1893:1: rule__ContentDefinition__Group_7__1 : rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 ;
    public final void rule__ContentDefinition__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1897:1: ( rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2 )
            // InternalUpctforma.g:1898:2: rule__ContentDefinition__Group_7__1__Impl rule__ContentDefinition__Group_7__2
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
    // InternalUpctforma.g:1905:1: rule__ContentDefinition__Group_7__1__Impl : ( '{' ) ;
    public final void rule__ContentDefinition__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1909:1: ( ( '{' ) )
            // InternalUpctforma.g:1910:1: ( '{' )
            {
            // InternalUpctforma.g:1910:1: ( '{' )
            // InternalUpctforma.g:1911:2: '{'
            {
             before(grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:1920:1: rule__ContentDefinition__Group_7__2 : rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 ;
    public final void rule__ContentDefinition__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1924:1: ( rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3 )
            // InternalUpctforma.g:1925:2: rule__ContentDefinition__Group_7__2__Impl rule__ContentDefinition__Group_7__3
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
    // InternalUpctforma.g:1932:1: rule__ContentDefinition__Group_7__2__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) ;
    public final void rule__ContentDefinition__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1936:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) ) )
            // InternalUpctforma.g:1937:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            {
            // InternalUpctforma.g:1937:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_2 ) )
            // InternalUpctforma.g:1938:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_2()); 
            // InternalUpctforma.g:1939:2: ( rule__ContentDefinition__TemplatesAssignment_7_2 )
            // InternalUpctforma.g:1939:3: rule__ContentDefinition__TemplatesAssignment_7_2
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
    // InternalUpctforma.g:1947:1: rule__ContentDefinition__Group_7__3 : rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 ;
    public final void rule__ContentDefinition__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1951:1: ( rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4 )
            // InternalUpctforma.g:1952:2: rule__ContentDefinition__Group_7__3__Impl rule__ContentDefinition__Group_7__4
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
    // InternalUpctforma.g:1959:1: rule__ContentDefinition__Group_7__3__Impl : ( ( rule__ContentDefinition__Group_7_3__0 )* ) ;
    public final void rule__ContentDefinition__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1963:1: ( ( ( rule__ContentDefinition__Group_7_3__0 )* ) )
            // InternalUpctforma.g:1964:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            {
            // InternalUpctforma.g:1964:1: ( ( rule__ContentDefinition__Group_7_3__0 )* )
            // InternalUpctforma.g:1965:2: ( rule__ContentDefinition__Group_7_3__0 )*
            {
             before(grammarAccess.getContentDefinitionAccess().getGroup_7_3()); 
            // InternalUpctforma.g:1966:2: ( rule__ContentDefinition__Group_7_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUpctforma.g:1966:3: rule__ContentDefinition__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentDefinition__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalUpctforma.g:1974:1: rule__ContentDefinition__Group_7__4 : rule__ContentDefinition__Group_7__4__Impl ;
    public final void rule__ContentDefinition__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1978:1: ( rule__ContentDefinition__Group_7__4__Impl )
            // InternalUpctforma.g:1979:2: rule__ContentDefinition__Group_7__4__Impl
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
    // InternalUpctforma.g:1985:1: rule__ContentDefinition__Group_7__4__Impl : ( '}' ) ;
    public final void rule__ContentDefinition__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:1989:1: ( ( '}' ) )
            // InternalUpctforma.g:1990:1: ( '}' )
            {
            // InternalUpctforma.g:1990:1: ( '}' )
            // InternalUpctforma.g:1991:2: '}'
            {
             before(grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:2001:1: rule__ContentDefinition__Group_7_3__0 : rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 ;
    public final void rule__ContentDefinition__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2005:1: ( rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1 )
            // InternalUpctforma.g:2006:2: rule__ContentDefinition__Group_7_3__0__Impl rule__ContentDefinition__Group_7_3__1
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
    // InternalUpctforma.g:2013:1: rule__ContentDefinition__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__ContentDefinition__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2017:1: ( ( ',' ) )
            // InternalUpctforma.g:2018:1: ( ',' )
            {
            // InternalUpctforma.g:2018:1: ( ',' )
            // InternalUpctforma.g:2019:2: ','
            {
             before(grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:2028:1: rule__ContentDefinition__Group_7_3__1 : rule__ContentDefinition__Group_7_3__1__Impl ;
    public final void rule__ContentDefinition__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2032:1: ( rule__ContentDefinition__Group_7_3__1__Impl )
            // InternalUpctforma.g:2033:2: rule__ContentDefinition__Group_7_3__1__Impl
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
    // InternalUpctforma.g:2039:1: rule__ContentDefinition__Group_7_3__1__Impl : ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) ;
    public final void rule__ContentDefinition__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2043:1: ( ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) ) )
            // InternalUpctforma.g:2044:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            {
            // InternalUpctforma.g:2044:1: ( ( rule__ContentDefinition__TemplatesAssignment_7_3_1 ) )
            // InternalUpctforma.g:2045:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            {
             before(grammarAccess.getContentDefinitionAccess().getTemplatesAssignment_7_3_1()); 
            // InternalUpctforma.g:2046:2: ( rule__ContentDefinition__TemplatesAssignment_7_3_1 )
            // InternalUpctforma.g:2046:3: rule__ContentDefinition__TemplatesAssignment_7_3_1
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
    // InternalUpctforma.g:2055:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2059:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUpctforma.g:2060:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalUpctforma.g:2067:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2071:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:2072:1: ( RULE_ID )
            {
            // InternalUpctforma.g:2072:1: ( RULE_ID )
            // InternalUpctforma.g:2073:2: RULE_ID
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
    // InternalUpctforma.g:2082:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2086:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUpctforma.g:2087:2: rule__QualifiedName__Group__1__Impl
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
    // InternalUpctforma.g:2093:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2097:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUpctforma.g:2098:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUpctforma.g:2098:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUpctforma.g:2099:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUpctforma.g:2100:2: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUpctforma.g:2100:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalUpctforma.g:2109:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2113:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUpctforma.g:2114:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalUpctforma.g:2121:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2125:1: ( ( '.' ) )
            // InternalUpctforma.g:2126:1: ( '.' )
            {
            // InternalUpctforma.g:2126:1: ( '.' )
            // InternalUpctforma.g:2127:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUpctforma.g:2136:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2140:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUpctforma.g:2141:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalUpctforma.g:2147:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2151:1: ( ( RULE_ID ) )
            // InternalUpctforma.g:2152:1: ( RULE_ID )
            {
            // InternalUpctforma.g:2152:1: ( RULE_ID )
            // InternalUpctforma.g:2153:2: RULE_ID
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
    // InternalUpctforma.g:2163:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2167:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalUpctforma.g:2168:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalUpctforma.g:2175:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2179:1: ( ( 'import' ) )
            // InternalUpctforma.g:2180:1: ( 'import' )
            {
            // InternalUpctforma.g:2180:1: ( 'import' )
            // InternalUpctforma.g:2181:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUpctforma.g:2190:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2194:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalUpctforma.g:2195:2: rule__Import__Group__1__Impl rule__Import__Group__2
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
    // InternalUpctforma.g:2202:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2206:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalUpctforma.g:2207:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalUpctforma.g:2207:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalUpctforma.g:2208:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalUpctforma.g:2209:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalUpctforma.g:2209:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalUpctforma.g:2217:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2221:1: ( rule__Import__Group__2__Impl )
            // InternalUpctforma.g:2222:2: rule__Import__Group__2__Impl
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
    // InternalUpctforma.g:2228:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2232:1: ( ( ';' ) )
            // InternalUpctforma.g:2233:1: ( ';' )
            {
            // InternalUpctforma.g:2233:1: ( ';' )
            // InternalUpctforma.g:2234:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalUpctforma.g:2244:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2248:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalUpctforma.g:2249:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalUpctforma.g:2256:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2260:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:2261:1: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:2261:1: ( ruleQualifiedName )
            // InternalUpctforma.g:2262:2: ruleQualifiedName
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
    // InternalUpctforma.g:2271:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2275:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalUpctforma.g:2276:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalUpctforma.g:2282:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2286:1: ( ( ( '.*' )? ) )
            // InternalUpctforma.g:2287:1: ( ( '.*' )? )
            {
            // InternalUpctforma.g:2287:1: ( ( '.*' )? )
            // InternalUpctforma.g:2288:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalUpctforma.g:2289:2: ( '.*' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUpctforma.g:2289:3: '.*'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalUpctforma.g:2298:1: rule__TemplateDef__Group__0 : rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 ;
    public final void rule__TemplateDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2302:1: ( rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1 )
            // InternalUpctforma.g:2303:2: rule__TemplateDef__Group__0__Impl rule__TemplateDef__Group__1
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
    // InternalUpctforma.g:2310:1: rule__TemplateDef__Group__0__Impl : ( () ) ;
    public final void rule__TemplateDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2314:1: ( ( () ) )
            // InternalUpctforma.g:2315:1: ( () )
            {
            // InternalUpctforma.g:2315:1: ( () )
            // InternalUpctforma.g:2316:2: ()
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefAction_0()); 
            // InternalUpctforma.g:2317:2: ()
            // InternalUpctforma.g:2317:3: 
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
    // InternalUpctforma.g:2325:1: rule__TemplateDef__Group__1 : rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 ;
    public final void rule__TemplateDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2329:1: ( rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2 )
            // InternalUpctforma.g:2330:2: rule__TemplateDef__Group__1__Impl rule__TemplateDef__Group__2
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
    // InternalUpctforma.g:2337:1: rule__TemplateDef__Group__1__Impl : ( 'TemplateDef' ) ;
    public final void rule__TemplateDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2341:1: ( ( 'TemplateDef' ) )
            // InternalUpctforma.g:2342:1: ( 'TemplateDef' )
            {
            // InternalUpctforma.g:2342:1: ( 'TemplateDef' )
            // InternalUpctforma.g:2343:2: 'TemplateDef'
            {
             before(grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalUpctforma.g:2352:1: rule__TemplateDef__Group__2 : rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 ;
    public final void rule__TemplateDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2356:1: ( rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3 )
            // InternalUpctforma.g:2357:2: rule__TemplateDef__Group__2__Impl rule__TemplateDef__Group__3
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
    // InternalUpctforma.g:2364:1: rule__TemplateDef__Group__2__Impl : ( ( rule__TemplateDef__NameAssignment_2 ) ) ;
    public final void rule__TemplateDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2368:1: ( ( ( rule__TemplateDef__NameAssignment_2 ) ) )
            // InternalUpctforma.g:2369:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:2369:1: ( ( rule__TemplateDef__NameAssignment_2 ) )
            // InternalUpctforma.g:2370:2: ( rule__TemplateDef__NameAssignment_2 )
            {
             before(grammarAccess.getTemplateDefAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:2371:2: ( rule__TemplateDef__NameAssignment_2 )
            // InternalUpctforma.g:2371:3: rule__TemplateDef__NameAssignment_2
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
    // InternalUpctforma.g:2379:1: rule__TemplateDef__Group__3 : rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 ;
    public final void rule__TemplateDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2383:1: ( rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4 )
            // InternalUpctforma.g:2384:2: rule__TemplateDef__Group__3__Impl rule__TemplateDef__Group__4
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
    // InternalUpctforma.g:2391:1: rule__TemplateDef__Group__3__Impl : ( '{' ) ;
    public final void rule__TemplateDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2395:1: ( ( '{' ) )
            // InternalUpctforma.g:2396:1: ( '{' )
            {
            // InternalUpctforma.g:2396:1: ( '{' )
            // InternalUpctforma.g:2397:2: '{'
            {
             before(grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:2406:1: rule__TemplateDef__Group__4 : rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 ;
    public final void rule__TemplateDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2410:1: ( rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5 )
            // InternalUpctforma.g:2411:2: rule__TemplateDef__Group__4__Impl rule__TemplateDef__Group__5
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
    // InternalUpctforma.g:2418:1: rule__TemplateDef__Group__4__Impl : ( ( rule__TemplateDef__Group_4__0 )? ) ;
    public final void rule__TemplateDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2422:1: ( ( ( rule__TemplateDef__Group_4__0 )? ) )
            // InternalUpctforma.g:2423:1: ( ( rule__TemplateDef__Group_4__0 )? )
            {
            // InternalUpctforma.g:2423:1: ( ( rule__TemplateDef__Group_4__0 )? )
            // InternalUpctforma.g:2424:2: ( rule__TemplateDef__Group_4__0 )?
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4()); 
            // InternalUpctforma.g:2425:2: ( rule__TemplateDef__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUpctforma.g:2425:3: rule__TemplateDef__Group_4__0
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
    // InternalUpctforma.g:2433:1: rule__TemplateDef__Group__5 : rule__TemplateDef__Group__5__Impl ;
    public final void rule__TemplateDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2437:1: ( rule__TemplateDef__Group__5__Impl )
            // InternalUpctforma.g:2438:2: rule__TemplateDef__Group__5__Impl
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
    // InternalUpctforma.g:2444:1: rule__TemplateDef__Group__5__Impl : ( '}' ) ;
    public final void rule__TemplateDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2448:1: ( ( '}' ) )
            // InternalUpctforma.g:2449:1: ( '}' )
            {
            // InternalUpctforma.g:2449:1: ( '}' )
            // InternalUpctforma.g:2450:2: '}'
            {
             before(grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:2460:1: rule__TemplateDef__Group_4__0 : rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 ;
    public final void rule__TemplateDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2464:1: ( rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1 )
            // InternalUpctforma.g:2465:2: rule__TemplateDef__Group_4__0__Impl rule__TemplateDef__Group_4__1
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
    // InternalUpctforma.g:2472:1: rule__TemplateDef__Group_4__0__Impl : ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) ;
    public final void rule__TemplateDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2476:1: ( ( ( rule__TemplateDef__RowsAssignment_4_0 ) ) )
            // InternalUpctforma.g:2477:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:2477:1: ( ( rule__TemplateDef__RowsAssignment_4_0 ) )
            // InternalUpctforma.g:2478:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_0()); 
            // InternalUpctforma.g:2479:2: ( rule__TemplateDef__RowsAssignment_4_0 )
            // InternalUpctforma.g:2479:3: rule__TemplateDef__RowsAssignment_4_0
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
    // InternalUpctforma.g:2487:1: rule__TemplateDef__Group_4__1 : rule__TemplateDef__Group_4__1__Impl ;
    public final void rule__TemplateDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2491:1: ( rule__TemplateDef__Group_4__1__Impl )
            // InternalUpctforma.g:2492:2: rule__TemplateDef__Group_4__1__Impl
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
    // InternalUpctforma.g:2498:1: rule__TemplateDef__Group_4__1__Impl : ( ( rule__TemplateDef__Group_4_1__0 )* ) ;
    public final void rule__TemplateDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2502:1: ( ( ( rule__TemplateDef__Group_4_1__0 )* ) )
            // InternalUpctforma.g:2503:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:2503:1: ( ( rule__TemplateDef__Group_4_1__0 )* )
            // InternalUpctforma.g:2504:2: ( rule__TemplateDef__Group_4_1__0 )*
            {
             before(grammarAccess.getTemplateDefAccess().getGroup_4_1()); 
            // InternalUpctforma.g:2505:2: ( rule__TemplateDef__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==22) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUpctforma.g:2505:3: rule__TemplateDef__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__TemplateDef__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalUpctforma.g:2514:1: rule__TemplateDef__Group_4_1__0 : rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 ;
    public final void rule__TemplateDef__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2518:1: ( rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1 )
            // InternalUpctforma.g:2519:2: rule__TemplateDef__Group_4_1__0__Impl rule__TemplateDef__Group_4_1__1
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
    // InternalUpctforma.g:2526:1: rule__TemplateDef__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateDef__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2530:1: ( ( ',' ) )
            // InternalUpctforma.g:2531:1: ( ',' )
            {
            // InternalUpctforma.g:2531:1: ( ',' )
            // InternalUpctforma.g:2532:2: ','
            {
             before(grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:2541:1: rule__TemplateDef__Group_4_1__1 : rule__TemplateDef__Group_4_1__1__Impl ;
    public final void rule__TemplateDef__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2545:1: ( rule__TemplateDef__Group_4_1__1__Impl )
            // InternalUpctforma.g:2546:2: rule__TemplateDef__Group_4_1__1__Impl
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
    // InternalUpctforma.g:2552:1: rule__TemplateDef__Group_4_1__1__Impl : ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) ;
    public final void rule__TemplateDef__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2556:1: ( ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:2557:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:2557:1: ( ( rule__TemplateDef__RowsAssignment_4_1_1 ) )
            // InternalUpctforma.g:2558:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            {
             before(grammarAccess.getTemplateDefAccess().getRowsAssignment_4_1_1()); 
            // InternalUpctforma.g:2559:2: ( rule__TemplateDef__RowsAssignment_4_1_1 )
            // InternalUpctforma.g:2559:3: rule__TemplateDef__RowsAssignment_4_1_1
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
    // InternalUpctforma.g:2568:1: rule__ContentUnit__Group__0 : rule__ContentUnit__Group__0__Impl rule__ContentUnit__Group__1 ;
    public final void rule__ContentUnit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2572:1: ( rule__ContentUnit__Group__0__Impl rule__ContentUnit__Group__1 )
            // InternalUpctforma.g:2573:2: rule__ContentUnit__Group__0__Impl rule__ContentUnit__Group__1
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
    // InternalUpctforma.g:2580:1: rule__ContentUnit__Group__0__Impl : ( 'Unit' ) ;
    public final void rule__ContentUnit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2584:1: ( ( 'Unit' ) )
            // InternalUpctforma.g:2585:1: ( 'Unit' )
            {
            // InternalUpctforma.g:2585:1: ( 'Unit' )
            // InternalUpctforma.g:2586:2: 'Unit'
            {
             before(grammarAccess.getContentUnitAccess().getUnitKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalUpctforma.g:2595:1: rule__ContentUnit__Group__1 : rule__ContentUnit__Group__1__Impl rule__ContentUnit__Group__2 ;
    public final void rule__ContentUnit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2599:1: ( rule__ContentUnit__Group__1__Impl rule__ContentUnit__Group__2 )
            // InternalUpctforma.g:2600:2: rule__ContentUnit__Group__1__Impl rule__ContentUnit__Group__2
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
    // InternalUpctforma.g:2607:1: rule__ContentUnit__Group__1__Impl : ( ( rule__ContentUnit__NameAssignment_1 ) ) ;
    public final void rule__ContentUnit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2611:1: ( ( ( rule__ContentUnit__NameAssignment_1 ) ) )
            // InternalUpctforma.g:2612:1: ( ( rule__ContentUnit__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:2612:1: ( ( rule__ContentUnit__NameAssignment_1 ) )
            // InternalUpctforma.g:2613:2: ( rule__ContentUnit__NameAssignment_1 )
            {
             before(grammarAccess.getContentUnitAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:2614:2: ( rule__ContentUnit__NameAssignment_1 )
            // InternalUpctforma.g:2614:3: rule__ContentUnit__NameAssignment_1
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
    // InternalUpctforma.g:2622:1: rule__ContentUnit__Group__2 : rule__ContentUnit__Group__2__Impl rule__ContentUnit__Group__3 ;
    public final void rule__ContentUnit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2626:1: ( rule__ContentUnit__Group__2__Impl rule__ContentUnit__Group__3 )
            // InternalUpctforma.g:2627:2: rule__ContentUnit__Group__2__Impl rule__ContentUnit__Group__3
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
    // InternalUpctforma.g:2634:1: rule__ContentUnit__Group__2__Impl : ( ( rule__ContentUnit__AuthorAssignment_2 ) ) ;
    public final void rule__ContentUnit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2638:1: ( ( ( rule__ContentUnit__AuthorAssignment_2 ) ) )
            // InternalUpctforma.g:2639:1: ( ( rule__ContentUnit__AuthorAssignment_2 ) )
            {
            // InternalUpctforma.g:2639:1: ( ( rule__ContentUnit__AuthorAssignment_2 ) )
            // InternalUpctforma.g:2640:2: ( rule__ContentUnit__AuthorAssignment_2 )
            {
             before(grammarAccess.getContentUnitAccess().getAuthorAssignment_2()); 
            // InternalUpctforma.g:2641:2: ( rule__ContentUnit__AuthorAssignment_2 )
            // InternalUpctforma.g:2641:3: rule__ContentUnit__AuthorAssignment_2
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
    // InternalUpctforma.g:2649:1: rule__ContentUnit__Group__3 : rule__ContentUnit__Group__3__Impl rule__ContentUnit__Group__4 ;
    public final void rule__ContentUnit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2653:1: ( rule__ContentUnit__Group__3__Impl rule__ContentUnit__Group__4 )
            // InternalUpctforma.g:2654:2: rule__ContentUnit__Group__3__Impl rule__ContentUnit__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUpctforma.g:2661:1: rule__ContentUnit__Group__3__Impl : ( ( rule__ContentUnit__TypeAssignment_3 ) ) ;
    public final void rule__ContentUnit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2665:1: ( ( ( rule__ContentUnit__TypeAssignment_3 ) ) )
            // InternalUpctforma.g:2666:1: ( ( rule__ContentUnit__TypeAssignment_3 ) )
            {
            // InternalUpctforma.g:2666:1: ( ( rule__ContentUnit__TypeAssignment_3 ) )
            // InternalUpctforma.g:2667:2: ( rule__ContentUnit__TypeAssignment_3 )
            {
             before(grammarAccess.getContentUnitAccess().getTypeAssignment_3()); 
            // InternalUpctforma.g:2668:2: ( rule__ContentUnit__TypeAssignment_3 )
            // InternalUpctforma.g:2668:3: rule__ContentUnit__TypeAssignment_3
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
    // InternalUpctforma.g:2676:1: rule__ContentUnit__Group__4 : rule__ContentUnit__Group__4__Impl rule__ContentUnit__Group__5 ;
    public final void rule__ContentUnit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2680:1: ( rule__ContentUnit__Group__4__Impl rule__ContentUnit__Group__5 )
            // InternalUpctforma.g:2681:2: rule__ContentUnit__Group__4__Impl rule__ContentUnit__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalUpctforma.g:2688:1: rule__ContentUnit__Group__4__Impl : ( '{' ) ;
    public final void rule__ContentUnit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2692:1: ( ( '{' ) )
            // InternalUpctforma.g:2693:1: ( '{' )
            {
            // InternalUpctforma.g:2693:1: ( '{' )
            // InternalUpctforma.g:2694:2: '{'
            {
             before(grammarAccess.getContentUnitAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContentUnitAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalUpctforma.g:2703:1: rule__ContentUnit__Group__5 : rule__ContentUnit__Group__5__Impl rule__ContentUnit__Group__6 ;
    public final void rule__ContentUnit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2707:1: ( rule__ContentUnit__Group__5__Impl rule__ContentUnit__Group__6 )
            // InternalUpctforma.g:2708:2: rule__ContentUnit__Group__5__Impl rule__ContentUnit__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalUpctforma.g:2715:1: rule__ContentUnit__Group__5__Impl : ( ( rule__ContentUnit__SectionsAssignment_5 ) ) ;
    public final void rule__ContentUnit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2719:1: ( ( ( rule__ContentUnit__SectionsAssignment_5 ) ) )
            // InternalUpctforma.g:2720:1: ( ( rule__ContentUnit__SectionsAssignment_5 ) )
            {
            // InternalUpctforma.g:2720:1: ( ( rule__ContentUnit__SectionsAssignment_5 ) )
            // InternalUpctforma.g:2721:2: ( rule__ContentUnit__SectionsAssignment_5 )
            {
             before(grammarAccess.getContentUnitAccess().getSectionsAssignment_5()); 
            // InternalUpctforma.g:2722:2: ( rule__ContentUnit__SectionsAssignment_5 )
            // InternalUpctforma.g:2722:3: rule__ContentUnit__SectionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__SectionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getSectionsAssignment_5()); 

            }


            }

        }
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
    // InternalUpctforma.g:2730:1: rule__ContentUnit__Group__6 : rule__ContentUnit__Group__6__Impl rule__ContentUnit__Group__7 ;
    public final void rule__ContentUnit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2734:1: ( rule__ContentUnit__Group__6__Impl rule__ContentUnit__Group__7 )
            // InternalUpctforma.g:2735:2: rule__ContentUnit__Group__6__Impl rule__ContentUnit__Group__7
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
    // InternalUpctforma.g:2742:1: rule__ContentUnit__Group__6__Impl : ( ( rule__ContentUnit__Group_6__0 )* ) ;
    public final void rule__ContentUnit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2746:1: ( ( ( rule__ContentUnit__Group_6__0 )* ) )
            // InternalUpctforma.g:2747:1: ( ( rule__ContentUnit__Group_6__0 )* )
            {
            // InternalUpctforma.g:2747:1: ( ( rule__ContentUnit__Group_6__0 )* )
            // InternalUpctforma.g:2748:2: ( rule__ContentUnit__Group_6__0 )*
            {
             before(grammarAccess.getContentUnitAccess().getGroup_6()); 
            // InternalUpctforma.g:2749:2: ( rule__ContentUnit__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUpctforma.g:2749:3: rule__ContentUnit__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ContentUnit__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getContentUnitAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalUpctforma.g:2757:1: rule__ContentUnit__Group__7 : rule__ContentUnit__Group__7__Impl ;
    public final void rule__ContentUnit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2761:1: ( rule__ContentUnit__Group__7__Impl )
            // InternalUpctforma.g:2762:2: rule__ContentUnit__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalUpctforma.g:2768:1: rule__ContentUnit__Group__7__Impl : ( '}' ) ;
    public final void rule__ContentUnit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2772:1: ( ( '}' ) )
            // InternalUpctforma.g:2773:1: ( '}' )
            {
            // InternalUpctforma.g:2773:1: ( '}' )
            // InternalUpctforma.g:2774:2: '}'
            {
             before(grammarAccess.getContentUnitAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getContentUnitAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__ContentUnit__Group_6__0"
    // InternalUpctforma.g:2784:1: rule__ContentUnit__Group_6__0 : rule__ContentUnit__Group_6__0__Impl rule__ContentUnit__Group_6__1 ;
    public final void rule__ContentUnit__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2788:1: ( rule__ContentUnit__Group_6__0__Impl rule__ContentUnit__Group_6__1 )
            // InternalUpctforma.g:2789:2: rule__ContentUnit__Group_6__0__Impl rule__ContentUnit__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__ContentUnit__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_6__0"


    // $ANTLR start "rule__ContentUnit__Group_6__0__Impl"
    // InternalUpctforma.g:2796:1: rule__ContentUnit__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ContentUnit__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2800:1: ( ( ',' ) )
            // InternalUpctforma.g:2801:1: ( ',' )
            {
            // InternalUpctforma.g:2801:1: ( ',' )
            // InternalUpctforma.g:2802:2: ','
            {
             before(grammarAccess.getContentUnitAccess().getCommaKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getContentUnitAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_6__0__Impl"


    // $ANTLR start "rule__ContentUnit__Group_6__1"
    // InternalUpctforma.g:2811:1: rule__ContentUnit__Group_6__1 : rule__ContentUnit__Group_6__1__Impl ;
    public final void rule__ContentUnit__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2815:1: ( rule__ContentUnit__Group_6__1__Impl )
            // InternalUpctforma.g:2816:2: rule__ContentUnit__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_6__1"


    // $ANTLR start "rule__ContentUnit__Group_6__1__Impl"
    // InternalUpctforma.g:2822:1: rule__ContentUnit__Group_6__1__Impl : ( ( rule__ContentUnit__SectionsAssignment_6_1 ) ) ;
    public final void rule__ContentUnit__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2826:1: ( ( ( rule__ContentUnit__SectionsAssignment_6_1 ) ) )
            // InternalUpctforma.g:2827:1: ( ( rule__ContentUnit__SectionsAssignment_6_1 ) )
            {
            // InternalUpctforma.g:2827:1: ( ( rule__ContentUnit__SectionsAssignment_6_1 ) )
            // InternalUpctforma.g:2828:2: ( rule__ContentUnit__SectionsAssignment_6_1 )
            {
             before(grammarAccess.getContentUnitAccess().getSectionsAssignment_6_1()); 
            // InternalUpctforma.g:2829:2: ( rule__ContentUnit__SectionsAssignment_6_1 )
            // InternalUpctforma.g:2829:3: rule__ContentUnit__SectionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ContentUnit__SectionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getContentUnitAccess().getSectionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__Group_6__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalUpctforma.g:2838:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2842:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalUpctforma.g:2843:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUpctforma.g:2850:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2854:1: ( ( () ) )
            // InternalUpctforma.g:2855:1: ( () )
            {
            // InternalUpctforma.g:2855:1: ( () )
            // InternalUpctforma.g:2856:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalUpctforma.g:2857:2: ()
            // InternalUpctforma.g:2857:3: 
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
    // InternalUpctforma.g:2865:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2869:1: ( rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2 )
            // InternalUpctforma.g:2870:2: rule__Type_Impl__Group__1__Impl rule__Type_Impl__Group__2
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
    // InternalUpctforma.g:2877:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2881:1: ( ( 'Type' ) )
            // InternalUpctforma.g:2882:1: ( 'Type' )
            {
            // InternalUpctforma.g:2882:1: ( 'Type' )
            // InternalUpctforma.g:2883:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUpctforma.g:2892:1: rule__Type_Impl__Group__2 : rule__Type_Impl__Group__2__Impl ;
    public final void rule__Type_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2896:1: ( rule__Type_Impl__Group__2__Impl )
            // InternalUpctforma.g:2897:2: rule__Type_Impl__Group__2__Impl
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
    // InternalUpctforma.g:2903:1: rule__Type_Impl__Group__2__Impl : ( ( rule__Type_Impl__NameAssignment_2 ) ) ;
    public final void rule__Type_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2907:1: ( ( ( rule__Type_Impl__NameAssignment_2 ) ) )
            // InternalUpctforma.g:2908:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:2908:1: ( ( rule__Type_Impl__NameAssignment_2 ) )
            // InternalUpctforma.g:2909:2: ( rule__Type_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getType_ImplAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:2910:2: ( rule__Type_Impl__NameAssignment_2 )
            // InternalUpctforma.g:2910:3: rule__Type_Impl__NameAssignment_2
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
    // InternalUpctforma.g:2919:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2923:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalUpctforma.g:2924:2: rule__Row__Group__0__Impl rule__Row__Group__1
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
    // InternalUpctforma.g:2931:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2935:1: ( ( () ) )
            // InternalUpctforma.g:2936:1: ( () )
            {
            // InternalUpctforma.g:2936:1: ( () )
            // InternalUpctforma.g:2937:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_0()); 
            // InternalUpctforma.g:2938:2: ()
            // InternalUpctforma.g:2938:3: 
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
    // InternalUpctforma.g:2946:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2950:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalUpctforma.g:2951:2: rule__Row__Group__1__Impl rule__Row__Group__2
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
    // InternalUpctforma.g:2958:1: rule__Row__Group__1__Impl : ( 'row' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2962:1: ( ( 'row' ) )
            // InternalUpctforma.g:2963:1: ( 'row' )
            {
            // InternalUpctforma.g:2963:1: ( 'row' )
            // InternalUpctforma.g:2964:2: 'row'
            {
             before(grammarAccess.getRowAccess().getRowKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUpctforma.g:2973:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2977:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalUpctforma.g:2978:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalUpctforma.g:2985:1: rule__Row__Group__2__Impl : ( '{' ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:2989:1: ( ( '{' ) )
            // InternalUpctforma.g:2990:1: ( '{' )
            {
            // InternalUpctforma.g:2990:1: ( '{' )
            // InternalUpctforma.g:2991:2: '{'
            {
             before(grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:3000:1: rule__Row__Group__3 : rule__Row__Group__3__Impl rule__Row__Group__4 ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3004:1: ( rule__Row__Group__3__Impl rule__Row__Group__4 )
            // InternalUpctforma.g:3005:2: rule__Row__Group__3__Impl rule__Row__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalUpctforma.g:3012:1: rule__Row__Group__3__Impl : ( ( rule__Row__Group_3__0 )? ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3016:1: ( ( ( rule__Row__Group_3__0 )? ) )
            // InternalUpctforma.g:3017:1: ( ( rule__Row__Group_3__0 )? )
            {
            // InternalUpctforma.g:3017:1: ( ( rule__Row__Group_3__0 )? )
            // InternalUpctforma.g:3018:2: ( rule__Row__Group_3__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_3()); 
            // InternalUpctforma.g:3019:2: ( rule__Row__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUpctforma.g:3019:3: rule__Row__Group_3__0
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
    // InternalUpctforma.g:3027:1: rule__Row__Group__4 : rule__Row__Group__4__Impl rule__Row__Group__5 ;
    public final void rule__Row__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3031:1: ( rule__Row__Group__4__Impl rule__Row__Group__5 )
            // InternalUpctforma.g:3032:2: rule__Row__Group__4__Impl rule__Row__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalUpctforma.g:3039:1: rule__Row__Group__4__Impl : ( ( rule__Row__Group_4__0 )? ) ;
    public final void rule__Row__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3043:1: ( ( ( rule__Row__Group_4__0 )? ) )
            // InternalUpctforma.g:3044:1: ( ( rule__Row__Group_4__0 )? )
            {
            // InternalUpctforma.g:3044:1: ( ( rule__Row__Group_4__0 )? )
            // InternalUpctforma.g:3045:2: ( rule__Row__Group_4__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_4()); 
            // InternalUpctforma.g:3046:2: ( rule__Row__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUpctforma.g:3046:3: rule__Row__Group_4__0
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
    // InternalUpctforma.g:3054:1: rule__Row__Group__5 : rule__Row__Group__5__Impl ;
    public final void rule__Row__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3058:1: ( rule__Row__Group__5__Impl )
            // InternalUpctforma.g:3059:2: rule__Row__Group__5__Impl
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
    // InternalUpctforma.g:3065:1: rule__Row__Group__5__Impl : ( '}' ) ;
    public final void rule__Row__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3069:1: ( ( '}' ) )
            // InternalUpctforma.g:3070:1: ( '}' )
            {
            // InternalUpctforma.g:3070:1: ( '}' )
            // InternalUpctforma.g:3071:2: '}'
            {
             before(grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:3081:1: rule__Row__Group_3__0 : rule__Row__Group_3__0__Impl rule__Row__Group_3__1 ;
    public final void rule__Row__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3085:1: ( rule__Row__Group_3__0__Impl rule__Row__Group_3__1 )
            // InternalUpctforma.g:3086:2: rule__Row__Group_3__0__Impl rule__Row__Group_3__1
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
    // InternalUpctforma.g:3093:1: rule__Row__Group_3__0__Impl : ( ( rule__Row__ColumnsAssignment_3_0 ) ) ;
    public final void rule__Row__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3097:1: ( ( ( rule__Row__ColumnsAssignment_3_0 ) ) )
            // InternalUpctforma.g:3098:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            {
            // InternalUpctforma.g:3098:1: ( ( rule__Row__ColumnsAssignment_3_0 ) )
            // InternalUpctforma.g:3099:2: ( rule__Row__ColumnsAssignment_3_0 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_0()); 
            // InternalUpctforma.g:3100:2: ( rule__Row__ColumnsAssignment_3_0 )
            // InternalUpctforma.g:3100:3: rule__Row__ColumnsAssignment_3_0
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
    // InternalUpctforma.g:3108:1: rule__Row__Group_3__1 : rule__Row__Group_3__1__Impl ;
    public final void rule__Row__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3112:1: ( rule__Row__Group_3__1__Impl )
            // InternalUpctforma.g:3113:2: rule__Row__Group_3__1__Impl
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
    // InternalUpctforma.g:3119:1: rule__Row__Group_3__1__Impl : ( ( rule__Row__Group_3_1__0 )* ) ;
    public final void rule__Row__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3123:1: ( ( ( rule__Row__Group_3_1__0 )* ) )
            // InternalUpctforma.g:3124:1: ( ( rule__Row__Group_3_1__0 )* )
            {
            // InternalUpctforma.g:3124:1: ( ( rule__Row__Group_3_1__0 )* )
            // InternalUpctforma.g:3125:2: ( rule__Row__Group_3_1__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_3_1()); 
            // InternalUpctforma.g:3126:2: ( rule__Row__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==22) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUpctforma.g:3126:3: rule__Row__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Row__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalUpctforma.g:3135:1: rule__Row__Group_3_1__0 : rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 ;
    public final void rule__Row__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3139:1: ( rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1 )
            // InternalUpctforma.g:3140:2: rule__Row__Group_3_1__0__Impl rule__Row__Group_3_1__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalUpctforma.g:3147:1: rule__Row__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3151:1: ( ( ',' ) )
            // InternalUpctforma.g:3152:1: ( ',' )
            {
            // InternalUpctforma.g:3152:1: ( ',' )
            // InternalUpctforma.g:3153:2: ','
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_3_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:3162:1: rule__Row__Group_3_1__1 : rule__Row__Group_3_1__1__Impl ;
    public final void rule__Row__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3166:1: ( rule__Row__Group_3_1__1__Impl )
            // InternalUpctforma.g:3167:2: rule__Row__Group_3_1__1__Impl
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
    // InternalUpctforma.g:3173:1: rule__Row__Group_3_1__1__Impl : ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) ;
    public final void rule__Row__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3177:1: ( ( ( rule__Row__ColumnsAssignment_3_1_1 ) ) )
            // InternalUpctforma.g:3178:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            {
            // InternalUpctforma.g:3178:1: ( ( rule__Row__ColumnsAssignment_3_1_1 ) )
            // InternalUpctforma.g:3179:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_3_1_1()); 
            // InternalUpctforma.g:3180:2: ( rule__Row__ColumnsAssignment_3_1_1 )
            // InternalUpctforma.g:3180:3: rule__Row__ColumnsAssignment_3_1_1
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
    // InternalUpctforma.g:3189:1: rule__Row__Group_4__0 : rule__Row__Group_4__0__Impl rule__Row__Group_4__1 ;
    public final void rule__Row__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3193:1: ( rule__Row__Group_4__0__Impl rule__Row__Group_4__1 )
            // InternalUpctforma.g:3194:2: rule__Row__Group_4__0__Impl rule__Row__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalUpctforma.g:3201:1: rule__Row__Group_4__0__Impl : ( 'usetemplate' ) ;
    public final void rule__Row__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3205:1: ( ( 'usetemplate' ) )
            // InternalUpctforma.g:3206:1: ( 'usetemplate' )
            {
            // InternalUpctforma.g:3206:1: ( 'usetemplate' )
            // InternalUpctforma.g:3207:2: 'usetemplate'
            {
             before(grammarAccess.getRowAccess().getUsetemplateKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUpctforma.g:3216:1: rule__Row__Group_4__1 : rule__Row__Group_4__1__Impl ;
    public final void rule__Row__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3220:1: ( rule__Row__Group_4__1__Impl )
            // InternalUpctforma.g:3221:2: rule__Row__Group_4__1__Impl
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
    // InternalUpctforma.g:3227:1: rule__Row__Group_4__1__Impl : ( ( rule__Row__UsetemplateAssignment_4_1 ) ) ;
    public final void rule__Row__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3231:1: ( ( ( rule__Row__UsetemplateAssignment_4_1 ) ) )
            // InternalUpctforma.g:3232:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            {
            // InternalUpctforma.g:3232:1: ( ( rule__Row__UsetemplateAssignment_4_1 ) )
            // InternalUpctforma.g:3233:2: ( rule__Row__UsetemplateAssignment_4_1 )
            {
             before(grammarAccess.getRowAccess().getUsetemplateAssignment_4_1()); 
            // InternalUpctforma.g:3234:2: ( rule__Row__UsetemplateAssignment_4_1 )
            // InternalUpctforma.g:3234:3: rule__Row__UsetemplateAssignment_4_1
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
    // InternalUpctforma.g:3243:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3247:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalUpctforma.g:3248:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalUpctforma.g:3255:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3259:1: ( ( () ) )
            // InternalUpctforma.g:3260:1: ( () )
            {
            // InternalUpctforma.g:3260:1: ( () )
            // InternalUpctforma.g:3261:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalUpctforma.g:3262:2: ()
            // InternalUpctforma.g:3262:3: 
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
    // InternalUpctforma.g:3270:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3274:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalUpctforma.g:3275:2: rule__Column__Group__1__Impl rule__Column__Group__2
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
    // InternalUpctforma.g:3282:1: rule__Column__Group__1__Impl : ( 'column' ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3286:1: ( ( 'column' ) )
            // InternalUpctforma.g:3287:1: ( 'column' )
            {
            // InternalUpctforma.g:3287:1: ( 'column' )
            // InternalUpctforma.g:3288:2: 'column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUpctforma.g:3297:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3301:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalUpctforma.g:3302:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctforma.g:3309:1: rule__Column__Group__2__Impl : ( '{' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3313:1: ( ( '{' ) )
            // InternalUpctforma.g:3314:1: ( '{' )
            {
            // InternalUpctforma.g:3314:1: ( '{' )
            // InternalUpctforma.g:3315:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:3324:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3328:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalUpctforma.g:3329:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctforma.g:3336:1: rule__Column__Group__3__Impl : ( ( rule__Column__Group_3__0 )? ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3340:1: ( ( ( rule__Column__Group_3__0 )? ) )
            // InternalUpctforma.g:3341:1: ( ( rule__Column__Group_3__0 )? )
            {
            // InternalUpctforma.g:3341:1: ( ( rule__Column__Group_3__0 )? )
            // InternalUpctforma.g:3342:2: ( rule__Column__Group_3__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_3()); 
            // InternalUpctforma.g:3343:2: ( rule__Column__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctforma.g:3343:3: rule__Column__Group_3__0
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
    // InternalUpctforma.g:3351:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3355:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalUpctforma.g:3356:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalUpctforma.g:3363:1: rule__Column__Group__4__Impl : ( ( rule__Column__Group_4__0 )? ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3367:1: ( ( ( rule__Column__Group_4__0 )? ) )
            // InternalUpctforma.g:3368:1: ( ( rule__Column__Group_4__0 )? )
            {
            // InternalUpctforma.g:3368:1: ( ( rule__Column__Group_4__0 )? )
            // InternalUpctforma.g:3369:2: ( rule__Column__Group_4__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_4()); 
            // InternalUpctforma.g:3370:2: ( rule__Column__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18||LA24_0==31||LA24_0==33||(LA24_0>=35 && LA24_0<=36)||LA24_0==38||LA24_0==40||(LA24_0>=42 && LA24_0<=43)||(LA24_0>=45 && LA24_0<=46)||(LA24_0>=49 && LA24_0<=52)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUpctforma.g:3370:3: rule__Column__Group_4__0
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
    // InternalUpctforma.g:3378:1: rule__Column__Group__5 : rule__Column__Group__5__Impl ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3382:1: ( rule__Column__Group__5__Impl )
            // InternalUpctforma.g:3383:2: rule__Column__Group__5__Impl
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
    // InternalUpctforma.g:3389:1: rule__Column__Group__5__Impl : ( '}' ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3393:1: ( ( '}' ) )
            // InternalUpctforma.g:3394:1: ( '}' )
            {
            // InternalUpctforma.g:3394:1: ( '}' )
            // InternalUpctforma.g:3395:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:3405:1: rule__Column__Group_3__0 : rule__Column__Group_3__0__Impl rule__Column__Group_3__1 ;
    public final void rule__Column__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3409:1: ( rule__Column__Group_3__0__Impl rule__Column__Group_3__1 )
            // InternalUpctforma.g:3410:2: rule__Column__Group_3__0__Impl rule__Column__Group_3__1
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
    // InternalUpctforma.g:3417:1: rule__Column__Group_3__0__Impl : ( 'width' ) ;
    public final void rule__Column__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3421:1: ( ( 'width' ) )
            // InternalUpctforma.g:3422:1: ( 'width' )
            {
            // InternalUpctforma.g:3422:1: ( 'width' )
            // InternalUpctforma.g:3423:2: 'width'
            {
             before(grammarAccess.getColumnAccess().getWidthKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUpctforma.g:3432:1: rule__Column__Group_3__1 : rule__Column__Group_3__1__Impl ;
    public final void rule__Column__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3436:1: ( rule__Column__Group_3__1__Impl )
            // InternalUpctforma.g:3437:2: rule__Column__Group_3__1__Impl
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
    // InternalUpctforma.g:3443:1: rule__Column__Group_3__1__Impl : ( ( rule__Column__WidthAssignment_3_1 ) ) ;
    public final void rule__Column__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3447:1: ( ( ( rule__Column__WidthAssignment_3_1 ) ) )
            // InternalUpctforma.g:3448:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            {
            // InternalUpctforma.g:3448:1: ( ( rule__Column__WidthAssignment_3_1 ) )
            // InternalUpctforma.g:3449:2: ( rule__Column__WidthAssignment_3_1 )
            {
             before(grammarAccess.getColumnAccess().getWidthAssignment_3_1()); 
            // InternalUpctforma.g:3450:2: ( rule__Column__WidthAssignment_3_1 )
            // InternalUpctforma.g:3450:3: rule__Column__WidthAssignment_3_1
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
    // InternalUpctforma.g:3459:1: rule__Column__Group_4__0 : rule__Column__Group_4__0__Impl rule__Column__Group_4__1 ;
    public final void rule__Column__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3463:1: ( rule__Column__Group_4__0__Impl rule__Column__Group_4__1 )
            // InternalUpctforma.g:3464:2: rule__Column__Group_4__0__Impl rule__Column__Group_4__1
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
    // InternalUpctforma.g:3471:1: rule__Column__Group_4__0__Impl : ( ( rule__Column__ElementsAssignment_4_0 ) ) ;
    public final void rule__Column__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3475:1: ( ( ( rule__Column__ElementsAssignment_4_0 ) ) )
            // InternalUpctforma.g:3476:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            {
            // InternalUpctforma.g:3476:1: ( ( rule__Column__ElementsAssignment_4_0 ) )
            // InternalUpctforma.g:3477:2: ( rule__Column__ElementsAssignment_4_0 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_0()); 
            // InternalUpctforma.g:3478:2: ( rule__Column__ElementsAssignment_4_0 )
            // InternalUpctforma.g:3478:3: rule__Column__ElementsAssignment_4_0
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
    // InternalUpctforma.g:3486:1: rule__Column__Group_4__1 : rule__Column__Group_4__1__Impl ;
    public final void rule__Column__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3490:1: ( rule__Column__Group_4__1__Impl )
            // InternalUpctforma.g:3491:2: rule__Column__Group_4__1__Impl
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
    // InternalUpctforma.g:3497:1: rule__Column__Group_4__1__Impl : ( ( rule__Column__Group_4_1__0 )* ) ;
    public final void rule__Column__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3501:1: ( ( ( rule__Column__Group_4_1__0 )* ) )
            // InternalUpctforma.g:3502:1: ( ( rule__Column__Group_4_1__0 )* )
            {
            // InternalUpctforma.g:3502:1: ( ( rule__Column__Group_4_1__0 )* )
            // InternalUpctforma.g:3503:2: ( rule__Column__Group_4_1__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_4_1()); 
            // InternalUpctforma.g:3504:2: ( rule__Column__Group_4_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==22) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUpctforma.g:3504:3: rule__Column__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Column__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalUpctforma.g:3513:1: rule__Column__Group_4_1__0 : rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 ;
    public final void rule__Column__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3517:1: ( rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1 )
            // InternalUpctforma.g:3518:2: rule__Column__Group_4_1__0__Impl rule__Column__Group_4_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:3525:1: rule__Column__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3529:1: ( ( ',' ) )
            // InternalUpctforma.g:3530:1: ( ',' )
            {
            // InternalUpctforma.g:3530:1: ( ',' )
            // InternalUpctforma.g:3531:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_4_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:3540:1: rule__Column__Group_4_1__1 : rule__Column__Group_4_1__1__Impl ;
    public final void rule__Column__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3544:1: ( rule__Column__Group_4_1__1__Impl )
            // InternalUpctforma.g:3545:2: rule__Column__Group_4_1__1__Impl
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
    // InternalUpctforma.g:3551:1: rule__Column__Group_4_1__1__Impl : ( ( rule__Column__ElementsAssignment_4_1_1 ) ) ;
    public final void rule__Column__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3555:1: ( ( ( rule__Column__ElementsAssignment_4_1_1 ) ) )
            // InternalUpctforma.g:3556:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            {
            // InternalUpctforma.g:3556:1: ( ( rule__Column__ElementsAssignment_4_1_1 ) )
            // InternalUpctforma.g:3557:2: ( rule__Column__ElementsAssignment_4_1_1 )
            {
             before(grammarAccess.getColumnAccess().getElementsAssignment_4_1_1()); 
            // InternalUpctforma.g:3558:2: ( rule__Column__ElementsAssignment_4_1_1 )
            // InternalUpctforma.g:3558:3: rule__Column__ElementsAssignment_4_1_1
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
    // InternalUpctforma.g:3567:1: rule__UseTemplate__Group__0 : rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 ;
    public final void rule__UseTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3571:1: ( rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1 )
            // InternalUpctforma.g:3572:2: rule__UseTemplate__Group__0__Impl rule__UseTemplate__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalUpctforma.g:3579:1: rule__UseTemplate__Group__0__Impl : ( () ) ;
    public final void rule__UseTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3583:1: ( ( () ) )
            // InternalUpctforma.g:3584:1: ( () )
            {
            // InternalUpctforma.g:3584:1: ( () )
            // InternalUpctforma.g:3585:2: ()
            {
             before(grammarAccess.getUseTemplateAccess().getUseTemplateAction_0()); 
            // InternalUpctforma.g:3586:2: ()
            // InternalUpctforma.g:3586:3: 
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
    // InternalUpctforma.g:3594:1: rule__UseTemplate__Group__1 : rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 ;
    public final void rule__UseTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3598:1: ( rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2 )
            // InternalUpctforma.g:3599:2: rule__UseTemplate__Group__1__Impl rule__UseTemplate__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalUpctforma.g:3606:1: rule__UseTemplate__Group__1__Impl : ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) ;
    public final void rule__UseTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3610:1: ( ( ( rule__UseTemplate__TypetemplateAssignment_1 )? ) )
            // InternalUpctforma.g:3611:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            {
            // InternalUpctforma.g:3611:1: ( ( rule__UseTemplate__TypetemplateAssignment_1 )? )
            // InternalUpctforma.g:3612:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateAssignment_1()); 
            // InternalUpctforma.g:3613:2: ( rule__UseTemplate__TypetemplateAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_STRING && LA26_0<=RULE_ID)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctforma.g:3613:3: rule__UseTemplate__TypetemplateAssignment_1
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
    // InternalUpctforma.g:3621:1: rule__UseTemplate__Group__2 : rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 ;
    public final void rule__UseTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3625:1: ( rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3 )
            // InternalUpctforma.g:3626:2: rule__UseTemplate__Group__2__Impl rule__UseTemplate__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalUpctforma.g:3633:1: rule__UseTemplate__Group__2__Impl : ( ( rule__UseTemplate__Group_2__0 )? ) ;
    public final void rule__UseTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3637:1: ( ( ( rule__UseTemplate__Group_2__0 )? ) )
            // InternalUpctforma.g:3638:1: ( ( rule__UseTemplate__Group_2__0 )? )
            {
            // InternalUpctforma.g:3638:1: ( ( rule__UseTemplate__Group_2__0 )? )
            // InternalUpctforma.g:3639:2: ( rule__UseTemplate__Group_2__0 )?
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2()); 
            // InternalUpctforma.g:3640:2: ( rule__UseTemplate__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUpctforma.g:3640:3: rule__UseTemplate__Group_2__0
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
    // InternalUpctforma.g:3648:1: rule__UseTemplate__Group__3 : rule__UseTemplate__Group__3__Impl ;
    public final void rule__UseTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3652:1: ( rule__UseTemplate__Group__3__Impl )
            // InternalUpctforma.g:3653:2: rule__UseTemplate__Group__3__Impl
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
    // InternalUpctforma.g:3659:1: rule__UseTemplate__Group__3__Impl : ( '}' ) ;
    public final void rule__UseTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3663:1: ( ( '}' ) )
            // InternalUpctforma.g:3664:1: ( '}' )
            {
            // InternalUpctforma.g:3664:1: ( '}' )
            // InternalUpctforma.g:3665:2: '}'
            {
             before(grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:3675:1: rule__UseTemplate__Group_2__0 : rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 ;
    public final void rule__UseTemplate__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3679:1: ( rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1 )
            // InternalUpctforma.g:3680:2: rule__UseTemplate__Group_2__0__Impl rule__UseTemplate__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:3687:1: rule__UseTemplate__Group_2__0__Impl : ( '{' ) ;
    public final void rule__UseTemplate__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3691:1: ( ( '{' ) )
            // InternalUpctforma.g:3692:1: ( '{' )
            {
            // InternalUpctforma.g:3692:1: ( '{' )
            // InternalUpctforma.g:3693:2: '{'
            {
             before(grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:3702:1: rule__UseTemplate__Group_2__1 : rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 ;
    public final void rule__UseTemplate__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3706:1: ( rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2 )
            // InternalUpctforma.g:3707:2: rule__UseTemplate__Group_2__1__Impl rule__UseTemplate__Group_2__2
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
    // InternalUpctforma.g:3714:1: rule__UseTemplate__Group_2__1__Impl : ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3718:1: ( ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) ) )
            // InternalUpctforma.g:3719:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) )
            {
            // InternalUpctforma.g:3719:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_1 ) )
            // InternalUpctforma.g:3720:2: ( rule__UseTemplate__TemplateelementsAssignment_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_1()); 
            // InternalUpctforma.g:3721:2: ( rule__UseTemplate__TemplateelementsAssignment_2_1 )
            // InternalUpctforma.g:3721:3: rule__UseTemplate__TemplateelementsAssignment_2_1
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
    // InternalUpctforma.g:3729:1: rule__UseTemplate__Group_2__2 : rule__UseTemplate__Group_2__2__Impl ;
    public final void rule__UseTemplate__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3733:1: ( rule__UseTemplate__Group_2__2__Impl )
            // InternalUpctforma.g:3734:2: rule__UseTemplate__Group_2__2__Impl
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
    // InternalUpctforma.g:3740:1: rule__UseTemplate__Group_2__2__Impl : ( ( rule__UseTemplate__Group_2_2__0 )* ) ;
    public final void rule__UseTemplate__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3744:1: ( ( ( rule__UseTemplate__Group_2_2__0 )* ) )
            // InternalUpctforma.g:3745:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            {
            // InternalUpctforma.g:3745:1: ( ( rule__UseTemplate__Group_2_2__0 )* )
            // InternalUpctforma.g:3746:2: ( rule__UseTemplate__Group_2_2__0 )*
            {
             before(grammarAccess.getUseTemplateAccess().getGroup_2_2()); 
            // InternalUpctforma.g:3747:2: ( rule__UseTemplate__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUpctforma.g:3747:3: rule__UseTemplate__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__UseTemplate__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalUpctforma.g:3756:1: rule__UseTemplate__Group_2_2__0 : rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 ;
    public final void rule__UseTemplate__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3760:1: ( rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1 )
            // InternalUpctforma.g:3761:2: rule__UseTemplate__Group_2_2__0__Impl rule__UseTemplate__Group_2_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:3768:1: rule__UseTemplate__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__UseTemplate__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3772:1: ( ( ',' ) )
            // InternalUpctforma.g:3773:1: ( ',' )
            {
            // InternalUpctforma.g:3773:1: ( ',' )
            // InternalUpctforma.g:3774:2: ','
            {
             before(grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:3783:1: rule__UseTemplate__Group_2_2__1 : rule__UseTemplate__Group_2_2__1__Impl ;
    public final void rule__UseTemplate__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3787:1: ( rule__UseTemplate__Group_2_2__1__Impl )
            // InternalUpctforma.g:3788:2: rule__UseTemplate__Group_2_2__1__Impl
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
    // InternalUpctforma.g:3794:1: rule__UseTemplate__Group_2_2__1__Impl : ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) ) ;
    public final void rule__UseTemplate__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3798:1: ( ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) ) )
            // InternalUpctforma.g:3799:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) )
            {
            // InternalUpctforma.g:3799:1: ( ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 ) )
            // InternalUpctforma.g:3800:2: ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 )
            {
             before(grammarAccess.getUseTemplateAccess().getTemplateelementsAssignment_2_2_1()); 
            // InternalUpctforma.g:3801:2: ( rule__UseTemplate__TemplateelementsAssignment_2_2_1 )
            // InternalUpctforma.g:3801:3: rule__UseTemplate__TemplateelementsAssignment_2_2_1
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
    // InternalUpctforma.g:3810:1: rule__ContentElement_Impl__Group__0 : rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 ;
    public final void rule__ContentElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3814:1: ( rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1 )
            // InternalUpctforma.g:3815:2: rule__ContentElement_Impl__Group__0__Impl rule__ContentElement_Impl__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUpctforma.g:3822:1: rule__ContentElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__ContentElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3826:1: ( ( () ) )
            // InternalUpctforma.g:3827:1: ( () )
            {
            // InternalUpctforma.g:3827:1: ( () )
            // InternalUpctforma.g:3828:2: ()
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementAction_0()); 
            // InternalUpctforma.g:3829:2: ()
            // InternalUpctforma.g:3829:3: 
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
    // InternalUpctforma.g:3837:1: rule__ContentElement_Impl__Group__1 : rule__ContentElement_Impl__Group__1__Impl ;
    public final void rule__ContentElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3841:1: ( rule__ContentElement_Impl__Group__1__Impl )
            // InternalUpctforma.g:3842:2: rule__ContentElement_Impl__Group__1__Impl
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
    // InternalUpctforma.g:3848:1: rule__ContentElement_Impl__Group__1__Impl : ( 'ContentElement' ) ;
    public final void rule__ContentElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3852:1: ( ( 'ContentElement' ) )
            // InternalUpctforma.g:3853:1: ( 'ContentElement' )
            {
            // InternalUpctforma.g:3853:1: ( 'ContentElement' )
            // InternalUpctforma.g:3854:2: 'ContentElement'
            {
             before(grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUpctforma.g:3864:1: rule__Image__Group__0 : rule__Image__Group__0__Impl rule__Image__Group__1 ;
    public final void rule__Image__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3868:1: ( rule__Image__Group__0__Impl rule__Image__Group__1 )
            // InternalUpctforma.g:3869:2: rule__Image__Group__0__Impl rule__Image__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUpctforma.g:3876:1: rule__Image__Group__0__Impl : ( () ) ;
    public final void rule__Image__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3880:1: ( ( () ) )
            // InternalUpctforma.g:3881:1: ( () )
            {
            // InternalUpctforma.g:3881:1: ( () )
            // InternalUpctforma.g:3882:2: ()
            {
             before(grammarAccess.getImageAccess().getImageAction_0()); 
            // InternalUpctforma.g:3883:2: ()
            // InternalUpctforma.g:3883:3: 
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
    // InternalUpctforma.g:3891:1: rule__Image__Group__1 : rule__Image__Group__1__Impl rule__Image__Group__2 ;
    public final void rule__Image__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3895:1: ( rule__Image__Group__1__Impl rule__Image__Group__2 )
            // InternalUpctforma.g:3896:2: rule__Image__Group__1__Impl rule__Image__Group__2
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
    // InternalUpctforma.g:3903:1: rule__Image__Group__1__Impl : ( 'Image' ) ;
    public final void rule__Image__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3907:1: ( ( 'Image' ) )
            // InternalUpctforma.g:3908:1: ( 'Image' )
            {
            // InternalUpctforma.g:3908:1: ( 'Image' )
            // InternalUpctforma.g:3909:2: 'Image'
            {
             before(grammarAccess.getImageAccess().getImageKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUpctforma.g:3918:1: rule__Image__Group__2 : rule__Image__Group__2__Impl rule__Image__Group__3 ;
    public final void rule__Image__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3922:1: ( rule__Image__Group__2__Impl rule__Image__Group__3 )
            // InternalUpctforma.g:3923:2: rule__Image__Group__2__Impl rule__Image__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctforma.g:3930:1: rule__Image__Group__2__Impl : ( '{' ) ;
    public final void rule__Image__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3934:1: ( ( '{' ) )
            // InternalUpctforma.g:3935:1: ( '{' )
            {
            // InternalUpctforma.g:3935:1: ( '{' )
            // InternalUpctforma.g:3936:2: '{'
            {
             before(grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:3945:1: rule__Image__Group__3 : rule__Image__Group__3__Impl rule__Image__Group__4 ;
    public final void rule__Image__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3949:1: ( rule__Image__Group__3__Impl rule__Image__Group__4 )
            // InternalUpctforma.g:3950:2: rule__Image__Group__3__Impl rule__Image__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalUpctforma.g:3957:1: rule__Image__Group__3__Impl : ( ( rule__Image__Group_3__0 )? ) ;
    public final void rule__Image__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3961:1: ( ( ( rule__Image__Group_3__0 )? ) )
            // InternalUpctforma.g:3962:1: ( ( rule__Image__Group_3__0 )? )
            {
            // InternalUpctforma.g:3962:1: ( ( rule__Image__Group_3__0 )? )
            // InternalUpctforma.g:3963:2: ( rule__Image__Group_3__0 )?
            {
             before(grammarAccess.getImageAccess().getGroup_3()); 
            // InternalUpctforma.g:3964:2: ( rule__Image__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctforma.g:3964:3: rule__Image__Group_3__0
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
    // InternalUpctforma.g:3972:1: rule__Image__Group__4 : rule__Image__Group__4__Impl ;
    public final void rule__Image__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3976:1: ( rule__Image__Group__4__Impl )
            // InternalUpctforma.g:3977:2: rule__Image__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Image__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalUpctforma.g:3983:1: rule__Image__Group__4__Impl : ( '}' ) ;
    public final void rule__Image__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:3987:1: ( ( '}' ) )
            // InternalUpctforma.g:3988:1: ( '}' )
            {
            // InternalUpctforma.g:3988:1: ( '}' )
            // InternalUpctforma.g:3989:2: '}'
            {
             before(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getImageAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Image__Group_3__0"
    // InternalUpctforma.g:3999:1: rule__Image__Group_3__0 : rule__Image__Group_3__0__Impl rule__Image__Group_3__1 ;
    public final void rule__Image__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4003:1: ( rule__Image__Group_3__0__Impl rule__Image__Group_3__1 )
            // InternalUpctforma.g:4004:2: rule__Image__Group_3__0__Impl rule__Image__Group_3__1
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
    // InternalUpctforma.g:4011:1: rule__Image__Group_3__0__Impl : ( 'url' ) ;
    public final void rule__Image__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4015:1: ( ( 'url' ) )
            // InternalUpctforma.g:4016:1: ( 'url' )
            {
            // InternalUpctforma.g:4016:1: ( 'url' )
            // InternalUpctforma.g:4017:2: 'url'
            {
             before(grammarAccess.getImageAccess().getUrlKeyword_3_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUpctforma.g:4026:1: rule__Image__Group_3__1 : rule__Image__Group_3__1__Impl ;
    public final void rule__Image__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4030:1: ( rule__Image__Group_3__1__Impl )
            // InternalUpctforma.g:4031:2: rule__Image__Group_3__1__Impl
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
    // InternalUpctforma.g:4037:1: rule__Image__Group_3__1__Impl : ( ( rule__Image__UrlAssignment_3_1 ) ) ;
    public final void rule__Image__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4041:1: ( ( ( rule__Image__UrlAssignment_3_1 ) ) )
            // InternalUpctforma.g:4042:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            {
            // InternalUpctforma.g:4042:1: ( ( rule__Image__UrlAssignment_3_1 ) )
            // InternalUpctforma.g:4043:2: ( rule__Image__UrlAssignment_3_1 )
            {
             before(grammarAccess.getImageAccess().getUrlAssignment_3_1()); 
            // InternalUpctforma.g:4044:2: ( rule__Image__UrlAssignment_3_1 )
            // InternalUpctforma.g:4044:3: rule__Image__UrlAssignment_3_1
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
    // InternalUpctforma.g:4053:1: rule__Widget__Group__0 : rule__Widget__Group__0__Impl rule__Widget__Group__1 ;
    public final void rule__Widget__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4057:1: ( rule__Widget__Group__0__Impl rule__Widget__Group__1 )
            // InternalUpctforma.g:4058:2: rule__Widget__Group__0__Impl rule__Widget__Group__1
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
    // InternalUpctforma.g:4065:1: rule__Widget__Group__0__Impl : ( 'Widget' ) ;
    public final void rule__Widget__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4069:1: ( ( 'Widget' ) )
            // InternalUpctforma.g:4070:1: ( 'Widget' )
            {
            // InternalUpctforma.g:4070:1: ( 'Widget' )
            // InternalUpctforma.g:4071:2: 'Widget'
            {
             before(grammarAccess.getWidgetAccess().getWidgetKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUpctforma.g:4080:1: rule__Widget__Group__1 : rule__Widget__Group__1__Impl rule__Widget__Group__2 ;
    public final void rule__Widget__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4084:1: ( rule__Widget__Group__1__Impl rule__Widget__Group__2 )
            // InternalUpctforma.g:4085:2: rule__Widget__Group__1__Impl rule__Widget__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctforma.g:4092:1: rule__Widget__Group__1__Impl : ( ( rule__Widget__NameAssignment_1 ) ) ;
    public final void rule__Widget__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4096:1: ( ( ( rule__Widget__NameAssignment_1 ) ) )
            // InternalUpctforma.g:4097:1: ( ( rule__Widget__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:4097:1: ( ( rule__Widget__NameAssignment_1 ) )
            // InternalUpctforma.g:4098:2: ( rule__Widget__NameAssignment_1 )
            {
             before(grammarAccess.getWidgetAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:4099:2: ( rule__Widget__NameAssignment_1 )
            // InternalUpctforma.g:4099:3: rule__Widget__NameAssignment_1
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
    // InternalUpctforma.g:4107:1: rule__Widget__Group__2 : rule__Widget__Group__2__Impl rule__Widget__Group__3 ;
    public final void rule__Widget__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4111:1: ( rule__Widget__Group__2__Impl rule__Widget__Group__3 )
            // InternalUpctforma.g:4112:2: rule__Widget__Group__2__Impl rule__Widget__Group__3
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
    // InternalUpctforma.g:4119:1: rule__Widget__Group__2__Impl : ( ':' ) ;
    public final void rule__Widget__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4123:1: ( ( ':' ) )
            // InternalUpctforma.g:4124:1: ( ':' )
            {
            // InternalUpctforma.g:4124:1: ( ':' )
            // InternalUpctforma.g:4125:2: ':'
            {
             before(grammarAccess.getWidgetAccess().getColonKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUpctforma.g:4134:1: rule__Widget__Group__3 : rule__Widget__Group__3__Impl rule__Widget__Group__4 ;
    public final void rule__Widget__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4138:1: ( rule__Widget__Group__3__Impl rule__Widget__Group__4 )
            // InternalUpctforma.g:4139:2: rule__Widget__Group__3__Impl rule__Widget__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctforma.g:4146:1: rule__Widget__Group__3__Impl : ( ( rule__Widget__WidgettypeAssignment_3 ) ) ;
    public final void rule__Widget__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4150:1: ( ( ( rule__Widget__WidgettypeAssignment_3 ) ) )
            // InternalUpctforma.g:4151:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            {
            // InternalUpctforma.g:4151:1: ( ( rule__Widget__WidgettypeAssignment_3 ) )
            // InternalUpctforma.g:4152:2: ( rule__Widget__WidgettypeAssignment_3 )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeAssignment_3()); 
            // InternalUpctforma.g:4153:2: ( rule__Widget__WidgettypeAssignment_3 )
            // InternalUpctforma.g:4153:3: rule__Widget__WidgettypeAssignment_3
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
    // InternalUpctforma.g:4161:1: rule__Widget__Group__4 : rule__Widget__Group__4__Impl rule__Widget__Group__5 ;
    public final void rule__Widget__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4165:1: ( rule__Widget__Group__4__Impl rule__Widget__Group__5 )
            // InternalUpctforma.g:4166:2: rule__Widget__Group__4__Impl rule__Widget__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalUpctforma.g:4173:1: rule__Widget__Group__4__Impl : ( ( rule__Widget__Group_4__0 )? ) ;
    public final void rule__Widget__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4177:1: ( ( ( rule__Widget__Group_4__0 )? ) )
            // InternalUpctforma.g:4178:1: ( ( rule__Widget__Group_4__0 )? )
            {
            // InternalUpctforma.g:4178:1: ( ( rule__Widget__Group_4__0 )? )
            // InternalUpctforma.g:4179:2: ( rule__Widget__Group_4__0 )?
            {
             before(grammarAccess.getWidgetAccess().getGroup_4()); 
            // InternalUpctforma.g:4180:2: ( rule__Widget__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctforma.g:4180:3: rule__Widget__Group_4__0
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
    // InternalUpctforma.g:4188:1: rule__Widget__Group__5 : rule__Widget__Group__5__Impl ;
    public final void rule__Widget__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4192:1: ( rule__Widget__Group__5__Impl )
            // InternalUpctforma.g:4193:2: rule__Widget__Group__5__Impl
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
    // InternalUpctforma.g:4199:1: rule__Widget__Group__5__Impl : ( '}' ) ;
    public final void rule__Widget__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4203:1: ( ( '}' ) )
            // InternalUpctforma.g:4204:1: ( '}' )
            {
            // InternalUpctforma.g:4204:1: ( '}' )
            // InternalUpctforma.g:4205:2: '}'
            {
             before(grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:4215:1: rule__Widget__Group_4__0 : rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 ;
    public final void rule__Widget__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4219:1: ( rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1 )
            // InternalUpctforma.g:4220:2: rule__Widget__Group_4__0__Impl rule__Widget__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:4227:1: rule__Widget__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Widget__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4231:1: ( ( '{' ) )
            // InternalUpctforma.g:4232:1: ( '{' )
            {
            // InternalUpctforma.g:4232:1: ( '{' )
            // InternalUpctforma.g:4233:2: '{'
            {
             before(grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:4242:1: rule__Widget__Group_4__1 : rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 ;
    public final void rule__Widget__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4246:1: ( rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2 )
            // InternalUpctforma.g:4247:2: rule__Widget__Group_4__1__Impl rule__Widget__Group_4__2
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
    // InternalUpctforma.g:4254:1: rule__Widget__Group_4__1__Impl : ( ( rule__Widget__WidgetelementsAssignment_4_1 ) ) ;
    public final void rule__Widget__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4258:1: ( ( ( rule__Widget__WidgetelementsAssignment_4_1 ) ) )
            // InternalUpctforma.g:4259:1: ( ( rule__Widget__WidgetelementsAssignment_4_1 ) )
            {
            // InternalUpctforma.g:4259:1: ( ( rule__Widget__WidgetelementsAssignment_4_1 ) )
            // InternalUpctforma.g:4260:2: ( rule__Widget__WidgetelementsAssignment_4_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_1()); 
            // InternalUpctforma.g:4261:2: ( rule__Widget__WidgetelementsAssignment_4_1 )
            // InternalUpctforma.g:4261:3: rule__Widget__WidgetelementsAssignment_4_1
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
    // InternalUpctforma.g:4269:1: rule__Widget__Group_4__2 : rule__Widget__Group_4__2__Impl ;
    public final void rule__Widget__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4273:1: ( rule__Widget__Group_4__2__Impl )
            // InternalUpctforma.g:4274:2: rule__Widget__Group_4__2__Impl
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
    // InternalUpctforma.g:4280:1: rule__Widget__Group_4__2__Impl : ( ( rule__Widget__Group_4_2__0 )* ) ;
    public final void rule__Widget__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4284:1: ( ( ( rule__Widget__Group_4_2__0 )* ) )
            // InternalUpctforma.g:4285:1: ( ( rule__Widget__Group_4_2__0 )* )
            {
            // InternalUpctforma.g:4285:1: ( ( rule__Widget__Group_4_2__0 )* )
            // InternalUpctforma.g:4286:2: ( rule__Widget__Group_4_2__0 )*
            {
             before(grammarAccess.getWidgetAccess().getGroup_4_2()); 
            // InternalUpctforma.g:4287:2: ( rule__Widget__Group_4_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==22) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalUpctforma.g:4287:3: rule__Widget__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Widget__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalUpctforma.g:4296:1: rule__Widget__Group_4_2__0 : rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 ;
    public final void rule__Widget__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4300:1: ( rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1 )
            // InternalUpctforma.g:4301:2: rule__Widget__Group_4_2__0__Impl rule__Widget__Group_4_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:4308:1: rule__Widget__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Widget__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4312:1: ( ( ',' ) )
            // InternalUpctforma.g:4313:1: ( ',' )
            {
            // InternalUpctforma.g:4313:1: ( ',' )
            // InternalUpctforma.g:4314:2: ','
            {
             before(grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:4323:1: rule__Widget__Group_4_2__1 : rule__Widget__Group_4_2__1__Impl ;
    public final void rule__Widget__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4327:1: ( rule__Widget__Group_4_2__1__Impl )
            // InternalUpctforma.g:4328:2: rule__Widget__Group_4_2__1__Impl
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
    // InternalUpctforma.g:4334:1: rule__Widget__Group_4_2__1__Impl : ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) ) ;
    public final void rule__Widget__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4338:1: ( ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) ) )
            // InternalUpctforma.g:4339:1: ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) )
            {
            // InternalUpctforma.g:4339:1: ( ( rule__Widget__WidgetelementsAssignment_4_2_1 ) )
            // InternalUpctforma.g:4340:2: ( rule__Widget__WidgetelementsAssignment_4_2_1 )
            {
             before(grammarAccess.getWidgetAccess().getWidgetelementsAssignment_4_2_1()); 
            // InternalUpctforma.g:4341:2: ( rule__Widget__WidgetelementsAssignment_4_2_1 )
            // InternalUpctforma.g:4341:3: rule__Widget__WidgetelementsAssignment_4_2_1
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
    // InternalUpctforma.g:4350:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4354:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalUpctforma.g:4355:2: rule__Text__Group__0__Impl rule__Text__Group__1
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
    // InternalUpctforma.g:4362:1: rule__Text__Group__0__Impl : ( 'Text' ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4366:1: ( ( 'Text' ) )
            // InternalUpctforma.g:4367:1: ( 'Text' )
            {
            // InternalUpctforma.g:4367:1: ( 'Text' )
            // InternalUpctforma.g:4368:2: 'Text'
            {
             before(grammarAccess.getTextAccess().getTextKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUpctforma.g:4377:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4381:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalUpctforma.g:4382:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctforma.g:4389:1: rule__Text__Group__1__Impl : ( '{' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4393:1: ( ( '{' ) )
            // InternalUpctforma.g:4394:1: ( '{' )
            {
            // InternalUpctforma.g:4394:1: ( '{' )
            // InternalUpctforma.g:4395:2: '{'
            {
             before(grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:4404:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4408:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalUpctforma.g:4409:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalUpctforma.g:4416:1: rule__Text__Group__2__Impl : ( ( rule__Text__Group_2__0 )? ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4420:1: ( ( ( rule__Text__Group_2__0 )? ) )
            // InternalUpctforma.g:4421:1: ( ( rule__Text__Group_2__0 )? )
            {
            // InternalUpctforma.g:4421:1: ( ( rule__Text__Group_2__0 )? )
            // InternalUpctforma.g:4422:2: ( rule__Text__Group_2__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_2()); 
            // InternalUpctforma.g:4423:2: ( rule__Text__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctforma.g:4423:3: rule__Text__Group_2__0
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
    // InternalUpctforma.g:4431:1: rule__Text__Group__3 : rule__Text__Group__3__Impl ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4435:1: ( rule__Text__Group__3__Impl )
            // InternalUpctforma.g:4436:2: rule__Text__Group__3__Impl
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
    // InternalUpctforma.g:4442:1: rule__Text__Group__3__Impl : ( '}' ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4446:1: ( ( '}' ) )
            // InternalUpctforma.g:4447:1: ( '}' )
            {
            // InternalUpctforma.g:4447:1: ( '}' )
            // InternalUpctforma.g:4448:2: '}'
            {
             before(grammarAccess.getTextAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:4458:1: rule__Text__Group_2__0 : rule__Text__Group_2__0__Impl rule__Text__Group_2__1 ;
    public final void rule__Text__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4462:1: ( rule__Text__Group_2__0__Impl rule__Text__Group_2__1 )
            // InternalUpctforma.g:4463:2: rule__Text__Group_2__0__Impl rule__Text__Group_2__1
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
    // InternalUpctforma.g:4470:1: rule__Text__Group_2__0__Impl : ( 'html' ) ;
    public final void rule__Text__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4474:1: ( ( 'html' ) )
            // InternalUpctforma.g:4475:1: ( 'html' )
            {
            // InternalUpctforma.g:4475:1: ( 'html' )
            // InternalUpctforma.g:4476:2: 'html'
            {
             before(grammarAccess.getTextAccess().getHtmlKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUpctforma.g:4485:1: rule__Text__Group_2__1 : rule__Text__Group_2__1__Impl ;
    public final void rule__Text__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4489:1: ( rule__Text__Group_2__1__Impl )
            // InternalUpctforma.g:4490:2: rule__Text__Group_2__1__Impl
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
    // InternalUpctforma.g:4496:1: rule__Text__Group_2__1__Impl : ( ( rule__Text__HtmlAssignment_2_1 ) ) ;
    public final void rule__Text__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4500:1: ( ( ( rule__Text__HtmlAssignment_2_1 ) ) )
            // InternalUpctforma.g:4501:1: ( ( rule__Text__HtmlAssignment_2_1 ) )
            {
            // InternalUpctforma.g:4501:1: ( ( rule__Text__HtmlAssignment_2_1 ) )
            // InternalUpctforma.g:4502:2: ( rule__Text__HtmlAssignment_2_1 )
            {
             before(grammarAccess.getTextAccess().getHtmlAssignment_2_1()); 
            // InternalUpctforma.g:4503:2: ( rule__Text__HtmlAssignment_2_1 )
            // InternalUpctforma.g:4503:3: rule__Text__HtmlAssignment_2_1
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
    // InternalUpctforma.g:4512:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4516:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalUpctforma.g:4517:2: rule__Number__Group__0__Impl rule__Number__Group__1
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
    // InternalUpctforma.g:4524:1: rule__Number__Group__0__Impl : ( 'Int' ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4528:1: ( ( 'Int' ) )
            // InternalUpctforma.g:4529:1: ( 'Int' )
            {
            // InternalUpctforma.g:4529:1: ( 'Int' )
            // InternalUpctforma.g:4530:2: 'Int'
            {
             before(grammarAccess.getNumberAccess().getIntKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUpctforma.g:4539:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4543:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // InternalUpctforma.g:4544:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalUpctforma.g:4551:1: rule__Number__Group__1__Impl : ( '{' ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4555:1: ( ( '{' ) )
            // InternalUpctforma.g:4556:1: ( '{' )
            {
            // InternalUpctforma.g:4556:1: ( '{' )
            // InternalUpctforma.g:4557:2: '{'
            {
             before(grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:4566:1: rule__Number__Group__2 : rule__Number__Group__2__Impl rule__Number__Group__3 ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4570:1: ( rule__Number__Group__2__Impl rule__Number__Group__3 )
            // InternalUpctforma.g:4571:2: rule__Number__Group__2__Impl rule__Number__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalUpctforma.g:4578:1: rule__Number__Group__2__Impl : ( ( rule__Number__NumAssignment_2 )? ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4582:1: ( ( ( rule__Number__NumAssignment_2 )? ) )
            // InternalUpctforma.g:4583:1: ( ( rule__Number__NumAssignment_2 )? )
            {
            // InternalUpctforma.g:4583:1: ( ( rule__Number__NumAssignment_2 )? )
            // InternalUpctforma.g:4584:2: ( rule__Number__NumAssignment_2 )?
            {
             before(grammarAccess.getNumberAccess().getNumAssignment_2()); 
            // InternalUpctforma.g:4585:2: ( rule__Number__NumAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT||LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctforma.g:4585:3: rule__Number__NumAssignment_2
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
    // InternalUpctforma.g:4593:1: rule__Number__Group__3 : rule__Number__Group__3__Impl ;
    public final void rule__Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4597:1: ( rule__Number__Group__3__Impl )
            // InternalUpctforma.g:4598:2: rule__Number__Group__3__Impl
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
    // InternalUpctforma.g:4604:1: rule__Number__Group__3__Impl : ( '}' ) ;
    public final void rule__Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4608:1: ( ( '}' ) )
            // InternalUpctforma.g:4609:1: ( '}' )
            {
            // InternalUpctforma.g:4609:1: ( '}' )
            // InternalUpctforma.g:4610:2: '}'
            {
             before(grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:4620:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4624:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // InternalUpctforma.g:4625:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
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
    // InternalUpctforma.g:4632:1: rule__Literal__Group__0__Impl : ( 'Literal' ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4636:1: ( ( 'Literal' ) )
            // InternalUpctforma.g:4637:1: ( 'Literal' )
            {
            // InternalUpctforma.g:4637:1: ( 'Literal' )
            // InternalUpctforma.g:4638:2: 'Literal'
            {
             before(grammarAccess.getLiteralAccess().getLiteralKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUpctforma.g:4647:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl rule__Literal__Group__2 ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4651:1: ( rule__Literal__Group__1__Impl rule__Literal__Group__2 )
            // InternalUpctforma.g:4652:2: rule__Literal__Group__1__Impl rule__Literal__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalUpctforma.g:4659:1: rule__Literal__Group__1__Impl : ( '{' ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4663:1: ( ( '{' ) )
            // InternalUpctforma.g:4664:1: ( '{' )
            {
            // InternalUpctforma.g:4664:1: ( '{' )
            // InternalUpctforma.g:4665:2: '{'
            {
             before(grammarAccess.getLiteralAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:4674:1: rule__Literal__Group__2 : rule__Literal__Group__2__Impl rule__Literal__Group__3 ;
    public final void rule__Literal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4678:1: ( rule__Literal__Group__2__Impl rule__Literal__Group__3 )
            // InternalUpctforma.g:4679:2: rule__Literal__Group__2__Impl rule__Literal__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalUpctforma.g:4686:1: rule__Literal__Group__2__Impl : ( ( rule__Literal__LiteralAssignment_2 )? ) ;
    public final void rule__Literal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4690:1: ( ( ( rule__Literal__LiteralAssignment_2 )? ) )
            // InternalUpctforma.g:4691:1: ( ( rule__Literal__LiteralAssignment_2 )? )
            {
            // InternalUpctforma.g:4691:1: ( ( rule__Literal__LiteralAssignment_2 )? )
            // InternalUpctforma.g:4692:2: ( rule__Literal__LiteralAssignment_2 )?
            {
             before(grammarAccess.getLiteralAccess().getLiteralAssignment_2()); 
            // InternalUpctforma.g:4693:2: ( rule__Literal__LiteralAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctforma.g:4693:3: rule__Literal__LiteralAssignment_2
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
    // InternalUpctforma.g:4701:1: rule__Literal__Group__3 : rule__Literal__Group__3__Impl ;
    public final void rule__Literal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4705:1: ( rule__Literal__Group__3__Impl )
            // InternalUpctforma.g:4706:2: rule__Literal__Group__3__Impl
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
    // InternalUpctforma.g:4712:1: rule__Literal__Group__3__Impl : ( '}' ) ;
    public final void rule__Literal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4716:1: ( ( '}' ) )
            // InternalUpctforma.g:4717:1: ( '}' )
            {
            // InternalUpctforma.g:4717:1: ( '}' )
            // InternalUpctforma.g:4718:2: '}'
            {
             before(grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:4728:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4732:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalUpctforma.g:4733:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUpctforma.g:4740:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4744:1: ( ( ( '-' )? ) )
            // InternalUpctforma.g:4745:1: ( ( '-' )? )
            {
            // InternalUpctforma.g:4745:1: ( ( '-' )? )
            // InternalUpctforma.g:4746:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalUpctforma.g:4747:2: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctforma.g:4747:3: '-'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalUpctforma.g:4755:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4759:1: ( rule__EInt__Group__1__Impl )
            // InternalUpctforma.g:4760:2: rule__EInt__Group__1__Impl
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
    // InternalUpctforma.g:4766:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4770:1: ( ( RULE_INT ) )
            // InternalUpctforma.g:4771:1: ( RULE_INT )
            {
            // InternalUpctforma.g:4771:1: ( RULE_INT )
            // InternalUpctforma.g:4772:2: RULE_INT
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
    // InternalUpctforma.g:4782:1: rule__Composite_Impl__Group__0 : rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 ;
    public final void rule__Composite_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4786:1: ( rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1 )
            // InternalUpctforma.g:4787:2: rule__Composite_Impl__Group__0__Impl rule__Composite_Impl__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalUpctforma.g:4794:1: rule__Composite_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Composite_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4798:1: ( ( () ) )
            // InternalUpctforma.g:4799:1: ( () )
            {
            // InternalUpctforma.g:4799:1: ( () )
            // InternalUpctforma.g:4800:2: ()
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeAction_0()); 
            // InternalUpctforma.g:4801:2: ()
            // InternalUpctforma.g:4801:3: 
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
    // InternalUpctforma.g:4809:1: rule__Composite_Impl__Group__1 : rule__Composite_Impl__Group__1__Impl ;
    public final void rule__Composite_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4813:1: ( rule__Composite_Impl__Group__1__Impl )
            // InternalUpctforma.g:4814:2: rule__Composite_Impl__Group__1__Impl
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
    // InternalUpctforma.g:4820:1: rule__Composite_Impl__Group__1__Impl : ( 'Composite' ) ;
    public final void rule__Composite_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4824:1: ( ( 'Composite' ) )
            // InternalUpctforma.g:4825:1: ( 'Composite' )
            {
            // InternalUpctforma.g:4825:1: ( 'Composite' )
            // InternalUpctforma.g:4826:2: 'Composite'
            {
             before(grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUpctforma.g:4836:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4840:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalUpctforma.g:4841:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalUpctforma.g:4848:1: rule__Video__Group__0__Impl : ( () ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4852:1: ( ( () ) )
            // InternalUpctforma.g:4853:1: ( () )
            {
            // InternalUpctforma.g:4853:1: ( () )
            // InternalUpctforma.g:4854:2: ()
            {
             before(grammarAccess.getVideoAccess().getVideoAction_0()); 
            // InternalUpctforma.g:4855:2: ()
            // InternalUpctforma.g:4855:3: 
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
    // InternalUpctforma.g:4863:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4867:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalUpctforma.g:4868:2: rule__Video__Group__1__Impl rule__Video__Group__2
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
    // InternalUpctforma.g:4875:1: rule__Video__Group__1__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4879:1: ( ( 'Video' ) )
            // InternalUpctforma.g:4880:1: ( 'Video' )
            {
            // InternalUpctforma.g:4880:1: ( 'Video' )
            // InternalUpctforma.g:4881:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUpctforma.g:4890:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4894:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalUpctforma.g:4895:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalUpctforma.g:4902:1: rule__Video__Group__2__Impl : ( '{' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4906:1: ( ( '{' ) )
            // InternalUpctforma.g:4907:1: ( '{' )
            {
            // InternalUpctforma.g:4907:1: ( '{' )
            // InternalUpctforma.g:4908:2: '{'
            {
             before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:4917:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4921:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalUpctforma.g:4922:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalUpctforma.g:4929:1: rule__Video__Group__3__Impl : ( ( rule__Video__Group_3__0 )? ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4933:1: ( ( ( rule__Video__Group_3__0 )? ) )
            // InternalUpctforma.g:4934:1: ( ( rule__Video__Group_3__0 )? )
            {
            // InternalUpctforma.g:4934:1: ( ( rule__Video__Group_3__0 )? )
            // InternalUpctforma.g:4935:2: ( rule__Video__Group_3__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_3()); 
            // InternalUpctforma.g:4936:2: ( rule__Video__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctforma.g:4936:3: rule__Video__Group_3__0
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
    // InternalUpctforma.g:4944:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4948:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalUpctforma.g:4949:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalUpctforma.g:4956:1: rule__Video__Group__4__Impl : ( ',' ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4960:1: ( ( ',' ) )
            // InternalUpctforma.g:4961:1: ( ',' )
            {
            // InternalUpctforma.g:4961:1: ( ',' )
            // InternalUpctforma.g:4962:2: ','
            {
             before(grammarAccess.getVideoAccess().getCommaKeyword_4()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:4971:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4975:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalUpctforma.g:4976:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_40);
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
    // InternalUpctforma.g:4983:1: rule__Video__Group__5__Impl : ( ( rule__Video__Group_5__0 )? ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:4987:1: ( ( ( rule__Video__Group_5__0 )? ) )
            // InternalUpctforma.g:4988:1: ( ( rule__Video__Group_5__0 )? )
            {
            // InternalUpctforma.g:4988:1: ( ( rule__Video__Group_5__0 )? )
            // InternalUpctforma.g:4989:2: ( rule__Video__Group_5__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_5()); 
            // InternalUpctforma.g:4990:2: ( rule__Video__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUpctforma.g:4990:3: rule__Video__Group_5__0
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
    // InternalUpctforma.g:4998:1: rule__Video__Group__6 : rule__Video__Group__6__Impl ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5002:1: ( rule__Video__Group__6__Impl )
            // InternalUpctforma.g:5003:2: rule__Video__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalUpctforma.g:5009:1: rule__Video__Group__6__Impl : ( '}' ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5013:1: ( ( '}' ) )
            // InternalUpctforma.g:5014:1: ( '}' )
            {
            // InternalUpctforma.g:5014:1: ( '}' )
            // InternalUpctforma.g:5015:2: '}'
            {
             before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Video__Group_3__0"
    // InternalUpctforma.g:5025:1: rule__Video__Group_3__0 : rule__Video__Group_3__0__Impl rule__Video__Group_3__1 ;
    public final void rule__Video__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5029:1: ( rule__Video__Group_3__0__Impl rule__Video__Group_3__1 )
            // InternalUpctforma.g:5030:2: rule__Video__Group_3__0__Impl rule__Video__Group_3__1
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
    // InternalUpctforma.g:5037:1: rule__Video__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Video__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5041:1: ( ( 'id' ) )
            // InternalUpctforma.g:5042:1: ( 'id' )
            {
            // InternalUpctforma.g:5042:1: ( 'id' )
            // InternalUpctforma.g:5043:2: 'id'
            {
             before(grammarAccess.getVideoAccess().getIdKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUpctforma.g:5052:1: rule__Video__Group_3__1 : rule__Video__Group_3__1__Impl ;
    public final void rule__Video__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5056:1: ( rule__Video__Group_3__1__Impl )
            // InternalUpctforma.g:5057:2: rule__Video__Group_3__1__Impl
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
    // InternalUpctforma.g:5063:1: rule__Video__Group_3__1__Impl : ( ( rule__Video__IdAssignment_3_1 ) ) ;
    public final void rule__Video__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5067:1: ( ( ( rule__Video__IdAssignment_3_1 ) ) )
            // InternalUpctforma.g:5068:1: ( ( rule__Video__IdAssignment_3_1 ) )
            {
            // InternalUpctforma.g:5068:1: ( ( rule__Video__IdAssignment_3_1 ) )
            // InternalUpctforma.g:5069:2: ( rule__Video__IdAssignment_3_1 )
            {
             before(grammarAccess.getVideoAccess().getIdAssignment_3_1()); 
            // InternalUpctforma.g:5070:2: ( rule__Video__IdAssignment_3_1 )
            // InternalUpctforma.g:5070:3: rule__Video__IdAssignment_3_1
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
    // InternalUpctforma.g:5079:1: rule__Video__Group_5__0 : rule__Video__Group_5__0__Impl rule__Video__Group_5__1 ;
    public final void rule__Video__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5083:1: ( rule__Video__Group_5__0__Impl rule__Video__Group_5__1 )
            // InternalUpctforma.g:5084:2: rule__Video__Group_5__0__Impl rule__Video__Group_5__1
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
    // InternalUpctforma.g:5091:1: rule__Video__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Video__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5095:1: ( ( 'title' ) )
            // InternalUpctforma.g:5096:1: ( 'title' )
            {
            // InternalUpctforma.g:5096:1: ( 'title' )
            // InternalUpctforma.g:5097:2: 'title'
            {
             before(grammarAccess.getVideoAccess().getTitleKeyword_5_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUpctforma.g:5106:1: rule__Video__Group_5__1 : rule__Video__Group_5__1__Impl ;
    public final void rule__Video__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5110:1: ( rule__Video__Group_5__1__Impl )
            // InternalUpctforma.g:5111:2: rule__Video__Group_5__1__Impl
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
    // InternalUpctforma.g:5117:1: rule__Video__Group_5__1__Impl : ( ( rule__Video__TitleAssignment_5_1 ) ) ;
    public final void rule__Video__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5121:1: ( ( ( rule__Video__TitleAssignment_5_1 ) ) )
            // InternalUpctforma.g:5122:1: ( ( rule__Video__TitleAssignment_5_1 ) )
            {
            // InternalUpctforma.g:5122:1: ( ( rule__Video__TitleAssignment_5_1 ) )
            // InternalUpctforma.g:5123:2: ( rule__Video__TitleAssignment_5_1 )
            {
             before(grammarAccess.getVideoAccess().getTitleAssignment_5_1()); 
            // InternalUpctforma.g:5124:2: ( rule__Video__TitleAssignment_5_1 )
            // InternalUpctforma.g:5124:3: rule__Video__TitleAssignment_5_1
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


    // $ANTLR start "rule__SimpleElement_Impl__Group__0"
    // InternalUpctforma.g:5133:1: rule__SimpleElement_Impl__Group__0 : rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1 ;
    public final void rule__SimpleElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5137:1: ( rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1 )
            // InternalUpctforma.g:5138:2: rule__SimpleElement_Impl__Group__0__Impl rule__SimpleElement_Impl__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalUpctforma.g:5145:1: rule__SimpleElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__SimpleElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5149:1: ( ( () ) )
            // InternalUpctforma.g:5150:1: ( () )
            {
            // InternalUpctforma.g:5150:1: ( () )
            // InternalUpctforma.g:5151:2: ()
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0()); 
            // InternalUpctforma.g:5152:2: ()
            // InternalUpctforma.g:5152:3: 
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
    // InternalUpctforma.g:5160:1: rule__SimpleElement_Impl__Group__1 : rule__SimpleElement_Impl__Group__1__Impl ;
    public final void rule__SimpleElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5164:1: ( rule__SimpleElement_Impl__Group__1__Impl )
            // InternalUpctforma.g:5165:2: rule__SimpleElement_Impl__Group__1__Impl
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
    // InternalUpctforma.g:5171:1: rule__SimpleElement_Impl__Group__1__Impl : ( 'SimpleElement' ) ;
    public final void rule__SimpleElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5175:1: ( ( 'SimpleElement' ) )
            // InternalUpctforma.g:5176:1: ( 'SimpleElement' )
            {
            // InternalUpctforma.g:5176:1: ( 'SimpleElement' )
            // InternalUpctforma.g:5177:2: 'SimpleElement'
            {
             before(grammarAccess.getSimpleElement_ImplAccess().getSimpleElementKeyword_1()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUpctforma.g:5187:1: rule__PlaceHolder__Group__0 : rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1 ;
    public final void rule__PlaceHolder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5191:1: ( rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1 )
            // InternalUpctforma.g:5192:2: rule__PlaceHolder__Group__0__Impl rule__PlaceHolder__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUpctforma.g:5199:1: rule__PlaceHolder__Group__0__Impl : ( 'Placeholder' ) ;
    public final void rule__PlaceHolder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5203:1: ( ( 'Placeholder' ) )
            // InternalUpctforma.g:5204:1: ( 'Placeholder' )
            {
            // InternalUpctforma.g:5204:1: ( 'Placeholder' )
            // InternalUpctforma.g:5205:2: 'Placeholder'
            {
             before(grammarAccess.getPlaceHolderAccess().getPlaceholderKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUpctforma.g:5214:1: rule__PlaceHolder__Group__1 : rule__PlaceHolder__Group__1__Impl ;
    public final void rule__PlaceHolder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5218:1: ( rule__PlaceHolder__Group__1__Impl )
            // InternalUpctforma.g:5219:2: rule__PlaceHolder__Group__1__Impl
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
    // InternalUpctforma.g:5225:1: rule__PlaceHolder__Group__1__Impl : ( ( rule__PlaceHolder__TypeAssignment_1 ) ) ;
    public final void rule__PlaceHolder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5229:1: ( ( ( rule__PlaceHolder__TypeAssignment_1 ) ) )
            // InternalUpctforma.g:5230:1: ( ( rule__PlaceHolder__TypeAssignment_1 ) )
            {
            // InternalUpctforma.g:5230:1: ( ( rule__PlaceHolder__TypeAssignment_1 ) )
            // InternalUpctforma.g:5231:2: ( rule__PlaceHolder__TypeAssignment_1 )
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeAssignment_1()); 
            // InternalUpctforma.g:5232:2: ( rule__PlaceHolder__TypeAssignment_1 )
            // InternalUpctforma.g:5232:3: rule__PlaceHolder__TypeAssignment_1
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
    // InternalUpctforma.g:5241:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5245:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalUpctforma.g:5246:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalUpctforma.g:5253:1: rule__Game__Group__0__Impl : ( () ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5257:1: ( ( () ) )
            // InternalUpctforma.g:5258:1: ( () )
            {
            // InternalUpctforma.g:5258:1: ( () )
            // InternalUpctforma.g:5259:2: ()
            {
             before(grammarAccess.getGameAccess().getGameAction_0()); 
            // InternalUpctforma.g:5260:2: ()
            // InternalUpctforma.g:5260:3: 
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
    // InternalUpctforma.g:5268:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5272:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalUpctforma.g:5273:2: rule__Game__Group__1__Impl rule__Game__Group__2
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
    // InternalUpctforma.g:5280:1: rule__Game__Group__1__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5284:1: ( ( 'Game' ) )
            // InternalUpctforma.g:5285:1: ( 'Game' )
            {
            // InternalUpctforma.g:5285:1: ( 'Game' )
            // InternalUpctforma.g:5286:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUpctforma.g:5295:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5299:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalUpctforma.g:5300:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalUpctforma.g:5307:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5311:1: ( ( '{' ) )
            // InternalUpctforma.g:5312:1: ( '{' )
            {
            // InternalUpctforma.g:5312:1: ( '{' )
            // InternalUpctforma.g:5313:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:5322:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5326:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalUpctforma.g:5327:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalUpctforma.g:5334:1: rule__Game__Group__3__Impl : ( ( rule__Game__Group_3__0 )? ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5338:1: ( ( ( rule__Game__Group_3__0 )? ) )
            // InternalUpctforma.g:5339:1: ( ( rule__Game__Group_3__0 )? )
            {
            // InternalUpctforma.g:5339:1: ( ( rule__Game__Group_3__0 )? )
            // InternalUpctforma.g:5340:2: ( rule__Game__Group_3__0 )?
            {
             before(grammarAccess.getGameAccess().getGroup_3()); 
            // InternalUpctforma.g:5341:2: ( rule__Game__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUpctforma.g:5341:3: rule__Game__Group_3__0
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
    // InternalUpctforma.g:5349:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5353:1: ( rule__Game__Group__4__Impl )
            // InternalUpctforma.g:5354:2: rule__Game__Group__4__Impl
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
    // InternalUpctforma.g:5360:1: rule__Game__Group__4__Impl : ( '}' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5364:1: ( ( '}' ) )
            // InternalUpctforma.g:5365:1: ( '}' )
            {
            // InternalUpctforma.g:5365:1: ( '}' )
            // InternalUpctforma.g:5366:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:5376:1: rule__Game__Group_3__0 : rule__Game__Group_3__0__Impl rule__Game__Group_3__1 ;
    public final void rule__Game__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5380:1: ( rule__Game__Group_3__0__Impl rule__Game__Group_3__1 )
            // InternalUpctforma.g:5381:2: rule__Game__Group_3__0__Impl rule__Game__Group_3__1
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
    // InternalUpctforma.g:5388:1: rule__Game__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Game__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5392:1: ( ( 'id' ) )
            // InternalUpctforma.g:5393:1: ( 'id' )
            {
            // InternalUpctforma.g:5393:1: ( 'id' )
            // InternalUpctforma.g:5394:2: 'id'
            {
             before(grammarAccess.getGameAccess().getIdKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUpctforma.g:5403:1: rule__Game__Group_3__1 : rule__Game__Group_3__1__Impl ;
    public final void rule__Game__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5407:1: ( rule__Game__Group_3__1__Impl )
            // InternalUpctforma.g:5408:2: rule__Game__Group_3__1__Impl
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
    // InternalUpctforma.g:5414:1: rule__Game__Group_3__1__Impl : ( ( rule__Game__IdAssignment_3_1 ) ) ;
    public final void rule__Game__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5418:1: ( ( ( rule__Game__IdAssignment_3_1 ) ) )
            // InternalUpctforma.g:5419:1: ( ( rule__Game__IdAssignment_3_1 ) )
            {
            // InternalUpctforma.g:5419:1: ( ( rule__Game__IdAssignment_3_1 ) )
            // InternalUpctforma.g:5420:2: ( rule__Game__IdAssignment_3_1 )
            {
             before(grammarAccess.getGameAccess().getIdAssignment_3_1()); 
            // InternalUpctforma.g:5421:2: ( rule__Game__IdAssignment_3_1 )
            // InternalUpctforma.g:5421:3: rule__Game__IdAssignment_3_1
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
    // InternalUpctforma.g:5430:1: rule__FieldValue__Group__0 : rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 ;
    public final void rule__FieldValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5434:1: ( rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 )
            // InternalUpctforma.g:5435:2: rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctforma.g:5442:1: rule__FieldValue__Group__0__Impl : ( ( rule__FieldValue__NameAssignment_0 ) ) ;
    public final void rule__FieldValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5446:1: ( ( ( rule__FieldValue__NameAssignment_0 ) ) )
            // InternalUpctforma.g:5447:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:5447:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            // InternalUpctforma.g:5448:2: ( rule__FieldValue__NameAssignment_0 )
            {
             before(grammarAccess.getFieldValueAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:5449:2: ( rule__FieldValue__NameAssignment_0 )
            // InternalUpctforma.g:5449:3: rule__FieldValue__NameAssignment_0
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
    // InternalUpctforma.g:5457:1: rule__FieldValue__Group__1 : rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 ;
    public final void rule__FieldValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5461:1: ( rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 )
            // InternalUpctforma.g:5462:2: rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:5469:1: rule__FieldValue__Group__1__Impl : ( ':' ) ;
    public final void rule__FieldValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5473:1: ( ( ':' ) )
            // InternalUpctforma.g:5474:1: ( ':' )
            {
            // InternalUpctforma.g:5474:1: ( ':' )
            // InternalUpctforma.g:5475:2: ':'
            {
             before(grammarAccess.getFieldValueAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUpctforma.g:5484:1: rule__FieldValue__Group__2 : rule__FieldValue__Group__2__Impl ;
    public final void rule__FieldValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5488:1: ( rule__FieldValue__Group__2__Impl )
            // InternalUpctforma.g:5489:2: rule__FieldValue__Group__2__Impl
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
    // InternalUpctforma.g:5495:1: rule__FieldValue__Group__2__Impl : ( ( rule__FieldValue__FieldvalueAssignment_2 ) ) ;
    public final void rule__FieldValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5499:1: ( ( ( rule__FieldValue__FieldvalueAssignment_2 ) ) )
            // InternalUpctforma.g:5500:1: ( ( rule__FieldValue__FieldvalueAssignment_2 ) )
            {
            // InternalUpctforma.g:5500:1: ( ( rule__FieldValue__FieldvalueAssignment_2 ) )
            // InternalUpctforma.g:5501:2: ( rule__FieldValue__FieldvalueAssignment_2 )
            {
             before(grammarAccess.getFieldValueAccess().getFieldvalueAssignment_2()); 
            // InternalUpctforma.g:5502:2: ( rule__FieldValue__FieldvalueAssignment_2 )
            // InternalUpctforma.g:5502:3: rule__FieldValue__FieldvalueAssignment_2
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
    // InternalUpctforma.g:5511:1: rule__RecordValue__Group__0 : rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1 ;
    public final void rule__RecordValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5515:1: ( rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1 )
            // InternalUpctforma.g:5516:2: rule__RecordValue__Group__0__Impl rule__RecordValue__Group__1
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
    // InternalUpctforma.g:5523:1: rule__RecordValue__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5527:1: ( ( '{' ) )
            // InternalUpctforma.g:5528:1: ( '{' )
            {
            // InternalUpctforma.g:5528:1: ( '{' )
            // InternalUpctforma.g:5529:2: '{'
            {
             before(grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:5538:1: rule__RecordValue__Group__1 : rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2 ;
    public final void rule__RecordValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5542:1: ( rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2 )
            // InternalUpctforma.g:5543:2: rule__RecordValue__Group__1__Impl rule__RecordValue__Group__2
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
    // InternalUpctforma.g:5550:1: rule__RecordValue__Group__1__Impl : ( ( rule__RecordValue__RecordvaluesAssignment_1 ) ) ;
    public final void rule__RecordValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5554:1: ( ( ( rule__RecordValue__RecordvaluesAssignment_1 ) ) )
            // InternalUpctforma.g:5555:1: ( ( rule__RecordValue__RecordvaluesAssignment_1 ) )
            {
            // InternalUpctforma.g:5555:1: ( ( rule__RecordValue__RecordvaluesAssignment_1 ) )
            // InternalUpctforma.g:5556:2: ( rule__RecordValue__RecordvaluesAssignment_1 )
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_1()); 
            // InternalUpctforma.g:5557:2: ( rule__RecordValue__RecordvaluesAssignment_1 )
            // InternalUpctforma.g:5557:3: rule__RecordValue__RecordvaluesAssignment_1
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
    // InternalUpctforma.g:5565:1: rule__RecordValue__Group__2 : rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3 ;
    public final void rule__RecordValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5569:1: ( rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3 )
            // InternalUpctforma.g:5570:2: rule__RecordValue__Group__2__Impl rule__RecordValue__Group__3
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
    // InternalUpctforma.g:5577:1: rule__RecordValue__Group__2__Impl : ( ( rule__RecordValue__Group_2__0 )* ) ;
    public final void rule__RecordValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5581:1: ( ( ( rule__RecordValue__Group_2__0 )* ) )
            // InternalUpctforma.g:5582:1: ( ( rule__RecordValue__Group_2__0 )* )
            {
            // InternalUpctforma.g:5582:1: ( ( rule__RecordValue__Group_2__0 )* )
            // InternalUpctforma.g:5583:2: ( rule__RecordValue__Group_2__0 )*
            {
             before(grammarAccess.getRecordValueAccess().getGroup_2()); 
            // InternalUpctforma.g:5584:2: ( rule__RecordValue__Group_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==22) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUpctforma.g:5584:3: rule__RecordValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RecordValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalUpctforma.g:5592:1: rule__RecordValue__Group__3 : rule__RecordValue__Group__3__Impl ;
    public final void rule__RecordValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5596:1: ( rule__RecordValue__Group__3__Impl )
            // InternalUpctforma.g:5597:2: rule__RecordValue__Group__3__Impl
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
    // InternalUpctforma.g:5603:1: rule__RecordValue__Group__3__Impl : ( '}' ) ;
    public final void rule__RecordValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5607:1: ( ( '}' ) )
            // InternalUpctforma.g:5608:1: ( '}' )
            {
            // InternalUpctforma.g:5608:1: ( '}' )
            // InternalUpctforma.g:5609:2: '}'
            {
             before(grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:5619:1: rule__RecordValue__Group_2__0 : rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1 ;
    public final void rule__RecordValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5623:1: ( rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1 )
            // InternalUpctforma.g:5624:2: rule__RecordValue__Group_2__0__Impl rule__RecordValue__Group_2__1
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
    // InternalUpctforma.g:5631:1: rule__RecordValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__RecordValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5635:1: ( ( ',' ) )
            // InternalUpctforma.g:5636:1: ( ',' )
            {
            // InternalUpctforma.g:5636:1: ( ',' )
            // InternalUpctforma.g:5637:2: ','
            {
             before(grammarAccess.getRecordValueAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:5646:1: rule__RecordValue__Group_2__1 : rule__RecordValue__Group_2__1__Impl ;
    public final void rule__RecordValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5650:1: ( rule__RecordValue__Group_2__1__Impl )
            // InternalUpctforma.g:5651:2: rule__RecordValue__Group_2__1__Impl
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
    // InternalUpctforma.g:5657:1: rule__RecordValue__Group_2__1__Impl : ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) ) ;
    public final void rule__RecordValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5661:1: ( ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) ) )
            // InternalUpctforma.g:5662:1: ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) )
            {
            // InternalUpctforma.g:5662:1: ( ( rule__RecordValue__RecordvaluesAssignment_2_1 ) )
            // InternalUpctforma.g:5663:2: ( rule__RecordValue__RecordvaluesAssignment_2_1 )
            {
             before(grammarAccess.getRecordValueAccess().getRecordvaluesAssignment_2_1()); 
            // InternalUpctforma.g:5664:2: ( rule__RecordValue__RecordvaluesAssignment_2_1 )
            // InternalUpctforma.g:5664:3: rule__RecordValue__RecordvaluesAssignment_2_1
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
    // InternalUpctforma.g:5673:1: rule__ListValue__Group__0 : rule__ListValue__Group__0__Impl rule__ListValue__Group__1 ;
    public final void rule__ListValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5677:1: ( rule__ListValue__Group__0__Impl rule__ListValue__Group__1 )
            // InternalUpctforma.g:5678:2: rule__ListValue__Group__0__Impl rule__ListValue__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:5685:1: rule__ListValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ListValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5689:1: ( ( '[' ) )
            // InternalUpctforma.g:5690:1: ( '[' )
            {
            // InternalUpctforma.g:5690:1: ( '[' )
            // InternalUpctforma.g:5691:2: '['
            {
             before(grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUpctforma.g:5700:1: rule__ListValue__Group__1 : rule__ListValue__Group__1__Impl rule__ListValue__Group__2 ;
    public final void rule__ListValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5704:1: ( rule__ListValue__Group__1__Impl rule__ListValue__Group__2 )
            // InternalUpctforma.g:5705:2: rule__ListValue__Group__1__Impl rule__ListValue__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalUpctforma.g:5712:1: rule__ListValue__Group__1__Impl : ( ( rule__ListValue__ListvaluesAssignment_1 ) ) ;
    public final void rule__ListValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5716:1: ( ( ( rule__ListValue__ListvaluesAssignment_1 ) ) )
            // InternalUpctforma.g:5717:1: ( ( rule__ListValue__ListvaluesAssignment_1 ) )
            {
            // InternalUpctforma.g:5717:1: ( ( rule__ListValue__ListvaluesAssignment_1 ) )
            // InternalUpctforma.g:5718:2: ( rule__ListValue__ListvaluesAssignment_1 )
            {
             before(grammarAccess.getListValueAccess().getListvaluesAssignment_1()); 
            // InternalUpctforma.g:5719:2: ( rule__ListValue__ListvaluesAssignment_1 )
            // InternalUpctforma.g:5719:3: rule__ListValue__ListvaluesAssignment_1
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
    // InternalUpctforma.g:5727:1: rule__ListValue__Group__2 : rule__ListValue__Group__2__Impl rule__ListValue__Group__3 ;
    public final void rule__ListValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5731:1: ( rule__ListValue__Group__2__Impl rule__ListValue__Group__3 )
            // InternalUpctforma.g:5732:2: rule__ListValue__Group__2__Impl rule__ListValue__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalUpctforma.g:5739:1: rule__ListValue__Group__2__Impl : ( ( rule__ListValue__Group_2__0 )* ) ;
    public final void rule__ListValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5743:1: ( ( ( rule__ListValue__Group_2__0 )* ) )
            // InternalUpctforma.g:5744:1: ( ( rule__ListValue__Group_2__0 )* )
            {
            // InternalUpctforma.g:5744:1: ( ( rule__ListValue__Group_2__0 )* )
            // InternalUpctforma.g:5745:2: ( rule__ListValue__Group_2__0 )*
            {
             before(grammarAccess.getListValueAccess().getGroup_2()); 
            // InternalUpctforma.g:5746:2: ( rule__ListValue__Group_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==22) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUpctforma.g:5746:3: rule__ListValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ListValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalUpctforma.g:5754:1: rule__ListValue__Group__3 : rule__ListValue__Group__3__Impl ;
    public final void rule__ListValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5758:1: ( rule__ListValue__Group__3__Impl )
            // InternalUpctforma.g:5759:2: rule__ListValue__Group__3__Impl
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
    // InternalUpctforma.g:5765:1: rule__ListValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ListValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5769:1: ( ( ']' ) )
            // InternalUpctforma.g:5770:1: ( ']' )
            {
            // InternalUpctforma.g:5770:1: ( ']' )
            // InternalUpctforma.g:5771:2: ']'
            {
             before(grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUpctforma.g:5781:1: rule__ListValue__Group_2__0 : rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 ;
    public final void rule__ListValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5785:1: ( rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1 )
            // InternalUpctforma.g:5786:2: rule__ListValue__Group_2__0__Impl rule__ListValue__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUpctforma.g:5793:1: rule__ListValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ListValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5797:1: ( ( ',' ) )
            // InternalUpctforma.g:5798:1: ( ',' )
            {
            // InternalUpctforma.g:5798:1: ( ',' )
            // InternalUpctforma.g:5799:2: ','
            {
             before(grammarAccess.getListValueAccess().getCommaKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:5808:1: rule__ListValue__Group_2__1 : rule__ListValue__Group_2__1__Impl ;
    public final void rule__ListValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5812:1: ( rule__ListValue__Group_2__1__Impl )
            // InternalUpctforma.g:5813:2: rule__ListValue__Group_2__1__Impl
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
    // InternalUpctforma.g:5819:1: rule__ListValue__Group_2__1__Impl : ( ( rule__ListValue__ListvaluesAssignment_2_1 ) ) ;
    public final void rule__ListValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5823:1: ( ( ( rule__ListValue__ListvaluesAssignment_2_1 ) ) )
            // InternalUpctforma.g:5824:1: ( ( rule__ListValue__ListvaluesAssignment_2_1 ) )
            {
            // InternalUpctforma.g:5824:1: ( ( rule__ListValue__ListvaluesAssignment_2_1 ) )
            // InternalUpctforma.g:5825:2: ( rule__ListValue__ListvaluesAssignment_2_1 )
            {
             before(grammarAccess.getListValueAccess().getListvaluesAssignment_2_1()); 
            // InternalUpctforma.g:5826:2: ( rule__ListValue__ListvaluesAssignment_2_1 )
            // InternalUpctforma.g:5826:3: rule__ListValue__ListvaluesAssignment_2_1
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
    // InternalUpctforma.g:5835:1: rule__WidgetType__Group__0 : rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 ;
    public final void rule__WidgetType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5839:1: ( rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1 )
            // InternalUpctforma.g:5840:2: rule__WidgetType__Group__0__Impl rule__WidgetType__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalUpctforma.g:5847:1: rule__WidgetType__Group__0__Impl : ( () ) ;
    public final void rule__WidgetType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5851:1: ( ( () ) )
            // InternalUpctforma.g:5852:1: ( () )
            {
            // InternalUpctforma.g:5852:1: ( () )
            // InternalUpctforma.g:5853:2: ()
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0()); 
            // InternalUpctforma.g:5854:2: ()
            // InternalUpctforma.g:5854:3: 
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
    // InternalUpctforma.g:5862:1: rule__WidgetType__Group__1 : rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 ;
    public final void rule__WidgetType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5866:1: ( rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2 )
            // InternalUpctforma.g:5867:2: rule__WidgetType__Group__1__Impl rule__WidgetType__Group__2
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
    // InternalUpctforma.g:5874:1: rule__WidgetType__Group__1__Impl : ( 'widget' ) ;
    public final void rule__WidgetType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5878:1: ( ( 'widget' ) )
            // InternalUpctforma.g:5879:1: ( 'widget' )
            {
            // InternalUpctforma.g:5879:1: ( 'widget' )
            // InternalUpctforma.g:5880:2: 'widget'
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUpctforma.g:5889:1: rule__WidgetType__Group__2 : rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 ;
    public final void rule__WidgetType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5893:1: ( rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3 )
            // InternalUpctforma.g:5894:2: rule__WidgetType__Group__2__Impl rule__WidgetType__Group__3
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
    // InternalUpctforma.g:5901:1: rule__WidgetType__Group__2__Impl : ( ( rule__WidgetType__NameAssignment_2 ) ) ;
    public final void rule__WidgetType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5905:1: ( ( ( rule__WidgetType__NameAssignment_2 ) ) )
            // InternalUpctforma.g:5906:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:5906:1: ( ( rule__WidgetType__NameAssignment_2 ) )
            // InternalUpctforma.g:5907:2: ( rule__WidgetType__NameAssignment_2 )
            {
             before(grammarAccess.getWidgetTypeAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:5908:2: ( rule__WidgetType__NameAssignment_2 )
            // InternalUpctforma.g:5908:3: rule__WidgetType__NameAssignment_2
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
    // InternalUpctforma.g:5916:1: rule__WidgetType__Group__3 : rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 ;
    public final void rule__WidgetType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5920:1: ( rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4 )
            // InternalUpctforma.g:5921:2: rule__WidgetType__Group__3__Impl rule__WidgetType__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalUpctforma.g:5928:1: rule__WidgetType__Group__3__Impl : ( '{' ) ;
    public final void rule__WidgetType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5932:1: ( ( '{' ) )
            // InternalUpctforma.g:5933:1: ( '{' )
            {
            // InternalUpctforma.g:5933:1: ( '{' )
            // InternalUpctforma.g:5934:2: '{'
            {
             before(grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:5943:1: rule__WidgetType__Group__4 : rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 ;
    public final void rule__WidgetType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5947:1: ( rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5 )
            // InternalUpctforma.g:5948:2: rule__WidgetType__Group__4__Impl rule__WidgetType__Group__5
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
    // InternalUpctforma.g:5955:1: rule__WidgetType__Group__4__Impl : ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) ) ;
    public final void rule__WidgetType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5959:1: ( ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) ) )
            // InternalUpctforma.g:5960:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) )
            {
            // InternalUpctforma.g:5960:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_4 ) )
            // InternalUpctforma.g:5961:2: ( rule__WidgetType__WidgettypeelementsAssignment_4 )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_4()); 
            // InternalUpctforma.g:5962:2: ( rule__WidgetType__WidgettypeelementsAssignment_4 )
            // InternalUpctforma.g:5962:3: rule__WidgetType__WidgettypeelementsAssignment_4
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
    // InternalUpctforma.g:5970:1: rule__WidgetType__Group__5 : rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6 ;
    public final void rule__WidgetType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5974:1: ( rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6 )
            // InternalUpctforma.g:5975:2: rule__WidgetType__Group__5__Impl rule__WidgetType__Group__6
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
    // InternalUpctforma.g:5982:1: rule__WidgetType__Group__5__Impl : ( ( rule__WidgetType__Group_5__0 )* ) ;
    public final void rule__WidgetType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:5986:1: ( ( ( rule__WidgetType__Group_5__0 )* ) )
            // InternalUpctforma.g:5987:1: ( ( rule__WidgetType__Group_5__0 )* )
            {
            // InternalUpctforma.g:5987:1: ( ( rule__WidgetType__Group_5__0 )* )
            // InternalUpctforma.g:5988:2: ( rule__WidgetType__Group_5__0 )*
            {
             before(grammarAccess.getWidgetTypeAccess().getGroup_5()); 
            // InternalUpctforma.g:5989:2: ( rule__WidgetType__Group_5__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==22) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUpctforma.g:5989:3: rule__WidgetType__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__WidgetType__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalUpctforma.g:5997:1: rule__WidgetType__Group__6 : rule__WidgetType__Group__6__Impl ;
    public final void rule__WidgetType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6001:1: ( rule__WidgetType__Group__6__Impl )
            // InternalUpctforma.g:6002:2: rule__WidgetType__Group__6__Impl
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
    // InternalUpctforma.g:6008:1: rule__WidgetType__Group__6__Impl : ( '}' ) ;
    public final void rule__WidgetType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6012:1: ( ( '}' ) )
            // InternalUpctforma.g:6013:1: ( '}' )
            {
            // InternalUpctforma.g:6013:1: ( '}' )
            // InternalUpctforma.g:6014:2: '}'
            {
             before(grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:6024:1: rule__WidgetType__Group_5__0 : rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1 ;
    public final void rule__WidgetType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6028:1: ( rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1 )
            // InternalUpctforma.g:6029:2: rule__WidgetType__Group_5__0__Impl rule__WidgetType__Group_5__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUpctforma.g:6036:1: rule__WidgetType__Group_5__0__Impl : ( ',' ) ;
    public final void rule__WidgetType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6040:1: ( ( ',' ) )
            // InternalUpctforma.g:6041:1: ( ',' )
            {
            // InternalUpctforma.g:6041:1: ( ',' )
            // InternalUpctforma.g:6042:2: ','
            {
             before(grammarAccess.getWidgetTypeAccess().getCommaKeyword_5_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:6051:1: rule__WidgetType__Group_5__1 : rule__WidgetType__Group_5__1__Impl ;
    public final void rule__WidgetType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6055:1: ( rule__WidgetType__Group_5__1__Impl )
            // InternalUpctforma.g:6056:2: rule__WidgetType__Group_5__1__Impl
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
    // InternalUpctforma.g:6062:1: rule__WidgetType__Group_5__1__Impl : ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) ) ;
    public final void rule__WidgetType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6066:1: ( ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) ) )
            // InternalUpctforma.g:6067:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) )
            {
            // InternalUpctforma.g:6067:1: ( ( rule__WidgetType__WidgettypeelementsAssignment_5_1 ) )
            // InternalUpctforma.g:6068:2: ( rule__WidgetType__WidgettypeelementsAssignment_5_1 )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsAssignment_5_1()); 
            // InternalUpctforma.g:6069:2: ( rule__WidgetType__WidgettypeelementsAssignment_5_1 )
            // InternalUpctforma.g:6069:3: rule__WidgetType__WidgettypeelementsAssignment_5_1
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
    // InternalUpctforma.g:6078:1: rule__CompositeType_Impl__Group__0 : rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1 ;
    public final void rule__CompositeType_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6082:1: ( rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1 )
            // InternalUpctforma.g:6083:2: rule__CompositeType_Impl__Group__0__Impl rule__CompositeType_Impl__Group__1
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
    // InternalUpctforma.g:6090:1: rule__CompositeType_Impl__Group__0__Impl : ( () ) ;
    public final void rule__CompositeType_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6094:1: ( ( () ) )
            // InternalUpctforma.g:6095:1: ( () )
            {
            // InternalUpctforma.g:6095:1: ( () )
            // InternalUpctforma.g:6096:2: ()
            {
             before(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeAction_0()); 
            // InternalUpctforma.g:6097:2: ()
            // InternalUpctforma.g:6097:3: 
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
    // InternalUpctforma.g:6105:1: rule__CompositeType_Impl__Group__1 : rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2 ;
    public final void rule__CompositeType_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6109:1: ( rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2 )
            // InternalUpctforma.g:6110:2: rule__CompositeType_Impl__Group__1__Impl rule__CompositeType_Impl__Group__2
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
    // InternalUpctforma.g:6117:1: rule__CompositeType_Impl__Group__1__Impl : ( 'CompositeType' ) ;
    public final void rule__CompositeType_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6121:1: ( ( 'CompositeType' ) )
            // InternalUpctforma.g:6122:1: ( 'CompositeType' )
            {
            // InternalUpctforma.g:6122:1: ( 'CompositeType' )
            // InternalUpctforma.g:6123:2: 'CompositeType'
            {
             before(grammarAccess.getCompositeType_ImplAccess().getCompositeTypeKeyword_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUpctforma.g:6132:1: rule__CompositeType_Impl__Group__2 : rule__CompositeType_Impl__Group__2__Impl ;
    public final void rule__CompositeType_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6136:1: ( rule__CompositeType_Impl__Group__2__Impl )
            // InternalUpctforma.g:6137:2: rule__CompositeType_Impl__Group__2__Impl
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
    // InternalUpctforma.g:6143:1: rule__CompositeType_Impl__Group__2__Impl : ( ( rule__CompositeType_Impl__NameAssignment_2 ) ) ;
    public final void rule__CompositeType_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6147:1: ( ( ( rule__CompositeType_Impl__NameAssignment_2 ) ) )
            // InternalUpctforma.g:6148:1: ( ( rule__CompositeType_Impl__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:6148:1: ( ( rule__CompositeType_Impl__NameAssignment_2 ) )
            // InternalUpctforma.g:6149:2: ( rule__CompositeType_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeType_ImplAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:6150:2: ( rule__CompositeType_Impl__NameAssignment_2 )
            // InternalUpctforma.g:6150:3: rule__CompositeType_Impl__NameAssignment_2
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
    // InternalUpctforma.g:6159:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6163:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalUpctforma.g:6164:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalUpctforma.g:6171:1: rule__Section__Group__0__Impl : ( () ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6175:1: ( ( () ) )
            // InternalUpctforma.g:6176:1: ( () )
            {
            // InternalUpctforma.g:6176:1: ( () )
            // InternalUpctforma.g:6177:2: ()
            {
             before(grammarAccess.getSectionAccess().getSectionAction_0()); 
            // InternalUpctforma.g:6178:2: ()
            // InternalUpctforma.g:6178:3: 
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
    // InternalUpctforma.g:6186:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6190:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalUpctforma.g:6191:2: rule__Section__Group__1__Impl rule__Section__Group__2
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
    // InternalUpctforma.g:6198:1: rule__Section__Group__1__Impl : ( 'Section' ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6202:1: ( ( 'Section' ) )
            // InternalUpctforma.g:6203:1: ( 'Section' )
            {
            // InternalUpctforma.g:6203:1: ( 'Section' )
            // InternalUpctforma.g:6204:2: 'Section'
            {
             before(grammarAccess.getSectionAccess().getSectionKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUpctforma.g:6213:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6217:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalUpctforma.g:6218:2: rule__Section__Group__2__Impl rule__Section__Group__3
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
    // InternalUpctforma.g:6225:1: rule__Section__Group__2__Impl : ( ( rule__Section__NameAssignment_2 ) ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6229:1: ( ( ( rule__Section__NameAssignment_2 ) ) )
            // InternalUpctforma.g:6230:1: ( ( rule__Section__NameAssignment_2 ) )
            {
            // InternalUpctforma.g:6230:1: ( ( rule__Section__NameAssignment_2 ) )
            // InternalUpctforma.g:6231:2: ( rule__Section__NameAssignment_2 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_2()); 
            // InternalUpctforma.g:6232:2: ( rule__Section__NameAssignment_2 )
            // InternalUpctforma.g:6232:3: rule__Section__NameAssignment_2
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
    // InternalUpctforma.g:6240:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6244:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalUpctforma.g:6245:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalUpctforma.g:6252:1: rule__Section__Group__3__Impl : ( '{' ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6256:1: ( ( '{' ) )
            // InternalUpctforma.g:6257:1: ( '{' )
            {
            // InternalUpctforma.g:6257:1: ( '{' )
            // InternalUpctforma.g:6258:2: '{'
            {
             before(grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:6267:1: rule__Section__Group__4 : rule__Section__Group__4__Impl rule__Section__Group__5 ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6271:1: ( rule__Section__Group__4__Impl rule__Section__Group__5 )
            // InternalUpctforma.g:6272:2: rule__Section__Group__4__Impl rule__Section__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalUpctforma.g:6279:1: rule__Section__Group__4__Impl : ( ( rule__Section__Group_4__0 )? ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6283:1: ( ( ( rule__Section__Group_4__0 )? ) )
            // InternalUpctforma.g:6284:1: ( ( rule__Section__Group_4__0 )? )
            {
            // InternalUpctforma.g:6284:1: ( ( rule__Section__Group_4__0 )? )
            // InternalUpctforma.g:6285:2: ( rule__Section__Group_4__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_4()); 
            // InternalUpctforma.g:6286:2: ( rule__Section__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctforma.g:6286:3: rule__Section__Group_4__0
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
    // InternalUpctforma.g:6294:1: rule__Section__Group__5 : rule__Section__Group__5__Impl rule__Section__Group__6 ;
    public final void rule__Section__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6298:1: ( rule__Section__Group__5__Impl rule__Section__Group__6 )
            // InternalUpctforma.g:6299:2: rule__Section__Group__5__Impl rule__Section__Group__6
            {
            pushFollow(FOLLOW_47);
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
    // InternalUpctforma.g:6306:1: rule__Section__Group__5__Impl : ( ( rule__Section__Group_5__0 )? ) ;
    public final void rule__Section__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6310:1: ( ( ( rule__Section__Group_5__0 )? ) )
            // InternalUpctforma.g:6311:1: ( ( rule__Section__Group_5__0 )? )
            {
            // InternalUpctforma.g:6311:1: ( ( rule__Section__Group_5__0 )? )
            // InternalUpctforma.g:6312:2: ( rule__Section__Group_5__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_5()); 
            // InternalUpctforma.g:6313:2: ( rule__Section__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUpctforma.g:6313:3: rule__Section__Group_5__0
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
    // InternalUpctforma.g:6321:1: rule__Section__Group__6 : rule__Section__Group__6__Impl rule__Section__Group__7 ;
    public final void rule__Section__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6325:1: ( rule__Section__Group__6__Impl rule__Section__Group__7 )
            // InternalUpctforma.g:6326:2: rule__Section__Group__6__Impl rule__Section__Group__7
            {
            pushFollow(FOLLOW_47);
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
    // InternalUpctforma.g:6333:1: rule__Section__Group__6__Impl : ( ( rule__Section__Group_6__0 )? ) ;
    public final void rule__Section__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6337:1: ( ( ( rule__Section__Group_6__0 )? ) )
            // InternalUpctforma.g:6338:1: ( ( rule__Section__Group_6__0 )? )
            {
            // InternalUpctforma.g:6338:1: ( ( rule__Section__Group_6__0 )? )
            // InternalUpctforma.g:6339:2: ( rule__Section__Group_6__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_6()); 
            // InternalUpctforma.g:6340:2: ( rule__Section__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==58) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctforma.g:6340:3: rule__Section__Group_6__0
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
    // InternalUpctforma.g:6348:1: rule__Section__Group__7 : rule__Section__Group__7__Impl rule__Section__Group__8 ;
    public final void rule__Section__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6352:1: ( rule__Section__Group__7__Impl rule__Section__Group__8 )
            // InternalUpctforma.g:6353:2: rule__Section__Group__7__Impl rule__Section__Group__8
            {
            pushFollow(FOLLOW_47);
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
    // InternalUpctforma.g:6360:1: rule__Section__Group__7__Impl : ( ( rule__Section__Group_7__0 )? ) ;
    public final void rule__Section__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6364:1: ( ( ( rule__Section__Group_7__0 )? ) )
            // InternalUpctforma.g:6365:1: ( ( rule__Section__Group_7__0 )? )
            {
            // InternalUpctforma.g:6365:1: ( ( rule__Section__Group_7__0 )? )
            // InternalUpctforma.g:6366:2: ( rule__Section__Group_7__0 )?
            {
             before(grammarAccess.getSectionAccess().getGroup_7()); 
            // InternalUpctforma.g:6367:2: ( rule__Section__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctforma.g:6367:3: rule__Section__Group_7__0
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
    // InternalUpctforma.g:6375:1: rule__Section__Group__8 : rule__Section__Group__8__Impl ;
    public final void rule__Section__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6379:1: ( rule__Section__Group__8__Impl )
            // InternalUpctforma.g:6380:2: rule__Section__Group__8__Impl
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
    // InternalUpctforma.g:6386:1: rule__Section__Group__8__Impl : ( '}' ) ;
    public final void rule__Section__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6390:1: ( ( '}' ) )
            // InternalUpctforma.g:6391:1: ( '}' )
            {
            // InternalUpctforma.g:6391:1: ( '}' )
            // InternalUpctforma.g:6392:2: '}'
            {
             before(grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:6402:1: rule__Section__Group_4__0 : rule__Section__Group_4__0__Impl rule__Section__Group_4__1 ;
    public final void rule__Section__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6406:1: ( rule__Section__Group_4__0__Impl rule__Section__Group_4__1 )
            // InternalUpctforma.g:6407:2: rule__Section__Group_4__0__Impl rule__Section__Group_4__1
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
    // InternalUpctforma.g:6414:1: rule__Section__Group_4__0__Impl : ( 'image' ) ;
    public final void rule__Section__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6418:1: ( ( 'image' ) )
            // InternalUpctforma.g:6419:1: ( 'image' )
            {
            // InternalUpctforma.g:6419:1: ( 'image' )
            // InternalUpctforma.g:6420:2: 'image'
            {
             before(grammarAccess.getSectionAccess().getImageKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUpctforma.g:6429:1: rule__Section__Group_4__1 : rule__Section__Group_4__1__Impl ;
    public final void rule__Section__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6433:1: ( rule__Section__Group_4__1__Impl )
            // InternalUpctforma.g:6434:2: rule__Section__Group_4__1__Impl
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
    // InternalUpctforma.g:6440:1: rule__Section__Group_4__1__Impl : ( ( rule__Section__ImageAssignment_4_1 ) ) ;
    public final void rule__Section__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6444:1: ( ( ( rule__Section__ImageAssignment_4_1 ) ) )
            // InternalUpctforma.g:6445:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            {
            // InternalUpctforma.g:6445:1: ( ( rule__Section__ImageAssignment_4_1 ) )
            // InternalUpctforma.g:6446:2: ( rule__Section__ImageAssignment_4_1 )
            {
             before(grammarAccess.getSectionAccess().getImageAssignment_4_1()); 
            // InternalUpctforma.g:6447:2: ( rule__Section__ImageAssignment_4_1 )
            // InternalUpctforma.g:6447:3: rule__Section__ImageAssignment_4_1
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
    // InternalUpctforma.g:6456:1: rule__Section__Group_5__0 : rule__Section__Group_5__0__Impl rule__Section__Group_5__1 ;
    public final void rule__Section__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6460:1: ( rule__Section__Group_5__0__Impl rule__Section__Group_5__1 )
            // InternalUpctforma.g:6461:2: rule__Section__Group_5__0__Impl rule__Section__Group_5__1
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
    // InternalUpctforma.g:6468:1: rule__Section__Group_5__0__Impl : ( 'title' ) ;
    public final void rule__Section__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6472:1: ( ( 'title' ) )
            // InternalUpctforma.g:6473:1: ( 'title' )
            {
            // InternalUpctforma.g:6473:1: ( 'title' )
            // InternalUpctforma.g:6474:2: 'title'
            {
             before(grammarAccess.getSectionAccess().getTitleKeyword_5_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUpctforma.g:6483:1: rule__Section__Group_5__1 : rule__Section__Group_5__1__Impl ;
    public final void rule__Section__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6487:1: ( rule__Section__Group_5__1__Impl )
            // InternalUpctforma.g:6488:2: rule__Section__Group_5__1__Impl
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
    // InternalUpctforma.g:6494:1: rule__Section__Group_5__1__Impl : ( ( rule__Section__TitleAssignment_5_1 ) ) ;
    public final void rule__Section__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6498:1: ( ( ( rule__Section__TitleAssignment_5_1 ) ) )
            // InternalUpctforma.g:6499:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            {
            // InternalUpctforma.g:6499:1: ( ( rule__Section__TitleAssignment_5_1 ) )
            // InternalUpctforma.g:6500:2: ( rule__Section__TitleAssignment_5_1 )
            {
             before(grammarAccess.getSectionAccess().getTitleAssignment_5_1()); 
            // InternalUpctforma.g:6501:2: ( rule__Section__TitleAssignment_5_1 )
            // InternalUpctforma.g:6501:3: rule__Section__TitleAssignment_5_1
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
    // InternalUpctforma.g:6510:1: rule__Section__Group_6__0 : rule__Section__Group_6__0__Impl rule__Section__Group_6__1 ;
    public final void rule__Section__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6514:1: ( rule__Section__Group_6__0__Impl rule__Section__Group_6__1 )
            // InternalUpctforma.g:6515:2: rule__Section__Group_6__0__Impl rule__Section__Group_6__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalUpctforma.g:6522:1: rule__Section__Group_6__0__Impl : ( 'type' ) ;
    public final void rule__Section__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6526:1: ( ( 'type' ) )
            // InternalUpctforma.g:6527:1: ( 'type' )
            {
            // InternalUpctforma.g:6527:1: ( 'type' )
            // InternalUpctforma.g:6528:2: 'type'
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
    // InternalUpctforma.g:6537:1: rule__Section__Group_6__1 : rule__Section__Group_6__1__Impl ;
    public final void rule__Section__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6541:1: ( rule__Section__Group_6__1__Impl )
            // InternalUpctforma.g:6542:2: rule__Section__Group_6__1__Impl
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
    // InternalUpctforma.g:6548:1: rule__Section__Group_6__1__Impl : ( ( rule__Section__TypeAssignment_6_1 ) ) ;
    public final void rule__Section__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6552:1: ( ( ( rule__Section__TypeAssignment_6_1 ) ) )
            // InternalUpctforma.g:6553:1: ( ( rule__Section__TypeAssignment_6_1 ) )
            {
            // InternalUpctforma.g:6553:1: ( ( rule__Section__TypeAssignment_6_1 ) )
            // InternalUpctforma.g:6554:2: ( rule__Section__TypeAssignment_6_1 )
            {
             before(grammarAccess.getSectionAccess().getTypeAssignment_6_1()); 
            // InternalUpctforma.g:6555:2: ( rule__Section__TypeAssignment_6_1 )
            // InternalUpctforma.g:6555:3: rule__Section__TypeAssignment_6_1
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
    // InternalUpctforma.g:6564:1: rule__Section__Group_7__0 : rule__Section__Group_7__0__Impl rule__Section__Group_7__1 ;
    public final void rule__Section__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6568:1: ( rule__Section__Group_7__0__Impl rule__Section__Group_7__1 )
            // InternalUpctforma.g:6569:2: rule__Section__Group_7__0__Impl rule__Section__Group_7__1
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
    // InternalUpctforma.g:6576:1: rule__Section__Group_7__0__Impl : ( ( rule__Section__RowsAssignment_7_0 ) ) ;
    public final void rule__Section__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6580:1: ( ( ( rule__Section__RowsAssignment_7_0 ) ) )
            // InternalUpctforma.g:6581:1: ( ( rule__Section__RowsAssignment_7_0 ) )
            {
            // InternalUpctforma.g:6581:1: ( ( rule__Section__RowsAssignment_7_0 ) )
            // InternalUpctforma.g:6582:2: ( rule__Section__RowsAssignment_7_0 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_7_0()); 
            // InternalUpctforma.g:6583:2: ( rule__Section__RowsAssignment_7_0 )
            // InternalUpctforma.g:6583:3: rule__Section__RowsAssignment_7_0
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
    // InternalUpctforma.g:6591:1: rule__Section__Group_7__1 : rule__Section__Group_7__1__Impl ;
    public final void rule__Section__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6595:1: ( rule__Section__Group_7__1__Impl )
            // InternalUpctforma.g:6596:2: rule__Section__Group_7__1__Impl
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
    // InternalUpctforma.g:6602:1: rule__Section__Group_7__1__Impl : ( ( rule__Section__Group_7_1__0 )* ) ;
    public final void rule__Section__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6606:1: ( ( ( rule__Section__Group_7_1__0 )* ) )
            // InternalUpctforma.g:6607:1: ( ( rule__Section__Group_7_1__0 )* )
            {
            // InternalUpctforma.g:6607:1: ( ( rule__Section__Group_7_1__0 )* )
            // InternalUpctforma.g:6608:2: ( rule__Section__Group_7_1__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_7_1()); 
            // InternalUpctforma.g:6609:2: ( rule__Section__Group_7_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==22) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUpctforma.g:6609:3: rule__Section__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Section__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalUpctforma.g:6618:1: rule__Section__Group_7_1__0 : rule__Section__Group_7_1__0__Impl rule__Section__Group_7_1__1 ;
    public final void rule__Section__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6622:1: ( rule__Section__Group_7_1__0__Impl rule__Section__Group_7_1__1 )
            // InternalUpctforma.g:6623:2: rule__Section__Group_7_1__0__Impl rule__Section__Group_7_1__1
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
    // InternalUpctforma.g:6630:1: rule__Section__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__Section__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6634:1: ( ( ',' ) )
            // InternalUpctforma.g:6635:1: ( ',' )
            {
            // InternalUpctforma.g:6635:1: ( ',' )
            // InternalUpctforma.g:6636:2: ','
            {
             before(grammarAccess.getSectionAccess().getCommaKeyword_7_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:6645:1: rule__Section__Group_7_1__1 : rule__Section__Group_7_1__1__Impl ;
    public final void rule__Section__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6649:1: ( rule__Section__Group_7_1__1__Impl )
            // InternalUpctforma.g:6650:2: rule__Section__Group_7_1__1__Impl
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
    // InternalUpctforma.g:6656:1: rule__Section__Group_7_1__1__Impl : ( ( rule__Section__RowsAssignment_7_1_1 ) ) ;
    public final void rule__Section__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6660:1: ( ( ( rule__Section__RowsAssignment_7_1_1 ) ) )
            // InternalUpctforma.g:6661:1: ( ( rule__Section__RowsAssignment_7_1_1 ) )
            {
            // InternalUpctforma.g:6661:1: ( ( rule__Section__RowsAssignment_7_1_1 ) )
            // InternalUpctforma.g:6662:2: ( rule__Section__RowsAssignment_7_1_1 )
            {
             before(grammarAccess.getSectionAccess().getRowsAssignment_7_1_1()); 
            // InternalUpctforma.g:6663:2: ( rule__Section__RowsAssignment_7_1_1 )
            // InternalUpctforma.g:6663:3: rule__Section__RowsAssignment_7_1_1
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
    // InternalUpctforma.g:6672:1: rule__SimpleType__Group__0 : rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 ;
    public final void rule__SimpleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6676:1: ( rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1 )
            // InternalUpctforma.g:6677:2: rule__SimpleType__Group__0__Impl rule__SimpleType__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalUpctforma.g:6684:1: rule__SimpleType__Group__0__Impl : ( () ) ;
    public final void rule__SimpleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6688:1: ( ( () ) )
            // InternalUpctforma.g:6689:1: ( () )
            {
            // InternalUpctforma.g:6689:1: ( () )
            // InternalUpctforma.g:6690:2: ()
            {
             before(grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0()); 
            // InternalUpctforma.g:6691:2: ()
            // InternalUpctforma.g:6691:3: 
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
    // InternalUpctforma.g:6699:1: rule__SimpleType__Group__1 : rule__SimpleType__Group__1__Impl ;
    public final void rule__SimpleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6703:1: ( rule__SimpleType__Group__1__Impl )
            // InternalUpctforma.g:6704:2: rule__SimpleType__Group__1__Impl
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
    // InternalUpctforma.g:6710:1: rule__SimpleType__Group__1__Impl : ( ( rule__SimpleType__NameAssignment_1 ) ) ;
    public final void rule__SimpleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6714:1: ( ( ( rule__SimpleType__NameAssignment_1 ) ) )
            // InternalUpctforma.g:6715:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            {
            // InternalUpctforma.g:6715:1: ( ( rule__SimpleType__NameAssignment_1 ) )
            // InternalUpctforma.g:6716:2: ( rule__SimpleType__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleTypeAccess().getNameAssignment_1()); 
            // InternalUpctforma.g:6717:2: ( rule__SimpleType__NameAssignment_1 )
            // InternalUpctforma.g:6717:3: rule__SimpleType__NameAssignment_1
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
    // InternalUpctforma.g:6726:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6730:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalUpctforma.g:6731:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
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
    // InternalUpctforma.g:6738:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__NameAssignment_0 ) ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6742:1: ( ( ( rule__RecordType__NameAssignment_0 ) ) )
            // InternalUpctforma.g:6743:1: ( ( rule__RecordType__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:6743:1: ( ( rule__RecordType__NameAssignment_0 ) )
            // InternalUpctforma.g:6744:2: ( rule__RecordType__NameAssignment_0 )
            {
             before(grammarAccess.getRecordTypeAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:6745:2: ( rule__RecordType__NameAssignment_0 )
            // InternalUpctforma.g:6745:3: rule__RecordType__NameAssignment_0
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
    // InternalUpctforma.g:6753:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6757:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalUpctforma.g:6758:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
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
    // InternalUpctforma.g:6765:1: rule__RecordType__Group__1__Impl : ( '{' ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6769:1: ( ( '{' ) )
            // InternalUpctforma.g:6770:1: ( '{' )
            {
            // InternalUpctforma.g:6770:1: ( '{' )
            // InternalUpctforma.g:6771:2: '{'
            {
             before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:6780:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6784:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalUpctforma.g:6785:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
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
    // InternalUpctforma.g:6792:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__RecordtypeAssignment_2 ) ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6796:1: ( ( ( rule__RecordType__RecordtypeAssignment_2 ) ) )
            // InternalUpctforma.g:6797:1: ( ( rule__RecordType__RecordtypeAssignment_2 ) )
            {
            // InternalUpctforma.g:6797:1: ( ( rule__RecordType__RecordtypeAssignment_2 ) )
            // InternalUpctforma.g:6798:2: ( rule__RecordType__RecordtypeAssignment_2 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_2()); 
            // InternalUpctforma.g:6799:2: ( rule__RecordType__RecordtypeAssignment_2 )
            // InternalUpctforma.g:6799:3: rule__RecordType__RecordtypeAssignment_2
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
    // InternalUpctforma.g:6807:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6811:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalUpctforma.g:6812:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
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
    // InternalUpctforma.g:6819:1: rule__RecordType__Group__3__Impl : ( ( rule__RecordType__Group_3__0 )* ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6823:1: ( ( ( rule__RecordType__Group_3__0 )* ) )
            // InternalUpctforma.g:6824:1: ( ( rule__RecordType__Group_3__0 )* )
            {
            // InternalUpctforma.g:6824:1: ( ( rule__RecordType__Group_3__0 )* )
            // InternalUpctforma.g:6825:2: ( rule__RecordType__Group_3__0 )*
            {
             before(grammarAccess.getRecordTypeAccess().getGroup_3()); 
            // InternalUpctforma.g:6826:2: ( rule__RecordType__Group_3__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==22) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalUpctforma.g:6826:3: rule__RecordType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__RecordType__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalUpctforma.g:6834:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6838:1: ( rule__RecordType__Group__4__Impl )
            // InternalUpctforma.g:6839:2: rule__RecordType__Group__4__Impl
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
    // InternalUpctforma.g:6845:1: rule__RecordType__Group__4__Impl : ( '}' ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6849:1: ( ( '}' ) )
            // InternalUpctforma.g:6850:1: ( '}' )
            {
            // InternalUpctforma.g:6850:1: ( '}' )
            // InternalUpctforma.g:6851:2: '}'
            {
             before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:6861:1: rule__RecordType__Group_3__0 : rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 ;
    public final void rule__RecordType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6865:1: ( rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1 )
            // InternalUpctforma.g:6866:2: rule__RecordType__Group_3__0__Impl rule__RecordType__Group_3__1
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
    // InternalUpctforma.g:6873:1: rule__RecordType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6877:1: ( ( ',' ) )
            // InternalUpctforma.g:6878:1: ( ',' )
            {
            // InternalUpctforma.g:6878:1: ( ',' )
            // InternalUpctforma.g:6879:2: ','
            {
             before(grammarAccess.getRecordTypeAccess().getCommaKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUpctforma.g:6888:1: rule__RecordType__Group_3__1 : rule__RecordType__Group_3__1__Impl ;
    public final void rule__RecordType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6892:1: ( rule__RecordType__Group_3__1__Impl )
            // InternalUpctforma.g:6893:2: rule__RecordType__Group_3__1__Impl
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
    // InternalUpctforma.g:6899:1: rule__RecordType__Group_3__1__Impl : ( ( rule__RecordType__RecordtypeAssignment_3_1 ) ) ;
    public final void rule__RecordType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6903:1: ( ( ( rule__RecordType__RecordtypeAssignment_3_1 ) ) )
            // InternalUpctforma.g:6904:1: ( ( rule__RecordType__RecordtypeAssignment_3_1 ) )
            {
            // InternalUpctforma.g:6904:1: ( ( rule__RecordType__RecordtypeAssignment_3_1 ) )
            // InternalUpctforma.g:6905:2: ( rule__RecordType__RecordtypeAssignment_3_1 )
            {
             before(grammarAccess.getRecordTypeAccess().getRecordtypeAssignment_3_1()); 
            // InternalUpctforma.g:6906:2: ( rule__RecordType__RecordtypeAssignment_3_1 )
            // InternalUpctforma.g:6906:3: rule__RecordType__RecordtypeAssignment_3_1
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
    // InternalUpctforma.g:6915:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6919:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalUpctforma.g:6920:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalUpctforma.g:6927:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6931:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalUpctforma.g:6932:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:6932:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalUpctforma.g:6933:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:6934:2: ( rule__Field__NameAssignment_0 )
            // InternalUpctforma.g:6934:3: rule__Field__NameAssignment_0
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
    // InternalUpctforma.g:6942:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6946:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalUpctforma.g:6947:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalUpctforma.g:6954:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6958:1: ( ( ':' ) )
            // InternalUpctforma.g:6959:1: ( ':' )
            {
            // InternalUpctforma.g:6959:1: ( ':' )
            // InternalUpctforma.g:6960:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUpctforma.g:6969:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6973:1: ( rule__Field__Group__2__Impl )
            // InternalUpctforma.g:6974:2: rule__Field__Group__2__Impl
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
    // InternalUpctforma.g:6980:1: rule__Field__Group__2__Impl : ( ( rule__Field__FieldtypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:6984:1: ( ( ( rule__Field__FieldtypeAssignment_2 ) ) )
            // InternalUpctforma.g:6985:1: ( ( rule__Field__FieldtypeAssignment_2 ) )
            {
            // InternalUpctforma.g:6985:1: ( ( rule__Field__FieldtypeAssignment_2 ) )
            // InternalUpctforma.g:6986:2: ( rule__Field__FieldtypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getFieldtypeAssignment_2()); 
            // InternalUpctforma.g:6987:2: ( rule__Field__FieldtypeAssignment_2 )
            // InternalUpctforma.g:6987:3: rule__Field__FieldtypeAssignment_2
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
    // InternalUpctforma.g:6996:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7000:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // InternalUpctforma.g:7001:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
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
    // InternalUpctforma.g:7008:1: rule__ListType__Group__0__Impl : ( ( rule__ListType__NameAssignment_0 ) ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7012:1: ( ( ( rule__ListType__NameAssignment_0 ) ) )
            // InternalUpctforma.g:7013:1: ( ( rule__ListType__NameAssignment_0 ) )
            {
            // InternalUpctforma.g:7013:1: ( ( rule__ListType__NameAssignment_0 ) )
            // InternalUpctforma.g:7014:2: ( rule__ListType__NameAssignment_0 )
            {
             before(grammarAccess.getListTypeAccess().getNameAssignment_0()); 
            // InternalUpctforma.g:7015:2: ( rule__ListType__NameAssignment_0 )
            // InternalUpctforma.g:7015:3: rule__ListType__NameAssignment_0
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
    // InternalUpctforma.g:7023:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7027:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // InternalUpctforma.g:7028:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalUpctforma.g:7035:1: rule__ListType__Group__1__Impl : ( '{' ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7039:1: ( ( '{' ) )
            // InternalUpctforma.g:7040:1: ( '{' )
            {
            // InternalUpctforma.g:7040:1: ( '{' )
            // InternalUpctforma.g:7041:2: '{'
            {
             before(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalUpctforma.g:7050:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7054:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // InternalUpctforma.g:7055:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalUpctforma.g:7062:1: rule__ListType__Group__2__Impl : ( 'list_of' ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7066:1: ( ( 'list_of' ) )
            // InternalUpctforma.g:7067:1: ( 'list_of' )
            {
            // InternalUpctforma.g:7067:1: ( 'list_of' )
            // InternalUpctforma.g:7068:2: 'list_of'
            {
             before(grammarAccess.getListTypeAccess().getList_ofKeyword_2()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUpctforma.g:7077:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl rule__ListType__Group__4 ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7081:1: ( rule__ListType__Group__3__Impl rule__ListType__Group__4 )
            // InternalUpctforma.g:7082:2: rule__ListType__Group__3__Impl rule__ListType__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalUpctforma.g:7089:1: rule__ListType__Group__3__Impl : ( ( rule__ListType__ListtypeAssignment_3 ) ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7093:1: ( ( ( rule__ListType__ListtypeAssignment_3 ) ) )
            // InternalUpctforma.g:7094:1: ( ( rule__ListType__ListtypeAssignment_3 ) )
            {
            // InternalUpctforma.g:7094:1: ( ( rule__ListType__ListtypeAssignment_3 ) )
            // InternalUpctforma.g:7095:2: ( rule__ListType__ListtypeAssignment_3 )
            {
             before(grammarAccess.getListTypeAccess().getListtypeAssignment_3()); 
            // InternalUpctforma.g:7096:2: ( rule__ListType__ListtypeAssignment_3 )
            // InternalUpctforma.g:7096:3: rule__ListType__ListtypeAssignment_3
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
    // InternalUpctforma.g:7104:1: rule__ListType__Group__4 : rule__ListType__Group__4__Impl ;
    public final void rule__ListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7108:1: ( rule__ListType__Group__4__Impl )
            // InternalUpctforma.g:7109:2: rule__ListType__Group__4__Impl
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
    // InternalUpctforma.g:7115:1: rule__ListType__Group__4__Impl : ( '}' ) ;
    public final void rule__ListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7119:1: ( ( '}' ) )
            // InternalUpctforma.g:7120:1: ( '}' )
            {
            // InternalUpctforma.g:7120:1: ( '}' )
            // InternalUpctforma.g:7121:2: '}'
            {
             before(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalUpctforma.g:7131:1: rule__ContentDefinition__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7135:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7136:2: ( ruleEString )
            {
            // InternalUpctforma.g:7136:2: ( ruleEString )
            // InternalUpctforma.g:7137:3: ruleEString
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
    // InternalUpctforma.g:7146:1: rule__ContentDefinition__NameAssignment_4_1 : ( ruleQualifiedName ) ;
    public final void rule__ContentDefinition__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7150:1: ( ( ruleQualifiedName ) )
            // InternalUpctforma.g:7151:2: ( ruleQualifiedName )
            {
            // InternalUpctforma.g:7151:2: ( ruleQualifiedName )
            // InternalUpctforma.g:7152:3: ruleQualifiedName
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
    // InternalUpctforma.g:7161:1: rule__ContentDefinition__ImportsAssignment_5_0 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7165:1: ( ( ruleImport ) )
            // InternalUpctforma.g:7166:2: ( ruleImport )
            {
            // InternalUpctforma.g:7166:2: ( ruleImport )
            // InternalUpctforma.g:7167:3: ruleImport
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
    // InternalUpctforma.g:7176:1: rule__ContentDefinition__ImportsAssignment_5_1_1 : ( ruleImport ) ;
    public final void rule__ContentDefinition__ImportsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7180:1: ( ( ruleImport ) )
            // InternalUpctforma.g:7181:2: ( ruleImport )
            {
            // InternalUpctforma.g:7181:2: ( ruleImport )
            // InternalUpctforma.g:7182:3: ruleImport
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
    // InternalUpctforma.g:7191:1: rule__ContentDefinition__TypesAssignment_6_2 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7195:1: ( ( ruleType ) )
            // InternalUpctforma.g:7196:2: ( ruleType )
            {
            // InternalUpctforma.g:7196:2: ( ruleType )
            // InternalUpctforma.g:7197:3: ruleType
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
    // InternalUpctforma.g:7206:1: rule__ContentDefinition__TypesAssignment_6_3_1 : ( ruleType ) ;
    public final void rule__ContentDefinition__TypesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7210:1: ( ( ruleType ) )
            // InternalUpctforma.g:7211:2: ( ruleType )
            {
            // InternalUpctforma.g:7211:2: ( ruleType )
            // InternalUpctforma.g:7212:3: ruleType
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
    // InternalUpctforma.g:7221:1: rule__ContentDefinition__TemplatesAssignment_7_2 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7225:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:7226:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:7226:2: ( ruleTemplateDef )
            // InternalUpctforma.g:7227:3: ruleTemplateDef
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
    // InternalUpctforma.g:7236:1: rule__ContentDefinition__TemplatesAssignment_7_3_1 : ( ruleTemplateDef ) ;
    public final void rule__ContentDefinition__TemplatesAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7240:1: ( ( ruleTemplateDef ) )
            // InternalUpctforma.g:7241:2: ( ruleTemplateDef )
            {
            // InternalUpctforma.g:7241:2: ( ruleTemplateDef )
            // InternalUpctforma.g:7242:3: ruleTemplateDef
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
    // InternalUpctforma.g:7251:1: rule__ContentDefinition__UnitAssignment_8 : ( ruleContentUnit ) ;
    public final void rule__ContentDefinition__UnitAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7255:1: ( ( ruleContentUnit ) )
            // InternalUpctforma.g:7256:2: ( ruleContentUnit )
            {
            // InternalUpctforma.g:7256:2: ( ruleContentUnit )
            // InternalUpctforma.g:7257:3: ruleContentUnit
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
    // InternalUpctforma.g:7266:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7270:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalUpctforma.g:7271:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalUpctforma.g:7271:2: ( ruleQualifiedNameWithWildcard )
            // InternalUpctforma.g:7272:3: ruleQualifiedNameWithWildcard
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
    // InternalUpctforma.g:7281:1: rule__TemplateDef__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__TemplateDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7285:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7286:2: ( ruleEString )
            {
            // InternalUpctforma.g:7286:2: ( ruleEString )
            // InternalUpctforma.g:7287:3: ruleEString
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
    // InternalUpctforma.g:7296:1: rule__TemplateDef__RowsAssignment_4_0 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7300:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7301:2: ( ruleRow )
            {
            // InternalUpctforma.g:7301:2: ( ruleRow )
            // InternalUpctforma.g:7302:3: ruleRow
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
    // InternalUpctforma.g:7311:1: rule__TemplateDef__RowsAssignment_4_1_1 : ( ruleRow ) ;
    public final void rule__TemplateDef__RowsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7315:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7316:2: ( ruleRow )
            {
            // InternalUpctforma.g:7316:2: ( ruleRow )
            // InternalUpctforma.g:7317:3: ruleRow
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
    // InternalUpctforma.g:7326:1: rule__ContentUnit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ContentUnit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7330:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7331:2: ( ruleEString )
            {
            // InternalUpctforma.g:7331:2: ( ruleEString )
            // InternalUpctforma.g:7332:3: ruleEString
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
    // InternalUpctforma.g:7341:1: rule__ContentUnit__AuthorAssignment_2 : ( ruleEString ) ;
    public final void rule__ContentUnit__AuthorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7345:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7346:2: ( ruleEString )
            {
            // InternalUpctforma.g:7346:2: ( ruleEString )
            // InternalUpctforma.g:7347:3: ruleEString
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
    // InternalUpctforma.g:7356:1: rule__ContentUnit__TypeAssignment_3 : ( ruleContentUnitType ) ;
    public final void rule__ContentUnit__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7360:1: ( ( ruleContentUnitType ) )
            // InternalUpctforma.g:7361:2: ( ruleContentUnitType )
            {
            // InternalUpctforma.g:7361:2: ( ruleContentUnitType )
            // InternalUpctforma.g:7362:3: ruleContentUnitType
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


    // $ANTLR start "rule__ContentUnit__SectionsAssignment_5"
    // InternalUpctforma.g:7371:1: rule__ContentUnit__SectionsAssignment_5 : ( ruleSection ) ;
    public final void rule__ContentUnit__SectionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7375:1: ( ( ruleSection ) )
            // InternalUpctforma.g:7376:2: ( ruleSection )
            {
            // InternalUpctforma.g:7376:2: ( ruleSection )
            // InternalUpctforma.g:7377:3: ruleSection
            {
             before(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__SectionsAssignment_5"


    // $ANTLR start "rule__ContentUnit__SectionsAssignment_6_1"
    // InternalUpctforma.g:7386:1: rule__ContentUnit__SectionsAssignment_6_1 : ( ruleSection ) ;
    public final void rule__ContentUnit__SectionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7390:1: ( ( ruleSection ) )
            // InternalUpctforma.g:7391:2: ( ruleSection )
            {
            // InternalUpctforma.g:7391:2: ( ruleSection )
            // InternalUpctforma.g:7392:3: ruleSection
            {
             before(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContentUnit__SectionsAssignment_6_1"


    // $ANTLR start "rule__Type_Impl__NameAssignment_2"
    // InternalUpctforma.g:7401:1: rule__Type_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Type_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7405:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7406:2: ( ruleEString )
            {
            // InternalUpctforma.g:7406:2: ( ruleEString )
            // InternalUpctforma.g:7407:3: ruleEString
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
    // InternalUpctforma.g:7416:1: rule__Row__ColumnsAssignment_3_0 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7420:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:7421:2: ( ruleColumn )
            {
            // InternalUpctforma.g:7421:2: ( ruleColumn )
            // InternalUpctforma.g:7422:3: ruleColumn
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
    // InternalUpctforma.g:7431:1: rule__Row__ColumnsAssignment_3_1_1 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7435:1: ( ( ruleColumn ) )
            // InternalUpctforma.g:7436:2: ( ruleColumn )
            {
            // InternalUpctforma.g:7436:2: ( ruleColumn )
            // InternalUpctforma.g:7437:3: ruleColumn
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
    // InternalUpctforma.g:7446:1: rule__Row__UsetemplateAssignment_4_1 : ( ruleUseTemplate ) ;
    public final void rule__Row__UsetemplateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7450:1: ( ( ruleUseTemplate ) )
            // InternalUpctforma.g:7451:2: ( ruleUseTemplate )
            {
            // InternalUpctforma.g:7451:2: ( ruleUseTemplate )
            // InternalUpctforma.g:7452:3: ruleUseTemplate
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
    // InternalUpctforma.g:7461:1: rule__Column__WidthAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Column__WidthAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7465:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7466:2: ( ruleEString )
            {
            // InternalUpctforma.g:7466:2: ( ruleEString )
            // InternalUpctforma.g:7467:3: ruleEString
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
    // InternalUpctforma.g:7476:1: rule__Column__ElementsAssignment_4_0 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7480:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7481:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7481:2: ( ruleContentElement )
            // InternalUpctforma.g:7482:3: ruleContentElement
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
    // InternalUpctforma.g:7491:1: rule__Column__ElementsAssignment_4_1_1 : ( ruleContentElement ) ;
    public final void rule__Column__ElementsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7495:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7496:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7496:2: ( ruleContentElement )
            // InternalUpctforma.g:7497:3: ruleContentElement
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
    // InternalUpctforma.g:7506:1: rule__UseTemplate__TypetemplateAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__UseTemplate__TypetemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7510:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:7511:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:7511:2: ( ( ruleEString ) )
            // InternalUpctforma.g:7512:3: ( ruleEString )
            {
             before(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0()); 
            // InternalUpctforma.g:7513:3: ( ruleEString )
            // InternalUpctforma.g:7514:4: ruleEString
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
    // InternalUpctforma.g:7525:1: rule__UseTemplate__TemplateelementsAssignment_2_1 : ( ruleContentElement ) ;
    public final void rule__UseTemplate__TemplateelementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7529:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7530:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7530:2: ( ruleContentElement )
            // InternalUpctforma.g:7531:3: ruleContentElement
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
    // InternalUpctforma.g:7540:1: rule__UseTemplate__TemplateelementsAssignment_2_2_1 : ( ruleContentElement ) ;
    public final void rule__UseTemplate__TemplateelementsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7544:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7545:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7545:2: ( ruleContentElement )
            // InternalUpctforma.g:7546:3: ruleContentElement
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
    // InternalUpctforma.g:7555:1: rule__Image__UrlAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Image__UrlAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7559:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7560:2: ( ruleEString )
            {
            // InternalUpctforma.g:7560:2: ( ruleEString )
            // InternalUpctforma.g:7561:3: ruleEString
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


    // $ANTLR start "rule__Widget__NameAssignment_1"
    // InternalUpctforma.g:7570:1: rule__Widget__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Widget__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7574:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7575:2: ( ruleEString )
            {
            // InternalUpctforma.g:7575:2: ( ruleEString )
            // InternalUpctforma.g:7576:3: ruleEString
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
    // InternalUpctforma.g:7585:1: rule__Widget__WidgettypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Widget__WidgettypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7589:1: ( ( ( ruleEString ) ) )
            // InternalUpctforma.g:7590:2: ( ( ruleEString ) )
            {
            // InternalUpctforma.g:7590:2: ( ( ruleEString ) )
            // InternalUpctforma.g:7591:3: ( ruleEString )
            {
             before(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0()); 
            // InternalUpctforma.g:7592:3: ( ruleEString )
            // InternalUpctforma.g:7593:4: ruleEString
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
    // InternalUpctforma.g:7604:1: rule__Widget__WidgetelementsAssignment_4_1 : ( ruleContentElement ) ;
    public final void rule__Widget__WidgetelementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7608:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7609:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7609:2: ( ruleContentElement )
            // InternalUpctforma.g:7610:3: ruleContentElement
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
    // InternalUpctforma.g:7619:1: rule__Widget__WidgetelementsAssignment_4_2_1 : ( ruleContentElement ) ;
    public final void rule__Widget__WidgetelementsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7623:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7624:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7624:2: ( ruleContentElement )
            // InternalUpctforma.g:7625:3: ruleContentElement
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
    // InternalUpctforma.g:7634:1: rule__Text__HtmlAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Text__HtmlAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7638:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7639:2: ( ruleEString )
            {
            // InternalUpctforma.g:7639:2: ( ruleEString )
            // InternalUpctforma.g:7640:3: ruleEString
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
    // InternalUpctforma.g:7649:1: rule__Number__NumAssignment_2 : ( ruleEInt ) ;
    public final void rule__Number__NumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7653:1: ( ( ruleEInt ) )
            // InternalUpctforma.g:7654:2: ( ruleEInt )
            {
            // InternalUpctforma.g:7654:2: ( ruleEInt )
            // InternalUpctforma.g:7655:3: ruleEInt
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
    // InternalUpctforma.g:7664:1: rule__Literal__LiteralAssignment_2 : ( ruleEString ) ;
    public final void rule__Literal__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7668:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7669:2: ( ruleEString )
            {
            // InternalUpctforma.g:7669:2: ( ruleEString )
            // InternalUpctforma.g:7670:3: ruleEString
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
    // InternalUpctforma.g:7679:1: rule__Video__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Video__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7683:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7684:2: ( ruleEString )
            {
            // InternalUpctforma.g:7684:2: ( ruleEString )
            // InternalUpctforma.g:7685:3: ruleEString
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
    // InternalUpctforma.g:7694:1: rule__Video__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Video__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7698:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7699:2: ( ruleEString )
            {
            // InternalUpctforma.g:7699:2: ( ruleEString )
            // InternalUpctforma.g:7700:3: ruleEString
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


    // $ANTLR start "rule__PlaceHolder__TypeAssignment_1"
    // InternalUpctforma.g:7709:1: rule__PlaceHolder__TypeAssignment_1 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__PlaceHolder__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7713:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7714:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7714:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7715:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getPlaceHolderAccess().getTypeTypeCrossReference_1_0()); 
            // InternalUpctforma.g:7716:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7717:4: ruleEPrimitiveTypes
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
    // InternalUpctforma.g:7728:1: rule__Game__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Game__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7732:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7733:2: ( ruleEString )
            {
            // InternalUpctforma.g:7733:2: ( ruleEString )
            // InternalUpctforma.g:7734:3: ruleEString
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
    // InternalUpctforma.g:7743:1: rule__FieldValue__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__FieldValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7747:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7748:2: ( ruleEString )
            {
            // InternalUpctforma.g:7748:2: ( ruleEString )
            // InternalUpctforma.g:7749:3: ruleEString
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
    // InternalUpctforma.g:7758:1: rule__FieldValue__FieldvalueAssignment_2 : ( ruleContentElement ) ;
    public final void rule__FieldValue__FieldvalueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7762:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7763:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7763:2: ( ruleContentElement )
            // InternalUpctforma.g:7764:3: ruleContentElement
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
    // InternalUpctforma.g:7773:1: rule__RecordValue__RecordvaluesAssignment_1 : ( ruleFieldValue ) ;
    public final void rule__RecordValue__RecordvaluesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7777:1: ( ( ruleFieldValue ) )
            // InternalUpctforma.g:7778:2: ( ruleFieldValue )
            {
            // InternalUpctforma.g:7778:2: ( ruleFieldValue )
            // InternalUpctforma.g:7779:3: ruleFieldValue
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
    // InternalUpctforma.g:7788:1: rule__RecordValue__RecordvaluesAssignment_2_1 : ( ruleFieldValue ) ;
    public final void rule__RecordValue__RecordvaluesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7792:1: ( ( ruleFieldValue ) )
            // InternalUpctforma.g:7793:2: ( ruleFieldValue )
            {
            // InternalUpctforma.g:7793:2: ( ruleFieldValue )
            // InternalUpctforma.g:7794:3: ruleFieldValue
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
    // InternalUpctforma.g:7803:1: rule__ListValue__ListvaluesAssignment_1 : ( ruleContentElement ) ;
    public final void rule__ListValue__ListvaluesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7807:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7808:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7808:2: ( ruleContentElement )
            // InternalUpctforma.g:7809:3: ruleContentElement
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
    // InternalUpctforma.g:7818:1: rule__ListValue__ListvaluesAssignment_2_1 : ( ruleContentElement ) ;
    public final void rule__ListValue__ListvaluesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7822:1: ( ( ruleContentElement ) )
            // InternalUpctforma.g:7823:2: ( ruleContentElement )
            {
            // InternalUpctforma.g:7823:2: ( ruleContentElement )
            // InternalUpctforma.g:7824:3: ruleContentElement
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
    // InternalUpctforma.g:7833:1: rule__WidgetType__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__WidgetType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7837:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7838:2: ( ruleEString )
            {
            // InternalUpctforma.g:7838:2: ( ruleEString )
            // InternalUpctforma.g:7839:3: ruleEString
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
    // InternalUpctforma.g:7848:1: rule__WidgetType__WidgettypeelementsAssignment_4 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__WidgetType__WidgettypeelementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7852:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7853:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7853:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7854:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_4_0()); 
            // InternalUpctforma.g:7855:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7856:4: ruleEPrimitiveTypes
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
    // InternalUpctforma.g:7867:1: rule__WidgetType__WidgettypeelementsAssignment_5_1 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__WidgetType__WidgettypeelementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7871:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:7872:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:7872:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:7873:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_5_1_0()); 
            // InternalUpctforma.g:7874:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:7875:4: ruleEPrimitiveTypes
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
    // InternalUpctforma.g:7886:1: rule__CompositeType_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CompositeType_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7890:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7891:2: ( ruleEString )
            {
            // InternalUpctforma.g:7891:2: ( ruleEString )
            // InternalUpctforma.g:7892:3: ruleEString
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
    // InternalUpctforma.g:7901:1: rule__Section__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Section__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7905:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7906:2: ( ruleEString )
            {
            // InternalUpctforma.g:7906:2: ( ruleEString )
            // InternalUpctforma.g:7907:3: ruleEString
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
    // InternalUpctforma.g:7916:1: rule__Section__ImageAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Section__ImageAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7920:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7921:2: ( ruleEString )
            {
            // InternalUpctforma.g:7921:2: ( ruleEString )
            // InternalUpctforma.g:7922:3: ruleEString
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
    // InternalUpctforma.g:7931:1: rule__Section__TitleAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Section__TitleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7935:1: ( ( ruleEString ) )
            // InternalUpctforma.g:7936:2: ( ruleEString )
            {
            // InternalUpctforma.g:7936:2: ( ruleEString )
            // InternalUpctforma.g:7937:3: ruleEString
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
    // InternalUpctforma.g:7946:1: rule__Section__TypeAssignment_6_1 : ( ruleSectionType ) ;
    public final void rule__Section__TypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7950:1: ( ( ruleSectionType ) )
            // InternalUpctforma.g:7951:2: ( ruleSectionType )
            {
            // InternalUpctforma.g:7951:2: ( ruleSectionType )
            // InternalUpctforma.g:7952:3: ruleSectionType
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
    // InternalUpctforma.g:7961:1: rule__Section__RowsAssignment_7_0 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7965:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7966:2: ( ruleRow )
            {
            // InternalUpctforma.g:7966:2: ( ruleRow )
            // InternalUpctforma.g:7967:3: ruleRow
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
    // InternalUpctforma.g:7976:1: rule__Section__RowsAssignment_7_1_1 : ( ruleRow ) ;
    public final void rule__Section__RowsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7980:1: ( ( ruleRow ) )
            // InternalUpctforma.g:7981:2: ( ruleRow )
            {
            // InternalUpctforma.g:7981:2: ( ruleRow )
            // InternalUpctforma.g:7982:3: ruleRow
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
    // InternalUpctforma.g:7991:1: rule__SimpleType__NameAssignment_1 : ( RULE_PRIMITIVETYPES ) ;
    public final void rule__SimpleType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:7995:1: ( ( RULE_PRIMITIVETYPES ) )
            // InternalUpctforma.g:7996:2: ( RULE_PRIMITIVETYPES )
            {
            // InternalUpctforma.g:7996:2: ( RULE_PRIMITIVETYPES )
            // InternalUpctforma.g:7997:3: RULE_PRIMITIVETYPES
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
    // InternalUpctforma.g:8006:1: rule__RecordType__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RecordType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8010:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8011:2: ( ruleEString )
            {
            // InternalUpctforma.g:8011:2: ( ruleEString )
            // InternalUpctforma.g:8012:3: ruleEString
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
    // InternalUpctforma.g:8021:1: rule__RecordType__RecordtypeAssignment_2 : ( ruleField ) ;
    public final void rule__RecordType__RecordtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8025:1: ( ( ruleField ) )
            // InternalUpctforma.g:8026:2: ( ruleField )
            {
            // InternalUpctforma.g:8026:2: ( ruleField )
            // InternalUpctforma.g:8027:3: ruleField
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
    // InternalUpctforma.g:8036:1: rule__RecordType__RecordtypeAssignment_3_1 : ( ruleField ) ;
    public final void rule__RecordType__RecordtypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8040:1: ( ( ruleField ) )
            // InternalUpctforma.g:8041:2: ( ruleField )
            {
            // InternalUpctforma.g:8041:2: ( ruleField )
            // InternalUpctforma.g:8042:3: ruleField
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
    // InternalUpctforma.g:8051:1: rule__Field__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8055:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8056:2: ( ruleEString )
            {
            // InternalUpctforma.g:8056:2: ( ruleEString )
            // InternalUpctforma.g:8057:3: ruleEString
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
    // InternalUpctforma.g:8066:1: rule__Field__FieldtypeAssignment_2 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__Field__FieldtypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8070:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:8071:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:8071:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:8072:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getFieldAccess().getFieldtypeTypeCrossReference_2_0()); 
            // InternalUpctforma.g:8073:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:8074:4: ruleEPrimitiveTypes
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
    // InternalUpctforma.g:8085:1: rule__ListType__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ListType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8089:1: ( ( ruleEString ) )
            // InternalUpctforma.g:8090:2: ( ruleEString )
            {
            // InternalUpctforma.g:8090:2: ( ruleEString )
            // InternalUpctforma.g:8091:3: ruleEString
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
    // InternalUpctforma.g:8100:1: rule__ListType__ListtypeAssignment_3 : ( ( ruleEPrimitiveTypes ) ) ;
    public final void rule__ListType__ListtypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUpctforma.g:8104:1: ( ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:8105:2: ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:8105:2: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:8106:3: ( ruleEPrimitiveTypes )
            {
             before(grammarAccess.getListTypeAccess().getListtypeTypeCrossReference_3_0()); 
            // InternalUpctforma.g:8107:3: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:8108:4: ruleEPrimitiveTypes
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
    static final String dfa_2s = "\1\4\2\uffff\2\22\2\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\67\2\uffff\2\22\2\uffff\1\73\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\6\1\uffff\1\3\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\4\1\2\27\uffff\1\1\27\uffff\1\5\1\6",
            "",
            "",
            "\1\7",
            "\1\7",
            "",
            "",
            "\2\10\65\uffff\1\11",
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
            return "984:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleSimpleType ) | ( ruleRecordType ) | ( ruleWidgetType ) | ( ruleListType ) | ( ruleCompositeType_Impl ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000025980000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00C0000040000070L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000300080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000C0030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x001E6D5E800C0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x001E6D5A80040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000080080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000080000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000400000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0601000080080000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000080000L});

}