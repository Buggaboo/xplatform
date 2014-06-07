package nl.sison.dsl.mobgen.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import nl.sison.dsl.mobgen.jsonGen.ExJsonEnum;
import nl.sison.dsl.mobgen.jsonGen.JsonArray;
import nl.sison.dsl.mobgen.jsonGen.JsonGenPackage;
import nl.sison.dsl.mobgen.jsonGen.JsonObject;
import nl.sison.dsl.mobgen.jsonGen.JsonValue;
import nl.sison.dsl.mobgen.jsonGen.Member;
import nl.sison.dsl.mobgen.services.JsonGenGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class JsonGenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JsonGenGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JsonGenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JsonGenPackage.EX_JSON_ENUM:
				if(context == grammarAccess.getExJsonEnumRule()) {
					sequence_ExJsonEnum(context, (ExJsonEnum) semanticObject); 
					return; 
				}
				else break;
			case JsonGenPackage.JSON_ARRAY:
				if(context == grammarAccess.getJsonArrayRule()) {
					sequence_JsonArray(context, (JsonArray) semanticObject); 
					return; 
				}
				else break;
			case JsonGenPackage.JSON_OBJECT:
				if(context == grammarAccess.getJsonObjectRule()) {
					sequence_JsonObject(context, (JsonObject) semanticObject); 
					return; 
				}
				else break;
			case JsonGenPackage.JSON_VALUE:
				if(context == grammarAccess.getJsonValueRule()) {
					sequence_JsonValue(context, (JsonValue) semanticObject); 
					return; 
				}
				else break;
			case JsonGenPackage.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (values+=STRING values+=STRING)
	 */
	protected void sequence_ExJsonEnum(EObject context, ExJsonEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=JsonValue values+=JsonValue*)
	 */
	protected void sequence_JsonArray(EObject context, JsonArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=Member members+=Member*)
	 */
	protected void sequence_JsonObject(EObject context, JsonObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         obj=JsonObject | 
	 *         str=STRING | 
	 *         array=JsonArray | 
	 *         bool?=JSON_BOOLEAN | 
	 *         null?=JSON_NULL | 
	 *         int?=INT | 
	 *         float?=JSON_FLOAT | 
	 *         strFromEnum=ExJsonEnum | 
	 *         datetime=EX_JSON_UTC
	 *     )
	 */
	protected void sequence_JsonValue(EObject context, JsonValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optional?='?'? key=STRING value=JsonValue)
	 */
	protected void sequence_Member(EObject context, Member semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
