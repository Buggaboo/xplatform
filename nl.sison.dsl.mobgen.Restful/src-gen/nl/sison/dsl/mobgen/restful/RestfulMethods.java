/**
 */
package nl.sison.dsl.mobgen.restful;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Methods</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getRestfulMethods()
 * @model
 * @generated
 */
public enum RestfulMethods implements Enumerator
{
  /**
   * The '<em><b>Put</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUT_VALUE
   * @generated
   * @ordered
   */
  PUT(0, "put", "PUT"),

  /**
   * The '<em><b>Post</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POST_VALUE
   * @generated
   * @ordered
   */
  POST(1, "post", "POST"),

  /**
   * The '<em><b>Get</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GET_VALUE
   * @generated
   * @ordered
   */
  GET(2, "get", "GET"),

  /**
   * The '<em><b>Delete</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELETE_VALUE
   * @generated
   * @ordered
   */
  DELETE(3, "delete", "DELETE");

  /**
   * The '<em><b>Put</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Put</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PUT
   * @model name="put" literal="PUT"
   * @generated
   * @ordered
   */
  public static final int PUT_VALUE = 0;

  /**
   * The '<em><b>Post</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Post</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POST
   * @model name="post" literal="POST"
   * @generated
   * @ordered
   */
  public static final int POST_VALUE = 1;

  /**
   * The '<em><b>Get</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Get</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GET
   * @model name="get" literal="GET"
   * @generated
   * @ordered
   */
  public static final int GET_VALUE = 2;

  /**
   * The '<em><b>Delete</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Delete</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELETE
   * @model name="delete" literal="DELETE"
   * @generated
   * @ordered
   */
  public static final int DELETE_VALUE = 3;

  /**
   * An array of all the '<em><b>Methods</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RestfulMethods[] VALUES_ARRAY =
    new RestfulMethods[]
    {
      PUT,
      POST,
      GET,
      DELETE,
    };

  /**
   * A public read-only list of all the '<em><b>Methods</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RestfulMethods> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Methods</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestfulMethods get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RestfulMethods result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Methods</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestfulMethods getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RestfulMethods result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Methods</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestfulMethods get(int value)
  {
    switch (value)
    {
      case PUT_VALUE: return PUT;
      case POST_VALUE: return POST;
      case GET_VALUE: return GET;
      case DELETE_VALUE: return DELETE;
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
  private RestfulMethods(int value, String name, String literal)
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
  
} //RestfulMethods
