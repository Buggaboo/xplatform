/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.JsonObject#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonObject()
 * @model
 * @generated
 */
public interface JsonObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link nl.sison.dsl.mobgen.jsonGen.Member}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getJsonObject_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // JsonObject
