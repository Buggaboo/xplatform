/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonType#getScalar <em>Scalar</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonType#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonType()
 * @model
 * @generated
 */
public interface JsonType extends EObject
{
  /**
   * Returns the value of the '<em><b>Scalar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scalar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scalar</em>' containment reference.
   * @see #setScalar(JsonScalarType)
   * @see nl.sison.xplatform.XplatformPackage#getJsonType_Scalar()
   * @model containment="true"
   * @generated
   */
  JsonScalarType getScalar();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonType#getScalar <em>Scalar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scalar</em>' containment reference.
   * @see #getScalar()
   * @generated
   */
  void setScalar(JsonScalarType value);

  /**
   * Returns the value of the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' containment reference.
   * @see #setComposite(JsonCompositeType)
   * @see nl.sison.xplatform.XplatformPackage#getJsonType_Composite()
   * @model containment="true"
   * @generated
   */
  JsonCompositeType getComposite();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonType#getComposite <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' containment reference.
   * @see #getComposite()
   * @generated
   */
  void setComposite(JsonCompositeType value);

} // JsonType
