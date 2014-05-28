/**
 */
package nl.sison.dsl.mobgen.restful.impl;

import nl.sison.dsl.mobgen.restful.JsonArray;
import nl.sison.dsl.mobgen.restful.JsonCompositeValue;
import nl.sison.dsl.mobgen.restful.JsonObject;
import nl.sison.dsl.mobgen.restful.RestfulPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Composite Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonCompositeValueImpl#getObjectValue <em>Object Value</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonCompositeValueImpl#getArrayValue <em>Array Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonCompositeValueImpl extends MinimalEObjectImpl.Container implements JsonCompositeValue
{
  /**
   * The cached value of the '{@link #getObjectValue() <em>Object Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectValue()
   * @generated
   * @ordered
   */
  protected JsonObject objectValue;

  /**
   * The cached value of the '{@link #getArrayValue() <em>Array Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayValue()
   * @generated
   * @ordered
   */
  protected JsonArray arrayValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonCompositeValueImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RestfulPackage.Literals.JSON_COMPOSITE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject getObjectValue()
  {
    return objectValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObjectValue(JsonObject newObjectValue, NotificationChain msgs)
  {
    JsonObject oldObjectValue = objectValue;
    objectValue = newObjectValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE, oldObjectValue, newObjectValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjectValue(JsonObject newObjectValue)
  {
    if (newObjectValue != objectValue)
    {
      NotificationChain msgs = null;
      if (objectValue != null)
        msgs = ((InternalEObject)objectValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE, null, msgs);
      if (newObjectValue != null)
        msgs = ((InternalEObject)newObjectValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE, null, msgs);
      msgs = basicSetObjectValue(newObjectValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE, newObjectValue, newObjectValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonArray getArrayValue()
  {
    return arrayValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayValue(JsonArray newArrayValue, NotificationChain msgs)
  {
    JsonArray oldArrayValue = arrayValue;
    arrayValue = newArrayValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE, oldArrayValue, newArrayValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayValue(JsonArray newArrayValue)
  {
    if (newArrayValue != arrayValue)
    {
      NotificationChain msgs = null;
      if (arrayValue != null)
        msgs = ((InternalEObject)arrayValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE, null, msgs);
      if (newArrayValue != null)
        msgs = ((InternalEObject)newArrayValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE, null, msgs);
      msgs = basicSetArrayValue(newArrayValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE, newArrayValue, newArrayValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE:
        return basicSetObjectValue(null, msgs);
      case RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE:
        return basicSetArrayValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE:
        return getObjectValue();
      case RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE:
        return getArrayValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE:
        setObjectValue((JsonObject)newValue);
        return;
      case RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE:
        setArrayValue((JsonArray)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE:
        setObjectValue((JsonObject)null);
        return;
      case RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE:
        setArrayValue((JsonArray)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RestfulPackage.JSON_COMPOSITE_VALUE__OBJECT_VALUE:
        return objectValue != null;
      case RestfulPackage.JSON_COMPOSITE_VALUE__ARRAY_VALUE:
        return arrayValue != null;
    }
    return super.eIsSet(featureID);
  }

} //JsonCompositeValueImpl
