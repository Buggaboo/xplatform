package nl.sison.dsl.mobgen.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.sison.dsl.mobgen.services.JsonGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_JSON_BOOLEAN", "RULE_JSON_NULL", "RULE_INT", "RULE_JSON_FLOAT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'?'", "':'", "'['", "']'", "'enum'", "'('", "')'", "'UTC'", "'datetime'"
    };
    public static final int RULE_JSON_NULL=6;
    public static final int RULE_JSON_BOOLEAN=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_JSON_FLOAT=8;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJsonGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonGenParser.tokenNames; }
    public String getGrammarFileName() { return "../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g"; }



     	private JsonGenGrammarAccess grammarAccess;
     	
        public InternalJsonGenParser(TokenStream input, JsonGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "JsonObject";	
       	}
       	
       	@Override
       	protected JsonGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleJsonObject"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:67:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:68:2: (iv_ruleJsonObject= ruleJsonObject EOF )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:69:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_ruleJsonObject_in_entryRuleJsonObject75);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonObject85); 

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
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:76:1: ruleJsonObject returns [EObject current=null] : (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleJsonObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_1_0 = null;

        EObject lv_members_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:79:28: ( (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:80:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:80:1: (otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:80:3: otherlv_0= '{' ( (lv_members_1_0= ruleMember ) ) (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleJsonObject122); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
                
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:84:1: ( (lv_members_1_0= ruleMember ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:85:1: (lv_members_1_0= ruleMember )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:85:1: (lv_members_1_0= ruleMember )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:86:3: lv_members_1_0= ruleMember
            {
             
            	        newCompositeNode(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMember_in_ruleJsonObject143);
            lv_members_1_0=ruleMember();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonObjectRule());
            	        }
                   		add(
                   			current, 
                   			"members",
                    		lv_members_1_0, 
                    		"Member");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:102:2: (otherlv_2= ',' ( (lv_members_3_0= ruleMember ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:102:4: otherlv_2= ',' ( (lv_members_3_0= ruleMember ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJsonObject156); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
            	        
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:106:1: ( (lv_members_3_0= ruleMember ) )
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:107:1: (lv_members_3_0= ruleMember )
            	    {
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:107:1: (lv_members_3_0= ruleMember )
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:108:3: lv_members_3_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleJsonObject177);
            	    lv_members_3_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJsonObjectRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_3_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleJsonObject191); 

                	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleMember"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:136:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:137:2: (iv_ruleMember= ruleMember EOF )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:138:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember227);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember237); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:145:1: ruleMember returns [EObject current=null] : ( ( (lv_optional_0_0= '?' ) )? ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJsonValue ) ) ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:148:28: ( ( ( (lv_optional_0_0= '?' ) )? ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJsonValue ) ) ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:149:1: ( ( (lv_optional_0_0= '?' ) )? ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJsonValue ) ) )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:149:1: ( ( (lv_optional_0_0= '?' ) )? ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJsonValue ) ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:149:2: ( (lv_optional_0_0= '?' ) )? ( (lv_key_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_value_3_0= ruleJsonValue ) )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:149:2: ( (lv_optional_0_0= '?' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:150:1: (lv_optional_0_0= '?' )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:150:1: (lv_optional_0_0= '?' )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:151:3: lv_optional_0_0= '?'
                    {
                    lv_optional_0_0=(Token)match(input,17,FOLLOW_17_in_ruleMember280); 

                            newLeafNode(lv_optional_0_0, grammarAccess.getMemberAccess().getOptionalQuestionMarkKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMemberRule());
                    	        }
                           		setWithLastConsumed(current, "optional", true, "?");
                    	    

                    }


                    }
                    break;

            }

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:164:3: ( (lv_key_1_0= RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:165:1: (lv_key_1_0= RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:165:1: (lv_key_1_0= RULE_STRING )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:166:3: lv_key_1_0= RULE_STRING
            {
            lv_key_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMember311); 

            			newLeafNode(lv_key_1_0, grammarAccess.getMemberAccess().getKeySTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMemberRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMember328); 

                	newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getColonKeyword_2());
                
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:186:1: ( (lv_value_3_0= ruleJsonValue ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:187:1: (lv_value_3_0= ruleJsonValue )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:187:1: (lv_value_3_0= ruleJsonValue )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:188:3: lv_value_3_0= ruleJsonValue
            {
             
            	        newCompositeNode(grammarAccess.getMemberAccess().getValueJsonValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonValue_in_ruleMember349);
            lv_value_3_0=ruleJsonValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMemberRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"JsonValue");
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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleJsonValue"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:212:1: entryRuleJsonValue returns [EObject current=null] : iv_ruleJsonValue= ruleJsonValue EOF ;
    public final EObject entryRuleJsonValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonValue = null;


        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:213:2: (iv_ruleJsonValue= ruleJsonValue EOF )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:214:2: iv_ruleJsonValue= ruleJsonValue EOF
            {
             newCompositeNode(grammarAccess.getJsonValueRule()); 
            pushFollow(FOLLOW_ruleJsonValue_in_entryRuleJsonValue385);
            iv_ruleJsonValue=ruleJsonValue();

            state._fsp--;

             current =iv_ruleJsonValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonValue395); 

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
    // $ANTLR end "entryRuleJsonValue"


    // $ANTLR start "ruleJsonValue"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:221:1: ruleJsonValue returns [EObject current=null] : ( ( (lv_obj_0_0= ruleJsonObject ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_array_2_0= ruleJsonArray ) ) | ( (lv_bool_3_0= RULE_JSON_BOOLEAN ) ) | ( (lv_null_4_0= RULE_JSON_NULL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_float_6_0= RULE_JSON_FLOAT ) ) | ( (lv_strFromEnum_7_0= ruleExJsonEnum ) ) | ( (lv_datetime_8_0= ruleExJsonDateTime ) ) ) ;
    public final EObject ruleJsonValue() throws RecognitionException {
        EObject current = null;

        Token lv_str_1_0=null;
        Token lv_bool_3_0=null;
        Token lv_null_4_0=null;
        Token lv_int_5_0=null;
        Token lv_float_6_0=null;
        EObject lv_obj_0_0 = null;

        EObject lv_array_2_0 = null;

        EObject lv_strFromEnum_7_0 = null;

        EObject lv_datetime_8_0 = null;


         enterRule(); 
            
        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:224:28: ( ( ( (lv_obj_0_0= ruleJsonObject ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_array_2_0= ruleJsonArray ) ) | ( (lv_bool_3_0= RULE_JSON_BOOLEAN ) ) | ( (lv_null_4_0= RULE_JSON_NULL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_float_6_0= RULE_JSON_FLOAT ) ) | ( (lv_strFromEnum_7_0= ruleExJsonEnum ) ) | ( (lv_datetime_8_0= ruleExJsonDateTime ) ) ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:225:1: ( ( (lv_obj_0_0= ruleJsonObject ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_array_2_0= ruleJsonArray ) ) | ( (lv_bool_3_0= RULE_JSON_BOOLEAN ) ) | ( (lv_null_4_0= RULE_JSON_NULL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_float_6_0= RULE_JSON_FLOAT ) ) | ( (lv_strFromEnum_7_0= ruleExJsonEnum ) ) | ( (lv_datetime_8_0= ruleExJsonDateTime ) ) )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:225:1: ( ( (lv_obj_0_0= ruleJsonObject ) ) | ( (lv_str_1_0= RULE_STRING ) ) | ( (lv_array_2_0= ruleJsonArray ) ) | ( (lv_bool_3_0= RULE_JSON_BOOLEAN ) ) | ( (lv_null_4_0= RULE_JSON_NULL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_float_6_0= RULE_JSON_FLOAT ) ) | ( (lv_strFromEnum_7_0= ruleExJsonEnum ) ) | ( (lv_datetime_8_0= ruleExJsonDateTime ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case RULE_JSON_BOOLEAN:
                {
                alt3=4;
                }
                break;
            case RULE_JSON_NULL:
                {
                alt3=5;
                }
                break;
            case RULE_INT:
                {
                alt3=6;
                }
                break;
            case RULE_JSON_FLOAT:
                {
                alt3=7;
                }
                break;
            case 21:
                {
                alt3=8;
                }
                break;
            case 24:
            case 25:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:225:2: ( (lv_obj_0_0= ruleJsonObject ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:225:2: ( (lv_obj_0_0= ruleJsonObject ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:226:1: (lv_obj_0_0= ruleJsonObject )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:226:1: (lv_obj_0_0= ruleJsonObject )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:227:3: lv_obj_0_0= ruleJsonObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonValueAccess().getObjJsonObjectParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonObject_in_ruleJsonValue441);
                    lv_obj_0_0=ruleJsonObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonValueRule());
                    	        }
                           		set(
                           			current, 
                           			"obj",
                            		lv_obj_0_0, 
                            		"JsonObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:244:6: ( (lv_str_1_0= RULE_STRING ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:244:6: ( (lv_str_1_0= RULE_STRING ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:245:1: (lv_str_1_0= RULE_STRING )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:245:1: (lv_str_1_0= RULE_STRING )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:246:3: lv_str_1_0= RULE_STRING
                    {
                    lv_str_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJsonValue464); 

                    			newLeafNode(lv_str_1_0, grammarAccess.getJsonValueAccess().getStrSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"str",
                            		lv_str_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:263:6: ( (lv_array_2_0= ruleJsonArray ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:263:6: ( (lv_array_2_0= ruleJsonArray ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:264:1: (lv_array_2_0= ruleJsonArray )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:264:1: (lv_array_2_0= ruleJsonArray )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:265:3: lv_array_2_0= ruleJsonArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonValueAccess().getArrayJsonArrayParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJsonArray_in_ruleJsonValue496);
                    lv_array_2_0=ruleJsonArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonValueRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_2_0, 
                            		"JsonArray");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:282:6: ( (lv_bool_3_0= RULE_JSON_BOOLEAN ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:282:6: ( (lv_bool_3_0= RULE_JSON_BOOLEAN ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:283:1: (lv_bool_3_0= RULE_JSON_BOOLEAN )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:283:1: (lv_bool_3_0= RULE_JSON_BOOLEAN )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:284:3: lv_bool_3_0= RULE_JSON_BOOLEAN
                    {
                    lv_bool_3_0=(Token)match(input,RULE_JSON_BOOLEAN,FOLLOW_RULE_JSON_BOOLEAN_in_ruleJsonValue519); 

                    			newLeafNode(lv_bool_3_0, grammarAccess.getJsonValueAccess().getBoolJSON_BOOLEANTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"bool",
                            		true, 
                            		"JSON_BOOLEAN");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:301:6: ( (lv_null_4_0= RULE_JSON_NULL ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:301:6: ( (lv_null_4_0= RULE_JSON_NULL ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:302:1: (lv_null_4_0= RULE_JSON_NULL )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:302:1: (lv_null_4_0= RULE_JSON_NULL )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:303:3: lv_null_4_0= RULE_JSON_NULL
                    {
                    lv_null_4_0=(Token)match(input,RULE_JSON_NULL,FOLLOW_RULE_JSON_NULL_in_ruleJsonValue547); 

                    			newLeafNode(lv_null_4_0, grammarAccess.getJsonValueAccess().getNullJSON_NULLTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"null",
                            		true, 
                            		"JSON_NULL");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:320:6: ( (lv_int_5_0= RULE_INT ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:320:6: ( (lv_int_5_0= RULE_INT ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:321:1: (lv_int_5_0= RULE_INT )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:321:1: (lv_int_5_0= RULE_INT )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:322:3: lv_int_5_0= RULE_INT
                    {
                    lv_int_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleJsonValue575); 

                    			newLeafNode(lv_int_5_0, grammarAccess.getJsonValueAccess().getIntINTTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		true, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:339:6: ( (lv_float_6_0= RULE_JSON_FLOAT ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:339:6: ( (lv_float_6_0= RULE_JSON_FLOAT ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:340:1: (lv_float_6_0= RULE_JSON_FLOAT )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:340:1: (lv_float_6_0= RULE_JSON_FLOAT )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:341:3: lv_float_6_0= RULE_JSON_FLOAT
                    {
                    lv_float_6_0=(Token)match(input,RULE_JSON_FLOAT,FOLLOW_RULE_JSON_FLOAT_in_ruleJsonValue603); 

                    			newLeafNode(lv_float_6_0, grammarAccess.getJsonValueAccess().getFloatJSON_FLOATTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getJsonValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"float",
                            		true, 
                            		"JSON_FLOAT");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:358:6: ( (lv_strFromEnum_7_0= ruleExJsonEnum ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:358:6: ( (lv_strFromEnum_7_0= ruleExJsonEnum ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:359:1: (lv_strFromEnum_7_0= ruleExJsonEnum )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:359:1: (lv_strFromEnum_7_0= ruleExJsonEnum )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:360:3: lv_strFromEnum_7_0= ruleExJsonEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonValueAccess().getStrFromEnumExJsonEnumParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExJsonEnum_in_ruleJsonValue635);
                    lv_strFromEnum_7_0=ruleExJsonEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonValueRule());
                    	        }
                           		set(
                           			current, 
                           			"strFromEnum",
                            		lv_strFromEnum_7_0, 
                            		"ExJsonEnum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:377:6: ( (lv_datetime_8_0= ruleExJsonDateTime ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:377:6: ( (lv_datetime_8_0= ruleExJsonDateTime ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:378:1: (lv_datetime_8_0= ruleExJsonDateTime )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:378:1: (lv_datetime_8_0= ruleExJsonDateTime )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:379:3: lv_datetime_8_0= ruleExJsonDateTime
                    {
                     
                    	        newCompositeNode(grammarAccess.getJsonValueAccess().getDatetimeExJsonDateTimeParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExJsonDateTime_in_ruleJsonValue662);
                    lv_datetime_8_0=ruleExJsonDateTime();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJsonValueRule());
                    	        }
                           		set(
                           			current, 
                           			"datetime",
                            		lv_datetime_8_0, 
                            		"ExJsonDateTime");
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
    // $ANTLR end "ruleJsonValue"


    // $ANTLR start "entryRuleJsonArray"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:403:1: entryRuleJsonArray returns [EObject current=null] : iv_ruleJsonArray= ruleJsonArray EOF ;
    public final EObject entryRuleJsonArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonArray = null;


        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:404:2: (iv_ruleJsonArray= ruleJsonArray EOF )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:405:2: iv_ruleJsonArray= ruleJsonArray EOF
            {
             newCompositeNode(grammarAccess.getJsonArrayRule()); 
            pushFollow(FOLLOW_ruleJsonArray_in_entryRuleJsonArray698);
            iv_ruleJsonArray=ruleJsonArray();

            state._fsp--;

             current =iv_ruleJsonArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJsonArray708); 

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
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:412:1: ruleJsonArray returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleJsonValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleJsonValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleJsonArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:415:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleJsonValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleJsonValue ) ) )* otherlv_4= ']' ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:416:1: (otherlv_0= '[' ( (lv_values_1_0= ruleJsonValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleJsonValue ) ) )* otherlv_4= ']' )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:416:1: (otherlv_0= '[' ( (lv_values_1_0= ruleJsonValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleJsonValue ) ) )* otherlv_4= ']' )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:416:3: otherlv_0= '[' ( (lv_values_1_0= ruleJsonValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleJsonValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleJsonArray745); 

                	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0());
                
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:420:1: ( (lv_values_1_0= ruleJsonValue ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:421:1: (lv_values_1_0= ruleJsonValue )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:421:1: (lv_values_1_0= ruleJsonValue )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:422:3: lv_values_1_0= ruleJsonValue
            {
             
            	        newCompositeNode(grammarAccess.getJsonArrayAccess().getValuesJsonValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJsonValue_in_ruleJsonArray766);
            lv_values_1_0=ruleJsonValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_1_0, 
                    		"JsonValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:438:2: (otherlv_2= ',' ( (lv_values_3_0= ruleJsonValue ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:438:4: otherlv_2= ',' ( (lv_values_3_0= ruleJsonValue ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleJsonArray779); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:442:1: ( (lv_values_3_0= ruleJsonValue ) )
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:443:1: (lv_values_3_0= ruleJsonValue )
            	    {
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:443:1: (lv_values_3_0= ruleJsonValue )
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:444:3: lv_values_3_0= ruleJsonValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJsonArrayAccess().getValuesJsonValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJsonValue_in_ruleJsonArray800);
            	    lv_values_3_0=ruleJsonValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJsonArrayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_3_0, 
            	            		"JsonValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleJsonArray814); 

                	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleExJsonEnum"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:472:1: entryRuleExJsonEnum returns [EObject current=null] : iv_ruleExJsonEnum= ruleExJsonEnum EOF ;
    public final EObject entryRuleExJsonEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExJsonEnum = null;


        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:473:2: (iv_ruleExJsonEnum= ruleExJsonEnum EOF )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:474:2: iv_ruleExJsonEnum= ruleExJsonEnum EOF
            {
             newCompositeNode(grammarAccess.getExJsonEnumRule()); 
            pushFollow(FOLLOW_ruleExJsonEnum_in_entryRuleExJsonEnum850);
            iv_ruleExJsonEnum=ruleExJsonEnum();

            state._fsp--;

             current =iv_ruleExJsonEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExJsonEnum860); 

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
    // $ANTLR end "entryRuleExJsonEnum"


    // $ANTLR start "ruleExJsonEnum"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:481:1: ruleExJsonEnum returns [EObject current=null] : (otherlv_0= 'enum' (otherlv_1= '{' | otherlv_2= '(' ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ')' | otherlv_7= '}' ) ) ;
    public final EObject ruleExJsonEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:484:28: ( (otherlv_0= 'enum' (otherlv_1= '{' | otherlv_2= '(' ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ')' | otherlv_7= '}' ) ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:485:1: (otherlv_0= 'enum' (otherlv_1= '{' | otherlv_2= '(' ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ')' | otherlv_7= '}' ) )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:485:1: (otherlv_0= 'enum' (otherlv_1= '{' | otherlv_2= '(' ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ')' | otherlv_7= '}' ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:485:3: otherlv_0= 'enum' (otherlv_1= '{' | otherlv_2= '(' ) ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* (otherlv_6= ')' | otherlv_7= '}' )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleExJsonEnum897); 

                	newLeafNode(otherlv_0, grammarAccess.getExJsonEnumAccess().getEnumKeyword_0());
                
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:489:1: (otherlv_1= '{' | otherlv_2= '(' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:489:3: otherlv_1= '{'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleExJsonEnum910); 

                        	newLeafNode(otherlv_1, grammarAccess.getExJsonEnumAccess().getLeftCurlyBracketKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:494:7: otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExJsonEnum928); 

                        	newLeafNode(otherlv_2, grammarAccess.getExJsonEnumAccess().getLeftParenthesisKeyword_1_1());
                        

                    }
                    break;

            }

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:498:2: ( (lv_values_3_0= RULE_STRING ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:499:1: (lv_values_3_0= RULE_STRING )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:499:1: (lv_values_3_0= RULE_STRING )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:500:3: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExJsonEnum946); 

            			newLeafNode(lv_values_3_0, grammarAccess.getExJsonEnumAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExJsonEnumRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:516:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:516:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExJsonEnum964); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExJsonEnumAccess().getCommaKeyword_3_0());
            	        
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:520:1: ( (lv_values_5_0= RULE_STRING ) )
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:521:1: (lv_values_5_0= RULE_STRING )
            	    {
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:521:1: (lv_values_5_0= RULE_STRING )
            	    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:522:3: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExJsonEnum981); 

            	    			newLeafNode(lv_values_5_0, grammarAccess.getExJsonEnumAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExJsonEnumRule());
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
            	    break loop6;
                }
            } while (true);

            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:538:4: (otherlv_6= ')' | otherlv_7= '}' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:538:6: otherlv_6= ')'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleExJsonEnum1001); 

                        	newLeafNode(otherlv_6, grammarAccess.getExJsonEnumAccess().getRightParenthesisKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:543:7: otherlv_7= '}'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleExJsonEnum1019); 

                        	newLeafNode(otherlv_7, grammarAccess.getExJsonEnumAccess().getRightCurlyBracketKeyword_4_1());
                        

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
    // $ANTLR end "ruleExJsonEnum"


    // $ANTLR start "entryRuleExJsonDateTime"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:555:1: entryRuleExJsonDateTime returns [EObject current=null] : iv_ruleExJsonDateTime= ruleExJsonDateTime EOF ;
    public final EObject entryRuleExJsonDateTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExJsonDateTime = null;


        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:556:2: (iv_ruleExJsonDateTime= ruleExJsonDateTime EOF )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:557:2: iv_ruleExJsonDateTime= ruleExJsonDateTime EOF
            {
             newCompositeNode(grammarAccess.getExJsonDateTimeRule()); 
            pushFollow(FOLLOW_ruleExJsonDateTime_in_entryRuleExJsonDateTime1056);
            iv_ruleExJsonDateTime=ruleExJsonDateTime();

            state._fsp--;

             current =iv_ruleExJsonDateTime; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExJsonDateTime1066); 

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
    // $ANTLR end "entryRuleExJsonDateTime"


    // $ANTLR start "ruleExJsonDateTime"
    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:564:1: ruleExJsonDateTime returns [EObject current=null] : ( ( (lv_utc_0_0= 'UTC' ) ) | (otherlv_1= 'datetime' otherlv_2= '(' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleExJsonDateTime() throws RecognitionException {
        EObject current = null;

        Token lv_utc_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_format_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:567:28: ( ( ( (lv_utc_0_0= 'UTC' ) ) | (otherlv_1= 'datetime' otherlv_2= '(' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= ')' ) ) )
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:568:1: ( ( (lv_utc_0_0= 'UTC' ) ) | (otherlv_1= 'datetime' otherlv_2= '(' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            {
            // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:568:1: ( ( (lv_utc_0_0= 'UTC' ) ) | (otherlv_1= 'datetime' otherlv_2= '(' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:568:2: ( (lv_utc_0_0= 'UTC' ) )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:568:2: ( (lv_utc_0_0= 'UTC' ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:569:1: (lv_utc_0_0= 'UTC' )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:569:1: (lv_utc_0_0= 'UTC' )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:570:3: lv_utc_0_0= 'UTC'
                    {
                    lv_utc_0_0=(Token)match(input,24,FOLLOW_24_in_ruleExJsonDateTime1109); 

                            newLeafNode(lv_utc_0_0, grammarAccess.getExJsonDateTimeAccess().getUtcUTCKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExJsonDateTimeRule());
                    	        }
                           		setWithLastConsumed(current, "utc", true, "UTC");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:584:6: (otherlv_1= 'datetime' otherlv_2= '(' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:584:6: (otherlv_1= 'datetime' otherlv_2= '(' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:584:8: otherlv_1= 'datetime' otherlv_2= '(' ( (lv_format_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleExJsonDateTime1141); 

                        	newLeafNode(otherlv_1, grammarAccess.getExJsonDateTimeAccess().getDatetimeKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleExJsonDateTime1153); 

                        	newLeafNode(otherlv_2, grammarAccess.getExJsonDateTimeAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:592:1: ( (lv_format_3_0= RULE_STRING ) )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:593:1: (lv_format_3_0= RULE_STRING )
                    {
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:593:1: (lv_format_3_0= RULE_STRING )
                    // ../nl.sison.dsl.mobgen.JsonGen/src-gen/nl/sison/dsl/mobgen/parser/antlr/internal/InternalJsonGen.g:594:3: lv_format_3_0= RULE_STRING
                    {
                    lv_format_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExJsonDateTime1170); 

                    			newLeafNode(lv_format_3_0, grammarAccess.getExJsonDateTimeAccess().getFormatSTRINGTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExJsonDateTimeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"format",
                            		lv_format_3_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleExJsonDateTime1187); 

                        	newLeafNode(otherlv_4, grammarAccess.getExJsonDateTimeAccess().getRightParenthesisKeyword_1_3());
                        

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
    // $ANTLR end "ruleExJsonDateTime"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleJsonObject_in_entryRuleJsonObject75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonObject85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleJsonObject122 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleJsonObject143 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleJsonObject156 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleJsonObject177 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleJsonObject191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleMember280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMember311 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMember328 = new BitSet(new long[]{0x00000000032841F0L});
    public static final BitSet FOLLOW_ruleJsonValue_in_ruleMember349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonValue_in_entryRuleJsonValue385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonValue395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonObject_in_ruleJsonValue441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJsonValue464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_ruleJsonValue496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_BOOLEAN_in_ruleJsonValue519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_NULL_in_ruleJsonValue547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleJsonValue575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JSON_FLOAT_in_ruleJsonValue603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExJsonEnum_in_ruleJsonValue635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExJsonDateTime_in_ruleJsonValue662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJsonArray_in_entryRuleJsonArray698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJsonArray708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleJsonArray745 = new BitSet(new long[]{0x00000000032841F0L});
    public static final BitSet FOLLOW_ruleJsonValue_in_ruleJsonArray766 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15_in_ruleJsonArray779 = new BitSet(new long[]{0x00000000032841F0L});
    public static final BitSet FOLLOW_ruleJsonValue_in_ruleJsonArray800 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_20_in_ruleJsonArray814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExJsonEnum_in_entryRuleExJsonEnum850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExJsonEnum860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExJsonEnum897 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_14_in_ruleExJsonEnum910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleExJsonEnum928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExJsonEnum946 = new BitSet(new long[]{0x0000000000818000L});
    public static final BitSet FOLLOW_15_in_ruleExJsonEnum964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExJsonEnum981 = new BitSet(new long[]{0x0000000000818000L});
    public static final BitSet FOLLOW_23_in_ruleExJsonEnum1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleExJsonEnum1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExJsonDateTime_in_entryRuleExJsonDateTime1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExJsonDateTime1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExJsonDateTime1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleExJsonDateTime1141 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleExJsonDateTime1153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExJsonDateTime1170 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExJsonDateTime1187 = new BitSet(new long[]{0x0000000000000002L});

}