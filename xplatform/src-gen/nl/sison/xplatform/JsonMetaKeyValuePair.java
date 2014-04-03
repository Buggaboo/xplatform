/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Meta Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonMetaKeyValuePair#getMetaKey <em>Meta Key</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonMetaKeyValuePair#getMetaValue <em>Meta Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonMetaKeyValuePair()
 * @model
 * @generated
 */
public interface JsonMetaKeyValuePair extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Key</em>' attribute.
   * @see #setMetaKey(String)
   * @see nl.sison.xplatform.XplatformPackage#getJsonMetaKeyValuePair_MetaKey()
   * @model
   * @generated
   */
  String getMetaKey();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonMetaKeyValuePair#getMetaKey <em>Meta Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Key</em>' attribute.
   * @see #getMetaKey()
   * @generated
   */
  void setMetaKey(String value);

  /**
   * Returns the value of the '<em><b>Meta Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Value</em>' containment reference.
   * @see #setMetaValue(JsonMetaType)
   * @see nl.sison.xplatform.XplatformPackage#getJsonMetaKeyValuePair_MetaValue()
   * @model containment="true"
   * @generated
   */
  JsonMetaType getMetaValue();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonMetaKeyValuePair#getMetaValue <em>Meta Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Value</em>' containment reference.
   * @see #getMetaValue()
   * @generated
   */
  void setMetaValue(JsonMetaType value);

} // JsonMetaKeyValuePair
