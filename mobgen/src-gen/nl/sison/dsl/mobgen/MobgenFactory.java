/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nl.sison.dsl.mobgen.MobgenPackage
 * @generated
 */
public interface MobgenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MobgenFactory eINSTANCE = nl.sison.dsl.mobgen.impl.MobgenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mobgen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mobgen</em>'.
   * @generated
   */
  Mobgen createMobgen();

  /**
   * Returns a new object of class '<em>Call Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Definition</em>'.
   * @generated
   */
  MobgenCallDefinition createMobgenCallDefinition();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  MobgenHeader createMobgenHeader();

  /**
   * Returns a new object of class '<em>Header Key Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header Key Value Pair</em>'.
   * @generated
   */
  MobgenHeaderKeyValuePair createMobgenHeaderKeyValuePair();

  /**
   * Returns a new object of class '<em>Header Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header Parameter</em>'.
   * @generated
   */
  MobgenHeaderParameter createMobgenHeaderParameter();

  /**
   * Returns a new object of class '<em>Json</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json</em>'.
   * @generated
   */
  MobgenJson createMobgenJson();

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
   * Returns a new object of class '<em>Json Literal Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Literal Value</em>'.
   * @generated
   */
  JsonLiteralValue createJsonLiteralValue();

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
  MobgenResourceDefinition createMobgenResourceDefinition();

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
   * Returns a new object of class '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URI</em>'.
   * @generated
   */
  URI createURI();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MobgenPackage getMobgenPackage();

} //MobgenFactory
