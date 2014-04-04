/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unnested Key Pairs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.UnnestedKeyPairs#getKeyValuePair <em>Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getUnnestedKeyPairs()
 * @model
 * @generated
 */
public interface UnnestedKeyPairs extends EObject
{
  /**
   * Returns the value of the '<em><b>Key Value Pair</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Value Pair</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value Pair</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getUnnestedKeyPairs_KeyValuePair()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getKeyValuePair();

} // UnnestedKeyPairs
