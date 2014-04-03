/**
 */
package nl.sison.xplatform.impl;

import java.util.Collection;

import nl.sison.xplatform.XplatformHeader;
import nl.sison.xplatform.XplatformHeaderKeyValue;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.XplatformHeaderImpl#getHeaderKeyValues <em>Header Key Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XplatformHeaderImpl extends MinimalEObjectImpl.Container implements XplatformHeader
{
  /**
   * The cached value of the '{@link #getHeaderKeyValues() <em>Header Key Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderKeyValues()
   * @generated
   * @ordered
   */
  protected EList<XplatformHeaderKeyValue> headerKeyValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XplatformHeaderImpl()
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
    return XplatformPackage.Literals.XPLATFORM_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XplatformHeaderKeyValue> getHeaderKeyValues()
  {
    if (headerKeyValues == null)
    {
      headerKeyValues = new EObjectContainmentEList<XplatformHeaderKeyValue>(XplatformHeaderKeyValue.class, this, XplatformPackage.XPLATFORM_HEADER__HEADER_KEY_VALUES);
    }
    return headerKeyValues;
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
      case XplatformPackage.XPLATFORM_HEADER__HEADER_KEY_VALUES:
        return ((InternalEList<?>)getHeaderKeyValues()).basicRemove(otherEnd, msgs);
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
      case XplatformPackage.XPLATFORM_HEADER__HEADER_KEY_VALUES:
        return getHeaderKeyValues();
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
      case XplatformPackage.XPLATFORM_HEADER__HEADER_KEY_VALUES:
        getHeaderKeyValues().clear();
        getHeaderKeyValues().addAll((Collection<? extends XplatformHeaderKeyValue>)newValue);
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
      case XplatformPackage.XPLATFORM_HEADER__HEADER_KEY_VALUES:
        getHeaderKeyValues().clear();
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
      case XplatformPackage.XPLATFORM_HEADER__HEADER_KEY_VALUES:
        return headerKeyValues != null && !headerKeyValues.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //XplatformHeaderImpl
