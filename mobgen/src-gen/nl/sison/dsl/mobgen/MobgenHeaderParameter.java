/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.MobgenHeaderParameter#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgenHeaderParameter()
 * @model
 * @generated
 */
public interface MobgenHeaderParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getMobgenHeaderParameter_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.MobgenHeaderParameter#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // MobgenHeaderParameter
