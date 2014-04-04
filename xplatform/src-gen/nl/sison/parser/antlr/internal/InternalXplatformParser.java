package nl.sison.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.sison.services.XplatformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXplatformParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RESTFUL_METHODS", "RULE_ANY_OTHER", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_BOOLEAN", "RULE_JSON_LITERAL_NULL", "RULE_JSON_META_SCALAR_TYPE", "RULE_JSON_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'platform'", "'{'", "'->'", "'}'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'['", "']'", "'enum'", "'map'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int RULE_JSON_META_SCALAR_TYPE=13;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_EMPTY_JSON_ARRAY=10;
    public static final int RULE_XPLATFORM_HEADER_PARAMETER=8;
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
    public static final int RULE_JSON_NUMBER=14;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=15;
    public static final int RULE_RESTFUL_METHODS=6;
    public static final int RULE_WS=18;

    // delegates
    // delegators


        public InternalXplatformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXplatformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXplatformParser.tokenNames; }
    public String getGrammarFileName() { return "../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g"; }



     	private XplatformGrammarAccess grammarAccess;
     	
        public InternalXplatformParser(TokenStream input, XplatformGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Xplatform";	
       	}
       	
       	@Override
       	protected XplatformGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXplatform"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:67:1: entryRuleXplatform returns [EObject current=null] : iv_ruleXplatform= ruleXplatform EOF ;
    public final EObject entryRuleXplatform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatform = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:68:2: (iv_ruleXplatform= ruleXplatform EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:69:2: iv_ruleXplatform= ruleXplatform EOF
            {
             newCompositeNode(grammarAccess.getXplatformRule()); 
            pushFollow(FOLLOW_ruleXplatform_in_entryRuleXplatform75);
            iv_ruleXplatform=ruleXplatform();

            state._fsp--;

             current =iv_ruleXplatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatform85); 

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
    // $ANTLR end "entryRuleXplatform"


    // $ANTLR start "ruleXplatform"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:76:1: ruleXplatform returns [EObject current=null] : ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_2_0= ruleXplatformCallDefinition ) ) )+ ) ;
    public final EObject ruleXplatform() throws RecognitionException {
        EObject current = null;

        EObject lv_platform_0_0 = null;

        EObject lv_resources_1_0 = null;

        EObject lv_calls_2_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:79:28: ( ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_2_0= ruleXplatformCallDefinition ) ) )+ ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_2_0= ruleXplatformCallDefinition ) ) )+ )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_2_0= ruleXplatformCallDefinition ) ) )+ )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:2: ( (lv_platform_0_0= rulePlatform ) ) ( ( (lv_resources_1_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_2_0= ruleXplatformCallDefinition ) ) )+
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:2: ( (lv_platform_0_0= rulePlatform ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:81:1: (lv_platform_0_0= rulePlatform )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:81:1: (lv_platform_0_0= rulePlatform )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:82:3: lv_platform_0_0= rulePlatform
            {
             
            	        newCompositeNode(grammarAccess.getXplatformAccess().getPlatformPlatformParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePlatform_in_ruleXplatform131);
            lv_platform_0_0=rulePlatform();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	        }
                   		set(
                   			current, 
                   			"platform",
                    		lv_platform_0_0, 
                    		"Platform");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:98:2: ( ( (lv_resources_1_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_2_0= ruleXplatformCallDefinition ) ) )+
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:98:3: ( (lv_resources_1_0= ruleXplatformResourceDefinition ) )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:98:3: ( (lv_resources_1_0= ruleXplatformResourceDefinition ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:99:1: (lv_resources_1_0= ruleXplatformResourceDefinition )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:99:1: (lv_resources_1_0= ruleXplatformResourceDefinition )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:100:3: lv_resources_1_0= ruleXplatformResourceDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformAccess().getResourcesXplatformResourceDefinitionParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_ruleXplatform153);
            	    lv_resources_1_0=ruleXplatformResourceDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_1_0, 
            	            		"XplatformResourceDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:117:6: ( (lv_calls_2_0= ruleXplatformCallDefinition ) )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:117:6: ( (lv_calls_2_0= ruleXplatformCallDefinition ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:118:1: (lv_calls_2_0= ruleXplatformCallDefinition )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:118:1: (lv_calls_2_0= ruleXplatformCallDefinition )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:119:3: lv_calls_2_0= ruleXplatformCallDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformAccess().getCallsXplatformCallDefinitionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformCallDefinition_in_ruleXplatform180);
            	    lv_calls_2_0=ruleXplatformCallDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"calls",
            	            		lv_calls_2_0, 
            	            		"XplatformCallDefinition");
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
    // $ANTLR end "ruleXplatform"


    // $ANTLR start "entryRulePlatform"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:143:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:144:2: (iv_rulePlatform= rulePlatform EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:145:2: iv_rulePlatform= rulePlatform EOF
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:152:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:155:28: ( (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:156:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:156:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:156:3: otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePlatform265); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_rulePlatform277); 

                	newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:1: ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) ) )+
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:2: ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_generateWhere_4_0= RULE_STRING ) )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:2: ( (lv_platforms_2_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:165:1: (lv_platforms_2_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:165:1: (lv_platforms_2_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:166:3: lv_platforms_2_0= RULE_ID
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
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:186:1: ( (lv_generateWhere_4_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:187:1: (lv_generateWhere_4_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:187:1: (lv_generateWhere_4_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:188:3: lv_generateWhere_4_0= RULE_STRING
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


    // $ANTLR start "entryRuleXplatformCallDefinition"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:216:1: entryRuleXplatformCallDefinition returns [EObject current=null] : iv_ruleXplatformCallDefinition= ruleXplatformCallDefinition EOF ;
    public final EObject entryRuleXplatformCallDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformCallDefinition = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:217:2: (iv_ruleXplatformCallDefinition= ruleXplatformCallDefinition EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:218:2: iv_ruleXplatformCallDefinition= ruleXplatformCallDefinition EOF
            {
             newCompositeNode(grammarAccess.getXplatformCallDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformCallDefinition_in_entryRuleXplatformCallDefinition384);
            iv_ruleXplatformCallDefinition=ruleXplatformCallDefinition();

            state._fsp--;

             current =iv_ruleXplatformCallDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformCallDefinition394); 

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
    // $ANTLR end "entryRuleXplatformCallDefinition"


    // $ANTLR start "ruleXplatformCallDefinition"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:225:1: ruleXplatformCallDefinition returns [EObject current=null] : (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? ) ;
    public final EObject ruleXplatformCallDefinition() throws RecognitionException {
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:228:28: ( (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:229:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:229:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:229:3: otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleXplatformCallDefinition431); 

                	newLeafNode(otherlv_0, grammarAccess.getXplatformCallDefinitionAccess().getCallKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:233:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:234:1: (lv_name_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:234:1: (lv_name_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:235:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXplatformCallDefinition448); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXplatformCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformCallDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXplatformCallDefinition465); 

                	newLeafNode(otherlv_2, grammarAccess.getXplatformCallDefinitionAccess().getColonKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:255:1: ( (lv_method_3_0= RULE_RESTFUL_METHODS ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:256:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:256:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:257:3: lv_method_3_0= RULE_RESTFUL_METHODS
            {
            lv_method_3_0=(Token)match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatformCallDefinition482); 

            			newLeafNode(lv_method_3_0, grammarAccess.getXplatformCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformCallDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"method",
                    		lv_method_3_0, 
                    		"RESTFUL_METHODS");
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleXplatformCallDefinition499); 

                	newLeafNode(otherlv_4, grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_4());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:277:1: ( (lv_uri_5_0= ruleURI ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:278:1: (lv_uri_5_0= ruleURI )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:278:1: (lv_uri_5_0= ruleURI )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:3: lv_uri_5_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleXplatformCallDefinition520);
            lv_uri_5_0=ruleURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformCallDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_5_0, 
                    		"URI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:295:2: (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:295:4: otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )?
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXplatformCallDefinition533); 

                        	newLeafNode(otherlv_6, grammarAccess.getXplatformCallDefinitionAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXplatformCallDefinition545); 

                        	newLeafNode(otherlv_7, grammarAccess.getXplatformCallDefinitionAccess().getHeadersKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleXplatformCallDefinition557); 

                        	newLeafNode(otherlv_8, grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_6_2());
                        
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleXplatformCallDefinition569); 

                        	newLeafNode(otherlv_9, grammarAccess.getXplatformCallDefinitionAccess().getRequestKeyword_6_3());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:311:1: ( (lv_requestHeaders_10_0= ruleXplatformHeader ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:312:1: (lv_requestHeaders_10_0= ruleXplatformHeader )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:312:1: (lv_requestHeaders_10_0= ruleXplatformHeader )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:313:3: lv_requestHeaders_10_0= ruleXplatformHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition590);
                    lv_requestHeaders_10_0=ruleXplatformHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformCallDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"requestHeaders",
                            		lv_requestHeaders_10_0, 
                            		"XplatformHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:329:2: (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==29) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:329:4: otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) )
                            {
                            otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleXplatformCallDefinition603); 

                                	newLeafNode(otherlv_11, grammarAccess.getXplatformCallDefinitionAccess().getAndKeyword_6_5_0());
                                
                            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleXplatformCallDefinition615); 

                                	newLeafNode(otherlv_12, grammarAccess.getXplatformCallDefinitionAccess().getResponseKeyword_6_5_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:337:1: ( (lv_responseHeaders_13_0= ruleXplatformHeader ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:338:1: (lv_responseHeaders_13_0= ruleXplatformHeader )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:338:1: (lv_responseHeaders_13_0= ruleXplatformHeader )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:339:3: lv_responseHeaders_13_0= ruleXplatformHeader
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition636);
                            lv_responseHeaders_13_0=ruleXplatformHeader();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformCallDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"responseHeaders",
                                    		lv_responseHeaders_13_0, 
                                    		"XplatformHeader");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:355:6: (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:355:8: otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )?
                    {
                    otherlv_14=(Token)match(input,31,FOLLOW_31_in_ruleXplatformCallDefinition653); 

                        	newLeafNode(otherlv_14, grammarAccess.getXplatformCallDefinitionAccess().getClientKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,32,FOLLOW_32_in_ruleXplatformCallDefinition665); 

                        	newLeafNode(otherlv_15, grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_1());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:363:1: ( (lv_jsonToClient_16_0= ruleXplatformJson ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:364:1: (lv_jsonToClient_16_0= ruleXplatformJson )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:364:1: (lv_jsonToClient_16_0= ruleXplatformJson )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:365:3: lv_jsonToClient_16_0= ruleXplatformJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition686);
                    lv_jsonToClient_16_0=ruleXplatformJson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformCallDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"jsonToClient",
                            		lv_jsonToClient_16_0, 
                            		"XplatformJson");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:381:2: (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==33) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:381:4: otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) )
                            {
                            otherlv_17=(Token)match(input,33,FOLLOW_33_in_ruleXplatformCallDefinition699); 

                                	newLeafNode(otherlv_17, grammarAccess.getXplatformCallDefinitionAccess().getServerKeyword_7_3_0());
                                
                            otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleXplatformCallDefinition711); 

                                	newLeafNode(otherlv_18, grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_3_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:389:1: ( (lv_jsonToServer_19_0= ruleXplatformJson ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:390:1: (lv_jsonToServer_19_0= ruleXplatformJson )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:390:1: (lv_jsonToServer_19_0= ruleXplatformJson )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:391:3: lv_jsonToServer_19_0= ruleXplatformJson
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition732);
                            lv_jsonToServer_19_0=ruleXplatformJson();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformCallDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"jsonToServer",
                                    		lv_jsonToServer_19_0, 
                                    		"XplatformJson");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleXplatformCallDefinition"


    // $ANTLR start "entryRuleURI"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:415:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:416:2: (iv_ruleURI= ruleURI EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:417:2: iv_ruleURI= ruleURI EOF
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:424:1: ruleURI returns [EObject current=null] : ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_0=null;
        Token otherlv_1=null;
        Token lv_parameters_2_0=null;
        Token otherlv_3=null;
        Token this_ANY_OTHER_4=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:427:28: ( ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )*
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:3: this_ANY_OTHER_0= RULE_ANY_OTHER
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:432:3: (otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:432:5: otherlv_1= '{' ( (lv_parameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )*
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleURI833); 

            	        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:436:1: ( (lv_parameters_2_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:437:1: (lv_parameters_2_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:437:1: (lv_parameters_2_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:438:3: lv_parameters_2_0= RULE_ID
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
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:458:1: (this_ANY_OTHER_4= RULE_ANY_OTHER )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ANY_OTHER) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:458:2: this_ANY_OTHER_4= RULE_ANY_OTHER
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


    // $ANTLR start "entryRuleXplatformHeader"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:470:1: entryRuleXplatformHeader returns [EObject current=null] : iv_ruleXplatformHeader= ruleXplatformHeader EOF ;
    public final EObject entryRuleXplatformHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeader = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:471:2: (iv_ruleXplatformHeader= ruleXplatformHeader EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:472:2: iv_ruleXplatformHeader= ruleXplatformHeader EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderRule()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader918);
            iv_ruleXplatformHeader=ruleXplatformHeader();

            state._fsp--;

             current =iv_ruleXplatformHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeader928); 

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
    // $ANTLR end "entryRuleXplatformHeader"


    // $ANTLR start "ruleXplatformHeader"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:479:1: ruleXplatformHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) ;
    public final EObject ruleXplatformHeader() throws RecognitionException {
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:482:28: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:483:1: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:483:1: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:483:2: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\''
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:483:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:484:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:484:1: (lv_name_0_0= RULE_ID )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:485:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXplatformHeader970); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getXplatformHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXplatformHeaderRule());
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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleXplatformHeader988); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_1());
                
            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXplatformHeader1000); 

                	newLeafNode(otherlv_2, grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:509:1: ( (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:510:1: (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:510:1: (lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:511:3: lv_headerKeyValues_3_0= ruleXplatformHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader1021);
            lv_headerKeyValues_3_0=ruleXplatformHeaderKeyValuePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformHeaderRule());
            	        }
                   		add(
                   			current, 
                   			"headerKeyValues",
                    		lv_headerKeyValues_3_0, 
                    		"XplatformHeaderKeyValuePair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:527:2: (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) ) )*
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:527:4: otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleXplatformHeader1034); 

            	        	newLeafNode(otherlv_4, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:531:1: ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:532:1: (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:532:1: (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:533:3: lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader1055);
            	    lv_headerKeyValues_5_0=ruleXplatformHeaderKeyValuePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformHeaderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"headerKeyValues",
            	            		lv_headerKeyValues_5_0, 
            	            		"XplatformHeaderKeyValuePair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:549:4: (otherlv_6= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:549:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleXplatformHeader1070); 

                        	newLeafNode(otherlv_6, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleXplatformHeader1084); 

                	newLeafNode(otherlv_7, grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleXplatformHeader1096); 

                	newLeafNode(otherlv_8, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_7());
                

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
    // $ANTLR end "ruleXplatformHeader"


    // $ANTLR start "entryRuleXplatformHeaderKeyValuePair"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:569:1: entryRuleXplatformHeaderKeyValuePair returns [EObject current=null] : iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF ;
    public final EObject entryRuleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeaderKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:570:2: (iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:571:2: iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair1132);
            iv_ruleXplatformHeaderKeyValuePair=ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleXplatformHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair1142); 

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
    // $ANTLR end "entryRuleXplatformHeaderKeyValuePair"


    // $ANTLR start "ruleXplatformHeaderKeyValuePair"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:578:1: ruleXplatformHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) ;
    public final EObject ruleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:581:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:582:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:582:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:582:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:582:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:583:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:583:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:584:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1184); 

            			newLeafNode(lv_key_0_0, grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformHeaderKeyValuePairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleXplatformHeaderKeyValuePair1201); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:604:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_XPLATFORM_HEADER_PARAMETER) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:604:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:604:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:605:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:605:1: (lv_value_2_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:606:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1219); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXplatformHeaderKeyValuePairRule());
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:623:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:623:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:624:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:624:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:625:3: lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER
                    {
                    lv_value_3_0=(Token)match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair1247); 

                    			newLeafNode(lv_value_3_0, grammarAccess.getXplatformHeaderKeyValuePairAccess().getValueXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getXplatformHeaderKeyValuePairRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"XPLATFORM_HEADER_PARAMETER");
                    	    

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
    // $ANTLR end "ruleXplatformHeaderKeyValuePair"


    // $ANTLR start "entryRuleXplatformJson"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:649:1: entryRuleXplatformJson returns [EObject current=null] : iv_ruleXplatformJson= ruleXplatformJson EOF ;
    public final EObject entryRuleXplatformJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformJson = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:650:2: (iv_ruleXplatformJson= ruleXplatformJson EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:651:2: iv_ruleXplatformJson= ruleXplatformJson EOF
            {
             newCompositeNode(grammarAccess.getXplatformJsonRule()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson1289);
            iv_ruleXplatformJson=ruleXplatformJson();

            state._fsp--;

             current =iv_ruleXplatformJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformJson1299); 

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
    // $ANTLR end "entryRuleXplatformJson"


    // $ANTLR start "ruleXplatformJson"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:658:1: ruleXplatformJson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleXplatformJson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:661:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\''
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:2: ( (lv_name_0_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:663:1: (lv_name_0_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:663:1: (lv_name_0_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:664:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXplatformJson1341); 

            			newLeafNode(lv_name_0_0, grammarAccess.getXplatformJsonAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformJsonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleXplatformJson1358); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:684:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:685:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:685:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:686:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleXplatformJson1379);
            lv_value_2_0=ruleJsonObjectValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"JsonObjectValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleXplatformJson1391); 

                	newLeafNode(otherlv_3, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_3());
                

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
    // $ANTLR end "ruleXplatformJson"


    // $ANTLR start "entryRuleJsonObjectValue"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:714:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:715:2: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:716:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:723:1: ruleJsonObjectValue returns [EObject current=null] : ( ( (lv_value_0_0= RULE_STRING ) ) | this_JsonObject_1= ruleJsonObject | this_JsonArray_2= ruleJsonArray | this_EMPTY_JSON_OBJECT_3= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_4= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_5= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_6= RULE_JSON_LITERAL_NULL | this_JSON_META_SCALAR_TYPE_7= RULE_JSON_META_SCALAR_TYPE | this_JSON_NUMBER_8= RULE_JSON_NUMBER ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token this_EMPTY_JSON_OBJECT_3=null;
        Token this_EMPTY_JSON_ARRAY_4=null;
        Token this_JSON_LITERAL_BOOLEAN_5=null;
        Token this_JSON_LITERAL_NULL_6=null;
        Token this_JSON_META_SCALAR_TYPE_7=null;
        Token this_JSON_NUMBER_8=null;
        EObject this_JsonObject_1 = null;

        EObject this_JsonArray_2 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:726:28: ( ( ( (lv_value_0_0= RULE_STRING ) ) | this_JsonObject_1= ruleJsonObject | this_JsonArray_2= ruleJsonArray | this_EMPTY_JSON_OBJECT_3= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_4= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_5= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_6= RULE_JSON_LITERAL_NULL | this_JSON_META_SCALAR_TYPE_7= RULE_JSON_META_SCALAR_TYPE | this_JSON_NUMBER_8= RULE_JSON_NUMBER ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:1: ( ( (lv_value_0_0= RULE_STRING ) ) | this_JsonObject_1= ruleJsonObject | this_JsonArray_2= ruleJsonArray | this_EMPTY_JSON_OBJECT_3= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_4= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_5= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_6= RULE_JSON_LITERAL_NULL | this_JSON_META_SCALAR_TYPE_7= RULE_JSON_META_SCALAR_TYPE | this_JSON_NUMBER_8= RULE_JSON_NUMBER )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:1: ( ( (lv_value_0_0= RULE_STRING ) ) | this_JsonObject_1= ruleJsonObject | this_JsonArray_2= ruleJsonArray | this_EMPTY_JSON_OBJECT_3= RULE_EMPTY_JSON_OBJECT | this_EMPTY_JSON_ARRAY_4= RULE_EMPTY_JSON_ARRAY | this_JSON_LITERAL_BOOLEAN_5= RULE_JSON_LITERAL_BOOLEAN | this_JSON_LITERAL_NULL_6= RULE_JSON_LITERAL_NULL | this_JSON_META_SCALAR_TYPE_7= RULE_JSON_META_SCALAR_TYPE | this_JSON_NUMBER_8= RULE_JSON_NUMBER )
            int alt14=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 37:
                {
                alt14=3;
                }
                break;
            case RULE_EMPTY_JSON_OBJECT:
                {
                alt14=4;
                }
                break;
            case RULE_EMPTY_JSON_ARRAY:
                {
                alt14=5;
                }
                break;
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt14=6;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt14=7;
                }
                break;
            case RULE_JSON_META_SCALAR_TYPE:
                {
                alt14=8;
                }
                break;
            case RULE_JSON_NUMBER:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:2: ( (lv_value_0_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:2: ( (lv_value_0_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:728:1: (lv_value_0_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:728:1: (lv_value_0_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:729:3: lv_value_0_0= RULE_STRING
                    {
                    lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObjectValue1479); 

                    			newLeafNode(lv_value_0_0, grammarAccess.getJsonObjectValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonObjectValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:747:5: this_JsonObject_1= ruleJsonObject
                    {
                     
                            newCompositeNode(grammarAccess.getJsonObjectValueAccess().getJsonObjectParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleJsonObjectValue1512);
                    this_JsonObject_1=ruleJsonObject();

                    state._fsp--;

                     
                            current = this_JsonObject_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:757:5: this_JsonArray_2= ruleJsonArray
                    {
                     
                            newCompositeNode(grammarAccess.getJsonObjectValueAccess().getJsonArrayParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonObjectValue1539);
                    this_JsonArray_2=ruleJsonArray();

                    state._fsp--;

                     
                            current = this_JsonArray_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:766:6: this_EMPTY_JSON_OBJECT_3= RULE_EMPTY_JSON_OBJECT
                    {
                    this_EMPTY_JSON_OBJECT_3=(Token)match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonObjectValue1555); 
                     
                        newLeafNode(this_EMPTY_JSON_OBJECT_3, grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:771:6: this_EMPTY_JSON_ARRAY_4= RULE_EMPTY_JSON_ARRAY
                    {
                    this_EMPTY_JSON_ARRAY_4=(Token)match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonObjectValue1571); 
                     
                        newLeafNode(this_EMPTY_JSON_ARRAY_4, grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:776:6: this_JSON_LITERAL_BOOLEAN_5= RULE_JSON_LITERAL_BOOLEAN
                    {
                    this_JSON_LITERAL_BOOLEAN_5=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonObjectValue1587); 
                     
                        newLeafNode(this_JSON_LITERAL_BOOLEAN_5, grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:781:6: this_JSON_LITERAL_NULL_6= RULE_JSON_LITERAL_NULL
                    {
                    this_JSON_LITERAL_NULL_6=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonObjectValue1603); 
                     
                        newLeafNode(this_JSON_LITERAL_NULL_6, grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:786:6: this_JSON_META_SCALAR_TYPE_7= RULE_JSON_META_SCALAR_TYPE
                    {
                    this_JSON_META_SCALAR_TYPE_7=(Token)match(input,RULE_JSON_META_SCALAR_TYPE,FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_ruleJsonObjectValue1619); 
                     
                        newLeafNode(this_JSON_META_SCALAR_TYPE_7, grammarAccess.getJsonObjectValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:791:6: this_JSON_NUMBER_8= RULE_JSON_NUMBER
                    {
                    this_JSON_NUMBER_8=(Token)match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_ruleJsonObjectValue1635); 
                     
                        newLeafNode(this_JSON_NUMBER_8, grammarAccess.getJsonObjectValueAccess().getJSON_NUMBERTerminalRuleCall_8()); 
                        

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


    // $ANTLR start "entryRuleJsonObject"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:803:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:804:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:805:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject1670);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject1680); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:812:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:815:28: ( (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:816:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:816:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:816:3: otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleJsonObject1717); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:820:1: ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:821:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:821:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:822:3: lv_keyValuePair_1_0= ruleJsonKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1738);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:838:2: (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_STRING) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:838:4: otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonObject1751); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:1: ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:843:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:843:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:844:3: lv_keyValuePair_3_0= ruleJsonKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1772);
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
            	    break loop15;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:860:4: (otherlv_4= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:860:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleJsonObject1787); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleJsonObject1801); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:876:1: entryRuleJsonKeyValuePair returns [EObject current=null] : iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF ;
    public final EObject entryRuleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:877:2: (iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:878:2: iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair1837);
            iv_ruleJsonKeyValuePair=ruleJsonKeyValuePair();

            state._fsp--;

             current =iv_ruleJsonKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair1847); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:885:1: ruleJsonKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:888:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:889:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:889:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:889:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:889:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:890:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:890:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:891:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair1889); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJsonKeyValuePair1906); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:911:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:912:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:912:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:913:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair1927);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:937:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:938:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:939:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray1963);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray1973); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:946:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:949:28: ( (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:3: otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleJsonArray2010); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:954:1: ( (lv_items_1_0= ruleJsonObjectValue ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:955:1: (lv_items_1_0= ruleJsonObjectValue )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:955:1: (lv_items_1_0= ruleJsonObjectValue )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:956:3: lv_items_1_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2031);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:972:2: (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==RULE_STRING||(LA17_1>=RULE_EMPTY_JSON_OBJECT && LA17_1<=RULE_JSON_NUMBER)||LA17_1==20||LA17_1==37) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:972:4: otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2044); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:976:1: ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:977:1: (lv_items_3_0= ruleJsonObjectValue )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:977:1: (lv_items_3_0= ruleJsonObjectValue )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:978:3: lv_items_3_0= ruleJsonObjectValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2065);
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
            	    break loop17;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:994:4: (otherlv_4= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:994:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2080); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleJsonArray2094); 

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


    // $ANTLR start "entryRuleXplatformResourceDefinition"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1010:1: entryRuleXplatformResourceDefinition returns [EObject current=null] : iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF ;
    public final EObject entryRuleXplatformResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformResourceDefinition = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1011:2: (iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1012:2: iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getXplatformResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition2130);
            iv_ruleXplatformResourceDefinition=ruleXplatformResourceDefinition();

            state._fsp--;

             current =iv_ruleXplatformResourceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformResourceDefinition2140); 

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
    // $ANTLR end "entryRuleXplatformResourceDefinition"


    // $ANTLR start "ruleXplatformResourceDefinition"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1019:1: ruleXplatformResourceDefinition returns [EObject current=null] : ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) ;
    public final EObject ruleXplatformResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject this_EnumInstance_1 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1022:28: ( ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1023:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1023:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | this_EnumInstance_1= ruleEnumInstance )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1023:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1023:2: ( (lv_resources_0_0= ruleMapInstance ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1024:1: (lv_resources_0_0= ruleMapInstance )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1024:1: (lv_resources_0_0= ruleMapInstance )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1025:3: lv_resources_0_0= ruleMapInstance
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapInstance_in_ruleXplatformResourceDefinition2186);
                    lv_resources_0_0=ruleMapInstance();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformResourceDefinitionRule());
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1043:5: this_EnumInstance_1= ruleEnumInstance
                    {
                     
                            newCompositeNode(grammarAccess.getXplatformResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumInstance_in_ruleXplatformResourceDefinition2214);
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
    // $ANTLR end "ruleXplatformResourceDefinition"


    // $ANTLR start "entryRuleEnumInstance"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1059:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1060:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1061:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2249);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2259); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1068:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1071:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1072:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1072:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1072:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEnumInstance2296); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1076:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1077:1: (lv_name_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1077:1: (lv_name_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1078:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2313); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleEnumInstance2330); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1098:1: ( (lv_values_3_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1099:1: (lv_values_3_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1099:1: (lv_values_3_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1100:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2347); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1116:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1116:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleEnumInstance2365); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1120:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1121:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1121:1: (lv_values_5_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1122:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2382); 

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
            	    break loop20;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1138:4: (otherlv_6= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1138:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleEnumInstance2402); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleEnumInstance2416); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1154:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1155:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1156:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance2452);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance2462); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1163:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1166:28: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1167:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1167:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1167:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleMapInstance2499); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:1: (lv_name_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1172:1: (lv_name_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2516); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMapInstance2533); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1193:1: ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1193:2: ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1193:2: ( (lv_keys_3_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1194:1: (lv_keys_3_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1194:1: (lv_keys_3_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1195:3: lv_keys_3_0= RULE_ID
            {
            lv_keys_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2551); 

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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMapInstance2568); 

                	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getColonKeyword_3_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1215:1: ( (lv_values_5_0= ruleNestedType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1216:1: (lv_values_5_0= ruleNestedType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1216:1: (lv_values_5_0= ruleNestedType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1217:3: lv_values_5_0= ruleNestedType
            {
             
            	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2589);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1233:3: (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )*
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1233:5: otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleMapInstance2603); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1237:1: ( (lv_keys_7_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1238:1: (lv_keys_7_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1238:1: (lv_keys_7_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1239:3: lv_keys_7_0= RULE_ID
            	    {
            	    lv_keys_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2620); 

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

            	    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleMapInstance2637); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMapInstanceAccess().getColonKeyword_4_2());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1259:1: ( (lv_values_9_0= ruleNestedType ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1260:1: (lv_values_9_0= ruleNestedType )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1260:1: (lv_values_9_0= ruleNestedType )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1261:3: lv_values_9_0= ruleNestedType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2658);
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
            	    break loop22;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1277:4: (otherlv_10= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1277:6: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_35_in_ruleMapInstance2673); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleMapInstance2687); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1293:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1294:2: (iv_ruleStringList= ruleStringList EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1295:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList2723);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList2733); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1302:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1305:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1306:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1306:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1306:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleStringList2770); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1310:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1311:1: (lv_values_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1311:1: (lv_values_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1312:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList2787); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1328:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_STRING) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1328:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleStringList2805); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1332:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1333:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1333:1: (lv_values_3_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1334:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList2822); 

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
            	    break loop24;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1350:4: (otherlv_4= ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1350:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleStringList2842); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleStringList2856); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1366:1: entryRuleNestedType returns [EObject current=null] : iv_ruleNestedType= ruleNestedType EOF ;
    public final EObject entryRuleNestedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1367:2: (iv_ruleNestedType= ruleNestedType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1368:2: iv_ruleNestedType= ruleNestedType EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType2892);
            iv_ruleNestedType=ruleNestedType();

            state._fsp--;

             current =iv_ruleNestedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType2902); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1375:1: ruleNestedType returns [EObject current=null] : (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList ) ;
    public final EObject ruleNestedType() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;
        EObject this_StringList_1 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1378:28: ( (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1379:1: (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1379:1: (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==37) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1379:2: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNestedType2938); 
                     
                        newLeafNode(this_STRING_0, grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1385:5: this_StringList_1= ruleStringList
                    {
                     
                            newCompositeNode(grammarAccess.getNestedTypeAccess().getStringListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringList_in_ruleNestedType2965);
                    this_StringList_1=ruleStringList();

                    state._fsp--;

                     
                            current = this_StringList_1; 
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
    // $ANTLR end "ruleNestedType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXplatform_in_entryRuleXplatform75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatform85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_ruleXplatform131 = new BitSet(new long[]{0x0000018000800000L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_ruleXplatform153 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_ruleXplatform180 = new BitSet(new long[]{0x0000018000800002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePlatform265 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePlatform277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatform295 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePlatform312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlatform329 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_rulePlatform348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_entryRuleXplatformCallDefinition384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformCallDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleXplatformCallDefinition431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatformCallDefinition448 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatformCallDefinition465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatformCallDefinition482 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXplatformCallDefinition499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleURI_in_ruleXplatformCallDefinition520 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_26_in_ruleXplatformCallDefinition533 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXplatformCallDefinition545 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXplatformCallDefinition557 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformCallDefinition569 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition590 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_29_in_ruleXplatformCallDefinition603 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformCallDefinition615 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition636 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleXplatformCallDefinition653 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleXplatformCallDefinition665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition686 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleXplatformCallDefinition699 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleXplatformCallDefinition711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI819 = new BitSet(new long[]{0x0000000000100082L});
    public static final BitSet FOLLOW_20_in_ruleURI833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI850 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleURI867 = new BitSet(new long[]{0x0000000000100082L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI879 = new BitSet(new long[]{0x0000000000100082L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatformHeader970 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXplatformHeader988 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXplatformHeader1000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader1021 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXplatformHeader1034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader1055 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleXplatformHeader1070 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXplatformHeader1084 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXplatformHeader1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1184 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleXplatformHeaderKeyValuePair1201 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatformJson1341 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXplatformJson1358 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleXplatformJson1379 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleXplatformJson1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObjectValue1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleJsonObjectValue1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonObjectValue1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonObjectValue1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonObjectValue1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonObjectValue1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonObjectValue1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_META_SCALAR_TYPE_in_ruleJsonObjectValue1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_ruleJsonObjectValue1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject1670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleJsonObject1717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1738 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJsonObject1751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1772 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleJsonObject1787 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleJsonObject1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair1837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair1889 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleJsonKeyValuePair1906 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray1963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleJsonArray2010 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2031 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2044 = new BitSet(new long[]{0x0000002000107E20L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2065 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2080 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleJsonArray2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition2130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformResourceDefinition2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleXplatformResourceDefinition2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleXplatformResourceDefinition2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumInstance2296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2313 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnumInstance2330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2347 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleEnumInstance2365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2382 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleEnumInstance2402 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumInstance2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance2452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMapInstance2499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2516 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapInstance2533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2551 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMapInstance2568 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2589 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMapInstance2603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2620 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMapInstance2637 = new BitSet(new long[]{0x0000002000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2658 = new BitSet(new long[]{0x0000000800400000L});
    public static final BitSet FOLLOW_35_in_ruleMapInstance2673 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMapInstance2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList2723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringList2770 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList2787 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList2805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList2822 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList2842 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStringList2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType2892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNestedType2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleNestedType2965 = new BitSet(new long[]{0x0000000000000002L});

}