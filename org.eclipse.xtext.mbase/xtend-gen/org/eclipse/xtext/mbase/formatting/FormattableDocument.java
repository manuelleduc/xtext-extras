package org.eclipse.xtext.mbase.formatting;

import java.util.List;
import java.util.TreeMap;
import org.eclipse.xtext.mbase.formatting.FormattingData;
import org.eclipse.xtext.mbase.formatting.FormattingPreferenceValues;
import org.eclipse.xtext.mbase.formatting.TextReplacement;

/**
 * @deprecated use {@link IFormattableDocument}
 */
@Deprecated
@SuppressWarnings("all")
public class FormattableDocument {
  private final static /* Logger */Object log /* Skipped initializer because of errors */;
  
  /* @Accessors
   */private final FormattingPreferenceValues cfg;
  
  /* @Accessors
   */private final String document;
  
  /* @Accessors
   */private final TreeMap<Integer, FormattingData> formattings;
  
  /* @Accessors
   */private Throwable rootTrace = null;
  
  /* @Accessors
   */private boolean conflictOccurred = false;
  
  public FormattableDocument(final FormattingPreferenceValues cfg, final String document) {
    this.cfg = cfg;
    this.document = document;
    TreeMap<Integer, FormattingData> _treeMap = new TreeMap<Integer, FormattingData>();
    this.formattings = _treeMap;
  }
  
  public FormattableDocument(final FormattableDocument fmt) {
    this.cfg = fmt.cfg;
    this.document = fmt.document;
    TreeMap<Integer, FormattingData> _treeMap = new TreeMap<Integer, FormattingData>(fmt.formattings);
    this.formattings = _treeMap;
  }
  
  public boolean isDebugConflicts() {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved.");
  }
  
  protected FormattingData addFormatting(final FormattingData data) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\n< cannot be resolved."
      + "\n> cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n! cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n=== cannot be resolved."
      + "\n!== cannot be resolved."
      + "\nThe field length is not visible"
      + "\nThe field length is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe method getTextAround(FormattingData) from the type FormattableDocument refers to the missing type Pair"
      + "\nThe field FormattableDocument.log refers to the missing type Logger"
      + "\nThe method getTextAround(FormattingData) from the type FormattableDocument refers to the missing type Pair"
      + "\nThe field FormattableDocument.log refers to the missing type Logger"
      + "\nerror cannot be resolved"
      + "\nerror cannot be resolved");
  }
  
  protected FormattingData merge(final FormattingData data1, final FormattingData data2) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved."
      + "\n> cannot be resolved."
      + "\nInvalid number of arguments. The constructor NewLineData() is not applicable for the arguments (int,int,int,int,Throwable,Integer)"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field trace is not visible"
      + "\nThe field newLines is not visible"
      + "\nInvalid number of arguments. The constructor WhitespaceData() is not applicable for the arguments (int,int,int,int,Throwable,String)"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field trace is not visible"
      + "\nThe field space is not visible"
      + "\nThe method getIndentationChange() from the type FormattingData refers to the missing type Object"
      + "\nThe method getIndentationChange() from the type FormattingData refers to the missing type Object"
      + "\nThe method getIndentationChange() from the type FormattingData refers to the missing type Object"
      + "\nThe method getIndentationChange() from the type FormattingData refers to the missing type Object"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  protected /* Pair<String, String> */Object getTextAround(final FormattingData data1) {
    throw new Error("Unresolved compilation problems:"
      + "\n.. cannot be resolved."
      + "\n- cannot be resolved."
      + "\n.. cannot be resolved."
      + "\n- cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n-> cannot be resolved."
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nfold cannot be resolved"
      + "\n> cannot be resolved"
      + "\n- cannot be resolved"
      + "\nfold cannot be resolved"
      + "\n> cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n>= cannot be resolved"
      + "\n>= cannot be resolved");
  }
  
  protected void reportConflict(final FormattingData data1, final FormattingData data2) {
    throw new Error("Unresolved compilation problems:"
      + "\n- cannot be resolved."
      + "\nThe method join(String) is undefined for the type List<StackTraceElement>"
      + "\n- cannot be resolved."
      + "\nThe method join(String) is undefined for the type List<StackTraceElement>"
      + "\n- cannot be resolved."
      + "\nThe field trace is not visible"
      + "\nThe field trace is not visible"
      + "\nThe method getTextAround(FormattingData) from the type FormattableDocument refers to the missing type Pair"
      + "\nThe field FormattableDocument.log refers to the missing type Logger"
      + "\nerror cannot be resolved");
  }
  
  public FormattingData operator_add(final FormattingData data) {
    return this.addFormatting(data);
  }
  
  public void operator_add(final Iterable<FormattingData> data) {
    throw new Error("Unresolved compilation problems:"
      + "\n!== cannot be resolved.");
  }
  
  public Object operator_add(final /*  */Object data) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method operator_add(Object) from the type FormattableDocument refers to the missing type Object"
      + "\n!== cannot be resolved"
      + "\napply cannot be resolved");
  }
  
  public List<TextReplacement> renderToEdits() {
    return this.renderToEdits(0, this.document.length());
  }
  
  public List<TextReplacement> renderToEdits(final int offset, final int length) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field newArrayList is undefined"
      + "\n+ cannot be resolved."
      + "\n>= cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n- cannot be resolved."
      + "\n!== cannot be resolved."
      + "\n== cannot be resolved."
      + "\n* cannot be resolved."
      + "\n- cannot be resolved."
      + "\n+ cannot be resolved."
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field space is not visible"
      + "\nThe field space is not visible"
      + "\nInvalid number of arguments. The constructor TextReplacement() is not applicable for the arguments (int,int,String)"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field increaseIndentationChange is not visible"
      + "\nThe field decreaseIndentationChange is not visible"
      + "\nThe field increaseIndentationChange is not visible"
      + "\nThe field newLines is not visible"
      + "\nInvalid number of arguments. The constructor TextReplacement() is not applicable for the arguments (int,int,Object)"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field length is not visible"
      + "\nThe method getIndentationChange() from the type FormattingData refers to the missing type Object"
      + "\nThe method getWrap(int) from the type FormattableDocument refers to the missing type Object"
      + "\nThe method getIndentation(int) from the type FormattableDocument refers to the missing type Object"
      + "\n&& cannot be resolved"
      + "\n<= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public String renderToString() {
    return this.renderToString(0, this.document.length());
  }
  
  public String renderToString(final int offset, final int length) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method sortBy(Object) is undefined for the type List<TextReplacement>"
      + "\n+ cannot be resolved."
      + "\noffset cannot be resolved"
      + "\ntext cannot be resolved"
      + "\noffset cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nlength cannot be resolved");
  }
  
  protected boolean isWhitespace(final String doc) {
    throw new Error("Unresolved compilation problems:"
      + "\n.. cannot be resolved."
      + "\n- cannot be resolved."
      + "\nforall cannot be resolved");
  }
  
  public int lineLengthBefore(final int offset) {
    throw new Error("Unresolved compilation problems:"
      + "\n< cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n>= cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n=== cannot be resolved."
      + "\n+ cannot be resolved."
      + "\n- cannot be resolved."
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field space is not visible"
      + "\nThe field length is not visible"
      + "\nThe method getIndentationChange() from the type FormattingData refers to the missing type Object"
      + "\nThe method getIndentationLenght(int) from the type FormattableDocument refers to the missing type Object"
      + "\n- cannot be resolved"
      + "\n+ cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  public String lookahead(final int offset, final int length, final /*  */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\napply cannot be resolved");
  }
  
  public boolean fitsIntoLine(final int offset, final int length, final /*  */Object format) {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nThe method lookahead(int, int, Object) from the type FormattableDocument refers to the missing type Object"
      + "\n<= cannot be resolved");
  }
  
  @Override
  public String toString() {
    throw new Error("Unresolved compilation problems:"
      + "\n+ cannot be resolved."
      + "\nThe field offset is not visible"
      + "\nThe field offset is not visible"
      + "\nThe field length is not visible");
  }
  
  public Object getIndentation(final int levels) {
    throw new Error("Unresolved compilation problems:"
      + "\n> cannot be resolved."
      + "\n.. cannot be resolved."
      + "\n- cannot be resolved."
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
  
  public Object getIndentationLenght(final int levels) {
    throw new Error("Unresolved compilation problems:"
      + "\n* cannot be resolved.");
  }
  
  public Object getWrap(final int levels) {
    throw new Error("Unresolved compilation problems:"
      + "\n> cannot be resolved."
      + "\n.. cannot be resolved."
      + "\n- cannot be resolved."
      + "\nmap cannot be resolved"
      + "\njoin cannot be resolved");
  }
}
