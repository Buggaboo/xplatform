/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Literal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.JsonLiteralValue#getStringType <em>String Type</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.JsonLiteralValue#getBooleanType <em>Boolean Type</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.JsonLiteralValue#getMetaType <em>Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonLiteralValue()
 * @model
 * @generated
 */
public interface JsonLiteralValue extends EObject
{
  /**
   * Returns the value of the '<em><b>String Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Type</em>' attribute.
   * @see #setStringType(String)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonLiteralValue_StringType()
   * @model
   * @generated
   */
  String getStringType();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.JsonLiteralValue#getStringType <em>String Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Type</em>' attribute.
   * @see #getStringType()
   * @generated
   */
  void setStringType(String value);

  /**
   * Returns the value of the '<em><b>Boolean Type</b></em>' attribute.
   * The literals are from the enumeration {@link nl.sison.dsl.mobgen.JsonLiteralBoolean}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Type</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonLiteralBoolean
   * @see #setBooleanType(JsonLiteralBoolean)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonLiteralValue_BooleanType()
   * @model
   * @generated
   */
  JsonLiteralBoolean getBooleanType();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.JsonLiteralValue#getBooleanType <em>Boolean Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Type</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonLiteralBoolean
   * @see #getBooleanType()
   * @generated
   */
  void setBooleanType(JsonLiteralBoolean value);

  /**
   * Returns the value of the '<em><b>Meta Type</b></em>' attribute.
   * The literals are from the enumeration {@link nl.sison.dsl.mobgen.JsonMetaScalarType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Type</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonMetaScalarType
   * @see #setMetaType(JsonMetaScalarType)
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonLiteralValue_MetaType()
   * @model
   * @generated
   */
  JsonMetaScalarType getMetaType();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.JsonLiteralValue#getMetaType <em>Meta Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Type</em>' attribute.
   * @see nl.sison.dsl.mobgen.JsonMetaScalarType
   * @see #getMetaType()
   * @generated
   */
  void setMetaType(JsonMetaScalarType value);

} // JsonLiteralValue
