/**
 */
package nl.sison.dsl.mobgen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Json Composite Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonCompositeValue()
 * @model
 * @generated
 */
public enum JsonCompositeValue implements Enumerator
{
  /**
   * The '<em><b>Json Object</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JSON_OBJECT_VALUE
   * @generated
   * @ordered
   */
  JSON_OBJECT(0, "JsonObject", "JsonObject"),

  /**
   * The '<em><b>Json Array</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JSON_ARRAY_VALUE
   * @generated
   * @ordered
   */
  JSON_ARRAY(1, "JsonArray", "JsonArray");

  /**
   * The '<em><b>Json Object</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Json Object</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JSON_OBJECT
   * @model name="JsonObject"
   * @generated
   * @ordered
   */
  public static final int JSON_OBJECT_VALUE = 0;

  /**
   * The '<em><b>Json Array</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Json Array</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JSON_ARRAY
   * @model name="JsonArray"
   * @generated
   * @ordered
   */
  public static final int JSON_ARRAY_VALUE = 1;

  /**
   * An array of all the '<em><b>Json Composite Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JsonCompositeValue[] VALUES_ARRAY =
    new JsonCompositeValue[]
    {
      JSON_OBJECT,
      JSON_ARRAY,
    };

  /**
   * A public read-only list of all the '<em><b>Json Composite Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JsonCompositeValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Json Composite Value</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonCompositeValue get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JsonCompositeValue result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Json Composite Value</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonCompositeValue getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JsonCompositeValue result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Json Composite Value</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonCompositeValue get(int value)
  {
    switch (value)
    {
      case JSON_OBJECT_VALUE: return JSON_OBJECT;
      case JSON_ARRAY_VALUE: return JSON_ARRAY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private JsonCompositeValue(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //JsonCompositeValue
