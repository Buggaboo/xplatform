/**
 */
package nl.sison.dsl.mobgen.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.Mobgen;
import nl.sison.dsl.mobgen.MobgenCallDefinition;
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
 * An implementation of the model object '<em><b>Mobgen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenImpl#getCalls <em>Calls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobgenImpl extends MinimalEObjectImpl.Container implements Mobgen
{
  /**
   * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResources()
   * @generated
   * @ordered
   */
  protected EList<MobgenResourceDefinition> resources;

  /**
   * The cached value of the '{@link #getCalls() <em>Calls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalls()
   * @generated
   * @ordered
   */
  protected EList<MobgenCallDefinition> calls;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MobgenImpl()
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
    return MobgenPackage.Literals.MOBGEN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MobgenResourceDefinition> getResources()
  {
    if (resources == null)
    {
      resources = new EObjectContainmentEList<MobgenResourceDefinition>(MobgenResourceDefinition.class, this, MobgenPackage.MOBGEN__RESOURCES);
    }
    return resources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MobgenCallDefinition> getCalls()
  {
    if (calls == null)
    {
      calls = new EObjectContainmentEList<MobgenCallDefinition>(MobgenCallDefinition.class, this, MobgenPackage.MOBGEN__CALLS);
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
      case MobgenPackage.MOBGEN__RESOURCES:
        return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
      case MobgenPackage.MOBGEN__CALLS:
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
      case MobgenPackage.MOBGEN__RESOURCES:
        return getResources();
      case MobgenPackage.MOBGEN__CALLS:
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
      case MobgenPackage.MOBGEN__RESOURCES:
        getResources().clear();
        getResources().addAll((Collection<? extends MobgenResourceDefinition>)newValue);
        return;
      case MobgenPackage.MOBGEN__CALLS:
        getCalls().clear();
        getCalls().addAll((Collection<? extends MobgenCallDefinition>)newValue);
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
      case MobgenPackage.MOBGEN__RESOURCES:
        getResources().clear();
        return;
      case MobgenPackage.MOBGEN__CALLS:
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
      case MobgenPackage.MOBGEN__RESOURCES:
        return resources != null && !resources.isEmpty();
      case MobgenPackage.MOBGEN__CALLS:
        return calls != null && !calls.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MobgenImpl
