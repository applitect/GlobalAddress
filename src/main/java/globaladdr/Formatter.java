package globaladdr;

import globaladdr.data.Countries;
import globaladdr.data.Country;
import globaladdr.data.PrintLayout;
import globaladdr.data.PrintLayout.Justification;
import globaladdr.util.Utility;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The class {@code Formatter} contains methods for formatting demographic data.
 *
 * @author David Thompson
 */
public class Formatter {
    public static final String LINE_BREAK = System.getProperty("line.separator");
    /**
     * Format address data into the appropriate postal format for the country the
     * address is set as. Spacing will be included for center and right
     * justified addresses for mono-spaced fonts. The correct country
     * print name will be added. Any address label created with this method
     * should be acceptable by the destination countries postal service.
     *
     * @param address the address to format. If {@link AddressExtrasI}, is
     * implemented, then the name suffix will also be added to the formatted
     * address.
     * @return a string containing the appropriately formatted address.
     * @throws LocationException if the country code for the address cannot
     * be located.
     */
    public static String format(final AddressI address) {
        if (address == null)
            return "";

        String code = address.getCountryCode();
        if (code == null || code.length() == 0) {
            code = "US";
        }

        Country country = Countries.getInstance().get(code);
        if (country == null)
            throw new IllegalArgumentException("Unknown country");

        // Now fetch the print layout
        PrintLayout layout = country.getPrintLayout();

        // Default to US layout if we don't hava a layout.
        if (layout == null || layout.getLayout() == null ||
                layout.getLayout().length() == 0) {
            layout = Countries.getInstance().get("US").getPrintLayout();
        }

        String fmt = layout.getLayout();

        String lastname = cleanInput(address.getLastName());

        if (address instanceof AddressExtrasI) {
            AddressExtrasI i = (AddressExtrasI) address;
            if (cleanInput(i.getNameSuffix()).length() > 0)
            lastname = lastname + " " + cleanInput(i.getNameSuffix());
        }

        fmt = fmt.replace("<FNM>", cleanInput(address.getFirstName()));
        if (cleanInput(address.getMi()).length() > 0)
            fmt = fmt.replace("<MNI>", cleanInput(address.getMi()));
        else
            fmt = fmt.replace("<MNI><SP>", "");

        fmt = fmt.replace("<LNM>", lastname);
        fmt = fmt.replace("<AD1>", cleanInput(address.getAddr1()));

        if (address instanceof AddressExtrasI) {
            AddressExtrasI i = (AddressExtrasI) address;
            String unit = cleanInput(i.getUnitType() + " " + i.getUnitNumber());
            // Now find which line we can put this on
            if (cleanInput(address.getAddr2()).length() == 0)
                fmt = fmt.replace("<AD2>", unit);
            else {
                fmt = fmt.replace("<AD2>", cleanInput(address.getAddr2()));
                if (cleanInput(address.getAddr3()).length() == 0)
                    fmt = fmt.replace("<AD3>", unit);
                else
                    fmt = fmt.replace("<AD3>", cleanInput(address.getAddr3() + ", " + unit));
            }
        } else {
            fmt = fmt.replace("<AD2>", cleanInput(address.getAddr2()));
            fmt = fmt.replace("<AD3>", cleanInput(address.getAddr3()));
        }

        fmt = fmt.replace("<CTY>", cleanInput(address.getCity()));
        fmt = fmt.replace("<SLC>", cleanInput(address.getLocaleCode()));
        if (cleanInput(address.getLocaleCode()).length() > 0)
            fmt = fmt.replace("<SLC>", address.getLocaleCode());
        fmt = fmt.replace("<SLN>", cleanInput(address.getLocaleName()));
        fmt = fmt.replace("<LCN>", cleanInput(address.getLocaleName()));
        fmt = fmt.replace("<PST>", cleanInput(formatUSPostalCode(address)));

        // Replace the country name.
        fmt = fmt.replace("<CNM>", country.getPrintName());

        // Now set all spaces.
        fmt = fmt.replace("<SP>", " ");

        String[] lines = fmt.split("<NL>");
        // remove any blank lines
        ArrayList<String> newlines = new ArrayList<String>();
        for (String line : lines) {
            if (line.trim().length() > 0)
                newlines.add(line.trim());
        }

        StringBuffer sb = new StringBuffer();
        // Justification can be L - left, C - center, R - right
        if (layout != null && layout.getJustification() == Justification.RIGHT) {
            // Find the longest line and then pad all the other lines
            // to have spaces to right justify.
            int longest = 0;
            for (String line : newlines) {
                if (line.length() > longest)
                    longest = line.length();
            }
            Iterator<String> i = newlines.iterator();
            while (i.hasNext()) {
                String line = i.next();
                sb.append(Utility.padString(line, longest, ' ', true));
                if (i.hasNext())
                    sb.append(LINE_BREAK);
            }
        } else if (layout != null && layout.getJustification() == Justification.CENTER) {
            // Find the longest line and then pad all the other lines
            // to have spaces to center justify.
            int longest = 0;
            for (String line : newlines) {
                if (line.length() > longest)
                    longest = line.length();
            }
            Iterator<String> i = newlines.iterator();
            while (i.hasNext()) {
                String line = i.next();
                int length = line.length();
                int pad = (int)((longest - length) / 2.0);
                sb.append(Utility.padString(line, length+pad, ' ', true));
                if (i.hasNext())
                    sb.append(LINE_BREAK);
            }
        } else {
            Iterator<String> i = newlines.iterator();
            while (i.hasNext()) {
                String line = i.next();
                sb.append(line);
                if (i.hasNext())
                    sb.append(LINE_BREAK);
            }
        }

        return sb.toString();
    }

    /**
     * Format an addresses postal code if US.
     * @param address The address you want to get a formatted postal code
     * @return Formatted Zip if US zip, otherwise nonformatted zip
     */
    public static String formatUSPostalCode(final AddressI address) {
        String zip1 = "";
        if (cleanInput(address.getCountryCode()).length() == 0 ||
            "US".equals(address.getCountryCode())) {
            zip1 = cleanInput(address.getPostalCode());
            // Find the 9 digits and format as 99999-9999
            if (zip1.matches(".*(\\d{5}).*(\\d{4}).*"))
                zip1 = zip1.replaceAll(".*(\\d{5}).*(\\d{4}).*", "$1-$2");
            else if (zip1.matches(".*(\\d{5}).*"))
                zip1 = zip1.replaceAll(".*(\\d{5}).*", "$1");
        } else {
            zip1 = address.getPostalCode();
        }
        return zip1;
    }

    /**
     * A full international phone number formatted for easy display. Does format US phone numbers
     * in its standard format [1] (area code) NNN-NNNN ext NNNN. If country prefix is blank it will
     * not add the brackets.
     * @param phone the phone object to format
     * @return the phone number formatted with
     * [country prefix] (area code) phone number <b>ext</b> extension
     */
    public static String getPhoneFullFmt(final PhoneI phone) {
        if (phone == null)
            return "";

        String fmtPhone = "";
        if (cleanInput(phone.getPhoneCountryPfx()).length() > 0)
            fmtPhone += "[ " + phone.getPhoneCountryPfx() + " ] ";
        if (cleanInput(phone.getPhoneArea()).length() > 0)
            fmtPhone += "( " + phone.getPhoneArea() + " ) ";

        if (cleanInput(phone.getPhoneLocal()).length() > 0) {
            String phoneLocal = phone.getPhoneLocal();
            if (cleanInput(phone.getPhoneCountryPfx()).length() == 0 ||
                    cleanInput(phone.getPhoneCountryPfx()).equals("1"))
                phoneLocal = phoneLocal.replaceAll("[- ]", "").replaceAll("(\\d{3})(\\d*)", "$1-$2");
            fmtPhone += phoneLocal;
        }
        if (cleanInput(phone.getPhoneExt()).length() > 0)
            fmtPhone += " ext " + cleanInput(phone.getPhoneExt());

        return fmtPhone;
    }

    private static String cleanInput(final String string) {
        String ret = "";
        if (string != null)
            ret = string;
        return ret.replaceAll("\t", " ").replaceAll("\r|\n", "").trim();
    }
}
