/**
 */
package nl.sison.dsl.mobgen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.JsonObject#getKeyValuePair <em>Key Value Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonObject()
 * @model
 * @generated
 */
public interface JsonObject extends JsonCompositeValue
{
  /**
   * Returns the value of the '<em><b>Key Value Pair</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.dsl.mobgen.JsonKeyValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Value Pair</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Value Pair</em>' containment reference list.
   * @see nl.sison.dsl.mobgen.MobgenPackage#getJsonObject_KeyValuePair()
   * @model containment="true"
   * @generated
   */
  EList<JsonKeyValuePair> getKeyValuePair();

} // JsonObject
