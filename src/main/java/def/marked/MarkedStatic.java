package def.marked;
import def.js.Function;
@jsweet.lang.Interface
public abstract class MarkedStatic extends def.js.Object {
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String apply(String src, Function callback);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String apply(String src, MarkedOptions options, Function callback);
    /**
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     */
    native public Object[] lexer(String src, MarkedOptions options);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String parse(String src, Function callback);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String parse(String src, MarkedOptions options, Function callback);
    /**
     * @param options Hash of options
     */
    native public String parser(Object[] src, MarkedOptions options);
    /**
     * Sets the default options.
     *
     * @param options Hash of options
     */
    native public MarkedStatic setOptions(MarkedOptions options);
    public Renderer Renderer;
    public Parser Parser;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Renderer extends def.js.Object {
        public Renderer(){}
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Parser extends def.js.Object {
        public Parser(MarkedOptions options){}
    }
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String apply(String src, MarkedOptions options);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String apply(String src);
    /**
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     */
    native public Object[] lexer(String src);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String parse(String src, MarkedOptions options);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    native public String parse(String src);
    /**
     * @param options Hash of options
     */
    native public String parser(Object[] src);
}

