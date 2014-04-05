/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.Platform#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.Platform#getGenerateWhere <em>Generate Where</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getPlatform()
 * @model
 * @generated
 */
public interface Platform extends EObject
{
  /**
   * Returns the value of the '<em><b>Platforms</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platforms</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platforms</em>' attribute list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getPlatform_Platforms()
   * @model unique="false"
   * @generated
   */
  EList<String> getPlatforms();

  /**
   * Returns the value of the '<em><b>Generate Where</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generate Where</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generate Where</em>' attribute list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getPlatform_GenerateWhere()
   * @model unique="false"
   * @generated
   */
  EList<String> getGenerateWhere();

} // Platform
