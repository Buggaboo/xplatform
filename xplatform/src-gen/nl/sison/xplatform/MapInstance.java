/**
 */
package nl.sison.xplatform;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nl.sison.xplatform.MapInstance#getMapName <em>Map Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see nl.sison.xplatform.XplatformPackage#getMapInstance()
 * @model
 * @generated
 */
public interface MapInstance extends Type
{
  /**
   * Returns the value of the '<em><b>Map Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map Name</em>' attribute.
   * @see #setMapName(String)
   * @see nl.sison.xplatform.XplatformPackage#getMapInstance_MapName()
   * @model
   * @generated
   */
  String getMapName();

  /**
   * Sets the value of the '{@link nl.sison.xplatform.MapInstance#getMapName <em>Map Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map Name</em>' attribute.
   * @see #getMapName()
   * @generated
   */
  void setMapName(String value);

} // MapInstance
