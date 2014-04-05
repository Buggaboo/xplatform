/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.EnumInstance;
import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonCompositeValue;
import nl.sison.xplatform.JsonKeyValuePair;
import nl.sison.xplatform.JsonObject;
import nl.sison.xplatform.JsonObjectValue;
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
  private EClass jsonObjectValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonCompositeValueEClass = null;

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
  public EAttribute getPlatform_GenerateWhere()
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
  public EAttribute getURI_Parameters()
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
  public EReference getXplatformJson_Value()
  {
    return (EReference)xplatformJsonEClass.getEStructuralFeatures().get(1);
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
  public EClass getJsonCompositeValue()
  {
    return jsonCompositeValueEClass;
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
    createEAttribute(platformEClass, PLATFORM__GENERATE_WHERE);

    xplatformCallDefinitionEClass = createEClass(XPLATFORM_CALL_DEFINITION);
    createEAttribute(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__NAME);
    createEAttribute(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__METHOD);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__URI);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__REQUEST_HEADERS);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__RESPONSE_HEADERS);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__JSON_TO_CLIENT);
    createEReference(xplatformCallDefinitionEClass, XPLATFORM_CALL_DEFINITION__JSON_TO_SERVER);

    uriEClass = createEClass(URI);
    createEAttribute(uriEClass, URI__PARAMETERS);

    xplatformHeaderEClass = createEClass(XPLATFORM_HEADER);
    createEAttribute(xplatformHeaderEClass, XPLATFORM_HEADER__NAME);
    createEReference(xplatformHeaderEClass, XPLATFORM_HEADER__HEADER_KEY_VALUES);

    xplatformHeaderKeyValuePairEClass = createEClass(XPLATFORM_HEADER_KEY_VALUE_PAIR);
    createEAttribute(xplatformHeaderKeyValuePairEClass, XPLATFORM_HEADER_KEY_VALUE_PAIR__KEY);
    createEAttribute(xplatformHeaderKeyValuePairEClass, XPLATFORM_HEADER_KEY_VALUE_PAIR__VALUE);

    xplatformJsonEClass = createEClass(XPLATFORM_JSON);
    createEAttribute(xplatformJsonEClass, XPLATFORM_JSON__NAME);
    createEReference(xplatformJsonEClass, XPLATFORM_JSON__VALUE);

    jsonObjectValueEClass = createEClass(JSON_OBJECT_VALUE);
    createEAttribute(jsonObjectValueEClass, JSON_OBJECT_VALUE__VALUE);

    jsonCompositeValueEClass = createEClass(JSON_COMPOSITE_VALUE);

    jsonObjectEClass = createEClass(JSON_OBJECT);
    createEReference(jsonObjectEClass, JSON_OBJECT__KEY_VALUE_PAIR);

    jsonKeyValuePairEClass = createEClass(JSON_KEY_VALUE_PAIR);
    createEAttribute(jsonKeyValuePairEClass, JSON_KEY_VALUE_PAIR__KEY);
    createEReference(jsonKeyValuePairEClass, JSON_KEY_VALUE_PAIR__VALUE);

    jsonArrayEClass = createEClass(JSON_ARRAY);
    createEReference(jsonArrayEClass, JSON_ARRAY__ITEMS);

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
    jsonCompositeValueEClass.getESuperTypes().add(this.getJsonObjectValue());
    jsonObjectEClass.getESuperTypes().add(this.getJsonCompositeValue());
    jsonArrayEClass.getESuperTypes().add(this.getJsonCompositeValue());
    enumInstanceEClass.getESuperTypes().add(this.getXplatformResourceDefinition());
    stringListEClass.getESuperTypes().add(this.getNestedType());

    // Initialize classes and features; add operations and parameters
    initEClass(xplatformEClass, Xplatform.class, "Xplatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXplatform_Platform(), this.getPlatform(), null, "platform", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_Resources(), this.getXplatformResourceDefinition(), null, "resources", null, 0, -1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_Calls(), this.getXplatformCallDefinition(), null, "calls", null, 0, -1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(platformEClass, Platform.class, "Platform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlatform_Platforms(), ecorePackage.getEString(), "platforms", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPlatform_GenerateWhere(), ecorePackage.getEString(), "generateWhere", null, 0, -1, Platform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformCallDefinitionEClass, XplatformCallDefinition.class, "XplatformCallDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformCallDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXplatformCallDefinition_Method(), ecorePackage.getEString(), "method", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_Uri(), this.getURI(), null, "uri", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_RequestHeaders(), this.getXplatformHeader(), null, "requestHeaders", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_ResponseHeaders(), this.getXplatformHeader(), null, "responseHeaders", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_JsonToClient(), this.getXplatformJson(), null, "jsonToClient", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformCallDefinition_JsonToServer(), this.getXplatformJson(), null, "jsonToServer", null, 0, 1, XplatformCallDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriEClass, nl.sison.xplatform.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURI_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, nl.sison.xplatform.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformHeaderEClass, XplatformHeader.class, "XplatformHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformHeader_Name(), ecorePackage.getEString(), "name", null, 0, 1, XplatformHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformHeader_HeaderKeyValues(), this.getXplatformHeaderKeyValuePair(), null, "headerKeyValues", null, 0, -1, XplatformHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformHeaderKeyValuePairEClass, XplatformHeaderKeyValuePair.class, "XplatformHeaderKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformHeaderKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, XplatformHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXplatformHeaderKeyValuePair_Value(), ecorePackage.getEString(), "value", null, 0, 1, XplatformHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformJsonEClass, XplatformJson.class, "XplatformJson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformJson_Name(), ecorePackage.getEString(), "name", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformJson_Value(), this.getJsonObjectValue(), null, "value", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonObjectValueEClass, JsonObjectValue.class, "JsonObjectValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonObjectValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, JsonObjectValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonCompositeValueEClass, JsonCompositeValue.class, "JsonCompositeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jsonObjectEClass, JsonObject.class, "JsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonObject_KeyValuePair(), this.getJsonKeyValuePair(), null, "keyValuePair", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonKeyValuePairEClass, JsonKeyValuePair.class, "JsonKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, JsonKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonKeyValuePair_Value(), this.getJsonObjectValue(), null, "value", null, 0, 1, JsonKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonArrayEClass, JsonArray.class, "JsonArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonArray_Items(), this.getJsonObjectValue(), null, "items", null, 0, -1, JsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformResourceDefinitionEClass, XplatformResourceDefinition.class, "XplatformResourceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXplatformResourceDefinition_Resources(), this.getMapInstance(), null, "resources", null, 0, -1, XplatformResourceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
