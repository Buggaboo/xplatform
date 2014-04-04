/**
 */
package nl.sison.xplatform.impl;

import java.util.Collection;

import nl.sison.xplatform.Platform;
import nl.sison.xplatform.Xplatform;
import nl.sison.xplatform.XplatformCallDefinition;
import nl.sison.xplatform.XplatformPackage;
import nl.sison.xplatform.XplatformResourceDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xplatform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XplatformImpl extends MinimalEObjectImpl.Container implements Xplatform
{
  /**
   * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
  protected Platform platform;

  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<XplatformResourceDefinition> resources;

  /**
   * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalls()
   * @generated
   * @ordered
   */
  protected EList<XplatformCallDefinition> calls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XplatformImpl()
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
    return XplatformPackage.Literals.XPLATFORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Platform getPlatform()
  {
    return platform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlatform(Platform newPlatform, NotificationChain msgs)
  {
    Platform oldPlatform = platform;
    platform = newPlatform;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__PLATFORM, oldPlatform, newPlatform);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlatform(Platform newPlatform)
  {
    if (newPlatform != platform)
    {
      NotificationChain msgs = null;
      if (platform != null)
        msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__PLATFORM, null, msgs);
      if (newPlatform != null)
        msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__PLATFORM, null, msgs);
      msgs = basicSetPlatform(newPlatform, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__PLATFORM, newPlatform, newPlatform));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XplatformResourceDefinition> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<XplatformResourceDefinition>(XplatformResourceDefinition.class, this, XplatformPackage.XPLATFORM__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XplatformCallDefinition> getCalls()
  {
    if (calls == null)
    {
      calls = new EObjectContainmentEList<XplatformCallDefinition>(XplatformCallDefinition.class, this, XplatformPackage.XPLATFORM__CALLS);
    }
    return calls;
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
      case XplatformPackage.XPLATFORM__PLATFORM:
        return basicSetPlatform(null, msgs);
      case XplatformPackage.XPLATFORM__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case XplatformPackage.XPLATFORM__CALLS:
        return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
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
      case XplatformPackage.XPLATFORM__PLATFORM:
        return getPlatform();
      case XplatformPackage.XPLATFORM__RESOURCES:
        return getResources();
      case XplatformPackage.XPLATFORM__CALLS:
        return getCalls();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XplatformPackage.XPLATFORM__PLATFORM:
        setPlatform((Platform)newValue);
        return;
      case XplatformPackage.XPLATFORM__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends XplatformResourceDefinition>)newValue);
        return;
      case XplatformPackage.XPLATFORM__CALLS:
        getCalls().clear();
        getCalls().addAll((Collection<? extends XplatformCallDefinition>)newValue);
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
      case XplatformPackage.XPLATFORM__PLATFORM:
        setPlatform((Platform)null);
        return;
      case XplatformPackage.XPLATFORM__RESOURCES:
        getResources().clear();
        return;
      case XplatformPackage.XPLATFORM__CALLS:
        getCalls().clear();
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
      case XplatformPackage.XPLATFORM__PLATFORM:
        return platform != null;
      case XplatformPackage.XPLATFORM__RESOURCES:
        return resources != null && !resources.isEmpty();
      case XplatformPackage.XPLATFORM__CALLS:
        return calls != null && !calls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XplatformImpl
