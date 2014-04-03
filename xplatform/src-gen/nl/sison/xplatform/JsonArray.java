/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonArray#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonArray()
 * @model
 * @generated
 */
public interface JsonArray extends JsonType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.JsonType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getJsonArray_Type()
   * @model containment="true"
   * @generated
   */
  EList<JsonType> getType();

} // JsonArray
