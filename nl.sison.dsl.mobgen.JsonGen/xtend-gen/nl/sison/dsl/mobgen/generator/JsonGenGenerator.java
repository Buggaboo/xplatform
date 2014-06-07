/**
 * generated by Xtext
 */
package nl.sison.dsl.mobgen.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nl.sison.dsl.mobgen.jsonGen.JsonNumber;
import nl.sison.dsl.mobgen.jsonGen.JsonObject;
import nl.sison.dsl.mobgen.jsonGen.JsonValue;
import nl.sison.dsl.mobgen.jsonGen.Member;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class JsonGenGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    final Iterable<JsonObject> JsonObjects = Iterables.<JsonObject>filter(_contents, JsonObject.class);
    EList<EObject> _contents_1 = resource.getContents();
    boolean _isEmpty = _contents_1.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      for (final JsonObject obj : JsonObjects) {
        this.parseJsonObject("Root", obj, fsa);
      }
    }
  }
  
  /**
   * TODO add mapping of JSONArray
   */
  public CharSequence createJsonParserCtor(final CharSequence className, final JsonObject jsonRootObject) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(className, "");
    _builder.append("(final JSONObject jsonRoot)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Member> _members = jsonRootObject.getMembers();
      for(final Member member : _members) {
        {
          boolean _isOptional = member.isOptional();
          if (_isOptional) {
            _builder.append("\t");
            _builder.append("if (!jsonRoot.isNull(\"");
            String _key = member.getKey();
            _builder.append(_key, "\t");
            _builder.append("\"))");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("this.");
            String _key_1 = member.getKey();
            String _camelCase = this.camelCase(_key_1);
            _builder.append(_camelCase, "\t\t");
            _builder.append(" = ");
            String _mapToSerializedType = this.mapToSerializedType(member);
            _builder.append(_mapToSerializedType, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("this.");
            String _key_2 = member.getKey();
            String _camelCase_1 = this.camelCase(_key_2);
            _builder.append(_camelCase_1, "\t");
            _builder.append(" = ");
            String _mapToSerializedType_1 = this.mapToSerializedType(member);
            _builder.append(_mapToSerializedType_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String mapToSerializedType(final Member member) {
    final JsonValue value = member.getValue();
    final String key = member.getKey();
    JsonObject _obj = value.getObj();
    boolean _notEquals = (!Objects.equal(_obj, null));
    if (_notEquals) {
      String _generatedType = this.getGeneratedType(key);
      return String.format("new %s(jsonRoot.getJsonObject());", _generatedType);
    }
    String _str = value.getStr();
    boolean _notEquals_1 = (!Objects.equal(_str, null));
    if (_notEquals_1) {
      return String.format("jsonRoot.getString(\"%s\")", key);
    }
    boolean _isBool = value.isBool();
    if (_isBool) {
      return String.format("jsonRoot.getBoolean(\"%s\")", key);
    }
    JsonNumber _number = value.getNumber();
    boolean _notEquals_2 = (!Objects.equal(_number, null));
    if (_notEquals_2) {
      boolean _or = false;
      JsonNumber _number_1 = value.getNumber();
      boolean _isFloat = _number_1.isFloat();
      if (_isFloat) {
        _or = true;
      } else {
        JsonNumber _number_2 = value.getNumber();
        boolean _isExp = _number_2.isExp();
        _or = _isExp;
      }
      if (_or) {
        return String.format("jsonRoot.getDouble(\"%s\")", key);
      } else {
        return String.format("jsonRoot.getLong(\"%s\")", key);
      }
    }
    return "UNDEFINED";
  }
  
  public void parseJsonObject(final CharSequence className, final JsonObject jsonRootObject, final IFileSystemAccess fsa) {
    boolean _equals = Objects.equal(jsonRootObject, null);
    if (_equals) {
      return;
    }
    final HashMap<String, String> map = CollectionLiterals.<String, String>newHashMap();
    EList<Member> _members = jsonRootObject.getMembers();
    for (final Member member : _members) {
      {
        final JsonValue value = member.getValue();
        String _key = member.getKey();
        final String key = this.camelCase(_key);
        JsonObject _obj = value.getObj();
        boolean _notEquals = (!Objects.equal(_obj, null));
        if (_notEquals) {
          final String generatedType = this.getGeneratedType(key);
          JsonObject _obj_1 = value.getObj();
          this.parseJsonObject(generatedType, _obj_1, fsa);
          map.put(key, generatedType);
        }
        boolean _isBool = value.isBool();
        if (_isBool) {
          map.put(key, "boolean");
        }
        boolean _and = false;
        String _str = value.getStr();
        boolean _notEquals_1 = (!Objects.equal(_str, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          String _str_1 = value.getStr();
          boolean _isEmpty = _str_1.isEmpty();
          boolean _not = (!_isEmpty);
          _and = _not;
        }
        if (_and) {
          map.put(key, "String");
        }
        final JsonNumber number = value.getNumber();
        boolean _notEquals_2 = (!Objects.equal(number, null));
        if (_notEquals_2) {
          boolean _or = false;
          boolean _isExp = number.isExp();
          if (_isExp) {
            _or = true;
          } else {
            boolean _isFloat = number.isFloat();
            _or = _isFloat;
          }
          if (_or) {
            map.put(key, "Double");
          } else {
            map.put(key, "Long");
          }
        }
      }
    }
    String _plus = (className + ".java");
    CharSequence _createJsonParserCtor = this.createJsonParserCtor(className, jsonRootObject);
    CharSequence _createParcelable = this.createParcelable(className, map, _createJsonParserCtor);
    fsa.generateFile(_plus, _createParcelable);
  }
  
  /**
   * TODO read http://stackoverflow.com/questions/10071502/read-writing-arrays-of-parcelable-objects
   */
  public Object parseJsonListItem(final JsonValue value, final Map<String, String> map, final String key, final IFileSystemAccess fsa) {
    Object _elvis = null;
    JsonObject _obj = value.getObj();
    if (_obj != null) {
      _elvis = _obj;
    } else {
      String _xblockexpression = null;
      {
        String _string = key.toString();
        String _capitalizeFirstLetter = this.capitalizeFirstLetter(_string);
        JsonObject _obj_1 = value.getObj();
        this.parseJsonObject(_capitalizeFirstLetter, _obj_1, fsa);
        _xblockexpression = map.put("Parcelable[]", (key + "s"));
      }
      _elvis = _xblockexpression;
    }
    return _elvis;
  }
  
  /**
   * We got, boolean (faked Integer), Integers, Serializables, Parcelables, String, Arrays...
   * source: http://idlesun.blogspot.nl/2012/12/android-parcelable-example-2-subobject.html
   * 
   * Parcelables are actually just POJOs that are faster than Serializables,
   * only Parcelables require manual work to pass on values from one object to the next
   * 
   * This type of parcelable contains an Exception field in case of failure along the way
   * e.g. no internet connection etc.
   * This implementation is intended to be passed on from the background threads
   * to the ui thread
   */
  private final LinkedList<String> acceptedTypes = CollectionLiterals.<String>newLinkedList("String", "Integer", "Long", "Float", "Double");
  
  public CharSequence createParcelable(final CharSequence parcelableClassName, final Map<String, String> members, final CharSequence additionalMethodsEtc) {
    StringConcatenation _builder = new StringConcatenation();
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
    Set<Map.Entry<String, String>> _entrySet_2 = members.entrySet();
    final Function1<Map.Entry<String, String>, String> _function = new Function1<Map.Entry<String, String>, String>() {
      public String apply(final Map.Entry<String, String> t) {
        String _value = t.getValue();
        String _key = t.getKey();
        return String.format("final %s %s", _value, _key);
      }
    };
    Iterable<String> _map = IterableExtensions.<Map.Entry<String, String>, String>map(_entrySet_2, _function);
    String _join = IterableExtensions.join(_map, ", ");
    _builder.append(_join, "    ");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("{");
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet_3 = members.entrySet();
      for(final Map.Entry<String, String> s_2 : _entrySet_3) {
        _builder.append("\t");
        _builder.append("this.");
        String _key_2 = s_2.getKey();
        _builder.append(_key_2, "\t");
        _builder.append(" = ");
        String _key_3 = s_2.getKey();
        _builder.append(_key_3, "\t");
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
    _builder.append("(Exception exception)");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
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
      for(final Map.Entry<String, String> s_3 : _entrySet_4) {
        {
          String _value_2 = s_3.getValue();
          boolean _contains = this.acceptedTypes.contains(_value_2);
          if (_contains) {
            _builder.append("\t");
            _builder.append("out.write");
            String _value_3 = s_3.getValue();
            _builder.append(_value_3, "\t");
            _builder.append("(");
            String _key_4 = s_3.getKey();
            _builder.append(_key_4, "\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            String _value_4 = s_3.getValue();
            boolean _equals = _value_4.equals("boolean");
            if (_equals) {
              _builder.append("\t");
              _builder.append("out.writeInteger(");
              String _key_5 = s_3.getKey();
              _builder.append(_key_5, "\t");
              _builder.append(" ? 1 : 0);");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append("out.writeParcelable(");
              String _key_6 = s_3.getKey();
              _builder.append(_key_6, "\t");
              _builder.append(", flags);");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("out.writeSerializable(exception);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void readFromParcel(Parcel in) {");
    _builder.newLine();
    {
      Set<Map.Entry<String, String>> _entrySet_5 = members.entrySet();
      for(final Map.Entry<String, String> s_4 : _entrySet_5) {
        {
          String _value_5 = s_4.getValue();
          boolean _contains_1 = this.acceptedTypes.contains(_value_5);
          if (_contains_1) {
            _builder.append("\t");
            String _key_7 = s_4.getKey();
            _builder.append(_key_7, "\t");
            _builder.append(" = in.read");
            String _value_6 = s_4.getValue();
            _builder.append(_value_6, "\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          } else {
            String _value_7 = s_4.getValue();
            boolean _equals_1 = _value_7.equals("boolean");
            if (_equals_1) {
              _builder.append("\t");
              String _key_8 = s_4.getKey();
              _builder.append(_key_8, "\t");
              _builder.append(" = in.readInteger() > 0;");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              String _key_9 = s_4.getKey();
              String _value_8 = s_4.getValue();
              CharSequence _createParcelableReadMember = this.createParcelableReadMember(_key_9, _value_8);
              _builder.append(_createParcelableReadMember, "\t");
              _builder.newLineIfNotEmpty();
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
    _builder.append("[size];");
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
  
  public CharSequence createParcelableReadMember(final String parameterName, final CharSequence readMethodNameSuffix) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(parameterName, "");
    _builder.append(" = in.readParcelable(");
    String _generatedType = this.getGeneratedType(parameterName);
    _builder.append(_generatedType, "");
    _builder.append(".class.getClassLoader());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createParcelableAccessors(final CharSequence parameterName, final CharSequence parameterType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void set");
    String _string = parameterName.toString();
    String _capitalizeFirstLetter = this.capitalizeFirstLetter(_string);
    _builder.append(_capitalizeFirstLetter, "");
    _builder.append("(final ");
    _builder.append(parameterType, "");
    _builder.append(" ");
    _builder.append(parameterName, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("this.");
    _builder.append(parameterName, "\t");
    _builder.append(" = ");
    _builder.append(parameterName, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append(parameterType, "");
    _builder.append(" get");
    String _string_1 = parameterName.toString();
    String _capitalizeFirstLetter_1 = this.capitalizeFirstLetter(_string_1);
    _builder.append(_capitalizeFirstLetter_1, "");
    _builder.append("() { return ");
    _builder.append(parameterName, "");
    _builder.append("; }");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String camelCase(final CharSequence headerKey) {
    String _string = headerKey.toString();
    String _replaceAll = _string.replaceAll("\\s", "-");
    String[] _split = _replaceAll.split("-");
    final Function1<String, String> _function = new Function1<String, String>() {
      public String apply(final String s) {
        return JsonGenGenerator.this.capitalizeFirstLetter(s);
      }
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    final String strArr = IterableExtensions.join(_map, "");
    String _substring = strArr.substring(0, 1);
    String _lowerCase = _substring.toLowerCase();
    String _substring_1 = strArr.substring(1);
    return (_lowerCase + _substring_1);
  }
  
  public String capitalizeFirstLetter(final String s) {
    String _substring = s.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _substring_1 = s.substring(1);
    return (_upperCase + _substring_1);
  }
  
  public String getGeneratedType(final String s) {
    String _camelCase = this.camelCase(s);
    return this.capitalizeFirstLetter(_camelCase);
  }
}
