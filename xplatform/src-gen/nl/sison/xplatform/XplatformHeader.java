/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.XplatformHeader#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.xplatform.XplatformHeader#getHeaderKeyValues <em>Header Key Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getXplatformHeader()
 * @model
 * @generated
 */
public interface XplatformHeader extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.sison.xplatform.XplatformPackage#getXplatformHeader_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.XplatformHeader#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Header Key Values</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.XplatformHeaderKeyValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header Key Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header Key Values</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getXplatformHeader_HeaderKeyValues()
   * @model containment="true"
   * @generated
   */
  EList<XplatformHeaderKeyValuePair> getHeaderKeyValues();

} // XplatformHeader
