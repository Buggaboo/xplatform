package nl.sison.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.sison.services.XplatformGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XplatformSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XplatformGrammarAccess grammarAccess;
	protected AbstractElementAlias match_JsonArray_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_JsonMetaType_BooleanKeyword_0_or_NumberKeyword_1_or_StringKeyword_2;
	protected AbstractElementAlias match_JsonObject_CommaKeyword_2_2_q;
	protected AbstractElementAlias match_JsonType_JSON_LITERAL_BOOLEANTerminalRuleCall_0_or_JSON_LITERAL_NULLTerminalRuleCall_3_or_JSON_LITERAL_NUMBERTerminalRuleCall_2_or_LITERAL_STRINGTerminalRuleCall_1;
	protected AbstractElementAlias match_XplatformHeader_CommaKeyword_3_2_q;
	protected AbstractElementAlias match_Xplatform___STRINGTerminalRuleCall_4_0_or_STRINGTerminalRuleCall_4_2__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XplatformGrammarAccess) access;
		match_JsonArray_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getJsonArrayAccess().getCommaKeyword_2_2());
		match_JsonMetaType_BooleanKeyword_0_or_NumberKeyword_1_or_StringKeyword_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJsonMetaTypeAccess().getBooleanKeyword_0()), new TokenAlias(false, false, grammarAccess.getJsonMetaTypeAccess().getNumberKeyword_1()), new TokenAlias(false, false, grammarAccess.getJsonMetaTypeAccess().getStringKeyword_2()));
		match_JsonObject_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getJsonObjectAccess().getCommaKeyword_2_2());
		match_JsonType_JSON_LITERAL_BOOLEANTerminalRuleCall_0_or_JSON_LITERAL_NULLTerminalRuleCall_3_or_JSON_LITERAL_NUMBERTerminalRuleCall_2_or_LITERAL_STRINGTerminalRuleCall_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJsonTypeAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getJsonTypeAccess().getJSON_LITERAL_NULLTerminalRuleCall_3()), new TokenAlias(false, false, grammarAccess.getJsonTypeAccess().getJSON_LITERAL_NUMBERTerminalRuleCall_2()), new TokenAlias(false, false, grammarAccess.getJsonTypeAccess().getLITERAL_STRINGTerminalRuleCall_1()));
		match_XplatformHeader_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_2());
		match_Xplatform___STRINGTerminalRuleCall_4_0_or_STRINGTerminalRuleCall_4_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getXplatformAccess().getSTRINGTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getXplatformAccess().getSTRINGTerminalRuleCall_4_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getJSON_LITERAL_BOOLEANRule())
			return getJSON_LITERAL_BOOLEANToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_LITERAL_NULLRule())
			return getJSON_LITERAL_NULLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_LITERAL_NUMBERRule())
			return getJSON_LITERAL_NUMBERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLITERAL_STRINGRule())
			return getLITERAL_STRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal JSON_LITERAL_BOOLEAN:
	 * 	'true' | 'false'
	 * ;
	 */
	protected String getJSON_LITERAL_BOOLEANToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * terminal JSON_LITERAL_NULL: 'null';
	 */
	protected String getJSON_LITERAL_NULLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "null";
	}
	
	/**
	 * terminal JSON_LITERAL_NUMBER:
	 * 	('0'..'9')* ('.' ('0'..'9')+)?;
	 */
	protected String getJSON_LITERAL_NUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal LITERAL_STRING:
	 * 	SINGLE_QUOTED_STRING | DOUBLE_QUOTED_STRING
	 * ;
	 */
	protected String getLITERAL_STRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'\"\"\'";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_JsonArray_CommaKeyword_2_2_q.equals(syntax))
				emit_JsonArray_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonMetaType_BooleanKeyword_0_or_NumberKeyword_1_or_StringKeyword_2.equals(syntax))
				emit_JsonMetaType_BooleanKeyword_0_or_NumberKeyword_1_or_StringKeyword_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonObject_CommaKeyword_2_2_q.equals(syntax))
				emit_JsonObject_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonType_JSON_LITERAL_BOOLEANTerminalRuleCall_0_or_JSON_LITERAL_NULLTerminalRuleCall_3_or_JSON_LITERAL_NUMBERTerminalRuleCall_2_or_LITERAL_STRINGTerminalRuleCall_1.equals(syntax))
				emit_JsonType_JSON_LITERAL_BOOLEANTerminalRuleCall_0_or_JSON_LITERAL_NULLTerminalRuleCall_3_or_JSON_LITERAL_NUMBERTerminalRuleCall_2_or_LITERAL_STRINGTerminalRuleCall_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XplatformHeader_CommaKeyword_3_2_q.equals(syntax))
				emit_XplatformHeader_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Xplatform___STRINGTerminalRuleCall_4_0_or_STRINGTerminalRuleCall_4_2__a.equals(syntax))
				emit_Xplatform___STRINGTerminalRuleCall_4_0_or_STRINGTerminalRuleCall_4_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_JsonArray_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'number' | 'string' | 'boolean'
	 */
	protected void emit_JsonMetaType_BooleanKeyword_0_or_NumberKeyword_1_or_StringKeyword_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_JsonObject_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LITERAL_STRING | JSON_LITERAL_BOOLEAN | JSON_LITERAL_NUMBER | JSON_LITERAL_NULL
	 */
	protected void emit_JsonType_JSON_LITERAL_BOOLEANTerminalRuleCall_0_or_JSON_LITERAL_NULLTerminalRuleCall_3_or_JSON_LITERAL_NUMBERTerminalRuleCall_2_or_LITERAL_STRINGTerminalRuleCall_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_XplatformHeader_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (STRING | STRING)*
	 */
	protected void emit_Xplatform___STRINGTerminalRuleCall_4_0_or_STRINGTerminalRuleCall_4_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
