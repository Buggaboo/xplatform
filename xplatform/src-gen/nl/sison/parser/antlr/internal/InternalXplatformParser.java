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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_RESTFUL_METHODS", "RULE_ANY_OTHER", "RULE_STRING", "RULE_XPLATFORM_HEADER_PARAMETER", "RULE_JSON_LITERAL_BOOLEAN", "RULE_INT", "RULE_JSON_LITERAL_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'{'", "'}'", "'\\'\\'\\''", "','", "'='", "'boolean'", "'number'", "'string'", "'['", "']'", "'.'"
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:76:1: ruleXplatform returns [EObject current=null] : (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? ) ;
    public final EObject ruleXplatform() throws RecognitionException {
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:79:28: ( (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:3: otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= RULE_RESTFUL_METHODS ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )?
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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleXplatform156); 

                	newLeafNode(otherlv_2, grammarAccess.getXplatformAccess().getColonKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:106:1: ( (lv_method_3_0= RULE_RESTFUL_METHODS ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:107:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:107:1: (lv_method_3_0= RULE_RESTFUL_METHODS )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:108:3: lv_method_3_0= RULE_RESTFUL_METHODS
            {
            lv_method_3_0=(Token)match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatform173); 

            			newLeafNode(lv_method_3_0, grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"method",
                    		lv_method_3_0, 
                    		"RESTFUL_METHODS");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXplatform190); 

                	newLeafNode(otherlv_4, grammarAccess.getXplatformAccess().getFromKeyword_4());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:128:1: ( (lv_uri_5_0= ruleURI ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:129:1: (lv_uri_5_0= ruleURI )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:129:1: (lv_uri_5_0= ruleURI )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:130:3: lv_uri_5_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleXplatform211);
            lv_uri_5_0=ruleURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_5_0, 
                    		"URI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:146:2: (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:146:4: otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleXplatformHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )?
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleXplatform224); 

                        	newLeafNode(otherlv_6, grammarAccess.getXplatformAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleXplatform236); 

                        	newLeafNode(otherlv_7, grammarAccess.getXplatformAccess().getHeadersKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleXplatform248); 

                        	newLeafNode(otherlv_8, grammarAccess.getXplatformAccess().getFromKeyword_6_2());
                        
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleXplatform260); 

                        	newLeafNode(otherlv_9, grammarAccess.getXplatformAccess().getRequestKeyword_6_3());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:162:1: ( (lv_requestHeaders_10_0= ruleXplatformHeader ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:163:1: (lv_requestHeaders_10_0= ruleXplatformHeader )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:163:1: (lv_requestHeaders_10_0= ruleXplatformHeader )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:3: lv_requestHeaders_10_0= ruleXplatformHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_6_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatform281);
                    lv_requestHeaders_10_0=ruleXplatformHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                    	        }
                           		set(
                           			current, 
                           			"requestHeaders",
                            		lv_requestHeaders_10_0, 
                            		"XplatformHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:180:2: (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==21) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:180:4: otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleXplatformHeader ) )
                            {
                            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleXplatform294); 

                                	newLeafNode(otherlv_11, grammarAccess.getXplatformAccess().getAndKeyword_6_5_0());
                                
                            otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleXplatform306); 

                                	newLeafNode(otherlv_12, grammarAccess.getXplatformAccess().getResponseKeyword_6_5_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:188:1: ( (lv_responseHeaders_13_0= ruleXplatformHeader ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:189:1: (lv_responseHeaders_13_0= ruleXplatformHeader )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:189:1: (lv_responseHeaders_13_0= ruleXplatformHeader )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:190:3: lv_responseHeaders_13_0= ruleXplatformHeader
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_6_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatform327);
                            lv_responseHeaders_13_0=ruleXplatformHeader();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:206:6: (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:206:8: otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleXplatformJson ) ) (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )?
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleXplatform344); 

                        	newLeafNode(otherlv_14, grammarAccess.getXplatformAccess().getClientKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleXplatform356); 

                        	newLeafNode(otherlv_15, grammarAccess.getXplatformAccess().getExpectsKeyword_7_1());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:214:1: ( (lv_jsonToClient_16_0= ruleXplatformJson ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:215:1: (lv_jsonToClient_16_0= ruleXplatformJson )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:215:1: (lv_jsonToClient_16_0= ruleXplatformJson )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:216:3: lv_jsonToClient_16_0= ruleXplatformJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatform377);
                    lv_jsonToClient_16_0=ruleXplatformJson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                    	        }
                           		set(
                           			current, 
                           			"jsonToClient",
                            		lv_jsonToClient_16_0, 
                            		"XplatformJson");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:232:2: (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==25) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:232:4: otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleXplatformJson ) )
                            {
                            otherlv_17=(Token)match(input,25,FOLLOW_25_in_ruleXplatform390); 

                                	newLeafNode(otherlv_17, grammarAccess.getXplatformAccess().getServerKeyword_7_3_0());
                                
                            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleXplatform402); 

                                	newLeafNode(otherlv_18, grammarAccess.getXplatformAccess().getExpectsKeyword_7_3_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:240:1: ( (lv_jsonToServer_19_0= ruleXplatformJson ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:241:1: (lv_jsonToServer_19_0= ruleXplatformJson )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:241:1: (lv_jsonToServer_19_0= ruleXplatformJson )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:242:3: lv_jsonToServer_19_0= ruleXplatformJson
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_7_3_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatform423);
                            lv_jsonToServer_19_0=ruleXplatformJson();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
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
    // $ANTLR end "ruleXplatform"


    // $ANTLR start "entryRuleURI"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:266:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:267:2: (iv_ruleURI= ruleURI EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:268:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI463);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI473); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:275:1: ruleURI returns [EObject current=null] : ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_0=null;
        Token otherlv_1=null;
        Token lv_uriParameter_2_0=null;
        Token otherlv_3=null;
        Token this_ANY_OTHER_4=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:278:28: ( ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:279:3: this_ANY_OTHER_0= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI510); 
            	     
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:283:3: (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:283:5: otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )*
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleURI524); 

                        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:287:1: ( (lv_uriParameter_2_0= RULE_ID ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:288:1: (lv_uriParameter_2_0= RULE_ID )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:288:1: (lv_uriParameter_2_0= RULE_ID )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:289:3: lv_uriParameter_2_0= RULE_ID
                    {
                    lv_uriParameter_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI541); 

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

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleURI558); 

                        	newLeafNode(otherlv_3, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:309:1: (this_ANY_OTHER_4= RULE_ANY_OTHER )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ANY_OTHER) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:309:2: this_ANY_OTHER_4= RULE_ANY_OTHER
                    	    {
                    	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI570); 
                    	     
                    	        newLeafNode(this_ANY_OTHER_4, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:321:1: entryRuleXplatformHeader returns [EObject current=null] : iv_ruleXplatformHeader= ruleXplatformHeader EOF ;
    public final EObject entryRuleXplatformHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeader = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:322:2: (iv_ruleXplatformHeader= ruleXplatformHeader EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:323:2: iv_ruleXplatformHeader= ruleXplatformHeader EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderRule()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader609);
            iv_ruleXplatformHeader=ruleXplatformHeader();

            state._fsp--;

             current =iv_ruleXplatformHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeader619); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:330:1: ruleXplatformHeader returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:333:28: ( (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:334:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:334:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:334:3: otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader656); 

                	newLeafNode(otherlv_0, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleXplatformHeader668); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:342:1: ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:343:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:343:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:344:3: lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader689);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:360:2: (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_STRING) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:360:4: otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXplatformHeader702); 

            	        	newLeafNode(otherlv_3, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:364:1: ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:365:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:365:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:366:3: lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader723);
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
            	    break loop8;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:382:4: (otherlv_5= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:382:6: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleXplatformHeader738); 

                        	newLeafNode(otherlv_5, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXplatformHeader752); 

                	newLeafNode(otherlv_6, grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader764); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:402:1: entryRuleXplatformHeaderKeyValuePair returns [EObject current=null] : iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF ;
    public final EObject entryRuleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeaderKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:403:2: (iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:404:2: iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair800);
            iv_ruleXplatformHeaderKeyValuePair=ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleXplatformHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair810); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:411:1: ruleXplatformHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) ;
    public final EObject ruleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:414:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:415:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:415:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:415:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:415:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:416:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:416:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:417:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair852); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleXplatformHeaderKeyValuePair869); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:437:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:437:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:437:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:438:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:438:1: (lv_value_2_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:439:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair887); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:456:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:456:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:457:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:457:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:458:3: lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER
                    {
                    lv_value_3_0=(Token)match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair915); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:482:1: entryRuleXplatformJson returns [EObject current=null] : iv_ruleXplatformJson= ruleXplatformJson EOF ;
    public final EObject entryRuleXplatformJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformJson = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:483:2: (iv_ruleXplatformJson= ruleXplatformJson EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:484:2: iv_ruleXplatformJson= ruleXplatformJson EOF
            {
             newCompositeNode(grammarAccess.getXplatformJsonRule()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson957);
            iv_ruleXplatformJson=ruleXplatformJson();

            state._fsp--;

             current =iv_ruleXplatformJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformJson967); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:491:1: ruleXplatformJson returns [EObject current=null] : ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) ) ;
    public final EObject ruleXplatformJson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_metaType_2_0 = null;

        EObject lv_composite_3_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:494:28: ( ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:495:4: otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleXplatformJson1005); 

                        	newLeafNode(otherlv_0, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:499:1: ( (lv_type_1_0= ruleJsonType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:500:1: (lv_type_1_0= ruleJsonType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:500:1: (lv_type_1_0= ruleJsonType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:501:3: lv_type_1_0= ruleJsonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonType_in_ruleXplatformJson1026);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:518:6: ( (lv_metaType_2_0= ruleJsonMetaType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:518:6: ( (lv_metaType_2_0= ruleJsonMetaType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:519:1: (lv_metaType_2_0= ruleJsonMetaType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:519:1: (lv_metaType_2_0= ruleJsonMetaType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:520:3: lv_metaType_2_0= ruleJsonMetaType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1054);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:537:6: ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:537:6: ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:537:7: ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\''
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:537:7: ( (lv_composite_3_0= ruleJsonObject ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:538:1: (lv_composite_3_0= ruleJsonObject )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:538:1: (lv_composite_3_0= ruleJsonObject )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:539:3: lv_composite_3_0= ruleJsonObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleXplatformJson1082);
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

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXplatformJson1094); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:567:1: entryRuleJsonMetaScalarType returns [String current=null] : iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF ;
    public final String entryRuleJsonMetaScalarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonMetaScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:568:2: (iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:569:2: iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1132);
            iv_ruleJsonMetaScalarType=ruleJsonMetaScalarType();

            state._fsp--;

             current =iv_ruleJsonMetaScalarType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaScalarType1143); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:576:1: ruleJsonMetaScalarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'number' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleJsonMetaScalarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:579:28: ( (kw= 'boolean' | kw= 'number' | kw= 'string' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:580:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:580:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:581:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleJsonMetaScalarType1181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:588:2: kw= 'number'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleJsonMetaScalarType1200); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:595:2: kw= 'string'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleJsonMetaScalarType1219); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:608:1: entryRuleJsonMetaArray returns [EObject current=null] : iv_ruleJsonMetaArray= ruleJsonMetaArray EOF ;
    public final EObject entryRuleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:609:2: (iv_ruleJsonMetaArray= ruleJsonMetaArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:610:2: iv_ruleJsonMetaArray= ruleJsonMetaArray EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaArrayRule()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1259);
            iv_ruleJsonMetaArray=ruleJsonMetaArray();

            state._fsp--;

             current =iv_ruleJsonMetaArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaArray1269); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:617:1: ruleJsonMetaArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) ;
    public final EObject ruleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaType_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:620:28: ( (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:621:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:621:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:621:3: otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleJsonMetaArray1306); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:625:1: ( (lv_metaType_1_0= ruleJsonMetaType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:626:1: (lv_metaType_1_0= ruleJsonMetaType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:626:1: (lv_metaType_1_0= ruleJsonMetaType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:627:3: lv_metaType_1_0= ruleJsonMetaType
            {
             
            	        newCompositeNode(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1327);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonMetaArray1339); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:655:1: entryRuleJsonMetaType returns [EObject current=null] : iv_ruleJsonMetaType= ruleJsonMetaType EOF ;
    public final EObject entryRuleJsonMetaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:656:2: (iv_ruleJsonMetaType= ruleJsonMetaType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:657:2: iv_ruleJsonMetaType= ruleJsonMetaType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1375);
            iv_ruleJsonMetaType=ruleJsonMetaType();

            state._fsp--;

             current =iv_ruleJsonMetaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaType1385); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:664:1: ruleJsonMetaType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) ;
    public final EObject ruleJsonMetaType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:667:28: ( ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:668:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:668:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=31 && LA13_0<=33)) ) {
                alt13=1;
            }
            else if ( (LA13_0==34) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:668:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:668:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:669:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:669:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:670:3: lv_scalar_0_0= ruleJsonMetaScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1431);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:687:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:687:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:688:1: (lv_composite_1_0= ruleJsonMetaArray )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:688:1: (lv_composite_1_0= ruleJsonMetaArray )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:689:3: lv_composite_1_0= ruleJsonMetaArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1458);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:713:1: entryRuleJsonCompositeType returns [EObject current=null] : iv_ruleJsonCompositeType= ruleJsonCompositeType EOF ;
    public final EObject entryRuleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:714:2: (iv_ruleJsonCompositeType= ruleJsonCompositeType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:715:2: iv_ruleJsonCompositeType= ruleJsonCompositeType EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeTypeRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1494);
            iv_ruleJsonCompositeType=ruleJsonCompositeType();

            state._fsp--;

             current =iv_ruleJsonCompositeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeType1504); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:722:1: ruleJsonCompositeType returns [EObject current=null] : ( (lv_composite_0_0= ruleJsonArray ) ) ;
    public final EObject ruleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject lv_composite_0_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:725:28: ( ( (lv_composite_0_0= ruleJsonArray ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:726:1: ( (lv_composite_0_0= ruleJsonArray ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:726:1: ( (lv_composite_0_0= ruleJsonArray ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:1: (lv_composite_0_0= ruleJsonArray )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:727:1: (lv_composite_0_0= ruleJsonArray )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:728:3: lv_composite_0_0= ruleJsonArray
            {
             
            	        newCompositeNode(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1549);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:752:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:753:2: (iv_ruleJsonType= ruleJsonType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:754:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType1584);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType1594); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:761:1: ruleJsonType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        EObject lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:764:28: ( ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:765:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:765:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||(LA14_0>=RULE_JSON_LITERAL_BOOLEAN && LA14_0<=RULE_JSON_LITERAL_NULL)) ) {
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:765:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:765:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:766:1: (lv_scalar_0_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:766:1: (lv_scalar_0_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:767:3: lv_scalar_0_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonType1640);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:784:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:784:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:785:1: (lv_composite_1_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:785:1: (lv_composite_1_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:786:3: lv_composite_1_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonType1667);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:810:1: entryRuleJsonScalarType returns [EObject current=null] : iv_ruleJsonScalarType= ruleJsonScalarType EOF ;
    public final EObject entryRuleJsonScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:811:2: (iv_ruleJsonScalarType= ruleJsonScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:812:2: iv_ruleJsonScalarType= ruleJsonScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1703);
            iv_ruleJsonScalarType=ruleJsonScalarType();

            state._fsp--;

             current =iv_ruleJsonScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonScalarType1713); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:819:1: ruleJsonScalarType returns [EObject current=null] : ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:822:28: ( ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:823:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:824:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:824:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:825:3: lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN
                    {
                    lv_bool_0_0=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1755); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:843:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:843:1: (lv_string_1_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:844:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonScalarType1783); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:861:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:861:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:861:7: ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )?
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:861:7: ( (lv_number_2_0= RULE_INT ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:862:1: (lv_number_2_0= RULE_INT )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:862:1: (lv_number_2_0= RULE_INT )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:863:3: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1812); 

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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:879:2: (otherlv_3= '.' this_INT_4= RULE_INT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==36) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:879:4: otherlv_3= '.' this_INT_4= RULE_INT
                            {
                            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleJsonScalarType1830); 

                                	newLeafNode(otherlv_3, grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0());
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1841); 
                             
                                newLeafNode(this_INT_4, grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:888:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:888:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:889:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:889:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:890:3: lv_null_5_0= RULE_JSON_LITERAL_NULL
                    {
                    lv_null_5_0=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1866); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:914:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:915:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:916:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray1907);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray1917); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:923:1: ruleJsonArray returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:926:28: ( ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:927:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:927:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==34) ) {
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:927:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:927:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:927:4: otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray1955); 

                        	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:931:1: ( (lv_elements_1_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:932:1: (lv_elements_1_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:932:1: (lv_elements_1_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:933:3: lv_elements_1_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray1976);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:949:2: (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==29) ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1==RULE_STRING||(LA17_1>=RULE_JSON_LITERAL_BOOLEAN && LA17_1<=RULE_JSON_LITERAL_NULL)) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:949:4: otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray1989); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:953:1: ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:954:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:954:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:955:3: lv_elements_3_0= ruleJsonScalarType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray2010);
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
                    	    break loop17;
                        }
                    } while (true);

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:971:4: (otherlv_4= ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:971:6: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2025); 

                                	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2039); 

                        	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:980:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:980:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:980:8: otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray2059); 

                        	newLeafNode(otherlv_6, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:984:1: ( (lv_composites_7_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:1: (lv_composites_7_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:985:1: (lv_composites_7_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:986:3: lv_composites_7_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2080);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1002:2: (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==29) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==34) ) {
                                alt19=1;
                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1002:4: otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2093); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1006:1: ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1007:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1007:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1008:3: lv_composites_9_0= ruleJsonCompositeType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2114);
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
                    	    break loop19;
                        }
                    } while (true);

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1024:4: (otherlv_10= ',' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==29) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1024:6: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2129); 

                                	newLeafNode(otherlv_10, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2143); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1040:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1041:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1042:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject2180);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject2190); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1049:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) ) (otherlv_8= ',' )? otherlv_9= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1052:28: ( (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) ) (otherlv_8= ',' )? otherlv_9= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1053:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) ) (otherlv_8= ',' )? otherlv_9= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1053:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) ) (otherlv_8= ',' )? otherlv_9= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1053:3: otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) ) (otherlv_8= ',' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleJsonObject2227); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1057:1: ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1057:2: ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1057:2: ( (lv_keys_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1058:1: (lv_keys_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1058:1: (lv_keys_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1059:3: lv_keys_1_0= RULE_STRING
            {
            lv_keys_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2245); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject2262); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getColonKeyword_1_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1079:1: ( (lv_values_3_0= ruleXplatformJson ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1080:1: (lv_values_3_0= ruleXplatformJson )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1080:1: (lv_values_3_0= ruleXplatformJson )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1081:3: lv_values_3_0= ruleXplatformJson
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2283);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1097:3: (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1097:5: otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) )
            {
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleJsonObject2297); 

                	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1101:1: ( (lv_keys_5_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1102:1: (lv_keys_5_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1102:1: (lv_keys_5_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1103:3: lv_keys_5_0= RULE_STRING
            {
            lv_keys_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2314); 

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

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject2331); 

                	newLeafNode(otherlv_6, grammarAccess.getJsonObjectAccess().getColonKeyword_2_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1123:1: ( (lv_values_7_0= ruleXplatformJson ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1124:1: (lv_values_7_0= ruleXplatformJson )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1124:1: (lv_values_7_0= ruleXplatformJson )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1125:3: lv_values_7_0= ruleXplatformJson
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2352);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1141:3: (otherlv_8= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1141:5: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleJsonObject2366); 

                        	newLeafNode(otherlv_8, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleJsonObject2380); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleXplatform_in_entryRuleXplatform75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatform85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXplatform122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatform139 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXplatform156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatform173 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXplatform190 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleURI_in_ruleXplatform211 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_18_in_ruleXplatform224 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXplatform236 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXplatform248 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXplatform260 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatform281 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_21_in_ruleXplatform294 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXplatform306 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatform327 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXplatform344 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatform356 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatform377 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleXplatform390 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatform402 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatform423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI510 = new BitSet(new long[]{0x0000000004000042L});
    public static final BitSet FOLLOW_26_in_ruleURI524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI541 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleURI558 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI570 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader656 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXplatformHeader668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader689 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleXplatformHeader702 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader723 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleXplatformHeader738 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXplatformHeader752 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair852 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformHeaderKeyValuePair869 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXplatformJson1005 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleXplatformJson1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleXplatformJson1082 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformJson1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaScalarType1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJsonMetaScalarType1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleJsonMetaScalarType1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJsonMetaScalarType1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaArray1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonMetaArray1306 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1327 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonMetaArray1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaType1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeType1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonType1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonType1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonScalarType1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonScalarType1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1812 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJsonScalarType1830 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray1907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray1955 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray1976 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray1989 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray2010 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2025 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray2059 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2080 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2093 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2114 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2129 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject2180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleJsonObject2227 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2245 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject2262 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2283 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonObject2297 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2314 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject2331 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2352 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonObject2366 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJsonObject2380 = new BitSet(new long[]{0x0000000000000002L});

}