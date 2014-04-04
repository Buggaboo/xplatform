/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.ValueType#getString <em>String</em>}</li>
 *   <li>{@link nl.sison.xplatform.ValueType#getStringList <em>String List</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getValueType()
 * @model
 * @generated
 */
public interface ValueType extends EObject
{
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
   * @see nl.sison.xplatform.XplatformPackage#getValueType_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.ValueType#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>String List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String List</em>' containment reference.
   * @see #setStringList(StringList)
   * @see nl.sison.xplatform.XplatformPackage#getValueType_StringList()
   * @model containment="true"
   * @generated
   */
  StringList getStringList();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.ValueType#getStringList <em>String List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String List</em>' containment reference.
   * @see #getStringList()
   * @generated
   */
  void setStringList(StringList value);

} // ValueType
