/**
 */
package nl.sison.xplatform.impl;

import nl.sison.xplatform.URI;
import nl.sison.xplatform.Xplatform;
import nl.sison.xplatform.XplatformHeader;
import nl.sison.xplatform.XplatformJson;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xplatform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getRequestHeaders <em>Request Headers</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getResponseHeaders <em>Response Headers</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getJsonToClient <em>Json To Client</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.XplatformImpl#getJsonToServer <em>Json To Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XplatformImpl extends MinimalEObjectImpl.Container implements Xplatform
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected URI uri;

  /**
   * The cached value of the '{@link #getRequestHeaders() <em>Request Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestHeaders()
   * @generated
   * @ordered
   */
  protected XplatformHeader requestHeaders;

  /**
   * The cached value of the '{@link #getResponseHeaders() <em>Response Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseHeaders()
   * @generated
   * @ordered
   */
  protected XplatformHeader responseHeaders;

  /**
   * The cached value of the '{@link #getJsonToClient() <em>Json To Client</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonToClient()
   * @generated
   * @ordered
   */
  protected XplatformJson jsonToClient;

  /**
   * The cached value of the '{@link #getJsonToServer() <em>Json To Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonToServer()
   * @generated
   * @ordered
   */
  protected XplatformJson jsonToServer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XplatformImpl()
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
    return XplatformPackage.Literals.XPLATFORM;
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
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUri(URI newUri, NotificationChain msgs)
  {
    URI oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__URI, oldUri, newUri);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUri(URI newUri)
  {
    if (newUri != uri)
    {
      NotificationChain msgs = null;
      if (uri != null)
        msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__URI, null, msgs);
      if (newUri != null)
        msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__URI, null, msgs);
      msgs = basicSetUri(newUri, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__URI, newUri, newUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformHeader getRequestHeaders()
  {
    return requestHeaders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequestHeaders(XplatformHeader newRequestHeaders, NotificationChain msgs)
  {
    XplatformHeader oldRequestHeaders = requestHeaders;
    requestHeaders = newRequestHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__REQUEST_HEADERS, oldRequestHeaders, newRequestHeaders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequestHeaders(XplatformHeader newRequestHeaders)
  {
    if (newRequestHeaders != requestHeaders)
    {
      NotificationChain msgs = null;
      if (requestHeaders != null)
        msgs = ((InternalEObject)requestHeaders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__REQUEST_HEADERS, null, msgs);
      if (newRequestHeaders != null)
        msgs = ((InternalEObject)newRequestHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__REQUEST_HEADERS, null, msgs);
      msgs = basicSetRequestHeaders(newRequestHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__REQUEST_HEADERS, newRequestHeaders, newRequestHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformHeader getResponseHeaders()
  {
    return responseHeaders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponseHeaders(XplatformHeader newResponseHeaders, NotificationChain msgs)
  {
    XplatformHeader oldResponseHeaders = responseHeaders;
    responseHeaders = newResponseHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__RESPONSE_HEADERS, oldResponseHeaders, newResponseHeaders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponseHeaders(XplatformHeader newResponseHeaders)
  {
    if (newResponseHeaders != responseHeaders)
    {
      NotificationChain msgs = null;
      if (responseHeaders != null)
        msgs = ((InternalEObject)responseHeaders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__RESPONSE_HEADERS, null, msgs);
      if (newResponseHeaders != null)
        msgs = ((InternalEObject)newResponseHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__RESPONSE_HEADERS, null, msgs);
      msgs = basicSetResponseHeaders(newResponseHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__RESPONSE_HEADERS, newResponseHeaders, newResponseHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformJson getJsonToClient()
  {
    return jsonToClient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJsonToClient(XplatformJson newJsonToClient, NotificationChain msgs)
  {
    XplatformJson oldJsonToClient = jsonToClient;
    jsonToClient = newJsonToClient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__JSON_TO_CLIENT, oldJsonToClient, newJsonToClient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJsonToClient(XplatformJson newJsonToClient)
  {
    if (newJsonToClient != jsonToClient)
    {
      NotificationChain msgs = null;
      if (jsonToClient != null)
        msgs = ((InternalEObject)jsonToClient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__JSON_TO_CLIENT, null, msgs);
      if (newJsonToClient != null)
        msgs = ((InternalEObject)newJsonToClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__JSON_TO_CLIENT, null, msgs);
      msgs = basicSetJsonToClient(newJsonToClient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__JSON_TO_CLIENT, newJsonToClient, newJsonToClient));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformJson getJsonToServer()
  {
    return jsonToServer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJsonToServer(XplatformJson newJsonToServer, NotificationChain msgs)
  {
    XplatformJson oldJsonToServer = jsonToServer;
    jsonToServer = newJsonToServer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__JSON_TO_SERVER, oldJsonToServer, newJsonToServer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJsonToServer(XplatformJson newJsonToServer)
  {
    if (newJsonToServer != jsonToServer)
    {
      NotificationChain msgs = null;
      if (jsonToServer != null)
        msgs = ((InternalEObject)jsonToServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__JSON_TO_SERVER, null, msgs);
      if (newJsonToServer != null)
        msgs = ((InternalEObject)newJsonToServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XplatformPackage.XPLATFORM__JSON_TO_SERVER, null, msgs);
      msgs = basicSetJsonToServer(newJsonToServer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XplatformPackage.XPLATFORM__JSON_TO_SERVER, newJsonToServer, newJsonToServer));
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
      case XplatformPackage.XPLATFORM__URI:
        return basicSetUri(null, msgs);
      case XplatformPackage.XPLATFORM__REQUEST_HEADERS:
        return basicSetRequestHeaders(null, msgs);
      case XplatformPackage.XPLATFORM__RESPONSE_HEADERS:
        return basicSetResponseHeaders(null, msgs);
      case XplatformPackage.XPLATFORM__JSON_TO_CLIENT:
        return basicSetJsonToClient(null, msgs);
      case XplatformPackage.XPLATFORM__JSON_TO_SERVER:
        return basicSetJsonToServer(null, msgs);
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
      case XplatformPackage.XPLATFORM__NAME:
        return getName();
      case XplatformPackage.XPLATFORM__METHOD:
        return getMethod();
      case XplatformPackage.XPLATFORM__URI:
        return getUri();
      case XplatformPackage.XPLATFORM__REQUEST_HEADERS:
        return getRequestHeaders();
      case XplatformPackage.XPLATFORM__RESPONSE_HEADERS:
        return getResponseHeaders();
      case XplatformPackage.XPLATFORM__JSON_TO_CLIENT:
        return getJsonToClient();
      case XplatformPackage.XPLATFORM__JSON_TO_SERVER:
        return getJsonToServer();
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
      case XplatformPackage.XPLATFORM__NAME:
        setName((String)newValue);
        return;
      case XplatformPackage.XPLATFORM__METHOD:
        setMethod((String)newValue);
        return;
      case XplatformPackage.XPLATFORM__URI:
        setUri((URI)newValue);
        return;
      case XplatformPackage.XPLATFORM__REQUEST_HEADERS:
        setRequestHeaders((XplatformHeader)newValue);
        return;
      case XplatformPackage.XPLATFORM__RESPONSE_HEADERS:
        setResponseHeaders((XplatformHeader)newValue);
        return;
      case XplatformPackage.XPLATFORM__JSON_TO_CLIENT:
        setJsonToClient((XplatformJson)newValue);
        return;
      case XplatformPackage.XPLATFORM__JSON_TO_SERVER:
        setJsonToServer((XplatformJson)newValue);
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
      case XplatformPackage.XPLATFORM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XplatformPackage.XPLATFORM__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case XplatformPackage.XPLATFORM__URI:
        setUri((URI)null);
        return;
      case XplatformPackage.XPLATFORM__REQUEST_HEADERS:
        setRequestHeaders((XplatformHeader)null);
        return;
      case XplatformPackage.XPLATFORM__RESPONSE_HEADERS:
        setResponseHeaders((XplatformHeader)null);
        return;
      case XplatformPackage.XPLATFORM__JSON_TO_CLIENT:
        setJsonToClient((XplatformJson)null);
        return;
      case XplatformPackage.XPLATFORM__JSON_TO_SERVER:
        setJsonToServer((XplatformJson)null);
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
      case XplatformPackage.XPLATFORM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XplatformPackage.XPLATFORM__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case XplatformPackage.XPLATFORM__URI:
        return uri != null;
      case XplatformPackage.XPLATFORM__REQUEST_HEADERS:
        return requestHeaders != null;
      case XplatformPackage.XPLATFORM__RESPONSE_HEADERS:
        return responseHeaders != null;
      case XplatformPackage.XPLATFORM__JSON_TO_CLIENT:
        return jsonToClient != null;
      case XplatformPackage.XPLATFORM__JSON_TO_SERVER:
        return jsonToServer != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //XplatformImpl
