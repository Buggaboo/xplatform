/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Meta Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonMetaType#getScalar <em>Scalar</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonMetaType#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonMetaType()
 * @model
 * @generated
 */
public interface JsonMetaType extends EObject
{
  /**
   * Returns the value of the '<em><b>Scalar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scalar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scalar</em>' attribute.
   * @see #setScalar(String)
   * @see nl.sison.xplatform.XplatformPackage#getJsonMetaType_Scalar()
   * @model
   * @generated
   */
  String getScalar();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonMetaType#getScalar <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scalar</em>' attribute.
   * @see #getScalar()
   * @generated
   */
  void setScalar(String value);

  /**
   * Returns the value of the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' containment reference.
   * @see #setComposite(JsonMetaArray)
   * @see nl.sison.xplatform.XplatformPackage#getJsonMetaType_Composite()
   * @model containment="true"
   * @generated
   */
  JsonMetaArray getComposite();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonMetaType#getComposite <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' containment reference.
   * @see #getComposite()
   * @generated
   */
  void setComposite(JsonMetaArray value);

} // JsonMetaType
