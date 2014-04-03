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
      case XplatformPackage.XPLATFORM_JSON:
      {
        XplatformJson xplatformJson = (XplatformJson)theEObject;
        T result = caseXplatformJson(xplatformJson);
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
      case XplatformPackage.XPLATFORM_HEADER_KEY_VALUE:
      {
        XplatformHeaderKeyValue xplatformHeaderKeyValue = (XplatformHeaderKeyValue)theEObject;
        T result = caseXplatformHeaderKeyValue(xplatformHeaderKeyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_META_TYPE:
      {
        JsonMetaType jsonMetaType = (JsonMetaType)theEObject;
        T result = caseJsonMetaType(jsonMetaType);
        if (result == null) result = caseJsonType(jsonMetaType);
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
      case XplatformPackage.JSON_ARRAY:
      {
        JsonArray jsonArray = (JsonArray)theEObject;
        T result = caseJsonArray(jsonArray);
        if (result == null) result = caseJsonType(jsonArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_KEY_VALUE_PAIR:
      {
        JsonKeyValuePair jsonKeyValuePair = (JsonKeyValuePair)theEObject;
        T result = caseJsonKeyValuePair(jsonKeyValuePair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_OBJECT:
      {
        JsonObject jsonObject = (JsonObject)theEObject;
        T result = caseJsonObject(jsonObject);
        if (result == null) result = caseJsonType(jsonObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_META_ARRAY:
      {
        JsonMetaArray jsonMetaArray = (JsonMetaArray)theEObject;
        T result = caseJsonMetaArray(jsonMetaArray);
        if (result == null) result = caseJsonMetaType(jsonMetaArray);
        if (result == null) result = caseJsonType(jsonMetaArray);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR:
      {
        JsonMetaKeyValuePair jsonMetaKeyValuePair = (JsonMetaKeyValuePair)theEObject;
        T result = caseJsonMetaKeyValuePair(jsonMetaKeyValuePair);
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
   * Returns the result of interpreting the object as an instance of '<em>Header Key Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Header Key Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXplatformHeaderKeyValue(XplatformHeaderKeyValue object)
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
   * Returns the result of interpreting the object as an instance of '<em>Json Meta Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Json Meta Key Value Pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJsonMetaKeyValuePair(JsonMetaKeyValuePair object)
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
