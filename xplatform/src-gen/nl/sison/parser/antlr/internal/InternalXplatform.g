/*
* generated by Xtext
*/
grammar InternalXplatform;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package nl.sison.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleXplatform
entryRuleXplatform returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getXplatformRule()); }
	 iv_ruleXplatform=ruleXplatform 
	 { $current=$iv_ruleXplatform.current; } 
	 EOF 
;

// Rule Xplatform
ruleXplatform returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='call' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getXplatformAccess().getCallKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getXplatformAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getXplatformRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_method_2_0=RULE_RESTFUL_METHODS
		{
			newLeafNode(lv_method_2_0, grammarAccess.getXplatformAccess().getMethodRESTFUL_METHODSTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getXplatformRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"method",
        		lv_method_2_0, 
        		"RESTFUL_METHODS");
	    }

)
)	otherlv_3='from' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getXplatformAccess().getFromKeyword_3());
    }
((this_ANY_OTHER_4=RULE_ANY_OTHER
    { 
    newLeafNode(this_ANY_OTHER_4, grammarAccess.getXplatformAccess().getANY_OTHERTerminalRuleCall_4_0()); 
    }
)?(	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getXplatformAccess().getLeftCurlyBracketKeyword_4_1_0());
    }
(
(
		lv_uriPathParams_6_0=RULE_ID
		{
			newLeafNode(lv_uriPathParams_6_0, grammarAccess.getXplatformAccess().getUriPathParamsIDTerminalRuleCall_4_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getXplatformRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"uriPathParams",
        		lv_uriPathParams_6_0, 
        		"ID");
	    }

)
)	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getXplatformAccess().getRightCurlyBracketKeyword_4_1_2());
    }
)*(this_ANY_OTHER_8=RULE_ANY_OTHER
    { 
    newLeafNode(this_ANY_OTHER_8, grammarAccess.getXplatformAccess().getANY_OTHERTerminalRuleCall_4_2()); 
    }
)?)+(	otherlv_9='with' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getXplatformAccess().getWithKeyword_5_0());
    }
	otherlv_10='headers' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getXplatformAccess().getHeadersKeyword_5_1());
    }
	otherlv_11='from' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getXplatformAccess().getFromKeyword_5_2());
    }
	otherlv_12='request' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getXplatformAccess().getRequestKeyword_5_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformAccess().getRequestHeadersXplatformHeaderParserRuleCall_5_4_0()); 
	    }
		lv_requestHeaders_13_0=ruleXplatformHeader		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformRule());
	        }
       		set(
       			$current, 
       			"requestHeaders",
        		lv_requestHeaders_13_0, 
        		"XplatformHeader");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_14='and' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getXplatformAccess().getAndKeyword_5_5_0());
    }
	otherlv_15='response' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getXplatformAccess().getResponseKeyword_5_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformAccess().getResponseHeadersXplatformHeaderParserRuleCall_5_5_2_0()); 
	    }
		lv_responseHeaders_16_0=ruleXplatformHeader		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformRule());
	        }
       		set(
       			$current, 
       			"responseHeaders",
        		lv_responseHeaders_16_0, 
        		"XplatformHeader");
	        afterParserOrEnumRuleCall();
	    }

)
))?)?(	otherlv_17='client' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getXplatformAccess().getClientKeyword_6_0());
    }
	otherlv_18='expects' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getXplatformAccess().getExpectsKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToClientXplatformJsonParserRuleCall_6_2_0()); 
	    }
		lv_jsonToClient_19_0=ruleXplatformJson		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformRule());
	        }
       		set(
       			$current, 
       			"jsonToClient",
        		lv_jsonToClient_19_0, 
        		"XplatformJson");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_20='server' 
    {
    	newLeafNode(otherlv_20, grammarAccess.getXplatformAccess().getServerKeyword_6_3_0());
    }
	otherlv_21='expects' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getXplatformAccess().getExpectsKeyword_6_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformAccess().getJsonToServerXplatformJsonParserRuleCall_6_3_2_0()); 
	    }
		lv_jsonToServer_22_0=ruleXplatformJson		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformRule());
	        }
       		set(
       			$current, 
       			"jsonToServer",
        		lv_jsonToServer_22_0, 
        		"XplatformJson");
	        afterParserOrEnumRuleCall();
	    }

)
))?)?)
;





// Entry rule entryRuleXplatformJson
entryRuleXplatformJson returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getXplatformJsonRule()); }
	 iv_ruleXplatformJson=ruleXplatformJson 
	 { $current=$iv_ruleXplatformJson.current; } 
	 EOF 
;

// Rule XplatformJson
ruleXplatformJson returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='\'\'\'' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getTypeJsonTypeParserRuleCall_0_1_0()); 
	    }
		lv_type_1_0=ruleJsonType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"JsonType");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |((
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformJsonAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0_0()); 
	    }
		lv_metaType_2_0=ruleJsonMetaType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformJsonRule());
	        }
       		set(
       			$current, 
       			"metaType",
        		lv_metaType_2_0, 
        		"JsonMetaType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='\'\'\'' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getXplatformJsonAccess().getApostropheApostropheApostropheKeyword_1_1());
    }
))
;





// Entry rule entryRuleXplatformHeader
entryRuleXplatformHeader returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getXplatformHeaderRule()); }
	 iv_ruleXplatformHeader=ruleXplatformHeader 
	 { $current=$iv_ruleXplatformHeader.current; } 
	 EOF 
;

// Rule XplatformHeader
ruleXplatformHeader returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='\'\'\'' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_2_0()); 
	    }
		lv_headerKeyValues_2_0=ruleXplatformHeaderKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformHeaderRule());
	        }
       		add(
       			$current, 
       			"headerKeyValues",
        		lv_headerKeyValues_2_0, 
        		"XplatformHeaderKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getXplatformHeaderAccess().getHeaderKeyValuesXplatformHeaderKeyValuePairParserRuleCall_3_1_0()); 
	    }
		lv_headerKeyValues_4_0=ruleXplatformHeaderKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getXplatformHeaderRule());
	        }
       		add(
       			$current, 
       			"headerKeyValues",
        		lv_headerKeyValues_4_0, 
        		"XplatformHeaderKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_2());
    }
)?)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getXplatformHeaderAccess().getRightCurlyBracketKeyword_4());
    }
	otherlv_7='\'\'\'' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getXplatformHeaderAccess().getApostropheApostropheApostropheKeyword_5());
    }
)
;





// Entry rule entryRuleXplatformHeaderKeyValuePair
entryRuleXplatformHeaderKeyValuePair returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getXplatformHeaderKeyValuePairRule()); }
	 iv_ruleXplatformHeaderKeyValuePair=ruleXplatformHeaderKeyValuePair 
	 { $current=$iv_ruleXplatformHeaderKeyValuePair.current; } 
	 EOF 
;

// Rule XplatformHeaderKeyValuePair
ruleXplatformHeaderKeyValuePair returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_key_0_0=RULE_STRING
		{
			newLeafNode(lv_key_0_0, grammarAccess.getXplatformHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getXplatformHeaderKeyValuePairRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_0_0, 
        		"STRING");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getXplatformHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
    }
(this_STRING_2=RULE_STRING
    { 
    newLeafNode(this_STRING_2, grammarAccess.getXplatformHeaderKeyValuePairAccess().getSTRINGTerminalRuleCall_2_0()); 
    }

    |this_XPLATFORM_HEADER_PARAMETER_3=RULE_XPLATFORM_HEADER_PARAMETER
    { 
    newLeafNode(this_XPLATFORM_HEADER_PARAMETER_3, grammarAccess.getXplatformHeaderKeyValuePairAccess().getXPLATFORM_HEADER_PARAMETERTerminalRuleCall_2_1()); 
    }
))
;





// Entry rule entryRuleJsonMetaType
entryRuleJsonMetaType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonMetaTypeRule()); }
	 iv_ruleJsonMetaType=ruleJsonMetaType 
	 { $current=$iv_ruleJsonMetaType.current; } 
	 EOF 
;

// Rule JsonMetaType
ruleJsonMetaType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='boolean' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getJsonMetaTypeAccess().getBooleanKeyword_0());
    }

    |	otherlv_1='number' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getJsonMetaTypeAccess().getNumberKeyword_1());
    }

    |	otherlv_2='string' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getJsonMetaTypeAccess().getStringKeyword_2());
    }

    |
    { 
        newCompositeNode(grammarAccess.getJsonMetaTypeAccess().getJsonMetaArrayParserRuleCall_3()); 
    }
    this_JsonMetaArray_3=ruleJsonMetaArray
    { 
        $current = $this_JsonMetaArray_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleJsonType
entryRuleJsonType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonTypeRule()); }
	 iv_ruleJsonType=ruleJsonType 
	 { $current=$iv_ruleJsonType.current; } 
	 EOF 
;

// Rule JsonType
ruleJsonType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(this_JSON_LITERAL_BOOLEAN_0=RULE_JSON_LITERAL_BOOLEAN
    { 
    newLeafNode(this_JSON_LITERAL_BOOLEAN_0, grammarAccess.getJsonTypeAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_0()); 
    }

    |this_STRING_1=RULE_STRING
    { 
    newLeafNode(this_STRING_1, grammarAccess.getJsonTypeAccess().getSTRINGTerminalRuleCall_1()); 
    }

    |this_JSON_LITERAL_NUMBER_2=RULE_JSON_LITERAL_NUMBER
    { 
    newLeafNode(this_JSON_LITERAL_NUMBER_2, grammarAccess.getJsonTypeAccess().getJSON_LITERAL_NUMBERTerminalRuleCall_2()); 
    }

    |this_JSON_LITERAL_NULL_3=RULE_JSON_LITERAL_NULL
    { 
    newLeafNode(this_JSON_LITERAL_NULL_3, grammarAccess.getJsonTypeAccess().getJSON_LITERAL_NULLTerminalRuleCall_3()); 
    }

    |
    { 
        newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonArrayParserRuleCall_4()); 
    }
    this_JsonArray_4=ruleJsonArray
    { 
        $current = $this_JsonArray_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonMetaTypeParserRuleCall_5()); 
    }
    this_JsonMetaType_5=ruleJsonMetaType
    { 
        $current = $this_JsonMetaType_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getJsonTypeAccess().getJsonObjectParserRuleCall_6()); 
    }
    this_JsonObject_6=ruleJsonObject
    { 
        $current = $this_JsonObject_6.current; 
        afterParserOrEnumRuleCall();
    }
)
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
	        newCompositeNode(grammarAccess.getJsonArrayAccess().getTypeJsonTypeParserRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleJsonType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonArrayRule());
	        }
       		add(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"JsonType");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonArrayAccess().getTypeJsonTypeParserRuleCall_2_1_0()); 
	    }
		lv_type_3_0=ruleJsonType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonArrayRule());
	        }
       		add(
       			$current, 
       			"type",
        		lv_type_3_0, 
        		"JsonType");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_2());
    }
)?)*	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleJsonKeyValuePair
entryRuleJsonKeyValuePair returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonKeyValuePairRule()); }
	 iv_ruleJsonKeyValuePair=ruleJsonKeyValuePair 
	 { $current=$iv_ruleJsonKeyValuePair.current; } 
	 EOF 
;

// Rule JsonKeyValuePair
ruleJsonKeyValuePair returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_key_0_0=RULE_STRING
		{
			newLeafNode(lv_key_0_0, grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonKeyValuePairRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"key",
        		lv_key_0_0, 
        		"STRING");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getJsonKeyValuePairAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonTypeParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleJsonType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonKeyValuePairRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"JsonType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





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
((
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0_0()); 
	    }
		lv_keyValuePair_1_0=ruleJsonKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectRule());
	        }
       		add(
       			$current, 
       			"keyValuePair",
        		lv_keyValuePair_1_0, 
        		"JsonKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getMetaKeyValuePairJsonMetaKeyValuePairParserRuleCall_1_1_0()); 
	    }
		lv_metaKeyValuePair_2_0=ruleJsonMetaKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectRule());
	        }
       		add(
       			$current, 
       			"metaKeyValuePair",
        		lv_metaKeyValuePair_2_0, 
        		"JsonMetaKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0_0()); 
	    }
		lv_keyValuePair_4_0=ruleJsonKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectRule());
	        }
       		add(
       			$current, 
       			"keyValuePair",
        		lv_keyValuePair_4_0, 
        		"JsonKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getMetaKeyValuePairJsonMetaKeyValuePairParserRuleCall_2_1_1_0()); 
	    }
		lv_metaKeyValuePair_5_0=ruleJsonMetaKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectRule());
	        }
       		add(
       			$current, 
       			"metaKeyValuePair",
        		lv_metaKeyValuePair_5_0, 
        		"JsonMetaKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_2());
    }
)?)*	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleJsonMetaArray
entryRuleJsonMetaArray returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonMetaArrayRule()); }
	 iv_ruleJsonMetaArray=ruleJsonMetaArray 
	 { $current=$iv_ruleJsonMetaArray.current; } 
	 EOF 
;

// Rule JsonMetaArray
ruleJsonMetaArray returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getJsonMetaArrayAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0()); 
	    }
		lv_metaType_1_0=ruleJsonMetaType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonMetaArrayRule());
	        }
       		set(
       			$current, 
       			"metaType",
        		lv_metaType_1_0, 
        		"JsonMetaType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=']' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getJsonMetaArrayAccess().getRightSquareBracketKeyword_2());
    }
)
;





// Entry rule entryRuleJsonMetaKeyValuePair
entryRuleJsonMetaKeyValuePair returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonMetaKeyValuePairRule()); }
	 iv_ruleJsonMetaKeyValuePair=ruleJsonMetaKeyValuePair 
	 { $current=$iv_ruleJsonMetaKeyValuePair.current; } 
	 EOF 
;

// Rule JsonMetaKeyValuePair
ruleJsonMetaKeyValuePair returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_metaKey_0_0=RULE_STRING
		{
			newLeafNode(lv_metaKey_0_0, grammarAccess.getJsonMetaKeyValuePairAccess().getMetaKeySTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getJsonMetaKeyValuePairRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"metaKey",
        		lv_metaKey_0_0, 
        		"STRING");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getJsonMetaKeyValuePairAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonMetaKeyValuePairAccess().getMetaValueJsonMetaTypeParserRuleCall_2_0()); 
	    }
		lv_metaValue_2_0=ruleJsonMetaType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonMetaKeyValuePairRule());
	        }
       		set(
       			$current, 
       			"metaValue",
        		lv_metaValue_2_0, 
        		"JsonMetaType");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





RULE_XPLATFORM_HEADER_PARAMETER : '{' RULE_ID '}';

RULE_RESTFUL_METHODS : ('PUT'|'POST'|'GET'|'DELETE');

RULE_JSON_LITERAL_NULL : 'null';

RULE_JSON_LITERAL_NUMBER : ('0'..'9')* ('.' ('0'..'9')+)?;

RULE_JSON_LITERAL_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

