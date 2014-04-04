/**
 */
package nl.sison.xplatform.impl;

import java.util.Collection;

import nl.sison.xplatform.Platform;
import nl.sison.xplatform.XplatformPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Platform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.xplatform.impl.PlatformImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link nl.sison.xplatform.impl.PlatformImpl#getWhereToGenerate <em>Where To Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlatformImpl extends MinimalEObjectImpl.Container implements Platform
{
  /**
   * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatforms()
   * @generated
   * @ordered
   */
  protected EList<String> platforms;

  /**
   * The cached value of the '{@link #getWhereToGenerate() <em>Where To Generate</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhereToGenerate()
   * @generated
   * @ordered
   */
  protected EList<String> whereToGenerate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlatformImpl()
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
    return XplatformPackage.Literals.PLATFORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPlatforms()
  {
    if (platforms == null)
    {
      platforms = new EDataTypeEList<String>(String.class, this, XplatformPackage.PLATFORM__PLATFORMS);
    }
    return platforms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getWhereToGenerate()
  {
    if (whereToGenerate == null)
    {
      whereToGenerate = new EDataTypeEList<String>(String.class, this, XplatformPackage.PLATFORM__WHERE_TO_GENERATE);
    }
    return whereToGenerate;
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
      case XplatformPackage.PLATFORM__PLATFORMS:
        return getPlatforms();
      case XplatformPackage.PLATFORM__WHERE_TO_GENERATE:
        return getWhereToGenerate();
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
      case XplatformPackage.PLATFORM__PLATFORMS:
        getPlatforms().clear();
        getPlatforms().addAll((Collection<? extends String>)newValue);
        return;
      case XplatformPackage.PLATFORM__WHERE_TO_GENERATE:
        getWhereToGenerate().clear();
        getWhereToGenerate().addAll((Collection<? extends String>)newValue);
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
      case XplatformPackage.PLATFORM__PLATFORMS:
        getPlatforms().clear();
        return;
      case XplatformPackage.PLATFORM__WHERE_TO_GENERATE:
        getWhereToGenerate().clear();
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
      case XplatformPackage.PLATFORM__PLATFORMS:
        return platforms != null && !platforms.isEmpty();
      case XplatformPackage.PLATFORM__WHERE_TO_GENERATE:
        return whereToGenerate != null && !whereToGenerate.isEmpty();
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
    result.append(" (platforms: ");
    result.append(platforms);
    result.append(", whereToGenerate: ");
    result.append(whereToGenerate);
    result.append(')');
    return result.toString();
  }

} //PlatformImpl
