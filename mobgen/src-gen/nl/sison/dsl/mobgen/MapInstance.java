/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.MapInstance#getKeys <em>Keys</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.MapInstance#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getMapInstance()
 * @model
 * @generated
 */
public interface MapInstance extends MobgenResourceDefinition
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
   * @see nl.sison.dsl.mobgen.MobgenPackage#getMapInstance_Keys()
   * @model unique="false"
   * @generated
   */
  EList<String> getKeys();

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.dsl.mobgen.NestedType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getMapInstance_Values()
   * @model containment="true"
   * @generated
   */
  EList<NestedType> getValues();

} // MapInstance
