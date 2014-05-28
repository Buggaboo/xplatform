/**
 */
package nl.sison.dsl.mobgen.restful.impl;

import nl.sison.dsl.mobgen.restful.JsonLiteralBoolean;
import nl.sison.dsl.mobgen.restful.JsonLiteralValue;
import nl.sison.dsl.mobgen.restful.JsonMetaScalarType;
import nl.sison.dsl.mobgen.restful.RestfulPackage;

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
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#isLiteralString <em>Literal String</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#isEmptyObject <em>Empty Object</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#isEmptyArray <em>Empty Array</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#isLiteralNull <em>Literal Null</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#isNumberFloat <em>Number Float</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#isNumberInteger <em>Number Integer</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#isEnumType <em>Enum Type</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#getBooleanValue <em>Boolean Value</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.JsonLiteralValueImpl#getMetaScalarValue <em>Meta Scalar Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonLiteralValueImpl extends MinimalEObjectImpl.Container implements JsonLiteralValue
{
  /**
   * The default value of the '{@link #isLiteralString() <em>Literal String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLiteralString()
   * @generated
   * @ordered
   */
  protected static final boolean LITERAL_STRING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLiteralString() <em>Literal String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLiteralString()
   * @generated
   * @ordered
   */
  protected boolean literalString = LITERAL_STRING_EDEFAULT;

  /**
   * The default value of the '{@link #isEmptyObject() <em>Empty Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyObject()
   * @generated
   * @ordered
   */
  protected static final boolean EMPTY_OBJECT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmptyObject() <em>Empty Object</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyObject()
   * @generated
   * @ordered
   */
  protected boolean emptyObject = EMPTY_OBJECT_EDEFAULT;

  /**
   * The default value of the '{@link #isEmptyArray() <em>Empty Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyArray()
   * @generated
   * @ordered
   */
  protected static final boolean EMPTY_ARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmptyArray() <em>Empty Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmptyArray()
   * @generated
   * @ordered
   */
  protected boolean emptyArray = EMPTY_ARRAY_EDEFAULT;

  /**
   * The default value of the '{@link #isLiteralNull() <em>Literal Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLiteralNull()
   * @generated
   * @ordered
   */
  protected static final boolean LITERAL_NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLiteralNull() <em>Literal Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLiteralNull()
   * @generated
   * @ordered
   */
  protected boolean literalNull = LITERAL_NULL_EDEFAULT;

  /**
   * The default value of the '{@link #isNumberFloat() <em>Number Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNumberFloat()
   * @generated
   * @ordered
   */
  protected static final boolean NUMBER_FLOAT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNumberFloat() <em>Number Float</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNumberFloat()
   * @generated
   * @ordered
   */
  protected boolean numberFloat = NUMBER_FLOAT_EDEFAULT;

  /**
   * The default value of the '{@link #isNumberInteger() <em>Number Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNumberInteger()
   * @generated
   * @ordered
   */
  protected static final boolean NUMBER_INTEGER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNumberInteger() <em>Number Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNumberInteger()
   * @generated
   * @ordered
   */
  protected boolean numberInteger = NUMBER_INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #isEnumType() <em>Enum Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnumType()
   * @generated
   * @ordered
   */
  protected static final boolean ENUM_TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnumType() <em>Enum Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnumType()
   * @generated
   * @ordered
   */
  protected boolean enumType = ENUM_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected static final JsonLiteralBoolean BOOLEAN_VALUE_EDEFAULT = JsonLiteralBoolean.TRUE;

  /**
   * The cached value of the '{@link #getBooleanValue() <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBooleanValue()
   * @generated
   * @ordered
   */
  protected JsonLiteralBoolean booleanValue = BOOLEAN_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getMetaScalarValue() <em>Meta Scalar Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaScalarValue()
   * @generated
   * @ordered
   */
  protected static final JsonMetaScalarType META_SCALAR_VALUE_EDEFAULT = JsonMetaScalarType.BOOLEAN;

  /**
   * The cached value of the '{@link #getMetaScalarValue() <em>Meta Scalar Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaScalarValue()
   * @generated
   * @ordered
   */
  protected JsonMetaScalarType metaScalarValue = META_SCALAR_VALUE_EDEFAULT;

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
    return RestfulPackage.Literals.JSON_LITERAL_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLiteralString()
  {
    return literalString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralString(boolean newLiteralString)
  {
    boolean oldLiteralString = literalString;
    literalString = newLiteralString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__LITERAL_STRING, oldLiteralString, literalString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmptyObject()
  {
    return emptyObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptyObject(boolean newEmptyObject)
  {
    boolean oldEmptyObject = emptyObject;
    emptyObject = newEmptyObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__EMPTY_OBJECT, oldEmptyObject, emptyObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmptyArray()
  {
    return emptyArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmptyArray(boolean newEmptyArray)
  {
    boolean oldEmptyArray = emptyArray;
    emptyArray = newEmptyArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__EMPTY_ARRAY, oldEmptyArray, emptyArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLiteralNull()
  {
    return literalNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteralNull(boolean newLiteralNull)
  {
    boolean oldLiteralNull = literalNull;
    literalNull = newLiteralNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__LITERAL_NULL, oldLiteralNull, literalNull));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNumberFloat()
  {
    return numberFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberFloat(boolean newNumberFloat)
  {
    boolean oldNumberFloat = numberFloat;
    numberFloat = newNumberFloat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__NUMBER_FLOAT, oldNumberFloat, numberFloat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNumberInteger()
  {
    return numberInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumberInteger(boolean newNumberInteger)
  {
    boolean oldNumberInteger = numberInteger;
    numberInteger = newNumberInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__NUMBER_INTEGER, oldNumberInteger, numberInteger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnumType()
  {
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumType(boolean newEnumType)
  {
    boolean oldEnumType = enumType;
    enumType = newEnumType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__ENUM_TYPE, oldEnumType, enumType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonLiteralBoolean getBooleanValue()
  {
    return booleanValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBooleanValue(JsonLiteralBoolean newBooleanValue)
  {
    JsonLiteralBoolean oldBooleanValue = booleanValue;
    booleanValue = newBooleanValue == null ? BOOLEAN_VALUE_EDEFAULT : newBooleanValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__BOOLEAN_VALUE, oldBooleanValue, booleanValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonMetaScalarType getMetaScalarValue()
  {
    return metaScalarValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaScalarValue(JsonMetaScalarType newMetaScalarValue)
  {
    JsonMetaScalarType oldMetaScalarValue = metaScalarValue;
    metaScalarValue = newMetaScalarValue == null ? META_SCALAR_VALUE_EDEFAULT : newMetaScalarValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.JSON_LITERAL_VALUE__META_SCALAR_VALUE, oldMetaScalarValue, metaScalarValue));
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
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_STRING:
        return isLiteralString();
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_OBJECT:
        return isEmptyObject();
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_ARRAY:
        return isEmptyArray();
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_NULL:
        return isLiteralNull();
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_FLOAT:
        return isNumberFloat();
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_INTEGER:
        return isNumberInteger();
      case RestfulPackage.JSON_LITERAL_VALUE__ENUM_TYPE:
        return isEnumType();
      case RestfulPackage.JSON_LITERAL_VALUE__BOOLEAN_VALUE:
        return getBooleanValue();
      case RestfulPackage.JSON_LITERAL_VALUE__META_SCALAR_VALUE:
        return getMetaScalarValue();
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
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_STRING:
        setLiteralString((Boolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_OBJECT:
        setEmptyObject((Boolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_ARRAY:
        setEmptyArray((Boolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_NULL:
        setLiteralNull((Boolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_FLOAT:
        setNumberFloat((Boolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_INTEGER:
        setNumberInteger((Boolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__ENUM_TYPE:
        setEnumType((Boolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__BOOLEAN_VALUE:
        setBooleanValue((JsonLiteralBoolean)newValue);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__META_SCALAR_VALUE:
        setMetaScalarValue((JsonMetaScalarType)newValue);
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
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_STRING:
        setLiteralString(LITERAL_STRING_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_OBJECT:
        setEmptyObject(EMPTY_OBJECT_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_ARRAY:
        setEmptyArray(EMPTY_ARRAY_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_NULL:
        setLiteralNull(LITERAL_NULL_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_FLOAT:
        setNumberFloat(NUMBER_FLOAT_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_INTEGER:
        setNumberInteger(NUMBER_INTEGER_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__ENUM_TYPE:
        setEnumType(ENUM_TYPE_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__BOOLEAN_VALUE:
        setBooleanValue(BOOLEAN_VALUE_EDEFAULT);
        return;
      case RestfulPackage.JSON_LITERAL_VALUE__META_SCALAR_VALUE:
        setMetaScalarValue(META_SCALAR_VALUE_EDEFAULT);
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
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_STRING:
        return literalString != LITERAL_STRING_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_OBJECT:
        return emptyObject != EMPTY_OBJECT_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__EMPTY_ARRAY:
        return emptyArray != EMPTY_ARRAY_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__LITERAL_NULL:
        return literalNull != LITERAL_NULL_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_FLOAT:
        return numberFloat != NUMBER_FLOAT_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__NUMBER_INTEGER:
        return numberInteger != NUMBER_INTEGER_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__ENUM_TYPE:
        return enumType != ENUM_TYPE_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__BOOLEAN_VALUE:
        return booleanValue != BOOLEAN_VALUE_EDEFAULT;
      case RestfulPackage.JSON_LITERAL_VALUE__META_SCALAR_VALUE:
        return metaScalarValue != META_SCALAR_VALUE_EDEFAULT;
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
    result.append(" (literalString: ");
    result.append(literalString);
    result.append(", emptyObject: ");
    result.append(emptyObject);
    result.append(", emptyArray: ");
    result.append(emptyArray);
    result.append(", literalNull: ");
    result.append(literalNull);
    result.append(", numberFloat: ");
    result.append(numberFloat);
    result.append(", numberInteger: ");
    result.append(numberInteger);
    result.append(", enumType: ");
    result.append(enumType);
    result.append(", booleanValue: ");
    result.append(booleanValue);
    result.append(", metaScalarValue: ");
    result.append(metaScalarValue);
    result.append(')');
    return result.toString();
  }

} //JsonLiteralValueImpl
