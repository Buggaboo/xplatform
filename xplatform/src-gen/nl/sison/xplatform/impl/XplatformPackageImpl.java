/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonKeyValuePair;
import nl.sison.xplatform.JsonMetaArray;
import nl.sison.xplatform.JsonMetaKeyValuePair;
import nl.sison.xplatform.JsonMetaType;
import nl.sison.xplatform.JsonObject;
import nl.sison.xplatform.JsonType;
import nl.sison.xplatform.Xplatform;
import nl.sison.xplatform.XplatformFactory;
import nl.sison.xplatform.XplatformHeader;
import nl.sison.xplatform.XplatformHeaderKeyValuePair;
import nl.sison.xplatform.XplatformJson;
import nl.sison.xplatform.XplatformPackage;

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
  private EClass xplatformJsonEClass = null;

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
  private EClass jsonMetaTypeEClass = null;

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
  private EClass jsonArrayEClass = null;

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
  private EClass jsonObjectEClass = null;

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
  private EClass jsonMetaKeyValuePairEClass = null;

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
  public EAttribute getXplatform_Name()
  {
    return (EAttribute)xplatformEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatform_Method()
  {
    return (EAttribute)xplatformEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXplatform_UriPathParams()
  {
    return (EAttribute)xplatformEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatform_RequestHeaders()
  {
    return (EReference)xplatformEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatform_ResponseHeaders()
  {
    return (EReference)xplatformEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatform_JsonToClient()
  {
    return (EReference)xplatformEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatform_JsonToServer()
  {
    return (EReference)xplatformEClass.getEStructuralFeatures().get(6);
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
  public EReference getXplatformJson_Type()
  {
    return (EReference)xplatformJsonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXplatformJson_MetaType()
  {
    return (EReference)xplatformJsonEClass.getEStructuralFeatures().get(1);
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
  public EReference getXplatformHeader_HeaderKeyValues()
  {
    return (EReference)xplatformHeaderEClass.getEStructuralFeatures().get(0);
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
  public EClass getJsonMetaType()
  {
    return jsonMetaTypeEClass;
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
  public EClass getJsonArray()
  {
    return jsonArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonArray_Type()
  {
    return (EReference)jsonArrayEClass.getEStructuralFeatures().get(0);
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
  public EReference getJsonObject_MetaKeyValuePair()
  {
    return (EReference)jsonObjectEClass.getEStructuralFeatures().get(1);
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
  public EClass getJsonMetaKeyValuePair()
  {
    return jsonMetaKeyValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJsonMetaKeyValuePair_MetaKey()
  {
    return (EAttribute)jsonMetaKeyValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJsonMetaKeyValuePair_MetaValue()
  {
    return (EReference)jsonMetaKeyValuePairEClass.getEStructuralFeatures().get(1);
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
    createEAttribute(xplatformEClass, XPLATFORM__NAME);
    createEAttribute(xplatformEClass, XPLATFORM__METHOD);
    createEAttribute(xplatformEClass, XPLATFORM__URI_PATH_PARAMS);
    createEReference(xplatformEClass, XPLATFORM__REQUEST_HEADERS);
    createEReference(xplatformEClass, XPLATFORM__RESPONSE_HEADERS);
    createEReference(xplatformEClass, XPLATFORM__JSON_TO_CLIENT);
    createEReference(xplatformEClass, XPLATFORM__JSON_TO_SERVER);

    xplatformJsonEClass = createEClass(XPLATFORM_JSON);
    createEReference(xplatformJsonEClass, XPLATFORM_JSON__TYPE);
    createEReference(xplatformJsonEClass, XPLATFORM_JSON__META_TYPE);

    xplatformHeaderEClass = createEClass(XPLATFORM_HEADER);
    createEReference(xplatformHeaderEClass, XPLATFORM_HEADER__HEADER_KEY_VALUES);

    xplatformHeaderKeyValuePairEClass = createEClass(XPLATFORM_HEADER_KEY_VALUE_PAIR);
    createEAttribute(xplatformHeaderKeyValuePairEClass, XPLATFORM_HEADER_KEY_VALUE_PAIR__KEY);

    jsonMetaTypeEClass = createEClass(JSON_META_TYPE);

    jsonTypeEClass = createEClass(JSON_TYPE);

    jsonArrayEClass = createEClass(JSON_ARRAY);
    createEReference(jsonArrayEClass, JSON_ARRAY__TYPE);

    jsonKeyValuePairEClass = createEClass(JSON_KEY_VALUE_PAIR);
    createEAttribute(jsonKeyValuePairEClass, JSON_KEY_VALUE_PAIR__KEY);
    createEReference(jsonKeyValuePairEClass, JSON_KEY_VALUE_PAIR__VALUE);

    jsonObjectEClass = createEClass(JSON_OBJECT);
    createEReference(jsonObjectEClass, JSON_OBJECT__KEY_VALUE_PAIR);
    createEReference(jsonObjectEClass, JSON_OBJECT__META_KEY_VALUE_PAIR);

    jsonMetaArrayEClass = createEClass(JSON_META_ARRAY);
    createEReference(jsonMetaArrayEClass, JSON_META_ARRAY__META_TYPE);

    jsonMetaKeyValuePairEClass = createEClass(JSON_META_KEY_VALUE_PAIR);
    createEAttribute(jsonMetaKeyValuePairEClass, JSON_META_KEY_VALUE_PAIR__META_KEY);
    createEReference(jsonMetaKeyValuePairEClass, JSON_META_KEY_VALUE_PAIR__META_VALUE);
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
    jsonMetaTypeEClass.getESuperTypes().add(this.getJsonType());
    jsonArrayEClass.getESuperTypes().add(this.getJsonType());
    jsonObjectEClass.getESuperTypes().add(this.getJsonType());
    jsonMetaArrayEClass.getESuperTypes().add(this.getJsonMetaType());

    // Initialize classes and features; add operations and parameters
    initEClass(xplatformEClass, Xplatform.class, "Xplatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatform_Name(), ecorePackage.getEString(), "name", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXplatform_Method(), ecorePackage.getEString(), "method", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXplatform_UriPathParams(), ecorePackage.getEString(), "uriPathParams", null, 0, -1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_RequestHeaders(), this.getXplatformHeader(), null, "requestHeaders", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_ResponseHeaders(), this.getXplatformHeader(), null, "responseHeaders", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_JsonToClient(), this.getXplatformJson(), null, "jsonToClient", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatform_JsonToServer(), this.getXplatformJson(), null, "jsonToServer", null, 0, 1, Xplatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformJsonEClass, XplatformJson.class, "XplatformJson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXplatformJson_Type(), this.getJsonType(), null, "type", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXplatformJson_MetaType(), this.getJsonMetaType(), null, "metaType", null, 0, 1, XplatformJson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformHeaderEClass, XplatformHeader.class, "XplatformHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXplatformHeader_HeaderKeyValues(), this.getXplatformHeaderKeyValuePair(), null, "headerKeyValues", null, 0, -1, XplatformHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xplatformHeaderKeyValuePairEClass, XplatformHeaderKeyValuePair.class, "XplatformHeaderKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXplatformHeaderKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, XplatformHeaderKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonMetaTypeEClass, JsonMetaType.class, "JsonMetaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jsonTypeEClass, JsonType.class, "JsonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jsonArrayEClass, JsonArray.class, "JsonArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonArray_Type(), this.getJsonType(), null, "type", null, 0, -1, JsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonKeyValuePairEClass, JsonKeyValuePair.class, "JsonKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonKeyValuePair_Key(), ecorePackage.getEString(), "key", null, 0, 1, JsonKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonKeyValuePair_Value(), this.getJsonType(), null, "value", null, 0, 1, JsonKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonObjectEClass, JsonObject.class, "JsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonObject_KeyValuePair(), this.getJsonKeyValuePair(), null, "keyValuePair", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonObject_MetaKeyValuePair(), this.getJsonMetaKeyValuePair(), null, "metaKeyValuePair", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonMetaArrayEClass, JsonMetaArray.class, "JsonMetaArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonMetaArray_MetaType(), this.getJsonMetaType(), null, "metaType", null, 0, 1, JsonMetaArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonMetaKeyValuePairEClass, JsonMetaKeyValuePair.class, "JsonMetaKeyValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonMetaKeyValuePair_MetaKey(), ecorePackage.getEString(), "metaKey", null, 0, 1, JsonMetaKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonMetaKeyValuePair_MetaValue(), this.getJsonMetaType(), null, "metaValue", null, 0, 1, JsonMetaKeyValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //XplatformPackageImpl
