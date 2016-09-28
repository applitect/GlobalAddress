package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.DEPT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesHN extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AT", new Locale(DEPT,"AT","ATLANTIDA"));
        loc.put("CH", new Locale(DEPT,"CH","CHOLUTECA"));
        loc.put("CL", new Locale(DEPT,"CL","COLON"));
        loc.put("CM", new Locale(DEPT,"CM","COMAYAGUA"));
        loc.put("CP", new Locale(DEPT,"CP","COPAN"));
        loc.put("CR", new Locale(DEPT,"CR","CORTES"));
        loc.put("EP", new Locale(DEPT,"EP","ELPARAISO"));
        loc.put("FM", new Locale(DEPT,"FM","FRANCISCO MORAZAN"));
        loc.put("GD", new Locale(DEPT,"GD","GRACIAS A DIOS"));
        loc.put("IN", new Locale(DEPT,"IN","INTIBUCA"));
        loc.put("IB", new Locale(DEPT,"IB","ISLAS DE LA BAHIA"));
        loc.put("LP", new Locale(DEPT,"LP","LA PAZ"));
        loc.put("LE", new Locale(DEPT,"LE","LEMPIRA"));
        loc.put("OC", new Locale(DEPT,"OC","OCOTEPEQUE"));
        loc.put("OL", new Locale(DEPT,"OL","OLANCHO"));
        loc.put("SB", new Locale(DEPT,"SB","SANTA BARBARA"));
        loc.put("VA", new Locale(DEPT,"VA","VALLE"));
        loc.put("YO", new Locale(DEPT,"YO","YORO"));
        locales = Collections.unmodifiableMap(loc);
    }
}
