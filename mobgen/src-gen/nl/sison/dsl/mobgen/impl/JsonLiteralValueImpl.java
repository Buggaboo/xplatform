/**
 */
package nl.sison.dsl.mobgen.impl;

import nl.sison.dsl.mobgen.JsonLiteralBoolean;
import nl.sison.dsl.mobgen.JsonLiteralValue;
import nl.sison.dsl.mobgen.JsonMetaScalarType;
import nl.sison.dsl.mobgen.MobgenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Literal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.impl.JsonLiteralValueImpl#getStringType <em>String Type</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.JsonLiteralValueImpl#getBooleanType <em>Boolean Type</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.JsonLiteralValueImpl#getMetaType <em>Meta Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonLiteralValueImpl extends MinimalEObjectImpl.Container implements JsonLiteralValue
{
  /**
   * The default value of the '{@link #getStringType() <em>String Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringType()
   * @generated
   * @ordered
   */
  protected static final String STRING_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringType() <em>String Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringType()
   * @generated
   * @ordered
   */
  protected String stringType = STRING_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getBooleanType() <em>Boolean Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanType()
   * @generated
   * @ordered
   */
  protected static final JsonLiteralBoolean BOOLEAN_TYPE_EDEFAULT = JsonLiteralBoolean.TRUE;

  /**
   * The cached value of the '{@link #getBooleanType() <em>Boolean Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanType()
   * @generated
   * @ordered
   */
  protected JsonLiteralBoolean booleanType = BOOLEAN_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaType()
   * @generated
   * @ordered
   */
  protected static final JsonMetaScalarType META_TYPE_EDEFAULT = JsonMetaScalarType.BOOLEAN;

  /**
   * The cached value of the '{@link #getMetaType() <em>Meta Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaType()
   * @generated
   * @ordered
   */
  protected JsonMetaScalarType metaType = META_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonLiteralValueImpl()
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
    return MobgenPackage.Literals.JSON_LITERAL_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringType()
  {
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringType(String newStringType)
  {
    String oldStringType = stringType;
    stringType = newStringType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.JSON_LITERAL_VALUE__STRING_TYPE, oldStringType, stringType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonLiteralBoolean getBooleanType()
  {
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanType(JsonLiteralBoolean newBooleanType)
  {
    JsonLiteralBoolean oldBooleanType = booleanType;
    booleanType = newBooleanType == null ? BOOLEAN_TYPE_EDEFAULT : newBooleanType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.JSON_LITERAL_VALUE__BOOLEAN_TYPE, oldBooleanType, booleanType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonMetaScalarType getMetaType()
  {
    return metaType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaType(JsonMetaScalarType newMetaType)
  {
    JsonMetaScalarType oldMetaType = metaType;
    metaType = newMetaType == null ? META_TYPE_EDEFAULT : newMetaType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.JSON_LITERAL_VALUE__META_TYPE, oldMetaType, metaType));
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
      case MobgenPackage.JSON_LITERAL_VALUE__STRING_TYPE:
        return getStringType();
      case MobgenPackage.JSON_LITERAL_VALUE__BOOLEAN_TYPE:
        return getBooleanType();
      case MobgenPackage.JSON_LITERAL_VALUE__META_TYPE:
        return getMetaType();
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
      case MobgenPackage.JSON_LITERAL_VALUE__STRING_TYPE:
        setStringType((String)newValue);
        return;
      case MobgenPackage.JSON_LITERAL_VALUE__BOOLEAN_TYPE:
        setBooleanType((JsonLiteralBoolean)newValue);
        return;
      case MobgenPackage.JSON_LITERAL_VALUE__META_TYPE:
        setMetaType((JsonMetaScalarType)newValue);
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
      case MobgenPackage.JSON_LITERAL_VALUE__STRING_TYPE:
        setStringType(STRING_TYPE_EDEFAULT);
        return;
      case MobgenPackage.JSON_LITERAL_VALUE__BOOLEAN_TYPE:
        setBooleanType(BOOLEAN_TYPE_EDEFAULT);
        return;
      case MobgenPackage.JSON_LITERAL_VALUE__META_TYPE:
        setMetaType(META_TYPE_EDEFAULT);
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
      case MobgenPackage.JSON_LITERAL_VALUE__STRING_TYPE:
        return STRING_TYPE_EDEFAULT == null ? stringType != null : !STRING_TYPE_EDEFAULT.equals(stringType);
      case MobgenPackage.JSON_LITERAL_VALUE__BOOLEAN_TYPE:
        return booleanType != BOOLEAN_TYPE_EDEFAULT;
      case MobgenPackage.JSON_LITERAL_VALUE__META_TYPE:
        return metaType != META_TYPE_EDEFAULT;
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
    result.append(" (stringType: ");
    result.append(stringType);
    result.append(", booleanType: ");
    result.append(booleanType);
    result.append(", metaType: ");
    result.append(metaType);
    result.append(')');
    return result.toString();
  }

} //JsonLiteralValueImpl
