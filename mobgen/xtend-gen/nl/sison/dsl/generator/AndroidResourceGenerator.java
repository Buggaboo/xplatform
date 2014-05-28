package nl.sison.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import nl.sison.dsl.mobgen.EnumInstance;
import nl.sison.dsl.mobgen.MapInstance;
import nl.sison.dsl.mobgen.Mobgen;
import nl.sison.dsl.mobgen.MobgenResourceDefinition;
import nl.sison.dsl.mobgen.NestedType;
import nl.sison.dsl.mobgen.StringList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AndroidResourceGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Mobgen mobgen = ((Mobgen) _head);
    EList<MobgenResourceDefinition> _resources = mobgen.getResources();
    final Iterable<MapInstance> mapInstances = Iterables.<MapInstance>filter(_resources, MapInstance.class);
    final Function1<MapInstance, String> _function = new Function1<MapInstance, String>() {
      public String apply(final MapInstance m) {
        return AndroidResourceGenerator.this.joinAndroidMapNameWithKeyValuePairs(m);
      }
    };
    Iterable<String> _map = IterableExtensions.<MapInstance, String>map(mapInstances, _function);
    String _join = IterableExtensions.join(_map, "");
    fsa.generateFile("mobgen_strings.xml", _join);
    boolean _isEmpty = IterableExtensions.isEmpty(mapInstances);
    InputOutput.<Boolean>println(Boolean.valueOf(_isEmpty));
  }
  
  /**
   * Enum related stuff
   */
  public void writeAndroidEnumFiles(final Iterator<EnumInstance> instances, final IFileSystemAccess fsa) {
    final Procedure1<EnumInstance> _function = new Procedure1<EnumInstance>() {
      public void apply(final EnumInstance m) {
        String _name = m.getName();
        String _capitalizeFirstLetter = AndroidResourceGenerator.this.capitalizeFirstLetter(_name);
        String _plus = (_capitalizeFirstLetter + "Enum.java");
        String _name_1 = m.getName();
        String _capitalizeFirstLetter_1 = AndroidResourceGenerator.this.capitalizeFirstLetter(_name_1);
        EList<String> _values = m.getValues();
        String _join = IterableExtensions.join(_values, ",\n");
        CharSequence _androidParcelableEnumTemplate = AndroidResourceGenerator.this.androidParcelableEnumTemplate(_capitalizeFirstLetter_1, _join);
        fsa.generateFile(_plus, _androidParcelableEnumTemplate);
      }
    };
    IteratorExtensions.<EnumInstance>forEach(instances, _function);
    final Procedure1<EnumInstance> _function_1 = new Procedure1<EnumInstance>() {
      public void apply(final EnumInstance m) {
        String _name = m.getName();
        String _capitalizeFirstLetter = AndroidResourceGenerator.this.capitalizeFirstLetter(_name);
        String _plus = (_capitalizeFirstLetter + "Enum.java");
        String _name_1 = m.getName();
        String _capitalizeFirstLetter_1 = AndroidResourceGenerator.this.capitalizeFirstLetter(_name_1);
        EList<String> _values = m.getValues();
        String _join = IterableExtensions.join(_values, ",\n");
        CharSequence _javaEnumTemplate = AndroidResourceGenerator.this.javaEnumTemplate(_capitalizeFirstLetter_1, _join);
        fsa.generateFile(_plus, _javaEnumTemplate);
      }
    };
    IteratorExtensions.<EnumInstance>forEach(instances, _function_1);
  }
  
  public String capitalizeFirstLetter(final String s) {
    String _substring = s.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _substring_1 = s.substring(1);
    return (_upperCase + _substring_1);
  }
  
  public CharSequence javaEnumTemplate(final String name, final String commaSeparatedValues) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* TODO extend with whatever attributes you want to extend this with");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public enum ");
    _builder.append(name, "");
    _builder.append("Enum {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(commaSeparatedValues, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence androidParcelableEnumTemplate(final String name, final String commaSeparatedValues) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import android.os.Parcel;");
    _builder.newLine();
    _builder.append("import android.os.Parcelable;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public enum ");
    _builder.append(name, "");
    _builder.append("Enum implements Parcelable {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(commaSeparatedValues, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// TODO extend with resource in the ctor (either android assets to spare switches or conditional statements)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Status createFromParcel(Parcel in) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return ");
    _builder.append(name, "\t\t\t");
    _builder.append("Enum.values()[in.readInt()];");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public Status[] newArray(int size) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return new ");
    _builder.append(name, "\t\t\t");
    _builder.append("Enum[size];");
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
   * Map related code
   */
  public String joinAndroidMapNameWithKeyValuePairs(final MapInstance instance) {
    String _name = instance.getName();
    final String name = _name.toLowerCase();
    EList<String> _keys = instance.getKeys();
    final ListIterator<String> keys = _keys.listIterator();
    EList<NestedType> _values = instance.getValues();
    final ListIterator<NestedType> values = _values.listIterator();
    StringBuffer result = new StringBuffer();
    boolean _or = false;
    boolean _hasNext = keys.hasNext();
    if (_hasNext) {
      _or = true;
    } else {
      boolean _hasNext_1 = values.hasNext();
      _or = _hasNext_1;
    }
    boolean _while = _or;
    while (_while) {
      {
        final NestedType value = values.next();
        final String key = keys.next();
        StringList _list = value.getList();
        boolean _notEquals = (!Objects.equal(_list, null));
        if (_notEquals) {
          final NestedType items = value;
          StringList _list_1 = items.getList();
          EList<String> _values_1 = _list_1.getValues();
          final Function1<String, CharSequence> _function = new Function1<String, CharSequence>() {
            public CharSequence apply(final String s) {
              return AndroidResourceGenerator.this.androidResourceItemize(s);
            }
          };
          List<CharSequence> _map = ListExtensions.<String, CharSequence>map(_values_1, _function);
          String _join = IterableExtensions.join(_map, "");
          CharSequence _androidKeyStringArray = this.androidKeyStringArray(name, key, _join);
          result.append(_androidKeyStringArray);
        } else {
          String _string = value.getString();
          boolean _notEquals_1 = (!Objects.equal(_string, null));
          if (_notEquals_1) {
            String _string_1 = value.getString();
            CharSequence _androidKeyString = this.androidKeyString(name, key, _string_1);
            result.append(_androidKeyString);
          }
        }
      }
      boolean _or_1 = false;
      boolean _hasNext_2 = keys.hasNext();
      if (_hasNext_2) {
        _or_1 = true;
      } else {
        boolean _hasNext_3 = values.hasNext();
        _or_1 = _hasNext_3;
      }
      _while = _or_1;
    }
    return result.toString();
  }
  
  public CharSequence androidKeyString(final CharSequence mapName, final CharSequence key, final CharSequence value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<string name=\"");
    _builder.append(mapName, "");
    _builder.append("_");
    _builder.append(key, "");
    _builder.append("\">");
    _builder.append(value, "");
    _builder.append("</string>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence androidResourceItemize(final CharSequence s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<item>");
    _builder.append(s, "");
    _builder.append("</item>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence androidKeyStringArray(final CharSequence mapName, final CharSequence key, final CharSequence s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<string-array name=\"");
    _builder.append(mapName, "");
    _builder.append("_");
    _builder.append(key, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(s, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</string-array>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence androidResourceXMLWrap(final String s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
    _builder.newLine();
    _builder.append("<resources>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(s, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</resources>");
    return _builder;
  }
}
