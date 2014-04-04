package nl.sison.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.sison.services.XplatformGrammarAccess;
import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonCompositeType;
import nl.sison.xplatform.JsonKeyValuePair;
import nl.sison.xplatform.JsonMetaArray;
import nl.sison.xplatform.JsonMetaKeyValuePair;
import nl.sison.xplatform.JsonMetaType;
import nl.sison.xplatform.JsonScalarType;
import nl.sison.xplatform.JsonType;
import nl.sison.xplatform.URI;
import nl.sison.xplatform.UnnestedKeyPairs;
import nl.sison.xplatform.Xplatform;
import nl.sison.xplatform.XplatformHeader;
import nl.sison.xplatform.XplatformHeaderKeyValuePair;
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
				if(context == grammarAccess.getJsonArrayRule()) {
					sequence_JsonArray(context, (JsonArray) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_COMPOSITE_TYPE:
				if(context == grammarAccess.getJsonCompositeTypeRule()) {
					sequence_JsonCompositeType(context, (JsonCompositeType) semanticObject); 
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
				if(context == grammarAccess.getJsonMetaArrayRule()) {
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
			case XplatformPackage.JSON_META_TYPE:
				if(context == grammarAccess.getJsonMetaTypeRule()) {
					sequence_JsonMetaType(context, (JsonMetaType) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_SCALAR_TYPE:
				if(context == grammarAccess.getJsonScalarTypeRule()) {
					sequence_JsonScalarType(context, (JsonScalarType) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_TYPE:
				if(context == grammarAccess.getJsonTypeRule()) {
					sequence_JsonType(context, (JsonType) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.URI:
				if(context == grammarAccess.getURIRule()) {
					sequence_URI(context, (URI) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.UNNESTED_KEY_PAIRS:
				if(context == grammarAccess.getUnnestedKeyPairsRule()) {
					sequence_UnnestedKeyPairs(context, (UnnestedKeyPairs) semanticObject); 
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
			case XplatformPackage.XPLATFORM_HEADER_KEY_VALUE_PAIR:
				if(context == grammarAccess.getXplatformHeaderKeyValuePairRule()) {
					sequence_XplatformHeaderKeyValuePair(context, (XplatformHeaderKeyValuePair) semanticObject); 
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
	 *     ((element+=JsonScalarType element+=JsonScalarType*) | (composite+=JsonCompositeType composite+=JsonCompositeType*))
	 */
	protected void sequence_JsonArray(EObject context, JsonArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     composite=JsonArray
	 */
	protected void sequence_JsonCompositeType(EObject context, JsonCompositeType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_COMPOSITE_TYPE__COMPOSITE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_COMPOSITE_TYPE__COMPOSITE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJsonCompositeTypeAccess().getCompositeJsonArrayParserRuleCall_0(), semanticObject.getComposite());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING value=JsonType)
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
		feeder.accept(grammarAccess.getJsonKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
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
	 *     (key=STRING value=JsonMetaType)
	 */
	protected void sequence_JsonMetaKeyValuePair(EObject context, JsonMetaKeyValuePair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__KEY));
			if(transientValues.isValueTransient(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJsonMetaKeyValuePairAccess().getKeySTRINGTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getJsonMetaKeyValuePairAccess().getValueJsonMetaTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (scalar=JsonMetaScalarType | composite=JsonMetaArray)
	 */
	protected void sequence_JsonMetaType(EObject context, JsonMetaType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bool=JSON_LITERAL_BOOLEAN | string=STRING | number=INT | null=JSON_LITERAL_NULL)
	 */
	protected void sequence_JsonScalarType(EObject context, JsonScalarType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (scalar=JsonScalarType | composite=JsonCompositeType)
	 */
	protected void sequence_JsonType(EObject context, JsonType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     uriParameter+=ID*
	 */
	protected void sequence_URI(EObject context, URI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((keyValuePair+=JsonKeyValuePair | keyValuePair+=JsonMetaKeyValuePair) (keyValuePair+=JsonKeyValuePair | keyValuePair+=JsonMetaKeyValuePair)*)
	 */
	protected void sequence_UnnestedKeyPairs(EObject context, UnnestedKeyPairs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=STRING (value=STRING | value=XPLATFORM_HEADER_PARAMETER))
	 */
	protected void sequence_XplatformHeaderKeyValuePair(EObject context, XplatformHeaderKeyValuePair semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (headerKeyValues+=XplatformHeaderKeyValuePair headerKeyValues+=XplatformHeaderKeyValuePair*)
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
	 *         name=ID 
	 *         method=RESTFUL_METHODS 
	 *         uri=URI 
	 *         (requestHeaders=XplatformHeader responseHeaders=XplatformHeader?)? 
	 *         (jsonToClient=XplatformJson jsonToServer=XplatformJson?)?
	 *     )
	 */
	protected void sequence_Xplatform(EObject context, Xplatform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
