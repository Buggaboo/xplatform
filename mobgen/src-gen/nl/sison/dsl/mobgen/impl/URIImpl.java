/**
 */
package nl.sison.dsl.mobgen.impl;

import java.util.Collection;

import nl.sison.dsl.mobgen.MobgenPackage;
import nl.sison.dsl.mobgen.URI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nl.sison.dsl.mobgen.impl.URIImpl#getStringPrefix <em>String Prefix</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.URIImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link nl.sison.dsl.mobgen.impl.URIImpl#getStringSuffix <em>String Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URIImpl extends MinimalEObjectImpl.Container implements URI
{
  /**
   * The cached value of the '{@link #getStringPrefix() <em>String Prefix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringPrefix()
   * @generated
   * @ordered
   */
  protected EList<String> stringPrefix;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * The cached value of the '{@link #getStringSuffix() <em>String Suffix</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringSuffix()
   * @generated
   * @ordered
   */
  protected EList<String> stringSuffix;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected URIImpl()
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
    return MobgenPackage.Literals.URI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getStringPrefix()
  {
    if (stringPrefix == null)
    {
      stringPrefix = new EDataTypeEList<String>(String.class, this, MobgenPackage.URI__STRING_PREFIX);
    }
    return stringPrefix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EDataTypeEList<String>(String.class, this, MobgenPackage.URI__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getStringSuffix()
  {
    if (stringSuffix == null)
    {
      stringSuffix = new EDataTypeEList<String>(String.class, this, MobgenPackage.URI__STRING_SUFFIX);
    }
    return stringSuffix;
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
      case MobgenPackage.URI__STRING_PREFIX:
        return getStringPrefix();
      case MobgenPackage.URI__PARAMETERS:
        return getParameters();
      case MobgenPackage.URI__STRING_SUFFIX:
        return getStringSuffix();
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
      case MobgenPackage.URI__STRING_PREFIX:
        getStringPrefix().clear();
        getStringPrefix().addAll((Collection<? extends String>)newValue);
        return;
      case MobgenPackage.URI__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
        return;
      case MobgenPackage.URI__STRING_SUFFIX:
        getStringSuffix().clear();
        getStringSuffix().addAll((Collection<? extends String>)newValue);
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
      case MobgenPackage.URI__STRING_PREFIX:
        getStringPrefix().clear();
        return;
      case MobgenPackage.URI__PARAMETERS:
        getParameters().clear();
        return;
      case MobgenPackage.URI__STRING_SUFFIX:
        getStringSuffix().clear();
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
      case MobgenPackage.URI__STRING_PREFIX:
        return stringPrefix != null && !stringPrefix.isEmpty();
      case MobgenPackage.URI__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MobgenPackage.URI__STRING_SUFFIX:
        return stringSuffix != null && !stringSuffix.isEmpty();
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
    result.append(" (stringPrefix: ");
    result.append(stringPrefix);
    result.append(", parameters: ");
    result.append(parameters);
    result.append(", stringSuffix: ");
    result.append(stringSuffix);
    result.append(')');
    return result.toString();
  }

} //URIImpl
