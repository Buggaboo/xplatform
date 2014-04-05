/**
 */
package nl.sison.dsl.mobgen;

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
 *   <li>{@link nl.sison.dsl.mobgen.MobgenResourceDefinition#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgenResourceDefinition()
 * @model
 * @generated
 */
public interface MobgenResourceDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.dsl.mobgen.MapInstance}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgenResourceDefinition_Resources()
   * @model containment="true"
   * @generated
   */
  EList<MapInstance> getResources();

} // MobgenResourceDefinition
