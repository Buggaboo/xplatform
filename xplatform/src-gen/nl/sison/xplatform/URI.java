/**
 */
package nl.sison.xplatform;

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
 *   <li>{@link nl.sison.xplatform.URI#getUriParameter <em>Uri Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getURI()
 * @model
 * @generated
 */
public interface URI extends EObject
{
  /**
   * Returns the value of the '<em><b>Uri Parameter</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri Parameter</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri Parameter</em>' attribute list.
   * @see nl.sison.xplatform.XplatformPackage#getURI_UriParameter()
   * @model unique="false"
   * @generated
   */
  EList<String> getUriParameter();

} // URI
