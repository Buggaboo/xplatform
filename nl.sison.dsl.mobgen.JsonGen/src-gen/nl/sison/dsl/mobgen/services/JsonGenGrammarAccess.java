/*
* generated by Xtext
*/
package nl.sison.dsl.mobgen.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class JsonGenGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class JsonObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "JsonObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMembersAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMembersMemberParserRuleCall_1_0 = (RuleCall)cMembersAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMembersAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMembersMemberParserRuleCall_2_1_0 = (RuleCall)cMembersAssignment_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//JsonObject:
		//	"{" members+=Member ("," members+=Member)* "}";
		public ParserRule getRule() { return rule; }

		//"{" members+=Member ("," members+=Member)* "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//members+=Member
		public Assignment getMembersAssignment_1() { return cMembersAssignment_1; }

		//Member
		public RuleCall getMembersMemberParserRuleCall_1_0() { return cMembersMemberParserRuleCall_1_0; }

		//("," members+=Member)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//members+=Member
		public Assignment getMembersAssignment_2_1() { return cMembersAssignment_2_1; }

		//Member
		public RuleCall getMembersMemberParserRuleCall_2_1_0() { return cMembersMemberParserRuleCall_2_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class MemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Member");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOptionalAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cOptionalQuestionMarkKeyword_0_0 = (Keyword)cOptionalAssignment_0.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeySTRINGTerminalRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValueJsonValueParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//Member:
		//	optional?="?"? key=STRING ":" value=JsonValue;
		public ParserRule getRule() { return rule; }

		//optional?="?"? key=STRING ":" value=JsonValue
		public Group getGroup() { return cGroup; }

		//optional?="?"?
		public Assignment getOptionalAssignment_0() { return cOptionalAssignment_0; }

		//"?"
		public Keyword getOptionalQuestionMarkKeyword_0_0() { return cOptionalQuestionMarkKeyword_0_0; }

		//key=STRING
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }

		//STRING
		public RuleCall getKeySTRINGTerminalRuleCall_1_0() { return cKeySTRINGTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//value=JsonValue
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }

		//JsonValue
		public RuleCall getValueJsonValueParserRuleCall_3_0() { return cValueJsonValueParserRuleCall_3_0; }
	}

	public class JsonValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "JsonValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cObjAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cObjJsonObjectParserRuleCall_0_0 = (RuleCall)cObjAssignment_0.eContents().get(0);
		private final Assignment cStrAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cStrSTRINGTerminalRuleCall_1_0 = (RuleCall)cStrAssignment_1.eContents().get(0);
		private final Assignment cArrayAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cArrayJsonArrayParserRuleCall_2_0 = (RuleCall)cArrayAssignment_2.eContents().get(0);
		private final Assignment cBoolAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cBoolJSON_BOOLEANTerminalRuleCall_3_0 = (RuleCall)cBoolAssignment_3.eContents().get(0);
		private final Assignment cNullAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cNullJSON_NULLTerminalRuleCall_4_0 = (RuleCall)cNullAssignment_4.eContents().get(0);
		private final Assignment cIntAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cIntINTTerminalRuleCall_5_0 = (RuleCall)cIntAssignment_5.eContents().get(0);
		private final Assignment cFloatAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final RuleCall cFloatJSON_FLOATTerminalRuleCall_6_0 = (RuleCall)cFloatAssignment_6.eContents().get(0);
		private final Assignment cStrFromEnumAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final RuleCall cStrFromEnumExJsonEnumParserRuleCall_7_0 = (RuleCall)cStrFromEnumAssignment_7.eContents().get(0);
		private final Assignment cDatetimeAssignment_8 = (Assignment)cAlternatives.eContents().get(8);
		private final RuleCall cDatetimeExJsonDateTimeParserRuleCall_8_0 = (RuleCall)cDatetimeAssignment_8.eContents().get(0);
		
		//JsonValue:
		//	obj=JsonObject / * currently ignore nulls * / | str=STRING | array=JsonArray | bool?=JSON_BOOLEAN | null?=JSON_NULL |
		//	int?=INT | float?=JSON_FLOAT | strFromEnum=ExJsonEnum | datetime=ExJsonDateTime;
		public ParserRule getRule() { return rule; }

		//obj=JsonObject / * currently ignore nulls * / | str=STRING | array=JsonArray | bool?=JSON_BOOLEAN | null?=JSON_NULL |
		//int?=INT | float?=JSON_FLOAT | strFromEnum=ExJsonEnum | datetime=ExJsonDateTime
		public Alternatives getAlternatives() { return cAlternatives; }

		//obj=JsonObject
		public Assignment getObjAssignment_0() { return cObjAssignment_0; }

		//JsonObject
		public RuleCall getObjJsonObjectParserRuleCall_0_0() { return cObjJsonObjectParserRuleCall_0_0; }

		//str=STRING
		public Assignment getStrAssignment_1() { return cStrAssignment_1; }

		//STRING
		public RuleCall getStrSTRINGTerminalRuleCall_1_0() { return cStrSTRINGTerminalRuleCall_1_0; }

		//array=JsonArray
		public Assignment getArrayAssignment_2() { return cArrayAssignment_2; }

		//JsonArray
		public RuleCall getArrayJsonArrayParserRuleCall_2_0() { return cArrayJsonArrayParserRuleCall_2_0; }

		//bool?=JSON_BOOLEAN
		public Assignment getBoolAssignment_3() { return cBoolAssignment_3; }

		//JSON_BOOLEAN
		public RuleCall getBoolJSON_BOOLEANTerminalRuleCall_3_0() { return cBoolJSON_BOOLEANTerminalRuleCall_3_0; }

		//null?=JSON_NULL
		public Assignment getNullAssignment_4() { return cNullAssignment_4; }

		//JSON_NULL
		public RuleCall getNullJSON_NULLTerminalRuleCall_4_0() { return cNullJSON_NULLTerminalRuleCall_4_0; }

		//int?=INT
		public Assignment getIntAssignment_5() { return cIntAssignment_5; }

		//INT
		public RuleCall getIntINTTerminalRuleCall_5_0() { return cIntINTTerminalRuleCall_5_0; }

		//float?=JSON_FLOAT
		public Assignment getFloatAssignment_6() { return cFloatAssignment_6; }

		//JSON_FLOAT
		public RuleCall getFloatJSON_FLOATTerminalRuleCall_6_0() { return cFloatJSON_FLOATTerminalRuleCall_6_0; }

		//strFromEnum=ExJsonEnum
		public Assignment getStrFromEnumAssignment_7() { return cStrFromEnumAssignment_7; }

		//ExJsonEnum
		public RuleCall getStrFromEnumExJsonEnumParserRuleCall_7_0() { return cStrFromEnumExJsonEnumParserRuleCall_7_0; }

		//datetime=ExJsonDateTime
		public Assignment getDatetimeAssignment_8() { return cDatetimeAssignment_8; }

		//ExJsonDateTime
		public RuleCall getDatetimeExJsonDateTimeParserRuleCall_8_0() { return cDatetimeExJsonDateTimeParserRuleCall_8_0; }
	}

	public class JsonArrayElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "JsonArray");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuesJsonValueParserRuleCall_1_0 = (RuleCall)cValuesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuesJsonValueParserRuleCall_2_1_0 = (RuleCall)cValuesAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//JsonArray:
		//	"[" values+=JsonValue ("," values+=JsonValue)* "]";
		public ParserRule getRule() { return rule; }

		//"[" values+=JsonValue ("," values+=JsonValue)* "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//values+=JsonValue
		public Assignment getValuesAssignment_1() { return cValuesAssignment_1; }

		//JsonValue
		public RuleCall getValuesJsonValueParserRuleCall_1_0() { return cValuesJsonValueParserRuleCall_1_0; }

		//("," values+=JsonValue)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//values+=JsonValue
		public Assignment getValuesAssignment_2_1() { return cValuesAssignment_2_1; }

		//JsonValue
		public RuleCall getValuesJsonValueParserRuleCall_2_1_0() { return cValuesJsonValueParserRuleCall_2_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}

	public class ExJsonEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExJsonEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Assignment cValuesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValuesSTRINGTerminalRuleCall_2_0 = (RuleCall)cValuesAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cValuesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cValuesAssignment_3_1.eContents().get(0);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Keyword cRightParenthesisKeyword_4_0 = (Keyword)cAlternatives_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_1 = (Keyword)cAlternatives_4.eContents().get(1);
		
		//ExJsonEnum:
		//	"enum" ("{" | "(") values+=STRING ("," values+=STRING)* (")" | "}");
		public ParserRule getRule() { return rule; }

		//"enum" ("{" | "(") values+=STRING ("," values+=STRING)* (")" | "}")
		public Group getGroup() { return cGroup; }

		//"enum"
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }

		//"{" | "("
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1_0() { return cLeftCurlyBracketKeyword_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }

		//values+=STRING
		public Assignment getValuesAssignment_2() { return cValuesAssignment_2; }

		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_2_0() { return cValuesSTRINGTerminalRuleCall_2_0; }

		//("," values+=STRING)*
		public Group getGroup_3() { return cGroup_3; }

		//","
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }

		//values+=STRING
		public Assignment getValuesAssignment_3_1() { return cValuesAssignment_3_1; }

		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_3_1_0() { return cValuesSTRINGTerminalRuleCall_3_1_0; }

		//")" | "}"
		public Alternatives getAlternatives_4() { return cAlternatives_4; }

		//")"
		public Keyword getRightParenthesisKeyword_4_0() { return cRightParenthesisKeyword_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_1() { return cRightCurlyBracketKeyword_4_1; }
	}

	public class ExJsonDateTimeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ExJsonDateTime");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cUtcAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cUtcUTCKeyword_0_0 = (Keyword)cUtcAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDatetimeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cFormatAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cFormatSTRINGTerminalRuleCall_1_2_0 = (RuleCall)cFormatAssignment_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		/// *
		// * TODO generate zulu validator SimpleDateFormatter
		// * 
		// * There is a thread related security hole, fix this
		// * / ExJsonDateTime:
		//	utc?="UTC" | "datetime" "(" format=STRING ")";
		public ParserRule getRule() { return rule; }

		//utc?="UTC" | "datetime" "(" format=STRING ")"
		public Alternatives getAlternatives() { return cAlternatives; }

		//utc?="UTC"
		public Assignment getUtcAssignment_0() { return cUtcAssignment_0; }

		//"UTC"
		public Keyword getUtcUTCKeyword_0_0() { return cUtcUTCKeyword_0_0; }

		//"datetime" "(" format=STRING ")"
		public Group getGroup_1() { return cGroup_1; }

		//"datetime"
		public Keyword getDatetimeKeyword_1_0() { return cDatetimeKeyword_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }

		//format=STRING
		public Assignment getFormatAssignment_1_2() { return cFormatAssignment_1_2; }

		//STRING
		public RuleCall getFormatSTRINGTerminalRuleCall_1_2_0() { return cFormatSTRINGTerminalRuleCall_1_2_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
	}
	
	
	private JsonObjectElements pJsonObject;
	private MemberElements pMember;
	private JsonValueElements pJsonValue;
	private JsonArrayElements pJsonArray;
	private TerminalRule tJSON_BOOLEAN;
	private TerminalRule tJSON_NULL;
	private TerminalRule tJSON_FLOAT;
	private ExJsonEnumElements pExJsonEnum;
	private ExJsonDateTimeElements pExJsonDateTime;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public JsonGenGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("nl.sison.dsl.mobgen.JsonGen".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//JsonObject:
	//	"{" members+=Member ("," members+=Member)* "}";
	public JsonObjectElements getJsonObjectAccess() {
		return (pJsonObject != null) ? pJsonObject : (pJsonObject = new JsonObjectElements());
	}
	
	public ParserRule getJsonObjectRule() {
		return getJsonObjectAccess().getRule();
	}

	//Member:
	//	optional?="?"? key=STRING ":" value=JsonValue;
	public MemberElements getMemberAccess() {
		return (pMember != null) ? pMember : (pMember = new MemberElements());
	}
	
	public ParserRule getMemberRule() {
		return getMemberAccess().getRule();
	}

	//JsonValue:
	//	obj=JsonObject / * currently ignore nulls * / | str=STRING | array=JsonArray | bool?=JSON_BOOLEAN | null?=JSON_NULL |
	//	int?=INT | float?=JSON_FLOAT | strFromEnum=ExJsonEnum | datetime=ExJsonDateTime;
	public JsonValueElements getJsonValueAccess() {
		return (pJsonValue != null) ? pJsonValue : (pJsonValue = new JsonValueElements());
	}
	
	public ParserRule getJsonValueRule() {
		return getJsonValueAccess().getRule();
	}

	//JsonArray:
	//	"[" values+=JsonValue ("," values+=JsonValue)* "]";
	public JsonArrayElements getJsonArrayAccess() {
		return (pJsonArray != null) ? pJsonArray : (pJsonArray = new JsonArrayElements());
	}
	
	public ParserRule getJsonArrayRule() {
		return getJsonArrayAccess().getRule();
	}

	//terminal JSON_BOOLEAN:
	//	"true" | "false" | "boolean";
	public TerminalRule getJSON_BOOLEANRule() {
		return (tJSON_BOOLEAN != null) ? tJSON_BOOLEAN : (tJSON_BOOLEAN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "JSON_BOOLEAN"));
	} 

	//terminal JSON_NULL:
	//	"null";
	public TerminalRule getJSON_NULLRule() {
		return (tJSON_NULL != null) ? tJSON_NULL : (tJSON_NULL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "JSON_NULL"));
	} 

	//terminal JSON_FLOAT:
	//	"-"? INT "." INT (("E" | "e") "-"? INT)?;
	public TerminalRule getJSON_FLOATRule() {
		return (tJSON_FLOAT != null) ? tJSON_FLOAT : (tJSON_FLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "JSON_FLOAT"));
	} 

	//ExJsonEnum:
	//	"enum" ("{" | "(") values+=STRING ("," values+=STRING)* (")" | "}");
	public ExJsonEnumElements getExJsonEnumAccess() {
		return (pExJsonEnum != null) ? pExJsonEnum : (pExJsonEnum = new ExJsonEnumElements());
	}
	
	public ParserRule getExJsonEnumRule() {
		return getExJsonEnumAccess().getRule();
	}

	/// *
	// * TODO generate zulu validator SimpleDateFormatter
	// * 
	// * There is a thread related security hole, fix this
	// * / ExJsonDateTime:
	//	utc?="UTC" | "datetime" "(" format=STRING ")";
	public ExJsonDateTimeElements getExJsonDateTimeAccess() {
		return (pExJsonDateTime != null) ? pExJsonDateTime : (pExJsonDateTime = new ExJsonDateTimeElements());
	}
	
	public ParserRule getExJsonDateTimeRule() {
		return getExJsonDateTimeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
