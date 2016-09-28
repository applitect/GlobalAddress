package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.STAT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesCX extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("WA", new Locale(STAT,"WA","WESTERN AUSTRALIA"));
        locales = Collections.unmodifiableMap(loc);
    }
}
