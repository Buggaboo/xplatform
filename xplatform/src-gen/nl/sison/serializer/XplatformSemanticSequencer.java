package nl.sison.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.sison.services.XplatformGrammarAccess;
import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonCompositeType;
import nl.sison.xplatform.JsonMetaArray;
import nl.sison.xplatform.JsonMetaType;
import nl.sison.xplatform.JsonObject;
import nl.sison.xplatform.JsonScalarType;
import nl.sison.xplatform.JsonType;
import nl.sison.xplatform.URI;
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
			case XplatformPackage.JSON_META_ARRAY:
				if(context == grammarAccess.getJsonMetaArrayRule()) {
					sequence_JsonMetaArray(context, (JsonMetaArray) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_META_TYPE:
				if(context == grammarAccess.getJsonMetaTypeRule()) {
					sequence_JsonMetaType(context, (JsonMetaType) semanticObject); 
					return; 
				}
				else break;
			case XplatformPackage.JSON_OBJECT:
				if(context == grammarAccess.getJsonObjectRule()) {
					sequence_JsonObject(context, (JsonObject) semanticObject); 
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
	 *     ((elements+=JsonScalarType elements+=JsonScalarType*) | (composites+=JsonCompositeType composites+=JsonCompositeType*))
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
	 *     (scalar=JsonMetaScalarType | composite=JsonMetaArray)
	 */
	protected void sequence_JsonMetaType(EObject context, JsonMetaType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keys+=STRING values+=XplatformJson keys+=STRING values+=XplatformJson)
	 */
	protected void sequence_JsonObject(EObject context, JsonObject semanticObject) {
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
	 *     uriParameter+=ID?
	 */
	protected void sequence_URI(EObject context, URI semanticObject) {
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
	 *     (type=JsonType | metaType=JsonMetaType | composite=JsonObject)
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
