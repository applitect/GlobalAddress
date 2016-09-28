package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.DEPT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesUY extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AR", new Locale(DEPT,"AR","ARTIGAS"));
        loc.put("CA", new Locale(DEPT,"CA","CANELONES"));
        loc.put("CL", new Locale(DEPT,"CL","CERRO LARGO"));
        loc.put("CO", new Locale(DEPT,"CO","COLONIA"));
        loc.put("DU", new Locale(DEPT,"DU","DURAZNO"));
        loc.put("FS", new Locale(DEPT,"FS","FLORES"));
        loc.put("FD", new Locale(DEPT,"FD","FLORIDA"));
        loc.put("LA", new Locale(DEPT,"LA","LAVALLEJA"));
        loc.put("MA", new Locale(DEPT,"MA","MALDONADO"));
        loc.put("MO", new Locale(DEPT,"MO","MONTEVIDEO"));
        loc.put("PA", new Locale(DEPT,"PA","PAYSANDU"));
        loc.put("RN", new Locale(DEPT,"RN","RIO NEGRO"));
        loc.put("RV", new Locale(DEPT,"RV","RIVERA"));
        loc.put("RO", new Locale(DEPT,"RO","ROCHA"));
        loc.put("SA", new Locale(DEPT,"SA","SALTO"));
        loc.put("SJ", new Locale(DEPT,"SJ","SAN JOSE"));
        loc.put("SO", new Locale(DEPT,"SO","SORIANO"));
        loc.put("TA", new Locale(DEPT,"TA","TACUAREMBO"));
        loc.put("TT", new Locale(DEPT,"TT","TREINTA Y TRES"));
        locales = Collections.unmodifiableMap(loc);
    }
}
