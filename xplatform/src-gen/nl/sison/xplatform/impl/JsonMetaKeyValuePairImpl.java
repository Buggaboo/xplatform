/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.JsonMetaKeyValuePair;
import nl.sison.xplatform.JsonMetaType;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Meta Key Value Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonMetaKeyValuePairImpl#getMetaKey <em>Meta Key</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.JsonMetaKeyValuePairImpl#getMetaValue <em>Meta Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonMetaKeyValuePairImpl extends MinimalEObjectImpl.Container implements JsonMetaKeyValuePair
{
  /**
   * The default value of the '{@link #getMetaKey() <em>Meta Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaKey()
   * @generated
   * @ordered
   */
  protected static final String META_KEY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMetaKey() <em>Meta Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaKey()
   * @generated
   * @ordered
   */
  protected String metaKey = META_KEY_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetaValue() <em>Meta Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaValue()
   * @generated
   * @ordered
   */
  protected JsonMetaType metaValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonMetaKeyValuePairImpl()
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
    return XplatformPackage.Literals.JSON_META_KEY_VALUE_PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMetaKey()
  {
    return metaKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaKey(String newMetaKey)
  {
    String oldMetaKey = metaKey;
    metaKey = newMetaKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_KEY, oldMetaKey, metaKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonMetaType getMetaValue()
  {
    return metaValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaValue(JsonMetaType newMetaValue, NotificationChain msgs)
  {
    JsonMetaType oldMetaValue = metaValue;
    metaValue = newMetaValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE, oldMetaValue, newMetaValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaValue(JsonMetaType newMetaValue)
  {
    if (newMetaValue != metaValue)
    {
      NotificationChain msgs = null;
      if (metaValue != null)
        msgs = ((InternalEObject)metaValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE, null, msgs);
      if (newMetaValue != null)
        msgs = ((InternalEObject)newMetaValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE, null, msgs);
      msgs = basicSetMetaValue(newMetaValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE, newMetaValue, newMetaValue));
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
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE:
        return basicSetMetaValue(null, msgs);
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
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_KEY:
        return getMetaKey();
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE:
        return getMetaValue();
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
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_KEY:
        setMetaKey((String)newValue);
        return;
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE:
        setMetaValue((JsonMetaType)newValue);
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
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_KEY:
        setMetaKey(META_KEY_EDEFAULT);
        return;
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE:
        setMetaValue((JsonMetaType)null);
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
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_KEY:
        return META_KEY_EDEFAULT == null ? metaKey != null : !META_KEY_EDEFAULT.equals(metaKey);
      case XplatformPackage.JSON_META_KEY_VALUE_PAIR__META_VALUE:
        return metaValue != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (metaKey: ");
    result.append(metaKey);
    result.append(')');
    return result.toString();
  }

} //JsonMetaKeyValuePairImpl
