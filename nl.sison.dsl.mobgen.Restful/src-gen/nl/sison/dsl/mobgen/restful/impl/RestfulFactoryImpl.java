/**
 */
package nl.sison.dsl.mobgen.restful.impl;

import nl.sison.dsl.mobgen.restful.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class RestfulFactoryImpl extends EFactoryImpl implements RestfulFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestfulFactory init()
  {
    try
    {
      RestfulFactory theRestfulFactory = (RestfulFactory)EPackage.Registry.INSTANCE.getEFactory(RestfulPackage.eNS_URI);
      if (theRestfulFactory != null)
      {
        return theRestfulFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestfulFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfulFactoryImpl()
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
      case RestfulPackage.MOBGEN: return createMobgen();
      case RestfulPackage.MOBGEN_CALL_DEFINITION: return createMobgenCallDefinition();
      case RestfulPackage.MOBGEN_HEADER: return createMobgenHeader();
      case RestfulPackage.MOBGEN_HEADER_KEY_VALUE_PAIR: return createMobgenHeaderKeyValuePair();
      case RestfulPackage.MOBGEN_HEADER_PARAMETER: return createMobgenHeaderParameter();
      case RestfulPackage.MOBGEN_JSON: return createMobgenJson();
      case RestfulPackage.JSON_OBJECT_VALUE: return createJsonObjectValue();
      case RestfulPackage.JSON_COMPOSITE_VALUE: return createJsonCompositeValue();
      case RestfulPackage.JSON_LITERAL_VALUE: return createJsonLiteralValue();
      case RestfulPackage.JSON_OBJECT: return createJsonObject();
      case RestfulPackage.JSON_KEY_VALUE_PAIR: return createJsonKeyValuePair();
      case RestfulPackage.JSON_ARRAY: return createJsonArray();
      case RestfulPackage.MOBGEN_RESOURCE_DEFINITION: return createMobgenResourceDefinition();
      case RestfulPackage.ENUM_INSTANCE: return createEnumInstance();
      case RestfulPackage.MAP_INSTANCE: return createMapInstance();
      case RestfulPackage.STRING_LIST: return createStringList();
      case RestfulPackage.NESTED_TYPE: return createNestedType();
      case RestfulPackage.URI: return createURI();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RestfulPackage.RESTFUL_METHODS:
        return createRestfulMethodsFromString(eDataType, initialValue);
      case RestfulPackage.JSON_META_SCALAR_TYPE:
        return createJsonMetaScalarTypeFromString(eDataType, initialValue);
      case RestfulPackage.JSON_LITERAL_BOOLEAN:
        return createJsonLiteralBooleanFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RestfulPackage.RESTFUL_METHODS:
        return convertRestfulMethodsToString(eDataType, instanceValue);
      case RestfulPackage.JSON_META_SCALAR_TYPE:
        return convertJsonMetaScalarTypeToString(eDataType, instanceValue);
      case RestfulPackage.JSON_LITERAL_BOOLEAN:
        return convertJsonLiteralBooleanToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mobgen createMobgen()
  {
    MobgenImpl mobgen = new MobgenImpl();
    return mobgen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenCallDefinition createMobgenCallDefinition()
  {
    MobgenCallDefinitionImpl mobgenCallDefinition = new MobgenCallDefinitionImpl();
    return mobgenCallDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenHeader createMobgenHeader()
  {
    MobgenHeaderImpl mobgenHeader = new MobgenHeaderImpl();
    return mobgenHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenHeaderKeyValuePair createMobgenHeaderKeyValuePair()
  {
    MobgenHeaderKeyValuePairImpl mobgenHeaderKeyValuePair = new MobgenHeaderKeyValuePairImpl();
    return mobgenHeaderKeyValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenHeaderParameter createMobgenHeaderParameter()
  {
    MobgenHeaderParameterImpl mobgenHeaderParameter = new MobgenHeaderParameterImpl();
    return mobgenHeaderParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenJson createMobgenJson()
  {
    MobgenJsonImpl mobgenJson = new MobgenJsonImpl();
    return mobgenJson;
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
  public JsonCompositeValue createJsonCompositeValue()
  {
    JsonCompositeValueImpl jsonCompositeValue = new JsonCompositeValueImpl();
    return jsonCompositeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonLiteralValue createJsonLiteralValue()
  {
    JsonLiteralValueImpl jsonLiteralValue = new JsonLiteralValueImpl();
    return jsonLiteralValue;
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
  public MobgenResourceDefinition createMobgenResourceDefinition()
  {
    MobgenResourceDefinitionImpl mobgenResourceDefinition = new MobgenResourceDefinitionImpl();
    return mobgenResourceDefinition;
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
  public RestfulMethods createRestfulMethodsFromString(EDataType eDataType, String initialValue)
  {
    RestfulMethods result = RestfulMethods.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRestfulMethodsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonMetaScalarType createJsonMetaScalarTypeFromString(EDataType eDataType, String initialValue)
  {
    JsonMetaScalarType result = JsonMetaScalarType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonMetaScalarTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonLiteralBoolean createJsonLiteralBooleanFromString(EDataType eDataType, String initialValue)
  {
    JsonLiteralBoolean result = JsonLiteralBoolean.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertJsonLiteralBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfulPackage getRestfulPackage()
  {
    return (RestfulPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestfulPackage getPackage()
  {
    return RestfulPackage.eINSTANCE;
  }

} //RestfulFactoryImpl
