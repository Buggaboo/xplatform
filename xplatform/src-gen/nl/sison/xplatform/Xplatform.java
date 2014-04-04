/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xplatform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.Xplatform#getResource <em>Resource</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getUri <em>Uri</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getRequestHeaders <em>Request Headers</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getResponseHeaders <em>Response Headers</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getJsonToClient <em>Json To Client</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getJsonToServer <em>Json To Server</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getXplatform()
 * @model
 * @generated
 */
public interface Xplatform extends EObject
{
  /**
   * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.xplatform.XplatformResource}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resource</em>' containment reference list.
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_Resource()
   * @model containment="true"
   * @generated
   */
  EList<XplatformResource> getResource();

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
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

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
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_Uri()
   * @model containment="true"
   * @generated
   */
  URI getUri();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getUri <em>Uri</em>}' containment reference.
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
   * @see #setRequestHeaders(XplatformHeader)
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_RequestHeaders()
   * @model containment="true"
   * @generated
   */
  XplatformHeader getRequestHeaders();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getRequestHeaders <em>Request Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request Headers</em>' containment reference.
   * @see #getRequestHeaders()
   * @generated
   */
  void setRequestHeaders(XplatformHeader value);

  /**
   * Returns the value of the '<em><b>Response Headers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Response Headers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response Headers</em>' containment reference.
   * @see #setResponseHeaders(XplatformHeader)
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_ResponseHeaders()
   * @model containment="true"
   * @generated
   */
  XplatformHeader getResponseHeaders();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getResponseHeaders <em>Response Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response Headers</em>' containment reference.
   * @see #getResponseHeaders()
   * @generated
   */
  void setResponseHeaders(XplatformHeader value);

  /**
   * Returns the value of the '<em><b>Json To Client</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Json To Client</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json To Client</em>' containment reference.
   * @see #setJsonToClient(XplatformJson)
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_JsonToClient()
   * @model containment="true"
   * @generated
   */
  XplatformJson getJsonToClient();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getJsonToClient <em>Json To Client</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json To Client</em>' containment reference.
   * @see #getJsonToClient()
   * @generated
   */
  void setJsonToClient(XplatformJson value);

  /**
   * Returns the value of the '<em><b>Json To Server</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Json To Server</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json To Server</em>' containment reference.
   * @see #setJsonToServer(XplatformJson)
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_JsonToServer()
   * @model containment="true"
   * @generated
   */
  XplatformJson getJsonToServer();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getJsonToServer <em>Json To Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json To Server</em>' containment reference.
   * @see #getJsonToServer()
   * @generated
   */
  void setJsonToServer(XplatformJson value);

} // Xplatform
