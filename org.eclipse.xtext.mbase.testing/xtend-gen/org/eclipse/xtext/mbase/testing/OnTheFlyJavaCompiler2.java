package org.eclipse.xtext.mbase.testing;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.mbase.testing.InMemoryJavaCompiler;
import org.eclipse.xtext.mbase.testing.JavaSource;
import org.eclipse.xtext.util.JavaVersion;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @noextend This class is not intended to be subclassed by clients.
 * @noreference This class is not intended to be referenced by clients.
 * 
 * @since 2.9
 */
@Singleton
@SuppressWarnings("all")
public class OnTheFlyJavaCompiler2 {
  private InMemoryJavaCompiler inMemoryCompiler;
  
  private JavaVersion javaVersion;
  
  /**
   * Creates a new OnTheFlyCompiler that accepts Java6 compliant code.
   */
  @Inject
  public OnTheFlyJavaCompiler2(final ClassLoader scope) {
    this(scope, JavaVersion.JAVA6);
  }
  
  public OnTheFlyJavaCompiler2(final ClassLoader scope, final JavaVersion version) {
    InMemoryJavaCompiler _inMemoryJavaCompiler = new InMemoryJavaCompiler(scope, version);
    this.inMemoryCompiler = _inMemoryJavaCompiler;
    this.javaVersion = version;
  }
  
  /**
   * @since 2.11
   */
  public void setJavaVersion(final JavaVersion version) {
    this.inMemoryCompiler.setJavaVersion(version);
    this.javaVersion = version;
  }
  
  /**
   * @since 2.11
   */
  public JavaVersion getJavaVersion() {
    return this.javaVersion;
  }
  
  public Class<?> compileToClass(final String classname, final String code) {
    String _javaFile = this.toJavaFile(classname);
    JavaSource _javaSource = new JavaSource(_javaFile, code);
    final InMemoryJavaCompiler.Result result = this.inMemoryCompiler.compile(_javaSource);
    try {
      final Function1<CategorizedProblem, Boolean> _function = (CategorizedProblem it) -> {
        return Boolean.valueOf(it.isError());
      };
      boolean _exists = IterableExtensions.<CategorizedProblem>exists(result.getCompilationProblems(), _function);
      if (_exists) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Java code compiled with errors:");
        _builder.newLine();
        final Function1<CategorizedProblem, Boolean> _function_1 = (CategorizedProblem it) -> {
          return Boolean.valueOf(it.isError());
        };
        String _join = IterableExtensions.join(IterableExtensions.<CategorizedProblem>filter(result.getCompilationProblems(), _function_1), "\n");
        _builder.append(_join);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("Code was:");
        _builder.newLine();
        _builder.append(code);
        _builder.newLineIfNotEmpty();
        throw new IllegalArgumentException(_builder.toString());
      }
      return result.getClassLoader().loadClass(classname);
    } catch (final Throwable _t) {
      if (_t instanceof ClassNotFoundException) {
        final ClassNotFoundException e = (ClassNotFoundException)_t;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Couldn\'t load \'");
        _builder_1.append(classname);
        _builder_1.append("\' ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("source :");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append(code, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        _builder_1.append("PROBLEMS : ");
        _builder_1.newLine();
        _builder_1.append("\t");
        String _join_1 = IterableExtensions.join(result.getCompilationProblems(), "\n");
        _builder_1.append(_join_1, "\t");
        _builder_1.newLineIfNotEmpty();
        throw new IllegalStateException(_builder_1.toString(), e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private String toJavaFile(final String string) {
    String _replace = string.replace(".", "/");
    return (_replace + ".java");
  }
  
  public Map<String, Class<?>> compileToClasses(final Map<String, String> sources) {
    final Function1<Map.Entry<String, String>, JavaSource> _function = (Map.Entry<String, String> it) -> {
      String _javaFile = this.toJavaFile(it.getKey());
      String _value = it.getValue();
      return new JavaSource(_javaFile, _value);
    };
    final InMemoryJavaCompiler.Result result = this.inMemoryCompiler.compile(((JavaSource[])Conversions.unwrapArray(IterableExtensions.<Map.Entry<String, String>, JavaSource>map(sources.entrySet(), _function), JavaSource.class)));
    try {
      final Function1<CategorizedProblem, Boolean> _function_1 = (CategorizedProblem it) -> {
        return Boolean.valueOf(it.isError());
      };
      boolean _exists = IterableExtensions.<CategorizedProblem>exists(result.getCompilationProblems(), _function_1);
      if (_exists) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Java code compiled with errors:");
        _builder.newLine();
        final Function1<CategorizedProblem, Boolean> _function_2 = (CategorizedProblem it) -> {
          return Boolean.valueOf(it.isError());
        };
        String _join = IterableExtensions.join(IterableExtensions.<CategorizedProblem>filter(result.getCompilationProblems(), _function_2), "\n");
        _builder.append(_join);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("Code was:");
        _builder.newLine();
        _builder.append("=========");
        _builder.newLine();
        String _join_1 = IterableExtensions.join(sources.values(), "\n=========\n");
        _builder.append(_join_1);
        _builder.newLineIfNotEmpty();
        _builder.append("=========");
        _builder.newLine();
        throw new IllegalArgumentException(_builder.toString());
      }
      final ClassLoader classLoader = result.getClassLoader();
      final Function1<String, Class<?>> _function_3 = (String it) -> {
        try {
          return classLoader.loadClass(it);
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      final Function1<Class<?>, String> _function_4 = (Class<?> it) -> {
        return it.getName();
      };
      return IterableExtensions.<String, Class<?>>toMap(IterableExtensions.<String, Class<?>>map(sources.keySet(), _function_3), _function_4);
    } catch (final Throwable _t) {
      if (_t instanceof ClassNotFoundException) {
        final ClassNotFoundException e = (ClassNotFoundException)_t;
        StringConcatenation _builder_1 = new StringConcatenation();
        String _message = e.getMessage();
        _builder_1.append(_message);
        _builder_1.append(" ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("source :");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append(sources, "\t");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        _builder_1.append("PROBLEMS : ");
        _builder_1.newLine();
        _builder_1.append("\t");
        String _join_2 = IterableExtensions.join(result.getCompilationProblems(), "\n");
        _builder_1.append(_join_2, "\t");
        _builder_1.newLineIfNotEmpty();
        throw new IllegalStateException(_builder_1.toString(), e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @SuppressWarnings("unchecked")
  public <RT extends Object> Function0<RT> createFunction(final String expression, final Class<RT> returnType) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class __Generated implements org.eclipse.xtext.xbase.lib.Functions.Function0<");
      String _name = returnType.getName();
      _builder.append(_name);
      _builder.append("> {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("public ");
      String _name_1 = returnType.getName();
      _builder.append(_name_1, "\t");
      _builder.append(" apply() {");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append(expression, "\t\t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Class<?> clazz = this.compileToClass("__Generated", _builder.toString());
      Object _newInstance = clazz.newInstance();
      return ((Function0<RT>) _newInstance);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
