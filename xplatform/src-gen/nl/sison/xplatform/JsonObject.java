/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonObject#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonObject#getMetaKeyValuePair <em>Meta Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonObject()
 * @model
 * @generated
 */
public interface JsonObject extends JsonType
{
  /**
   * Returns the value of the '<em><b>Key Value Pair</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.JsonKeyValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Value Pair</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value Pair</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getJsonObject_KeyValuePair()
   * @model containment="true"
   * @generated
   */
  EList<JsonKeyValuePair> getKeyValuePair();

  /**
   * Returns the value of the '<em><b>Meta Key Value Pair</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.JsonMetaKeyValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Key Value Pair</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Key Value Pair</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getJsonObject_MetaKeyValuePair()
   * @model containment="true"
   * @generated
   */
  EList<JsonMetaKeyValuePair> getMetaKeyValuePair();

} // JsonObject
