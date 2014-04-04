/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Meta Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonMetaArray#getMetaType <em>Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonMetaArray()
 * @model
 * @generated
 */
public interface JsonMetaArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Meta Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Type</em>' containment reference.
   * @see #setMetaType(JsonMetaType)
   * @see nl.sison.xplatform.XplatformPackage#getJsonMetaArray_MetaType()
   * @model containment="true"
   * @generated
   */
  JsonMetaType getMetaType();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonMetaArray#getMetaType <em>Meta Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Type</em>' containment reference.
   * @see #getMetaType()
   * @generated
   */
  void setMetaType(JsonMetaType value);

} // JsonMetaArray
