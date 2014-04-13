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
 *   <li>{@link nl.sison.dsl.mobgen.JsonObjectValue#getValue <em>Value</em>}</li>
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
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link nl.sison.dsl.mobgen.JsonLiteralValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonLiteralValue
   * @see #setValue(JsonLiteralValue)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonObjectValue_Value()
   * @model
   * @generated
   */
  JsonLiteralValue getValue();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.JsonObjectValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonLiteralValue
   * @see #getValue()
   * @generated
   */
  void setValue(JsonLiteralValue value);

  /**
   * Returns the value of the '<em><b>Composite</b></em>' attribute.
   * The literals are from the enumeration {@link nl.sison.dsl.mobgen.JsonCompositeValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonCompositeValue
   * @see #setComposite(JsonCompositeValue)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonObjectValue_Composite()
   * @model
   * @generated
   */
  JsonCompositeValue getComposite();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.JsonObjectValue#getComposite <em>Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonCompositeValue
   * @see #getComposite()
   * @generated
   */
  void setComposite(JsonCompositeValue value);

} // JsonObjectValue
