package nl.sison.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.sison.services.XplatformGrammarAccess;
import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonKeyValuePair;
import nl.sison.xplatform.JsonMetaArray;
import nl.sison.xplatform.JsonMetaKeyValuePair;
import nl.sison.xplatform.JsonObject;
import nl.sison.xplatform.Xplatform;
import nl.sison.xplatform.XplatformHeader;
import nl.sison.xplatform.XplatformHeaderKeyValue;
import nl.sison.xplatform.XplatformJson;
import nl.sison.xplatform.XplatformPackage;
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
public class XplatformSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XplatformGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == XplatformPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XplatformPackage.JSON_ARRAY:
				if(context == grammarAccess.getJsonArrayRule() ||
				   context == grammarAccess.getJsonTypeRule()) {
					sequence_JsonArray(context, (JsonArray) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_KEY_VALUE_PAIR:
				if(context == grammarAccess.getJsonKeyValuePairRule()) {
					sequence_JsonKeyValuePair(context, (JsonKeyValuePair) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_META_ARRAY:
				if(context == grammarAccess.getJsonMetaArrayRule() ||
				   context == grammarAccess.getJsonMetaTypeRule() ||
				   context == grammarAccess.getJsonTypeRule()) {
					sequence_JsonMetaArray(context, (JsonMetaArray) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_META_KEY_VALUE_PAIR:
				if(context == grammarAccess.getJsonMetaKeyValuePairRule()) {
					sequence_JsonMetaKeyValuePair(context, (JsonMetaKeyValuePair) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_OBJECT:
				if(context == grammarAccess.getJsonObjectRule() ||
				   context == grammarAccess.getJsonTypeRule()) {
					sequence_JsonObject(context, (JsonObject) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.XPLATFORM:
				if(context == grammarAccess.getXplatformRule()) {
					sequence_Xplatform(context, (Xplatform) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.XPLATFORM_HEADER:
				if(context == grammarAccess.getXplatformHeaderRule()) {
					sequence_XplatformHeader(context, (XplatformHeader) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.XPLATFORM_HEADER_KEY_VALUE:
				if(context == grammarAccess.getXplatformHeaderKeyValueRule()) {
					sequence_XplatformHeaderKeyValue(context, (XplatformHeaderKeyValue) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.XPLATFORM_JSON:
				if(context == grammarAccess.getXplatformJsonRule()) {
					sequence_XplatformJson(context, (XplatformJson) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (type+=JsonType? type+=JsonType*)
	 */
	protected void sequence_JsonArray(EObject context, JsonArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=LITERAL_STRING value=JsonType)
	 */
	protected void sequence_JsonKeyValuePair(EObject context, JsonKeyValuePair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_KEY_VALUE_PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_KEY_VALUE_PAIR__KEY));
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_KEY_VALUE_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_KEY_VALUE_PAIR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJsonKeyValuePairAccess().getKeyLITERAL_STRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getJsonKeyValuePairAccess().getValueJsonTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     metaType=JsonMetaType
	 */
	protected void sequence_JsonMetaArray(EObject context, JsonMetaArray semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_META_ARRAY__META_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_META_ARRAY__META_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJsonMetaArrayAccess().getMetaTypeJsonMetaTypeParserRuleCall_1_0(), semanticObject.getMetaType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (metaKey=LITERAL_STRING metaValue=JsonMetaType)
	 */
	protected void sequence_JsonMetaKeyValuePair(EObject context, JsonMetaKeyValuePair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__META_KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__META_KEY));
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__META_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__META_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJsonMetaKeyValuePairAccess().getMetaKeyLITERAL_STRINGTerminalRuleCall_0_0(), semanticObject.getMetaKey());
		feeder.accept(grammarAccess.getJsonMetaKeyValuePairAccess().getMetaValueJsonMetaTypeParserRuleCall_2_0(), semanticObject.getMetaValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (keyValuePair+=JsonKeyValuePair | metaKeyValuePair+=JsonMetaKeyValuePair)? 
	 *         (keyValuePair+=JsonKeyValuePair | metaKeyValuePair+=JsonMetaKeyValuePair)*
	 *     )
	 */
	protected void sequence_JsonObject(EObject context, JsonObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=LITERAL_STRING (value=LITERAL_STRING | value=XPLATFORM_HEADER_PARAMETER))
	 */
	protected void sequence_XplatformHeaderKeyValue(EObject context, XplatformHeaderKeyValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (headerKeyValues+=XplatformHeaderKeyValue? headerKeyValues+=XplatformHeaderKeyValue*)
	 */
	protected void sequence_XplatformHeader(EObject context, XplatformHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=JsonType | metaType=JsonMetaType)
	 */
	protected void sequence_XplatformJson(EObject context, XplatformJson semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         callName=STRING 
	 *         method=RESTFUL_METHODS 
	 *         uriPathParams+=STRING* 
	 *         (requestHeaders=XplatformHeader responseHeaders=XplatformHeader?)? 
	 *         (jsonToClient=XplatformJson jsonToServer=XplatformJson?)?
	 *     )
	 */
	protected void sequence_Xplatform(EObject context, Xplatform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
