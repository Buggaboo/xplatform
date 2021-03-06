/**
 */
package nl.sison.dsl.mobgen.restful.util;

import nl.sison.dsl.mobgen.restful.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nl.sison.dsl.mobgen.restful.RestfulPackage
 * @generated
 */
public class RestfulAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RestfulPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestfulAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RestfulPackage.eINSTANCE;
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
  protected RestfulSwitch<Adapter> modelSwitch =
    new RestfulSwitch<Adapter>()
    {
      @Override
      public Adapter caseMobgen(Mobgen object)
      {
        return createMobgenAdapter();
      }
      @Override
      public Adapter caseMobgenCallDefinition(MobgenCallDefinition object)
      {
        return createMobgenCallDefinitionAdapter();
      }
      @Override
      public Adapter caseMobgenHeader(MobgenHeader object)
      {
        return createMobgenHeaderAdapter();
      }
      @Override
      public Adapter caseMobgenHeaderKeyValuePair(MobgenHeaderKeyValuePair object)
      {
        return createMobgenHeaderKeyValuePairAdapter();
      }
      @Override
      public Adapter caseMobgenHeaderParameter(MobgenHeaderParameter object)
      {
        return createMobgenHeaderParameterAdapter();
      }
      @Override
      public Adapter caseMobgenJson(MobgenJson object)
      {
        return createMobgenJsonAdapter();
      }
      @Override
      public Adapter caseJsonObjectValue(JsonObjectValue object)
      {
        return createJsonObjectValueAdapter();
      }
      @Override
      public Adapter caseJsonCompositeValue(JsonCompositeValue object)
      {
        return createJsonCompositeValueAdapter();
      }
      @Override
      public Adapter caseJsonLiteralValue(JsonLiteralValue object)
      {
        return createJsonLiteralValueAdapter();
      }
      @Override
      public Adapter caseJsonObject(JsonObject object)
      {
        return createJsonObjectAdapter();
      }
      @Override
      public Adapter caseJsonKeyValuePair(JsonKeyValuePair object)
      {
        return createJsonKeyValuePairAdapter();
      }
      @Override
      public Adapter caseJsonArray(JsonArray object)
      {
        return createJsonArrayAdapter();
      }
      @Override
      public Adapter caseMobgenResourceDefinition(MobgenResourceDefinition object)
      {
        return createMobgenResourceDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumInstance(EnumInstance object)
      {
        return createEnumInstanceAdapter();
      }
      @Override
      public Adapter caseMapInstance(MapInstance object)
      {
        return createMapInstanceAdapter();
      }
      @Override
      public Adapter caseStringList(StringList object)
      {
        return createStringListAdapter();
      }
      @Override
      public Adapter caseNestedType(NestedType object)
      {
        return createNestedTypeAdapter();
      }
      @Override
      public Adapter caseURI(URI object)
      {
        return createURIAdapter();
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
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.Mobgen <em>Mobgen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.Mobgen
   * @generated
   */
  public Adapter createMobgenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.MobgenCallDefinition <em>Mobgen Call Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.MobgenCallDefinition
   * @generated
   */
  public Adapter createMobgenCallDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.MobgenHeader <em>Mobgen Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeader
   * @generated
   */
  public Adapter createMobgenHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair <em>Mobgen Header Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderKeyValuePair
   * @generated
   */
  public Adapter createMobgenHeaderKeyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.MobgenHeaderParameter <em>Mobgen Header Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.MobgenHeaderParameter
   * @generated
   */
  public Adapter createMobgenHeaderParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.MobgenJson <em>Mobgen Json</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.MobgenJson
   * @generated
   */
  public Adapter createMobgenJsonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.JsonObjectValue <em>Json Object Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.JsonObjectValue
   * @generated
   */
  public Adapter createJsonObjectValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.JsonCompositeValue <em>Json Composite Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.JsonCompositeValue
   * @generated
   */
  public Adapter createJsonCompositeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.JsonLiteralValue <em>Json Literal Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.JsonLiteralValue
   * @generated
   */
  public Adapter createJsonLiteralValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.JsonObject <em>Json Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.JsonObject
   * @generated
   */
  public Adapter createJsonObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.JsonKeyValuePair <em>Json Key Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.JsonKeyValuePair
   * @generated
   */
  public Adapter createJsonKeyValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.JsonArray <em>Json Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.JsonArray
   * @generated
   */
  public Adapter createJsonArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.MobgenResourceDefinition <em>Mobgen Resource Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.MobgenResourceDefinition
   * @generated
   */
  public Adapter createMobgenResourceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.EnumInstance <em>Enum Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.EnumInstance
   * @generated
   */
  public Adapter createEnumInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.MapInstance <em>Map Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.MapInstance
   * @generated
   */
  public Adapter createMapInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.StringList <em>String List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.StringList
   * @generated
   */
  public Adapter createStringListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.NestedType <em>Nested Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.NestedType
   * @generated
   */
  public Adapter createNestedTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link nl.sison.dsl.mobgen.restful.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see nl.sison.dsl.mobgen.restful.URI
   * @generated
   */
  public Adapter createURIAdapter()
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

} //RestfulAdapterFactory
