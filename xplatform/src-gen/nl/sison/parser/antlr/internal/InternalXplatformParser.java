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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_ANY_OTHER", "RULE_STRING", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_INT", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'{'", "'}'", "'\\'\\'\\''", "','", "'='", "'boolean'", "'number'", "'string'", "'['", "']'", "'.'", "'platform'", "'enum'", "'map'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_XPLATFORM_HEADER_PARAMETER=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_JSON_LITERAL_BOOLEAN=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
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
    public static final int RULE_RESTFUL_METHODS=5;
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:76:1: ruleXplatform returns [EObject current=null] : ( ( (lv_resources_0_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_1_0= ruleXplatformCallDefinition ) ) )+ ;
    public final EObject ruleXplatform() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject lv_calls_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:79:28: ( ( ( (lv_resources_0_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_1_0= ruleXplatformCallDefinition ) ) )+ )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: ( ( (lv_resources_0_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_1_0= ruleXplatformCallDefinition ) ) )+
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: ( ( (lv_resources_0_0= ruleXplatformResourceDefinition ) ) | ( (lv_calls_1_0= ruleXplatformCallDefinition ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==37) ) {
                    alt1=1;
                }
                else if ( (LA1_0==15) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:2: ( (lv_resources_0_0= ruleXplatformResourceDefinition ) )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:2: ( (lv_resources_0_0= ruleXplatformResourceDefinition ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:81:1: (lv_resources_0_0= ruleXplatformResourceDefinition )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:81:1: (lv_resources_0_0= ruleXplatformResourceDefinition )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:82:3: lv_resources_0_0= ruleXplatformResourceDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformAccess().getResourcesXplatformResourceDefinitionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_ruleXplatform131);
            	    lv_resources_0_0=ruleXplatformResourceDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_0_0, 
            	            		"XplatformResourceDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:99:6: ( (lv_calls_1_0= ruleXplatformCallDefinition ) )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:99:6: ( (lv_calls_1_0= ruleXplatformCallDefinition ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:100:1: (lv_calls_1_0= ruleXplatformCallDefinition )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:100:1: (lv_calls_1_0= ruleXplatformCallDefinition )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:101:3: lv_calls_1_0= ruleXplatformCallDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformAccess().getCallsXplatformCallDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformCallDefinition_in_ruleXplatform158);
            	    lv_calls_1_0=ruleXplatformCallDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"calls",
            	            		lv_calls_1_0, 
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


    // $ANTLR start "entryRuleXplatformCallDefinition"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:125:1: entryRuleXplatformCallDefinition returns [EObject current=null] : iv_ruleXplatformCallDefinition= ruleXplatformCallDefinition EOF ;
    public final EObject entryRuleXplatformCallDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformCallDefinition = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:126:2: (iv_ruleXplatformCallDefinition= ruleXplatformCallDefinition EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:127:2: iv_ruleXplatformCallDefinition= ruleXplatformCallDefinition EOF
            {
             newCompositeNode(grammarAccess.getXplatformCallDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformCallDefinition_in_entryRuleXplatformCallDefinition195);
            iv_ruleXplatformCallDefinition=ruleXplatformCallDefinition();

            state._fsp--;

             current =iv_ruleXplatformCallDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformCallDefinition205); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:134:1: ruleXplatformCallDefinition returns [EObject current=null] : (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:137:28: ( (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:138:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:138:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:138:3: otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleXplatformCallDefinition242); 

                	newLeafNode(otherlv_0, grammarAccess.getXplatformCallDefinitionAccess().getCallKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:143:1: (lv_name_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXplatformCallDefinition259); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXplatformCallDefinition276); 

                	newLeafNode(otherlv_2, grammarAccess.getXplatformCallDefinitionAccess().getColonKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:1: ( (lv_method_3_0= RULE_RESTFUL_METHODS ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:165:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:165:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:166:3: lv_method_3_0= RULE_RESTFUL_METHODS
            {
            lv_method_3_0=(Token)match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatformCallDefinition293); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXplatformCallDefinition310); 

                	newLeafNode(otherlv_4, grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_4());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:186:1: ( (lv_uri_5_0= ruleURI ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:187:1: (lv_uri_5_0= ruleURI )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:187:1: (lv_uri_5_0= ruleURI )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:188:3: lv_uri_5_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleXplatformCallDefinition331);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:204:2: (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:204:4: otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )?
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXplatformCallDefinition344); 

                        	newLeafNode(otherlv_6, grammarAccess.getXplatformCallDefinitionAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleXplatformCallDefinition356); 

                        	newLeafNode(otherlv_7, grammarAccess.getXplatformCallDefinitionAccess().getHeadersKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleXplatformCallDefinition368); 

                        	newLeafNode(otherlv_8, grammarAccess.getXplatformCallDefinitionAccess().getFromKeyword_6_2());
                        
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleXplatformCallDefinition380); 

                        	newLeafNode(otherlv_9, grammarAccess.getXplatformCallDefinitionAccess().getRequestKeyword_6_3());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:220:1: ( (lv_requestHeaders_10_0= ruleXplatformHeader ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:221:1: (lv_requestHeaders_10_0= ruleXplatformHeader )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:221:1: (lv_requestHeaders_10_0= ruleXplatformHeader )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:222:3: lv_requestHeaders_10_0= ruleXplatformHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition401);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:238:2: (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==21) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:238:4: otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) )
                            {
                            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleXplatformCallDefinition414); 

                                	newLeafNode(otherlv_11, grammarAccess.getXplatformCallDefinitionAccess().getAndKeyword_6_5_0());
                                
                            otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleXplatformCallDefinition426); 

                                	newLeafNode(otherlv_12, grammarAccess.getXplatformCallDefinitionAccess().getResponseKeyword_6_5_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:246:1: ( (lv_responseHeaders_13_0= ruleXplatformHeader ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:247:1: (lv_responseHeaders_13_0= ruleXplatformHeader )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:247:1: (lv_responseHeaders_13_0= ruleXplatformHeader )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:248:3: lv_responseHeaders_13_0= ruleXplatformHeader
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition447);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:264:6: (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:264:8: otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )?
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleXplatformCallDefinition464); 

                        	newLeafNode(otherlv_14, grammarAccess.getXplatformCallDefinitionAccess().getClientKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleXplatformCallDefinition476); 

                        	newLeafNode(otherlv_15, grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_1());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:272:1: ( (lv_jsonToClient_16_0= ruleXplatformJson ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:273:1: (lv_jsonToClient_16_0= ruleXplatformJson )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:273:1: (lv_jsonToClient_16_0= ruleXplatformJson )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:274:3: lv_jsonToClient_16_0= ruleXplatformJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition497);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:290:2: (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==25) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:290:4: otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) )
                            {
                            otherlv_17=(Token)match(input,25,FOLLOW_25_in_ruleXplatformCallDefinition510); 

                                	newLeafNode(otherlv_17, grammarAccess.getXplatformCallDefinitionAccess().getServerKeyword_7_3_0());
                                
                            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleXplatformCallDefinition522); 

                                	newLeafNode(otherlv_18, grammarAccess.getXplatformCallDefinitionAccess().getExpectsKeyword_7_3_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:298:1: ( (lv_jsonToServer_19_0= ruleXplatformJson ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:299:1: (lv_jsonToServer_19_0= ruleXplatformJson )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:299:1: (lv_jsonToServer_19_0= ruleXplatformJson )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:300:3: lv_jsonToServer_19_0= ruleXplatformJson
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformCallDefinitionAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition543);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:324:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:325:2: (iv_ruleURI= ruleURI EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:326:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI583);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI593); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:333:1: ruleURI returns [EObject current=null] : ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_0=null;
        Token otherlv_1=null;
        Token lv_uriParameter_2_0=null;
        Token otherlv_3=null;
        Token this_ANY_OTHER_4=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:336:28: ( ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:337:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:337:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:337:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:337:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ANY_OTHER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:337:3: this_ANY_OTHER_0= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI630); 
            	     
            	        newLeafNode(this_ANY_OTHER_0, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:341:3: (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:341:5: otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )*
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleURI644); 

                        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:345:1: ( (lv_uriParameter_2_0= RULE_ID ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:346:1: (lv_uriParameter_2_0= RULE_ID )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:346:1: (lv_uriParameter_2_0= RULE_ID )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:347:3: lv_uriParameter_2_0= RULE_ID
                    {
                    lv_uriParameter_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI661); 

                    			newLeafNode(lv_uriParameter_2_0, grammarAccess.getURIAccess().getUriParameterIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getURIRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"uriParameter",
                            		lv_uriParameter_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleURI678); 

                        	newLeafNode(otherlv_3, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:367:1: (this_ANY_OTHER_4= RULE_ANY_OTHER )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_ANY_OTHER) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:367:2: this_ANY_OTHER_4= RULE_ANY_OTHER
                    	    {
                    	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI690); 
                    	     
                    	        newLeafNode(this_ANY_OTHER_4, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:379:1: entryRuleXplatformHeader returns [EObject current=null] : iv_ruleXplatformHeader= ruleXplatformHeader EOF ;
    public final EObject entryRuleXplatformHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeader = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:380:2: (iv_ruleXplatformHeader= ruleXplatformHeader EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:381:2: iv_ruleXplatformHeader= ruleXplatformHeader EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderRule()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader729);
            iv_ruleXplatformHeader=ruleXplatformHeader();

            state._fsp--;

             current =iv_ruleXplatformHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeader739); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:388:1: ruleXplatformHeader returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) ;
    public final EObject ruleXplatformHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_headerKeyValues_2_0 = null;

        EObject lv_headerKeyValues_4_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:391:28: ( (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:392:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:392:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:392:3: otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader776); 

                	newLeafNode(otherlv_0, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleXplatformHeader788); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:400:1: ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:401:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:401:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:402:3: lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader809);
            lv_headerKeyValues_2_0=ruleXplatformHeaderKeyValuePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformHeaderRule());
            	        }
                   		add(
                   			current, 
                   			"headerKeyValues",
                    		lv_headerKeyValues_2_0, 
                    		"XplatformHeaderKeyValuePair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:418:2: (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_STRING) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:418:4: otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXplatformHeader822); 

            	        	newLeafNode(otherlv_3, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:422:1: ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:423:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:423:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:424:3: lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader843);
            	    lv_headerKeyValues_4_0=ruleXplatformHeaderKeyValuePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformHeaderRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"headerKeyValues",
            	            		lv_headerKeyValues_4_0, 
            	            		"XplatformHeaderKeyValuePair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:440:4: (otherlv_5= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:440:6: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleXplatformHeader858); 

                        	newLeafNode(otherlv_5, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXplatformHeader872); 

                	newLeafNode(otherlv_6, grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader884); 

                	newLeafNode(otherlv_7, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_6());
                

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:460:1: entryRuleXplatformHeaderKeyValuePair returns [EObject current=null] : iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF ;
    public final EObject entryRuleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeaderKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:461:2: (iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:462:2: iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair920);
            iv_ruleXplatformHeaderKeyValuePair=ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleXplatformHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair930); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:469:1: ruleXplatformHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) ;
    public final EObject ruleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:472:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:473:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:473:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:473:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:473:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:474:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:474:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:475:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair972); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleXplatformHeaderKeyValuePair989); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_XPLATFORM_HEADER_PARAMETER) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:496:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:496:1: (lv_value_2_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:497:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1007); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:514:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:514:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:515:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:515:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:516:3: lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER
                    {
                    lv_value_3_0=(Token)match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair1035); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:540:1: entryRuleXplatformJson returns [EObject current=null] : iv_ruleXplatformJson= ruleXplatformJson EOF ;
    public final EObject entryRuleXplatformJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformJson = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:541:2: (iv_ruleXplatformJson= ruleXplatformJson EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:542:2: iv_ruleXplatformJson= ruleXplatformJson EOF
            {
             newCompositeNode(grammarAccess.getXplatformJsonRule()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson1077);
            iv_ruleXplatformJson=ruleXplatformJson();

            state._fsp--;

             current =iv_ruleXplatformJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformJson1087); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:549:1: ruleXplatformJson returns [EObject current=null] : ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) ) ;
    public final EObject ruleXplatformJson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_metaType_2_0 = null;

        EObject lv_composite_3_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:552:28: ( ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:553:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:553:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:553:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:553:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:553:4: otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleXplatformJson1125); 

                        	newLeafNode(otherlv_0, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:557:1: ( (lv_type_1_0= ruleJsonType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:558:1: (lv_type_1_0= ruleJsonType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:558:1: (lv_type_1_0= ruleJsonType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:559:3: lv_type_1_0= ruleJsonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonType_in_ruleXplatformJson1146);
                    lv_type_1_0=ruleJsonType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"JsonType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:576:6: ( (lv_metaType_2_0= ruleJsonMetaType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:576:6: ( (lv_metaType_2_0= ruleJsonMetaType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:577:1: (lv_metaType_2_0= ruleJsonMetaType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:577:1: (lv_metaType_2_0= ruleJsonMetaType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:578:3: lv_metaType_2_0= ruleJsonMetaType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1174);
                    lv_metaType_2_0=ruleJsonMetaType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
                    	        }
                           		set(
                           			current, 
                           			"metaType",
                            		lv_metaType_2_0, 
                            		"JsonMetaType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:595:6: ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:595:6: ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:595:7: ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\''
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:595:7: ( (lv_composite_3_0= ruleJsonObject ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:596:1: (lv_composite_3_0= ruleJsonObject )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:596:1: (lv_composite_3_0= ruleJsonObject )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:597:3: lv_composite_3_0= ruleJsonObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleXplatformJson1202);
                    lv_composite_3_0=ruleJsonObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
                    	        }
                           		set(
                           			current, 
                           			"composite",
                            		lv_composite_3_0, 
                            		"JsonObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXplatformJson1214); 

                        	newLeafNode(otherlv_4, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_2_1());
                        

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:625:1: entryRuleJsonMetaScalarType returns [String current=null] : iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF ;
    public final String entryRuleJsonMetaScalarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonMetaScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:626:2: (iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:627:2: iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1252);
            iv_ruleJsonMetaScalarType=ruleJsonMetaScalarType();

            state._fsp--;

             current =iv_ruleJsonMetaScalarType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaScalarType1263); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:634:1: ruleJsonMetaScalarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'number' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleJsonMetaScalarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:637:28: ( (kw= 'boolean' | kw= 'number' | kw= 'string' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:638:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:638:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 32:
                {
                alt13=2;
                }
                break;
            case 33:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:639:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleJsonMetaScalarType1301); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:646:2: kw= 'number'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleJsonMetaScalarType1320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:653:2: kw= 'string'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleJsonMetaScalarType1339); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:666:1: entryRuleJsonMetaArray returns [EObject current=null] : iv_ruleJsonMetaArray= ruleJsonMetaArray EOF ;
    public final EObject entryRuleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:667:2: (iv_ruleJsonMetaArray= ruleJsonMetaArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:668:2: iv_ruleJsonMetaArray= ruleJsonMetaArray EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaArrayRule()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1379);
            iv_ruleJsonMetaArray=ruleJsonMetaArray();

            state._fsp--;

             current =iv_ruleJsonMetaArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaArray1389); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:675:1: ruleJsonMetaArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) ;
    public final EObject ruleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaType_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:678:28: ( (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:679:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:679:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:679:3: otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleJsonMetaArray1426); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:683:1: ( (lv_metaType_1_0= ruleJsonMetaType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:684:1: (lv_metaType_1_0= ruleJsonMetaType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:684:1: (lv_metaType_1_0= ruleJsonMetaType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:685:3: lv_metaType_1_0= ruleJsonMetaType
            {
             
            	        newCompositeNode(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1447);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonMetaArray1459); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:713:1: entryRuleJsonMetaType returns [EObject current=null] : iv_ruleJsonMetaType= ruleJsonMetaType EOF ;
    public final EObject entryRuleJsonMetaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:714:2: (iv_ruleJsonMetaType= ruleJsonMetaType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:715:2: iv_ruleJsonMetaType= ruleJsonMetaType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1495);
            iv_ruleJsonMetaType=ruleJsonMetaType();

            state._fsp--;

             current =iv_ruleJsonMetaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaType1505); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:722:1: ruleJsonMetaType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) ;
    public final EObject ruleJsonMetaType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:725:28: ( ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:726:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:726:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=31 && LA14_0<=33)) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:726:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:726:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:728:3: lv_scalar_0_0= ruleJsonMetaScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1551);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:745:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:745:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:746:1: (lv_composite_1_0= ruleJsonMetaArray )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:746:1: (lv_composite_1_0= ruleJsonMetaArray )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:747:3: lv_composite_1_0= ruleJsonMetaArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1578);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:771:1: entryRuleJsonCompositeType returns [EObject current=null] : iv_ruleJsonCompositeType= ruleJsonCompositeType EOF ;
    public final EObject entryRuleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:772:2: (iv_ruleJsonCompositeType= ruleJsonCompositeType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:773:2: iv_ruleJsonCompositeType= ruleJsonCompositeType EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeTypeRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1614);
            iv_ruleJsonCompositeType=ruleJsonCompositeType();

            state._fsp--;

             current =iv_ruleJsonCompositeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeType1624); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:780:1: ruleJsonCompositeType returns [EObject current=null] : ( (lv_composite_0_0= ruleJsonArray ) ) ;
    public final EObject ruleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject lv_composite_0_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:783:28: ( ( (lv_composite_0_0= ruleJsonArray ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:784:1: ( (lv_composite_0_0= ruleJsonArray ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:784:1: ( (lv_composite_0_0= ruleJsonArray ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:785:1: (lv_composite_0_0= ruleJsonArray )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:785:1: (lv_composite_0_0= ruleJsonArray )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:786:3: lv_composite_0_0= ruleJsonArray
            {
             
            	        newCompositeNode(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1669);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:810:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:811:2: (iv_ruleJsonType= ruleJsonType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:812:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType1704);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType1714); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:819:1: ruleJsonType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        EObject lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:822:28: ( ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING||(LA15_0>=RULE_JSON_LITERAL_BOOLEAN && LA15_0<=RULE_JSON_LITERAL_NULL)) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:824:1: (lv_scalar_0_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:824:1: (lv_scalar_0_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:825:3: lv_scalar_0_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonType1760);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:843:1: (lv_composite_1_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:843:1: (lv_composite_1_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:844:3: lv_composite_1_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonType1787);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:868:1: entryRuleJsonScalarType returns [EObject current=null] : iv_ruleJsonScalarType= ruleJsonScalarType EOF ;
    public final EObject entryRuleJsonScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:869:2: (iv_ruleJsonScalarType= ruleJsonScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:870:2: iv_ruleJsonScalarType= ruleJsonScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1823);
            iv_ruleJsonScalarType=ruleJsonScalarType();

            state._fsp--;

             current =iv_ruleJsonScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonScalarType1833); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:877:1: ruleJsonScalarType returns [EObject current=null] : ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:880:28: ( ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:881:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:881:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
                }
                break;
            case RULE_INT:
                {
                alt17=3;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:881:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:881:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:882:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:882:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:883:3: lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN
                    {
                    lv_bool_0_0=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1875); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:900:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:900:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:901:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:901:1: (lv_string_1_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:902:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonScalarType1903); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:919:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:919:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:919:7: ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )?
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:919:7: ( (lv_number_2_0= RULE_INT ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:920:1: (lv_number_2_0= RULE_INT )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:920:1: (lv_number_2_0= RULE_INT )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:921:3: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1932); 

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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:937:2: (otherlv_3= '.' this_INT_4= RULE_INT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==36) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:937:4: otherlv_3= '.' this_INT_4= RULE_INT
                            {
                            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleJsonScalarType1950); 

                                	newLeafNode(otherlv_3, grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0());
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1961); 
                             
                                newLeafNode(this_INT_4, grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:946:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:946:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:947:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:947:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:948:3: lv_null_5_0= RULE_JSON_LITERAL_NULL
                    {
                    lv_null_5_0=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1986); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:972:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:973:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:974:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray2027);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray2037); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:981:1: ruleJsonArray returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:984:28: ( ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_STRING||(LA22_1>=RULE_JSON_LITERAL_BOOLEAN && LA22_1<=RULE_JSON_LITERAL_NULL)) ) {
                    alt22=1;
                }
                else if ( (LA22_1==34) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:4: otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray2075); 

                        	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:989:1: ( (lv_elements_1_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:990:1: (lv_elements_1_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:990:1: (lv_elements_1_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:991:3: lv_elements_1_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray2096);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1007:2: (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==29) ) {
                            int LA18_1 = input.LA(2);

                            if ( (LA18_1==RULE_STRING||(LA18_1>=RULE_JSON_LITERAL_BOOLEAN && LA18_1<=RULE_JSON_LITERAL_NULL)) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1007:4: otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2109); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1011:1: ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1012:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1012:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1013:3: lv_elements_3_0= ruleJsonScalarType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray2130);
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
                    	    break loop18;
                        }
                    } while (true);

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1029:4: (otherlv_4= ',' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==29) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1029:6: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2145); 

                                	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2159); 

                        	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1038:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1038:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1038:8: otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray2179); 

                        	newLeafNode(otherlv_6, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1042:1: ( (lv_composites_7_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1043:1: (lv_composites_7_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1043:1: (lv_composites_7_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1044:3: lv_composites_7_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2200);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1060:2: (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==29) ) {
                            int LA20_1 = input.LA(2);

                            if ( (LA20_1==34) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1060:4: otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2213); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1064:1: ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1065:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1065:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1066:3: lv_composites_9_0= ruleJsonCompositeType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2234);
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
                    	    break loop20;
                        }
                    } while (true);

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1082:4: (otherlv_10= ',' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==29) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1082:6: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2249); 

                                	newLeafNode(otherlv_10, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2263); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1098:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1099:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1100:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject2300);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject2310); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1107:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1110:28: ( (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1111:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1111:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1111:3: otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleJsonObject2347); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1115:1: ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1115:2: ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1115:2: ( (lv_keys_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1116:1: (lv_keys_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1116:1: (lv_keys_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1117:3: lv_keys_1_0= RULE_STRING
            {
            lv_keys_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2365); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject2382); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getColonKeyword_1_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1137:1: ( (lv_values_3_0= ruleXplatformJson ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1138:1: (lv_values_3_0= ruleXplatformJson )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1138:1: (lv_values_3_0= ruleXplatformJson )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1139:3: lv_values_3_0= ruleXplatformJson
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2403);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1155:3: (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==RULE_STRING) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1155:5: otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleJsonObject2417); 

            	        	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1159:1: ( (lv_keys_5_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1160:1: (lv_keys_5_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1160:1: (lv_keys_5_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1161:3: lv_keys_5_0= RULE_STRING
            	    {
            	    lv_keys_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2434); 

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

            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject2451); 

            	        	newLeafNode(otherlv_6, grammarAccess.getJsonObjectAccess().getColonKeyword_2_2());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1181:1: ( (lv_values_7_0= ruleXplatformJson ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1182:1: (lv_values_7_0= ruleXplatformJson )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1182:1: (lv_values_7_0= ruleXplatformJson )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1183:3: lv_values_7_0= ruleXplatformJson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2472);
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
            	    break loop23;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1199:4: (otherlv_8= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1199:6: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleJsonObject2487); 

                        	newLeafNode(otherlv_8, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleJsonObject2501); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1215:1: entryRuleXplatformResourceDefinition returns [EObject current=null] : iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF ;
    public final EObject entryRuleXplatformResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformResourceDefinition = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1216:2: (iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1217:2: iv_ruleXplatformResourceDefinition= ruleXplatformResourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getXplatformResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition2537);
            iv_ruleXplatformResourceDefinition=ruleXplatformResourceDefinition();

            state._fsp--;

             current =iv_ruleXplatformResourceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformResourceDefinition2547); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1224:1: ruleXplatformResourceDefinition returns [EObject current=null] : ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ ) ;
    public final EObject ruleXplatformResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_platform_0_0 = null;

        EObject lv_types_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1227:28: ( ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1228:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1228:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1228:2: ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1228:2: ( (lv_platform_0_0= rulePlatform ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1229:1: (lv_platform_0_0= rulePlatform )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1229:1: (lv_platform_0_0= rulePlatform )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1230:3: lv_platform_0_0= rulePlatform
            {
             
            	        newCompositeNode(grammarAccess.getXplatformResourceDefinitionAccess().getPlatformPlatformParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePlatform_in_ruleXplatformResourceDefinition2593);
            lv_platform_0_0=rulePlatform();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformResourceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"platform",
                    		lv_platform_0_0, 
                    		"Platform");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1246:2: ( (lv_types_1_0= ruleType ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=38 && LA25_0<=39)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1247:1: (lv_types_1_0= ruleType )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1247:1: (lv_types_1_0= ruleType )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1248:3: lv_types_1_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformResourceDefinitionAccess().getTypesTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleXplatformResourceDefinition2614);
            	    lv_types_1_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformResourceDefinitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_1_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // $ANTLR end "ruleXplatformResourceDefinition"


    // $ANTLR start "entryRulePlatform"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1272:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1273:2: (iv_rulePlatform= rulePlatform EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1274:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform2651);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform2661); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1281:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_platforms_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1284:28: ( (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1285:1: (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1285:1: (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1285:3: otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePlatform2698); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePlatform2710); 

                	newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1293:1: ( (lv_platforms_2_0= RULE_STRING ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_STRING) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1294:1: (lv_platforms_2_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1294:1: (lv_platforms_2_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1295:3: lv_platforms_2_0= RULE_STRING
            	    {
            	    lv_platforms_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlatform2727); 

            	    			newLeafNode(lv_platforms_2_0, grammarAccess.getPlatformAccess().getPlatformsSTRINGTerminalRuleCall_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPlatformRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"platforms",
            	            		lv_platforms_2_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulePlatform2745); 

                	newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1323:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1324:2: (iv_ruleType= ruleType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1325:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2781);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2791); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1332:1: ruleType returns [EObject current=null] : (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MapInstance_0 = null;

        EObject this_EnumInstance_1 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1335:28: ( (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1336:1: (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1336:1: (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            else if ( (LA27_0==38) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1337:5: this_MapInstance_0= ruleMapInstance
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMapInstanceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMapInstance_in_ruleType2838);
                    this_MapInstance_0=ruleMapInstance();

                    state._fsp--;

                     
                            current = this_MapInstance_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1347:5: this_EnumInstance_1= ruleEnumInstance
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumInstanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumInstance_in_ruleType2865);
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnumInstance"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1363:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1364:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1365:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2900);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2910); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1372:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
    public final EObject ruleEnumInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_enumName_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1375:28: ( (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1376:1: (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1376:1: (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1376:3: otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleEnumInstance2947); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1380:1: ( (lv_enumName_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1381:1: (lv_enumName_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1381:1: (lv_enumName_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1382:3: lv_enumName_1_0= RULE_ID
            {
            lv_enumName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2964); 

            			newLeafNode(lv_enumName_1_0, grammarAccess.getEnumInstanceAccess().getEnumNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"enumName",
                    		lv_enumName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleEnumInstance2981); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1402:1: ( (lv_values_3_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1403:1: (lv_values_3_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1403:1: (lv_values_3_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1404:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2998); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1420:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1420:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleEnumInstance3016); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1424:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1425:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1425:1: (lv_values_5_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1426:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance3033); 

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
            	    break loop28;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1442:4: (otherlv_6= ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1442:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleEnumInstance3053); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleEnumInstance3067); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1458:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1459:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1460:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance3103);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance3113); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1467:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
    public final EObject ruleMapInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mapName_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1470:28: ( (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1471:1: (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1471:1: (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1471:3: otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleMapInstance3150); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1475:1: ( (lv_mapName_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1476:1: (lv_mapName_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1476:1: (lv_mapName_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1477:3: lv_mapName_1_0= RULE_ID
            {
            lv_mapName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3167); 

            			newLeafNode(lv_mapName_1_0, grammarAccess.getMapInstanceAccess().getMapNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mapName",
                    		lv_mapName_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleMapInstance3184); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1497:1: ( (lv_values_3_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1498:1: (lv_values_3_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1498:1: (lv_values_3_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1499:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3201); 

            			newLeafNode(lv_values_3_0, grammarAccess.getMapInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapInstanceRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"ID");
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1515:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_ID) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1515:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleMapInstance3219); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1519:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1520:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1520:1: (lv_values_5_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1521:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3236); 

            	    			newLeafNode(lv_values_5_0, grammarAccess.getMapInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMapInstanceRule());
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
            	    break loop30;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1537:4: (otherlv_6= ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1537:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleMapInstance3256); 

                        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleMapInstance3270); 

                	newLeafNode(otherlv_7, grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1553:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1554:2: (iv_ruleStringList= ruleStringList EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1555:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList3306);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList3316); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1562:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1565:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1566:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1566:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1566:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStringList3353); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1570:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1571:1: (lv_values_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1571:1: (lv_values_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1572:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3370); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1588:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_STRING) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1588:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleStringList3388); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1592:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1593:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1593:1: (lv_values_3_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1594:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3405); 

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
            	    break loop32;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1610:4: (otherlv_4= ',' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1610:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleStringList3425); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleStringList3439); 

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


    // $ANTLR start "entryRuleValueType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1628:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1629:2: (iv_ruleValueType= ruleValueType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1630:2: iv_ruleValueType= ruleValueType EOF
            {
             newCompositeNode(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_ruleValueType_in_entryRuleValueType3477);
            iv_ruleValueType=ruleValueType();

            state._fsp--;

             current =iv_ruleValueType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueType3487); 

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
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1637:1: ruleValueType returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        EObject lv_stringList_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1640:28: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1641:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1641:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==34) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1641:2: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1641:2: ( (lv_string_0_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1642:1: (lv_string_0_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1642:1: (lv_string_0_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1643:3: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueType3529); 

                    			newLeafNode(lv_string_0_0, grammarAccess.getValueTypeAccess().getStringSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1660:6: ( (lv_stringList_1_0= ruleStringList ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1660:6: ( (lv_stringList_1_0= ruleStringList ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1661:1: (lv_stringList_1_0= ruleStringList )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1661:1: (lv_stringList_1_0= ruleStringList )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1662:3: lv_stringList_1_0= ruleStringList
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueTypeAccess().getStringListStringListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringList_in_ruleValueType3561);
                    lv_stringList_1_0=ruleStringList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"stringList",
                            		lv_stringList_1_0, 
                            		"StringList");
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
    // $ANTLR end "ruleValueType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXplatform_in_entryRuleXplatform75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatform85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_ruleXplatform131 = new BitSet(new long[]{0x0000002000008002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_ruleXplatform158 = new BitSet(new long[]{0x0000002000008002L});
    public static final BitSet FOLLOW_ruleXplatformCallDefinition_in_entryRuleXplatformCallDefinition195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformCallDefinition205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXplatformCallDefinition242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatformCallDefinition259 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXplatformCallDefinition276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatformCallDefinition293 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXplatformCallDefinition310 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleURI_in_ruleXplatformCallDefinition331 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_18_in_ruleXplatformCallDefinition344 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXplatformCallDefinition356 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXplatformCallDefinition368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXplatformCallDefinition380 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition401 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_21_in_ruleXplatformCallDefinition414 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXplatformCallDefinition426 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatformCallDefinition447 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXplatformCallDefinition464 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatformCallDefinition476 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition497 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleXplatformCallDefinition510 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatformCallDefinition522 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatformCallDefinition543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI630 = new BitSet(new long[]{0x0000000004000042L});
    public static final BitSet FOLLOW_26_in_ruleURI644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI661 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleURI678 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI690 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader776 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXplatformHeader788 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader809 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleXplatformHeader822 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader843 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleXplatformHeader858 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXplatformHeader872 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair972 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformHeaderKeyValuePair989 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXplatformJson1125 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleXplatformJson1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleXplatformJson1202 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformJson1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaScalarType1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJsonMetaScalarType1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleJsonMetaScalarType1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJsonMetaScalarType1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaArray1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonMetaArray1426 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1447 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonMetaArray1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaType1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeType1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType1704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonType1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonType1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonScalarType1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonScalarType1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1932 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJsonScalarType1950 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray2027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray2075 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray2096 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2109 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray2130 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2145 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray2179 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2200 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2213 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2234 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2249 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject2300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleJsonObject2347 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2365 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject2382 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2403 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonObject2417 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2434 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject2451 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2472 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonObject2487 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJsonObject2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResourceDefinition_in_entryRuleXplatformResourceDefinition2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformResourceDefinition2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_ruleXplatformResourceDefinition2593 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleXplatformResourceDefinition2614 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform2651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePlatform2698 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePlatform2710 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlatform2727 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_27_in_rulePlatform2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleType2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleType2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEnumInstance2947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2964 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumInstance2981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2998 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumInstance3016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance3033 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumInstance3053 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEnumInstance3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance3103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMapInstance3150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3167 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMapInstance3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3201 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleMapInstance3219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3236 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleMapInstance3256 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapInstance3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList3306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStringList3353 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3370 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleStringList3388 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3405 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleStringList3425 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_entryRuleValueType3477 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueType3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueType3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleValueType3561 = new BitSet(new long[]{0x0000000000000002L});

}