/**
 */
package nl.sison.xplatform;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.sison.xplatform.XplatformPackage
 * @generated
 */
public interface XplatformFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XplatformFactory eINSTANCE = nl.sison.xplatform.impl.XplatformFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Xplatform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xplatform</em>'.
   * @generated
   */
  Xplatform createXplatform();

  /**
   * Returns a new object of class '<em>Json</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json</em>'.
   * @generated
   */
  XplatformJson createXplatformJson();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  XplatformHeader createXplatformHeader();

  /**
   * Returns a new object of class '<em>Header Key Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header Key Value</em>'.
   * @generated
   */
  XplatformHeaderKeyValue createXplatformHeaderKeyValue();

  /**
   * Returns a new object of class '<em>Json Meta Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Meta Type</em>'.
   * @generated
   */
  JsonMetaType createJsonMetaType();

  /**
   * Returns a new object of class '<em>Json Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Type</em>'.
   * @generated
   */
  JsonType createJsonType();

  /**
   * Returns a new object of class '<em>Json Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Array</em>'.
   * @generated
   */
  JsonArray createJsonArray();

  /**
   * Returns a new object of class '<em>Json Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Key Value Pair</em>'.
   * @generated
   */
  JsonKeyValuePair createJsonKeyValuePair();

  /**
   * Returns a new object of class '<em>Json Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Object</em>'.
   * @generated
   */
  JsonObject createJsonObject();

  /**
   * Returns a new object of class '<em>Json Meta Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Meta Array</em>'.
   * @generated
   */
  JsonMetaArray createJsonMetaArray();

  /**
   * Returns a new object of class '<em>Json Meta Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Meta Key Value Pair</em>'.
   * @generated
   */
  JsonMetaKeyValuePair createJsonMetaKeyValuePair();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XplatformPackage getXplatformPackage();

} //XplatformFactory
