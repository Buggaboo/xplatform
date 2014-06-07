/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex Json Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.ExJsonEnum#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getExJsonEnum()
 * @model
 * @generated
 */
public interface ExJsonEnum extends EObject
{
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
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getExJsonEnum_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // ExJsonEnum
