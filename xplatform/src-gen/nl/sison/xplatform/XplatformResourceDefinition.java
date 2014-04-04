/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.XplatformResourceDefinition#getPlatform <em>Platform</em>}</li>
 *   <li>{@link nl.sison.xplatform.XplatformResourceDefinition#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getXplatformResourceDefinition()
 * @model
 * @generated
 */
public interface XplatformResourceDefinition extends EObject
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
   * @see nl.sison.xplatform.XplatformPackage#getXplatformResourceDefinition_Platform()
   * @model containment="true"
   * @generated
   */
  Platform getPlatform();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.XplatformResourceDefinition#getPlatform <em>Platform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' containment reference.
   * @see #getPlatform()
   * @generated
   */
  void setPlatform(Platform value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getXplatformResourceDefinition_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // XplatformResourceDefinition
