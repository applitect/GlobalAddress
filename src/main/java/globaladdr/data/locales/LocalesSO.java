package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.REGN;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesSO extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AD", new Locale(REGN,"AD","AWDAL"));
        loc.put("BK", new Locale(REGN,"BK","BAKOOL"));
        loc.put("BN", new Locale(REGN,"BN","BANAADIR"));
        loc.put("BR", new Locale(REGN,"BR","BARI"));
        loc.put("BY", new Locale(REGN,"BY","BAY"));
        loc.put("GG", new Locale(REGN,"GG","GALGADUUD"));
        loc.put("GD", new Locale(REGN,"GD","GEDO"));
        loc.put("HR", new Locale(REGN,"HR","HIIRAAN"));
        loc.put("JD", new Locale(REGN,"JD","JUBBADA DHEXE"));
        loc.put("JH", new Locale(REGN,"JH","JUBBADA HOOSE"));
        loc.put("MD", new Locale(REGN,"MD","MUDUG"));
        loc.put("NG", new Locale(REGN,"NG","NUGALL"));
        loc.put("SG", new Locale(REGN,"SG","SANAAG"));
        loc.put("SD", new Locale(REGN,"SD","SHABEELLADA DHEXE"));
        loc.put("SH", new Locale(REGN,"SH","SHABEELLADA HOOSE"));
        loc.put("SL", new Locale(REGN,"SL","SOOL"));
        loc.put("TG", new Locale(REGN,"TG","TOGDHEER"));
        loc.put("WG", new Locale(REGN,"WG","WAQOOYI GALBEED"));
        locales = Collections.unmodifiableMap(loc);
    }
}
