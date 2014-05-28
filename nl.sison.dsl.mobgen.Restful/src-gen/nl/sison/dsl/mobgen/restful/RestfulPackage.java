/**
 */
package nl.sison.dsl.mobgen.restful;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see nl.sison.dsl.mobgen.restful.RestfulFactory
 * @model kind="package"
 * @generated
 */
public interface RestfulPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "restful";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sison.nl/dsl/mobgen/Restful";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "restful";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RestfulPackage eINSTANCE = nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenImpl <em>Mobgen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MobgenImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgen()
   * @generated
   */
  int MOBGEN = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN__RESOURCES = 0;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN__CALLS = 1;

  /**
   * The number of structural features of the '<em>Mobgen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenCallDefinitionImpl <em>Mobgen Call Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MobgenCallDefinitionImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenCallDefinition()
   * @generated
   */
  int MOBGEN_CALL_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION__METHOD = 1;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION__URI = 2;

  /**
   * The feature id for the '<em><b>Request Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION__REQUEST_HEADERS = 3;

  /**
   * The feature id for the '<em><b>Response Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS = 4;

  /**
   * The feature id for the '<em><b>Json To Client</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT = 5;

  /**
   * The feature id for the '<em><b>Json To Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION__JSON_TO_SERVER = 6;

  /**
   * The number of structural features of the '<em>Mobgen Call Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderImpl <em>Mobgen Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MobgenHeaderImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenHeader()
   * @generated
   */
  int MOBGEN_HEADER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER__NAME = 0;

  /**
   * The feature id for the '<em><b>Header Key Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER__HEADER_KEY_VALUES = 1;

  /**
   * The number of structural features of the '<em>Mobgen Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderKeyValuePairImpl <em>Mobgen Header Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MobgenHeaderKeyValuePairImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenHeaderKeyValuePair()
   * @generated
   */
  int MOBGEN_HEADER_KEY_VALUE_PAIR = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_KEY_VALUE_PAIR__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_KEY_VALUE_PAIR__VALUE = 1;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_KEY_VALUE_PAIR__PARAMETER = 2;

  /**
   * The number of structural features of the '<em>Mobgen Header Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_KEY_VALUE_PAIR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderParameterImpl <em>Mobgen Header Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MobgenHeaderParameterImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenHeaderParameter()
   * @generated
   */
  int MOBGEN_HEADER_PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_PARAMETER__ID = 0;

  /**
   * The number of structural features of the '<em>Mobgen Header Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenJsonImpl <em>Mobgen Json</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MobgenJsonImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenJson()
   * @generated
   */
  int MOBGEN_JSON = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_JSON__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_JSON__VALUE = 1;

  /**
   * The number of structural features of the '<em>Mobgen Json</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_JSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonObjectValueImpl <em>Json Object Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.JsonObjectValueImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonObjectValue()
   * @generated
   */
  int JSON_OBJECT_VALUE = 6;

  /**
   * The feature id for the '<em><b>Scalar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_VALUE__SCALAR = 0;

  /**
   * The feature id for the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_VALUE__COMPOSITE = 1;

  /**
   * The number of structural features of the '<em>Json Object Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonCompositeValueImpl <em>Json Composite Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.JsonCompositeValueImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonCompositeValue()
   * @generated
   */
  int JSON_COMPOSITE_VALUE = 7;

  /**
   * The feature id for the '<em><b>Object Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPOSITE_VALUE__OBJECT_VALUE = 0;

  /**
   * The feature id for the '<em><b>Array Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPOSITE_VALUE__ARRAY_VALUE = 1;

  /**
   * The number of structural features of the '<em>Json Composite Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPOSITE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl <em>Json Literal Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonLiteralValue()
   * @generated
   */
  int JSON_LITERAL_VALUE = 8;

  /**
   * The feature id for the '<em><b>Literal String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__LITERAL_STRING = 0;

  /**
   * The feature id for the '<em><b>Empty Object</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__EMPTY_OBJECT = 1;

  /**
   * The feature id for the '<em><b>Empty Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__EMPTY_ARRAY = 2;

  /**
   * The feature id for the '<em><b>Literal Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__LITERAL_NULL = 3;

  /**
   * The feature id for the '<em><b>Number Float</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__NUMBER_FLOAT = 4;

  /**
   * The feature id for the '<em><b>Number Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__NUMBER_INTEGER = 5;

  /**
   * The feature id for the '<em><b>Enum Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__ENUM_TYPE = 6;

  /**
   * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__BOOLEAN_VALUE = 7;

  /**
   * The feature id for the '<em><b>Meta Scalar Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE__META_SCALAR_VALUE = 8;

  /**
   * The number of structural features of the '<em>Json Literal Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_LITERAL_VALUE_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonObjectImpl <em>Json Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.JsonObjectImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonObject()
   * @generated
   */
  int JSON_OBJECT = 9;

  /**
   * The feature id for the '<em><b>Key Value Pair</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__KEY_VALUE_PAIR = 0;

  /**
   * The number of structural features of the '<em>Json Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonKeyValuePairImpl <em>Json Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.JsonKeyValuePairImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonKeyValuePair()
   * @generated
   */
  int JSON_KEY_VALUE_PAIR = 10;

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
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonArrayImpl <em>Json Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.JsonArrayImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonArray()
   * @generated
   */
  int JSON_ARRAY = 11;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Json Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenResourceDefinitionImpl <em>Mobgen Resource Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MobgenResourceDefinitionImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenResourceDefinition()
   * @generated
   */
  int MOBGEN_RESOURCE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_RESOURCE_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Mobgen Resource Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.EnumInstanceImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getEnumInstance()
   * @generated
   */
  int ENUM_INSTANCE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__NAME = MOBGEN_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__VALUES = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE_FEATURE_COUNT = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.MapInstanceImpl <em>Map Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.MapInstanceImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMapInstance()
   * @generated
   */
  int MAP_INSTANCE = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE__NAME = MOBGEN_RESOURCE_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Keys</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE__KEYS = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE__VALUES = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Map Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_INSTANCE_FEATURE_COUNT = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.StringListImpl <em>String List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.StringListImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getStringList()
   * @generated
   */
  int STRING_LIST = 15;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST__VALUES = 0;

  /**
   * The number of structural features of the '<em>String List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.NestedTypeImpl <em>Nested Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.NestedTypeImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getNestedType()
   * @generated
   */
  int NESTED_TYPE = 16;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TYPE__LIST = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TYPE__STRING = 1;

  /**
   * The number of structural features of the '<em>Nested Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.impl.URIImpl <em>URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.impl.URIImpl
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getURI()
   * @generated
   */
  int URI = 17;

  /**
   * The feature id for the '<em><b>Url Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__URL_PREFIX = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__PATH = 1;

  /**
   * The feature id for the '<em><b>Path Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__PATH_PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Path Suffix</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__PATH_SUFFIX = 3;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__QUERY = 4;

  /**
   * The feature id for the '<em><b>Query Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__QUERY_PARAMETERS = 5;

  /**
   * The feature id for the '<em><b>Query Suffix</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__QUERY_SUFFIX = 6;

  /**
   * The number of structural features of the '<em>URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.RestfulMethods <em>Methods</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.RestfulMethods
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getRestfulMethods()
   * @generated
   */
  int RESTFUL_METHODS = 18;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.JsonMetaScalarType <em>Json Meta Scalar Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.JsonMetaScalarType
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonMetaScalarType()
   * @generated
   */
  int JSON_META_SCALAR_TYPE = 19;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.restful.JsonLiteralBoolean <em>Json Literal Boolean</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralBoolean
   * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonLiteralBoolean()
   * @generated
   */
  int JSON_LITERAL_BOOLEAN = 20;


  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.Mobgen <em>Mobgen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen</em>'.
   * @see nl.sison.dsl.mobgen.restful.Mobgen
   * @generated
   */
  EClass getMobgen();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.restful.Mobgen#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see nl.sison.dsl.mobgen.restful.Mobgen#getResources()
   * @see #getMobgen()
   * @generated
   */
  EReference getMobgen_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.restful.Mobgen#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see nl.sison.dsl.mobgen.restful.Mobgen#getCalls()
   * @see #getMobgen()
   * @generated
   */
  EReference getMobgen_Calls();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition <em>Mobgen Call Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen Call Definition</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition
   * @generated
   */
  EClass getMobgenCallDefinition();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getName()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EAttribute getMobgenCallDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getMethod()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EAttribute getMobgenCallDefinition_Method();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getUri()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_Uri();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getRequestHeaders <em>Request Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Request Headers</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getRequestHeaders()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_RequestHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getResponseHeaders <em>Response Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Response Headers</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getResponseHeaders()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_ResponseHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToClient <em>Json To Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Client</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToClient()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_JsonToClient();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToServer <em>Json To Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Server</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToServer()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_JsonToServer();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.MobgenHeader <em>Mobgen Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen Header</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeader
   * @generated
   */
  EClass getMobgenHeader();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenHeader#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeader#getName()
   * @see #getMobgenHeader()
   * @generated
   */
  EAttribute getMobgenHeader_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.restful.MobgenHeader#getHeaderKeyValues <em>Header Key Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Header Key Values</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeader#getHeaderKeyValues()
   * @see #getMobgenHeader()
   * @generated
   */
  EReference getMobgenHeader_HeaderKeyValues();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair <em>Mobgen Header Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen Header Key Value Pair</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair
   * @generated
   */
  EClass getMobgenHeaderKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getKey()
   * @see #getMobgenHeaderKeyValuePair()
   * @generated
   */
  EAttribute getMobgenHeaderKeyValuePair_Key();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getValue()
   * @see #getMobgenHeaderKeyValuePair()
   * @generated
   */
  EAttribute getMobgenHeaderKeyValuePair_Value();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair#getParameter()
   * @see #getMobgenHeaderKeyValuePair()
   * @generated
   */
  EReference getMobgenHeaderKeyValuePair_Parameter();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderParameter <em>Mobgen Header Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen Header Parameter</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderParameter
   * @generated
   */
  EClass getMobgenHeaderParameter();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderParameter#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderParameter#getId()
   * @see #getMobgenHeaderParameter()
   * @generated
   */
  EAttribute getMobgenHeaderParameter_Id();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.MobgenJson <em>Mobgen Json</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen Json</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenJson
   * @generated
   */
  EClass getMobgenJson();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenJson#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenJson#getName()
   * @see #getMobgenJson()
   * @generated
   */
  EAttribute getMobgenJson_Name();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.MobgenJson#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenJson#getValue()
   * @see #getMobgenJson()
   * @generated
   */
  EReference getMobgenJson_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.JsonObjectValue <em>Json Object Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Object Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonObjectValue
   * @generated
   */
  EClass getJsonObjectValue();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.JsonObjectValue#getScalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scalar</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonObjectValue#getScalar()
   * @see #getJsonObjectValue()
   * @generated
   */
  EReference getJsonObjectValue_Scalar();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.JsonObjectValue#getComposite <em>Composite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Composite</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonObjectValue#getComposite()
   * @see #getJsonObjectValue()
   * @generated
   */
  EReference getJsonObjectValue_Composite();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue <em>Json Composite Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Composite Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonCompositeValue
   * @generated
   */
  EClass getJsonCompositeValue();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue#getObjectValue <em>Object Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonCompositeValue#getObjectValue()
   * @see #getJsonCompositeValue()
   * @generated
   */
  EReference getJsonCompositeValue_ObjectValue();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue#getArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonCompositeValue#getArrayValue()
   * @see #getJsonCompositeValue()
   * @generated
   */
  EReference getJsonCompositeValue_ArrayValue();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue <em>Json Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Literal Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue
   * @generated
   */
  EClass getJsonLiteralValue();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#isLiteralString <em>Literal String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal String</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#isLiteralString()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_LiteralString();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#isEmptyObject <em>Empty Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty Object</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#isEmptyObject()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_EmptyObject();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#isEmptyArray <em>Empty Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty Array</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#isEmptyArray()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_EmptyArray();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#isLiteralNull <em>Literal Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal Null</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#isLiteralNull()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_LiteralNull();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#isNumberFloat <em>Number Float</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Float</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#isNumberFloat()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_NumberFloat();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#isNumberInteger <em>Number Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number Integer</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#isNumberInteger()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_NumberInteger();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#isEnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum Type</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#isEnumType()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_EnumType();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#getBooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#getBooleanValue()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_BooleanValue();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue#getMetaScalarValue <em>Meta Scalar Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta Scalar Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue#getMetaScalarValue()
   * @see #getJsonLiteralValue()
   * @generated
   */
  EAttribute getJsonLiteralValue_MetaScalarValue();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.JsonObject <em>Json Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Object</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonObject
   * @generated
   */
  EClass getJsonObject();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.restful.JsonObject#getKeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Key Value Pair</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonObject#getKeyValuePair()
   * @see #getJsonObject()
   * @generated
   */
  EReference getJsonObject_KeyValuePair();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.JsonKeyValuePair <em>Json Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Key Value Pair</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonKeyValuePair
   * @generated
   */
  EClass getJsonKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.JsonKeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonKeyValuePair#getKey()
   * @see #getJsonKeyValuePair()
   * @generated
   */
  EAttribute getJsonKeyValuePair_Key();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.JsonKeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonKeyValuePair#getValue()
   * @see #getJsonKeyValuePair()
   * @generated
   */
  EReference getJsonKeyValuePair_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.JsonArray <em>Json Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Array</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonArray
   * @generated
   */
  EClass getJsonArray();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.restful.JsonArray#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonArray#getItems()
   * @see #getJsonArray()
   * @generated
   */
  EReference getJsonArray_Items();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.MobgenResourceDefinition <em>Mobgen Resource Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen Resource Definition</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenResourceDefinition
   * @generated
   */
  EClass getMobgenResourceDefinition();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.MobgenResourceDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.restful.MobgenResourceDefinition#getName()
   * @see #getMobgenResourceDefinition()
   * @generated
   */
  EAttribute getMobgenResourceDefinition_Name();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.EnumInstance <em>Enum Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Instance</em>'.
   * @see nl.sison.dsl.mobgen.restful.EnumInstance
   * @generated
   */
  EClass getEnumInstance();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.EnumInstance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see nl.sison.dsl.mobgen.restful.EnumInstance#getValues()
   * @see #getEnumInstance()
   * @generated
   */
  EAttribute getEnumInstance_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.MapInstance <em>Map Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Instance</em>'.
   * @see nl.sison.dsl.mobgen.restful.MapInstance
   * @generated
   */
  EClass getMapInstance();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.MapInstance#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Keys</em>'.
   * @see nl.sison.dsl.mobgen.restful.MapInstance#getKeys()
   * @see #getMapInstance()
   * @generated
   */
  EAttribute getMapInstance_Keys();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.restful.MapInstance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see nl.sison.dsl.mobgen.restful.MapInstance#getValues()
   * @see #getMapInstance()
   * @generated
   */
  EReference getMapInstance_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.StringList <em>String List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String List</em>'.
   * @see nl.sison.dsl.mobgen.restful.StringList
   * @generated
   */
  EClass getStringList();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.StringList#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see nl.sison.dsl.mobgen.restful.StringList#getValues()
   * @see #getStringList()
   * @generated
   */
  EAttribute getStringList_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.NestedType <em>Nested Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Type</em>'.
   * @see nl.sison.dsl.mobgen.restful.NestedType
   * @generated
   */
  EClass getNestedType();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.restful.NestedType#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see nl.sison.dsl.mobgen.restful.NestedType#getList()
   * @see #getNestedType()
   * @generated
   */
  EReference getNestedType_List();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.NestedType#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see nl.sison.dsl.mobgen.restful.NestedType#getString()
   * @see #getNestedType()
   * @generated
   */
  EAttribute getNestedType_String();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.restful.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI
   * @generated
   */
  EClass getURI();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.URI#getUrlPrefix <em>Url Prefix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url Prefix</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI#getUrlPrefix()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_UrlPrefix();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.restful.URI#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI#getPath()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_Path();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.URI#getPathParameters <em>Path Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Path Parameters</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI#getPathParameters()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_PathParameters();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.URI#getPathSuffix <em>Path Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Path Suffix</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI#getPathSuffix()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_PathSuffix();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.URI#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Query</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI#getQuery()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_Query();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.URI#getQueryParameters <em>Query Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Query Parameters</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI#getQueryParameters()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_QueryParameters();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.restful.URI#getQuerySuffix <em>Query Suffix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Query Suffix</em>'.
   * @see nl.sison.dsl.mobgen.restful.URI#getQuerySuffix()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_QuerySuffix();

  /**
   * Returns the meta object for enum '{@link nl.sison.dsl.mobgen.restful.RestfulMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Methods</em>'.
   * @see nl.sison.dsl.mobgen.restful.RestfulMethods
   * @generated
   */
  EEnum getRestfulMethods();

  /**
   * Returns the meta object for enum '{@link nl.sison.dsl.mobgen.restful.JsonMetaScalarType <em>Json Meta Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Json Meta Scalar Type</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonMetaScalarType
   * @generated
   */
  EEnum getJsonMetaScalarType();

  /**
   * Returns the meta object for enum '{@link nl.sison.dsl.mobgen.restful.JsonLiteralBoolean <em>Json Literal Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Json Literal Boolean</em>'.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralBoolean
   * @generated
   */
  EEnum getJsonLiteralBoolean();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RestfulFactory getRestfulFactory();

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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenImpl <em>Mobgen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MobgenImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgen()
     * @generated
     */
    EClass MOBGEN = eINSTANCE.getMobgen();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN__RESOURCES = eINSTANCE.getMobgen_Resources();

    /**
     * The meta object literal for the '<em><b>Calls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN__CALLS = eINSTANCE.getMobgen_Calls();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenCallDefinitionImpl <em>Mobgen Call Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MobgenCallDefinitionImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenCallDefinition()
     * @generated
     */
    EClass MOBGEN_CALL_DEFINITION = eINSTANCE.getMobgenCallDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_CALL_DEFINITION__NAME = eINSTANCE.getMobgenCallDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_CALL_DEFINITION__METHOD = eINSTANCE.getMobgenCallDefinition_Method();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_CALL_DEFINITION__URI = eINSTANCE.getMobgenCallDefinition_Uri();

    /**
     * The meta object literal for the '<em><b>Request Headers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_CALL_DEFINITION__REQUEST_HEADERS = eINSTANCE.getMobgenCallDefinition_RequestHeaders();

    /**
     * The meta object literal for the '<em><b>Response Headers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS = eINSTANCE.getMobgenCallDefinition_ResponseHeaders();

    /**
     * The meta object literal for the '<em><b>Json To Client</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT = eINSTANCE.getMobgenCallDefinition_JsonToClient();

    /**
     * The meta object literal for the '<em><b>Json To Server</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_CALL_DEFINITION__JSON_TO_SERVER = eINSTANCE.getMobgenCallDefinition_JsonToServer();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderImpl <em>Mobgen Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MobgenHeaderImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenHeader()
     * @generated
     */
    EClass MOBGEN_HEADER = eINSTANCE.getMobgenHeader();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_HEADER__NAME = eINSTANCE.getMobgenHeader_Name();

    /**
     * The meta object literal for the '<em><b>Header Key Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_HEADER__HEADER_KEY_VALUES = eINSTANCE.getMobgenHeader_HeaderKeyValues();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderKeyValuePairImpl <em>Mobgen Header Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MobgenHeaderKeyValuePairImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenHeaderKeyValuePair()
     * @generated
     */
    EClass MOBGEN_HEADER_KEY_VALUE_PAIR = eINSTANCE.getMobgenHeaderKeyValuePair();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_HEADER_KEY_VALUE_PAIR__KEY = eINSTANCE.getMobgenHeaderKeyValuePair_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_HEADER_KEY_VALUE_PAIR__VALUE = eINSTANCE.getMobgenHeaderKeyValuePair_Value();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_HEADER_KEY_VALUE_PAIR__PARAMETER = eINSTANCE.getMobgenHeaderKeyValuePair_Parameter();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderParameterImpl <em>Mobgen Header Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MobgenHeaderParameterImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenHeaderParameter()
     * @generated
     */
    EClass MOBGEN_HEADER_PARAMETER = eINSTANCE.getMobgenHeaderParameter();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_HEADER_PARAMETER__ID = eINSTANCE.getMobgenHeaderParameter_Id();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenJsonImpl <em>Mobgen Json</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MobgenJsonImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenJson()
     * @generated
     */
    EClass MOBGEN_JSON = eINSTANCE.getMobgenJson();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_JSON__NAME = eINSTANCE.getMobgenJson_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_JSON__VALUE = eINSTANCE.getMobgenJson_Value();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonObjectValueImpl <em>Json Object Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.JsonObjectValueImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonObjectValue()
     * @generated
     */
    EClass JSON_OBJECT_VALUE = eINSTANCE.getJsonObjectValue();

    /**
     * The meta object literal for the '<em><b>Scalar</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_OBJECT_VALUE__SCALAR = eINSTANCE.getJsonObjectValue_Scalar();

    /**
     * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_OBJECT_VALUE__COMPOSITE = eINSTANCE.getJsonObjectValue_Composite();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonCompositeValueImpl <em>Json Composite Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.JsonCompositeValueImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonCompositeValue()
     * @generated
     */
    EClass JSON_COMPOSITE_VALUE = eINSTANCE.getJsonCompositeValue();

    /**
     * The meta object literal for the '<em><b>Object Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_COMPOSITE_VALUE__OBJECT_VALUE = eINSTANCE.getJsonCompositeValue_ObjectValue();

    /**
     * The meta object literal for the '<em><b>Array Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_COMPOSITE_VALUE__ARRAY_VALUE = eINSTANCE.getJsonCompositeValue_ArrayValue();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl <em>Json Literal Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonLiteralValue()
     * @generated
     */
    EClass JSON_LITERAL_VALUE = eINSTANCE.getJsonLiteralValue();

    /**
     * The meta object literal for the '<em><b>Literal String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__LITERAL_STRING = eINSTANCE.getJsonLiteralValue_LiteralString();

    /**
     * The meta object literal for the '<em><b>Empty Object</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__EMPTY_OBJECT = eINSTANCE.getJsonLiteralValue_EmptyObject();

    /**
     * The meta object literal for the '<em><b>Empty Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__EMPTY_ARRAY = eINSTANCE.getJsonLiteralValue_EmptyArray();

    /**
     * The meta object literal for the '<em><b>Literal Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__LITERAL_NULL = eINSTANCE.getJsonLiteralValue_LiteralNull();

    /**
     * The meta object literal for the '<em><b>Number Float</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__NUMBER_FLOAT = eINSTANCE.getJsonLiteralValue_NumberFloat();

    /**
     * The meta object literal for the '<em><b>Number Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__NUMBER_INTEGER = eINSTANCE.getJsonLiteralValue_NumberInteger();

    /**
     * The meta object literal for the '<em><b>Enum Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__ENUM_TYPE = eINSTANCE.getJsonLiteralValue_EnumType();

    /**
     * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__BOOLEAN_VALUE = eINSTANCE.getJsonLiteralValue_BooleanValue();

    /**
     * The meta object literal for the '<em><b>Meta Scalar Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_LITERAL_VALUE__META_SCALAR_VALUE = eINSTANCE.getJsonLiteralValue_MetaScalarValue();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonObjectImpl <em>Json Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.JsonObjectImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonObject()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonKeyValuePairImpl <em>Json Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.JsonKeyValuePairImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonKeyValuePair()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.JsonArrayImpl <em>Json Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.JsonArrayImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonArray()
     * @generated
     */
    EClass JSON_ARRAY = eINSTANCE.getJsonArray();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JSON_ARRAY__ITEMS = eINSTANCE.getJsonArray_Items();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MobgenResourceDefinitionImpl <em>Mobgen Resource Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MobgenResourceDefinitionImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMobgenResourceDefinition()
     * @generated
     */
    EClass MOBGEN_RESOURCE_DEFINITION = eINSTANCE.getMobgenResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOBGEN_RESOURCE_DEFINITION__NAME = eINSTANCE.getMobgenResourceDefinition_Name();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.EnumInstanceImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getEnumInstance()
     * @generated
     */
    EClass ENUM_INSTANCE = eINSTANCE.getEnumInstance();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_INSTANCE__VALUES = eINSTANCE.getEnumInstance_Values();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.MapInstanceImpl <em>Map Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.MapInstanceImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getMapInstance()
     * @generated
     */
    EClass MAP_INSTANCE = eINSTANCE.getMapInstance();

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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.StringListImpl <em>String List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.StringListImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getStringList()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.NestedTypeImpl <em>Nested Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.NestedTypeImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getNestedType()
     * @generated
     */
    EClass NESTED_TYPE = eINSTANCE.getNestedType();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_TYPE__LIST = eINSTANCE.getNestedType_List();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NESTED_TYPE__STRING = eINSTANCE.getNestedType_String();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.impl.URIImpl <em>URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.impl.URIImpl
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getURI()
     * @generated
     */
    EClass URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em><b>Url Prefix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__URL_PREFIX = eINSTANCE.getURI_UrlPrefix();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__PATH = eINSTANCE.getURI_Path();

    /**
     * The meta object literal for the '<em><b>Path Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__PATH_PARAMETERS = eINSTANCE.getURI_PathParameters();

    /**
     * The meta object literal for the '<em><b>Path Suffix</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__PATH_SUFFIX = eINSTANCE.getURI_PathSuffix();

    /**
     * The meta object literal for the '<em><b>Query</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__QUERY = eINSTANCE.getURI_Query();

    /**
     * The meta object literal for the '<em><b>Query Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__QUERY_PARAMETERS = eINSTANCE.getURI_QueryParameters();

    /**
     * The meta object literal for the '<em><b>Query Suffix</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__QUERY_SUFFIX = eINSTANCE.getURI_QuerySuffix();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.RestfulMethods <em>Methods</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.RestfulMethods
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getRestfulMethods()
     * @generated
     */
    EEnum RESTFUL_METHODS = eINSTANCE.getRestfulMethods();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.JsonMetaScalarType <em>Json Meta Scalar Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.JsonMetaScalarType
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonMetaScalarType()
     * @generated
     */
    EEnum JSON_META_SCALAR_TYPE = eINSTANCE.getJsonMetaScalarType();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.restful.JsonLiteralBoolean <em>Json Literal Boolean</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.restful.JsonLiteralBoolean
     * @see nl.sison.dsl.mobgen.restful.impl.RestfulPackageImpl#getJsonLiteralBoolean()
     * @generated
     */
    EEnum JSON_LITERAL_BOOLEAN = eINSTANCE.getJsonLiteralBoolean();

  }

} //RestfulPackage
