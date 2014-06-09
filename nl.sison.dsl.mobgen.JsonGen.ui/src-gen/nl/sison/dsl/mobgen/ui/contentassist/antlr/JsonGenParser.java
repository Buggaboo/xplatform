/*
* generated by Xtext
*/
package nl.sison.dsl.mobgen.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import nl.sison.dsl.mobgen.services.JsonGenGrammarAccess;

public class JsonGenParser extends AbstractContentAssistParser {
	
	@Inject
	private JsonGenGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected nl.sison.dsl.mobgen.ui.contentassist.antlr.internal.InternalJsonGenParser createParser() {
		nl.sison.dsl.mobgen.ui.contentassist.antlr.internal.InternalJsonGenParser result = new nl.sison.dsl.mobgen.ui.contentassist.antlr.internal.InternalJsonGenParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getJsonValueAccess().getAlternatives(), "rule__JsonValue__Alternatives");
					put(grammarAccess.getExJsonDateTimeAccess().getAlternatives(), "rule__ExJsonDateTime__Alternatives");
					put(grammarAccess.getJsonObjectAccess().getGroup(), "rule__JsonObject__Group__0");
					put(grammarAccess.getJsonObjectAccess().getGroup_2(), "rule__JsonObject__Group_2__0");
					put(grammarAccess.getMemberAccess().getGroup(), "rule__Member__Group__0");
					put(grammarAccess.getJsonArrayAccess().getGroup(), "rule__JsonArray__Group__0");
					put(grammarAccess.getJsonArrayAccess().getGroup_2(), "rule__JsonArray__Group_2__0");
					put(grammarAccess.getExJsonEnumAccess().getGroup(), "rule__ExJsonEnum__Group__0");
					put(grammarAccess.getExJsonEnumAccess().getGroup_3(), "rule__ExJsonEnum__Group_3__0");
					put(grammarAccess.getExJsonDateTimeAccess().getGroup_1(), "rule__ExJsonDateTime__Group_1__0");
					put(grammarAccess.getJsonObjectAccess().getMembersAssignment_1(), "rule__JsonObject__MembersAssignment_1");
					put(grammarAccess.getJsonObjectAccess().getMembersAssignment_2_1(), "rule__JsonObject__MembersAssignment_2_1");
					put(grammarAccess.getMemberAccess().getOptionalAssignment_0(), "rule__Member__OptionalAssignment_0");
					put(grammarAccess.getMemberAccess().getKeyAssignment_1(), "rule__Member__KeyAssignment_1");
					put(grammarAccess.getMemberAccess().getValueAssignment_3(), "rule__Member__ValueAssignment_3");
					put(grammarAccess.getJsonValueAccess().getObjAssignment_0(), "rule__JsonValue__ObjAssignment_0");
					put(grammarAccess.getJsonValueAccess().getStrAssignment_1(), "rule__JsonValue__StrAssignment_1");
					put(grammarAccess.getJsonValueAccess().getArrayAssignment_2(), "rule__JsonValue__ArrayAssignment_2");
					put(grammarAccess.getJsonValueAccess().getBoolAssignment_3(), "rule__JsonValue__BoolAssignment_3");
					put(grammarAccess.getJsonValueAccess().getNullAssignment_4(), "rule__JsonValue__NullAssignment_4");
					put(grammarAccess.getJsonValueAccess().getIntAssignment_5(), "rule__JsonValue__IntAssignment_5");
					put(grammarAccess.getJsonValueAccess().getFloatAssignment_6(), "rule__JsonValue__FloatAssignment_6");
					put(grammarAccess.getJsonValueAccess().getStrFromEnumAssignment_7(), "rule__JsonValue__StrFromEnumAssignment_7");
					put(grammarAccess.getJsonValueAccess().getDatetimeAssignment_8(), "rule__JsonValue__DatetimeAssignment_8");
					put(grammarAccess.getJsonArrayAccess().getValuesAssignment_1(), "rule__JsonArray__ValuesAssignment_1");
					put(grammarAccess.getJsonArrayAccess().getValuesAssignment_2_1(), "rule__JsonArray__ValuesAssignment_2_1");
					put(grammarAccess.getExJsonEnumAccess().getValuesAssignment_2(), "rule__ExJsonEnum__ValuesAssignment_2");
					put(grammarAccess.getExJsonEnumAccess().getValuesAssignment_3_1(), "rule__ExJsonEnum__ValuesAssignment_3_1");
					put(grammarAccess.getExJsonDateTimeAccess().getUtcAssignment_0(), "rule__ExJsonDateTime__UtcAssignment_0");
					put(grammarAccess.getExJsonDateTimeAccess().getFormatAssignment_1_2(), "rule__ExJsonDateTime__FormatAssignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			nl.sison.dsl.mobgen.ui.contentassist.antlr.internal.InternalJsonGenParser typedParser = (nl.sison.dsl.mobgen.ui.contentassist.antlr.internal.InternalJsonGenParser) parser;
			typedParser.entryRuleJsonObject();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public JsonGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(JsonGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
