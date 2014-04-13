/**
 */
package nl.sison.dsl.mobgen.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.JsonKeyValuePair;
import nl.sison.dsl.mobgen.JsonObject;
import nl.sison.dsl.mobgen.MobgenPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.impl.JsonObjectImpl#getKeyValuePair <em>Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonObjectImpl extends MinimalEObjectImpl.Container implements JsonObject
{
  /**
   * The cached value of the '{@link #getKeyValuePair() <em>Key Value Pair</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyValuePair()
   * @generated
   * @ordered
   */
  protected EList<JsonKeyValuePair> keyValuePair;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonObjectImpl()
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
    return MobgenPackage.Literals.JSON_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonKeyValuePair> getKeyValuePair()
  {
    if (keyValuePair == null)
    {
      keyValuePair = new EObjectContainmentEList<JsonKeyValuePair>(JsonKeyValuePair.class, this, MobgenPackage.JSON_OBJECT__KEY_VALUE_PAIR);
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
      case MobgenPackage.JSON_OBJECT__KEY_VALUE_PAIR:
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
      case MobgenPackage.JSON_OBJECT__KEY_VALUE_PAIR:
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
      case MobgenPackage.JSON_OBJECT__KEY_VALUE_PAIR:
        getKeyValuePair().clear();
        getKeyValuePair().addAll((Collection<? extends JsonKeyValuePair>)newValue);
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
      case MobgenPackage.JSON_OBJECT__KEY_VALUE_PAIR:
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
      case MobgenPackage.JSON_OBJECT__KEY_VALUE_PAIR:
        return keyValuePair != null && !keyValuePair.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JsonObjectImpl
