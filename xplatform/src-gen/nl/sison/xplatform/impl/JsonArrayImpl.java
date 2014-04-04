/**
 */
package nl.sison.xplatform.impl;

import java.util.Collection;

import nl.sison.xplatform.JsonArray;
import nl.sison.xplatform.JsonCompositeType;
import nl.sison.xplatform.JsonScalarType;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.JsonArrayImpl#getElement <em>Element</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.JsonArrayImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonArrayImpl extends MinimalEObjectImpl.Container implements JsonArray
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected EList<JsonScalarType> element;

  /**
   * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComposite()
   * @generated
   * @ordered
   */
  protected EList<JsonCompositeType> composite;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonArrayImpl()
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
    return XplatformPackage.Literals.JSON_ARRAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonScalarType> getElement()
  {
    if (element == null)
    {
      element = new EObjectContainmentEList<JsonScalarType>(JsonScalarType.class, this, XplatformPackage.JSON_ARRAY__ELEMENT);
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JsonCompositeType> getComposite()
  {
    if (composite == null)
    {
      composite = new EObjectContainmentEList<JsonCompositeType>(JsonCompositeType.class, this, XplatformPackage.JSON_ARRAY__COMPOSITE);
    }
    return composite;
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
      case XplatformPackage.JSON_ARRAY__ELEMENT:
        return ((InternalEList<?>)getElement()).basicRemove(otherEnd, msgs);
      case XplatformPackage.JSON_ARRAY__COMPOSITE:
        return ((InternalEList<?>)getComposite()).basicRemove(otherEnd, msgs);
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
      case XplatformPackage.JSON_ARRAY__ELEMENT:
        return getElement();
      case XplatformPackage.JSON_ARRAY__COMPOSITE:
        return getComposite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XplatformPackage.JSON_ARRAY__ELEMENT:
        getElement().clear();
        getElement().addAll((Collection<? extends JsonScalarType>)newValue);
        return;
      case XplatformPackage.JSON_ARRAY__COMPOSITE:
        getComposite().clear();
        getComposite().addAll((Collection<? extends JsonCompositeType>)newValue);
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
      case XplatformPackage.JSON_ARRAY__ELEMENT:
        getElement().clear();
        return;
      case XplatformPackage.JSON_ARRAY__COMPOSITE:
        getComposite().clear();
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
      case XplatformPackage.JSON_ARRAY__ELEMENT:
        return element != null && !element.isEmpty();
      case XplatformPackage.JSON_ARRAY__COMPOSITE:
        return composite != null && !composite.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JsonArrayImpl
