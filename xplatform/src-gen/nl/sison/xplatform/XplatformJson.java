/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.XplatformJson#getName <em>Name</em>}</li>
 *   <li>{@link nl.sison.xplatform.XplatformJson#getType <em>Type</em>}</li>
 *   <li>{@link nl.sison.xplatform.XplatformJson#getMetaType <em>Meta Type</em>}</li>
 *   <li>{@link nl.sison.xplatform.XplatformJson#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getXplatformJson()
 * @model
 * @generated
 */
public interface XplatformJson extends EObject
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
   * @see nl.sison.xplatform.XplatformPackage#getXplatformJson_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.XplatformJson#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JsonType)
   * @see nl.sison.xplatform.XplatformPackage#getXplatformJson_Type()
   * @model containment="true"
   * @generated
   */
  JsonType getType();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.XplatformJson#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JsonType value);

  /**
   * Returns the value of the '<em><b>Meta Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Type</em>' containment reference.
   * @see #setMetaType(JsonMetaType)
   * @see nl.sison.xplatform.XplatformPackage#getXplatformJson_MetaType()
   * @model containment="true"
   * @generated
   */
  JsonMetaType getMetaType();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.XplatformJson#getMetaType <em>Meta Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Type</em>' containment reference.
   * @see #getMetaType()
   * @generated
   */
  void setMetaType(JsonMetaType value);

  /**
   * Returns the value of the '<em><b>Composite</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite</em>' containment reference.
   * @see #setComposite(JsonObject)
   * @see nl.sison.xplatform.XplatformPackage#getXplatformJson_Composite()
   * @model containment="true"
   * @generated
   */
  JsonObject getComposite();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.XplatformJson#getComposite <em>Composite</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite</em>' containment reference.
   * @see #getComposite()
   * @generated
   */
  void setComposite(JsonObject value);

} // XplatformJson
