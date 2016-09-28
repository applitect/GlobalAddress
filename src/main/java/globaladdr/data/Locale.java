package globaladdr.data;

/**
 * A locale is the generic class to hold information about a state, territory, province, etc.
 *
 * @author David Thompson
 */
public class Locale {
    private LocaleLabel type;
    private String code;
    private String name;

    public Locale(LocaleLabel type, String code, String name) {
        this.type = type;
        this.code = code;
        this.name = name;
    }

    public LocaleLabel getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Locale [type=").append(type).append(", code=").append(code)
                .append(", name=").append(name).append("]");
        return builder.toString();
    }


}
