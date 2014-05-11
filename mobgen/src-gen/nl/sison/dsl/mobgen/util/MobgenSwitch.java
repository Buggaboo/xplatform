/**
 */
package nl.sison.dsl.mobgen.util;

import nl.sison.dsl.mobgen.*;

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
 * @see nl.sison.dsl.mobgen.MobgenPackage
 * @generated
 */
public class MobgenSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MobgenPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MobgenPackage.eINSTANCE;
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
      case MobgenPackage.MOBGEN:
      {
        Mobgen mobgen = (Mobgen)theEObject;
        T result = caseMobgen(mobgen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.MOBGEN_CALL_DEFINITION:
      {
        MobgenCallDefinition mobgenCallDefinition = (MobgenCallDefinition)theEObject;
        T result = caseMobgenCallDefinition(mobgenCallDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.MOBGEN_HEADER:
      {
        MobgenHeader mobgenHeader = (MobgenHeader)theEObject;
        T result = caseMobgenHeader(mobgenHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.MOBGEN_HEADER_KEY_VALUE_PAIR:
      {
        MobgenHeaderKeyValuePair mobgenHeaderKeyValuePair = (MobgenHeaderKeyValuePair)theEObject;
        T result = caseMobgenHeaderKeyValuePair(mobgenHeaderKeyValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.MOBGEN_HEADER_PARAMETER:
      {
        MobgenHeaderParameter mobgenHeaderParameter = (MobgenHeaderParameter)theEObject;
        T result = caseMobgenHeaderParameter(mobgenHeaderParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.MOBGEN_JSON:
      {
        MobgenJson mobgenJson = (MobgenJson)theEObject;
        T result = caseMobgenJson(mobgenJson);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.JSON_OBJECT_VALUE:
      {
        JsonObjectValue jsonObjectValue = (JsonObjectValue)theEObject;
        T result = caseJsonObjectValue(jsonObjectValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.JSON_COMPOSITE_VALUE:
      {
        JsonCompositeValue jsonCompositeValue = (JsonCompositeValue)theEObject;
        T result = caseJsonCompositeValue(jsonCompositeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.JSON_LITERAL_VALUE:
      {
        JsonLiteralValue jsonLiteralValue = (JsonLiteralValue)theEObject;
        T result = caseJsonLiteralValue(jsonLiteralValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.JSON_OBJECT:
      {
        JsonObject jsonObject = (JsonObject)theEObject;
        T result = caseJsonObject(jsonObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.JSON_KEY_VALUE_PAIR:
      {
        JsonKeyValuePair jsonKeyValuePair = (JsonKeyValuePair)theEObject;
        T result = caseJsonKeyValuePair(jsonKeyValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.JSON_ARRAY:
      {
        JsonArray jsonArray = (JsonArray)theEObject;
        T result = caseJsonArray(jsonArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.MOBGEN_RESOURCE_DEFINITION:
      {
        MobgenResourceDefinition mobgenResourceDefinition = (MobgenResourceDefinition)theEObject;
        T result = caseMobgenResourceDefinition(mobgenResourceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.ENUM_INSTANCE:
      {
        EnumInstance enumInstance = (EnumInstance)theEObject;
        T result = caseEnumInstance(enumInstance);
        if (result == null) result = caseMobgenResourceDefinition(enumInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.MAP_INSTANCE:
      {
        MapInstance mapInstance = (MapInstance)theEObject;
        T result = caseMapInstance(mapInstance);
        if (result == null) result = caseMobgenResourceDefinition(mapInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.STRING_LIST:
      {
        StringList stringList = (StringList)theEObject;
        T result = caseStringList(stringList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.NESTED_TYPE:
      {
        NestedType nestedType = (NestedType)theEObject;
        T result = caseNestedType(nestedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MobgenPackage.URI:
      {
        URI uri = (URI)theEObject;
        T result = caseURI(uri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mobgen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mobgen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMobgen(Mobgen object)
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
  public T caseMobgenCallDefinition(MobgenCallDefinition object)
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
  public T caseMobgenHeader(MobgenHeader object)
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
  public T caseMobgenHeaderKeyValuePair(MobgenHeaderKeyValuePair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Header Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMobgenHeaderParameter(MobgenHeaderParameter object)
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
  public T caseMobgenJson(MobgenJson object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Object Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Object Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonObjectValue(JsonObjectValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Composite Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Composite Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonCompositeValue(JsonCompositeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Json Literal Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Literal Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonLiteralValue(JsonLiteralValue object)
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
   * Returns the result of interpreting the object as an instance of '<em>Json Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Key Value Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonKeyValuePair(JsonKeyValuePair object)
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
  public T caseMobgenResourceDefinition(MobgenResourceDefinition object)
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

} //MobgenSwitch
