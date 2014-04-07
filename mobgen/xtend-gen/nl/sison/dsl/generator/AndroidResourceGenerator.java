package nl.sison.dsl.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.ListIterator;
import nl.sison.dsl.mobgen.EnumInstance;
import nl.sison.dsl.mobgen.MapInstance;
import nl.sison.dsl.mobgen.NestedType;
import nl.sison.dsl.mobgen.StringList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AndroidResourceGenerator implements IGenerator {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    final Iterator<MapInstance> mapInstances = Iterators.<MapInstance>filter(_allContents, MapInstance.class);
    String _prepareAndroidMap = this.prepareAndroidMap(mapInstances);
    CharSequence _androidResourceXMLWrap = this.androidResourceXMLWrap(_prepareAndroidMap);
    fsa.generateFile("mobgen_strings.xml", _androidResourceXMLWrap);
    TreeIterator<EObject> _allContents_1 = input.getAllContents();
    final Iterator<EnumInstance> enumInstances = Iterators.<EnumInstance>filter(_allContents_1, EnumInstance.class);
    this.writeJavaEnumFiles(enumInstances, fsa);
  }
  
  /**
   * Enum related stuff
   */
  public void writeJavaEnumFiles(final Iterator<EnumInstance> instances, final IFileSystemAccess fsa) {
    final Procedure1<EnumInstance> _function = new Procedure1<EnumInstance>() {
        public void apply(final EnumInstance m) {
          String _name = m.getName();
          String _capitalizeFirstLetter = AndroidResourceGenerator.this.capitalizeFirstLetter(_name);
          String _plus = (_capitalizeFirstLetter + "Enum");
          String _name_1 = m.getName();
          String _capitalizeFirstLetter_1 = AndroidResourceGenerator.this.capitalizeFirstLetter(_name_1);
          EList<String> _values = m.getValues();
          String _join = IterableExtensions.join(_values, ",\n");
          CharSequence _javaEnumTemplate = AndroidResourceGenerator.this.javaEnumTemplate(_capitalizeFirstLetter_1, _join);
          fsa.generateFile(_plus, _javaEnumTemplate);
        }
      };
    IteratorExtensions.<EnumInstance>forEach(instances, _function);
  }
  
  public String capitalizeFirstLetter(final String s) {
    String _substring = s.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _substring_1 = s.substring(1);
    return (_upperCase + _substring_1);
  }
  
  public CharSequence javaEnumTemplate(final String name, final String commaSeparatedValues) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public enum ");
    _builder.append(name, "");
    _builder.append("Enum {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(commaSeparatedValues, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Map related code
   */
  public String prepareAndroidMap(final Iterator<MapInstance> instances) {
    final Function1<MapInstance,String> _function = new Function1<MapInstance,String>() {
        public String apply(final MapInstance m) {
          String _joinAndroidMapNameWithKeyValuePairs = AndroidResourceGenerator.this.joinAndroidMapNameWithKeyValuePairs(m);
          return _joinAndroidMapNameWithKeyValuePairs;
        }
      };
    Iterator<String> _map = IteratorExtensions.<MapInstance, String>map(instances, _function);
    return IteratorExtensions.join(_map, "");
  }
  
  public String joinAndroidMapNameWithKeyValuePairs(final MapInstance instance) {
    String _name = instance.getName();
    final String name = _name.toLowerCase();
    EList<String> _keys = instance.getKeys();
    final ListIterator<String> keys = _keys.listIterator();
    EList<NestedType> _values = instance.getValues();
    final ListIterator<NestedType> values = _values.listIterator();
    StringBuffer _stringBuffer = new StringBuffer();
    StringBuffer result = _stringBuffer;
    boolean _and = false;
    boolean _hasNext = keys.hasNext();
    if (!_hasNext) {
      _and = false;
    } else {
      boolean _hasNext_1 = values.hasNext();
      _and = (_hasNext && _hasNext_1);
    }
    boolean _while = _and;
    while (_while) {
      {
        final NestedType value = values.next();
        if ((value instanceof StringList)) {
        } else {
          String _next = keys.next();
          String _string = value.toString();
          CharSequence _androidKeyString = this.androidKeyString(name, _next, _string);
          String _string_1 = _androidKeyString.toString();
          result.append(_string_1);
        }
      }
      boolean _and_1 = false;
      boolean _hasNext_2 = keys.hasNext();
      if (!_hasNext_2) {
        _and_1 = false;
      } else {
        boolean _hasNext_3 = values.hasNext();
        _and_1 = (_hasNext_2 && _hasNext_3);
      }
      _while = _and_1;
    }
    String _string = result.toString();
    String _plus = ("result: " + _string);
    InputOutput.<String>println(_plus);
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
    _builder.append("    ");
    _builder.append(s, "    ");
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
    _builder.append(s, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</resources>");
    return _builder;
  }
}
