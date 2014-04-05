package nl.sison.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.sison.dsl.services.MobgenGrammarAccess;
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
public class MobgenSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MobgenGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EnumInstance_CommaKeyword_5_q;
	protected AbstractElementAlias match_JsonArray_CommaKeyword_3_q;
	protected AbstractElementAlias match_JsonObject_CommaKeyword_3_q;
	protected AbstractElementAlias match_MapInstance_CommaKeyword_5_q;
	protected AbstractElementAlias match_MobgenHeader_CommaKeyword_5_q;
	protected AbstractElementAlias match_StringList_CommaKeyword_3_q;
	protected AbstractElementAlias match_URI_ANY_OTHERTerminalRuleCall_0_p;
	protected AbstractElementAlias match_URI_ANY_OTHERTerminalRuleCall_1_3_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MobgenGrammarAccess) access;
		match_EnumInstance_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getEnumInstanceAccess().getCommaKeyword_5());
		match_JsonArray_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getJsonArrayAccess().getCommaKeyword_3());
		match_JsonObject_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getJsonObjectAccess().getCommaKeyword_3());
		match_MapInstance_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getMapInstanceAccess().getCommaKeyword_5());
		match_MobgenHeader_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getMobgenHeaderAccess().getCommaKeyword_5());
		match_StringList_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getStringListAccess().getCommaKeyword_3());
		match_URI_ANY_OTHERTerminalRuleCall_0_p = new TokenAlias(true, false, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0());
		match_URI_ANY_OTHERTerminalRuleCall_1_3_a = new TokenAlias(true, true, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANY_OTHERRule())
			return getANY_OTHERToken(semanticObject, ruleCall, node);
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
			else if(match_URI_ANY_OTHERTerminalRuleCall_0_p.equals(syntax))
				emit_URI_ANY_OTHERTerminalRuleCall_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_URI_ANY_OTHERTerminalRuleCall_1_3_a.equals(syntax))
				emit_URI_ANY_OTHERTerminalRuleCall_1_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
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
	
}
