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
   * Returns a new object of class '<em>Platform</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Platform</em>'.
   * @generated
   */
  Platform createPlatform();

  /**
   * Returns a new object of class '<em>Call Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Definition</em>'.
   * @generated
   */
  XplatformCallDefinition createXplatformCallDefinition();

  /**
   * Returns a new object of class '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URI</em>'.
   * @generated
   */
  URI createURI();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  XplatformHeader createXplatformHeader();

  /**
   * Returns a new object of class '<em>Header Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header Key Value Pair</em>'.
   * @generated
   */
  XplatformHeaderKeyValuePair createXplatformHeaderKeyValuePair();

  /**
   * Returns a new object of class '<em>Json</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json</em>'.
   * @generated
   */
  XplatformJson createXplatformJson();

  /**
   * Returns a new object of class '<em>Json Object Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Object Value</em>'.
   * @generated
   */
  JsonObjectValue createJsonObjectValue();

  /**
   * Returns a new object of class '<em>Json Composite Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Composite Value</em>'.
   * @generated
   */
  JsonCompositeValue createJsonCompositeValue();

  /**
   * Returns a new object of class '<em>Json Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Object</em>'.
   * @generated
   */
  JsonObject createJsonObject();

  /**
   * Returns a new object of class '<em>Json Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Key Value Pair</em>'.
   * @generated
   */
  JsonKeyValuePair createJsonKeyValuePair();

  /**
   * Returns a new object of class '<em>Json Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Array</em>'.
   * @generated
   */
  JsonArray createJsonArray();

  /**
   * Returns a new object of class '<em>Resource Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource Definition</em>'.
   * @generated
   */
  XplatformResourceDefinition createXplatformResourceDefinition();

  /**
   * Returns a new object of class '<em>Enum Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Instance</em>'.
   * @generated
   */
  EnumInstance createEnumInstance();

  /**
   * Returns a new object of class '<em>Map Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Instance</em>'.
   * @generated
   */
  MapInstance createMapInstance();

  /**
   * Returns a new object of class '<em>String List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String List</em>'.
   * @generated
   */
  StringList createStringList();

  /**
   * Returns a new object of class '<em>Nested Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Type</em>'.
   * @generated
   */
  NestedType createNestedType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XplatformPackage getXplatformPackage();

} //XplatformFactory
