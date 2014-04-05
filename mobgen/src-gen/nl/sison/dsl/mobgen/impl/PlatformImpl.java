/**
 */
package nl.sison.dsl.mobgen.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.MobgenPackage;
import nl.sison.dsl.mobgen.Platform;

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
 *   <li>{@link nl.sison.dsl.mobgen.impl.PlatformImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.PlatformImpl#getGenerateWhere <em>Generate Where</em>}</li>
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
   * The cached value of the '{@link #getGenerateWhere() <em>Generate Where</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGenerateWhere()
   * @generated
   * @ordered
   */
  protected EList<String> generateWhere;

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
    return MobgenPackage.Literals.PLATFORM;
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
      platforms = new EDataTypeEList<String>(String.class, this, MobgenPackage.PLATFORM__PLATFORMS);
    }
    return platforms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGenerateWhere()
  {
    if (generateWhere == null)
    {
      generateWhere = new EDataTypeEList<String>(String.class, this, MobgenPackage.PLATFORM__GENERATE_WHERE);
    }
    return generateWhere;
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
      case MobgenPackage.PLATFORM__PLATFORMS:
        return getPlatforms();
      case MobgenPackage.PLATFORM__GENERATE_WHERE:
        return getGenerateWhere();
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
      case MobgenPackage.PLATFORM__PLATFORMS:
        getPlatforms().clear();
        getPlatforms().addAll((Collection<? extends String>)newValue);
        return;
      case MobgenPackage.PLATFORM__GENERATE_WHERE:
        getGenerateWhere().clear();
        getGenerateWhere().addAll((Collection<? extends String>)newValue);
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
      case MobgenPackage.PLATFORM__PLATFORMS:
        getPlatforms().clear();
        return;
      case MobgenPackage.PLATFORM__GENERATE_WHERE:
        getGenerateWhere().clear();
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
      case MobgenPackage.PLATFORM__PLATFORMS:
        return platforms != null && !platforms.isEmpty();
      case MobgenPackage.PLATFORM__GENERATE_WHERE:
        return generateWhere != null && !generateWhere.isEmpty();
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
    result.append(", generateWhere: ");
    result.append(generateWhere);
    result.append(')');
    return result.toString();
  }

} //PlatformImpl
