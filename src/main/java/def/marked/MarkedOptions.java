package def.marked;
import def.js.Function;
@jsweet.lang.Interface
public abstract class MarkedOptions extends def.js.Object {
    /**
     * Type: object Default: new Renderer()
     *
     * An object containing functions to render tokens to HTML.
     */
    @jsweet.lang.Optional
    public MarkedRenderer renderer;
    /**
     * Enable GitHub flavored markdown.
     */
    @jsweet.lang.Optional
    public Boolean gfm;
    /**
     * Enable GFM tables. This option requires the gfm option to be true.
     */
    @jsweet.lang.Optional
    public Boolean tables;
    /**
     * Enable GFM line breaks. This option requires the gfm option to be true.
     */
    @jsweet.lang.Optional
    public Boolean breaks;
    /**
     * Conform to obscure parts of markdown.pl as much as possible. Don't fix any of the original markdown bugs or poor behavior.
     */
    @jsweet.lang.Optional
    public Boolean pedantic;
    /**
     * Sanitize the output. Ignore any HTML that has been input.
     */
    @jsweet.lang.Optional
    public Boolean sanitize;
    /**
     * Use smarter list behavior than the original markdown. May eventually be default with the old behavior moved into pedantic.
     */
    @jsweet.lang.Optional
    public Boolean smartLists;
    /**
     * Shows an HTML error message when rendering fails.
     */
    @jsweet.lang.Optional
    public Boolean silent;
    /**
     * A function to highlight code blocks. The function takes three arguments: code, lang, and callback.
     */
    native public String highlight(String code, String lang, Function callback);
    /**
     * Set the prefix for code block classes.
     */
    @jsweet.lang.Optional
    public String langPrefix;
    /**
     * Use "smart" typograhic punctuation for things like quotes and dashes.
     */
    @jsweet.lang.Optional
    public Boolean smartypants;
    /**
     * A function to highlight code blocks. The function takes three arguments: code, lang, and callback.
     */
    native public String highlight(String code, String lang);
}

