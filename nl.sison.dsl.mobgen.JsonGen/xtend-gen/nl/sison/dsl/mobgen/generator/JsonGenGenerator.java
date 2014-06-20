package nl.sison.dsl.mobgen.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nl.sison.dsl.mobgen.jsonGen.ExJsonDateTime;
import nl.sison.dsl.mobgen.jsonGen.ExJsonEnum;
import nl.sison.dsl.mobgen.jsonGen.JsonArray;
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
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

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
  
  public CharSequence createConcurrentDateFormatHashMap() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.text.DateFormat;");
    _builder.newLine();
    _builder.append("import java.text.ParseException;");
    _builder.newLine();
    _builder.append("import java.text.SimpleDateFormat;");
    _builder.newLine();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.append("import java.util.concurrent.ConcurrentHashMap;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ConcurrentDateFormatHashMap {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("final private static ConcurrentHashMap<String, ThreadLocal<DateFormat>> concurrentHashMap = new ConcurrentHashMap<String, ThreadLocal<DateFormat>>();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ConcurrentDateFormatHashMap() {}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static Date convertStringToDate(final String dateFormatString, final String dateString)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("throws ParseException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (!concurrentHashMap.containsKey(dateFormatString))");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("concurrentHashMap.put(dateFormatString, new ThreadLocal<DateFormat>() {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("public DateFormat get() {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("return super.get();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("protected DateFormat initialValue() {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("return new SimpleDateFormat(dateFormatString);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("public void remove() {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("super.remove();");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("public void set(DateFormat value) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("super.set(value);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("});");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return concurrentHashMap.get(dateFormatString).get().parse(dateString);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createJsonParserCtor(final CharSequence className, final JsonObject jsonRootObject) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    _builder.append(className, "");
    _builder.append("(final JSONObject jsonRoot)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try {");
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
            {
              JsonValue _value = member.getValue();
              JsonArray _array = _value.getArray();
              boolean _notEquals = (!Objects.equal(_array, null));
              if (_notEquals) {
                _builder.append("\t");
                _builder.append("\t");
                CharSequence _createJsonArrayParser = this.createJsonArrayParser(member);
                _builder.append(_createJsonArrayParser, "\t\t");
                _builder.newLineIfNotEmpty();
              } else {
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
              }
            }
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            {
              JsonValue _value_1 = member.getValue();
              JsonArray _array_1 = _value_1.getArray();
              boolean _notEquals_1 = (!Objects.equal(_array_1, null));
              if (_notEquals_1) {
                _builder.append("\t");
                CharSequence _createJsonArrayParser_1 = this.createJsonArrayParser(member);
                _builder.append(_createJsonArrayParser_1, "\t");
                _builder.newLineIfNotEmpty();
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
      }
    }
    _builder.append("\t");
    _builder.append("} catch (JSONException e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.exception = e;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createJsonArrayParser(final Member member) {
    final String key = member.getKey();
    final String camelCaseKey = this.camelCase(key);
    JsonValue _value = member.getValue();
    JsonArray _array = _value.getArray();
    EList<JsonValue> _values = _array.getValues();
    final JsonValue value = IterableExtensions.<JsonValue>head(_values);
    final String generatedType = this.getGeneratedType(key);
    JsonObject _obj = value.getObj();
    boolean _notEquals = (!Objects.equal(_obj, null));
    if (_notEquals) {
      String _format = String.format("new %s(", generatedType);
      return this.createJsonArrayParser(key, camelCaseKey, generatedType, "JSONObject", _format);
    }
    String _str = value.getStr();
    boolean _notEquals_1 = (!Objects.equal(_str, null));
    if (_notEquals_1) {
      return this.createJsonArrayParser(key, camelCaseKey, "String", "String", "");
    }
    boolean _isBool = value.isBool();
    if (_isBool) {
      return this.createJsonArrayParser(key, camelCaseKey, "boolean", "Boolean", "");
    }
    boolean _isFloat = value.isFloat();
    if (_isFloat) {
      return this.createJsonArrayParser(key, camelCaseKey, "double", "Double", "");
    }
    boolean _isInt = value.isInt();
    if (_isInt) {
      return this.createJsonArrayParser(key, camelCaseKey, "long", "Long", "");
    }
    ExJsonEnum _strFromEnum = value.getStrFromEnum();
    boolean _notEquals_2 = (!Objects.equal(_strFromEnum, null));
    if (_notEquals_2) {
      String _format_1 = String.format("%s.fromString(", generatedType);
      return this.createJsonArrayParser(key, camelCaseKey, generatedType, "String", _format_1);
    }
    ExJsonDateTime _datetime = value.getDatetime();
    boolean _notEquals_3 = (!Objects.equal(_datetime, null));
    if (_notEquals_3) {
      ExJsonDateTime _datetime_1 = value.getDatetime();
      String _format_2 = _datetime_1.getFormat();
      String _format_3 = String.format("ConcurrentDateFormatHashMap.convertStringToDate(\"%s\", ", _format_2);
      return this.createJsonArrayDateParser(key, camelCaseKey, "Date", "String", _format_3);
    }
    return "UNDEFINED";
  }
  
  public CharSequence createJsonArrayParser(final CharSequence jsonKey, final CharSequence prefix, final CharSequence type, final CharSequence jsonType, final CharSequence assignmentAction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("JSONArray ");
    _builder.append(prefix, "");
    _builder.append("JsonArray = jsonRoot.getJSONArray(\"");
    _builder.append(jsonKey, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append(prefix, "");
    _builder.append(" = new ");
    _builder.append(type, "");
    _builder.append("[");
    _builder.append(prefix, "");
    _builder.append("JsonArray.length()];");
    _builder.newLineIfNotEmpty();
    _builder.append("for (int i=0; i<");
    _builder.append(prefix, "");
    _builder.append("JsonArray.length(); i++)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(prefix, "\t");
    _builder.append("[i] = ");
    {
      int _length = assignmentAction.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append(assignmentAction, "\t");
      }
    }
    _builder.append(prefix, "\t");
    _builder.append("JsonArray.get");
    _builder.append(jsonType, "\t");
    _builder.append("(i)");
    {
      int _length_1 = assignmentAction.length();
      boolean _greaterThan_1 = (_length_1 > 0);
      if (_greaterThan_1) {
        _builder.append(")");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createJsonArrayDateParser(final CharSequence jsonKey, final CharSequence prefix, final CharSequence type, final CharSequence jsonType, final CharSequence assignmentAction) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("JSONArray ");
    _builder.append(prefix, "");
    _builder.append("JsonArray = jsonRoot.getJSONArray(\"");
    _builder.append(jsonKey, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append(prefix, "");
    _builder.append(" = new ");
    _builder.append(type, "");
    _builder.append("[");
    _builder.append(prefix, "");
    _builder.append("JsonArray.length()];");
    _builder.newLineIfNotEmpty();
    _builder.append("for (int i=0; i<");
    _builder.append(prefix, "");
    _builder.append("JsonArray.length(); i++)");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append(prefix, "\t\t");
    _builder.append("[i] = ");
    {
      int _length = assignmentAction.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _builder.append(assignmentAction, "\t\t");
      }
    }
    _builder.append(prefix, "\t\t");
    _builder.append("JsonArray.get");
    _builder.append(jsonType, "\t\t");
    _builder.append("(i)");
    {
      int _length_1 = assignmentAction.length();
      boolean _greaterThan_1 = (_length_1 > 0);
      if (_greaterThan_1) {
        _builder.append(")");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}catch (ParseException ex)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.exception = ex;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
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
      return String.format("new %s(jsonRoot.getJSONObject(\"%s\"));", _generatedType, key);
    }
    String _str = value.getStr();
    boolean _notEquals_1 = (!Objects.equal(_str, null));
    if (_notEquals_1) {
      return String.format("jsonRoot.getString(\"%s\");", key);
    }
    boolean _isBool = value.isBool();
    if (_isBool) {
      return String.format("jsonRoot.getBoolean(\"%s\");", key);
    }
    boolean _isFloat = value.isFloat();
    if (_isFloat) {
      return String.format("jsonRoot.getDouble(\"%s\");", key);
    }
    boolean _isInt = value.isInt();
    if (_isInt) {
      return String.format("jsonRoot.getLong(\"%s\");", key);
    }
    ExJsonEnum _strFromEnum = value.getStrFromEnum();
    boolean _notEquals_2 = (!Objects.equal(_strFromEnum, null));
    if (_notEquals_2) {
      String _generatedType_1 = this.getGeneratedType(key);
      String _plus = (_generatedType_1 + "Enum");
      return String.format("%s.fromString(jsonRoot.getString(\"%s\"));", _plus, key);
    }
    ExJsonDateTime _datetime = value.getDatetime();
    boolean _notEquals_3 = (!Objects.equal(_datetime, null));
    if (_notEquals_3) {
      final ExJsonDateTime df = value.getDatetime();
      String _xifexpression = null;
      boolean _isUtc = df.isUtc();
      if (_isUtc) {
        _xifexpression = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'";
      } else {
        _xifexpression = df.getFormat();
      }
      return String.format("ConcurrentDateFormatHashMap.convertStringToDate(\"%s\", jsonRoot.getString(\"%s\"));", _xifexpression, key);
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
        boolean _isFloat = value.isFloat();
        if (_isFloat) {
          map.put(key, "double");
        }
        boolean _isInt = value.isInt();
        if (_isInt) {
          map.put(key, "long");
        }
        ExJsonEnum _strFromEnum = value.getStrFromEnum();
        boolean _notEquals_2 = (!Objects.equal(_strFromEnum, null));
        if (_notEquals_2) {
          String _generatedType = this.getGeneratedType(key);
          final String generatedType_1 = (_generatedType + "Enum");
          ExJsonEnum _strFromEnum_1 = value.getStrFromEnum();
          EList<String> _values = _strFromEnum_1.getValues();
          this.createParcelableEnumType(generatedType_1, _values, fsa);
          map.put(key, generatedType_1);
        }
        ExJsonDateTime _datetime = value.getDatetime();
        boolean _notEquals_3 = (!Objects.equal(_datetime, null));
        if (_notEquals_3) {
          CharSequence _createConcurrentDateFormatHashMap = this.createConcurrentDateFormatHashMap();
          fsa.generateFile("ConcurrentDateFormatHashMap.java", _createConcurrentDateFormatHashMap);
          map.put(key, "Date");
        }
        JsonArray _array = value.getArray();
        boolean _notEquals_4 = (!Objects.equal(_array, null));
        if (_notEquals_4) {
          JsonArray _array_1 = value.getArray();
          EList<JsonValue> _values_1 = _array_1.getValues();
          JsonValue _head = IterableExtensions.<JsonValue>head(_values_1);
          this.parseJsonArray(_head, map, key, fsa);
        }
      }
    }
    String _plus = (className + ".java");
    CharSequence _createJsonParserCtor = this.createJsonParserCtor(className, jsonRootObject);
    CharSequence _createParcelable = this.createParcelable(className, map, _createJsonParserCtor);
    fsa.generateFile(_plus, _createParcelable);
  }
  
  public void createParcelableEnumType(final CharSequence classNamePrefix, final List<String> enumValues, final IFileSystemAccess fsa) {
    String _plus = (classNamePrefix + ".java");
    CharSequence _createParcelableEnumTypeString = this.createParcelableEnumTypeString(classNamePrefix, enumValues);
    fsa.generateFile(_plus, _createParcelableEnumTypeString);
  }
  
  public CharSequence createParcelableEnumTypeString(final CharSequence classNamePrefix, final List<String> enumValues) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.os.Parcel;");
    _builder.newLine();
    _builder.append("import android.os.Parcelable;");
    _builder.newLine();
    _builder.append("import android.support.v4.os.ParcelableCompat;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public enum ");
    _builder.append(classNamePrefix, "");
    _builder.append(" implements Parcelable {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    final Function1<String, String> _function = new Function1<String, String>() {
      public String apply(final String v) {
        String _camelCase = JsonGenGenerator.this.camelCase(v);
        String _plus = (_camelCase + "(\"");
        String _plus_1 = (_plus + v);
        return (_plus_1 + "\")");
      }
    };
    List<String> _map = ListExtensions.<String, String>map(enumValues, _function);
    String _join = IterableExtensions.join(_map, ",\n");
    _builder.append(_join, "\t");
    _builder.append(", DEFAULT(\"default\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO extend with resource in the ctor (either android assets to spare switches or conditional statements)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String text;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append(classNamePrefix, "\t");
    _builder.append("(String text) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t");
    _builder.append("this.text = text;");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getText() {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return this.text;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static ");
    _builder.append(classNamePrefix, "\t");
    _builder.append(" fromString(String text) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t");
    _builder.append("if (text != null) {");
    _builder.newLine();
    _builder.append("      \t\t");
    _builder.append("for (");
    _builder.append(classNamePrefix, "      \t\t");
    _builder.append(" b : ");
    _builder.append(classNamePrefix, "      \t\t");
    _builder.append(".values()) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        \t\t");
    _builder.append("if (text.equalsIgnoreCase(b.text)) {");
    _builder.newLine();
    _builder.append("          \t\t\t");
    _builder.append("return b;");
    _builder.newLine();
    _builder.append("        \t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("      \t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("// prevents hard crashes");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return DEFAULT;");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    _builder.append(classNamePrefix, "\t\t");
    _builder.append(" createFromParcel(Parcel in) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    _builder.append(classNamePrefix, "\t\t\t");
    _builder.append(".values()[in.readInt()];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public ");
    _builder.append(classNamePrefix, "\t\t");
    _builder.append("[] newArray(int size) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return new ");
    _builder.append(classNamePrefix, "\t\t\t");
    _builder.append("[size];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("};");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int describeContents() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void writeToParcel(Parcel out, int flags) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("out.writeInt(ordinal());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * TODO read http://stackoverflow.com/questions/10071502/read-writing-arrays-of-parcelable-objects
   */
  public void parseJsonArray(final JsonValue value, final Map<String, String> map, final String key, final IFileSystemAccess fsa) {
    final String generatedType = this.getGeneratedType(key);
    JsonObject _obj = value.getObj();
    boolean _notEquals = (!Objects.equal(_obj, null));
    if (_notEquals) {
      String _string = key.toString();
      String _capitalizeFirstLetter = this.capitalizeFirstLetter(_string);
      JsonObject _obj_1 = value.getObj();
      this.parseJsonObject(_capitalizeFirstLetter, _obj_1, fsa);
      map.put(key, (generatedType + "[]"));
    }
    String _str = value.getStr();
    boolean _notEquals_1 = (!Objects.equal(_str, null));
    if (_notEquals_1) {
      map.put(key, "String[]");
    }
    boolean _isFloat = value.isFloat();
    if (_isFloat) {
      map.put(key, "double[]");
    }
    boolean _isInt = value.isInt();
    if (_isInt) {
      map.put(key, "long[]");
    }
    boolean _isBool = value.isBool();
    if (_isBool) {
      map.put(key, "boolean[]");
    }
    ExJsonDateTime _datetime = value.getDatetime();
    boolean _notEquals_2 = (!Objects.equal(_datetime, null));
    if (_notEquals_2) {
      map.put(key, "Date[]");
      CharSequence _createConcurrentDateFormatHashMap = this.createConcurrentDateFormatHashMap();
      fsa.generateFile("ConcurrentDateFormatHashMap.java", _createConcurrentDateFormatHashMap);
    }
    ExJsonEnum _strFromEnum = value.getStrFromEnum();
    boolean _notEquals_3 = (!Objects.equal(_strFromEnum, null));
    if (_notEquals_3) {
      map.put(key, (generatedType + "[]"));
      ExJsonEnum _strFromEnum_1 = value.getStrFromEnum();
      EList<String> _values = _strFromEnum_1.getValues();
      this.createParcelableEnumType(generatedType, _values, fsa);
    }
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
  private final LinkedList<String> acceptedTypes = CollectionLiterals.<String>newLinkedList("String", "int", "long", "float", "double");
  
  private final Map<String, String> acceptedArrayTypes = new Function0<Map<String, String>>() {
    public Map<String, String> apply() {
      Map<String, String> _xsetliteral = null;
      Map<String, String> _tempMap = Maps.<String, String>newHashMap();
      _tempMap.put("String[]", "StringArray");
      _tempMap.put("int[]", "IntArray");
      _tempMap.put("long[]", "LongArray");
      _tempMap.put("float[]", "FloatArray");
      _tempMap.put("double[]", "DoubleArray");
      _tempMap.put("boolean[]", "BooleanArray");
      _xsetliteral = Collections.<String, String>unmodifiableMap(_tempMap);
      return _xsetliteral;
    }
  }.apply();
  
  public CharSequence createParcelable(final CharSequence parcelableClassName, final Map<String, String> members, final CharSequence jsonParserCtor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.text.ParseException;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Date;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.json.JSONObject;");
    _builder.newLine();
    _builder.append("import org.json.JSONArray;");
    _builder.newLine();
    _builder.append("import org.json.JSONException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import android.os.Parcel;");
    _builder.newLine();
    _builder.append("import android.os.Parcelable;");
    _builder.newLine();
    _builder.append("import android.support.v4.os.ParcelableCompat;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(parcelableClassName, "");
    _builder.append(" implements Parcelable");
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
        _builder.append("\t\t");
        _builder.append("this.");
        String _key_2 = s_2.getKey();
        _builder.append(_key_2, "\t\t");
        _builder.append(" = ");
        String _key_3 = s_2.getKey();
        _builder.append(_key_3, "\t\t");
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
    _builder.append("(final Exception exception)");
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
            _builder.append("\t\t");
            _builder.append("out.write");
            String _value_3 = s_3.getValue();
            String _capitalizeFirstLetter = this.capitalizeFirstLetter(_value_3);
            _builder.append(_capitalizeFirstLetter, "\t\t");
            _builder.append("(");
            String _key_4 = s_3.getKey();
            _builder.append(_key_4, "\t\t");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          } else {
            String _value_4 = s_3.getValue();
            boolean _containsKey = this.acceptedArrayTypes.containsKey(_value_4);
            if (_containsKey) {
              _builder.append("\t\t");
              _builder.append("out.write");
              String _value_5 = s_3.getValue();
              String _get = this.acceptedArrayTypes.get(_value_5);
              _builder.append(_get, "\t\t");
              _builder.append("(");
              String _key_5 = s_3.getKey();
              _builder.append(_key_5, "\t\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              String _value_6 = s_3.getValue();
              boolean _startsWith = _value_6.startsWith("Date");
              if (_startsWith) {
                _builder.append("\t\t");
                _builder.append("if (");
                String _key_6 = s_3.getKey();
                _builder.append(_key_6, "\t\t");
                _builder.append(" != null)");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("{");
                _builder.newLine();
                {
                  String _value_7 = s_3.getValue();
                  boolean _endsWith = _value_7.endsWith("[]");
                  if (_endsWith) {
                    _builder.append("\t\t");
                    _builder.append("long[] ");
                    String _key_7 = s_3.getKey();
                    _builder.append(_key_7, "\t\t");
                    _builder.append("Array = new long[");
                    String _key_8 = s_3.getKey();
                    _builder.append(_key_8, "\t\t");
                    _builder.append(".length];");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("for (int i=0; i < ");
                    String _key_9 = s_3.getKey();
                    _builder.append(_key_9, "\t\t");
                    _builder.append(".length; i++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("{");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("\t");
                    String _key_10 = s_3.getKey();
                    _builder.append(_key_10, "\t\t\t");
                    _builder.append("Array[i] = ");
                    String _key_11 = s_3.getKey();
                    _builder.append(_key_11, "\t\t\t");
                    _builder.append("[i].getTime();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("out.writeLongArray(");
                    String _key_12 = s_3.getKey();
                    _builder.append(_key_12, "\t\t");
                    _builder.append("Array);");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t");
                    _builder.append("out.writeLong(");
                    String _key_13 = s_3.getKey();
                    _builder.append(_key_13, "\t\t");
                    _builder.append(".getTime());");
                    _builder.newLineIfNotEmpty();
                  }
                }
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              } else {
                String _value_8 = s_3.getValue();
                boolean _equals = _value_8.equals("boolean");
                if (_equals) {
                  _builder.append("\t\t");
                  _builder.append("out.writeInt(");
                  String _key_14 = s_3.getKey();
                  _builder.append(_key_14, "\t\t");
                  _builder.append(" ? 1 : 0);");
                  _builder.newLineIfNotEmpty();
                } else {
                  String _value_9 = s_3.getValue();
                  boolean _endsWith_1 = _value_9.endsWith("[]");
                  if (_endsWith_1) {
                    _builder.append("\t\t");
                    _builder.append("out.writeParcelableArray(");
                    String _key_15 = s_3.getKey();
                    _builder.append(_key_15, "\t\t");
                    _builder.append(", flags);");
                    _builder.newLineIfNotEmpty();
                  } else {
                    _builder.append("\t\t");
                    _builder.append("out.writeParcelable(");
                    String _key_16 = s_3.getKey();
                    _builder.append(_key_16, "\t\t");
                    _builder.append(", flags);");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
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
      for(final Map.Entry<String, String> s_4 : _entrySet_5) {
        {
          String _value_10 = s_4.getValue();
          boolean _contains_1 = this.acceptedTypes.contains(_value_10);
          if (_contains_1) {
            _builder.append("\t\t");
            String _key_17 = s_4.getKey();
            _builder.append(_key_17, "\t\t");
            _builder.append(" = in.read");
            String _value_11 = s_4.getValue();
            String _capitalizeFirstLetter_1 = this.capitalizeFirstLetter(_value_11);
            _builder.append(_capitalizeFirstLetter_1, "\t\t");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
          } else {
            String _value_12 = s_4.getValue();
            boolean _containsKey_1 = this.acceptedArrayTypes.containsKey(_value_12);
            if (_containsKey_1) {
              _builder.append("\t\t");
              _builder.append("in.read");
              String _value_13 = s_4.getValue();
              String _get_1 = this.acceptedArrayTypes.get(_value_13);
              _builder.append(_get_1, "\t\t");
              _builder.append("(");
              String _key_18 = s_4.getKey();
              _builder.append(_key_18, "\t\t");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            } else {
              String _value_14 = s_4.getValue();
              boolean _equals_1 = _value_14.equals("boolean");
              if (_equals_1) {
                _builder.append("\t\t");
                String _key_19 = s_4.getKey();
                _builder.append(_key_19, "\t\t");
                _builder.append(" = in.readInt() > 0;");
                _builder.newLineIfNotEmpty();
              } else {
                String _value_15 = s_4.getValue();
                boolean _startsWith_1 = _value_15.startsWith("Date");
                if (_startsWith_1) {
                  {
                    String _value_16 = s_4.getValue();
                    boolean _endsWith_2 = _value_16.endsWith("[]");
                    if (_endsWith_2) {
                      _builder.append("\t\t");
                      _builder.append("long[] ");
                      String _key_20 = s_4.getKey();
                      _builder.append(_key_20, "\t\t");
                      _builder.append("LongArray = null;");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("in.readLongArray(");
                      String _key_21 = s_4.getKey();
                      _builder.append(_key_21, "\t\t");
                      _builder.append("LongArray);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      String _key_22 = s_4.getKey();
                      _builder.append(_key_22, "\t\t");
                      _builder.append(" = new Date[");
                      String _key_23 = s_4.getKey();
                      _builder.append(_key_23, "\t\t");
                      _builder.append("LongArray.length];");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("for (int i=0; i<");
                      String _key_24 = s_4.getKey();
                      _builder.append(_key_24, "\t\t");
                      _builder.append("LongArray.length; i++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("{");
                      _builder.newLine();
                      _builder.append("\t\t");
                      _builder.append("\t");
                      String _key_25 = s_4.getKey();
                      _builder.append(_key_25, "\t\t\t");
                      _builder.append("[i] = new Date(");
                      String _key_26 = s_4.getKey();
                      _builder.append(_key_26, "\t\t\t");
                      _builder.append("LongArray[i]);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("}");
                      _builder.newLine();
                    } else {
                      _builder.append("\t\t");
                      String _key_27 = s_4.getKey();
                      _builder.append(_key_27, "\t\t");
                      _builder.append(" = new Date(in.readLong());");
                      _builder.newLineIfNotEmpty();
                    }
                  }
                } else {
                  _builder.append("\t\t");
                  String _key_28 = s_4.getKey();
                  String _value_17 = s_4.getValue();
                  CharSequence _createParcelableReadMember = this.createParcelableReadMember(_key_28, _value_17);
                  _builder.append(_createParcelableReadMember, "\t\t");
                  _builder.newLineIfNotEmpty();
                }
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
    _builder.append(jsonParserCtor, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
  
  public CharSequence createParcelableReadMember(final String parameterName, final String type) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(parameterName, "");
    _builder.append(" = (");
    _builder.append(type, "");
    _builder.append(") in.readParcelable");
    {
      boolean _endsWith = type.endsWith("[]");
      if (_endsWith) {
        _builder.append("Array");
      }
    }
    _builder.append("(");
    _builder.append(type, "");
    _builder.append(".class.getClassLoader());");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * TODO make getters return defensive copy
   */
  public CharSequence createParcelableAccessors(final CharSequence parameterName, final CharSequence parameterType) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
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
    _builder.append("public ");
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
  
  public String camelCase(final CharSequence input) {
    String _string = input.toString();
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
