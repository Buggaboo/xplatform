package nl.sison.serializer;

import com.google.inject.Inject;
import java.util.List;
import nl.sison.services.XplatformGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class XplatformSyntacticSequencer extends AbstractSyntacticSequencer {

	protected XplatformGrammarAccess grammarAccess;
	protected AbstractElementAlias match_JsonArray_CommaKeyword_0_2_2_q;
	protected AbstractElementAlias match_JsonArray_CommaKeyword_1_2_2_q;
	protected AbstractElementAlias match_JsonScalarType___FullStopKeyword_2_1_0_INTTerminalRuleCall_2_1_1__q;
	protected AbstractElementAlias match_URI_ANY_OTHERTerminalRuleCall_0_p;
	protected AbstractElementAlias match_URI_ANY_OTHERTerminalRuleCall_1_3_a;
	protected AbstractElementAlias match_UnnestedKeyPairs_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_XplatformHeader_CommaKeyword_3_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (XplatformGrammarAccess) access;
		match_JsonArray_CommaKeyword_0_2_2_q = new TokenAlias(false, true, grammarAccess.getJsonArrayAccess().getCommaKeyword_0_2_2());
		match_JsonArray_CommaKeyword_1_2_2_q = new TokenAlias(false, true, grammarAccess.getJsonArrayAccess().getCommaKeyword_1_2_2());
		match_JsonScalarType___FullStopKeyword_2_1_0_INTTerminalRuleCall_2_1_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getJsonScalarTypeAccess().getFullStopKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getJsonScalarTypeAccess().getINTTerminalRuleCall_2_1_1()));
		match_URI_ANY_OTHERTerminalRuleCall_0_p = new TokenAlias(true, false, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_0());
		match_URI_ANY_OTHERTerminalRuleCall_1_3_a = new TokenAlias(true, true, grammarAccess.getURIAccess().getANY_OTHERTerminalRuleCall_1_3());
		match_UnnestedKeyPairs_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getUnnestedKeyPairsAccess().getCommaKeyword_1_2());
		match_XplatformHeader_CommaKeyword_3_2_q = new TokenAlias(false, true, grammarAccess.getXplatformHeaderAccess().getCommaKeyword_3_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANY_OTHERRule())
			return getANY_OTHERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
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
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_JsonArray_CommaKeyword_0_2_2_q.equals(syntax))
				emit_JsonArray_CommaKeyword_0_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonArray_CommaKeyword_1_2_2_q.equals(syntax))
				emit_JsonArray_CommaKeyword_1_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_JsonScalarType___FullStopKeyword_2_1_0_INTTerminalRuleCall_2_1_1__q.equals(syntax))
				emit_JsonScalarType___FullStopKeyword_2_1_0_INTTerminalRuleCall_2_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_URI_ANY_OTHERTerminalRuleCall_0_p.equals(syntax))
				emit_URI_ANY_OTHERTerminalRuleCall_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_URI_ANY_OTHERTerminalRuleCall_1_3_a.equals(syntax))
				emit_URI_ANY_OTHERTerminalRuleCall_1_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_UnnestedKeyPairs_CommaKeyword_1_2_q.equals(syntax))
				emit_UnnestedKeyPairs_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XplatformHeader_CommaKeyword_3_2_q.equals(syntax))
				emit_XplatformHeader_CommaKeyword_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_JsonArray_CommaKeyword_0_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_JsonArray_CommaKeyword_1_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('.' INT)?
	 */
	protected void emit_JsonScalarType___FullStopKeyword_2_1_0_INTTerminalRuleCall_2_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_UnnestedKeyPairs_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_XplatformHeader_CommaKeyword_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
