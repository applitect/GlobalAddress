package globaladdr.data;

/**
 * Class for storing a value and label used in html options list.
 *
 * @author David Thompson
 */
public class OptionItem {
    private String value;
    private String label;

    /**
     * Construct an Option item containing the two strings for options to html
     * select lists.
     *
     * @param value the value of an option item
     * @param label the label associated with its value
     */
    public OptionItem(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return value + " : " + label;
    }
}
