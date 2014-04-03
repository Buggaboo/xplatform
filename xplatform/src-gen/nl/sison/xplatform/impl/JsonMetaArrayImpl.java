/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.JsonMetaArray;
import nl.sison.xplatform.JsonMetaType;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Meta Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonMetaArrayImpl#getMetaType <em>Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonMetaArrayImpl extends JsonMetaTypeImpl implements JsonMetaArray
{
  /**
   * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaType()
   * @generated
   * @ordered
   */
  protected JsonMetaType metaType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonMetaArrayImpl()
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
    return XplatformPackage.Literals.JSON_META_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonMetaType getMetaType()
  {
    return metaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaType(JsonMetaType newMetaType, NotificationChain msgs)
  {
    JsonMetaType oldMetaType = metaType;
    metaType = newMetaType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_ARRAY__META_TYPE, oldMetaType, newMetaType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaType(JsonMetaType newMetaType)
  {
    if (newMetaType != metaType)
    {
      NotificationChain msgs = null;
      if (metaType != null)
        msgs = ((InternalEObject)metaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_META_ARRAY__META_TYPE, null, msgs);
      if (newMetaType != null)
        msgs = ((InternalEObject)newMetaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_META_ARRAY__META_TYPE, null, msgs);
      msgs = basicSetMetaType(newMetaType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_ARRAY__META_TYPE, newMetaType, newMetaType));
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
      case XplatformPackage.JSON_META_ARRAY__META_TYPE:
        return basicSetMetaType(null, msgs);
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
      case XplatformPackage.JSON_META_ARRAY__META_TYPE:
        return getMetaType();
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
      case XplatformPackage.JSON_META_ARRAY__META_TYPE:
        setMetaType((JsonMetaType)newValue);
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
      case XplatformPackage.JSON_META_ARRAY__META_TYPE:
        setMetaType((JsonMetaType)null);
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
      case XplatformPackage.JSON_META_ARRAY__META_TYPE:
        return metaType != null;
    }
    return super.eIsSet(featureID);
  }

} //JsonMetaArrayImpl
