/**
 */
package nl.sison.dsl.mobgen.jsonGen.impl;

import nl.sison.dsl.mobgen.jsonGen.ExJsonEnum;
import nl.sison.dsl.mobgen.jsonGen.JsonArray;
import nl.sison.dsl.mobgen.jsonGen.JsonGenPackage;
import nl.sison.dsl.mobgen.jsonGen.JsonNumber;
import nl.sison.dsl.mobgen.jsonGen.JsonObject;
import nl.sison.dsl.mobgen.jsonGen.JsonValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#getObj <em>Obj</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#getStr <em>Str</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#getArray <em>Array</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#isNull <em>Null</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#getStrFromEnum <em>Str From Enum</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.impl.JsonValueImpl#getDatetime <em>Datetime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonValueImpl extends MinimalEObjectImpl.Container implements JsonValue
{
  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected JsonObject obj;

  /**
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected JsonArray array;

  /**
   * The default value of the '{@link #isBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBool()
   * @generated
   * @ordered
   */
  protected static final boolean BOOL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBool()
   * @generated
   * @ordered
   */
  protected boolean bool = BOOL_EDEFAULT;

  /**
   * The default value of the '{@link #isNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNull()
   * @generated
   * @ordered
   */
  protected static final boolean NULL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNull()
   * @generated
   * @ordered
   */
  protected boolean null_ = NULL_EDEFAULT;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected JsonNumber number;

  /**
   * The cached value of the '{@link #getStrFromEnum() <em>Str From Enum</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrFromEnum()
   * @generated
   * @ordered
   */
  protected ExJsonEnum strFromEnum;

  /**
   * The default value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatetime()
   * @generated
   * @ordered
   */
  protected static final String DATETIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatetime() <em>Datetime</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatetime()
   * @generated
   * @ordered
   */
  protected String datetime = DATETIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonValueImpl()
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
    return JsonGenPackage.Literals.JSON_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonObject getObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObj(JsonObject newObj, NotificationChain msgs)
  {
    JsonObject oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__OBJ, oldObj, newObj);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObj(JsonObject newObj)
  {
    if (newObj != obj)
    {
      NotificationChain msgs = null;
      if (obj != null)
        msgs = ((InternalEObject)obj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__OBJ, null, msgs);
      if (newObj != null)
        msgs = ((InternalEObject)newObj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__OBJ, null, msgs);
      msgs = basicSetObj(newObj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__OBJ, newObj, newObj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__STR, oldStr, str));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonArray getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(JsonArray newArray, NotificationChain msgs)
  {
    JsonArray oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(JsonArray newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__ARRAY, newArray, newArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBool(boolean newBool)
  {
    boolean oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__BOOL, oldBool, bool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(boolean newNull)
  {
    boolean oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__NULL, oldNull, null_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JsonNumber getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(JsonNumber newNumber, NotificationChain msgs)
  {
    JsonNumber oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(JsonNumber newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExJsonEnum getStrFromEnum()
  {
    return strFromEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrFromEnum(ExJsonEnum newStrFromEnum, NotificationChain msgs)
  {
    ExJsonEnum oldStrFromEnum = strFromEnum;
    strFromEnum = newStrFromEnum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__STR_FROM_ENUM, oldStrFromEnum, newStrFromEnum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStrFromEnum(ExJsonEnum newStrFromEnum)
  {
    if (newStrFromEnum != strFromEnum)
    {
      NotificationChain msgs = null;
      if (strFromEnum != null)
        msgs = ((InternalEObject)strFromEnum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__STR_FROM_ENUM, null, msgs);
      if (newStrFromEnum != null)
        msgs = ((InternalEObject)newStrFromEnum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonGenPackage.JSON_VALUE__STR_FROM_ENUM, null, msgs);
      msgs = basicSetStrFromEnum(newStrFromEnum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__STR_FROM_ENUM, newStrFromEnum, newStrFromEnum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDatetime()
  {
    return datetime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatetime(String newDatetime)
  {
    String oldDatetime = datetime;
    datetime = newDatetime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonGenPackage.JSON_VALUE__DATETIME, oldDatetime, datetime));
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
      case JsonGenPackage.JSON_VALUE__OBJ:
        return basicSetObj(null, msgs);
      case JsonGenPackage.JSON_VALUE__ARRAY:
        return basicSetArray(null, msgs);
      case JsonGenPackage.JSON_VALUE__NUMBER:
        return basicSetNumber(null, msgs);
      case JsonGenPackage.JSON_VALUE__STR_FROM_ENUM:
        return basicSetStrFromEnum(null, msgs);
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
      case JsonGenPackage.JSON_VALUE__OBJ:
        return getObj();
      case JsonGenPackage.JSON_VALUE__STR:
        return getStr();
      case JsonGenPackage.JSON_VALUE__ARRAY:
        return getArray();
      case JsonGenPackage.JSON_VALUE__BOOL:
        return isBool();
      case JsonGenPackage.JSON_VALUE__NULL:
        return isNull();
      case JsonGenPackage.JSON_VALUE__NUMBER:
        return getNumber();
      case JsonGenPackage.JSON_VALUE__STR_FROM_ENUM:
        return getStrFromEnum();
      case JsonGenPackage.JSON_VALUE__DATETIME:
        return getDatetime();
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
      case JsonGenPackage.JSON_VALUE__OBJ:
        setObj((JsonObject)newValue);
        return;
      case JsonGenPackage.JSON_VALUE__STR:
        setStr((String)newValue);
        return;
      case JsonGenPackage.JSON_VALUE__ARRAY:
        setArray((JsonArray)newValue);
        return;
      case JsonGenPackage.JSON_VALUE__BOOL:
        setBool((Boolean)newValue);
        return;
      case JsonGenPackage.JSON_VALUE__NULL:
        setNull((Boolean)newValue);
        return;
      case JsonGenPackage.JSON_VALUE__NUMBER:
        setNumber((JsonNumber)newValue);
        return;
      case JsonGenPackage.JSON_VALUE__STR_FROM_ENUM:
        setStrFromEnum((ExJsonEnum)newValue);
        return;
      case JsonGenPackage.JSON_VALUE__DATETIME:
        setDatetime((String)newValue);
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
      case JsonGenPackage.JSON_VALUE__OBJ:
        setObj((JsonObject)null);
        return;
      case JsonGenPackage.JSON_VALUE__STR:
        setStr(STR_EDEFAULT);
        return;
      case JsonGenPackage.JSON_VALUE__ARRAY:
        setArray((JsonArray)null);
        return;
      case JsonGenPackage.JSON_VALUE__BOOL:
        setBool(BOOL_EDEFAULT);
        return;
      case JsonGenPackage.JSON_VALUE__NULL:
        setNull(NULL_EDEFAULT);
        return;
      case JsonGenPackage.JSON_VALUE__NUMBER:
        setNumber((JsonNumber)null);
        return;
      case JsonGenPackage.JSON_VALUE__STR_FROM_ENUM:
        setStrFromEnum((ExJsonEnum)null);
        return;
      case JsonGenPackage.JSON_VALUE__DATETIME:
        setDatetime(DATETIME_EDEFAULT);
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
      case JsonGenPackage.JSON_VALUE__OBJ:
        return obj != null;
      case JsonGenPackage.JSON_VALUE__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
      case JsonGenPackage.JSON_VALUE__ARRAY:
        return array != null;
      case JsonGenPackage.JSON_VALUE__BOOL:
        return bool != BOOL_EDEFAULT;
      case JsonGenPackage.JSON_VALUE__NULL:
        return null_ != NULL_EDEFAULT;
      case JsonGenPackage.JSON_VALUE__NUMBER:
        return number != null;
      case JsonGenPackage.JSON_VALUE__STR_FROM_ENUM:
        return strFromEnum != null;
      case JsonGenPackage.JSON_VALUE__DATETIME:
        return DATETIME_EDEFAULT == null ? datetime != null : !DATETIME_EDEFAULT.equals(datetime);
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
    result.append(" (str: ");
    result.append(str);
    result.append(", bool: ");
    result.append(bool);
    result.append(", null: ");
    result.append(null_);
    result.append(", datetime: ");
    result.append(datetime);
    result.append(')');
    return result.toString();
  }

} //JsonValueImpl
