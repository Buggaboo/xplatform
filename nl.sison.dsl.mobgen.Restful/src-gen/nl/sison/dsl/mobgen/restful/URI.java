/**
 */
package nl.sison.dsl.mobgen.restful;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.URI#getUrlPrefix <em>Url Prefix</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.URI#getPath <em>Path</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.URI#getPathParameters <em>Path Parameters</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.URI#getPathSuffix <em>Path Suffix</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.URI#getQuery <em>Query</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.URI#getQueryParameters <em>Query Parameters</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.URI#getQuerySuffix <em>Query Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI()
 * @model
 * @generated
 */
public interface URI extends EObject
{
  /**
   * Returns the value of the '<em><b>Url Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url Prefix</em>' attribute.
   * @see #setUrlPrefix(String)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI_UrlPrefix()
   * @model
   * @generated
   */
  String getUrlPrefix();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.URI#getUrlPrefix <em>Url Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url Prefix</em>' attribute.
   * @see #getUrlPrefix()
   * @generated
   */
  void setUrlPrefix(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.restful.URI#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Path Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Parameters</em>' attribute list.
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI_PathParameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getPathParameters();

  /**
   * Returns the value of the '<em><b>Path Suffix</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Suffix</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Suffix</em>' attribute list.
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI_PathSuffix()
   * @model unique="false"
   * @generated
   */
  EList<String> getPathSuffix();

  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute list.
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI_Query()
   * @model unique="false"
   * @generated
   */
  EList<String> getQuery();

  /**
   * Returns the value of the '<em><b>Query Parameters</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Parameters</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Parameters</em>' attribute list.
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI_QueryParameters()
   * @model unique="false"
   * @generated
   */
  EList<String> getQueryParameters();

  /**
   * Returns the value of the '<em><b>Query Suffix</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Suffix</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Suffix</em>' attribute list.
   * @see nl.sison.dsl.mobgen.restful.RestfulPackage#getURI_QuerySuffix()
   * @model unique="false"
   * @generated
   */
  EList<String> getQuerySuffix();

} // URI
