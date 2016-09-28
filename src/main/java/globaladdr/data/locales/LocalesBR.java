package globaladdr.data.locales;

import static globaladdr.data.LocaleLabel.STAT;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import globaladdr.data.Locale;
import globaladdr.data.Locales;

public class LocalesBR extends Locales {

    static {
        Map<String, Locale> loc = new TreeMap<String, Locale>();
        loc.put("ACT", new Locale(STAT,"ACT","ACRE"));
        loc.put("AP", new Locale(STAT,"AP","AMAPA"));
        loc.put("DF", new Locale(STAT,"DF","DISTRITO FEDERAL"));
        loc.put("MA", new Locale(STAT,"MA","MARANHAO"));
        loc.put("MT", new Locale(STAT,"MT","MATO GROSSO"));
        loc.put("PE", new Locale(STAT,"PE","PERNAMBUCO"));
        loc.put("RJ", new Locale(STAT,"RJ","RIO DE JANEIRO"));
        loc.put("RR", new Locale(STAT,"RR","RORAIMA"));
        loc.put("SE", new Locale(STAT,"SE","SERGIPE"));
        loc.put("AL", new Locale(STAT,"AL","ALAGOAS"));
        loc.put("BA", new Locale(STAT,"BA","BAHIA"));
        loc.put("ES", new Locale(STAT,"ES","ESPIRITO SANTO"));
        loc.put("MG", new Locale(STAT,"MG","MINAS GERAIS"));
        loc.put("PA", new Locale(STAT,"PA","PARA"));
        loc.put("PI", new Locale(STAT,"PI","PIAUI"));
        loc.put("RN", new Locale(STAT,"RN","RIO GRANDE DO NORTE"));
        loc.put("RS", new Locale(STAT,"RS","RIO GRANDE DO SUL"));
        loc.put("SP", new Locale(STAT,"SP","SAO PAULO"));
        loc.put("AM", new Locale(STAT,"AM","AMAZONAS"));
        loc.put("CE", new Locale(STAT,"CE","CEARA"));
        loc.put("GO", new Locale(STAT,"GO","GOIAS"));
        loc.put("MS", new Locale(STAT,"MS","MATO GROSSO DO SUL"));
        loc.put("PB", new Locale(STAT,"PB","PARAIBA"));
        loc.put("PR", new Locale(STAT,"PR","PARANA"));
        loc.put("RO", new Locale(STAT,"RO","RONDONIA"));
        loc.put("SC", new Locale(STAT,"SC","SANTA CATARINA"));
        loc.put("TO", new Locale(STAT,"TO","TOCANTINS"));
        locales = Collections.unmodifiableMap(loc);
    }
}
