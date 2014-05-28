/**
 */
package nl.sison.dsl.mobgen.restful;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.NestedType#getList <em>List</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.NestedType#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getNestedType()
 * @model
 * @generated
 */
public interface NestedType extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(StringList)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getNestedType_List()
   * @model containment="true"
   * @generated
   */
  StringList getList();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.NestedType#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(StringList value);

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
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getNestedType_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.NestedType#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // NestedType
