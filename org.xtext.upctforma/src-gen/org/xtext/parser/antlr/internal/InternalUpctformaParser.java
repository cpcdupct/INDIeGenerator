package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.UpctformaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUpctformaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_PRIMITIVETYPES", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ContentDefinition'", "'{'", "'package'", "';'", "','", "'types'", "'}'", "'templates'", "'.'", "'import'", "'.*'", "'TemplateDef'", "'Unit'", "'Type'", "'row'", "'usetemplate'", "'column'", "'width'", "'ContentElement'", "'Image'", "'url'", "'Widget'", "':'", "'Text'", "'html'", "'Int'", "'Literal'", "'-'", "'Composite'", "'Video'", "'id'", "'title'", "'type'", "'SimpleElement'", "'Placeholder'", "'Game'", "'['", "']'", "'widget'", "'CompositeType'", "'Section'", "'image'", "'list_of'", "'Interoperability'", "'Open'", "'Preview'", "'Normal'", "'Interactive'", "'ES'", "'EN'", "'FR'", "'GR'", "'LI'", "'Original'", "'Fit'", "'BackgroundImage'", "'BackgroundColour'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_PRIMITIVETYPES=7;
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

        public InternalUpctformaParser(TokenStream input, UpctformaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ContentDefinition";
       	}

       	@Override
       	protected UpctformaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContentDefinition"
    // InternalUpctforma.g:65:1: entryRuleContentDefinition returns [EObject current=null] : iv_ruleContentDefinition= ruleContentDefinition EOF ;
    public final EObject entryRuleContentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentDefinition = null;


        try {
            // InternalUpctforma.g:65:58: (iv_ruleContentDefinition= ruleContentDefinition EOF )
            // InternalUpctforma.g:66:2: iv_ruleContentDefinition= ruleContentDefinition EOF
            {
             newCompositeNode(grammarAccess.getContentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentDefinition=ruleContentDefinition();

            state._fsp--;

             current =iv_ruleContentDefinition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContentDefinition"


    // $ANTLR start "ruleContentDefinition"
    // InternalUpctforma.g:72:1: ruleContentDefinition returns [EObject current=null] : ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleContentUnit ) )? otherlv_23= '}' ) ;
    public final EObject ruleContentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_imports_7_0 = null;

        EObject lv_imports_9_0 = null;

        EObject lv_types_12_0 = null;

        EObject lv_types_14_0 = null;

        EObject lv_templates_18_0 = null;

        EObject lv_templates_20_0 = null;

        EObject lv_unit_22_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:78:2: ( ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleContentUnit ) )? otherlv_23= '}' ) )
            // InternalUpctforma.g:79:2: ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleContentUnit ) )? otherlv_23= '}' )
            {
            // InternalUpctforma.g:79:2: ( () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleContentUnit ) )? otherlv_23= '}' )
            // InternalUpctforma.g:80:3: () otherlv_1= 'ContentDefinition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )? ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )? (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )? (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )? ( (lv_unit_22_0= ruleContentUnit ) )? otherlv_23= '}'
            {
            // InternalUpctforma.g:80:3: ()
            // InternalUpctforma.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentDefinitionAccess().getContentDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContentDefinitionAccess().getContentDefinitionKeyword_1());
            		
            // InternalUpctforma.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:92:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContentDefinitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:114:3: (otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalUpctforma.g:115:4: otherlv_4= 'package' ( (lv_name_5_0= ruleQualifiedName ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getContentDefinitionAccess().getPackageKeyword_4_0());
                    			
                    // InternalUpctforma.g:119:4: ( (lv_name_5_0= ruleQualifiedName ) )
                    // InternalUpctforma.g:120:5: (lv_name_5_0= ruleQualifiedName )
                    {
                    // InternalUpctforma.g:120:5: (lv_name_5_0= ruleQualifiedName )
                    // InternalUpctforma.g:121:6: lv_name_5_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getNameQualifiedNameParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_name_5_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_5_0,
                    							"org.xtext.Upctforma.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getContentDefinitionAccess().getSemicolonKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalUpctforma.g:143:3: ( ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUpctforma.g:144:4: ( (lv_imports_7_0= ruleImport ) ) (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )*
                    {
                    // InternalUpctforma.g:144:4: ( (lv_imports_7_0= ruleImport ) )
                    // InternalUpctforma.g:145:5: (lv_imports_7_0= ruleImport )
                    {
                    // InternalUpctforma.g:145:5: (lv_imports_7_0= ruleImport )
                    // InternalUpctforma.g:146:6: lv_imports_7_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_imports_7_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_7_0,
                    							"org.xtext.Upctforma.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:163:4: (otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalUpctforma.g:164:5: otherlv_8= ',' ( (lv_imports_9_0= ruleImport ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getContentDefinitionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalUpctforma.g:168:5: ( (lv_imports_9_0= ruleImport ) )
                    	    // InternalUpctforma.g:169:6: (lv_imports_9_0= ruleImport )
                    	    {
                    	    // InternalUpctforma.g:169:6: (lv_imports_9_0= ruleImport )
                    	    // InternalUpctforma.g:170:7: lv_imports_9_0= ruleImport
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentDefinitionAccess().getImportsImportParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_imports_9_0=ruleImport();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"imports",
                    	    								lv_imports_9_0,
                    	    								"org.xtext.Upctforma.Import");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctforma.g:189:3: (otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUpctforma.g:190:4: otherlv_10= 'types' otherlv_11= '{' ( (lv_types_12_0= ruleType ) ) (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getContentDefinitionAccess().getTypesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUpctforma.g:198:4: ( (lv_types_12_0= ruleType ) )
                    // InternalUpctforma.g:199:5: (lv_types_12_0= ruleType )
                    {
                    // InternalUpctforma.g:199:5: (lv_types_12_0= ruleType )
                    // InternalUpctforma.g:200:6: lv_types_12_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_types_12_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_12_0,
                    							"org.xtext.Upctforma.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:217:4: (otherlv_13= ',' ( (lv_types_14_0= ruleType ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalUpctforma.g:218:5: otherlv_13= ',' ( (lv_types_14_0= ruleType ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getContentDefinitionAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUpctforma.g:222:5: ( (lv_types_14_0= ruleType ) )
                    	    // InternalUpctforma.g:223:6: (lv_types_14_0= ruleType )
                    	    {
                    	    // InternalUpctforma.g:223:6: (lv_types_14_0= ruleType )
                    	    // InternalUpctforma.g:224:7: lv_types_14_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentDefinitionAccess().getTypesTypeParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_types_14_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_14_0,
                    	    								"org.xtext.Upctforma.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalUpctforma.g:247:3: (otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUpctforma.g:248:4: otherlv_16= 'templates' otherlv_17= '{' ( (lv_templates_18_0= ruleTemplateDef ) ) (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getContentDefinitionAccess().getTemplatesKeyword_7_0());
                    			
                    otherlv_17=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getContentDefinitionAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalUpctforma.g:256:4: ( (lv_templates_18_0= ruleTemplateDef ) )
                    // InternalUpctforma.g:257:5: (lv_templates_18_0= ruleTemplateDef )
                    {
                    // InternalUpctforma.g:257:5: (lv_templates_18_0= ruleTemplateDef )
                    // InternalUpctforma.g:258:6: lv_templates_18_0= ruleTemplateDef
                    {

                    						newCompositeNode(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_templates_18_0=ruleTemplateDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"templates",
                    							lv_templates_18_0,
                    							"org.xtext.Upctforma.TemplateDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:275:4: (otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalUpctforma.g:276:5: otherlv_19= ',' ( (lv_templates_20_0= ruleTemplateDef ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_14); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getContentDefinitionAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalUpctforma.g:280:5: ( (lv_templates_20_0= ruleTemplateDef ) )
                    	    // InternalUpctforma.g:281:6: (lv_templates_20_0= ruleTemplateDef )
                    	    {
                    	    // InternalUpctforma.g:281:6: (lv_templates_20_0= ruleTemplateDef )
                    	    // InternalUpctforma.g:282:7: lv_templates_20_0= ruleTemplateDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getContentDefinitionAccess().getTemplatesTemplateDefParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_templates_20_0=ruleTemplateDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templates",
                    	    								lv_templates_20_0,
                    	    								"org.xtext.Upctforma.TemplateDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,18,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalUpctforma.g:305:3: ( (lv_unit_22_0= ruleContentUnit ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUpctforma.g:306:4: (lv_unit_22_0= ruleContentUnit )
                    {
                    // InternalUpctforma.g:306:4: (lv_unit_22_0= ruleContentUnit )
                    // InternalUpctforma.g:307:5: lv_unit_22_0= ruleContentUnit
                    {

                    					newCompositeNode(grammarAccess.getContentDefinitionAccess().getUnitContentUnitParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_unit_22_0=ruleContentUnit();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getContentDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"unit",
                    						lv_unit_22_0,
                    						"org.xtext.Upctforma.ContentUnit");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getContentDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleContentDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUpctforma.g:332:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUpctforma.g:332:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUpctforma.g:333:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUpctforma.g:339:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUpctforma.g:345:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUpctforma.g:346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUpctforma.g:346:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUpctforma.g:347:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUpctforma.g:354:3: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUpctforma.g:355:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop9;
                }
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalUpctforma.g:372:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalUpctforma.g:372:47: (iv_ruleImport= ruleImport EOF )
            // InternalUpctforma.g:373:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalUpctforma.g:379:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:385:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalUpctforma.g:386:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalUpctforma.g:386:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalUpctforma.g:387:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalUpctforma.g:391:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalUpctforma.g:392:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalUpctforma.g:392:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalUpctforma.g:393:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.Upctforma.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalUpctforma.g:418:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalUpctforma.g:418:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalUpctforma.g:419:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalUpctforma.g:425:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:431:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalUpctforma.g:432:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalUpctforma.g:432:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalUpctforma.g:433:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUpctforma.g:443:3: (kw= '.*' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUpctforma.g:444:4: kw= '.*'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalUpctforma.g:454:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalUpctforma.g:454:45: (iv_ruleType= ruleType EOF )
            // InternalUpctforma.g:455:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalUpctforma.g:461:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_RecordType_2= ruleRecordType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType | this_CompositeType_Impl_5= ruleCompositeType_Impl ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_SimpleType_1 = null;

        EObject this_RecordType_2 = null;

        EObject this_WidgetType_3 = null;

        EObject this_ListType_4 = null;

        EObject this_CompositeType_Impl_5 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:467:2: ( (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_RecordType_2= ruleRecordType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType | this_CompositeType_Impl_5= ruleCompositeType_Impl ) )
            // InternalUpctforma.g:468:2: (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_RecordType_2= ruleRecordType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType | this_CompositeType_Impl_5= ruleCompositeType_Impl )
            {
            // InternalUpctforma.g:468:2: (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_RecordType_2= ruleRecordType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType | this_CompositeType_Impl_5= ruleCompositeType_Impl )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalUpctforma.g:469:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:478:3: this_SimpleType_1= ruleSimpleType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getSimpleTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleType_1=ruleSimpleType();

                    state._fsp--;


                    			current = this_SimpleType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:487:3: this_RecordType_2= ruleRecordType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRecordTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecordType_2=ruleRecordType();

                    state._fsp--;


                    			current = this_RecordType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:496:3: this_WidgetType_3= ruleWidgetType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getWidgetTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WidgetType_3=ruleWidgetType();

                    state._fsp--;


                    			current = this_WidgetType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:505:3: this_ListType_4= ruleListType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getListTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListType_4=ruleListType();

                    state._fsp--;


                    			current = this_ListType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUpctforma.g:514:3: this_CompositeType_Impl_5= ruleCompositeType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getCompositeType_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeType_Impl_5=ruleCompositeType_Impl();

                    state._fsp--;


                    			current = this_CompositeType_Impl_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleContentElement"
    // InternalUpctforma.g:526:1: entryRuleContentElement returns [EObject current=null] : iv_ruleContentElement= ruleContentElement EOF ;
    public final EObject entryRuleContentElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement = null;


        try {
            // InternalUpctforma.g:526:55: (iv_ruleContentElement= ruleContentElement EOF )
            // InternalUpctforma.g:527:2: iv_ruleContentElement= ruleContentElement EOF
            {
             newCompositeNode(grammarAccess.getContentElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentElement=ruleContentElement();

            state._fsp--;

             current =iv_ruleContentElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContentElement"


    // $ANTLR start "ruleContentElement"
    // InternalUpctforma.g:533:1: ruleContentElement returns [EObject current=null] : (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue | this_Number_13= ruleNumber | this_Literal_14= ruleLiteral ) ;
    public final EObject ruleContentElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContentElement_Impl_0 = null;

        EObject this_Column_1 = null;

        EObject this_Image_2 = null;

        EObject this_Widget_3 = null;

        EObject this_Text_4 = null;

        EObject this_Composite_Impl_5 = null;

        EObject this_Video_6 = null;

        EObject this_SimpleElement_Impl_7 = null;

        EObject this_PlaceHolder_8 = null;

        EObject this_Row_9 = null;

        EObject this_Game_10 = null;

        EObject this_RecordValue_11 = null;

        EObject this_ListValue_12 = null;

        EObject this_Number_13 = null;

        EObject this_Literal_14 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:539:2: ( (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue | this_Number_13= ruleNumber | this_Literal_14= ruleLiteral ) )
            // InternalUpctforma.g:540:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue | this_Number_13= ruleNumber | this_Literal_14= ruleLiteral )
            {
            // InternalUpctforma.g:540:2: (this_ContentElement_Impl_0= ruleContentElement_Impl | this_Column_1= ruleColumn | this_Image_2= ruleImage | this_Widget_3= ruleWidget | this_Text_4= ruleText | this_Composite_Impl_5= ruleComposite_Impl | this_Video_6= ruleVideo | this_SimpleElement_Impl_7= ruleSimpleElement_Impl | this_PlaceHolder_8= rulePlaceHolder | this_Row_9= ruleRow | this_Game_10= ruleGame | this_RecordValue_11= ruleRecordValue | this_ListValue_12= ruleListValue | this_Number_13= ruleNumber | this_Literal_14= ruleLiteral )
            int alt12=15;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            case 35:
                {
                alt12=5;
                }
                break;
            case 40:
                {
                alt12=6;
                }
                break;
            case 41:
                {
                alt12=7;
                }
                break;
            case 45:
                {
                alt12=8;
                }
                break;
            case 46:
                {
                alt12=9;
                }
                break;
            case 26:
                {
                alt12=10;
                }
                break;
            case 47:
                {
                alt12=11;
                }
                break;
            case 13:
                {
                alt12=12;
                }
                break;
            case 48:
                {
                alt12=13;
                }
                break;
            case 37:
                {
                alt12=14;
                }
                break;
            case 38:
                {
                alt12=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalUpctforma.g:541:3: this_ContentElement_Impl_0= ruleContentElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getContentElement_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentElement_Impl_0=ruleContentElement_Impl();

                    state._fsp--;


                    			current = this_ContentElement_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:550:3: this_Column_1= ruleColumn
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getColumnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Column_1=ruleColumn();

                    state._fsp--;


                    			current = this_Column_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:559:3: this_Image_2= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getImageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_2=ruleImage();

                    state._fsp--;


                    			current = this_Image_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:568:3: this_Widget_3= ruleWidget
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getWidgetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Widget_3=ruleWidget();

                    state._fsp--;


                    			current = this_Widget_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:577:3: this_Text_4= ruleText
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getTextParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Text_4=ruleText();

                    state._fsp--;


                    			current = this_Text_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalUpctforma.g:586:3: this_Composite_Impl_5= ruleComposite_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getComposite_ImplParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composite_Impl_5=ruleComposite_Impl();

                    state._fsp--;


                    			current = this_Composite_Impl_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalUpctforma.g:595:3: this_Video_6= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getVideoParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_6=ruleVideo();

                    state._fsp--;


                    			current = this_Video_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalUpctforma.g:604:3: this_SimpleElement_Impl_7= ruleSimpleElement_Impl
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getSimpleElement_ImplParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleElement_Impl_7=ruleSimpleElement_Impl();

                    state._fsp--;


                    			current = this_SimpleElement_Impl_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalUpctforma.g:613:3: this_PlaceHolder_8= rulePlaceHolder
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getPlaceHolderParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlaceHolder_8=rulePlaceHolder();

                    state._fsp--;


                    			current = this_PlaceHolder_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalUpctforma.g:622:3: this_Row_9= ruleRow
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getRowParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Row_9=ruleRow();

                    state._fsp--;


                    			current = this_Row_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalUpctforma.g:631:3: this_Game_10= ruleGame
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getGameParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Game_10=ruleGame();

                    state._fsp--;


                    			current = this_Game_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalUpctforma.g:640:3: this_RecordValue_11= ruleRecordValue
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getRecordValueParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_RecordValue_11=ruleRecordValue();

                    state._fsp--;


                    			current = this_RecordValue_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalUpctforma.g:649:3: this_ListValue_12= ruleListValue
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getListValueParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListValue_12=ruleListValue();

                    state._fsp--;


                    			current = this_ListValue_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalUpctforma.g:658:3: this_Number_13= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getNumberParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_13=ruleNumber();

                    state._fsp--;


                    			current = this_Number_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalUpctforma.g:667:3: this_Literal_14= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getContentElementAccess().getLiteralParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_14=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_14;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleContentElement"


    // $ANTLR start "entryRuleEString"
    // InternalUpctforma.g:679:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUpctforma.g:679:47: (iv_ruleEString= ruleEString EOF )
            // InternalUpctforma.g:680:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalUpctforma.g:686:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:692:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUpctforma.g:693:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUpctforma.g:693:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUpctforma.g:694:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:702:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleTemplateDef"
    // InternalUpctforma.g:713:1: entryRuleTemplateDef returns [EObject current=null] : iv_ruleTemplateDef= ruleTemplateDef EOF ;
    public final EObject entryRuleTemplateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDef = null;


        try {
            // InternalUpctforma.g:713:52: (iv_ruleTemplateDef= ruleTemplateDef EOF )
            // InternalUpctforma.g:714:2: iv_ruleTemplateDef= ruleTemplateDef EOF
            {
             newCompositeNode(grammarAccess.getTemplateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemplateDef=ruleTemplateDef();

            state._fsp--;

             current =iv_ruleTemplateDef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemplateDef"


    // $ANTLR start "ruleTemplateDef"
    // InternalUpctforma.g:720:1: ruleTemplateDef returns [EObject current=null] : ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleTemplateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_rows_4_0 = null;

        EObject lv_rows_6_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:726:2: ( ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' ) )
            // InternalUpctforma.g:727:2: ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' )
            {
            // InternalUpctforma.g:727:2: ( () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}' )
            // InternalUpctforma.g:728:3: () otherlv_1= 'TemplateDef' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )? otherlv_7= '}'
            {
            // InternalUpctforma.g:728:3: ()
            // InternalUpctforma.g:729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTemplateDefAccess().getTemplateDefAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTemplateDefAccess().getTemplateDefKeyword_1());
            		
            // InternalUpctforma.g:739:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:740:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:740:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:741:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTemplateDefAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemplateDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getTemplateDefAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:762:3: ( ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUpctforma.g:763:4: ( (lv_rows_4_0= ruleRow ) ) (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )*
                    {
                    // InternalUpctforma.g:763:4: ( (lv_rows_4_0= ruleRow ) )
                    // InternalUpctforma.g:764:5: (lv_rows_4_0= ruleRow )
                    {
                    // InternalUpctforma.g:764:5: (lv_rows_4_0= ruleRow )
                    // InternalUpctforma.g:765:6: lv_rows_4_0= ruleRow
                    {

                    						newCompositeNode(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_rows_4_0=ruleRow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTemplateDefRule());
                    						}
                    						add(
                    							current,
                    							"rows",
                    							lv_rows_4_0,
                    							"org.xtext.Upctforma.Row");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:782:4: (otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalUpctforma.g:783:5: otherlv_5= ',' ( (lv_rows_6_0= ruleRow ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_20); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTemplateDefAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalUpctforma.g:787:5: ( (lv_rows_6_0= ruleRow ) )
                    	    // InternalUpctforma.g:788:6: (lv_rows_6_0= ruleRow )
                    	    {
                    	    // InternalUpctforma.g:788:6: (lv_rows_6_0= ruleRow )
                    	    // InternalUpctforma.g:789:7: lv_rows_6_0= ruleRow
                    	    {

                    	    							newCompositeNode(grammarAccess.getTemplateDefAccess().getRowsRowParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_rows_6_0=ruleRow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTemplateDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rows",
                    	    								lv_rows_6_0,
                    	    								"org.xtext.Upctforma.Row");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTemplateDefAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTemplateDef"


    // $ANTLR start "entryRuleContentUnit"
    // InternalUpctforma.g:816:1: entryRuleContentUnit returns [EObject current=null] : iv_ruleContentUnit= ruleContentUnit EOF ;
    public final EObject entryRuleContentUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentUnit = null;


        try {
            // InternalUpctforma.g:816:52: (iv_ruleContentUnit= ruleContentUnit EOF )
            // InternalUpctforma.g:817:2: iv_ruleContentUnit= ruleContentUnit EOF
            {
             newCompositeNode(grammarAccess.getContentUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentUnit=ruleContentUnit();

            state._fsp--;

             current =iv_ruleContentUnit; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContentUnit"


    // $ANTLR start "ruleContentUnit"
    // InternalUpctforma.g:823:1: ruleContentUnit returns [EObject current=null] : (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) ( (lv_type_3_0= ruleContentUnitType ) ) ( (lv_language_4_0= ruleLanguageType ) ) otherlv_5= '{' ( (lv_sections_6_0= ruleSection ) ) (otherlv_7= ',' ( (lv_sections_8_0= ruleSection ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleContentUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_author_2_0 = null;

        Enumerator lv_type_3_0 = null;

        Enumerator lv_language_4_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_sections_8_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:829:2: ( (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) ( (lv_type_3_0= ruleContentUnitType ) ) ( (lv_language_4_0= ruleLanguageType ) ) otherlv_5= '{' ( (lv_sections_6_0= ruleSection ) ) (otherlv_7= ',' ( (lv_sections_8_0= ruleSection ) ) )* otherlv_9= '}' ) )
            // InternalUpctforma.g:830:2: (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) ( (lv_type_3_0= ruleContentUnitType ) ) ( (lv_language_4_0= ruleLanguageType ) ) otherlv_5= '{' ( (lv_sections_6_0= ruleSection ) ) (otherlv_7= ',' ( (lv_sections_8_0= ruleSection ) ) )* otherlv_9= '}' )
            {
            // InternalUpctforma.g:830:2: (otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) ( (lv_type_3_0= ruleContentUnitType ) ) ( (lv_language_4_0= ruleLanguageType ) ) otherlv_5= '{' ( (lv_sections_6_0= ruleSection ) ) (otherlv_7= ',' ( (lv_sections_8_0= ruleSection ) ) )* otherlv_9= '}' )
            // InternalUpctforma.g:831:3: otherlv_0= 'Unit' ( (lv_name_1_0= ruleEString ) ) ( (lv_author_2_0= ruleEString ) ) ( (lv_type_3_0= ruleContentUnitType ) ) ( (lv_language_4_0= ruleLanguageType ) ) otherlv_5= '{' ( (lv_sections_6_0= ruleSection ) ) (otherlv_7= ',' ( (lv_sections_8_0= ruleSection ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContentUnitAccess().getUnitKeyword_0());
            		
            // InternalUpctforma.g:835:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctforma.g:836:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctforma.g:836:4: (lv_name_1_0= ruleEString )
            // InternalUpctforma.g:837:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContentUnitAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentUnitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:854:3: ( (lv_author_2_0= ruleEString ) )
            // InternalUpctforma.g:855:4: (lv_author_2_0= ruleEString )
            {
            // InternalUpctforma.g:855:4: (lv_author_2_0= ruleEString )
            // InternalUpctforma.g:856:5: lv_author_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContentUnitAccess().getAuthorEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_author_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentUnitRule());
            					}
            					set(
            						current,
            						"author",
            						lv_author_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:873:3: ( (lv_type_3_0= ruleContentUnitType ) )
            // InternalUpctforma.g:874:4: (lv_type_3_0= ruleContentUnitType )
            {
            // InternalUpctforma.g:874:4: (lv_type_3_0= ruleContentUnitType )
            // InternalUpctforma.g:875:5: lv_type_3_0= ruleContentUnitType
            {

            					newCompositeNode(grammarAccess.getContentUnitAccess().getTypeContentUnitTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_3_0=ruleContentUnitType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentUnitRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.Upctforma.ContentUnitType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:892:3: ( (lv_language_4_0= ruleLanguageType ) )
            // InternalUpctforma.g:893:4: (lv_language_4_0= ruleLanguageType )
            {
            // InternalUpctforma.g:893:4: (lv_language_4_0= ruleLanguageType )
            // InternalUpctforma.g:894:5: lv_language_4_0= ruleLanguageType
            {

            					newCompositeNode(grammarAccess.getContentUnitAccess().getLanguageLanguageTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_language_4_0=ruleLanguageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentUnitRule());
            					}
            					set(
            						current,
            						"language",
            						lv_language_4_0,
            						"org.xtext.Upctforma.LanguageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getContentUnitAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUpctforma.g:915:3: ( (lv_sections_6_0= ruleSection ) )
            // InternalUpctforma.g:916:4: (lv_sections_6_0= ruleSection )
            {
            // InternalUpctforma.g:916:4: (lv_sections_6_0= ruleSection )
            // InternalUpctforma.g:917:5: lv_sections_6_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_sections_6_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContentUnitRule());
            					}
            					add(
            						current,
            						"sections",
            						lv_sections_6_0,
            						"org.xtext.Upctforma.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:934:3: (otherlv_7= ',' ( (lv_sections_8_0= ruleSection ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUpctforma.g:935:4: otherlv_7= ',' ( (lv_sections_8_0= ruleSection ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_23); 

            	    				newLeafNode(otherlv_7, grammarAccess.getContentUnitAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalUpctforma.g:939:4: ( (lv_sections_8_0= ruleSection ) )
            	    // InternalUpctforma.g:940:5: (lv_sections_8_0= ruleSection )
            	    {
            	    // InternalUpctforma.g:940:5: (lv_sections_8_0= ruleSection )
            	    // InternalUpctforma.g:941:6: lv_sections_8_0= ruleSection
            	    {

            	    						newCompositeNode(grammarAccess.getContentUnitAccess().getSectionsSectionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_sections_8_0=ruleSection();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContentUnitRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sections",
            	    							lv_sections_8_0,
            	    							"org.xtext.Upctforma.Section");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContentUnitAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleContentUnit"


    // $ANTLR start "entryRuleType_Impl"
    // InternalUpctforma.g:967:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalUpctforma.g:967:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalUpctforma.g:968:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalUpctforma.g:974:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:980:2: ( ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUpctforma.g:981:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUpctforma.g:981:2: ( () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUpctforma.g:982:3: () otherlv_1= 'Type' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUpctforma.g:982:3: ()
            // InternalUpctforma.g:983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		
            // InternalUpctforma.g:993:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:994:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:994:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:995:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleRow"
    // InternalUpctforma.g:1016:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalUpctforma.g:1016:44: (iv_ruleRow= ruleRow EOF )
            // InternalUpctforma.g:1017:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalUpctforma.g:1023:1: ruleRow returns [EObject current=null] : ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;

        EObject lv_usetemplate_7_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1029:2: ( ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' ) )
            // InternalUpctforma.g:1030:2: ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' )
            {
            // InternalUpctforma.g:1030:2: ( () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}' )
            // InternalUpctforma.g:1031:3: () otherlv_1= 'row' otherlv_2= '{' ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )? (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )? otherlv_8= '}'
            {
            // InternalUpctforma.g:1031:3: ()
            // InternalUpctforma.g:1032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getRowKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getRowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1046:3: ( ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUpctforma.g:1047:4: ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    {
                    // InternalUpctforma.g:1047:4: ( (lv_columns_3_0= ruleColumn ) )
                    // InternalUpctforma.g:1048:5: (lv_columns_3_0= ruleColumn )
                    {
                    // InternalUpctforma.g:1048:5: (lv_columns_3_0= ruleColumn )
                    // InternalUpctforma.g:1049:6: lv_columns_3_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_columns_3_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_3_0,
                    							"org.xtext.Upctforma.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1066:4: (otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalUpctforma.g:1067:5: otherlv_4= ',' ( (lv_columns_5_0= ruleColumn ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRowAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalUpctforma.g:1071:5: ( (lv_columns_5_0= ruleColumn ) )
                    	    // InternalUpctforma.g:1072:6: (lv_columns_5_0= ruleColumn )
                    	    {
                    	    // InternalUpctforma.g:1072:6: (lv_columns_5_0= ruleColumn )
                    	    // InternalUpctforma.g:1073:7: lv_columns_5_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_columns_5_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_5_0,
                    	    								"org.xtext.Upctforma.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalUpctforma.g:1092:3: (otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUpctforma.g:1093:4: otherlv_6= 'usetemplate' ( (lv_usetemplate_7_0= ruleUseTemplate ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getRowAccess().getUsetemplateKeyword_4_0());
                    			
                    // InternalUpctforma.g:1097:4: ( (lv_usetemplate_7_0= ruleUseTemplate ) )
                    // InternalUpctforma.g:1098:5: (lv_usetemplate_7_0= ruleUseTemplate )
                    {
                    // InternalUpctforma.g:1098:5: (lv_usetemplate_7_0= ruleUseTemplate )
                    // InternalUpctforma.g:1099:6: lv_usetemplate_7_0= ruleUseTemplate
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getUsetemplateUseTemplateParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_usetemplate_7_0=ruleUseTemplate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						set(
                    							current,
                    							"usetemplate",
                    							lv_usetemplate_7_0,
                    							"org.xtext.Upctforma.UseTemplate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRowAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalUpctforma.g:1125:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalUpctforma.g:1125:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalUpctforma.g:1126:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalUpctforma.g:1132:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_width_4_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1138:2: ( ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' ) )
            // InternalUpctforma.g:1139:2: ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' )
            {
            // InternalUpctforma.g:1139:2: ( () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' )
            // InternalUpctforma.g:1140:3: () otherlv_1= 'column' otherlv_2= '{' (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )? ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}'
            {
            // InternalUpctforma.g:1140:3: ()
            // InternalUpctforma.g:1141:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1155:3: (otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUpctforma.g:1156:4: otherlv_3= 'width' ( (lv_width_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getWidthKeyword_3_0());
                    			
                    // InternalUpctforma.g:1160:4: ( (lv_width_4_0= ruleEString ) )
                    // InternalUpctforma.g:1161:5: (lv_width_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:1161:5: (lv_width_4_0= ruleEString )
                    // InternalUpctforma.g:1162:6: lv_width_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getWidthEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_width_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_4_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:1180:3: ( ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13||LA22_0==26||LA22_0==28||(LA22_0>=30 && LA22_0<=31)||LA22_0==33||LA22_0==35||(LA22_0>=37 && LA22_0<=38)||(LA22_0>=40 && LA22_0<=41)||(LA22_0>=45 && LA22_0<=48)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUpctforma.g:1181:4: ( (lv_elements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )*
                    {
                    // InternalUpctforma.g:1181:4: ( (lv_elements_5_0= ruleContentElement ) )
                    // InternalUpctforma.g:1182:5: (lv_elements_5_0= ruleContentElement )
                    {
                    // InternalUpctforma.g:1182:5: (lv_elements_5_0= ruleContentElement )
                    // InternalUpctforma.g:1183:6: lv_elements_5_0= ruleContentElement
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elements_5_0=ruleContentElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_5_0,
                    							"org.xtext.Upctforma.ContentElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1200:4: (otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==16) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalUpctforma.g:1201:5: otherlv_6= ',' ( (lv_elements_7_0= ruleContentElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_30); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalUpctforma.g:1205:5: ( (lv_elements_7_0= ruleContentElement ) )
                    	    // InternalUpctforma.g:1206:6: (lv_elements_7_0= ruleContentElement )
                    	    {
                    	    // InternalUpctforma.g:1206:6: (lv_elements_7_0= ruleContentElement )
                    	    // InternalUpctforma.g:1207:7: lv_elements_7_0= ruleContentElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getElementsContentElementParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elements_7_0=ruleContentElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getColumnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"org.xtext.Upctforma.ContentElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleUseTemplate"
    // InternalUpctforma.g:1234:1: entryRuleUseTemplate returns [EObject current=null] : iv_ruleUseTemplate= ruleUseTemplate EOF ;
    public final EObject entryRuleUseTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseTemplate = null;


        try {
            // InternalUpctforma.g:1234:52: (iv_ruleUseTemplate= ruleUseTemplate EOF )
            // InternalUpctforma.g:1235:2: iv_ruleUseTemplate= ruleUseTemplate EOF
            {
             newCompositeNode(grammarAccess.getUseTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseTemplate=ruleUseTemplate();

            state._fsp--;

             current =iv_ruleUseTemplate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseTemplate"


    // $ANTLR start "ruleUseTemplate"
    // InternalUpctforma.g:1241:1: ruleUseTemplate returns [EObject current=null] : ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_templateelements_3_0= ruleContentElement ) ) (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleUseTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_templateelements_3_0 = null;

        EObject lv_templateelements_5_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1247:2: ( ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_templateelements_3_0= ruleContentElement ) ) (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )* )? otherlv_6= '}' ) )
            // InternalUpctforma.g:1248:2: ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_templateelements_3_0= ruleContentElement ) ) (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )* )? otherlv_6= '}' )
            {
            // InternalUpctforma.g:1248:2: ( () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_templateelements_3_0= ruleContentElement ) ) (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )* )? otherlv_6= '}' )
            // InternalUpctforma.g:1249:3: () ( ( ruleEString ) )? (otherlv_2= '{' ( (lv_templateelements_3_0= ruleContentElement ) ) (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )* )? otherlv_6= '}'
            {
            // InternalUpctforma.g:1249:3: ()
            // InternalUpctforma.g:1250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseTemplateAccess().getUseTemplateAction_0(),
            					current);
            			

            }

            // InternalUpctforma.g:1256:3: ( ( ruleEString ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUpctforma.g:1257:4: ( ruleEString )
                    {
                    // InternalUpctforma.g:1257:4: ( ruleEString )
                    // InternalUpctforma.g:1258:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getUseTemplateRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getUseTemplateAccess().getTypetemplateTemplateDefCrossReference_1_0());
                    				
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUpctforma.g:1272:3: (otherlv_2= '{' ( (lv_templateelements_3_0= ruleContentElement ) ) (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUpctforma.g:1273:4: otherlv_2= '{' ( (lv_templateelements_3_0= ruleContentElement ) ) (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )*
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseTemplateAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalUpctforma.g:1277:4: ( (lv_templateelements_3_0= ruleContentElement ) )
                    // InternalUpctforma.g:1278:5: (lv_templateelements_3_0= ruleContentElement )
                    {
                    // InternalUpctforma.g:1278:5: (lv_templateelements_3_0= ruleContentElement )
                    // InternalUpctforma.g:1279:6: lv_templateelements_3_0= ruleContentElement
                    {

                    						newCompositeNode(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_templateelements_3_0=ruleContentElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    						}
                    						add(
                    							current,
                    							"templateelements",
                    							lv_templateelements_3_0,
                    							"org.xtext.Upctforma.ContentElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1296:4: (otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalUpctforma.g:1297:5: otherlv_4= ',' ( (lv_templateelements_5_0= ruleContentElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_30); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getUseTemplateAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalUpctforma.g:1301:5: ( (lv_templateelements_5_0= ruleContentElement ) )
                    	    // InternalUpctforma.g:1302:6: (lv_templateelements_5_0= ruleContentElement )
                    	    {
                    	    // InternalUpctforma.g:1302:6: (lv_templateelements_5_0= ruleContentElement )
                    	    // InternalUpctforma.g:1303:7: lv_templateelements_5_0= ruleContentElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseTemplateAccess().getTemplateelementsContentElementParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_templateelements_5_0=ruleContentElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseTemplateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"templateelements",
                    	    								lv_templateelements_5_0,
                    	    								"org.xtext.Upctforma.ContentElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUseTemplateAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleUseTemplate"


    // $ANTLR start "entryRuleContentElement_Impl"
    // InternalUpctforma.g:1330:1: entryRuleContentElement_Impl returns [EObject current=null] : iv_ruleContentElement_Impl= ruleContentElement_Impl EOF ;
    public final EObject entryRuleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentElement_Impl = null;


        try {
            // InternalUpctforma.g:1330:60: (iv_ruleContentElement_Impl= ruleContentElement_Impl EOF )
            // InternalUpctforma.g:1331:2: iv_ruleContentElement_Impl= ruleContentElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getContentElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentElement_Impl=ruleContentElement_Impl();

            state._fsp--;

             current =iv_ruleContentElement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContentElement_Impl"


    // $ANTLR start "ruleContentElement_Impl"
    // InternalUpctforma.g:1337:1: ruleContentElement_Impl returns [EObject current=null] : ( () otherlv_1= 'ContentElement' ) ;
    public final EObject ruleContentElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1343:2: ( ( () otherlv_1= 'ContentElement' ) )
            // InternalUpctforma.g:1344:2: ( () otherlv_1= 'ContentElement' )
            {
            // InternalUpctforma.g:1344:2: ( () otherlv_1= 'ContentElement' )
            // InternalUpctforma.g:1345:3: () otherlv_1= 'ContentElement'
            {
            // InternalUpctforma.g:1345:3: ()
            // InternalUpctforma.g:1346:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContentElement_ImplAccess().getContentElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getContentElement_ImplAccess().getContentElementKeyword_1());
            		

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
    // $ANTLR end "ruleContentElement_Impl"


    // $ANTLR start "entryRuleImage"
    // InternalUpctforma.g:1360:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalUpctforma.g:1360:46: (iv_ruleImage= ruleImage EOF )
            // InternalUpctforma.g:1361:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalUpctforma.g:1367:1: ruleImage returns [EObject current=null] : ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= ',' ( (lv_type_6_0= ruleImageType ) ) otherlv_7= '}' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_url_4_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1373:2: ( ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= ',' ( (lv_type_6_0= ruleImageType ) ) otherlv_7= '}' ) )
            // InternalUpctforma.g:1374:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= ',' ( (lv_type_6_0= ruleImageType ) ) otherlv_7= '}' )
            {
            // InternalUpctforma.g:1374:2: ( () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= ',' ( (lv_type_6_0= ruleImageType ) ) otherlv_7= '}' )
            // InternalUpctforma.g:1375:3: () otherlv_1= 'Image' otherlv_2= '{' (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )? otherlv_5= ',' ( (lv_type_6_0= ruleImageType ) ) otherlv_7= '}'
            {
            // InternalUpctforma.g:1375:3: ()
            // InternalUpctforma.g:1376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImageAccess().getImageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getImageKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getImageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1390:3: (otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUpctforma.g:1391:4: otherlv_3= 'url' ( (lv_url_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getImageAccess().getUrlKeyword_3_0());
                    			
                    // InternalUpctforma.g:1395:4: ( (lv_url_4_0= ruleEString ) )
                    // InternalUpctforma.g:1396:5: (lv_url_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:1396:5: (lv_url_4_0= ruleEString )
                    // InternalUpctforma.g:1397:6: lv_url_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImageAccess().getUrlEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_url_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImageRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_4_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_5, grammarAccess.getImageAccess().getCommaKeyword_4());
            		
            // InternalUpctforma.g:1419:3: ( (lv_type_6_0= ruleImageType ) )
            // InternalUpctforma.g:1420:4: (lv_type_6_0= ruleImageType )
            {
            // InternalUpctforma.g:1420:4: (lv_type_6_0= ruleImageType )
            // InternalUpctforma.g:1421:5: lv_type_6_0= ruleImageType
            {

            					newCompositeNode(grammarAccess.getImageAccess().getTypeImageTypeEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_type_6_0=ruleImageType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"org.xtext.Upctforma.ImageType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImageAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleWidget"
    // InternalUpctforma.g:1446:1: entryRuleWidget returns [EObject current=null] : iv_ruleWidget= ruleWidget EOF ;
    public final EObject entryRuleWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidget = null;


        try {
            // InternalUpctforma.g:1446:47: (iv_ruleWidget= ruleWidget EOF )
            // InternalUpctforma.g:1447:2: iv_ruleWidget= ruleWidget EOF
            {
             newCompositeNode(grammarAccess.getWidgetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidget=ruleWidget();

            state._fsp--;

             current =iv_ruleWidget; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWidget"


    // $ANTLR start "ruleWidget"
    // InternalUpctforma.g:1453:1: ruleWidget returns [EObject current=null] : (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetelements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_widgetelements_5_0 = null;

        EObject lv_widgetelements_7_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1459:2: ( (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetelements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' ) )
            // InternalUpctforma.g:1460:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetelements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' )
            {
            // InternalUpctforma.g:1460:2: (otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetelements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}' )
            // InternalUpctforma.g:1461:3: otherlv_0= 'Widget' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_widgetelements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWidgetAccess().getWidgetKeyword_0());
            		
            // InternalUpctforma.g:1465:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUpctforma.g:1466:4: (lv_name_1_0= ruleEString )
            {
            // InternalUpctforma.g:1466:4: (lv_name_1_0= ruleEString )
            // InternalUpctforma.g:1467:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWidgetAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getWidgetAccess().getColonKeyword_2());
            		
            // InternalUpctforma.g:1488:3: ( ( ruleEString ) )
            // InternalUpctforma.g:1489:4: ( ruleEString )
            {
            // InternalUpctforma.g:1489:4: ( ruleEString )
            // InternalUpctforma.g:1490:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWidgetAccess().getWidgettypeWidgetTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:1504:3: (otherlv_4= '{' ( (lv_widgetelements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUpctforma.g:1505:4: otherlv_4= '{' ( (lv_widgetelements_5_0= ruleContentElement ) ) (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getWidgetAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalUpctforma.g:1509:4: ( (lv_widgetelements_5_0= ruleContentElement ) )
                    // InternalUpctforma.g:1510:5: (lv_widgetelements_5_0= ruleContentElement )
                    {
                    // InternalUpctforma.g:1510:5: (lv_widgetelements_5_0= ruleContentElement )
                    // InternalUpctforma.g:1511:6: lv_widgetelements_5_0= ruleContentElement
                    {

                    						newCompositeNode(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_widgetelements_5_0=ruleContentElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWidgetRule());
                    						}
                    						add(
                    							current,
                    							"widgetelements",
                    							lv_widgetelements_5_0,
                    							"org.xtext.Upctforma.ContentElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:1528:4: (otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalUpctforma.g:1529:5: otherlv_6= ',' ( (lv_widgetelements_7_0= ruleContentElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_30); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getWidgetAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalUpctforma.g:1533:5: ( (lv_widgetelements_7_0= ruleContentElement ) )
                    	    // InternalUpctforma.g:1534:6: (lv_widgetelements_7_0= ruleContentElement )
                    	    {
                    	    // InternalUpctforma.g:1534:6: (lv_widgetelements_7_0= ruleContentElement )
                    	    // InternalUpctforma.g:1535:7: lv_widgetelements_7_0= ruleContentElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getWidgetAccess().getWidgetelementsContentElementParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_widgetelements_7_0=ruleContentElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWidgetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"widgetelements",
                    	    								lv_widgetelements_7_0,
                    	    								"org.xtext.Upctforma.ContentElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWidgetAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleWidget"


    // $ANTLR start "entryRuleText"
    // InternalUpctforma.g:1562:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalUpctforma.g:1562:45: (iv_ruleText= ruleText EOF )
            // InternalUpctforma.g:1563:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalUpctforma.g:1569:1: ruleText returns [EObject current=null] : (otherlv_0= 'Text' otherlv_1= '{' (otherlv_2= 'html' ( (lv_html_3_0= ruleEString ) ) )? otherlv_4= '}' ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_html_3_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1575:2: ( (otherlv_0= 'Text' otherlv_1= '{' (otherlv_2= 'html' ( (lv_html_3_0= ruleEString ) ) )? otherlv_4= '}' ) )
            // InternalUpctforma.g:1576:2: (otherlv_0= 'Text' otherlv_1= '{' (otherlv_2= 'html' ( (lv_html_3_0= ruleEString ) ) )? otherlv_4= '}' )
            {
            // InternalUpctforma.g:1576:2: (otherlv_0= 'Text' otherlv_1= '{' (otherlv_2= 'html' ( (lv_html_3_0= ruleEString ) ) )? otherlv_4= '}' )
            // InternalUpctforma.g:1577:3: otherlv_0= 'Text' otherlv_1= '{' (otherlv_2= 'html' ( (lv_html_3_0= ruleEString ) ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAccess().getTextKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctforma.g:1585:3: (otherlv_2= 'html' ( (lv_html_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUpctforma.g:1586:4: otherlv_2= 'html' ( (lv_html_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextAccess().getHtmlKeyword_2_0());
                    			
                    // InternalUpctforma.g:1590:4: ( (lv_html_3_0= ruleEString ) )
                    // InternalUpctforma.g:1591:5: (lv_html_3_0= ruleEString )
                    {
                    // InternalUpctforma.g:1591:5: (lv_html_3_0= ruleEString )
                    // InternalUpctforma.g:1592:6: lv_html_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAccess().getHtmlEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_html_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextRule());
                    						}
                    						set(
                    							current,
                    							"html",
                    							lv_html_3_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTextAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleNumber"
    // InternalUpctforma.g:1618:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalUpctforma.g:1618:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalUpctforma.g:1619:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalUpctforma.g:1625:1: ruleNumber returns [EObject current=null] : (otherlv_0= 'Int' otherlv_1= '{' ( (lv_num_2_0= ruleEInt ) )? otherlv_3= '}' ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_num_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1631:2: ( (otherlv_0= 'Int' otherlv_1= '{' ( (lv_num_2_0= ruleEInt ) )? otherlv_3= '}' ) )
            // InternalUpctforma.g:1632:2: (otherlv_0= 'Int' otherlv_1= '{' ( (lv_num_2_0= ruleEInt ) )? otherlv_3= '}' )
            {
            // InternalUpctforma.g:1632:2: (otherlv_0= 'Int' otherlv_1= '{' ( (lv_num_2_0= ruleEInt ) )? otherlv_3= '}' )
            // InternalUpctforma.g:1633:3: otherlv_0= 'Int' otherlv_1= '{' ( (lv_num_2_0= ruleEInt ) )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNumberAccess().getIntKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getNumberAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctforma.g:1641:3: ( (lv_num_2_0= ruleEInt ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==39) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUpctforma.g:1642:4: (lv_num_2_0= ruleEInt )
                    {
                    // InternalUpctforma.g:1642:4: (lv_num_2_0= ruleEInt )
                    // InternalUpctforma.g:1643:5: lv_num_2_0= ruleEInt
                    {

                    					newCompositeNode(grammarAccess.getNumberAccess().getNumEIntParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_num_2_0=ruleEInt();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNumberRule());
                    					}
                    					set(
                    						current,
                    						"num",
                    						lv_num_2_0,
                    						"org.xtext.Upctforma.EInt");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNumberAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleLiteral"
    // InternalUpctforma.g:1668:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalUpctforma.g:1668:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalUpctforma.g:1669:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalUpctforma.g:1675:1: ruleLiteral returns [EObject current=null] : (otherlv_0= 'Literal' otherlv_1= '{' ( (lv_literal_2_0= ruleEString ) )? otherlv_3= '}' ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_literal_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1681:2: ( (otherlv_0= 'Literal' otherlv_1= '{' ( (lv_literal_2_0= ruleEString ) )? otherlv_3= '}' ) )
            // InternalUpctforma.g:1682:2: (otherlv_0= 'Literal' otherlv_1= '{' ( (lv_literal_2_0= ruleEString ) )? otherlv_3= '}' )
            {
            // InternalUpctforma.g:1682:2: (otherlv_0= 'Literal' otherlv_1= '{' ( (lv_literal_2_0= ruleEString ) )? otherlv_3= '}' )
            // InternalUpctforma.g:1683:3: otherlv_0= 'Literal' otherlv_1= '{' ( (lv_literal_2_0= ruleEString ) )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLiteralAccess().getLiteralKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctforma.g:1691:3: ( (lv_literal_2_0= ruleEString ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUpctforma.g:1692:4: (lv_literal_2_0= ruleEString )
                    {
                    // InternalUpctforma.g:1692:4: (lv_literal_2_0= ruleEString )
                    // InternalUpctforma.g:1693:5: lv_literal_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getLiteralAccess().getLiteralEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_literal_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLiteralRule());
                    					}
                    					set(
                    						current,
                    						"literal",
                    						lv_literal_2_0,
                    						"org.xtext.Upctforma.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleEInt"
    // InternalUpctforma.g:1718:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalUpctforma.g:1718:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalUpctforma.g:1719:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalUpctforma.g:1725:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1731:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalUpctforma.g:1732:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalUpctforma.g:1732:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalUpctforma.g:1733:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalUpctforma.g:1733:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUpctforma.g:1734:4: kw= '-'
                    {
                    kw=(Token)match(input,39,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleComposite_Impl"
    // InternalUpctforma.g:1751:1: entryRuleComposite_Impl returns [EObject current=null] : iv_ruleComposite_Impl= ruleComposite_Impl EOF ;
    public final EObject entryRuleComposite_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposite_Impl = null;


        try {
            // InternalUpctforma.g:1751:55: (iv_ruleComposite_Impl= ruleComposite_Impl EOF )
            // InternalUpctforma.g:1752:2: iv_ruleComposite_Impl= ruleComposite_Impl EOF
            {
             newCompositeNode(grammarAccess.getComposite_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposite_Impl=ruleComposite_Impl();

            state._fsp--;

             current =iv_ruleComposite_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComposite_Impl"


    // $ANTLR start "ruleComposite_Impl"
    // InternalUpctforma.g:1758:1: ruleComposite_Impl returns [EObject current=null] : ( () otherlv_1= 'Composite' ) ;
    public final EObject ruleComposite_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1764:2: ( ( () otherlv_1= 'Composite' ) )
            // InternalUpctforma.g:1765:2: ( () otherlv_1= 'Composite' )
            {
            // InternalUpctforma.g:1765:2: ( () otherlv_1= 'Composite' )
            // InternalUpctforma.g:1766:3: () otherlv_1= 'Composite'
            {
            // InternalUpctforma.g:1766:3: ()
            // InternalUpctforma.g:1767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComposite_ImplAccess().getCompositeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getComposite_ImplAccess().getCompositeKeyword_1());
            		

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
    // $ANTLR end "ruleComposite_Impl"


    // $ANTLR start "entryRuleVideo"
    // InternalUpctforma.g:1781:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalUpctforma.g:1781:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalUpctforma.g:1782:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalUpctforma.g:1788:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= ',' (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? otherlv_8= ',' (otherlv_9= 'type' ( (lv_type_10_0= ruleVideoType ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_type_10_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1794:2: ( ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= ',' (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? otherlv_8= ',' (otherlv_9= 'type' ( (lv_type_10_0= ruleVideoType ) ) )? otherlv_11= '}' ) )
            // InternalUpctforma.g:1795:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= ',' (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? otherlv_8= ',' (otherlv_9= 'type' ( (lv_type_10_0= ruleVideoType ) ) )? otherlv_11= '}' )
            {
            // InternalUpctforma.g:1795:2: ( () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= ',' (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? otherlv_8= ',' (otherlv_9= 'type' ( (lv_type_10_0= ruleVideoType ) ) )? otherlv_11= '}' )
            // InternalUpctforma.g:1796:3: () otherlv_1= 'Video' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= ',' (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? otherlv_8= ',' (otherlv_9= 'type' ( (lv_type_10_0= ruleVideoType ) ) )? otherlv_11= '}'
            {
            // InternalUpctforma.g:1796:3: ()
            // InternalUpctforma.g:1797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:1811:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUpctforma.g:1812:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getIdKeyword_3_0());
                    			
                    // InternalUpctforma.g:1816:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalUpctforma.g:1817:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:1817:5: (lv_id_4_0= ruleEString )
                    // InternalUpctforma.g:1818:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_5, grammarAccess.getVideoAccess().getCommaKeyword_4());
            		
            // InternalUpctforma.g:1840:3: (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==43) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUpctforma.g:1841:4: otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getVideoAccess().getTitleKeyword_5_0());
                    			
                    // InternalUpctforma.g:1845:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalUpctforma.g:1846:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalUpctforma.g:1846:5: (lv_title_7_0= ruleEString )
                    // InternalUpctforma.g:1847:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getTitleEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_title_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_7_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getCommaKeyword_6());
            		
            // InternalUpctforma.g:1869:3: (otherlv_9= 'type' ( (lv_type_10_0= ruleVideoType ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==44) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUpctforma.g:1870:4: otherlv_9= 'type' ( (lv_type_10_0= ruleVideoType ) )
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_43); 

                    				newLeafNode(otherlv_9, grammarAccess.getVideoAccess().getTypeKeyword_7_0());
                    			
                    // InternalUpctforma.g:1874:4: ( (lv_type_10_0= ruleVideoType ) )
                    // InternalUpctforma.g:1875:5: (lv_type_10_0= ruleVideoType )
                    {
                    // InternalUpctforma.g:1875:5: (lv_type_10_0= ruleVideoType )
                    // InternalUpctforma.g:1876:6: lv_type_10_0= ruleVideoType
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getTypeVideoTypeEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_10_0=ruleVideoType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"org.xtext.Upctforma.VideoType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleSimpleElement_Impl"
    // InternalUpctforma.g:1902:1: entryRuleSimpleElement_Impl returns [EObject current=null] : iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF ;
    public final EObject entryRuleSimpleElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleElement_Impl = null;


        try {
            // InternalUpctforma.g:1902:59: (iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF )
            // InternalUpctforma.g:1903:2: iv_ruleSimpleElement_Impl= ruleSimpleElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getSimpleElement_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleElement_Impl=ruleSimpleElement_Impl();

            state._fsp--;

             current =iv_ruleSimpleElement_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleElement_Impl"


    // $ANTLR start "ruleSimpleElement_Impl"
    // InternalUpctforma.g:1909:1: ruleSimpleElement_Impl returns [EObject current=null] : ( () otherlv_1= 'SimpleElement' ) ;
    public final EObject ruleSimpleElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1915:2: ( ( () otherlv_1= 'SimpleElement' ) )
            // InternalUpctforma.g:1916:2: ( () otherlv_1= 'SimpleElement' )
            {
            // InternalUpctforma.g:1916:2: ( () otherlv_1= 'SimpleElement' )
            // InternalUpctforma.g:1917:3: () otherlv_1= 'SimpleElement'
            {
            // InternalUpctforma.g:1917:3: ()
            // InternalUpctforma.g:1918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleElement_ImplAccess().getSimpleElementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleElement_ImplAccess().getSimpleElementKeyword_1());
            		

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
    // $ANTLR end "ruleSimpleElement_Impl"


    // $ANTLR start "entryRulePlaceHolder"
    // InternalUpctforma.g:1932:1: entryRulePlaceHolder returns [EObject current=null] : iv_rulePlaceHolder= rulePlaceHolder EOF ;
    public final EObject entryRulePlaceHolder() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaceHolder = null;


        try {
            // InternalUpctforma.g:1932:52: (iv_rulePlaceHolder= rulePlaceHolder EOF )
            // InternalUpctforma.g:1933:2: iv_rulePlaceHolder= rulePlaceHolder EOF
            {
             newCompositeNode(grammarAccess.getPlaceHolderRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlaceHolder=rulePlaceHolder();

            state._fsp--;

             current =iv_rulePlaceHolder; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlaceHolder"


    // $ANTLR start "rulePlaceHolder"
    // InternalUpctforma.g:1939:1: rulePlaceHolder returns [EObject current=null] : (otherlv_0= 'Placeholder' ( ( ruleEPrimitiveTypes ) ) ) ;
    public final EObject rulePlaceHolder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalUpctforma.g:1945:2: ( (otherlv_0= 'Placeholder' ( ( ruleEPrimitiveTypes ) ) ) )
            // InternalUpctforma.g:1946:2: (otherlv_0= 'Placeholder' ( ( ruleEPrimitiveTypes ) ) )
            {
            // InternalUpctforma.g:1946:2: (otherlv_0= 'Placeholder' ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:1947:3: otherlv_0= 'Placeholder' ( ( ruleEPrimitiveTypes ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaceHolderAccess().getPlaceholderKeyword_0());
            		
            // InternalUpctforma.g:1951:3: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:1952:4: ( ruleEPrimitiveTypes )
            {
            // InternalUpctforma.g:1952:4: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:1953:5: ruleEPrimitiveTypes
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaceHolderRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPlaceHolderAccess().getTypeTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "rulePlaceHolder"


    // $ANTLR start "entryRuleGame"
    // InternalUpctforma.g:1971:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalUpctforma.g:1971:45: (iv_ruleGame= ruleGame EOF )
            // InternalUpctforma.g:1972:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalUpctforma.g:1978:1: ruleGame returns [EObject current=null] : ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:1984:2: ( ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalUpctforma.g:1985:2: ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalUpctforma.g:1985:2: ( () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalUpctforma.g:1986:3: () otherlv_1= 'Game' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalUpctforma.g:1986:3: ()
            // InternalUpctforma.g:1987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGameAccess().getGameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameAccess().getGameKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUpctforma.g:2001:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUpctforma.g:2002:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGameAccess().getIdKeyword_3_0());
                    			
                    // InternalUpctforma.g:2006:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalUpctforma.g:2007:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalUpctforma.g:2007:5: (lv_id_4_0= ruleEString )
                    // InternalUpctforma.g:2008:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGameAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGameRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleFieldValue"
    // InternalUpctforma.g:2034:1: entryRuleFieldValue returns [EObject current=null] : iv_ruleFieldValue= ruleFieldValue EOF ;
    public final EObject entryRuleFieldValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldValue = null;


        try {
            // InternalUpctforma.g:2034:51: (iv_ruleFieldValue= ruleFieldValue EOF )
            // InternalUpctforma.g:2035:2: iv_ruleFieldValue= ruleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldValue=ruleFieldValue();

            state._fsp--;

             current =iv_ruleFieldValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // InternalUpctforma.g:2041:1: ruleFieldValue returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_fieldvalue_2_0= ruleContentElement ) ) ) ;
    public final EObject ruleFieldValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_fieldvalue_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2047:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_fieldvalue_2_0= ruleContentElement ) ) ) )
            // InternalUpctforma.g:2048:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_fieldvalue_2_0= ruleContentElement ) ) )
            {
            // InternalUpctforma.g:2048:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_fieldvalue_2_0= ruleContentElement ) ) )
            // InternalUpctforma.g:2049:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_fieldvalue_2_0= ruleContentElement ) )
            {
            // InternalUpctforma.g:2049:3: ( (lv_name_0_0= ruleEString ) )
            // InternalUpctforma.g:2050:4: (lv_name_0_0= ruleEString )
            {
            // InternalUpctforma.g:2050:4: (lv_name_0_0= ruleEString )
            // InternalUpctforma.g:2051:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldValueAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldValueRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldValueAccess().getColonKeyword_1());
            		
            // InternalUpctforma.g:2072:3: ( (lv_fieldvalue_2_0= ruleContentElement ) )
            // InternalUpctforma.g:2073:4: (lv_fieldvalue_2_0= ruleContentElement )
            {
            // InternalUpctforma.g:2073:4: (lv_fieldvalue_2_0= ruleContentElement )
            // InternalUpctforma.g:2074:5: lv_fieldvalue_2_0= ruleContentElement
            {

            					newCompositeNode(grammarAccess.getFieldValueAccess().getFieldvalueContentElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_fieldvalue_2_0=ruleContentElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldValueRule());
            					}
            					set(
            						current,
            						"fieldvalue",
            						lv_fieldvalue_2_0,
            						"org.xtext.Upctforma.ContentElement");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleRecordValue"
    // InternalUpctforma.g:2095:1: entryRuleRecordValue returns [EObject current=null] : iv_ruleRecordValue= ruleRecordValue EOF ;
    public final EObject entryRuleRecordValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordValue = null;


        try {
            // InternalUpctforma.g:2095:52: (iv_ruleRecordValue= ruleRecordValue EOF )
            // InternalUpctforma.g:2096:2: iv_ruleRecordValue= ruleRecordValue EOF
            {
             newCompositeNode(grammarAccess.getRecordValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordValue=ruleRecordValue();

            state._fsp--;

             current =iv_ruleRecordValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRecordValue"


    // $ANTLR start "ruleRecordValue"
    // InternalUpctforma.g:2102:1: ruleRecordValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_recordvalues_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_recordvalues_3_0= ruleFieldValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleRecordValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_recordvalues_1_0 = null;

        EObject lv_recordvalues_3_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2108:2: ( (otherlv_0= '{' ( (lv_recordvalues_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_recordvalues_3_0= ruleFieldValue ) ) )* otherlv_4= '}' ) )
            // InternalUpctforma.g:2109:2: (otherlv_0= '{' ( (lv_recordvalues_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_recordvalues_3_0= ruleFieldValue ) ) )* otherlv_4= '}' )
            {
            // InternalUpctforma.g:2109:2: (otherlv_0= '{' ( (lv_recordvalues_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_recordvalues_3_0= ruleFieldValue ) ) )* otherlv_4= '}' )
            // InternalUpctforma.g:2110:3: otherlv_0= '{' ( (lv_recordvalues_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_recordvalues_3_0= ruleFieldValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordValueAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalUpctforma.g:2114:3: ( (lv_recordvalues_1_0= ruleFieldValue ) )
            // InternalUpctforma.g:2115:4: (lv_recordvalues_1_0= ruleFieldValue )
            {
            // InternalUpctforma.g:2115:4: (lv_recordvalues_1_0= ruleFieldValue )
            // InternalUpctforma.g:2116:5: lv_recordvalues_1_0= ruleFieldValue
            {

            					newCompositeNode(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_recordvalues_1_0=ruleFieldValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordValueRule());
            					}
            					add(
            						current,
            						"recordvalues",
            						lv_recordvalues_1_0,
            						"org.xtext.Upctforma.FieldValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:2133:3: (otherlv_2= ',' ( (lv_recordvalues_3_0= ruleFieldValue ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==16) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalUpctforma.g:2134:4: otherlv_2= ',' ( (lv_recordvalues_3_0= ruleFieldValue ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRecordValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUpctforma.g:2138:4: ( (lv_recordvalues_3_0= ruleFieldValue ) )
            	    // InternalUpctforma.g:2139:5: (lv_recordvalues_3_0= ruleFieldValue )
            	    {
            	    // InternalUpctforma.g:2139:5: (lv_recordvalues_3_0= ruleFieldValue )
            	    // InternalUpctforma.g:2140:6: lv_recordvalues_3_0= ruleFieldValue
            	    {

            	    						newCompositeNode(grammarAccess.getRecordValueAccess().getRecordvaluesFieldValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_recordvalues_3_0=ruleFieldValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecordValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordvalues",
            	    							lv_recordvalues_3_0,
            	    							"org.xtext.Upctforma.FieldValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRecordValueAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRecordValue"


    // $ANTLR start "entryRuleListValue"
    // InternalUpctforma.g:2166:1: entryRuleListValue returns [EObject current=null] : iv_ruleListValue= ruleListValue EOF ;
    public final EObject entryRuleListValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListValue = null;


        try {
            // InternalUpctforma.g:2166:50: (iv_ruleListValue= ruleListValue EOF )
            // InternalUpctforma.g:2167:2: iv_ruleListValue= ruleListValue EOF
            {
             newCompositeNode(grammarAccess.getListValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListValue=ruleListValue();

            state._fsp--;

             current =iv_ruleListValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListValue"


    // $ANTLR start "ruleListValue"
    // InternalUpctforma.g:2173:1: ruleListValue returns [EObject current=null] : (otherlv_0= '[' ( (lv_listvalues_1_0= ruleContentElement ) ) (otherlv_2= ',' ( (lv_listvalues_3_0= ruleContentElement ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_listvalues_1_0 = null;

        EObject lv_listvalues_3_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2179:2: ( (otherlv_0= '[' ( (lv_listvalues_1_0= ruleContentElement ) ) (otherlv_2= ',' ( (lv_listvalues_3_0= ruleContentElement ) ) )* otherlv_4= ']' ) )
            // InternalUpctforma.g:2180:2: (otherlv_0= '[' ( (lv_listvalues_1_0= ruleContentElement ) ) (otherlv_2= ',' ( (lv_listvalues_3_0= ruleContentElement ) ) )* otherlv_4= ']' )
            {
            // InternalUpctforma.g:2180:2: (otherlv_0= '[' ( (lv_listvalues_1_0= ruleContentElement ) ) (otherlv_2= ',' ( (lv_listvalues_3_0= ruleContentElement ) ) )* otherlv_4= ']' )
            // InternalUpctforma.g:2181:3: otherlv_0= '[' ( (lv_listvalues_1_0= ruleContentElement ) ) (otherlv_2= ',' ( (lv_listvalues_3_0= ruleContentElement ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getListValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalUpctforma.g:2185:3: ( (lv_listvalues_1_0= ruleContentElement ) )
            // InternalUpctforma.g:2186:4: (lv_listvalues_1_0= ruleContentElement )
            {
            // InternalUpctforma.g:2186:4: (lv_listvalues_1_0= ruleContentElement )
            // InternalUpctforma.g:2187:5: lv_listvalues_1_0= ruleContentElement
            {

            					newCompositeNode(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
            lv_listvalues_1_0=ruleContentElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListValueRule());
            					}
            					add(
            						current,
            						"listvalues",
            						lv_listvalues_1_0,
            						"org.xtext.Upctforma.ContentElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:2204:3: (otherlv_2= ',' ( (lv_listvalues_3_0= ruleContentElement ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==16) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalUpctforma.g:2205:4: otherlv_2= ',' ( (lv_listvalues_3_0= ruleContentElement ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_30); 

            	    				newLeafNode(otherlv_2, grammarAccess.getListValueAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalUpctforma.g:2209:4: ( (lv_listvalues_3_0= ruleContentElement ) )
            	    // InternalUpctforma.g:2210:5: (lv_listvalues_3_0= ruleContentElement )
            	    {
            	    // InternalUpctforma.g:2210:5: (lv_listvalues_3_0= ruleContentElement )
            	    // InternalUpctforma.g:2211:6: lv_listvalues_3_0= ruleContentElement
            	    {

            	    						newCompositeNode(grammarAccess.getListValueAccess().getListvaluesContentElementParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_listvalues_3_0=ruleContentElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListValueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listvalues",
            	    							lv_listvalues_3_0,
            	    							"org.xtext.Upctforma.ContentElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_4=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListValueAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleListValue"


    // $ANTLR start "entryRuleWidgetType"
    // InternalUpctforma.g:2237:1: entryRuleWidgetType returns [EObject current=null] : iv_ruleWidgetType= ruleWidgetType EOF ;
    public final EObject entryRuleWidgetType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidgetType = null;


        try {
            // InternalUpctforma.g:2237:51: (iv_ruleWidgetType= ruleWidgetType EOF )
            // InternalUpctforma.g:2238:2: iv_ruleWidgetType= ruleWidgetType EOF
            {
             newCompositeNode(grammarAccess.getWidgetTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWidgetType=ruleWidgetType();

            state._fsp--;

             current =iv_ruleWidgetType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWidgetType"


    // $ANTLR start "ruleWidgetType"
    // InternalUpctforma.g:2244:1: ruleWidgetType returns [EObject current=null] : ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEPrimitiveTypes ) ) (otherlv_5= ',' ( ( ruleEPrimitiveTypes ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleWidgetType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2250:2: ( ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEPrimitiveTypes ) ) (otherlv_5= ',' ( ( ruleEPrimitiveTypes ) ) )* otherlv_7= '}' ) )
            // InternalUpctforma.g:2251:2: ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEPrimitiveTypes ) ) (otherlv_5= ',' ( ( ruleEPrimitiveTypes ) ) )* otherlv_7= '}' )
            {
            // InternalUpctforma.g:2251:2: ( () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEPrimitiveTypes ) ) (otherlv_5= ',' ( ( ruleEPrimitiveTypes ) ) )* otherlv_7= '}' )
            // InternalUpctforma.g:2252:3: () otherlv_1= 'widget' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEPrimitiveTypes ) ) (otherlv_5= ',' ( ( ruleEPrimitiveTypes ) ) )* otherlv_7= '}'
            {
            // InternalUpctforma.g:2252:3: ()
            // InternalUpctforma.g:2253:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWidgetTypeAccess().getWidgetTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWidgetTypeAccess().getWidgetKeyword_1());
            		
            // InternalUpctforma.g:2263:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:2264:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:2264:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:2265:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWidgetTypeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWidgetTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getWidgetTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:2286:3: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:2287:4: ( ruleEPrimitiveTypes )
            {
            // InternalUpctforma.g:2287:4: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:2288:5: ruleEPrimitiveTypes
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWidgetTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEPrimitiveTypes();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:2302:3: (otherlv_5= ',' ( ( ruleEPrimitiveTypes ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==16) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUpctforma.g:2303:4: otherlv_5= ',' ( ( ruleEPrimitiveTypes ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_44); 

            	    				newLeafNode(otherlv_5, grammarAccess.getWidgetTypeAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalUpctforma.g:2307:4: ( ( ruleEPrimitiveTypes ) )
            	    // InternalUpctforma.g:2308:5: ( ruleEPrimitiveTypes )
            	    {
            	    // InternalUpctforma.g:2308:5: ( ruleEPrimitiveTypes )
            	    // InternalUpctforma.g:2309:6: ruleEPrimitiveTypes
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getWidgetTypeRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getWidgetTypeAccess().getWidgettypeelementsTypeCrossReference_5_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    ruleEPrimitiveTypes();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWidgetTypeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleWidgetType"


    // $ANTLR start "entryRuleCompositeType_Impl"
    // InternalUpctforma.g:2332:1: entryRuleCompositeType_Impl returns [EObject current=null] : iv_ruleCompositeType_Impl= ruleCompositeType_Impl EOF ;
    public final EObject entryRuleCompositeType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeType_Impl = null;


        try {
            // InternalUpctforma.g:2332:59: (iv_ruleCompositeType_Impl= ruleCompositeType_Impl EOF )
            // InternalUpctforma.g:2333:2: iv_ruleCompositeType_Impl= ruleCompositeType_Impl EOF
            {
             newCompositeNode(grammarAccess.getCompositeType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeType_Impl=ruleCompositeType_Impl();

            state._fsp--;

             current =iv_ruleCompositeType_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeType_Impl"


    // $ANTLR start "ruleCompositeType_Impl"
    // InternalUpctforma.g:2339:1: ruleCompositeType_Impl returns [EObject current=null] : ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCompositeType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2345:2: ( ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUpctforma.g:2346:2: ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUpctforma.g:2346:2: ( () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUpctforma.g:2347:3: () otherlv_1= 'CompositeType' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUpctforma.g:2347:3: ()
            // InternalUpctforma.g:2348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeType_ImplAccess().getCompositeTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeType_ImplAccess().getCompositeTypeKeyword_1());
            		
            // InternalUpctforma.g:2358:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:2359:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:2359:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:2360:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeType_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeType_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleCompositeType_Impl"


    // $ANTLR start "entryRuleSection"
    // InternalUpctforma.g:2381:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalUpctforma.g:2381:48: (iv_ruleSection= ruleSection EOF )
            // InternalUpctforma.g:2382:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalUpctforma.g:2388:1: ruleSection returns [EObject current=null] : ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleSectionType ) ) )? ( ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_image_5_0 = null;

        AntlrDatatypeRuleToken lv_title_7_0 = null;

        Enumerator lv_type_9_0 = null;

        EObject lv_rows_10_0 = null;

        EObject lv_rows_12_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2394:2: ( ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleSectionType ) ) )? ( ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* )? otherlv_13= '}' ) )
            // InternalUpctforma.g:2395:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleSectionType ) ) )? ( ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* )? otherlv_13= '}' )
            {
            // InternalUpctforma.g:2395:2: ( () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleSectionType ) ) )? ( ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* )? otherlv_13= '}' )
            // InternalUpctforma.g:2396:3: () otherlv_1= 'Section' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )? (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )? (otherlv_8= 'type' ( (lv_type_9_0= ruleSectionType ) ) )? ( ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* )? otherlv_13= '}'
            {
            // InternalUpctforma.g:2396:3: ()
            // InternalUpctforma.g:2397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSectionAccess().getSectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getSectionKeyword_1());
            		
            // InternalUpctforma.g:2407:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUpctforma.g:2408:4: (lv_name_2_0= ruleEString )
            {
            // InternalUpctforma.g:2408:4: (lv_name_2_0= ruleEString )
            // InternalUpctforma.g:2409:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUpctforma.g:2430:3: (otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUpctforma.g:2431:4: otherlv_4= 'image' ( (lv_image_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getImageKeyword_4_0());
                    			
                    // InternalUpctforma.g:2435:4: ( (lv_image_5_0= ruleEString ) )
                    // InternalUpctforma.g:2436:5: (lv_image_5_0= ruleEString )
                    {
                    // InternalUpctforma.g:2436:5: (lv_image_5_0= ruleEString )
                    // InternalUpctforma.g:2437:6: lv_image_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getImageEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_image_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"image",
                    							lv_image_5_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:2455:3: (otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUpctforma.g:2456:4: otherlv_6= 'title' ( (lv_title_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getTitleKeyword_5_0());
                    			
                    // InternalUpctforma.g:2460:4: ( (lv_title_7_0= ruleEString ) )
                    // InternalUpctforma.g:2461:5: (lv_title_7_0= ruleEString )
                    {
                    // InternalUpctforma.g:2461:5: (lv_title_7_0= ruleEString )
                    // InternalUpctforma.g:2462:6: lv_title_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTitleEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_title_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_7_0,
                    							"org.xtext.Upctforma.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:2480:3: (otherlv_8= 'type' ( (lv_type_9_0= ruleSectionType ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUpctforma.g:2481:4: otherlv_8= 'type' ( (lv_type_9_0= ruleSectionType ) )
                    {
                    otherlv_8=(Token)match(input,44,FOLLOW_50); 

                    				newLeafNode(otherlv_8, grammarAccess.getSectionAccess().getTypeKeyword_6_0());
                    			
                    // InternalUpctforma.g:2485:4: ( (lv_type_9_0= ruleSectionType ) )
                    // InternalUpctforma.g:2486:5: (lv_type_9_0= ruleSectionType )
                    {
                    // InternalUpctforma.g:2486:5: (lv_type_9_0= ruleSectionType )
                    // InternalUpctforma.g:2487:6: lv_type_9_0= ruleSectionType
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getTypeSectionTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_9_0=ruleSectionType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_9_0,
                    							"org.xtext.Upctforma.SectionType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUpctforma.g:2505:3: ( ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUpctforma.g:2506:4: ( (lv_rows_10_0= ruleRow ) ) (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )*
                    {
                    // InternalUpctforma.g:2506:4: ( (lv_rows_10_0= ruleRow ) )
                    // InternalUpctforma.g:2507:5: (lv_rows_10_0= ruleRow )
                    {
                    // InternalUpctforma.g:2507:5: (lv_rows_10_0= ruleRow )
                    // InternalUpctforma.g:2508:6: lv_rows_10_0= ruleRow
                    {

                    						newCompositeNode(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_rows_10_0=ruleRow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSectionRule());
                    						}
                    						add(
                    							current,
                    							"rows",
                    							lv_rows_10_0,
                    							"org.xtext.Upctforma.Row");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUpctforma.g:2525:4: (otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==16) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalUpctforma.g:2526:5: otherlv_11= ',' ( (lv_rows_12_0= ruleRow ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_20); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSectionAccess().getCommaKeyword_7_1_0());
                    	    				
                    	    // InternalUpctforma.g:2530:5: ( (lv_rows_12_0= ruleRow ) )
                    	    // InternalUpctforma.g:2531:6: (lv_rows_12_0= ruleRow )
                    	    {
                    	    // InternalUpctforma.g:2531:6: (lv_rows_12_0= ruleRow )
                    	    // InternalUpctforma.g:2532:7: lv_rows_12_0= ruleRow
                    	    {

                    	    							newCompositeNode(grammarAccess.getSectionAccess().getRowsRowParserRuleCall_7_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_rows_12_0=ruleRow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSectionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rows",
                    	    								lv_rows_12_0,
                    	    								"org.xtext.Upctforma.Row");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleEPrimitiveTypes"
    // InternalUpctforma.g:2559:1: entryRuleEPrimitiveTypes returns [String current=null] : iv_ruleEPrimitiveTypes= ruleEPrimitiveTypes EOF ;
    public final String entryRuleEPrimitiveTypes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEPrimitiveTypes = null;


        try {
            // InternalUpctforma.g:2559:55: (iv_ruleEPrimitiveTypes= ruleEPrimitiveTypes EOF )
            // InternalUpctforma.g:2560:2: iv_ruleEPrimitiveTypes= ruleEPrimitiveTypes EOF
            {
             newCompositeNode(grammarAccess.getEPrimitiveTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPrimitiveTypes=ruleEPrimitiveTypes();

            state._fsp--;

             current =iv_ruleEPrimitiveTypes.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEPrimitiveTypes"


    // $ANTLR start "ruleEPrimitiveTypes"
    // InternalUpctforma.g:2566:1: ruleEPrimitiveTypes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | this_PrimitiveTypes_1= RULE_PRIMITIVETYPES ) ;
    public final AntlrDatatypeRuleToken ruleEPrimitiveTypes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PrimitiveTypes_1=null;
        AntlrDatatypeRuleToken this_EString_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2572:2: ( (this_EString_0= ruleEString | this_PrimitiveTypes_1= RULE_PRIMITIVETYPES ) )
            // InternalUpctforma.g:2573:2: (this_EString_0= ruleEString | this_PrimitiveTypes_1= RULE_PRIMITIVETYPES )
            {
            // InternalUpctforma.g:2573:2: (this_EString_0= ruleEString | this_PrimitiveTypes_1= RULE_PRIMITIVETYPES )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_STRING)) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_PRIMITIVETYPES) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalUpctforma.g:2574:3: this_EString_0= ruleEString
                    {

                    			newCompositeNode(grammarAccess.getEPrimitiveTypesAccess().getEStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EString_0=ruleEString();

                    state._fsp--;


                    			current.merge(this_EString_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:2585:3: this_PrimitiveTypes_1= RULE_PRIMITIVETYPES
                    {
                    this_PrimitiveTypes_1=(Token)match(input,RULE_PRIMITIVETYPES,FOLLOW_2); 

                    			current.merge(this_PrimitiveTypes_1);
                    		

                    			newLeafNode(this_PrimitiveTypes_1, grammarAccess.getEPrimitiveTypesAccess().getPrimitiveTypesTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEPrimitiveTypes"


    // $ANTLR start "entryRuleSimpleType"
    // InternalUpctforma.g:2596:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalUpctforma.g:2596:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalUpctforma.g:2597:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalUpctforma.g:2603:1: ruleSimpleType returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_PRIMITIVETYPES ) ) ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUpctforma.g:2609:2: ( ( () ( (lv_name_1_0= RULE_PRIMITIVETYPES ) ) ) )
            // InternalUpctforma.g:2610:2: ( () ( (lv_name_1_0= RULE_PRIMITIVETYPES ) ) )
            {
            // InternalUpctforma.g:2610:2: ( () ( (lv_name_1_0= RULE_PRIMITIVETYPES ) ) )
            // InternalUpctforma.g:2611:3: () ( (lv_name_1_0= RULE_PRIMITIVETYPES ) )
            {
            // InternalUpctforma.g:2611:3: ()
            // InternalUpctforma.g:2612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleTypeAccess().getSimpleTypeAction_0(),
            					current);
            			

            }

            // InternalUpctforma.g:2618:3: ( (lv_name_1_0= RULE_PRIMITIVETYPES ) )
            // InternalUpctforma.g:2619:4: (lv_name_1_0= RULE_PRIMITIVETYPES )
            {
            // InternalUpctforma.g:2619:4: (lv_name_1_0= RULE_PRIMITIVETYPES )
            // InternalUpctforma.g:2620:5: lv_name_1_0= RULE_PRIMITIVETYPES
            {
            lv_name_1_0=(Token)match(input,RULE_PRIMITIVETYPES,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSimpleTypeAccess().getNamePrimitiveTypesTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Upctforma.PrimitiveTypes");
            				

            }


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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleRecordType"
    // InternalUpctforma.g:2640:1: entryRuleRecordType returns [EObject current=null] : iv_ruleRecordType= ruleRecordType EOF ;
    public final EObject entryRuleRecordType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordType = null;


        try {
            // InternalUpctforma.g:2640:51: (iv_ruleRecordType= ruleRecordType EOF )
            // InternalUpctforma.g:2641:2: iv_ruleRecordType= ruleRecordType EOF
            {
             newCompositeNode(grammarAccess.getRecordTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordType=ruleRecordType();

            state._fsp--;

             current =iv_ruleRecordType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalUpctforma.g:2647:1: ruleRecordType returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_recordtype_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_recordtype_4_0= ruleField ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleRecordType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_recordtype_2_0 = null;

        EObject lv_recordtype_4_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2653:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_recordtype_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_recordtype_4_0= ruleField ) ) )* otherlv_5= '}' ) )
            // InternalUpctforma.g:2654:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_recordtype_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_recordtype_4_0= ruleField ) ) )* otherlv_5= '}' )
            {
            // InternalUpctforma.g:2654:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_recordtype_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_recordtype_4_0= ruleField ) ) )* otherlv_5= '}' )
            // InternalUpctforma.g:2655:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' ( (lv_recordtype_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_recordtype_4_0= ruleField ) ) )* otherlv_5= '}'
            {
            // InternalUpctforma.g:2655:3: ( (lv_name_0_0= ruleEString ) )
            // InternalUpctforma.g:2656:4: (lv_name_0_0= ruleEString )
            {
            // InternalUpctforma.g:2656:4: (lv_name_0_0= ruleEString )
            // InternalUpctforma.g:2657:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalUpctforma.g:2678:3: ( (lv_recordtype_2_0= ruleField ) )
            // InternalUpctforma.g:2679:4: (lv_recordtype_2_0= ruleField )
            {
            // InternalUpctforma.g:2679:4: (lv_recordtype_2_0= ruleField )
            // InternalUpctforma.g:2680:5: lv_recordtype_2_0= ruleField
            {

            					newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_recordtype_2_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            					}
            					add(
            						current,
            						"recordtype",
            						lv_recordtype_2_0,
            						"org.xtext.Upctforma.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUpctforma.g:2697:3: (otherlv_3= ',' ( (lv_recordtype_4_0= ruleField ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==16) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalUpctforma.g:2698:4: otherlv_3= ',' ( (lv_recordtype_4_0= ruleField ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRecordTypeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalUpctforma.g:2702:4: ( (lv_recordtype_4_0= ruleField ) )
            	    // InternalUpctforma.g:2703:5: (lv_recordtype_4_0= ruleField )
            	    {
            	    // InternalUpctforma.g:2703:5: (lv_recordtype_4_0= ruleField )
            	    // InternalUpctforma.g:2704:6: lv_recordtype_4_0= ruleField
            	    {

            	    						newCompositeNode(grammarAccess.getRecordTypeAccess().getRecordtypeFieldParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_recordtype_4_0=ruleField();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRecordTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"recordtype",
            	    							lv_recordtype_4_0,
            	    							"org.xtext.Upctforma.Field");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRecordType"


    // $ANTLR start "entryRuleField"
    // InternalUpctforma.g:2730:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalUpctforma.g:2730:46: (iv_ruleField= ruleField EOF )
            // InternalUpctforma.g:2731:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalUpctforma.g:2737:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEPrimitiveTypes ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2743:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEPrimitiveTypes ) ) ) )
            // InternalUpctforma.g:2744:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEPrimitiveTypes ) ) )
            {
            // InternalUpctforma.g:2744:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEPrimitiveTypes ) ) )
            // InternalUpctforma.g:2745:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEPrimitiveTypes ) )
            {
            // InternalUpctforma.g:2745:3: ( (lv_name_0_0= ruleEString ) )
            // InternalUpctforma.g:2746:4: (lv_name_0_0= ruleEString )
            {
            // InternalUpctforma.g:2746:4: (lv_name_0_0= ruleEString )
            // InternalUpctforma.g:2747:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalUpctforma.g:2768:3: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:2769:4: ( ruleEPrimitiveTypes )
            {
            // InternalUpctforma.g:2769:4: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:2770:5: ruleEPrimitiveTypes
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFieldAccess().getFieldtypeTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEPrimitiveTypes();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleListType"
    // InternalUpctforma.g:2788:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // InternalUpctforma.g:2788:49: (iv_ruleListType= ruleListType EOF )
            // InternalUpctforma.g:2789:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalUpctforma.g:2795:1: ruleListType returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'list_of' ( ( ruleEPrimitiveTypes ) ) otherlv_4= '}' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalUpctforma.g:2801:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'list_of' ( ( ruleEPrimitiveTypes ) ) otherlv_4= '}' ) )
            // InternalUpctforma.g:2802:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'list_of' ( ( ruleEPrimitiveTypes ) ) otherlv_4= '}' )
            {
            // InternalUpctforma.g:2802:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'list_of' ( ( ruleEPrimitiveTypes ) ) otherlv_4= '}' )
            // InternalUpctforma.g:2803:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'list_of' ( ( ruleEPrimitiveTypes ) ) otherlv_4= '}'
            {
            // InternalUpctforma.g:2803:3: ( (lv_name_0_0= ruleEString ) )
            // InternalUpctforma.g:2804:4: (lv_name_0_0= ruleEString )
            {
            // InternalUpctforma.g:2804:4: (lv_name_0_0= ruleEString )
            // InternalUpctforma.g:2805:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getListTypeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.Upctforma.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,54,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getListTypeAccess().getList_ofKeyword_2());
            		
            // InternalUpctforma.g:2830:3: ( ( ruleEPrimitiveTypes ) )
            // InternalUpctforma.g:2831:4: ( ruleEPrimitiveTypes )
            {
            // InternalUpctforma.g:2831:4: ( ruleEPrimitiveTypes )
            // InternalUpctforma.g:2832:5: ruleEPrimitiveTypes
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListTypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getListTypeAccess().getListtypeTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEPrimitiveTypes();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleListType"


    // $ANTLR start "ruleContentUnitType"
    // InternalUpctforma.g:2854:1: ruleContentUnitType returns [Enumerator current=null] : ( (enumLiteral_0= 'Interoperability' ) | (enumLiteral_1= 'Open' ) | (enumLiteral_2= 'Preview' ) ) ;
    public final Enumerator ruleContentUnitType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUpctforma.g:2860:2: ( ( (enumLiteral_0= 'Interoperability' ) | (enumLiteral_1= 'Open' ) | (enumLiteral_2= 'Preview' ) ) )
            // InternalUpctforma.g:2861:2: ( (enumLiteral_0= 'Interoperability' ) | (enumLiteral_1= 'Open' ) | (enumLiteral_2= 'Preview' ) )
            {
            // InternalUpctforma.g:2861:2: ( (enumLiteral_0= 'Interoperability' ) | (enumLiteral_1= 'Open' ) | (enumLiteral_2= 'Preview' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt47=1;
                }
                break;
            case 56:
                {
                alt47=2;
                }
                break;
            case 57:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalUpctforma.g:2862:3: (enumLiteral_0= 'Interoperability' )
                    {
                    // InternalUpctforma.g:2862:3: (enumLiteral_0= 'Interoperability' )
                    // InternalUpctforma.g:2863:4: enumLiteral_0= 'Interoperability'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getContentUnitTypeAccess().getInteroperabilityEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContentUnitTypeAccess().getInteroperabilityEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:2870:3: (enumLiteral_1= 'Open' )
                    {
                    // InternalUpctforma.g:2870:3: (enumLiteral_1= 'Open' )
                    // InternalUpctforma.g:2871:4: enumLiteral_1= 'Open'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getContentUnitTypeAccess().getOpenEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContentUnitTypeAccess().getOpenEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:2878:3: (enumLiteral_2= 'Preview' )
                    {
                    // InternalUpctforma.g:2878:3: (enumLiteral_2= 'Preview' )
                    // InternalUpctforma.g:2879:4: enumLiteral_2= 'Preview'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getContentUnitTypeAccess().getPreviewEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getContentUnitTypeAccess().getPreviewEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleContentUnitType"


    // $ANTLR start "ruleVideoType"
    // InternalUpctforma.g:2889:1: ruleVideoType returns [Enumerator current=null] : ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Interactive' ) ) ;
    public final Enumerator ruleVideoType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:2895:2: ( ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Interactive' ) ) )
            // InternalUpctforma.g:2896:2: ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Interactive' ) )
            {
            // InternalUpctforma.g:2896:2: ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Interactive' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            else if ( (LA48_0==59) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalUpctforma.g:2897:3: (enumLiteral_0= 'Normal' )
                    {
                    // InternalUpctforma.g:2897:3: (enumLiteral_0= 'Normal' )
                    // InternalUpctforma.g:2898:4: enumLiteral_0= 'Normal'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getVideoTypeAccess().getNormalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVideoTypeAccess().getNormalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:2905:3: (enumLiteral_1= 'Interactive' )
                    {
                    // InternalUpctforma.g:2905:3: (enumLiteral_1= 'Interactive' )
                    // InternalUpctforma.g:2906:4: enumLiteral_1= 'Interactive'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getVideoTypeAccess().getInteractiveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVideoTypeAccess().getInteractiveEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleVideoType"


    // $ANTLR start "ruleLanguageType"
    // InternalUpctforma.g:2916:1: ruleLanguageType returns [Enumerator current=null] : ( (enumLiteral_0= 'ES' ) | (enumLiteral_1= 'EN' ) | (enumLiteral_2= 'FR' ) | (enumLiteral_3= 'GR' ) | (enumLiteral_4= 'LI' ) ) ;
    public final Enumerator ruleLanguageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalUpctforma.g:2922:2: ( ( (enumLiteral_0= 'ES' ) | (enumLiteral_1= 'EN' ) | (enumLiteral_2= 'FR' ) | (enumLiteral_3= 'GR' ) | (enumLiteral_4= 'LI' ) ) )
            // InternalUpctforma.g:2923:2: ( (enumLiteral_0= 'ES' ) | (enumLiteral_1= 'EN' ) | (enumLiteral_2= 'FR' ) | (enumLiteral_3= 'GR' ) | (enumLiteral_4= 'LI' ) )
            {
            // InternalUpctforma.g:2923:2: ( (enumLiteral_0= 'ES' ) | (enumLiteral_1= 'EN' ) | (enumLiteral_2= 'FR' ) | (enumLiteral_3= 'GR' ) | (enumLiteral_4= 'LI' ) )
            int alt49=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt49=1;
                }
                break;
            case 61:
                {
                alt49=2;
                }
                break;
            case 62:
                {
                alt49=3;
                }
                break;
            case 63:
                {
                alt49=4;
                }
                break;
            case 64:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalUpctforma.g:2924:3: (enumLiteral_0= 'ES' )
                    {
                    // InternalUpctforma.g:2924:3: (enumLiteral_0= 'ES' )
                    // InternalUpctforma.g:2925:4: enumLiteral_0= 'ES'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageTypeAccess().getESEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:2932:3: (enumLiteral_1= 'EN' )
                    {
                    // InternalUpctforma.g:2932:3: (enumLiteral_1= 'EN' )
                    // InternalUpctforma.g:2933:4: enumLiteral_1= 'EN'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageTypeAccess().getENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUpctforma.g:2940:3: (enumLiteral_2= 'FR' )
                    {
                    // InternalUpctforma.g:2940:3: (enumLiteral_2= 'FR' )
                    // InternalUpctforma.g:2941:4: enumLiteral_2= 'FR'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getFREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLanguageTypeAccess().getFREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUpctforma.g:2948:3: (enumLiteral_3= 'GR' )
                    {
                    // InternalUpctforma.g:2948:3: (enumLiteral_3= 'GR' )
                    // InternalUpctforma.g:2949:4: enumLiteral_3= 'GR'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getGREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLanguageTypeAccess().getGREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUpctforma.g:2956:3: (enumLiteral_4= 'LI' )
                    {
                    // InternalUpctforma.g:2956:3: (enumLiteral_4= 'LI' )
                    // InternalUpctforma.g:2957:4: enumLiteral_4= 'LI'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getLanguageTypeAccess().getLIEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLanguageTypeAccess().getLIEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleLanguageType"


    // $ANTLR start "ruleImageType"
    // InternalUpctforma.g:2967:1: ruleImageType returns [Enumerator current=null] : ( (enumLiteral_0= 'Original' ) | (enumLiteral_1= 'Fit' ) ) ;
    public final Enumerator ruleImageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:2973:2: ( ( (enumLiteral_0= 'Original' ) | (enumLiteral_1= 'Fit' ) ) )
            // InternalUpctforma.g:2974:2: ( (enumLiteral_0= 'Original' ) | (enumLiteral_1= 'Fit' ) )
            {
            // InternalUpctforma.g:2974:2: ( (enumLiteral_0= 'Original' ) | (enumLiteral_1= 'Fit' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==65) ) {
                alt50=1;
            }
            else if ( (LA50_0==66) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalUpctforma.g:2975:3: (enumLiteral_0= 'Original' )
                    {
                    // InternalUpctforma.g:2975:3: (enumLiteral_0= 'Original' )
                    // InternalUpctforma.g:2976:4: enumLiteral_0= 'Original'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getImageTypeAccess().getOriginalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImageTypeAccess().getOriginalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:2983:3: (enumLiteral_1= 'Fit' )
                    {
                    // InternalUpctforma.g:2983:3: (enumLiteral_1= 'Fit' )
                    // InternalUpctforma.g:2984:4: enumLiteral_1= 'Fit'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getImageTypeAccess().getFitEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImageTypeAccess().getFitEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleImageType"


    // $ANTLR start "ruleSectionType"
    // InternalUpctforma.g:2994:1: ruleSectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'BackgroundImage' ) | (enumLiteral_1= 'BackgroundColour' ) ) ;
    public final Enumerator ruleSectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUpctforma.g:3000:2: ( ( (enumLiteral_0= 'BackgroundImage' ) | (enumLiteral_1= 'BackgroundColour' ) ) )
            // InternalUpctforma.g:3001:2: ( (enumLiteral_0= 'BackgroundImage' ) | (enumLiteral_1= 'BackgroundColour' ) )
            {
            // InternalUpctforma.g:3001:2: ( (enumLiteral_0= 'BackgroundImage' ) | (enumLiteral_1= 'BackgroundColour' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==67) ) {
                alt51=1;
            }
            else if ( (LA51_0==68) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalUpctforma.g:3002:3: (enumLiteral_0= 'BackgroundImage' )
                    {
                    // InternalUpctforma.g:3002:3: (enumLiteral_0= 'BackgroundImage' )
                    // InternalUpctforma.g:3003:4: enumLiteral_0= 'BackgroundImage'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getBackgroundImageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSectionTypeAccess().getBackgroundImageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUpctforma.g:3010:3: (enumLiteral_1= 'BackgroundColour' )
                    {
                    // InternalUpctforma.g:3010:3: (enumLiteral_1= 'BackgroundColour' )
                    // InternalUpctforma.g:3011:4: enumLiteral_1= 'BackgroundColour'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getSectionTypeAccess().getBackgroundColourEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSectionTypeAccess().getBackgroundColourEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSectionType"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\2\uffff\2\15\2\uffff\1\4\2\uffff";
    static final String dfa_3s = "\1\63\2\uffff\2\15\2\uffff\1\66\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\2\uffff\1\4\1\6\1\uffff\1\3\1\5";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\3\1\uffff\1\2\21\uffff\1\1\30\uffff\1\5\1\6",
            "",
            "",
            "\1\7",
            "\1\7",
            "",
            "",
            "\2\10\60\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "468:2: (this_Type_Impl_0= ruleType_Impl | this_SimpleType_1= ruleSimpleType | this_RecordType_2= ruleRecordType | this_WidgetType_3= ruleWidgetType | this_ListType_4= ruleListType | this_CompositeType_Impl_5= ruleCompositeType_Impl )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000012E4000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000012E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000010F0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000C0000020000B0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000010C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000018040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008050000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000042030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001E36AF4042000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001E36AD4042000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001E36AD4002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000040000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000040040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000040000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000040000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020180004040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000180004040000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100004040000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000000L});

}