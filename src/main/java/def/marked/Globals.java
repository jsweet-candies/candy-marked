package def.marked;
/** This class holds all the global functions and variables of the def.marked package. */
public final class Globals {
    private Globals(){}
    @jsweet.lang.Module("marked")
    public static MarkedStatic marked;
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    @jsweet.lang.Module("marked")
    native public static java.lang.String marked(java.lang.String src, def.js.Function callback);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    @jsweet.lang.Module("marked")
    native public static java.lang.String marked(java.lang.String src, def.marked.MarkedOptions options, def.js.Function callback);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    @jsweet.lang.Module("marked")
    native public static java.lang.String marked(java.lang.String src, def.marked.MarkedOptions options);
    /**
     * Compiles markdown to HTML.
     *
     * @param src String of markdown source to be compiled
     * @param options Hash of options
     * @param callback Function called when the markdownString has been fully parsed when using async highlighting
     * @return String of compiled HTML
     */
    @jsweet.lang.Module("marked")
    native public static java.lang.String marked(java.lang.String src);
}

