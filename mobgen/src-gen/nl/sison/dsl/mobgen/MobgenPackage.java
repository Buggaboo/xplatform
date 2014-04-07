/**
 */
package nl.sison.dsl.mobgen;

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
 * @see nl.sison.dsl.mobgen.MobgenFactory
 * @model kind="package"
 * @generated
 */
public interface MobgenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mobgen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sison.nl/dsl/Mobgen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mobgen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MobgenPackage eINSTANCE = nl.sison.dsl.mobgen.impl.MobgenPackageImpl.init();

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.MobgenImpl <em>Mobgen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.MobgenImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgen()
   * @generated
   */
  int MOBGEN = 0;

  /**
   * The feature id for the '<em><b>Platform</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN__PLATFORM = 0;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN__RESOURCES = 1;

  /**
   * The feature id for the '<em><b>Calls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN__CALLS = 2;

  /**
   * The number of structural features of the '<em>Mobgen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.PlatformImpl <em>Platform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.PlatformImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getPlatform()
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
   * The feature id for the '<em><b>Generate Where</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM__GENERATE_WHERE = 1;

  /**
   * The number of structural features of the '<em>Platform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl <em>Call Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenCallDefinition()
   * @generated
   */
  int MOBGEN_CALL_DEFINITION = 2;

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
   * The number of structural features of the '<em>Call Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_CALL_DEFINITION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.URIImpl <em>URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.URIImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getURI()
   * @generated
   */
  int URI = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__PARAMETERS = 0;

  /**
   * The number of structural features of the '<em>URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.MobgenHeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.MobgenHeaderImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenHeader()
   * @generated
   */
  int MOBGEN_HEADER = 4;

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
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.MobgenHeaderKeyValuePairImpl <em>Header Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.MobgenHeaderKeyValuePairImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenHeaderKeyValuePair()
   * @generated
   */
  int MOBGEN_HEADER_KEY_VALUE_PAIR = 5;

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
   * The number of structural features of the '<em>Header Key Value Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_HEADER_KEY_VALUE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.MobgenJsonImpl <em>Json</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.MobgenJsonImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenJson()
   * @generated
   */
  int MOBGEN_JSON = 6;

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
   * The number of structural features of the '<em>Json</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_JSON_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.JsonObjectValueImpl <em>Json Object Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.JsonObjectValueImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonObjectValue()
   * @generated
   */
  int JSON_OBJECT_VALUE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Json Object Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.JsonCompositeValueImpl <em>Json Composite Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.JsonCompositeValueImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonCompositeValue()
   * @generated
   */
  int JSON_COMPOSITE_VALUE = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPOSITE_VALUE__VALUE = JSON_OBJECT_VALUE__VALUE;

  /**
   * The number of structural features of the '<em>Json Composite Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_COMPOSITE_VALUE_FEATURE_COUNT = JSON_OBJECT_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.JsonObjectImpl <em>Json Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.JsonObjectImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonObject()
   * @generated
   */
  int JSON_OBJECT = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__VALUE = JSON_COMPOSITE_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Key Value Pair</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT__KEY_VALUE_PAIR = JSON_COMPOSITE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Json Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_OBJECT_FEATURE_COUNT = JSON_COMPOSITE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.JsonKeyValuePairImpl <em>Json Key Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.JsonKeyValuePairImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonKeyValuePair()
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
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.JsonArrayImpl <em>Json Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.JsonArrayImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonArray()
   * @generated
   */
  int JSON_ARRAY = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__VALUE = JSON_COMPOSITE_VALUE__VALUE;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY__ITEMS = JSON_COMPOSITE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Json Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JSON_ARRAY_FEATURE_COUNT = JSON_COMPOSITE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.MobgenResourceDefinitionImpl <em>Resource Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.MobgenResourceDefinitionImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenResourceDefinition()
   * @generated
   */
  int MOBGEN_RESOURCE_DEFINITION = 12;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_RESOURCE_DEFINITION__RESOURCES = 0;

  /**
   * The number of structural features of the '<em>Resource Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.EnumInstanceImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getEnumInstance()
   * @generated
   */
  int ENUM_INSTANCE = 13;

  /**
   * The feature id for the '<em><b>Resources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__RESOURCES = MOBGEN_RESOURCE_DEFINITION__RESOURCES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__NAME = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE__VALUES = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_INSTANCE_FEATURE_COUNT = MOBGEN_RESOURCE_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.MapInstanceImpl <em>Map Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.MapInstanceImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMapInstance()
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
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.NestedTypeImpl <em>Nested Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.NestedTypeImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getNestedType()
   * @generated
   */
  int NESTED_TYPE = 16;

  /**
   * The number of structural features of the '<em>Nested Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link nl.sison.dsl.mobgen.impl.StringListImpl <em>String List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nl.sison.dsl.mobgen.impl.StringListImpl
   * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getStringList()
   * @generated
   */
  int STRING_LIST = 15;

  /**
   * The feature id for the '<em><b>Items</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST__ITEMS = NESTED_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LIST_FEATURE_COUNT = NESTED_TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.Mobgen <em>Mobgen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mobgen</em>'.
   * @see nl.sison.dsl.mobgen.Mobgen
   * @generated
   */
  EClass getMobgen();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.Mobgen#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Platform</em>'.
   * @see nl.sison.dsl.mobgen.Mobgen#getPlatform()
   * @see #getMobgen()
   * @generated
   */
  EReference getMobgen_Platform();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.Mobgen#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see nl.sison.dsl.mobgen.Mobgen#getResources()
   * @see #getMobgen()
   * @generated
   */
  EReference getMobgen_Resources();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.Mobgen#getCalls <em>Calls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Calls</em>'.
   * @see nl.sison.dsl.mobgen.Mobgen#getCalls()
   * @see #getMobgen()
   * @generated
   */
  EReference getMobgen_Calls();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.Platform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform</em>'.
   * @see nl.sison.dsl.mobgen.Platform
   * @generated
   */
  EClass getPlatform();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.Platform#getPlatforms <em>Platforms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Platforms</em>'.
   * @see nl.sison.dsl.mobgen.Platform#getPlatforms()
   * @see #getPlatform()
   * @generated
   */
  EAttribute getPlatform_Platforms();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.Platform#getGenerateWhere <em>Generate Where</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Generate Where</em>'.
   * @see nl.sison.dsl.mobgen.Platform#getGenerateWhere()
   * @see #getPlatform()
   * @generated
   */
  EAttribute getPlatform_GenerateWhere();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.MobgenCallDefinition <em>Call Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Definition</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition
   * @generated
   */
  EClass getMobgenCallDefinition();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.MobgenCallDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition#getName()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EAttribute getMobgenCallDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.MobgenCallDefinition#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition#getMethod()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EAttribute getMobgenCallDefinition_Method();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.MobgenCallDefinition#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition#getUri()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_Uri();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.MobgenCallDefinition#getRequestHeaders <em>Request Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Request Headers</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition#getRequestHeaders()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_RequestHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.MobgenCallDefinition#getResponseHeaders <em>Response Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Response Headers</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition#getResponseHeaders()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_ResponseHeaders();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.MobgenCallDefinition#getJsonToClient <em>Json To Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Client</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition#getJsonToClient()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_JsonToClient();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.MobgenCallDefinition#getJsonToServer <em>Json To Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Json To Server</em>'.
   * @see nl.sison.dsl.mobgen.MobgenCallDefinition#getJsonToServer()
   * @see #getMobgenCallDefinition()
   * @generated
   */
  EReference getMobgenCallDefinition_JsonToServer();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI</em>'.
   * @see nl.sison.dsl.mobgen.URI
   * @generated
   */
  EClass getURI();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.URI#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parameters</em>'.
   * @see nl.sison.dsl.mobgen.URI#getParameters()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_Parameters();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.MobgenHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see nl.sison.dsl.mobgen.MobgenHeader
   * @generated
   */
  EClass getMobgenHeader();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.MobgenHeader#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.MobgenHeader#getName()
   * @see #getMobgenHeader()
   * @generated
   */
  EAttribute getMobgenHeader_Name();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.MobgenHeader#getHeaderKeyValues <em>Header Key Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Header Key Values</em>'.
   * @see nl.sison.dsl.mobgen.MobgenHeader#getHeaderKeyValues()
   * @see #getMobgenHeader()
   * @generated
   */
  EReference getMobgenHeader_HeaderKeyValues();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair <em>Header Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Key Value Pair</em>'.
   * @see nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair
   * @generated
   */
  EClass getMobgenHeaderKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair#getKey()
   * @see #getMobgenHeaderKeyValuePair()
   * @generated
   */
  EAttribute getMobgenHeaderKeyValuePair_Key();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair#getValue()
   * @see #getMobgenHeaderKeyValuePair()
   * @generated
   */
  EAttribute getMobgenHeaderKeyValuePair_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.MobgenJson <em>Json</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json</em>'.
   * @see nl.sison.dsl.mobgen.MobgenJson
   * @generated
   */
  EClass getMobgenJson();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.MobgenJson#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.MobgenJson#getName()
   * @see #getMobgenJson()
   * @generated
   */
  EAttribute getMobgenJson_Name();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.MobgenJson#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.MobgenJson#getValue()
   * @see #getMobgenJson()
   * @generated
   */
  EReference getMobgenJson_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.JsonObjectValue <em>Json Object Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Object Value</em>'.
   * @see nl.sison.dsl.mobgen.JsonObjectValue
   * @generated
   */
  EClass getJsonObjectValue();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.JsonObjectValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.JsonObjectValue#getValue()
   * @see #getJsonObjectValue()
   * @generated
   */
  EAttribute getJsonObjectValue_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.JsonCompositeValue <em>Json Composite Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Composite Value</em>'.
   * @see nl.sison.dsl.mobgen.JsonCompositeValue
   * @generated
   */
  EClass getJsonCompositeValue();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.JsonObject <em>Json Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Object</em>'.
   * @see nl.sison.dsl.mobgen.JsonObject
   * @generated
   */
  EClass getJsonObject();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.JsonObject#getKeyValuePair <em>Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Key Value Pair</em>'.
   * @see nl.sison.dsl.mobgen.JsonObject#getKeyValuePair()
   * @see #getJsonObject()
   * @generated
   */
  EReference getJsonObject_KeyValuePair();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.JsonKeyValuePair <em>Json Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Key Value Pair</em>'.
   * @see nl.sison.dsl.mobgen.JsonKeyValuePair
   * @generated
   */
  EClass getJsonKeyValuePair();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.JsonKeyValuePair#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see nl.sison.dsl.mobgen.JsonKeyValuePair#getKey()
   * @see #getJsonKeyValuePair()
   * @generated
   */
  EAttribute getJsonKeyValuePair_Key();

  /**
   * Returns the meta object for the containment reference '{@link nl.sison.dsl.mobgen.JsonKeyValuePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see nl.sison.dsl.mobgen.JsonKeyValuePair#getValue()
   * @see #getJsonKeyValuePair()
   * @generated
   */
  EReference getJsonKeyValuePair_Value();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.JsonArray <em>Json Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Json Array</em>'.
   * @see nl.sison.dsl.mobgen.JsonArray
   * @generated
   */
  EClass getJsonArray();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.JsonArray#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see nl.sison.dsl.mobgen.JsonArray#getItems()
   * @see #getJsonArray()
   * @generated
   */
  EReference getJsonArray_Items();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.MobgenResourceDefinition <em>Resource Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource Definition</em>'.
   * @see nl.sison.dsl.mobgen.MobgenResourceDefinition
   * @generated
   */
  EClass getMobgenResourceDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.MobgenResourceDefinition#getResources <em>Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Resources</em>'.
   * @see nl.sison.dsl.mobgen.MobgenResourceDefinition#getResources()
   * @see #getMobgenResourceDefinition()
   * @generated
   */
  EReference getMobgenResourceDefinition_Resources();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.EnumInstance <em>Enum Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Instance</em>'.
   * @see nl.sison.dsl.mobgen.EnumInstance
   * @generated
   */
  EClass getEnumInstance();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.EnumInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.EnumInstance#getName()
   * @see #getEnumInstance()
   * @generated
   */
  EAttribute getEnumInstance_Name();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.EnumInstance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see nl.sison.dsl.mobgen.EnumInstance#getValues()
   * @see #getEnumInstance()
   * @generated
   */
  EAttribute getEnumInstance_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.MapInstance <em>Map Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Instance</em>'.
   * @see nl.sison.dsl.mobgen.MapInstance
   * @generated
   */
  EClass getMapInstance();

  /**
   * Returns the meta object for the attribute '{@link nl.sison.dsl.mobgen.MapInstance#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nl.sison.dsl.mobgen.MapInstance#getName()
   * @see #getMapInstance()
   * @generated
   */
  EAttribute getMapInstance_Name();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.MapInstance#getKeys <em>Keys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Keys</em>'.
   * @see nl.sison.dsl.mobgen.MapInstance#getKeys()
   * @see #getMapInstance()
   * @generated
   */
  EAttribute getMapInstance_Keys();

  /**
   * Returns the meta object for the containment reference list '{@link nl.sison.dsl.mobgen.MapInstance#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see nl.sison.dsl.mobgen.MapInstance#getValues()
   * @see #getMapInstance()
   * @generated
   */
  EReference getMapInstance_Values();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.StringList <em>String List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String List</em>'.
   * @see nl.sison.dsl.mobgen.StringList
   * @generated
   */
  EClass getStringList();

  /**
   * Returns the meta object for the attribute list '{@link nl.sison.dsl.mobgen.StringList#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Items</em>'.
   * @see nl.sison.dsl.mobgen.StringList#getItems()
   * @see #getStringList()
   * @generated
   */
  EAttribute getStringList_Items();

  /**
   * Returns the meta object for class '{@link nl.sison.dsl.mobgen.NestedType <em>Nested Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Type</em>'.
   * @see nl.sison.dsl.mobgen.NestedType
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
  MobgenFactory getMobgenFactory();

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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.MobgenImpl <em>Mobgen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.MobgenImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgen()
     * @generated
     */
    EClass MOBGEN = eINSTANCE.getMobgen();

    /**
     * The meta object literal for the '<em><b>Platform</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN__PLATFORM = eINSTANCE.getMobgen_Platform();

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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.PlatformImpl <em>Platform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.PlatformImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getPlatform()
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
     * The meta object literal for the '<em><b>Generate Where</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM__GENERATE_WHERE = eINSTANCE.getPlatform_GenerateWhere();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl <em>Call Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenCallDefinition()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.URIImpl <em>URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.URIImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getURI()
     * @generated
     */
    EClass URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__PARAMETERS = eINSTANCE.getURI_Parameters();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.MobgenHeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.MobgenHeaderImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenHeader()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.MobgenHeaderKeyValuePairImpl <em>Header Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.MobgenHeaderKeyValuePairImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenHeaderKeyValuePair()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.MobgenJsonImpl <em>Json</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.MobgenJsonImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenJson()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.JsonObjectValueImpl <em>Json Object Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.JsonObjectValueImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonObjectValue()
     * @generated
     */
    EClass JSON_OBJECT_VALUE = eINSTANCE.getJsonObjectValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JSON_OBJECT_VALUE__VALUE = eINSTANCE.getJsonObjectValue_Value();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.JsonCompositeValueImpl <em>Json Composite Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.JsonCompositeValueImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonCompositeValue()
     * @generated
     */
    EClass JSON_COMPOSITE_VALUE = eINSTANCE.getJsonCompositeValue();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.JsonObjectImpl <em>Json Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.JsonObjectImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonObject()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.JsonKeyValuePairImpl <em>Json Key Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.JsonKeyValuePairImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonKeyValuePair()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.JsonArrayImpl <em>Json Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.JsonArrayImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getJsonArray()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.MobgenResourceDefinitionImpl <em>Resource Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.MobgenResourceDefinitionImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMobgenResourceDefinition()
     * @generated
     */
    EClass MOBGEN_RESOURCE_DEFINITION = eINSTANCE.getMobgenResourceDefinition();

    /**
     * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOBGEN_RESOURCE_DEFINITION__RESOURCES = eINSTANCE.getMobgenResourceDefinition_Resources();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.EnumInstanceImpl <em>Enum Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.EnumInstanceImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getEnumInstance()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.MapInstanceImpl <em>Map Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.MapInstanceImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getMapInstance()
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
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.StringListImpl <em>String List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.StringListImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getStringList()
     * @generated
     */
    EClass STRING_LIST = eINSTANCE.getStringList();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LIST__ITEMS = eINSTANCE.getStringList_Items();

    /**
     * The meta object literal for the '{@link nl.sison.dsl.mobgen.impl.NestedTypeImpl <em>Nested Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nl.sison.dsl.mobgen.impl.NestedTypeImpl
     * @see nl.sison.dsl.mobgen.impl.MobgenPackageImpl#getNestedType()
     * @generated
     */
    EClass NESTED_TYPE = eINSTANCE.getNestedType();

  }

} //MobgenPackage
