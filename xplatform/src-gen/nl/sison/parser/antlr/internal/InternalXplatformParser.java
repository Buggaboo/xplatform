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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_RESTFUL_METHODS", "RULE_ANY_OTHER", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_INT", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'platform'", "'{'", "'->'", "'}'", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "','", "'='", "'boolean'", "'number'", "'string'", "'['", "']'", "'.'", "'enum'", "'map'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_XPLATFORM_HEADER_PARAMETER=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=7;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int RULE_JSON_LITERAL_NULL=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_INT=10;
    public static final int RULE_RESTFUL_METHODS=6;
    public static final int RULE_WS=14;

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
                else if ( (LA1_0==19) ) {
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:152:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_whereToGenerate_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_platforms_2_0=null;
        Token otherlv_3=null;
        Token lv_whereToGenerate_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:155:28: ( (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_whereToGenerate_4_0= RULE_STRING ) ) )+ otherlv_5= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:156:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_whereToGenerate_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:156:1: (otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_whereToGenerate_4_0= RULE_STRING ) ) )+ otherlv_5= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:156:3: otherlv_0= 'platform' otherlv_1= '{' ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_whereToGenerate_4_0= RULE_STRING ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulePlatform265); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePlatform277); 

                	newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:1: ( ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_whereToGenerate_4_0= RULE_STRING ) ) )+
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:2: ( (lv_platforms_2_0= RULE_ID ) ) otherlv_3= '->' ( (lv_whereToGenerate_4_0= RULE_STRING ) )
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

            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePlatform312); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:186:1: ( (lv_whereToGenerate_4_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:187:1: (lv_whereToGenerate_4_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:187:1: (lv_whereToGenerate_4_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:188:3: lv_whereToGenerate_4_0= RULE_STRING
            	    {
            	    lv_whereToGenerate_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlatform329); 

            	    			newLeafNode(lv_whereToGenerate_4_0, grammarAccess.getPlatformAccess().getWhereToGenerateSTRINGTerminalRuleCall_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPlatformRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"whereToGenerate",
            	            		lv_whereToGenerate_4_0, 
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

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePlatform348); 

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
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleXplatformCallDefinition431); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleXplatformCallDefinition465); 

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

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleXplatformCallDefinition499); 

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

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:295:4: otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )?
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleXplatformCallDefinition533); 

                        	newLeafNode(otherlv_6, grammarAccess.getXplatformCallDefinitionAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleXplatformCallDefinition545); 

                        	newLeafNode(otherlv_7, grammarAccess.getXplatformCallDefinitionAccess().getHeadersKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleXplatformCallDefinition557); 

                        	newLeafNode(otherlv_8, grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_6_2());
                        
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleXplatformCallDefinition569); 

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

                    if ( (LA3_0==25) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:329:4: otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) )
                            {
                            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleXplatformCallDefinition603); 

                                	newLeafNode(otherlv_11, grammarAccess.getXplatformCallDefinitionAccess().getAndKeyword_6_5_0());
                                
                            otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleXplatformCallDefinition615); 

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

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:355:8: otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )?
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXplatformCallDefinition653); 

                        	newLeafNode(otherlv_14, grammarAccess.getXplatformCallDefinitionAccess().getClientKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleXplatformCallDefinition665); 

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

                    if ( (LA5_0==29) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:381:4: otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) )
                            {
                            otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleXplatformCallDefinition699); 

                                	newLeafNode(otherlv_17, grammarAccess.getXplatformCallDefinitionAccess().getServerKeyword_7_3_0());
                                
                            otherlv_18=(Token)match(input,28,FOLLOW_28_in_ruleXplatformCallDefinition711); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:424:1: ruleURI returns [EObject current=null] : ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_0=null;
        Token otherlv_1=null;
        Token lv_uriParameters_2_0=null;
        Token otherlv_3=null;
        Token this_ANY_OTHER_4=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:427:28: ( ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:428:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:432:3: (otherlv_1= '{' ( (lv_uriParameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:432:5: otherlv_1= '{' ( (lv_uriParameters_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )*
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleURI833); 

                        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:436:1: ( (lv_uriParameters_2_0= RULE_ID ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:437:1: (lv_uriParameters_2_0= RULE_ID )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:437:1: (lv_uriParameters_2_0= RULE_ID )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:438:3: lv_uriParameters_2_0= RULE_ID
                    {
                    lv_uriParameters_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI850); 

                    			newLeafNode(lv_uriParameters_2_0, grammarAccess.getURIAccess().getUriParametersIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURIRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"uriParameters",
                            		lv_uriParameters_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleURI867); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleXplatformHeader988); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_1());
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXplatformHeader1000); 

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

                if ( (LA11_0==31) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_STRING) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:527:4: otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleXplatformHeaderKeyValuePair ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleXplatformHeader1034); 

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

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:549:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleXplatformHeader1070); 

                        	newLeafNode(otherlv_6, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleXplatformHeader1084); 

                	newLeafNode(otherlv_7, grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleXplatformHeader1096); 

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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleXplatformHeaderKeyValuePair1201); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:658:1: ruleXplatformJson returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' ( (lv_type_2_0= ruleJsonType ) ) ) | ( (lv_metaType_3_0= ruleJsonMetaType ) ) | ( ( (lv_composite_4_0= ruleJsonObject ) ) otherlv_5= '\\'\\'\\'' ) ) ;
    public final EObject ruleXplatformJson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_metaType_3_0 = null;

        EObject lv_composite_4_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:661:28: ( ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' ( (lv_type_2_0= ruleJsonType ) ) ) | ( (lv_metaType_3_0= ruleJsonMetaType ) ) | ( ( (lv_composite_4_0= ruleJsonObject ) ) otherlv_5= '\\'\\'\\'' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:1: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' ( (lv_type_2_0= ruleJsonType ) ) ) | ( (lv_metaType_3_0= ruleJsonMetaType ) ) | ( ( (lv_composite_4_0= ruleJsonObject ) ) otherlv_5= '\\'\\'\\'' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:1: ( ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' ( (lv_type_2_0= ruleJsonType ) ) ) | ( (lv_metaType_3_0= ruleJsonMetaType ) ) | ( ( (lv_composite_4_0= ruleJsonObject ) ) otherlv_5= '\\'\\'\\'' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 30:
                {
                alt15=1;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt15=2;
                }
                break;
            case 16:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' ( (lv_type_2_0= ruleJsonType ) ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:2: ( ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' ( (lv_type_2_0= ruleJsonType ) ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:3: ( (lv_name_0_0= RULE_ID ) )? otherlv_1= '\\'\\'\\'' ( (lv_type_2_0= ruleJsonType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:662:3: ( (lv_name_0_0= RULE_ID ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_ID) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:663:1: (lv_name_0_0= RULE_ID )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:663:1: (lv_name_0_0= RULE_ID )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:664:3: lv_name_0_0= RULE_ID
                            {
                            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXplatformJson1342); 

                            			newLeafNode(lv_name_0_0, grammarAccess.getXplatformJsonAccess().getNameIDTerminalRuleCall_0_0_0()); 
                            		

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
                            break;

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleXplatformJson1360); 

                        	newLeafNode(otherlv_1, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_1());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:684:1: ( (lv_type_2_0= ruleJsonType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:685:1: (lv_type_2_0= ruleJsonType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:685:1: (lv_type_2_0= ruleJsonType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:686:3: lv_type_2_0= ruleJsonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonType_in_ruleXplatformJson1381);
                    lv_type_2_0=ruleJsonType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"JsonType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:703:6: ( (lv_metaType_3_0= ruleJsonMetaType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:703:6: ( (lv_metaType_3_0= ruleJsonMetaType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:704:1: (lv_metaType_3_0= ruleJsonMetaType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:704:1: (lv_metaType_3_0= ruleJsonMetaType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:705:3: lv_metaType_3_0= ruleJsonMetaType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1409);
                    lv_metaType_3_0=ruleJsonMetaType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
                    	        }
                           		set(
                           			current, 
                           			"metaType",
                            		lv_metaType_3_0, 
                            		"JsonMetaType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:722:6: ( ( (lv_composite_4_0= ruleJsonObject ) ) otherlv_5= '\\'\\'\\'' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:722:6: ( ( (lv_composite_4_0= ruleJsonObject ) ) otherlv_5= '\\'\\'\\'' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:722:7: ( (lv_composite_4_0= ruleJsonObject ) ) otherlv_5= '\\'\\'\\''
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:722:7: ( (lv_composite_4_0= ruleJsonObject ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:723:1: (lv_composite_4_0= ruleJsonObject )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:723:1: (lv_composite_4_0= ruleJsonObject )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:724:3: lv_composite_4_0= ruleJsonObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleXplatformJson1437);
                    lv_composite_4_0=ruleJsonObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
                    	        }
                           		set(
                           			current, 
                           			"composite",
                            		lv_composite_4_0, 
                            		"JsonObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleXplatformJson1449); 

                        	newLeafNode(otherlv_5, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_2_1());
                        

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
    // $ANTLR end "ruleXplatformJson"


    // $ANTLR start "entryRuleJsonMetaScalarType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:752:1: entryRuleJsonMetaScalarType returns [String current=null] : iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF ;
    public final String entryRuleJsonMetaScalarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonMetaScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:753:2: (iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:754:2: iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1487);
            iv_ruleJsonMetaScalarType=ruleJsonMetaScalarType();

            state._fsp--;

             current =iv_ruleJsonMetaScalarType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaScalarType1498); 

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
    // $ANTLR end "entryRuleJsonMetaScalarType"


    // $ANTLR start "ruleJsonMetaScalarType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:761:1: ruleJsonMetaScalarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'number' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleJsonMetaScalarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:764:28: ( (kw= 'boolean' | kw= 'number' | kw= 'string' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:765:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:765:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:766:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleJsonMetaScalarType1536); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:773:2: kw= 'number'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleJsonMetaScalarType1555); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:780:2: kw= 'string'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleJsonMetaScalarType1574); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getStringKeyword_2()); 
                        

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
    // $ANTLR end "ruleJsonMetaScalarType"


    // $ANTLR start "entryRuleJsonMetaArray"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:793:1: entryRuleJsonMetaArray returns [EObject current=null] : iv_ruleJsonMetaArray= ruleJsonMetaArray EOF ;
    public final EObject entryRuleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:794:2: (iv_ruleJsonMetaArray= ruleJsonMetaArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:795:2: iv_ruleJsonMetaArray= ruleJsonMetaArray EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaArrayRule()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1614);
            iv_ruleJsonMetaArray=ruleJsonMetaArray();

            state._fsp--;

             current =iv_ruleJsonMetaArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaArray1624); 

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
    // $ANTLR end "entryRuleJsonMetaArray"


    // $ANTLR start "ruleJsonMetaArray"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:802:1: ruleJsonMetaArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) ;
    public final EObject ruleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaType_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:805:28: ( (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:806:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:806:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:806:3: otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleJsonMetaArray1661); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:810:1: ( (lv_metaType_1_0= ruleJsonMetaType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:811:1: (lv_metaType_1_0= ruleJsonMetaType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:811:1: (lv_metaType_1_0= ruleJsonMetaType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:812:3: lv_metaType_1_0= ruleJsonMetaType
            {
             
            	        newCompositeNode(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1682);
            lv_metaType_1_0=ruleJsonMetaType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonMetaArrayRule());
            	        }
                   		set(
                   			current, 
                   			"metaType",
                    		lv_metaType_1_0, 
                    		"JsonMetaType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleJsonMetaArray1694); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonMetaArrayAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleJsonMetaArray"


    // $ANTLR start "entryRuleJsonMetaType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:840:1: entryRuleJsonMetaType returns [EObject current=null] : iv_ruleJsonMetaType= ruleJsonMetaType EOF ;
    public final EObject entryRuleJsonMetaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:841:2: (iv_ruleJsonMetaType= ruleJsonMetaType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:2: iv_ruleJsonMetaType= ruleJsonMetaType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1730);
            iv_ruleJsonMetaType=ruleJsonMetaType();

            state._fsp--;

             current =iv_ruleJsonMetaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaType1740); 

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
    // $ANTLR end "entryRuleJsonMetaType"


    // $ANTLR start "ruleJsonMetaType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:849:1: ruleJsonMetaType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) ;
    public final EObject ruleJsonMetaType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:852:28: ( ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:853:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:853:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=33 && LA17_0<=35)) ) {
                alt17=1;
            }
            else if ( (LA17_0==36) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:853:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:853:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:854:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:854:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:855:3: lv_scalar_0_0= ruleJsonMetaScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1786);
                    lv_scalar_0_0=ruleJsonMetaScalarType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonMetaTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"scalar",
                            		lv_scalar_0_0, 
                            		"JsonMetaScalarType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:872:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:872:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:873:1: (lv_composite_1_0= ruleJsonMetaArray )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:873:1: (lv_composite_1_0= ruleJsonMetaArray )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:874:3: lv_composite_1_0= ruleJsonMetaArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1813);
                    lv_composite_1_0=ruleJsonMetaArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonMetaTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"composite",
                            		lv_composite_1_0, 
                            		"JsonMetaArray");
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
    // $ANTLR end "ruleJsonMetaType"


    // $ANTLR start "entryRuleJsonCompositeType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:898:1: entryRuleJsonCompositeType returns [EObject current=null] : iv_ruleJsonCompositeType= ruleJsonCompositeType EOF ;
    public final EObject entryRuleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:899:2: (iv_ruleJsonCompositeType= ruleJsonCompositeType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:900:2: iv_ruleJsonCompositeType= ruleJsonCompositeType EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeTypeRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1849);
            iv_ruleJsonCompositeType=ruleJsonCompositeType();

            state._fsp--;

             current =iv_ruleJsonCompositeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeType1859); 

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
    // $ANTLR end "entryRuleJsonCompositeType"


    // $ANTLR start "ruleJsonCompositeType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:907:1: ruleJsonCompositeType returns [EObject current=null] : ( (lv_composite_0_0= ruleJsonArray ) ) ;
    public final EObject ruleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject lv_composite_0_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:910:28: ( ( (lv_composite_0_0= ruleJsonArray ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:911:1: ( (lv_composite_0_0= ruleJsonArray ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:911:1: ( (lv_composite_0_0= ruleJsonArray ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:912:1: (lv_composite_0_0= ruleJsonArray )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:912:1: (lv_composite_0_0= ruleJsonArray )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:913:3: lv_composite_0_0= ruleJsonArray
            {
             
            	        newCompositeNode(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1904);
            lv_composite_0_0=ruleJsonArray();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonCompositeTypeRule());
            	        }
                   		set(
                   			current, 
                   			"composite",
                    		lv_composite_0_0, 
                    		"JsonArray");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleJsonCompositeType"


    // $ANTLR start "entryRuleJsonType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:937:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:938:2: (iv_ruleJsonType= ruleJsonType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:939:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType1939);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType1949); 

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
    // $ANTLR end "entryRuleJsonType"


    // $ANTLR start "ruleJsonType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:946:1: ruleJsonType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        EObject lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:949:28: ( ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||(LA18_0>=RULE_JSON_LITERAL_BOOLEAN && LA18_0<=RULE_JSON_LITERAL_NULL)) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:951:1: (lv_scalar_0_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:951:1: (lv_scalar_0_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:952:3: lv_scalar_0_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonType1995);
                    lv_scalar_0_0=ruleJsonScalarType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"scalar",
                            		lv_scalar_0_0, 
                            		"JsonScalarType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:969:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:969:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:970:1: (lv_composite_1_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:970:1: (lv_composite_1_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:971:3: lv_composite_1_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonType2022);
                    lv_composite_1_0=ruleJsonCompositeType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"composite",
                            		lv_composite_1_0, 
                            		"JsonCompositeType");
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
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "entryRuleJsonScalarType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:995:1: entryRuleJsonScalarType returns [EObject current=null] : iv_ruleJsonScalarType= ruleJsonScalarType EOF ;
    public final EObject entryRuleJsonScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:996:2: (iv_ruleJsonScalarType= ruleJsonScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:997:2: iv_ruleJsonScalarType= ruleJsonScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType2058);
            iv_ruleJsonScalarType=ruleJsonScalarType();

            state._fsp--;

             current =iv_ruleJsonScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonScalarType2068); 

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
    // $ANTLR end "entryRuleJsonScalarType"


    // $ANTLR start "ruleJsonScalarType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1004:1: ruleJsonScalarType returns [EObject current=null] : ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) ;
    public final EObject ruleJsonScalarType() throws RecognitionException {
        EObject current = null;

        Token lv_bool_0_0=null;
        Token lv_string_1_0=null;
        Token lv_number_2_0=null;
        Token otherlv_3=null;
        Token this_INT_4=null;
        Token lv_null_5_0=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1007:28: ( ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1008:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1008:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt20=1;
                }
                break;
            case RULE_STRING:
                {
                alt20=2;
                }
                break;
            case RULE_INT:
                {
                alt20=3;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1008:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1008:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1009:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1009:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1010:3: lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN
                    {
                    lv_bool_0_0=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType2110); 

                    			newLeafNode(lv_bool_0_0, grammarAccess.getJsonScalarTypeAccess().getBoolJSON_LITERAL_BOOLEANTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonScalarTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bool",
                            		lv_bool_0_0, 
                            		"JSON_LITERAL_BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1027:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1027:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1028:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1028:1: (lv_string_1_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1029:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonScalarType2138); 

                    			newLeafNode(lv_string_1_0, grammarAccess.getJsonScalarTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonScalarTypeRule());
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
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1046:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1046:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1046:7: ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )?
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1046:7: ( (lv_number_2_0= RULE_INT ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1047:1: (lv_number_2_0= RULE_INT )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1047:1: (lv_number_2_0= RULE_INT )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1048:3: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType2167); 

                    			newLeafNode(lv_number_2_0, grammarAccess.getJsonScalarTypeAccess().getNumberINTTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonScalarTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"number",
                            		lv_number_2_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1064:2: (otherlv_3= '.' this_INT_4= RULE_INT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==38) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1064:4: otherlv_3= '.' this_INT_4= RULE_INT
                            {
                            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleJsonScalarType2185); 

                                	newLeafNode(otherlv_3, grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0());
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType2196); 
                             
                                newLeafNode(this_INT_4, grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1073:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1073:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1074:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1074:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1075:3: lv_null_5_0= RULE_JSON_LITERAL_NULL
                    {
                    lv_null_5_0=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType2221); 

                    			newLeafNode(lv_null_5_0, grammarAccess.getJsonScalarTypeAccess().getNullJSON_LITERAL_NULLTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonScalarTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"null",
                            		lv_null_5_0, 
                            		"JSON_LITERAL_NULL");
                    	    

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
    // $ANTLR end "ruleJsonScalarType"


    // $ANTLR start "entryRuleJsonArray"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1099:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1100:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1101:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray2262);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray2272); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1108:1: ruleJsonArray returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) ;
    public final EObject ruleJsonArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_composites_7_0 = null;

        EObject lv_composites_9_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1111:28: ( ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1112:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1112:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==36) ) {
                    alt25=2;
                }
                else if ( (LA25_1==RULE_STRING||(LA25_1>=RULE_JSON_LITERAL_BOOLEAN && LA25_1<=RULE_JSON_LITERAL_NULL)) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1112:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1112:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1112:4: otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleJsonArray2310); 

                        	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1116:1: ( (lv_elements_1_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1117:1: (lv_elements_1_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1117:1: (lv_elements_1_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1118:3: lv_elements_1_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray2331);
                    lv_elements_1_0=ruleJsonScalarType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_1_0, 
                            		"JsonScalarType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1134:2: (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==31) ) {
                            int LA21_1 = input.LA(2);

                            if ( (LA21_1==RULE_STRING||(LA21_1>=RULE_JSON_LITERAL_BOOLEAN && LA21_1<=RULE_JSON_LITERAL_NULL)) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1134:4: otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleJsonArray2344); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1138:1: ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1139:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1139:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1140:3: lv_elements_3_0= ruleJsonScalarType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray2365);
                    	    lv_elements_3_0=ruleJsonScalarType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_3_0, 
                    	            		"JsonScalarType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1156:4: (otherlv_4= ',' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==31) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1156:6: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleJsonArray2380); 

                                	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleJsonArray2394); 

                        	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1165:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1165:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1165:8: otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleJsonArray2414); 

                        	newLeafNode(otherlv_6, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1169:1: ( (lv_composites_7_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1170:1: (lv_composites_7_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1170:1: (lv_composites_7_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1171:3: lv_composites_7_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2435);
                    lv_composites_7_0=ruleJsonCompositeType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"composites",
                            		lv_composites_7_0, 
                            		"JsonCompositeType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1187:2: (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==31) ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1==36) ) {
                                alt23=1;
                            }


                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1187:4: otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleJsonArray2448); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1191:1: ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1192:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1192:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1193:3: lv_composites_9_0= ruleJsonCompositeType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2469);
                    	    lv_composites_9_0=ruleJsonCompositeType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"composites",
                    	            		lv_composites_9_0, 
                    	            		"JsonCompositeType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1209:4: (otherlv_10= ',' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==31) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1209:6: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleJsonArray2484); 

                                	newLeafNode(otherlv_10, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleJsonArray2498); 

                        	newLeafNode(otherlv_11, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_4());
                        

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
    // $ANTLR end "ruleJsonArray"


    // $ANTLR start "entryRuleJsonObject"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1225:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1226:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1227:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject2535);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject2545); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1234:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ;
    public final EObject ruleJsonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_keys_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_keys_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_values_3_0 = null;

        EObject lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1237:28: ( (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1238:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1238:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1238:3: otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject2582); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1242:1: ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1242:2: ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1242:2: ( (lv_keys_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1243:1: (lv_keys_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1243:1: (lv_keys_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1244:3: lv_keys_1_0= RULE_STRING
            {
            lv_keys_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2600); 

            			newLeafNode(lv_keys_1_0, grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_1_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJsonObjectRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"keys",
                    		lv_keys_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleJsonObject2617); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getColonKeyword_1_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1264:1: ( (lv_values_3_0= ruleXplatformJson ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1265:1: (lv_values_3_0= ruleXplatformJson )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1265:1: (lv_values_3_0= ruleXplatformJson )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1266:3: lv_values_3_0= ruleXplatformJson
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2638);
            lv_values_3_0=ruleXplatformJson();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonObjectRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"XplatformJson");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1282:3: (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==RULE_STRING) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1282:5: otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleJsonObject2652); 

            	        	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1286:1: ( (lv_keys_5_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1287:1: (lv_keys_5_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1287:1: (lv_keys_5_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1288:3: lv_keys_5_0= RULE_STRING
            	    {
            	    lv_keys_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2669); 

            	    			newLeafNode(lv_keys_5_0, grammarAccess.getJsonObjectAccess().getKeysSTRINGTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getJsonObjectRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"keys",
            	            		lv_keys_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleJsonObject2686); 

            	        	newLeafNode(otherlv_6, grammarAccess.getJsonObjectAccess().getColonKeyword_2_2());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1308:1: ( (lv_values_7_0= ruleXplatformJson ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1309:1: (lv_values_7_0= ruleXplatformJson )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1309:1: (lv_values_7_0= ruleXplatformJson )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1310:3: lv_values_7_0= ruleXplatformJson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2707);
            	    lv_values_7_0=ruleXplatformJson();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJsonObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_7_0, 
            	            		"XplatformJson");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1326:4: (otherlv_8= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1326:6: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleJsonObject2722); 

                        	newLeafNode(otherlv_8, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleJsonObject2736); 

                	newLeafNode(otherlv_9, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleXplatformResourceDefinition"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1342:1: entryRuleXplatformResourceDefinition returns [EObject current=null] : iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF ;
    public final EObject entryRuleXplatformResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformResourceDefinition = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1343:2: (iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1344:2: iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getXplatformResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition2772);
            iv_ruleXplatformResourceDefinition=ruleXplatformResourceDefinition();

            state._fsp--;

             current =iv_ruleXplatformResourceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformResourceDefinition2782); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1351:1: ruleXplatformResourceDefinition returns [EObject current=null] : ( ( (lv_resources_0_0= ruleMapInstance ) ) | ( (lv_resources_1_0= ruleEnumInstance ) ) )+ ;
    public final EObject ruleXplatformResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject lv_resources_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1354:28: ( ( ( (lv_resources_0_0= ruleMapInstance ) ) | ( (lv_resources_1_0= ruleEnumInstance ) ) )+ )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1355:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | ( (lv_resources_1_0= ruleEnumInstance ) ) )+
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1355:1: ( ( (lv_resources_0_0= ruleMapInstance ) ) | ( (lv_resources_1_0= ruleEnumInstance ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }
                else if ( (LA28_0==39) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1355:2: ( (lv_resources_0_0= ruleMapInstance ) )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1355:2: ( (lv_resources_0_0= ruleMapInstance ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1356:1: (lv_resources_0_0= ruleMapInstance )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1356:1: (lv_resources_0_0= ruleMapInstance )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1357:3: lv_resources_0_0= ruleMapInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapInstance_in_ruleXplatformResourceDefinition2828);
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1374:6: ( (lv_resources_1_0= ruleEnumInstance ) )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1374:6: ( (lv_resources_1_0= ruleEnumInstance ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1375:1: (lv_resources_1_0= ruleEnumInstance )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1375:1: (lv_resources_1_0= ruleEnumInstance )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1376:3: lv_resources_1_0= ruleEnumInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformResourceDefinitionAccess().getResourcesEnumInstanceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumInstance_in_ruleXplatformResourceDefinition2855);
            	    lv_resources_1_0=ruleEnumInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformResourceDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_1_0, 
            	            		"EnumInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);


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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1400:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1401:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1402:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2892);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2902); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1409:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1412:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1413:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1413:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1413:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEnumInstance2939); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1417:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1418:1: (lv_name_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1418:1: (lv_name_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1419:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2956); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEnumInstance2973); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1439:1: ( (lv_values_3_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1440:1: (lv_values_3_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1440:1: (lv_values_3_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1441:3: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumInstance2990); 

            			newLeafNode(lv_values_3_0, grammarAccess.getEnumInstanceAccess().getValuesSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1457:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_STRING) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1457:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleEnumInstance3008); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1461:1: ( (lv_values_5_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1462:1: (lv_values_5_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1462:1: (lv_values_5_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1463:3: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEnumInstance3025); 

            	    			newLeafNode(lv_values_5_0, grammarAccess.getEnumInstanceAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1479:4: (otherlv_6= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1479:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleEnumInstance3045); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleEnumInstance3059); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1495:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1496:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1497:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance3095);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance3105); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1504:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1507:28: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1508:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1508:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1508:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleMapInstance3142); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1512:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1513:1: (lv_name_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1513:1: (lv_name_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1514:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3159); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleMapInstance3176); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1534:1: ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1534:2: ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1534:2: ( (lv_keys_3_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1535:1: (lv_keys_3_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1535:1: (lv_keys_3_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1536:3: lv_keys_3_0= RULE_ID
            {
            lv_keys_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3194); 

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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMapInstance3211); 

                	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getColonKeyword_3_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1556:1: ( (lv_values_5_0= ruleNestedType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1557:1: (lv_values_5_0= ruleNestedType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1557:1: (lv_values_5_0= ruleNestedType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1558:3: lv_values_5_0= ruleNestedType
            {
             
            	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance3232);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1574:3: (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==RULE_ID) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1574:5: otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) )
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleMapInstance3246); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1578:1: ( (lv_keys_7_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1579:1: (lv_keys_7_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1579:1: (lv_keys_7_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1580:3: lv_keys_7_0= RULE_ID
            	    {
            	    lv_keys_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3263); 

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

            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleMapInstance3280); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMapInstanceAccess().getColonKeyword_4_2());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1600:1: ( (lv_values_9_0= ruleNestedType ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1601:1: (lv_values_9_0= ruleNestedType )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1601:1: (lv_values_9_0= ruleNestedType )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1602:3: lv_values_9_0= ruleNestedType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance3301);
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
            	    break loop31;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1618:4: (otherlv_10= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1618:6: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleMapInstance3316); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleMapInstance3330); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1634:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1635:2: (iv_ruleStringList= ruleStringList EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1636:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList3366);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList3376); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1643:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1646:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1647:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1647:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1647:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleStringList3413); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1651:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1652:1: (lv_values_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1652:1: (lv_values_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1653:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3430); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1669:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==31) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_STRING) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1669:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleStringList3448); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1673:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1674:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1674:1: (lv_values_3_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1675:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3465); 

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
            	    break loop33;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1691:4: (otherlv_4= ',' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1691:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_ruleStringList3485); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleStringList3499); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1707:1: entryRuleNestedType returns [EObject current=null] : iv_ruleNestedType= ruleNestedType EOF ;
    public final EObject entryRuleNestedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1708:2: (iv_ruleNestedType= ruleNestedType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1709:2: iv_ruleNestedType= ruleNestedType EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType3535);
            iv_ruleNestedType=ruleNestedType();

            state._fsp--;

             current =iv_ruleNestedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType3545); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1716:1: ruleNestedType returns [EObject current=null] : (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList ) ;
    public final EObject ruleNestedType() throws RecognitionException {
        EObject current = null;

        Token this_STRING_0=null;
        EObject this_StringList_1 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1719:28: ( (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1720:1: (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1720:1: (this_STRING_0= RULE_STRING | this_StringList_1= ruleStringList )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==36) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1720:2: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNestedType3581); 
                     
                        newLeafNode(this_STRING_0, grammarAccess.getNestedTypeAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1726:5: this_StringList_1= ruleStringList
                    {
                     
                            newCompositeNode(grammarAccess.getNestedTypeAccess().getStringListParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringList_in_ruleNestedType3608);
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
    public static final BitSet FOLLOW_rulePlatform_in_ruleXplatform131 = new BitSet(new long[]{0x0000018000080000L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_ruleXplatform153 = new BitSet(new long[]{0x0000018000080002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_ruleXplatform180 = new BitSet(new long[]{0x0000018000080002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulePlatform265 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePlatform277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlatform295 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePlatform312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlatform329 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_rulePlatform348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_entryRuleXplatformCallDefinition384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformCallDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleXplatformCallDefinition431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatformCallDefinition448 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXplatformCallDefinition465 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatformCallDefinition482 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXplatformCallDefinition499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleURI_in_ruleXplatformCallDefinition520 = new BitSet(new long[]{0x0000000008400002L});
    public static final BitSet FOLLOW_22_in_ruleXplatformCallDefinition533 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXplatformCallDefinition545 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXplatformCallDefinition557 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatformCallDefinition569 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition590 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_25_in_ruleXplatformCallDefinition603 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXplatformCallDefinition615 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition636 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleXplatformCallDefinition653 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformCallDefinition665 = new BitSet(new long[]{0x0000001E40010010L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition686 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleXplatformCallDefinition699 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformCallDefinition711 = new BitSet(new long[]{0x0000001E40010010L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI819 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_16_in_ruleURI833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI850 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleURI867 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI879 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatformHeader970 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformHeader988 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXplatformHeader1000 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader1021 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleXplatformHeader1034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader1055 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleXplatformHeader1070 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXplatformHeader1084 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformHeader1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1184 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleXplatformHeaderKeyValuePair1201 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatformJson1342 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformJson1360 = new BitSet(new long[]{0x0000001000000E20L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleXplatformJson1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleXplatformJson1437 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformJson1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaScalarType1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJsonMetaScalarType1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonMetaScalarType1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleJsonMetaScalarType1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaArray1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleJsonMetaArray1661 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1682 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleJsonMetaArray1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaType1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeType1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonType1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonType2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType2058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonScalarType2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonScalarType2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType2167 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_ruleJsonScalarType2185 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray2262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleJsonArray2310 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray2331 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_31_in_ruleJsonArray2344 = new BitSet(new long[]{0x0000000000000E20L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray2365 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_31_in_ruleJsonArray2380 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleJsonArray2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleJsonArray2414 = new BitSet(new long[]{0x0000001000000E20L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2435 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_31_in_ruleJsonArray2448 = new BitSet(new long[]{0x0000001000000E20L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2469 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_31_in_ruleJsonArray2484 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleJsonArray2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject2535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject2582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2600 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleJsonObject2617 = new BitSet(new long[]{0x0000001E40010010L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2638 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleJsonObject2652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2669 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleJsonObject2686 = new BitSet(new long[]{0x0000001E40010010L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2707 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleJsonObject2722 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleJsonObject2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition2772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformResourceDefinition2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleXplatformResourceDefinition2828 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleXplatformResourceDefinition2855 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEnumInstance2939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2956 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEnumInstance2973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumInstance2990 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleEnumInstance3008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumInstance3025 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleEnumInstance3045 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEnumInstance3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance3095 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleMapInstance3142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3159 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMapInstance3176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3194 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapInstance3211 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance3232 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleMapInstance3246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3263 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapInstance3280 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance3301 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_31_in_ruleMapInstance3316 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMapInstance3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList3366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleStringList3413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3430 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_31_in_ruleStringList3448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3465 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_31_in_ruleStringList3485 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleStringList3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType3535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNestedType3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleNestedType3608 = new BitSet(new long[]{0x0000000000000002L});

}