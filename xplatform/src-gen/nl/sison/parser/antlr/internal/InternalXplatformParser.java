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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_ANY_OTHER", "RULE_STRING", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_INT", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'call'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'{'", "'}'", "'\\'\\'\\''", "','", "'='", "'boolean'", "'number'", "'string'", "'['", "']'", "'.'", "':'"
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
    public static final int RULE_JSON_LITERAL_NULL=11;
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:76:1: ruleXplatform returns [EObject current=null] : (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= RULE_RESTFUL_METHODS ) ) otherlv_3= 'from' ( (lv_uri_4_0= ruleURI ) ) (otherlv_5= 'with' otherlv_6= 'headers' otherlv_7= 'from' otherlv_8= 'request' ( (lv_requestHeaders_9_0= ruleXplatformHeader ) ) (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )? )? (otherlv_13= 'client' otherlv_14= 'expects' ( (lv_jsonToClient_15_0= ruleXplatformJson ) ) (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )? )? ) ;
    public final EObject ruleXplatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_method_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_uri_4_0 = null;

        EObject lv_requestHeaders_9_0 = null;

        EObject lv_responseHeaders_12_0 = null;

        EObject lv_jsonToClient_15_0 = null;

        EObject lv_jsonToServer_18_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:79:28: ( (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= RULE_RESTFUL_METHODS ) ) otherlv_3= 'from' ( (lv_uri_4_0= ruleURI ) ) (otherlv_5= 'with' otherlv_6= 'headers' otherlv_7= 'from' otherlv_8= 'request' ( (lv_requestHeaders_9_0= ruleXplatformHeader ) ) (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )? )? (otherlv_13= 'client' otherlv_14= 'expects' ( (lv_jsonToClient_15_0= ruleXplatformJson ) ) (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )? )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= RULE_RESTFUL_METHODS ) ) otherlv_3= 'from' ( (lv_uri_4_0= ruleURI ) ) (otherlv_5= 'with' otherlv_6= 'headers' otherlv_7= 'from' otherlv_8= 'request' ( (lv_requestHeaders_9_0= ruleXplatformHeader ) ) (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )? )? (otherlv_13= 'client' otherlv_14= 'expects' ( (lv_jsonToClient_15_0= ruleXplatformJson ) ) (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )? )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= RULE_RESTFUL_METHODS ) ) otherlv_3= 'from' ( (lv_uri_4_0= ruleURI ) ) (otherlv_5= 'with' otherlv_6= 'headers' otherlv_7= 'from' otherlv_8= 'request' ( (lv_requestHeaders_9_0= ruleXplatformHeader ) ) (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )? )? (otherlv_13= 'client' otherlv_14= 'expects' ( (lv_jsonToClient_15_0= ruleXplatformJson ) ) (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )? )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:3: otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) ( (lv_method_2_0= RULE_RESTFUL_METHODS ) ) otherlv_3= 'from' ( (lv_uri_4_0= ruleURI ) ) (otherlv_5= 'with' otherlv_6= 'headers' otherlv_7= 'from' otherlv_8= 'request' ( (lv_requestHeaders_9_0= ruleXplatformHeader ) ) (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )? )? (otherlv_13= 'client' otherlv_14= 'expects' ( (lv_jsonToClient_15_0= ruleXplatformJson ) ) (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )? )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleXplatform122); 

                	newLeafNode(otherlv_0, grammarAccess.getXplatformAccess().getCallKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:85:1: (lv_name_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXplatform139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:102:2: ( (lv_method_2_0= RULE_RESTFUL_METHODS ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:103:1: (lv_method_2_0= RULE_RESTFUL_METHODS )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:103:1: (lv_method_2_0= RULE_RESTFUL_METHODS )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:104:3: lv_method_2_0= RULE_RESTFUL_METHODS
            {
            lv_method_2_0=(Token)match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatform161); 

            			newLeafNode(lv_method_2_0, grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"method",
                    		lv_method_2_0, 
                    		"RESTFUL_METHODS");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXplatform178); 

                	newLeafNode(otherlv_3, grammarAccess.getXplatformAccess().getFromKeyword_3());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:124:1: ( (lv_uri_4_0= ruleURI ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:125:1: (lv_uri_4_0= ruleURI )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:125:1: (lv_uri_4_0= ruleURI )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:126:3: lv_uri_4_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleXplatform199);
            lv_uri_4_0=ruleURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_4_0, 
                    		"URI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:142:2: (otherlv_5= 'with' otherlv_6= 'headers' otherlv_7= 'from' otherlv_8= 'request' ( (lv_requestHeaders_9_0= ruleXplatformHeader ) ) (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:142:4: otherlv_5= 'with' otherlv_6= 'headers' otherlv_7= 'from' otherlv_8= 'request' ( (lv_requestHeaders_9_0= ruleXplatformHeader ) ) (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )?
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXplatform212); 

                        	newLeafNode(otherlv_5, grammarAccess.getXplatformAccess().getWithKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXplatform224); 

                        	newLeafNode(otherlv_6, grammarAccess.getXplatformAccess().getHeadersKeyword_5_1());
                        
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleXplatform236); 

                        	newLeafNode(otherlv_7, grammarAccess.getXplatformAccess().getFromKeyword_5_2());
                        
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleXplatform248); 

                        	newLeafNode(otherlv_8, grammarAccess.getXplatformAccess().getRequestKeyword_5_3());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:158:1: ( (lv_requestHeaders_9_0= ruleXplatformHeader ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:159:1: (lv_requestHeaders_9_0= ruleXplatformHeader )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:159:1: (lv_requestHeaders_9_0= ruleXplatformHeader )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:160:3: lv_requestHeaders_9_0= ruleXplatformHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_5_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatform269);
                    lv_requestHeaders_9_0=ruleXplatformHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                    	        }
                           		set(
                           			current, 
                           			"requestHeaders",
                            		lv_requestHeaders_9_0, 
                            		"XplatformHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:176:2: (otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==20) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:176:4: otherlv_10= 'and' otherlv_11= 'response' ( (lv_responseHeaders_12_0= ruleXplatformHeader ) )
                            {
                            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleXplatform282); 

                                	newLeafNode(otherlv_10, grammarAccess.getXplatformAccess().getAndKeyword_5_5_0());
                                
                            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleXplatform294); 

                                	newLeafNode(otherlv_11, grammarAccess.getXplatformAccess().getResponseKeyword_5_5_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:184:1: ( (lv_responseHeaders_12_0= ruleXplatformHeader ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:185:1: (lv_responseHeaders_12_0= ruleXplatformHeader )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:185:1: (lv_responseHeaders_12_0= ruleXplatformHeader )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:186:3: lv_responseHeaders_12_0= ruleXplatformHeader
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_5_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatform315);
                            lv_responseHeaders_12_0=ruleXplatformHeader();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"responseHeaders",
                                    		lv_responseHeaders_12_0, 
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:202:6: (otherlv_13= 'client' otherlv_14= 'expects' ( (lv_jsonToClient_15_0= ruleXplatformJson ) ) (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:202:8: otherlv_13= 'client' otherlv_14= 'expects' ( (lv_jsonToClient_15_0= ruleXplatformJson ) ) (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )?
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleXplatform332); 

                        	newLeafNode(otherlv_13, grammarAccess.getXplatformAccess().getClientKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleXplatform344); 

                        	newLeafNode(otherlv_14, grammarAccess.getXplatformAccess().getExpectsKeyword_6_1());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:210:1: ( (lv_jsonToClient_15_0= ruleXplatformJson ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:211:1: (lv_jsonToClient_15_0= ruleXplatformJson )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:211:1: (lv_jsonToClient_15_0= ruleXplatformJson )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:212:3: lv_jsonToClient_15_0= ruleXplatformJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatform365);
                    lv_jsonToClient_15_0=ruleXplatformJson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                    	        }
                           		set(
                           			current, 
                           			"jsonToClient",
                            		lv_jsonToClient_15_0, 
                            		"XplatformJson");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:228:2: (otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==24) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:228:4: otherlv_16= 'server' otherlv_17= 'expects' ( (lv_jsonToServer_18_0= ruleXplatformJson ) )
                            {
                            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleXplatform378); 

                                	newLeafNode(otherlv_16, grammarAccess.getXplatformAccess().getServerKeyword_6_3_0());
                                
                            otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleXplatform390); 

                                	newLeafNode(otherlv_17, grammarAccess.getXplatformAccess().getExpectsKeyword_6_3_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:236:1: ( (lv_jsonToServer_18_0= ruleXplatformJson ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:237:1: (lv_jsonToServer_18_0= ruleXplatformJson )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:237:1: (lv_jsonToServer_18_0= ruleXplatformJson )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:238:3: lv_jsonToServer_18_0= ruleXplatformJson
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_6_3_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatform411);
                            lv_jsonToServer_18_0=ruleXplatformJson();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"jsonToServer",
                                    		lv_jsonToServer_18_0, 
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
    // $ANTLR end "ruleXplatform"


    // $ANTLR start "entryRuleURI"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:262:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:263:2: (iv_ruleURI= ruleURI EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:264:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI451);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI461); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:271:1: ruleURI returns [EObject current=null] : ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_0=null;
        Token otherlv_1=null;
        Token lv_uriParameter_2_0=null;
        Token otherlv_3=null;
        Token this_ANY_OTHER_4=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:274:28: ( ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:275:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:275:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )* )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:275:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )*
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:275:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ANY_OTHER) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:275:3: this_ANY_OTHER_0= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI498); 
            	     
            	        newLeafNode(this_ANY_OTHER_0, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:3: (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:5: otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )*
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleURI512); 

            	        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:283:1: ( (lv_uriParameter_2_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:284:1: (lv_uriParameter_2_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:284:1: (lv_uriParameter_2_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:285:3: lv_uriParameter_2_0= RULE_ID
            	    {
            	    lv_uriParameter_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI529); 

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

            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleURI546); 

            	        	newLeafNode(otherlv_3, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:305:1: (this_ANY_OTHER_4= RULE_ANY_OTHER )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==RULE_ANY_OTHER) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:305:2: this_ANY_OTHER_4= RULE_ANY_OTHER
            	    	    {
            	    	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI558); 
            	    	     
            	    	        newLeafNode(this_ANY_OTHER_4, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:317:1: entryRuleXplatformHeader returns [EObject current=null] : iv_ruleXplatformHeader= ruleXplatformHeader EOF ;
    public final EObject entryRuleXplatformHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeader = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:318:2: (iv_ruleXplatformHeader= ruleXplatformHeader EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:319:2: iv_ruleXplatformHeader= ruleXplatformHeader EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderRule()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader597);
            iv_ruleXplatformHeader=ruleXplatformHeader();

            state._fsp--;

             current =iv_ruleXplatformHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeader607); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:326:1: ruleXplatformHeader returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_5= ',' )? )* otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:329:28: ( (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_5= ',' )? )* otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:330:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_5= ',' )? )* otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:330:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_5= ',' )? )* otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:330:3: otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_5= ',' )? )* otherlv_6= '}' otherlv_7= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXplatformHeader644); 

                	newLeafNode(otherlv_0, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleXplatformHeader656); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:338:1: ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:339:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:339:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:340:3: lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader677);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:356:2: (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_5= ',' )? )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:356:4: otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader690); 

            	        	newLeafNode(otherlv_3, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:360:1: ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:361:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:361:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:362:3: lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader711);
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

            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:378:2: (otherlv_5= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==28) ) {
            	        int LA8_1 = input.LA(2);

            	        if ( (LA8_1==26||LA8_1==28) ) {
            	            alt8=1;
            	        }
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:378:4: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader724); 

            	                	newLeafNode(otherlv_5, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_2());
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleXplatformHeader740); 

                	newLeafNode(otherlv_6, grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXplatformHeader752); 

                	newLeafNode(otherlv_7, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_5());
                

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:398:1: entryRuleXplatformHeaderKeyValuePair returns [EObject current=null] : iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF ;
    public final EObject entryRuleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeaderKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:399:2: (iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:400:2: iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair788);
            iv_ruleXplatformHeaderKeyValuePair=ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleXplatformHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair798); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:407:1: ruleXplatformHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) ;
    public final EObject ruleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:410:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:411:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:411:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:411:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:411:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:412:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:412:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:413:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair840); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleXplatformHeaderKeyValuePair857); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:433:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_XPLATFORM_HEADER_PARAMETER) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:433:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:433:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:434:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:434:1: (lv_value_2_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:435:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair875); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:452:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:452:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:453:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:453:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:454:3: lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER
                    {
                    lv_value_3_0=(Token)match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair903); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:478:1: entryRuleXplatformJson returns [EObject current=null] : iv_ruleXplatformJson= ruleXplatformJson EOF ;
    public final EObject entryRuleXplatformJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformJson = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:479:2: (iv_ruleXplatformJson= ruleXplatformJson EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:480:2: iv_ruleXplatformJson= ruleXplatformJson EOF
            {
             newCompositeNode(grammarAccess.getXplatformJsonRule()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson945);
            iv_ruleXplatformJson=ruleXplatformJson();

            state._fsp--;

             current =iv_ruleXplatformJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformJson955); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:487:1: ruleXplatformJson returns [EObject current=null] : ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( ( (lv_metaType_2_0= ruleJsonMetaType ) ) otherlv_3= '\\'\\'\\'' ) ) ;
    public final EObject ruleXplatformJson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_metaType_2_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:490:28: ( ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( ( (lv_metaType_2_0= ruleJsonMetaType ) ) otherlv_3= '\\'\\'\\'' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:491:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( ( (lv_metaType_2_0= ruleJsonMetaType ) ) otherlv_3= '\\'\\'\\'' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:491:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( ( (lv_metaType_2_0= ruleJsonMetaType ) ) otherlv_3= '\\'\\'\\'' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=30 && LA11_0<=33)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:491:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:491:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:491:4: otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) )
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleXplatformJson993); 

                        	newLeafNode(otherlv_0, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:1: ( (lv_type_1_0= ruleJsonType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:496:1: (lv_type_1_0= ruleJsonType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:496:1: (lv_type_1_0= ruleJsonType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:497:3: lv_type_1_0= ruleJsonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonType_in_ruleXplatformJson1014);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:514:6: ( ( (lv_metaType_2_0= ruleJsonMetaType ) ) otherlv_3= '\\'\\'\\'' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:514:6: ( ( (lv_metaType_2_0= ruleJsonMetaType ) ) otherlv_3= '\\'\\'\\'' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:514:7: ( (lv_metaType_2_0= ruleJsonMetaType ) ) otherlv_3= '\\'\\'\\''
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:514:7: ( (lv_metaType_2_0= ruleJsonMetaType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:515:1: (lv_metaType_2_0= ruleJsonMetaType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:515:1: (lv_metaType_2_0= ruleJsonMetaType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:516:3: lv_metaType_2_0= ruleJsonMetaType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1043);
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

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleXplatformJson1055); 

                        	newLeafNode(otherlv_3, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_1_1());
                        

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:544:1: entryRuleJsonMetaScalarType returns [String current=null] : iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF ;
    public final String entryRuleJsonMetaScalarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonMetaScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:545:2: (iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:546:2: iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1093);
            iv_ruleJsonMetaScalarType=ruleJsonMetaScalarType();

            state._fsp--;

             current =iv_ruleJsonMetaScalarType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaScalarType1104); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:553:1: ruleJsonMetaScalarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'number' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleJsonMetaScalarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:556:28: ( (kw= 'boolean' | kw= 'number' | kw= 'string' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:557:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:557:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:558:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleJsonMetaScalarType1142); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:565:2: kw= 'number'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleJsonMetaScalarType1161); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:572:2: kw= 'string'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleJsonMetaScalarType1180); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:585:1: entryRuleJsonMetaArray returns [EObject current=null] : iv_ruleJsonMetaArray= ruleJsonMetaArray EOF ;
    public final EObject entryRuleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:586:2: (iv_ruleJsonMetaArray= ruleJsonMetaArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:587:2: iv_ruleJsonMetaArray= ruleJsonMetaArray EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaArrayRule()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1220);
            iv_ruleJsonMetaArray=ruleJsonMetaArray();

            state._fsp--;

             current =iv_ruleJsonMetaArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaArray1230); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:594:1: ruleJsonMetaArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) ;
    public final EObject ruleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaType_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:597:28: ( (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:598:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:598:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:598:3: otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleJsonMetaArray1267); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:602:1: ( (lv_metaType_1_0= ruleJsonMetaType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:603:1: (lv_metaType_1_0= ruleJsonMetaType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:603:1: (lv_metaType_1_0= ruleJsonMetaType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:604:3: lv_metaType_1_0= ruleJsonMetaType
            {
             
            	        newCompositeNode(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1288);
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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleJsonMetaArray1300); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:632:1: entryRuleJsonMetaType returns [EObject current=null] : iv_ruleJsonMetaType= ruleJsonMetaType EOF ;
    public final EObject entryRuleJsonMetaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:633:2: (iv_ruleJsonMetaType= ruleJsonMetaType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:634:2: iv_ruleJsonMetaType= ruleJsonMetaType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1336);
            iv_ruleJsonMetaType=ruleJsonMetaType();

            state._fsp--;

             current =iv_ruleJsonMetaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaType1346); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:641:1: ruleJsonMetaType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) ;
    public final EObject ruleJsonMetaType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:644:28: ( ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:645:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:645:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=30 && LA13_0<=32)) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:645:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:645:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:646:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:646:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:647:3: lv_scalar_0_0= ruleJsonMetaScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1392);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:664:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:664:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:665:1: (lv_composite_1_0= ruleJsonMetaArray )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:665:1: (lv_composite_1_0= ruleJsonMetaArray )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:666:3: lv_composite_1_0= ruleJsonMetaArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1419);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:690:1: entryRuleJsonCompositeType returns [EObject current=null] : iv_ruleJsonCompositeType= ruleJsonCompositeType EOF ;
    public final EObject entryRuleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:691:2: (iv_ruleJsonCompositeType= ruleJsonCompositeType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:692:2: iv_ruleJsonCompositeType= ruleJsonCompositeType EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeTypeRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1455);
            iv_ruleJsonCompositeType=ruleJsonCompositeType();

            state._fsp--;

             current =iv_ruleJsonCompositeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeType1465); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:699:1: ruleJsonCompositeType returns [EObject current=null] : ( (lv_composite_0_0= ruleJsonArray ) ) ;
    public final EObject ruleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject lv_composite_0_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:702:28: ( ( (lv_composite_0_0= ruleJsonArray ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:703:1: ( (lv_composite_0_0= ruleJsonArray ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:703:1: ( (lv_composite_0_0= ruleJsonArray ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:704:1: (lv_composite_0_0= ruleJsonArray )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:704:1: (lv_composite_0_0= ruleJsonArray )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:705:3: lv_composite_0_0= ruleJsonArray
            {
             
            	        newCompositeNode(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1510);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:729:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:730:2: (iv_ruleJsonType= ruleJsonType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:731:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType1545);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType1555); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:738:1: ruleJsonType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        EObject lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:741:28: ( ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:742:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:742:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||(LA14_0>=RULE_JSON_LITERAL_BOOLEAN && LA14_0<=RULE_JSON_LITERAL_NULL)) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:742:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:742:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:743:1: (lv_scalar_0_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:743:1: (lv_scalar_0_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:744:3: lv_scalar_0_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonType1601);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:761:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:761:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:762:1: (lv_composite_1_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:762:1: (lv_composite_1_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:763:3: lv_composite_1_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonType1628);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:787:1: entryRuleJsonScalarType returns [EObject current=null] : iv_ruleJsonScalarType= ruleJsonScalarType EOF ;
    public final EObject entryRuleJsonScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:788:2: (iv_ruleJsonScalarType= ruleJsonScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:789:2: iv_ruleJsonScalarType= ruleJsonScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1664);
            iv_ruleJsonScalarType=ruleJsonScalarType();

            state._fsp--;

             current =iv_ruleJsonScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonScalarType1674); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:796:1: ruleJsonScalarType returns [EObject current=null] : ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:799:28: ( ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:800:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:800:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_JSON_LITERAL_BOOLEAN:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case RULE_INT:
                {
                alt16=3;
                }
                break;
            case RULE_JSON_LITERAL_NULL:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:800:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:800:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:801:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:801:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:802:3: lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN
                    {
                    lv_bool_0_0=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1716); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:819:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:819:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:820:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:820:1: (lv_string_1_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:821:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonScalarType1744); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:838:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:838:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:838:7: ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )?
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:838:7: ( (lv_number_2_0= RULE_INT ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:839:1: (lv_number_2_0= RULE_INT )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:839:1: (lv_number_2_0= RULE_INT )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:840:3: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1773); 

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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:856:2: (otherlv_3= '.' this_INT_4= RULE_INT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==35) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:856:4: otherlv_3= '.' this_INT_4= RULE_INT
                            {
                            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleJsonScalarType1791); 

                                	newLeafNode(otherlv_3, grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0());
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1802); 
                             
                                newLeafNode(this_INT_4, grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:865:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:865:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:866:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:866:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:867:3: lv_null_5_0= RULE_JSON_LITERAL_NULL
                    {
                    lv_null_5_0=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1827); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:891:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:892:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:893:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray1868);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray1878); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:900:1: ruleJsonArray returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_element_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )* otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composite_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )* otherlv_11= ']' ) ) ;
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
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;

        EObject lv_composite_7_0 = null;

        EObject lv_composite_9_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:903:28: ( ( (otherlv_0= '[' ( (lv_element_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )* otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composite_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )* otherlv_11= ']' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:904:1: ( (otherlv_0= '[' ( (lv_element_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )* otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composite_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )* otherlv_11= ']' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:904:1: ( (otherlv_0= '[' ( (lv_element_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )* otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composite_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )* otherlv_11= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==33) ) {
                    alt21=2;
                }
                else if ( (LA21_1==RULE_STRING||(LA21_1>=RULE_JSON_LITERAL_BOOLEAN && LA21_1<=RULE_JSON_LITERAL_NULL)) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:904:2: (otherlv_0= '[' ( (lv_element_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )* otherlv_5= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:904:2: (otherlv_0= '[' ( (lv_element_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )* otherlv_5= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:904:4: otherlv_0= '[' ( (lv_element_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )* otherlv_5= ']'
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleJsonArray1916); 

                        	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:908:1: ( (lv_element_1_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:909:1: (lv_element_1_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:909:1: (lv_element_1_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:910:3: lv_element_1_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementJsonScalarTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray1937);
                    lv_element_1_0=ruleJsonScalarType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"element",
                            		lv_element_1_0, 
                            		"JsonScalarType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:926:2: (otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )? )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==28) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:926:4: otherlv_2= ',' ( (lv_element_3_0= ruleJsonScalarType ) ) (otherlv_4= ',' )?
                    	    {
                    	    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleJsonArray1950); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:930:1: ( (lv_element_3_0= ruleJsonScalarType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:931:1: (lv_element_3_0= ruleJsonScalarType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:931:1: (lv_element_3_0= ruleJsonScalarType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:932:3: lv_element_3_0= ruleJsonScalarType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementJsonScalarTypeParserRuleCall_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray1971);
                    	    lv_element_3_0=ruleJsonScalarType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"element",
                    	            		lv_element_3_0, 
                    	            		"JsonScalarType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:948:2: (otherlv_4= ',' )?
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==28) ) {
                    	        int LA17_1 = input.LA(2);

                    	        if ( (LA17_1==28||LA17_1==34) ) {
                    	            alt17=1;
                    	        }
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:948:4: otherlv_4= ','
                    	            {
                    	            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleJsonArray1984); 

                    	                	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray2000); 

                        	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:957:6: (otherlv_6= '[' ( (lv_composite_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:957:6: (otherlv_6= '[' ( (lv_composite_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )* otherlv_11= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:957:8: otherlv_6= '[' ( (lv_composite_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )* otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleJsonArray2020); 

                        	newLeafNode(otherlv_6, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:961:1: ( (lv_composite_7_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:962:1: (lv_composite_7_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:962:1: (lv_composite_7_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:963:3: lv_composite_7_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositeJsonCompositeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2041);
                    lv_composite_7_0=ruleJsonCompositeType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"composite",
                            		lv_composite_7_0, 
                            		"JsonCompositeType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:979:2: (otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )? )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:979:4: otherlv_8= ',' ( (lv_composite_9_0= ruleJsonCompositeType ) ) (otherlv_10= ',' )?
                    	    {
                    	    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleJsonArray2054); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:983:1: ( (lv_composite_9_0= ruleJsonCompositeType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:984:1: (lv_composite_9_0= ruleJsonCompositeType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:984:1: (lv_composite_9_0= ruleJsonCompositeType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:3: lv_composite_9_0= ruleJsonCompositeType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositeJsonCompositeTypeParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2075);
                    	    lv_composite_9_0=ruleJsonCompositeType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"composite",
                    	            		lv_composite_9_0, 
                    	            		"JsonCompositeType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1001:2: (otherlv_10= ',' )?
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( (LA19_0==28) ) {
                    	        int LA19_1 = input.LA(2);

                    	        if ( (LA19_1==28||LA19_1==34) ) {
                    	            alt19=1;
                    	        }
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1001:4: otherlv_10= ','
                    	            {
                    	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleJsonArray2088); 

                    	                	newLeafNode(otherlv_10, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_2());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray2104); 

                        	newLeafNode(otherlv_11, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_1_3());
                        

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


    // $ANTLR start "entryRuleJsonKeyValuePair"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1017:1: entryRuleJsonKeyValuePair returns [EObject current=null] : iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF ;
    public final EObject entryRuleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1018:2: (iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1019:2: iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair2141);
            iv_ruleJsonKeyValuePair=ruleJsonKeyValuePair();

            state._fsp--;

             current =iv_ruleJsonKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair2151); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1026:1: ruleJsonKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonType ) ) ) ;
    public final EObject ruleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1029:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonType ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1030:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonType ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1030:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonType ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1030:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonType ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1030:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1031:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1031:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1032:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair2193); 

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

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJsonKeyValuePair2210); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1052:1: ( (lv_value_2_0= ruleJsonType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1053:1: (lv_value_2_0= ruleJsonType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1053:1: (lv_value_2_0= ruleJsonType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1054:3: lv_value_2_0= ruleJsonType
            {
             
            	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonType_in_ruleJsonKeyValuePair2231);
            lv_value_2_0=ruleJsonType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonKeyValuePairRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"JsonType");
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


    // $ANTLR start "entryRuleJsonMetaKeyValuePair"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1078:1: entryRuleJsonMetaKeyValuePair returns [EObject current=null] : iv_ruleJsonMetaKeyValuePair= ruleJsonMetaKeyValuePair EOF ;
    public final EObject entryRuleJsonMetaKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1079:2: (iv_ruleJsonMetaKeyValuePair= ruleJsonMetaKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1080:2: iv_ruleJsonMetaKeyValuePair= ruleJsonMetaKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonMetaKeyValuePair_in_entryRuleJsonMetaKeyValuePair2267);
            iv_ruleJsonMetaKeyValuePair=ruleJsonMetaKeyValuePair();

            state._fsp--;

             current =iv_ruleJsonMetaKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaKeyValuePair2277); 

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
    // $ANTLR end "entryRuleJsonMetaKeyValuePair"


    // $ANTLR start "ruleJsonMetaKeyValuePair"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1087:1: ruleJsonMetaKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonMetaType ) ) ) ;
    public final EObject ruleJsonMetaKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1090:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonMetaType ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1091:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonMetaType ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1091:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonMetaType ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1091:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonMetaType ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1091:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1092:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1092:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1093:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonMetaKeyValuePair2319); 

            			newLeafNode(lv_key_0_0, grammarAccess.getJsonMetaKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJsonMetaKeyValuePairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleJsonMetaKeyValuePair2336); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonMetaKeyValuePairAccess().getColonKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1113:1: ( (lv_value_2_0= ruleJsonMetaType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1114:1: (lv_value_2_0= ruleJsonMetaType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1114:1: (lv_value_2_0= ruleJsonMetaType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1115:3: lv_value_2_0= ruleJsonMetaType
            {
             
            	        newCompositeNode(grammarAccess.getJsonMetaKeyValuePairAccess().getValueJsonMetaTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonMetaType_in_ruleJsonMetaKeyValuePair2357);
            lv_value_2_0=ruleJsonMetaType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonMetaKeyValuePairRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"JsonMetaType");
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
    // $ANTLR end "ruleJsonMetaKeyValuePair"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXplatform_in_entryRuleXplatform75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatform85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXplatform122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatform139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatform161 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXplatform178 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleURI_in_ruleXplatform199 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_17_in_ruleXplatform212 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleXplatform224 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXplatform236 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXplatform248 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatform269 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_20_in_ruleXplatform282 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleXplatform294 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatform315 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleXplatform332 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXplatform344 = new BitSet(new long[]{0x00000003C8000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatform365 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleXplatform378 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleXplatform390 = new BitSet(new long[]{0x00000003C8000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatform411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI498 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_25_in_ruleURI512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI529 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleURI546 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI558 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXplatformHeader644 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleXplatformHeader656 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader677 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader690 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader711 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader724 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_26_in_ruleXplatformHeader740 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXplatformHeader752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair788 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair840 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleXplatformHeaderKeyValuePair857 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleXplatformJson993 = new BitSet(new long[]{0x0000000200000E80L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleXplatformJson1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1043 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXplatformJson1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaScalarType1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleJsonMetaScalarType1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJsonMetaScalarType1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleJsonMetaScalarType1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaArray1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJsonMetaArray1267 = new BitSet(new long[]{0x00000003C8000000L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1288 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleJsonMetaArray1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaType1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeType1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType1545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonType1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonScalarType1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonScalarType1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1773 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleJsonScalarType1791 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJsonArray1916 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray1937 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_28_in_ruleJsonArray1950 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray1971 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_28_in_ruleJsonArray1984 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJsonArray2020 = new BitSet(new long[]{0x0000000200000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2041 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_28_in_ruleJsonArray2054 = new BitSet(new long[]{0x0000000200000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2075 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_28_in_ruleJsonArray2088 = new BitSet(new long[]{0x0000000410000000L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair2193 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleJsonKeyValuePair2210 = new BitSet(new long[]{0x0000000200000E80L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleJsonKeyValuePair2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaKeyValuePair_in_entryRuleJsonMetaKeyValuePair2267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaKeyValuePair2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonMetaKeyValuePair2319 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleJsonMetaKeyValuePair2336 = new BitSet(new long[]{0x00000003C8000000L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleJsonMetaKeyValuePair2357 = new BitSet(new long[]{0x0000000000000002L});

}