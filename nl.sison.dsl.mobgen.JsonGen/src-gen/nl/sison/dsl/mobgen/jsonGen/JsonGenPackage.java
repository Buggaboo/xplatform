/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenFactory
 * @model kind="package"
 * @generated
 */
public interface JsonGenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jsonGen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sison.nl/dsl/mobgen/JsonGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jsonGen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonGenPackage eINSTANCE = nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonObjectImpl <em>Json Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonObjectImpl
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonObject()
   * @generated
   */
  int JSON_OBJECT = 0;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Json Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.jsonGen.impl.MemberImpl
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 1;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__OPTIONAL = 0;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__KEY = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__VALUE = 2;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl <em>Json Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonValue()
   * @generated
   */
  int JSON_VALUE = 2;

  /**
   * The feature id for the '<em><b>Obj</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__OBJ = 0;

  /**
   * The feature id for the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__STR = 1;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__ARRAY = 2;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__BOOL = 3;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__NULL = 4;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__NUMBER = 5;

  /**
   * The feature id for the '<em><b>Str From Enum</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__STR_FROM_ENUM = 6;

  /**
   * The feature id for the '<em><b>Datetime</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE__DATETIME = 7;

  /**
   * The number of structural features of the '<em>Json Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_VALUE_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonArrayImpl <em>Json Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonArrayImpl
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonArray()
   * @generated
   */
  int JSON_ARRAY = 3;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__VALUES = 0;

  /**
   * The number of structural features of the '<em>Json Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl <em>Json Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonNumber()
   * @generated
   */
  int JSON_NUMBER = 4;

  /**
   * The feature id for the '<em><b>Float</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_NUMBER__FLOAT = 0;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_NUMBER__INT_VALUE = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_NUMBER__EXP = 2;

  /**
   * The feature id for the '<em><b>Exp Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_NUMBER__EXP_VALUE = 3;

  /**
   * The number of structural features of the '<em>Json Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_NUMBER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.ExJsonEnumImpl <em>Ex Json Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.jsonGen.impl.ExJsonEnumImpl
   * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getExJsonEnum()
   * @generated
   */
  int EX_JSON_ENUM = 5;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EX_JSON_ENUM__VALUES = 0;

  /**
   * The number of structural features of the '<em>Ex Json Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EX_JSON_ENUM_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.jsonGen.JsonObject <em>Json Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Object</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonObject
   * @generated
   */
  EClass getJsonObject();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.jsonGen.JsonObject#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonObject#getMembers()
   * @see #getJsonObject()
   * @generated
   */
  EReference getJsonObject_Members();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.jsonGen.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.Member#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.Member#isOptional()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Optional();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.Member#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.Member#getKey()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Key();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.jsonGen.Member#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.Member#getValue()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue <em>Json Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Value</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue
   * @generated
   */
  EClass getJsonValue();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getObj <em>Obj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Obj</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#getObj()
   * @see #getJsonValue()
   * @generated
   */
  EReference getJsonValue_Obj();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getStr <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Str</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#getStr()
   * @see #getJsonValue()
   * @generated
   */
  EAttribute getJsonValue_Str();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#getArray()
   * @see #getJsonValue()
   * @generated
   */
  EReference getJsonValue_Array();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#isBool()
   * @see #getJsonValue()
   * @generated
   */
  EAttribute getJsonValue_Bool();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#isNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#isNull()
   * @see #getJsonValue()
   * @generated
   */
  EAttribute getJsonValue_Null();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#getNumber()
   * @see #getJsonValue()
   * @generated
   */
  EReference getJsonValue_Number();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getStrFromEnum <em>Str From Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Str From Enum</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#getStrFromEnum()
   * @see #getJsonValue()
   * @generated
   */
  EReference getJsonValue_StrFromEnum();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonValue#getDatetime <em>Datetime</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datetime</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonValue#getDatetime()
   * @see #getJsonValue()
   * @generated
   */
  EAttribute getJsonValue_Datetime();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.jsonGen.JsonArray <em>Json Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Array</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonArray
   * @generated
   */
  EClass getJsonArray();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.jsonGen.JsonArray#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonArray#getValues()
   * @see #getJsonArray()
   * @generated
   */
  EReference getJsonArray_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber <em>Json Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Number</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonNumber
   * @generated
   */
  EClass getJsonNumber();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#isFloat <em>Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Float</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonNumber#isFloat()
   * @see #getJsonNumber()
   * @generated
   */
  EAttribute getJsonNumber_Float();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonNumber#getIntValue()
   * @see #getJsonNumber()
   * @generated
   */
  EAttribute getJsonNumber_IntValue();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#isExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonNumber#isExp()
   * @see #getJsonNumber()
   * @generated
   */
  EAttribute getJsonNumber_Exp();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.jsonGen.JsonNumber#getExpValue <em>Exp Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp Value</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonNumber#getExpValue()
   * @see #getJsonNumber()
   * @generated
   */
  EAttribute getJsonNumber_ExpValue();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.jsonGen.ExJsonEnum <em>Ex Json Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ex Json Enum</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.ExJsonEnum
   * @generated
   */
  EClass getExJsonEnum();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.jsonGen.ExJsonEnum#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see nl.sison.dsl.mobgen.jsonGen.ExJsonEnum#getValues()
   * @see #getExJsonEnum()
   * @generated
   */
  EAttribute getExJsonEnum_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JsonGenFactory getJsonGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonObjectImpl <em>Json Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonObjectImpl
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonObject()
     * @generated
     */
    EClass JSON_OBJECT = eINSTANCE.getJsonObject();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_OBJECT__MEMBERS = eINSTANCE.getJsonObject_Members();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.jsonGen.impl.MemberImpl
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__OPTIONAL = eINSTANCE.getMember_Optional();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__KEY = eINSTANCE.getMember_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__VALUE = eINSTANCE.getMember_Value();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl <em>Json Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonValue()
     * @generated
     */
    EClass JSON_VALUE = eINSTANCE.getJsonValue();

    /**
     * The meta object literal for the '<em><b>Obj</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_VALUE__OBJ = eINSTANCE.getJsonValue_Obj();

    /**
     * The meta object literal for the '<em><b>Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_VALUE__STR = eINSTANCE.getJsonValue_Str();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_VALUE__ARRAY = eINSTANCE.getJsonValue_Array();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_VALUE__BOOL = eINSTANCE.getJsonValue_Bool();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_VALUE__NULL = eINSTANCE.getJsonValue_Null();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_VALUE__NUMBER = eINSTANCE.getJsonValue_Number();

    /**
     * The meta object literal for the '<em><b>Str From Enum</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_VALUE__STR_FROM_ENUM = eINSTANCE.getJsonValue_StrFromEnum();

    /**
     * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_VALUE__DATETIME = eINSTANCE.getJsonValue_Datetime();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonArrayImpl <em>Json Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonArrayImpl
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonArray()
     * @generated
     */
    EClass JSON_ARRAY = eINSTANCE.getJsonArray();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_ARRAY__VALUES = eINSTANCE.getJsonArray_Values();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl <em>Json Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getJsonNumber()
     * @generated
     */
    EClass JSON_NUMBER = eINSTANCE.getJsonNumber();

    /**
     * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_NUMBER__FLOAT = eINSTANCE.getJsonNumber_Float();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_NUMBER__INT_VALUE = eINSTANCE.getJsonNumber_IntValue();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_NUMBER__EXP = eINSTANCE.getJsonNumber_Exp();

    /**
     * The meta object literal for the '<em><b>Exp Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_NUMBER__EXP_VALUE = eINSTANCE.getJsonNumber_ExpValue();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.jsonGen.impl.ExJsonEnumImpl <em>Ex Json Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.jsonGen.impl.ExJsonEnumImpl
     * @see nl.sison.dsl.mobgen.jsonGen.impl.JsonGenPackageImpl#getExJsonEnum()
     * @generated
     */
    EClass EX_JSON_ENUM = eINSTANCE.getExJsonEnum();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EX_JSON_ENUM__VALUES = eINSTANCE.getExJsonEnum_Values();

  }

} //JsonGenPackage
