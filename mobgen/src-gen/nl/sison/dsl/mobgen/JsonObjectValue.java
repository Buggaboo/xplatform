/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.JsonObjectValue#getScalar <em>Scalar</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.JsonObjectValue#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonObjectValue()
 * @model
 * @generated
 */
public interface JsonObjectValue extends EObject
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
   * @see #setScalar(JsonLiteralValue)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonObjectValue_Scalar()
   * @model containment="true"
   * @generated
   */
  JsonLiteralValue getScalar();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.JsonObjectValue#getScalar <em>Scalar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scalar</em>' containment reference.
   * @see #getScalar()
   * @generated
   */
  void setScalar(JsonLiteralValue value);

  /**
   * Returns the value of the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' containment reference.
   * @see #setComposite(JsonCompositeValue)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonObjectValue_Composite()
   * @model containment="true"
   * @generated
   */
  JsonCompositeValue getComposite();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.JsonObjectValue#getComposite <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' containment reference.
   * @see #getComposite()
   * @generated
   */
  void setComposite(JsonCompositeValue value);

} // JsonObjectValue
