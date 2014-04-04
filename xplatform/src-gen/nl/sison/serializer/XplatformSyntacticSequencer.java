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
	protected AbstractElementAlias match_EnumInstance_CommaKeyword_5_q;
	protected AbstractElementAlias match_JsonArray_CommaKeyword_3_q;
	protected AbstractElementAlias match_JsonObjectValue_EMPTY_JSON_ARRAYTerminalRuleCall_4_or_EMPTY_JSON_OBJECTTerminalRuleCall_3_or_JSON_LITERAL_BOOLEANTerminalRuleCall_5_or_JSON_LITERAL_NULLTerminalRuleCall_6_or_JSON_META_SCALAR_TYPETerminalRuleCall_7_or_JSON_NUMBERTerminalRuleCall_8;
	protected AbstractElementAlias match_JsonObject_CommaKeyword_3_q;
	protected AbstractElementAlias match_MapInstance_CommaKeyword_5_q;
	protected AbstractElementAlias match_StringList_CommaKeyword_3_q;
	protected AbstractElementAlias match_URI_ANY_OTHERTerminalRuleCall_0_p;
	protected AbstractElementAlias match_URI_ANY_OTHERTerminalRuleCall_1_3_a;
	protected AbstractElementAlias match_XplatformHeader_CommaKeyword_5_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XplatformGrammarAccess) access;
		match_EnumInstance_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
		match_JsonArray_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
		match_JsonObjectValue_EMPTY_JSON_ARRAYTerminalRuleCall_4_or_EMPTY_JSON_OBJECTTerminalRuleCall_3_or_JSON_LITERAL_BOOLEANTerminalRuleCall_5_or_JSON_LITERAL_NULLTerminalRuleCall_6_or_JSON_META_SCALAR_TYPETerminalRuleCall_7_or_JSON_NUMBERTerminalRuleCall_8 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_ARRAYTerminalRuleCall_4()), new TokenAlias(false, false, grammarAccess.getJsonObjectValueAccess().getEMPTY_JSON_OBJECTTerminalRuleCall_3()), new TokenAlias(false, false, grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_BOOLEANTerminalRuleCall_5()), new TokenAlias(false, false, grammarAccess.getJsonObjectValueAccess().getJSON_LITERAL_NULLTerminalRuleCall_6()), new TokenAlias(false, false, grammarAccess.getJsonObjectValueAccess().getJSON_META_SCALAR_TYPETerminalRuleCall_7()), new TokenAlias(false, false, grammarAccess.getJsonObjectValueAccess().getJSON_NUMBERTerminalRuleCall_8()));
		match_JsonObject_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
		match_MapInstance_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
		match_StringList_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getStringListAccess().getCommaKeyword_3());
		match_URI_ANY_OTHERTerminalRuleCall_0_p = new TokenAlias(true, false, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0());
		match_URI_ANY_OTHERTerminalRuleCall_1_3_a = new TokenAlias(true, true, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3());
		match_XplatformHeader_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_5());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANY_OTHERRule())
			return getANY_OTHERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEMPTY_JSON_ARRAYRule())
			return getEMPTY_JSON_ARRAYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEMPTY_JSON_OBJECTRule())
			return getEMPTY_JSON_OBJECTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_LITERAL_BOOLEANRule())
			return getJSON_LITERAL_BOOLEANToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_LITERAL_NULLRule())
			return getJSON_LITERAL_NULLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_META_SCALAR_TYPERule())
			return getJSON_META_SCALAR_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_NUMBERRule())
			return getJSON_NUMBERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ANY_OTHER: .;
	 */
	protected String getANY_OTHERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal EMPTY_JSON_ARRAY:
	 * 	'[]'
	 * ;
	 */
	protected String getEMPTY_JSON_ARRAYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[]";
	}
	
	/**
	 * terminal EMPTY_JSON_OBJECT:
	 * 	'{}'
	 * ;
	 */
	protected String getEMPTY_JSON_OBJECTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{}";
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
	 * terminal JSON_META_SCALAR_TYPE:
	 * 	'boolean' | 'number' | 'string'
	 * ;
	 */
	protected String getJSON_META_SCALAR_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "boolean";
	}
	
	/**
	 * terminal JSON_NUMBER:
	 * 	('0' | '1..9'+ INT) ('.' INT)?
	 * ;
	 */
	protected String getJSON_NUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "0";
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
			if(match_EnumInstance_CommaKeyword_5_q.equals(syntax))
				emit_EnumInstance_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonArray_CommaKeyword_3_q.equals(syntax))
				emit_JsonArray_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonObjectValue_EMPTY_JSON_ARRAYTerminalRuleCall_4_or_EMPTY_JSON_OBJECTTerminalRuleCall_3_or_JSON_LITERAL_BOOLEANTerminalRuleCall_5_or_JSON_LITERAL_NULLTerminalRuleCall_6_or_JSON_META_SCALAR_TYPETerminalRuleCall_7_or_JSON_NUMBERTerminalRuleCall_8.equals(syntax))
				emit_JsonObjectValue_EMPTY_JSON_ARRAYTerminalRuleCall_4_or_EMPTY_JSON_OBJECTTerminalRuleCall_3_or_JSON_LITERAL_BOOLEANTerminalRuleCall_5_or_JSON_LITERAL_NULLTerminalRuleCall_6_or_JSON_META_SCALAR_TYPETerminalRuleCall_7_or_JSON_NUMBERTerminalRuleCall_8(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonObject_CommaKeyword_3_q.equals(syntax))
				emit_JsonObject_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MapInstance_CommaKeyword_5_q.equals(syntax))
				emit_MapInstance_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StringList_CommaKeyword_3_q.equals(syntax))
				emit_StringList_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_URI_ANY_OTHERTerminalRuleCall_0_p.equals(syntax))
				emit_URI_ANY_OTHERTerminalRuleCall_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_URI_ANY_OTHERTerminalRuleCall_1_3_a.equals(syntax))
				emit_URI_ANY_OTHERTerminalRuleCall_1_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XplatformHeader_CommaKeyword_5_q.equals(syntax))
				emit_XplatformHeader_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_EnumInstance_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_JsonArray_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     EMPTY_JSON_ARRAY | 
	     EMPTY_JSON_OBJECT | 
	     JSON_META_SCALAR_TYPE | 
	     JSON_LITERAL_NULL | 
	     JSON_LITERAL_BOOLEAN | 
	     JSON_NUMBER
	 )
	 */
	protected void emit_JsonObjectValue_EMPTY_JSON_ARRAYTerminalRuleCall_4_or_EMPTY_JSON_OBJECTTerminalRuleCall_3_or_JSON_LITERAL_BOOLEANTerminalRuleCall_5_or_JSON_LITERAL_NULLTerminalRuleCall_6_or_JSON_META_SCALAR_TYPETerminalRuleCall_7_or_JSON_NUMBERTerminalRuleCall_8(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_JsonObject_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_MapInstance_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_StringList_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ANY_OTHER+
	 */
	protected void emit_URI_ANY_OTHERTerminalRuleCall_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ANY_OTHER*
	 */
	protected void emit_URI_ANY_OTHERTerminalRuleCall_1_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_XplatformHeader_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
