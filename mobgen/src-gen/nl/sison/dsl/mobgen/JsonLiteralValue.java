/**
 */
package nl.sison.dsl.mobgen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Json Literal Value</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonLiteralValue()
 * @model
 * @generated
 */
public enum JsonLiteralValue implements Enumerator
{
  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "STRING", "STRING"),

  /**
   * The '<em><b>EMPTY JSON OBJECT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMPTY_JSON_OBJECT_VALUE
   * @generated
   * @ordered
   */
  EMPTY_JSON_OBJECT(1, "EMPTY_JSON_OBJECT", "EMPTY_JSON_OBJECT"),

  /**
   * The '<em><b>EMPTY JSON ARRAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMPTY_JSON_ARRAY_VALUE
   * @generated
   * @ordered
   */
  EMPTY_JSON_ARRAY(2, "EMPTY_JSON_ARRAY", "EMPTY_JSON_ARRAY"),

  /**
   * The '<em><b>JSON LITERAL BOOLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JSON_LITERAL_BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  JSON_LITERAL_BOOLEAN(3, "JSON_LITERAL_BOOLEAN", "JSON_LITERAL_BOOLEAN"),

  /**
   * The '<em><b>JSON LITERAL NULL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JSON_LITERAL_NULL_VALUE
   * @generated
   * @ordered
   */
  JSON_LITERAL_NULL(4, "JSON_LITERAL_NULL", "JSON_LITERAL_NULL"),

  /**
   * The '<em><b>JSON NUMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JSON_NUMBER_VALUE
   * @generated
   * @ordered
   */
  JSON_NUMBER(5, "JSON_NUMBER", "JSON_NUMBER"),

  /**
   * The '<em><b>JSON META SCALAR TYPE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JSON_META_SCALAR_TYPE_VALUE
   * @generated
   * @ordered
   */
  JSON_META_SCALAR_TYPE(6, "JSON_META_SCALAR_TYPE", "JSON_META_SCALAR_TYPE");

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>EMPTY JSON OBJECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EMPTY JSON OBJECT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMPTY_JSON_OBJECT
   * @model
   * @generated
   * @ordered
   */
  public static final int EMPTY_JSON_OBJECT_VALUE = 1;

  /**
   * The '<em><b>EMPTY JSON ARRAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EMPTY JSON ARRAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMPTY_JSON_ARRAY
   * @model
   * @generated
   * @ordered
   */
  public static final int EMPTY_JSON_ARRAY_VALUE = 2;

  /**
   * The '<em><b>JSON LITERAL BOOLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JSON LITERAL BOOLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JSON_LITERAL_BOOLEAN
   * @model
   * @generated
   * @ordered
   */
  public static final int JSON_LITERAL_BOOLEAN_VALUE = 3;

  /**
   * The '<em><b>JSON LITERAL NULL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JSON LITERAL NULL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JSON_LITERAL_NULL
   * @model
   * @generated
   * @ordered
   */
  public static final int JSON_LITERAL_NULL_VALUE = 4;

  /**
   * The '<em><b>JSON NUMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JSON NUMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JSON_NUMBER
   * @model
   * @generated
   * @ordered
   */
  public static final int JSON_NUMBER_VALUE = 5;

  /**
   * The '<em><b>JSON META SCALAR TYPE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JSON META SCALAR TYPE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JSON_META_SCALAR_TYPE
   * @model
   * @generated
   * @ordered
   */
  public static final int JSON_META_SCALAR_TYPE_VALUE = 6;

  /**
   * An array of all the '<em><b>Json Literal Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final JsonLiteralValue[] VALUES_ARRAY =
    new JsonLiteralValue[]
    {
      STRING,
      EMPTY_JSON_OBJECT,
      EMPTY_JSON_ARRAY,
      JSON_LITERAL_BOOLEAN,
      JSON_LITERAL_NULL,
      JSON_NUMBER,
      JSON_META_SCALAR_TYPE,
    };

  /**
   * A public read-only list of all the '<em><b>Json Literal Value</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<JsonLiteralValue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Json Literal Value</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonLiteralValue get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JsonLiteralValue result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Json Literal Value</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonLiteralValue getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      JsonLiteralValue result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Json Literal Value</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JsonLiteralValue get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case EMPTY_JSON_OBJECT_VALUE: return EMPTY_JSON_OBJECT;
      case EMPTY_JSON_ARRAY_VALUE: return EMPTY_JSON_ARRAY;
      case JSON_LITERAL_BOOLEAN_VALUE: return JSON_LITERAL_BOOLEAN;
      case JSON_LITERAL_NULL_VALUE: return JSON_LITERAL_NULL;
      case JSON_NUMBER_VALUE: return JSON_NUMBER;
      case JSON_META_SCALAR_TYPE_VALUE: return JSON_META_SCALAR_TYPE;
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
  private JsonLiteralValue(int value, String name, String literal)
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
  
} //JsonLiteralValue
