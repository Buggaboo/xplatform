/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.JsonCompositeType;
import nl.sison.xplatform.JsonScalarType;
import nl.sison.xplatform.JsonType;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonTypeImpl#getScalar <em>Scalar</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.JsonTypeImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonTypeImpl extends MinimalEObjectImpl.Container implements JsonType
{
  /**
   * The cached value of the '{@link #getScalar() <em>Scalar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScalar()
   * @generated
   * @ordered
   */
  protected JsonScalarType scalar;

  /**
   * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected JsonCompositeType composite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonTypeImpl()
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
    return XplatformPackage.Literals.JSON_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonScalarType getScalar()
  {
    return scalar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetScalar(JsonScalarType newScalar, NotificationChain msgs)
  {
    JsonScalarType oldScalar = scalar;
    scalar = newScalar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_TYPE__SCALAR, oldScalar, newScalar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScalar(JsonScalarType newScalar)
  {
    if (newScalar != scalar)
    {
      NotificationChain msgs = null;
      if (scalar != null)
        msgs = ((InternalEObject)scalar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_TYPE__SCALAR, null, msgs);
      if (newScalar != null)
        msgs = ((InternalEObject)newScalar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_TYPE__SCALAR, null, msgs);
      msgs = basicSetScalar(newScalar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_TYPE__SCALAR, newScalar, newScalar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonCompositeType getComposite()
  {
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposite(JsonCompositeType newComposite, NotificationChain msgs)
  {
    JsonCompositeType oldComposite = composite;
    composite = newComposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_TYPE__COMPOSITE, oldComposite, newComposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposite(JsonCompositeType newComposite)
  {
    if (newComposite != composite)
    {
      NotificationChain msgs = null;
      if (composite != null)
        msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_TYPE__COMPOSITE, null, msgs);
      if (newComposite != null)
        msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_TYPE__COMPOSITE, null, msgs);
      msgs = basicSetComposite(newComposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_TYPE__COMPOSITE, newComposite, newComposite));
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
      case XplatformPackage.JSON_TYPE__SCALAR:
        return basicSetScalar(null, msgs);
      case XplatformPackage.JSON_TYPE__COMPOSITE:
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
      case XplatformPackage.JSON_TYPE__SCALAR:
        return getScalar();
      case XplatformPackage.JSON_TYPE__COMPOSITE:
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
      case XplatformPackage.JSON_TYPE__SCALAR:
        setScalar((JsonScalarType)newValue);
        return;
      case XplatformPackage.JSON_TYPE__COMPOSITE:
        setComposite((JsonCompositeType)newValue);
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
      case XplatformPackage.JSON_TYPE__SCALAR:
        setScalar((JsonScalarType)null);
        return;
      case XplatformPackage.JSON_TYPE__COMPOSITE:
        setComposite((JsonCompositeType)null);
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
      case XplatformPackage.JSON_TYPE__SCALAR:
        return scalar != null;
      case XplatformPackage.JSON_TYPE__COMPOSITE:
        return composite != null;
    }
    return super.eIsSet(featureID);
  }

} //JsonTypeImpl
