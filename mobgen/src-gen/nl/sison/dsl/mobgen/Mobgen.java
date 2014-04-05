/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobgen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.Mobgen#getPlatform <em>Platform</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.Mobgen#getResources <em>Resources</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.Mobgen#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgen()
 * @model
 * @generated
 */
public interface Mobgen extends EObject
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
   * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgen_Platform()
   * @model containment="true"
   * @generated
   */
  Platform getPlatform();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.Mobgen#getPlatform <em>Platform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Platform</em>' containment reference.
   * @see #getPlatform()
   * @generated
   */
  void setPlatform(Platform value);

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.dsl.mobgen.MobgenResourceDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgen_Resources()
   * @model containment="true"
   * @generated
   */
  EList<MobgenResourceDefinition> getResources();

  /**
   * Returns the value of the '<em><b>Calls</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.dsl.mobgen.MobgenCallDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Calls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Calls</em>' containment reference list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgen_Calls()
   * @model containment="true"
   * @generated
   */
  EList<MobgenCallDefinition> getCalls();

} // Mobgen
