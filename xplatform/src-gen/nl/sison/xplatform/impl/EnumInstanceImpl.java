/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.EnumInstance;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.EnumInstanceImpl#getEnumName <em>Enum Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumInstanceImpl extends TypeImpl implements EnumInstance
{
  /**
   * The default value of the '{@link #getEnumName() <em>Enum Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumName()
   * @generated
   * @ordered
   */
  protected static final String ENUM_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnumName() <em>Enum Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumName()
   * @generated
   * @ordered
   */
  protected String enumName = ENUM_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumInstanceImpl()
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
    return XplatformPackage.Literals.ENUM_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnumName()
  {
    return enumName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumName(String newEnumName)
  {
    String oldEnumName = enumName;
    enumName = newEnumName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.ENUM_INSTANCE__ENUM_NAME, oldEnumName, enumName));
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
      case XplatformPackage.ENUM_INSTANCE__ENUM_NAME:
        return getEnumName();
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
      case XplatformPackage.ENUM_INSTANCE__ENUM_NAME:
        setEnumName((String)newValue);
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
      case XplatformPackage.ENUM_INSTANCE__ENUM_NAME:
        setEnumName(ENUM_NAME_EDEFAULT);
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
      case XplatformPackage.ENUM_INSTANCE__ENUM_NAME:
        return ENUM_NAME_EDEFAULT == null ? enumName != null : !ENUM_NAME_EDEFAULT.equals(enumName);
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
    result.append(" (enumName: ");
    result.append(enumName);
    result.append(')');
    return result.toString();
  }

} //EnumInstanceImpl
