/**
 */
package nl.sison.dsl.mobgen.restful;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobgen Call Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getUri <em>Uri</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getRequestHeaders <em>Request Headers</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getResponseHeaders <em>Response Headers</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToClient <em>Json To Client</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToServer <em>Json To Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition()
 * @model
 * @generated
 */
public interface MobgenCallDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * The literals are from the enumeration {@link nl.sison.dsl.mobgen.restful.RestfulMethods}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see nl.sison.dsl.mobgen.restful.RestfulMethods
   * @see #setMethod(RestfulMethods)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition_Method()
   * @model
   * @generated
   */
  RestfulMethods getMethod();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see nl.sison.dsl.mobgen.restful.RestfulMethods
   * @see #getMethod()
   * @generated
   */
  void setMethod(RestfulMethods value);

  /**
   * Returns the value of the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' containment reference.
   * @see #setUri(URI)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition_Uri()
   * @model containment="true"
   * @generated
   */
  URI getUri();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getUri <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' containment reference.
   * @see #getUri()
   * @generated
   */
  void setUri(URI value);

  /**
   * Returns the value of the '<em><b>Request Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Request Headers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request Headers</em>' containment reference.
   * @see #setRequestHeaders(MobgenHeader)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition_RequestHeaders()
   * @model containment="true"
   * @generated
   */
  MobgenHeader getRequestHeaders();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getRequestHeaders <em>Request Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request Headers</em>' containment reference.
   * @see #getRequestHeaders()
   * @generated
   */
  void setRequestHeaders(MobgenHeader value);

  /**
   * Returns the value of the '<em><b>Response Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Headers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Headers</em>' containment reference.
   * @see #setResponseHeaders(MobgenHeader)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition_ResponseHeaders()
   * @model containment="true"
   * @generated
   */
  MobgenHeader getResponseHeaders();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getResponseHeaders <em>Response Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Headers</em>' containment reference.
   * @see #getResponseHeaders()
   * @generated
   */
  void setResponseHeaders(MobgenHeader value);

  /**
   * Returns the value of the '<em><b>Json To Client</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Json To Client</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json To Client</em>' containment reference.
   * @see #setJsonToClient(MobgenJson)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition_JsonToClient()
   * @model containment="true"
   * @generated
   */
  MobgenJson getJsonToClient();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToClient <em>Json To Client</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json To Client</em>' containment reference.
   * @see #getJsonToClient()
   * @generated
   */
  void setJsonToClient(MobgenJson value);

  /**
   * Returns the value of the '<em><b>Json To Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Json To Server</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json To Server</em>' containment reference.
   * @see #setJsonToServer(MobgenJson)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getMobgenCallDefinition_JsonToServer()
   * @model containment="true"
   * @generated
   */
  MobgenJson getJsonToServer();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition#getJsonToServer <em>Json To Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json To Server</em>' containment reference.
   * @see #getJsonToServer()
   * @generated
   */
  void setJsonToServer(MobgenJson value);

} // MobgenCallDefinition
