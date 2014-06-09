/**
 */
package nl.sison.dsl.mobgen.jsonGen.impl;

import nl.sison.dsl.mobgen.jsonGen.ExJsonDateTime;
import nl.sison.dsl.mobgen.jsonGen.JsonGenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ex Json Date Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.ExJsonDateTimeImpl#isUtc <em>Utc</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.ExJsonDateTimeImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExJsonDateTimeImpl extends MinimalEObjectImpl.Container implements ExJsonDateTime
{
  /**
   * The default value of the '{@link #isUtc() <em>Utc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUtc()
   * @generated
   * @ordered
   */
  protected static final boolean UTC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUtc() <em>Utc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUtc()
   * @generated
   * @ordered
   */
  protected boolean utc = UTC_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExJsonDateTimeImpl()
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
    return JsonGenPackage.Literals.EX_JSON_DATE_TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUtc()
  {
    return utc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUtc(boolean newUtc)
  {
    boolean oldUtc = utc;
    utc = newUtc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.EX_JSON_DATE_TIME__UTC, oldUtc, utc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.EX_JSON_DATE_TIME__FORMAT, oldFormat, format));
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
      case JsonGenPackage.EX_JSON_DATE_TIME__UTC:
        return isUtc();
      case JsonGenPackage.EX_JSON_DATE_TIME__FORMAT:
        return getFormat();
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
      case JsonGenPackage.EX_JSON_DATE_TIME__UTC:
        setUtc((Boolean)newValue);
        return;
      case JsonGenPackage.EX_JSON_DATE_TIME__FORMAT:
        setFormat((String)newValue);
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
      case JsonGenPackage.EX_JSON_DATE_TIME__UTC:
        setUtc(UTC_EDEFAULT);
        return;
      case JsonGenPackage.EX_JSON_DATE_TIME__FORMAT:
        setFormat(FORMAT_EDEFAULT);
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
      case JsonGenPackage.EX_JSON_DATE_TIME__UTC:
        return utc != UTC_EDEFAULT;
      case JsonGenPackage.EX_JSON_DATE_TIME__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
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
    result.append(" (utc: ");
    result.append(utc);
    result.append(", format: ");
    result.append(format);
    result.append(')');
    return result.toString();
  }

} //ExJsonDateTimeImpl
