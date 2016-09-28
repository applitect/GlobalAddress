package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.GVRT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesYE extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AB", new Locale(GVRT,"AB","ABY"));
        loc.put("AD", new Locale(GVRT,"AD","ADAM"));
        loc.put("DL", new Locale(GVRT,"DL","AL-DALI"));
        loc.put("BA", new Locale(GVRT,"BA","AL-BAYDA"));
        loc.put("HU", new Locale(GVRT,"HU","AL-HUDAYDAH"));
        loc.put("JA", new Locale(GVRT,"JA","AL-JAWF"));
        loc.put("MR", new Locale(GVRT,"MR","AL-MAHRAH"));
        loc.put("MW", new Locale(GVRT,"MW","AL-MAHWIT"));
        loc.put("AM", new Locale(GVRT,"AM","AMRAN"));
        loc.put("DH", new Locale(GVRT,"DH","DHAMAR"));
        loc.put("HD", new Locale(GVRT,"HD","HADRAMAWT"));
        loc.put("HJ", new Locale(GVRT,"HJ","HAJJAH"));
        loc.put("IB", new Locale(GVRT,"IB","IBB"));
        loc.put("LA", new Locale(GVRT,"LA","LAHIJ"));
        loc.put("MA", new Locale(GVRT,"MA","MA'RIB"));
        loc.put("SD", new Locale(GVRT,"SD","SA'DAH"));
        loc.put("SN", new Locale(GVRT,"SN","SAN'A"));
        loc.put("SH", new Locale(GVRT,"SH","SHABWAH"));
        loc.put("TA", new Locale(GVRT,"TA","TA'IZZ"));
        locales = Collections.unmodifiableMap(loc);
    }
}