/**
 */
package nl.sison.dsl.mobgen.impl;

import nl.sison.dsl.mobgen.MobgenCallDefinition;
import nl.sison.dsl.mobgen.MobgenHeader;
import nl.sison.dsl.mobgen.MobgenJson;
import nl.sison.dsl.mobgen.MobgenPackage;
import nl.sison.dsl.mobgen.RestfulMethods;
import nl.sison.dsl.mobgen.URI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl#getRequestHeaders <em>Request Headers</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl#getResponseHeaders <em>Response Headers</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl#getJsonToClient <em>Json To Client</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.MobgenCallDefinitionImpl#getJsonToServer <em>Json To Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobgenCallDefinitionImpl extends MinimalEObjectImpl.Container implements MobgenCallDefinition
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
  protected static final RestfulMethods METHOD_EDEFAULT = RestfulMethods.PUT;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected RestfulMethods method = METHOD_EDEFAULT;

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
  protected MobgenHeader requestHeaders;

  /**
   * The cached value of the '{@link #getResponseHeaders() <em>Response Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseHeaders()
   * @generated
   * @ordered
   */
  protected MobgenHeader responseHeaders;

  /**
   * The cached value of the '{@link #getJsonToClient() <em>Json To Client</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonToClient()
   * @generated
   * @ordered
   */
  protected MobgenJson jsonToClient;

  /**
   * The cached value of the '{@link #getJsonToServer() <em>Json To Server</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJsonToServer()
   * @generated
   * @ordered
   */
  protected MobgenJson jsonToServer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MobgenCallDefinitionImpl()
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
    return MobgenPackage.Literals.MOBGEN_CALL_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfulMethods getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(RestfulMethods newMethod)
  {
    RestfulMethods oldMethod = method;
    method = newMethod == null ? METHOD_EDEFAULT : newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__METHOD, oldMethod, method));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__URI, oldUri, newUri);
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
        msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__URI, null, msgs);
      if (newUri != null)
        msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__URI, null, msgs);
      msgs = basicSetUri(newUri, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__URI, newUri, newUri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenHeader getRequestHeaders()
  {
    return requestHeaders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequestHeaders(MobgenHeader newRequestHeaders, NotificationChain msgs)
  {
    MobgenHeader oldRequestHeaders = requestHeaders;
    requestHeaders = newRequestHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS, oldRequestHeaders, newRequestHeaders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequestHeaders(MobgenHeader newRequestHeaders)
  {
    if (newRequestHeaders != requestHeaders)
    {
      NotificationChain msgs = null;
      if (requestHeaders != null)
        msgs = ((InternalEObject)requestHeaders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS, null, msgs);
      if (newRequestHeaders != null)
        msgs = ((InternalEObject)newRequestHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS, null, msgs);
      msgs = basicSetRequestHeaders(newRequestHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS, newRequestHeaders, newRequestHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenHeader getResponseHeaders()
  {
    return responseHeaders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResponseHeaders(MobgenHeader newResponseHeaders, NotificationChain msgs)
  {
    MobgenHeader oldResponseHeaders = responseHeaders;
    responseHeaders = newResponseHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS, oldResponseHeaders, newResponseHeaders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponseHeaders(MobgenHeader newResponseHeaders)
  {
    if (newResponseHeaders != responseHeaders)
    {
      NotificationChain msgs = null;
      if (responseHeaders != null)
        msgs = ((InternalEObject)responseHeaders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS, null, msgs);
      if (newResponseHeaders != null)
        msgs = ((InternalEObject)newResponseHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS, null, msgs);
      msgs = basicSetResponseHeaders(newResponseHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS, newResponseHeaders, newResponseHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenJson getJsonToClient()
  {
    return jsonToClient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJsonToClient(MobgenJson newJsonToClient, NotificationChain msgs)
  {
    MobgenJson oldJsonToClient = jsonToClient;
    jsonToClient = newJsonToClient;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT, oldJsonToClient, newJsonToClient);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJsonToClient(MobgenJson newJsonToClient)
  {
    if (newJsonToClient != jsonToClient)
    {
      NotificationChain msgs = null;
      if (jsonToClient != null)
        msgs = ((InternalEObject)jsonToClient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT, null, msgs);
      if (newJsonToClient != null)
        msgs = ((InternalEObject)newJsonToClient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT, null, msgs);
      msgs = basicSetJsonToClient(newJsonToClient, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT, newJsonToClient, newJsonToClient));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MobgenJson getJsonToServer()
  {
    return jsonToServer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJsonToServer(MobgenJson newJsonToServer, NotificationChain msgs)
  {
    MobgenJson oldJsonToServer = jsonToServer;
    jsonToServer = newJsonToServer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER, oldJsonToServer, newJsonToServer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJsonToServer(MobgenJson newJsonToServer)
  {
    if (newJsonToServer != jsonToServer)
    {
      NotificationChain msgs = null;
      if (jsonToServer != null)
        msgs = ((InternalEObject)jsonToServer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER, null, msgs);
      if (newJsonToServer != null)
        msgs = ((InternalEObject)newJsonToServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER, null, msgs);
      msgs = basicSetJsonToServer(newJsonToServer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER, newJsonToServer, newJsonToServer));
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
      case MobgenPackage.MOBGEN_CALL_DEFINITION__URI:
        return basicSetUri(null, msgs);
      case MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS:
        return basicSetRequestHeaders(null, msgs);
      case MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS:
        return basicSetResponseHeaders(null, msgs);
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT:
        return basicSetJsonToClient(null, msgs);
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER:
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
      case MobgenPackage.MOBGEN_CALL_DEFINITION__NAME:
        return getName();
      case MobgenPackage.MOBGEN_CALL_DEFINITION__METHOD:
        return getMethod();
      case MobgenPackage.MOBGEN_CALL_DEFINITION__URI:
        return getUri();
      case MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS:
        return getRequestHeaders();
      case MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS:
        return getResponseHeaders();
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT:
        return getJsonToClient();
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER:
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
      case MobgenPackage.MOBGEN_CALL_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__METHOD:
        setMethod((RestfulMethods)newValue);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__URI:
        setUri((URI)newValue);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS:
        setRequestHeaders((MobgenHeader)newValue);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS:
        setResponseHeaders((MobgenHeader)newValue);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT:
        setJsonToClient((MobgenJson)newValue);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER:
        setJsonToServer((MobgenJson)newValue);
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
      case MobgenPackage.MOBGEN_CALL_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__URI:
        setUri((URI)null);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS:
        setRequestHeaders((MobgenHeader)null);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS:
        setResponseHeaders((MobgenHeader)null);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT:
        setJsonToClient((MobgenJson)null);
        return;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER:
        setJsonToServer((MobgenJson)null);
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
      case MobgenPackage.MOBGEN_CALL_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MobgenPackage.MOBGEN_CALL_DEFINITION__METHOD:
        return method != METHOD_EDEFAULT;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__URI:
        return uri != null;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__REQUEST_HEADERS:
        return requestHeaders != null;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__RESPONSE_HEADERS:
        return responseHeaders != null;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_CLIENT:
        return jsonToClient != null;
      case MobgenPackage.MOBGEN_CALL_DEFINITION__JSON_TO_SERVER:
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

} //MobgenCallDefinitionImpl
