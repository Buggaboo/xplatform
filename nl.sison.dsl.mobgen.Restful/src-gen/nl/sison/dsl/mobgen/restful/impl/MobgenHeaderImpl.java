/**
 */
package nl.sison.dsl.mobgen.restful.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.restful.MobgenHeader;
import nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair;
import nl.sison.dsl.mobgen.restful.RestfulPackage;

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
 * An implementation of the model object '<em><b>Mobgen Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.MobgenHeaderImpl#getHeaderKeyValues <em>Header Key Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobgenHeaderImpl extends MinimalEObjectImpl.Container implements MobgenHeader
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeaderKeyValues() <em>Header Key Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderKeyValues()
   * @generated
   * @ordered
   */
  protected EList<MobgenHeaderKeyValuePair> headerKeyValues;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MobgenHeaderImpl()
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
    return RestfulPackage.Literals.MOBGEN_HEADER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.MOBGEN_HEADER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MobgenHeaderKeyValuePair> getHeaderKeyValues()
  {
    if (headerKeyValues == null)
    {
      headerKeyValues = new EObjectContainmentEList<MobgenHeaderKeyValuePair>(MobgenHeaderKeyValuePair.class, this, RestfulPackage.MOBGEN_HEADER__HEADER_KEY_VALUES);
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
      case RestfulPackage.MOBGEN_HEADER__HEADER_KEY_VALUES:
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
      case RestfulPackage.MOBGEN_HEADER__NAME:
        return getName();
      case RestfulPackage.MOBGEN_HEADER__HEADER_KEY_VALUES:
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
      case RestfulPackage.MOBGEN_HEADER__NAME:
        setName((String)newValue);
        return;
      case RestfulPackage.MOBGEN_HEADER__HEADER_KEY_VALUES:
        getHeaderKeyValues().clear();
        getHeaderKeyValues().addAll((Collection<? extends MobgenHeaderKeyValuePair>)newValue);
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
      case RestfulPackage.MOBGEN_HEADER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RestfulPackage.MOBGEN_HEADER__HEADER_KEY_VALUES:
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
      case RestfulPackage.MOBGEN_HEADER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RestfulPackage.MOBGEN_HEADER__HEADER_KEY_VALUES:
        return headerKeyValues != null && !headerKeyValues.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MobgenHeaderImpl
