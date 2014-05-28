/**
 */
package nl.sison.dsl.mobgen.restful.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.restful.RestfulPackage;
import nl.sison.dsl.mobgen.restful.URI;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.URIImpl#getUrlPrefix <em>Url Prefix</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.URIImpl#getPath <em>Path</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.URIImpl#getPathParameters <em>Path Parameters</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.URIImpl#getPathSuffix <em>Path Suffix</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.URIImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.URIImpl#getQueryParameters <em>Query Parameters</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.restful.impl.URIImpl#getQuerySuffix <em>Query Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URIImpl extends MinimalEObjectImpl.Container implements URI
{
  /**
   * The default value of the '{@link #getUrlPrefix() <em>Url Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrlPrefix()
   * @generated
   * @ordered
   */
  protected static final String URL_PREFIX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrlPrefix() <em>Url Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrlPrefix()
   * @generated
   * @ordered
   */
  protected String urlPrefix = URL_PREFIX_EDEFAULT;

  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The cached value of the '{@link #getPathParameters() <em>Path Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathParameters()
   * @generated
   * @ordered
   */
  protected EList<String> pathParameters;

  /**
   * The cached value of the '{@link #getPathSuffix() <em>Path Suffix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathSuffix()
   * @generated
   * @ordered
   */
  protected EList<String> pathSuffix;

  /**
   * The cached value of the '{@link #getQuery() <em>Query</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery()
   * @generated
   * @ordered
   */
  protected EList<String> query;

  /**
   * The cached value of the '{@link #getQueryParameters() <em>Query Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQueryParameters()
   * @generated
   * @ordered
   */
  protected EList<String> queryParameters;

  /**
   * The cached value of the '{@link #getQuerySuffix() <em>Query Suffix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuerySuffix()
   * @generated
   * @ordered
   */
  protected EList<String> querySuffix;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected URIImpl()
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
    return RestfulPackage.Literals.URI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrlPrefix()
  {
    return urlPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrlPrefix(String newUrlPrefix)
  {
    String oldUrlPrefix = urlPrefix;
    urlPrefix = newUrlPrefix;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.URI__URL_PREFIX, oldUrlPrefix, urlPrefix));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestfulPackage.URI__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPathParameters()
  {
    if (pathParameters == null)
    {
      pathParameters = new EDataTypeEList<String>(String.class, this, RestfulPackage.URI__PATH_PARAMETERS);
    }
    return pathParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPathSuffix()
  {
    if (pathSuffix == null)
    {
      pathSuffix = new EDataTypeEList<String>(String.class, this, RestfulPackage.URI__PATH_SUFFIX);
    }
    return pathSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getQuery()
  {
    if (query == null)
    {
      query = new EDataTypeEList<String>(String.class, this, RestfulPackage.URI__QUERY);
    }
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getQueryParameters()
  {
    if (queryParameters == null)
    {
      queryParameters = new EDataTypeEList<String>(String.class, this, RestfulPackage.URI__QUERY_PARAMETERS);
    }
    return queryParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getQuerySuffix()
  {
    if (querySuffix == null)
    {
      querySuffix = new EDataTypeEList<String>(String.class, this, RestfulPackage.URI__QUERY_SUFFIX);
    }
    return querySuffix;
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
      case RestfulPackage.URI__URL_PREFIX:
        return getUrlPrefix();
      case RestfulPackage.URI__PATH:
        return getPath();
      case RestfulPackage.URI__PATH_PARAMETERS:
        return getPathParameters();
      case RestfulPackage.URI__PATH_SUFFIX:
        return getPathSuffix();
      case RestfulPackage.URI__QUERY:
        return getQuery();
      case RestfulPackage.URI__QUERY_PARAMETERS:
        return getQueryParameters();
      case RestfulPackage.URI__QUERY_SUFFIX:
        return getQuerySuffix();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestfulPackage.URI__URL_PREFIX:
        setUrlPrefix((String)newValue);
        return;
      case RestfulPackage.URI__PATH:
        setPath((String)newValue);
        return;
      case RestfulPackage.URI__PATH_PARAMETERS:
        getPathParameters().clear();
        getPathParameters().addAll((Collection<? extends String>)newValue);
        return;
      case RestfulPackage.URI__PATH_SUFFIX:
        getPathSuffix().clear();
        getPathSuffix().addAll((Collection<? extends String>)newValue);
        return;
      case RestfulPackage.URI__QUERY:
        getQuery().clear();
        getQuery().addAll((Collection<? extends String>)newValue);
        return;
      case RestfulPackage.URI__QUERY_PARAMETERS:
        getQueryParameters().clear();
        getQueryParameters().addAll((Collection<? extends String>)newValue);
        return;
      case RestfulPackage.URI__QUERY_SUFFIX:
        getQuerySuffix().clear();
        getQuerySuffix().addAll((Collection<? extends String>)newValue);
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
      case RestfulPackage.URI__URL_PREFIX:
        setUrlPrefix(URL_PREFIX_EDEFAULT);
        return;
      case RestfulPackage.URI__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case RestfulPackage.URI__PATH_PARAMETERS:
        getPathParameters().clear();
        return;
      case RestfulPackage.URI__PATH_SUFFIX:
        getPathSuffix().clear();
        return;
      case RestfulPackage.URI__QUERY:
        getQuery().clear();
        return;
      case RestfulPackage.URI__QUERY_PARAMETERS:
        getQueryParameters().clear();
        return;
      case RestfulPackage.URI__QUERY_SUFFIX:
        getQuerySuffix().clear();
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
      case RestfulPackage.URI__URL_PREFIX:
        return URL_PREFIX_EDEFAULT == null ? urlPrefix != null : !URL_PREFIX_EDEFAULT.equals(urlPrefix);
      case RestfulPackage.URI__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case RestfulPackage.URI__PATH_PARAMETERS:
        return pathParameters != null && !pathParameters.isEmpty();
      case RestfulPackage.URI__PATH_SUFFIX:
        return pathSuffix != null && !pathSuffix.isEmpty();
      case RestfulPackage.URI__QUERY:
        return query != null && !query.isEmpty();
      case RestfulPackage.URI__QUERY_PARAMETERS:
        return queryParameters != null && !queryParameters.isEmpty();
      case RestfulPackage.URI__QUERY_SUFFIX:
        return querySuffix != null && !querySuffix.isEmpty();
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
    result.append(" (urlPrefix: ");
    result.append(urlPrefix);
    result.append(", path: ");
    result.append(path);
    result.append(", pathParameters: ");
    result.append(pathParameters);
    result.append(", pathSuffix: ");
    result.append(pathSuffix);
    result.append(", query: ");
    result.append(query);
    result.append(", queryParameters: ");
    result.append(queryParameters);
    result.append(", querySuffix: ");
    result.append(querySuffix);
    result.append(')');
    return result.toString();
  }

} //URIImpl
