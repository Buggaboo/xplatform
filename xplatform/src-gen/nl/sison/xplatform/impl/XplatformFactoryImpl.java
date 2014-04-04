/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XplatformFactoryImpl extends EFactoryImpl implements XplatformFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XplatformFactory init()
  {
    try
    {
      XplatformFactory theXplatformFactory = (XplatformFactory)EPackage.Registry.INSTANCE.getEFactory(XplatformPackage.eNS_URI);
      if (theXplatformFactory != null)
      {
        return theXplatformFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XplatformFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XplatformPackage.XPLATFORM: return createXplatform();
      case XplatformPackage.PLATFORM: return createPlatform();
      case XplatformPackage.XPLATFORM_CALL_DEFINITION: return createXplatformCallDefinition();
      case XplatformPackage.URI: return createURI();
      case XplatformPackage.XPLATFORM_HEADER: return createXplatformHeader();
      case XplatformPackage.XPLATFORM_HEADER_KEY_VALUE_PAIR: return createXplatformHeaderKeyValuePair();
      case XplatformPackage.XPLATFORM_JSON: return createXplatformJson();
      case XplatformPackage.JSON_OBJECT_VALUE: return createJsonObjectValue();
      case XplatformPackage.JSON_OBJECT: return createJsonObject();
      case XplatformPackage.JSON_KEY_VALUE_PAIR: return createJsonKeyValuePair();
      case XplatformPackage.JSON_ARRAY: return createJsonArray();
      case XplatformPackage.XPLATFORM_RESOURCE_DEFINITION: return createXplatformResourceDefinition();
      case XplatformPackage.ENUM_INSTANCE: return createEnumInstance();
      case XplatformPackage.MAP_INSTANCE: return createMapInstance();
      case XplatformPackage.STRING_LIST: return createStringList();
      case XplatformPackage.NESTED_TYPE: return createNestedType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Xplatform createXplatform()
  {
    XplatformImpl xplatform = new XplatformImpl();
    return xplatform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Platform createPlatform()
  {
    PlatformImpl platform = new PlatformImpl();
    return platform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformCallDefinition createXplatformCallDefinition()
  {
    XplatformCallDefinitionImpl xplatformCallDefinition = new XplatformCallDefinitionImpl();
    return xplatformCallDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI createURI()
  {
    URIImpl uri = new URIImpl();
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformHeader createXplatformHeader()
  {
    XplatformHeaderImpl xplatformHeader = new XplatformHeaderImpl();
    return xplatformHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformHeaderKeyValuePair createXplatformHeaderKeyValuePair()
  {
    XplatformHeaderKeyValuePairImpl xplatformHeaderKeyValuePair = new XplatformHeaderKeyValuePairImpl();
    return xplatformHeaderKeyValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformJson createXplatformJson()
  {
    XplatformJsonImpl xplatformJson = new XplatformJsonImpl();
    return xplatformJson;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObjectValue createJsonObjectValue()
  {
    JsonObjectValueImpl jsonObjectValue = new JsonObjectValueImpl();
    return jsonObjectValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject createJsonObject()
  {
    JsonObjectImpl jsonObject = new JsonObjectImpl();
    return jsonObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonKeyValuePair createJsonKeyValuePair()
  {
    JsonKeyValuePairImpl jsonKeyValuePair = new JsonKeyValuePairImpl();
    return jsonKeyValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonArray createJsonArray()
  {
    JsonArrayImpl jsonArray = new JsonArrayImpl();
    return jsonArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformResourceDefinition createXplatformResourceDefinition()
  {
    XplatformResourceDefinitionImpl xplatformResourceDefinition = new XplatformResourceDefinitionImpl();
    return xplatformResourceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumInstance createEnumInstance()
  {
    EnumInstanceImpl enumInstance = new EnumInstanceImpl();
    return enumInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapInstance createMapInstance()
  {
    MapInstanceImpl mapInstance = new MapInstanceImpl();
    return mapInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringList createStringList()
  {
    StringListImpl stringList = new StringListImpl();
    return stringList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedType createNestedType()
  {
    NestedTypeImpl nestedType = new NestedTypeImpl();
    return nestedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformPackage getXplatformPackage()
  {
    return (XplatformPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XplatformPackage getPackage()
  {
    return XplatformPackage.eINSTANCE;
  }

} //XplatformFactoryImpl
