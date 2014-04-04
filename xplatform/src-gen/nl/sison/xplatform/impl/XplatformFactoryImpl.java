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
      case XplatformPackage.URI: return createURI();
      case XplatformPackage.XPLATFORM_HEADER: return createXplatformHeader();
      case XplatformPackage.XPLATFORM_HEADER_KEY_VALUE_PAIR: return createXplatformHeaderKeyValuePair();
      case XplatformPackage.XPLATFORM_JSON: return createXplatformJson();
      case XplatformPackage.JSON_META_ARRAY: return createJsonMetaArray();
      case XplatformPackage.JSON_META_TYPE: return createJsonMetaType();
      case XplatformPackage.JSON_COMPOSITE_TYPE: return createJsonCompositeType();
      case XplatformPackage.JSON_TYPE: return createJsonType();
      case XplatformPackage.JSON_SCALAR_TYPE: return createJsonScalarType();
      case XplatformPackage.JSON_ARRAY: return createJsonArray();
      case XplatformPackage.JSON_OBJECT: return createJsonObject();
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
  public JsonMetaArray createJsonMetaArray()
  {
    JsonMetaArrayImpl jsonMetaArray = new JsonMetaArrayImpl();
    return jsonMetaArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonMetaType createJsonMetaType()
  {
    JsonMetaTypeImpl jsonMetaType = new JsonMetaTypeImpl();
    return jsonMetaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonCompositeType createJsonCompositeType()
  {
    JsonCompositeTypeImpl jsonCompositeType = new JsonCompositeTypeImpl();
    return jsonCompositeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonType createJsonType()
  {
    JsonTypeImpl jsonType = new JsonTypeImpl();
    return jsonType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonScalarType createJsonScalarType()
  {
    JsonScalarTypeImpl jsonScalarType = new JsonScalarTypeImpl();
    return jsonScalarType;
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
