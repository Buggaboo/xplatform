/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.EnumInstance#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.EnumInstance#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getEnumInstance()
 * @model
 * @generated
 */
public interface EnumInstance extends MobgenResourceDefinition
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
   * @see nl.sison.dsl.mobgen.MobgenPackage#getEnumInstance_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.EnumInstance#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getEnumInstance_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // EnumInstance
