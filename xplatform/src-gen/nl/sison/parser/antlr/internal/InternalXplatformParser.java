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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:76:1: ruleXplatform returns [EObject current=null] : ( ( (lv_resource_0_0= ruleXplatformResource ) ) otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_method_4_0= RULE_RESTFUL_METHODS ) ) otherlv_5= 'from' ( (lv_uri_6_0= ruleURI ) ) (otherlv_7= 'with' otherlv_8= 'headers' otherlv_9= 'from' otherlv_10= 'request' ( (lv_requestHeaders_11_0= ruleXplatformHeader ) ) (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )? )? (otherlv_15= 'client' otherlv_16= 'expects' ( (lv_jsonToClient_17_0= ruleXplatformJson ) ) (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )? )? ) ;
    public final EObject ruleXplatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_method_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_resource_0_0 = null;

        EObject lv_uri_6_0 = null;

        EObject lv_requestHeaders_11_0 = null;

        EObject lv_responseHeaders_14_0 = null;

        EObject lv_jsonToClient_17_0 = null;

        EObject lv_jsonToServer_20_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:79:28: ( ( ( (lv_resource_0_0= ruleXplatformResource ) ) otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_method_4_0= RULE_RESTFUL_METHODS ) ) otherlv_5= 'from' ( (lv_uri_6_0= ruleURI ) ) (otherlv_7= 'with' otherlv_8= 'headers' otherlv_9= 'from' otherlv_10= 'request' ( (lv_requestHeaders_11_0= ruleXplatformHeader ) ) (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )? )? (otherlv_15= 'client' otherlv_16= 'expects' ( (lv_jsonToClient_17_0= ruleXplatformJson ) ) (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )? )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: ( ( (lv_resource_0_0= ruleXplatformResource ) ) otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_method_4_0= RULE_RESTFUL_METHODS ) ) otherlv_5= 'from' ( (lv_uri_6_0= ruleURI ) ) (otherlv_7= 'with' otherlv_8= 'headers' otherlv_9= 'from' otherlv_10= 'request' ( (lv_requestHeaders_11_0= ruleXplatformHeader ) ) (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )? )? (otherlv_15= 'client' otherlv_16= 'expects' ( (lv_jsonToClient_17_0= ruleXplatformJson ) ) (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )? )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:1: ( ( (lv_resource_0_0= ruleXplatformResource ) ) otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_method_4_0= RULE_RESTFUL_METHODS ) ) otherlv_5= 'from' ( (lv_uri_6_0= ruleURI ) ) (otherlv_7= 'with' otherlv_8= 'headers' otherlv_9= 'from' otherlv_10= 'request' ( (lv_requestHeaders_11_0= ruleXplatformHeader ) ) (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )? )? (otherlv_15= 'client' otherlv_16= 'expects' ( (lv_jsonToClient_17_0= ruleXplatformJson ) ) (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )? )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:2: ( (lv_resource_0_0= ruleXplatformResource ) ) otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_method_4_0= RULE_RESTFUL_METHODS ) ) otherlv_5= 'from' ( (lv_uri_6_0= ruleURI ) ) (otherlv_7= 'with' otherlv_8= 'headers' otherlv_9= 'from' otherlv_10= 'request' ( (lv_requestHeaders_11_0= ruleXplatformHeader ) ) (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )? )? (otherlv_15= 'client' otherlv_16= 'expects' ( (lv_jsonToClient_17_0= ruleXplatformJson ) ) (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )? )?
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:80:2: ( (lv_resource_0_0= ruleXplatformResource ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:81:1: (lv_resource_0_0= ruleXplatformResource )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:81:1: (lv_resource_0_0= ruleXplatformResource )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:82:3: lv_resource_0_0= ruleXplatformResource
            {
             
            	        newCompositeNode(grammarAccess.getXplatformAccess().getResourceXplatformResourceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformResource_in_ruleXplatform131);
            lv_resource_0_0=ruleXplatformResource();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	        }
                   		add(
                   			current, 
                   			"resource",
                    		lv_resource_0_0, 
                    		"XplatformResource");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXplatform143); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformAccess().getCallKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:102:1: ( (lv_name_2_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:103:1: (lv_name_2_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:103:1: (lv_name_2_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:104:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXplatform160); 

            			newLeafNode(lv_name_2_0, grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXplatform177); 

                	newLeafNode(otherlv_3, grammarAccess.getXplatformAccess().getColonKeyword_3());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:124:1: ( (lv_method_4_0= RULE_RESTFUL_METHODS ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:125:1: (lv_method_4_0= RULE_RESTFUL_METHODS )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:125:1: (lv_method_4_0= RULE_RESTFUL_METHODS )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:126:3: lv_method_4_0= RULE_RESTFUL_METHODS
            {
            lv_method_4_0=(Token)match(input,RULE_RESTFUL_METHODS,FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatform194); 

            			newLeafNode(lv_method_4_0, grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getXplatformRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"method",
                    		lv_method_4_0, 
                    		"RESTFUL_METHODS");
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleXplatform211); 

                	newLeafNode(otherlv_5, grammarAccess.getXplatformAccess().getFromKeyword_5());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:146:1: ( (lv_uri_6_0= ruleURI ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:147:1: (lv_uri_6_0= ruleURI )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:147:1: (lv_uri_6_0= ruleURI )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:148:3: lv_uri_6_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getXplatformAccess().getUriURIParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleXplatform232);
            lv_uri_6_0=ruleURI();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
            	        }
                   		set(
                   			current, 
                   			"uri",
                    		lv_uri_6_0, 
                    		"URI");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:2: (otherlv_7= 'with' otherlv_8= 'headers' otherlv_9= 'from' otherlv_10= 'request' ( (lv_requestHeaders_11_0= ruleXplatformHeader ) ) (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:164:4: otherlv_7= 'with' otherlv_8= 'headers' otherlv_9= 'from' otherlv_10= 'request' ( (lv_requestHeaders_11_0= ruleXplatformHeader ) ) (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )?
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleXplatform245); 

                        	newLeafNode(otherlv_7, grammarAccess.getXplatformAccess().getWithKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleXplatform257); 

                        	newLeafNode(otherlv_8, grammarAccess.getXplatformAccess().getHeadersKeyword_7_1());
                        
                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleXplatform269); 

                        	newLeafNode(otherlv_9, grammarAccess.getXplatformAccess().getFromKeyword_7_2());
                        
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleXplatform281); 

                        	newLeafNode(otherlv_10, grammarAccess.getXplatformAccess().getRequestKeyword_7_3());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:180:1: ( (lv_requestHeaders_11_0= ruleXplatformHeader ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:181:1: (lv_requestHeaders_11_0= ruleXplatformHeader )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:181:1: (lv_requestHeaders_11_0= ruleXplatformHeader )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:182:3: lv_requestHeaders_11_0= ruleXplatformHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_7_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatform302);
                    lv_requestHeaders_11_0=ruleXplatformHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                    	        }
                           		set(
                           			current, 
                           			"requestHeaders",
                            		lv_requestHeaders_11_0, 
                            		"XplatformHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:198:2: (otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) ) )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==21) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:198:4: otherlv_12= 'and' otherlv_13= 'response' ( (lv_responseHeaders_14_0= ruleXplatformHeader ) )
                            {
                            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleXplatform315); 

                                	newLeafNode(otherlv_12, grammarAccess.getXplatformAccess().getAndKeyword_7_5_0());
                                
                            otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleXplatform327); 

                                	newLeafNode(otherlv_13, grammarAccess.getXplatformAccess().getResponseKeyword_7_5_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:206:1: ( (lv_responseHeaders_14_0= ruleXplatformHeader ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:207:1: (lv_responseHeaders_14_0= ruleXplatformHeader )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:207:1: (lv_responseHeaders_14_0= ruleXplatformHeader )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:208:3: lv_responseHeaders_14_0= ruleXplatformHeader
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_7_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformHeader_in_ruleXplatform348);
                            lv_responseHeaders_14_0=ruleXplatformHeader();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"responseHeaders",
                                    		lv_responseHeaders_14_0, 
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:224:6: (otherlv_15= 'client' otherlv_16= 'expects' ( (lv_jsonToClient_17_0= ruleXplatformJson ) ) (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:224:8: otherlv_15= 'client' otherlv_16= 'expects' ( (lv_jsonToClient_17_0= ruleXplatformJson ) ) (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )?
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleXplatform365); 

                        	newLeafNode(otherlv_15, grammarAccess.getXplatformAccess().getClientKeyword_8_0());
                        
                    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleXplatform377); 

                        	newLeafNode(otherlv_16, grammarAccess.getXplatformAccess().getExpectsKeyword_8_1());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:232:1: ( (lv_jsonToClient_17_0= ruleXplatformJson ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:233:1: (lv_jsonToClient_17_0= ruleXplatformJson )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:233:1: (lv_jsonToClient_17_0= ruleXplatformJson )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:234:3: lv_jsonToClient_17_0= ruleXplatformJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatform398);
                    lv_jsonToClient_17_0=ruleXplatformJson();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                    	        }
                           		set(
                           			current, 
                           			"jsonToClient",
                            		lv_jsonToClient_17_0, 
                            		"XplatformJson");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:250:2: (otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==25) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:250:4: otherlv_18= 'server' otherlv_19= 'expects' ( (lv_jsonToServer_20_0= ruleXplatformJson ) )
                            {
                            otherlv_18=(Token)match(input,25,FOLLOW_25_in_ruleXplatform411); 

                                	newLeafNode(otherlv_18, grammarAccess.getXplatformAccess().getServerKeyword_8_3_0());
                                
                            otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleXplatform423); 

                                	newLeafNode(otherlv_19, grammarAccess.getXplatformAccess().getExpectsKeyword_8_3_1());
                                
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:258:1: ( (lv_jsonToServer_20_0= ruleXplatformJson ) )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:259:1: (lv_jsonToServer_20_0= ruleXplatformJson )
                            {
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:259:1: (lv_jsonToServer_20_0= ruleXplatformJson )
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:260:3: lv_jsonToServer_20_0= ruleXplatformJson
                            {
                             
                            	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_8_3_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleXplatformJson_in_ruleXplatform444);
                            lv_jsonToServer_20_0=ruleXplatformJson();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getXplatformRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"jsonToServer",
                                    		lv_jsonToServer_20_0, 
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:284:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:285:2: (iv_ruleURI= ruleURI EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:286:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI484);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI494); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:293:1: ruleURI returns [EObject current=null] : ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) ;
    public final EObject ruleURI() throws RecognitionException {
        EObject current = null;

        Token this_ANY_OTHER_0=null;
        Token otherlv_1=null;
        Token lv_uriParameter_2_0=null;
        Token otherlv_3=null;
        Token this_ANY_OTHER_4=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:296:28: ( ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:297:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:297:1: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )? )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:297:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+ (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:297:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:297:3: this_ANY_OTHER_0= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI531); 
            	     
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:301:3: (otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:301:5: otherlv_1= '{' ( (lv_uriParameter_2_0= RULE_ID ) ) otherlv_3= '}' (this_ANY_OTHER_4= RULE_ANY_OTHER )*
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleURI545); 

                        	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:305:1: ( (lv_uriParameter_2_0= RULE_ID ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:306:1: (lv_uriParameter_2_0= RULE_ID )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:306:1: (lv_uriParameter_2_0= RULE_ID )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:307:3: lv_uriParameter_2_0= RULE_ID
                    {
                    lv_uriParameter_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI562); 

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

                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleURI579); 

                        	newLeafNode(otherlv_3, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:327:1: (this_ANY_OTHER_4= RULE_ANY_OTHER )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ANY_OTHER) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:327:2: this_ANY_OTHER_4= RULE_ANY_OTHER
                    	    {
                    	    this_ANY_OTHER_4=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleURI591); 
                    	     
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:339:1: entryRuleXplatformHeader returns [EObject current=null] : iv_ruleXplatformHeader= ruleXplatformHeader EOF ;
    public final EObject entryRuleXplatformHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeader = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:340:2: (iv_ruleXplatformHeader= ruleXplatformHeader EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:341:2: iv_ruleXplatformHeader= ruleXplatformHeader EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderRule()); 
            pushFollow(FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader630);
            iv_ruleXplatformHeader=ruleXplatformHeader();

            state._fsp--;

             current =iv_ruleXplatformHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeader640); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:348:1: ruleXplatformHeader returns [EObject current=null] : (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:351:28: ( (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:352:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:352:1: (otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\'' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:352:3: otherlv_0= '\\'\\'\\'' otherlv_1= '{' ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) ) (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )* (otherlv_5= ',' )? otherlv_6= '}' otherlv_7= '\\'\\'\\''
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader677); 

                	newLeafNode(otherlv_0, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleXplatformHeader689); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:360:1: ( (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:361:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:361:1: (lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:362:3: lv_headerKeyValues_2_0= ruleXplatformHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader710);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:378:2: (otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) ) )*
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
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:378:4: otherlv_3= ',' ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleXplatformHeader723); 

            	        	newLeafNode(otherlv_3, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:382:1: ( (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:383:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:383:1: (lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:384:3: lv_headerKeyValues_4_0= ruleXplatformHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader744);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:400:4: (otherlv_5= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:400:6: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleXplatformHeader759); 

                        	newLeafNode(otherlv_5, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_4());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXplatformHeader773); 

                	newLeafNode(otherlv_6, grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleXplatformHeader785); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:420:1: entryRuleXplatformHeaderKeyValuePair returns [EObject current=null] : iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF ;
    public final EObject entryRuleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformHeaderKeyValuePair = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:421:2: (iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:422:2: iv_ruleXplatformHeaderKeyValuePair= ruleXplatformHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getXplatformHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair821);
            iv_ruleXplatformHeaderKeyValuePair=ruleXplatformHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleXplatformHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair831); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:429:1: ruleXplatformHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) ;
    public final EObject ruleXplatformHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:432:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:433:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:433:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:433:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:433:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:434:1: (lv_key_0_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:434:1: (lv_key_0_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:435:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair873); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleXplatformHeaderKeyValuePair890); 

                	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:455:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:455:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:455:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:456:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:456:1: (lv_value_2_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:457:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair908); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:474:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:474:6: ( (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:475:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:475:1: (lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:476:3: lv_value_3_0= RULE_XPLATFORM_HEADER_PARAMETER
                    {
                    lv_value_3_0=(Token)match(input,RULE_XPLATFORM_HEADER_PARAMETER,FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair936); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:500:1: entryRuleXplatformJson returns [EObject current=null] : iv_ruleXplatformJson= ruleXplatformJson EOF ;
    public final EObject entryRuleXplatformJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformJson = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:501:2: (iv_ruleXplatformJson= ruleXplatformJson EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:502:2: iv_ruleXplatformJson= ruleXplatformJson EOF
            {
             newCompositeNode(grammarAccess.getXplatformJsonRule()); 
            pushFollow(FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson978);
            iv_ruleXplatformJson=ruleXplatformJson();

            state._fsp--;

             current =iv_ruleXplatformJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformJson988); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:509:1: ruleXplatformJson returns [EObject current=null] : ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) ) ;
    public final EObject ruleXplatformJson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_metaType_2_0 = null;

        EObject lv_composite_3_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:512:28: ( ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:513:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:513:1: ( (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) ) | ( (lv_metaType_2_0= ruleJsonMetaType ) ) | ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:513:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:513:2: (otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:513:4: otherlv_0= '\\'\\'\\'' ( (lv_type_1_0= ruleJsonType ) )
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleXplatformJson1026); 

                        	newLeafNode(otherlv_0, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:517:1: ( (lv_type_1_0= ruleJsonType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:518:1: (lv_type_1_0= ruleJsonType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:518:1: (lv_type_1_0= ruleJsonType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:519:3: lv_type_1_0= ruleJsonType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonType_in_ruleXplatformJson1047);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:536:6: ( (lv_metaType_2_0= ruleJsonMetaType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:536:6: ( (lv_metaType_2_0= ruleJsonMetaType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:537:1: (lv_metaType_2_0= ruleJsonMetaType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:537:1: (lv_metaType_2_0= ruleJsonMetaType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:538:3: lv_metaType_2_0= ruleJsonMetaType
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1075);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:555:6: ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:555:6: ( ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\'' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:555:7: ( (lv_composite_3_0= ruleJsonObject ) ) otherlv_4= '\\'\\'\\''
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:555:7: ( (lv_composite_3_0= ruleJsonObject ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:556:1: (lv_composite_3_0= ruleJsonObject )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:556:1: (lv_composite_3_0= ruleJsonObject )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:557:3: lv_composite_3_0= ruleJsonObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getCompositeJsonObjectParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleXplatformJson1103);
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

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleXplatformJson1115); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:585:1: entryRuleJsonMetaScalarType returns [String current=null] : iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF ;
    public final String entryRuleJsonMetaScalarType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleJsonMetaScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:586:2: (iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:587:2: iv_ruleJsonMetaScalarType= ruleJsonMetaScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1153);
            iv_ruleJsonMetaScalarType=ruleJsonMetaScalarType();

            state._fsp--;

             current =iv_ruleJsonMetaScalarType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaScalarType1164); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:594:1: ruleJsonMetaScalarType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'number' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleJsonMetaScalarType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:597:28: ( (kw= 'boolean' | kw= 'number' | kw= 'string' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:598:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:598:1: (kw= 'boolean' | kw= 'number' | kw= 'string' )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:599:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleJsonMetaScalarType1202); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:606:2: kw= 'number'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleJsonMetaScalarType1221); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getJsonMetaScalarTypeAccess().getNumberKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:613:2: kw= 'string'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleJsonMetaScalarType1240); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:626:1: entryRuleJsonMetaArray returns [EObject current=null] : iv_ruleJsonMetaArray= ruleJsonMetaArray EOF ;
    public final EObject entryRuleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:627:2: (iv_ruleJsonMetaArray= ruleJsonMetaArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:628:2: iv_ruleJsonMetaArray= ruleJsonMetaArray EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaArrayRule()); 
            pushFollow(FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1280);
            iv_ruleJsonMetaArray=ruleJsonMetaArray();

            state._fsp--;

             current =iv_ruleJsonMetaArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaArray1290); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:635:1: ruleJsonMetaArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) ;
    public final EObject ruleJsonMetaArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_metaType_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:638:28: ( (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:639:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:639:1: (otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:639:3: otherlv_0= '[' ( (lv_metaType_1_0= ruleJsonMetaType ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleJsonMetaArray1327); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:643:1: ( (lv_metaType_1_0= ruleJsonMetaType ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:644:1: (lv_metaType_1_0= ruleJsonMetaType )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:644:1: (lv_metaType_1_0= ruleJsonMetaType )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:645:3: lv_metaType_1_0= ruleJsonMetaType
            {
             
            	        newCompositeNode(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1348);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleJsonMetaArray1360); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:673:1: entryRuleJsonMetaType returns [EObject current=null] : iv_ruleJsonMetaType= ruleJsonMetaType EOF ;
    public final EObject entryRuleJsonMetaType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonMetaType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:674:2: (iv_ruleJsonMetaType= ruleJsonMetaType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:675:2: iv_ruleJsonMetaType= ruleJsonMetaType EOF
            {
             newCompositeNode(grammarAccess.getJsonMetaTypeRule()); 
            pushFollow(FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1396);
            iv_ruleJsonMetaType=ruleJsonMetaType();

            state._fsp--;

             current =iv_ruleJsonMetaType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonMetaType1406); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:682:1: ruleJsonMetaType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) ;
    public final EObject ruleJsonMetaType() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:685:28: ( ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:686:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:686:1: ( ( (lv_scalar_0_0= ruleJsonMetaScalarType ) ) | ( (lv_composite_1_0= ruleJsonMetaArray ) ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:686:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:686:2: ( (lv_scalar_0_0= ruleJsonMetaScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:687:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:687:1: (lv_scalar_0_0= ruleJsonMetaScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:688:3: lv_scalar_0_0= ruleJsonMetaScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getScalarJsonMetaScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1452);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:705:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:705:6: ( (lv_composite_1_0= ruleJsonMetaArray ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:706:1: (lv_composite_1_0= ruleJsonMetaArray )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:706:1: (lv_composite_1_0= ruleJsonMetaArray )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:707:3: lv_composite_1_0= ruleJsonMetaArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getCompositeJsonMetaArrayParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1479);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:731:1: entryRuleJsonCompositeType returns [EObject current=null] : iv_ruleJsonCompositeType= ruleJsonCompositeType EOF ;
    public final EObject entryRuleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:732:2: (iv_ruleJsonCompositeType= ruleJsonCompositeType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:733:2: iv_ruleJsonCompositeType= ruleJsonCompositeType EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeTypeRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1515);
            iv_ruleJsonCompositeType=ruleJsonCompositeType();

            state._fsp--;

             current =iv_ruleJsonCompositeType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeType1525); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:740:1: ruleJsonCompositeType returns [EObject current=null] : ( (lv_composite_0_0= ruleJsonArray ) ) ;
    public final EObject ruleJsonCompositeType() throws RecognitionException {
        EObject current = null;

        EObject lv_composite_0_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:743:28: ( ( (lv_composite_0_0= ruleJsonArray ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:744:1: ( (lv_composite_0_0= ruleJsonArray ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:744:1: ( (lv_composite_0_0= ruleJsonArray ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:745:1: (lv_composite_0_0= ruleJsonArray )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:745:1: (lv_composite_0_0= ruleJsonArray )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:746:3: lv_composite_0_0= ruleJsonArray
            {
             
            	        newCompositeNode(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1570);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:770:1: entryRuleJsonType returns [EObject current=null] : iv_ruleJsonType= ruleJsonType EOF ;
    public final EObject entryRuleJsonType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:771:2: (iv_ruleJsonType= ruleJsonType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:772:2: iv_ruleJsonType= ruleJsonType EOF
            {
             newCompositeNode(grammarAccess.getJsonTypeRule()); 
            pushFollow(FOLLOW_ruleJsonType_in_entryRuleJsonType1605);
            iv_ruleJsonType=ruleJsonType();

            state._fsp--;

             current =iv_ruleJsonType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonType1615); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:779:1: ruleJsonType returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) ;
    public final EObject ruleJsonType() throws RecognitionException {
        EObject current = null;

        EObject lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:782:28: ( ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:783:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:783:1: ( ( (lv_scalar_0_0= ruleJsonScalarType ) ) | ( (lv_composite_1_0= ruleJsonCompositeType ) ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:783:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:783:2: ( (lv_scalar_0_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:784:1: (lv_scalar_0_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:784:1: (lv_scalar_0_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:785:3: lv_scalar_0_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getScalarJsonScalarTypeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonType1661);
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:802:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:802:6: ( (lv_composite_1_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:803:1: (lv_composite_1_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:803:1: (lv_composite_1_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:804:3: lv_composite_1_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonTypeAccess().getCompositeJsonCompositeTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonType1688);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:828:1: entryRuleJsonScalarType returns [EObject current=null] : iv_ruleJsonScalarType= ruleJsonScalarType EOF ;
    public final EObject entryRuleJsonScalarType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonScalarType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:829:2: (iv_ruleJsonScalarType= ruleJsonScalarType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:830:2: iv_ruleJsonScalarType= ruleJsonScalarType EOF
            {
             newCompositeNode(grammarAccess.getJsonScalarTypeRule()); 
            pushFollow(FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1724);
            iv_ruleJsonScalarType=ruleJsonScalarType();

            state._fsp--;

             current =iv_ruleJsonScalarType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonScalarType1734); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:837:1: ruleJsonScalarType returns [EObject current=null] : ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:840:28: ( ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:841:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:841:1: ( ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? ) | ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:841:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:841:2: ( (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:842:1: (lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:843:3: lv_bool_0_0= RULE_JSON_LITERAL_BOOLEAN
                    {
                    lv_bool_0_0=(Token)match(input,RULE_JSON_LITERAL_BOOLEAN,FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1776); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:860:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:860:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:861:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:861:1: (lv_string_1_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:862:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonScalarType1804); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:879:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:879:6: ( ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )? )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:879:7: ( (lv_number_2_0= RULE_INT ) ) (otherlv_3= '.' this_INT_4= RULE_INT )?
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:879:7: ( (lv_number_2_0= RULE_INT ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:880:1: (lv_number_2_0= RULE_INT )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:880:1: (lv_number_2_0= RULE_INT )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:881:3: lv_number_2_0= RULE_INT
                    {
                    lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1833); 

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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:897:2: (otherlv_3= '.' this_INT_4= RULE_INT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==36) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:897:4: otherlv_3= '.' this_INT_4= RULE_INT
                            {
                            otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleJsonScalarType1851); 

                                	newLeafNode(otherlv_3, grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0());
                                
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonScalarType1862); 
                             
                                newLeafNode(this_INT_4, grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:906:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:906:6: ( (lv_null_5_0= RULE_JSON_LITERAL_NULL ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:907:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:907:1: (lv_null_5_0= RULE_JSON_LITERAL_NULL )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:908:3: lv_null_5_0= RULE_JSON_LITERAL_NULL
                    {
                    lv_null_5_0=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1887); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:932:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:933:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:934:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray1928);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray1938); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:941:1: ruleJsonArray returns [EObject current=null] : ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:944:28: ( ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:945:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:945:1: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) | (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' ) )
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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:945:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:945:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:945:4: otherlv_0= '[' ( (lv_elements_1_0= ruleJsonScalarType ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray1976); 

                        	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:949:1: ( (lv_elements_1_0= ruleJsonScalarType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:1: (lv_elements_1_0= ruleJsonScalarType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:950:1: (lv_elements_1_0= ruleJsonScalarType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:951:3: lv_elements_1_0= ruleJsonScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray1997);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:967:2: (otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) ) )*
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
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:967:4: otherlv_2= ',' ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    {
                    	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2010); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:971:1: ( (lv_elements_3_0= ruleJsonScalarType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:972:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:972:1: (lv_elements_3_0= ruleJsonScalarType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:973:3: lv_elements_3_0= ruleJsonScalarType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getElementsJsonScalarTypeParserRuleCall_0_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonScalarType_in_ruleJsonArray2031);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:989:4: (otherlv_4= ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:989:6: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2046); 

                                	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_3());
                                

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2060); 

                        	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:998:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:998:6: (otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']' )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:998:8: otherlv_6= '[' ( (lv_composites_7_0= ruleJsonCompositeType ) ) (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )* (otherlv_10= ',' )? otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleJsonArray2080); 

                        	newLeafNode(otherlv_6, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1002:1: ( (lv_composites_7_0= ruleJsonCompositeType ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1003:1: (lv_composites_7_0= ruleJsonCompositeType )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1003:1: (lv_composites_7_0= ruleJsonCompositeType )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1004:3: lv_composites_7_0= ruleJsonCompositeType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2101);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1020:2: (otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) ) )*
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
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1020:4: otherlv_8= ',' ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2114); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1024:1: ( (lv_composites_9_0= ruleJsonCompositeType ) )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1025:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    {
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1025:1: (lv_composites_9_0= ruleJsonCompositeType )
                    	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1026:3: lv_composites_9_0= ruleJsonCompositeType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getCompositesJsonCompositeTypeParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2135);
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

                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1042:4: (otherlv_10= ',' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==29) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1042:6: otherlv_10= ','
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_29_in_ruleJsonArray2150); 

                                	newLeafNode(otherlv_10, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2164); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1058:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1059:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1060:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject2201);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject2211); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1067:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1070:28: ( (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1071:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1071:1: (otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1071:3: otherlv_0= '{' ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) ) (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )* (otherlv_8= ',' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleJsonObject2248); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1075:1: ( ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1075:2: ( (lv_keys_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_values_3_0= ruleXplatformJson ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1075:2: ( (lv_keys_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1076:1: (lv_keys_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1076:1: (lv_keys_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1077:3: lv_keys_1_0= RULE_STRING
            {
            lv_keys_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2266); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject2283); 

                	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getColonKeyword_1_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1097:1: ( (lv_values_3_0= ruleXplatformJson ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1098:1: (lv_values_3_0= ruleXplatformJson )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1098:1: (lv_values_3_0= ruleXplatformJson )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1099:3: lv_values_3_0= ruleXplatformJson
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_1_2_0()); 
            	    
            pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2304);
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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1115:3: (otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_STRING) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1115:5: otherlv_4= ',' ( (lv_keys_5_0= RULE_STRING ) ) otherlv_6= ':' ( (lv_values_7_0= ruleXplatformJson ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleJsonObject2318); 

            	        	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1119:1: ( (lv_keys_5_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1120:1: (lv_keys_5_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1120:1: (lv_keys_5_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1121:3: lv_keys_5_0= RULE_STRING
            	    {
            	    lv_keys_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonObject2335); 

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

            	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject2352); 

            	        	newLeafNode(otherlv_6, grammarAccess.getJsonObjectAccess().getColonKeyword_2_2());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1141:1: ( (lv_values_7_0= ruleXplatformJson ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1142:1: (lv_values_7_0= ruleXplatformJson )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1142:1: (lv_values_7_0= ruleXplatformJson )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1143:3: lv_values_7_0= ruleXplatformJson
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getValuesXplatformJsonParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXplatformJson_in_ruleJsonObject2373);
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
            	    break loop22;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1159:4: (otherlv_8= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1159:6: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleJsonObject2388); 

                        	newLeafNode(otherlv_8, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleJsonObject2402); 

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


    // $ANTLR start "entryRuleXplatformResource"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1175:1: entryRuleXplatformResource returns [EObject current=null] : iv_ruleXplatformResource= ruleXplatformResource EOF ;
    public final EObject entryRuleXplatformResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXplatformResource = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1176:2: (iv_ruleXplatformResource= ruleXplatformResource EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1177:2: iv_ruleXplatformResource= ruleXplatformResource EOF
            {
             newCompositeNode(grammarAccess.getXplatformResourceRule()); 
            pushFollow(FOLLOW_ruleXplatformResource_in_entryRuleXplatformResource2438);
            iv_ruleXplatformResource=ruleXplatformResource();

            state._fsp--;

             current =iv_ruleXplatformResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXplatformResource2448); 

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
    // $ANTLR end "entryRuleXplatformResource"


    // $ANTLR start "ruleXplatformResource"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1184:1: ruleXplatformResource returns [EObject current=null] : ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ ) ;
    public final EObject ruleXplatformResource() throws RecognitionException {
        EObject current = null;

        EObject lv_platform_0_0 = null;

        EObject lv_types_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1187:28: ( ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1188:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1188:1: ( ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+ )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1188:2: ( (lv_platform_0_0= rulePlatform ) ) ( (lv_types_1_0= ruleType ) )+
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1188:2: ( (lv_platform_0_0= rulePlatform ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1189:1: (lv_platform_0_0= rulePlatform )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1189:1: (lv_platform_0_0= rulePlatform )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1190:3: lv_platform_0_0= rulePlatform
            {
             
            	        newCompositeNode(grammarAccess.getXplatformResourceAccess().getPlatformPlatformParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePlatform_in_ruleXplatformResource2494);
            lv_platform_0_0=rulePlatform();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXplatformResourceRule());
            	        }
                   		set(
                   			current, 
                   			"platform",
                    		lv_platform_0_0, 
                    		"Platform");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1206:2: ( (lv_types_1_0= ruleType ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=39)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1207:1: (lv_types_1_0= ruleType )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1207:1: (lv_types_1_0= ruleType )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1208:3: lv_types_1_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getXplatformResourceAccess().getTypesTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleXplatformResource2515);
            	    lv_types_1_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getXplatformResourceRule());
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "ruleXplatformResource"


    // $ANTLR start "entryRulePlatform"
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1232:1: entryRulePlatform returns [EObject current=null] : iv_rulePlatform= rulePlatform EOF ;
    public final EObject entryRulePlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatform = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1233:2: (iv_rulePlatform= rulePlatform EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1234:2: iv_rulePlatform= rulePlatform EOF
            {
             newCompositeNode(grammarAccess.getPlatformRule()); 
            pushFollow(FOLLOW_rulePlatform_in_entryRulePlatform2552);
            iv_rulePlatform=rulePlatform();

            state._fsp--;

             current =iv_rulePlatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlatform2562); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1241:1: rulePlatform returns [EObject current=null] : (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' ) ;
    public final EObject rulePlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_platforms_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1244:28: ( (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1245:1: (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1245:1: (otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1245:3: otherlv_0= 'platform' otherlv_1= '{' ( (lv_platforms_2_0= RULE_STRING ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePlatform2599); 

                	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePlatform2611); 

                	newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1253:1: ( (lv_platforms_2_0= RULE_STRING ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1254:1: (lv_platforms_2_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1254:1: (lv_platforms_2_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1255:3: lv_platforms_2_0= RULE_STRING
            	    {
            	    lv_platforms_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePlatform2628); 

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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_rulePlatform2646); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1283:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1284:2: (iv_ruleType= ruleType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1285:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2682);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2692); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1292:1: ruleType returns [EObject current=null] : (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_MapInstance_0 = null;

        EObject this_EnumInstance_1 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1295:28: ( (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1296:1: (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1296:1: (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==38) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1297:5: this_MapInstance_0= ruleMapInstance
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMapInstanceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMapInstance_in_ruleType2739);
                    this_MapInstance_0=ruleMapInstance();

                    state._fsp--;

                     
                            current = this_MapInstance_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1307:5: this_EnumInstance_1= ruleEnumInstance
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getEnumInstanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumInstance_in_ruleType2766);
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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1323:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1324:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1325:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2801);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2811); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1332:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1335:28: ( (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1336:1: (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1336:1: (otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1336:3: otherlv_0= 'enum' ( (lv_enumName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleEnumInstance2848); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1340:1: ( (lv_enumName_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1341:1: (lv_enumName_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1341:1: (lv_enumName_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1342:3: lv_enumName_1_0= RULE_ID
            {
            lv_enumName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2865); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleEnumInstance2882); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1362:1: ( (lv_values_3_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1363:1: (lv_values_3_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1363:1: (lv_values_3_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1364:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2899); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1380:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==29) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1380:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleEnumInstance2917); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1384:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1385:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1385:1: (lv_values_5_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1386:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2934); 

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
            	    break loop27;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1402:4: (otherlv_6= ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1402:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleEnumInstance2954); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleEnumInstance2968); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1418:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1419:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1420:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance3004);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance3014); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1427:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1430:28: ( (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1431:1: (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1431:1: (otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1431:3: otherlv_0= 'map' ( (lv_mapName_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleMapInstance3051); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1435:1: ( (lv_mapName_1_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1436:1: (lv_mapName_1_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1436:1: (lv_mapName_1_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1437:3: lv_mapName_1_0= RULE_ID
            {
            lv_mapName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3068); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleMapInstance3085); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1457:1: ( (lv_values_3_0= RULE_ID ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1458:1: (lv_values_3_0= RULE_ID )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1458:1: (lv_values_3_0= RULE_ID )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1459:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3102); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1475:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1475:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleMapInstance3120); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1479:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1480:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1480:1: (lv_values_5_0= RULE_ID )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1481:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance3137); 

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
            	    break loop29;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1497:4: (otherlv_6= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1497:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleMapInstance3157); 

                        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleMapInstance3171); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1513:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1514:2: (iv_ruleStringList= ruleStringList EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1515:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList3207);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList3217); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1522:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1525:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1526:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1526:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1526:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStringList3254); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1530:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1531:1: (lv_values_1_0= RULE_STRING )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1531:1: (lv_values_1_0= RULE_STRING )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1532:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3271); 

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

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1548:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1==RULE_STRING) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1548:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleStringList3289); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1552:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1553:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1553:1: (lv_values_3_0= RULE_STRING )
            	    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1554:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList3306); 

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
            	    break loop31;
                }
            } while (true);

            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1570:4: (otherlv_4= ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1570:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleStringList3326); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleStringList3340); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1588:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1589:2: (iv_ruleValueType= ruleValueType EOF )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1590:2: iv_ruleValueType= ruleValueType EOF
            {
             newCompositeNode(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_ruleValueType_in_entryRuleValueType3378);
            iv_ruleValueType=ruleValueType();

            state._fsp--;

             current =iv_ruleValueType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueType3388); 

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
    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1597:1: ruleValueType returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        EObject lv_stringList_1_0 = null;


         enterRule(); 
            
        try {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1600:28: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) ) )
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1601:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) )
            {
            // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1601:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_stringList_1_0= ruleStringList ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==34) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1601:2: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1601:2: ( (lv_string_0_0= RULE_STRING ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1602:1: (lv_string_0_0= RULE_STRING )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1602:1: (lv_string_0_0= RULE_STRING )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1603:3: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueType3430); 

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
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1620:6: ( (lv_stringList_1_0= ruleStringList ) )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1620:6: ( (lv_stringList_1_0= ruleStringList ) )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1621:1: (lv_stringList_1_0= ruleStringList )
                    {
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1621:1: (lv_stringList_1_0= ruleStringList )
                    // ../xplatform/src-gen/nl/sison/parser/antlr/internal/InternalXplatform.g:1622:3: lv_stringList_1_0= ruleStringList
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueTypeAccess().getStringListStringListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringList_in_ruleValueType3462);
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
    public static final BitSet FOLLOW_ruleXplatformResource_in_ruleXplatform131 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXplatform143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXplatform160 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXplatform177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_RESTFUL_METHODS_in_ruleXplatform194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXplatform211 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleURI_in_ruleXplatform232 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_18_in_ruleXplatform245 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleXplatform257 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXplatform269 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleXplatform281 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatform302 = new BitSet(new long[]{0x0000000000A00002L});
    public static final BitSet FOLLOW_21_in_ruleXplatform315 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleXplatform327 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_ruleXplatform348 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleXplatform365 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatform377 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatform398 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleXplatform411 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleXplatform423 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleXplatform444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI531 = new BitSet(new long[]{0x0000000004000042L});
    public static final BitSet FOLLOW_26_in_ruleURI545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI562 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleURI579 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleURI591 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleXplatformHeader_in_entryRuleXplatformHeader630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeader640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader677 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleXplatformHeader689 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader710 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleXplatformHeader723 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_ruleXplatformHeader744 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleXplatformHeader759 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleXplatformHeader773 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformHeader785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformHeaderKeyValuePair_in_entryRuleXplatformHeaderKeyValuePair821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformHeaderKeyValuePair831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair873 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleXplatformHeaderKeyValuePair890 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXplatformHeaderKeyValuePair908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XPLATFORM_HEADER_PARAMETER_in_ruleXplatformHeaderKeyValuePair936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_entryRuleXplatformJson978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformJson988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleXplatformJson1026 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonType_in_ruleXplatformJson1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleXplatformJson1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleXplatformJson1103 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleXplatformJson1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_entryRuleJsonMetaScalarType1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaScalarType1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJsonMetaScalarType1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleJsonMetaScalarType1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleJsonMetaScalarType1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_entryRuleJsonMetaArray1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaArray1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonMetaArray1327 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_ruleJsonMetaArray1348 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonMetaArray1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaType_in_entryRuleJsonMetaType1396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonMetaType1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_ruleJsonMetaType1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaArray_in_ruleJsonMetaType1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_entryRuleJsonCompositeType1515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeType1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeType1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonType_in_entryRuleJsonType1605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonType1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonType1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonType1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_entryRuleJsonScalarType1724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonScalarType1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_BOOLEAN_in_ruleJsonScalarType1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonScalarType1804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1833 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleJsonScalarType1851 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonScalarType1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonScalarType1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray1976 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray1997 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2010 = new BitSet(new long[]{0x0000000000000E80L});
    public static final BitSet FOLLOW_ruleJsonScalarType_in_ruleJsonArray2031 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2046 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleJsonArray2080 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2101 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2114 = new BitSet(new long[]{0x0000000400000E80L});
    public static final BitSet FOLLOW_ruleJsonCompositeType_in_ruleJsonArray2135 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonArray2150 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleJsonObject2248 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject2283 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2304 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonObject2318 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonObject2335 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject2352 = new BitSet(new long[]{0x0000000794000000L});
    public static final BitSet FOLLOW_ruleXplatformJson_in_ruleJsonObject2373 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleJsonObject2388 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJsonObject2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXplatformResource_in_entryRuleXplatformResource2438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXplatformResource2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_ruleXplatformResource2494 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleXplatformResource2515 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_rulePlatform_in_entryRulePlatform2552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlatform2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePlatform2599 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePlatform2611 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePlatform2628 = new BitSet(new long[]{0x0000000008000080L});
    public static final BitSet FOLLOW_27_in_rulePlatform2646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleType2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleType2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEnumInstance2848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2865 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleEnumInstance2882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2899 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumInstance2917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2934 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleEnumInstance2954 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleEnumInstance2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance3004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance3014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleMapInstance3051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3068 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMapInstance3085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3102 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleMapInstance3120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance3137 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_29_in_ruleMapInstance3157 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMapInstance3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList3207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStringList3254 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3271 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleStringList3289 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList3306 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_29_in_ruleStringList3326 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleStringList3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueType_in_entryRuleValueType3378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueType3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueType3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleValueType3462 = new BitSet(new long[]{0x0000000000000002L});

}