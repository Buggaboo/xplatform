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
 *   <li>{@link nl.sison.xplatform.XplatformResourceDefinition#getResources <em>Resources</em>}</li>
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
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.MapInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getXplatformResourceDefinition_Resources()
   * @model containment="true"
   * @generated
   */
  EList<MapInstance> getResources();

} // XplatformResourceDefinition
