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
   * The feature id for the '<em><b>Platform</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__PLATFORM = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__RESOURCES = 1;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM__CALLS = 2;

  /**
   * The number of structural features of the '<em>Xplatform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.PlatformImpl <em>Platform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.PlatformImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getPlatform()
   * @generated
   */
  int PLATFORM = 1;

  /**
   * The feature id for the '<em><b>Platforms</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__PLATFORMS = 0;

  /**
   * The feature id for the '<em><b>Where To Generate</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__WHERE_TO_GENERATE = 1;

  /**
   * The number of structural features of the '<em>Platform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformCallDefinitionImpl <em>Call Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformCallDefinitionImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformCallDefinition()
   * @generated
   */
  int XPLATFORM_CALL_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION__METHOD = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION__URI = 2;

  /**
   * The feature id for the '<em><b>Request Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION__REQUEST_HEADERS = 3;

  /**
   * The feature id for the '<em><b>Response Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION__RESPONSE_HEADERS = 4;

  /**
   * The feature id for the '<em><b>Json To Client</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION__JSON_TO_CLIENT = 5;

  /**
   * The feature id for the '<em><b>Json To Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION__JSON_TO_SERVER = 6;

  /**
   * The number of structural features of the '<em>Call Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_CALL_DEFINITION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.URIImpl <em>URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.URIImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getURI()
   * @generated
   */
  int URI = 3;

  /**
   * The feature id for the '<em><b>Uri Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__URI_PARAMETERS = 0;

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
  int XPLATFORM_HEADER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER__NAME = 0;

  /**
   * The feature id for the '<em><b>Header Key Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER__HEADER_KEY_VALUES = 1;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformHeaderKeyValuePairImpl <em>Header Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformHeaderKeyValuePairImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformHeaderKeyValuePair()
   * @generated
   */
  int XPLATFORM_HEADER_KEY_VALUE_PAIR = 5;

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
  int XPLATFORM_JSON = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON__TYPE = 1;

  /**
   * The feature id for the '<em><b>Meta Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON__META_TYPE = 2;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON__COMPOSITE = 3;

  /**
   * The number of structural features of the '<em>Json</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_JSON_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.JsonMetaArrayImpl <em>Json Meta Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.JsonMetaArrayImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getJsonMetaArray()
   * @generated
   */
  int JSON_META_ARRAY = 7;

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
  int JSON_META_TYPE = 8;

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
  int JSON_COMPOSITE_TYPE = 9;

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
  int JSON_TYPE = 10;

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
  int JSON_SCALAR_TYPE = 11;

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
  int JSON_ARRAY = 12;

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
  int JSON_OBJECT = 13;

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
   * The meta object id for the '{@link nl.sison.xplatform.impl.XplatformResourceDefinitionImpl <em>Resource Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.XplatformResourceDefinitionImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformResourceDefinition()
   * @generated
   */
  int XPLATFORM_RESOURCE_DEFINITION = 14;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_RESOURCE_DEFINITION__RESOURCES = 0;

  /**
   * The number of structural features of the '<em>Resource Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XPLATFORM_RESOURCE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.EnumInstanceImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getEnumInstance()
   * @generated
   */
  int ENUM_INSTANCE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__VALUES = 1;

  /**
   * The number of structural features of the '<em>Enum Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.MapInstanceImpl <em>Map Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.MapInstanceImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getMapInstance()
   * @generated
   */
  int MAP_INSTANCE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Keys</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE__KEYS = 1;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE__VALUES = 2;

  /**
   * The number of structural features of the '<em>Map Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.NestedTypeImpl <em>Nested Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.NestedTypeImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getNestedType()
   * @generated
   */
  int NESTED_TYPE = 18;

  /**
   * The number of structural features of the '<em>Nested Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.sison.xplatform.impl.StringListImpl <em>String List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.xplatform.impl.StringListImpl
   * @see nl.sison.xplatform.impl.XplatformPackageImpl#getStringList()
   * @generated
   */
  int STRING_LIST = 17;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST__VALUES = NESTED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_FEATURE_COUNT = NESTED_TYPE_FEATURE_COUNT + 1;


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
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.Xplatform#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Platform</em>'.
   * @see nl.sison.xplatform.Xplatform#getPlatform()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_Platform();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.Xplatform#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see nl.sison.xplatform.Xplatform#getResources()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.Xplatform#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see nl.sison.xplatform.Xplatform#getCalls()
   * @see #getXplatform()
   * @generated
   */
  EReference getXplatform_Calls();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform</em>'.
   * @see nl.sison.xplatform.Platform
   * @generated
   */
  EClass getPlatform();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.Platform#getPlatforms <em>Platforms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Platforms</em>'.
   * @see nl.sison.xplatform.Platform#getPlatforms()
   * @see #getPlatform()
   * @generated
   */
  EAttribute getPlatform_Platforms();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.Platform#getWhereToGenerate <em>Where To Generate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Where To Generate</em>'.
   * @see nl.sison.xplatform.Platform#getWhereToGenerate()
   * @see #getPlatform()
   * @generated
   */
  EAttribute getPlatform_WhereToGenerate();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.XplatformCallDefinition <em>Call Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Definition</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition
   * @generated
   */
  EClass getXplatformCallDefinition();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformCallDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition#getName()
   * @see #getXplatformCallDefinition()
   * @generated
   */
  EAttribute getXplatformCallDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformCallDefinition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition#getMethod()
   * @see #getXplatformCallDefinition()
   * @generated
   */
  EAttribute getXplatformCallDefinition_Method();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformCallDefinition#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition#getUri()
   * @see #getXplatformCallDefinition()
   * @generated
   */
  EReference getXplatformCallDefinition_Uri();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformCallDefinition#getRequestHeaders <em>Request Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Request Headers</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition#getRequestHeaders()
   * @see #getXplatformCallDefinition()
   * @generated
   */
  EReference getXplatformCallDefinition_RequestHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformCallDefinition#getResponseHeaders <em>Response Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Response Headers</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition#getResponseHeaders()
   * @see #getXplatformCallDefinition()
   * @generated
   */
  EReference getXplatformCallDefinition_ResponseHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformCallDefinition#getJsonToClient <em>Json To Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Client</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition#getJsonToClient()
   * @see #getXplatformCallDefinition()
   * @generated
   */
  EReference getXplatformCallDefinition_JsonToClient();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.xplatform.XplatformCallDefinition#getJsonToServer <em>Json To Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Server</em>'.
   * @see nl.sison.xplatform.XplatformCallDefinition#getJsonToServer()
   * @see #getXplatformCallDefinition()
   * @generated
   */
  EReference getXplatformCallDefinition_JsonToServer();

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
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.URI#getUriParameters <em>Uri Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Uri Parameters</em>'.
   * @see nl.sison.xplatform.URI#getUriParameters()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_UriParameters();

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
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformHeader#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.xplatform.XplatformHeader#getName()
   * @see #getXplatformHeader()
   * @generated
   */
  EAttribute getXplatformHeader_Name();

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
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.XplatformJson#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.xplatform.XplatformJson#getName()
   * @see #getXplatformJson()
   * @generated
   */
  EAttribute getXplatformJson_Name();

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
   * Returns the meta object for class '{@link nl.sison.xplatform.XplatformResourceDefinition <em>Resource Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Definition</em>'.
   * @see nl.sison.xplatform.XplatformResourceDefinition
   * @generated
   */
  EClass getXplatformResourceDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.XplatformResourceDefinition#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see nl.sison.xplatform.XplatformResourceDefinition#getResources()
   * @see #getXplatformResourceDefinition()
   * @generated
   */
  EReference getXplatformResourceDefinition_Resources();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.EnumInstance <em>Enum Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Instance</em>'.
   * @see nl.sison.xplatform.EnumInstance
   * @generated
   */
  EClass getEnumInstance();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.EnumInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.xplatform.EnumInstance#getName()
   * @see #getEnumInstance()
   * @generated
   */
  EAttribute getEnumInstance_Name();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.EnumInstance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see nl.sison.xplatform.EnumInstance#getValues()
   * @see #getEnumInstance()
   * @generated
   */
  EAttribute getEnumInstance_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.MapInstance <em>Map Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Instance</em>'.
   * @see nl.sison.xplatform.MapInstance
   * @generated
   */
  EClass getMapInstance();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.xplatform.MapInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.xplatform.MapInstance#getName()
   * @see #getMapInstance()
   * @generated
   */
  EAttribute getMapInstance_Name();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.MapInstance#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Keys</em>'.
   * @see nl.sison.xplatform.MapInstance#getKeys()
   * @see #getMapInstance()
   * @generated
   */
  EAttribute getMapInstance_Keys();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.xplatform.MapInstance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see nl.sison.xplatform.MapInstance#getValues()
   * @see #getMapInstance()
   * @generated
   */
  EReference getMapInstance_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.StringList <em>String List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String List</em>'.
   * @see nl.sison.xplatform.StringList
   * @generated
   */
  EClass getStringList();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.xplatform.StringList#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see nl.sison.xplatform.StringList#getValues()
   * @see #getStringList()
   * @generated
   */
  EAttribute getStringList_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.xplatform.NestedType <em>Nested Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Type</em>'.
   * @see nl.sison.xplatform.NestedType
   * @generated
   */
  EClass getNestedType();

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
     * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__PLATFORM = eINSTANCE.getXplatform_Platform();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__RESOURCES = eINSTANCE.getXplatform_Resources();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM__CALLS = eINSTANCE.getXplatform_Calls();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.PlatformImpl <em>Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.PlatformImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getPlatform()
     * @generated
     */
    EClass PLATFORM = eINSTANCE.getPlatform();

    /**
     * The meta object literal for the '<em><b>Platforms</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM__PLATFORMS = eINSTANCE.getPlatform_Platforms();

    /**
     * The meta object literal for the '<em><b>Where To Generate</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM__WHERE_TO_GENERATE = eINSTANCE.getPlatform_WhereToGenerate();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.XplatformCallDefinitionImpl <em>Call Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.XplatformCallDefinitionImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformCallDefinition()
     * @generated
     */
    EClass XPLATFORM_CALL_DEFINITION = eINSTANCE.getXplatformCallDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_CALL_DEFINITION__NAME = eINSTANCE.getXplatformCallDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_CALL_DEFINITION__METHOD = eINSTANCE.getXplatformCallDefinition_Method();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_CALL_DEFINITION__URI = eINSTANCE.getXplatformCallDefinition_Uri();

    /**
     * The meta object literal for the '<em><b>Request Headers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_CALL_DEFINITION__REQUEST_HEADERS = eINSTANCE.getXplatformCallDefinition_RequestHeaders();

    /**
     * The meta object literal for the '<em><b>Response Headers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_CALL_DEFINITION__RESPONSE_HEADERS = eINSTANCE.getXplatformCallDefinition_ResponseHeaders();

    /**
     * The meta object literal for the '<em><b>Json To Client</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_CALL_DEFINITION__JSON_TO_CLIENT = eINSTANCE.getXplatformCallDefinition_JsonToClient();

    /**
     * The meta object literal for the '<em><b>Json To Server</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_CALL_DEFINITION__JSON_TO_SERVER = eINSTANCE.getXplatformCallDefinition_JsonToServer();

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
     * The meta object literal for the '<em><b>Uri Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__URI_PARAMETERS = eINSTANCE.getURI_UriParameters();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_HEADER__NAME = eINSTANCE.getXplatformHeader_Name();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XPLATFORM_JSON__NAME = eINSTANCE.getXplatformJson_Name();

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

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.XplatformResourceDefinitionImpl <em>Resource Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.XplatformResourceDefinitionImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getXplatformResourceDefinition()
     * @generated
     */
    EClass XPLATFORM_RESOURCE_DEFINITION = eINSTANCE.getXplatformResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XPLATFORM_RESOURCE_DEFINITION__RESOURCES = eINSTANCE.getXplatformResourceDefinition_Resources();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.EnumInstanceImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getEnumInstance()
     * @generated
     */
    EClass ENUM_INSTANCE = eINSTANCE.getEnumInstance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_INSTANCE__NAME = eINSTANCE.getEnumInstance_Name();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_INSTANCE__VALUES = eINSTANCE.getEnumInstance_Values();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.MapInstanceImpl <em>Map Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.MapInstanceImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getMapInstance()
     * @generated
     */
    EClass MAP_INSTANCE = eINSTANCE.getMapInstance();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAP_INSTANCE__NAME = eINSTANCE.getMapInstance_Name();

    /**
     * The meta object literal for the '<em><b>Keys</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAP_INSTANCE__KEYS = eINSTANCE.getMapInstance_Keys();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_INSTANCE__VALUES = eINSTANCE.getMapInstance_Values();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.StringListImpl <em>String List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.StringListImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getStringList()
     * @generated
     */
    EClass STRING_LIST = eINSTANCE.getStringList();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LIST__VALUES = eINSTANCE.getStringList_Values();

    /**
     * The meta object literal for the '{@link nl.sison.xplatform.impl.NestedTypeImpl <em>Nested Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.xplatform.impl.NestedTypeImpl
     * @see nl.sison.xplatform.impl.XplatformPackageImpl#getNestedType()
     * @generated
     */
    EClass NESTED_TYPE = eINSTANCE.getNestedType();

  }

} //XplatformPackage
