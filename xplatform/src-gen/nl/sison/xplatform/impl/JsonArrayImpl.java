/**
 */
package nl.sison.xplatform.impl;

import java.util.Collection;

import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonCompositeType;
import nl.sison.xplatform.JsonScalarType;
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
 * An implementation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonArrayImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.JsonArrayImpl#getComposites <em>Composites</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonArrayImpl extends MinimalEObjectImpl.Container implements JsonArray
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<JsonScalarType> elements;

  /**
   * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposites()
   * @generated
   * @ordered
   */
  protected EList<JsonCompositeType> composites;

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
    return XplatformPackage.Literals.JSON_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonScalarType> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<JsonScalarType>(JsonScalarType.class, this, XplatformPackage.JSON_ARRAY__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonCompositeType> getComposites()
  {
    if (composites == null)
    {
      composites = new EObjectContainmentEList<JsonCompositeType>(JsonCompositeType.class, this, XplatformPackage.JSON_ARRAY__COMPOSITES);
    }
    return composites;
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
      case XplatformPackage.JSON_ARRAY__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case XplatformPackage.JSON_ARRAY__COMPOSITES:
        return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
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
      case XplatformPackage.JSON_ARRAY__ELEMENTS:
        return getElements();
      case XplatformPackage.JSON_ARRAY__COMPOSITES:
        return getComposites();
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
      case XplatformPackage.JSON_ARRAY__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends JsonScalarType>)newValue);
        return;
      case XplatformPackage.JSON_ARRAY__COMPOSITES:
        getComposites().clear();
        getComposites().addAll((Collection<? extends JsonCompositeType>)newValue);
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
      case XplatformPackage.JSON_ARRAY__ELEMENTS:
        getElements().clear();
        return;
      case XplatformPackage.JSON_ARRAY__COMPOSITES:
        getComposites().clear();
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
      case XplatformPackage.JSON_ARRAY__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case XplatformPackage.JSON_ARRAY__COMPOSITES:
        return composites != null && !composites.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JsonArrayImpl
