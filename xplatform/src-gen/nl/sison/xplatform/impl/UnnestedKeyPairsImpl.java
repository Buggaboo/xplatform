/**
 */
package nl.sison.xplatform.impl;

import java.util.Collection;

import nl.sison.xplatform.UnnestedKeyPairs;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unnested Key Pairs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.UnnestedKeyPairsImpl#getKeyValuePair <em>Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnnestedKeyPairsImpl extends MinimalEObjectImpl.Container implements UnnestedKeyPairs
{
  /**
   * The cached value of the '{@link #getKeyValuePair() <em>Key Value Pair</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyValuePair()
   * @generated
   * @ordered
   */
  protected EList<EObject> keyValuePair;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnnestedKeyPairsImpl()
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
    return XplatformPackage.Literals.UNNESTED_KEY_PAIRS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getKeyValuePair()
  {
    if (keyValuePair == null)
    {
      keyValuePair = new EObjectContainmentEList<EObject>(EObject.class, this, XplatformPackage.UNNESTED_KEY_PAIRS__KEY_VALUE_PAIR);
    }
    return keyValuePair;
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
      case XplatformPackage.UNNESTED_KEY_PAIRS__KEY_VALUE_PAIR:
        return ((InternalEList<?>)getKeyValuePair()).basicRemove(otherEnd, msgs);
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
      case XplatformPackage.UNNESTED_KEY_PAIRS__KEY_VALUE_PAIR:
        return getKeyValuePair();
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
      case XplatformPackage.UNNESTED_KEY_PAIRS__KEY_VALUE_PAIR:
        getKeyValuePair().clear();
        getKeyValuePair().addAll((Collection<? extends EObject>)newValue);
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
      case XplatformPackage.UNNESTED_KEY_PAIRS__KEY_VALUE_PAIR:
        getKeyValuePair().clear();
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
      case XplatformPackage.UNNESTED_KEY_PAIRS__KEY_VALUE_PAIR:
        return keyValuePair != null && !keyValuePair.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //UnnestedKeyPairsImpl
