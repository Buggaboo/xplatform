/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Composite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonCompositeType#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonCompositeType()
 * @model
 * @generated
 */
public interface JsonCompositeType extends EObject
{
  /**
   * Returns the value of the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' containment reference.
   * @see #setComposite(JsonArray)
   * @see nl.sison.xplatform.XplatformPackage#getJsonCompositeType_Composite()
   * @model containment="true"
   * @generated
   */
  JsonArray getComposite();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonCompositeType#getComposite <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' containment reference.
   * @see #getComposite()
   * @generated
   */
  void setComposite(JsonArray value);

} // JsonCompositeType
