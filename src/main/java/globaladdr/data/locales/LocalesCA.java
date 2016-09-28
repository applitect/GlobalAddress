package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.PROV;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesCA extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AB", new Locale(PROV,"AB","ALBERTA"));
        loc.put("BC", new Locale(PROV,"BC","BRITISH COLUMBIA"));
        loc.put("MB", new Locale(PROV,"MB","MANITOBA"));
        loc.put("NB", new Locale(PROV,"NB","NEW BRUNSWICK"));
        loc.put("NL", new Locale(PROV,"NL","NEWFOUNDLAND AND LABRADOR"));
        loc.put("NT", new Locale(PROV,"NT","NORTHWEST TERRITORIES"));
        loc.put("NS", new Locale(PROV,"NS","NOVA SCOTIA"));
        loc.put("NU", new Locale(PROV,"NU","NUNAVUT"));
        loc.put("ON", new Locale(PROV,"ON","ONTARIO"));
        loc.put("PE", new Locale(PROV,"PE","PRINCE EDWARD ISLAND"));
        loc.put("QC", new Locale(PROV,"QC","QUEBEC"));
        loc.put("SK", new Locale(PROV,"SK","SASKATCHEWAN"));
        loc.put("YT", new Locale(PROV,"YT","YUKON"));
        locales = Collections.unmodifiableMap(loc);
    }
}
