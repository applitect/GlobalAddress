package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.PRSH;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesJM extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("SN", new Locale(PRSH,"SN","ST ANN"));
        loc.put("SE", new Locale(PRSH,"SE","ST ELIZABETH"));
        loc.put("SJ", new Locale(PRSH,"SJ","ST JAMES"));
        loc.put("SC", new Locale(PRSH,"SC","ST CATHERINE"));
        loc.put("PO", new Locale(PRSH,"PO","PORTLAND"));
        loc.put("SM", new Locale(PRSH,"SM","ST MARY"));
        loc.put("ST", new Locale(PRSH,"ST","ST THOMAS"));
        loc.put("CL", new Locale(PRSH,"CL","CLARENDON"));
        loc.put("WE", new Locale(PRSH,"WE","WESTMORELAND"));
        loc.put("MA", new Locale(PRSH,"MA","MANCHESTER"));
        loc.put("TR", new Locale(PRSH,"TR","TRELAWNY"));
        loc.put("HA", new Locale(PRSH,"HA","HANOVER"));
        loc.put("KI", new Locale(PRSH,"KI","KINGSTON METROPOLITAN AREA"));
        locales = Collections.unmodifiableMap(loc);
    }

}
