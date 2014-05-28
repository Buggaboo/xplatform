package nl.sison.dsl.mobgen.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.sison.dsl.mobgen.services.RestfulGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class RestfulSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RestfulGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EnumInstance_CommaKeyword_5_q;
	protected AbstractElementAlias match_JsonArray_CommaKeyword_3_q;
	protected AbstractElementAlias match_JsonObject_CommaKeyword_3_q;
	protected AbstractElementAlias match_MapInstance_CommaKeyword_5_q;
	protected AbstractElementAlias match_MobgenHeader_CommaKeyword_5_q;
	protected AbstractElementAlias match_StringList_CommaKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RestfulGrammarAccess) access;
		match_EnumInstance_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
		match_JsonArray_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
		match_JsonObject_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
		match_MapInstance_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
		match_MobgenHeader_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5());
		match_StringList_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getStringListAccess().getCommaKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEMPTY_JSON_ARRAYRule())
			return getEMPTY_JSON_ARRAYToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getEMPTY_JSON_OBJECTRule())
			return getEMPTY_JSON_OBJECTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_LITERAL_NULLRule())
			return getJSON_LITERAL_NULLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_NUMBER_FLOATRule())
			return getJSON_NUMBER_FLOATToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJsonEnumTypeRule())
			return getJsonEnumTypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
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
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
	 * terminal JSON_NUMBER_FLOAT:
	 * 	INT ('.' INT) ;
	 */
	protected String getJSON_NUMBER_FLOATToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * JsonEnumType:
	 * 	'enum' '{' STRING (',' STRING)* (',')? '}'
	 * ;
	 */
	protected String getJsonEnumTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "enum{\"\"}";
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
			else if(match_JsonObject_CommaKeyword_3_q.equals(syntax))
				emit_JsonObject_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MapInstance_CommaKeyword_5_q.equals(syntax))
				emit_MapInstance_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MobgenHeader_CommaKeyword_5_q.equals(syntax))
				emit_MobgenHeader_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StringList_CommaKeyword_3_q.equals(syntax))
				emit_StringList_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	protected void emit_MobgenHeader_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_StringList_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
