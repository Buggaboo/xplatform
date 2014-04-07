package nl.sison.dsl.generator;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import nl.sison.dsl.mobgen.MobgenCallDefinition;
import nl.sison.dsl.mobgen.URI;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AndroidCallRequestGenerator implements IGenerator {
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = input.getAllContents();
    final Iterator<MobgenCallDefinition> callDefinitions = Iterators.<MobgenCallDefinition>filter(_allContents, MobgenCallDefinition.class);
    final Procedure1<MobgenCallDefinition> _function = new Procedure1<MobgenCallDefinition>() {
        public void apply(final MobgenCallDefinition d) {
          AndroidCallRequestGenerator.this.androidCreateJavaFiles(d);
        }
      };
    IteratorExtensions.<MobgenCallDefinition>forEach(callDefinitions, _function);
  }
  
  public void androidCreateJavaFiles(final MobgenCallDefinition callDefinition) {
    final String method = callDefinition.getMethod();
    final URI uri = callDefinition.getUri();
  }
  
  public CharSequence setPackage(final String callName, final String url) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package nl.sison.dsl.mobgen.http");
    {
      boolean _startsWith = url.startsWith("https://");
      if (_startsWith) {
        _builder.append("\"s\"");
      }
    }
    _builder.append(".");
    _builder.append(callName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence isTransportLayerSecured(final String url) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _startsWith = url.startsWith("https://");
      if (_startsWith) {
        _builder.append("\"HttpsURLConnection\"");
      } else {
        _builder.append("\"HttpURLConnection\"");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
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
  
  public CharSequence httpRequestParameterBuild(final CharSequence method, final CharSequence... params) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private void do");
    String _string = method.toString();
    String _substring = _string.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _string_1 = method.toString();
    String _substring_1 = _string_1.substring(1);
    String _lowerCase = _substring_1.toLowerCase();
    String _plus = (_upperCase + _lowerCase);
    _builder.append(_plus, "");
    _builder.append("Request(");
    String _join = IterableExtensions.join(((Iterable<? extends Object>)Conversions.doWrapArray(params)), ", ");
    _builder.append(_join, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("throws");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IOException,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IllegalStateException,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("UnKnownServiceException,");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IllegalAccessError");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence setRequestSignature(final CharSequence signature, final CharSequence request) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(signature, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(request, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private void disableConnectionReuseIfNecessary() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// HTTP connection reuse which was buggy pre-froyo");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.setProperty(\"http.keepAlive\", \"false\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * TODO must escape nasty symbols in the header injection part
   */
  public CharSequence httpRequestBuilder(final CharSequence url, final CharSequence method, final CharSequence requestPropertyKeyValuePairs, final String connectionTypeClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("URL url = new URL(\"");
    _builder.append(url, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append(connectionTypeClass, "");
    _builder.append(" urlConnection = new ");
    _builder.append(connectionTypeClass, "");
    _builder.append("(url);");
    _builder.newLineIfNotEmpty();
    _builder.append(requestPropertyKeyValuePairs, "");
    _builder.newLineIfNotEmpty();
    _builder.append("urlConnection.setMethod(\"");
    _builder.append(method, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("urlConnection.setConnectionTimeout(10000); // 10 seconds");
    _builder.newLine();
    _builder.append("urlConnection.setReadTimeout(10000); // 10 seconds");
    _builder.newLine();
    _builder.append("urlConnection.setDoInput(true)");
    _builder.newLine();
    {
      boolean _or = false;
      boolean _equals = method.equals("POST");
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = method.equals("PUT");
        _or = (_equals || _equals_1);
      }
      if (_or) {
        _builder.append("urlConnection.setDoOutput(true);");
        _builder.newLine();
      } else {
        _builder.append("urlConnection.setDoOutput(false);");
        _builder.newLine();
      }
    }
    _builder.append("disableConnectionReuseIfNecessary();");
    _builder.newLine();
    _builder.append("InputStream in = null;");
    _builder.newLine();
    {
      boolean _or_1 = false;
      boolean _equals_2 = method.equals("POST");
      if (_equals_2) {
        _or_1 = true;
      } else {
        boolean _equals_3 = method.equals("PUT");
        _or_1 = (_equals_2 || _equals_3);
      }
      if (_or_1) {
        _builder.append("OutputStream out = null;");
        _builder.newLine();
      }
    }
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("urlConnection.connect();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (!url.getHost().equals(urlConnection.getURL().getHost())) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("throw new IllegalStateException(\"You were probably redirected to a sign-on.\");");
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
    {
      boolean _or_2 = false;
      boolean _equals_4 = method.equals("POST");
      if (_equals_4) {
        _or_2 = true;
      } else {
        boolean _equals_5 = method.equals("PUT");
        _or_2 = (_equals_4 || _equals_5);
      }
      if (_or_2) {
        _builder.append("\t");
        _builder.append("out = new BufferedOutputStream(urlConnection.getOutputStream());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("writeStream(out);");
        _builder.newLine();
      }
    }
    _builder.append("}catch(IOException e) // TODO do error handling on the UI thread? Toast#show");
    _builder.newLine();
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
    _builder.append("}catch(UnknownServiceException e)");
    _builder.newLine();
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
    _builder.append("}catch(IllegalAccessError e)");
    _builder.newLine();
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
    _builder.append("urlConnection.disconnect();");
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
    _builder.append("in.close();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    {
      boolean _or_3 = false;
      boolean _equals_6 = method.equals("POST");
      if (_equals_6) {
        _or_3 = true;
      } else {
        boolean _equals_7 = method.equals("PUT");
        _or_3 = (_equals_6 || _equals_7);
      }
      if (_or_3) {
        _builder.append("\t\t");
        _builder.append("if (out != null)");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("out.close();");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}catch(IOException e)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(BuildConfig.DEBUG)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("Log.d(\"MOBGEN\", \"...\");");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("e.printStackTrace();");
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
}
