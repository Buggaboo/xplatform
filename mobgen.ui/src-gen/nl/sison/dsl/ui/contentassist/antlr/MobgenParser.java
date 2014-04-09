/*
* generated by Xtext
*/
package nl.sison.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import nl.sison.dsl.services.MobgenGrammarAccess;

public class MobgenParser extends AbstractContentAssistParser {
	
	@Inject
	private MobgenGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected nl.sison.dsl.ui.contentassist.antlr.internal.InternalMobgenParser createParser() {
		nl.sison.dsl.ui.contentassist.antlr.internal.InternalMobgenParser result = new nl.sison.dsl.ui.contentassist.antlr.internal.InternalMobgenParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMobgenAccess().getAlternatives_1(), "rule__Mobgen__Alternatives_1");
					put(grammarAccess.getMobgenHeaderKeyValuePairAccess().getAlternatives_2(), "rule__MobgenHeaderKeyValuePair__Alternatives_2");
					put(grammarAccess.getJsonObjectValueAccess().getAlternatives(), "rule__JsonObjectValue__Alternatives");
					put(grammarAccess.getJsonCompositeValueAccess().getAlternatives(), "rule__JsonCompositeValue__Alternatives");
					put(grammarAccess.getJsonLiteralValueAccess().getAlternatives(), "rule__JsonLiteralValue__Alternatives");
					put(grammarAccess.getMobgenResourceDefinitionAccess().getAlternatives(), "rule__MobgenResourceDefinition__Alternatives");
					put(grammarAccess.getNestedTypeAccess().getAlternatives(), "rule__NestedType__Alternatives");
					put(grammarAccess.getMobgenAccess().getGroup(), "rule__Mobgen__Group__0");
					put(grammarAccess.getPlatformAccess().getGroup(), "rule__Platform__Group__0");
					put(grammarAccess.getPlatformAccess().getGroup_2(), "rule__Platform__Group_2__0");
					put(grammarAccess.getMobgenCallDefinitionAccess().getGroup(), "rule__MobgenCallDefinition__Group__0");
					put(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6(), "rule__MobgenCallDefinition__Group_6__0");
					put(grammarAccess.getMobgenCallDefinitionAccess().getGroup_6_5(), "rule__MobgenCallDefinition__Group_6_5__0");
					put(grammarAccess.getMobgenCallDefinitionAccess().getGroup_7(), "rule__MobgenCallDefinition__Group_7__0");
					put(grammarAccess.getMobgenCallDefinitionAccess().getGroup_8(), "rule__MobgenCallDefinition__Group_8__0");
					put(grammarAccess.getURIAccess().getGroup(), "rule__URI__Group__0");
					put(grammarAccess.getURIAccess().getGroup_1(), "rule__URI__Group_1__0");
					put(grammarAccess.getMobgenHeaderAccess().getGroup(), "rule__MobgenHeader__Group__0");
					put(grammarAccess.getMobgenHeaderAccess().getGroup_4(), "rule__MobgenHeader__Group_4__0");
					put(grammarAccess.getMobgenHeaderKeyValuePairAccess().getGroup(), "rule__MobgenHeaderKeyValuePair__Group__0");
					put(grammarAccess.getMobgenJsonAccess().getGroup(), "rule__MobgenJson__Group__0");
					put(grammarAccess.getJsonObjectAccess().getGroup(), "rule__JsonObject__Group__0");
					put(grammarAccess.getJsonObjectAccess().getGroup_2(), "rule__JsonObject__Group_2__0");
					put(grammarAccess.getJsonKeyValuePairAccess().getGroup(), "rule__JsonKeyValuePair__Group__0");
					put(grammarAccess.getJsonArrayAccess().getGroup(), "rule__JsonArray__Group__0");
					put(grammarAccess.getJsonArrayAccess().getGroup_2(), "rule__JsonArray__Group_2__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup(), "rule__EnumInstance__Group__0");
					put(grammarAccess.getEnumInstanceAccess().getGroup_4(), "rule__EnumInstance__Group_4__0");
					put(grammarAccess.getMapInstanceAccess().getGroup(), "rule__MapInstance__Group__0");
					put(grammarAccess.getMapInstanceAccess().getGroup_3(), "rule__MapInstance__Group_3__0");
					put(grammarAccess.getMapInstanceAccess().getGroup_4(), "rule__MapInstance__Group_4__0");
					put(grammarAccess.getStringListAccess().getGroup(), "rule__StringList__Group__0");
					put(grammarAccess.getStringListAccess().getGroup_2(), "rule__StringList__Group_2__0");
					put(grammarAccess.getMobgenAccess().getPlatformAssignment_0(), "rule__Mobgen__PlatformAssignment_0");
					put(grammarAccess.getMobgenAccess().getResourcesAssignment_1_0(), "rule__Mobgen__ResourcesAssignment_1_0");
					put(grammarAccess.getMobgenAccess().getCallsAssignment_1_1(), "rule__Mobgen__CallsAssignment_1_1");
					put(grammarAccess.getPlatformAccess().getPlatformsAssignment_2_0(), "rule__Platform__PlatformsAssignment_2_0");
					put(grammarAccess.getPlatformAccess().getGenerateWhereAssignment_2_2(), "rule__Platform__GenerateWhereAssignment_2_2");
					put(grammarAccess.getMobgenCallDefinitionAccess().getNameAssignment_1(), "rule__MobgenCallDefinition__NameAssignment_1");
					put(grammarAccess.getMobgenCallDefinitionAccess().getMethodAssignment_3(), "rule__MobgenCallDefinition__MethodAssignment_3");
					put(grammarAccess.getMobgenCallDefinitionAccess().getUriAssignment_5(), "rule__MobgenCallDefinition__UriAssignment_5");
					put(grammarAccess.getMobgenCallDefinitionAccess().getRequestHeadersAssignment_6_4(), "rule__MobgenCallDefinition__RequestHeadersAssignment_6_4");
					put(grammarAccess.getMobgenCallDefinitionAccess().getResponseHeadersAssignment_6_5_2(), "rule__MobgenCallDefinition__ResponseHeadersAssignment_6_5_2");
					put(grammarAccess.getMobgenCallDefinitionAccess().getJsonToClientAssignment_7_2(), "rule__MobgenCallDefinition__JsonToClientAssignment_7_2");
					put(grammarAccess.getMobgenCallDefinitionAccess().getJsonToServerAssignment_8_2(), "rule__MobgenCallDefinition__JsonToServerAssignment_8_2");
					put(grammarAccess.getURIAccess().getStringPrefixAssignment_0(), "rule__URI__StringPrefixAssignment_0");
					put(grammarAccess.getURIAccess().getParametersAssignment_1_1(), "rule__URI__ParametersAssignment_1_1");
					put(grammarAccess.getURIAccess().getStringSuffixAssignment_1_3(), "rule__URI__StringSuffixAssignment_1_3");
					put(grammarAccess.getMobgenHeaderAccess().getNameAssignment_0(), "rule__MobgenHeader__NameAssignment_0");
					put(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_3(), "rule__MobgenHeader__HeaderKeyValuesAssignment_3");
					put(grammarAccess.getMobgenHeaderAccess().getHeaderKeyValuesAssignment_4_1(), "rule__MobgenHeader__HeaderKeyValuesAssignment_4_1");
					put(grammarAccess.getMobgenHeaderKeyValuePairAccess().getKeyAssignment_0(), "rule__MobgenHeaderKeyValuePair__KeyAssignment_0");
					put(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_0(), "rule__MobgenHeaderKeyValuePair__ValueAssignment_2_0");
					put(grammarAccess.getMobgenHeaderKeyValuePairAccess().getValueAssignment_2_1(), "rule__MobgenHeaderKeyValuePair__ValueAssignment_2_1");
					put(grammarAccess.getMobgenJsonAccess().getNameAssignment_0(), "rule__MobgenJson__NameAssignment_0");
					put(grammarAccess.getMobgenJsonAccess().getValueAssignment_2(), "rule__MobgenJson__ValueAssignment_2");
					put(grammarAccess.getJsonObjectValueAccess().getValueAssignment_0(), "rule__JsonObjectValue__ValueAssignment_0");
					put(grammarAccess.getJsonObjectValueAccess().getCompositeAssignment_1(), "rule__JsonObjectValue__CompositeAssignment_1");
					put(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_1(), "rule__JsonObject__KeyValuePairAssignment_1");
					put(grammarAccess.getJsonObjectAccess().getKeyValuePairAssignment_2_1(), "rule__JsonObject__KeyValuePairAssignment_2_1");
					put(grammarAccess.getJsonKeyValuePairAccess().getKeyAssignment_0(), "rule__JsonKeyValuePair__KeyAssignment_0");
					put(grammarAccess.getJsonKeyValuePairAccess().getValueAssignment_2(), "rule__JsonKeyValuePair__ValueAssignment_2");
					put(grammarAccess.getJsonArrayAccess().getItemsAssignment_1(), "rule__JsonArray__ItemsAssignment_1");
					put(grammarAccess.getJsonArrayAccess().getItemsAssignment_2_1(), "rule__JsonArray__ItemsAssignment_2_1");
					put(grammarAccess.getMobgenResourceDefinitionAccess().getResourcesAssignment_0(), "rule__MobgenResourceDefinition__ResourcesAssignment_0");
					put(grammarAccess.getEnumInstanceAccess().getNameAssignment_1(), "rule__EnumInstance__NameAssignment_1");
					put(grammarAccess.getEnumInstanceAccess().getValuesAssignment_3(), "rule__EnumInstance__ValuesAssignment_3");
					put(grammarAccess.getEnumInstanceAccess().getValuesAssignment_4_1(), "rule__EnumInstance__ValuesAssignment_4_1");
					put(grammarAccess.getMapInstanceAccess().getNameAssignment_1(), "rule__MapInstance__NameAssignment_1");
					put(grammarAccess.getMapInstanceAccess().getKeysAssignment_3_0(), "rule__MapInstance__KeysAssignment_3_0");
					put(grammarAccess.getMapInstanceAccess().getValuesAssignment_3_2(), "rule__MapInstance__ValuesAssignment_3_2");
					put(grammarAccess.getMapInstanceAccess().getKeysAssignment_4_1(), "rule__MapInstance__KeysAssignment_4_1");
					put(grammarAccess.getMapInstanceAccess().getValuesAssignment_4_3(), "rule__MapInstance__ValuesAssignment_4_3");
					put(grammarAccess.getStringListAccess().getValuesAssignment_1(), "rule__StringList__ValuesAssignment_1");
					put(grammarAccess.getStringListAccess().getValuesAssignment_2_1(), "rule__StringList__ValuesAssignment_2_1");
					put(grammarAccess.getNestedTypeAccess().getListAssignment_0(), "rule__NestedType__ListAssignment_0");
					put(grammarAccess.getNestedTypeAccess().getStringAssignment_1(), "rule__NestedType__StringAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			nl.sison.dsl.ui.contentassist.antlr.internal.InternalMobgenParser typedParser = (nl.sison.dsl.ui.contentassist.antlr.internal.InternalMobgenParser) parser;
			typedParser.entryRuleMobgen();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MobgenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MobgenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
