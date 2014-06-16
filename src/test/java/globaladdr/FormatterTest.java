package globaladdr;

import static org.junit.Assert.assertEquals;
import globaladdr.data.Address;

import org.junit.Test;

//
//import org.safmt.demo.Formatter;
//import org.safmt.demo.LocationException;
//import org.safmt.test.demo.dto.Address;
//import org.safmt.test.demo.dto.AddressWExtra;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class FormatterTest {
    public static final String LINE_BREAK = System.getProperty("line.separator");


    @Test
    public void formatUSPostalCodeTest() {
        Address address = new Address();
        address.setCountryCode("US");
        address.setPostalCode("59601");
        assertEquals("59601", Formatter.formatUSPostalCode(address));
        address.setPostalCode("4985");
        assertEquals("4985", Formatter.formatUSPostalCode(address));
        address.setPostalCode(null);
        assertEquals("", Formatter.formatUSPostalCode(address));
        address.setPostalCode("abcd");
        assertEquals("abcd", Formatter.formatUSPostalCode(address));
        address.setPostalCode("59601 1233");
        assertEquals("59601-1233", Formatter.formatUSPostalCode(address));
        address.setPostalCode("59601 123");
        assertEquals("59601", Formatter.formatUSPostalCode(address));
        address.setPostalCode("59601 1233");
        assertEquals("59601-1233", Formatter.formatUSPostalCode(address));
        address.setPostalCode("59601 - 1233");
        assertEquals("59601-1233", Formatter.formatUSPostalCode(address));
        address.setPostalCode("  59601  1233  ");
        assertEquals("59601-1233", Formatter.formatUSPostalCode(address));
        address.setPostalCode("59601 - 12");
        assertEquals("59601", Formatter.formatUSPostalCode(address));
        address.setPostalCode("7J8 Q9F");
        assertEquals("7J8 Q9F", Formatter.formatUSPostalCode(address));
        address.setCountryCode("CA");
        address.setPostalCode("7J8 Q9F");
        assertEquals("7J8 Q9F", Formatter.formatUSPostalCode(address));
        address.setPostalCode("921118765");
        assertEquals("921118765", Formatter.formatUSPostalCode(address));
    }

    @Test
    public void formatTestNull() {
        String shouldbe = "";
        assertEquals(shouldbe, Formatter.format(null));
    }

    @Test
    public void simpleUSAddFormatTest() {
        Address a = new Address();
        a.firstName = "David";
        a.mi = "L";
        a.lastName = "Thompson";
        a.addr1 = "123 Test Way Blvd";
        a.addr2 = "Suite 201";
        a.city = "Helena";
        a.localeCode = "MT";
        a.postalCode = "59601";

        String shouldbe = "David L Thompson" + LINE_BREAK +
                "123 Test Way Blvd" + LINE_BREAK +
                "Suite 201" + LINE_BREAK +
                "Helena, MT 59601";
        assertEquals(shouldbe, Formatter.format(a));
    }
//
//    @Test(description="Make sure that no first name won't cause a problem")
//    public void testNullFNAddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = null;
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "596011234";
//
//        String shouldbe = "L Thompson\n3947 Chapparal Dr.\nHelena, MT 59601-1234";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure that no middle name won't cause a problem.")
//    public void testNullMiAddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "596011234";
//
//        String shouldbe = "David Thompson\n3947 Chapparal Dr.\nHelena, MT 59601-1234";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure that no last name doesn't cause a problem.")
//    public void testNullLnAddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "596011234";
//
//        String shouldbe = "David L\n3947 Chapparal Dr.\nHelena, MT 59601-1234";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a missing city, state, postal code doesn't error.")
//    public void testNullCityStateZipAddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//
//        String shouldbe = "David L Thompson\n3947 Chapparal Dr.\n,";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//
//    @Test(description="Make sure we still try to create an address and blank " +
//            "lines are removed even if there is no address line.")
//    public void testSimpleNoAd1AddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "59601";
//
//        String shouldbe = "David L Thompson\nHelena, MT 59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure all 3 address lines show and work for US.")
//    public void testSimpleAd1Ad2Ad3AddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "59601";
//
//        String shouldbe = "David L Thompson\n3947 Chapparal Dr.\nApt. A\n%VIS, Inc.\nHelena, MT 59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure that for a US address that the country " +
//            "doesn't get added.")
//    public void testCC_US_AddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "59601";
//        a.countryCode = "US";
//
//        String shouldbe = "David L Thompson\n3947 Chapparal Dr.\nApt. A\n%VIS, Inc.\nHelena, MT 59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure that Bouvet Island, which has very little " +
//            "data in the address formats correctly.")
//    public void testCC_BV_AddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "59601";
//        a.countryCode = "BV";
//
//        String shouldbe = "David L Thompson\nBouvet Isle is Uninhabited\nNORWAY";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted BV address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//
//    @Test(description="Make sure that the country of AX displays properly.")
//    public void testCC_AX_AddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeName = "MONTANA";
//        a.postalCode = "59601";
//        a.countryCode = "AX";
//
//        String shouldbe =
//                "David L Thompson\n" +
//                "3947 Chapparal Dr.\n" +
//                "Apt. A\n" +
//                "%VIS, Inc.\n" +
//                "AX-59601 Helena\n" +
//                "MONTANA\n" +
//                "FINLAND";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted AX address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure that a right justified address works correctly.")
//    public void testCC_AZ_AddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeName = "MONTANA";
//        a.postalCode = "59601";
//        a.countryCode = "AZ";
//
//        String shouldbe =
//                "  David L Thompson\n" +
//                "3947 Chapparal Dr.\n" +
//                "            Apt. A\n" +
//                "        %VIS, Inc.\n" +
//                "      59601 Helena\n" +
//                "        AZERBAIJAN";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted AX address doesn't match. Was: \n" + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: \n" + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure that the center justified address works correctly.")
//    public void testCC_EG_AddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeName = "MONTANA";
//        a.postalCode = "59601";
//        a.countryCode = "EG";
//
//        String shouldbe =
//                " David L Thompson\n" +
//                "3947 Chapparal Dr.\n" +
//                "      Apt. A\n" +
//                "    %VIS, Inc.\n" +
//                "      Helena\n" +
//                "     MONTANA\n" +
//                "      59601\n" +
//                "      EGYPT";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted EG address doesn't match. Was: \n" + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: \n" + shouldbe + "\n";
//    }
//
//    @Test(description="Check that adding a suffix will get appended to the last name.")
//    public void testNameSuffixAddFormat() throws LocationException {
//        AddressWExtra a = new AddressWExtra();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.nameSuffix = "Jr.";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "59601";
//
//        String shouldbe = "David L Thompson Jr.\n3947 Chapparal Dr.\nApt. A\n%VIS, Inc.\nHelena, MT 59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Check that a null nameSuffix for a class that implements " +
//            "Extras doesn't error.")
//    public void testNameWOSuffixAddFormat() throws LocationException {
//        AddressWExtra a = new AddressWExtra();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.nameSuffix = null;
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeCode = "MT";
//        a.postalCode = "59601";
//
//        String shouldbe = "David L Thompson\n3947 Chapparal Dr.\nApt. A\n%VIS, Inc.\nHelena, MT 59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="The separation character of the address formats are | " +
//            "make sure that having that character in the address doesn't " +
//            "cause a problem.")
//    public void testDelimCharAddFormat() throws LocationException {
//        AddressWExtra a = new AddressWExtra();
//        a.firstName = "David";
//        a.mi = "|";
//        a.lastName = "Thompson";
//        a.nameSuffix = "Jr.";
//        a.addr1 = "3947 Chapparal | Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "|Helena";
//        a.localeCode = "MT";
//        a.postalCode = "59601";
//
//        String shouldbe = "David | Thompson Jr.\n3947 Chapparal | Dr.\nApt. A\n%VIS, Inc.\n|Helena, MT 59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Newlines will really throw the formatted address off." +
//            " Make sure that the formatter strips out any newlines in the " +
//            "passed in address.")
//    public void testNewLinesAddFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David\n";
//        a.mi = "L\n";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 \nChapparal\tDr.";
//        a.addr2 = "\nApt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena\t";
//        a.localeCode = "\nMT";
//        a.postalCode = "59\n601";
//
//        String shouldbe = "David L Thompson\n3947 Chapparal Dr.\nApt. A\n%VIS, Inc.\nHelena, MT 59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure an invalid country still formats but leaves country blank.")
//    public void testInvalidCountryFormat() throws LocationException {
//        Address a = new Address();
//        a.firstName = "David";
//        a.mi = "L";
//        a.lastName = "Thompson";
//        a.addr1 = "3947 Chapparal Dr.";
//        a.addr2 = "Apt. A";
//        a.addr3 = "%VIS, Inc.";
//        a.city = "Helena";
//        a.localeName = "MONTANA";
//        a.postalCode = "59601";
//        // Not a valid country code.
//        a.countryCode = "ABC";
//
//        String shouldbe = "David L Thompson\n3947 Chapparal Dr.\nApt. A\n%VIS, Inc.\nHelena,  59601";
//        assert Formatter.getFormattedAddress(a).equals(shouldbe) :
//            "Formatted US address doesn't match. Was: " + Formatter.getFormattedAddress(a) +
//            "\n\nShould be: " + shouldbe + "\n";
//
//    }
}
