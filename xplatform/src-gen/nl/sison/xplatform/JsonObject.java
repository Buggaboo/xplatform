/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonObject#getKeys <em>Keys</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonObject#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonObject()
 * @model
 * @generated
 */
public interface JsonObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Keys</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keys</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keys</em>' attribute list.
   * @see nl.sison.xplatform.XplatformPackage#getJsonObject_Keys()
   * @model unique="false"
   * @generated
   */
  EList<String> getKeys();

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.XplatformJson}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getJsonObject_Values()
   * @model containment="true"
   * @generated
   */
  EList<XplatformJson> getValues();

} // JsonObject
