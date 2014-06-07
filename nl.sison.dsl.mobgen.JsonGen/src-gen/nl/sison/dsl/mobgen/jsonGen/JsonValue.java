/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getObj <em>Obj</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getStr <em>Str</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getArray <em>Array</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isBool <em>Bool</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isNull <em>Null</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isInt <em>Int</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isFloat <em>Float</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getStrFromEnum <em>Str From Enum</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getDatetime <em>Datetime</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue()
 * @model
 * @generated
 */
public interface JsonValue extends EObject
{
  /**
   * Returns the value of the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Obj</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obj</em>' containment reference.
   * @see #setObj(JsonObject)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Obj()
   * @model containment="true"
   * @generated
   */
  JsonObject getObj();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getObj <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obj</em>' containment reference.
   * @see #getObj()
   * @generated
   */
  void setObj(JsonObject value);

  /**
   * Returns the value of the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' attribute.
   * @see #setStr(String)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Str()
   * @model
   * @generated
   */
  String getStr();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getStr <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' attribute.
   * @see #getStr()
   * @generated
   */
  void setStr(String value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(JsonArray)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Array()
   * @model containment="true"
   * @generated
   */
  JsonArray getArray();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(JsonArray value);

  /**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #setBool(boolean)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Bool()
   * @model
   * @generated
   */
  boolean isBool();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #isBool()
   * @generated
   */
  void setBool(boolean value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(boolean)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Null()
   * @model
   * @generated
   */
  boolean isNull();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #isNull()
   * @generated
   */
  void setNull(boolean value);

  /**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #setInt(boolean)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Int()
   * @model
   * @generated
   */
  boolean isInt();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #isInt()
   * @generated
   */
  void setInt(boolean value);

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
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Float()
   * @model
   * @generated
   */
  boolean isFloat();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' attribute.
   * @see #isFloat()
   * @generated
   */
  void setFloat(boolean value);

  /**
   * Returns the value of the '<em><b>Str From Enum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str From Enum</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str From Enum</em>' containment reference.
   * @see #setStrFromEnum(ExJsonEnum)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_StrFromEnum()
   * @model containment="true"
   * @generated
   */
  ExJsonEnum getStrFromEnum();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getStrFromEnum <em>Str From Enum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str From Enum</em>' containment reference.
   * @see #getStrFromEnum()
   * @generated
   */
  void setStrFromEnum(ExJsonEnum value);

  /**
   * Returns the value of the '<em><b>Datetime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datetime</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datetime</em>' attribute.
   * @see #setDatetime(String)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonValue_Datetime()
   * @model
   * @generated
   */
  String getDatetime();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getDatetime <em>Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datetime</em>' attribute.
   * @see #getDatetime()
   * @generated
   */
  void setDatetime(String value);

} // JsonValue
