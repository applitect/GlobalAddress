package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.DSTR;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesSR extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("BR", new Locale(DSTR,"BR","BROKOPONDO"));
        loc.put("CM", new Locale(DSTR,"CM","COMMEWIJNE"));
        loc.put("CR", new Locale(DSTR,"CR","CORONIE"));
        loc.put("MA", new Locale(DSTR,"MA","MAROWIJNE"));
        loc.put("NI", new Locale(DSTR,"NI","NICKERIE"));
        loc.put("PR", new Locale(DSTR,"PR","PARA"));
        loc.put("PM", new Locale(DSTR,"PM","PARAMARIBO"));
        loc.put("SA", new Locale(DSTR,"SA","SARAMACCA"));
        loc.put("SIN", new Locale(DSTR,"SIN","SIPALIWINI"));
        loc.put("WA", new Locale(DSTR,"WA","WANICA"));
        locales = Collections.unmodifiableMap(loc);
    }
}
