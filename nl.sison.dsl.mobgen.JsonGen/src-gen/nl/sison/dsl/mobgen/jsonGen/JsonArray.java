/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonArray#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonArray()
 * @model
 * @generated
 */
public interface JsonArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.dsl.mobgen.jsonGen.JsonValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonArray_Values()
   * @model containment="true"
   * @generated
   */
  EList<JsonValue> getValues();

} // JsonArray
