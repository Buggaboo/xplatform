/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xplatform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.Xplatform#getPlatform <em>Platform</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getResources <em>Resources</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getXplatform()
 * @model
 * @generated
 */
public interface Xplatform extends EObject
{
  /**
   * Returns the value of the '<em><b>Platform</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platform</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platform</em>' containment reference.
   * @see #setPlatform(Platform)
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_Platform()
   * @model containment="true"
   * @generated
   */
  Platform getPlatform();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getPlatform <em>Platform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' containment reference.
   * @see #getPlatform()
   * @generated
   */
  void setPlatform(Platform value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.XplatformResourceDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_Resources()
   * @model containment="true"
   * @generated
   */
  EList<XplatformResourceDefinition> getResources();

  /**
   * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.XplatformCallDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calls</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_Calls()
   * @model containment="true"
   * @generated
   */
  EList<XplatformCallDefinition> getCalls();

} // Xplatform
