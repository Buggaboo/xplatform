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
 *   <li>{@link nl.sison.xplatform.Xplatform#getCallName <em>Call Name</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.sison.xplatform.Xplatform#getUriPathParams <em>Uri Path Params</em>}</li>
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
   * Returns the value of the '<em><b>Call Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Call Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Call Name</em>' attribute.
   * @see #setCallName(String)
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_CallName()
   * @model
   * @generated
   */
  String getCallName();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.Xplatform#getCallName <em>Call Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Call Name</em>' attribute.
   * @see #getCallName()
   * @generated
   */
  void setCallName(String value);

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
   * Returns the value of the '<em><b>Uri Path Params</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri Path Params</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri Path Params</em>' attribute list.
   * @see nl.sison.xplatform.XplatformPackage#getXplatform_UriPathParams()
   * @model unique="false"
   * @generated
   */
  EList<String> getUriPathParams();

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
