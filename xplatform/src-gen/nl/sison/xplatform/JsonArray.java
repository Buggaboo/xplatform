/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonArray#getElements <em>Elements</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonArray#getComposites <em>Composites</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonArray()
 * @model
 * @generated
 */
public interface JsonArray extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.JsonScalarType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getJsonArray_Elements()
   * @model containment="true"
   * @generated
   */
  EList<JsonScalarType> getElements();

  /**
   * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.JsonCompositeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composites</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getJsonArray_Composites()
   * @model containment="true"
   * @generated
   */
  EList<JsonCompositeType> getComposites();

} // JsonArray
