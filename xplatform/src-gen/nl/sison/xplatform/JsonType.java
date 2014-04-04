/**
 */
package nl.sison.xplatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonType#getScalar <em>Scalar</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonType()
 * @model
 * @generated
 */
public interface JsonType extends XplatformJson
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

} // JsonType
