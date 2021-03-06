/**
 */
package nl.sison.dsl.mobgen.restful;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobgen Json</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenJson#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenJson#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenJson()
 * @model
 * @generated
 */
public interface MobgenJson extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenJson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenJson#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(JsonObjectValue)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenJson_Value()
   * @model containment="true"
   * @generated
   */
  JsonObjectValue getValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenJson#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(JsonObjectValue value);

} // MobgenJson
