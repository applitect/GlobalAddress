package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.STAT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesMX extends Locales {
    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("AGS", new Locale(STAT,"AGS","AGUASCALIENTES"));
        loc.put("BC", new Locale(STAT,"BC","BAJA CALIFORNIA"));
        loc.put("BCS", new Locale(STAT,"BCS","BAJA CALIFORNIA SUR"));
        loc.put("CAM", new Locale(STAT,"CAM","CAMPECHE"));
        loc.put("COAH", new Locale(STAT,"COAH","COAHUILA"));
        loc.put("COL", new Locale(STAT,"COL","COLIMA"));
        loc.put("CHIS", new Locale(STAT,"CHIS","CHIAPAS"));
        loc.put("CHIH", new Locale(STAT,"CHIH","CHIHUAHUA"));
        loc.put("DF", new Locale(STAT,"DF","DISTRITO FEDERAL"));
        loc.put("DGO", new Locale(STAT,"DGO","DURANGO"));
        loc.put("GTO", new Locale(STAT,"GTO","GUANAJUATO"));
        loc.put("GRO", new Locale(STAT,"GRO","GUERRERO"));
        loc.put("HGO", new Locale(STAT,"HGO","HIDALGO"));
        loc.put("JAL", new Locale(STAT,"JAL","JALISCO"));
        loc.put("MEX", new Locale(STAT,"MEX","MEXICO"));
        loc.put("MICH", new Locale(STAT,"MICH","MICHOACAN"));
        loc.put("MOR", new Locale(STAT,"MOR","MORELOS"));
        loc.put("NAY", new Locale(STAT,"NAY","NAYARIT"));
        loc.put("NL", new Locale(STAT,"NL","NUEVO LEON"));
        loc.put("OAX", new Locale(STAT,"OAX","OAZACA"));
        loc.put("PUE", new Locale(STAT,"PUE","PUEBLA"));
        loc.put("QRO", new Locale(STAT,"QRO","QUERETARO"));
        loc.put("QROO", new Locale(STAT,"QROO","QUINTANA ROO"));
        loc.put("SLP", new Locale(STAT,"SLP","SAN LUIS POTOSI"));
        loc.put("SIN", new Locale(STAT,"SIN","SINALOA"));
        loc.put("SON", new Locale(STAT,"SON","SONORA"));
        loc.put("TAB", new Locale(STAT,"TAB","TABASCO"));
        loc.put("TAMPS", new Locale(STAT,"TAMPS","TAMAULIPAS"));
        loc.put("TLAX", new Locale(STAT,"TLAX","TLAXCALA"));
        loc.put("VER", new Locale(STAT,"VER","VERACRUZ"));
        loc.put("YUC", new Locale(STAT,"YUC","YUCATAN"));
        loc.put("ZAC", new Locale(STAT,"ZAC","ZACATECAS"));
        locales = Collections.unmodifiableMap(loc);
    }
}
