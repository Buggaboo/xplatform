/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonCompositeType;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Composite Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonCompositeTypeImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonCompositeTypeImpl extends MinimalEObjectImpl.Container implements JsonCompositeType
{
  /**
   * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected JsonArray composite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonCompositeTypeImpl()
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
    return XplatformPackage.Literals.JSON_COMPOSITE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonArray getComposite()
  {
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposite(JsonArray newComposite, NotificationChain msgs)
  {
    JsonArray oldComposite = composite;
    composite = newComposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE, oldComposite, newComposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposite(JsonArray newComposite)
  {
    if (newComposite != composite)
    {
      NotificationChain msgs = null;
      if (composite != null)
        msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE, null, msgs);
      if (newComposite != null)
        msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE, null, msgs);
      msgs = basicSetComposite(newComposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE, newComposite, newComposite));
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
      case XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE:
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
      case XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE:
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
      case XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE:
        setComposite((JsonArray)newValue);
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
      case XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE:
        setComposite((JsonArray)null);
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
      case XplatformPackage.JSON_COMPOSITE_TYPE__COMPOSITE:
        return composite != null;
    }
    return super.eIsSet(featureID);
  }

} //JsonCompositeTypeImpl
