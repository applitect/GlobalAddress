package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.STAT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesVE extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AM", new Locale(STAT,"AM","AMAZONAS"));
        loc.put("AN", new Locale(STAT,"AN","ANZOATEGUI"));
        loc.put("AP", new Locale(STAT,"AP","APURE"));
        loc.put("AR", new Locale(STAT,"AR","ARAGUA"));
        loc.put("BA", new Locale(STAT,"BA","BARINAS"));
        loc.put("BO", new Locale(STAT,"BO","BOLIVAR"));
        loc.put("CA", new Locale(STAT,"CA","CARABOBO"));
        loc.put("CO", new Locale(STAT,"CO","COJEDES"));
        loc.put("DA", new Locale(STAT,"DA","DELTA AMACURO"));
        loc.put("DP", new Locale(STAT,"DP","DEPENDENCIAS FEDERALES"));
        loc.put("DF", new Locale(STAT,"DF","DISTRITO CAPITAL"));
        loc.put("FA", new Locale(STAT,"FA","FALCON"));
        loc.put("GU", new Locale(STAT,"GU","GUARICO"));
        loc.put("LA", new Locale(STAT,"LA","LARA"));
        loc.put("ME", new Locale(STAT,"ME","MERIDA"));
        loc.put("MID", new Locale(STAT,"MID","MIRANDA"));
        loc.put("MO", new Locale(STAT,"MO","MONAGAS"));
        loc.put("NE", new Locale(STAT,"NE","NUEVA ESPARTA"));
        loc.put("PO", new Locale(STAT,"PO","PORTUGUESA"));
        loc.put("SU", new Locale(STAT,"SU","SUCRE"));
        loc.put("TA", new Locale(STAT,"TA","TACHIRA"));
        loc.put("TR", new Locale(STAT,"TR","TRUJILLO"));
        loc.put("VA", new Locale(STAT,"VA","VARGAS"));
        loc.put("YA", new Locale(STAT,"YA","YARACUY"));
        loc.put("ZU", new Locale(STAT,"ZU","ZULIA"));
        locales = Collections.unmodifiableMap(loc);
    }
}
