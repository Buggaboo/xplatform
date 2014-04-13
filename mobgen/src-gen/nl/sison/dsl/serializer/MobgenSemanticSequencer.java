package nl.sison.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.sison.dsl.mobgen.EnumInstance;
import nl.sison.dsl.mobgen.JsonArray;
import nl.sison.dsl.mobgen.JsonKeyValuePair;
import nl.sison.dsl.mobgen.JsonObject;
import nl.sison.dsl.mobgen.JsonObjectValue;
import nl.sison.dsl.mobgen.MapInstance;
import nl.sison.dsl.mobgen.Mobgen;
import nl.sison.dsl.mobgen.MobgenCallDefinition;
import nl.sison.dsl.mobgen.MobgenHeader;
import nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair;
import nl.sison.dsl.mobgen.MobgenHeaderParameter;
import nl.sison.dsl.mobgen.MobgenJson;
import nl.sison.dsl.mobgen.MobgenPackage;
import nl.sison.dsl.mobgen.MobgenResourceDefinition;
import nl.sison.dsl.mobgen.NestedType;
import nl.sison.dsl.mobgen.Platform;
import nl.sison.dsl.mobgen.StringList;
import nl.sison.dsl.mobgen.URI;
import nl.sison.dsl.services.MobgenGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MobgenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MobgenGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MobgenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MobgenPackage.ENUM_INSTANCE:
				if(context == grammarAccess.getEnumInstanceRule() ||
				   context == grammarAccess.getMobgenResourceDefinitionRule()) {
					sequence_EnumInstance(context, (EnumInstance) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.JSON_ARRAY:
				if(context == grammarAccess.getJsonArrayRule()) {
					sequence_JsonArray(context, (JsonArray) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.JSON_KEY_VALUE_PAIR:
				if(context == grammarAccess.getJsonKeyValuePairRule()) {
					sequence_JsonKeyValuePair(context, (JsonKeyValuePair) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.JSON_OBJECT:
				if(context == grammarAccess.getJsonObjectRule()) {
					sequence_JsonObject(context, (JsonObject) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.JSON_OBJECT_VALUE:
				if(context == grammarAccess.getJsonObjectValueRule()) {
					sequence_JsonObjectValue(context, (JsonObjectValue) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MAP_INSTANCE:
				if(context == grammarAccess.getMapInstanceRule()) {
					sequence_MapInstance(context, (MapInstance) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MOBGEN:
				if(context == grammarAccess.getMobgenRule()) {
					sequence_Mobgen(context, (Mobgen) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MOBGEN_CALL_DEFINITION:
				if(context == grammarAccess.getMobgenCallDefinitionRule()) {
					sequence_MobgenCallDefinition(context, (MobgenCallDefinition) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MOBGEN_HEADER:
				if(context == grammarAccess.getMobgenHeaderRule()) {
					sequence_MobgenHeader(context, (MobgenHeader) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MOBGEN_HEADER_KEY_VALUE_PAIR:
				if(context == grammarAccess.getMobgenHeaderKeyValuePairRule()) {
					sequence_MobgenHeaderKeyValuePair(context, (MobgenHeaderKeyValuePair) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MOBGEN_HEADER_PARAMETER:
				if(context == grammarAccess.getMobgenHeaderParameterRule()) {
					sequence_MobgenHeaderParameter(context, (MobgenHeaderParameter) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MOBGEN_JSON:
				if(context == grammarAccess.getMobgenJsonRule()) {
					sequence_MobgenJson(context, (MobgenJson) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.MOBGEN_RESOURCE_DEFINITION:
				if(context == grammarAccess.getMobgenResourceDefinitionRule()) {
					sequence_MobgenResourceDefinition(context, (MobgenResourceDefinition) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.NESTED_TYPE:
				if(context == grammarAccess.getNestedTypeRule()) {
					sequence_NestedType(context, (NestedType) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.PLATFORM:
				if(context == grammarAccess.getPlatformRule()) {
					sequence_Platform(context, (Platform) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.STRING_LIST:
				if(context == grammarAccess.getStringListRule()) {
					sequence_StringList(context, (StringList) semanticObject); 
					return; 
				}
				else break;
			case MobgenPackage.URI:
				if(context == grammarAccess.getURIRule()) {
					sequence_URI(context, (URI) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID values+=ID values+=ID*)
	 */
	protected void sequence_EnumInstance(EObject context, EnumInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (items+=JsonObjectValue items+=JsonObjectValue*)
	 */
	protected void sequence_JsonArray(EObject context, JsonArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=JsonObjectValue)
	 */
	protected void sequence_JsonKeyValuePair(EObject context, JsonKeyValuePair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MobgenPackage.Literals.JSON_KEY_VALUE_PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MobgenPackage.Literals.JSON_KEY_VALUE_PAIR__KEY));
			if(transientValues.isValueTransient(semanticObject, MobgenPackage.Literals.JSON_KEY_VALUE_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MobgenPackage.Literals.JSON_KEY_VALUE_PAIR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getJsonKeyValuePairAccess().getValueJsonObjectValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=JsonLiteralValue | composite=JsonCompositeValue)
	 */
	protected void sequence_JsonObjectValue(EObject context, JsonObjectValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyValuePair+=JsonKeyValuePair keyValuePair+=JsonKeyValuePair*)
	 */
	protected void sequence_JsonObject(EObject context, JsonObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID keys+=ID values+=NestedType (keys+=ID values+=NestedType)*)
	 */
	protected void sequence_MapInstance(EObject context, MapInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         method=RESTFUL_METHODS 
	 *         uri=URI 
	 *         (requestHeaders=MobgenHeader responseHeaders=MobgenHeader?)? 
	 *         jsonToClient=MobgenJson? 
	 *         jsonToServer=MobgenJson?
	 *     )
	 */
	protected void sequence_MobgenCallDefinition(EObject context, MobgenCallDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING (value=STRING | parameter=MobgenHeaderParameter))
	 */
	protected void sequence_MobgenHeaderKeyValuePair(EObject context, MobgenHeaderKeyValuePair semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 */
	protected void sequence_MobgenHeaderParameter(EObject context, MobgenHeaderParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MobgenPackage.Literals.MOBGEN_HEADER_PARAMETER__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MobgenPackage.Literals.MOBGEN_HEADER_PARAMETER__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMobgenHeaderParameterAccess().getIdIDTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID headerKeyValues+=MobgenHeaderKeyValuePair headerKeyValues+=MobgenHeaderKeyValuePair*)
	 */
	protected void sequence_MobgenHeader(EObject context, MobgenHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=JsonObjectValue)
	 */
	protected void sequence_MobgenJson(EObject context, MobgenJson semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MobgenPackage.Literals.MOBGEN_JSON__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MobgenPackage.Literals.MOBGEN_JSON__NAME));
			if(transientValues.isValueTransient(semanticObject, MobgenPackage.Literals.MOBGEN_JSON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MobgenPackage.Literals.MOBGEN_JSON__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMobgenJsonAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMobgenJsonAccess().getValueJsonObjectValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     resources+=MapInstance
	 */
	protected void sequence_MobgenResourceDefinition(EObject context, MobgenResourceDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (platform=Platform (resources+=MobgenResourceDefinition | calls+=MobgenCallDefinition)+)
	 */
	protected void sequence_Mobgen(EObject context, Mobgen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=StringList | string=STRING)
	 */
	protected void sequence_NestedType(EObject context, NestedType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (platforms+=ID generateWhere+=STRING)+
	 */
	protected void sequence_Platform(EObject context, Platform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=STRING values+=STRING*)
	 */
	protected void sequence_StringList(EObject context, StringList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         urlPrefix=URL_PREFIX 
	 *         path=URL_PATH 
	 *         (pathParameters+=ID pathSuffix+=URL_PATH)* 
	 *         query+=URL_QUERY 
	 *         (queryParameters+=ID querySuffix+=URL_QUERY_SUFFIX)*
	 *     )
	 */
	protected void sequence_URI(EObject context, URI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
