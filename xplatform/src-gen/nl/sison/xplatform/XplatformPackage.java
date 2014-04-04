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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__NAME = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__METHOD = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__URI = 2;

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
   * The meta object id for the '{@link nl.sison.xplatform.impl.URIImpl <em>URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.URIImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getURI()
   * @generated
   */
  int URI = 1;

  /**
   * The feature id for the '<em><b>Uri Parameter</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__URI_PARAMETER = 0;

  /**
   * The number of structural features of the '<em>URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_FEATURE_COUNT = 1;

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
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformHeaderKeyValuePairImpl <em>Header Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformHeaderKeyValuePairImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformHeaderKeyValuePair()
   * @generated
   */
  int XPLATFORM_HEADER_KEY_VALUE_PAIR = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_KEY_VALUE_PAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_KEY_VALUE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Header Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_KEY_VALUE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformJsonImpl <em>Json</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformJsonImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformJson()
   * @generated
   */
  int XPLATFORM_JSON = 4;

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
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON__COMPOSITE = 2;

  /**
   * The number of structural features of the '<em>Json</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonMetaArrayImpl <em>Json Meta Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonMetaArrayImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaArray()
   * @generated
   */
  int JSON_META_ARRAY = 5;

  /**
   * The feature id for the '<em><b>Meta Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_ARRAY__META_TYPE = 0;

  /**
   * The number of structural features of the '<em>Json Meta Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_ARRAY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonMetaTypeImpl <em>Json Meta Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonMetaTypeImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaType()
   * @generated
   */
  int JSON_META_TYPE = 6;

  /**
   * The feature id for the '<em><b>Scalar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_TYPE__SCALAR = 0;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_TYPE__COMPOSITE = 1;

  /**
   * The number of structural features of the '<em>Json Meta Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_META_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonCompositeTypeImpl <em>Json Composite Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonCompositeTypeImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonCompositeType()
   * @generated
   */
  int JSON_COMPOSITE_TYPE = 7;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPOSITE_TYPE__COMPOSITE = 0;

  /**
   * The number of structural features of the '<em>Json Composite Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPOSITE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonTypeImpl <em>Json Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonTypeImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonType()
   * @generated
   */
  int JSON_TYPE = 8;

  /**
   * The feature id for the '<em><b>Scalar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_TYPE__SCALAR = 0;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_TYPE__COMPOSITE = 1;

  /**
   * The number of structural features of the '<em>Json Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonScalarTypeImpl <em>Json Scalar Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonScalarTypeImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonScalarType()
   * @generated
   */
  int JSON_SCALAR_TYPE = 9;

  /**
   * The feature id for the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_SCALAR_TYPE__BOOL = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_SCALAR_TYPE__STRING = 1;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_SCALAR_TYPE__NUMBER = 2;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_SCALAR_TYPE__NULL = 3;

  /**
   * The number of structural features of the '<em>Json Scalar Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_SCALAR_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonArrayImpl <em>Json Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonArrayImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonArray()
   * @generated
   */
  int JSON_ARRAY = 10;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>Composites</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__COMPOSITES = 1;

  /**
   * The number of structural features of the '<em>Json Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonObjectImpl <em>Json Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonObjectImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonObject()
   * @generated
   */
  int JSON_OBJECT = 11;

  /**
   * The feature id for the '<em><b>Keys</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__KEYS = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__VALUES = 1;

  /**
   * The number of structural features of the '<em>Json Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_FEATURE_COUNT = 2;


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
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.Xplatform#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.xplatform.Xplatform#getName()
   * @see #getXplatform()
   * @generated
   */
  EAttribute getXplatform_Name();

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
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.Xplatform#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see nl.sison.xplatform.Xplatform#getUri()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_Uri();

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
   * Returns the meta object for class '{@link nl.sison.xplatform.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI</em>'.
   * @see nl.sison.xplatform.URI
   * @generated
   */
  EClass getURI();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.URI#getUriParameter <em>Uri Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Uri Parameter</em>'.
   * @see nl.sison.xplatform.URI#getUriParameter()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_UriParameter();

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
   * Returns the meta object for class '{@link nl.sison.xplatform.XplatformHeaderKeyValuePair <em>Header Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Key Value Pair</em>'.
   * @see nl.sison.xplatform.XplatformHeaderKeyValuePair
   * @generated
   */
  EClass getXplatformHeaderKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformHeaderKeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.xplatform.XplatformHeaderKeyValuePair#getKey()
   * @see #getXplatformHeaderKeyValuePair()
   * @generated
   */
  EAttribute getXplatformHeaderKeyValuePair_Key();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformHeaderKeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.sison.xplatform.XplatformHeaderKeyValuePair#getValue()
   * @see #getXplatformHeaderKeyValuePair()
   * @generated
   */
  EAttribute getXplatformHeaderKeyValuePair_Value();

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
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformJson#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see nl.sison.xplatform.XplatformJson#getComposite()
   * @see #getXplatformJson()
   * @generated
   */
  EReference getXplatformJson_Composite();

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
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonMetaType <em>Json Meta Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Meta Type</em>'.
   * @see nl.sison.xplatform.JsonMetaType
   * @generated
   */
  EClass getJsonMetaType();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.JsonMetaType#getScalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scalar</em>'.
   * @see nl.sison.xplatform.JsonMetaType#getScalar()
   * @see #getJsonMetaType()
   * @generated
   */
  EAttribute getJsonMetaType_Scalar();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.JsonMetaType#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see nl.sison.xplatform.JsonMetaType#getComposite()
   * @see #getJsonMetaType()
   * @generated
   */
  EReference getJsonMetaType_Composite();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonCompositeType <em>Json Composite Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Composite Type</em>'.
   * @see nl.sison.xplatform.JsonCompositeType
   * @generated
   */
  EClass getJsonCompositeType();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.JsonCompositeType#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see nl.sison.xplatform.JsonCompositeType#getComposite()
   * @see #getJsonCompositeType()
   * @generated
   */
  EReference getJsonCompositeType_Composite();

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
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.JsonType#getScalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scalar</em>'.
   * @see nl.sison.xplatform.JsonType#getScalar()
   * @see #getJsonType()
   * @generated
   */
  EReference getJsonType_Scalar();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.JsonType#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see nl.sison.xplatform.JsonType#getComposite()
   * @see #getJsonType()
   * @generated
   */
  EReference getJsonType_Composite();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.JsonScalarType <em>Json Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Scalar Type</em>'.
   * @see nl.sison.xplatform.JsonScalarType
   * @generated
   */
  EClass getJsonScalarType();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.JsonScalarType#getBool <em>Bool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool</em>'.
   * @see nl.sison.xplatform.JsonScalarType#getBool()
   * @see #getJsonScalarType()
   * @generated
   */
  EAttribute getJsonScalarType_Bool();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.JsonScalarType#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see nl.sison.xplatform.JsonScalarType#getString()
   * @see #getJsonScalarType()
   * @generated
   */
  EAttribute getJsonScalarType_String();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.JsonScalarType#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see nl.sison.xplatform.JsonScalarType#getNumber()
   * @see #getJsonScalarType()
   * @generated
   */
  EAttribute getJsonScalarType_Number();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.JsonScalarType#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see nl.sison.xplatform.JsonScalarType#getNull()
   * @see #getJsonScalarType()
   * @generated
   */
  EAttribute getJsonScalarType_Null();

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
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.JsonArray#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see nl.sison.xplatform.JsonArray#getElements()
   * @see #getJsonArray()
   * @generated
   */
  EReference getJsonArray_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.JsonArray#getComposites <em>Composites</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Composites</em>'.
   * @see nl.sison.xplatform.JsonArray#getComposites()
   * @see #getJsonArray()
   * @generated
   */
  EReference getJsonArray_Composites();

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
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.JsonObject#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Keys</em>'.
   * @see nl.sison.xplatform.JsonObject#getKeys()
   * @see #getJsonObject()
   * @generated
   */
  EAttribute getJsonObject_Keys();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.JsonObject#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see nl.sison.xplatform.JsonObject#getValues()
   * @see #getJsonObject()
   * @generated
   */
  EReference getJsonObject_Values();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM__NAME = eINSTANCE.getXplatform_Name();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM__METHOD = eINSTANCE.getXplatform_Method();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__URI = eINSTANCE.getXplatform_Uri();

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
     * The meta object literal for the '{@link nl.sison.xplatform.impl.URIImpl <em>URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.URIImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getURI()
     * @generated
     */
    EClass URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em><b>Uri Parameter</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__URI_PARAMETER = eINSTANCE.getURI_UriParameter();

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
     * The meta object literal for the '{@link nl.sison.xplatform.impl.XplatformHeaderKeyValuePairImpl <em>Header Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.XplatformHeaderKeyValuePairImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformHeaderKeyValuePair()
     * @generated
     */
    EClass XPLATFORM_HEADER_KEY_VALUE_PAIR = eINSTANCE.getXplatformHeaderKeyValuePair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_HEADER_KEY_VALUE_PAIR__KEY = eINSTANCE.getXplatformHeaderKeyValuePair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_HEADER_KEY_VALUE_PAIR__VALUE = eINSTANCE.getXplatformHeaderKeyValuePair_Value();

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
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_JSON__COMPOSITE = eINSTANCE.getXplatformJson_Composite();

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
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonMetaTypeImpl <em>Json Meta Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonMetaTypeImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaType()
     * @generated
     */
    EClass JSON_META_TYPE = eINSTANCE.getJsonMetaType();

    /**
     * The meta object literal for the '<em><b>Scalar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_META_TYPE__SCALAR = eINSTANCE.getJsonMetaType_Scalar();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_META_TYPE__COMPOSITE = eINSTANCE.getJsonMetaType_Composite();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonCompositeTypeImpl <em>Json Composite Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonCompositeTypeImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonCompositeType()
     * @generated
     */
    EClass JSON_COMPOSITE_TYPE = eINSTANCE.getJsonCompositeType();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_COMPOSITE_TYPE__COMPOSITE = eINSTANCE.getJsonCompositeType_Composite();

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
     * The meta object literal for the '<em><b>Scalar</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_TYPE__SCALAR = eINSTANCE.getJsonType_Scalar();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_TYPE__COMPOSITE = eINSTANCE.getJsonType_Composite();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.JsonScalarTypeImpl <em>Json Scalar Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.JsonScalarTypeImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonScalarType()
     * @generated
     */
    EClass JSON_SCALAR_TYPE = eINSTANCE.getJsonScalarType();

    /**
     * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_SCALAR_TYPE__BOOL = eINSTANCE.getJsonScalarType_Bool();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_SCALAR_TYPE__STRING = eINSTANCE.getJsonScalarType_String();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_SCALAR_TYPE__NUMBER = eINSTANCE.getJsonScalarType_Number();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_SCALAR_TYPE__NULL = eINSTANCE.getJsonScalarType_Null();

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
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_ARRAY__ELEMENTS = eINSTANCE.getJsonArray_Elements();

    /**
     * The meta object literal for the '<em><b>Composites</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_ARRAY__COMPOSITES = eINSTANCE.getJsonArray_Composites();

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
     * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_OBJECT__KEYS = eINSTANCE.getJsonObject_Keys();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_OBJECT__VALUES = eINSTANCE.getJsonObject_Values();

  }

} //XplatformPackage
