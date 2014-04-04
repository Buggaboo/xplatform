/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.MapInstance;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.MapInstanceImpl#getMapName <em>Map Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapInstanceImpl extends TypeImpl implements MapInstance
{
  /**
   * The default value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapName()
   * @generated
   * @ordered
   */
  protected static final String MAP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapName() <em>Map Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapName()
   * @generated
   * @ordered
   */
  protected String mapName = MAP_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapInstanceImpl()
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
    return XplatformPackage.Literals.MAP_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMapName()
  {
    return mapName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapName(String newMapName)
  {
    String oldMapName = mapName;
    mapName = newMapName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.MAP_INSTANCE__MAP_NAME, oldMapName, mapName));
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
      case XplatformPackage.MAP_INSTANCE__MAP_NAME:
        return getMapName();
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
      case XplatformPackage.MAP_INSTANCE__MAP_NAME:
        setMapName((String)newValue);
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
      case XplatformPackage.MAP_INSTANCE__MAP_NAME:
        setMapName(MAP_NAME_EDEFAULT);
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
      case XplatformPackage.MAP_INSTANCE__MAP_NAME:
        return MAP_NAME_EDEFAULT == null ? mapName != null : !MAP_NAME_EDEFAULT.equals(mapName);
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
    result.append(" (mapName: ");
    result.append(mapName);
    result.append(')');
    return result.toString();
  }

} //MapInstanceImpl
