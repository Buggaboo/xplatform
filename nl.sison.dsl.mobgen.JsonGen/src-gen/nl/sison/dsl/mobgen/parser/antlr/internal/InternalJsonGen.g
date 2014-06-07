/*
* generated by Xtext
*/
grammar InternalJsonGen;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package nl.sison.dsl.mobgen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleJsonObject
entryRuleJsonObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonObjectRule()); }
	 iv_ruleJsonObject=ruleJsonObject 
	 { $current=$iv_ruleJsonObject.current; } 
	 EOF 
;

// Rule JsonObject
ruleJsonObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getJsonObjectAccess().getLeftCurlyBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_1_0()); 
	    }
		lv_members_1_0=ruleMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_1_0, 
        		"Member");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getMembersMemberParserRuleCall_2_1_0()); 
	    }
		lv_members_3_0=ruleMember		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectRule());
	        }
       		add(
       			$current, 
       			"members",
        		lv_members_3_0, 
        		"Member");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleMember
entryRuleMember returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMemberRule()); }
	 iv_ruleMember=ruleMember 
	 { $current=$iv_ruleMember.current; } 
	 EOF 
;

// Rule Member
ruleMember returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_optional_0_0=	'?' 
    {
        newLeafNode(lv_optional_0_0, grammarAccess.getMemberAccess().getOptionalQuestionMarkKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMemberRule());
	        }
       		setWithLastConsumed($current, "optional", true, "?");
	    }

)
)?(
(
		lv_key_1_0=RULE_STRING
		{
			newLeafNode(lv_key_1_0, grammarAccess.getMemberAccess().getKeySTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMemberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_1_0, 
        		"STRING");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMemberAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMemberAccess().getValueJsonValueParserRuleCall_3_0()); 
	    }
		lv_value_3_0=ruleJsonValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMemberRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"JsonValue");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleJsonValue
entryRuleJsonValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonValueRule()); }
	 iv_ruleJsonValue=ruleJsonValue 
	 { $current=$iv_ruleJsonValue.current; } 
	 EOF 
;

// Rule JsonValue
ruleJsonValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getJsonValueAccess().getObjJsonObjectParserRuleCall_0_0()); 
	    }
		lv_obj_0_0=ruleJsonObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonValueRule());
	        }
       		set(
       			$current, 
       			"obj",
        		lv_obj_0_0, 
        		"JsonObject");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_str_1_0=RULE_STRING
		{
			newLeafNode(lv_str_1_0, grammarAccess.getJsonValueAccess().getStrSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"str",
        		lv_str_1_0, 
        		"STRING");
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonValueAccess().getArrayJsonArrayParserRuleCall_2_0()); 
	    }
		lv_array_2_0=ruleJsonArray		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonValueRule());
	        }
       		set(
       			$current, 
       			"array",
        		lv_array_2_0, 
        		"JsonArray");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_bool_3_0=RULE_JSON_BOOLEAN
		{
			newLeafNode(lv_bool_3_0, grammarAccess.getJsonValueAccess().getBoolJSON_BOOLEANTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"bool",
        		true, 
        		"JSON_BOOLEAN");
	    }

)
)
    |(
(
		lv_null_4_0=RULE_JSON_NULL
		{
			newLeafNode(lv_null_4_0, grammarAccess.getJsonValueAccess().getNullJSON_NULLTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"null",
        		true, 
        		"JSON_NULL");
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonValueAccess().getNumberJsonNumberParserRuleCall_5_0()); 
	    }
		lv_number_5_0=ruleJsonNumber		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonValueRule());
	        }
       		set(
       			$current, 
       			"number",
        		lv_number_5_0, 
        		"JsonNumber");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonValueAccess().getStrFromEnumExJsonEnumParserRuleCall_6_0()); 
	    }
		lv_strFromEnum_6_0=ruleExJsonEnum		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonValueRule());
	        }
       		set(
       			$current, 
       			"strFromEnum",
        		lv_strFromEnum_6_0, 
        		"ExJsonEnum");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_datetime_7_0=RULE_EX_JSON_UTC
		{
			newLeafNode(lv_datetime_7_0, grammarAccess.getJsonValueAccess().getDatetimeEX_JSON_UTCTerminalRuleCall_7_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonValueRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"datetime",
        		lv_datetime_7_0, 
        		"EX_JSON_UTC");
	    }

)
))
;





// Entry rule entryRuleJsonArray
entryRuleJsonArray returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonArrayRule()); }
	 iv_ruleJsonArray=ruleJsonArray 
	 { $current=$iv_ruleJsonArray.current; } 
	 EOF 
;

// Rule JsonArray
ruleJsonArray returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getJsonArrayAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonArrayAccess().getValuesJsonValueParserRuleCall_1_0()); 
	    }
		lv_values_1_0=ruleJsonValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonArrayRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_1_0, 
        		"JsonValue");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonArrayAccess().getValuesJsonValueParserRuleCall_2_1_0()); 
	    }
		lv_values_3_0=ruleJsonValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonArrayRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_3_0, 
        		"JsonValue");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleJsonNumber
entryRuleJsonNumber returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonNumberRule()); }
	 iv_ruleJsonNumber=ruleJsonNumber 
	 { $current=$iv_ruleJsonNumber.current; } 
	 EOF 
;

// Rule JsonNumber
ruleJsonNumber returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='-' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getJsonNumberAccess().getHyphenMinusKeyword_0());
    }
)?(this_INT_1=RULE_INT
    { 
    newLeafNode(this_INT_1, grammarAccess.getJsonNumberAccess().getINTTerminalRuleCall_1()); 
    }
)?(
(
		lv_float_2_0=	'.' 
    {
        newLeafNode(lv_float_2_0, grammarAccess.getJsonNumberAccess().getFloatFullStopKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonNumberRule());
	        }
       		setWithLastConsumed($current, "float", true, ".");
	    }

)
)(
(
		lv_intValue_3_0=RULE_INT
		{
			newLeafNode(lv_intValue_3_0, grammarAccess.getJsonNumberAccess().getIntValueINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonNumberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"intValue",
        		lv_intValue_3_0, 
        		"INT");
	    }

)
)((
(
(
		lv_exp_4_1=	'E' 
    {
        newLeafNode(lv_exp_4_1, grammarAccess.getJsonNumberAccess().getExpEKeyword_4_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonNumberRule());
	        }
       		setWithLastConsumed($current, "exp", true, null);
	    }

    |		lv_exp_4_2=	'e' 
    {
        newLeafNode(lv_exp_4_2, grammarAccess.getJsonNumberAccess().getExpEKeyword_4_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonNumberRule());
	        }
       		setWithLastConsumed($current, "exp", true, null);
	    }

)

)
)(	otherlv_5='-' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getJsonNumberAccess().getHyphenMinusKeyword_4_1());
    }
)?(
(
		lv_expValue_6_0=RULE_INT
		{
			newLeafNode(lv_expValue_6_0, grammarAccess.getJsonNumberAccess().getExpValueINTTerminalRuleCall_4_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonNumberRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"expValue",
        		lv_expValue_6_0, 
        		"INT");
	    }

)
))?)
;





// Entry rule entryRuleExJsonEnum
entryRuleExJsonEnum returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExJsonEnumRule()); }
	 iv_ruleExJsonEnum=ruleExJsonEnum 
	 { $current=$iv_ruleExJsonEnum.current; } 
	 EOF 
;

// Rule ExJsonEnum
ruleExJsonEnum returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enum' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExJsonEnumAccess().getEnumKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getExJsonEnumAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		lv_values_2_0=RULE_STRING
		{
			newLeafNode(lv_values_2_0, grammarAccess.getExJsonEnumAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExJsonEnumRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_2_0, 
        		"STRING");
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getExJsonEnumAccess().getCommaKeyword_3_0());
    }
(
(
		lv_values_4_0=RULE_STRING
		{
			newLeafNode(lv_values_4_0, grammarAccess.getExJsonEnumAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExJsonEnumRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_4_0, 
        		"STRING");
	    }

)
))	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getExJsonEnumAccess().getRightCurlyBracketKeyword_4());
    }
)
;





RULE_JSON_BOOLEAN : ('true'|'false'|'boolean');

RULE_JSON_NULL : 'null';

RULE_EX_JSON_UTC : 'UTC';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


