package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.STAT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesAU extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("ACT", new Locale(STAT,"ACT","AUSTRALIAN CAPITAL TERRITORY"));
        loc.put("NSW", new Locale(STAT,"NSW","NEW SOUTH WALES"));
        loc.put("NT", new Locale(STAT,"NT","NORTHERN TERRITORY"));
        loc.put("QLD", new Locale(STAT,"QLD","QUEENSLAND"));
        loc.put("SA", new Locale(STAT,"SA","SOUTH AUSTRALIA"));
        loc.put("TAS", new Locale(STAT,"TAS","TASMANIA"));
        loc.put("VIC", new Locale(STAT,"VIC","VICTORIA"));
        loc.put("WA", new Locale(STAT,"WA","WESTERN AUSTRALIA"));
        locales = Collections.unmodifiableMap(loc);
    }
}
