/**
 */
package nl.sison.dsl.mobgen.restful;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Composite Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue#getObjectValue <em>Object Value</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue#getArrayValue <em>Array Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getJsonCompositeValue()
 * @model
 * @generated
 */
public interface JsonCompositeValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Object Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Object Value</em>' containment reference.
   * @see #setObjectValue(JsonObject)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getJsonCompositeValue_ObjectValue()
   * @model containment="true"
   * @generated
   */
  JsonObject getObjectValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue#getObjectValue <em>Object Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Object Value</em>' containment reference.
   * @see #getObjectValue()
   * @generated
   */
  void setObjectValue(JsonObject value);

  /**
   * Returns the value of the '<em><b>Array Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Value</em>' containment reference.
   * @see #setArrayValue(JsonArray)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getJsonCompositeValue_ArrayValue()
   * @model containment="true"
   * @generated
   */
  JsonArray getArrayValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue#getArrayValue <em>Array Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Value</em>' containment reference.
   * @see #getArrayValue()
   * @generated
   */
  void setArrayValue(JsonArray value);

} // JsonCompositeValue
