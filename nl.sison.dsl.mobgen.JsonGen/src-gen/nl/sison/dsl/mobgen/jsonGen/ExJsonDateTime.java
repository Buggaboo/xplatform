/**
 */
package nl.sison.dsl.mobgen.jsonGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ex Json Date Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.ExJsonDateTime#isUtc <em>Utc</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.jsonGen.ExJsonDateTime#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getExJsonDateTime()
 * @model
 * @generated
 */
public interface ExJsonDateTime extends EObject
{
  /**
   * Returns the value of the '<em><b>Utc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Utc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Utc</em>' attribute.
   * @see #setUtc(boolean)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getExJsonDateTime_Utc()
   * @model
   * @generated
   */
  boolean isUtc();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.ExJsonDateTime#isUtc <em>Utc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Utc</em>' attribute.
   * @see #isUtc()
   * @generated
   */
  void setUtc(boolean value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see nl.sison.dsl.mobgen.jsonGen.JsonGenPackage#getExJsonDateTime_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link nl.sison.dsl.mobgen.jsonGen.ExJsonDateTime#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

} // ExJsonDateTime
