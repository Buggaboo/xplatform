/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#isFloat <em>Float</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#isExp <em>Exp</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#getExpValue <em>Exp Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonNumber()
 * @model
 * @generated
 */
public interface JsonNumber extends EObject
{
  /**
   * Returns the value of the '<em><b>Float</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Float</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Float</em>' attribute.
   * @see #setFloat(boolean)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonNumber_Float()
   * @model
   * @generated
   */
  boolean isFloat();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#isFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' attribute.
   * @see #isFloat()
   * @generated
   */
  void setFloat(boolean value);

  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(int)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonNumber_IntValue()
   * @model
   * @generated
   */
  int getIntValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(int value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' attribute.
   * @see #setExp(boolean)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonNumber_Exp()
   * @model
   * @generated
   */
  boolean isExp();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#isExp <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' attribute.
   * @see #isExp()
   * @generated
   */
  void setExp(boolean value);

  /**
   * Returns the value of the '<em><b>Exp Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Value</em>' attribute.
   * @see #setExpValue(int)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonNumber_ExpValue()
   * @model
   * @generated
   */
  int getExpValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#getExpValue <em>Exp Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Value</em>' attribute.
   * @see #getExpValue()
   * @generated
   */
  void setExpValue(int value);

} // JsonNumber
