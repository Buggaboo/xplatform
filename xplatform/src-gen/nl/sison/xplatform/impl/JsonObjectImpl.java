/**
 */
package nl.sison.xplatform.impl;

import java.util.Collection;

import nl.sison.xplatform.JsonKeyValuePair;
import nl.sison.xplatform.JsonMetaKeyValuePair;
import nl.sison.xplatform.JsonObject;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonObjectImpl#getKeyValuePair <em>Key Value Pair</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.JsonObjectImpl#getMetaKeyValuePair <em>Meta Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonObjectImpl extends JsonTypeImpl implements JsonObject
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
   * The cached value of the '{@link #getMetaKeyValuePair() <em>Meta Key Value Pair</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaKeyValuePair()
   * @generated
   * @ordered
   */
  protected EList<JsonMetaKeyValuePair> metaKeyValuePair;

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
    return XplatformPackage.Literals.JSON_OBJECT;
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
      keyValuePair = new EObjectContainmentEList<JsonKeyValuePair>(JsonKeyValuePair.class, this, XplatformPackage.JSON_OBJECT__KEY_VALUE_PAIR);
    }
    return keyValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonMetaKeyValuePair> getMetaKeyValuePair()
  {
    if (metaKeyValuePair == null)
    {
      metaKeyValuePair = new EObjectContainmentEList<JsonMetaKeyValuePair>(JsonMetaKeyValuePair.class, this, XplatformPackage.JSON_OBJECT__META_KEY_VALUE_PAIR);
    }
    return metaKeyValuePair;
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
      case XplatformPackage.JSON_OBJECT__KEY_VALUE_PAIR:
        return ((InternalEList<?>)getKeyValuePair()).basicRemove(otherEnd, msgs);
      case XplatformPackage.JSON_OBJECT__META_KEY_VALUE_PAIR:
        return ((InternalEList<?>)getMetaKeyValuePair()).basicRemove(otherEnd, msgs);
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
      case XplatformPackage.JSON_OBJECT__KEY_VALUE_PAIR:
        return getKeyValuePair();
      case XplatformPackage.JSON_OBJECT__META_KEY_VALUE_PAIR:
        return getMetaKeyValuePair();
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
      case XplatformPackage.JSON_OBJECT__KEY_VALUE_PAIR:
        getKeyValuePair().clear();
        getKeyValuePair().addAll((Collection<? extends JsonKeyValuePair>)newValue);
        return;
      case XplatformPackage.JSON_OBJECT__META_KEY_VALUE_PAIR:
        getMetaKeyValuePair().clear();
        getMetaKeyValuePair().addAll((Collection<? extends JsonMetaKeyValuePair>)newValue);
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
      case XplatformPackage.JSON_OBJECT__KEY_VALUE_PAIR:
        getKeyValuePair().clear();
        return;
      case XplatformPackage.JSON_OBJECT__META_KEY_VALUE_PAIR:
        getMetaKeyValuePair().clear();
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
      case XplatformPackage.JSON_OBJECT__KEY_VALUE_PAIR:
        return keyValuePair != null && !keyValuePair.isEmpty();
      case XplatformPackage.JSON_OBJECT__META_KEY_VALUE_PAIR:
        return metaKeyValuePair != null && !metaKeyValuePair.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JsonObjectImpl
