package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.PROV;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesZW extends Locales {

    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("BU", new Locale(PROV,"BU","BULAWAYO"));
        loc.put("HA", new Locale(PROV,"HA","HARARE"));
        loc.put("MA", new Locale(PROV,"MA","MANICALAND"));
        loc.put("MC", new Locale(PROV,"MC","MASHONALAND CENTRAL"));
        loc.put("ME", new Locale(PROV,"ME","MASHONALAND EAST"));
        loc.put("MW", new Locale(PROV,"MW","MASHONALAND WEST"));
        loc.put("MV", new Locale(PROV,"MV","MASVINGO"));
        loc.put("MN", new Locale(PROV,"MN","MATABELELAND NORTH"));
        loc.put("MS", new Locale(PROV,"MS","MATABELELAND SOUTH"));
        loc.put("MI", new Locale(PROV,"MI","MIDLANDS"));
        locales = Collections.unmodifiableMap(loc);
    }
}
