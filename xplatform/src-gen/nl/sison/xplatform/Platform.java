/**
 */
package nl.sison.xplatform;

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
 *   <li>{@link nl.sison.xplatform.Platform#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link nl.sison.xplatform.Platform#getWhereToGenerate <em>Where To Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getPlatform()
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
   * @see nl.sison.xplatform.XplatformPackage#getPlatform_Platforms()
   * @model unique="false"
   * @generated
   */
  EList<String> getPlatforms();

  /**
   * Returns the value of the '<em><b>Where To Generate</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where To Generate</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where To Generate</em>' attribute list.
   * @see nl.sison.xplatform.XplatformPackage#getPlatform_WhereToGenerate()
   * @model unique="false"
   * @generated
   */
  EList<String> getWhereToGenerate();

} // Platform
