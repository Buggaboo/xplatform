/**
 */
package nl.sison.xplatform.util;

import nl.sison.xplatform.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nl.sison.xplatform.XplatformPackage
 * @generated
 */
public class XplatformSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XplatformPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XplatformPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case XplatformPackage.XPLATFORM:
      {
        Xplatform xplatform = (Xplatform)theEObject;
        T result = caseXplatform(xplatform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.PLATFORM:
      {
        Platform platform = (Platform)theEObject;
        T result = casePlatform(platform);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.XPLATFORM_CALL_DEFINITION:
      {
        XplatformCallDefinition xplatformCallDefinition = (XplatformCallDefinition)theEObject;
        T result = caseXplatformCallDefinition(xplatformCallDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.URI:
      {
        URI uri = (URI)theEObject;
        T result = caseURI(uri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.XPLATFORM_HEADER:
      {
        XplatformHeader xplatformHeader = (XplatformHeader)theEObject;
        T result = caseXplatformHeader(xplatformHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.XPLATFORM_HEADER_KEY_VALUE_PAIR:
      {
        XplatformHeaderKeyValuePair xplatformHeaderKeyValuePair = (XplatformHeaderKeyValuePair)theEObject;
        T result = caseXplatformHeaderKeyValuePair(xplatformHeaderKeyValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.XPLATFORM_JSON:
      {
        XplatformJson xplatformJson = (XplatformJson)theEObject;
        T result = caseXplatformJson(xplatformJson);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_META_ARRAY:
      {
        JsonMetaArray jsonMetaArray = (JsonMetaArray)theEObject;
        T result = caseJsonMetaArray(jsonMetaArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_META_TYPE:
      {
        JsonMetaType jsonMetaType = (JsonMetaType)theEObject;
        T result = caseJsonMetaType(jsonMetaType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_COMPOSITE_TYPE:
      {
        JsonCompositeType jsonCompositeType = (JsonCompositeType)theEObject;
        T result = caseJsonCompositeType(jsonCompositeType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_TYPE:
      {
        JsonType jsonType = (JsonType)theEObject;
        T result = caseJsonType(jsonType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_SCALAR_TYPE:
      {
        JsonScalarType jsonScalarType = (JsonScalarType)theEObject;
        T result = caseJsonScalarType(jsonScalarType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_ARRAY:
      {
        JsonArray jsonArray = (JsonArray)theEObject;
        T result = caseJsonArray(jsonArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_OBJECT:
      {
        JsonObject jsonObject = (JsonObject)theEObject;
        T result = caseJsonObject(jsonObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.XPLATFORM_RESOURCE_DEFINITION:
      {
        XplatformResourceDefinition xplatformResourceDefinition = (XplatformResourceDefinition)theEObject;
        T result = caseXplatformResourceDefinition(xplatformResourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.ENUM_INSTANCE:
      {
        EnumInstance enumInstance = (EnumInstance)theEObject;
        T result = caseEnumInstance(enumInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.MAP_INSTANCE:
      {
        MapInstance mapInstance = (MapInstance)theEObject;
        T result = caseMapInstance(mapInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.STRING_LIST:
      {
        StringList stringList = (StringList)theEObject;
        T result = caseStringList(stringList);
        if (result == null) result = caseNestedType(stringList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.NESTED_TYPE:
      {
        NestedType nestedType = (NestedType)theEObject;
        T result = caseNestedType(nestedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xplatform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xplatform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXplatform(Xplatform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Platform</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Platform</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlatform(Platform object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXplatformCallDefinition(XplatformCallDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURI(URI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXplatformHeader(XplatformHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Key Value Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXplatformHeaderKeyValuePair(XplatformHeaderKeyValuePair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXplatformJson(XplatformJson object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Meta Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Meta Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonMetaArray(JsonMetaArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Meta Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Meta Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonMetaType(JsonMetaType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Composite Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Composite Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonCompositeType(JsonCompositeType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonType(JsonType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Scalar Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Scalar Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonScalarType(JsonScalarType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonArray(JsonArray object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonObject(JsonObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXplatformResourceDefinition(XplatformResourceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumInstance(EnumInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapInstance(MapInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringList(StringList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedType(NestedType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //XplatformSwitch
