/**
 */
package nl.sison.dsl.mobgen.jsonGen.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.jsonGen.JsonArray;
import nl.sison.dsl.mobgen.jsonGen.JsonGenPackage;
import nl.sison.dsl.mobgen.jsonGen.JsonValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonArrayImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonArrayImpl extends MinimalEObjectImpl.Container implements JsonArray
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<JsonValue> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonArrayImpl()
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
    return JsonGenPackage.Literals.JSON_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<JsonValue>(JsonValue.class, this, JsonGenPackage.JSON_ARRAY__VALUES);
    }
    return values;
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
      case JsonGenPackage.JSON_ARRAY__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case JsonGenPackage.JSON_ARRAY__VALUES:
        return getValues();
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
      case JsonGenPackage.JSON_ARRAY__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends JsonValue>)newValue);
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
      case JsonGenPackage.JSON_ARRAY__VALUES:
        getValues().clear();
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
      case JsonGenPackage.JSON_ARRAY__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JsonArrayImpl
