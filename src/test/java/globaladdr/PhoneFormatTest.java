package globaladdr;

//
//import org.safmt.demo.Formatter;
//import org.safmt.demo.LocationException;
//import org.safmt.test.demo.dto.Phone;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class PhoneFormatTest {
//
//    @BeforeMethod
//    public void beforeMethod() {
//        Hibernate.init();
//    }
//
//    @Test(description="Make sure a null returns nothing.")
//    public void testNullPhoneFormat() throws LocationException {
//        String shouldbe = "";
//        assert Formatter.getPhoneFullFmt(null).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneFullFmt(null) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a blank phone returns nothing.")
//    public void testSimplePhoneFormat() throws LocationException {
//        Phone p = new Phone();
//
//        String shouldbe = "";
//        assert Formatter.getPhoneFullFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneFullFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a blank phone local still returns.")
//    public void testACOnlyPhoneFormat() throws LocationException {
//        Phone p = new Phone();
//        p.phoneCountryPfx = "+11";
//        p.phoneArea = "406";
//        p.phoneExt = "1234";
//
//        String shouldbe = "[ +11 ] ( 406 )  ext 1234";
//        assert Formatter.getPhoneFullFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneFullFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a US phone formats with the dash.")
//    public void testUSOnlyPhoneFormat() throws LocationException {
//        Phone p = new Phone();
//        p.phoneCountryPfx = null;
//        p.phoneArea = "406";
//        p.phoneExt = "1234";
//        p.phoneLocal = "5551111";
//
//        String shouldbe = "( 406 ) 555-1111 ext 1234";
//        assert Formatter.getPhoneFullFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneFullFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a US phone formats with the dash.")
//    public void testUSNoExtPhoneFormat() throws LocationException {
//        Phone p = new Phone();
//        p.phoneCountryPfx = null;
//        p.phoneArea = "406";
//        p.phoneLocal = "5551111";
//
//        String shouldbe = "( 406 ) 555-1111";
//        assert Formatter.getPhoneFullFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneFullFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a US phone formats with the dash.")
//    public void testUSPhoneBadFormat() throws LocationException {
//        Phone p = new Phone();
//        p.phoneCountryPfx = null;
//        p.phoneArea = "406";
//        p.phoneLocal = "5551-111";
//
//        String shouldbe = "( 406 ) 555-1111";
//        assert Formatter.getPhoneFullFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneFullFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//
//    @Test(description="Make sure a US phone formats with the dash.")
//    public void testCCSetExtPhoneFormat() throws LocationException {
//        Phone p = new Phone();
//        p.phoneCountryPfx = "+11";
//        p.phoneArea = "406";
//        p.phoneLocal = "555-11-11";
//        p.phoneExt = "554";
//
//        String shouldbe = "[ +11 ] ( 406 ) 555-11-11 ext 554";
//        assert Formatter.getPhoneFullFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneFullFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a MT phone formats with the dash.")
//    public void testLocalPhoneFormat() throws LocationException {
//        Phone p = new Phone();
//        p.phoneArea = "406";
//        p.phoneLocal = "5551111";
//        p.phoneExt = "554";
//
//        String shouldbe = "555-1111 ext 554";
//        assert Formatter.getPhoneLocalExtFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneLocalExtFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }
//
//    @Test(description="Make sure a non-MT phone returns nothing.")
//    public void testLocalNonMTPhoneFormat() throws LocationException {
//        Phone p = new Phone();
//        p.phoneArea = "208";
//        p.phoneLocal = "5551111";
//        p.phoneExt = "554";
//
//        String shouldbe = "";
//        assert Formatter.getPhoneLocalExtFmt(p).equals(shouldbe) :
//            "Formatted phone doesn't match. Was: " + Formatter.getPhoneLocalExtFmt(p) +
//            "\n\nShould be: " + shouldbe + "\n";
//    }

}
