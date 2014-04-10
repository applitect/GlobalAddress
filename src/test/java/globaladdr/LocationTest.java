package globaladdr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
//
//import org.safmt.demo.Location;
//import org.safmt.demo.LocationException;
//import org.safmt.test.demo.dto.Address;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class LocationTest {
//    @BeforeMethod
//    public void beforeMethod() {
//        Hibernate.init();
//    }
//
//    @Test(description="Make sure we throw exception for bad input",
//            expectedExceptions = LocationException.class)
//    public void testGetBadLocation() throws LocationException {
//        Location.getLocation("ABC");
//    }
//
//    @Test(description="Make sure we throw exception for bad country code",
//            expectedExceptions = LocationException.class)
//    public void testGetBadCountryLocation() throws LocationException {
//        Location.getLocation("AA");
//    }
//
//    @Test(description="Make sure a null location is interpreted as the US")
//    public void testGetNullLocation() throws LocationException {
//        Location l = Location.getLocation(null);
//        assert "US".equals(l.getCountryCode()) :
//            "If a null location is passed in assume we are looking in the US.";
//
//        l = Location.getLocation("");
//        assert "US".equals(l.getCountryCode()) :
//            "If a blank location is passed in assume we are looking in the US.";
//    }
//
//    @Test(description="Test to see if we can fetch all proper location info for US")
//    public void testGetUSLocation() throws LocationException {
//        Location l = Location.getLocation("US");
//        assert "US".equals(l.getCountryCode()) : "Country wrong. Was: " +
//                l.getCountryCode() + "  Should be: US";
//        assert l.getHasLocales() == true : "Has locales is wrong";
//        assert l.getLocaleUsed() == true : "Locale should be required.";
//        assert l.getPostalCodeUsed() == true : "Postal code should be required.";
//        assert l.getAreaCode() == null : "Should only be set when using other search methods.";
//        assert "-5".equals(l.getCapitalGmtOffset()) : "CapitalGMT offset should be -7, was: " +
//                l.getCapitalGmtOffset();
//        assert l.getCity() == null : "Should only be set when using other search methods.";
//        assert "City".equals(l.getCityLabel()) : "City label was wrong: " + l.getCityLabel();
//        assert "UNITED STATES".equals(l.getCountryName()) : "Country name wrong was: " +
//            l.getCountryName();
//        assert "UNITED STATES OF AMERICA".equals(l.getCountryPrintName()) :
//            "Country print name was wrong was: " + l.getCountryPrintName();
//        assert l.getLocaleCode() == null : "Should only be set when using other search methods.";
//        assert "State".equals(l.getLocaleLabel()) : "Locale label was wrong was: " +
//                l.getLocaleLabel();
//        assert l.getLocaleName() == null : "Should only be set when using other search methods.";
//        assert "".equals(l.getPhonePrefix()) : "Phone prefix should be blank.";
//        String regex = "((\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|" +
//                "([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)" +
//                "([2-9]1[02-9]������|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?" +
//                "([0-9]{4})(((\\s?([x#]\\s?|ext\\s?)))[0-9]{1,4})?";
//        assert regex.equals(l.getPhoneRegex()) : "Phone regex not right.";
//        assert l.getPostalCode() == null : "Should only be set when using other search methods.";
//        assert "\\d{5}[- ]?(\\d{4})?".equals(l.getPostalRegex()) : "Postal code regex wrong.";
//        assert "59601-4901".equals(l.getSamplePostalCode()) : "Sample post code wrong";
//        assert l.getTimeZone() == null : "Should only be set when using other search methods.";
//    }
//
//    @Test(description="Test to see if we can fetch all proper location info for US")
//    public void testGetCALocation() throws LocationException {
//        Location l = Location.getLocation("CA");
//        assert "CA".equals(l.getCountryCode()) : "Country wrong. Was: " +
//                l.getCountryCode() + "  Should be: CA";
//        assert l.getHasLocales() == true : "Has locales is wrong";
//        assert l.getLocaleUsed() == true : "Locale should be required.";
//        assert l.getPostalCodeUsed() == true : "Postal code should be required.";
//        assert l.getAreaCode() == null : "Should only be set when using other search methods.";
//        assert "-4".equals(l.getCapitalGmtOffset()) : "CapitalGMT offset should be -7, was: " +
//                l.getCapitalGmtOffset();
//        assert l.getCity() == null : "Should only be set when using other search methods.";
//        assert "City".equals(l.getCityLabel()) : "City label was wrong: " + l.getCityLabel();
//        assert "CANADA".equals(l.getCountryName()) : "Country name wrong was: " +
//            l.getCountryName();
//        assert "CANADA".equals(l.getCountryPrintName()) :
//            "Country print name was wrong was: " + l.getCountryPrintName();
//        assert l.getLocaleCode() == null : "Should only be set when using other search methods.";
//        assert "Province".equals(l.getLocaleLabel()) : "Locale label was wrong was: " +
//                l.getLocaleLabel();
//        assert l.getLocaleName() == null : "Should only be set when using other search methods.";
//        assert "".equals(l.getPhonePrefix()) : "Phone prefix should be blank.";
//        String regex = "((\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|" +
//                "([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)" +
//                "([2-9]1[02-9]������|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?" +
//                "([0-9]{4})(((\\s?([x#]\\s?|ext\\s?)))[0-9]{1,4})?";
//        assert regex.equals(l.getPhoneRegex()) : "Phone regex not right.";
//        assert l.getPostalCode() == null : "Should only be set when using other search methods.";
//        assert "[A-Z]\\d[A-Z][ ]\\d[A-Z]\\d".equals(l.getPostalRegex()) : "Postal code regex wrong.";
//        assert "H3Z 2Y7".equals(l.getSamplePostalCode()) : "Sample post code wrong";
//        assert l.getTimeZone() == null : "Should only be set when using other search methods.";
//    }
//
//    @Test(description="Test to see if we can fetch all proper location info for Bolivia")
//    public void testGetBOLocation() throws LocationException {
//        Location l = Location.getLocation("BO");
//        assert "BO".equals(l.getCountryCode()) : "Country wrong. Was: " +
//                l.getCountryCode() + "  Should be: BO";
//        assert l.getHasLocales() == false : "Has locales is wrong";
//        assert l.getLocaleUsed() == false : "Locale should be required.";
//        assert l.getPostalCodeUsed() == false : "Postal code should be required.";
//        assert l.getAreaCode() == null : "Should only be set when using other search methods.";
//        assert "-4".equals(l.getCapitalGmtOffset()) : "CapitalGMT offset should be -7, was: " +
//                l.getCapitalGmtOffset();
//        assert l.getCity() == null : "Should only be set when using other search methods.";
//        assert "Locality".equals(l.getCityLabel()) : "City label was wrong: " + l.getCityLabel();
//        assert "BOLIVIA".equals(l.getCountryName()) : "Country name wrong was: " +
//            l.getCountryName();
//        assert "BOLIVIA".equals(l.getCountryPrintName()) :
//            "Country print name was wrong was: " + l.getCountryPrintName();
//        assert l.getLocaleCode() == null : "Should only be set when using other search methods.";
//        assert l.getLocaleLabel() == null : "Locale label was wrong was: " +
//                l.getLocaleLabel();
//        assert l.getLocaleName() == null : "Should only be set when using other search methods.";
//        assert "591".equals(l.getPhonePrefix()) : "Phone prefix should be blank.";
//        String regex = "([\\+][0-9]{1,3}[ \\.\\-])?([\\(]{1}[0-9]{2,6}[\\)])?([0-9 \\.\\-\\/]{3,20})((x|ext|extension)[ ]?[0-9]{1,4})?";
//        assert regex.equals(l.getPhoneRegex()) : "Phone regex not right.";
//        assert l.getPostalCode() == null : "Should only be set when using other search methods.";
//        assert l.getPostalRegex() == null : "Postal code regex wrong.";
//        assert l.getSamplePostalCode() == null : "Sample post code wrong";
//        assert l.getTimeZone() == null : "Should only be set when using other search methods.";
//    }
//
//    @Test(description="Test to see if we can fetch all proper location info for Bolivia")
//    public void testGetJMLocation() throws LocationException {
//        Location l = Location.getLocation("JM");
//        assert "JM".equals(l.getCountryCode()) : "Country wrong. Was: " +
//                l.getCountryCode() + "  Should be: JM";
//        assert l.getHasLocales() == true : "Has locales is wrong";
//        assert l.getLocaleUsed() == true : "Locale should be required.";
//        assert l.getPostalCodeUsed() == true : "Postal code should be required.";
//        assert l.getAreaCode() == null : "Should only be set when using other search methods.";
//        assert "-5".equals(l.getCapitalGmtOffset()) : "CapitalGMT offset should be -7, was: " +
//                l.getCapitalGmtOffset();
//        assert l.getCity() == null : "Should only be set when using other search methods.";
//        assert "Town".equals(l.getCityLabel()) : "City label was wrong: " + l.getCityLabel();
//        assert "JAMAICA".equals(l.getCountryName()) : "Country name wrong was: " +
//            l.getCountryName();
//        assert "JAMAICA".equals(l.getCountryPrintName()) :
//            "Country print name was wrong was: " + l.getCountryPrintName();
//        assert l.getLocaleCode() == null : "Should only be set when using other search methods.";
//        assert "Parish".equals(l.getLocaleLabel()) : "Locale label was wrong was: " +
//                l.getLocaleLabel();
//        assert l.getLocaleName() == null : "Should only be set when using other search methods.";
//        assert "".equals(l.getPhonePrefix()) : "Phone prefix should be blank.";
//        String regex = "((\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|" +
//                "([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)" +
//                "([2-9]1[02-9]������|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?" +
//                "([0-9]{4})(((\\s?([x#]\\s?|ext\\s?)))[0-9]{1,4})?";
//        assert regex.equals(l.getPhoneRegex()) : "Phone regex not right.";
//        assert l.getPostalCode() == null : "Should only be set when using other search methods.";
//        assert ".*".equals(l.getPostalRegex()) : "Postal code regex wrong.";
//        assert "10".equals(l.getSamplePostalCode()) : "Sample post code wrong";
//        assert l.getTimeZone() == null : "Should only be set when using other search methods.";
//    }
//
//    @Test(description="Make sure we can fetch the countries mapping")
//    public void getCountries() throws LocationException {
//        Map<String, Location> c = Location.getCountries();
//        assert c.size() == 238 : "Did not get 238 countries back, got: " + c.size();
//        Collection<Location> locs = c.values();
//        Iterator<Location> it = locs.iterator();
//        String name = it.next().getCountryName();
//        assert "AFGHANISTAN".equals(name) : "Wasn't AFGANISTAN, was: " + name;
//        name = it.next().getCountryName();
//        assert "ALAND ISLANDS".equals(name) : "Wasn't ALAND ISLANDS, was: " + name;
//        Location l = it.next();
//        Location m = Location.getLocation("AL");
//        assert l.equals(m) : "Locations don't match: " + l.getCountryCode() + " : " + m.getCountryCode();
//    }
//
//    @Test(description="Make sure our zip5 stuff works")
//    public void getLocationsForZip59601() throws LocationException {
//        List<Location> locs = Location.getLocationsForZip("59601");
//        assert locs.size() == 1 : "Helena only has one city for 59601";
//        Location helena = locs.get(0);
//        assert helena.getHasLocales() == true : "Should have locales";
//        assert helena.getLocaleUsed() == true : "We have locales";
//        assert helena.getPostalCodeUsed() == true : "We use postal codes";
//        assert "406".equals(helena.getAreaCode()) : "Area code wrong";
//        assert "-5".equals(helena.getCapitalGmtOffset()) : "Capital offset wrong";
//        assert "Helena".equals(helena.getCity()) : "Wrong city, was: " + helena.getCity();
//        assert "City".equals(helena.getCityLabel()) : "City label was wrong: " + helena.getCityLabel();
//        assert "UNITED STATES".equals(helena.getCountryName()) : "Country name wrong was: " +
//            helena.getCountryName();
//        assert "UNITED STATES OF AMERICA".equals(helena.getCountryPrintName()) :
//            "Country print name was wrong was: " + helena.getCountryPrintName();
//        assert "MT".equals(helena.getLocaleCode()) : "Should be MT, was: " + helena.getLocaleCode();
//        assert "State".equals(helena.getLocaleLabel()) : "Locale label was wrong was: " +
//                helena.getLocaleLabel();
//        assert helena.getLocaleName() == null : "Should be null was: " + helena.getLocaleName();
//        assert "".equals(helena.getPhonePrefix()) : "Phone prefix should be blank.";
//        String regex = "((\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|" +
//                "([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)" +
//                "([2-9]1[02-9]������|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?" +
//                "([0-9]{4})(((\\s?([x#]\\s?|ext\\s?)))[0-9]{1,4})?";
//        assert regex.equals(helena.getPhoneRegex()) : "Phone regex not right.";
//        assert "59601".equals(helena.getPostalCode()) : "Should get the postal code back that we sent in.";
//        assert "\\d{5}[- ]?(\\d{4})?".equals(helena.getPostalRegex()) : "Postal code regex wrong.";
//        assert "59601-4901".equals(helena.getSamplePostalCode()) : "Sample post code wrong";
//        assert "MST".equals(helena.getTimeZone()) : "Should MST, was " + helena.getTimeZone();
//    }
//
//    @Test(description="Make sure our zip5 stuff works",
//            expectedExceptions=LocationException.class)
//    public void getLocationsForNullZip() throws LocationException {
//        Location.getLocationsForZip(null);
//        assert false : "Should have thrown exception.";
//    }
//
//    @Test(description="Make sure our zip5 stuff works")
//    public void getLocationsForZip42211() throws LocationException {
//        List<Location> locs = Location.getLocationsForZip("42211-3215");
//        assert locs.size() == 14 : "4211 has 14 locations at the time of this test.";
//        Location ky = locs.get(0);
//        assert ky.getHasLocales() == true : "Should have locales";
//        assert ky.getLocaleUsed() == true : "We have locales";
//        assert ky.getPostalCodeUsed() == true : "We use postal codes";
//        assert "270".equals(ky.getAreaCode()) : "Area code wrong";
//        assert "-5".equals(ky.getCapitalGmtOffset()) : "Capital offset wrong";
//        // assert "Helena".equals(ky.getCity()) : "Wrong city, was: " + ky.getCity();
//        assert "City".equals(ky.getCityLabel()) : "City label was wrong: " + ky.getCityLabel();
//        assert "UNITED STATES".equals(ky.getCountryName()) : "Country name wrong was: " +
//            ky.getCountryName();
//        assert "UNITED STATES OF AMERICA".equals(ky.getCountryPrintName()) :
//            "Country print name was wrong was: " + ky.getCountryPrintName();
//        assert "KY".equals(ky.getLocaleCode()) : "Should be KY, was: " + ky.getLocaleCode();
//        assert "State".equals(ky.getLocaleLabel()) : "Locale label was wrong was: " +
//                ky.getLocaleLabel();
//        assert ky.getLocaleName() == null : "Should be null was: " + ky.getLocaleName();
//        assert "".equals(ky.getPhonePrefix()) : "Phone prefix should be blank.";
//        String regex = "((\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|" +
//                "([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)" +
//                "([2-9]1[02-9]������|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?" +
//                "([0-9]{4})(((\\s?([x#]\\s?|ext\\s?)))[0-9]{1,4})?";
//        assert regex.equals(ky.getPhoneRegex()) : "Phone regex not right.";
//        assert "42211".equals(ky.getPostalCode()) : "Should get the postal code back that we sent in.";
//        assert "\\d{5}[- ]?(\\d{4})?".equals(ky.getPostalRegex()) : "Postal code regex wrong.";
//        assert "59601-4901".equals(ky.getSamplePostalCode()) : "Sample post code wrong";
//        assert "CST".equals(ky.getTimeZone()) : "Should MST, was " + ky.getTimeZone();
//    }
//
//    @Test(description="Make sure our zip5 stuff works",
//            expectedExceptions=LocationException.class)
//    public void getLocationsForNullAC() throws LocationException {
//        Location.getLocationsForAreaCode(null);
//        assert false : "Should have thrown exception.";
//    }
//
//    @Test(description="Make sure our zip5 stuff works")
//    public void getLocationsForAC340() throws LocationException {
//        List<Location> locs = Location.getLocationsForAreaCode("340");
//        assert locs.size() == 29 : "340 has 29 locations at the time of this test.";
//        Location vi = locs.get(0);
//        assert vi.getHasLocales() == true : "Should have locales";
//        assert vi.getLocaleUsed() == true : "We have locales";
//        assert vi.getPostalCodeUsed() == true : "We use postal codes";
//        assert "340".equals(vi.getAreaCode()) : "Area code wrong";
//        assert "-5".equals(vi.getCapitalGmtOffset()) : "Capital offset wrong";
//        // assert "Helena".equals(ky.getCity()) : "Wrong city, was: " + ky.getCity();
//        assert "City".equals(vi.getCityLabel()) : "City label was wrong: " + vi.getCityLabel();
//        assert "UNITED STATES".equals(vi.getCountryName()) : "Country name wrong was: " +
//            vi.getCountryName();
//        assert "UNITED STATES OF AMERICA".equals(vi.getCountryPrintName()) :
//            "Country print name was wrong was: " + vi.getCountryPrintName();
//        assert "VI".equals(vi.getLocaleCode()) : "Should be VI, was: " + vi.getLocaleCode();
//        assert "State".equals(vi.getLocaleLabel()) : "Locale label was wrong was: " +
//                vi.getLocaleLabel();
//        assert vi.getLocaleName() == null : "Should be null was: " + vi.getLocaleName();
//        assert "".equals(vi.getPhonePrefix()) : "Phone prefix should be blank.";
//        String regex = "((\\(\\s*([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9])\\s*\\)|" +
//                "([2-9]1[02-9]|[2-9][02-8]1|[2-9][02-8][02-9]))\\s*(?:[.-]\\s*)?)" +
//                "([2-9]1[02-9]������|[2-9][02-9]1|[2-9][02-9]{2})\\s*(?:[.-]\\s*)?" +
//                "([0-9]{4})(((\\s?([x#]\\s?|ext\\s?)))[0-9]{1,4})?";
//        assert regex.equals(vi.getPhoneRegex()) : "Phone regex not right.";
//        assert vi.getPostalCode().startsWith("008") : "Should get the postal code back that we sent in.";
//        assert "\\d{5}[- ]?(\\d{4})?".equals(vi.getPostalRegex()) : "Postal code regex wrong.";
//        assert "59601-4901".equals(vi.getSamplePostalCode()) : "Sample post code wrong";
//        assert "EST+1".equals(vi.getTimeZone()) : "Should MST, was " + vi.getTimeZone();
//    }
//
//    @Test(description="Get all the country phone prefixes")
//    public void getPhonePrefixes() {
//        Map<String, String> p = Location.getCountryPhones();
//        assert p.size() == 202 : "Wasn't 202, was: " + p.size();
//        String none = "ANGUILLA; ANTIGUA AND BARBUDA; BAHAMAS; BARBADOS; BERMUDA; " +
//                "BRITISH ANTARCTIC TERRITORY; CANADA; CAYMAN ISLANDS; DOMINICA; " +
//                "DOMINICAN REPUBLIC; GRENADA; JAMAICA; MONTSERRAT; S GEORGIA " +
//                "AND S SANDWICH ISLANDS; SAINT KITTS AND NEVIS; SAINT LUCIA; " +
//                "SAINT VINCENT AND THE GRENADINES; TRINIDAD AND TOBAGO; " +
//                "TURKS AND CAICOS ISLANDS; UNITED STATES; VIRGIN ISLANDS, " +
//                "BRITISH; WESTERN SAHARA";
//        assert none.equals(p.get("None")) : "It appears that the None record " +
//                "is wrong. Was:" + p.get("None") + "\nShould be: " + none;
//
//        assert "SWAZILAND".equals(p.get("268")) : "268 should be SWAZILAND, was: " + p.get("268");
//        assert "COMOROS; MAYOTTE".equals(p.get("269")) : "269 should be COMOROS; MAYOTTE, was " + p.get("269");
//    }
//
//
//    @Test(description="Get the locales for null",
//            expectedExceptions=LocationException.class)
//    public void getNullLocales() throws LocationException {
//        Location.getLocales(null);
//    }
//
//    @Test(description="Get the states for the US")
//    public void getUSLocales() throws LocationException {
//        Map<String, String> p = Location.getLocales("US");
//        assert p.size() == 65 : "US locales should be 65, was : " + p.size();
//
//        // Make sure they are sorted correctly
//        String order = "AA, AE, AK, AL, AP, AR, AS, AZ";
//        Set<String> keys = p.keySet();
//        assert keys.toString().contains(order) : "Can't find the ordered list of states.";
//    }
//
//    @Test(description="Get the states for Mexico")
//    public void getMXLocales() throws LocationException {
//        Map<String, String> p = Location.getLocales("MX");
//        assert p.size() == 32 : "Mexico has 31 locales, was: " + p.size();
//        String order = "AGS, BC, BCS, CAM, CHIH, CHIS, COAH, COL";
//        Set<String> keys = p.keySet();
//        assert keys.toString().contains(order) : "Can't find the ordered list of states.";
//    }
//
//    @Test(description="Make sure bad input throws error for get local time",
//            expectedExceptions = LocationException.class)
//    public void testBadLocationTime() throws LocationException {
//        Location.getClosestLocalTime((Location) null);
//        assert false : "Should have thrown exception.";
//    }
//
//    @Test(description="Make sure bad input throws error for get local time",
//            expectedExceptions = LocationException.class)
//    public void testBadLocation2Time() throws LocationException {
//        Location l = new Location("US", null, null, null, null, null, null, null,
//                null, null, false, false, false, null, null);
//        Location.getClosestLocalTime(l);
//        assert false : "Should have thrown exception.";
//    }
//
//    @Test(description="Test the get local time for US Location")
//    public void testUSTime() throws LocationException {
//        SimpleDateFormat sdf = new SimpleDateFormat("EEE h:mm aaa");
//
//        Calendar c = Calendar.getInstance();
//        TimeZone tz = TimeZone.getTimeZone("GMT-5");
//        sdf.setTimeZone(tz);
//        Location l = Location.getLocation("US");
//        String t = Location.getClosestLocalTime(l);
//        String f = sdf.format(c.getTime());
//        assert f.substring(0, 7).equals(t.substring(0, 7)) :
//                "It appears that the closest time is wrong: was " + t +
//                " but we think it should be: " + f;
//    }
//
//    @Test(description="Test the get local time for GB Location")
//    public void testGBTime() throws LocationException {
//        SimpleDateFormat sdf = new SimpleDateFormat("EEE h:mm aaa");
//
//        Calendar c = Calendar.getInstance();
//        TimeZone tz = TimeZone.getTimeZone("GMT-0");
//        sdf.setTimeZone(tz);
//        Location l = Location.getLocation("GB");
//        String t = Location.getClosestLocalTime(l);
//        String f = sdf.format(c.getTime());
//        assert f.substring(0, 7).equals(t.substring(0, 7)) :
//                "It appears that the closest time is wrong: was " + t +
//                " but we think it should be: " + f;
//    }
//
//    @Test(description="Test get local time using using location with zip")
//    public void testMTTime() throws LocationException {
//        SimpleDateFormat sdf = new SimpleDateFormat("EEE h:mm aaa");
//
//        Calendar c = Calendar.getInstance();
//        // Get Helena
//        Location l = Location.getLocationsForZip("59601").get(0);
//        String t = Location.getClosestLocalTime(l);
//        String f = sdf.format(c.getTime());
//        assert f.substring(0, 7).equals(t.substring(0, 7)) :
//                "It appears that the closest time is wrong: was " + t +
//                " but we think it should be: " + f;
//    }
//
//    @Test(description="Test get local time using using address of 59601")
//    public void testMTAddressTime() throws LocationException {
//        SimpleDateFormat sdf = new SimpleDateFormat("EEE h:mm aaa");
//
//        Calendar c = Calendar.getInstance();
//        // Set Helena
//        Address a = new Address();
//        a.countryCode = null;
//        a.postalCode = "59601";
//        a.localeCode = "MT";
//        String t = Location.getClosestLocalTime(a);
//        String f = sdf.format(c.getTime());
//        assert f.substring(0, 7).equals(t.substring(0, 7)) :
//                "It appears that the closest time is wrong: was " + t +
//                " but we think it should be: " + f;
//    }
//
//    @Test(description="Test get local time using using address of Alberta")
//    public void testABAddressTime() throws LocationException {
//        SimpleDateFormat sdf = new SimpleDateFormat("EEE h:mm aaa");
//
//        Calendar c = Calendar.getInstance();
//        // Set Alberta
//        Address a = new Address();
//        a.countryCode = "CA";
//        a.postalCode = "";
//        a.localeCode = "AB";
//        String t = Location.getClosestLocalTime(a);
//        String f = sdf.format(c.getTime());
//        assert f.substring(0, 7).equals(t.substring(0, 7)) :
//                "It appears that the closest time is wrong: was " + t +
//                " but we think it should be: " + f;
//    }
//
//    @Test(description="Test get local time using using address of 96910 (Guam)")
//    public void testGuamAddressTime() throws LocationException {
//        SimpleDateFormat sdf = new SimpleDateFormat("EEE h:mm aaa");
//
//        Calendar c = Calendar.getInstance();
//        TimeZone tz = TimeZone.getTimeZone("GMT+10");
//        sdf.setTimeZone(tz);
//        // Set Gaum
//        Address a = new Address();
//        a.countryCode = "US";
//        a.postalCode = "96910";
//        a.localeCode = "GU";
//        String t = Location.getClosestLocalTime(a);
//        String f = sdf.format(c.getTime());
//        assert f.substring(0, 7).equals(t.substring(0, 7)) :
//                "It appears that the closest time is wrong: was " + t +
//                " but we think it should be: " + f;
//    }
//

}
