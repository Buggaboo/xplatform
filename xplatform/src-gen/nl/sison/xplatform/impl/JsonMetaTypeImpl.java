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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Meta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonMetaTypeImpl#getScalar <em>Scalar</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.JsonMetaTypeImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonMetaTypeImpl extends MinimalEObjectImpl.Container implements JsonMetaType
{
  /**
   * The default value of the '{@link #getScalar() <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScalar()
   * @generated
   * @ordered
   */
  protected static final String SCALAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScalar() <em>Scalar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScalar()
   * @generated
   * @ordered
   */
  protected String scalar = SCALAR_EDEFAULT;

  /**
   * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected JsonMetaArray composite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonMetaTypeImpl()
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
    return XplatformPackage.Literals.JSON_META_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScalar()
  {
    return scalar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScalar(String newScalar)
  {
    String oldScalar = scalar;
    scalar = newScalar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_TYPE__SCALAR, oldScalar, scalar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonMetaArray getComposite()
  {
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComposite(JsonMetaArray newComposite, NotificationChain msgs)
  {
    JsonMetaArray oldComposite = composite;
    composite = newComposite;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_TYPE__COMPOSITE, oldComposite, newComposite);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposite(JsonMetaArray newComposite)
  {
    if (newComposite != composite)
    {
      NotificationChain msgs = null;
      if (composite != null)
        msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_META_TYPE__COMPOSITE, null, msgs);
      if (newComposite != null)
        msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.JSON_META_TYPE__COMPOSITE, null, msgs);
      msgs = basicSetComposite(newComposite, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.JSON_META_TYPE__COMPOSITE, newComposite, newComposite));
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
      case XplatformPackage.JSON_META_TYPE__COMPOSITE:
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
      case XplatformPackage.JSON_META_TYPE__SCALAR:
        return getScalar();
      case XplatformPackage.JSON_META_TYPE__COMPOSITE:
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
      case XplatformPackage.JSON_META_TYPE__SCALAR:
        setScalar((String)newValue);
        return;
      case XplatformPackage.JSON_META_TYPE__COMPOSITE:
        setComposite((JsonMetaArray)newValue);
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
      case XplatformPackage.JSON_META_TYPE__SCALAR:
        setScalar(SCALAR_EDEFAULT);
        return;
      case XplatformPackage.JSON_META_TYPE__COMPOSITE:
        setComposite((JsonMetaArray)null);
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
      case XplatformPackage.JSON_META_TYPE__SCALAR:
        return SCALAR_EDEFAULT == null ? scalar != null : !SCALAR_EDEFAULT.equals(scalar);
      case XplatformPackage.JSON_META_TYPE__COMPOSITE:
        return composite != null;
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
    result.append(" (scalar: ");
    result.append(scalar);
    result.append(')');
    return result.toString();
  }

} //JsonMetaTypeImpl
