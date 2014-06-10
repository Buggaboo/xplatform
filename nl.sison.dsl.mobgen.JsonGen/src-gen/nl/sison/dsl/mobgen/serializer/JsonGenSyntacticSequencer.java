package nl.sison.dsl.mobgen.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.sison.dsl.mobgen.services.JsonGenGrammarAccess;
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
public class JsonGenSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JsonGenGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExJsonEnum_LeftCurlyBracketKeyword_1_0_or_LeftParenthesisKeyword_1_1;
	protected AbstractElementAlias match_ExJsonEnum_RightCurlyBracketKeyword_4_1_or_RightParenthesisKeyword_4_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JsonGenGrammarAccess) access;
		match_ExJsonEnum_LeftCurlyBracketKeyword_1_0_or_LeftParenthesisKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExJsonEnumAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getExJsonEnumAccess().getLeftParenthesisKeyword_1_1()));
		match_ExJsonEnum_RightCurlyBracketKeyword_4_1_or_RightParenthesisKeyword_4_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExJsonEnumAccess().getRightCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getExJsonEnumAccess().getRightParenthesisKeyword_4_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_BOOLEANRule())
			return getJSON_BOOLEANToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_FLOATRule())
			return getJSON_FLOATToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getJSON_NULLRule())
			return getJSON_NULLToken(semanticObject, ruleCall, node);
		return "";
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
	 * terminal JSON_BOOLEAN:
	 *   'true' | 'false' | 'boolean';
	 */
	protected String getJSON_BOOLEANToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * terminal JSON_FLOAT:
	 * 	'-'? INT '.' INT (('E'|'e') '-'? INT)?;
	 */
	protected String getJSON_FLOATToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal JSON_NULL:
	 *   'null';
	 */
	protected String getJSON_NULLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "null";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ExJsonEnum_LeftCurlyBracketKeyword_1_0_or_LeftParenthesisKeyword_1_1.equals(syntax))
				emit_ExJsonEnum_LeftCurlyBracketKeyword_1_0_or_LeftParenthesisKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExJsonEnum_RightCurlyBracketKeyword_4_1_or_RightParenthesisKeyword_4_0.equals(syntax))
				emit_ExJsonEnum_RightCurlyBracketKeyword_4_1_or_RightParenthesisKeyword_4_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '(' | '{'
	 */
	protected void emit_ExJsonEnum_LeftCurlyBracketKeyword_1_0_or_LeftParenthesisKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')' | '}'
	 */
	protected void emit_ExJsonEnum_RightCurlyBracketKeyword_4_1_or_RightParenthesisKeyword_4_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
