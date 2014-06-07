/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.Member#isOptional <em>Optional</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.Member#getKey <em>Key</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.Member#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends EObject
{
  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getMember_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.Member#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

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
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getMember_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.Member#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(JsonValue)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getMember_Value()
   * @model containment="true"
   * @generated
   */
  JsonValue getValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.Member#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(JsonValue value);

} // Member
