/**
 */
package nl.sison.xplatform.util;

import nl.sison.xplatform.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.sison.xplatform.XplatformPackage
 * @generated
 */
public class XplatformAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XplatformPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XplatformAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XplatformPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XplatformSwitch<Adapter> modelSwitch =
    new XplatformSwitch<Adapter>()
    {
      @Override
      public Adapter caseXplatform(Xplatform object)
      {
        return createXplatformAdapter();
      }
      @Override
      public Adapter caseURI(URI object)
      {
        return createURIAdapter();
      }
      @Override
      public Adapter caseXplatformHeader(XplatformHeader object)
      {
        return createXplatformHeaderAdapter();
      }
      @Override
      public Adapter caseXplatformHeaderKeyValuePair(XplatformHeaderKeyValuePair object)
      {
        return createXplatformHeaderKeyValuePairAdapter();
      }
      @Override
      public Adapter caseXplatformJson(XplatformJson object)
      {
        return createXplatformJsonAdapter();
      }
      @Override
      public Adapter caseJsonMetaArray(JsonMetaArray object)
      {
        return createJsonMetaArrayAdapter();
      }
      @Override
      public Adapter caseJsonMetaType(JsonMetaType object)
      {
        return createJsonMetaTypeAdapter();
      }
      @Override
      public Adapter caseJsonCompositeType(JsonCompositeType object)
      {
        return createJsonCompositeTypeAdapter();
      }
      @Override
      public Adapter caseJsonType(JsonType object)
      {
        return createJsonTypeAdapter();
      }
      @Override
      public Adapter caseJsonScalarType(JsonScalarType object)
      {
        return createJsonScalarTypeAdapter();
      }
      @Override
      public Adapter caseJsonArray(JsonArray object)
      {
        return createJsonArrayAdapter();
      }
      @Override
      public Adapter caseJsonKeyValuePair(JsonKeyValuePair object)
      {
        return createJsonKeyValuePairAdapter();
      }
      @Override
      public Adapter caseJsonMetaKeyValuePair(JsonMetaKeyValuePair object)
      {
        return createJsonMetaKeyValuePairAdapter();
      }
      @Override
      public Adapter caseUnnestedKeyPairs(UnnestedKeyPairs object)
      {
        return createUnnestedKeyPairsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.Xplatform <em>Xplatform</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.Xplatform
   * @generated
   */
  public Adapter createXplatformAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.URI
   * @generated
   */
  public Adapter createURIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.XplatformHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.XplatformHeader
   * @generated
   */
  public Adapter createXplatformHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.XplatformHeaderKeyValuePair <em>Header Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.XplatformHeaderKeyValuePair
   * @generated
   */
  public Adapter createXplatformHeaderKeyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.XplatformJson <em>Json</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.XplatformJson
   * @generated
   */
  public Adapter createXplatformJsonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonMetaArray <em>Json Meta Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonMetaArray
   * @generated
   */
  public Adapter createJsonMetaArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonMetaType <em>Json Meta Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonMetaType
   * @generated
   */
  public Adapter createJsonMetaTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonCompositeType <em>Json Composite Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonCompositeType
   * @generated
   */
  public Adapter createJsonCompositeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonType <em>Json Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonType
   * @generated
   */
  public Adapter createJsonTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonScalarType <em>Json Scalar Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonScalarType
   * @generated
   */
  public Adapter createJsonScalarTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonArray <em>Json Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonArray
   * @generated
   */
  public Adapter createJsonArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonKeyValuePair <em>Json Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonKeyValuePair
   * @generated
   */
  public Adapter createJsonKeyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.JsonMetaKeyValuePair <em>Json Meta Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.JsonMetaKeyValuePair
   * @generated
   */
  public Adapter createJsonMetaKeyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.xplatform.UnnestedKeyPairs <em>Unnested Key Pairs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.xplatform.UnnestedKeyPairs
   * @generated
   */
  public Adapter createUnnestedKeyPairsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XplatformAdapterFactory
