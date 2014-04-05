/**
 */
package nl.sison.dsl.mobgen.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.MapInstance;
import nl.sison.dsl.mobgen.MobgenPackage;
import nl.sison.dsl.mobgen.MobgenResourceDefinition;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenResourceDefinitionImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobgenResourceDefinitionImpl extends MinimalEObjectImpl.Container implements MobgenResourceDefinition
{
  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<MapInstance> resources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MobgenResourceDefinitionImpl()
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
    return MobgenPackage.Literals.MOBGEN_RESOURCE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MapInstance> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<MapInstance>(MapInstance.class, this, MobgenPackage.MOBGEN_RESOURCE_DEFINITION__RESOURCES);
    }
    return resources;
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
      case MobgenPackage.MOBGEN_RESOURCE_DEFINITION__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
      case MobgenPackage.MOBGEN_RESOURCE_DEFINITION__RESOURCES:
        return getResources();
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
      case MobgenPackage.MOBGEN_RESOURCE_DEFINITION__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends MapInstance>)newValue);
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
      case MobgenPackage.MOBGEN_RESOURCE_DEFINITION__RESOURCES:
        getResources().clear();
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
      case MobgenPackage.MOBGEN_RESOURCE_DEFINITION__RESOURCES:
        return resources != null && !resources.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MobgenResourceDefinitionImpl
