package def.marked;
@jsweet.lang.Interface
public abstract class MarkedRenderer extends def.js.Object {
    native public String code(String code, String language);
    native public String blockquote(String quote);
    native public String html(String html);
    native public String heading(String text, double level, String raw);
    native public String hr();
    native public String list(String body, Boolean ordered);
    native public String listitem(String text);
    native public String paragraph(String text);
    native public String table(String header, String body);
    native public String tablerow(String content);
    native public String tablecell(String content, Flags flags);
    native public String strong(String text);
    native public String em(String text);
    native public String codespan(String code);
    native public String br();
    native public String del(String text);
    native public String link(String href, String title, String text);
    native public String image(String href, String title, String text);
    native public String text(String text);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Flags extends def.js.Object {
        public Boolean header;
        public String align;
    }
}

