package nl.sison.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import nl.sison.dsl.mobgen.JsonArray;
import nl.sison.dsl.mobgen.JsonCompositeValue;
import nl.sison.dsl.mobgen.JsonKeyValuePair;
import nl.sison.dsl.mobgen.JsonLiteralBoolean;
import nl.sison.dsl.mobgen.JsonLiteralValue;
import nl.sison.dsl.mobgen.JsonMetaScalarType;
import nl.sison.dsl.mobgen.JsonObject;
import nl.sison.dsl.mobgen.JsonObjectValue;
import nl.sison.dsl.mobgen.MobgenCallDefinition;
import nl.sison.dsl.mobgen.MobgenHeader;
import nl.sison.dsl.mobgen.MobgenHeaderKeyValuePair;
import nl.sison.dsl.mobgen.MobgenHeaderParameter;
import nl.sison.dsl.mobgen.MobgenJson;
import nl.sison.dsl.mobgen.RestfulMethods;
import nl.sison.dsl.mobgen.URI;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AndroidHttpRequestGenerator implements IGenerator {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    final Iterator<MobgenCallDefinition> callDefinitions = Iterators.<MobgenCallDefinition>filter(_allContents, MobgenCallDefinition.class);
    final Procedure1<MobgenCallDefinition> _function = new Procedure1<MobgenCallDefinition>() {
      public void apply(final MobgenCallDefinition d) {
        AndroidHttpRequestGenerator.this.androidCreateJavaFiles(d, fsa);
      }
    };
    IteratorExtensions.<MobgenCallDefinition>forEach(callDefinitions, _function);
  }
  
  /**
   * Parcelable as basic data structure type, reasons are:
   * 
   * They are explicit, more explicit than the Bundle type.
   * They are easily passed on through Bundle type args, using #putParcelable
   * There is a direct mapping of a list of composite json objects to a list of Parcelables using #putParcelableArray(List)
   * 
   * 1.  Generate http request header Parcelable - DONE
   * 2.  Generate http request URL Parcelable - DONE
   * 3.  Generate http request Json entity Parcelable // TODO put parser here?
   * 4.  Generate Parcelable for previous three Parcelables
   * 5.  Generate http response header Parcelable
   * 6.  Generate http response Json entity Parcelable
   * 7.  Generate Parcelable for previous two Parcelables
   * 8.  Generate AsyncTask loader // multiple async calls unattached to Activity/Fragment
   * 9.  Generate http call method
   * 10. Generate mock Activity to test the call // TODO
   * 11. Generate Spark class to handle the call // TODO
   */
  public StringBuilder androidCreateJavaFiles(final MobgenCallDefinition callDefinition, final IFileSystemAccess fsa) {
    StringBuilder _xifexpression = null;
    MobgenHeader _requestHeaders = callDefinition.getRequestHeaders();
    boolean _notEquals = (!Objects.equal(_requestHeaders, null));
    if (_notEquals) {
      StringBuilder _xblockexpression = null;
      {
        this.createParcelableRequestHeaderFile(callDefinition, fsa);
        this.createParcelableRequestUrlFile(callDefinition, fsa);
        StringBuilder _xifexpression_1 = null;
        boolean _or = false;
        RestfulMethods _method = callDefinition.getMethod();
        boolean _equals = Objects.equal(_method, RestfulMethods.POST);
        if (_equals) {
          _or = true;
        } else {
          RestfulMethods _method_1 = callDefinition.getMethod();
          boolean _equals_1 = Objects.equal(_method_1, RestfulMethods.PUT);
          _or = _equals_1;
        }
        if (_or) {
          MobgenJson _jsonToClient = callDefinition.getJsonToClient();
          JsonObjectValue _value = _jsonToClient.getValue();
          _xifexpression_1 = this.createParcelableRequestJsonFile(_value, fsa);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public void createLoader(final MobgenCallDefinition callDefinition, final IFileSystemAccess fsa) {
    String _name = callDefinition.getName();
    final String nameCapitalized = this.capitalizeFirstLetter(_name);
    RestfulMethods _method = callDefinition.getMethod();
    final String methodCapitalized = _method.getLiteral();
    MobgenJson _jsonToClient = callDefinition.getJsonToClient();
    String _name_1 = _jsonToClient.getName();
    final String jsonResultTypeNameCapitalized = this.capitalizeFirstLetter(_name_1);
  }
  
  public void createParcelableRequestUrlFile(final MobgenCallDefinition callDefinition, final IFileSystemAccess fsa) {
    MobgenHeader _requestHeaders = callDefinition.getRequestHeaders();
    final String name = _requestHeaders.getName();
    final String nameCapitalized = this.capitalizeFirstLetter(name);
    final String nameLowerCase = name.toLowerCase();
    final StringBuffer stringBuffer = new StringBuffer();
    final URI url = callDefinition.getUri();
    final String urlPrefix = url.getUrlPrefix();
    final String urlPath = url.getPath();
    final EList<String> urlPathParameters = url.getPathParameters();
    final EList<String> urlPathSuffixes = url.getPathSuffix();
    final EList<String> urlQueryPrefix = url.getQuery();
    final EList<String> urlQueryParameters = url.getQueryParameters();
    EList<String> urlQuerySuffixes = url.getQuerySuffix();
    final HashMap<String, String> hashMap = CollectionLiterals.<String, String>newHashMap();
    for (final String pp : urlPathParameters) {
      hashMap.put(pp, "String");
    }
    for (final String qp : urlQueryParameters) {
      hashMap.put(qp, "String");
    }
    final Iterator<String> iteratorUrlParams = urlPathParameters.iterator();
    final Iterator<String> iteratorUrlSuffix = urlPathSuffixes.iterator();
    final StringBuffer strBuf = new StringBuffer();
    StringBuffer _append = strBuf.append(urlPrefix);
    _append.append(urlPath);
    boolean _or = false;
    boolean _hasNext = iteratorUrlParams.hasNext();
    if (_hasNext) {
      _or = true;
    } else {
      boolean _hasNext_1 = iteratorUrlSuffix.hasNext();
      _or = _hasNext_1;
    }
    boolean _while = _or;
    while (_while) {
      {
        String _next = iteratorUrlParams.next();
        boolean _isEmpty = _next.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          strBuf.append("%s");
        }
        final String suf = iteratorUrlSuffix.next();
        boolean _isEmpty_1 = suf.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          strBuf.append(suf);
        }
      }
      boolean _or_1 = false;
      boolean _hasNext_2 = iteratorUrlParams.hasNext();
      if (_hasNext_2) {
        _or_1 = true;
      } else {
        boolean _hasNext_3 = iteratorUrlSuffix.hasNext();
        _or_1 = _hasNext_3;
      }
      _while = _or_1;
    }
    final Iterator<String> iteratorUrlQueryParams = urlQueryParameters.iterator();
    final Iterator<String> iteratorUrlQuerySuffix = urlQuerySuffixes.iterator();
    strBuf.append(urlQueryPrefix);
    boolean _or_1 = false;
    boolean _hasNext_2 = iteratorUrlQueryParams.hasNext();
    if (_hasNext_2) {
      _or_1 = true;
    } else {
      boolean _hasNext_3 = iteratorUrlQuerySuffix.hasNext();
      _or_1 = _hasNext_3;
    }
    boolean _while_1 = _or_1;
    while (_while_1) {
      {
        String _next = iteratorUrlQueryParams.next();
        boolean _isEmpty = _next.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          strBuf.append("%s");
        }
        final String suf = iteratorUrlQuerySuffix.next();
        boolean _isEmpty_1 = suf.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        if (_not_1) {
          strBuf.append(suf);
        }
      }
      boolean _or_2 = false;
      boolean _hasNext_4 = iteratorUrlQueryParams.hasNext();
      if (_hasNext_4) {
        _or_2 = true;
      } else {
        boolean _hasNext_5 = iteratorUrlQuerySuffix.hasNext();
        _or_2 = _hasNext_5;
      }
      _while_1 = _or_2;
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public URL getUrl()");
    _builder.newLine();
    _builder.append("{ // URLEncoder.encode(...) only the actual parameters, not everything");
    _builder.newLine();
    {
      boolean _and = false;
      boolean _isEmpty = urlPathParameters.isEmpty();
      boolean _not = (!_isEmpty);
      if (!_not) {
        _and = false;
      } else {
        boolean _isEmpty_1 = urlQueryParameters.isEmpty();
        boolean _not_1 = (!_isEmpty_1);
        _and = _not_1;
      }
      if (_and) {
        _builder.append("return new URL(String.format(\"");
        String _string = strBuf.toString();
        _builder.append(_string, "");
        _builder.append("\"");
        {
          for(final String p : urlPathParameters) {
            _builder.append(", ");
            CharSequence _wrapUrlEncoder = this.wrapUrlEncoder(p);
            _builder.append(_wrapUrlEncoder, "");
          }
        }
        {
          for(final String q : urlQueryParameters) {
            _builder.append(", ");
            CharSequence _wrapUrlEncoder_1 = this.wrapUrlEncoder(q);
            _builder.append(_wrapUrlEncoder_1, "");
          }
        }
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("return new URL(\"");
        String _string_1 = strBuf.toString();
        _builder.append(_string_1, "");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    final String addMethod = _builder.toString();
    String _capitalizeFirstLetter = this.capitalizeFirstLetter(name);
    CharSequence _createParcelable = this.createParcelable(_capitalizeFirstLetter, hashMap, addMethod);
    stringBuffer.append(_createParcelable);
    String _pathForStringFormat = this.getPathForStringFormat(nameLowerCase);
    final String filePath = String.format("src/%s/%s%s", _pathForStringFormat, nameCapitalized, "RequestUrl.java");
    String _string_2 = stringBuffer.toString();
    fsa.generateFile(filePath, _string_2);
  }
  
  public CharSequence wrapUrlEncoder(final CharSequence parameter) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("URLEncoder.encode(");
    _builder.append(parameter, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public void createParcelableRequestHeaderFile(final MobgenCallDefinition callDefinition, final IFileSystemAccess fsa) {
    MobgenHeader _requestHeaders = callDefinition.getRequestHeaders();
    final String name = _requestHeaders.getName();
    final String nameCapitalized = this.capitalizeFirstLetter(name);
    final String nameLowerCase = name.toLowerCase();
    final StringBuffer stringBuffer = new StringBuffer();
    MobgenHeader _requestHeaders_1 = callDefinition.getRequestHeaders();
    EList<MobgenHeaderKeyValuePair> _headerKeyValues = _requestHeaders_1.getHeaderKeyValues();
    final Iterable<MobgenHeaderKeyValuePair> requestHeaderKeyValuePairs = Iterables.<MobgenHeaderKeyValuePair>filter(_headerKeyValues, MobgenHeaderKeyValuePair.class);
    final HashMap<String, String> hashMap = CollectionLiterals.<String, String>newHashMap();
    for (final MobgenHeaderKeyValuePair kvp : requestHeaderKeyValuePairs) {
      MobgenHeaderParameter _parameter = kvp.getParameter();
      boolean _notEquals = (!Objects.equal(_parameter, null));
      if (_notEquals) {
        MobgenHeaderParameter _parameter_1 = kvp.getParameter();
        String _id = _parameter_1.getId();
        String _camelCase = this.camelCase(_id);
        hashMap.put(_camelCase, "String");
      }
    }
    String _capitalizeFirstLetter = this.capitalizeFirstLetter(name);
    CharSequence _createParcelable = this.createParcelable(_capitalizeFirstLetter, hashMap, "");
    stringBuffer.append(_createParcelable);
    String _pathForStringFormat = this.getPathForStringFormat(nameLowerCase);
    final String filePath = String.format("src/%s/%s%s", _pathForStringFormat, nameCapitalized, "RequestHeader.java");
    String _string = stringBuffer.toString();
    fsa.generateFile(filePath, _string);
  }
  
  /**
   * Design: pass values to a Parcelable (that is generated), then from a instance method, it spits out a json construct, that
   * can be referenced from the Loader. Then in the http request body entity (method: PUT/POST), #toString can be called on the JSON construct.
   */
  public StringBuilder createParcelableRequestJsonFile(final JsonObjectValue value, final IFileSystemAccess fsa) {
    StringBuilder _xblockexpression = null;
    {
      final JsonCompositeValue composite = value.getComposite();
      final JsonLiteralValue scalar = value.getScalar();
      final StringBuilder stringBuilder = new StringBuilder();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public JSONObject toJSON() {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("try {");
      _builder.newLine();
      stringBuilder.append(_builder);
      boolean _notEquals = (!Objects.equal(composite, null));
      if (_notEquals) {
        this.createCompositeJsonValue(composite, stringBuilder, 0);
      } else {
        boolean _notEquals_1 = (!Objects.equal(scalar, null));
        if (_notEquals_1) {
          InputOutput.<String>print("The root JSON value must be a composite type. Skipping Parcelable generation. Use a Bundle.");
          throw new IllegalArgumentException("Currently, only JSON objects are supported. For android use a Bundle instead.");
        }
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("\t\t");
      _builder_1.append("return n0;");
      _builder_1.newLine();
      _builder_1.append("\t");
      CharSequence _generateExceptionHandlerLoggingAndThrow = this.generateExceptionHandlerLoggingAndThrow("JSONException");
      _builder_1.append(_generateExceptionHandlerLoggingAndThrow, "\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _xblockexpression = stringBuilder.append(_builder_1);
    }
    return _xblockexpression;
  }
  
  public String mapJsonLiteralValueToJava(final JsonLiteralValue value) {
    String _stringType = value.getStringType();
    boolean _notEquals = (!Objects.equal(_stringType, null));
    if (_notEquals) {
      String _stringType_1 = value.getStringType();
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_stringType_1, "{}")) {
          _matched=true;
          return "new JSONObject()";
        }
      }
      if (!_matched) {
        if (Objects.equal(_stringType_1, "[]")) {
          _matched=true;
          return "new JSONArray()";
        }
      }
      if (!_matched) {
        if (Objects.equal(_stringType_1, "null")) {
          _matched=true;
          return "JSONObject.NULL";
        }
      }
      return value.getStringType();
    }
    JsonLiteralBoolean _booleanType = value.getBooleanType();
    boolean _notEquals_1 = (!Objects.equal(_booleanType, null));
    if (_notEquals_1) {
      JsonLiteralBoolean _booleanType_1 = value.getBooleanType();
      return _booleanType_1.getLiteral();
    }
    return null;
  }
  
  public void createCompositeJsonValue(final JsonCompositeValue composite, final StringBuilder parserString, final int recursionDepth) {
    JsonObject _objectValue = composite.getObjectValue();
    boolean _notEquals = (!Objects.equal(_objectValue, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("JSONObject n");
      _builder.append(recursionDepth, "");
      _builder.append(" = new JSONObject();");
      _builder.newLineIfNotEmpty();
      parserString.append(_builder);
      JsonObject _objectValue_1 = composite.getObjectValue();
      EList<JsonKeyValuePair> _keyValuePair = _objectValue_1.getKeyValuePair();
      for (final JsonKeyValuePair keyValue : _keyValuePair) {
        {
          JsonObjectValue _value = keyValue.getValue();
          final JsonLiteralValue scalar = _value.getScalar();
          boolean _notEquals_1 = (!Objects.equal(scalar, null));
          if (_notEquals_1) {
            JsonMetaScalarType _metaType = scalar.getMetaType();
            boolean _equals = Objects.equal(_metaType, null);
            if (_equals) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("n");
              _builder_1.append(recursionDepth, "");
              _builder_1.append(".put(");
              String _key = keyValue.getKey();
              _builder_1.append(_key, "");
              _builder_1.append(", ");
              String _mapJsonLiteralValueToJava = this.mapJsonLiteralValueToJava(scalar);
              _builder_1.append(_mapJsonLiteralValueToJava, "");
              _builder_1.append(");");
              _builder_1.newLineIfNotEmpty();
              final String putStr = _builder_1.toString();
              parserString.append(putStr);
            } else {
              StringConcatenation _builder_2 = new StringConcatenation();
              _builder_2.append("n");
              _builder_2.append(recursionDepth, "");
              _builder_2.append(".put(");
              String _key_1 = keyValue.getKey();
              _builder_2.append(_key_1, "");
              _builder_2.append(", get");
              String _key_2 = keyValue.getKey();
              String _capitalizeFirstLetter = this.capitalizeFirstLetter(_key_2);
              _builder_2.append(_capitalizeFirstLetter, "");
              _builder_2.append(");");
              parserString.append(_builder_2);
            }
          } else {
            JsonObjectValue _value_1 = keyValue.getValue();
            JsonCompositeValue _composite = _value_1.getComposite();
            boolean _notEquals_2 = (!Objects.equal(_composite, null));
            if (_notEquals_2) {
              StringConcatenation _builder_3 = new StringConcatenation();
              _builder_3.append("n");
              _builder_3.append(recursionDepth, "");
              _builder_3.append(".put(");
              String _key_3 = keyValue.getKey();
              _builder_3.append(_key_3, "");
              _builder_3.append(", get");
              String _key_4 = keyValue.getKey();
              String _capitalizeFirstLetter_1 = this.capitalizeFirstLetter(_key_4);
              _builder_3.append(_capitalizeFirstLetter_1, "");
              _builder_3.append(".toJSON());");
              parserString.append(_builder_3);
            }
          }
        }
      }
    } else {
      JsonArray _arrayValue = composite.getArrayValue();
      boolean _notEquals_1 = (!Objects.equal(_arrayValue, null));
      if (_notEquals_1) {
        throw new IllegalArgumentException("Currently, JsonArrays are not supported. Just build it yourself. For more complex arrays, with complex objects inside, try to build the composite object first. Pass a parcelable array of the object.");
      } else {
        throw new IllegalArgumentException("Wrong type passed?");
      }
    }
  }
  
  public Object createScalarJsonValue(final JsonCompositeValue composite, final StringBuilder parserString) {
    return null;
  }
  
  public String capitalizeFirstLetter(final String s) {
    String _substring = s.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _substring_1 = s.substring(1);
    String _lowerCase = _substring_1.toLowerCase();
    return (_upperCase + _lowerCase);
  }
  
  public String getPathForStringFormat(final CharSequence nameLowerCase) {
    CharSequence _setPackage = this.setPackage(nameLowerCase);
    String _string = _setPackage.toString();
    int _length = "package ".length();
    String _substring = _string.substring(_length);
    return _substring.replace(".", "/");
  }
  
  public CharSequence setPackage(final CharSequence name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package nl.sison.dsl.mobgen.");
    _builder.append(name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  /**
   * The check for 'P' is to differentiate between calls where the server expects a payload, which are POST and PUT
   * 
   * TODO also generate the AsyncTask for this, because a Loader has a 1..1 relation with the Fragment/Activity
   * and sometimes you prefer to have a 1..n (Fragment/Activity..Asynctask) relations ship
   * 
   * inspired by http://blog.gunawan.me/2011/10/android-asynctaskloader-exception.html
   */
  public CharSequence createLoader(final CharSequence classNamePrefix, final CharSequence returnType, final CharSequence method, final CharSequence requestBody, final CharSequence jsonParserToParcelable, final CharSequence serverBoundPayload) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.content.AsyncTaskLoader;");
    _builder.newLine();
    _builder.append("import android.content.Context;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.Map; // see http call");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(classNamePrefix, "");
    _builder.append("Loader extends AsyncTaskLoader<");
    _builder.append(returnType, "");
    _builder.append(">");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(returnType, "\t");
    _builder.append(" result;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ");
    _builder.append(classNamePrefix, "\t");
    _builder.append("RequestParameters parameters;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(classNamePrefix, "\t");
    _builder.append("Loader(Context context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(context);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(classNamePrefix, "\t");
    _builder.append("Loader(Context context, Parcelable parameters) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(context);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.parameters = parameters;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Load the data asynchronously");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(returnType, "\t");
    _builder.append(" loadInBackground() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("try");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(classNamePrefix, "\t\t\t");
    _builder.append("HttpRequest httpRequest = new ");
    _builder.append(classNamePrefix, "\t\t\t");
    _builder.append("HttpRequest(parameters);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("httpRequest.do");
    _builder.append(method, "\t\t\t");
    _builder.append("Request();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return httpRequest.getResult();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* if this invoked http request throws an exception");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("* TODO Let the exception object come through the \'result\' object");
    _builder.newLine();
    _builder.append("\t\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}catch (Exception e)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return ");
    _builder.append(returnType, "\t\t\t");
    _builder.append("(e); // general exception catch: this must be passed on to the ui thread");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void deliverResult(");
    _builder.append(returnType, "\t");
    _builder.append(" data) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (isReset()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// some data came in while the loader is stopped");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.result = data;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.deliverResult(data);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void onStartLoading() {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("if (result != null) { // This determines the difference between initLoader and restartLoader ");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("deliverResult(result);");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("if (takeContentChanged() || result == null) {");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("forceLoad();");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void onStopLoading() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cancelLoad();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected void onReset() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.onReset();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("cancelLoad();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("result = null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private class ");
    _builder.append(classNamePrefix, "\t");
    _builder.append("HttpRequest");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private ");
    _builder.append(classNamePrefix, "\t\t");
    _builder.append("RequestParameters parameters;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private ");
    _builder.append(classNamePrefix, "\t\t");
    _builder.append("HttpRequest(Parcelable parameters) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.parameters = parameters;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("disableConnectionReuseIfNecessary();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private ");
    _builder.append(returnType, "\t\t");
    _builder.append(" result = null; ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("public ");
    _builder.append(returnType, "\t\t");
    _builder.append(" getResult() { return result; }");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO feed parameters to urlParams, headerParams, readStream and writeStream, through outer class, it\'s unnecessary to declare private members twice");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public do");
    _builder.append(method, "\t\t");
    _builder.append("Request()");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(requestBody, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* readStream parses a JSON then assigns a Parcelable to this.result");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private void readStream(BufferedInputStream in)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append(jsonParserToParcelable, "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    {
      String _string = method.toString();
      boolean _startsWith = _string.startsWith("P");
      if (_startsWith) {
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("*");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("* Convert parameters to JSON conforming to the server\'s expection of the call");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("*");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("private void writeStream(BufferedOutputStream out)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append(serverBoundPayload, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* TODO consider removing this remnant of the past, remove if it pre-dates AsyncTaskLoader(?).");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private void disableConnectionReuseIfNecessary() {");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("// HTTP connection reuse which was buggy pre-froyo");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("System.setProperty(\"http.keepAlive\", \"false\");");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public HashMap<CharSequence, CharSequence> joinPairAsMap(final Iterator<CharSequence> keys, final Iterator<CharSequence> values) {
    final HashMap<CharSequence, CharSequence> hashMap = CollectionLiterals.<CharSequence, CharSequence>newHashMap();
    boolean _and = false;
    boolean _hasNext = keys.hasNext();
    if (!_hasNext) {
      _and = false;
    } else {
      boolean _hasNext_1 = values.hasNext();
      _and = _hasNext_1;
    }
    boolean _while = _and;
    while (_while) {
      {
        final CharSequence value = values.next();
        final CharSequence key = keys.next();
        hashMap.put(key, value);
      }
      boolean _and_1 = false;
      boolean _hasNext_2 = keys.hasNext();
      if (!_hasNext_2) {
        _and_1 = false;
      } else {
        boolean _hasNext_3 = values.hasNext();
        _and_1 = _hasNext_3;
      }
      _while = _and_1;
    }
    return hashMap;
  }
  
  public CharSequence createParcelableProtectedMembers(final CharSequence parameterName, final CharSequence parameterType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected ");
    _builder.append(parameterType, "");
    _builder.append(" ");
    _builder.append(parameterName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createParcelableWriteToParcel(final CharSequence parameterName, final CharSequence writeMethodNameSuffix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("out.write");
    _builder.append(writeMethodNameSuffix, "");
    _builder.append("(");
    _builder.append(parameterName, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createParcelableReadMember(final CharSequence parameterName, final CharSequence readMethodNameSuffix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(parameterName, "");
    _builder.append(" = in.read");
    _builder.append(readMethodNameSuffix, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createParcelableReadMemberWithCast(final CharSequence parameterName, final CharSequence readMethodSuffix, final CharSequence castToType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(parameterName, "");
    _builder.append(" = (");
    _builder.append(castToType, "");
    _builder.append(") in.read");
    _builder.append(readMethodSuffix, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createParcelableAccessors(final CharSequence parameterName, final CharSequence parameterType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void set");
    _builder.append(parameterName, "");
    _builder.append(" (final ");
    _builder.append(parameterType, "");
    _builder.append(" ");
    _builder.append(parameterName, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return this.");
    _builder.append(parameterName, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("void get");
    _builder.append(parameterName, "");
    _builder.append(" () { return ");
    _builder.append(parameterName, "");
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String camelCase(final CharSequence headerKey) {
    String _string = headerKey.toString();
    final String[] strArr = _string.split("-");
    final StringBuffer strBuf = new StringBuffer();
    String _head = IterableExtensions.<String>head(((Iterable<String>)Conversions.doWrapArray(strArr)));
    String _string_1 = _head.toString();
    String _lowerCase = _string_1.toLowerCase();
    strBuf.append(_lowerCase);
    for (final String str : strArr) {
      Object _head_1 = IterableExtensions.<Object>head(((Iterable<Object>)Conversions.doWrapArray(strArr)));
      boolean _equals = str.equals(_head_1);
      boolean _not = (!_equals);
      if (_not) {
        String _capitalizeFirstLetter = this.capitalizeFirstLetter(str);
        strBuf.append(_capitalizeFirstLetter);
      }
    }
    return strBuf.toString();
  }
  
  /**
   * We got, boolean (faked Integer), Integers, Serializables, Parcelables, String, Arrays...
   */
  public CharSequence createParcelable(final CharSequence parcelableClassName, final Map<String, String> members, final CharSequence additionalMethodsEtc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Parcelables are actually just POJOs that are faster than Serializables,");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* only Parcelables require manual work to pass on values from one object to the next");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This type of parcelable contains an Exception field in case of failure along the way");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* e.g. no internet connection etc.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This implementation is intended to be passed on from the background threads");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* to the ui thread");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/ ");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(parcelableClassName, "");
    _builder.append(" extends Parcelable");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet = members.entrySet();
      for(final Map.Entry<String, String> s : _entrySet) {
        _builder.append("    ");
        String _key = s.getKey();
        String _value = s.getValue();
        CharSequence _createParcelableProtectedMembers = this.createParcelableProtectedMembers(_key, _value);
        _builder.append(_createParcelableProtectedMembers, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Exception exception = null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// for lack of properties");
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet_1 = members.entrySet();
      for(final Map.Entry<String, String> s_1 : _entrySet_1) {
        _builder.append("    ");
        String _key_1 = s_1.getKey();
        String _value_1 = s_1.getValue();
        CharSequence _createParcelableAccessors = this.createParcelableAccessors(_key_1, _value_1);
        _builder.append(_createParcelableAccessors, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(parcelableClassName, "    ");
    _builder.append("(");
    {
      Set<Map.Entry<String, String>> _entrySet_2 = members.entrySet();
      for(final Map.Entry<String, String> s_2 : _entrySet_2) {
        String _key_2 = s_2.getKey();
        _builder.append(_key_2, "    ");
        _builder.append(" ");
        String _value_2 = s_2.getValue();
        _builder.append(_value_2, "    ");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet_3 = members.entrySet();
      for(final Map.Entry<String, String> s_3 : _entrySet_3) {
        _builder.append("\t");
        _builder.append("this.");
        String _key_3 = s_3.getKey();
        _builder.append(_key_3, "\t");
        _builder.append(" = ");
        String _key_4 = s_3.getKey();
        _builder.append(_key_4, "\t");
        _builder.append("; ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(parcelableClassName, "\t");
    _builder.append("(Exception exception) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("this.exception = exception;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean hasException()");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return exception != null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(parcelableClassName, "    ");
    _builder.append("(Parcel in) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t");
    _builder.append("readFromParcel(in);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void writeToParcel(Parcel out, int flags) {");
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet_4 = members.entrySet();
      for(final Map.Entry<String, String> s_4 : _entrySet_4) {
        {
          LinkedList<String> _newLinkedList = CollectionLiterals.<String>newLinkedList("String", "Integer", "Parcelable", "Serializable");
          String _value_3 = s_4.getValue();
          boolean _contains = _newLinkedList.contains(_value_3);
          if (_contains) {
            _builder.append("\t");
            String _key_5 = s_4.getKey();
            String _value_4 = s_4.getValue();
            CharSequence _createParcelableWriteToParcel = this.createParcelableWriteToParcel(_key_5, _value_4);
            _builder.append(_createParcelableWriteToParcel, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            String _value_5 = s_4.getValue();
            boolean _equals = _value_5.equals("boolean");
            if (_equals) {
              _builder.append("\t");
              _builder.append("out.writeInteger(s.key ? 1 : 0);");
              _builder.newLine();
            }
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("out.writeSerializable(exception);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void readFromParcel(Parcel in) {");
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet_5 = members.entrySet();
      for(final Map.Entry<String, String> s_5 : _entrySet_5) {
        {
          LinkedList<String> _newLinkedList_1 = CollectionLiterals.<String>newLinkedList("String", "Integer", "Parcelable", "Serializable");
          String _value_6 = s_5.getValue();
          boolean _contains_1 = _newLinkedList_1.contains(_value_6);
          if (_contains_1) {
            _builder.append("\t");
            String _key_6 = s_5.getKey();
            String _value_7 = s_5.getValue();
            CharSequence _createParcelableReadMember = this.createParcelableReadMember(_key_6, _value_7);
            _builder.append(_createParcelableReadMember, "\t");
            _builder.newLineIfNotEmpty();
          } else {
            {
              String _value_8 = s_5.getValue();
              boolean _equals_1 = _value_8.equals("boolean");
              if (_equals_1) {
                String _key_7 = s_5.getKey();
                _builder.append(_key_7, "");
                _builder.append(" = in.readInteger() > 0;");
                _builder.newLineIfNotEmpty();
              } else {
                String _key_8 = s_5.getKey();
                String _value_9 = s_5.getValue();
                CharSequence _createParcelableReadMemberWithCast = this.createParcelableReadMemberWithCast(_key_8, "Serializable", _value_9);
                _builder.append(_createParcelableReadMemberWithCast, "");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("exception = (Exception) in.readSerializable();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("public ");
    _builder.append(parcelableClassName, "        ");
    _builder.append(" createFromParcel(Parcel in) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return new ");
    _builder.append(parcelableClassName, "            ");
    _builder.append("(in);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("public ");
    _builder.append(parcelableClassName, "        ");
    _builder.append("[] newArray(int size) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return new ");
    _builder.append(parcelableClassName, "            ");
    _builder.append(" [size];");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public int describeContents() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(additionalMethodsEtc, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * TODO Check if Https is being used correctly
   */
  public String isTransportLayerSecured(final String url) {
    String _xifexpression = null;
    boolean _startsWith = url.startsWith("https://");
    if (_startsWith) {
      _xifexpression = "HttpsURLConnection";
    } else {
      _xifexpression = "HttpURLConnection";
    }
    return _xifexpression;
  }
  
  public CharSequence setRequestProperty(final CharSequence key, final CharSequence parameterOrLiteral) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("urlConnection.setRequestProperty(\"");
    _builder.append(key, "");
    _builder.append("\", ");
    _builder.append(parameterOrLiteral, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateExceptionHandlerLoggingAndThrow(final CharSequence exceptionType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("}catch(");
    _builder.append(exceptionType, "");
    _builder.append(" e) // TODO do error handling on the UI thread? Toast#show or pass it on via the result object thru the Loader?");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (BuildConfig.DEBUG)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Log.d(\"MOBGEN\", \"...\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("throw e;");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * TODO must escape nasty symbols in the header injection part using URLEncoder#encode/?
   */
  public CharSequence httpRequestBuilder(final CharSequence url, final CharSequence method, final CharSequence requestPropertyKeyValuePairs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("URL url = new URL(\"");
    _builder.append(url, "");
    _builder.append("\"); // URLEncoder.encode(...) ");
    _builder.newLineIfNotEmpty();
    String _string = url.toString();
    String _isTransportLayerSecured = this.isTransportLayerSecured(_string);
    _builder.append(_isTransportLayerSecured, "");
    _builder.append(" urlConnection = new ");
    String _string_1 = url.toString();
    String _isTransportLayerSecured_1 = this.isTransportLayerSecured(_string_1);
    _builder.append(_isTransportLayerSecured_1, "");
    _builder.append("(url);");
    _builder.newLineIfNotEmpty();
    _builder.append(requestPropertyKeyValuePairs, "");
    _builder.newLineIfNotEmpty();
    _builder.append("urlConnection.setMethod(\"");
    String _string_2 = method.toString();
    String _upperCase = _string_2.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("urlConnection.setConnectionTimeout(10000); // 10 seconds, default over configuration principle");
    _builder.newLine();
    _builder.append("urlConnection.setReadTimeout(10000); // 10 seconds");
    _builder.newLine();
    _builder.append("urlConnection.setDoInput(true)");
    _builder.newLine();
    {
      String _string_3 = method.toString();
      boolean _startsWith = _string_3.startsWith("P");
      if (_startsWith) {
        _builder.append(" // if POST or PUT");
        _builder.newLineIfNotEmpty();
        _builder.append("urlConnection.setDoOutput(true); // consider: urlConnection.setDoOutput(urlConnection.getMethod().toUpperCase().startsWith(\"P\")); // POST and PUT");
        _builder.newLine();
      } else {
        _builder.append("urlConnection.setDoOutput(false);");
        _builder.newLine();
      }
    }
    _builder.append("InputStream in = null;");
    _builder.newLine();
    {
      String _string_4 = method.toString();
      boolean _startsWith_1 = _string_4.startsWith("P");
      if (_startsWith_1) {
        _builder.append(" // if POST or PUT");
        _builder.newLineIfNotEmpty();
        _builder.append("OutputStream out = null;");
        _builder.newLine();
      }
    }
    _builder.append("try");
    _builder.newLine();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("urlConnection.connect();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!url.getHost().equals(urlConnection.getURL().getHost())) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new IllegalStateException(\"You were probably redirected to a sign-on.\"); // TODO Let the Activity/Fragment handle this...");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO fire up a browser to sign-on. sharedIntent.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("in = new BufferedInputStream(urlConnection.getInputStream());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("readStream(in);");
    _builder.newLine();
    _builder.append("\t");
    {
      String _string_5 = method.toString();
      boolean _startsWith_2 = _string_5.startsWith("P");
      if (_startsWith_2) {
        _builder.append(" // if POST or PUT");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("out = new BufferedOutputStream(urlConnection.getOutputStream());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("writeStream(out);");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("if (BuildConfig.DEBUG)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Map<String, List<String>> responseHeaders = urlConnection.getHeaderFields(); // do import statement");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (Map.Entry<String, List> entry : map.entrySet())");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("StringBuffer stringList = new StringBuffer();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("for (String s : entry.getValue())");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("stringList.append(s);\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("Log.e(\"MOBGEN\", String.format(\"key = %s / value = %s\", entry.getKey(), stringList.toString()));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    CharSequence _generateExceptionHandlerLoggingAndThrow = this.generateExceptionHandlerLoggingAndThrow("IOException");
    _builder.append(_generateExceptionHandlerLoggingAndThrow, "");
    _builder.newLineIfNotEmpty();
    CharSequence _generateExceptionHandlerLoggingAndThrow_1 = this.generateExceptionHandlerLoggingAndThrow("UnknownServiceException");
    _builder.append(_generateExceptionHandlerLoggingAndThrow_1, "");
    _builder.newLineIfNotEmpty();
    CharSequence _generateExceptionHandlerLoggingAndThrow_2 = this.generateExceptionHandlerLoggingAndThrow("IllegalAccessError");
    _builder.append(_generateExceptionHandlerLoggingAndThrow_2, "");
    _builder.newLineIfNotEmpty();
    _builder.append("}finally {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (urlConnection != null)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("urlConnection.disconnect(); // TODO handle this exception separately");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (in != null)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("in.close(); // TODO handle this exception separately");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    {
      String _string_6 = method.toString();
      boolean _startsWith_3 = _string_6.startsWith("P");
      if (_startsWith_3) {
        _builder.append(" // if POST or PUT");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("if (out != null)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("out.close(); // TODO handle this exception separately");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    CharSequence _generateExceptionHandlerLoggingAndThrow_3 = this.generateExceptionHandlerLoggingAndThrow("IOException");
    _builder.append(_generateExceptionHandlerLoggingAndThrow_3, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
