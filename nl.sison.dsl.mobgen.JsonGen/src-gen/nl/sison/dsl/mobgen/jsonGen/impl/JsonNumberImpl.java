/**
 */
package nl.sison.dsl.mobgen.jsonGen.impl;

import nl.sison.dsl.mobgen.jsonGen.JsonGenPackage;
import nl.sison.dsl.mobgen.jsonGen.JsonNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl#isFloat <em>Float</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl#isExp <em>Exp</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonNumberImpl#getExpValue <em>Exp Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonNumberImpl extends MinimalEObjectImpl.Container implements JsonNumber
{
  /**
   * The default value of the '{@link #isFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFloat()
   * @generated
   * @ordered
   */
  protected static final boolean FLOAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFloat() <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFloat()
   * @generated
   * @ordered
   */
  protected boolean float_ = FLOAT_EDEFAULT;

  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #isExp() <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExp()
   * @generated
   * @ordered
   */
  protected static final boolean EXP_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExp() <em>Exp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExp()
   * @generated
   * @ordered
   */
  protected boolean exp = EXP_EDEFAULT;

  /**
   * The default value of the '{@link #getExpValue() <em>Exp Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpValue()
   * @generated
   * @ordered
   */
  protected static final int EXP_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getExpValue() <em>Exp Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpValue()
   * @generated
   * @ordered
   */
  protected int expValue = EXP_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonNumberImpl()
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
    return JsonGenPackage.Literals.JSON_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFloat()
  {
    return float_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFloat(boolean newFloat)
  {
    boolean oldFloat = float_;
    float_ = newFloat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_NUMBER__FLOAT, oldFloat, float_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_NUMBER__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(boolean newExp)
  {
    boolean oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_NUMBER__EXP, oldExp, exp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getExpValue()
  {
    return expValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpValue(int newExpValue)
  {
    int oldExpValue = expValue;
    expValue = newExpValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_NUMBER__EXP_VALUE, oldExpValue, expValue));
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
      case JsonGenPackage.JSON_NUMBER__FLOAT:
        return isFloat();
      case JsonGenPackage.JSON_NUMBER__INT_VALUE:
        return getIntValue();
      case JsonGenPackage.JSON_NUMBER__EXP:
        return isExp();
      case JsonGenPackage.JSON_NUMBER__EXP_VALUE:
        return getExpValue();
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
      case JsonGenPackage.JSON_NUMBER__FLOAT:
        setFloat((Boolean)newValue);
        return;
      case JsonGenPackage.JSON_NUMBER__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case JsonGenPackage.JSON_NUMBER__EXP:
        setExp((Boolean)newValue);
        return;
      case JsonGenPackage.JSON_NUMBER__EXP_VALUE:
        setExpValue((Integer)newValue);
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
      case JsonGenPackage.JSON_NUMBER__FLOAT:
        setFloat(FLOAT_EDEFAULT);
        return;
      case JsonGenPackage.JSON_NUMBER__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case JsonGenPackage.JSON_NUMBER__EXP:
        setExp(EXP_EDEFAULT);
        return;
      case JsonGenPackage.JSON_NUMBER__EXP_VALUE:
        setExpValue(EXP_VALUE_EDEFAULT);
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
      case JsonGenPackage.JSON_NUMBER__FLOAT:
        return float_ != FLOAT_EDEFAULT;
      case JsonGenPackage.JSON_NUMBER__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case JsonGenPackage.JSON_NUMBER__EXP:
        return exp != EXP_EDEFAULT;
      case JsonGenPackage.JSON_NUMBER__EXP_VALUE:
        return expValue != EXP_VALUE_EDEFAULT;
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
    result.append(" (float: ");
    result.append(float_);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(", exp: ");
    result.append(exp);
    result.append(", expValue: ");
    result.append(expValue);
    result.append(')');
    return result.toString();
  }

} //JsonNumberImpl
