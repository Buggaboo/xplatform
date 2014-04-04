/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.EnumInstance;
import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonCompositeType;
import nl.sison.xplatform.JsonMetaArray;
import nl.sison.xplatform.JsonMetaType;
import nl.sison.xplatform.JsonObject;
import nl.sison.xplatform.JsonScalarType;
import nl.sison.xplatform.JsonType;
import nl.sison.xplatform.MapInstance;
import nl.sison.xplatform.NestedType;
import nl.sison.xplatform.Platform;
import nl.sison.xplatform.StringList;
import nl.sison.xplatform.Xplatform;
import nl.sison.xplatform.XplatformCallDefinition;
import nl.sison.xplatform.XplatformFactory;
import nl.sison.xplatform.XplatformHeader;
import nl.sison.xplatform.XplatformHeaderKeyValuePair;
import nl.sison.xplatform.XplatformJson;
import nl.sison.xplatform.XplatformPackage;
import nl.sison.xplatform.XplatformResourceDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XplatformPackageImpl extends EPackageImpl implements XplatformPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xplatformEClass = null;

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
  private EClass xplatformCallDefinitionEClass = null;

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
  private EClass xplatformHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xplatformHeaderKeyValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xplatformJsonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonMetaArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonMetaTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonCompositeTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonScalarTypeEClass = null;

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
  private EClass jsonObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xplatformResourceDefinitionEClass = null;

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
   * @see nl.sison.xplatform.XplatformPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private XplatformPackageImpl()
  {
    super(eNS_URI, XplatformFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link XplatformPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static XplatformPackage init()
  {
    if (isInited) return (XplatformPackage)EPackage.Registry.INSTANCE.getEPackage(XplatformPackage.eNS_URI);

    // Obtain or create and register package
    XplatformPackageImpl theXplatformPackage = (XplatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XplatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XplatformPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theXplatformPackage.createPackageContents();

    // Initialize created meta-data
    theXplatformPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theXplatformPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(XplatformPackage.eNS_URI, theXplatformPackage);
    return theXplatformPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXplatform()
  {
    return xplatformEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatform_Platform()
  {
    return (EReference)xplatformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatform_Resources()
  {
    return (EReference)xplatformEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatform_Calls()
  {
    return (EReference)xplatformEClass.getEStructuralFeatures().get(2);
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
  public EAttribute getPlatform_WhereToGenerate()
  {
    return (EAttribute)platformEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXplatformCallDefinition()
  {
    return xplatformCallDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatformCallDefinition_Name()
  {
    return (EAttribute)xplatformCallDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatformCallDefinition_Method()
  {
    return (EAttribute)xplatformCallDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformCallDefinition_Uri()
  {
    return (EReference)xplatformCallDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformCallDefinition_RequestHeaders()
  {
    return (EReference)xplatformCallDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformCallDefinition_ResponseHeaders()
  {
    return (EReference)xplatformCallDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformCallDefinition_JsonToClient()
  {
    return (EReference)xplatformCallDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformCallDefinition_JsonToServer()
  {
    return (EReference)xplatformCallDefinitionEClass.getEStructuralFeatures().get(6);
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
  public EAttribute getURI_UriParameters()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXplatformHeader()
  {
    return xplatformHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatformHeader_Name()
  {
    return (EAttribute)xplatformHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformHeader_HeaderKeyValues()
  {
    return (EReference)xplatformHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXplatformHeaderKeyValuePair()
  {
    return xplatformHeaderKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatformHeaderKeyValuePair_Key()
  {
    return (EAttribute)xplatformHeaderKeyValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatformHeaderKeyValuePair_Value()
  {
    return (EAttribute)xplatformHeaderKeyValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXplatformJson()
  {
    return xplatformJsonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatformJson_Name()
  {
    return (EAttribute)xplatformJsonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformJson_Type()
  {
    return (EReference)xplatformJsonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformJson_MetaType()
  {
    return (EReference)xplatformJsonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformJson_Composite()
  {
    return (EReference)xplatformJsonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonMetaArray()
  {
    return jsonMetaArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonMetaArray_MetaType()
  {
    return (EReference)jsonMetaArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonMetaType()
  {
    return jsonMetaTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonMetaType_Scalar()
  {
    return (EAttribute)jsonMetaTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonMetaType_Composite()
  {
    return (EReference)jsonMetaTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonCompositeType()
  {
    return jsonCompositeTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonCompositeType_Composite()
  {
    return (EReference)jsonCompositeTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonType()
  {
    return jsonTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonType_Scalar()
  {
    return (EReference)jsonTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonType_Composite()
  {
    return (EReference)jsonTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJsonScalarType()
  {
    return jsonScalarTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonScalarType_Bool()
  {
    return (EAttribute)jsonScalarTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonScalarType_String()
  {
    return (EAttribute)jsonScalarTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonScalarType_Number()
  {
    return (EAttribute)jsonScalarTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonScalarType_Null()
  {
    return (EAttribute)jsonScalarTypeEClass.getEStructuralFeatures().get(3);
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
  public EReference getJsonArray_Elements()
  {
    return (EReference)jsonArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonArray_Composites()
  {
    return (EReference)jsonArrayEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getJsonObject_Keys()
  {
    return (EAttribute)jsonObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonObject_Values()
  {
    return (EReference)jsonObjectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXplatformResourceDefinition()
  {
    return xplatformResourceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformResourceDefinition_Resources()
  {
    return (EReference)xplatformResourceDefinitionEClass.getEStructuralFeatures().get(0);
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
  public XplatformFactory getXplatformFactory()
  {
    return (XplatformFactory)getEFactoryInstance();
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
    xplatformEClass = createEClass(XPLATFORM);
    createEReference(xplatformEClass, XPLATFORM__PLATFORM);
    createEReference(xplatformEClass, XPLATFORM__RESOURCES);
    createEReference(xplatformEClass, XPLATFORM__CALLS);

    platformEClass = createEClass(PLATFORM);
    createEAttribute(platformEClass, PLATFORM__PLATFORMS);
    createEAttribute(platformEClass, PLATFORM__WHERE_TO_GENERATE);

    xplatformCallDefinitionEClass = createEClass(XPLATFORM_CALL_DEFINITION);
    createEAttribute(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__NAME);
    createEAttribute(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__METHOD);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__URI);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__REQUEST_HEADERS);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__RESPONSE_HEADERS);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__JSON_TO_CLIENT);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__JSON_TO_SERVER);

    uriEClass = createEClass(URI);
    createEAttribute(uriEClass, URI__URI_PARAMETERS);

    xplatformHeaderEClass = createEClass(XPLATFORM_HEADER);
    createEAttribute(xplatformHeaderEClass, XPLATFORM_HEADER__NAME);
    createEReference(xplatformHeaderEClass, XPLATFORM_HEADER__HEADER_KEY_VALUES);

    xplatformHeaderKeyValuePairEClass = createEClass(XPLATFORM_HEADER_KEY_VALUE_PAIR);
    createEAttribute(xplatformHeaderKeyValuePairEClass, XPLATFORM_HEADER_KEY_VALUE_PAIR__KEY);
    createEAttribute(xplatformHeaderKeyValuePairEClass, XPLATFORM_HEADER_KEY_VALUE_PAIR__VALUE);

    xplatformJsonEClass = createEClass(XPLATFORM_JSON);
    createEAttribute(xplatformJsonEClass, XPLATFORM_JSON__NAME);
    createEReference(xplatformJsonEClass, XPLATFORM_JSON__TYPE);
    createEReference(xplatformJsonEClass, XPLATFORM_JSON__META_TYPE);
    createEReference(xplatformJsonEClass, XPLATFORM_JSON__COMPOSITE);

    jsonMetaArrayEClass = createEClass(JSON_META_ARRAY);
    createEReference(jsonMetaArrayEClass, JSON_META_ARRAY__META_TYPE);

    jsonMetaTypeEClass = createEClass(JSON_META_TYPE);
    createEAttribute(jsonMetaTypeEClass, JSON_META_TYPE__SCALAR);
    createEReference(jsonMetaTypeEClass, JSON_META_TYPE__COMPOSITE);

    jsonCompositeTypeEClass = createEClass(JSON_COMPOSITE_TYPE);
    createEReference(jsonCompositeTypeEClass, JSON_COMPOSITE_TYPE__COMPOSITE);

    jsonTypeEClass = createEClass(JSON_TYPE);
    createEReference(jsonTypeEClass, JSON_TYPE__SCALAR);
    createEReference(jsonTypeEClass, JSON_TYPE__COMPOSITE);

    jsonScalarTypeEClass = createEClass(JSON_SCALAR_TYPE);
    createEAttribute(jsonScalarTypeEClass, JSON_SCALAR_TYPE__BOOL);
    createEAttribute(jsonScalarTypeEClass, JSON_SCALAR_TYPE__STRING);
    createEAttribute(jsonScalarTypeEClass, JSON_SCALAR_TYPE__NUMBER);
    createEAttribute(jsonScalarTypeEClass, JSON_SCALAR_TYPE__NULL);

    jsonArrayEClass = createEClass(JSON_ARRAY);
    createEReference(jsonArrayEClass, JSON_ARRAY__ELEMENTS);
    createEReference(jsonArrayEClass, JSON_ARRAY__COMPOSITES);

    jsonObjectEClass = createEClass(JSON_OBJECT);
    createEAttribute(jsonObjectEClass, JSON_OBJECT__KEYS);
    createEReference(jsonObjectEClass, JSON_OBJECT__VALUES);

    xplatformResourceDefinitionEClass = createEClass(XPLATFORM_RESOURCE_DEFINITION);
    createEReference(xplatformResourceDefinitionEClass, XPLATFORM_RESOURCE_DEFINITION__RESOURCES);

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
    stringListEClass.getESuperTypes().add(this.getNestedType());

    // Initialize classes and features; add operations and parameters
    initEClass(xplatformEClass, Xplatform.class, "Xplatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXplatform_Platform(), this.getPlatform(), null, "platform", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_Resources(), this.getXplatformResourceDefinition(), null, "resources", null, 0, -1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_Calls(), this.getXplatformCallDefinition(), null, "calls", null, 0, -1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlatform_Platforms(), ecorePackage.getEString(), "platforms", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlatform_WhereToGenerate(), ecorePackage.getEString(), "whereToGenerate", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformCallDefinitionEClass, XplatformCallDefinition.class, "XplatformCallDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformCallDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXplatformCallDefinition_Method(), ecorePackage.getEString(), "method", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_Uri(), this.getURI(), null, "uri", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_RequestHeaders(), this.getXplatformHeader(), null, "requestHeaders", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_ResponseHeaders(), this.getXplatformHeader(), null, "responseHeaders", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_JsonToClient(), this.getXplatformJson(), null, "jsonToClient", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_JsonToServer(), this.getXplatformJson(), null, "jsonToServer", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriEClass, nl.sison.xplatform.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURI_UriParameters(), ecorePackage.getEString(), "uriParameters", null, 0, -1, nl.sison.xplatform.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformHeaderEClass, XplatformHeader.class, "XplatformHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, XplatformHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformHeader_HeaderKeyValues(), this.getXplatformHeaderKeyValuePair(), null, "headerKeyValues", null, 0, -1, XplatformHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformHeaderKeyValuePairEClass, XplatformHeaderKeyValuePair.class, "XplatformHeaderKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformHeaderKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, XplatformHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXplatformHeaderKeyValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, XplatformHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformJsonEClass, XplatformJson.class, "XplatformJson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformJson_Name(), ecorePackage.getEString(), "name", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformJson_Type(), this.getJsonType(), null, "type", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformJson_MetaType(), this.getJsonMetaType(), null, "metaType", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformJson_Composite(), this.getJsonObject(), null, "composite", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonMetaArrayEClass, JsonMetaArray.class, "JsonMetaArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonMetaArray_MetaType(), this.getJsonMetaType(), null, "metaType", null, 0, 1, JsonMetaArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonMetaTypeEClass, JsonMetaType.class, "JsonMetaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonMetaType_Scalar(), ecorePackage.getEString(), "scalar", null, 0, 1, JsonMetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonMetaType_Composite(), this.getJsonMetaArray(), null, "composite", null, 0, 1, JsonMetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonCompositeTypeEClass, JsonCompositeType.class, "JsonCompositeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonCompositeType_Composite(), this.getJsonArray(), null, "composite", null, 0, 1, JsonCompositeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonTypeEClass, JsonType.class, "JsonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonType_Scalar(), this.getJsonScalarType(), null, "scalar", null, 0, 1, JsonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonType_Composite(), this.getJsonCompositeType(), null, "composite", null, 0, 1, JsonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonScalarTypeEClass, JsonScalarType.class, "JsonScalarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonScalarType_Bool(), ecorePackage.getEString(), "bool", null, 0, 1, JsonScalarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJsonScalarType_String(), ecorePackage.getEString(), "string", null, 0, 1, JsonScalarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJsonScalarType_Number(), ecorePackage.getEInt(), "number", null, 0, 1, JsonScalarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJsonScalarType_Null(), ecorePackage.getEString(), "null", null, 0, 1, JsonScalarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonArrayEClass, JsonArray.class, "JsonArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonArray_Elements(), this.getJsonScalarType(), null, "elements", null, 0, -1, JsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonArray_Composites(), this.getJsonCompositeType(), null, "composites", null, 0, -1, JsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonObjectEClass, JsonObject.class, "JsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonObject_Keys(), ecorePackage.getEString(), "keys", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonObject_Values(), this.getXplatformJson(), null, "values", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformResourceDefinitionEClass, XplatformResourceDefinition.class, "XplatformResourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXplatformResourceDefinition_Resources(), ecorePackage.getEObject(), null, "resources", null, 0, -1, XplatformResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    // Create resource
    createResource(eNS_URI);
  }

} //XplatformPackageImpl
