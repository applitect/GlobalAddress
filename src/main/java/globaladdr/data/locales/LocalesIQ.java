package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.PROV;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesIQ extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AN", new Locale(PROV,"AN","AL ANBAR"));
        loc.put("BA", new Locale(PROV,"BA","AL BASRAH"));
        loc.put("MU", new Locale(PROV,"MU","AL MUNTHANA"));
        loc.put("NA", new Locale(PROV,"NA","AL NAJAF"));
        loc.put("QA", new Locale(PROV,"QA","AL QUADISIYA"));
        loc.put("SU", new Locale(PROV,"SU","AL SULAYMANIAH"));
        loc.put("TS", new Locale(PROV,"TS","AL TA'AMIM"));
        loc.put("AR", new Locale(PROV,"AR","ARBIL"));
        loc.put("BB", new Locale(PROV,"BB","BABIL"));
        loc.put("BG", new Locale(PROV,"BG","BAGHDAD"));
        loc.put("DA", new Locale(PROV,"DA","DAHOUK"));
        loc.put("DI", new Locale(PROV,"DI","DIYALA"));
        loc.put("KA", new Locale(PROV,"KA","KARBALA"));
        loc.put("MA", new Locale(PROV,"MA","MAYSAN"));
        loc.put("NI", new Locale(PROV,"NI","MOUSL (NAINAWA)"));
        loc.put("SD", new Locale(PROV,"SD","SALAH AL DEEN"));
        loc.put("DQ", new Locale(PROV,"DQ","THI QUAR"));
        loc.put("WA", new Locale(PROV,"WA","WASIT"));
        locales = Collections.unmodifiableMap(loc);
    }
}
