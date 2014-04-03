/**
 */
package nl.sison.xplatform;

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
 * @see nl.sison.xplatform.XplatformFactory
 * @model kind="package"
 * @generated
 */
public interface XplatformPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xplatform";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sison.nl/Xplatform";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xplatform";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XplatformPackage eINSTANCE = nl.sison.xplatform.impl.XplatformPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformImpl <em>Xplatform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatform()
   * @generated
   */
  int XPLATFORM = 0;

  /**
   * The feature id for the '<em><b>Call Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__CALL_NAME = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__METHOD = 1;

  /**
   * The feature id for the '<em><b>Uri Path Params</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__URI_PATH_PARAMS = 2;

  /**
   * The feature id for the '<em><b>Request Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__REQUEST_HEADERS = 3;

  /**
   * The feature id for the '<em><b>Response Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__RESPONSE_HEADERS = 4;

  /**
   * The feature id for the '<em><b>Json To Client</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__JSON_TO_CLIENT = 5;

  /**
   * The feature id for the '<em><b>Json To Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__JSON_TO_SERVER = 6;

  /**
   * The number of structural features of the '<em>Xplatform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformJsonImpl <em>Json</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformJsonImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformJson()
   * @generated
   */
  int XPLATFORM_JSON = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON__TYPE = 0;

  /**
   * The feature id for the '<em><b>Meta Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON__META_TYPE = 1;

  /**
   * The number of structural features of the '<em>Json</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformHeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformHeaderImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformHeader()
   * @generated
   */
  int XPLATFORM_HEADER = 2;

  /**
   * The feature id for the '<em><b>Header Key Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER__HEADER_KEY_VALUES = 0;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformHeaderKeyValueImpl <em>Header Key Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformHeaderKeyValueImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformHeaderKeyValue()
   * @generated
   */
  int XPLATFORM_HEADER_KEY_VALUE = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_KEY_VALUE__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_KEY_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Header Key Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_KEY_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonTypeImpl <em>Json Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonTypeImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonType()
   * @generated
   */
  int JSON_TYPE = 5;

  /**
   * The number of structural features of the '<em>Json Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonMetaTypeImpl <em>Json Meta Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonMetaTypeImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaType()
   * @generated
   */
  int JSON_META_TYPE = 4;

  /**
   * The number of structural features of the '<em>Json Meta Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_TYPE_FEATURE_COUNT = JSON_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonArrayImpl <em>Json Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonArrayImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonArray()
   * @generated
   */
  int JSON_ARRAY = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__TYPE = JSON_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Json Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY_FEATURE_COUNT = JSON_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonKeyValuePairImpl <em>Json Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonKeyValuePairImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonKeyValuePair()
   * @generated
   */
  int JSON_KEY_VALUE_PAIR = 7;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_KEY_VALUE_PAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_KEY_VALUE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Json Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_KEY_VALUE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonObjectImpl <em>Json Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonObjectImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonObject()
   * @generated
   */
  int JSON_OBJECT = 8;

  /**
   * The feature id for the '<em><b>Key Value Pair</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__KEY_VALUE_PAIR = JSON_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Meta Key Value Pair</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__META_KEY_VALUE_PAIR = JSON_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Json Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_FEATURE_COUNT = JSON_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonMetaArrayImpl <em>Json Meta Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonMetaArrayImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaArray()
   * @generated
   */
  int JSON_META_ARRAY = 9;

  /**
   * The feature id for the '<em><b>Meta Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_ARRAY__META_TYPE = JSON_META_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Json Meta Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_ARRAY_FEATURE_COUNT = JSON_META_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonMetaKeyValuePairImpl <em>Json Meta Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonMetaKeyValuePairImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaKeyValuePair()
   * @generated
   */
  int JSON_META_KEY_VALUE_PAIR = 10;

  /**
   * The feature id for the '<em><b>Meta Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_KEY_VALUE_PAIR__META_KEY = 0;

  /**
   * The feature id for the '<em><b>Meta Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_KEY_VALUE_PAIR__META_VALUE = 1;

  /**
   * The number of structural features of the '<em>Json Meta Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_KEY_VALUE_PAIR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.Xplatform <em>Xplatform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Xplatform</em>'.
   * @see nl.sison.xplatform.Xplatform
   * @generated
   */
  EClass getXplatform();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.Xplatform#getCallName <em>Call Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Call Name</em>'.
   * @see nl.sison.xplatform.Xplatform#getCallName()
   * @see #getXplatform()
   * @generated
   */
  EAttribute getXplatform_CallName();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.Xplatform#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see nl.sison.xplatform.Xplatform#getMethod()
   * @see #getXplatform()
   * @generated
   */
  EAttribute getXplatform_Method();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.Xplatform#getUriPathParams <em>Uri Path Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Uri Path Params</em>'.
   * @see nl.sison.xplatform.Xplatform#getUriPathParams()
   * @see #getXplatform()
   * @generated
   */
  EAttribute getXplatform_UriPathParams();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.Xplatform#getRequestHeaders <em>Request Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Request Headers</em>'.
   * @see nl.sison.xplatform.Xplatform#getRequestHeaders()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_RequestHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.Xplatform#getResponseHeaders <em>Response Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Response Headers</em>'.
   * @see nl.sison.xplatform.Xplatform#getResponseHeaders()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_ResponseHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.Xplatform#getJsonToClient <em>Json To Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Client</em>'.
   * @see nl.sison.xplatform.Xplatform#getJsonToClient()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_JsonToClient();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.Xplatform#getJsonToServer <em>Json To Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Server</em>'.
   * @see nl.sison.xplatform.Xplatform#getJsonToServer()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_JsonToServer();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.XplatformJson <em>Json</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json</em>'.
   * @see nl.sison.xplatform.XplatformJson
   * @generated
   */
  EClass getXplatformJson();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformJson#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see nl.sison.xplatform.XplatformJson#getType()
   * @see #getXplatformJson()
   * @generated
   */
  EReference getXplatformJson_Type();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformJson#getMetaType <em>Meta Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Type</em>'.
   * @see nl.sison.xplatform.XplatformJson#getMetaType()
   * @see #getXplatformJson()
   * @generated
   */
  EReference getXplatformJson_MetaType();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.XplatformHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see nl.sison.xplatform.XplatformHeader
   * @generated
   */
  EClass getXplatformHeader();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.XplatformHeader#getHeaderKeyValues <em>Header Key Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Header Key Values</em>'.
   * @see nl.sison.xplatform.XplatformHeader#getHeaderKeyValues()
   * @see #getXplatformHeader()
   * @generated
   */
  EReference getXplatformHeader_HeaderKeyValues();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.XplatformHeaderKeyValue <em>Header Key Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Key Value</em>'.
   * @see nl.sison.xplatform.XplatformHeaderKeyValue
   * @generated
   */
  EClass getXplatformHeaderKeyValue();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformHeaderKeyValue#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.xplatform.XplatformHeaderKeyValue#getKey()
   * @see #getXplatformHeaderKeyValue()
   * @generated
   */
  EAttribute getXplatformHeaderKeyValue_Key();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformHeaderKeyValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.sison.xplatform.XplatformHeaderKeyValue#getValue()
   * @see #getXplatformHeaderKeyValue()
   * @generated
   */
  EAttribute getXplatformHeaderKeyValue_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonMetaType <em>Json Meta Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Meta Type</em>'.
   * @see nl.sison.xplatform.JsonMetaType
   * @generated
   */
  EClass getJsonMetaType();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonType <em>Json Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Type</em>'.
   * @see nl.sison.xplatform.JsonType
   * @generated
   */
  EClass getJsonType();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonArray <em>Json Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Array</em>'.
   * @see nl.sison.xplatform.JsonArray
   * @generated
   */
  EClass getJsonArray();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.JsonArray#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see nl.sison.xplatform.JsonArray#getType()
   * @see #getJsonArray()
   * @generated
   */
  EReference getJsonArray_Type();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonKeyValuePair <em>Json Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Key Value Pair</em>'.
   * @see nl.sison.xplatform.JsonKeyValuePair
   * @generated
   */
  EClass getJsonKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.JsonKeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.xplatform.JsonKeyValuePair#getKey()
   * @see #getJsonKeyValuePair()
   * @generated
   */
  EAttribute getJsonKeyValuePair_Key();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.JsonKeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.sison.xplatform.JsonKeyValuePair#getValue()
   * @see #getJsonKeyValuePair()
   * @generated
   */
  EReference getJsonKeyValuePair_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonObject <em>Json Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Object</em>'.
   * @see nl.sison.xplatform.JsonObject
   * @generated
   */
  EClass getJsonObject();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.JsonObject#getKeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Key Value Pair</em>'.
   * @see nl.sison.xplatform.JsonObject#getKeyValuePair()
   * @see #getJsonObject()
   * @generated
   */
  EReference getJsonObject_KeyValuePair();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.JsonObject#getMetaKeyValuePair <em>Meta Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta Key Value Pair</em>'.
   * @see nl.sison.xplatform.JsonObject#getMetaKeyValuePair()
   * @see #getJsonObject()
   * @generated
   */
  EReference getJsonObject_MetaKeyValuePair();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonMetaArray <em>Json Meta Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Meta Array</em>'.
   * @see nl.sison.xplatform.JsonMetaArray
   * @generated
   */
  EClass getJsonMetaArray();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.JsonMetaArray#getMetaType <em>Meta Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Type</em>'.
   * @see nl.sison.xplatform.JsonMetaArray#getMetaType()
   * @see #getJsonMetaArray()
   * @generated
   */
  EReference getJsonMetaArray_MetaType();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonMetaKeyValuePair <em>Json Meta Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Meta Key Value Pair</em>'.
   * @see nl.sison.xplatform.JsonMetaKeyValuePair
   * @generated
   */
  EClass getJsonMetaKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.JsonMetaKeyValuePair#getMetaKey <em>Meta Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta Key</em>'.
   * @see nl.sison.xplatform.JsonMetaKeyValuePair#getMetaKey()
   * @see #getJsonMetaKeyValuePair()
   * @generated
   */
  EAttribute getJsonMetaKeyValuePair_MetaKey();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.JsonMetaKeyValuePair#getMetaValue <em>Meta Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Value</em>'.
   * @see nl.sison.xplatform.JsonMetaKeyValuePair#getMetaValue()
   * @see #getJsonMetaKeyValuePair()
   * @generated
   */
  EReference getJsonMetaKeyValuePair_MetaValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XplatformFactory getXplatformFactory();

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
     * The meta object literal for the '{@link nl.sison.xplatform.impl.XplatformImpl <em>Xplatform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.XplatformImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatform()
     * @generated
     */
    EClass XPLATFORM = eINSTANCE.getXplatform();

    /**
     * The meta object literal for the '<em><b>Call Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM__CALL_NAME = eINSTANCE.getXplatform_CallName();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM__METHOD = eINSTANCE.getXplatform_Method();

    /**
     * The meta object literal for the '<em><b>Uri Path Params</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM__URI_PATH_PARAMS = eINSTANCE.getXplatform_UriPathParams();

    /**
     * The meta object literal for the '<em><b>Request Headers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__REQUEST_HEADERS = eINSTANCE.getXplatform_RequestHeaders();

    /**
     * The meta object literal for the '<em><b>Response Headers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__RESPONSE_HEADERS = eINSTANCE.getXplatform_ResponseHeaders();

    /**
     * The meta object literal for the '<em><b>Json To Client</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__JSON_TO_CLIENT = eINSTANCE.getXplatform_JsonToClient();

    /**
     * The meta object literal for the '<em><b>Json To Server</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__JSON_TO_SERVER = eINSTANCE.getXplatform_JsonToServer();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.XplatformJsonImpl <em>Json</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.XplatformJsonImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformJson()
     * @generated
     */
    EClass XPLATFORM_JSON = eINSTANCE.getXplatformJson();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_JSON__TYPE = eINSTANCE.getXplatformJson_Type();

    /**
     * The meta object literal for the '<em><b>Meta Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_JSON__META_TYPE = eINSTANCE.getXplatformJson_MetaType();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.XplatformHeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.XplatformHeaderImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformHeader()
     * @generated
     */
    EClass XPLATFORM_HEADER = eINSTANCE.getXplatformHeader();

    /**
     * The meta object literal for the '<em><b>Header Key Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_HEADER__HEADER_KEY_VALUES = eINSTANCE.getXplatformHeader_HeaderKeyValues();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.XplatformHeaderKeyValueImpl <em>Header Key Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.XplatformHeaderKeyValueImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformHeaderKeyValue()
     * @generated
     */
    EClass XPLATFORM_HEADER_KEY_VALUE = eINSTANCE.getXplatformHeaderKeyValue();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_HEADER_KEY_VALUE__KEY = eINSTANCE.getXplatformHeaderKeyValue_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_HEADER_KEY_VALUE__VALUE = eINSTANCE.getXplatformHeaderKeyValue_Value();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonMetaTypeImpl <em>Json Meta Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonMetaTypeImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaType()
     * @generated
     */
    EClass JSON_META_TYPE = eINSTANCE.getJsonMetaType();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonTypeImpl <em>Json Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonTypeImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonType()
     * @generated
     */
    EClass JSON_TYPE = eINSTANCE.getJsonType();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonArrayImpl <em>Json Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonArrayImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonArray()
     * @generated
     */
    EClass JSON_ARRAY = eINSTANCE.getJsonArray();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_ARRAY__TYPE = eINSTANCE.getJsonArray_Type();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonKeyValuePairImpl <em>Json Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonKeyValuePairImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonKeyValuePair()
     * @generated
     */
    EClass JSON_KEY_VALUE_PAIR = eINSTANCE.getJsonKeyValuePair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_KEY_VALUE_PAIR__KEY = eINSTANCE.getJsonKeyValuePair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_KEY_VALUE_PAIR__VALUE = eINSTANCE.getJsonKeyValuePair_Value();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonObjectImpl <em>Json Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonObjectImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonObject()
     * @generated
     */
    EClass JSON_OBJECT = eINSTANCE.getJsonObject();

    /**
     * The meta object literal for the '<em><b>Key Value Pair</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_OBJECT__KEY_VALUE_PAIR = eINSTANCE.getJsonObject_KeyValuePair();

    /**
     * The meta object literal for the '<em><b>Meta Key Value Pair</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_OBJECT__META_KEY_VALUE_PAIR = eINSTANCE.getJsonObject_MetaKeyValuePair();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonMetaArrayImpl <em>Json Meta Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonMetaArrayImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaArray()
     * @generated
     */
    EClass JSON_META_ARRAY = eINSTANCE.getJsonMetaArray();

    /**
     * The meta object literal for the '<em><b>Meta Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_META_ARRAY__META_TYPE = eINSTANCE.getJsonMetaArray_MetaType();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonMetaKeyValuePairImpl <em>Json Meta Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonMetaKeyValuePairImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaKeyValuePair()
     * @generated
     */
    EClass JSON_META_KEY_VALUE_PAIR = eINSTANCE.getJsonMetaKeyValuePair();

    /**
     * The meta object literal for the '<em><b>Meta Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_META_KEY_VALUE_PAIR__META_KEY = eINSTANCE.getJsonMetaKeyValuePair_MetaKey();

    /**
     * The meta object literal for the '<em><b>Meta Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_META_KEY_VALUE_PAIR__META_VALUE = eINSTANCE.getJsonMetaKeyValuePair_MetaValue();

  }

} //XplatformPackage
