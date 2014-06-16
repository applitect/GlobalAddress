package globaladdr.data;

import java.util.Arrays;
import java.util.List;

public class PrintLayout {
    public enum EnvelopeLocation { LEFT, RIGHT, CENTER };
    public enum Justification { LEFT, RIGHT, CENTER };
    public static final List<String> ADDRESS_PARTS = Arrays.asList("<FNM>", "<MNI>", "<LNM>", "<AD1>", "<AD2>", "<AD3>", "<CTY>", "<SLC>", "<SLN>", "<PST>", "<LCN>", "<CNM>", "<NL>", "<SP>", "<FS>");
    public static final String NAME = "<FNM><SP><MNI><SP><LNM>";

    private EnvelopeLocation envelopeLocation;
    private Justification justification;
    private String layout;

    public PrintLayout(EnvelopeLocation envelopeLocation, Justification justification, String layout) {
        this.envelopeLocation = envelopeLocation;
        this.justification = justification;
        // Check all parts by breaking into parts and literal text. Literal text will
        // just be placed in the address as is.
        String[] parts = layout.split(">");

        for (String part : parts) {
            // Remove all literal text before the <
            String fpart = part.replaceAll(".*<", "<") + ">";
            if (! ADDRESS_PARTS.contains(fpart))
                throw new IllegalArgumentException("Unknown address part: " + fpart + ". " + "Please check layouts for: " + layout);
        }
        this.layout = layout;
    }

    public EnvelopeLocation getEnvelopeLocation() {
        return envelopeLocation;
    }

    public Justification getJustification() {
        return justification;
    }

    public String getLayout() {
        return layout;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PrintLayout [envelopeLocation=").append(envelopeLocation)
                .append(", justification=").append(justification).append(", layout=")
                .append(layout).append("]");
        return builder.toString();
    }
}
