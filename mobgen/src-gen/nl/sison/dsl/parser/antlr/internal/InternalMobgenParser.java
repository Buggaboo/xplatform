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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EMPTY_JSON_OBJECT", "RULE_EMPTY_JSON_ARRAY", "RULE_JSON_LITERAL_NULL", "RULE_JSON_NUMBER", "RULE_URL_PREFIX", "RULE_URL_PATH", "RULE_URL_QUERY", "RULE_URL_QUERY_SUFFIX", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'call'", "':'", "'from'", "'with'", "'headers'", "'request'", "'and'", "'response'", "'client'", "'expects'", "'server'", "'\\'\\'\\''", "'{'", "','", "'}'", "'='", "'['", "']'", "'enum'", "'map'", "'PUT'", "'POST'", "'GET'", "'DELETE'", "'boolean'", "'number'", "'string'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_EMPTY_JSON_ARRAY=7;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_URL_QUERY=12;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int RULE_JSON_NUMBER=9;
    public static final int RULE_URL_PATH=11;
    public static final int RULE_INT=14;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_EMPTY_JSON_OBJECT=6;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_ML_COMMENT=15;
    public static final int RULE_URL_PREFIX=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_JSON_LITERAL_NULL=8;
    public static final int T__39=39;
    public static final int RULE_WS=17;
    public static final int RULE_URL_QUERY_SUFFIX=13;

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:77:1: ruleMobgen returns [EObject current=null] : ( ( (lv_resources_0_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_1_0= ruleMobgenCallDefinition ) ) )* ;
    public final EObject ruleMobgen() throws RecognitionException {
        EObject current = null;

        EObject lv_resources_0_0 = null;

        EObject lv_calls_1_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:80:28: ( ( ( (lv_resources_0_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_1_0= ruleMobgenCallDefinition ) ) )* )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:1: ( ( (lv_resources_0_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_1_0= ruleMobgenCallDefinition ) ) )*
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:1: ( ( (lv_resources_0_0= ruleMobgenResourceDefinition ) ) | ( (lv_calls_1_0= ruleMobgenCallDefinition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=37 && LA1_0<=38)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==19) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:2: ( (lv_resources_0_0= ruleMobgenResourceDefinition ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:81:2: ( (lv_resources_0_0= ruleMobgenResourceDefinition ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:82:1: (lv_resources_0_0= ruleMobgenResourceDefinition )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:82:1: (lv_resources_0_0= ruleMobgenResourceDefinition )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:83:3: lv_resources_0_0= ruleMobgenResourceDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_ruleMobgen131);
            	    lv_resources_0_0=ruleMobgenResourceDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMobgenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_0_0, 
            	            		"MobgenResourceDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:100:6: ( (lv_calls_1_0= ruleMobgenCallDefinition ) )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:100:6: ( (lv_calls_1_0= ruleMobgenCallDefinition ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:101:1: (lv_calls_1_0= ruleMobgenCallDefinition )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:101:1: (lv_calls_1_0= ruleMobgenCallDefinition )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:102:3: lv_calls_1_0= ruleMobgenCallDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenCallDefinition_in_ruleMobgen158);
            	    lv_calls_1_0=ruleMobgenCallDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMobgenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"calls",
            	            		lv_calls_1_0, 
            	            		"MobgenCallDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleMobgen"


    // $ANTLR start "entryRuleMobgenCallDefinition"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:126:1: entryRuleMobgenCallDefinition returns [EObject current=null] : iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF ;
    public final EObject entryRuleMobgenCallDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenCallDefinition = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:127:2: (iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:128:2: iv_ruleMobgenCallDefinition= ruleMobgenCallDefinition EOF
            {
             newCompositeNode(grammarAccess.getMobgenCallDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition195);
            iv_ruleMobgenCallDefinition=ruleMobgenCallDefinition();

            state._fsp--;

             current =iv_ruleMobgenCallDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenCallDefinition205); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:135:1: ruleMobgenCallDefinition returns [EObject current=null] : (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= ruleRestfulMethods ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? ) ;
    public final EObject ruleMobgenCallDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
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
        Enumerator lv_method_3_0 = null;

        EObject lv_uri_5_0 = null;

        EObject lv_requestHeaders_10_0 = null;

        EObject lv_responseHeaders_13_0 = null;

        EObject lv_jsonToClient_16_0 = null;

        EObject lv_jsonToServer_19_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:138:28: ( (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= ruleRestfulMethods ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:139:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= ruleRestfulMethods ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:139:1: (otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= ruleRestfulMethods ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )? )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:139:3: otherlv_0= 'call' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_method_3_0= ruleRestfulMethods ) ) otherlv_4= 'from' ( (lv_uri_5_0= ruleURI ) ) (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )? (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )? (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleMobgenCallDefinition242); 

                	newLeafNode(otherlv_0, grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:143:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:144:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:144:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:145:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenCallDefinition259); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMobgenCallDefinition276); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:165:1: ( (lv_method_3_0= ruleRestfulMethods ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:166:1: (lv_method_3_0= ruleRestfulMethods )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:166:1: (lv_method_3_0= ruleRestfulMethods )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:167:3: lv_method_3_0= ruleRestfulMethods
            {
             
            	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getMethodRestfulMethodsEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRestfulMethods_in_ruleMobgenCallDefinition297);
            lv_method_3_0=ruleRestfulMethods();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"method",
                    		lv_method_3_0, 
                    		"RestfulMethods");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleMobgenCallDefinition309); 

                	newLeafNode(otherlv_4, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:187:1: ( (lv_uri_5_0= ruleURI ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:188:1: (lv_uri_5_0= ruleURI )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:188:1: (lv_uri_5_0= ruleURI )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:189:3: lv_uri_5_0= ruleURI
            {
             
            	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleURI_in_ruleMobgenCallDefinition330);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:205:2: (otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )? )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:205:4: otherlv_6= 'with' otherlv_7= 'headers' otherlv_8= 'from' otherlv_9= 'request' ( (lv_requestHeaders_10_0= ruleMobgenHeader ) ) (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )?
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleMobgenCallDefinition343); 

                        	newLeafNode(otherlv_6, grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleMobgenCallDefinition355); 

                        	newLeafNode(otherlv_7, grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleMobgenCallDefinition367); 

                        	newLeafNode(otherlv_8, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2());
                        
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleMobgenCallDefinition379); 

                        	newLeafNode(otherlv_9, grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:221:1: ( (lv_requestHeaders_10_0= ruleMobgenHeader ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:222:1: (lv_requestHeaders_10_0= ruleMobgenHeader )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:222:1: (lv_requestHeaders_10_0= ruleMobgenHeader )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:223:3: lv_requestHeaders_10_0= ruleMobgenHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition400);
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

                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:239:2: (otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==25) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:239:4: otherlv_11= 'and' otherlv_12= 'response' ( (lv_responseHeaders_13_0= ruleMobgenHeader ) )
                            {
                            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleMobgenCallDefinition413); 

                                	newLeafNode(otherlv_11, grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0());
                                
                            otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleMobgenCallDefinition425); 

                                	newLeafNode(otherlv_12, grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1());
                                
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:247:1: ( (lv_responseHeaders_13_0= ruleMobgenHeader ) )
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:248:1: (lv_responseHeaders_13_0= ruleMobgenHeader )
                            {
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:248:1: (lv_responseHeaders_13_0= ruleMobgenHeader )
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:249:3: lv_responseHeaders_13_0= ruleMobgenHeader
                            {
                             
                            	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition446);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:265:6: (otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:265:8: otherlv_14= 'client' otherlv_15= 'expects' ( (lv_jsonToClient_16_0= ruleMobgenJson ) )
                    {
                    otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleMobgenCallDefinition463); 

                        	newLeafNode(otherlv_14, grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0());
                        
                    otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleMobgenCallDefinition475); 

                        	newLeafNode(otherlv_15, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:273:1: ( (lv_jsonToClient_16_0= ruleMobgenJson ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:274:1: (lv_jsonToClient_16_0= ruleMobgenJson )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:274:1: (lv_jsonToClient_16_0= ruleMobgenJson )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:275:3: lv_jsonToClient_16_0= ruleMobgenJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition496);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:291:4: (otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:291:6: otherlv_17= 'server' otherlv_18= 'expects' ( (lv_jsonToServer_19_0= ruleMobgenJson ) )
                    {
                    otherlv_17=(Token)match(input,29,FOLLOW_29_in_ruleMobgenCallDefinition511); 

                        	newLeafNode(otherlv_17, grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0());
                        
                    otherlv_18=(Token)match(input,28,FOLLOW_28_in_ruleMobgenCallDefinition523); 

                        	newLeafNode(otherlv_18, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1());
                        
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:299:1: ( (lv_jsonToServer_19_0= ruleMobgenJson ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:300:1: (lv_jsonToServer_19_0= ruleMobgenJson )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:300:1: (lv_jsonToServer_19_0= ruleMobgenJson )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:301:3: lv_jsonToServer_19_0= ruleMobgenJson
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition544);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:325:1: entryRuleMobgenHeader returns [EObject current=null] : iv_ruleMobgenHeader= ruleMobgenHeader EOF ;
    public final EObject entryRuleMobgenHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeader = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:326:2: (iv_ruleMobgenHeader= ruleMobgenHeader EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:327:2: iv_ruleMobgenHeader= ruleMobgenHeader EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderRule()); 
            pushFollow(FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader582);
            iv_ruleMobgenHeader=ruleMobgenHeader();

            state._fsp--;

             current =iv_ruleMobgenHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeader592); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:334:1: ruleMobgenHeader returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:337:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:338:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:338:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:338:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' otherlv_2= '{' ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) ) (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )* (otherlv_6= ',' )? otherlv_7= '}' otherlv_8= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:338:2: ( (lv_name_0_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:339:1: (lv_name_0_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:339:1: (lv_name_0_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:340:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenHeader634); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMobgenHeader651); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1());
                
            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleMobgenHeader663); 

                	newLeafNode(otherlv_2, grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:364:1: ( (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:365:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:365:1: (lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:366:3: lv_headerKeyValues_3_0= ruleMobgenHeaderKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader684);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:382:2: (otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==32) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_STRING) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:382:4: otherlv_4= ',' ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleMobgenHeader697); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:386:1: ( (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:387:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:387:1: (lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:388:3: lv_headerKeyValues_5_0= ruleMobgenHeaderKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader718);
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
            	    break loop6;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:404:4: (otherlv_6= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:404:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleMobgenHeader733); 

                        	newLeafNode(otherlv_6, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleMobgenHeader747); 

                	newLeafNode(otherlv_7, grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleMobgenHeader759); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:424:1: entryRuleMobgenHeaderKeyValuePair returns [EObject current=null] : iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF ;
    public final EObject entryRuleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeaderKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:425:2: (iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:426:2: iv_ruleMobgenHeaderKeyValuePair= ruleMobgenHeaderKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair795);
            iv_ruleMobgenHeaderKeyValuePair=ruleMobgenHeaderKeyValuePair();

            state._fsp--;

             current =iv_ruleMobgenHeaderKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair805); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:433:1: ruleMobgenHeaderKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) ) ;
    public final EObject ruleMobgenHeaderKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;
        EObject lv_parameter_3_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:436:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:437:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:437:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:437:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:437:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:438:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:438:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:439:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair847); 

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

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleMobgenHeaderKeyValuePair864); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:459:1: ( ( (lv_value_2_0= RULE_STRING ) ) | ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:459:2: ( (lv_value_2_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:459:2: ( (lv_value_2_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:460:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:460:1: (lv_value_2_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:461:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair882); 

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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:478:6: ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:478:6: ( (lv_parameter_3_0= ruleMobgenHeaderParameter ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:479:1: (lv_parameter_3_0= ruleMobgenHeaderParameter )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:479:1: (lv_parameter_3_0= ruleMobgenHeaderParameter )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:480:3: lv_parameter_3_0= ruleMobgenHeaderParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getMobgenHeaderKeyValuePairAccess().getParameterMobgenHeaderParameterParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_ruleMobgenHeaderKeyValuePair914);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:504:1: entryRuleMobgenHeaderParameter returns [EObject current=null] : iv_ruleMobgenHeaderParameter= ruleMobgenHeaderParameter EOF ;
    public final EObject entryRuleMobgenHeaderParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenHeaderParameter = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:505:2: (iv_ruleMobgenHeaderParameter= ruleMobgenHeaderParameter EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:506:2: iv_ruleMobgenHeaderParameter= ruleMobgenHeaderParameter EOF
            {
             newCompositeNode(grammarAccess.getMobgenHeaderParameterRule()); 
            pushFollow(FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter951);
            iv_ruleMobgenHeaderParameter=ruleMobgenHeaderParameter();

            state._fsp--;

             current =iv_ruleMobgenHeaderParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenHeaderParameter961); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:513:1: ruleMobgenHeaderParameter returns [EObject current=null] : (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' ) ;
    public final EObject ruleMobgenHeaderParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:516:28: ( (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:517:1: (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:517:1: (otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:517:3: otherlv_0= '{' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleMobgenHeaderParameter998); 

                	newLeafNode(otherlv_0, grammarAccess.getMobgenHeaderParameterAccess().getLeftCurlyBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:521:1: ( (lv_id_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:522:1: (lv_id_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:522:1: (lv_id_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:523:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenHeaderParameter1015); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleMobgenHeaderParameter1032); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:551:1: entryRuleMobgenJson returns [EObject current=null] : iv_ruleMobgenJson= ruleMobgenJson EOF ;
    public final EObject entryRuleMobgenJson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenJson = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:552:2: (iv_ruleMobgenJson= ruleMobgenJson EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:553:2: iv_ruleMobgenJson= ruleMobgenJson EOF
            {
             newCompositeNode(grammarAccess.getMobgenJsonRule()); 
            pushFollow(FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1068);
            iv_ruleMobgenJson=ruleMobgenJson();

            state._fsp--;

             current =iv_ruleMobgenJson; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenJson1078); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:560:1: ruleMobgenJson returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) ;
    public final EObject ruleMobgenJson() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:563:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:564:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:564:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\'' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:564:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '\\'\\'\\'' ( (lv_value_2_0= ruleJsonObjectValue ) ) otherlv_3= '\\'\\'\\''
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:564:2: ( (lv_name_0_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:565:1: (lv_name_0_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:565:1: (lv_name_0_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:566:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMobgenJson1120); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMobgenJson1137); 

                	newLeafNode(otherlv_1, grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:586:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:587:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:587:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:588:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1158);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleMobgenJson1170); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:616:1: entryRuleJsonObjectValue returns [EObject current=null] : iv_ruleJsonObjectValue= ruleJsonObjectValue EOF ;
    public final EObject entryRuleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObjectValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:617:2: (iv_ruleJsonObjectValue= ruleJsonObjectValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:618:2: iv_ruleJsonObjectValue= ruleJsonObjectValue EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectValueRule()); 
            pushFollow(FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1206);
            iv_ruleJsonObjectValue=ruleJsonObjectValue();

            state._fsp--;

             current =iv_ruleJsonObjectValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObjectValue1216); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:625:1: ruleJsonObjectValue returns [EObject current=null] : ( ( (lv_scalar_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) ;
    public final EObject ruleJsonObjectValue() throws RecognitionException {
        EObject current = null;

        EObject lv_scalar_0_0 = null;

        EObject lv_composite_1_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:628:28: ( ( ( (lv_scalar_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:629:1: ( ( (lv_scalar_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:629:1: ( ( (lv_scalar_0_0= ruleJsonLiteralValue ) ) | ( (lv_composite_1_0= ruleJsonCompositeValue ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_JSON_NUMBER)||(LA9_0>=43 && LA9_0<=47)) ) {
                alt9=1;
            }
            else if ( (LA9_0==31||LA9_0==35) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:629:2: ( (lv_scalar_0_0= ruleJsonLiteralValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:629:2: ( (lv_scalar_0_0= ruleJsonLiteralValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:630:1: (lv_scalar_0_0= ruleJsonLiteralValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:630:1: (lv_scalar_0_0= ruleJsonLiteralValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:631:3: lv_scalar_0_0= ruleJsonLiteralValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getScalarJsonLiteralValueParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1262);
                    lv_scalar_0_0=ruleJsonLiteralValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
                    	        }
                           		set(
                           			current, 
                           			"scalar",
                            		lv_scalar_0_0, 
                            		"JsonLiteralValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:648:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:648:6: ( (lv_composite_1_0= ruleJsonCompositeValue ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:649:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:649:1: (lv_composite_1_0= ruleJsonCompositeValue )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:650:3: lv_composite_1_0= ruleJsonCompositeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1289);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:674:1: entryRuleJsonCompositeValue returns [EObject current=null] : iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF ;
    public final EObject entryRuleJsonCompositeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCompositeValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:675:2: (iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:676:2: iv_ruleJsonCompositeValue= ruleJsonCompositeValue EOF
            {
             newCompositeNode(grammarAccess.getJsonCompositeValueRule()); 
            pushFollow(FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue1325);
            iv_ruleJsonCompositeValue=ruleJsonCompositeValue();

            state._fsp--;

             current =iv_ruleJsonCompositeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonCompositeValue1335); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:683:1: ruleJsonCompositeValue returns [EObject current=null] : ( ( (lv_objectValue_0_0= ruleJsonObject ) ) | ( (lv_arrayValue_1_0= ruleJsonArray ) ) ) ;
    public final EObject ruleJsonCompositeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_objectValue_0_0 = null;

        EObject lv_arrayValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:686:28: ( ( ( (lv_objectValue_0_0= ruleJsonObject ) ) | ( (lv_arrayValue_1_0= ruleJsonArray ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:687:1: ( ( (lv_objectValue_0_0= ruleJsonObject ) ) | ( (lv_arrayValue_1_0= ruleJsonArray ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:687:1: ( ( (lv_objectValue_0_0= ruleJsonObject ) ) | ( (lv_arrayValue_1_0= ruleJsonArray ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==35) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:687:2: ( (lv_objectValue_0_0= ruleJsonObject ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:687:2: ( (lv_objectValue_0_0= ruleJsonObject ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:688:1: (lv_objectValue_0_0= ruleJsonObject )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:688:1: (lv_objectValue_0_0= ruleJsonObject )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:689:3: lv_objectValue_0_0= ruleJsonObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getObjectValueJsonObjectParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleJsonCompositeValue1381);
                    lv_objectValue_0_0=ruleJsonObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonCompositeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"objectValue",
                            		lv_objectValue_0_0, 
                            		"JsonObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:706:6: ( (lv_arrayValue_1_0= ruleJsonArray ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:706:6: ( (lv_arrayValue_1_0= ruleJsonArray ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:707:1: (lv_arrayValue_1_0= ruleJsonArray )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:707:1: (lv_arrayValue_1_0= ruleJsonArray )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:708:3: lv_arrayValue_1_0= ruleJsonArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getArrayValueJsonArrayParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonCompositeValue1408);
                    lv_arrayValue_1_0=ruleJsonArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonCompositeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"arrayValue",
                            		lv_arrayValue_1_0, 
                            		"JsonArray");
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
    // $ANTLR end "ruleJsonCompositeValue"


    // $ANTLR start "entryRuleJsonLiteralValue"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:732:1: entryRuleJsonLiteralValue returns [EObject current=null] : iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF ;
    public final EObject entryRuleJsonLiteralValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonLiteralValue = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:733:2: (iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:734:2: iv_ruleJsonLiteralValue= ruleJsonLiteralValue EOF
            {
             newCompositeNode(grammarAccess.getJsonLiteralValueRule()); 
            pushFollow(FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue1444);
            iv_ruleJsonLiteralValue=ruleJsonLiteralValue();

            state._fsp--;

             current =iv_ruleJsonLiteralValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonLiteralValue1454); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:741:1: ruleJsonLiteralValue returns [EObject current=null] : ( ( ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) ) ) | ( (lv_booleanType_1_0= ruleJsonLiteralBoolean ) ) | ( (lv_metaType_2_0= ruleJsonMetaScalarType ) ) ) ;
    public final EObject ruleJsonLiteralValue() throws RecognitionException {
        EObject current = null;

        Token lv_stringType_0_1=null;
        Token lv_stringType_0_2=null;
        Token lv_stringType_0_3=null;
        Token lv_stringType_0_4=null;
        Token lv_stringType_0_5=null;
        Enumerator lv_booleanType_1_0 = null;

        Enumerator lv_metaType_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:744:28: ( ( ( ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) ) ) | ( (lv_booleanType_1_0= ruleJsonLiteralBoolean ) ) | ( (lv_metaType_2_0= ruleJsonMetaScalarType ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:745:1: ( ( ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) ) ) | ( (lv_booleanType_1_0= ruleJsonLiteralBoolean ) ) | ( (lv_metaType_2_0= ruleJsonMetaScalarType ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:745:1: ( ( ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) ) ) | ( (lv_booleanType_1_0= ruleJsonLiteralBoolean ) ) | ( (lv_metaType_2_0= ruleJsonMetaScalarType ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_EMPTY_JSON_OBJECT:
            case RULE_EMPTY_JSON_ARRAY:
            case RULE_JSON_LITERAL_NULL:
            case RULE_JSON_NUMBER:
                {
                alt12=1;
                }
                break;
            case 46:
            case 47:
                {
                alt12=2;
                }
                break;
            case 43:
            case 44:
            case 45:
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:745:2: ( ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:745:2: ( ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:746:1: ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:746:1: ( (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:747:1: (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:747:1: (lv_stringType_0_1= RULE_STRING | lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT | lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY | lv_stringType_0_4= RULE_JSON_LITERAL_NULL | lv_stringType_0_5= RULE_JSON_NUMBER )
                    int alt11=5;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_EMPTY_JSON_OBJECT:
                        {
                        alt11=2;
                        }
                        break;
                    case RULE_EMPTY_JSON_ARRAY:
                        {
                        alt11=3;
                        }
                        break;
                    case RULE_JSON_LITERAL_NULL:
                        {
                        alt11=4;
                        }
                        break;
                    case RULE_JSON_NUMBER:
                        {
                        alt11=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:748:3: lv_stringType_0_1= RULE_STRING
                            {
                            lv_stringType_0_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonLiteralValue1498); 

                            			newLeafNode(lv_stringType_0_1, grammarAccess.getJsonLiteralValueAccess().getStringTypeSTRINGTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getJsonLiteralValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"stringType",
                                    		lv_stringType_0_1, 
                                    		"STRING");
                            	    

                            }
                            break;
                        case 2 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:763:8: lv_stringType_0_2= RULE_EMPTY_JSON_OBJECT
                            {
                            lv_stringType_0_2=(Token)match(input,RULE_EMPTY_JSON_OBJECT,FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonLiteralValue1518); 

                            			newLeafNode(lv_stringType_0_2, grammarAccess.getJsonLiteralValueAccess().getStringTypeEMPTY_JSON_OBJECTTerminalRuleCall_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getJsonLiteralValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"stringType",
                                    		lv_stringType_0_2, 
                                    		"EMPTY_JSON_OBJECT");
                            	    

                            }
                            break;
                        case 3 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:778:8: lv_stringType_0_3= RULE_EMPTY_JSON_ARRAY
                            {
                            lv_stringType_0_3=(Token)match(input,RULE_EMPTY_JSON_ARRAY,FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonLiteralValue1538); 

                            			newLeafNode(lv_stringType_0_3, grammarAccess.getJsonLiteralValueAccess().getStringTypeEMPTY_JSON_ARRAYTerminalRuleCall_0_0_2()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getJsonLiteralValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"stringType",
                                    		lv_stringType_0_3, 
                                    		"EMPTY_JSON_ARRAY");
                            	    

                            }
                            break;
                        case 4 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:793:8: lv_stringType_0_4= RULE_JSON_LITERAL_NULL
                            {
                            lv_stringType_0_4=(Token)match(input,RULE_JSON_LITERAL_NULL,FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonLiteralValue1558); 

                            			newLeafNode(lv_stringType_0_4, grammarAccess.getJsonLiteralValueAccess().getStringTypeJSON_LITERAL_NULLTerminalRuleCall_0_0_3()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getJsonLiteralValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"stringType",
                                    		lv_stringType_0_4, 
                                    		"JSON_LITERAL_NULL");
                            	    

                            }
                            break;
                        case 5 :
                            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:808:8: lv_stringType_0_5= RULE_JSON_NUMBER
                            {
                            lv_stringType_0_5=(Token)match(input,RULE_JSON_NUMBER,FOLLOW_RULE_JSON_NUMBER_in_ruleJsonLiteralValue1578); 

                            			newLeafNode(lv_stringType_0_5, grammarAccess.getJsonLiteralValueAccess().getStringTypeJSON_NUMBERTerminalRuleCall_0_0_4()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getJsonLiteralValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"stringType",
                                    		lv_stringType_0_5, 
                                    		"JSON_NUMBER");
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:827:6: ( (lv_booleanType_1_0= ruleJsonLiteralBoolean ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:827:6: ( (lv_booleanType_1_0= ruleJsonLiteralBoolean ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:828:1: (lv_booleanType_1_0= ruleJsonLiteralBoolean )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:828:1: (lv_booleanType_1_0= ruleJsonLiteralBoolean )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:829:3: lv_booleanType_1_0= ruleJsonLiteralBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonLiteralValueAccess().getBooleanTypeJsonLiteralBooleanEnumRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonLiteralBoolean_in_ruleJsonLiteralValue1613);
                    lv_booleanType_1_0=ruleJsonLiteralBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonLiteralValueRule());
                    	        }
                           		set(
                           			current, 
                           			"booleanType",
                            		lv_booleanType_1_0, 
                            		"JsonLiteralBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:846:6: ( (lv_metaType_2_0= ruleJsonMetaScalarType ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:846:6: ( (lv_metaType_2_0= ruleJsonMetaScalarType ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:847:1: (lv_metaType_2_0= ruleJsonMetaScalarType )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:847:1: (lv_metaType_2_0= ruleJsonMetaScalarType )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:848:3: lv_metaType_2_0= ruleJsonMetaScalarType
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonLiteralValueAccess().getMetaTypeJsonMetaScalarTypeEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonMetaScalarType_in_ruleJsonLiteralValue1640);
                    lv_metaType_2_0=ruleJsonMetaScalarType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonLiteralValueRule());
                    	        }
                           		set(
                           			current, 
                           			"metaType",
                            		lv_metaType_2_0, 
                            		"JsonMetaScalarType");
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
    // $ANTLR end "ruleJsonLiteralValue"


    // $ANTLR start "entryRuleJsonObject"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:872:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:873:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:874:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject1676);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject1686); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:881:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:884:28: ( (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:885:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:885:1: (otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:885:3: otherlv_0= '{' ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) ) (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )* (otherlv_4= ',' )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleJsonObject1723); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:889:1: ( (lv_keyValuePair_1_0= ruleJsonKeyValuePair ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:890:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:890:1: (lv_keyValuePair_1_0= ruleJsonKeyValuePair )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:891:3: lv_keyValuePair_1_0= ruleJsonKeyValuePair
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1744);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:907:2: (otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_STRING) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:907:4: otherlv_2= ',' ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleJsonObject1757); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:911:1: ( (lv_keyValuePair_3_0= ruleJsonKeyValuePair ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:912:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:912:1: (lv_keyValuePair_3_0= ruleJsonKeyValuePair )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:913:3: lv_keyValuePair_3_0= ruleJsonKeyValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1778);
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
            	    break loop13;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:929:4: (otherlv_4= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:929:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleJsonObject1793); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleJsonObject1807); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:945:1: entryRuleJsonKeyValuePair returns [EObject current=null] : iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF ;
    public final EObject entryRuleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonKeyValuePair = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:946:2: (iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:947:2: iv_ruleJsonKeyValuePair= ruleJsonKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getJsonKeyValuePairRule()); 
            pushFollow(FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair1843);
            iv_ruleJsonKeyValuePair=ruleJsonKeyValuePair();

            state._fsp--;

             current =iv_ruleJsonKeyValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonKeyValuePair1853); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:954:1: ruleJsonKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) ;
    public final EObject ruleJsonKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:957:28: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:958:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:958:1: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:958:2: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleJsonObjectValue ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:958:2: ( (lv_key_0_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:959:1: (lv_key_0_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:959:1: (lv_key_0_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:960:3: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair1895); 

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

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleJsonKeyValuePair1912); 

                	newLeafNode(otherlv_1, grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:980:1: ( (lv_value_2_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:981:1: (lv_value_2_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:981:1: (lv_value_2_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:982:3: lv_value_2_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair1933);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1006:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1007:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1008:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray1969);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray1979); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1015:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1018:28: ( (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1019:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1019:1: (otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1019:3: otherlv_0= '[' ( (lv_items_1_0= ruleJsonObjectValue ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleJsonArray2016); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1023:1: ( (lv_items_1_0= ruleJsonObjectValue ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1024:1: (lv_items_1_0= ruleJsonObjectValue )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1024:1: (lv_items_1_0= ruleJsonObjectValue )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1025:3: lv_items_1_0= ruleJsonObjectValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2037);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1041:2: (otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=RULE_STRING && LA15_1<=RULE_JSON_NUMBER)||LA15_1==31||LA15_1==35||(LA15_1>=43 && LA15_1<=47)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1041:4: otherlv_2= ',' ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleJsonArray2050); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1045:1: ( (lv_items_3_0= ruleJsonObjectValue ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1046:1: (lv_items_3_0= ruleJsonObjectValue )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1046:1: (lv_items_3_0= ruleJsonObjectValue )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1047:3: lv_items_3_0= ruleJsonObjectValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2071);
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
            	    break loop15;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1063:4: (otherlv_4= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1063:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleJsonArray2086); 

                        	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleJsonArray2100); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1079:1: entryRuleMobgenResourceDefinition returns [EObject current=null] : iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF ;
    public final EObject entryRuleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobgenResourceDefinition = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1080:2: (iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1081:2: iv_ruleMobgenResourceDefinition= ruleMobgenResourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getMobgenResourceDefinitionRule()); 
            pushFollow(FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition2136);
            iv_ruleMobgenResourceDefinition=ruleMobgenResourceDefinition();

            state._fsp--;

             current =iv_ruleMobgenResourceDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMobgenResourceDefinition2146); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1088:1: ruleMobgenResourceDefinition returns [EObject current=null] : (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance ) ;
    public final EObject ruleMobgenResourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_MapInstance_0 = null;

        EObject this_EnumInstance_1 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1091:28: ( (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1092:1: (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1092:1: (this_MapInstance_0= ruleMapInstance | this_EnumInstance_1= ruleEnumInstance )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1093:5: this_MapInstance_0= ruleMapInstance
                    {
                     
                            newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getMapInstanceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition2193);
                    this_MapInstance_0=ruleMapInstance();

                    state._fsp--;

                     
                            current = this_MapInstance_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1103:5: this_EnumInstance_1= ruleEnumInstance
                    {
                     
                            newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition2220);
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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1119:1: entryRuleEnumInstance returns [EObject current=null] : iv_ruleEnumInstance= ruleEnumInstance EOF ;
    public final EObject entryRuleEnumInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1120:2: (iv_ruleEnumInstance= ruleEnumInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1121:2: iv_ruleEnumInstance= ruleEnumInstance EOF
            {
             newCompositeNode(grammarAccess.getEnumInstanceRule()); 
            pushFollow(FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2255);
            iv_ruleEnumInstance=ruleEnumInstance();

            state._fsp--;

             current =iv_ruleEnumInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumInstance2265); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1128:1: ruleEnumInstance returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1131:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1132:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1132:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1132:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )* (otherlv_6= ',' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleEnumInstance2302); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1136:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1137:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1137:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1138:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2319); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleEnumInstance2336); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1158:1: ( (lv_values_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1159:1: (lv_values_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1159:1: (lv_values_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1160:3: lv_values_3_0= RULE_ID
            {
            lv_values_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2353); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1176:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==RULE_ID) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1176:4: otherlv_4= ',' ( (lv_values_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleEnumInstance2371); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1180:1: ( (lv_values_5_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1181:1: (lv_values_5_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1181:1: (lv_values_5_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1182:3: lv_values_5_0= RULE_ID
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumInstance2388); 

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
            	    break loop18;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1198:4: (otherlv_6= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1198:6: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleEnumInstance2408); 

                        	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleEnumInstance2422); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1214:1: entryRuleMapInstance returns [EObject current=null] : iv_ruleMapInstance= ruleMapInstance EOF ;
    public final EObject entryRuleMapInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapInstance = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1215:2: (iv_ruleMapInstance= ruleMapInstance EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1216:2: iv_ruleMapInstance= ruleMapInstance EOF
            {
             newCompositeNode(grammarAccess.getMapInstanceRule()); 
            pushFollow(FOLLOW_ruleMapInstance_in_entryRuleMapInstance2458);
            iv_ruleMapInstance=ruleMapInstance();

            state._fsp--;

             current =iv_ruleMapInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapInstance2468); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1223:1: ruleMapInstance returns [EObject current=null] : (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1226:28: ( (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1227:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1227:1: (otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1227:3: otherlv_0= 'map' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) ) (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )* (otherlv_10= ',' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleMapInstance2505); 

                	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1231:1: ( (lv_name_1_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1232:1: (lv_name_1_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1232:1: (lv_name_1_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1233:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2522); 

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

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleMapInstance2539); 

                	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1253:1: ( ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1253:2: ( (lv_keys_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_values_5_0= ruleNestedType ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1253:2: ( (lv_keys_3_0= RULE_ID ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1254:1: (lv_keys_3_0= RULE_ID )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1254:1: (lv_keys_3_0= RULE_ID )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1255:3: lv_keys_3_0= RULE_ID
            {
            lv_keys_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2557); 

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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleMapInstance2574); 

                	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getColonKeyword_3_1());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1275:1: ( (lv_values_5_0= ruleNestedType ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1276:1: (lv_values_5_0= ruleNestedType )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1276:1: (lv_values_5_0= ruleNestedType )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1277:3: lv_values_5_0= ruleNestedType
            {
             
            	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2595);
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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1293:3: (otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_ID) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1293:5: otherlv_6= ',' ( (lv_keys_7_0= RULE_ID ) ) otherlv_8= ':' ( (lv_values_9_0= ruleNestedType ) )
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleMapInstance2609); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1297:1: ( (lv_keys_7_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1298:1: (lv_keys_7_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1298:1: (lv_keys_7_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1299:3: lv_keys_7_0= RULE_ID
            	    {
            	    lv_keys_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapInstance2626); 

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

            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleMapInstance2643); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMapInstanceAccess().getColonKeyword_4_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1319:1: ( (lv_values_9_0= ruleNestedType ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1320:1: (lv_values_9_0= ruleNestedType )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1320:1: (lv_values_9_0= ruleNestedType )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1321:3: lv_values_9_0= ruleNestedType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNestedType_in_ruleMapInstance2664);
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
            	    break loop20;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1337:4: (otherlv_10= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1337:6: otherlv_10= ','
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleMapInstance2679); 

                        	newLeafNode(otherlv_10, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleMapInstance2693); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1353:1: entryRuleStringList returns [EObject current=null] : iv_ruleStringList= ruleStringList EOF ;
    public final EObject entryRuleStringList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringList = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1354:2: (iv_ruleStringList= ruleStringList EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1355:2: iv_ruleStringList= ruleStringList EOF
            {
             newCompositeNode(grammarAccess.getStringListRule()); 
            pushFollow(FOLLOW_ruleStringList_in_entryRuleStringList2729);
            iv_ruleStringList=ruleStringList();

            state._fsp--;

             current =iv_ruleStringList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringList2739); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1362:1: ruleStringList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1365:28: ( (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1366:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1366:1: (otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']' )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1366:3: otherlv_0= '[' ( (lv_values_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )* (otherlv_4= ',' )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleStringList2776); 

                	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
                
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1370:1: ( (lv_values_1_0= RULE_STRING ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1371:1: (lv_values_1_0= RULE_STRING )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1371:1: (lv_values_1_0= RULE_STRING )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1372:3: lv_values_1_0= RULE_STRING
            {
            lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList2793); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1388:2: (otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==RULE_STRING) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1388:4: otherlv_2= ',' ( (lv_values_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleStringList2811); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1392:1: ( (lv_values_3_0= RULE_STRING ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1393:1: (lv_values_3_0= RULE_STRING )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1393:1: (lv_values_3_0= RULE_STRING )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1394:3: lv_values_3_0= RULE_STRING
            	    {
            	    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringList2828); 

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
            	    break loop22;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1410:4: (otherlv_4= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1410:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleStringList2848); 

                        	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleStringList2862); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1426:1: entryRuleNestedType returns [EObject current=null] : iv_ruleNestedType= ruleNestedType EOF ;
    public final EObject entryRuleNestedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedType = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1427:2: (iv_ruleNestedType= ruleNestedType EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1428:2: iv_ruleNestedType= ruleNestedType EOF
            {
             newCompositeNode(grammarAccess.getNestedTypeRule()); 
            pushFollow(FOLLOW_ruleNestedType_in_entryRuleNestedType2898);
            iv_ruleNestedType=ruleNestedType();

            state._fsp--;

             current =iv_ruleNestedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedType2908); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1435:1: ruleNestedType returns [EObject current=null] : ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNestedType() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_list_0_0 = null;


         enterRule(); 
            
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1438:28: ( ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1439:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1439:1: ( ( (lv_list_0_0= ruleStringList ) ) | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1439:2: ( (lv_list_0_0= ruleStringList ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1439:2: ( (lv_list_0_0= ruleStringList ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1440:1: (lv_list_0_0= ruleStringList )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1440:1: (lv_list_0_0= ruleStringList )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1441:3: lv_list_0_0= ruleStringList
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringList_in_ruleNestedType2954);
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
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1458:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1458:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1459:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1459:1: (lv_string_1_0= RULE_STRING )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1460:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNestedType2977); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1484:1: entryRuleURI returns [EObject current=null] : iv_ruleURI= ruleURI EOF ;
    public final EObject entryRuleURI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURI = null;


        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1485:2: (iv_ruleURI= ruleURI EOF )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1486:2: iv_ruleURI= ruleURI EOF
            {
             newCompositeNode(grammarAccess.getURIRule()); 
            pushFollow(FOLLOW_ruleURI_in_entryRuleURI3018);
            iv_ruleURI=ruleURI();

            state._fsp--;

             current =iv_ruleURI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURI3028); 

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
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1493:1: ruleURI returns [EObject current=null] : ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* ) ;
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
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1496:28: ( ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1497:1: ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1497:1: ( ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )* )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1497:2: ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) ) ( (lv_path_1_0= RULE_URL_PATH ) ) (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )* ( (lv_query_6_0= RULE_URL_QUERY ) ) (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )*
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1497:2: ( (lv_urlPrefix_0_0= RULE_URL_PREFIX ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1498:1: (lv_urlPrefix_0_0= RULE_URL_PREFIX )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1498:1: (lv_urlPrefix_0_0= RULE_URL_PREFIX )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1499:3: lv_urlPrefix_0_0= RULE_URL_PREFIX
            {
            lv_urlPrefix_0_0=(Token)match(input,RULE_URL_PREFIX,FOLLOW_RULE_URL_PREFIX_in_ruleURI3070); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1515:2: ( (lv_path_1_0= RULE_URL_PATH ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1516:1: (lv_path_1_0= RULE_URL_PATH )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1516:1: (lv_path_1_0= RULE_URL_PATH )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1517:3: lv_path_1_0= RULE_URL_PATH
            {
            lv_path_1_0=(Token)match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_ruleURI3092); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1533:2: (otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1533:4: otherlv_2= '{' ( (lv_pathParameters_3_0= RULE_ID ) ) otherlv_4= '}' ( (lv_pathSuffix_5_0= RULE_URL_PATH ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleURI3110); 

            	        	newLeafNode(otherlv_2, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_2_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1537:1: ( (lv_pathParameters_3_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:1: (lv_pathParameters_3_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1538:1: (lv_pathParameters_3_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1539:3: lv_pathParameters_3_0= RULE_ID
            	    {
            	    lv_pathParameters_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI3127); 

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

            	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleURI3144); 

            	        	newLeafNode(otherlv_4, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_2_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1559:1: ( (lv_pathSuffix_5_0= RULE_URL_PATH ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:1: (lv_pathSuffix_5_0= RULE_URL_PATH )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1560:1: (lv_pathSuffix_5_0= RULE_URL_PATH )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1561:3: lv_pathSuffix_5_0= RULE_URL_PATH
            	    {
            	    lv_pathSuffix_5_0=(Token)match(input,RULE_URL_PATH,FOLLOW_RULE_URL_PATH_in_ruleURI3161); 

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
            	    break loop25;
                }
            } while (true);

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1577:4: ( (lv_query_6_0= RULE_URL_QUERY ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1578:1: (lv_query_6_0= RULE_URL_QUERY )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1578:1: (lv_query_6_0= RULE_URL_QUERY )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1579:3: lv_query_6_0= RULE_URL_QUERY
            {
            lv_query_6_0=(Token)match(input,RULE_URL_QUERY,FOLLOW_RULE_URL_QUERY_in_ruleURI3185); 

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

            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1595:2: (otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1595:4: otherlv_7= '{' ( (lv_queryParameters_8_0= RULE_ID ) ) otherlv_9= '}' ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) )
            	    {
            	    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleURI3203); 

            	        	newLeafNode(otherlv_7, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_4_0());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1599:1: ( (lv_queryParameters_8_0= RULE_ID ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1600:1: (lv_queryParameters_8_0= RULE_ID )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1600:1: (lv_queryParameters_8_0= RULE_ID )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1601:3: lv_queryParameters_8_0= RULE_ID
            	    {
            	    lv_queryParameters_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURI3220); 

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

            	    otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleURI3237); 

            	        	newLeafNode(otherlv_9, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_4_2());
            	        
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1621:1: ( (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX ) )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1622:1: (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX )
            	    {
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1622:1: (lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX )
            	    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1623:3: lv_querySuffix_10_0= RULE_URL_QUERY_SUFFIX
            	    {
            	    lv_querySuffix_10_0=(Token)match(input,RULE_URL_QUERY_SUFFIX,FOLLOW_RULE_URL_QUERY_SUFFIX_in_ruleURI3254); 

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
            	    break loop26;
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


    // $ANTLR start "ruleRestfulMethods"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1647:1: ruleRestfulMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'GET' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleRestfulMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1649:28: ( ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'GET' ) | (enumLiteral_3= 'DELETE' ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1650:1: ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'GET' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1650:1: ( (enumLiteral_0= 'PUT' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'GET' ) | (enumLiteral_3= 'DELETE' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt27=1;
                }
                break;
            case 40:
                {
                alt27=2;
                }
                break;
            case 41:
                {
                alt27=3;
                }
                break;
            case 42:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1650:2: (enumLiteral_0= 'PUT' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1650:2: (enumLiteral_0= 'PUT' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1650:4: enumLiteral_0= 'PUT'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleRestfulMethods3311); 

                            current = grammarAccess.getRestfulMethodsAccess().getPutEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRestfulMethodsAccess().getPutEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1656:6: (enumLiteral_1= 'POST' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1656:6: (enumLiteral_1= 'POST' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1656:8: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleRestfulMethods3328); 

                            current = grammarAccess.getRestfulMethodsAccess().getPostEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRestfulMethodsAccess().getPostEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1662:6: (enumLiteral_2= 'GET' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1662:6: (enumLiteral_2= 'GET' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1662:8: enumLiteral_2= 'GET'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleRestfulMethods3345); 

                            current = grammarAccess.getRestfulMethodsAccess().getGetEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRestfulMethodsAccess().getGetEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1668:6: (enumLiteral_3= 'DELETE' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1668:6: (enumLiteral_3= 'DELETE' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1668:8: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_42_in_ruleRestfulMethods3362); 

                            current = grammarAccess.getRestfulMethodsAccess().getDeleteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRestfulMethodsAccess().getDeleteEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleRestfulMethods"


    // $ANTLR start "ruleJsonMetaScalarType"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1678:1: ruleJsonMetaScalarType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'string' ) ) ;
    public final Enumerator ruleJsonMetaScalarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1680:28: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'string' ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1681:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'string' ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1681:1: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'number' ) | (enumLiteral_2= 'string' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt28=1;
                }
                break;
            case 44:
                {
                alt28=2;
                }
                break;
            case 45:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1681:2: (enumLiteral_0= 'boolean' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1681:2: (enumLiteral_0= 'boolean' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1681:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_43_in_ruleJsonMetaScalarType3407); 

                            current = grammarAccess.getJsonMetaScalarTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJsonMetaScalarTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1687:6: (enumLiteral_1= 'number' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1687:6: (enumLiteral_1= 'number' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1687:8: enumLiteral_1= 'number'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_44_in_ruleJsonMetaScalarType3424); 

                            current = grammarAccess.getJsonMetaScalarTypeAccess().getNUMBEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJsonMetaScalarTypeAccess().getNUMBEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1693:6: (enumLiteral_2= 'string' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1693:6: (enumLiteral_2= 'string' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1693:8: enumLiteral_2= 'string'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleJsonMetaScalarType3441); 

                            current = grammarAccess.getJsonMetaScalarTypeAccess().getSTRINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getJsonMetaScalarTypeAccess().getSTRINGEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleJsonMetaScalarType"


    // $ANTLR start "ruleJsonLiteralBoolean"
    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1703:1: ruleJsonLiteralBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleJsonLiteralBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1705:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1706:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1706:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            else if ( (LA29_0==47) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1706:2: (enumLiteral_0= 'true' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1706:2: (enumLiteral_0= 'true' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1706:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleJsonLiteralBoolean3486); 

                            current = grammarAccess.getJsonLiteralBooleanAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJsonLiteralBooleanAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1712:6: (enumLiteral_1= 'false' )
                    {
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1712:6: (enumLiteral_1= 'false' )
                    // ../mobgen/src-gen/nl/sison/dsl/parser/antlr/internal/InternalMobgen.g:1712:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_47_in_ruleJsonLiteralBoolean3503); 

                            current = grammarAccess.getJsonLiteralBooleanAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJsonLiteralBooleanAccess().getFalseEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleJsonLiteralBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMobgen_in_entryRuleMobgen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_ruleMobgen131 = new BitSet(new long[]{0x0000006000080002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_ruleMobgen158 = new BitSet(new long[]{0x0000006000080002L});
    public static final BitSet FOLLOW_ruleMobgenCallDefinition_in_entryRuleMobgenCallDefinition195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenCallDefinition205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleMobgenCallDefinition242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenCallDefinition259 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMobgenCallDefinition276 = new BitSet(new long[]{0x0000078000000000L});
    public static final BitSet FOLLOW_ruleRestfulMethods_in_ruleMobgenCallDefinition297 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMobgenCallDefinition309 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleURI_in_ruleMobgenCallDefinition330 = new BitSet(new long[]{0x0000000028400002L});
    public static final BitSet FOLLOW_22_in_ruleMobgenCallDefinition343 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMobgenCallDefinition355 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMobgenCallDefinition367 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMobgenCallDefinition379 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition400 = new BitSet(new long[]{0x000000002A000002L});
    public static final BitSet FOLLOW_25_in_ruleMobgenCallDefinition413 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMobgenCallDefinition425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_ruleMobgenCallDefinition446 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_27_in_ruleMobgenCallDefinition463 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMobgenCallDefinition475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition496 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleMobgenCallDefinition511 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleMobgenCallDefinition523 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_ruleMobgenCallDefinition544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeader_in_entryRuleMobgenHeader582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeader592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenHeader634 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMobgenHeader651 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMobgenHeader663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader684 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleMobgenHeader697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_ruleMobgenHeader718 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleMobgenHeader733 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMobgenHeader747 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMobgenHeader759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderKeyValuePair_in_entryRuleMobgenHeaderKeyValuePair795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderKeyValuePair805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair847 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMobgenHeaderKeyValuePair864 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMobgenHeaderKeyValuePair882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_ruleMobgenHeaderKeyValuePair914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenHeaderParameter_in_entryRuleMobgenHeaderParameter951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenHeaderParameter961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMobgenHeaderParameter998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenHeaderParameter1015 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMobgenHeaderParameter1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenJson_in_entryRuleMobgenJson1068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenJson1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMobgenJson1120 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMobgenJson1137 = new BitSet(new long[]{0x0000F808800003E0L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleMobgenJson1158 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMobgenJson1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_entryRuleJsonObjectValue1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObjectValue1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_ruleJsonObjectValue1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_ruleJsonObjectValue1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonCompositeValue_in_entryRuleJsonCompositeValue1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonCompositeValue1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleJsonCompositeValue1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonCompositeValue1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralValue_in_entryRuleJsonLiteralValue1444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonLiteralValue1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonLiteralValue1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_OBJECT_in_ruleJsonLiteralValue1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTY_JSON_ARRAY_in_ruleJsonLiteralValue1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_LITERAL_NULL_in_ruleJsonLiteralValue1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NUMBER_in_ruleJsonLiteralValue1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonLiteralBoolean_in_ruleJsonLiteralValue1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonMetaScalarType_in_ruleJsonLiteralValue1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject1676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleJsonObject1723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1744 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleJsonObject1757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_ruleJsonObject1778 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleJsonObject1793 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleJsonObject1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonKeyValuePair_in_entryRuleJsonKeyValuePair1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonKeyValuePair1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonKeyValuePair1895 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleJsonKeyValuePair1912 = new BitSet(new long[]{0x0000F808800003E0L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonKeyValuePair1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleJsonArray2016 = new BitSet(new long[]{0x0000F808800003E0L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2037 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_32_in_ruleJsonArray2050 = new BitSet(new long[]{0x0000F808800003E0L});
    public static final BitSet FOLLOW_ruleJsonObjectValue_in_ruleJsonArray2071 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_32_in_ruleJsonArray2086 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleJsonArray2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMobgenResourceDefinition_in_entryRuleMobgenResourceDefinition2136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMobgenResourceDefinition2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_ruleMobgenResourceDefinition2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_ruleMobgenResourceDefinition2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumInstance_in_entryRuleEnumInstance2255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumInstance2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEnumInstance2302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2319 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleEnumInstance2336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2353 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleEnumInstance2371 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumInstance2388 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleEnumInstance2408 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleEnumInstance2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapInstance_in_entryRuleMapInstance2458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapInstance2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleMapInstance2505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2522 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleMapInstance2539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2557 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapInstance2574 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2595 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleMapInstance2609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapInstance2626 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMapInstance2643 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_ruleNestedType_in_ruleMapInstance2664 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleMapInstance2679 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMapInstance2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_entryRuleStringList2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringList2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStringList2776 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList2793 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_32_in_ruleStringList2811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringList2828 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_32_in_ruleStringList2848 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleStringList2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedType_in_entryRuleNestedType2898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedType2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringList_in_ruleNestedType2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNestedType2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURI_in_entryRuleURI3018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURI3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_URL_PREFIX_in_ruleURI3070 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_ruleURI3092 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_31_in_ruleURI3110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI3127 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleURI3144 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_URL_PATH_in_ruleURI3161 = new BitSet(new long[]{0x0000000080001000L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_in_ruleURI3185 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleURI3203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURI3220 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleURI3237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_URL_QUERY_SUFFIX_in_ruleURI3254 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_39_in_ruleRestfulMethods3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRestfulMethods3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRestfulMethods3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRestfulMethods3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleJsonMetaScalarType3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleJsonMetaScalarType3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleJsonMetaScalarType3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleJsonLiteralBoolean3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleJsonLiteralBoolean3503 = new BitSet(new long[]{0x0000000000000002L});

}