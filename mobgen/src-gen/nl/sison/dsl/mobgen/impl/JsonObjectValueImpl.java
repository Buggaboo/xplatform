/**
 */
package nl.sison.dsl.mobgen.impl;

import nl.sison.dsl.mobgen.JsonCompositeValue;
import nl.sison.dsl.mobgen.JsonLiteralValue;
import nl.sison.dsl.mobgen.JsonObjectValue;
import nl.sison.dsl.mobgen.MobgenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Object Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.impl.JsonObjectValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.JsonObjectValueImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonObjectValueImpl extends MinimalEObjectImpl.Container implements JsonObjectValue
{
  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final JsonLiteralValue VALUE_EDEFAULT = JsonLiteralValue.STRING;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected JsonLiteralValue value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getComposite() <em>Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected static final JsonCompositeValue COMPOSITE_EDEFAULT = JsonCompositeValue.JSON_OBJECT;

  /**
   * The cached value of the '{@link #getComposite() <em>Composite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected JsonCompositeValue composite = COMPOSITE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonObjectValueImpl()
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
    return MobgenPackage.Literals.JSON_OBJECT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonLiteralValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(JsonLiteralValue newValue)
  {
    JsonLiteralValue oldValue = value;
    value = newValue == null ? VALUE_EDEFAULT : newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.JSON_OBJECT_VALUE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonCompositeValue getComposite()
  {
    return composite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComposite(JsonCompositeValue newComposite)
  {
    JsonCompositeValue oldComposite = composite;
    composite = newComposite == null ? COMPOSITE_EDEFAULT : newComposite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.JSON_OBJECT_VALUE__COMPOSITE, oldComposite, composite));
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
      case MobgenPackage.JSON_OBJECT_VALUE__VALUE:
        return getValue();
      case MobgenPackage.JSON_OBJECT_VALUE__COMPOSITE:
        return getComposite();
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
      case MobgenPackage.JSON_OBJECT_VALUE__VALUE:
        setValue((JsonLiteralValue)newValue);
        return;
      case MobgenPackage.JSON_OBJECT_VALUE__COMPOSITE:
        setComposite((JsonCompositeValue)newValue);
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
      case MobgenPackage.JSON_OBJECT_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case MobgenPackage.JSON_OBJECT_VALUE__COMPOSITE:
        setComposite(COMPOSITE_EDEFAULT);
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
      case MobgenPackage.JSON_OBJECT_VALUE__VALUE:
        return value != VALUE_EDEFAULT;
      case MobgenPackage.JSON_OBJECT_VALUE__COMPOSITE:
        return composite != COMPOSITE_EDEFAULT;
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
    result.append(" (value: ");
    result.append(value);
    result.append(", composite: ");
    result.append(composite);
    result.append(')');
    return result.toString();
  }

} //JsonObjectValueImpl
