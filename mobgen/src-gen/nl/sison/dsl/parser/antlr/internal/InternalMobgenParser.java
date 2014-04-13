package nl.sison.dsl.parser.antlr.internal; 

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
import nl.sison.dsl.services.MobgenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMobgenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RESTFUL_METHODS", "RULE_URL_PREFIX", "RULE_URL_PATH", "RULE_URL_QUERY", "RULE_URL_QUERY_SUFFIX", "RULE_JSON_META_SCALAR_TYPE", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_NULL", "RULE_JSON_LITERAL_BOOLEAN", "RULE_INT", "RULE_JSON_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'platform'", "'{'", "'->'", "'}'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'enum'", "'map'", "'['", "']'", "'JsonObject'", "'JsonArray'", "'STRING'", "'EMPTY_JSON_OBJECT'", "'EMPTY_JSON_ARRAY'", "'JSON_LITERAL_BOOLEAN'", "'JSON_LITERAL_NULL'", "'JSON_NUMBER'", "'JSON_META_SCALAR_TYPE'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_JSON_META_SCALAR_TYPE=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_EMPTY_JSON_ARRAY=13;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_URL_QUERY=9;
    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_JSON_NUMBER=17;
    public static final int RULE_URL_PATH=8;
    public static final int RULE_INT=16;
    public static final int RULE_RESTFUL_METHODS=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_JSON_LITERAL_BOOLEAN=15;
    public static final int RULE_EMPTY_JSON_OBJECT=12;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_URL_PREFIX=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=14;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=20;
    public static final int RULE_URL_QUERY_SUFFIX=10;

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:68:1: entryRuleMobgen returns [EObject current=null] : iv_ruleMobgen= ruleMobgen EOF ;
    public final EObject entryRuleMobgen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgen = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:69:2: (iv_ruleMobgen= ruleMobgen EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:70:2: iv_ruleMobgen= ruleMobgen EOF
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:77:1: ruleMobgen returns [EObject current=null] : ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ ) ;
    public final EObject ruleMobgen() throws RecognitionException {
        EObject current = null;

        EObject lv_platform_0_0 = null;

        EObject lv_resources_1_0 = null;

        EObject lv_calls_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:80:28: ( ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+ )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:2: ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:2: ( (lv_platform_0_0= rulePlatform ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:82:1: (lv_platform_0_0= rulePlatform )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:82:1: (lv_platform_0_0= rulePlatform )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:83:3: lv_platform_0_0= rulePlatform
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:99:2: ( ( (lv_resources_1_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_2_0= ruleMobgenCallDefinition ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=40 && LA1_0<=41)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==26) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:99:3: ( (lv_resources_1_0= ruleMobgenResourceDefinition ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:99:3: ( (lv_resources_1_0= ruleMobgenResourceDefinition ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:100:1: (lv_resources_1_0= ruleMobgenResourceDefinition )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:100:1: (lv_resources_1_0= ruleMobgenResourceDefinition )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:101:3: lv_resources_1_0= ruleMobgenResourceDefinition
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
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:118:6: ( (lv_calls_2_0= ruleMobgenCallDefinition ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:118:6: ( (lv_calls_2_0= ruleMobgenCallDefinition ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:119:1: (lv_calls_2_0= ruleMobgenCallDefinition )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:119:1: (lv_calls_2_0= ruleMobgenCallDefinition )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:120:3: lv_calls_2_0= ruleMobgenCallDefinition
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:144:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:145:2: (iv_rulePlatform= rulePlatform EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:146:2: iv_rulePlatform= rulePlatform EOF
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:153:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:156:28: ( (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:157:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:157:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:157:3: otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePlatform265); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_rulePlatform277); 

                	newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:165:1: ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+
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
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:165:2: ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:165:2: ( (lv_platforms_2_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:166:1: (lv_platforms_2_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:166:1: (lv_platforms_2_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:167:3: lv_platforms_2_0= RULE_ID
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

            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePlatform312); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:187:1: ( (lv_generateWhere_4_0= RULE_STRING ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:188:1: (lv_generateWhere_4_0= RULE_STRING )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:188:1: (lv_generateWhere_4_0= RULE_STRING )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:189:3: lv_generateWhere_4_0= RULE_STRING
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_rulePlatform348); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:217:1: entryRuleMobgenCallDefinition returns [EObject current=null] : iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF ;
    public final EObject entryRuleMobgenCallDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenCallDefinition = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:218:2: (iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:219:2: iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:226:1: ruleMobgenCallDefinition returns [EObject current=null] : (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:229:28: ( (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:230:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:230:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:230:3: otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMobgenCallDefinition431); 

                	newLeafNode(otherlv_0, grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:234:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:235:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:235:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:236:3: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMobgenCallDefinition465); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:256:1: ( (lv_method_3_0= RULE_RESTFUL_METHODS ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:257:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:257:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:258:3: lv_method_3_0= RULE_RESTFUL_METHODS
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMobgenCallDefinition499); 

                	newLeafNode(otherlv_4, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:278:1: ( (lv_uri_5_0= ruleURI ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:279:1: (lv_uri_5_0= ruleURI )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:279:1: (lv_uri_5_0= ruleURI )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:280:3: lv_uri_5_0= ruleURI
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:296:2: (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:296:4: otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )?
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleMobgenCallDefinition533); 

                        	newLeafNode(otherlv_6, grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleMobgenCallDefinition545); 

                        	newLeafNode(otherlv_7, grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleMobgenCallDefinition557); 

                        	newLeafNode(otherlv_8, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2());
                        
                    otherlv_9=(Token)match(input,31,FOLLOW_31_in_ruleMobgenCallDefinition569); 

                        	newLeafNode(otherlv_9, grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:312:1: ( (lv_requestHeaders_10_0= ruleMobgenHeader ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:313:1: (lv_requestHeaders_10_0= ruleMobgenHeader )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:313:1: (lv_requestHeaders_10_0= ruleMobgenHeader )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:314:3: lv_requestHeaders_10_0= ruleMobgenHeader
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

                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:330:2: (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==32) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:330:4: otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) )
                            {
                            otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleMobgenCallDefinition603); 

                                	newLeafNode(otherlv_11, grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0());
                                
                            otherlv_12=(Token)match(input,33,FOLLOW_33_in_ruleMobgenCallDefinition615); 

                                	newLeafNode(otherlv_12, grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1());
                                
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:338:1: ( (lv_responseHeaders_13_0= ruleMobgenHeader ) )
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:339:1: (lv_responseHeaders_13_0= ruleMobgenHeader )
                            {
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:339:1: (lv_responseHeaders_13_0= ruleMobgenHeader )
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:340:3: lv_responseHeaders_13_0= ruleMobgenHeader
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:356:6: (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:356:8: otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) )
                    {
                    otherlv_14=(Token)match(input,34,FOLLOW_34_in_ruleMobgenCallDefinition653); 

                        	newLeafNode(otherlv_14, grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,35,FOLLOW_35_in_ruleMobgenCallDefinition665); 

                        	newLeafNode(otherlv_15, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:364:1: ( (lv_jsonToClient_16_0= ruleMobgenJson ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:365:1: (lv_jsonToClient_16_0= ruleMobgenJson )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:365:1: (lv_jsonToClient_16_0= ruleMobgenJson )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:366:3: lv_jsonToClient_16_0= ruleMobgenJson
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:382:4: (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:382:6: otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) )
                    {
                    otherlv_17=(Token)match(input,36,FOLLOW_36_in_ruleMobgenCallDefinition701); 

                        	newLeafNode(otherlv_17, grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,35,FOLLOW_35_in_ruleMobgenCallDefinition713); 

                        	newLeafNode(otherlv_18, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:390:1: ( (lv_jsonToServer_19_0= ruleMobgenJson ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:391:1: (lv_jsonToServer_19_0= ruleMobgenJson )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:391:1: (lv_jsonToServer_19_0= ruleMobgenJson )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:392:3: lv_jsonToServer_19_0= ruleMobgenJson
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


    // $ANTLR start "entryRuleMobgenHeader"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:416:1: entryRuleMobgenHeader returns [EObject current=null] : iv_ruleMobgenHeader= ruleMobgenHeader EOF ;
    public final EObject entryRuleMobgenHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeader = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:417:2: (iv_ruleMobgenHeader= ruleMobgenHeader EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:418:2: iv_ruleMobgenHeader= ruleMobgenHeader EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderRule()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader772);
            iv_ruleMobgenHeader=ruleMobgenHeader();

            state._fsp--;

             current =iv_ruleMobgenHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeader782); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:425:1: ruleMobgenHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:428:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:429:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:429:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:429:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:429:2: ( (lv_name_0_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:430:1: (lv_name_0_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:430:1: (lv_name_0_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:431:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenHeader824); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleMobgenHeader841); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1());
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleMobgenHeader853); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:455:1: ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:456:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:456:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:457:3: lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader874);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:473:2: (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==38) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_STRING) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:473:4: otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleMobgenHeader887); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:477:1: ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:478:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:478:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:479:3: lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader908);
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
            	    break loop7;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:495:4: (otherlv_6= ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:495:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleMobgenHeader923); 

                        	newLeafNode(otherlv_6, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleMobgenHeader937); 

                	newLeafNode(otherlv_7, grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleMobgenHeader949); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:515:1: entryRuleMobgenHeaderKeyValuePair returns [EObject current=null] : iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF ;
    public final EObject entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeaderKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:516:2: (iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:517:2: iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair985);
            iv_ruleMobgenHeaderKeyValuePair=ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleMobgenHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair995); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:524:1: ruleMobgenHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) ) ;
    public final EObject ruleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        EObject lv_parameter_3_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:527:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:528:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:528:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:528:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:528:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:529:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:529:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:530:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1037); 

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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleMobgenHeaderKeyValuePair1054); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:550:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==23) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:550:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:550:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:551:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:551:1: (lv_value_2_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:552:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1072); 

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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:569:6: ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:569:6: ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:570:1: (lv_parameter_3_0= ruleMobgenHeaderParameter )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:570:1: (lv_parameter_3_0= ruleMobgenHeaderParameter )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:571:3: lv_parameter_3_0= ruleMobgenHeaderParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterMobgenHeaderParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_ruleMobgenHeaderKeyValuePair1104);
                    lv_parameter_3_0=ruleMobgenHeaderParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMobgenHeaderKeyValuePairRule());
                    	        }
                           		set(
                           			current, 
                           			"parameter",
                            		lv_parameter_3_0, 
                            		"MobgenHeaderParameter");
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
    // $ANTLR end "ruleMobgenHeaderKeyValuePair"


    // $ANTLR start "entryRuleMobgenHeaderParameter"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:595:1: entryRuleMobgenHeaderParameter returns [EObject current=null] : iv_ruleMobgenHeaderParameter= ruleMobgenHeaderParameter EOF ;
    public final EObject entryRuleMobgenHeaderParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeaderParameter = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:596:2: (iv_ruleMobgenHeaderParameter= ruleMobgenHeaderParameter EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:597:2: iv_ruleMobgenHeaderParameter= ruleMobgenHeaderParameter EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderParameterRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter1141);
            iv_ruleMobgenHeaderParameter=ruleMobgenHeaderParameter();

            state._fsp--;

             current =iv_ruleMobgenHeaderParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderParameter1151); 

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
    // $ANTLR end "entryRuleMobgenHeaderParameter"


    // $ANTLR start "ruleMobgenHeaderParameter"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:604:1: ruleMobgenHeaderParameter returns [EObject current=null] : (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleMobgenHeaderParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:607:28: ( (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:608:1: (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:608:1: (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:608:3: otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMobgenHeaderParameter1188); 

                	newLeafNode(otherlv_0, grammarAccess.getMobgenHeaderParameterAccess().getLeftCurlyBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:612:1: ( (lv_id_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:613:1: (lv_id_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:613:1: (lv_id_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:614:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenHeaderParameter1205); 

            			newLeafNode(lv_id_1_0, grammarAccess.getMobgenHeaderParameterAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMobgenHeaderParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleMobgenHeaderParameter1222); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenHeaderParameterAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleMobgenHeaderParameter"


    // $ANTLR start "entryRuleMobgenJson"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:642:1: entryRuleMobgenJson returns [EObject current=null] : iv_ruleMobgenJson= ruleMobgenJson EOF ;
    public final EObject entryRuleMobgenJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenJson = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:643:2: (iv_ruleMobgenJson= ruleMobgenJson EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:644:2: iv_ruleMobgenJson= ruleMobgenJson EOF
            {
             newCompositeNode(grammarAccess.getMobgenJsonRule()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1258);
            iv_ruleMobgenJson=ruleMobgenJson();

            state._fsp--;

             current =iv_ruleMobgenJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenJson1268); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:651:1: ruleMobgenJson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleMobgenJson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:654:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:655:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:655:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:655:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:655:2: ( (lv_name_0_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:656:1: (lv_name_0_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:656:1: (lv_name_0_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:657:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenJson1310); 

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

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleMobgenJson1327); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:677:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:678:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:678:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:679:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1348);
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

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleMobgenJson1360); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:707:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:708:2: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:709:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectValueRule()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1396);
            iv_ruleJsonObjectValue=ruleJsonObjectValue();

            state._fsp--;

             current =iv_ruleJsonObjectValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObjectValue1406); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:716:1: ruleJsonObjectValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;

        Enumerator lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:719:28: ( ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:720:1: ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:720:1: ( ( (lv_value_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=46 && LA10_0<=52)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=44 && LA10_0<=45)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:720:2: ( (lv_value_0_0= ruleJsonLiteralValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:720:2: ( (lv_value_0_0= ruleJsonLiteralValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:721:1: (lv_value_0_0= ruleJsonLiteralValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:721:1: (lv_value_0_0= ruleJsonLiteralValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:722:3: lv_value_0_0= ruleJsonLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1452);
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:739:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:739:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:740:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:740:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:741:3: lv_composite_1_0= ruleJsonCompositeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1479);
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


    // $ANTLR start "entryRuleJsonKeyValuePair"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:767:1: entryRuleJsonKeyValuePair returns [EObject current=null] : iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF ;
    public final EObject entryRuleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:768:2: (iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:769:2: iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair1517);
            iv_ruleJsonKeyValuePair=ruleJsonKeyValuePair();

            state._fsp--;

             current =iv_ruleJsonKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair1527); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:776:1: ruleJsonKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:779:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:780:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:780:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:780:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:780:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:781:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:781:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:782:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair1569); 

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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleJsonKeyValuePair1586); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:802:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:803:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:803:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:804:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair1607);
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


    // $ANTLR start "entryRuleMobgenResourceDefinition"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:830:1: entryRuleMobgenResourceDefinition returns [EObject current=null] : iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF ;
    public final EObject entryRuleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenResourceDefinition = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:831:2: (iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:832:2: iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition1645);
            iv_ruleMobgenResourceDefinition=ruleMobgenResourceDefinition();

            state._fsp--;

             current =iv_ruleMobgenResourceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition1655); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:839:1: ruleMobgenResourceDefinition returns [EObject current=null] : ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) ;
    public final EObject ruleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject this_EnumInstance_1 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:842:28: ( ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:843:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:843:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            else if ( (LA11_0==40) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:843:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:843:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:844:1: (lv_resources_0_0= ruleMapInstance )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:844:1: (lv_resources_0_0= ruleMapInstance )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:845:3: lv_resources_0_0= ruleMapInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition1701);
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:863:5: this_EnumInstance_1= ruleEnumInstance
                    {
                     
                            newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition1729);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:879:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:880:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:881:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance1764);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance1774); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:888:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:891:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:892:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:892:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:892:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleEnumInstance1811); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:896:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:897:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:897:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:898:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance1828); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleEnumInstance1845); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:918:1: ( (lv_values_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:919:1: (lv_values_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:919:1: (lv_values_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:920:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance1862); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:936:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==38) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:936:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleEnumInstance1880); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:940:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:941:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:941:1: (lv_values_5_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:942:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance1897); 

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
            	    break loop12;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:958:4: (otherlv_6= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:958:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleEnumInstance1917); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleEnumInstance1931); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:974:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:975:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:976:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance1967);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance1977); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:983:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:986:28: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:987:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:987:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:987:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleMapInstance2014); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:991:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:992:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:992:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:993:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2031); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleMapInstance2048); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1013:1: ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1013:2: ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1013:2: ( (lv_keys_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1014:1: (lv_keys_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1014:1: (lv_keys_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1015:3: lv_keys_3_0= RULE_ID
            {
            lv_keys_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2066); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleMapInstance2083); 

                	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getColonKeyword_3_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1035:1: ( (lv_values_5_0= ruleNestedType ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1036:1: (lv_values_5_0= ruleNestedType )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1036:1: (lv_values_5_0= ruleNestedType )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1037:3: lv_values_5_0= ruleNestedType
            {
             
            	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2104);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1053:3: (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1053:5: otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) )
            	    {
            	    otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleMapInstance2118); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1057:1: ( (lv_keys_7_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1058:1: (lv_keys_7_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1058:1: (lv_keys_7_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1059:3: lv_keys_7_0= RULE_ID
            	    {
            	    lv_keys_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2135); 

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

            	    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleMapInstance2152); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMapInstanceAccess().getColonKeyword_4_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1079:1: ( (lv_values_9_0= ruleNestedType ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1080:1: (lv_values_9_0= ruleNestedType )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1080:1: (lv_values_9_0= ruleNestedType )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1081:3: lv_values_9_0= ruleNestedType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2173);
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
            	    break loop14;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1097:4: (otherlv_10= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1097:6: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,38,FOLLOW_38_in_ruleMapInstance2188); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleMapInstance2202); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1113:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1114:2: (iv_ruleStringList= ruleStringList EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1115:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList2238);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList2248); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1122:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1125:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1126:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1126:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1126:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleStringList2285); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1130:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1131:1: (lv_values_1_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1131:1: (lv_values_1_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1132:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList2302); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1148:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==RULE_STRING) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1148:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleStringList2320); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1152:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1153:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1153:1: (lv_values_3_0= RULE_STRING )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1154:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList2337); 

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
            	    break loop16;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1170:4: (otherlv_4= ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1170:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleStringList2357); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleStringList2371); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1186:1: entryRuleNestedType returns [EObject current=null] : iv_ruleNestedType= ruleNestedType EOF ;
    public final EObject entryRuleNestedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedType = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1187:2: (iv_ruleNestedType= ruleNestedType EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1188:2: iv_ruleNestedType= ruleNestedType EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType2407);
            iv_ruleNestedType=ruleNestedType();

            state._fsp--;

             current =iv_ruleNestedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType2417); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1195:1: ruleNestedType returns [EObject current=null] : ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNestedType() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_list_0_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1198:28: ( ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1199:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1199:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1199:2: ( (lv_list_0_0= ruleStringList ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1199:2: ( (lv_list_0_0= ruleStringList ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1200:1: (lv_list_0_0= ruleStringList )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1200:1: (lv_list_0_0= ruleStringList )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1201:3: lv_list_0_0= ruleStringList
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringList_in_ruleNestedType2463);
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1218:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1218:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1219:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1219:1: (lv_string_1_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1220:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNestedType2486); 

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


    // $ANTLR start "entryRuleURI"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1244:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1245:2: (iv_ruleURI= ruleURI EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1246:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI2527);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI2537); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1253:1: ruleURI returns [EObject current=null] : ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token lv_urlPrefix_0_0=null;
        Token lv_path_1_0=null;
        Token otherlv_2=null;
        Token lv_pathParameters_3_0=null;
        Token otherlv_4=null;
        Token lv_pathSuffix_5_0=null;
        Token lv_query_6_0=null;
        Token otherlv_7=null;
        Token lv_queryParameters_8_0=null;
        Token otherlv_9=null;
        Token lv_querySuffix_10_0=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1256:28: ( ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1257:1: ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1257:1: ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1257:2: ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )*
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1257:2: ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1258:1: (lv_urlPrefix_0_0= RULE_URL_PREFIX )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1258:1: (lv_urlPrefix_0_0= RULE_URL_PREFIX )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1259:3: lv_urlPrefix_0_0= RULE_URL_PREFIX
            {
            lv_urlPrefix_0_0=(Token)match(input,RULE_URL_PREFIX,FOLLOW_RULE_URL_PREFIX_in_ruleURI2579); 

            			newLeafNode(lv_urlPrefix_0_0, grammarAccess.getURIAccess().getUrlPrefixURL_PREFIXTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getURIRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"urlPrefix",
                    		lv_urlPrefix_0_0, 
                    		"URL_PREFIX");
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1275:2: ( (lv_path_1_0= RULE_URL_PATH ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1276:1: (lv_path_1_0= RULE_URL_PATH )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1276:1: (lv_path_1_0= RULE_URL_PATH )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1277:3: lv_path_1_0= RULE_URL_PATH
            {
            lv_path_1_0=(Token)match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_ruleURI2601); 

            			newLeafNode(lv_path_1_0, grammarAccess.getURIAccess().getPathURL_PATHTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getURIRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"path",
                    		lv_path_1_0, 
                    		"URL_PATH");
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1293:2: (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1293:4: otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleURI2619); 

            	        	newLeafNode(otherlv_2, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1297:1: ( (lv_pathParameters_3_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1298:1: (lv_pathParameters_3_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1298:1: (lv_pathParameters_3_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1299:3: lv_pathParameters_3_0= RULE_ID
            	    {
            	    lv_pathParameters_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI2636); 

            	    			newLeafNode(lv_pathParameters_3_0, grammarAccess.getURIAccess().getPathParametersIDTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"pathParameters",
            	            		lv_pathParameters_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleURI2653); 

            	        	newLeafNode(otherlv_4, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_2_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1319:1: ( (lv_pathSuffix_5_0= RULE_URL_PATH ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1320:1: (lv_pathSuffix_5_0= RULE_URL_PATH )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1320:1: (lv_pathSuffix_5_0= RULE_URL_PATH )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1321:3: lv_pathSuffix_5_0= RULE_URL_PATH
            	    {
            	    lv_pathSuffix_5_0=(Token)match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_ruleURI2670); 

            	    			newLeafNode(lv_pathSuffix_5_0, grammarAccess.getURIAccess().getPathSuffixURL_PATHTerminalRuleCall_2_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"pathSuffix",
            	            		lv_pathSuffix_5_0, 
            	            		"URL_PATH");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1337:4: ( (lv_query_6_0= RULE_URL_QUERY ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1338:1: (lv_query_6_0= RULE_URL_QUERY )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1338:1: (lv_query_6_0= RULE_URL_QUERY )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1339:3: lv_query_6_0= RULE_URL_QUERY
            {
            lv_query_6_0=(Token)match(input,RULE_URL_QUERY,FOLLOW_RULE_URL_QUERY_in_ruleURI2694); 

            			newLeafNode(lv_query_6_0, grammarAccess.getURIAccess().getQueryURL_QUERYTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getURIRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"query",
                    		lv_query_6_0, 
                    		"URL_QUERY");
            	    

            }


            }

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1355:2: (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1355:4: otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleURI2712); 

            	        	newLeafNode(otherlv_7, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1359:1: ( (lv_queryParameters_8_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1360:1: (lv_queryParameters_8_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1360:1: (lv_queryParameters_8_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1361:3: lv_queryParameters_8_0= RULE_ID
            	    {
            	    lv_queryParameters_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI2729); 

            	    			newLeafNode(lv_queryParameters_8_0, grammarAccess.getURIAccess().getQueryParametersIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"queryParameters",
            	            		lv_queryParameters_8_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleURI2746); 

            	        	newLeafNode(otherlv_9, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_4_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1381:1: ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1382:1: (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1382:1: (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1383:3: lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX
            	    {
            	    lv_querySuffix_10_0=(Token)match(input,RULE_URL_QUERY_SUFFIX,FOLLOW_RULE_URL_QUERY_SUFFIX_in_ruleURI2763); 

            	    			newLeafNode(lv_querySuffix_10_0, grammarAccess.getURIAccess().getQuerySuffixURL_QUERY_SUFFIXTerminalRuleCall_4_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getURIRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"querySuffix",
            	            		lv_querySuffix_10_0, 
            	            		"URL_QUERY_SUFFIX");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start "ruleJsonCompositeValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1407:1: ruleJsonCompositeValue returns [Enumerator current=null] : ( (enumLiteral_0= 'JsonObject' ) | (enumLiteral_1= 'JsonArray' ) ) ;
    public final Enumerator ruleJsonCompositeValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1409:28: ( ( (enumLiteral_0= 'JsonObject' ) | (enumLiteral_1= 'JsonArray' ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1410:1: ( (enumLiteral_0= 'JsonObject' ) | (enumLiteral_1= 'JsonArray' ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1410:1: ( (enumLiteral_0= 'JsonObject' ) | (enumLiteral_1= 'JsonArray' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            else if ( (LA21_0==45) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1410:2: (enumLiteral_0= 'JsonObject' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1410:2: (enumLiteral_0= 'JsonObject' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1410:4: enumLiteral_0= 'JsonObject'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_44_in_ruleJsonCompositeValue2820); 

                            current = grammarAccess.getJsonCompositeValueAccess().getJsonObjectEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJsonCompositeValueAccess().getJsonObjectEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1416:6: (enumLiteral_1= 'JsonArray' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1416:6: (enumLiteral_1= 'JsonArray' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1416:8: enumLiteral_1= 'JsonArray'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_45_in_ruleJsonCompositeValue2837); 

                            current = grammarAccess.getJsonCompositeValueAccess().getJsonArrayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJsonCompositeValueAccess().getJsonArrayEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleJsonCompositeValue"


    // $ANTLR start "ruleJsonLiteralValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1426:1: ruleJsonLiteralValue returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'EMPTY_JSON_OBJECT' ) | (enumLiteral_2= 'EMPTY_JSON_ARRAY' ) | (enumLiteral_3= 'JSON_LITERAL_BOOLEAN' ) | (enumLiteral_4= 'JSON_LITERAL_NULL' ) | (enumLiteral_5= 'JSON_NUMBER' ) | (enumLiteral_6= 'JSON_META_SCALAR_TYPE' ) ) ;
    public final Enumerator ruleJsonLiteralValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1428:28: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'EMPTY_JSON_OBJECT' ) | (enumLiteral_2= 'EMPTY_JSON_ARRAY' ) | (enumLiteral_3= 'JSON_LITERAL_BOOLEAN' ) | (enumLiteral_4= 'JSON_LITERAL_NULL' ) | (enumLiteral_5= 'JSON_NUMBER' ) | (enumLiteral_6= 'JSON_META_SCALAR_TYPE' ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1429:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'EMPTY_JSON_OBJECT' ) | (enumLiteral_2= 'EMPTY_JSON_ARRAY' ) | (enumLiteral_3= 'JSON_LITERAL_BOOLEAN' ) | (enumLiteral_4= 'JSON_LITERAL_NULL' ) | (enumLiteral_5= 'JSON_NUMBER' ) | (enumLiteral_6= 'JSON_META_SCALAR_TYPE' ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1429:1: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'EMPTY_JSON_OBJECT' ) | (enumLiteral_2= 'EMPTY_JSON_ARRAY' ) | (enumLiteral_3= 'JSON_LITERAL_BOOLEAN' ) | (enumLiteral_4= 'JSON_LITERAL_NULL' ) | (enumLiteral_5= 'JSON_NUMBER' ) | (enumLiteral_6= 'JSON_META_SCALAR_TYPE' ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt22=1;
                }
                break;
            case 47:
                {
                alt22=2;
                }
                break;
            case 48:
                {
                alt22=3;
                }
                break;
            case 49:
                {
                alt22=4;
                }
                break;
            case 50:
                {
                alt22=5;
                }
                break;
            case 51:
                {
                alt22=6;
                }
                break;
            case 52:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1429:2: (enumLiteral_0= 'STRING' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1429:2: (enumLiteral_0= 'STRING' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1429:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleJsonLiteralValue2882); 

                            current = grammarAccess.getJsonLiteralValueAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJsonLiteralValueAccess().getSTRINGEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1435:6: (enumLiteral_1= 'EMPTY_JSON_OBJECT' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1435:6: (enumLiteral_1= 'EMPTY_JSON_OBJECT' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1435:8: enumLiteral_1= 'EMPTY_JSON_OBJECT'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleJsonLiteralValue2899); 

                            current = grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1441:6: (enumLiteral_2= 'EMPTY_JSON_ARRAY' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1441:6: (enumLiteral_2= 'EMPTY_JSON_ARRAY' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1441:8: enumLiteral_2= 'EMPTY_JSON_ARRAY'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_48_in_ruleJsonLiteralValue2916); 

                            current = grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1447:6: (enumLiteral_3= 'JSON_LITERAL_BOOLEAN' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1447:6: (enumLiteral_3= 'JSON_LITERAL_BOOLEAN' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1447:8: enumLiteral_3= 'JSON_LITERAL_BOOLEAN'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_49_in_ruleJsonLiteralValue2933); 

                            current = grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1453:6: (enumLiteral_4= 'JSON_LITERAL_NULL' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1453:6: (enumLiteral_4= 'JSON_LITERAL_NULL' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1453:8: enumLiteral_4= 'JSON_LITERAL_NULL'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_50_in_ruleJsonLiteralValue2950); 

                            current = grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1459:6: (enumLiteral_5= 'JSON_NUMBER' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1459:6: (enumLiteral_5= 'JSON_NUMBER' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1459:8: enumLiteral_5= 'JSON_NUMBER'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_51_in_ruleJsonLiteralValue2967); 

                            current = grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBEREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBEREnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1465:6: (enumLiteral_6= 'JSON_META_SCALAR_TYPE' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1465:6: (enumLiteral_6= 'JSON_META_SCALAR_TYPE' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1465:8: enumLiteral_6= 'JSON_META_SCALAR_TYPE'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_52_in_ruleJsonLiteralValue2984); 

                            current = grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPEEnumLiteralDeclaration_6()); 
                        

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
    // $ANTLR end "ruleJsonLiteralValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMobgen_in_entryRuleMobgen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_ruleMobgen131 = new BitSet(new long[]{0x0000030004000000L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_ruleMobgen153 = new BitSet(new long[]{0x0000030004000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_ruleMobgen180 = new BitSet(new long[]{0x0000030004000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePlatform265 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePlatform277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatform295 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePlatform312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlatform329 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_rulePlatform348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenCallDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMobgenCallDefinition431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenCallDefinition448 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMobgenCallDefinition465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleMobgenCallDefinition482 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMobgenCallDefinition499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleURI_in_ruleMobgenCallDefinition520 = new BitSet(new long[]{0x0000001420000002L});
    public static final BitSet FOLLOW_29_in_ruleMobgenCallDefinition533 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMobgenCallDefinition545 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMobgenCallDefinition557 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMobgenCallDefinition569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition590 = new BitSet(new long[]{0x0000001500000002L});
    public static final BitSet FOLLOW_32_in_ruleMobgenCallDefinition603 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMobgenCallDefinition615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition636 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_34_in_ruleMobgenCallDefinition653 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMobgenCallDefinition665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition686 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleMobgenCallDefinition701 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleMobgenCallDefinition713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeader782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenHeader824 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMobgenHeader841 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMobgenHeader853 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader874 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_38_in_ruleMobgenHeader887 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader908 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_38_in_ruleMobgenHeader923 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMobgenHeader937 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMobgenHeader949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1037 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleMobgenHeaderKeyValuePair1054 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_ruleMobgenHeaderKeyValuePair1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderParameter1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMobgenHeaderParameter1188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenHeaderParameter1205 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMobgenHeaderParameter1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenJson1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenJson1310 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMobgenJson1327 = new BitSet(new long[]{0x001FF00000000000L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1348 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMobgenJson1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair1517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair1569 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJsonKeyValuePair1586 = new BitSet(new long[]{0x001FF00000000000L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition1645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance1764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEnumInstance1811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance1828 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumInstance1845 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance1862 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_38_in_ruleEnumInstance1880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance1897 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_38_in_ruleEnumInstance1917 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEnumInstance1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance1967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleMapInstance2014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2031 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMapInstance2048 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2066 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapInstance2083 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2104 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_38_in_ruleMapInstance2118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2135 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapInstance2152 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2173 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_38_in_ruleMapInstance2188 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMapInstance2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleStringList2285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList2302 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_38_in_ruleStringList2320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList2337 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_38_in_ruleStringList2357 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleStringList2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleNestedType2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNestedType2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI2527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PREFIX_in_ruleURI2579 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_ruleURI2601 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_23_in_ruleURI2619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI2636 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleURI2653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_ruleURI2670 = new BitSet(new long[]{0x0000000000800200L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_in_ruleURI2694 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleURI2712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI2729 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleURI2746 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_SUFFIX_in_ruleURI2763 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_44_in_ruleJsonCompositeValue2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleJsonCompositeValue2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleJsonLiteralValue2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleJsonLiteralValue2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleJsonLiteralValue2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJsonLiteralValue2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJsonLiteralValue2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleJsonLiteralValue2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleJsonLiteralValue2984 = new BitSet(new long[]{0x0000000000000002L});

}