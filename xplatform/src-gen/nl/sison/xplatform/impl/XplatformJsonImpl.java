/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.JsonMetaType;
import nl.sison.xplatform.JsonObject;
import nl.sison.xplatform.JsonType;
import nl.sison.xplatform.XplatformJson;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.XplatformJsonImpl#getType <em>Type</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformJsonImpl#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformJsonImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XplatformJsonImpl extends MinimalEObjectImpl.Container implements XplatformJson
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JsonType type;

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
   * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected JsonObject composite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XplatformJsonImpl()
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
    return XplatformPackage.Literals.XPLATFORM_JSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JsonType newType, NotificationChain msgs)
  {
    JsonType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM_JSON__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JsonType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM_JSON__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM_JSON__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM_JSON__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM_JSON__META_TYPE, oldMetaType, newMetaType);
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
        msgs = ((InternalEObject)metaType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM_JSON__META_TYPE, null, msgs);
      if (newMetaType != null)
        msgs = ((InternalEObject)newMetaType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM_JSON__META_TYPE, null, msgs);
      msgs = basicSetMetaType(newMetaType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM_JSON__META_TYPE, newMetaType, newMetaType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject getComposite()
  {
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposite(JsonObject newComposite, NotificationChain msgs)
  {
    JsonObject oldComposite = composite;
    composite = newComposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM_JSON__COMPOSITE, oldComposite, newComposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposite(JsonObject newComposite)
  {
    if (newComposite != composite)
    {
      NotificationChain msgs = null;
      if (composite != null)
        msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM_JSON__COMPOSITE, null, msgs);
      if (newComposite != null)
        msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM_JSON__COMPOSITE, null, msgs);
      msgs = basicSetComposite(newComposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM_JSON__COMPOSITE, newComposite, newComposite));
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
      case XplatformPackage.XPLATFORM_JSON__TYPE:
        return basicSetType(null, msgs);
      case XplatformPackage.XPLATFORM_JSON__META_TYPE:
        return basicSetMetaType(null, msgs);
      case XplatformPackage.XPLATFORM_JSON__COMPOSITE:
        return basicSetComposite(null, msgs);
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
      case XplatformPackage.XPLATFORM_JSON__TYPE:
        return getType();
      case XplatformPackage.XPLATFORM_JSON__META_TYPE:
        return getMetaType();
      case XplatformPackage.XPLATFORM_JSON__COMPOSITE:
        return getComposite();
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
      case XplatformPackage.XPLATFORM_JSON__TYPE:
        setType((JsonType)newValue);
        return;
      case XplatformPackage.XPLATFORM_JSON__META_TYPE:
        setMetaType((JsonMetaType)newValue);
        return;
      case XplatformPackage.XPLATFORM_JSON__COMPOSITE:
        setComposite((JsonObject)newValue);
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
      case XplatformPackage.XPLATFORM_JSON__TYPE:
        setType((JsonType)null);
        return;
      case XplatformPackage.XPLATFORM_JSON__META_TYPE:
        setMetaType((JsonMetaType)null);
        return;
      case XplatformPackage.XPLATFORM_JSON__COMPOSITE:
        setComposite((JsonObject)null);
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
      case XplatformPackage.XPLATFORM_JSON__TYPE:
        return type != null;
      case XplatformPackage.XPLATFORM_JSON__META_TYPE:
        return metaType != null;
      case XplatformPackage.XPLATFORM_JSON__COMPOSITE:
        return composite != null;
    }
    return super.eIsSet(featureID);
  }

} //XplatformJsonImpl
