/**
 */
package nl.sison.dsl.mobgen.restful;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobgen Header Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getKey <em>Key</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getValue <em>Value</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenHeaderKeyValuePair()
 * @model
 * @generated
 */
public interface MobgenHeaderKeyValuePair extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenHeaderKeyValuePair_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenHeaderKeyValuePair_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(MobgenHeaderParameter)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenHeaderKeyValuePair_Parameter()
   * @model containment="true"
   * @generated
   */
  MobgenHeaderParameter getParameter();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(MobgenHeaderParameter value);

} // MobgenHeaderKeyValuePair
