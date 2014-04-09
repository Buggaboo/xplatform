/**
 */
package nl.sison.dsl.mobgen.impl;

import nl.sison.dsl.mobgen.*;

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
public class MobgenFactoryImpl extends EFactoryImpl implements MobgenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MobgenFactory init()
  {
    try
    {
      MobgenFactory theMobgenFactory = (MobgenFactory)EPackage.Registry.INSTANCE.getEFactory(MobgenPackage.eNS_URI);
      if (theMobgenFactory != null)
      {
        return theMobgenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MobgenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenFactoryImpl()
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
      case MobgenPackage.MOBGEN: return createMobgen();
      case MobgenPackage.PLATFORM: return createPlatform();
      case MobgenPackage.MOBGEN_CALL_DEFINITION: return createMobgenCallDefinition();
      case MobgenPackage.URI: return createURI();
      case MobgenPackage.MOBGEN_HEADER: return createMobgenHeader();
      case MobgenPackage.MOBGEN_HEADER_KEY_VALUE_PAIR: return createMobgenHeaderKeyValuePair();
      case MobgenPackage.MOBGEN_HEADER_PARAMETER: return createMobgenHeaderParameter();
      case MobgenPackage.MOBGEN_JSON: return createMobgenJson();
      case MobgenPackage.JSON_OBJECT_VALUE: return createJsonObjectValue();
      case MobgenPackage.JSON_COMPOSITE_VALUE: return createJsonCompositeValue();
      case MobgenPackage.JSON_OBJECT: return createJsonObject();
      case MobgenPackage.JSON_KEY_VALUE_PAIR: return createJsonKeyValuePair();
      case MobgenPackage.JSON_ARRAY: return createJsonArray();
      case MobgenPackage.MOBGEN_RESOURCE_DEFINITION: return createMobgenResourceDefinition();
      case MobgenPackage.ENUM_INSTANCE: return createEnumInstance();
      case MobgenPackage.MAP_INSTANCE: return createMapInstance();
      case MobgenPackage.STRING_LIST: return createStringList();
      case MobgenPackage.NESTED_TYPE: return createNestedType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public MobgenPackage getMobgenPackage()
  {
    return (MobgenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MobgenPackage getPackage()
  {
    return MobgenPackage.eINSTANCE;
  }

} //MobgenFactoryImpl
