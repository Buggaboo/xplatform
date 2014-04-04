/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Scalar Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.JsonScalarType#getBool <em>Bool</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonScalarType#getString <em>String</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonScalarType#getNumber <em>Number</em>}</li>
 *   <li>{@link nl.sison.xplatform.JsonScalarType#getNull <em>Null</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getJsonScalarType()
 * @model
 * @generated
 */
public interface JsonScalarType extends EObject
{
  /**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #setBool(String)
   * @see nl.sison.xplatform.XplatformPackage#getJsonScalarType_Bool()
   * @model
   * @generated
   */
  String getBool();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonScalarType#getBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #getBool()
   * @generated
   */
  void setBool(String value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see nl.sison.xplatform.XplatformPackage#getJsonScalarType_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonScalarType#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see nl.sison.xplatform.XplatformPackage#getJsonScalarType_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonScalarType#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(String)
   * @see nl.sison.xplatform.XplatformPackage#getJsonScalarType_Null()
   * @model
   * @generated
   */
  String getNull();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.JsonScalarType#getNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #getNull()
   * @generated
   */
  void setNull(String value);

} // JsonScalarType
