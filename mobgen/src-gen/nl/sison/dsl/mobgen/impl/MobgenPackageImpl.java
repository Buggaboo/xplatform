/**
 */
package nl.sison.dsl.mobgen.impl;

import nl.sison.dsl.mobgen.EnumInstance;
import nl.sison.dsl.mobgen.JsonArray;
import nl.sison.dsl.mobgen.JsonCompositeValue;
import nl.sison.dsl.mobgen.JsonKeyValuePair;
import nl.sison.dsl.mobgen.JsonLiteralValue;
import nl.sison.dsl.mobgen.JsonObject;
import nl.sison.dsl.mobgen.JsonObjectValue;
import nl.sison.dsl.mobgen.MapInstance;
import nl.sison.dsl.mobgen.Mobgen;
import nl.sison.dsl.mobgen.MobgenCallDefinition;
import nl.sison.dsl.mobgen.MobgenFactory;
import nl.sison.dsl.mobgen.MobgenHeader;
import nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair;
import nl.sison.dsl.mobgen.MobgenHeaderParameter;
import nl.sison.dsl.mobgen.MobgenJson;
import nl.sison.dsl.mobgen.MobgenPackage;
import nl.sison.dsl.mobgen.MobgenResourceDefinition;
import nl.sison.dsl.mobgen.NestedType;
import nl.sison.dsl.mobgen.Platform;
import nl.sison.dsl.mobgen.StringList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobgenPackageImpl extends EPackageImpl implements MobgenPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobgenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass platformEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobgenCallDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobgenHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobgenHeaderKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobgenHeaderParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobgenJsonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonObjectValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mobgenResourceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum jsonCompositeValueEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum jsonLiteralValueEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see nl.sison.dsl.mobgen.MobgenPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MobgenPackageImpl()
  {
    super(eNS_URI, MobgenFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MobgenPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MobgenPackage init()
  {
    if (isInited) return (MobgenPackage)EPackage.Registry.INSTANCE.getEPackage(MobgenPackage.eNS_URI);

    // Obtain or create and register package
    MobgenPackageImpl theMobgenPackage = (MobgenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MobgenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MobgenPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMobgenPackage.createPackageContents();

    // Initialize created meta-data
    theMobgenPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMobgenPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MobgenPackage.eNS_URI, theMobgenPackage);
    return theMobgenPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobgen()
  {
    return mobgenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgen_Platform()
  {
    return (EReference)mobgenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgen_Resources()
  {
    return (EReference)mobgenEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgen_Calls()
  {
    return (EReference)mobgenEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlatform()
  {
    return platformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlatform_Platforms()
  {
    return (EAttribute)platformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlatform_GenerateWhere()
  {
    return (EAttribute)platformEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobgenCallDefinition()
  {
    return mobgenCallDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobgenCallDefinition_Name()
  {
    return (EAttribute)mobgenCallDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobgenCallDefinition_Method()
  {
    return (EAttribute)mobgenCallDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenCallDefinition_Uri()
  {
    return (EReference)mobgenCallDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenCallDefinition_RequestHeaders()
  {
    return (EReference)mobgenCallDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenCallDefinition_ResponseHeaders()
  {
    return (EReference)mobgenCallDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenCallDefinition_JsonToClient()
  {
    return (EReference)mobgenCallDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenCallDefinition_JsonToServer()
  {
    return (EReference)mobgenCallDefinitionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobgenHeader()
  {
    return mobgenHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobgenHeader_Name()
  {
    return (EAttribute)mobgenHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenHeader_HeaderKeyValues()
  {
    return (EReference)mobgenHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobgenHeaderKeyValuePair()
  {
    return mobgenHeaderKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobgenHeaderKeyValuePair_Key()
  {
    return (EAttribute)mobgenHeaderKeyValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobgenHeaderKeyValuePair_Value()
  {
    return (EAttribute)mobgenHeaderKeyValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenHeaderKeyValuePair_Parameter()
  {
    return (EReference)mobgenHeaderKeyValuePairEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobgenHeaderParameter()
  {
    return mobgenHeaderParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobgenHeaderParameter_Id()
  {
    return (EAttribute)mobgenHeaderParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobgenJson()
  {
    return mobgenJsonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMobgenJson_Name()
  {
    return (EAttribute)mobgenJsonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenJson_Value()
  {
    return (EReference)mobgenJsonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonObjectValue()
  {
    return jsonObjectValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonObjectValue_Value()
  {
    return (EAttribute)jsonObjectValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonObjectValue_Composite()
  {
    return (EAttribute)jsonObjectValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonObject()
  {
    return jsonObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonObject_KeyValuePair()
  {
    return (EReference)jsonObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonKeyValuePair()
  {
    return jsonKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonKeyValuePair_Key()
  {
    return (EAttribute)jsonKeyValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonKeyValuePair_Value()
  {
    return (EReference)jsonKeyValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonArray()
  {
    return jsonArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonArray_Items()
  {
    return (EReference)jsonArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMobgenResourceDefinition()
  {
    return mobgenResourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMobgenResourceDefinition_Resources()
  {
    return (EReference)mobgenResourceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumInstance()
  {
    return enumInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumInstance_Name()
  {
    return (EAttribute)enumInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumInstance_Values()
  {
    return (EAttribute)enumInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapInstance()
  {
    return mapInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapInstance_Name()
  {
    return (EAttribute)mapInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMapInstance_Keys()
  {
    return (EAttribute)mapInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapInstance_Values()
  {
    return (EReference)mapInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringList()
  {
    return stringListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringList_Values()
  {
    return (EAttribute)stringListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNestedType()
  {
    return nestedTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNestedType_List()
  {
    return (EReference)nestedTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNestedType_String()
  {
    return (EAttribute)nestedTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURI()
  {
    return uriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_UrlPrefix()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_Path()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_PathParameters()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_PathSuffix()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_Query()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_QueryParameters()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_QuerySuffix()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getJsonCompositeValue()
  {
    return jsonCompositeValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getJsonLiteralValue()
  {
    return jsonLiteralValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenFactory getMobgenFactory()
  {
    return (MobgenFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mobgenEClass = createEClass(MOBGEN);
    createEReference(mobgenEClass, MOBGEN__PLATFORM);
    createEReference(mobgenEClass, MOBGEN__RESOURCES);
    createEReference(mobgenEClass, MOBGEN__CALLS);

    platformEClass = createEClass(PLATFORM);
    createEAttribute(platformEClass, PLATFORM__PLATFORMS);
    createEAttribute(platformEClass, PLATFORM__GENERATE_WHERE);

    mobgenCallDefinitionEClass = createEClass(MOBGEN_CALL_DEFINITION);
    createEAttribute(mobgenCallDefinitionEClass, MOBGEN_CALL_DEFINITION__NAME);
    createEAttribute(mobgenCallDefinitionEClass, MOBGEN_CALL_DEFINITION__METHOD);
    createEReference(mobgenCallDefinitionEClass, MOBGEN_CALL_DEFINITION__URI);
    createEReference(mobgenCallDefinitionEClass, MOBGEN_CALL_DEFINITION__REQUEST_HEADERS);
    createEReference(mobgenCallDefinitionEClass, MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS);
    createEReference(mobgenCallDefinitionEClass, MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT);
    createEReference(mobgenCallDefinitionEClass, MOBGEN_CALL_DEFINITION__JSON_TO_SERVER);

    mobgenHeaderEClass = createEClass(MOBGEN_HEADER);
    createEAttribute(mobgenHeaderEClass, MOBGEN_HEADER__NAME);
    createEReference(mobgenHeaderEClass, MOBGEN_HEADER__HEADER_KEY_VALUES);

    mobgenHeaderKeyValuePairEClass = createEClass(MOBGEN_HEADER_KEY_VALUE_PAIR);
    createEAttribute(mobgenHeaderKeyValuePairEClass, MOBGEN_HEADER_KEY_VALUE_PAIR__KEY);
    createEAttribute(mobgenHeaderKeyValuePairEClass, MOBGEN_HEADER_KEY_VALUE_PAIR__VALUE);
    createEReference(mobgenHeaderKeyValuePairEClass, MOBGEN_HEADER_KEY_VALUE_PAIR__PARAMETER);

    mobgenHeaderParameterEClass = createEClass(MOBGEN_HEADER_PARAMETER);
    createEAttribute(mobgenHeaderParameterEClass, MOBGEN_HEADER_PARAMETER__ID);

    mobgenJsonEClass = createEClass(MOBGEN_JSON);
    createEAttribute(mobgenJsonEClass, MOBGEN_JSON__NAME);
    createEReference(mobgenJsonEClass, MOBGEN_JSON__VALUE);

    jsonObjectValueEClass = createEClass(JSON_OBJECT_VALUE);
    createEAttribute(jsonObjectValueEClass, JSON_OBJECT_VALUE__VALUE);
    createEAttribute(jsonObjectValueEClass, JSON_OBJECT_VALUE__COMPOSITE);

    jsonObjectEClass = createEClass(JSON_OBJECT);
    createEReference(jsonObjectEClass, JSON_OBJECT__KEY_VALUE_PAIR);

    jsonKeyValuePairEClass = createEClass(JSON_KEY_VALUE_PAIR);
    createEAttribute(jsonKeyValuePairEClass, JSON_KEY_VALUE_PAIR__KEY);
    createEReference(jsonKeyValuePairEClass, JSON_KEY_VALUE_PAIR__VALUE);

    jsonArrayEClass = createEClass(JSON_ARRAY);
    createEReference(jsonArrayEClass, JSON_ARRAY__ITEMS);

    mobgenResourceDefinitionEClass = createEClass(MOBGEN_RESOURCE_DEFINITION);
    createEReference(mobgenResourceDefinitionEClass, MOBGEN_RESOURCE_DEFINITION__RESOURCES);

    enumInstanceEClass = createEClass(ENUM_INSTANCE);
    createEAttribute(enumInstanceEClass, ENUM_INSTANCE__NAME);
    createEAttribute(enumInstanceEClass, ENUM_INSTANCE__VALUES);

    mapInstanceEClass = createEClass(MAP_INSTANCE);
    createEAttribute(mapInstanceEClass, MAP_INSTANCE__NAME);
    createEAttribute(mapInstanceEClass, MAP_INSTANCE__KEYS);
    createEReference(mapInstanceEClass, MAP_INSTANCE__VALUES);

    stringListEClass = createEClass(STRING_LIST);
    createEAttribute(stringListEClass, STRING_LIST__VALUES);

    nestedTypeEClass = createEClass(NESTED_TYPE);
    createEReference(nestedTypeEClass, NESTED_TYPE__LIST);
    createEAttribute(nestedTypeEClass, NESTED_TYPE__STRING);

    uriEClass = createEClass(URI);
    createEAttribute(uriEClass, URI__URL_PREFIX);
    createEAttribute(uriEClass, URI__PATH);
    createEAttribute(uriEClass, URI__PATH_PARAMETERS);
    createEAttribute(uriEClass, URI__PATH_SUFFIX);
    createEAttribute(uriEClass, URI__QUERY);
    createEAttribute(uriEClass, URI__QUERY_PARAMETERS);
    createEAttribute(uriEClass, URI__QUERY_SUFFIX);

    // Create enums
    jsonCompositeValueEEnum = createEEnum(JSON_COMPOSITE_VALUE);
    jsonLiteralValueEEnum = createEEnum(JSON_LITERAL_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    enumInstanceEClass.getESuperTypes().add(this.getMobgenResourceDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(mobgenEClass, Mobgen.class, "Mobgen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMobgen_Platform(), this.getPlatform(), null, "platform", null, 0, 1, Mobgen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgen_Resources(), this.getMobgenResourceDefinition(), null, "resources", null, 0, -1, Mobgen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgen_Calls(), this.getMobgenCallDefinition(), null, "calls", null, 0, -1, Mobgen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlatform_Platforms(), ecorePackage.getEString(), "platforms", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlatform_GenerateWhere(), ecorePackage.getEString(), "generateWhere", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mobgenCallDefinitionEClass, MobgenCallDefinition.class, "MobgenCallDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMobgenCallDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobgenCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMobgenCallDefinition_Method(), ecorePackage.getEString(), "method", null, 0, 1, MobgenCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenCallDefinition_Uri(), this.getURI(), null, "uri", null, 0, 1, MobgenCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenCallDefinition_RequestHeaders(), this.getMobgenHeader(), null, "requestHeaders", null, 0, 1, MobgenCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenCallDefinition_ResponseHeaders(), this.getMobgenHeader(), null, "responseHeaders", null, 0, 1, MobgenCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenCallDefinition_JsonToClient(), this.getMobgenJson(), null, "jsonToClient", null, 0, 1, MobgenCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenCallDefinition_JsonToServer(), this.getMobgenJson(), null, "jsonToServer", null, 0, 1, MobgenCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mobgenHeaderEClass, MobgenHeader.class, "MobgenHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMobgenHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobgenHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenHeader_HeaderKeyValues(), this.getMobgenHeaderKeyValuePair(), null, "headerKeyValues", null, 0, -1, MobgenHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mobgenHeaderKeyValuePairEClass, MobgenHeaderKeyValuePair.class, "MobgenHeaderKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMobgenHeaderKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, MobgenHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMobgenHeaderKeyValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, MobgenHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenHeaderKeyValuePair_Parameter(), this.getMobgenHeaderParameter(), null, "parameter", null, 0, 1, MobgenHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mobgenHeaderParameterEClass, MobgenHeaderParameter.class, "MobgenHeaderParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMobgenHeaderParameter_Id(), ecorePackage.getEString(), "id", null, 0, 1, MobgenHeaderParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mobgenJsonEClass, MobgenJson.class, "MobgenJson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMobgenJson_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobgenJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMobgenJson_Value(), this.getJsonObjectValue(), null, "value", null, 0, 1, MobgenJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonObjectValueEClass, JsonObjectValue.class, "JsonObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonObjectValue_Value(), this.getJsonLiteralValue(), "value", null, 0, 1, JsonObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJsonObjectValue_Composite(), this.getJsonCompositeValue(), "composite", null, 0, 1, JsonObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonObjectEClass, JsonObject.class, "JsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonObject_KeyValuePair(), this.getJsonKeyValuePair(), null, "keyValuePair", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonKeyValuePairEClass, JsonKeyValuePair.class, "JsonKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, JsonKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonKeyValuePair_Value(), this.getJsonObjectValue(), null, "value", null, 0, 1, JsonKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonArrayEClass, JsonArray.class, "JsonArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonArray_Items(), this.getJsonObjectValue(), null, "items", null, 0, -1, JsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mobgenResourceDefinitionEClass, MobgenResourceDefinition.class, "MobgenResourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMobgenResourceDefinition_Resources(), this.getMapInstance(), null, "resources", null, 0, -1, MobgenResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumInstanceEClass, EnumInstance.class, "EnumInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumInstance_Values(), ecorePackage.getEString(), "values", null, 0, -1, EnumInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapInstanceEClass, MapInstance.class, "MapInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMapInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, MapInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMapInstance_Keys(), ecorePackage.getEString(), "keys", null, 0, -1, MapInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapInstance_Values(), this.getNestedType(), null, "values", null, 0, -1, MapInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringListEClass, StringList.class, "StringList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringList_Values(), ecorePackage.getEString(), "values", null, 0, -1, StringList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nestedTypeEClass, NestedType.class, "NestedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNestedType_List(), this.getStringList(), null, "list", null, 0, 1, NestedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNestedType_String(), ecorePackage.getEString(), "string", null, 0, 1, NestedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriEClass, nl.sison.dsl.mobgen.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURI_UrlPrefix(), ecorePackage.getEString(), "urlPrefix", null, 0, 1, nl.sison.dsl.mobgen.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURI_Path(), ecorePackage.getEString(), "path", null, 0, 1, nl.sison.dsl.mobgen.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURI_PathParameters(), ecorePackage.getEString(), "pathParameters", null, 0, -1, nl.sison.dsl.mobgen.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURI_PathSuffix(), ecorePackage.getEString(), "pathSuffix", null, 0, -1, nl.sison.dsl.mobgen.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURI_Query(), ecorePackage.getEString(), "query", null, 0, -1, nl.sison.dsl.mobgen.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURI_QueryParameters(), ecorePackage.getEString(), "queryParameters", null, 0, -1, nl.sison.dsl.mobgen.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getURI_QuerySuffix(), ecorePackage.getEString(), "querySuffix", null, 0, -1, nl.sison.dsl.mobgen.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(jsonCompositeValueEEnum, JsonCompositeValue.class, "JsonCompositeValue");
    addEEnumLiteral(jsonCompositeValueEEnum, JsonCompositeValue.JSON_OBJECT);
    addEEnumLiteral(jsonCompositeValueEEnum, JsonCompositeValue.JSON_ARRAY);

    initEEnum(jsonLiteralValueEEnum, JsonLiteralValue.class, "JsonLiteralValue");
    addEEnumLiteral(jsonLiteralValueEEnum, JsonLiteralValue.STRING);
    addEEnumLiteral(jsonLiteralValueEEnum, JsonLiteralValue.EMPTY_JSON_OBJECT);
    addEEnumLiteral(jsonLiteralValueEEnum, JsonLiteralValue.EMPTY_JSON_ARRAY);
    addEEnumLiteral(jsonLiteralValueEEnum, JsonLiteralValue.JSON_LITERAL_BOOLEAN);
    addEEnumLiteral(jsonLiteralValueEEnum, JsonLiteralValue.JSON_LITERAL_NULL);
    addEEnumLiteral(jsonLiteralValueEEnum, JsonLiteralValue.JSON_NUMBER);
    addEEnumLiteral(jsonLiteralValueEEnum, JsonLiteralValue.JSON_META_SCALAR_TYPE);

    // Create resource
    createResource(eNS_URI);
  }

} //MobgenPackageImpl
