package nl.sison.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.sison.dsl.services.MobgenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMobgenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RESTFUL_METHODS", "RULE_ANY_OTHER", "RULE_MOBGEN_HEADER_PARAMETER", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_JSON_NUMBER", "RULE_JSON_META_SCALAR_TYPE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'platform'", "'{'", "'->'", "'}'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'enum'", "'map'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int RULE_JSON_META_SCALAR_TYPE=14;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_EMPTY_JSON_ARRAY=10;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=11;
    public static final int RULE_EMPTY_JSON_OBJECT=9;
    public static final int RULE_SL_COMMENT=17;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int RULE_JSON_NUMBER=13;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_MOBGEN_HEADER_PARAMETER=8;
    public static final int RULE_INT=15;
    public static final int RULE_RESTFUL_METHODS=6;
    public static final int RULE_WS=18;

    // delegates
    // delegators


        public InternalMobgenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMobgenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMobgenParser.tokenNames; }
    public String getGrammarFileName() { return "../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g"; }



     	private MobgenGrammarAccess grammarAccess;
     	
        public InternalMobgenParser(TokenStream input, MobgenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Mobgen";	
       	}
       	
       	@Override
       	protected MobgenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMobgen"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:67:1: entryRuleMobgen returns [EObject current=null] : iv_ruleMobgen= ruleMobgen EOF ;
    public final EObject entryRuleMobgen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgen = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:68:2: (iv_ruleMobgen= ruleMobgen EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:69:2: iv_ruleMobgen= ruleMobgen EOF
            {
             newCompositeNode(grammarAccess.getMobgenRule()); 
            pushFollow(FOLLOW_ruleMobgen_in_entryRuleMobgen75);
            iv_ruleMobgen=ruleMobgen();

            state._fsp--;

             current =iv_ruleMobgen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgen85); 

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
    // $ANTLR end "entryRuleMobgen"


    // $ANTLR start "ruleMobgen"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:76:1: ruleMobgen returns [EObject current=null] : ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ ) ;
    public final EObject ruleMobgen() throws RecognitionException {
        EObject current = null;

        EObject lv_platform_0_0 = null;

        EObject lv_resources_1_0 = null;

        EObject lv_calls_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:79:28: ( ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:80:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:80:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:80:2: ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:80:2: ( (lv_platform_0_0= rulePlatform ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:1: (lv_platform_0_0= rulePlatform )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:1: (lv_platform_0_0= rulePlatform )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:82:3: lv_platform_0_0= rulePlatform
            {
             
            	        newCompositeNode(grammarAccess.getMobgenAccess().getPlatformPlatformParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePlatform_in_ruleMobgen131);
            lv_platform_0_0=rulePlatform();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMobgenRule());
            	        }
                   		set(
                   			current, 
                   			"platform",
                    		lv_platform_0_0, 
                    		"Platform");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:98:2: ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=39 && LA1_0<=40)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==23) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:98:3: ( (lv_resources_1_0= ruleMobgenResourceDefinition ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:98:3: ( (lv_resources_1_0= ruleMobgenResourceDefinition ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:99:1: (lv_resources_1_0= ruleMobgenResourceDefinition )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:99:1: (lv_resources_1_0= ruleMobgenResourceDefinition )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:100:3: lv_resources_1_0= ruleMobgenResourceDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_ruleMobgen153);
            	    lv_resources_1_0=ruleMobgenResourceDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMobgenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_1_0, 
            	            		"MobgenResourceDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:117:6: ( (lv_calls_2_0= ruleMobgenCallDefinition ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:117:6: ( (lv_calls_2_0= ruleMobgenCallDefinition ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:118:1: (lv_calls_2_0= ruleMobgenCallDefinition )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:118:1: (lv_calls_2_0= ruleMobgenCallDefinition )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:119:3: lv_calls_2_0= ruleMobgenCallDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenCallDefinition_in_ruleMobgen180);
            	    lv_calls_2_0=ruleMobgenCallDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMobgenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"calls",
            	            		lv_calls_2_0, 
            	            		"MobgenCallDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleMobgen"


    // $ANTLR start "entryRulePlatform"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:143:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:144:2: (iv_rulePlatform= rulePlatform EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:145:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform218);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform228); 

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
    // $ANTLR end "entryRulePlatform"


    // $ANTLR start "rulePlatform"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:152:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_platforms_2_0=null;
        Token otherlv_3=null;
        Token lv_generateWhere_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:155:28: ( (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:156:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:156:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:156:3: otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePlatform265); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePlatform277); 

                	newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:164:1: ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:164:2: ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:164:2: ( (lv_platforms_2_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:165:1: (lv_platforms_2_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:165:1: (lv_platforms_2_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:166:3: lv_platforms_2_0= RULE_ID
            	    {
            	    lv_platforms_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlatform295); 

            	    			newLeafNode(lv_platforms_2_0, grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPlatformRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"platforms",
            	            		lv_platforms_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePlatform312); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:186:1: ( (lv_generateWhere_4_0= RULE_STRING ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:187:1: (lv_generateWhere_4_0= RULE_STRING )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:187:1: (lv_generateWhere_4_0= RULE_STRING )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:188:3: lv_generateWhere_4_0= RULE_STRING
            	    {
            	    lv_generateWhere_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlatform329); 

            	    			newLeafNode(lv_generateWhere_4_0, grammarAccess.getPlatformAccess().getGenerateWhereSTRINGTerminalRuleCall_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPlatformRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"generateWhere",
            	            		lv_generateWhere_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_rulePlatform348); 

                	newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "rulePlatform"


    // $ANTLR start "entryRuleMobgenCallDefinition"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:216:1: entryRuleMobgenCallDefinition returns [EObject current=null] : iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF ;
    public final EObject entryRuleMobgenCallDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenCallDefinition = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:217:2: (iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:218:2: iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF
            {
             newCompositeNode(grammarAccess.getMobgenCallDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition384);
            iv_ruleMobgenCallDefinition=ruleMobgenCallDefinition();

            state._fsp--;

             current =iv_ruleMobgenCallDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenCallDefinition394); 

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
    // $ANTLR end "entryRuleMobgenCallDefinition"


    // $ANTLR start "ruleMobgenCallDefinition"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:225:1: ruleMobgenCallDefinition returns [EObject current=null] : (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? ) ;
    public final EObject ruleMobgenCallDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_method_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_uri_5_0 = null;

        EObject lv_requestHeaders_10_0 = null;

        EObject lv_responseHeaders_13_0 = null;

        EObject lv_jsonToClient_16_0 = null;

        EObject lv_jsonToServer_19_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:228:28: ( (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:229:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:229:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:229:3: otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMobgenCallDefinition431); 

                	newLeafNode(otherlv_0, grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:233:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:234:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:234:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:235:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenCallDefinition448); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMobgenCallDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMobgenCallDefinition465); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:255:1: ( (lv_method_3_0= RULE_RESTFUL_METHODS ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:256:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:256:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:257:3: lv_method_3_0= RULE_RESTFUL_METHODS
            {
            lv_method_3_0=(Token)match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_ruleMobgenCallDefinition482); 

            			newLeafNode(lv_method_3_0, grammarAccess.getMobgenCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMobgenCallDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"method",
                    		lv_method_3_0, 
                    		"RESTFUL_METHODS");
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleMobgenCallDefinition499); 

                	newLeafNode(otherlv_4, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:277:1: ( (lv_uri_5_0= ruleURI ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:278:1: (lv_uri_5_0= ruleURI )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:278:1: (lv_uri_5_0= ruleURI )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:279:3: lv_uri_5_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleMobgenCallDefinition520);
            lv_uri_5_0=ruleURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_5_0, 
                    		"URI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:295:2: (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:295:4: otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )?
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleMobgenCallDefinition533); 

                        	newLeafNode(otherlv_6, grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleMobgenCallDefinition545); 

                        	newLeafNode(otherlv_7, grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleMobgenCallDefinition557); 

                        	newLeafNode(otherlv_8, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2());
                        
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleMobgenCallDefinition569); 

                        	newLeafNode(otherlv_9, grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:311:1: ( (lv_requestHeaders_10_0= ruleMobgenHeader ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:312:1: (lv_requestHeaders_10_0= ruleMobgenHeader )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:312:1: (lv_requestHeaders_10_0= ruleMobgenHeader )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:313:3: lv_requestHeaders_10_0= ruleMobgenHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition590);
                    lv_requestHeaders_10_0=ruleMobgenHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"requestHeaders",
                            		lv_requestHeaders_10_0, 
                            		"MobgenHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:329:2: (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==29) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:329:4: otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) )
                            {
                            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleMobgenCallDefinition603); 

                                	newLeafNode(otherlv_11, grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0());
                                
                            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleMobgenCallDefinition615); 

                                	newLeafNode(otherlv_12, grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1());
                                
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:337:1: ( (lv_responseHeaders_13_0= ruleMobgenHeader ) )
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:338:1: (lv_responseHeaders_13_0= ruleMobgenHeader )
                            {
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:338:1: (lv_responseHeaders_13_0= ruleMobgenHeader )
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:339:3: lv_responseHeaders_13_0= ruleMobgenHeader
                            {
                             
                            	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition636);
                            lv_responseHeaders_13_0=ruleMobgenHeader();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"responseHeaders",
                                    		lv_responseHeaders_13_0, 
                                    		"MobgenHeader");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:355:6: (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:355:8: otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) )
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleMobgenCallDefinition653); 

                        	newLeafNode(otherlv_14, grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleMobgenCallDefinition665); 

                        	newLeafNode(otherlv_15, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:363:1: ( (lv_jsonToClient_16_0= ruleMobgenJson ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:364:1: (lv_jsonToClient_16_0= ruleMobgenJson )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:364:1: (lv_jsonToClient_16_0= ruleMobgenJson )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:365:3: lv_jsonToClient_16_0= ruleMobgenJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition686);
                    lv_jsonToClient_16_0=ruleMobgenJson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"jsonToClient",
                            		lv_jsonToClient_16_0, 
                            		"MobgenJson");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:381:4: (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:381:6: otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) )
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleMobgenCallDefinition701); 

                        	newLeafNode(otherlv_17, grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleMobgenCallDefinition713); 

                        	newLeafNode(otherlv_18, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:389:1: ( (lv_jsonToServer_19_0= ruleMobgenJson ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:390:1: (lv_jsonToServer_19_0= ruleMobgenJson )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:390:1: (lv_jsonToServer_19_0= ruleMobgenJson )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:391:3: lv_jsonToServer_19_0= ruleMobgenJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition734);
                    lv_jsonToServer_19_0=ruleMobgenJson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"jsonToServer",
                            		lv_jsonToServer_19_0, 
                            		"MobgenJson");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleMobgenCallDefinition"


    // $ANTLR start "entryRuleURI"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:415:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:416:2: (iv_ruleURI= ruleURI EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:417:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI772);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI782); 

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
    // $ANTLR end "entryRuleURI"


    // $ANTLR start "ruleURI"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:424:1: ruleURI returns [EObject current=null] : ( ( (lv_stringPrefix_0_0= RULE_ANY_OTHER ) )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) ) )+ ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token lv_stringPrefix_0_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token lv_stringSuffix_4_0=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:427:28: ( ( ( (lv_stringPrefix_0_0= RULE_ANY_OTHER ) )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) ) )+ ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:1: ( ( (lv_stringPrefix_0_0= RULE_ANY_OTHER ) )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) ) )+ )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:1: ( ( (lv_stringPrefix_0_0= RULE_ANY_OTHER ) )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) ) )+ )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:2: ( (lv_stringPrefix_0_0= RULE_ANY_OTHER ) )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) ) )+
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:2: ( (lv_stringPrefix_0_0= RULE_ANY_OTHER ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ANY_OTHER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:429:1: (lv_stringPrefix_0_0= RULE_ANY_OTHER )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:429:1: (lv_stringPrefix_0_0= RULE_ANY_OTHER )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:430:3: lv_stringPrefix_0_0= RULE_ANY_OTHER
            	    {
            	    lv_stringPrefix_0_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI824); 

            	    			newLeafNode(lv_stringPrefix_0_0, grammarAccess.getURIAccess().getStringPrefixANY_OTHERTerminalRuleCall_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"stringPrefix",
            	            		lv_stringPrefix_0_0, 
            	            		"ANY_OTHER");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:446:3: (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:446:5: otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleURI843); 

            	        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:450:1: ( (lv_parameters_2_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:451:1: (lv_parameters_2_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:451:1: (lv_parameters_2_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:452:3: lv_parameters_2_0= RULE_ID
            	    {
            	    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI860); 

            	    			newLeafNode(lv_parameters_2_0, grammarAccess.getURIAccess().getParametersIDTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleURI877); 

            	        	newLeafNode(otherlv_3, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:472:1: ( (lv_stringSuffix_4_0= RULE_ANY_OTHER ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:473:1: (lv_stringSuffix_4_0= RULE_ANY_OTHER )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:473:1: (lv_stringSuffix_4_0= RULE_ANY_OTHER )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:474:3: lv_stringSuffix_4_0= RULE_ANY_OTHER
            	    {
            	    lv_stringSuffix_4_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI894); 

            	    			newLeafNode(lv_stringSuffix_4_0, grammarAccess.getURIAccess().getStringSuffixANY_OTHERTerminalRuleCall_1_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"stringSuffix",
            	            		lv_stringSuffix_4_0, 
            	            		"ANY_OTHER");
            	    	    

            	    }


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
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleMobgenHeader"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:498:1: entryRuleMobgenHeader returns [EObject current=null] : iv_ruleMobgenHeader= ruleMobgenHeader EOF ;
    public final EObject entryRuleMobgenHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeader = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:499:2: (iv_ruleMobgenHeader= ruleMobgenHeader EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:500:2: iv_ruleMobgenHeader= ruleMobgenHeader EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderRule()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader937);
            iv_ruleMobgenHeader=ruleMobgenHeader();

            state._fsp--;

             current =iv_ruleMobgenHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeader947); 

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
    // $ANTLR end "entryRuleMobgenHeader"


    // $ANTLR start "ruleMobgenHeader"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:507:1: ruleMobgenHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) ;
    public final EObject ruleMobgenHeader() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_headerKeyValues_3_0 = null;

        EObject lv_headerKeyValues_5_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:510:28: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:511:1: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:511:1: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:511:2: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:511:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:512:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:512:1: (lv_name_0_0= RULE_ID )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:513:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenHeader989); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMobgenHeaderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleMobgenHeader1007); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMobgenHeader1019); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:537:1: ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:538:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:538:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:539:3: lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1040);
            lv_headerKeyValues_3_0=ruleMobgenHeaderKeyValuePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMobgenHeaderRule());
            	        }
                   		add(
                   			current, 
                   			"headerKeyValues",
                    		lv_headerKeyValues_3_0, 
                    		"MobgenHeaderKeyValuePair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:555:2: (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_STRING) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:555:4: otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleMobgenHeader1053); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:559:1: ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:560:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:560:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:561:3: lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1074);
            	    lv_headerKeyValues_5_0=ruleMobgenHeaderKeyValuePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMobgenHeaderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"headerKeyValues",
            	            		lv_headerKeyValues_5_0, 
            	            		"MobgenHeaderKeyValuePair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:577:4: (otherlv_6= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:577:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleMobgenHeader1089); 

                        	newLeafNode(otherlv_6, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleMobgenHeader1103); 

                	newLeafNode(otherlv_7, grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleMobgenHeader1115); 

                	newLeafNode(otherlv_8, grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7());
                

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
    // $ANTLR end "ruleMobgenHeader"


    // $ANTLR start "entryRuleMobgenHeaderKeyValuePair"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:597:1: entryRuleMobgenHeaderKeyValuePair returns [EObject current=null] : iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF ;
    public final EObject entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeaderKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:598:2: (iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:599:2: iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair1151);
            iv_ruleMobgenHeaderKeyValuePair=ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleMobgenHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair1161); 

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
    // $ANTLR end "entryRuleMobgenHeaderKeyValuePair"


    // $ANTLR start "ruleMobgenHeaderKeyValuePair"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:606:1: ruleMobgenHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) ) ;
    public final EObject ruleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:609:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:610:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:610:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:610:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:610:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:611:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:611:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:612:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1203); 

            			newLeafNode(lv_key_0_0, grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMobgenHeaderKeyValuePairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleMobgenHeaderKeyValuePair1220); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:632:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_MOBGEN_HEADER_PARAMETER) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:632:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:632:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:633:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:633:1: (lv_value_2_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:634:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1238); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMobgenHeaderKeyValuePairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:651:6: ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:651:6: ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:652:1: (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:652:1: (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:653:3: lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER
                    {
                    lv_value_3_0=(Token)match(input,RULE_MOBGEN_HEADER_PARAMETER,FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_ruleMobgenHeaderKeyValuePair1266); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueMOBGEN_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMobgenHeaderKeyValuePairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"MOBGEN_HEADER_PARAMETER");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleMobgenHeaderKeyValuePair"


    // $ANTLR start "entryRuleMobgenJson"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:677:1: entryRuleMobgenJson returns [EObject current=null] : iv_ruleMobgenJson= ruleMobgenJson EOF ;
    public final EObject entryRuleMobgenJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenJson = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:678:2: (iv_ruleMobgenJson= ruleMobgenJson EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:679:2: iv_ruleMobgenJson= ruleMobgenJson EOF
            {
             newCompositeNode(grammarAccess.getMobgenJsonRule()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1308);
            iv_ruleMobgenJson=ruleMobgenJson();

            state._fsp--;

             current =iv_ruleMobgenJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenJson1318); 

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
    // $ANTLR end "entryRuleMobgenJson"


    // $ANTLR start "ruleMobgenJson"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:686:1: ruleMobgenJson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleMobgenJson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:689:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:690:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:690:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:690:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:690:2: ( (lv_name_0_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:691:1: (lv_name_0_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:691:1: (lv_name_0_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:692:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenJson1360); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMobgenJsonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleMobgenJson1377); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:712:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:713:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:713:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:714:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1398);
            lv_value_2_0=ruleJsonObjectValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMobgenJsonRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"JsonObjectValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleMobgenJson1410); 

                	newLeafNode(otherlv_3, grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3());
                

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
    // $ANTLR end "ruleMobgenJson"


    // $ANTLR start "entryRuleJsonObjectValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:742:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:743:2: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:744:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectValueRule()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1446);
            iv_ruleJsonObjectValue=ruleJsonObjectValue();

            state._fsp--;

             current =iv_ruleJsonObjectValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObjectValue1456); 

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
    // $ANTLR end "entryRuleJsonObjectValue"


    // $ANTLR start "ruleJsonObjectValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:751:1: ruleJsonObjectValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:754:28: ( ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:755:1: ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:755:1: ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||(LA13_0>=RULE_EMPTY_JSON_OBJECT && LA13_0<=RULE_JSON_META_SCALAR_TYPE)) ) {
                alt13=1;
            }
            else if ( (LA13_0==20||LA13_0==37) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:755:2: ( (lv_value_0_0= ruleJsonLiteralValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:755:2: ( (lv_value_0_0= ruleJsonLiteralValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:756:1: (lv_value_0_0= ruleJsonLiteralValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:756:1: (lv_value_0_0= ruleJsonLiteralValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:757:3: lv_value_0_0= ruleJsonLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1502);
                    lv_value_0_0=ruleJsonLiteralValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"JsonLiteralValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:774:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:774:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:775:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:775:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:776:3: lv_composite_1_0= ruleJsonCompositeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1529);
                    lv_composite_1_0=ruleJsonCompositeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                    	        }
                           		set(
                           			current, 
                           			"composite",
                            		lv_composite_1_0, 
                            		"JsonCompositeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleJsonObjectValue"


    // $ANTLR start "entryRuleJsonCompositeValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:800:1: entryRuleJsonCompositeValue returns [EObject current=null] : iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF ;
    public final EObject entryRuleJsonCompositeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:801:2: (iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:802:2: iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeValueRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue1565);
            iv_ruleJsonCompositeValue=ruleJsonCompositeValue();

            state._fsp--;

             current =iv_ruleJsonCompositeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeValue1575); 

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
    // $ANTLR end "entryRuleJsonCompositeValue"


    // $ANTLR start "ruleJsonCompositeValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:809:1: ruleJsonCompositeValue returns [EObject current=null] : (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray ) ;
    public final EObject ruleJsonCompositeValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObject_0 = null;

        EObject this_JsonArray_1 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:812:28: ( (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:813:1: (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:813:1: (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==37) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:814:5: this_JsonObject_0= ruleJsonObject
                    {
                     
                            newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getJsonObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleJsonCompositeValue1622);
                    this_JsonObject_0=ruleJsonObject();

                    state._fsp--;

                     
                            current = this_JsonObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:824:5: this_JsonArray_1= ruleJsonArray
                    {
                     
                            newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getJsonArrayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeValue1649);
                    this_JsonArray_1=ruleJsonArray();

                    state._fsp--;

                     
                            current = this_JsonArray_1; 
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
    // $ANTLR end "ruleJsonCompositeValue"


    // $ANTLR start "entryRuleJsonLiteralValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:840:1: entryRuleJsonLiteralValue returns [String current=null] : iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF ;
    public final String entryRuleJsonLiteralValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonLiteralValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:841:2: (iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:842:2: iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getJsonLiteralValueRule()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue1685);
            iv_ruleJsonLiteralValue=ruleJsonLiteralValue();

            state._fsp--;

             current =iv_ruleJsonLiteralValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonLiteralValue1696); 

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
    // $ANTLR end "entryRuleJsonLiteralValue"


    // $ANTLR start "ruleJsonLiteralValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:849:1: ruleJsonLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleJsonLiteralValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_EMPTY_JSON_OBJECT_1=null;
        Token this_EMPTY_JSON_ARRAY_2=null;
        Token this_JSON_LITERAL_BOOLEAN_3=null;
        Token this_JSON_LITERAL_NULL_4=null;
        Token this_JSON_NUMBER_5=null;
        Token this_JSON_META_SCALAR_TYPE_6=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:852:28: ( (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:853:1: (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:853:1: (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE )
            int alt15=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_EMPTY_JSON_OBJECT:
                {
                alt15=2;
                }
                break;
            case RULE_EMPTY_JSON_ARRAY:
                {
                alt15=3;
                }
                break;
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt15=4;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt15=5;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt15=6;
                }
                break;
            case RULE_JSON_META_SCALAR_TYPE:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:853:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonLiteralValue1736); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getJsonLiteralValueAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:861:10: this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT
                    {
                    this_EMPTY_JSON_OBJECT_1=(Token)match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonLiteralValue1762); 

                    		current.merge(this_EMPTY_JSON_OBJECT_1);
                        
                     
                        newLeafNode(this_EMPTY_JSON_OBJECT_1, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:869:10: this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY
                    {
                    this_EMPTY_JSON_ARRAY_2=(Token)match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonLiteralValue1788); 

                    		current.merge(this_EMPTY_JSON_ARRAY_2);
                        
                     
                        newLeafNode(this_EMPTY_JSON_ARRAY_2, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:877:10: this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN
                    {
                    this_JSON_LITERAL_BOOLEAN_3=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonLiteralValue1814); 

                    		current.merge(this_JSON_LITERAL_BOOLEAN_3);
                        
                     
                        newLeafNode(this_JSON_LITERAL_BOOLEAN_3, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:885:10: this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL
                    {
                    this_JSON_LITERAL_NULL_4=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonLiteralValue1840); 

                    		current.merge(this_JSON_LITERAL_NULL_4);
                        
                     
                        newLeafNode(this_JSON_LITERAL_NULL_4, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:893:10: this_JSON_NUMBER_5= RULE_JSON_NUMBER
                    {
                    this_JSON_NUMBER_5=(Token)match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_ruleJsonLiteralValue1866); 

                    		current.merge(this_JSON_NUMBER_5);
                        
                     
                        newLeafNode(this_JSON_NUMBER_5, grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBERTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:901:10: this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE
                    {
                    this_JSON_META_SCALAR_TYPE_6=(Token)match(input,RULE_JSON_META_SCALAR_TYPE,FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_ruleJsonLiteralValue1892); 

                    		current.merge(this_JSON_META_SCALAR_TYPE_6);
                        
                     
                        newLeafNode(this_JSON_META_SCALAR_TYPE_6, grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_6()); 
                        

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
    // $ANTLR end "ruleJsonLiteralValue"


    // $ANTLR start "entryRuleJsonObject"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:916:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:917:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:918:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject1937);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject1947); 

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
    // $ANTLR end "entryRuleJsonObject"


    // $ANTLR start "ruleJsonObject"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:925:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) ;
    public final EObject ruleJsonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_keyValuePair_1_0 = null;

        EObject lv_keyValuePair_3_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:928:28: ( (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:929:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:929:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:929:3: otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleJsonObject1984); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:933:1: ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:934:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:934:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:935:3: lv_keyValuePair_1_0= ruleJsonKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject2005);
            lv_keyValuePair_1_0=ruleJsonKeyValuePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonObjectRule());
            	        }
                   		add(
                   			current, 
                   			"keyValuePair",
                    		lv_keyValuePair_1_0, 
                    		"JsonKeyValuePair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:951:2: (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_STRING) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:951:4: otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonObject2018); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:955:1: ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:956:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:956:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:957:3: lv_keyValuePair_3_0= ruleJsonKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject2039);
            	    lv_keyValuePair_3_0=ruleJsonKeyValuePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJsonObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"keyValuePair",
            	            		lv_keyValuePair_3_0, 
            	            		"JsonKeyValuePair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:973:4: (otherlv_4= ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:973:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleJsonObject2054); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleJsonObject2068); 

                	newLeafNode(otherlv_5, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleJsonObject"


    // $ANTLR start "entryRuleJsonKeyValuePair"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:989:1: entryRuleJsonKeyValuePair returns [EObject current=null] : iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF ;
    public final EObject entryRuleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:990:2: (iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:991:2: iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair2104);
            iv_ruleJsonKeyValuePair=ruleJsonKeyValuePair();

            state._fsp--;

             current =iv_ruleJsonKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair2114); 

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
    // $ANTLR end "entryRuleJsonKeyValuePair"


    // $ANTLR start "ruleJsonKeyValuePair"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:998:1: ruleJsonKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1001:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1002:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1002:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1002:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1002:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1003:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1003:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1004:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair2156); 

            			newLeafNode(lv_key_0_0, grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJsonKeyValuePairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJsonKeyValuePair2173); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1024:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1025:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1025:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1026:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair2194);
            lv_value_2_0=ruleJsonObjectValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonKeyValuePairRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"JsonObjectValue");
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
    // $ANTLR end "ruleJsonKeyValuePair"


    // $ANTLR start "entryRuleJsonArray"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1050:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1051:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1052:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray2230);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray2240); 

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
    // $ANTLR end "entryRuleJsonArray"


    // $ANTLR start "ruleJsonArray"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1059:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
    public final EObject ruleJsonArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1062:28: ( (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1063:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1063:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1063:3: otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleJsonArray2277); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1067:1: ( (lv_items_1_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1068:1: (lv_items_1_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1068:1: (lv_items_1_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1069:3: lv_items_1_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2298);
            lv_items_1_0=ruleJsonObjectValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_1_0, 
                    		"JsonObjectValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1085:2: (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_STRING||(LA18_1>=RULE_EMPTY_JSON_OBJECT && LA18_1<=RULE_JSON_META_SCALAR_TYPE)||LA18_1==20||LA18_1==37) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1085:4: otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2311); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1089:1: ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1090:1: (lv_items_3_0= ruleJsonObjectValue )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1090:1: (lv_items_3_0= ruleJsonObjectValue )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1091:3: lv_items_3_0= ruleJsonObjectValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2332);
            	    lv_items_3_0=ruleJsonObjectValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_3_0, 
            	            		"JsonObjectValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1107:4: (otherlv_4= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1107:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2347); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleJsonArray2361); 

                	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleMobgenResourceDefinition"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1123:1: entryRuleMobgenResourceDefinition returns [EObject current=null] : iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF ;
    public final EObject entryRuleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenResourceDefinition = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1124:2: (iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1125:2: iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition2397);
            iv_ruleMobgenResourceDefinition=ruleMobgenResourceDefinition();

            state._fsp--;

             current =iv_ruleMobgenResourceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition2407); 

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
    // $ANTLR end "entryRuleMobgenResourceDefinition"


    // $ANTLR start "ruleMobgenResourceDefinition"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1132:1: ruleMobgenResourceDefinition returns [EObject current=null] : ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) ;
    public final EObject ruleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject this_EnumInstance_1 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1135:28: ( ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1136:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1136:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==39) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1136:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1136:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1137:1: (lv_resources_0_0= ruleMapInstance )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1137:1: (lv_resources_0_0= ruleMapInstance )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1138:3: lv_resources_0_0= ruleMapInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition2453);
                    lv_resources_0_0=ruleMapInstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMobgenResourceDefinitionRule());
                    	        }
                           		add(
                           			current, 
                           			"resources",
                            		lv_resources_0_0, 
                            		"MapInstance");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1156:5: this_EnumInstance_1= ruleEnumInstance
                    {
                     
                            newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition2481);
                    this_EnumInstance_1=ruleEnumInstance();

                    state._fsp--;

                     
                            current = this_EnumInstance_1; 
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
    // $ANTLR end "ruleMobgenResourceDefinition"


    // $ANTLR start "entryRuleEnumInstance"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1172:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1173:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1174:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2516);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2526); 

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
    // $ANTLR end "entryRuleEnumInstance"


    // $ANTLR start "ruleEnumInstance"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1181:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
    public final EObject ruleEnumInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1184:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1185:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1185:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1185:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEnumInstance2563); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1189:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1190:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1190:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1191:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2580); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnumInstance2597); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1211:1: ( (lv_values_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1212:1: (lv_values_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1212:1: (lv_values_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1213:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2614); 

            			newLeafNode(lv_values_3_0, grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"ID");
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1229:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==RULE_ID) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1229:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleEnumInstance2632); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1233:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1234:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1234:1: (lv_values_5_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1235:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2649); 

            	    			newLeafNode(lv_values_5_0, grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1251:4: (otherlv_6= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1251:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleEnumInstance2669); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleEnumInstance2683); 

                	newLeafNode(otherlv_7, grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleEnumInstance"


    // $ANTLR start "entryRuleMapInstance"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1267:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1268:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1269:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance2719);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance2729); 

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
    // $ANTLR end "entryRuleMapInstance"


    // $ANTLR start "ruleMapInstance"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1276:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) ;
    public final EObject ruleMapInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_keys_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_keys_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_values_5_0 = null;

        EObject lv_values_9_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1279:28: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1280:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1280:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1280:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleMapInstance2766); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1284:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1285:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1285:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1286:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2783); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMapInstance2800); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1306:1: ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1306:2: ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1306:2: ( (lv_keys_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1307:1: (lv_keys_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1307:1: (lv_keys_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1308:3: lv_keys_3_0= RULE_ID
            {
            lv_keys_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2818); 

            			newLeafNode(lv_keys_3_0, grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapInstanceRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"keys",
                    		lv_keys_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMapInstance2835); 

                	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getColonKeyword_3_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1328:1: ( (lv_values_5_0= ruleNestedType ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1329:1: (lv_values_5_0= ruleNestedType )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1329:1: (lv_values_5_0= ruleNestedType )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1330:3: lv_values_5_0= ruleNestedType
            {
             
            	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2856);
            lv_values_5_0=ruleNestedType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapInstanceRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_5_0, 
                    		"NestedType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1346:3: (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_ID) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1346:5: otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleMapInstance2870); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1350:1: ( (lv_keys_7_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1351:1: (lv_keys_7_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1351:1: (lv_keys_7_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1352:3: lv_keys_7_0= RULE_ID
            	    {
            	    lv_keys_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2887); 

            	    			newLeafNode(lv_keys_7_0, grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMapInstanceRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"keys",
            	            		lv_keys_7_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleMapInstance2904); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMapInstanceAccess().getColonKeyword_4_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1372:1: ( (lv_values_9_0= ruleNestedType ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1373:1: (lv_values_9_0= ruleNestedType )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1373:1: (lv_values_9_0= ruleNestedType )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1374:3: lv_values_9_0= ruleNestedType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2925);
            	    lv_values_9_0=ruleNestedType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapInstanceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_9_0, 
            	            		"NestedType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1390:4: (otherlv_10= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1390:6: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleMapInstance2940); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleMapInstance2954); 

                	newLeafNode(otherlv_11, grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleMapInstance"


    // $ANTLR start "entryRuleStringList"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1406:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1407:2: (iv_ruleStringList= ruleStringList EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1408:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList2990);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList3000); 

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
    // $ANTLR end "entryRuleStringList"


    // $ANTLR start "ruleStringList"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1415:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
    public final EObject ruleStringList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1418:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1419:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1419:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1419:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleStringList3037); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1423:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1424:1: (lv_values_1_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1424:1: (lv_values_1_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1425:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3054); 

            			newLeafNode(lv_values_1_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringListRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1441:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==35) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_STRING) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1441:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleStringList3072); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1445:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1446:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1446:1: (lv_values_3_0= RULE_STRING )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1447:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3089); 

            	    			newLeafNode(lv_values_3_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStringListRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1463:4: (otherlv_4= ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1463:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleStringList3109); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleStringList3123); 

                	newLeafNode(otherlv_5, grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleStringList"


    // $ANTLR start "entryRuleNestedType"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1479:1: entryRuleNestedType returns [EObject current=null] : iv_ruleNestedType= ruleNestedType EOF ;
    public final EObject entryRuleNestedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedType = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1480:2: (iv_ruleNestedType= ruleNestedType EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1481:2: iv_ruleNestedType= ruleNestedType EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType3159);
            iv_ruleNestedType=ruleNestedType();

            state._fsp--;

             current =iv_ruleNestedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType3169); 

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
    // $ANTLR end "entryRuleNestedType"


    // $ANTLR start "ruleNestedType"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1488:1: ruleNestedType returns [EObject current=null] : ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNestedType() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_list_0_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1491:28: ( ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1492:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1492:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_STRING) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1492:2: ( (lv_list_0_0= ruleStringList ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1492:2: ( (lv_list_0_0= ruleStringList ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1493:1: (lv_list_0_0= ruleStringList )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1493:1: (lv_list_0_0= ruleStringList )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1494:3: lv_list_0_0= ruleStringList
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringList_in_ruleNestedType3215);
                    lv_list_0_0=ruleStringList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNestedTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_0_0, 
                            		"StringList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1511:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1511:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1512:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1512:1: (lv_string_1_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1513:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNestedType3238); 

                    			newLeafNode(lv_string_1_0, grammarAccess.getNestedTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNestedTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_1_0, 
                            		"STRING");
                    	    

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
    // $ANTLR end "ruleNestedType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMobgen_in_entryRuleMobgen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_ruleMobgen131 = new BitSet(new long[]{0x0000018000800000L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_ruleMobgen153 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_ruleMobgen180 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePlatform265 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlatform277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatform295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePlatform312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlatform329 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_rulePlatform348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenCallDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMobgenCallDefinition431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenCallDefinition448 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMobgenCallDefinition465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleMobgenCallDefinition482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMobgenCallDefinition499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleURI_in_ruleMobgenCallDefinition520 = new BitSet(new long[]{0x0000000284000002L});
    public static final BitSet FOLLOW_26_in_ruleMobgenCallDefinition533 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMobgenCallDefinition545 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMobgenCallDefinition557 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMobgenCallDefinition569 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition590 = new BitSet(new long[]{0x00000002A0000002L});
    public static final BitSet FOLLOW_29_in_ruleMobgenCallDefinition603 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMobgenCallDefinition615 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition636 = new BitSet(new long[]{0x0000000280000002L});
    public static final BitSet FOLLOW_31_in_ruleMobgenCallDefinition653 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMobgenCallDefinition665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition686 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleMobgenCallDefinition701 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMobgenCallDefinition713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI824 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_20_in_ruleURI843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI860 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleURI877 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI894 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeader947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenHeader989 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenHeader1007 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMobgenHeader1019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1040 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMobgenHeader1053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1074 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMobgenHeader1089 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMobgenHeader1103 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenHeader1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1203 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMobgenHeaderKeyValuePair1220 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_ruleMobgenHeaderKeyValuePair1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenJson1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenJson1360 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenJson1377 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1398 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenJson1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue1565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeValue1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleJsonCompositeValue1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeValue1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonLiteralValue1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonLiteralValue1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonLiteralValue1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonLiteralValue1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonLiteralValue1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonLiteralValue1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_ruleJsonLiteralValue1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_ruleJsonLiteralValue1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject1937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleJsonObject1984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject2005 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJsonObject2018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject2039 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJsonObject2054 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleJsonObject2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair2104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair2156 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleJsonKeyValuePair2173 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray2230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleJsonArray2277 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2298 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2311 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2332 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2347 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleJsonArray2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition2397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumInstance2563 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2580 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumInstance2597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2614 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleEnumInstance2632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2649 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleEnumInstance2669 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumInstance2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance2719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMapInstance2766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2783 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapInstance2800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2818 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMapInstance2835 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2856 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMapInstance2870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2887 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMapInstance2904 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2925 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMapInstance2940 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMapInstance2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList2990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringList3037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3054 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList3072 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3089 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList3109 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStringList3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType3159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleNestedType3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNestedType3238 = new BitSet(new long[]{0x0000000000000002L});

}