/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.URI#getStringPrefix <em>String Prefix</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.URI#getParameters <em>Parameters</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.URI#getStringSuffix <em>String Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getURI()
 * @model
 * @generated
 */
public interface URI extends EObject
{
  /**
   * Returns the value of the '<em><b>String Prefix</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Prefix</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Prefix</em>' attribute list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getURI_StringPrefix()
   * @model unique="false"
   * @generated
   */
  EList<String> getStringPrefix();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' attribute list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getURI_Parameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameters();

  /**
   * Returns the value of the '<em><b>String Suffix</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Suffix</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Suffix</em>' attribute list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getURI_StringSuffix()
   * @model unique="false"
   * @generated
   */
  EList<String> getStringSuffix();

} // URI
