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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:424:1: ruleURI returns [EObject current=null] : ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token this_ANY_OTHER_4=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:427:28: ( ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )*
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
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
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:3: this_ANY_OTHER_0= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI819); 
            	     
            	        newLeafNode(this_ANY_OTHER_0, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            	        

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:432:3: (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:432:5: otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )*
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleURI833); 

            	        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:436:1: ( (lv_parameters_2_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:437:1: (lv_parameters_2_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:437:1: (lv_parameters_2_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:438:3: lv_parameters_2_0= RULE_ID
            	    {
            	    lv_parameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI850); 

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

            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleURI867); 

            	        	newLeafNode(otherlv_3, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:458:1: (this_ANY_OTHER_4= RULE_ANY_OTHER )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ANY_OTHER) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:458:2: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    	    {
            	    	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI879); 
            	    	     
            	    	        newLeafNode(this_ANY_OTHER_4, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


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
    // $ANTLR end "ruleURI"


    // $ANTLR start "entryRuleMobgenHeader"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:470:1: entryRuleMobgenHeader returns [EObject current=null] : iv_ruleMobgenHeader= ruleMobgenHeader EOF ;
    public final EObject entryRuleMobgenHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeader = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:471:2: (iv_ruleMobgenHeader= ruleMobgenHeader EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:472:2: iv_ruleMobgenHeader= ruleMobgenHeader EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderRule()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader918);
            iv_ruleMobgenHeader=ruleMobgenHeader();

            state._fsp--;

             current =iv_ruleMobgenHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeader928); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:479:1: ruleMobgenHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:482:28: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:483:1: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:483:1: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:483:2: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:483:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:484:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:484:1: (lv_name_0_0= RULE_ID )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:485:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenHeader970); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleMobgenHeader988); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMobgenHeader1000); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:509:1: ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:510:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:510:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:511:3: lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1021);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:527:2: (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_STRING) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:527:4: otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleMobgenHeader1034); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:531:1: ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:532:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:532:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:533:3: lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1055);
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
            	    break loop11;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:549:4: (otherlv_6= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:549:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleMobgenHeader1070); 

                        	newLeafNode(otherlv_6, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleMobgenHeader1084); 

                	newLeafNode(otherlv_7, grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleMobgenHeader1096); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:569:1: entryRuleMobgenHeaderKeyValuePair returns [EObject current=null] : iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF ;
    public final EObject entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeaderKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:570:2: (iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:571:2: iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair1132);
            iv_ruleMobgenHeaderKeyValuePair=ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleMobgenHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair1142); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:578:1: ruleMobgenHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) ) ;
    public final EObject ruleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:581:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:582:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:582:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:582:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:582:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:583:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:583:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:584:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1184); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleMobgenHeaderKeyValuePair1201); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:604:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_MOBGEN_HEADER_PARAMETER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:604:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:604:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:605:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:605:1: (lv_value_2_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:606:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1219); 

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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:623:6: ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:623:6: ( (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:624:1: (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:624:1: (lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:625:3: lv_value_3_0= RULE_MOBGEN_HEADER_PARAMETER
                    {
                    lv_value_3_0=(Token)match(input,RULE_MOBGEN_HEADER_PARAMETER,FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_ruleMobgenHeaderKeyValuePair1247); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:649:1: entryRuleMobgenJson returns [EObject current=null] : iv_ruleMobgenJson= ruleMobgenJson EOF ;
    public final EObject entryRuleMobgenJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenJson = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:650:2: (iv_ruleMobgenJson= ruleMobgenJson EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:651:2: iv_ruleMobgenJson= ruleMobgenJson EOF
            {
             newCompositeNode(grammarAccess.getMobgenJsonRule()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1289);
            iv_ruleMobgenJson=ruleMobgenJson();

            state._fsp--;

             current =iv_ruleMobgenJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenJson1299); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:658:1: ruleMobgenJson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleMobgenJson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:661:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:662:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:662:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:662:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:662:2: ( (lv_name_0_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:663:1: (lv_name_0_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:663:1: (lv_name_0_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:664:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenJson1341); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleMobgenJson1358); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:684:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:685:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:685:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:686:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1379);
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

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleMobgenJson1391); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:714:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:715:2: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:716:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectValueRule()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1427);
            iv_ruleJsonObjectValue=ruleJsonObjectValue();

            state._fsp--;

             current =iv_ruleJsonObjectValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObjectValue1437); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:723:1: ruleJsonObjectValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:726:28: ( ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:727:1: ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:727:1: ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||(LA14_0>=RULE_EMPTY_JSON_OBJECT && LA14_0<=RULE_JSON_META_SCALAR_TYPE)) ) {
                alt14=1;
            }
            else if ( (LA14_0==20||LA14_0==37) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:727:2: ( (lv_value_0_0= ruleJsonLiteralValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:727:2: ( (lv_value_0_0= ruleJsonLiteralValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:728:1: (lv_value_0_0= ruleJsonLiteralValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:728:1: (lv_value_0_0= ruleJsonLiteralValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:729:3: lv_value_0_0= ruleJsonLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1483);
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:746:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:746:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:747:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:747:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:748:3: lv_composite_1_0= ruleJsonCompositeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1510);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:772:1: entryRuleJsonCompositeValue returns [EObject current=null] : iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF ;
    public final EObject entryRuleJsonCompositeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:773:2: (iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:774:2: iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeValueRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue1546);
            iv_ruleJsonCompositeValue=ruleJsonCompositeValue();

            state._fsp--;

             current =iv_ruleJsonCompositeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeValue1556); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:781:1: ruleJsonCompositeValue returns [EObject current=null] : (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray ) ;
    public final EObject ruleJsonCompositeValue() throws RecognitionException {
        EObject current = null;

        EObject this_JsonObject_0 = null;

        EObject this_JsonArray_1 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:784:28: ( (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:785:1: (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:785:1: (this_JsonObject_0= ruleJsonObject | this_JsonArray_1= ruleJsonArray )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==37) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:786:5: this_JsonObject_0= ruleJsonObject
                    {
                     
                            newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getJsonObjectParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleJsonCompositeValue1603);
                    this_JsonObject_0=ruleJsonObject();

                    state._fsp--;

                     
                            current = this_JsonObject_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:796:5: this_JsonArray_1= ruleJsonArray
                    {
                     
                            newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getJsonArrayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeValue1630);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:812:1: entryRuleJsonLiteralValue returns [String current=null] : iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF ;
    public final String entryRuleJsonLiteralValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonLiteralValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:813:2: (iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:814:2: iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getJsonLiteralValueRule()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue1666);
            iv_ruleJsonLiteralValue=ruleJsonLiteralValue();

            state._fsp--;

             current =iv_ruleJsonLiteralValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonLiteralValue1677); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:821:1: ruleJsonLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:824:28: ( (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:825:1: (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:825:1: (this_STRING_0= RULE_STRING | this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL | this_JSON_NUMBER_5= RULE_JSON_NUMBER | this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE )
            int alt16=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt16=1;
                }
                break;
            case RULE_EMPTY_JSON_OBJECT:
                {
                alt16=2;
                }
                break;
            case RULE_EMPTY_JSON_ARRAY:
                {
                alt16=3;
                }
                break;
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt16=4;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt16=5;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt16=6;
                }
                break;
            case RULE_JSON_META_SCALAR_TYPE:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:825:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonLiteralValue1717); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getJsonLiteralValueAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:833:10: this_EMPTY_JSON_OBJECT_1= RULE_EMPTY_JSON_OBJECT
                    {
                    this_EMPTY_JSON_OBJECT_1=(Token)match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonLiteralValue1743); 

                    		current.merge(this_EMPTY_JSON_OBJECT_1);
                        
                     
                        newLeafNode(this_EMPTY_JSON_OBJECT_1, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:841:10: this_EMPTY_JSON_ARRAY_2= RULE_EMPTY_JSON_ARRAY
                    {
                    this_EMPTY_JSON_ARRAY_2=(Token)match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonLiteralValue1769); 

                    		current.merge(this_EMPTY_JSON_ARRAY_2);
                        
                     
                        newLeafNode(this_EMPTY_JSON_ARRAY_2, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:849:10: this_JSON_LITERAL_BOOLEAN_3= RULE_JSON_LITERAL_BOOLEAN
                    {
                    this_JSON_LITERAL_BOOLEAN_3=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonLiteralValue1795); 

                    		current.merge(this_JSON_LITERAL_BOOLEAN_3);
                        
                     
                        newLeafNode(this_JSON_LITERAL_BOOLEAN_3, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:857:10: this_JSON_LITERAL_NULL_4= RULE_JSON_LITERAL_NULL
                    {
                    this_JSON_LITERAL_NULL_4=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonLiteralValue1821); 

                    		current.merge(this_JSON_LITERAL_NULL_4);
                        
                     
                        newLeafNode(this_JSON_LITERAL_NULL_4, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:865:10: this_JSON_NUMBER_5= RULE_JSON_NUMBER
                    {
                    this_JSON_NUMBER_5=(Token)match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_ruleJsonLiteralValue1847); 

                    		current.merge(this_JSON_NUMBER_5);
                        
                     
                        newLeafNode(this_JSON_NUMBER_5, grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBERTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:873:10: this_JSON_META_SCALAR_TYPE_6= RULE_JSON_META_SCALAR_TYPE
                    {
                    this_JSON_META_SCALAR_TYPE_6=(Token)match(input,RULE_JSON_META_SCALAR_TYPE,FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_ruleJsonLiteralValue1873); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:888:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:889:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:890:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject1918);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject1928); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:897:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:900:28: ( (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:901:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:901:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:901:3: otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleJsonObject1965); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:905:1: ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:906:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:906:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:907:3: lv_keyValuePair_1_0= ruleJsonKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1986);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:923:2: (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_STRING) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:923:4: otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonObject1999); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:927:1: ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:928:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:928:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:929:3: lv_keyValuePair_3_0= ruleJsonKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject2020);
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
            	    break loop17;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:945:4: (otherlv_4= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:945:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleJsonObject2035); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleJsonObject2049); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:961:1: entryRuleJsonKeyValuePair returns [EObject current=null] : iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF ;
    public final EObject entryRuleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:962:2: (iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:963:2: iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair2085);
            iv_ruleJsonKeyValuePair=ruleJsonKeyValuePair();

            state._fsp--;

             current =iv_ruleJsonKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair2095); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:970:1: ruleJsonKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:973:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:974:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:974:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:974:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:974:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:975:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:975:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:976:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair2137); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJsonKeyValuePair2154); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:996:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:997:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:997:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:998:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair2175);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1022:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1023:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1024:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray2211);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray2221); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1031:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1034:28: ( (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1035:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1035:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1035:3: otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleJsonArray2258); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1039:1: ( (lv_items_1_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1040:1: (lv_items_1_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1040:1: (lv_items_1_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1041:3: lv_items_1_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2279);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1057:2: (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_STRING||(LA19_1>=RULE_EMPTY_JSON_OBJECT && LA19_1<=RULE_JSON_META_SCALAR_TYPE)||LA19_1==20||LA19_1==37) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1057:4: otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2292); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1061:1: ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1062:1: (lv_items_3_0= ruleJsonObjectValue )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1062:1: (lv_items_3_0= ruleJsonObjectValue )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1063:3: lv_items_3_0= ruleJsonObjectValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2313);
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
            	    break loop19;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1079:4: (otherlv_4= ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1079:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2328); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleJsonArray2342); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1095:1: entryRuleMobgenResourceDefinition returns [EObject current=null] : iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF ;
    public final EObject entryRuleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenResourceDefinition = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1096:2: (iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1097:2: iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition2378);
            iv_ruleMobgenResourceDefinition=ruleMobgenResourceDefinition();

            state._fsp--;

             current =iv_ruleMobgenResourceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition2388); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1104:1: ruleMobgenResourceDefinition returns [EObject current=null] : ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) ;
    public final EObject ruleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject this_EnumInstance_1 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1107:28: ( ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1108:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1108:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            else if ( (LA21_0==39) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1108:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1108:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1109:1: (lv_resources_0_0= ruleMapInstance )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1109:1: (lv_resources_0_0= ruleMapInstance )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1110:3: lv_resources_0_0= ruleMapInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition2434);
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1128:5: this_EnumInstance_1= ruleEnumInstance
                    {
                     
                            newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition2462);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1144:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1145:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1146:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2497);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2507); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1153:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1156:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1157:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1157:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1157:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEnumInstance2544); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1161:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1162:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1162:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1163:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2561); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnumInstance2578); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1183:1: ( (lv_values_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1184:1: (lv_values_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1184:1: (lv_values_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1185:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2595); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1201:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_ID) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1201:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleEnumInstance2613); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1205:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1206:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1206:1: (lv_values_5_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1207:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2630); 

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
            	    break loop22;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1223:4: (otherlv_6= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1223:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleEnumInstance2650); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleEnumInstance2664); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1239:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1240:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1241:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance2700);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance2710); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1248:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1251:28: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1252:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1252:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1252:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleMapInstance2747); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1256:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1257:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1257:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1258:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2764); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMapInstance2781); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1278:1: ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1278:2: ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1278:2: ( (lv_keys_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1279:1: (lv_keys_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1279:1: (lv_keys_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1280:3: lv_keys_3_0= RULE_ID
            {
            lv_keys_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2799); 

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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMapInstance2816); 

                	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getColonKeyword_3_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1300:1: ( (lv_values_5_0= ruleNestedType ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1301:1: (lv_values_5_0= ruleNestedType )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1301:1: (lv_values_5_0= ruleNestedType )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1302:3: lv_values_5_0= ruleNestedType
            {
             
            	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2837);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1318:3: (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1318:5: otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleMapInstance2851); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1322:1: ( (lv_keys_7_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1323:1: (lv_keys_7_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1323:1: (lv_keys_7_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1324:3: lv_keys_7_0= RULE_ID
            	    {
            	    lv_keys_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2868); 

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

            	    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleMapInstance2885); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMapInstanceAccess().getColonKeyword_4_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1344:1: ( (lv_values_9_0= ruleNestedType ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1345:1: (lv_values_9_0= ruleNestedType )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1345:1: (lv_values_9_0= ruleNestedType )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1346:3: lv_values_9_0= ruleNestedType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2906);
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
            	    break loop24;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1362:4: (otherlv_10= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1362:6: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleMapInstance2921); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleMapInstance2935); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1378:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1379:2: (iv_ruleStringList= ruleStringList EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1380:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList2971);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList2981); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1387:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1390:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1391:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1391:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1391:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleStringList3018); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1395:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1396:1: (lv_values_1_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1396:1: (lv_values_1_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1397:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3035); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1413:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_STRING) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1413:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleStringList3053); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1417:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1418:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1418:1: (lv_values_3_0= RULE_STRING )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1419:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3070); 

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
            	    break loop26;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1435:4: (otherlv_4= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1435:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleStringList3090); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleStringList3104); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1451:1: entryRuleNestedType returns [EObject current=null] : iv_ruleNestedType= ruleNestedType EOF ;
    public final EObject entryRuleNestedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedType = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1452:2: (iv_ruleNestedType= ruleNestedType EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1453:2: iv_ruleNestedType= ruleNestedType EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType3140);
            iv_ruleNestedType=ruleNestedType();

            state._fsp--;

             current =iv_ruleNestedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType3150); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1460:1: ruleNestedType returns [EObject current=null] : ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNestedType() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_list_0_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1463:28: ( ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1464:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1464:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_STRING) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1464:2: ( (lv_list_0_0= ruleStringList ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1464:2: ( (lv_list_0_0= ruleStringList ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1465:1: (lv_list_0_0= ruleStringList )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1465:1: (lv_list_0_0= ruleStringList )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1466:3: lv_list_0_0= ruleStringList
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringList_in_ruleNestedType3196);
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1483:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1483:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1484:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1484:1: (lv_string_1_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1485:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNestedType3219); 

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
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI819 = new BitSet(new long[]{0x0000000000100082L});
    public static final BitSet FOLLOW_20_in_ruleURI833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI850 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleURI867 = new BitSet(new long[]{0x0000000000100082L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI879 = new BitSet(new long[]{0x0000000000100082L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeader928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenHeader970 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenHeader988 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMobgenHeader1000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1021 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMobgenHeader1034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader1055 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMobgenHeader1070 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMobgenHeader1084 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenHeader1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1184 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleMobgenHeaderKeyValuePair1201 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MOBGEN_HEADER_PARAMETER_in_ruleMobgenHeaderKeyValuePair1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenJson1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenJson1341 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenJson1358 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1379 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenJson1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue1546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeValue1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleJsonCompositeValue1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeValue1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue1666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonLiteralValue1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonLiteralValue1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonLiteralValue1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonLiteralValue1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonLiteralValue1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonLiteralValue1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_ruleJsonLiteralValue1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_ruleJsonLiteralValue1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleJsonObject1965 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1986 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJsonObject1999 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject2020 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJsonObject2035 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleJsonObject2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair2085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair2137 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleJsonKeyValuePair2154 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray2211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleJsonArray2258 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2279 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2292 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2313 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2328 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleJsonArray2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition2378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumInstance2544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2561 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumInstance2578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2595 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleEnumInstance2613 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2630 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleEnumInstance2650 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumInstance2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMapInstance2747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2764 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapInstance2781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2799 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMapInstance2816 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2837 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMapInstance2851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2868 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMapInstance2885 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2906 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMapInstance2921 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMapInstance2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList2971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringList3018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3035 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList3053 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3070 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList3090 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStringList3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType3140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleNestedType3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNestedType3219 = new BitSet(new long[]{0x0000000000000002L});

}