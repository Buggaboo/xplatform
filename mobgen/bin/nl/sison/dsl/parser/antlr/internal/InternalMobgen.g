/*
* generated by Xtext
*/
grammar InternalMobgen;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package nl.sison.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package nl.sison.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.sison.dsl.services.MobgenGrammarAccess;

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMobgen
entryRuleMobgen returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMobgenRule()); }
	 iv_ruleMobgen=ruleMobgen 
	 { $current=$iv_ruleMobgen.current; } 
	 EOF 
;

// Rule Mobgen
ruleMobgen returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenAccess().getPlatformPlatformParserRuleCall_0_0()); 
	    }
		lv_platform_0_0=rulePlatform		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenRule());
	        }
       		set(
       			$current, 
       			"platform",
        		lv_platform_0_0, 
        		"Platform");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenAccess().getResourcesMobgenResourceDefinitionParserRuleCall_1_0_0()); 
	    }
		lv_resources_1_0=ruleMobgenResourceDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenRule());
	        }
       		add(
       			$current, 
       			"resources",
        		lv_resources_1_0, 
        		"MobgenResourceDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenAccess().getCallsMobgenCallDefinitionParserRuleCall_1_1_0()); 
	    }
		lv_calls_2_0=ruleMobgenCallDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenRule());
	        }
       		add(
       			$current, 
       			"calls",
        		lv_calls_2_0, 
        		"MobgenCallDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
))+)
;





// Entry rule entryRulePlatform
entryRulePlatform returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPlatformRule()); }
	 iv_rulePlatform=rulePlatform 
	 { $current=$iv_rulePlatform.current; } 
	 EOF 
;

// Rule Platform
rulePlatform returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='platform' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPlatformAccess().getPlatformKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPlatformAccess().getLeftCurlyBracketKeyword_1());
    }
((
(
		lv_platforms_2_0=RULE_ID
		{
			newLeafNode(lv_platforms_2_0, grammarAccess.getPlatformAccess().getPlatformsIDTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPlatformRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"platforms",
        		lv_platforms_2_0, 
        		"ID");
	    }

)
)	otherlv_3='->' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPlatformAccess().getHyphenMinusGreaterThanSignKeyword_2_1());
    }
(
(
		lv_generateWhere_4_0=RULE_STRING
		{
			newLeafNode(lv_generateWhere_4_0, grammarAccess.getPlatformAccess().getGenerateWhereSTRINGTerminalRuleCall_2_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPlatformRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"generateWhere",
        		lv_generateWhere_4_0, 
        		"STRING");
	    }

)
))+	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getPlatformAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleMobgenCallDefinition
entryRuleMobgenCallDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMobgenCallDefinitionRule()); }
	 iv_ruleMobgenCallDefinition=ruleMobgenCallDefinition 
	 { $current=$iv_ruleMobgenCallDefinition.current; } 
	 EOF 
;

// Rule MobgenCallDefinition
ruleMobgenCallDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='call' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMobgenCallDefinitionAccess().getCallKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMobgenCallDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMobgenCallDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMobgenCallDefinitionAccess().getColonKeyword_2());
    }
(
(
		lv_method_3_0=RULE_RESTFUL_METHODS
		{
			newLeafNode(lv_method_3_0, grammarAccess.getMobgenCallDefinitionAccess().getMethodRESTFUL_METHODSTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMobgenCallDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"method",
        		lv_method_3_0, 
        		"RESTFUL_METHODS");
	    }

)
)	otherlv_4='from' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getUriURIParserRuleCall_5_0()); 
	    }
		lv_uri_5_0=ruleURI		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
	        }
       		set(
       			$current, 
       			"uri",
        		lv_uri_5_0, 
        		"URI");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6='with' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMobgenCallDefinitionAccess().getWithKeyword_6_0());
    }
	otherlv_7='headers' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMobgenCallDefinitionAccess().getHeadersKeyword_6_1());
    }
	otherlv_8='from' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMobgenCallDefinitionAccess().getFromKeyword_6_2());
    }
	otherlv_9='request' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMobgenCallDefinitionAccess().getRequestKeyword_6_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersMobgenHeaderParserRuleCall_6_4_0()); 
	    }
		lv_requestHeaders_10_0=ruleMobgenHeader		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
	        }
       		set(
       			$current, 
       			"requestHeaders",
        		lv_requestHeaders_10_0, 
        		"MobgenHeader");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_11='and' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMobgenCallDefinitionAccess().getAndKeyword_6_5_0());
    }
	otherlv_12='response' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getMobgenCallDefinitionAccess().getResponseKeyword_6_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersMobgenHeaderParserRuleCall_6_5_2_0()); 
	    }
		lv_responseHeaders_13_0=ruleMobgenHeader		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
	        }
       		set(
       			$current, 
       			"responseHeaders",
        		lv_responseHeaders_13_0, 
        		"MobgenHeader");
	        afterParserOrEnumRuleCall();
	    }

)
))?)?(	otherlv_14='client' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getMobgenCallDefinitionAccess().getClientKeyword_7_0());
    }
	otherlv_15='expects' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_7_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientMobgenJsonParserRuleCall_7_2_0()); 
	    }
		lv_jsonToClient_16_0=ruleMobgenJson		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
	        }
       		set(
       			$current, 
       			"jsonToClient",
        		lv_jsonToClient_16_0, 
        		"MobgenJson");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_17='server' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getMobgenCallDefinitionAccess().getServerKeyword_8_0());
    }
	otherlv_18='expects' 
    {
    	newLeafNode(otherlv_18, grammarAccess.getMobgenCallDefinitionAccess().getExpectsKeyword_8_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerMobgenJsonParserRuleCall_8_2_0()); 
	    }
		lv_jsonToServer_19_0=ruleMobgenJson		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenCallDefinitionRule());
	        }
       		set(
       			$current, 
       			"jsonToServer",
        		lv_jsonToServer_19_0, 
        		"MobgenJson");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleURI
entryRuleURI returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getURIRule()); }
	 iv_ruleURI=ruleURI 
	 { $current=$iv_ruleURI.current; } 
	 EOF 
;

// Rule URI
ruleURI returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_stringPrefix_0_0=RULE_ANY_OTHER
		{
			newLeafNode(lv_stringPrefix_0_0, grammarAccess.getURIAccess().getStringPrefixANY_OTHERTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getURIRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"stringPrefix",
        		lv_stringPrefix_0_0, 
        		"ANY_OTHER");
	    }

)
)+(	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getURIAccess().getLeftCurlyBracketKeyword_1_0());
    }
(
(
		lv_parameters_2_0=RULE_ID
		{
			newLeafNode(lv_parameters_2_0, grammarAccess.getURIAccess().getParametersIDTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getURIRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"parameters",
        		lv_parameters_2_0, 
        		"ID");
	    }

)
)	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getURIAccess().getRightCurlyBracketKeyword_1_2());
    }
(
(
		lv_stringSuffix_4_0=RULE_ANY_OTHER
		{
			newLeafNode(lv_stringSuffix_4_0, grammarAccess.getURIAccess().getStringSuffixANY_OTHERTerminalRuleCall_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getURIRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"stringSuffix",
        		lv_stringSuffix_4_0, 
        		"ANY_OTHER");
	    }

)
))+)
;





// Entry rule entryRuleMobgenHeader
entryRuleMobgenHeader returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMobgenHeaderRule()); }
	 iv_ruleMobgenHeader=ruleMobgenHeader 
	 { $current=$iv_ruleMobgenHeader.current; } 
	 EOF 
;

// Rule MobgenHeader
ruleMobgenHeader returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMobgenHeaderAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMobgenHeaderRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)?	otherlv_1='\'\'\'' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMobgenHeaderAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_3_0()); 
	    }
		lv_headerKeyValues_3_0=ruleMobgenHeaderKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenHeaderRule());
	        }
       		add(
       			$current, 
       			"headerKeyValues",
        		lv_headerKeyValues_3_0, 
        		"MobgenHeaderKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesMobgenHeaderKeyValuePairParserRuleCall_4_1_0()); 
	    }
		lv_headerKeyValues_5_0=ruleMobgenHeaderKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenHeaderRule());
	        }
       		add(
       			$current, 
       			"headerKeyValues",
        		lv_headerKeyValues_5_0, 
        		"MobgenHeaderKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5());
    }
)?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getMobgenHeaderAccess().getRightCurlyBracketKeyword_6());
    }
	otherlv_8='\'\'\'' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMobgenHeaderAccess().getApostropheApostropheApostropheKeyword_7());
    }
)
;





// Entry rule entryRuleMobgenHeaderKeyValuePair
entryRuleMobgenHeaderKeyValuePair returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMobgenHeaderKeyValuePairRule()); }
	 iv_ruleMobgenHeaderKeyValuePair=ruleMobgenHeaderKeyValuePair 
	 { $current=$iv_ruleMobgenHeaderKeyValuePair.current; } 
	 EOF 
;

// Rule MobgenHeaderKeyValuePair
ruleMobgenHeaderKeyValuePair returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_key_0_0=RULE_STRING
		{
			newLeafNode(lv_key_0_0, grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMobgenHeaderKeyValuePairRule());
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
    	newLeafNode(otherlv_1, grammarAccess.getMobgenHeaderKeyValuePairAccess().getEqualsSignKeyword_1());
    }
((
(
		lv_value_2_0=RULE_STRING
		{
			newLeafNode(lv_value_2_0, grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueSTRINGTerminalRuleCall_2_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMobgenHeaderKeyValuePairRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"STRING");
	    }

)
)
    |(
(
		lv_value_3_0=RULE_MOBGEN_HEADER_PARAMETER
		{
			newLeafNode(lv_value_3_0, grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueMOBGEN_HEADER_PARAMETERTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMobgenHeaderKeyValuePairRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"MOBGEN_HEADER_PARAMETER");
	    }

)
)))
;





// Entry rule entryRuleMobgenJson
entryRuleMobgenJson returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMobgenJsonRule()); }
	 iv_ruleMobgenJson=ruleMobgenJson 
	 { $current=$iv_ruleMobgenJson.current; } 
	 EOF 
;

// Rule MobgenJson
ruleMobgenJson returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMobgenJsonRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='\'\'\'' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleJsonObjectValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenJsonRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"JsonObjectValue");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3='\'\'\'' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMobgenJsonAccess().getApostropheApostropheApostropheKeyword_3());
    }
)
;





// Entry rule entryRuleJsonObjectValue
entryRuleJsonObjectValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonObjectValueRule()); }
	 iv_ruleJsonObjectValue=ruleJsonObjectValue 
	 { $current=$iv_ruleJsonObjectValue.current; } 
	 EOF 
;

// Rule JsonObjectValue
ruleJsonObjectValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getValueJsonLiteralValueParserRuleCall_0_0()); 
	    }
		lv_value_0_0=ruleJsonLiteralValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"JsonLiteralValue");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectValueAccess().getCompositeJsonCompositeValueParserRuleCall_1_0()); 
	    }
		lv_composite_1_0=ruleJsonCompositeValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectValueRule());
	        }
       		set(
       			$current, 
       			"composite",
        		lv_composite_1_0, 
        		"JsonCompositeValue");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleJsonCompositeValue
entryRuleJsonCompositeValue returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonCompositeValueRule()); }
	 iv_ruleJsonCompositeValue=ruleJsonCompositeValue 
	 { $current=$iv_ruleJsonCompositeValue.current; } 
	 EOF 
;

// Rule JsonCompositeValue
ruleJsonCompositeValue returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getJsonObjectParserRuleCall_0()); 
    }
    this_JsonObject_0=ruleJsonObject
    { 
        $current = $this_JsonObject_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getJsonCompositeValueAccess().getJsonArrayParserRuleCall_1()); 
    }
    this_JsonArray_1=ruleJsonArray
    { 
        $current = $this_JsonArray_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleJsonLiteralValue
entryRuleJsonLiteralValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getJsonLiteralValueRule()); } 
	 iv_ruleJsonLiteralValue=ruleJsonLiteralValue 
	 { $current=$iv_ruleJsonLiteralValue.current.getText(); }  
	 EOF 
;

// Rule JsonLiteralValue
ruleJsonLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getJsonLiteralValueAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_EMPTY_JSON_OBJECT_1=RULE_EMPTY_JSON_OBJECT    {
		$current.merge(this_EMPTY_JSON_OBJECT_1);
    }

    { 
    newLeafNode(this_EMPTY_JSON_OBJECT_1, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_1()); 
    }

    |    this_EMPTY_JSON_ARRAY_2=RULE_EMPTY_JSON_ARRAY    {
		$current.merge(this_EMPTY_JSON_ARRAY_2);
    }

    { 
    newLeafNode(this_EMPTY_JSON_ARRAY_2, grammarAccess.getJsonLiteralValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_2()); 
    }

    |    this_JSON_LITERAL_BOOLEAN_3=RULE_JSON_LITERAL_BOOLEAN    {
		$current.merge(this_JSON_LITERAL_BOOLEAN_3);
    }

    { 
    newLeafNode(this_JSON_LITERAL_BOOLEAN_3, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_3()); 
    }

    |    this_JSON_LITERAL_NULL_4=RULE_JSON_LITERAL_NULL    {
		$current.merge(this_JSON_LITERAL_NULL_4);
    }

    { 
    newLeafNode(this_JSON_LITERAL_NULL_4, grammarAccess.getJsonLiteralValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_4()); 
    }

    |    this_JSON_NUMBER_5=RULE_JSON_NUMBER    {
		$current.merge(this_JSON_NUMBER_5);
    }

    { 
    newLeafNode(this_JSON_NUMBER_5, grammarAccess.getJsonLiteralValueAccess().getJSON_NUMBERTerminalRuleCall_5()); 
    }

    |    this_JSON_META_SCALAR_TYPE_6=RULE_JSON_META_SCALAR_TYPE    {
		$current.merge(this_JSON_META_SCALAR_TYPE_6);
    }

    { 
    newLeafNode(this_JSON_META_SCALAR_TYPE_6, grammarAccess.getJsonLiteralValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_6()); 
    }
)
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
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_1_0()); 
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
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getJsonObjectAccess().getKeyValuePairJsonKeyValuePairParserRuleCall_2_1_0()); 
	    }
		lv_keyValuePair_3_0=ruleJsonKeyValuePair		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonObjectRule());
	        }
       		add(
       			$current, 
       			"keyValuePair",
        		lv_keyValuePair_3_0, 
        		"JsonKeyValuePair");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
    }
)?	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getJsonObjectAccess().getRightCurlyBracketKeyword_4());
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
	        newCompositeNode(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleJsonObjectValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonKeyValuePairRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"JsonObjectValue");
	        afterParserOrEnumRuleCall();
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
	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_1_0()); 
	    }
		lv_items_1_0=ruleJsonObjectValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonArrayRule());
	        }
       		add(
       			$current, 
       			"items",
        		lv_items_1_0, 
        		"JsonObjectValue");
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
	        newCompositeNode(grammarAccess.getJsonArrayAccess().getItemsJsonObjectValueParserRuleCall_2_1_0()); 
	    }
		lv_items_3_0=ruleJsonObjectValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getJsonArrayRule());
	        }
       		add(
       			$current, 
       			"items",
        		lv_items_3_0, 
        		"JsonObjectValue");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
    }
)?	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getJsonArrayAccess().getRightSquareBracketKeyword_4());
    }
)
;





// Entry rule entryRuleMobgenResourceDefinition
entryRuleMobgenResourceDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMobgenResourceDefinitionRule()); }
	 iv_ruleMobgenResourceDefinition=ruleMobgenResourceDefinition 
	 { $current=$iv_ruleMobgenResourceDefinition.current; } 
	 EOF 
;

// Rule MobgenResourceDefinition
ruleMobgenResourceDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesMapInstanceParserRuleCall_0_0()); 
	    }
		lv_resources_0_0=ruleMapInstance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMobgenResourceDefinitionRule());
	        }
       		add(
       			$current, 
       			"resources",
        		lv_resources_0_0, 
        		"MapInstance");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |
    { 
        newCompositeNode(grammarAccess.getMobgenResourceDefinitionAccess().getEnumInstanceParserRuleCall_1()); 
    }
    this_EnumInstance_1=ruleEnumInstance
    { 
        $current = $this_EnumInstance_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleEnumInstance
entryRuleEnumInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumInstanceRule()); }
	 iv_ruleEnumInstance=ruleEnumInstance 
	 { $current=$iv_ruleEnumInstance.current; } 
	 EOF 
;

// Rule EnumInstance
ruleEnumInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='enum' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEnumInstanceAccess().getEnumKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEnumInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumInstanceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEnumInstanceAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		lv_values_3_0=RULE_ID
		{
			newLeafNode(lv_values_3_0, grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumInstanceRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_3_0, 
        		"ID");
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEnumInstanceAccess().getCommaKeyword_4_0());
    }
(
(
		lv_values_5_0=RULE_ID
		{
			newLeafNode(lv_values_5_0, grammarAccess.getEnumInstanceAccess().getValuesIDTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumInstanceRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_5_0, 
        		"ID");
	    }

)
))*(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
    }
)?	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getEnumInstanceAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleMapInstance
entryRuleMapInstance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMapInstanceRule()); }
	 iv_ruleMapInstance=ruleMapInstance 
	 { $current=$iv_ruleMapInstance.current; } 
	 EOF 
;

// Rule MapInstance
ruleMapInstance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='map' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMapInstanceAccess().getMapKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMapInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMapInstanceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMapInstanceAccess().getLeftCurlyBracketKeyword_2());
    }
((
(
		lv_keys_3_0=RULE_ID
		{
			newLeafNode(lv_keys_3_0, grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_3_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMapInstanceRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"keys",
        		lv_keys_3_0, 
        		"ID");
	    }

)
)	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getMapInstanceAccess().getColonKeyword_3_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_3_2_0()); 
	    }
		lv_values_5_0=ruleNestedType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMapInstanceRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_5_0, 
        		"NestedType");
	        afterParserOrEnumRuleCall();
	    }

)
))(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMapInstanceAccess().getCommaKeyword_4_0());
    }
(
(
		lv_keys_7_0=RULE_ID
		{
			newLeafNode(lv_keys_7_0, grammarAccess.getMapInstanceAccess().getKeysIDTerminalRuleCall_4_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMapInstanceRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"keys",
        		lv_keys_7_0, 
        		"ID");
	    }

)
)	otherlv_8=':' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMapInstanceAccess().getColonKeyword_4_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMapInstanceAccess().getValuesNestedTypeParserRuleCall_4_3_0()); 
	    }
		lv_values_9_0=ruleNestedType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMapInstanceRule());
	        }
       		add(
       			$current, 
       			"values",
        		lv_values_9_0, 
        		"NestedType");
	        afterParserOrEnumRuleCall();
	    }

)
))*(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
    }
)?	otherlv_11='}' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getMapInstanceAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleStringList
entryRuleStringList returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStringListRule()); }
	 iv_ruleStringList=ruleStringList 
	 { $current=$iv_ruleStringList.current; } 
	 EOF 
;

// Rule StringList
ruleStringList returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStringListAccess().getLeftSquareBracketKeyword_0());
    }
(
(
		lv_values_1_0=RULE_STRING
		{
			newLeafNode(lv_values_1_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringListRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getStringListAccess().getCommaKeyword_2_0());
    }
(
(
		lv_values_3_0=RULE_STRING
		{
			newLeafNode(lv_values_3_0, grammarAccess.getStringListAccess().getValuesSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStringListRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"values",
        		lv_values_3_0, 
        		"STRING");
	    }

)
))*(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getStringListAccess().getCommaKeyword_3());
    }
)?	otherlv_5=']' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getStringListAccess().getRightSquareBracketKeyword_4());
    }
)
;





// Entry rule entryRuleNestedType
entryRuleNestedType returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNestedTypeRule()); }
	 iv_ruleNestedType=ruleNestedType 
	 { $current=$iv_ruleNestedType.current; } 
	 EOF 
;

// Rule NestedType
ruleNestedType returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getNestedTypeAccess().getListStringListParserRuleCall_0_0()); 
	    }
		lv_list_0_0=ruleStringList		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNestedTypeRule());
	        }
       		set(
       			$current, 
       			"list",
        		lv_list_0_0, 
        		"StringList");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		lv_string_1_0=RULE_STRING
		{
			newLeafNode(lv_string_1_0, grammarAccess.getNestedTypeAccess().getStringSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getNestedTypeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"string",
        		lv_string_1_0, 
        		"STRING");
	    }

)
))
;





RULE_MOBGEN_HEADER_PARAMETER : '{' RULE_ID '}';

RULE_RESTFUL_METHODS : ('PUT'|'POST'|'GET'|'DELETE');

RULE_JSON_META_SCALAR_TYPE : ('boolean'|'number'|'string');

RULE_EMPTY_JSON_OBJECT : '{}';

RULE_EMPTY_JSON_ARRAY : '[]';

RULE_JSON_LITERAL_NULL : 'null';

RULE_JSON_LITERAL_BOOLEAN : ('true'|'false');

RULE_JSON_NUMBER : ('0'|'1..9'+ RULE_INT) ('.' RULE_INT)?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


